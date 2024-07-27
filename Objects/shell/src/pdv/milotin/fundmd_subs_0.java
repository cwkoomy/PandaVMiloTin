package pdv.milotin;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class fundmd_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (fundmd) ","fundmd",5,fundmd.mostCurrent.activityBA,fundmd.mostCurrent,52);
if (RapidSub.canDelegate("activity_create")) { return pdv.milotin.fundmd.remoteMe.runUserSub(false, "fundmd","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 52;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 54;BA.debugLine="Activity.LoadLayout(\"FundLy\")";
Debug.ShouldStop(2097152);
fundmd.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("FundLy")),fundmd.mostCurrent.activityBA);
 BA.debugLineNum = 56;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
Debug.ShouldStop(8388608);
fundmd.mostCurrent._shared = fundmd.mostCurrent._rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 57;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
Debug.ShouldStop(16777216);
fundmd.mostCurrent._kvs.runVoidMethod ("_initialize",fundmd.processBA,(Object)(fundmd.mostCurrent._shared),(Object)(RemoteObject.createImmutable("Userdatastore")));
 BA.debugLineNum = 59;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",fundmd.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(fundmd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("db.db"))),fundmd.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 60;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
Debug.ShouldStop(134217728);
fundmd.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(fundmd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("db.db")),(Object)(fundmd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("db.db")));
 };
 BA.debugLineNum = 63;BA.debugLine="If SQL1.IsInitialized = False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",fundmd.mostCurrent._sql1.runMethod(true,"IsInitialized"),fundmd.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 64;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
Debug.ShouldStop(-2147483648);
fundmd.mostCurrent._sql1.runVoidMethod ("Initialize",(Object)(fundmd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("db.db")),(Object)(fundmd.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 67;BA.debugLine="GetAudit";
Debug.ShouldStop(4);
_getaudit();
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (fundmd) ","fundmd",5,fundmd.mostCurrent.activityBA,fundmd.mostCurrent,221);
if (RapidSub.canDelegate("activity_keypress")) { return pdv.milotin.fundmd.remoteMe.runUserSub(false, "fundmd","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 221;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 223;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, fundmd.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 224;BA.debugLine="kvs.Put(\"ProjectWallet\",\"\")";
Debug.ShouldStop(-2147483648);
fundmd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("ProjectWallet")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 225;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1);
fundmd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 226;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) return fundmd.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (fundmd) ","fundmd",5,fundmd.mostCurrent.activityBA,fundmd.mostCurrent,74);
if (RapidSub.canDelegate("activity_pause")) { return pdv.milotin.fundmd.remoteMe.runUserSub(false, "fundmd","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 74;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Activity_Resume (fundmd) ","fundmd",5,fundmd.mostCurrent.activityBA,fundmd.mostCurrent,70);
if (RapidSub.canDelegate("activity_resume")) { return pdv.milotin.fundmd.remoteMe.runUserSub(false, "fundmd","activity_resume");}
 BA.debugLineNum = 70;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clvfundlist_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("clvFundList_ItemClick (fundmd) ","fundmd",5,fundmd.mostCurrent.activityBA,fundmd.mostCurrent,210);
if (RapidSub.canDelegate("clvfundlist_itemclick")) { return pdv.milotin.fundmd.remoteMe.runUserSub(false, "fundmd","clvfundlist_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 210;BA.debugLine="Sub clvFundList_ItemClick (Index As Int, Value As";
Debug.ShouldStop(131072);
 BA.debugLineNum = 212;BA.debugLine="kvs.Put(\"AuditTransactionHash\",Value)";
Debug.ShouldStop(524288);
fundmd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("AuditTransactionHash")),(Object)(_value));
 BA.debugLineNum = 214;BA.debugLine="Log(kvs.Get(\"AuditTransactionHash\"))";
Debug.ShouldStop(2097152);
fundmd.mostCurrent.__c.runVoidMethod ("LogImpl","45111812",BA.ObjectToString(fundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("AuditTransactionHash")))),0);
 BA.debugLineNum = 216;BA.debugLine="StartActivity(\"AddAllocateMd\")";
Debug.ShouldStop(8388608);
fundmd.mostCurrent.__c.runVoidMethod ("StartActivity",fundmd.processBA,(Object)((RemoteObject.createImmutable("AddAllocateMd"))));
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistitem(RemoteObject _strid,RemoteObject _strproject,RemoteObject _strfund,RemoteObject _strprogress,RemoteObject _strprojectwallet,RemoteObject _strstatus,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateListItem (fundmd) ","fundmd",5,fundmd.mostCurrent.activityBA,fundmd.mostCurrent,164);
if (RapidSub.canDelegate("createlistitem")) { return pdv.milotin.fundmd.remoteMe.runUserSub(false, "fundmd","createlistitem", _strid, _strproject, _strfund, _strprogress, _strprojectwallet, _strstatus, _width, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("strID", _strid);
Debug.locals.put("strProject", _strproject);
Debug.locals.put("strFund", _strfund);
Debug.locals.put("StrProgress", _strprogress);
Debug.locals.put("strProjectWallet", _strprojectwallet);
Debug.locals.put("strStatus", _strstatus);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 164;BA.debugLine="Sub CreateListItem(strID As String, strProject As";
Debug.ShouldStop(8);
 BA.debugLineNum = 166;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(32);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 167;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(64);
_p.runVoidMethod ("Initialize",fundmd.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 169;BA.debugLine="Activity.AddView(p, 0, 0, 96%x, 100%y)";
Debug.ShouldStop(256);
fundmd.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(fundmd.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 96)),fundmd.mostCurrent.activityBA)),(Object)(fundmd.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),fundmd.mostCurrent.activityBA)));
 BA.debugLineNum = 170;BA.debugLine="p.LoadLayout(\"ListViewLy4\")";
Debug.ShouldStop(512);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ListViewLy4")),fundmd.mostCurrent.activityBA);
 BA.debugLineNum = 171;BA.debugLine="p.RemoveView";
Debug.ShouldStop(1024);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 173;BA.debugLine="lblProjectTitle2.Text = strProject";
Debug.ShouldStop(4096);
fundmd.mostCurrent._lblprojecttitle2.runMethod(true,"setText",BA.ObjectToCharSequence(_strproject));
 BA.debugLineNum = 174;BA.debugLine="lblProjectFund2.Text = \"RM \" & NumberFormat2(strF";
Debug.ShouldStop(8192);
fundmd.mostCurrent._lblprojectfund2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("RM "),fundmd.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _strfund)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(fundmd.mostCurrent.__c.getField(true,"True"))))));
 BA.debugLineNum = 175;BA.debugLine="Log(StrProgress)";
Debug.ShouldStop(16384);
fundmd.mostCurrent.__c.runVoidMethod ("LogImpl","45046283",_strprogress,0);
 BA.debugLineNum = 176;BA.debugLine="If StrProgress = Null Or StrProgress = \"null\" The";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("n",_strprogress) || RemoteObject.solveBoolean("=",_strprogress,BA.ObjectToString("null"))) { 
 BA.debugLineNum = 177;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(1, 30";
Debug.ShouldStop(65536);
fundmd.mostCurrent._lblprojectprogress2.runMethod(true,"setTextColor",fundmd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 302)),(Object)(BA.numberCast(int.class, 36))));
 BA.debugLineNum = 178;BA.debugLine="lblProjectProgress2.Text = \"Fundraising Complete";
Debug.ShouldStop(131072);
fundmd.mostCurrent._lblprojectprogress2.runMethod(true,"setText",BA.ObjectToCharSequence("Fundraising Completed"));
 }else 
{ BA.debugLineNum = 179;BA.debugLine="Else If StrProgress <> \"100\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("!",_strprogress,BA.ObjectToString("100"))) { 
 BA.debugLineNum = 180;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(254,";
Debug.ShouldStop(524288);
fundmd.mostCurrent._lblprojectprogress2.runMethod(true,"setTextColor",fundmd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 254)),(Object)(BA.numberCast(int.class, 171)),(Object)(BA.numberCast(int.class, 43))));
 BA.debugLineNum = 181;BA.debugLine="lblProjectProgress2.Text = \"Fundraising in progr";
Debug.ShouldStop(1048576);
fundmd.mostCurrent._lblprojectprogress2.runMethod(true,"setText",BA.ObjectToCharSequence("Fundraising in progress"));
 }else {
 BA.debugLineNum = 183;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(1, 30";
Debug.ShouldStop(4194304);
fundmd.mostCurrent._lblprojectprogress2.runMethod(true,"setTextColor",fundmd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 302)),(Object)(BA.numberCast(int.class, 36))));
 BA.debugLineNum = 184;BA.debugLine="lblProjectProgress2.Text = \"Fundraising Complete";
Debug.ShouldStop(8388608);
fundmd.mostCurrent._lblprojectprogress2.runMethod(true,"setText",BA.ObjectToCharSequence("Fundraising Completed"));
 }}
;
 BA.debugLineNum = 206;BA.debugLine="Return p";
Debug.ShouldStop(8192);
if (true) return _p;
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getaudit() throws Exception{
try {
		Debug.PushSubsStack("GetAudit (fundmd) ","fundmd",5,fundmd.mostCurrent.activityBA,fundmd.mostCurrent,78);
if (RapidSub.canDelegate("getaudit")) { return pdv.milotin.fundmd.remoteMe.runUserSub(false, "fundmd","getaudit");}
RemoteObject _jobgetaudit = RemoteObject.declareNull("pdv.milotin.httpjob");
RemoteObject _url = RemoteObject.createImmutable("");
 BA.debugLineNum = 78;BA.debugLine="Sub GetAudit";
Debug.ShouldStop(8192);
 BA.debugLineNum = 80;BA.debugLine="Dim JobGetAudit As HttpJob";
Debug.ShouldStop(32768);
_jobgetaudit = RemoteObject.createNew ("pdv.milotin.httpjob");Debug.locals.put("JobGetAudit", _jobgetaudit);
 BA.debugLineNum = 81;BA.debugLine="JobGetAudit.Initialize(\"JobGetAudit\", Me)";
Debug.ShouldStop(65536);
_jobgetaudit.runClassMethod (pdv.milotin.httpjob.class, "_initialize" /*RemoteObject*/ ,fundmd.processBA,(Object)(BA.ObjectToString("JobGetAudit")),(Object)(fundmd.getObject()));
 BA.debugLineNum = 83;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
Debug.ShouldStop(262144);
_url = BA.ObjectToString("https://service-testnet.maschain.com/api/audit/audit?tag=5");Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 84;BA.debugLine="JobGetAudit.Download(url)";
Debug.ShouldStop(524288);
_jobgetaudit.runClassMethod (pdv.milotin.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 85;BA.debugLine="JobGetAudit.GetRequest.SetHeader(\"client_id\", kvs";
Debug.ShouldStop(1048576);
_jobgetaudit.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_id")),(Object)(BA.ObjectToString(fundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_id"))))));
 BA.debugLineNum = 86;BA.debugLine="JobGetAudit.GetRequest.SetHeader(\"client_secret\",";
Debug.ShouldStop(2097152);
_jobgetaudit.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_secret")),(Object)(BA.ObjectToString(fundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_secret"))))));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private kvs As KeyValueStore";
fundmd.mostCurrent._kvs = RemoteObject.createNew ("b4a.example3.keyvaluestore");
 //BA.debugLineNum = 17;BA.debugLine="Private rp As RuntimePermissions";
fundmd.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 18;BA.debugLine="Private shared As String";
fundmd.mostCurrent._shared = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Private SQL1 As SQL";
fundmd.mostCurrent._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 21;BA.debugLine="Private clvFundList As CustomListView";
fundmd.mostCurrent._clvfundlist = RemoteObject.createNew ("pdv.milotin.customlistview");
 //BA.debugLineNum = 22;BA.debugLine="Private lblBottom As Label";
fundmd.mostCurrent._lblbottom = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private lblHome As Label";
fundmd.mostCurrent._lblhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private lblFund As Label";
fundmd.mostCurrent._lblfund = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblHistory As Label";
fundmd.mostCurrent._lblhistory = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private lblUser As Label";
fundmd.mostCurrent._lbluser = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private lblHome2 As Label";
fundmd.mostCurrent._lblhome2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private lblFund2 As Label";
fundmd.mostCurrent._lblfund2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private lblHistory2 As Label";
fundmd.mostCurrent._lblhistory2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private lblUser2 As Label";
fundmd.mostCurrent._lbluser2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private pnListView3 As Panel";
fundmd.mostCurrent._pnlistview3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private pnHeader1 As Panel";
fundmd.mostCurrent._pnheader1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private pnFrame2 As Panel";
fundmd.mostCurrent._pnframe2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private lblUserTitle As Label";
fundmd.mostCurrent._lblusertitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private lblLine6 As Label";
fundmd.mostCurrent._lblline6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private lblTop As Label";
fundmd.mostCurrent._lbltop = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private imgBack As ImageView";
fundmd.mostCurrent._imgback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private lblProjectTitle2 As Label";
fundmd.mostCurrent._lblprojecttitle2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private lblProjectFund2 As Label";
fundmd.mostCurrent._lblprojectfund2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private lblProjectTitle As Label";
fundmd.mostCurrent._lblprojecttitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private lblProjectFund As Label";
fundmd.mostCurrent._lblprojectfund = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private lblProjectProgress As Label";
fundmd.mostCurrent._lblprojectprogress = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private cpBar1 As CircularProgressBar";
fundmd.mostCurrent._cpbar1 = RemoteObject.createNew ("pdv.milotin.circularprogressbar");
 //BA.debugLineNum = 44;BA.debugLine="Private lblProjectProgress2 As Label";
fundmd.mostCurrent._lblprojectprogress2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private imgProject As ImageView";
fundmd.mostCurrent._imgproject = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private imgFunding As ImageView";
fundmd.mostCurrent._imgfunding = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private imgProgress As ImageView";
fundmd.mostCurrent._imgprogress = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private btnViewFund As Button";
fundmd.mostCurrent._btnviewfund = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private btnAddAllocate As Button";
fundmd.mostCurrent._btnaddallocate = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imgback_click() throws Exception{
try {
		Debug.PushSubsStack("imgBack_Click (fundmd) ","fundmd",5,fundmd.mostCurrent.activityBA,fundmd.mostCurrent,250);
if (RapidSub.canDelegate("imgback_click")) { return pdv.milotin.fundmd.remoteMe.runUserSub(false, "fundmd","imgback_click");}
 BA.debugLineNum = 250;BA.debugLine="Private Sub imgBack_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="Activity.Finish";
Debug.ShouldStop(67108864);
fundmd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 252;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (fundmd) ","fundmd",5,fundmd.mostCurrent.activityBA,fundmd.mostCurrent,90);
if (RapidSub.canDelegate("jobdone")) { return pdv.milotin.fundmd.remoteMe.runUserSub(false, "fundmd","jobdone", _job);}
RemoteObject _jsonstring = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _results = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _numberofitems = RemoteObject.createImmutable(0);
RemoteObject _totalfund = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _metadatastring = RemoteObject.createImmutable("");
RemoteObject _metadataparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _metadata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fund = RemoteObject.createImmutable(0);
RemoteObject _gd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _stramount = RemoteObject.createImmutable("");
RemoteObject _amount = RemoteObject.createImmutable(0);
Debug.locals.put("Job", _job);
 BA.debugLineNum = 90;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 92;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(134217728);
fundmd.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 94;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(536870912);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 96;BA.debugLine="Dim jsonString As String = Job.GetString";
Debug.ShouldStop(-2147483648);
_jsonstring = _job.runClassMethod (pdv.milotin.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("jsonString", _jsonstring);Debug.locals.put("jsonString", _jsonstring);
 BA.debugLineNum = 97;BA.debugLine="Log(jsonString)";
Debug.ShouldStop(1);
fundmd.mostCurrent.__c.runVoidMethod ("LogImpl","44980743",_jsonstring,0);
 BA.debugLineNum = 99;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(4);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 100;BA.debugLine="parser.Initialize(jsonString)";
Debug.ShouldStop(8);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstring));
 BA.debugLineNum = 102;BA.debugLine="If Job.JobName = \"JobGetAudit\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobGetAudit"))) { 
 BA.debugLineNum = 103;BA.debugLine="clvFundList.Clear";
Debug.ShouldStop(64);
fundmd.mostCurrent._clvfundlist.runClassMethod (pdv.milotin.customlistview.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 106;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(512);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 107;BA.debugLine="Dim results As List = root.Get(\"result\")";
Debug.ShouldStop(1024);
_results = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_results = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("results", _results);Debug.locals.put("results", _results);
 BA.debugLineNum = 108;BA.debugLine="Dim numberOfItems As Int = results.Size";
Debug.ShouldStop(2048);
_numberofitems = _results.runMethod(true,"getSize");Debug.locals.put("numberOfItems", _numberofitems);Debug.locals.put("numberOfItems", _numberofitems);
 BA.debugLineNum = 109;BA.debugLine="Log(\"Number of items in result: \" & numberOfIte";
Debug.ShouldStop(4096);
fundmd.mostCurrent.__c.runVoidMethod ("LogImpl","44980755",RemoteObject.concat(RemoteObject.createImmutable("Number of items in result: "),_numberofitems),0);
 BA.debugLineNum = 110;BA.debugLine="Dim totalFund As Double = 0 ' Initialize total";
Debug.ShouldStop(8192);
_totalfund = BA.numberCast(double.class, 0);Debug.locals.put("totalFund", _totalfund);Debug.locals.put("totalFund", _totalfund);
 BA.debugLineNum = 111;BA.debugLine="For Each result As Map In results";
Debug.ShouldStop(16384);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group14 = _results;
final int groupLen14 = group14.runMethod(true,"getSize").<Integer>get()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_result = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group14.runMethod(false,"Get",index14));Debug.locals.put("result", _result);
Debug.locals.put("result", _result);
 BA.debugLineNum = 113;BA.debugLine="Dim metadataString As String = result.Get(\"met";
Debug.ShouldStop(65536);
_metadatastring = BA.ObjectToString(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("metadata")))));Debug.locals.put("metadataString", _metadatastring);Debug.locals.put("metadataString", _metadatastring);
 BA.debugLineNum = 116;BA.debugLine="Dim metadataParser As JSONParser";
Debug.ShouldStop(524288);
_metadataparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("metadataParser", _metadataparser);
 BA.debugLineNum = 117;BA.debugLine="metadataParser.Initialize(metadataString)";
Debug.ShouldStop(1048576);
_metadataparser.runVoidMethod ("Initialize",(Object)(_metadatastring));
 BA.debugLineNum = 118;BA.debugLine="Dim metadata As Map = metadataParser.NextObjec";
Debug.ShouldStop(2097152);
_metadata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_metadata = _metadataparser.runMethod(false,"NextObject");Debug.locals.put("metadata", _metadata);Debug.locals.put("metadata", _metadata);
 BA.debugLineNum = 119;BA.debugLine="Dim fund As Double";
Debug.ShouldStop(4194304);
_fund = RemoteObject.createImmutable(0);Debug.locals.put("fund", _fund);
 BA.debugLineNum = 120;BA.debugLine="fund = metadata.Get(\"fund\")";
Debug.ShouldStop(8388608);
_fund = BA.numberCast(double.class, _metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fund")))));Debug.locals.put("fund", _fund);
 BA.debugLineNum = 121;BA.debugLine="totalFund = totalFund + fund";
Debug.ShouldStop(16777216);
_totalfund = RemoteObject.solve(new RemoteObject[] {_totalfund,_fund}, "+",1, 0);Debug.locals.put("totalFund", _totalfund);
 BA.debugLineNum = 125;BA.debugLine="Log(totalFund)";
Debug.ShouldStop(268435456);
fundmd.mostCurrent.__c.runVoidMethod ("LogImpl","44980771",BA.NumberToString(_totalfund),0);
 BA.debugLineNum = 127;BA.debugLine="clvFundList.Add(CreateListItem(result.Get(\"id\"";
Debug.ShouldStop(1073741824);
fundmd.mostCurrent._clvfundlist.runClassMethod (pdv.milotin.customlistview.class, "_add" /*RemoteObject*/ ,(Object)(_createlistitem(BA.ObjectToString(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("project"))))),BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fund"))))),BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("progress"))))),BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("project_wallet"))))),BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status"))))),fundmd.mostCurrent._clvfundlist.runClassMethod (pdv.milotin.customlistview.class, "_asview" /*RemoteObject*/ ).runMethod(true,"getWidth"),fundmd.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55))))),(Object)(fundmd.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))),(Object)(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("transactionHash"))))));
 BA.debugLineNum = 128;BA.debugLine="Dim gd As GradientDrawable";
Debug.ShouldStop(-2147483648);
_gd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gd", _gd);
 BA.debugLineNum = 129;BA.debugLine="gd.Initialize(\"TR_BL\", Array As Int(Colors.ARG";
Debug.ShouldStop(1);
_gd.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TR_BL")),(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {fundmd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))),fundmd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))})));
 BA.debugLineNum = 130;BA.debugLine="gd.CornerRadius = 20dip ' Adjust corner radius";
Debug.ShouldStop(2);
_gd.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, fundmd.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 132;BA.debugLine="clvFundList.AsView.Background = gd";
Debug.ShouldStop(8);
fundmd.mostCurrent._clvfundlist.runClassMethod (pdv.milotin.customlistview.class, "_asview" /*RemoteObject*/ ).runMethod(false,"setBackground",(_gd.getObject()));
 }
}Debug.locals.put("result", _result);
;
 }else 
{ BA.debugLineNum = 140;BA.debugLine="Else If Job.JobName = \"JobGetTokenBalance\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobGetTokenBalance"))) { 
 BA.debugLineNum = 141;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(4096);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 142;BA.debugLine="Dim strAmount As String = root.Get(\"result\")";
Debug.ShouldStop(8192);
_stramount = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("strAmount", _stramount);Debug.locals.put("strAmount", _stramount);
 BA.debugLineNum = 145;BA.debugLine="Dim amount As Double";
Debug.ShouldStop(65536);
_amount = RemoteObject.createImmutable(0);Debug.locals.put("amount", _amount);
 BA.debugLineNum = 146;BA.debugLine="amount = strAmount";
Debug.ShouldStop(131072);
_amount = BA.numberCast(double.class, _stramount);Debug.locals.put("amount", _amount);
 }else {
 BA.debugLineNum = 151;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(4194304);
fundmd.mostCurrent.__c.runVoidMethod ("LogImpl","44980797",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 }}
;
 }else {
 BA.debugLineNum = 156;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(134217728);
fundmd.mostCurrent.__c.runVoidMethod ("LogImpl","44980802",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 };
 BA.debugLineNum = 160;BA.debugLine="Job.Release";
Debug.ShouldStop(-2147483648);
_job.runClassMethod (pdv.milotin.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("lblFund_Click (fundmd) ","fundmd",5,fundmd.mostCurrent.activityBA,fundmd.mostCurrent,236);
if (RapidSub.canDelegate("lblfund_click")) { return pdv.milotin.fundmd.remoteMe.runUserSub(false, "fundmd","lblfund_click");}
 BA.debugLineNum = 236;BA.debugLine="Private Sub lblFund_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("lblHistory_Click (fundmd) ","fundmd",5,fundmd.mostCurrent.activityBA,fundmd.mostCurrent,240);
if (RapidSub.canDelegate("lblhistory_click")) { return pdv.milotin.fundmd.remoteMe.runUserSub(false, "fundmd","lblhistory_click");}
 BA.debugLineNum = 240;BA.debugLine="Private Sub lblHistory_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 241;BA.debugLine="StartActivity(\"HistoryMd\")";
Debug.ShouldStop(65536);
fundmd.mostCurrent.__c.runVoidMethod ("StartActivity",fundmd.processBA,(Object)((RemoteObject.createImmutable("HistoryMd"))));
 BA.debugLineNum = 242;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
fundmd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("lblHome_Click (fundmd) ","fundmd",5,fundmd.mostCurrent.activityBA,fundmd.mostCurrent,232);
if (RapidSub.canDelegate("lblhome_click")) { return pdv.milotin.fundmd.remoteMe.runUserSub(false, "fundmd","lblhome_click");}
 BA.debugLineNum = 232;BA.debugLine="Private Sub lblHome_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 233;BA.debugLine="Activity.Finish";
Debug.ShouldStop(256);
fundmd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 234;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("lblUser_Click (fundmd) ","fundmd",5,fundmd.mostCurrent.activityBA,fundmd.mostCurrent,245);
if (RapidSub.canDelegate("lbluser_click")) { return pdv.milotin.fundmd.remoteMe.runUserSub(false, "fundmd","lbluser_click");}
 BA.debugLineNum = 245;BA.debugLine="Private Sub lblUser_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 246;BA.debugLine="StartActivity(\"UserMd\")";
Debug.ShouldStop(2097152);
fundmd.mostCurrent.__c.runVoidMethod ("StartActivity",fundmd.processBA,(Object)((RemoteObject.createImmutable("UserMd"))));
 BA.debugLineNum = 247;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
fundmd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}