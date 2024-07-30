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
	
	Private lblTop As Label
	Private imgBack As ImageView
	Private ScrollView1 As ScrollView
	Private pnKYCStart As Panel
	Private imgKYC As ImageView
	Private lblTitleKYC1 As Label
	Private lblTitleKYC2 As Label
	Private btnStartVerify As Button
	Private pnHeader1 As Panel
	Private lblKYCTitle As Label
	Private lblLine4 As Label
	Private pnFrame2 As Panel
	Private btnContinue1 As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("KYC1Ly")

	shared = rp.GetSafeDirDefaultExternal("")
	kvs.Initialize(shared, "Userdatastore")
	
	If File.Exists(File.DirDefaultExternal ,"db.db") = False Then
		File.Copy(File.DirAssets,"db.db",File.DirDefaultExternal,"db.db")
	End If
	
	If SQL1.IsInitialized = False Then
		SQL1.Initialize(File.DirDefaultExternal, "db.db", False)
	End If
	
	ScrollView1.FullScroll(True)
	ScrollView1.Panel.LoadLayout("KYC1ListViewLy")
	ScrollView1.Panel.Height = 1000dip
	

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub imgBack_Click
	Activity.Finish
End Sub

Private Sub btnStartVerify_Click
	pnKYCStart.Visible = False
End Sub

Private Sub btnContinue1_Click
	
End Sub