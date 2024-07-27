package pdv.milotin;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class historymd_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (historymd) ","historymd",4,historymd.mostCurrent.activityBA,historymd.mostCurrent,50);
if (RapidSub.canDelegate("activity_create")) { return pdv.milotin.historymd.remoteMe.runUserSub(false, "historymd","activity_create", _firsttime);}
RemoteObject _gd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="Activity.LoadLayout(\"HistoryLy\")";
Debug.ShouldStop(524288);
historymd.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("HistoryLy")),historymd.mostCurrent.activityBA);
 BA.debugLineNum = 55;BA.debugLine="clvHistory.FullScroll(True)";
Debug.ShouldStop(4194304);
historymd.mostCurrent._clvhistory.runVoidMethod ("FullScroll",(Object)(historymd.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 56;BA.debugLine="clvHistory.Panel.LoadLayout(\"ListViewLy2\")";
Debug.ShouldStop(8388608);
historymd.mostCurrent._clvhistory.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ListViewLy2")),historymd.mostCurrent.activityBA);
 BA.debugLineNum = 57;BA.debugLine="clvHistory.Panel.Height = 880dip";
Debug.ShouldStop(16777216);
historymd.mostCurrent._clvhistory.runMethod(false,"getPanel").runMethod(true,"setHeight",historymd.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 880))));
 BA.debugLineNum = 59;BA.debugLine="Dim gd As GradientDrawable";
Debug.ShouldStop(67108864);
_gd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gd", _gd);
 BA.debugLineNum = 60;BA.debugLine="gd.Initialize(\"TOP_BOTTOM\", Array As Int(Colors.A";
Debug.ShouldStop(134217728);
_gd.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {historymd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))),historymd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))})));
 BA.debugLineNum = 61;BA.debugLine="gd.CornerRadius = 20dip ' Adjust the corner radiu";
Debug.ShouldStop(268435456);
_gd.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, historymd.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 64;BA.debugLine="clvHistory.Background = gd";
Debug.ShouldStop(-2147483648);
historymd.mostCurrent._clvhistory.runMethod(false,"setBackground",(_gd.getObject()));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (historymd) ","historymd",4,historymd.mostCurrent.activityBA,historymd.mostCurrent,72);
if (RapidSub.canDelegate("activity_pause")) { return pdv.milotin.historymd.remoteMe.runUserSub(false, "historymd","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 72;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (historymd) ","historymd",4,historymd.mostCurrent.activityBA,historymd.mostCurrent,68);
if (RapidSub.canDelegate("activity_resume")) { return pdv.milotin.historymd.remoteMe.runUserSub(false, "historymd","activity_resume");}
 BA.debugLineNum = 68;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private lblHistorytitle As Label";
historymd.mostCurrent._lblhistorytitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private lblHistoryHashID As Label";
historymd.mostCurrent._lblhistoryhashid = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private imgStatus1 As ImageView";
historymd.mostCurrent._imgstatus1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private lblHistoryDate As Label";
historymd.mostCurrent._lblhistorydate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private lblHistoryAmount As Label";
historymd.mostCurrent._lblhistoryamount = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private lblHistorytitle2 As Label";
historymd.mostCurrent._lblhistorytitle2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private lblHistoryHashID2 As Label";
historymd.mostCurrent._lblhistoryhashid2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private imgStatus2 As ImageView";
historymd.mostCurrent._imgstatus2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private lblHistoryDate2 As Label";
historymd.mostCurrent._lblhistorydate2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblHistoryAmount2 As Label";
historymd.mostCurrent._lblhistoryamount2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private lblHistorytitle3 As Label";
historymd.mostCurrent._lblhistorytitle3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private lblHistoryHashID3 As Label";
historymd.mostCurrent._lblhistoryhashid3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private imgStatus3 As ImageView";
historymd.mostCurrent._imgstatus3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private lblHistoryDate3 As Label";
historymd.mostCurrent._lblhistorydate3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private lblHistoryAmount3 As Label";
historymd.mostCurrent._lblhistoryamount3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private lblHistorytitle4 As Label";
historymd.mostCurrent._lblhistorytitle4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private lblHistoryHashID4 As Label";
historymd.mostCurrent._lblhistoryhashid4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private imgStatus4 As ImageView";
historymd.mostCurrent._imgstatus4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private lblHistoryDate4 As Label";
historymd.mostCurrent._lblhistorydate4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private lblHistoryAmount4 As Label";
historymd.mostCurrent._lblhistoryamount4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private lblHistorytitle5 As Label";
historymd.mostCurrent._lblhistorytitle5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private lblHistoryHashID5 As Label";
historymd.mostCurrent._lblhistoryhashid5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private imgStatus5 As ImageView";
historymd.mostCurrent._imgstatus5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private lblHistoryDate5 As Label";
historymd.mostCurrent._lblhistorydate5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private lblHistoryAmount5 As Label";
historymd.mostCurrent._lblhistoryamount5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private lblSaperate As Label";
historymd.mostCurrent._lblsaperate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private lblSaperate2 As Label";
historymd.mostCurrent._lblsaperate2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private lblSaperate3 As Label";
historymd.mostCurrent._lblsaperate3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private lblSaperate4 As Label";
historymd.mostCurrent._lblsaperate4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private clvHistory As ScrollView";
historymd.mostCurrent._clvhistory = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private pnListView As Panel";
historymd.mostCurrent._pnlistview = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imgback_click() throws Exception{
try {
		Debug.PushSubsStack("imgBack_Click (historymd) ","historymd",4,historymd.mostCurrent.activityBA,historymd.mostCurrent,97);
if (RapidSub.canDelegate("imgback_click")) { return pdv.milotin.historymd.remoteMe.runUserSub(false, "historymd","imgback_click");}
 BA.debugLineNum = 97;BA.debugLine="Private Sub imgBack_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2);
historymd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblfund_click() throws Exception{
try {
		Debug.PushSubsStack("lblFund_Click (historymd) ","historymd",4,historymd.mostCurrent.activityBA,historymd.mostCurrent,82);
if (RapidSub.canDelegate("lblfund_click")) { return pdv.milotin.historymd.remoteMe.runUserSub(false, "historymd","lblfund_click");}
 BA.debugLineNum = 82;BA.debugLine="Private Sub lblFund_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="StartActivity(\"FundMd\")";
Debug.ShouldStop(262144);
historymd.mostCurrent.__c.runVoidMethod ("StartActivity",historymd.processBA,(Object)((RemoteObject.createImmutable("FundMd"))));
 BA.debugLineNum = 84;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
historymd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblhistory_click() throws Exception{
try {
		Debug.PushSubsStack("lblHistory_Click (historymd) ","historymd",4,historymd.mostCurrent.activityBA,historymd.mostCurrent,87);
if (RapidSub.canDelegate("lblhistory_click")) { return pdv.milotin.historymd.remoteMe.runUserSub(false, "historymd","lblhistory_click");}
 BA.debugLineNum = 87;BA.debugLine="Private Sub lblHistory_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="StartActivity(\"HistoryMd\")";
Debug.ShouldStop(8388608);
historymd.mostCurrent.__c.runVoidMethod ("StartActivity",historymd.processBA,(Object)((RemoteObject.createImmutable("HistoryMd"))));
 BA.debugLineNum = 89;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16777216);
historymd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblhome_click() throws Exception{
try {
		Debug.PushSubsStack("lblHome_Click (historymd) ","historymd",4,historymd.mostCurrent.activityBA,historymd.mostCurrent,78);
if (RapidSub.canDelegate("lblhome_click")) { return pdv.milotin.historymd.remoteMe.runUserSub(false, "historymd","lblhome_click");}
 BA.debugLineNum = 78;BA.debugLine="Private Sub lblHome_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16384);
historymd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbluser_click() throws Exception{
try {
		Debug.PushSubsStack("lblUser_Click (historymd) ","historymd",4,historymd.mostCurrent.activityBA,historymd.mostCurrent,92);
if (RapidSub.canDelegate("lbluser_click")) { return pdv.milotin.historymd.remoteMe.runUserSub(false, "historymd","lbluser_click");}
 BA.debugLineNum = 92;BA.debugLine="Private Sub lblUser_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="StartActivity(\"UserMd\")";
Debug.ShouldStop(268435456);
historymd.mostCurrent.__c.runVoidMethod ("StartActivity",historymd.processBA,(Object)((RemoteObject.createImmutable("UserMd"))));
 BA.debugLineNum = 94;BA.debugLine="Activity.Finish";
Debug.ShouldStop(536870912);
historymd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}