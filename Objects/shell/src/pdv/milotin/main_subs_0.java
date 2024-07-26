package pdv.milotin;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,51);
if (RapidSub.canDelegate("activity_create")) { return pdv.milotin.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 51;BA.debugLine="Sub	 Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="Activity.LoadLayout(\"MainLy\")";
Debug.ShouldStop(1048576);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainLy")),main.mostCurrent.activityBA);
 BA.debugLineNum = 55;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
Debug.ShouldStop(4194304);
main.mostCurrent._shared = main.mostCurrent._rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 56;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
Debug.ShouldStop(8388608);
main.mostCurrent._kvs.runVoidMethod ("_initialize",main.processBA,(Object)(main.mostCurrent._shared),(Object)(RemoteObject.createImmutable("Userdatastore")));
 BA.debugLineNum = 58;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("db.db"))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 59;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("db.db")),(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("db.db")));
 };
 BA.debugLineNum = 62;BA.debugLine="If SQL1.IsInitialized = False Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",main._sql1.runMethod(true,"IsInitialized"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 63;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
Debug.ShouldStop(1073741824);
main._sql1.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("db.db")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 66;BA.debugLine="kvs.Put(\"client_id\",ClientKey)";
Debug.ShouldStop(2);
main.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("client_id")),(Object)((main._clientkey)));
 BA.debugLineNum = 67;BA.debugLine="kvs.Put(\"client_secret\",HashedClientSecret)";
Debug.ShouldStop(4);
main.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("client_secret")),(Object)((main._hashedclientsecret)));
 BA.debugLineNum = 68;BA.debugLine="kvs.Put(\"token-contract\",TokenContractAddress)";
Debug.ShouldStop(8);
main.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("token-contract")),(Object)((main._tokencontractaddress)));
 BA.debugLineNum = 69;BA.debugLine="kvs.Put(\"audit-contract\",AuditContractAddress)";
Debug.ShouldStop(16);
main.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("audit-contract")),(Object)((main._auditcontractaddress)));
 BA.debugLineNum = 70;BA.debugLine="kvs.Put(\"wallet-address\",txtWalletAddress.Text)";
Debug.ShouldStop(32);
main.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("wallet-address")),(Object)((main.mostCurrent._txtwalletaddress.runMethod(true,"getText"))));
 BA.debugLineNum = 74;BA.debugLine="If FirstTime Then '如果第一次，显示splash screen";
Debug.ShouldStop(512);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 75;BA.debugLine="btnLogin.Visible = False";
Debug.ShouldStop(1024);
main.mostCurrent._btnlogin.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 76;BA.debugLine="pnSplash.Visible=True";
Debug.ShouldStop(2048);
main.mostCurrent._pnsplash.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 78;BA.debugLine="lblCopyright.Visible = True";
Debug.ShouldStop(8192);
main.mostCurrent._lblcopyright.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 79;BA.debugLine="Timer1.Initialize(\"Timer1\", 3000)";
Debug.ShouldStop(16384);
main._timer1.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("Timer1")),(Object)(BA.numberCast(long.class, 3000)));
 BA.debugLineNum = 80;BA.debugLine="Timer1.Enabled=True";
Debug.ShouldStop(32768);
main._timer1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 82;BA.debugLine="pnSplash.Visible=False";
Debug.ShouldStop(131072);
main.mostCurrent._pnsplash.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 83;BA.debugLine="Timer1.Enabled=False";
Debug.ShouldStop(262144);
main._timer1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 85;BA.debugLine="lblCopyright.Visible = False";
Debug.ShouldStop(1048576);
main.mostCurrent._lblcopyright.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 86;BA.debugLine="btnLogin.Visible = True";
Debug.ShouldStop(2097152);
main.mostCurrent._btnlogin.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 90;BA.debugLine="txtUsername.Text = \"admin\"";
Debug.ShouldStop(33554432);
main.mostCurrent._txtusername.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("admin"));
 BA.debugLineNum = 91;BA.debugLine="txtPassword.Text = \"admin\"";
Debug.ShouldStop(67108864);
main.mostCurrent._txtpassword.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("admin"));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,224);
if (RapidSub.canDelegate("activity_keypress")) { return pdv.milotin.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);}
RemoteObject _str1 = RemoteObject.createImmutable("");
RemoteObject _str2 = RemoteObject.createImmutable("");
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 224;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 226;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 228;BA.debugLine="Dim str1 As String";
Debug.ShouldStop(8);
_str1 = RemoteObject.createImmutable("");Debug.locals.put("str1", _str1);
 BA.debugLineNum = 229;BA.debugLine="Dim str2 As String";
Debug.ShouldStop(16);
_str2 = RemoteObject.createImmutable("");Debug.locals.put("str2", _str2);
 BA.debugLineNum = 231;BA.debugLine="Select Case \"English\" 'kvs.GetSimple(\"CurrLangua";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt("English",BA.ObjectToString("中文"),BA.ObjectToString("English"))) {
case 0: {
 BA.debugLineNum = 233;BA.debugLine="str1 = \"确定要离开吗?\"";
Debug.ShouldStop(256);
_str1 = BA.ObjectToString("确定要离开吗?");Debug.locals.put("str1", _str1);
 BA.debugLineNum = 234;BA.debugLine="str2 = \"温馨提醒\"";
Debug.ShouldStop(512);
_str2 = BA.ObjectToString("温馨提醒");Debug.locals.put("str2", _str2);
 break; }
case 1: {
 BA.debugLineNum = 236;BA.debugLine="str1 = \"Are You Sure Want to Exit?\"";
Debug.ShouldStop(2048);
_str1 = BA.ObjectToString("Are You Sure Want to Exit?");Debug.locals.put("str1", _str1);
 BA.debugLineNum = 237;BA.debugLine="str2 = \"Reminder\"";
Debug.ShouldStop(4096);
_str2 = BA.ObjectToString("Reminder");Debug.locals.put("str2", _str2);
 break; }
}
;
 BA.debugLineNum = 240;BA.debugLine="Select Msgbox2(str1,str2,\"Yes\",\"\",\"No\",Null)";
Debug.ShouldStop(32768);
switch (BA.switchObjectToInt(main.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(_str1)),(Object)(BA.ObjectToCharSequence(_str2)),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA),main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))) {
case 0: {
 BA.debugLineNum = 243;BA.debugLine="kvs.Put(\"LEAVE\",\"YES\")";
Debug.ShouldStop(262144);
main.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("LEAVE")),(Object)((RemoteObject.createImmutable("YES"))));
 BA.debugLineNum = 244;BA.debugLine="kvs.put(\"Logout\",\"NO\")";
Debug.ShouldStop(524288);
main.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("Logout")),(Object)((RemoteObject.createImmutable("NO"))));
 BA.debugLineNum = 245;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
main.mostCurrent._activity.runVoidMethod ("Finish");
 break; }
default: {
 BA.debugLineNum = 247;BA.debugLine="Return True";
Debug.ShouldStop(4194304);
if (true) return main.mostCurrent.__c.getField(true,"True");
 break; }
}
;
 };
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,171);
if (RapidSub.canDelegate("activity_pause")) { return pdv.milotin.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 171;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,167);
if (RapidSub.canDelegate("activity_resume")) { return pdv.milotin.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 167;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(64);
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlogin_click() throws Exception{
try {
		Debug.PushSubsStack("btnLogin_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,175);
if (RapidSub.canDelegate("btnlogin_click")) { return pdv.milotin.main.remoteMe.runUserSub(false, "main","btnlogin_click");}
RemoteObject _phone1 = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
 BA.debugLineNum = 175;BA.debugLine="Sub btnLogin_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 180;BA.debugLine="If txtUsername.Text = \"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",main.mostCurrent._txtusername.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 181;BA.debugLine="Msgbox(\"Please Fill In Username!\",\"LOGIN\")";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please Fill In Username!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("LOGIN"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 184;BA.debugLine="If txtPassword.Text = \"\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",main.mostCurrent._txtpassword.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 185;BA.debugLine="Msgbox(\"Please Fill In Password!\",\"LOGIN\")";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please Fill In Password!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("LOGIN"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 188;BA.debugLine="cursor1 = SQL1.ExecQuery(\"SELECT * FROM ttUser WH";
Debug.ShouldStop(134217728);
main._cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), main._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM ttUser WHERE ttStatus = 1 AND ttUsername = '"),main.mostCurrent._txtusername.runMethod(true,"getText"),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(" AND ttPassword = '"),main.mostCurrent._txtpassword.runMethod(true,"getText"),RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 190;BA.debugLine="If cursor1.RowCount > 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",main._cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 191;BA.debugLine="Private Phone1 As Phone";
Debug.ShouldStop(1073741824);
_phone1 = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("Phone1", _phone1);
 BA.debugLineNum = 192;BA.debugLine="DoEvents";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethodAndSync ("DoEvents");
 BA.debugLineNum = 193;BA.debugLine="Phone1.HideKeyboard(Activity)";
Debug.ShouldStop(1);
_phone1.runVoidMethod ("HideKeyboard",(Object)(main.mostCurrent._activity));
 BA.debugLineNum = 194;BA.debugLine="DoEvents";
Debug.ShouldStop(2);
main.mostCurrent.__c.runVoidMethodAndSync ("DoEvents");
 BA.debugLineNum = 198;BA.debugLine="cursor1.Position = 0";
Debug.ShouldStop(32);
main._cursor1.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 199;BA.debugLine="kvs.Put(\"CURRID\", cursor1.GetString(\"ID\"))";
Debug.ShouldStop(64);
main.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("CURRID")),(Object)((main._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ID"))))));
 BA.debugLineNum = 201;BA.debugLine="kvs.Put(\"REMUSERID\", txtUsername.Text)";
Debug.ShouldStop(256);
main.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("REMUSERID")),(Object)((main.mostCurrent._txtusername.runMethod(true,"getText"))));
 BA.debugLineNum = 202;BA.debugLine="kvs.Put(\"CURRUSERNAME\", cursor1.GetString(\"ttUse";
Debug.ShouldStop(512);
main.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("CURRUSERNAME")),(Object)((main._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ttUsername"))))));
 BA.debugLineNum = 203;BA.debugLine="kvs.Put(\"CURRUSERROLE\", cursor1.GetString(\"ttUse";
Debug.ShouldStop(1024);
main.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("CURRUSERROLE")),(Object)((main._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ttUserRole"))))));
 }else {
 BA.debugLineNum = 206;BA.debugLine="Msgbox(\"Incorrect Username Or Password!\",\"LOGIN";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Incorrect Username Or Password!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("LOGIN FAIL"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 207;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 220;BA.debugLine="GetWallet";
Debug.ShouldStop(134217728);
_getwallet();
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getwallet() throws Exception{
try {
		Debug.PushSubsStack("GetWallet (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,118);
if (RapidSub.canDelegate("getwallet")) { return pdv.milotin.main.remoteMe.runUserSub(false, "main","getwallet");}
RemoteObject _jobgetwallet = RemoteObject.declareNull("pdv.milotin.httpjob");
RemoteObject _address = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
 BA.debugLineNum = 118;BA.debugLine="Sub GetWallet";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 120;BA.debugLine="Dim JobGetWallet As HttpJob";
Debug.ShouldStop(8388608);
_jobgetwallet = RemoteObject.createNew ("pdv.milotin.httpjob");Debug.locals.put("JobGetWallet", _jobgetwallet);
 BA.debugLineNum = 121;BA.debugLine="JobGetWallet.Initialize(\"JobGetWallet\", Me)";
Debug.ShouldStop(16777216);
_jobgetwallet.runClassMethod (pdv.milotin.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("JobGetWallet")),(Object)(main.getObject()));
 BA.debugLineNum = 122;BA.debugLine="Dim address As String = txtWalletAddress.Text'\"0x";
Debug.ShouldStop(33554432);
_address = main.mostCurrent._txtwalletaddress.runMethod(true,"getText");Debug.locals.put("address", _address);Debug.locals.put("address", _address);
 BA.debugLineNum = 123;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
Debug.ShouldStop(67108864);
_url = RemoteObject.concat(RemoteObject.createImmutable("https://service-testnet.maschain.com/api/wallet/wallet/"),_address);Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 124;BA.debugLine="JobGetWallet.Download(url)";
Debug.ShouldStop(134217728);
_jobgetwallet.runClassMethod (pdv.milotin.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 125;BA.debugLine="JobGetWallet.GetRequest.SetHeader(\"client_id\", Cl";
Debug.ShouldStop(268435456);
_jobgetwallet.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_id")),(Object)(main._clientkey));
 BA.debugLineNum = 126;BA.debugLine="JobGetWallet.GetRequest.SetHeader(\"client_secret\"";
Debug.ShouldStop(536870912);
_jobgetwallet.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_secret")),(Object)(main._hashedclientsecret));
 BA.debugLineNum = 128;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 26;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 27;BA.debugLine="Private kvs As KeyValueStore";
main.mostCurrent._kvs = RemoteObject.createNew ("b4a.example3.keyvaluestore");
 //BA.debugLineNum = 28;BA.debugLine="Private rp As RuntimePermissions";
main.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 29;BA.debugLine="Private shared As String";
main.mostCurrent._shared = RemoteObject.createImmutable("");
 //BA.debugLineNum = 32;BA.debugLine="Private pnMain As Panel";
main.mostCurrent._pnmain = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private lblTop As Label";
main.mostCurrent._lbltop = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private pnUsername As Panel";
main.mostCurrent._pnusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private imgUsername As ImageView";
main.mostCurrent._imgusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private txtUsername As EditText";
main.mostCurrent._txtusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private iconCheck As Label";
main.mostCurrent._iconcheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private pnPassword As Panel";
main.mostCurrent._pnpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private imgPassword As ImageView";
main.mostCurrent._imgpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private txtPassword As EditText";
main.mostCurrent._txtpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private pnWallet As Panel";
main.mostCurrent._pnwallet = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private imgWallet As ImageView";
main.mostCurrent._imgwallet = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private txtWalletAddress As EditText";
main.mostCurrent._txtwalletaddress = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private btnLogin As Button";
main.mostCurrent._btnlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private lblForgotPassword As Label";
main.mostCurrent._lblforgotpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private pnSplash As Panel";
main.mostCurrent._pnsplash = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private lblCopyright As Label";
main.mostCurrent._lblcopyright = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,130);
if (RapidSub.canDelegate("jobdone")) { return pdv.milotin.main.remoteMe.runUserSub(false, "main","jobdone", _job);}
RemoteObject _jsonstring = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("job", _job);
 BA.debugLineNum = 130;BA.debugLine="Sub JobDone(job As HttpJob)";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 133;BA.debugLine="If job.Success = True Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 135;BA.debugLine="Dim jsonString As String = job.GetString";
Debug.ShouldStop(64);
_jsonstring = _job.runClassMethod (pdv.milotin.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("jsonString", _jsonstring);Debug.locals.put("jsonString", _jsonstring);
 BA.debugLineNum = 136;BA.debugLine="Log(jsonString)";
Debug.ShouldStop(128);
main.mostCurrent.__c.runVoidMethod ("LogImpl","5327686",_jsonstring,0);
 BA.debugLineNum = 138;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(512);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 139;BA.debugLine="parser.Initialize(jsonString)";
Debug.ShouldStop(1024);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstring));
 BA.debugLineNum = 141;BA.debugLine="If job.JobName = \"JobGetWallet\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobGetWallet"))) { 
 BA.debugLineNum = 144;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(32768);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 145;BA.debugLine="Dim result As Map = root.Get(\"result\")";
Debug.ShouldStop(65536);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_result = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 148;BA.debugLine="kvs.Put(\"WalletId\",result.Get(\"id\"))";
Debug.ShouldStop(524288);
main.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("WalletId")),(Object)(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 149;BA.debugLine="kvs.Put(\"WalletAddress\",result.Get(\"address\"))";
Debug.ShouldStop(1048576);
main.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("WalletAddress")),(Object)(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address"))))));
 BA.debugLineNum = 150;BA.debugLine="kvs.Put(\"WalletName\",result.Get(\"name\"))";
Debug.ShouldStop(2097152);
main.mostCurrent._kvs.runVoidMethod ("_put",(Object)(BA.ObjectToString("WalletName")),(Object)(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 };
 }else {
 BA.debugLineNum = 157;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 161;BA.debugLine="job.Release";
Debug.ShouldStop(1);
_job.runClassMethod (pdv.milotin.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 163;BA.debugLine="StartActivity(\"HomeMd\")";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("HomeMd"))));
 BA.debugLineNum = 164;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
homemd_subs_0._process_globals();
sendfundmd_subs_0._process_globals();
usermd_subs_0._process_globals();
historymd_subs_0._process_globals();
fundmd_subs_0._process_globals();
addprojectmd_subs_0._process_globals();
starter_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("pdv.milotin.main");
homemd.myClass = BA.getDeviceClass ("pdv.milotin.homemd");
sendfundmd.myClass = BA.getDeviceClass ("pdv.milotin.sendfundmd");
usermd.myClass = BA.getDeviceClass ("pdv.milotin.usermd");
historymd.myClass = BA.getDeviceClass ("pdv.milotin.historymd");
fundmd.myClass = BA.getDeviceClass ("pdv.milotin.fundmd");
addprojectmd.myClass = BA.getDeviceClass ("pdv.milotin.addprojectmd");
cameraexclass.myClass = BA.getDeviceClass ("pdv.milotin.cameraexclass");
circularprogressbar.myClass = BA.getDeviceClass ("pdv.milotin.circularprogressbar");
customlistview.myClass = BA.getDeviceClass ("pdv.milotin.customlistview");
qrcode.myClass = BA.getDeviceClass ("pdv.milotin.qrcode");
starter.myClass = BA.getDeviceClass ("pdv.milotin.starter");
httputils2service.myClass = BA.getDeviceClass ("pdv.milotin.httputils2service");
httpjob.myClass = BA.getDeviceClass ("pdv.milotin.httpjob");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 17;BA.debugLine="Private Timer1 As Timer";
main._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 18;BA.debugLine="Private SQL1 As SQL";
main._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 19;BA.debugLine="Private cursor1, cursorSetting As Cursor";
main._cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
main._cursorsetting = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ClientKey As String = \"29ce9025492f7af261";
main._clientkey = BA.ObjectToString("29ce9025492f7af26177ff2c85b3703a1ec763dbbc49a19dff1442d6b810b68b");
 //BA.debugLineNum = 21;BA.debugLine="Private HashedClientSecret As String = \"sk_71a349";
main._hashedclientsecret = BA.ObjectToString("sk_71a349f5467456ee1c321604553cc6afa62b3e8a9482f5749ab4ab70f10b7380");
 //BA.debugLineNum = 22;BA.debugLine="Private TokenContractAddress As String = \"0x5BA88";
main._tokencontractaddress = BA.ObjectToString("0x5BA886F619b95E2b2a875503e2FCE58c14027ade");
 //BA.debugLineNum = 23;BA.debugLine="Private AuditContractAddress As String = \"0x352D1";
main._auditcontractaddress = BA.ObjectToString("0x352D1B542278e277061617b2CcEcb6B56E62b757");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _timer1_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer1_tick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,109);
if (RapidSub.canDelegate("timer1_tick")) { return pdv.milotin.main.remoteMe.runUserSub(false, "main","timer1_tick");}
 BA.debugLineNum = 109;BA.debugLine="Sub Timer1_tick";
Debug.ShouldStop(4096);
 BA.debugLineNum = 111;BA.debugLine="pnSplash.Visible=False";
Debug.ShouldStop(16384);
main.mostCurrent._pnsplash.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 112;BA.debugLine="Timer1.Enabled = False";
Debug.ShouldStop(32768);
main._timer1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 114;BA.debugLine="btnLogin.Visible = True";
Debug.ShouldStop(131072);
main.mostCurrent._btnlogin.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}