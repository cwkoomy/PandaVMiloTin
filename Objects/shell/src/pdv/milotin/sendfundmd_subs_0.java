package pdv.milotin;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class sendfundmd_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (sendfundmd) ","sendfundmd",2,sendfundmd.mostCurrent.activityBA,sendfundmd.mostCurrent,64);
if (RapidSub.canDelegate("activity_create")) { return pdv.milotin.sendfundmd.remoteMe.runUserSub(false, "sendfundmd","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 64;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 66;BA.debugLine="Activity.LoadLayout(\"SendFundLy\")";
Debug.ShouldStop(2);
sendfundmd.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("SendFundLy")),sendfundmd.mostCurrent.activityBA);
 BA.debugLineNum = 68;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
Debug.ShouldStop(8);
sendfundmd.mostCurrent._shared = sendfundmd.mostCurrent._rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 69;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
Debug.ShouldStop(16);
sendfundmd.mostCurrent._kvs.runVoidMethod ("_initialize",sendfundmd.processBA,(Object)(sendfundmd.mostCurrent._shared),(Object)(RemoteObject.createImmutable("Userdatastore")));
 BA.debugLineNum = 71;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",sendfundmd.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(sendfundmd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("db.db"))),sendfundmd.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 72;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
Debug.ShouldStop(128);
sendfundmd.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(sendfundmd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("db.db")),(Object)(sendfundmd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("db.db")));
 };
 BA.debugLineNum = 75;BA.debugLine="If SQL1.IsInitialized = False Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",sendfundmd.mostCurrent._sql1.runMethod(true,"IsInitialized"),sendfundmd.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 76;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
Debug.ShouldStop(2048);
sendfundmd.mostCurrent._sql1.runVoidMethod ("Initialize",(Object)(sendfundmd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("db.db")),(Object)(sendfundmd.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 79;BA.debugLine="Log(kvs.Get(\"AuditID\"))";
Debug.ShouldStop(16384);
sendfundmd.mostCurrent.__c.runVoidMethod ("LogImpl","41835023",BA.ObjectToString(sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("AuditID")))),0);
 BA.debugLineNum = 80;BA.debugLine="GetAuditByID";
Debug.ShouldStop(32768);
_getauditbyid();
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_KeyPress (sendfundmd) ","sendfundmd",2,sendfundmd.mostCurrent.activityBA,sendfundmd.mostCurrent,281);
if (RapidSub.canDelegate("activity_keypress")) { return pdv.milotin.sendfundmd.remoteMe.runUserSub(false, "sendfundmd","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 281;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 283;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, sendfundmd.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 284;BA.debugLine="kvs.Put(\"ProjectWallet\",\"\")";
Debug.ShouldStop(134217728);
sendfundmd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("ProjectWallet")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 285;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
sendfundmd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 286;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) return sendfundmd.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 290;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Activity_Pause (sendfundmd) ","sendfundmd",2,sendfundmd.mostCurrent.activityBA,sendfundmd.mostCurrent,252);
if (RapidSub.canDelegate("activity_pause")) { return pdv.milotin.sendfundmd.remoteMe.runUserSub(false, "sendfundmd","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 252;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Resume (sendfundmd) ","sendfundmd",2,sendfundmd.mostCurrent.activityBA,sendfundmd.mostCurrent,248);
if (RapidSub.canDelegate("activity_resume")) { return pdv.milotin.sendfundmd.remoteMe.runUserSub(false, "sendfundmd","activity_resume");}
 BA.debugLineNum = 248;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclose_click() throws Exception{
try {
		Debug.PushSubsStack("btnClose_Click (sendfundmd) ","sendfundmd",2,sendfundmd.mostCurrent.activityBA,sendfundmd.mostCurrent,320);
if (RapidSub.canDelegate("btnclose_click")) { return pdv.milotin.sendfundmd.remoteMe.runUserSub(false, "sendfundmd","btnclose_click");}
 BA.debugLineNum = 320;BA.debugLine="Private Sub btnClose_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 322;BA.debugLine="If kvs.Get(\"Status\") = \"success\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("Status"))),RemoteObject.createImmutable(("success")))) { 
 BA.debugLineNum = 323;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4);
sendfundmd.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 325;BA.debugLine="pnStatus.Visible = False";
Debug.ShouldStop(16);
sendfundmd.mostCurrent._pnstatus.runMethod(true,"setVisible",sendfundmd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 326;BA.debugLine="pnConfirmation.Visible = False";
Debug.ShouldStop(32);
sendfundmd.mostCurrent._pnconfirmation.runMethod(true,"setVisible",sendfundmd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 327;BA.debugLine="btnNext.Visible = True";
Debug.ShouldStop(64);
sendfundmd.mostCurrent._btnnext.runMethod(true,"setVisible",sendfundmd.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 329;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnnext_click() throws Exception{
try {
		Debug.PushSubsStack("btnNext_Click (sendfundmd) ","sendfundmd",2,sendfundmd.mostCurrent.activityBA,sendfundmd.mostCurrent,292);
if (RapidSub.canDelegate("btnnext_click")) { return pdv.milotin.sendfundmd.remoteMe.runUserSub(false, "sendfundmd","btnnext_click");}
 BA.debugLineNum = 292;BA.debugLine="Private Sub btnNext_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 293;BA.debugLine="pnBlackTransparent.Visible = True";
Debug.ShouldStop(16);
sendfundmd.mostCurrent._pnblacktransparent.runMethod(true,"setVisible",sendfundmd.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 294;BA.debugLine="pnConfirmation.Visible = True";
Debug.ShouldStop(32);
sendfundmd.mostCurrent._pnconfirmation.runMethod(true,"setVisible",sendfundmd.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 295;BA.debugLine="btnNext.Visible = False";
Debug.ShouldStop(64);
sendfundmd.mostCurrent._btnnext.runMethod(true,"setVisible",sendfundmd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 296;BA.debugLine="lblDonateAmount.Text = txtDonateAmount.Text";
Debug.ShouldStop(128);
sendfundmd.mostCurrent._lbldonateamount.runMethod(true,"setText",BA.ObjectToCharSequence(sendfundmd.mostCurrent._txtdonateamount.runMethod(true,"getText")));
 BA.debugLineNum = 298;BA.debugLine="kvs.Put(\"DonateAmount\",lblDonateAmount.Text)";
Debug.ShouldStop(512);
sendfundmd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("DonateAmount")),(Object)((sendfundmd.mostCurrent._lbldonateamount.runMethod(true,"getText"))));
 BA.debugLineNum = 299;BA.debugLine="Log(kvs.Get(\"DonateAmount\"))";
Debug.ShouldStop(1024);
sendfundmd.mostCurrent.__c.runVoidMethod ("LogImpl","42686983",BA.ObjectToString(sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("DonateAmount")))),0);
 BA.debugLineNum = 300;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsend_click() throws Exception{
try {
		Debug.PushSubsStack("btnSend_Click (sendfundmd) ","sendfundmd",2,sendfundmd.mostCurrent.activityBA,sendfundmd.mostCurrent,304);
if (RapidSub.canDelegate("btnsend_click")) { return pdv.milotin.sendfundmd.remoteMe.runUserSub(false, "sendfundmd","btnsend_click");}
 BA.debugLineNum = 304;BA.debugLine="Private Sub btnSend_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 305;BA.debugLine="PostTransaction";
Debug.ShouldStop(65536);
_posttransaction();
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calculatepercentage(RemoteObject _part,RemoteObject _total) throws Exception{
try {
		Debug.PushSubsStack("CalculatePercentage (sendfundmd) ","sendfundmd",2,sendfundmd.mostCurrent.activityBA,sendfundmd.mostCurrent,331);
if (RapidSub.canDelegate("calculatepercentage")) { return pdv.milotin.sendfundmd.remoteMe.runUserSub(false, "sendfundmd","calculatepercentage", _part, _total);}
RemoteObject _percentage = RemoteObject.createImmutable(0);
Debug.locals.put("part", _part);
Debug.locals.put("total", _total);
 BA.debugLineNum = 331;BA.debugLine="Sub CalculatePercentage(part As Double, total As D";
Debug.ShouldStop(1024);
 BA.debugLineNum = 332;BA.debugLine="Dim percentage As Double";
Debug.ShouldStop(2048);
_percentage = RemoteObject.createImmutable(0);Debug.locals.put("percentage", _percentage);
 BA.debugLineNum = 333;BA.debugLine="percentage = (part / total) * 100";
Debug.ShouldStop(4096);
_percentage = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_part,_total}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0);Debug.locals.put("percentage", _percentage);
 BA.debugLineNum = 334;BA.debugLine="If percentage > 100 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_percentage,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 335;BA.debugLine="cpBar2.Value = \"100\"";
Debug.ShouldStop(16384);
sendfundmd.mostCurrent._cpbar2.runClassMethod (pdv.milotin.circularprogressbar.class, "_setvalue" /*RemoteObject*/ ,BA.numberCast(float.class, "100"));
 BA.debugLineNum = 336;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(5,206";
Debug.ShouldStop(32768);
sendfundmd.mostCurrent._lblprojectprogress2.runMethod(true,"setTextColor",sendfundmd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 206)),(Object)(BA.numberCast(int.class, 46))));
 BA.debugLineNum = 337;BA.debugLine="lblProjectProgress2.Text = \"Fundraising complete";
Debug.ShouldStop(65536);
sendfundmd.mostCurrent._lblprojectprogress2.runMethod(true,"setText",BA.ObjectToCharSequence("Fundraising complete"));
 BA.debugLineNum = 338;BA.debugLine="txtDonateAmount.Enabled = False";
Debug.ShouldStop(131072);
sendfundmd.mostCurrent._txtdonateamount.runMethod(true,"setEnabled",sendfundmd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 339;BA.debugLine="txtDonateAmount.Text = \"-\"";
Debug.ShouldStop(262144);
sendfundmd.mostCurrent._txtdonateamount.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("-"));
 }else {
 BA.debugLineNum = 341;BA.debugLine="cpBar2.Value = NumberFormat(percentage, 1, 3)";
Debug.ShouldStop(1048576);
sendfundmd.mostCurrent._cpbar2.runClassMethod (pdv.milotin.circularprogressbar.class, "_setvalue" /*RemoteObject*/ ,BA.numberCast(float.class, sendfundmd.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_percentage),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 342;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(254,17";
Debug.ShouldStop(2097152);
sendfundmd.mostCurrent._lblprojectprogress2.runMethod(true,"setTextColor",sendfundmd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 254)),(Object)(BA.numberCast(int.class, 171)),(Object)(BA.numberCast(int.class, 43))));
 BA.debugLineNum = 343;BA.debugLine="lblProjectProgress2.Text = \"Fundraising in progre";
Debug.ShouldStop(4194304);
sendfundmd.mostCurrent._lblprojectprogress2.runMethod(true,"setText",BA.ObjectToCharSequence("Fundraising in progress"));
 };
 BA.debugLineNum = 346;BA.debugLine="Log(NumberFormat(percentage, 1, 3))";
Debug.ShouldStop(33554432);
sendfundmd.mostCurrent.__c.runVoidMethod ("LogImpl","43014671",sendfundmd.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_percentage),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),0);
 BA.debugLineNum = 347;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkwalletbalance() throws Exception{
try {
		Debug.PushSubsStack("CheckWalletBalance (sendfundmd) ","sendfundmd",2,sendfundmd.mostCurrent.activityBA,sendfundmd.mostCurrent,98);
if (RapidSub.canDelegate("checkwalletbalance")) { return pdv.milotin.sendfundmd.remoteMe.runUserSub(false, "sendfundmd","checkwalletbalance");}
RemoteObject _jobcheckwalletbalance = RemoteObject.declareNull("pdv.milotin.httpjob");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
 BA.debugLineNum = 98;BA.debugLine="Sub CheckWalletBalance";
Debug.ShouldStop(2);
 BA.debugLineNum = 100;BA.debugLine="Dim JobCheckWalletBalance As HttpJob";
Debug.ShouldStop(8);
_jobcheckwalletbalance = RemoteObject.createNew ("pdv.milotin.httpjob");Debug.locals.put("JobCheckWalletBalance", _jobcheckwalletbalance);
 BA.debugLineNum = 101;BA.debugLine="JobCheckWalletBalance.Initialize(\"JobCheckWalletB";
Debug.ShouldStop(16);
_jobcheckwalletbalance.runClassMethod (pdv.milotin.httpjob.class, "_initialize" /*RemoteObject*/ ,sendfundmd.processBA,(Object)(BA.ObjectToString("JobCheckWalletBalance")),(Object)(sendfundmd.getObject()));
 BA.debugLineNum = 104;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(128);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 105;BA.debugLine="Dim data As Map";
Debug.ShouldStop(256);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("data", _data);
 BA.debugLineNum = 106;BA.debugLine="data.Initialize";
Debug.ShouldStop(512);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 107;BA.debugLine="data.Put(\"wallet_address\", kvs.Get(\"ProjectWallet";
Debug.ShouldStop(1024);
_data.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("wallet_address"))),(Object)(sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("ProjectWallet")))));
 BA.debugLineNum = 108;BA.debugLine="data.Put(\"contract_address\", kvs.Get(\"token-contr";
Debug.ShouldStop(2048);
_data.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("contract_address"))),(Object)(sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("token-contract")))));
 BA.debugLineNum = 109;BA.debugLine="json.Initialize(data)";
Debug.ShouldStop(4096);
_json.runVoidMethod ("Initialize",(Object)(_data));
 BA.debugLineNum = 112;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
Debug.ShouldStop(32768);
_url = BA.ObjectToString("https://service-testnet.maschain.com/api/token/balance/");Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 113;BA.debugLine="JobCheckWalletBalance.PostString(url, json.ToStri";
Debug.ShouldStop(65536);
_jobcheckwalletbalance.runClassMethod (pdv.milotin.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_url),(Object)(_json.runMethod(true,"ToString")));
 BA.debugLineNum = 114;BA.debugLine="JobCheckWalletBalance.GetRequest.SetContentType(\"";
Debug.ShouldStop(131072);
_jobcheckwalletbalance.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 115;BA.debugLine="JobCheckWalletBalance.GetRequest.SetHeader(\"clien";
Debug.ShouldStop(262144);
_jobcheckwalletbalance.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_id")),(Object)(BA.ObjectToString(sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_id"))))));
 BA.debugLineNum = 116;BA.debugLine="JobCheckWalletBalance.GetRequest.SetHeader(\"clien";
Debug.ShouldStop(524288);
_jobcheckwalletbalance.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_secret")),(Object)(BA.ObjectToString(sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_secret"))))));
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getauditbyid() throws Exception{
try {
		Debug.PushSubsStack("GetAuditByID (sendfundmd) ","sendfundmd",2,sendfundmd.mostCurrent.activityBA,sendfundmd.mostCurrent,84);
if (RapidSub.canDelegate("getauditbyid")) { return pdv.milotin.sendfundmd.remoteMe.runUserSub(false, "sendfundmd","getauditbyid");}
RemoteObject _jobgetauditbyid = RemoteObject.declareNull("pdv.milotin.httpjob");
RemoteObject _url = RemoteObject.createImmutable("");
 BA.debugLineNum = 84;BA.debugLine="Sub GetAuditByID";
Debug.ShouldStop(524288);
 BA.debugLineNum = 86;BA.debugLine="Dim JobGetAuditByID As HttpJob";
Debug.ShouldStop(2097152);
_jobgetauditbyid = RemoteObject.createNew ("pdv.milotin.httpjob");Debug.locals.put("JobGetAuditByID", _jobgetauditbyid);
 BA.debugLineNum = 87;BA.debugLine="JobGetAuditByID.Initialize(\"JobGetAuditByID\", Me)";
Debug.ShouldStop(4194304);
_jobgetauditbyid.runClassMethod (pdv.milotin.httpjob.class, "_initialize" /*RemoteObject*/ ,sendfundmd.processBA,(Object)(BA.ObjectToString("JobGetAuditByID")),(Object)(sendfundmd.getObject()));
 BA.debugLineNum = 89;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
Debug.ShouldStop(16777216);
_url = RemoteObject.concat(RemoteObject.createImmutable("https://service-testnet.maschain.com/api/audit/audit/"),sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("AuditTransactionHash"))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 90;BA.debugLine="Log(\"HASH:\" & kvs.Get(\"AuditTransactionHash\"))";
Debug.ShouldStop(33554432);
sendfundmd.mostCurrent.__c.runVoidMethod ("LogImpl","41900550",RemoteObject.concat(RemoteObject.createImmutable("HASH:"),sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("AuditTransactionHash")))),0);
 BA.debugLineNum = 91;BA.debugLine="JobGetAuditByID.Download(url)";
Debug.ShouldStop(67108864);
_jobgetauditbyid.runClassMethod (pdv.milotin.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 92;BA.debugLine="JobGetAuditByID.GetRequest.SetHeader(\"client_id\",";
Debug.ShouldStop(134217728);
_jobgetauditbyid.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_id")),(Object)(BA.ObjectToString(sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_id"))))));
 BA.debugLineNum = 93;BA.debugLine="JobGetAuditByID.GetRequest.SetHeader(\"client_secr";
Debug.ShouldStop(268435456);
_jobgetauditbyid.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_secret")),(Object)(BA.ObjectToString(sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_secret"))))));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
sendfundmd.mostCurrent._kvs = RemoteObject.createNew ("b4a.example3.keyvaluestore");
 //BA.debugLineNum = 16;BA.debugLine="Private rp As RuntimePermissions";
sendfundmd.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 17;BA.debugLine="Private shared As String";
sendfundmd.mostCurrent._shared = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Private SQL1 As SQL";
sendfundmd.mostCurrent._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 19;BA.debugLine="Private lblBottom As Label";
sendfundmd.mostCurrent._lblbottom = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private lblHome As Label";
sendfundmd.mostCurrent._lblhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private lblFund As Label";
sendfundmd.mostCurrent._lblfund = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private lblHistory As Label";
sendfundmd.mostCurrent._lblhistory = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private lblUser As Label";
sendfundmd.mostCurrent._lbluser = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private lblHome2 As Label";
sendfundmd.mostCurrent._lblhome2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblFund2 As Label";
sendfundmd.mostCurrent._lblfund2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private lblHistory2 As Label";
sendfundmd.mostCurrent._lblhistory2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private lblUser2 As Label";
sendfundmd.mostCurrent._lbluser2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private pnHeader1 As Panel";
sendfundmd.mostCurrent._pnheader1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private lblTop As Label";
sendfundmd.mostCurrent._lbltop = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private pnFrame1 As Panel";
sendfundmd.mostCurrent._pnframe1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private lblProjectTittle As Label";
sendfundmd.mostCurrent._lblprojecttittle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private cpBar2 As CircularProgressBar";
sendfundmd.mostCurrent._cpbar2 = RemoteObject.createNew ("pdv.milotin.circularprogressbar");
 //BA.debugLineNum = 33;BA.debugLine="Private lblProjectFund2 As Label";
sendfundmd.mostCurrent._lblprojectfund2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private lblProjectProgress2 As Label";
sendfundmd.mostCurrent._lblprojectprogress2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private lblLine1 As Label";
sendfundmd.mostCurrent._lblline1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private lblDonate As Label";
sendfundmd.mostCurrent._lbldonate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private pnDonateAmount As Panel";
sendfundmd.mostCurrent._pndonateamount = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private btnNext As Button";
sendfundmd.mostCurrent._btnnext = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private lblMethod As Label";
sendfundmd.mostCurrent._lblmethod = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private imgFpx As ImageView";
sendfundmd.mostCurrent._imgfpx = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private imgMaschain As ImageView";
sendfundmd.mostCurrent._imgmaschain = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private imgCredit As ImageView";
sendfundmd.mostCurrent._imgcredit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private imgBTC As ImageView";
sendfundmd.mostCurrent._imgbtc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private imgBack As ImageView";
sendfundmd.mostCurrent._imgback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private pnBlackTransparent As Panel";
sendfundmd.mostCurrent._pnblacktransparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private pnConfirmation As Panel";
sendfundmd.mostCurrent._pnconfirmation = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private lblTittle2 As Label";
sendfundmd.mostCurrent._lbltittle2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private lblLine2 As Label";
sendfundmd.mostCurrent._lblline2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private imgCurrency As ImageView";
sendfundmd.mostCurrent._imgcurrency = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private lblDonateAmount As Label";
sendfundmd.mostCurrent._lbldonateamount = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private btnSend As Button";
sendfundmd.mostCurrent._btnsend = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private txtDonateAmount As EditText";
sendfundmd.mostCurrent._txtdonateamount = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private imgDonate As ImageView";
sendfundmd.mostCurrent._imgdonate = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private imgClose As ImageView";
sendfundmd.mostCurrent._imgclose = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private lblTittle3 As Label";
sendfundmd.mostCurrent._lbltittle3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private pnStatus As Panel";
sendfundmd.mostCurrent._pnstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private imgClose2 As ImageView";
sendfundmd.mostCurrent._imgclose2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private imgStatus As ImageView";
sendfundmd.mostCurrent._imgstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private lblLine3 As Label";
sendfundmd.mostCurrent._lblline3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private lblStatus As Label";
sendfundmd.mostCurrent._lblstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private btnClose As Button";
sendfundmd.mostCurrent._btnclose = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imgback_click() throws Exception{
try {
		Debug.PushSubsStack("imgBack_Click (sendfundmd) ","sendfundmd",2,sendfundmd.mostCurrent.activityBA,sendfundmd.mostCurrent,276);
if (RapidSub.canDelegate("imgback_click")) { return pdv.milotin.sendfundmd.remoteMe.runUserSub(false, "sendfundmd","imgback_click");}
 BA.debugLineNum = 276;BA.debugLine="Private Sub imgBack_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 277;BA.debugLine="kvs.Put(\"ProjectWallet\",\"\")";
Debug.ShouldStop(1048576);
sendfundmd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("ProjectWallet")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 278;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2097152);
sendfundmd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 279;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgclose_click() throws Exception{
try {
		Debug.PushSubsStack("imgClose_Click (sendfundmd) ","sendfundmd",2,sendfundmd.mostCurrent.activityBA,sendfundmd.mostCurrent,308);
if (RapidSub.canDelegate("imgclose_click")) { return pdv.milotin.sendfundmd.remoteMe.runUserSub(false, "sendfundmd","imgclose_click");}
 BA.debugLineNum = 308;BA.debugLine="Private Sub imgClose_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 309;BA.debugLine="pnBlackTransparent.Visible = False";
Debug.ShouldStop(1048576);
sendfundmd.mostCurrent._pnblacktransparent.runMethod(true,"setVisible",sendfundmd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 310;BA.debugLine="pnConfirmation.Visible = False";
Debug.ShouldStop(2097152);
sendfundmd.mostCurrent._pnconfirmation.runMethod(true,"setVisible",sendfundmd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 311;BA.debugLine="btnNext.Visible = True";
Debug.ShouldStop(4194304);
sendfundmd.mostCurrent._btnnext.runMethod(true,"setVisible",sendfundmd.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 312;BA.debugLine="kvs.Put(\"DonateAmount\",\"\")";
Debug.ShouldStop(8388608);
sendfundmd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("DonateAmount")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 313;BA.debugLine="Log(\"Donate :\" & kvs.Get(\"DonateAmount\"))";
Debug.ShouldStop(16777216);
sendfundmd.mostCurrent.__c.runVoidMethod ("LogImpl","42818053",RemoteObject.concat(RemoteObject.createImmutable("Donate :"),sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("DonateAmount")))),0);
 BA.debugLineNum = 314;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgclose2_click() throws Exception{
try {
		Debug.PushSubsStack("imgClose2_Click (sendfundmd) ","sendfundmd",2,sendfundmd.mostCurrent.activityBA,sendfundmd.mostCurrent,316);
if (RapidSub.canDelegate("imgclose2_click")) { return pdv.milotin.sendfundmd.remoteMe.runUserSub(false, "sendfundmd","imgclose2_click");}
 BA.debugLineNum = 316;BA.debugLine="Private Sub imgClose2_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 317;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
sendfundmd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("JobDone (sendfundmd) ","sendfundmd",2,sendfundmd.mostCurrent.activityBA,sendfundmd.mostCurrent,142);
if (RapidSub.canDelegate("jobdone")) { return pdv.milotin.sendfundmd.remoteMe.runUserSub(false, "sendfundmd","jobdone", _job);}
RemoteObject _jsonstring = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _metadatastring = RemoteObject.createImmutable("");
RemoteObject _metadataparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _metadata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _strresult = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable(0);
Debug.locals.put("Job", _job);
 BA.debugLineNum = 142;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 144;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32768);
sendfundmd.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 146;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(131072);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 148;BA.debugLine="Dim jsonString As String = Job.GetString";
Debug.ShouldStop(524288);
_jsonstring = _job.runClassMethod (pdv.milotin.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("jsonString", _jsonstring);Debug.locals.put("jsonString", _jsonstring);
 BA.debugLineNum = 149;BA.debugLine="Log(jsonString)";
Debug.ShouldStop(1048576);
sendfundmd.mostCurrent.__c.runVoidMethod ("LogImpl","42097159",_jsonstring,0);
 BA.debugLineNum = 151;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(4194304);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 152;BA.debugLine="parser.Initialize(jsonString)";
Debug.ShouldStop(8388608);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstring));
 BA.debugLineNum = 154;BA.debugLine="If Job.JobName = \"JobGetAuditByID\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobGetAuditByID"))) { 
 BA.debugLineNum = 158;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(536870912);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 159;BA.debugLine="Dim result As Map = root.Get(\"result\")";
Debug.ShouldStop(1073741824);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_result = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 162;BA.debugLine="Dim metadataString As String = result.Get(\"meta";
Debug.ShouldStop(2);
_metadatastring = BA.ObjectToString(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("metadata")))));Debug.locals.put("metadataString", _metadatastring);Debug.locals.put("metadataString", _metadatastring);
 BA.debugLineNum = 165;BA.debugLine="Dim metadataParser As JSONParser";
Debug.ShouldStop(16);
_metadataparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("metadataParser", _metadataparser);
 BA.debugLineNum = 166;BA.debugLine="metadataParser.Initialize(metadataString)";
Debug.ShouldStop(32);
_metadataparser.runVoidMethod ("Initialize",(Object)(_metadatastring));
 BA.debugLineNum = 167;BA.debugLine="Dim metadata As Map = metadataParser.NextObject";
Debug.ShouldStop(64);
_metadata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_metadata = _metadataparser.runMethod(false,"NextObject");Debug.locals.put("metadata", _metadata);Debug.locals.put("metadata", _metadata);
 BA.debugLineNum = 171;BA.debugLine="lblProjectTittle.Text = metadata.Get(\"project\")";
Debug.ShouldStop(1024);
sendfundmd.mostCurrent._lblprojecttittle.runMethod(true,"setText",BA.ObjectToCharSequence(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("project"))))));
 BA.debugLineNum = 173;BA.debugLine="kvs.Put(\"metadataFund\",metadata.Get(\"fund\"))";
Debug.ShouldStop(4096);
sendfundmd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("metadataFund")),(Object)(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fund"))))));
 BA.debugLineNum = 175;BA.debugLine="metadata.Get(\"status\")";
Debug.ShouldStop(16384);
_metadata.runVoidMethod ("Get",(Object)((RemoteObject.createImmutable("status"))));
 BA.debugLineNum = 178;BA.debugLine="Log(metadata.Get(\"project\"))";
Debug.ShouldStop(131072);
sendfundmd.mostCurrent.__c.runVoidMethod ("LogImpl","42097188",BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("project"))))),0);
 BA.debugLineNum = 179;BA.debugLine="Log(metadata.Get(\"fund\"))";
Debug.ShouldStop(262144);
sendfundmd.mostCurrent.__c.runVoidMethod ("LogImpl","42097189",BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fund"))))),0);
 BA.debugLineNum = 180;BA.debugLine="Log(metadata.Get(\"progress\"))";
Debug.ShouldStop(524288);
sendfundmd.mostCurrent.__c.runVoidMethod ("LogImpl","42097190",BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("progress"))))),0);
 BA.debugLineNum = 181;BA.debugLine="Log(metadata.Get(\"status\"))";
Debug.ShouldStop(1048576);
sendfundmd.mostCurrent.__c.runVoidMethod ("LogImpl","42097191",BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status"))))),0);
 BA.debugLineNum = 182;BA.debugLine="Log(metadata.Get(\"project_wallet\"))";
Debug.ShouldStop(2097152);
sendfundmd.mostCurrent.__c.runVoidMethod ("LogImpl","42097192",BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("project_wallet"))))),0);
 BA.debugLineNum = 183;BA.debugLine="kvs.Put(\"ProjectWallet\",metadata.Get(\"project_w";
Debug.ShouldStop(4194304);
sendfundmd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("ProjectWallet")),(Object)(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("project_wallet"))))));
 BA.debugLineNum = 185;BA.debugLine="If kvs.Get(\"ProjectWallet\") = Null Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("n",sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("ProjectWallet"))))) { 
 BA.debugLineNum = 186;BA.debugLine="kvs.Put(\"ProjectWallet\",kvs.Get(\"WalletAddress";
Debug.ShouldStop(33554432);
sendfundmd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("ProjectWallet")),(Object)(sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("WalletAddress")))));
 BA.debugLineNum = 187;BA.debugLine="CheckWalletBalance";
Debug.ShouldStop(67108864);
_checkwalletbalance();
 }else {
 BA.debugLineNum = 189;BA.debugLine="CheckWalletBalance";
Debug.ShouldStop(268435456);
_checkwalletbalance();
 };
 }else 
{ BA.debugLineNum = 193;BA.debugLine="Else If Job.JobName = \"JobCheckWalletBalance\" Th";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobCheckWalletBalance"))) { 
 BA.debugLineNum = 195;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(4);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 196;BA.debugLine="Dim strResult As String = root.Get(\"result\")";
Debug.ShouldStop(8);
_strresult = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("strResult", _strresult);Debug.locals.put("strResult", _strresult);
 BA.debugLineNum = 198;BA.debugLine="CalculatePercentage(root.Get(\"result\"),kvs.Get(";
Debug.ShouldStop(32);
_calculatepercentage(BA.numberCast(double.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result"))))),BA.numberCast(double.class, sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("metadataFund")))));
 BA.debugLineNum = 200;BA.debugLine="If kvs.Get(\"metadataFund\") < root.Get(\"result\")";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("metadataFund")))),BA.numberCast(double.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result"))))))) { 
 BA.debugLineNum = 201;BA.debugLine="lblProjectFund2.Text = \"RM 0\" & NumberFormat2(";
Debug.ShouldStop(256);
sendfundmd.mostCurrent._lblprojectfund2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("RM 0"),sendfundmd.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(sendfundmd.mostCurrent.__c.getField(true,"True"))))));
 }else {
 BA.debugLineNum = 203;BA.debugLine="lblProjectFund2.Text = \"RM \" & NumberFormat2(k";
Debug.ShouldStop(1024);
sendfundmd.mostCurrent._lblprojectfund2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("RM "),sendfundmd.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("metadataFund")))),BA.numberCast(double.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))))}, "-",1, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(sendfundmd.mostCurrent.__c.getField(true,"True"))))));
 };
 BA.debugLineNum = 206;BA.debugLine="Log(lblProjectFund2.Text)";
Debug.ShouldStop(8192);
sendfundmd.mostCurrent.__c.runVoidMethod ("LogImpl","42097216",sendfundmd.mostCurrent._lblprojectfund2.runMethod(true,"getText"),0);
 }else 
{ BA.debugLineNum = 207;BA.debugLine="Else If Job.JobName = \"JobPostTransaction\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobPostTransaction"))) { 
 BA.debugLineNum = 209;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(65536);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 210;BA.debugLine="Dim status As Int = root.Get(\"status\")";
Debug.ShouldStop(131072);
_status = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 211;BA.debugLine="Log(root.Get(\"status\"))";
Debug.ShouldStop(262144);
sendfundmd.mostCurrent.__c.runVoidMethod ("LogImpl","42097221",BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status"))))),0);
 BA.debugLineNum = 213;BA.debugLine="pnStatus.Visible = True";
Debug.ShouldStop(1048576);
sendfundmd.mostCurrent._pnstatus.runMethod(true,"setVisible",sendfundmd.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 214;BA.debugLine="pnConfirmation.Visible = False";
Debug.ShouldStop(2097152);
sendfundmd.mostCurrent._pnconfirmation.runMethod(true,"setVisible",sendfundmd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 217;BA.debugLine="If status = \"200\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_status,BA.numberCast(double.class, "200"))) { 
 BA.debugLineNum = 219;BA.debugLine="ToastMessageShow(\"Transaction posted successfu";
Debug.ShouldStop(67108864);
sendfundmd.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Transaction posted successfully.")),(Object)(sendfundmd.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 220;BA.debugLine="lblStatus.Text = \"Transaction Completed!\" ' Di";
Debug.ShouldStop(134217728);
sendfundmd.mostCurrent._lblstatus.runMethod(true,"setText",BA.ObjectToCharSequence("Transaction Completed!"));
 BA.debugLineNum = 221;BA.debugLine="lblStatus.TextColor = Colors.RGB(5,206,46)";
Debug.ShouldStop(268435456);
sendfundmd.mostCurrent._lblstatus.runMethod(true,"setTextColor",sendfundmd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 206)),(Object)(BA.numberCast(int.class, 46))));
 BA.debugLineNum = 222;BA.debugLine="kvs.Put(\"Status\",\"success\")";
Debug.ShouldStop(536870912);
sendfundmd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("Status")),(Object)((RemoteObject.createImmutable("success"))));
 }else {
 BA.debugLineNum = 226;BA.debugLine="ToastMessageShow(\"Failed to post transaction.\"";
Debug.ShouldStop(2);
sendfundmd.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Failed to post transaction.")),(Object)(sendfundmd.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 227;BA.debugLine="lblStatus.Text = \"Transaction Failed!\" ' Displ";
Debug.ShouldStop(4);
sendfundmd.mostCurrent._lblstatus.runMethod(true,"setText",BA.ObjectToCharSequence("Transaction Failed!"));
 BA.debugLineNum = 228;BA.debugLine="lblStatus.TextColor = Colors.RGB(220,14,13)";
Debug.ShouldStop(8);
sendfundmd.mostCurrent._lblstatus.runMethod(true,"setTextColor",sendfundmd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 220)),(Object)(BA.numberCast(int.class, 14)),(Object)(BA.numberCast(int.class, 13))));
 BA.debugLineNum = 230;BA.debugLine="kvs.Put(\"Status\",\"failed\")";
Debug.ShouldStop(32);
sendfundmd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("Status")),(Object)((RemoteObject.createImmutable("failed"))));
 };
 }else {
 BA.debugLineNum = 235;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(1024);
sendfundmd.mostCurrent.__c.runVoidMethod ("LogImpl","42097245",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 }}}
;
 }else {
 BA.debugLineNum = 240;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(32768);
sendfundmd.mostCurrent.__c.runVoidMethod ("LogImpl","42097250",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 };
 BA.debugLineNum = 244;BA.debugLine="Job.Release";
Debug.ShouldStop(524288);
_job.runClassMethod (pdv.milotin.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 246;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("lblFund_Click (sendfundmd) ","sendfundmd",2,sendfundmd.mostCurrent.activityBA,sendfundmd.mostCurrent,261);
if (RapidSub.canDelegate("lblfund_click")) { return pdv.milotin.sendfundmd.remoteMe.runUserSub(false, "sendfundmd","lblfund_click");}
 BA.debugLineNum = 261;BA.debugLine="Private Sub lblFund_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 262;BA.debugLine="StartActivity(\"FundMd\")";
Debug.ShouldStop(32);
sendfundmd.mostCurrent.__c.runVoidMethod ("StartActivity",sendfundmd.processBA,(Object)((RemoteObject.createImmutable("FundMd"))));
 BA.debugLineNum = 263;BA.debugLine="Activity.Finish";
Debug.ShouldStop(64);
sendfundmd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 264;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("lblHistory_Click (sendfundmd) ","sendfundmd",2,sendfundmd.mostCurrent.activityBA,sendfundmd.mostCurrent,266);
if (RapidSub.canDelegate("lblhistory_click")) { return pdv.milotin.sendfundmd.remoteMe.runUserSub(false, "sendfundmd","lblhistory_click");}
 BA.debugLineNum = 266;BA.debugLine="Private Sub lblHistory_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 267;BA.debugLine="StartActivity(\"HistoryMd\")";
Debug.ShouldStop(1024);
sendfundmd.mostCurrent.__c.runVoidMethod ("StartActivity",sendfundmd.processBA,(Object)((RemoteObject.createImmutable("HistoryMd"))));
 BA.debugLineNum = 268;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
sendfundmd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("lblHome_Click (sendfundmd) ","sendfundmd",2,sendfundmd.mostCurrent.activityBA,sendfundmd.mostCurrent,257);
if (RapidSub.canDelegate("lblhome_click")) { return pdv.milotin.sendfundmd.remoteMe.runUserSub(false, "sendfundmd","lblhome_click");}
 BA.debugLineNum = 257;BA.debugLine="Private Sub lblHome_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 258;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2);
sendfundmd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 259;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("lblUser_Click (sendfundmd) ","sendfundmd",2,sendfundmd.mostCurrent.activityBA,sendfundmd.mostCurrent,271);
if (RapidSub.canDelegate("lbluser_click")) { return pdv.milotin.sendfundmd.remoteMe.runUserSub(false, "sendfundmd","lbluser_click");}
 BA.debugLineNum = 271;BA.debugLine="Private Sub lblUser_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 272;BA.debugLine="StartActivity(\"UserMd\")";
Debug.ShouldStop(32768);
sendfundmd.mostCurrent.__c.runVoidMethod ("StartActivity",sendfundmd.processBA,(Object)((RemoteObject.createImmutable("UserMd"))));
 BA.debugLineNum = 273;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
sendfundmd.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _posttransaction() throws Exception{
try {
		Debug.PushSubsStack("PostTransaction (sendfundmd) ","sendfundmd",2,sendfundmd.mostCurrent.activityBA,sendfundmd.mostCurrent,120);
if (RapidSub.canDelegate("posttransaction")) { return pdv.milotin.sendfundmd.remoteMe.runUserSub(false, "sendfundmd","posttransaction");}
RemoteObject _jobposttransaction = RemoteObject.declareNull("pdv.milotin.httpjob");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
 BA.debugLineNum = 120;BA.debugLine="Sub PostTransaction";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="Dim JobPostTransaction As HttpJob";
Debug.ShouldStop(16777216);
_jobposttransaction = RemoteObject.createNew ("pdv.milotin.httpjob");Debug.locals.put("JobPostTransaction", _jobposttransaction);
 BA.debugLineNum = 122;BA.debugLine="JobPostTransaction.Initialize(\"JobPostTransaction";
Debug.ShouldStop(33554432);
_jobposttransaction.runClassMethod (pdv.milotin.httpjob.class, "_initialize" /*RemoteObject*/ ,sendfundmd.processBA,(Object)(BA.ObjectToString("JobPostTransaction")),(Object)(sendfundmd.getObject()));
 BA.debugLineNum = 124;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
Debug.ShouldStop(134217728);
_url = BA.ObjectToString("https://service-testnet.maschain.com/api/token/token-transfer/");Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 125;BA.debugLine="Dim data As Map";
Debug.ShouldStop(268435456);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("data", _data);
 BA.debugLineNum = 126;BA.debugLine="data.Initialize";
Debug.ShouldStop(536870912);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 127;BA.debugLine="data.Put(\"wallet_address\", kvs.Get(\"WalletAddress";
Debug.ShouldStop(1073741824);
_data.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("wallet_address"))),(Object)(sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("WalletAddress")))));
 BA.debugLineNum = 128;BA.debugLine="data.Put(\"to\", kvs.Get(\"ProjectWallet\"))";
Debug.ShouldStop(-2147483648);
_data.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("to"))),(Object)(sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("ProjectWallet")))));
 BA.debugLineNum = 129;BA.debugLine="data.Put(\"amount\", kvs.Get(\"DonateAmount\"))";
Debug.ShouldStop(1);
_data.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("amount"))),(Object)(sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("DonateAmount")))));
 BA.debugLineNum = 130;BA.debugLine="data.Put(\"contract_address\", \"0x5BA886F619b95E2b2";
Debug.ShouldStop(2);
_data.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("contract_address"))),(Object)((RemoteObject.createImmutable("0x5BA886F619b95E2b2a875503e2FCE58c14027ade"))));
 BA.debugLineNum = 131;BA.debugLine="data.Put(\"callback_url\", \"https://\")";
Debug.ShouldStop(4);
_data.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("callback_url"))),(Object)((RemoteObject.createImmutable("https://"))));
 BA.debugLineNum = 133;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(16);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 134;BA.debugLine="json.Initialize(data)";
Debug.ShouldStop(32);
_json.runVoidMethod ("Initialize",(Object)(_data));
 BA.debugLineNum = 136;BA.debugLine="JobPostTransaction.PostString(url, json.ToString)";
Debug.ShouldStop(128);
_jobposttransaction.runClassMethod (pdv.milotin.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_url),(Object)(_json.runMethod(true,"ToString")));
 BA.debugLineNum = 137;BA.debugLine="JobPostTransaction.GetRequest.SetContentType(\"app";
Debug.ShouldStop(256);
_jobposttransaction.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 138;BA.debugLine="JobPostTransaction.GetRequest.SetHeader(\"client_i";
Debug.ShouldStop(512);
_jobposttransaction.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_id")),(Object)(BA.ObjectToString(sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_id"))))));
 BA.debugLineNum = 139;BA.debugLine="JobPostTransaction.GetRequest.SetHeader(\"client_s";
Debug.ShouldStop(1024);
_jobposttransaction.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_secret")),(Object)(BA.ObjectToString(sendfundmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_secret"))))));
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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