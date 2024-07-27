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

	Private clvHistory As ScrollView
	Private pnListView As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("HistoryLy")


	clvHistory.FullScroll(True)
	clvHistory.Panel.LoadLayout("ListViewLy2")
	clvHistory.Panel.Height = 880dip
	
	Dim gd As GradientDrawable
	gd.Initialize("TOP_BOTTOM", Array As Int(Colors.ARGB(0, 255, 255, 255), Colors.ARGB(0, 255, 255, 255)))
	gd.CornerRadius = 20dip ' Adjust the corner radius as needed
    
	' Set the GradientDrawable as the background of the ScrollView
	clvHistory.Background = gd

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
	Activity.Finish
End Sub
