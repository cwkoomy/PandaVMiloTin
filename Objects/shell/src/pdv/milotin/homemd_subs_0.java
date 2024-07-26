package pdv.milotin;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class homemd_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (homemd) ","homemd",1,homemd.mostCurrent.activityBA,homemd.mostCurrent,61);
if (RapidSub.canDelegate("activity_create")) { return pdv.milotin.homemd.remoteMe.runUserSub(false, "homemd","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 61;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 63;BA.debugLine="Activity.LoadLayout(\"HomeLy\")";
Debug.ShouldStop(1073741824);
homemd.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("HomeLy")),homemd.mostCurrent.activityBA);
 BA.debugLineNum = 65;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
Debug.ShouldStop(1);
homemd.mostCurrent._shared = homemd.mostCurrent._rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 66;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
Debug.ShouldStop(2);
homemd.mostCurrent._kvs.runVoidMethod ("_initialize",homemd.processBA,(Object)(homemd.mostCurrent._shared),(Object)(RemoteObject.createImmutable("Userdatastore")));
 BA.debugLineNum = 68;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",homemd.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(homemd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("db.db"))),homemd.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 69;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
Debug.ShouldStop(16);
homemd.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(homemd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("db.db")),(Object)(homemd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("db.db")));
 };
 BA.debugLineNum = 72;BA.debugLine="If SQL1.IsInitialized = False Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",homemd.mostCurrent._sql1.runMethod(true,"IsInitialized"),homemd.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 73;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
Debug.ShouldStop(256);
homemd.mostCurrent._sql1.runVoidMethod ("Initialize",(Object)(homemd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("db.db")),(Object)(homemd.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 76;BA.debugLine="lblWalletName.Text = kvs.Get(\"WalletName\")";
Debug.ShouldStop(2048);
homemd.mostCurrent._lblwalletname.runMethod(true,"setText",BA.ObjectToCharSequence(homemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("WalletName")))));
 BA.debugLineNum = 78;BA.debugLine="GetAudit";
Debug.ShouldStop(8192);
_getaudit();
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
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (homemd) ","homemd",1,homemd.mostCurrent.activityBA,homemd.mostCurrent,277);
if (RapidSub.canDelegate("activity_keypress")) { return pdv.milotin.homemd.remoteMe.runUserSub(false, "homemd","activity_keypress", _keycode);}
RemoteObject _str1 = RemoteObject.createImmutable("");
RemoteObject _str2 = RemoteObject.createImmutable("");
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 277;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 279;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, homemd.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 281;BA.debugLine="Dim str1 As String";
Debug.ShouldStop(16777216);
_str1 = RemoteObject.createImmutable("");Debug.locals.put("str1", _str1);
 BA.debugLineNum = 282;BA.debugLine="Dim str2 As String";
Debug.ShouldStop(33554432);
_str2 = RemoteObject.createImmutable("");Debug.locals.put("str2", _str2);
 BA.debugLineNum = 284;BA.debugLine="Select Case \"English\" 'kvs.GetSimple(\"CurrLangua";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt("English",BA.ObjectToString("中文"),BA.ObjectToString("English"))) {
case 0: {
 BA.debugLineNum = 286;BA.debugLine="str1 = \"确定要离开吗?\"";
Debug.ShouldStop(536870912);
_str1 = BA.ObjectToString("确定要离开吗?");Debug.locals.put("str1", _str1);
 BA.debugLineNum = 287;BA.debugLine="str2 = \"温馨提醒\"";
Debug.ShouldStop(1073741824);
_str2 = BA.ObjectToString("温馨提醒");Debug.locals.put("str2", _str2);
 break; }
case 1: {
 BA.debugLineNum = 289;BA.debugLine="str1 = \"Are You Sure Want to Exit?\"";
Debug.ShouldStop(1);
_str1 = BA.ObjectToString("Are You Sure Want to Exit?");Debug.locals.put("str1", _str1);
 BA.debugLineNum = 290;BA.debugLine="str2 = \"Reminder\"";
Debug.ShouldStop(2);
_str2 = BA.ObjectToString("Reminder");Debug.locals.put("str2", _str2);
 break; }
}
;
 BA.debugLineNum = 293;BA.debugLine="Select Msgbox2(str1,str2,\"Yes\",\"\",\"No\",Null)";
Debug.ShouldStop(16);
switch (BA.switchObjectToInt(homemd.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(_str1)),(Object)(BA.ObjectToCharSequence(_str2)),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((homemd.mostCurrent.__c.getField(false,"Null"))),homemd.mostCurrent.activityBA),homemd.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))) {
case 0: {
 BA.debugLineNum = 296;BA.debugLine="kvs.Put(\"LEAVE\",\"YES\")";
Debug.ShouldStop(128);
homemd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("LEAVE")),(Object)((RemoteObject.createImmutable("YES"))));
 BA.debugLineNum = 297;BA.debugLine="kvs.put(\"Logout\",\"NO\")";
Debug.ShouldStop(256);
homemd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("Logout")),(Object)((RemoteObject.createImmutable("NO"))));
 BA.debugLineNum = 298;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
homemd.mostCurrent._activity.runVoidMethod ("Finish");
 break; }
default: {
 BA.debugLineNum = 300;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return homemd.mostCurrent.__c.getField(true,"True");
 break; }
}
;
 };
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Pause (homemd) ","homemd",1,homemd.mostCurrent.activityBA,homemd.mostCurrent,86);
if (RapidSub.canDelegate("activity_pause")) { return pdv.milotin.homemd.remoteMe.runUserSub(false, "homemd","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 86;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2097152);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (homemd) ","homemd",1,homemd.mostCurrent.activityBA,homemd.mostCurrent,82);
if (RapidSub.canDelegate("activity_resume")) { return pdv.milotin.homemd.remoteMe.runUserSub(false, "homemd","activity_resume");}
 BA.debugLineNum = 82;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="GetAudit";
Debug.ShouldStop(262144);
_getaudit();
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnadd_click() throws Exception{
try {
		Debug.PushSubsStack("btnAdd_Click (homemd) ","homemd",1,homemd.mostCurrent.activityBA,homemd.mostCurrent,323);
if (RapidSub.canDelegate("btnadd_click")) { return pdv.milotin.homemd.remoteMe.runUserSub(false, "homemd","btnadd_click");}
 BA.debugLineNum = 323;BA.debugLine="Private Sub btnAdd_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 324;BA.debugLine="StartActivity(\"AddProjectMd\")";
Debug.ShouldStop(8);
homemd.mostCurrent.__c.runVoidMethod ("StartActivity",homemd.processBA,(Object)((RemoteObject.createImmutable("AddProjectMd"))));
 BA.debugLineNum = 325;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clvhome_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("clvHome_ItemClick (homemd) ","homemd",1,homemd.mostCurrent.activityBA,homemd.mostCurrent,267);
if (RapidSub.canDelegate("clvhome_itemclick")) { return pdv.milotin.homemd.remoteMe.runUserSub(false, "homemd","clvhome_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 267;BA.debugLine="Sub clvHome_ItemClick (Index As Int, Value As Obje";
Debug.ShouldStop(1024);
 BA.debugLineNum = 269;BA.debugLine="kvs.Put(\"AuditTransactionHash\",Value)";
Debug.ShouldStop(4096);
homemd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("AuditTransactionHash")),(Object)(_value));
 BA.debugLineNum = 271;BA.debugLine="Log(kvs.Get(\"AuditTransactionHash\"))";
Debug.ShouldStop(16384);
homemd.mostCurrent.__c.runVoidMethod ("LogImpl","51245188",BA.ObjectToString(homemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("AuditTransactionHash")))),0);
 BA.debugLineNum = 272;BA.debugLine="StartActivity(\"SendFundMd\")";
Debug.ShouldStop(32768);
homemd.mostCurrent.__c.runVoidMethod ("StartActivity",homemd.processBA,(Object)((RemoteObject.createImmutable("SendFundMd"))));
 BA.debugLineNum = 274;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("CreateListItem (homemd) ","homemd",1,homemd.mostCurrent.activityBA,homemd.mostCurrent,221);
if (RapidSub.canDelegate("createlistitem")) { return pdv.milotin.homemd.remoteMe.runUserSub(false, "homemd","createlistitem", _strid, _strproject, _strfund, _strprogress, _strprojectwallet, _strstatus, _width, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("strID", _strid);
Debug.locals.put("strProject", _strproject);
Debug.locals.put("strFund", _strfund);
Debug.locals.put("StrProgress", _strprogress);
Debug.locals.put("strProjectWallet", _strprojectwallet);
Debug.locals.put("strStatus", _strstatus);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 221;BA.debugLine="Sub CreateListItem(strID As String, strProject As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 223;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(1073741824);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 224;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
_p.runVoidMethod ("Initialize",homemd.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 226;BA.debugLine="Activity.AddView(p, 0, 0, 96%x, 100%y)";
Debug.ShouldStop(2);
homemd.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(homemd.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 96)),homemd.mostCurrent.activityBA)),(Object)(homemd.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),homemd.mostCurrent.activityBA)));
 BA.debugLineNum = 227;BA.debugLine="p.LoadLayout(\"ListViewLy1\")";
Debug.ShouldStop(4);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ListViewLy1")),homemd.mostCurrent.activityBA);
 BA.debugLineNum = 228;BA.debugLine="p.RemoveView";
Debug.ShouldStop(8);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 230;BA.debugLine="lblProjectTitle2.Text = strProject";
Debug.ShouldStop(32);
homemd.mostCurrent._lblprojecttitle2.runMethod(true,"setText",BA.ObjectToCharSequence(_strproject));
 BA.debugLineNum = 231;BA.debugLine="lblProjectFund2.Text = \"RM \" & NumberFormat2(str";
Debug.ShouldStop(64);
homemd.mostCurrent._lblprojectfund2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("RM "),homemd.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _strfund)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(homemd.mostCurrent.__c.getField(true,"True"))))));
 BA.debugLineNum = 232;BA.debugLine="Log(StrProgress)";
Debug.ShouldStop(128);
homemd.mostCurrent.__c.runVoidMethod ("LogImpl","51179659",_strprogress,0);
 BA.debugLineNum = 233;BA.debugLine="If StrProgress = Null Or StrProgress = \"null\" The";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("n",_strprogress) || RemoteObject.solveBoolean("=",_strprogress,BA.ObjectToString("null"))) { 
 BA.debugLineNum = 234;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(1, 30";
Debug.ShouldStop(512);
homemd.mostCurrent._lblprojectprogress2.runMethod(true,"setTextColor",homemd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 302)),(Object)(BA.numberCast(int.class, 36))));
 BA.debugLineNum = 235;BA.debugLine="lblProjectProgress2.Text = \"Fundraising Complete";
Debug.ShouldStop(1024);
homemd.mostCurrent._lblprojectprogress2.runMethod(true,"setText",BA.ObjectToCharSequence("Fundraising Completed"));
 }else 
{ BA.debugLineNum = 236;BA.debugLine="Else If StrProgress <> \"100\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("!",_strprogress,BA.ObjectToString("100"))) { 
 BA.debugLineNum = 237;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(254,";
Debug.ShouldStop(4096);
homemd.mostCurrent._lblprojectprogress2.runMethod(true,"setTextColor",homemd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 254)),(Object)(BA.numberCast(int.class, 171)),(Object)(BA.numberCast(int.class, 43))));
 BA.debugLineNum = 238;BA.debugLine="lblProjectProgress2.Text = \"Fundraising in progr";
Debug.ShouldStop(8192);
homemd.mostCurrent._lblprojectprogress2.runMethod(true,"setText",BA.ObjectToCharSequence("Fundraising in progress"));
 }else {
 BA.debugLineNum = 240;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(1, 30";
Debug.ShouldStop(32768);
homemd.mostCurrent._lblprojectprogress2.runMethod(true,"setTextColor",homemd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 302)),(Object)(BA.numberCast(int.class, 36))));
 BA.debugLineNum = 241;BA.debugLine="lblProjectProgress2.Text = \"Fundraising Complete";
Debug.ShouldStop(65536);
homemd.mostCurrent._lblprojectprogress2.runMethod(true,"setText",BA.ObjectToCharSequence("Fundraising Completed"));
 }}
;
 BA.debugLineNum = 256;BA.debugLine="If StrProgress = Null Or StrProgress = \"null\" The";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("n",_strprogress) || RemoteObject.solveBoolean("=",_strprogress,BA.ObjectToString("null"))) { 
 BA.debugLineNum = 257;BA.debugLine="StrProgress = \"30\"";
Debug.ShouldStop(1);
_strprogress = BA.ObjectToString("30");Debug.locals.put("StrProgress", _strprogress);
 BA.debugLineNum = 258;BA.debugLine="cpBar1.Value = StrProgress";
Debug.ShouldStop(2);
homemd.mostCurrent._cpbar1.runClassMethod (pdv.milotin.circularprogressbar.class, "_setvalue" /*RemoteObject*/ ,BA.numberCast(float.class, _strprogress));
 }else {
 BA.debugLineNum = 260;BA.debugLine="cpBar1.Value = StrProgress";
Debug.ShouldStop(8);
homemd.mostCurrent._cpbar1.runClassMethod (pdv.milotin.circularprogressbar.class, "_setvalue" /*RemoteObject*/ ,BA.numberCast(float.class, _strprogress));
 };
 BA.debugLineNum = 262;BA.debugLine="cpBar1.Value = StrProgress";
Debug.ShouldStop(32);
homemd.mostCurrent._cpbar1.runClassMethod (pdv.milotin.circularprogressbar.class, "_setvalue" /*RemoteObject*/ ,BA.numberCast(float.class, _strprogress));
 BA.debugLineNum = 263;BA.debugLine="Return p";
Debug.ShouldStop(64);
if (true) return _p;
 BA.debugLineNum = 265;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("GetAudit (homemd) ","homemd",1,homemd.mostCurrent.activityBA,homemd.mostCurrent,133);
if (RapidSub.canDelegate("getaudit")) { return pdv.milotin.homemd.remoteMe.runUserSub(false, "homemd","getaudit");}
RemoteObject _jobgetaudit = RemoteObject.declareNull("pdv.milotin.httpjob");
RemoteObject _url = RemoteObject.createImmutable("");
 BA.debugLineNum = 133;BA.debugLine="Sub GetAudit";
Debug.ShouldStop(16);
 BA.debugLineNum = 135;BA.debugLine="Dim JobGetAudit As HttpJob";
Debug.ShouldStop(64);
_jobgetaudit = RemoteObject.createNew ("pdv.milotin.httpjob");Debug.locals.put("JobGetAudit", _jobgetaudit);
 BA.debugLineNum = 136;BA.debugLine="JobGetAudit.Initialize(\"JobGetAudit\", Me)";
Debug.ShouldStop(128);
_jobgetaudit.runClassMethod (pdv.milotin.httpjob.class, "_initialize" /*RemoteObject*/ ,homemd.processBA,(Object)(BA.ObjectToString("JobGetAudit")),(Object)(homemd.getObject()));
 BA.debugLineNum = 138;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
Debug.ShouldStop(512);
_url = BA.ObjectToString("https://service-testnet.maschain.com/api/audit/audit");Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 139;BA.debugLine="JobGetAudit.Download(url)";
Debug.ShouldStop(1024);
_jobgetaudit.runClassMethod (pdv.milotin.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 140;BA.debugLine="JobGetAudit.GetRequest.SetHeader(\"client_id\", kvs";
Debug.ShouldStop(2048);
_jobgetaudit.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_id")),(Object)(BA.ObjectToString(homemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_id"))))));
 BA.debugLineNum = 141;BA.debugLine="JobGetAudit.GetRequest.SetHeader(\"client_secret\",";
Debug.ShouldStop(4096);
_jobgetaudit.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_secret")),(Object)(BA.ObjectToString(homemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_secret"))))));
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettokenbalance() throws Exception{
try {
		Debug.PushSubsStack("GetTokenBalance (homemd) ","homemd",1,homemd.mostCurrent.activityBA,homemd.mostCurrent,90);
if (RapidSub.canDelegate("gettokenbalance")) { return pdv.milotin.homemd.remoteMe.runUserSub(false, "homemd","gettokenbalance");}
RemoteObject _jobgettokenbalance = RemoteObject.declareNull("pdv.milotin.httpjob");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
 BA.debugLineNum = 90;BA.debugLine="Sub GetTokenBalance";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="Dim JobGetTokenBalance As HttpJob";
Debug.ShouldStop(67108864);
_jobgettokenbalance = RemoteObject.createNew ("pdv.milotin.httpjob");Debug.locals.put("JobGetTokenBalance", _jobgettokenbalance);
 BA.debugLineNum = 92;BA.debugLine="JobGetTokenBalance.Initialize(\"JobGetTokenBalance";
Debug.ShouldStop(134217728);
_jobgettokenbalance.runClassMethod (pdv.milotin.httpjob.class, "_initialize" /*RemoteObject*/ ,homemd.processBA,(Object)(BA.ObjectToString("JobGetTokenBalance")),(Object)(homemd.getObject()));
 BA.debugLineNum = 95;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(1073741824);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 96;BA.debugLine="Dim data As Map";
Debug.ShouldStop(-2147483648);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("data", _data);
 BA.debugLineNum = 97;BA.debugLine="data.Initialize";
Debug.ShouldStop(1);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 98;BA.debugLine="data.Put(\"wallet_address\", kvs.Get(\"WalletAddress";
Debug.ShouldStop(2);
_data.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("wallet_address"))),(Object)(homemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("WalletAddress")))));
 BA.debugLineNum = 99;BA.debugLine="data.Put(\"contract_address\", kvs.Get(\"token-contr";
Debug.ShouldStop(4);
_data.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("contract_address"))),(Object)(homemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("token-contract")))));
 BA.debugLineNum = 100;BA.debugLine="json.Initialize(data)";
Debug.ShouldStop(8);
_json.runVoidMethod ("Initialize",(Object)(_data));
 BA.debugLineNum = 104;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
Debug.ShouldStop(128);
_url = BA.ObjectToString("https://service-testnet.maschain.com/api/token/balance/");Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 105;BA.debugLine="JobGetTokenBalance.PostString(url, json.ToString)";
Debug.ShouldStop(256);
_jobgettokenbalance.runClassMethod (pdv.milotin.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_url),(Object)(_json.runMethod(true,"ToString")));
 BA.debugLineNum = 106;BA.debugLine="JobGetTokenBalance.GetRequest.SetContentType(\"app";
Debug.ShouldStop(512);
_jobgettokenbalance.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 107;BA.debugLine="JobGetTokenBalance.GetRequest.SetHeader(\"client_i";
Debug.ShouldStop(1024);
_jobgettokenbalance.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_id")),(Object)(BA.ObjectToString(homemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_id"))))));
 BA.debugLineNum = 108;BA.debugLine="JobGetTokenBalance.GetRequest.SetHeader(\"client_s";
Debug.ShouldStop(2048);
_jobgettokenbalance.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_secret")),(Object)(BA.ObjectToString(homemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_secret"))))));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
 //BA.debugLineNum = 15;BA.debugLine="Private kvs As KeyValueStore";
homemd.mostCurrent._kvs = RemoteObject.createNew ("b4a.example3.keyvaluestore");
 //BA.debugLineNum = 16;BA.debugLine="Private rp As RuntimePermissions";
homemd.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 17;BA.debugLine="Private shared As String";
homemd.mostCurrent._shared = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Private SQL1 As SQL";
homemd.mostCurrent._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 19;BA.debugLine="Private lblHeaderBg As Label";
homemd.mostCurrent._lblheaderbg = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private lblTop As Label";
homemd.mostCurrent._lbltop = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private lblBottom As Label";
homemd.mostCurrent._lblbottom = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private lblFund As Label";
homemd.mostCurrent._lblfund = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblHistory As Label";
homemd.mostCurrent._lblhistory = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private lblUser As Label";
homemd.mostCurrent._lbluser = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private lblHeader1 As Label";
homemd.mostCurrent._lblheader1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private lblHeader2 As Label";
homemd.mostCurrent._lblheader2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private lblAmount As Label";
homemd.mostCurrent._lblamount = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private lblTotal As Label";
homemd.mostCurrent._lbltotal = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private lblProjectTitle2 As Label";
homemd.mostCurrent._lblprojecttitle2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private lblProjectFund2 As Label";
homemd.mostCurrent._lblprojectfund2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private lblProjectTitle As Label";
homemd.mostCurrent._lblprojecttitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private lblProjectFund As Label";
homemd.mostCurrent._lblprojectfund = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private lblProjectProgress As Label";
homemd.mostCurrent._lblprojectprogress = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private clvHome As CustomListView";
homemd.mostCurrent._clvhome = RemoteObject.createNew ("pdv.milotin.customlistview");
 //BA.debugLineNum = 41;BA.debugLine="Private pnHeader1 As Panel";
homemd.mostCurrent._pnheader1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private lblHome As Label";
homemd.mostCurrent._lblhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private lblLine1 As Label";
homemd.mostCurrent._lblline1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private lblHome2 As Label";
homemd.mostCurrent._lblhome2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private lblFund2 As Label";
homemd.mostCurrent._lblfund2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private lblHistory2 As Label";
homemd.mostCurrent._lblhistory2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private lblUser2 As Label";
homemd.mostCurrent._lbluser2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private cpBar1 As CircularProgressBar";
homemd.mostCurrent._cpbar1 = RemoteObject.createNew ("pdv.milotin.circularprogressbar");
 //BA.debugLineNum = 49;BA.debugLine="Private lblProjectProgress2 As Label";
homemd.mostCurrent._lblprojectprogress2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private lblWalletName As Label";
homemd.mostCurrent._lblwalletname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private imgMenu As ImageView";
homemd.mostCurrent._imgmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private imgProject As ImageView";
homemd.mostCurrent._imgproject = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private imgFunding As ImageView";
homemd.mostCurrent._imgfunding = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private imgProgress As ImageView";
homemd.mostCurrent._imgprogress = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private pnListView As Panel";
homemd.mostCurrent._pnlistview = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private btnAdd As Button";
homemd.mostCurrent._btnadd = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imgmenu_click() throws Exception{
try {
		Debug.PushSubsStack("imgMenu_Click (homemd) ","homemd",1,homemd.mostCurrent.activityBA,homemd.mostCurrent,319);
if (RapidSub.canDelegate("imgmenu_click")) { return pdv.milotin.homemd.remoteMe.runUserSub(false, "homemd","imgmenu_click");}
 BA.debugLineNum = 319;BA.debugLine="Private Sub imgMenu_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 321;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("JobDone (homemd) ","homemd",1,homemd.mostCurrent.activityBA,homemd.mostCurrent,146);
if (RapidSub.canDelegate("jobdone")) { return pdv.milotin.homemd.remoteMe.runUserSub(false, "homemd","jobdone", _job);}
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
 BA.debugLineNum = 146;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 148;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(524288);
homemd.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 150;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(2097152);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 152;BA.debugLine="Dim jsonString As String = Job.GetString";
Debug.ShouldStop(8388608);
_jsonstring = _job.runClassMethod (pdv.milotin.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("jsonString", _jsonstring);Debug.locals.put("jsonString", _jsonstring);
 BA.debugLineNum = 153;BA.debugLine="Log(jsonString)";
Debug.ShouldStop(16777216);
homemd.mostCurrent.__c.runVoidMethod ("LogImpl","51114119",_jsonstring,0);
 BA.debugLineNum = 155;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(67108864);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 156;BA.debugLine="parser.Initialize(jsonString)";
Debug.ShouldStop(134217728);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstring));
 BA.debugLineNum = 158;BA.debugLine="If Job.JobName = \"JobGetAudit\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobGetAudit"))) { 
 BA.debugLineNum = 159;BA.debugLine="clvHome.Clear";
Debug.ShouldStop(1073741824);
homemd.mostCurrent._clvhome.runClassMethod (pdv.milotin.customlistview.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 162;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(2);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 163;BA.debugLine="Dim results As List = root.Get(\"result\")";
Debug.ShouldStop(4);
_results = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_results = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("results", _results);Debug.locals.put("results", _results);
 BA.debugLineNum = 164;BA.debugLine="Dim numberOfItems As Int = results.Size";
Debug.ShouldStop(8);
_numberofitems = _results.runMethod(true,"getSize");Debug.locals.put("numberOfItems", _numberofitems);Debug.locals.put("numberOfItems", _numberofitems);
 BA.debugLineNum = 165;BA.debugLine="Log(\"Number of items in result: \" & numberOfIte";
Debug.ShouldStop(16);
homemd.mostCurrent.__c.runVoidMethod ("LogImpl","51114131",RemoteObject.concat(RemoteObject.createImmutable("Number of items in result: "),_numberofitems),0);
 BA.debugLineNum = 166;BA.debugLine="Dim totalFund As Double = 0 ' Initialize total";
Debug.ShouldStop(32);
_totalfund = BA.numberCast(double.class, 0);Debug.locals.put("totalFund", _totalfund);Debug.locals.put("totalFund", _totalfund);
 BA.debugLineNum = 167;BA.debugLine="For Each result As Map In results";
Debug.ShouldStop(64);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group14 = _results;
final int groupLen14 = group14.runMethod(true,"getSize").<Integer>get()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_result = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group14.runMethod(false,"Get",index14));Debug.locals.put("result", _result);
Debug.locals.put("result", _result);
 BA.debugLineNum = 169;BA.debugLine="Dim metadataString As String = result.Get(\"met";
Debug.ShouldStop(256);
_metadatastring = BA.ObjectToString(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("metadata")))));Debug.locals.put("metadataString", _metadatastring);Debug.locals.put("metadataString", _metadatastring);
 BA.debugLineNum = 172;BA.debugLine="Dim metadataParser As JSONParser";
Debug.ShouldStop(2048);
_metadataparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("metadataParser", _metadataparser);
 BA.debugLineNum = 173;BA.debugLine="metadataParser.Initialize(metadataString)";
Debug.ShouldStop(4096);
_metadataparser.runVoidMethod ("Initialize",(Object)(_metadatastring));
 BA.debugLineNum = 174;BA.debugLine="Dim metadata As Map = metadataParser.NextObjec";
Debug.ShouldStop(8192);
_metadata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_metadata = _metadataparser.runMethod(false,"NextObject");Debug.locals.put("metadata", _metadata);Debug.locals.put("metadata", _metadata);
 BA.debugLineNum = 175;BA.debugLine="Dim fund As Double";
Debug.ShouldStop(16384);
_fund = RemoteObject.createImmutable(0);Debug.locals.put("fund", _fund);
 BA.debugLineNum = 176;BA.debugLine="fund = metadata.Get(\"fund\")";
Debug.ShouldStop(32768);
_fund = BA.numberCast(double.class, _metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fund")))));Debug.locals.put("fund", _fund);
 BA.debugLineNum = 177;BA.debugLine="totalFund = totalFund + fund";
Debug.ShouldStop(65536);
_totalfund = RemoteObject.solve(new RemoteObject[] {_totalfund,_fund}, "+",1, 0);Debug.locals.put("totalFund", _totalfund);
 BA.debugLineNum = 179;BA.debugLine="lblTotal.Text = root.Get(\"result\")";
Debug.ShouldStop(262144);
homemd.mostCurrent._lbltotal.runMethod(true,"setText",BA.ObjectToCharSequence(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result"))))));
 BA.debugLineNum = 180;BA.debugLine="lblAmount.Text = \"RM \" & NumberFormat2(totalFu";
Debug.ShouldStop(524288);
homemd.mostCurrent._lblamount.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("RM "),homemd.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(_totalfund),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(homemd.mostCurrent.__c.getField(true,"True"))))));
 BA.debugLineNum = 181;BA.debugLine="Log(totalFund)";
Debug.ShouldStop(1048576);
homemd.mostCurrent.__c.runVoidMethod ("LogImpl","51114147",BA.NumberToString(_totalfund),0);
 BA.debugLineNum = 183;BA.debugLine="clvHome.Add(CreateListItem(result.Get(\"id\"),me";
Debug.ShouldStop(4194304);
homemd.mostCurrent._clvhome.runClassMethod (pdv.milotin.customlistview.class, "_add" /*RemoteObject*/ ,(Object)(_createlistitem(BA.ObjectToString(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("project"))))),BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fund"))))),BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("progress"))))),BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("project_wallet"))))),BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status"))))),homemd.mostCurrent._clvhome.runClassMethod (pdv.milotin.customlistview.class, "_asview" /*RemoteObject*/ ).runMethod(true,"getWidth"),homemd.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55))))),(Object)(homemd.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))),(Object)(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("transactionHash"))))));
 BA.debugLineNum = 184;BA.debugLine="Log(\"transactionhash:\" & result.Get(\"transacti";
Debug.ShouldStop(8388608);
homemd.mostCurrent.__c.runVoidMethod ("LogImpl","51114150",RemoteObject.concat(RemoteObject.createImmutable("transactionhash:"),_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("transactionHash"))))),0);
 BA.debugLineNum = 185;BA.debugLine="Dim gd As GradientDrawable";
Debug.ShouldStop(16777216);
_gd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gd", _gd);
 BA.debugLineNum = 186;BA.debugLine="gd.Initialize(\"TR_BL\", Array As Int(Colors.ARG";
Debug.ShouldStop(33554432);
_gd.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TR_BL")),(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {homemd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))),homemd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))})));
 BA.debugLineNum = 187;BA.debugLine="gd.CornerRadius = 20dip ' Adjust corner radius";
Debug.ShouldStop(67108864);
_gd.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, homemd.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 189;BA.debugLine="clvHome.AsView.Background = gd";
Debug.ShouldStop(268435456);
homemd.mostCurrent._clvhome.runClassMethod (pdv.milotin.customlistview.class, "_asview" /*RemoteObject*/ ).runMethod(false,"setBackground",(_gd.getObject()));
 }
}Debug.locals.put("result", _result);
;
 BA.debugLineNum = 193;BA.debugLine="lblTotal.Text = numberOfItems";
Debug.ShouldStop(1);
homemd.mostCurrent._lbltotal.runMethod(true,"setText",BA.ObjectToCharSequence(_numberofitems));
 BA.debugLineNum = 195;BA.debugLine="GetTokenBalance";
Debug.ShouldStop(4);
_gettokenbalance();
 }else 
{ BA.debugLineNum = 197;BA.debugLine="Else If Job.JobName = \"JobGetTokenBalance\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobGetTokenBalance"))) { 
 BA.debugLineNum = 198;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(32);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 199;BA.debugLine="Dim strAmount As String = root.Get(\"result\")";
Debug.ShouldStop(64);
_stramount = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("strAmount", _stramount);Debug.locals.put("strAmount", _stramount);
 BA.debugLineNum = 202;BA.debugLine="Dim amount As Double";
Debug.ShouldStop(512);
_amount = RemoteObject.createImmutable(0);Debug.locals.put("amount", _amount);
 BA.debugLineNum = 203;BA.debugLine="amount = strAmount";
Debug.ShouldStop(1024);
_amount = BA.numberCast(double.class, _stramount);Debug.locals.put("amount", _amount);
 }else {
 BA.debugLineNum = 208;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(32768);
homemd.mostCurrent.__c.runVoidMethod ("LogImpl","51114174",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 }}
;
 }else {
 BA.debugLineNum = 213;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(1048576);
homemd.mostCurrent.__c.runVoidMethod ("LogImpl","51114179",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 };
 BA.debugLineNum = 217;BA.debugLine="Job.Release";
Debug.ShouldStop(16777216);
_job.runClassMethod (pdv.milotin.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("lblFund_Click (homemd) ","homemd",1,homemd.mostCurrent.activityBA,homemd.mostCurrent,306);
if (RapidSub.canDelegate("lblfund_click")) { return pdv.milotin.homemd.remoteMe.runUserSub(false, "homemd","lblfund_click");}
 BA.debugLineNum = 306;BA.debugLine="Private Sub lblFund_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 307;BA.debugLine="StartActivity(\"FundMd\")";
Debug.ShouldStop(262144);
homemd.mostCurrent.__c.runVoidMethod ("StartActivity",homemd.processBA,(Object)((RemoteObject.createImmutable("FundMd"))));
 BA.debugLineNum = 308;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("lblHistory_Click (homemd) ","homemd",1,homemd.mostCurrent.activityBA,homemd.mostCurrent,310);
if (RapidSub.canDelegate("lblhistory_click")) { return pdv.milotin.homemd.remoteMe.runUserSub(false, "homemd","lblhistory_click");}
 BA.debugLineNum = 310;BA.debugLine="Private Sub lblHistory_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 311;BA.debugLine="StartActivity(\"HistoryMd\")";
Debug.ShouldStop(4194304);
homemd.mostCurrent.__c.runVoidMethod ("StartActivity",homemd.processBA,(Object)((RemoteObject.createImmutable("HistoryMd"))));
 BA.debugLineNum = 312;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("lblUser_Click (homemd) ","homemd",1,homemd.mostCurrent.activityBA,homemd.mostCurrent,314);
if (RapidSub.canDelegate("lbluser_click")) { return pdv.milotin.homemd.remoteMe.runUserSub(false, "homemd","lbluser_click");}
 BA.debugLineNum = 314;BA.debugLine="Private Sub lblUser_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 315;BA.debugLine="StartActivity(\"UserMd\")";
Debug.ShouldStop(67108864);
homemd.mostCurrent.__c.runVoidMethod ("StartActivity",homemd.processBA,(Object)((RemoteObject.createImmutable("UserMd"))));
 BA.debugLineNum = 317;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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