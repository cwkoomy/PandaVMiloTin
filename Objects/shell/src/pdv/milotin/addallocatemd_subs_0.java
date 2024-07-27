package pdv.milotin;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class addallocatemd_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (addallocatemd) ","addallocatemd",12,addallocatemd.mostCurrent.activityBA,addallocatemd.mostCurrent,78);
if (RapidSub.canDelegate("activity_create")) { return pdv.milotin.addallocatemd.remoteMe.runUserSub(false, "addallocatemd","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 78;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 80;BA.debugLine="Activity.LoadLayout(\"AddAllocateLy\")";
Debug.ShouldStop(32768);
addallocatemd.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("AddAllocateLy")),addallocatemd.mostCurrent.activityBA);
 BA.debugLineNum = 82;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
Debug.ShouldStop(131072);
addallocatemd.mostCurrent._shared = addallocatemd.mostCurrent._rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 83;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
Debug.ShouldStop(262144);
addallocatemd.mostCurrent._kvs.runVoidMethod ("_initialize",addallocatemd.processBA,(Object)(addallocatemd.mostCurrent._shared),(Object)(RemoteObject.createImmutable("Userdatastore")));
 BA.debugLineNum = 85;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",addallocatemd.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(addallocatemd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("db.db"))),addallocatemd.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 86;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
Debug.ShouldStop(2097152);
addallocatemd.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(addallocatemd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("db.db")),(Object)(addallocatemd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("db.db")));
 };
 BA.debugLineNum = 89;BA.debugLine="If SQL1.IsInitialized = False Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",addallocatemd.mostCurrent._sql1.runMethod(true,"IsInitialized"),addallocatemd.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 90;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
Debug.ShouldStop(33554432);
addallocatemd.mostCurrent._sql1.runVoidMethod ("Initialize",(Object)(addallocatemd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("db.db")),(Object)(addallocatemd.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 94;BA.debugLine="GetAuditByID";
Debug.ShouldStop(536870912);
_getauditbyid();
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
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (addallocatemd) ","addallocatemd",12,addallocatemd.mostCurrent.activityBA,addallocatemd.mostCurrent,293);
if (RapidSub.canDelegate("activity_keypress")) { return pdv.milotin.addallocatemd.remoteMe.runUserSub(false, "addallocatemd","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 293;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(16);
 BA.debugLineNum = 295;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, addallocatemd.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 296;BA.debugLine="kvs.Put(\"ProjectWallet\",\"\")";
Debug.ShouldStop(128);
addallocatemd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("ProjectWallet")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 297;BA.debugLine="kvs.Put(\"ProjectTitle\",\"\")";
Debug.ShouldStop(256);
addallocatemd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("ProjectTitle")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 298;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
addallocatemd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 299;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) return addallocatemd.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 303;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_Pause (addallocatemd) ","addallocatemd",12,addallocatemd.mostCurrent.activityBA,addallocatemd.mostCurrent,262);
if (RapidSub.canDelegate("activity_pause")) { return pdv.milotin.addallocatemd.remoteMe.runUserSub(false, "addallocatemd","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 262;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (addallocatemd) ","addallocatemd",12,addallocatemd.mostCurrent.activityBA,addallocatemd.mostCurrent,258);
if (RapidSub.canDelegate("activity_resume")) { return pdv.milotin.addallocatemd.remoteMe.runUserSub(false, "addallocatemd","activity_resume");}
 BA.debugLineNum = 258;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
 BA.debugLineNum = 260;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("btnClose_Click (addallocatemd) ","addallocatemd",12,addallocatemd.mostCurrent.activityBA,addallocatemd.mostCurrent,335);
if (RapidSub.canDelegate("btnclose_click")) { return pdv.milotin.addallocatemd.remoteMe.runUserSub(false, "addallocatemd","btnclose_click");}
 BA.debugLineNum = 335;BA.debugLine="Private Sub btnClose_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 337;BA.debugLine="If kvs.Get(\"Status\") = \"success\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",addallocatemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("Status"))),RemoteObject.createImmutable(("success")))) { 
 BA.debugLineNum = 338;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
addallocatemd.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 340;BA.debugLine="pnStatus.Visible = False";
Debug.ShouldStop(524288);
addallocatemd.mostCurrent._pnstatus.runMethod(true,"setVisible",addallocatemd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 341;BA.debugLine="pnConfirmation.Visible = False";
Debug.ShouldStop(1048576);
addallocatemd.mostCurrent._pnconfirmation.runMethod(true,"setVisible",addallocatemd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 342;BA.debugLine="btnNext.Visible = True";
Debug.ShouldStop(2097152);
addallocatemd.mostCurrent._btnnext.runMethod(true,"setVisible",addallocatemd.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 344;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("btnNext_Click (addallocatemd) ","addallocatemd",12,addallocatemd.mostCurrent.activityBA,addallocatemd.mostCurrent,305);
if (RapidSub.canDelegate("btnnext_click")) { return pdv.milotin.addallocatemd.remoteMe.runUserSub(false, "addallocatemd","btnnext_click");}
RemoteObject _strselectcategory = RemoteObject.createImmutable("");
 BA.debugLineNum = 305;BA.debugLine="Private Sub btnNext_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 306;BA.debugLine="Dim strSelectCategory As String";
Debug.ShouldStop(131072);
_strselectcategory = RemoteObject.createImmutable("");Debug.locals.put("strSelectCategory", _strselectcategory);
 BA.debugLineNum = 307;BA.debugLine="pnBlackTransparent.Visible = True";
Debug.ShouldStop(262144);
addallocatemd.mostCurrent._pnblacktransparent.runMethod(true,"setVisible",addallocatemd.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 308;BA.debugLine="pnConfirmation.Visible = True";
Debug.ShouldStop(524288);
addallocatemd.mostCurrent._pnconfirmation.runMethod(true,"setVisible",addallocatemd.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 309;BA.debugLine="btnNext.Visible = False";
Debug.ShouldStop(1048576);
addallocatemd.mostCurrent._btnnext.runMethod(true,"setVisible",addallocatemd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 310;BA.debugLine="strSelectCategory = cboCategory.GetItem(cboCatego";
Debug.ShouldStop(2097152);
_strselectcategory = addallocatemd.mostCurrent._cbocategory.runMethod(true,"GetItem",(Object)(addallocatemd.mostCurrent._cbocategory.runMethod(true,"getSelectedIndex")));Debug.locals.put("strSelectCategory", _strselectcategory);
 BA.debugLineNum = 311;BA.debugLine="kvs.Put(\"SelectedCategory\", strSelectCategory)";
Debug.ShouldStop(4194304);
addallocatemd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("SelectedCategory")),(Object)((_strselectcategory)));
 BA.debugLineNum = 312;BA.debugLine="Log(strSelectCategory)";
Debug.ShouldStop(8388608);
addallocatemd.mostCurrent.__c.runVoidMethod ("LogImpl","414286855",_strselectcategory,0);
 BA.debugLineNum = 313;BA.debugLine="lblAllocateAmount.Text = txtAllocateFund.Text";
Debug.ShouldStop(16777216);
addallocatemd.mostCurrent._lblallocateamount.runMethod(true,"setText",BA.ObjectToCharSequence(addallocatemd.mostCurrent._txtallocatefund.runMethod(true,"getText")));
 BA.debugLineNum = 315;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("btnSend_Click (addallocatemd) ","addallocatemd",12,addallocatemd.mostCurrent.activityBA,addallocatemd.mostCurrent,319);
if (RapidSub.canDelegate("btnsend_click")) { return pdv.milotin.addallocatemd.remoteMe.runUserSub(false, "addallocatemd","btnsend_click");}
 BA.debugLineNum = 319;BA.debugLine="Private Sub btnSend_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 320;BA.debugLine="PostAllocate";
Debug.ShouldStop(-2147483648);
_postallocate();
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
public static RemoteObject  _calculatepercentage(RemoteObject _part,RemoteObject _total) throws Exception{
try {
		Debug.PushSubsStack("CalculatePercentage (addallocatemd) ","addallocatemd",12,addallocatemd.mostCurrent.activityBA,addallocatemd.mostCurrent,346);
if (RapidSub.canDelegate("calculatepercentage")) { return pdv.milotin.addallocatemd.remoteMe.runUserSub(false, "addallocatemd","calculatepercentage", _part, _total);}
RemoteObject _percentage = RemoteObject.createImmutable(0);
Debug.locals.put("part", _part);
Debug.locals.put("total", _total);
 BA.debugLineNum = 346;BA.debugLine="Sub CalculatePercentage(part As Double, total As D";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 347;BA.debugLine="Dim percentage As Double";
Debug.ShouldStop(67108864);
_percentage = RemoteObject.createImmutable(0);Debug.locals.put("percentage", _percentage);
 BA.debugLineNum = 348;BA.debugLine="percentage = (part / total) * 100";
Debug.ShouldStop(134217728);
_percentage = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_part,_total}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0);Debug.locals.put("percentage", _percentage);
 BA.debugLineNum = 349;BA.debugLine="If percentage > 100 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_percentage,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 350;BA.debugLine="cpBar2.Value = \"100\"";
Debug.ShouldStop(536870912);
addallocatemd.mostCurrent._cpbar2.runClassMethod (pdv.milotin.circularprogressbar.class, "_setvalue" /*RemoteObject*/ ,BA.numberCast(float.class, "100"));
 BA.debugLineNum = 351;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(5,206";
Debug.ShouldStop(1073741824);
addallocatemd.mostCurrent._lblprojectprogress2.runMethod(true,"setTextColor",addallocatemd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 206)),(Object)(BA.numberCast(int.class, 46))));
 BA.debugLineNum = 352;BA.debugLine="lblProjectProgress2.Text = \"Fundraising complete";
Debug.ShouldStop(-2147483648);
addallocatemd.mostCurrent._lblprojectprogress2.runMethod(true,"setText",BA.ObjectToCharSequence("Fundraising complete"));
 BA.debugLineNum = 353;BA.debugLine="txtDonateAmount.Enabled = False";
Debug.ShouldStop(1);
addallocatemd.mostCurrent._txtdonateamount.runMethod(true,"setEnabled",addallocatemd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 354;BA.debugLine="txtDonateAmount.Text = \"-\"";
Debug.ShouldStop(2);
addallocatemd.mostCurrent._txtdonateamount.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("-"));
 }else {
 BA.debugLineNum = 356;BA.debugLine="cpBar2.Value = NumberFormat(percentage, 1, 3)";
Debug.ShouldStop(8);
addallocatemd.mostCurrent._cpbar2.runClassMethod (pdv.milotin.circularprogressbar.class, "_setvalue" /*RemoteObject*/ ,BA.numberCast(float.class, addallocatemd.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_percentage),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 357;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(254,1";
Debug.ShouldStop(16);
addallocatemd.mostCurrent._lblprojectprogress2.runMethod(true,"setTextColor",addallocatemd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 254)),(Object)(BA.numberCast(int.class, 171)),(Object)(BA.numberCast(int.class, 43))));
 BA.debugLineNum = 358;BA.debugLine="lblProjectProgress2.Text = \"Fundraising in progr";
Debug.ShouldStop(32);
addallocatemd.mostCurrent._lblprojectprogress2.runMethod(true,"setText",BA.ObjectToCharSequence("Fundraising in progress"));
 };
 BA.debugLineNum = 361;BA.debugLine="Log(NumberFormat(percentage, 1, 3))";
Debug.ShouldStop(256);
addallocatemd.mostCurrent.__c.runVoidMethod ("LogImpl","414614543",addallocatemd.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_percentage),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),0);
 BA.debugLineNum = 362;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("GetAuditByID (addallocatemd) ","addallocatemd",12,addallocatemd.mostCurrent.activityBA,addallocatemd.mostCurrent,112);
if (RapidSub.canDelegate("getauditbyid")) { return pdv.milotin.addallocatemd.remoteMe.runUserSub(false, "addallocatemd","getauditbyid");}
RemoteObject _jobgetauditbyid = RemoteObject.declareNull("pdv.milotin.httpjob");
RemoteObject _url = RemoteObject.createImmutable("");
 BA.debugLineNum = 112;BA.debugLine="Sub GetAuditByID";
Debug.ShouldStop(32768);
 BA.debugLineNum = 114;BA.debugLine="Dim JobGetAuditByID As HttpJob";
Debug.ShouldStop(131072);
_jobgetauditbyid = RemoteObject.createNew ("pdv.milotin.httpjob");Debug.locals.put("JobGetAuditByID", _jobgetauditbyid);
 BA.debugLineNum = 115;BA.debugLine="JobGetAuditByID.Initialize(\"JobGetAuditByID\", Me)";
Debug.ShouldStop(262144);
_jobgetauditbyid.runClassMethod (pdv.milotin.httpjob.class, "_initialize" /*RemoteObject*/ ,addallocatemd.processBA,(Object)(BA.ObjectToString("JobGetAuditByID")),(Object)(addallocatemd.getObject()));
 BA.debugLineNum = 117;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
Debug.ShouldStop(1048576);
_url = RemoteObject.concat(RemoteObject.createImmutable("https://service-testnet.maschain.com/api/audit/audit/"),addallocatemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("AuditTransactionHash"))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 118;BA.debugLine="Log(\"HASH:\" & kvs.Get(\"AuditTransactionHash\"))";
Debug.ShouldStop(2097152);
addallocatemd.mostCurrent.__c.runVoidMethod ("LogImpl","413631494",RemoteObject.concat(RemoteObject.createImmutable("HASH:"),addallocatemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("AuditTransactionHash")))),0);
 BA.debugLineNum = 119;BA.debugLine="JobGetAuditByID.Download(url)";
Debug.ShouldStop(4194304);
_jobgetauditbyid.runClassMethod (pdv.milotin.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 120;BA.debugLine="JobGetAuditByID.GetRequest.SetHeader(\"client_id\",";
Debug.ShouldStop(8388608);
_jobgetauditbyid.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_id")),(Object)(BA.ObjectToString(addallocatemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_id"))))));
 BA.debugLineNum = 121;BA.debugLine="JobGetAuditByID.GetRequest.SetHeader(\"client_secr";
Debug.ShouldStop(16777216);
_jobgetauditbyid.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_secret")),(Object)(BA.ObjectToString(addallocatemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_secret"))))));
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getauditcategory() throws Exception{
try {
		Debug.PushSubsStack("GetAuditCategory (addallocatemd) ","addallocatemd",12,addallocatemd.mostCurrent.activityBA,addallocatemd.mostCurrent,99);
if (RapidSub.canDelegate("getauditcategory")) { return pdv.milotin.addallocatemd.remoteMe.runUserSub(false, "addallocatemd","getauditcategory");}
RemoteObject _jobgetauditcategory = RemoteObject.declareNull("pdv.milotin.httpjob");
RemoteObject _url = RemoteObject.createImmutable("");
 BA.debugLineNum = 99;BA.debugLine="Sub GetAuditCategory";
Debug.ShouldStop(4);
 BA.debugLineNum = 101;BA.debugLine="Dim JobGetAuditCategory As HttpJob";
Debug.ShouldStop(16);
_jobgetauditcategory = RemoteObject.createNew ("pdv.milotin.httpjob");Debug.locals.put("JobGetAuditCategory", _jobgetauditcategory);
 BA.debugLineNum = 102;BA.debugLine="JobGetAuditCategory.Initialize(\"JobGetAuditCatego";
Debug.ShouldStop(32);
_jobgetauditcategory.runClassMethod (pdv.milotin.httpjob.class, "_initialize" /*RemoteObject*/ ,addallocatemd.processBA,(Object)(BA.ObjectToString("JobGetAuditCategory")),(Object)(addallocatemd.getObject()));
 BA.debugLineNum = 104;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
Debug.ShouldStop(128);
_url = BA.ObjectToString("https://service-testnet.maschain.com/api/audit/category/");Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 105;BA.debugLine="JobGetAuditCategory.Download(url)";
Debug.ShouldStop(256);
_jobgetauditcategory.runClassMethod (pdv.milotin.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 106;BA.debugLine="JobGetAuditCategory.GetRequest.SetHeader(\"client_";
Debug.ShouldStop(512);
_jobgetauditcategory.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_id")),(Object)(BA.ObjectToString(addallocatemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_id"))))));
 BA.debugLineNum = 107;BA.debugLine="JobGetAuditCategory.GetRequest.SetHeader(\"client_";
Debug.ShouldStop(1024);
_jobgetauditcategory.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_secret")),(Object)(BA.ObjectToString(addallocatemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_secret"))))));
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
addallocatemd.mostCurrent._kvs = RemoteObject.createNew ("b4a.example3.keyvaluestore");
 //BA.debugLineNum = 16;BA.debugLine="Private rp As RuntimePermissions";
addallocatemd.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 17;BA.debugLine="Private shared As String";
addallocatemd.mostCurrent._shared = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Private SQL1 As SQL";
addallocatemd.mostCurrent._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 19;BA.debugLine="Private xui As XUI";
addallocatemd.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 20;BA.debugLine="Private lblBottom As Label";
addallocatemd.mostCurrent._lblbottom = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private lblHome As Label";
addallocatemd.mostCurrent._lblhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private lblFund As Label";
addallocatemd.mostCurrent._lblfund = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private lblHistory As Label";
addallocatemd.mostCurrent._lblhistory = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private lblUser As Label";
addallocatemd.mostCurrent._lbluser = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblHome2 As Label";
addallocatemd.mostCurrent._lblhome2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private lblFund2 As Label";
addallocatemd.mostCurrent._lblfund2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private lblHistory2 As Label";
addallocatemd.mostCurrent._lblhistory2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private lblUser2 As Label";
addallocatemd.mostCurrent._lbluser2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private pnHeader1 As Panel";
addallocatemd.mostCurrent._pnheader1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private lblTop As Label";
addallocatemd.mostCurrent._lbltop = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private pnFrame1 As Panel";
addallocatemd.mostCurrent._pnframe1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private lblProjectTittle As Label";
addallocatemd.mostCurrent._lblprojecttittle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private cpBar2 As CircularProgressBar";
addallocatemd.mostCurrent._cpbar2 = RemoteObject.createNew ("pdv.milotin.circularprogressbar");
 //BA.debugLineNum = 34;BA.debugLine="Private lblProjectFund2 As Label";
addallocatemd.mostCurrent._lblprojectfund2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private lblProjectProgress2 As Label";
addallocatemd.mostCurrent._lblprojectprogress2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private lblLine1 As Label";
addallocatemd.mostCurrent._lblline1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private lblDonate As Label";
addallocatemd.mostCurrent._lbldonate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private pnDonateAmount As Panel";
addallocatemd.mostCurrent._pndonateamount = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private btnNext As Button";
addallocatemd.mostCurrent._btnnext = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private lblMethod As Label";
addallocatemd.mostCurrent._lblmethod = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private imgFpx As ImageView";
addallocatemd.mostCurrent._imgfpx = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private imgMaschain As ImageView";
addallocatemd.mostCurrent._imgmaschain = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private imgCredit As ImageView";
addallocatemd.mostCurrent._imgcredit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private imgBTC As ImageView";
addallocatemd.mostCurrent._imgbtc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private imgBack As ImageView";
addallocatemd.mostCurrent._imgback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private pnBlackTransparent As Panel";
addallocatemd.mostCurrent._pnblacktransparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private pnConfirmation As Panel";
addallocatemd.mostCurrent._pnconfirmation = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private lblTittle2 As Label";
addallocatemd.mostCurrent._lbltittle2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private lblLine2 As Label";
addallocatemd.mostCurrent._lblline2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private imgCurrency As ImageView";
addallocatemd.mostCurrent._imgcurrency = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private lblDonateAmount As Label";
addallocatemd.mostCurrent._lbldonateamount = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private btnSend As Button";
addallocatemd.mostCurrent._btnsend = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private txtDonateAmount As EditText";
addallocatemd.mostCurrent._txtdonateamount = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private imgDonate As ImageView";
addallocatemd.mostCurrent._imgdonate = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private imgClose As ImageView";
addallocatemd.mostCurrent._imgclose = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private lblTittle3 As Label";
addallocatemd.mostCurrent._lbltittle3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private pnStatus As Panel";
addallocatemd.mostCurrent._pnstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private imgClose2 As ImageView";
addallocatemd.mostCurrent._imgclose2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private imgStatus As ImageView";
addallocatemd.mostCurrent._imgstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private lblLine3 As Label";
addallocatemd.mostCurrent._lblline3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private lblStatus As Label";
addallocatemd.mostCurrent._lblstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private btnClose As Button";
addallocatemd.mostCurrent._btnclose = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private lblAllocateCategory As Label";
addallocatemd.mostCurrent._lblallocatecategory = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private cboCategory As Spinner";
addallocatemd.mostCurrent._cbocategory = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private pnCategory As Panel";
addallocatemd.mostCurrent._pncategory = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private imgCategory As ImageView";
addallocatemd.mostCurrent._imgcategory = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private lblAllocateFund As Label";
addallocatemd.mostCurrent._lblallocatefund = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private txtAllocateFund As EditText";
addallocatemd.mostCurrent._txtallocatefund = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 69;BA.debugLine="Private pnAllocateFund As Panel";
addallocatemd.mostCurrent._pnallocatefund = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 70;BA.debugLine="Private imgAllocateFund As ImageView";
addallocatemd.mostCurrent._imgallocatefund = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 71;BA.debugLine="Private lblAllocateAmount As Label";
addallocatemd.mostCurrent._lblallocateamount = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 72;BA.debugLine="Private lblRemark As Label";
addallocatemd.mostCurrent._lblremark = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 73;BA.debugLine="Private pnRemark As Panel";
addallocatemd.mostCurrent._pnremark = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 74;BA.debugLine="Private txtRemark As EditText";
addallocatemd.mostCurrent._txtremark = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 75;BA.debugLine="Private imgRemark As ImageView";
addallocatemd.mostCurrent._imgremark = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imgback_click() throws Exception{
try {
		Debug.PushSubsStack("imgBack_Click (addallocatemd) ","addallocatemd",12,addallocatemd.mostCurrent.activityBA,addallocatemd.mostCurrent,287);
if (RapidSub.canDelegate("imgback_click")) { return pdv.milotin.addallocatemd.remoteMe.runUserSub(false, "addallocatemd","imgback_click");}
 BA.debugLineNum = 287;BA.debugLine="Private Sub imgBack_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 288;BA.debugLine="kvs.Put(\"ProjectWallet\",\"\")";
Debug.ShouldStop(-2147483648);
addallocatemd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("ProjectWallet")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 289;BA.debugLine="kvs.Put(\"ProjectTitle\",\"\")";
Debug.ShouldStop(1);
addallocatemd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("ProjectTitle")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 290;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2);
addallocatemd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 291;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("imgClose_Click (addallocatemd) ","addallocatemd",12,addallocatemd.mostCurrent.activityBA,addallocatemd.mostCurrent,323);
if (RapidSub.canDelegate("imgclose_click")) { return pdv.milotin.addallocatemd.remoteMe.runUserSub(false, "addallocatemd","imgclose_click");}
 BA.debugLineNum = 323;BA.debugLine="Private Sub imgClose_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 324;BA.debugLine="pnBlackTransparent.Visible = False";
Debug.ShouldStop(8);
addallocatemd.mostCurrent._pnblacktransparent.runMethod(true,"setVisible",addallocatemd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 325;BA.debugLine="pnConfirmation.Visible = False";
Debug.ShouldStop(16);
addallocatemd.mostCurrent._pnconfirmation.runMethod(true,"setVisible",addallocatemd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 326;BA.debugLine="btnNext.Visible = True";
Debug.ShouldStop(32);
addallocatemd.mostCurrent._btnnext.runMethod(true,"setVisible",addallocatemd.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 327;BA.debugLine="kvs.Put(\"DonateAmount\",\"\")";
Debug.ShouldStop(64);
addallocatemd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("DonateAmount")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 328;BA.debugLine="Log(\"Donate :\" & kvs.Get(\"DonateAmount\"))";
Debug.ShouldStop(128);
addallocatemd.mostCurrent.__c.runVoidMethod ("LogImpl","414417925",RemoteObject.concat(RemoteObject.createImmutable("Donate :"),addallocatemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("DonateAmount")))),0);
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
public static RemoteObject  _imgclose2_click() throws Exception{
try {
		Debug.PushSubsStack("imgClose2_Click (addallocatemd) ","addallocatemd",12,addallocatemd.mostCurrent.activityBA,addallocatemd.mostCurrent,331);
if (RapidSub.canDelegate("imgclose2_click")) { return pdv.milotin.addallocatemd.remoteMe.runUserSub(false, "addallocatemd","imgclose2_click");}
 BA.debugLineNum = 331;BA.debugLine="Private Sub imgClose2_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 332;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
addallocatemd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("JobDone (addallocatemd) ","addallocatemd",12,addallocatemd.mostCurrent.activityBA,addallocatemd.mostCurrent,165);
if (RapidSub.canDelegate("jobdone")) { return pdv.milotin.addallocatemd.remoteMe.runUserSub(false, "addallocatemd","jobdone", _job);}
RemoteObject _jsonstring = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _results = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _categories = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _status = RemoteObject.createImmutable(0);
RemoteObject _transactionhash = RemoteObject.createImmutable("");
RemoteObject _nonce = RemoteObject.createImmutable(0);
RemoteObject _from = RemoteObject.createImmutable("");
RemoteObject _responsestatus = RemoteObject.createImmutable("");
RemoteObject _receipt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _metadatastring = RemoteObject.createImmutable("");
RemoteObject _metadataparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _metadata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 165;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(16);
 BA.debugLineNum = 167;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(64);
addallocatemd.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 169;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(256);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 171;BA.debugLine="Dim jsonString As String = Job.GetString";
Debug.ShouldStop(1024);
_jsonstring = _job.runClassMethod (pdv.milotin.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("jsonString", _jsonstring);Debug.locals.put("jsonString", _jsonstring);
 BA.debugLineNum = 172;BA.debugLine="Log(jsonString)";
Debug.ShouldStop(2048);
addallocatemd.mostCurrent.__c.runVoidMethod ("LogImpl","413828103",_jsonstring,0);
 BA.debugLineNum = 174;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8192);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 175;BA.debugLine="parser.Initialize(jsonString)";
Debug.ShouldStop(16384);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstring));
 BA.debugLineNum = 177;BA.debugLine="If Job.JobName = \"JobGetAuditCategory\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobGetAuditCategory"))) { 
 BA.debugLineNum = 180;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(524288);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 181;BA.debugLine="Dim results As List = root.Get(\"result\")";
Debug.ShouldStop(1048576);
_results = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_results = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("results", _results);Debug.locals.put("results", _results);
 BA.debugLineNum = 182;BA.debugLine="Dim categories As List";
Debug.ShouldStop(2097152);
_categories = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("categories", _categories);
 BA.debugLineNum = 183;BA.debugLine="categories.Initialize";
Debug.ShouldStop(4194304);
_categories.runVoidMethod ("Initialize");
 BA.debugLineNum = 184;BA.debugLine="For Each result As Map In results";
Debug.ShouldStop(8388608);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group12 = _results;
final int groupLen12 = group12.runMethod(true,"getSize").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_result = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group12.runMethod(false,"Get",index12));Debug.locals.put("result", _result);
Debug.locals.put("result", _result);
 BA.debugLineNum = 185;BA.debugLine="Dim name As String = result.Get(\"name\")";
Debug.ShouldStop(16777216);
_name = BA.ObjectToString(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 186;BA.debugLine="categories.Add(name)";
Debug.ShouldStop(33554432);
_categories.runVoidMethod ("Add",(Object)((_name)));
 BA.debugLineNum = 188;BA.debugLine="Dim id As Int = result.Get(\"id\")";
Debug.ShouldStop(134217728);
_id = BA.numberCast(int.class, _result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 }
}Debug.locals.put("result", _result);
;
 BA.debugLineNum = 192;BA.debugLine="cboCategory.AddAll(categories)";
Debug.ShouldStop(-2147483648);
addallocatemd.mostCurrent._cbocategory.runVoidMethod ("AddAll",(Object)(_categories));
 }else 
{ BA.debugLineNum = 195;BA.debugLine="Else If Job.JobName = \"PostAuditAllocate\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("PostAuditAllocate"))) { 
 BA.debugLineNum = 196;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(8);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 197;BA.debugLine="Dim status As Int = root.Get(\"status\")";
Debug.ShouldStop(16);
_status = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 198;BA.debugLine="Dim result As Map = root.Get(\"result\")";
Debug.ShouldStop(32);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_result = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 200;BA.debugLine="If status = 200 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_status,BA.numberCast(double.class, 200))) { 
 BA.debugLineNum = 201;BA.debugLine="Dim transactionHash As String = result.Get(\"tr";
Debug.ShouldStop(256);
_transactionhash = BA.ObjectToString(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("transactionHash")))));Debug.locals.put("transactionHash", _transactionhash);Debug.locals.put("transactionHash", _transactionhash);
 BA.debugLineNum = 202;BA.debugLine="Dim nonce As Int = result.Get(\"nonce\")";
Debug.ShouldStop(512);
_nonce = BA.numberCast(int.class, _result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nonce")))));Debug.locals.put("nonce", _nonce);Debug.locals.put("nonce", _nonce);
 BA.debugLineNum = 203;BA.debugLine="Dim from As String = result.Get(\"from\")";
Debug.ShouldStop(1024);
_from = BA.ObjectToString(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("from")))));Debug.locals.put("from", _from);Debug.locals.put("from", _from);
 BA.debugLineNum = 204;BA.debugLine="Dim responseStatus As String = result.Get(\"sta";
Debug.ShouldStop(2048);
_responsestatus = BA.ObjectToString(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("responseStatus", _responsestatus);Debug.locals.put("responseStatus", _responsestatus);
 BA.debugLineNum = 205;BA.debugLine="Dim receipt As Map = result.Get(\"receipt\")";
Debug.ShouldStop(4096);
_receipt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_receipt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("receipt")))));Debug.locals.put("receipt", _receipt);Debug.locals.put("receipt", _receipt);
 BA.debugLineNum = 208;BA.debugLine="Log(\"Transaction Hash: \" & transactionHash)";
Debug.ShouldStop(32768);
addallocatemd.mostCurrent.__c.runVoidMethod ("LogImpl","413828139",RemoteObject.concat(RemoteObject.createImmutable("Transaction Hash: "),_transactionhash),0);
 BA.debugLineNum = 209;BA.debugLine="Log(\"Nonce: \" & nonce)";
Debug.ShouldStop(65536);
addallocatemd.mostCurrent.__c.runVoidMethod ("LogImpl","413828140",RemoteObject.concat(RemoteObject.createImmutable("Nonce: "),_nonce),0);
 BA.debugLineNum = 210;BA.debugLine="Log(\"From: \" & from)";
Debug.ShouldStop(131072);
addallocatemd.mostCurrent.__c.runVoidMethod ("LogImpl","413828141",RemoteObject.concat(RemoteObject.createImmutable("From: "),_from),0);
 BA.debugLineNum = 211;BA.debugLine="Log(\"Status: \" & responseStatus)";
Debug.ShouldStop(262144);
addallocatemd.mostCurrent.__c.runVoidMethod ("LogImpl","413828142",RemoteObject.concat(RemoteObject.createImmutable("Status: "),_responsestatus),0);
 BA.debugLineNum = 212;BA.debugLine="Log(\"Receipt: \" & receipt)";
Debug.ShouldStop(524288);
addallocatemd.mostCurrent.__c.runVoidMethod ("LogImpl","413828143",RemoteObject.concat(RemoteObject.createImmutable("Receipt: "),_receipt),0);
 BA.debugLineNum = 213;BA.debugLine="pnBlackTransparent.Visible = True";
Debug.ShouldStop(1048576);
addallocatemd.mostCurrent._pnblacktransparent.runMethod(true,"setVisible",addallocatemd.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 214;BA.debugLine="pnStatus.Visible = True";
Debug.ShouldStop(2097152);
addallocatemd.mostCurrent._pnstatus.runMethod(true,"setVisible",addallocatemd.mostCurrent.__c.getField(true,"True"));
 };
 }else 
{ BA.debugLineNum = 217;BA.debugLine="Else If Job.JobName = \"JobGetAuditByID\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobGetAuditByID"))) { 
 BA.debugLineNum = 219;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(67108864);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 220;BA.debugLine="Dim result As Map = root.Get(\"result\")";
Debug.ShouldStop(134217728);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_result = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 223;BA.debugLine="Dim metadataString As String = result.Get(\"meta";
Debug.ShouldStop(1073741824);
_metadatastring = BA.ObjectToString(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("metadata")))));Debug.locals.put("metadataString", _metadatastring);Debug.locals.put("metadataString", _metadatastring);
 BA.debugLineNum = 226;BA.debugLine="Dim metadataParser As JSONParser";
Debug.ShouldStop(2);
_metadataparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("metadataParser", _metadataparser);
 BA.debugLineNum = 227;BA.debugLine="metadataParser.Initialize(metadataString)";
Debug.ShouldStop(4);
_metadataparser.runVoidMethod ("Initialize",(Object)(_metadatastring));
 BA.debugLineNum = 228;BA.debugLine="Dim metadata As Map = metadataParser.NextObject";
Debug.ShouldStop(8);
_metadata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_metadata = _metadataparser.runMethod(false,"NextObject");Debug.locals.put("metadata", _metadata);Debug.locals.put("metadata", _metadata);
 BA.debugLineNum = 232;BA.debugLine="lblProjectTittle.Text = metadata.Get(\"project\")";
Debug.ShouldStop(128);
addallocatemd.mostCurrent._lblprojecttittle.runMethod(true,"setText",BA.ObjectToCharSequence(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("project"))))));
 BA.debugLineNum = 234;BA.debugLine="metadata.Get(\"status\")";
Debug.ShouldStop(512);
_metadata.runVoidMethod ("Get",(Object)((RemoteObject.createImmutable("status"))));
 BA.debugLineNum = 236;BA.debugLine="Log(metadata.Get(\"project\"))";
Debug.ShouldStop(2048);
addallocatemd.mostCurrent.__c.runVoidMethod ("LogImpl","413828167",BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("project"))))),0);
 BA.debugLineNum = 237;BA.debugLine="Log(metadata.Get(\"fund\"))";
Debug.ShouldStop(4096);
addallocatemd.mostCurrent.__c.runVoidMethod ("LogImpl","413828168",BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fund"))))),0);
 BA.debugLineNum = 238;BA.debugLine="Log(metadata.Get(\"progress\"))";
Debug.ShouldStop(8192);
addallocatemd.mostCurrent.__c.runVoidMethod ("LogImpl","413828169",BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("progress"))))),0);
 BA.debugLineNum = 239;BA.debugLine="Log(metadata.Get(\"status\"))";
Debug.ShouldStop(16384);
addallocatemd.mostCurrent.__c.runVoidMethod ("LogImpl","413828170",BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status"))))),0);
 BA.debugLineNum = 240;BA.debugLine="Log(metadata.Get(\"project_wallet\"))";
Debug.ShouldStop(32768);
addallocatemd.mostCurrent.__c.runVoidMethod ("LogImpl","413828171",BA.ObjectToString(_metadata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("project_wallet"))))),0);
 BA.debugLineNum = 242;BA.debugLine="GetAuditCategory";
Debug.ShouldStop(131072);
_getauditcategory();
 }else {
 BA.debugLineNum = 245;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(1048576);
addallocatemd.mostCurrent.__c.runVoidMethod ("LogImpl","413828176",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 }}}
;
 }else {
 BA.debugLineNum = 250;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(33554432);
addallocatemd.mostCurrent.__c.runVoidMethod ("LogImpl","413828181",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 };
 BA.debugLineNum = 254;BA.debugLine="Job.Release";
Debug.ShouldStop(536870912);
_job.runClassMethod (pdv.milotin.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 256;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("lblFund_Click (addallocatemd) ","addallocatemd",12,addallocatemd.mostCurrent.activityBA,addallocatemd.mostCurrent,272);
if (RapidSub.canDelegate("lblfund_click")) { return pdv.milotin.addallocatemd.remoteMe.runUserSub(false, "addallocatemd","lblfund_click");}
 BA.debugLineNum = 272;BA.debugLine="Private Sub lblFund_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 273;BA.debugLine="StartActivity(\"FundMd\")";
Debug.ShouldStop(65536);
addallocatemd.mostCurrent.__c.runVoidMethod ("StartActivity",addallocatemd.processBA,(Object)((RemoteObject.createImmutable("FundMd"))));
 BA.debugLineNum = 274;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
addallocatemd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("lblHistory_Click (addallocatemd) ","addallocatemd",12,addallocatemd.mostCurrent.activityBA,addallocatemd.mostCurrent,277);
if (RapidSub.canDelegate("lblhistory_click")) { return pdv.milotin.addallocatemd.remoteMe.runUserSub(false, "addallocatemd","lblhistory_click");}
 BA.debugLineNum = 277;BA.debugLine="Private Sub lblHistory_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 278;BA.debugLine="StartActivity(\"HistoryMd\")";
Debug.ShouldStop(2097152);
addallocatemd.mostCurrent.__c.runVoidMethod ("StartActivity",addallocatemd.processBA,(Object)((RemoteObject.createImmutable("HistoryMd"))));
 BA.debugLineNum = 279;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
addallocatemd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("lblHome_Click (addallocatemd) ","addallocatemd",12,addallocatemd.mostCurrent.activityBA,addallocatemd.mostCurrent,267);
if (RapidSub.canDelegate("lblhome_click")) { return pdv.milotin.addallocatemd.remoteMe.runUserSub(false, "addallocatemd","lblhome_click");}
 BA.debugLineNum = 267;BA.debugLine="Private Sub lblHome_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 268;BA.debugLine="kvs.Put(\"ProjectTitle\",\"\")";
Debug.ShouldStop(2048);
addallocatemd.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("ProjectTitle")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 269;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
addallocatemd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 270;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("lblUser_Click (addallocatemd) ","addallocatemd",12,addallocatemd.mostCurrent.activityBA,addallocatemd.mostCurrent,282);
if (RapidSub.canDelegate("lbluser_click")) { return pdv.milotin.addallocatemd.remoteMe.runUserSub(false, "addallocatemd","lbluser_click");}
 BA.debugLineNum = 282;BA.debugLine="Private Sub lblUser_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 283;BA.debugLine="StartActivity(\"UserMd\")";
Debug.ShouldStop(67108864);
addallocatemd.mostCurrent.__c.runVoidMethod ("StartActivity",addallocatemd.processBA,(Object)((RemoteObject.createImmutable("UserMd"))));
 BA.debugLineNum = 284;BA.debugLine="Activity.Finish";
Debug.ShouldStop(134217728);
addallocatemd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 285;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _postallocate() throws Exception{
try {
		Debug.PushSubsStack("PostAllocate (addallocatemd) ","addallocatemd",12,addallocatemd.mostCurrent.activityBA,addallocatemd.mostCurrent,126);
if (RapidSub.canDelegate("postallocate")) { return pdv.milotin.addallocatemd.remoteMe.runUserSub(false, "addallocatemd","postallocate");}
RemoteObject _postauditallocate = RemoteObject.declareNull("pdv.milotin.httpjob");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tagids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _metadata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
 BA.debugLineNum = 126;BA.debugLine="Sub PostAllocate";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="Dim PostAuditAllocate As HttpJob";
Debug.ShouldStop(1073741824);
_postauditallocate = RemoteObject.createNew ("pdv.milotin.httpjob");Debug.locals.put("PostAuditAllocate", _postauditallocate);
 BA.debugLineNum = 128;BA.debugLine="PostAuditAllocate.Initialize(\"PostAuditAllocate\",";
Debug.ShouldStop(-2147483648);
_postauditallocate.runClassMethod (pdv.milotin.httpjob.class, "_initialize" /*RemoteObject*/ ,addallocatemd.processBA,(Object)(BA.ObjectToString("PostAuditAllocate")),(Object)(addallocatemd.getObject()));
 BA.debugLineNum = 131;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(4);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 132;BA.debugLine="Dim data As Map";
Debug.ShouldStop(8);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("data", _data);
 BA.debugLineNum = 133;BA.debugLine="data.Initialize";
Debug.ShouldStop(16);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 134;BA.debugLine="data.Put(\"contract_address\", kvs.Get(\"audit-contr";
Debug.ShouldStop(32);
_data.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("contract_address"))),(Object)(addallocatemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("audit-contract")))));
 BA.debugLineNum = 135;BA.debugLine="data.Put(\"wallet_address\", kvs.Get(\"WalletAddress";
Debug.ShouldStop(64);
_data.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("wallet_address"))),(Object)(addallocatemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("WalletAddress")))));
 BA.debugLineNum = 138;BA.debugLine="Dim tagIds As List";
Debug.ShouldStop(512);
_tagids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("tagIds", _tagids);
 BA.debugLineNum = 139;BA.debugLine="tagIds.Initialize";
Debug.ShouldStop(1024);
_tagids.runVoidMethod ("Initialize");
 BA.debugLineNum = 140;BA.debugLine="tagIds.Add(4) ' Assuming 4 is the tag ID";
Debug.ShouldStop(2048);
_tagids.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable((4))));
 BA.debugLineNum = 141;BA.debugLine="data.Put(\"tag_id\", tagIds)";
Debug.ShouldStop(4096);
_data.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tag_id"))),(Object)((_tagids.getObject())));
 BA.debugLineNum = 142;BA.debugLine="data.Put(\"callback_url\", \"https://postman-echo.co";
Debug.ShouldStop(8192);
_data.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("callback_url"))),(Object)((RemoteObject.createImmutable("https://postman-echo.com/post?"))));
 BA.debugLineNum = 145;BA.debugLine="Dim metadata As Map";
Debug.ShouldStop(65536);
_metadata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("metadata", _metadata);
 BA.debugLineNum = 146;BA.debugLine="metadata.Initialize";
Debug.ShouldStop(131072);
_metadata.runVoidMethod ("Initialize");
 BA.debugLineNum = 147;BA.debugLine="metadata.Put(\"Category\", kvs.Get(\"SelectedCategor";
Debug.ShouldStop(262144);
_metadata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Category"))),(Object)(addallocatemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("SelectedCategory")))));
 BA.debugLineNum = 148;BA.debugLine="metadata.Put(\"AllocateFund\", txtAllocateFund.Text";
Debug.ShouldStop(524288);
_metadata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AllocateFund"))),(Object)((addallocatemd.mostCurrent._txtallocatefund.runMethod(true,"getText"))));
 BA.debugLineNum = 149;BA.debugLine="metadata.Put(\"Remark\", txtRemark.Text)";
Debug.ShouldStop(1048576);
_metadata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Remark"))),(Object)((addallocatemd.mostCurrent._txtremark.runMethod(true,"getText"))));
 BA.debugLineNum = 150;BA.debugLine="data.Put(\"metadata\", metadata)";
Debug.ShouldStop(2097152);
_data.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("metadata"))),(Object)((_metadata.getObject())));
 BA.debugLineNum = 152;BA.debugLine="json.Initialize(data)";
Debug.ShouldStop(8388608);
_json.runVoidMethod ("Initialize",(Object)(_data));
 BA.debugLineNum = 155;BA.debugLine="Log(json.ToString)";
Debug.ShouldStop(67108864);
addallocatemd.mostCurrent.__c.runVoidMethod ("LogImpl","416121885",_json.runMethod(true,"ToString"),0);
 BA.debugLineNum = 158;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
Debug.ShouldStop(536870912);
_url = BA.ObjectToString("https://service-testnet.maschain.com/api/audit/audit/");Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 159;BA.debugLine="PostAuditAllocate.PostString(url, json.ToString)";
Debug.ShouldStop(1073741824);
_postauditallocate.runClassMethod (pdv.milotin.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_url),(Object)(_json.runMethod(true,"ToString")));
 BA.debugLineNum = 160;BA.debugLine="PostAuditAllocate.GetRequest.SetContentType(\"appl";
Debug.ShouldStop(-2147483648);
_postauditallocate.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 161;BA.debugLine="PostAuditAllocate.GetRequest.SetHeader(\"client_id";
Debug.ShouldStop(1);
_postauditallocate.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_id")),(Object)(BA.ObjectToString(addallocatemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_id"))))));
 BA.debugLineNum = 162;BA.debugLine="PostAuditAllocate.GetRequest.SetHeader(\"client_se";
Debug.ShouldStop(2);
_postauditallocate.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_secret")),(Object)(BA.ObjectToString(addallocatemd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_secret"))))));
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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