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
	
	Private clvFundList As CustomListView
	Private lblBottom As Label
	Private lblHome As Label
	Private lblFund As Label
	Private lblHistory As Label
	Private lblUser As Label
	Private lblHome2 As Label
	Private lblFund2 As Label
	Private lblHistory2 As Label
	Private lblUser2 As Label
	Private pnListView3 As Panel
	Private pnHeader1 As Panel
	Private pnFrame2 As Panel
	Private lblUserTitle As Label
	Private lblLine6 As Label
	Private lblTop As Label
	Private imgBack As ImageView

	Private lblHistorytitle As Label
	Private lblHistoryHashID As Label
	Private imgStatus1 As ImageView
	Private lblHistoryDate As Label
	Private lblHistoryAmount As Label
	Private lblHistorytitle2 As Label
	Private lblHistoryHashID2 As Label
	Private imgStatus2 As ImageView
	Private lblHistoryDate2 As Label
	Private lblHistoryAmount2 As Label
	Private lblHistorytitle3 As Label
	Private lblHistoryHashID3 As Label
	Private imgStatus3 As ImageView
	Private lblHistoryDate3 As Label
	Private lblHistoryAmount3 As Label
	Private lblHistorytitle4 As Label
	Private lblHistoryHashID4 As Label
	Private imgStatus4 As ImageView
	Private lblHistoryDate4 As Label
	Private lblHistoryAmount4 As Label
	Private lblHistorytitle5 As Label
	Private lblHistoryHashID5 As Label
	Private imgStatus5 As ImageView
	Private lblHistoryDate5 As Label
	Private lblHistoryAmount5 As Label
	Private lblSaperate As Label
	Private lblSaperate2 As Label
	Private lblSaperate3 As Label
	Private lblSaperate4 As Label
	Private lblCategory As Label
	Private lblTransactionHashID As Label
	Private lblRemark As Label
	Private lblAllocateFund As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("ViewAllocateLy")

	shared = rp.GetSafeDirDefaultExternal("")
	kvs.Initialize(shared, "Userdatastore")
	
	If File.Exists(File.DirDefaultExternal ,"db.db") = False Then
		File.Copy(File.DirAssets,"db.db",File.DirDefaultExternal,"db.db")
	End If
	
	If SQL1.IsInitialized = False Then
		SQL1.Initialize(File.DirDefaultExternal, "db.db", False)
	End If
	
	GetAudit
End Sub

Sub Activity_Resume
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub GetAudit
	
	Dim JobGetAudit As HttpJob
	JobGetAudit.Initialize("JobGetAudit", Me)
'	Dim address As String = kvs.Get("wallet-address")
	Dim url As String = "https://service-testnet.maschain.com/api/audit/audit?tag=4" '& address
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
			clvFundList.Clear
            
			' Get the root map
			Dim root As Map = parser.NextObject
			Dim results As List = root.Get("result")
			Dim numberOfItems As Int = results.Size
			Log("Number of items in result: " & numberOfItems)
'			Dim totalFund As Double = 0 ' Initialize total fund
			For Each result As Map In results
				' Get the metadata string and parse it
				Dim metadataString As String = result.Get("metadata")
                
				' Parse the metadata JSON string
				Dim metadataParser As JSONParser
				metadataParser.Initialize(metadataString)
				Dim metadata As Map = metadataParser.NextObject
'				Dim fund As Double
'				fund = metadata.Get("fund")
'				totalFund = totalFund + fund
'				lblAmount.Text = "RM " & NumberFormat2(totalFund, 0, 2, 2, True)
'				lblTotal.Text = root.Get("result")
'				lblAmount.Text = "RM " & NumberFormat2(totalFund, 0, 2, 2, True)
'				Log(totalFund)
				' Add the item to the CustomListView
				clvFundList.Add(CreateListItem(result.Get("id"),metadata.Get("Category"), metadata.Get("AllocateFund"), metadata.Get("Remark"), clvFundList.AsView.Width, 55dip), 80dip, result.Get("transactionHash"))
				Dim gd As GradientDrawable
				gd.Initialize("TR_BL", Array As Int(Colors.ARGB(0, 255, 255, 255), Colors.ARGB(0, 255, 255, 255))) ' Top-Right to Bottom-Left gradient
				gd.CornerRadius = 20dip ' Adjust corner radius as needed
				' Set the GradientDrawable as the background
				clvFundList.AsView.Background = gd
				
			Next
            
'			lblTotal.Text = numberOfItems
'			' Call GetTokenBalance after processing JobGetAudit
'			GetTokenBalance

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

Sub CreateListItem(strID As String, strCategory As String, strAllocateFund As String, strRemark As String, Width As Int, Height As Int) As Panel
	
	Dim p As Panel
	p.Initialize("")
	'we need to add the panel to a parent to set its dimensions. It will be removed after the layout is loaded.
	Activity.AddView(p, 0, 0, 96%x, 100%y)
	p.LoadLayout("ListViewLy5")
	p.RemoveView
	'label1 and button1 will point to the last added views.

	lblCategory.Text = strCategory
	lblAllocateFund.Text = "RM " & NumberFormat2(strAllocateFund, 0, 2, 2, True)
	lblRemark.Text = strRemark

	

	
'	If StrProgress = "100" Then
'		lblProjectProgress2.TextColor = Colors.RGB(1,302,36)
'		lblProjectProgress2.Text = "Fundraising Completed"
	'
'	Else If StrProgress = Null Or StrProgress = "null" Then
'		lblProjectProgress2.TextColor = Colors.RGB(1,302,36)
'		lblProjectProgress2.Text = "Fundraising Completed"
'	Else
'		lblProjectProgress2.TextColor = Colors.RGB(254,171,43)
'		lblProjectProgress2.Text = "Fundraising in progress"
'	End If

'	If StrProgress = Null Or StrProgress = "null" Then
'		StrProgress = "30"
'		cpBar1.Value = StrProgress
'	Else
'		cpBar1.Value = StrProgress
'	End If
'	cpBar1.Value = StrProgress
	Return p

End Sub

Sub clvFundList_ItemClick (Index As Int, Value As Object)
	
'	kvs.Put("AuditTransactionHash",Value)
''	kvs.Put("ProjectWallet",Value)
'	Log(kvs.Get("AuditTransactionHash"))
'	
'	StartActivity("AddAllocateMd")
	
End Sub


Sub Activity_KeyPress (KeyCode As Int) As Boolean

	If KeyCode = KeyCodes.KEYCODE_BACK Then

		Activity.Finish
		Return True

	End If
  
End Sub

Private Sub lblHome_Click
	Activity.Finish
End Sub

Private Sub lblFund_Click
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
	Activity.Finish
End Sub
