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
	Private lblHeaderBg As Label
	Private lblTop As Label

	Private lblBottom As Label

	Private lblFund As Label
	Private lblHistory As Label
	Private lblUser As Label

	Private lblHeader1 As Label
	Private lblHeader2 As Label
	Private lblAmount As Label
	Private lblTotal As Label

	Private lblProjectTitle2 As Label
	Private lblProjectFund2 As Label

	Private lblProjectTitle As Label
	Private lblProjectFund As Label
	Private lblProjectProgress As Label

	Private clvHome As CustomListView
	Private pnHeader1 As Panel
	Private lblHome As Label
	Private lblLine1 As Label
	Private lblHome2 As Label
	Private lblFund2 As Label
	Private lblHistory2 As Label
	Private lblUser2 As Label
	Private cpBar1 As CircularProgressBar
	Private lblProjectProgress2 As Label


	Private lblWalletName As Label
	Private imgMenu As ImageView
	Private imgProject As ImageView
	Private imgFunding As ImageView
	Private imgProgress As ImageView
	Private pnListView As Panel
	Private btnAdd As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("HomeLy")

	shared = rp.GetSafeDirDefaultExternal("")
	kvs.Initialize(shared, "Userdatastore")
	
	If File.Exists(File.DirDefaultExternal ,"db.db") = False Then
		File.Copy(File.DirAssets,"db.db",File.DirDefaultExternal,"db.db")
	End If
	
	If SQL1.IsInitialized = False Then
		SQL1.Initialize(File.DirDefaultExternal, "db.db", False)
	End If
	
	lblWalletName.Text = kvs.Get("WalletName")
	
	GetAudit
	
End Sub

Sub Activity_Resume
'	GetAudit
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub GetTokenBalance
	Dim JobGetTokenBalance As HttpJob
	JobGetTokenBalance.Initialize("JobGetTokenBalance", Me)
    
	' Prepare the JSON object
	Dim json As JSONGenerator
	Dim data As Map
	data.Initialize
	data.Put("wallet_address", kvs.Get("WalletAddress"))
	data.Put("contract_address", kvs.Get("token-contract"))
	json.Initialize(data)
	

	' Make the POST request
	Dim url As String = "https://service-testnet.maschain.com/api/token/balance/"
	JobGetTokenBalance.PostString(url, json.ToString)
	JobGetTokenBalance.GetRequest.SetContentType("application/json")
	JobGetTokenBalance.GetRequest.SetHeader("client_id", kvs.Get("client_id"))
	JobGetTokenBalance.GetRequest.SetHeader("client_secret", kvs.Get("client_secret"))
End Sub

'Sub CheckWalletBalance
'	
'	Dim JobCheckWalletBalance As HttpJob
'	JobCheckWalletBalance.Initialize("JobCheckWalletBalance", Me)
'    
'	' Prepare the JSON object
'	Dim json As JSONGenerator
'	Dim data As Map
'	data.Initialize
'	data.Put("wallet_address", kvs.Get("ProjectWallet"))
'	data.Put("contract_address", kvs.Get("token-contract"))
'	json.Initialize(data)
'
'	' Make the POST request
'	Dim url As String = "https://service-testnet.maschain.com/api/token/balance/"
'	JobCheckWalletBalance.PostString(url, json.ToString)
'	JobCheckWalletBalance.GetRequest.SetContentType("application/json")
'	JobCheckWalletBalance.GetRequest.SetHeader("client_id", kvs.Get("client_id"))
'	JobCheckWalletBalance.GetRequest.SetHeader("client_secret", kvs.Get("client_secret"))
'
'End Sub

Sub GetAudit
	
	Dim JobGetAudit As HttpJob
	JobGetAudit.Initialize("JobGetAudit", Me)

	Dim url As String = "https://service-testnet.maschain.com/api/audit/audit?tag=5"
	JobGetAudit.Download(url)
	JobGetAudit.GetRequest.SetHeader("client_id", kvs.Get("client_id"))
	JobGetAudit.GetRequest.SetHeader("client_secret", kvs.Get("client_secret"))

	
End Sub

Sub JobDone(Job As HttpJob)

	ProgressDialogHide
    
	If Job.Success Then

		Dim jsonString As String = Job.GetString
		Log(jsonString)

		Dim parser As JSONParser
		parser.Initialize(jsonString)

		If Job.JobName = "JobGetAudit" Then
			clvHome.Clear
            
			' Get the root map
			Dim root As Map = parser.NextObject
			Dim results As List = root.Get("result")
			Dim numberOfItems As Int = results.Size
			Log("Number of items in result: " & numberOfItems)
			Dim totalFund As Double = 0 ' Initialize total fund
			For Each result As Map In results
				' Get the metadata string and parse it
				Dim metadataString As String = result.Get("metadata")
                
				' Parse the metadata JSON string
				Dim metadataParser As JSONParser
				metadataParser.Initialize(metadataString)
				Dim metadata As Map = metadataParser.NextObject
				Dim fund As Double
				fund = metadata.Get("fund")
				totalFund = totalFund + fund
'				lblAmount.Text = "RM " & NumberFormat2(totalFund, 0, 2, 2, True)
				lblTotal.Text = root.Get("result")
				lblAmount.Text = "RM " & NumberFormat2(totalFund, 0, 2, 2, True)
				Log(totalFund)
				' Add the item to the CustomListView
				clvHome.Add(CreateListItem(result.Get("id"),metadata.Get("project"), metadata.Get("fund"), metadata.Get("progress"), metadata.Get("project_wallet"), metadata.Get("status"), clvHome.AsView.Width, 55dip), 80dip, result.Get("transactionHash"))
				Dim gd As GradientDrawable
				gd.Initialize("TR_BL", Array As Int(Colors.ARGB(0, 255, 255, 255), Colors.ARGB(0, 255, 255, 255))) ' Top-Right to Bottom-Left gradient
				gd.CornerRadius = 20dip ' Adjust corner radius as needed
				' Set the GradientDrawable as the background
				clvHome.AsView.Background = gd
				
			Next
            
			lblTotal.Text = numberOfItems
			' Call GetTokenBalance after processing JobGetAudit
			GetTokenBalance

		Else If Job.JobName = "JobGetTokenBalance" Then
			Dim root As Map = parser.NextObject
			Dim strAmount As String = root.Get("result")
            
			' Convert the result string to a double
			Dim amount As Double
			amount = strAmount
			

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

Sub CreateListItem(strID As String, strProject As String, strFund As String, StrProgress As String, strProjectWallet As String, strStatus As String, Width As Int, Height As Int) As Panel
	
	Dim p As Panel
	p.Initialize("")
	'we need to add the panel to a parent to set its dimensions. It will be removed after the layout is loaded.
	Activity.AddView(p, 0, 0, 96%x, 100%y)
	p.LoadLayout("ListViewLy1")
	p.RemoveView
	'label1 and button1 will point to the last added views.
		lblProjectTitle2.Text = strProject
		lblProjectFund2.Text = "RM " & NumberFormat2(strFund, 0, 2, 2, True)
	Log(StrProgress)
	If StrProgress = Null Or StrProgress = "null" Then
		lblProjectProgress2.TextColor = Colors.RGB(5,206,46)
		lblProjectProgress2.Text = "Fundraising Completed"
	Else If StrProgress <> "100" Then
		lblProjectProgress2.TextColor = Colors.RGB(254, 171, 43)
		lblProjectProgress2.Text = "Fundraising in progress"
	Else
		lblProjectProgress2.TextColor = Colors.RGB(5,206,46)
		lblProjectProgress2.Text = "Fundraising Completed"
	End If

	If StrProgress = Null Or StrProgress = "null" Then
		StrProgress = "100"
		cpBar1.Value = StrProgress
	Else
		cpBar1.Value = StrProgress
	End If
	cpBar1.Value = StrProgress
	Return p

End Sub

Sub clvHome_ItemClick (Index As Int, Value As Object)
	
	kvs.Put("AuditTransactionHash",Value)
'	kvs.Put("ProjectWallet",Value)
	Log(kvs.Get("AuditTransactionHash"))
	StartActivity("SendFundMd")
	
End Sub


Sub Activity_KeyPress (KeyCode As Int) As Boolean

	If KeyCode = KeyCodes.KEYCODE_BACK Then
		
		Dim str1 As String
		Dim str2 As String
		
		Select Case "English" 'kvs.GetSimple("CurrLanguage")
			Case "中文"
				str1 = "确定要离开吗?"
				str2 = "温馨提醒"
			Case "English"
				str1 = "Are You Sure Want to Exit?"
				str2 = "Reminder"
		End Select
		
		Select Msgbox2(str1,str2,"Yes","","No",Null)
			Case DialogResponse.POSITIVE
'				CallSubDelayed(FirebaseMessaging, "UnSubscribeToTopics")
				kvs.Put("LEAVE","YES")
				kvs.put("Logout","NO")
				Activity.Finish
			Case Else
				Return True
		End Select
	End If
  
End Sub

Private Sub lblFund_Click
	StartActivity("FundMd")
End Sub

Private Sub lblHistory_Click
	StartActivity("HistoryMd")
End Sub

Private Sub lblUser_Click
	StartActivity("UserMd")
	
End Sub

Private Sub imgMenu_Click
	
End Sub

Private Sub btnAdd_Click
	StartActivity("AddProjectMd")
End Sub

Private Sub lblHome2_Click
	
End Sub

Private Sub lblFund2_Click
	StartActivity("FundMd")
End Sub

Private Sub lblHistory2_Click
	StartActivity("HistoryMd")
End Sub

Private Sub lblUser2_Click
	StartActivity("UserMd")
End Sub

Private Sub imgAdd_Click
	StartActivity("AddProjectMd")
End Sub