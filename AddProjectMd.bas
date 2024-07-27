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
	Private pnHeader1 As Panel
	Private lblBottom As Label
	Private lblHome As Label
	Private lblFund As Label
	Private lblHistory As Label
	Private lblUser As Label
	Private lblHome2 As Label
	Private lblFund2 As Label
	Private lblHistory2 As Label
	Private lblUser2 As Label
	Private pnFrame2 As Panel
	Private lblAddTitle As Label
	Private lblLine4 As Label
	Private lblProjectName As Label
	Private pnProjectName As Panel
	Private lblFundAmount As Label
	Private pnSetFundAmount As Panel
	Private pnContent As Panel
	Private pnSetWalletAddress As Panel
	Private lblContent As Label
	Private lblSetWalletAddress As Label
	Private btnProjectSubmit As Button
	Private txtProjectName As EditText
	Private txtSetFundAmount As EditText
	Private txtContent As EditText
	Private txtSetWalletAddress As EditText
	Private imgSetFundAmount As ImageView
	Private imgProjectName As ImageView
	Private imgContent As ImageView
	Private imgSetWalletAddress As ImageView
	Private pnBlackTransparent As Panel
	Private pnStatus As Panel
	Private btnClose As Button
	Private lblStatus As Label
	Private imgStatus As ImageView
	Private lblLine3 As Label
	Private lblTittle3 As Label
	Private imgClose2 As ImageView
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("AddProjectLy")

	shared = rp.GetSafeDirDefaultExternal("")
	kvs.Initialize(shared, "Userdatastore")
	
	If File.Exists(File.DirDefaultExternal ,"db.db") = False Then
		File.Copy(File.DirAssets,"db.db",File.DirDefaultExternal,"db.db")
	End If
	
	If SQL1.IsInitialized = False Then
		SQL1.Initialize(File.DirDefaultExternal, "db.db", False)
	End If
	

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub PostAudit
	Dim PostAuditProject As HttpJob
	PostAuditProject.Initialize("PostAuditProject", Me)
    
	' Prepare the JSON object
	Dim json As JSONGenerator
	Dim data As Map
	data.Initialize
	data.Put("contract_address", kvs.Get("audit-contract"))
	data.Put("wallet_address", txtSetWalletAddress.Text)

	data.Put("callback_url", "https://")
	Dim metadata As Map
	metadata.Initialize
	metadata.Put("project", txtProjectName.Text)
	metadata.Put("fund", txtSetFundAmount.Text)
	metadata.Put("content", txtContent.Text)
	data.Put("metadata", metadata)
	json.Initialize(data)
    
	' Make the POST request
	Dim url As String = "https://service-testnet.maschain.com/api/audit/audit/" ' Replace with the actual URL
	PostAuditProject.PostString(url, json.ToString)
	PostAuditProject.GetRequest.SetContentType("application/json")
	PostAuditProject.GetRequest.SetHeader("client_id", kvs.Get("client_id"))
	PostAuditProject.GetRequest.SetHeader("client_secret", kvs.Get("client_secret"))

End Sub



Sub JobDone(Job As HttpJob)
	ProgressDialogHide
    
	If Job.Success Then
		Dim jsonString As String = Job.GetString
		Log(jsonString)

		Dim parser As JSONParser
		parser.Initialize(jsonString)

		If Job.JobName = "PostAuditProject" Then
			Dim root As Map = parser.NextObject
			Dim status As Int = root.Get("status")
			Dim result As Map = root.Get("result")
            
			If status = 200 Then
				Dim transactionHash As String = result.Get("transactionHash")
				Dim nonce As Int = result.Get("nonce")
				Dim from As String = result.Get("from")
				Dim responseStatus As String = result.Get("status")
				Dim receipt As Map = result.Get("receipt")

				' Process the response as needed
				Log("Transaction Hash: " & transactionHash)
				Log("Nonce: " & nonce)
				Log("From: " & from)
				Log("Status: " & responseStatus)
				Log("Receipt: " & receipt)
				pnBlackTransparent.Visible = True
				pnStatus.Visible = True

				
			Else
				Log("Failed to post the job")
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


Private Sub btnProjectSubmit_Click
	PostAudit
	pnBlackTransparent.Visible = True
End Sub

Private Sub btnClose_Click
	
	If kvs.Get("Status") = "success" Then
		Activity.Finish
	Else
		pnStatus.Visible = False
	End If
End Sub

