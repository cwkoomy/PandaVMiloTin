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
	Private xui As XUI
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
	Private lblAllocateCategory As Label
	Private cboCategory As Spinner
	Private pnCategory As Panel
	Private imgCategory As ImageView
	Private lblAllocateFund As Label
	Private txtAllocateFund As EditText
	Private pnAllocateFund As Panel
	Private imgAllocateFund As ImageView
	Private lblAllocateAmount As Label
	Private lblRemark As Label
	Private pnRemark As Panel
	Private txtRemark As EditText
	Private imgRemark As ImageView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("AddAllocateLy")

	shared = rp.GetSafeDirDefaultExternal("")
	kvs.Initialize(shared, "Userdatastore")
	
	If File.Exists(File.DirDefaultExternal ,"db.db") = False Then
		File.Copy(File.DirAssets,"db.db",File.DirDefaultExternal,"db.db")
	End If
	
	If SQL1.IsInitialized = False Then
		SQL1.Initialize(File.DirDefaultExternal, "db.db", False)
	End If
	
'	Log(kvs.Get("AuditID"))
	GetAuditByID
	
End Sub


Sub GetAuditCategory
	
	Dim JobGetAuditCategory As HttpJob
	JobGetAuditCategory.Initialize("JobGetAuditCategory", Me)
'	Dim address As String = kvs.Get("wallet-address")
	Dim url As String = "https://service-testnet.maschain.com/api/audit/category/"
	JobGetAuditCategory.Download(url)
	JobGetAuditCategory.GetRequest.SetHeader("client_id", kvs.Get("client_id"))
	JobGetAuditCategory.GetRequest.SetHeader("client_secret", kvs.Get("client_secret"))

	
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

Sub PostAllocate
	Dim PostAuditAllocate As HttpJob
	PostAuditAllocate.Initialize("PostAuditAllocate", Me)
    
	' Prepare the JSON object
	Dim json As JSONGenerator
	Dim data As Map
	data.Initialize
	data.Put("contract_address", kvs.Get("audit-contract"))
	data.Put("wallet_address", kvs.Get("WalletAddress"))

	' Tag IDs should be a list
	Dim tagIds As List
	tagIds.Initialize
	tagIds.Add(4) ' Assuming 4 is the tag ID
	data.Put("tag_id", tagIds)
	data.Put("callback_url", "https://postman-echo.com/post?")

	' Prepare the metadata map
	Dim metadata As Map
	metadata.Initialize
	metadata.Put("Category", kvs.Get("SelectedCategory"))
	metadata.Put("AllocateFund", txtAllocateFund.Text)
	metadata.Put("Remark", txtRemark.Text)
	data.Put("metadata", metadata)
    
	json.Initialize(data)
    
	' Log the JSON to debug
	Log(json.ToString)
    
	' Make the POST request
	Dim url As String = "https://service-testnet.maschain.com/api/audit/audit/"
	PostAuditAllocate.PostString(url, json.ToString)
	PostAuditAllocate.GetRequest.SetContentType("application/json")
	PostAuditAllocate.GetRequest.SetHeader("client_id", kvs.Get("client_id"))
	PostAuditAllocate.GetRequest.SetHeader("client_secret", kvs.Get("client_secret"))
End Sub

Sub JobDone(Job As HttpJob)

	ProgressDialogHide
    
	If Job.Success Then

		Dim jsonString As String = Job.GetString
		Log(jsonString)

		Dim parser As JSONParser
		parser.Initialize(jsonString)

		If Job.JobName = "JobGetAuditCategory" Then

            
			Dim root As Map = parser.NextObject
			Dim results As List = root.Get("result")
			Dim categories As List
			categories.Initialize
			For Each result As Map In results
				Dim name As String = result.Get("name")
				categories.Add(name)
				' Optionally, you can store the ID as well if needed
				Dim id As Int = result.Get("id")
				' You can use a map or a custom type to store both name and ID if needed
			Next
			' Populate the spinner
			cboCategory.AddAll(categories)
			
			
		Else If Job.JobName = "PostAuditAllocate" Then
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
				
			 End If
		Else If Job.JobName = "JobGetAuditByID" Then
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

			metadata.Get("status")

			Log(metadata.Get("project"))
			Log(metadata.Get("fund"))
			Log(metadata.Get("progress"))
			Log(metadata.Get("status"))
			Log(metadata.Get("project_wallet"))

			GetAuditCategory
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
	kvs.Put("ProjectTitle","")
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
	kvs.Put("ProjectTitle","")
	Activity.Finish
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean

	If KeyCode = KeyCodes.KEYCODE_BACK Then
		kvs.Put("ProjectWallet","")
		kvs.Put("ProjectTitle","")
		Activity.Finish
		Return True

	End If
  
End Sub

Private Sub btnNext_Click
	Dim strSelectCategory As String
	pnBlackTransparent.Visible = True
	pnConfirmation.Visible = True
	btnNext.Visible = False
	strSelectCategory = cboCategory.GetItem(cboCategory.SelectedIndex)
	kvs.Put("SelectedCategory", strSelectCategory)
	Log(strSelectCategory)
	lblAllocateAmount.Text = txtAllocateFund.Text

End Sub



Private Sub btnSend_Click
	PostAllocate
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
