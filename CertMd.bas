B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=12.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private kvs As KeyValueStore
	Private rp As RuntimePermissions
	Private shared As String
	Private SQL1 As SQL
	Dim bmr As Bitmap
	Dim qr As QRcode

	Private pnHeader1 As Panel
	Private lblTop As Label
	Private imgBack As ImageView
	Private pnFrame2 As Panel
	Private lblUserTitle As Label
	Private lblLine4 As Label
	Private imgQR As ImageView
	Private lblCert As Label
	Private btnCopyCert As Button
	Private imgCertImage As ImageView
	Private pnQR As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("CertLy")

	shared = rp.GetSafeDirDefaultExternal("")
	kvs.Initialize(shared, "Userdatastore")
	
	If File.Exists(File.DirDefaultExternal ,"db.db") = False Then
		File.Copy(File.DirAssets,"db.db",File.DirDefaultExternal,"db.db")
	End If
	
	If SQL1.IsInitialized = False Then
		SQL1.Initialize(File.DirDefaultExternal, "db.db", False)
	End If
	
	GetCertificateDetails("0xc0ba46ea9907dedbdc0d09522e1b71e7d56782513f534e5c0812823206c44aec")
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub GetCertificateDetails(tx_id As String)
	Dim JobGetCertificate As HttpJob
	JobGetCertificate.Initialize("JobGetCertificate", Me)
	Dim url As String = "https://service-testnet.maschain.com/api/certificate/get-certificate?tx_id=" & tx_id
	JobGetCertificate.Download(url)
	JobGetCertificate.GetRequest.SetHeader("client_id", kvs.Get("client_id"))
	JobGetCertificate.GetRequest.SetHeader("client_secret", kvs.Get("client_secret"))
End Sub

Sub JobDone(Job As HttpJob)
	ProgressDialogHide
    
	If Job.Success Then
		Dim jsonString As String = Job.GetString
		Log(jsonString)

		Dim parser As JSONParser
		parser.Initialize(jsonString)

		If Job.JobName = "JobGetCertificate" Then
			' Parse the JSON response
			Dim root As Map = parser.NextObject
			Dim result As List = root.Get("result")
            
			If result.Size > 0 Then
				Dim firstResult As Map = result.Get(0)
				Dim transactionHash As String = firstResult.Get("transactionHash")
				Dim certificateImageFile As String = firstResult.Get("certificate_image_file")
                
				' Set the transactionHash to the label
				lblCert.Text = transactionHash
                
				' Log the certificate_image_file
				Log("TransactionHash: " & transactionHash)
				Log("Certificate Image File: " & certificateImageFile)
				kvs.Put("CertID",transactionHash)
				kvs.Put("CertImage",certificateImageFile)
				
				GenerateQR
			End If
		Else
			' Handle other job names or errors
			Log("Error: " & Job.ErrorMessage)
		End If
	Else
		' Handle the error
		Log("Error: " & Job.ErrorMessage)
	End If
    
	' Release the job
	Job.Release
End Sub


Sub GenerateQR

	Dim strQRCode As String
	strQRCode = kvs.Get("CertID")
	qr.Initialize
'	DrawQRCode(strQRCode)
	bmr = qr.drawQRCode(strQRCode)
	imgQR.Bitmap = bmr
	'
'	DoEvents
'	IME.HideKeyboard
	'CallSubDelayed(EnterAmount,"CloseMe")
	
End Sub

Private Sub btnCopyCert_Click
	Dim clipb As BClipboard
	clipb.setText(lblCert.Text = kvs.Get("transactionHash"))
	ToastMessageShow("Cert ID Copied", True)
End Sub


Private Sub btnCopyPaste_Click
	
	Dim something As BClipboard
	If something.hasText = True Then
		lblCert.Text = something.getText
	End If

End Sub

Private Sub imgBack_Click
	Activity.Finish
End Sub

'Private Sub imgCertImage_Click
'	imgCertImage.Visible = False
'	imgQR.Visible = True
'End Sub
'
Private Sub imgQR_Click
	
	Dim url As String = "https://explorer-testnet.maschain.com/" & kvs.Get("CertID")
	Log(kvs.Get("CertID"))
	Dim p As PhoneIntents
	StartActivity(p.OpenBrowser(url))
	
End Sub

Private Sub lblCert_LongClick
	
	Dim url As String = kvs.Get("CertImage")
	Dim p As PhoneIntents
	StartActivity(p.OpenBrowser(url))
	
End Sub