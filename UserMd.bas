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
	Private lblBottom As Label
	Private lblHome As Label
	Private lblFund As Label
	Private lblHistory As Label
	Private lblUser As Label
	Private lblMyBalance As Label
	Private lblAmount As Label
	Private lblLine1 As Label
	Private lblHome2 As Label
	Private lblFund2 As Label
	Private lblHistory2 As Label
	Private lblUser2 As Label
	Private imgBack As ImageView
	Private imgQR As ImageView
	Private lblMyAddress As Label
	Private btnCopyAddress As Button
	Private imgUserAvatar As ImageView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("UserLy")

	shared = rp.GetSafeDirDefaultExternal("")
	kvs.Initialize(shared, "Userdatastore")
	qr.Initialize
	
	If File.Exists(File.DirDefaultExternal ,"db.db") = False Then
		File.Copy(File.DirAssets,"db.db",File.DirDefaultExternal,"db.db")
	End If
	
	If SQL1.IsInitialized = False Then
		SQL1.Initialize(File.DirDefaultExternal, "db.db", False)
	End If
	
	GenerateQR
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub GenerateQR

	Dim strQRCode As String
	strQRCode = kvs.Get("WalletAddress")
'	DrawQRCode(strQRCode)
	bmr = qr.drawQRCode(strQRCode)
	imgQR.Bitmap = bmr
	Log(strQRCode)
'	DoEvents
'	IME.HideKeyboard
	'CallSubDelayed(EnterAmount,"CloseMe")
	
End Sub

Private Sub lblHome_Click
	StartActivity("HomeMd")
	Activity.Finish
End Sub

Private Sub lblFund_Click

End Sub

Private Sub lblHistory_Click

End Sub

Private Sub imgBack_Click
	StartActivity("HomeMd")
	Activity.Finish
End Sub

Private Sub btnCopyAddress_Click
	Dim clipb As BClipboard
	clipb.setText(lblMyAddress.Text = kvs.Get("WalletAddress"))
	ToastMessageShow("Address Copied", True)
End Sub


'Private Sub btnCopyPaste_Click
'	
'	Dim something As BClipboard
'	If something.hasText = True Then
'		lblMyAddress.Text = something.getText
'	End If
'
'End Sub