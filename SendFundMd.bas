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
	Private lblBottom As Label
	Private lblHome As Label
	Private lblFund As Label
	Private lblHistory As Label
	Private lblUser As Label
	Private lblHome2 As Label
	Private lblFund2 As Label
	Private lblHistory2 As Label
	Private lblUser2 As Label
	Private pnHeader1 As Panel
	Private lblTop As Label
	Private pnFrame1 As Panel
	Private lblProjectTittle As Label
	Private cpBar2 As CircularProgressBar
	Private lblProjectFund2 As Label
	Private lblProjectProgress2 As Label
	Private lblLine1 As Label
	Private lblDonate As Label
	Private pnDonateAmount As Panel
	Private btnNext As Button
	Private lblMethod As Label
	Private imgFpx As ImageView
	Private imgMaschain As ImageView
	Private imgCredit As ImageView
	Private imgBTC As ImageView
	Private imgBack As ImageView
	Private pnBlackTransparent As Panel
	Private pnConfirmation As Panel
	Private lblTittle2 As Label
	Private lblLine2 As Label
	Private imgCurrency As ImageView
	Private lblDonateAmount As Label
	Private btnSend As Button
	Private txtDonateAmount As EditText
	Private imgDonate As ImageView
	Private imgClose As ImageView
	Private lblTittle3 As Label
	Private pnStatus As Panel
	Private imgClose2 As ImageView
	Private imgStatus As ImageView
	Private lblLine3 As Label
	Private lblStatus As Label
	Private btnClose As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("SendFundLy")

	shared = rp.GetSafeDirDefaultExternal("")
	kvs.Initialize(shared, "Userdatastore")
	
	If File.Exists(File.DirDefaultExternal ,"db.db") = False Then
		File.Copy(File.DirAssets,"db.db",File.DirDefaultExternal,"db.db")
	End If
	
	If SQL1.IsInitialized = False Then
		SQL1.Initialize(File.DirDefaultExternal, "db.db", False)
	End If
	
	Log(kvs.Get("AuditID"))
	GetAuditByID
End Sub


Sub GetAuditByID
	
	Dim JobGetAuditByID As HttpJob
	JobGetAuditByID.Initialize("JobGetAuditByID", Me)
'	Dim address As String = kvs.Get("wallet-address")
	Dim url As String = "https://service-testnet.maschain.com/api/audit/audit/" & kvs.Get("AuditTransactionHash")
	Log("HASH:" & kvs.Get("AuditTransactionHash"))
	JobGetAuditByID.Download(url)
	JobGetAuditByID.GetRequest.SetHeader("client_id", kvs.Get("client_id"))
	JobGetAuditByID.GetRequest.SetHeader("client_secret", kvs.Get("client_secret"))

	
End Sub

Sub CheckWalletBalance
	
	Dim JobCheckWalletBalance As HttpJob
	JobCheckWalletBalance.Initialize("JobCheckWalletBalance", Me)
    
	' Prepare the JSON object
	Dim json As JSONGenerator
	Dim data As Map
	data.Initialize
	data.Put("wallet_address", kvs.Get("ProjectWallet"))
	data.Put("contract_address", kvs.Get("token-contract"))
	json.Initialize(data)

	' Make the POST request
	Dim url As String = "https://service-testnet.maschain.com/api/token/balance/"
	JobCheckWalletBalance.PostString(url, json.ToString)
	JobCheckWalletBalance.GetRequest.SetContentType("application/json")
	JobCheckWalletBalance.GetRequest.SetHeader("client_id", kvs.Get("client_id"))
	JobCheckWalletBalance.GetRequest.SetHeader("client_secret", kvs.Get("client_secret"))

End Sub

Sub PostTransaction
	Dim JobPostTransaction As HttpJob
	JobPostTransaction.Initialize("JobPostTransaction", Me)
    
	Dim url As String = "https://service-testnet.maschain.com/api/token/token-transfer/" ' Replace with the actual URL
	Dim data As Map
	data.Initialize
	data.Put("wallet_address", kvs.Get("WalletAddress"))
	data.Put("to", kvs.Get("ProjectWallet"))
	data.Put("amount", kvs.Get("DonateAmount"))
	data.Put("contract_address", "0x5BA886F619b95E2b2a875503e2FCE58c14027ade")
	data.Put("callback_url", "https://")
    
	Dim json As JSONGenerator
	json.Initialize(data)
    
	JobPostTransaction.PostString(url, json.ToString)
	JobPostTransaction.GetRequest.SetContentType("application/json")
	JobPostTransaction.GetRequest.SetHeader("client_id", kvs.Get("client_id"))
	JobPostTransaction.GetRequest.SetHeader("client_secret", kvs.Get("client_secret"))
End Sub

Sub JobDone(Job As HttpJob)

	ProgressDialogHide
    
	If Job.Success Then

		Dim jsonString As String = Job.GetString
		Log(jsonString)

		Dim parser As JSONParser
		parser.Initialize(jsonString)

		If Job.JobName = "JobGetAuditByID" Then

            
			' Get the root map
			Dim root As Map = parser.NextObject
			Dim result As Map = root.Get("result")
        
			' Get the metadata string
			Dim metadataString As String = result.Get("metadata")
        
			' Parse the metadata JSON string
			Dim metadataParser As JSONParser
			metadataParser.Initialize(metadataString)
			Dim metadata As Map = metadataParser.NextObject
        
			' Extract values from the metadata
			
			lblProjectTittle.Text = metadata.Get("project")
'			lblProjectFund2.Text = "RM " & NumberFormat2(metadata.Get("fund"), 0, 2, 2, True)
			kvs.Put("metadataFund",metadata.Get("fund"))
'			cpBar2.Value = metadata.Get("progress")
			metadata.Get("status")


			Log(metadata.Get("project"))
			Log(metadata.Get("fund"))
			Log(metadata.Get("progress"))
			Log(metadata.Get("status"))
			Log(metadata.Get("project_wallet"))
			kvs.Put("ProjectWallet",metadata.Get("project_wallet"))
			
			If kvs.Get("ProjectWallet") = Null Then
				kvs.Put("ProjectWallet",kvs.Get("WalletAddress"))
				CheckWalletBalance
				Else
				CheckWalletBalance
			End If
			
			
		Else If Job.JobName = "JobCheckWalletBalance" Then
			' Get the root map
			Dim root As Map = parser.NextObject
			Dim strResult As String = root.Get("result")
			
			CalculatePercentage(root.Get("result"),kvs.Get("metadataFund"))
			
			If kvs.Get("metadataFund") < root.Get("result") Then
				lblProjectFund2.Text = "RM 0" & NumberFormat2(0, 0, 2, 2, True)
				Else
				lblProjectFund2.Text = "RM " & NumberFormat2(kvs.Get("metadataFund") - root.Get("result"), 0, 2, 2, True)
			End If
			
			Log(lblProjectFund2.Text)
		Else If Job.JobName = "JobPostTransaction" Then
			' Handle the response for the POST transaction
			Dim root As Map = parser.NextObject
			Dim status As Int = root.Get("status")
			Log(root.Get("status"))

			pnStatus.Visible = True
			pnConfirmation.Visible = False

			
			If status = "200" Then

				ToastMessageShow("Transaction posted successfully.", True)
				lblStatus.Text = "Transaction Completed!" ' Display in label
				lblStatus.TextColor = Colors.RGB(5,206,46)
				kvs.Put("Status","success")
				
			
			Else
				ToastMessageShow("Failed to post transaction.", True)
				lblStatus.Text = "Transaction Failed!" ' Display in label
				lblStatus.TextColor = Colors.RGB(220,14,13)
				
				kvs.Put("Status","failed")
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

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub lblHome_Click
	Activity.Finish
End Sub

Private Sub lblFund_Click
	StartActivity("FundMd")
	Activity.Finish
End Sub

Private Sub lblHistory_Click
	StartActivity("HistoryMd")
	Activity.Finish
End Sub

Private Sub lblUser_Click
	StartActivity("UserMd")
	Activity.Finish
End Sub

Private Sub imgBack_Click
	kvs.Put("ProjectWallet","")
	Activity.Finish
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean

	If KeyCode = KeyCodes.KEYCODE_BACK Then
		kvs.Put("ProjectWallet","")
				Activity.Finish
				Return True

	End If
  
End Sub

Private Sub btnNext_Click
	pnBlackTransparent.Visible = True
	pnConfirmation.Visible = True
	btnNext.Visible = False
	lblDonateAmount.Text = txtDonateAmount.Text

	kvs.Put("DonateAmount",lblDonateAmount.Text)
	Log(kvs.Get("DonateAmount"))
End Sub



Private Sub btnSend_Click
	PostTransaction
End Sub

Private Sub imgClose_Click
	pnBlackTransparent.Visible = False
	pnConfirmation.Visible = False
	btnNext.Visible = True
	kvs.Put("DonateAmount","")
	Log("Donate :" & kvs.Get("DonateAmount"))
End Sub

Private Sub imgClose2_Click
	Activity.Finish
End Sub

Private Sub btnClose_Click
	
	If kvs.Get("Status") = "success" Then
		Activity.Finish
		Else
		pnStatus.Visible = False
		pnConfirmation.Visible = False
		btnNext.Visible = True
	End If
End Sub

Sub CalculatePercentage(part As Double, total As Double)
	Dim percentage As Double
	percentage = (part / total) * 100
	If percentage > 100 Then
		cpBar2.Value = "100"
		lblProjectProgress2.TextColor = Colors.RGB(5,206,46)
		lblProjectProgress2.Text = "Fundraising complete"
		txtDonateAmount.Enabled = False
		txtDonateAmount.Text = "-"
		Else
		cpBar2.Value = NumberFormat(percentage, 1, 3)
	lblProjectProgress2.TextColor = Colors.RGB(254,171,43)
	lblProjectProgress2.Text = "Fundraising in progress"
	End If

	Log(NumberFormat(percentage, 1, 3))
End Sub
