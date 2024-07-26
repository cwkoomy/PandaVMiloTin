package pdv.milotin;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class usermd_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (usermd) ","usermd",3,usermd.mostCurrent.activityBA,usermd.mostCurrent,62);
if (RapidSub.canDelegate("activity_create")) { return pdv.milotin.usermd.remoteMe.runUserSub(false, "usermd","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 62;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 64;BA.debugLine="Activity.LoadLayout(\"UserLy\")";
Debug.ShouldStop(-2147483648);
usermd.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("UserLy")),usermd.mostCurrent.activityBA);
 BA.debugLineNum = 66;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
Debug.ShouldStop(2);
usermd.mostCurrent._shared = usermd.mostCurrent._rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 67;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
Debug.ShouldStop(4);
usermd.mostCurrent._kvs.runVoidMethod ("_initialize",usermd.processBA,(Object)(usermd.mostCurrent._shared),(Object)(RemoteObject.createImmutable("Userdatastore")));
 BA.debugLineNum = 68;BA.debugLine="qr.Initialize";
Debug.ShouldStop(8);
usermd.mostCurrent._qr.runClassMethod (pdv.milotin.qrcode.class, "_initialize" /*RemoteObject*/ ,usermd.processBA);
 BA.debugLineNum = 70;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",usermd.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(usermd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("db.db"))),usermd.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 71;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
Debug.ShouldStop(64);
usermd.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(usermd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("db.db")),(Object)(usermd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("db.db")));
 };
 BA.debugLineNum = 74;BA.debugLine="If SQL1.IsInitialized = False Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",usermd.mostCurrent._sql1.runMethod(true,"IsInitialized"),usermd.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 75;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
Debug.ShouldStop(1024);
usermd.mostCurrent._sql1.runVoidMethod ("Initialize",(Object)(usermd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("db.db")),(Object)(usermd.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 78;BA.debugLine="GenerateQR";
Debug.ShouldStop(8192);
_generateqr();
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (usermd) ","usermd",3,usermd.mostCurrent.activityBA,usermd.mostCurrent,86);
if (RapidSub.canDelegate("activity_pause")) { return pdv.milotin.usermd.remoteMe.runUserSub(false, "usermd","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (usermd) ","usermd",3,usermd.mostCurrent.activityBA,usermd.mostCurrent,82);
if (RapidSub.canDelegate("activity_resume")) { return pdv.milotin.usermd.remoteMe.runUserSub(false, "usermd","activity_resume");}
 BA.debugLineNum = 82;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
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
public static RemoteObject  _generateqr() throws Exception{
try {
		Debug.PushSubsStack("GenerateQR (usermd) ","usermd",3,usermd.mostCurrent.activityBA,usermd.mostCurrent,90);
if (RapidSub.canDelegate("generateqr")) { return pdv.milotin.usermd.remoteMe.runUserSub(false, "usermd","generateqr");}
RemoteObject _strqrcode = RemoteObject.createImmutable("");
 BA.debugLineNum = 90;BA.debugLine="Sub GenerateQR";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 92;BA.debugLine="Dim strQRCode As String";
Debug.ShouldStop(134217728);
_strqrcode = RemoteObject.createImmutable("");Debug.locals.put("strQRCode", _strqrcode);
 BA.debugLineNum = 93;BA.debugLine="strQRCode = kvs.Get(\"WalletAddress\")";
Debug.ShouldStop(268435456);
_strqrcode = BA.ObjectToString(usermd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("WalletAddress"))));Debug.locals.put("strQRCode", _strqrcode);
 BA.debugLineNum = 95;BA.debugLine="bmr = qr.drawQRCode(strQRCode)";
Debug.ShouldStop(1073741824);
usermd.mostCurrent._bmr = usermd.mostCurrent._qr.runClassMethod (pdv.milotin.qrcode.class, "_drawqrcode" /*RemoteObject*/ ,(Object)(_strqrcode));
 BA.debugLineNum = 96;BA.debugLine="imgQR.Bitmap = bmr";
Debug.ShouldStop(-2147483648);
usermd.mostCurrent._imgqr.runMethod(false,"setBitmap",(usermd.mostCurrent._bmr.getObject()));
 BA.debugLineNum = 97;BA.debugLine="Log(strQRCode)";
Debug.ShouldStop(1);
usermd.mostCurrent.__c.runVoidMethod ("LogImpl","53407879",_strqrcode,0);
 BA.debugLineNum = 102;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Private kvs As KeyValueStore";
usermd.mostCurrent._kvs = RemoteObject.createNew ("b4a.example3.keyvaluestore");
 //BA.debugLineNum = 16;BA.debugLine="Private rp As RuntimePermissions";
usermd.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 17;BA.debugLine="Private shared As String";
usermd.mostCurrent._shared = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Private SQL1 As SQL";
usermd.mostCurrent._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 19;BA.debugLine="Dim bmr As Bitmap";
usermd.mostCurrent._bmr = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim qr As QRcode";
usermd.mostCurrent._qr = RemoteObject.createNew ("pdv.milotin.qrcode");
 //BA.debugLineNum = 22;BA.debugLine="Private pnHeader1 As Panel";
usermd.mostCurrent._pnheader1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private lblTop As Label";
usermd.mostCurrent._lbltop = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private lblBottom As Label";
usermd.mostCurrent._lblbottom = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblHome As Label";
usermd.mostCurrent._lblhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private lblFund As Label";
usermd.mostCurrent._lblfund = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private lblHistory As Label";
usermd.mostCurrent._lblhistory = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private lblUser As Label";
usermd.mostCurrent._lbluser = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private lblMyBalance As Label";
usermd.mostCurrent._lblmybalance = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private lblAmount As Label";
usermd.mostCurrent._lblamount = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private lblLine1 As Label";
usermd.mostCurrent._lblline1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private lblHome2 As Label";
usermd.mostCurrent._lblhome2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private lblFund2 As Label";
usermd.mostCurrent._lblfund2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private lblHistory2 As Label";
usermd.mostCurrent._lblhistory2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private lblUser2 As Label";
usermd.mostCurrent._lbluser2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private imgBack As ImageView";
usermd.mostCurrent._imgback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private imgQR As ImageView";
usermd.mostCurrent._imgqr = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private lblMyAddress As Label";
usermd.mostCurrent._lblmyaddress = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private btnCopyAddress As Button";
usermd.mostCurrent._btncopyaddress = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private imgUserAvatar As ImageView";
usermd.mostCurrent._imguseravatar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private pnFrame2 As Panel";
usermd.mostCurrent._pnframe2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private lblFullName As Label";
usermd.mostCurrent._lblfullname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private pnFullName As Panel";
usermd.mostCurrent._pnfullname = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private lblEmail As Label";
usermd.mostCurrent._lblemail = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private pnEmail As Panel";
usermd.mostCurrent._pnemail = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private pnPassword As Panel";
usermd.mostCurrent._pnpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private pnPhone As Panel";
usermd.mostCurrent._pnphone = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private lblPassword As Label";
usermd.mostCurrent._lblpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private lblPhone As Label";
usermd.mostCurrent._lblphone = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private txtFullName As EditText";
usermd.mostCurrent._txtfullname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private txtEmail As EditText";
usermd.mostCurrent._txtemail = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private txtPassword As EditText";
usermd.mostCurrent._txtpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private txtPhone As EditText";
usermd.mostCurrent._txtphone = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private imgPhone As ImageView";
usermd.mostCurrent._imgphone = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private imgPassword As ImageView";
usermd.mostCurrent._imgpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private imgEmail As ImageView";
usermd.mostCurrent._imgemail = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private imgFullName As ImageView";
usermd.mostCurrent._imgfullname = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private imgEdit As ImageView";
usermd.mostCurrent._imgedit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private imgSave As ImageView";
usermd.mostCurrent._imgsave = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imgback_click() throws Exception{
try {
		Debug.PushSubsStack("imgBack_Click (usermd) ","usermd",3,usermd.mostCurrent.activityBA,usermd.mostCurrent,122);
if (RapidSub.canDelegate("imgback_click")) { return pdv.milotin.usermd.remoteMe.runUserSub(false, "usermd","imgback_click");}
 BA.debugLineNum = 122;BA.debugLine="Private Sub imgBack_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="Activity.Finish";
Debug.ShouldStop(67108864);
usermd.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _imgedit_click() throws Exception{
try {
		Debug.PushSubsStack("imgEdit_Click (usermd) ","usermd",3,usermd.mostCurrent.activityBA,usermd.mostCurrent,142);
if (RapidSub.canDelegate("imgedit_click")) { return pdv.milotin.usermd.remoteMe.runUserSub(false, "usermd","imgedit_click");}
 BA.debugLineNum = 142;BA.debugLine="Private Sub imgEdit_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="txtFullName.Enabled = True";
Debug.ShouldStop(16384);
usermd.mostCurrent._txtfullname.runMethod(true,"setEnabled",usermd.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 144;BA.debugLine="txtEmail.Enabled = True";
Debug.ShouldStop(32768);
usermd.mostCurrent._txtemail.runMethod(true,"setEnabled",usermd.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 145;BA.debugLine="txtPassword.Enabled = True";
Debug.ShouldStop(65536);
usermd.mostCurrent._txtpassword.runMethod(true,"setEnabled",usermd.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 146;BA.debugLine="txtPhone.Enabled = True";
Debug.ShouldStop(131072);
usermd.mostCurrent._txtphone.runMethod(true,"setEnabled",usermd.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 147;BA.debugLine="txtFullName.TextColor = Colors.RGB(0,0,0)";
Debug.ShouldStop(262144);
usermd.mostCurrent._txtfullname.runMethod(true,"setTextColor",usermd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 148;BA.debugLine="txtEmail.TextColor = Colors.RGB(0,0,0)";
Debug.ShouldStop(524288);
usermd.mostCurrent._txtemail.runMethod(true,"setTextColor",usermd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 149;BA.debugLine="txtPassword.TextColor = Colors.RGB(0,0,0)";
Debug.ShouldStop(1048576);
usermd.mostCurrent._txtpassword.runMethod(true,"setTextColor",usermd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 150;BA.debugLine="txtPhone.TextColor = Colors.RGB(0,0,0)";
Debug.ShouldStop(2097152);
usermd.mostCurrent._txtphone.runMethod(true,"setTextColor",usermd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 151;BA.debugLine="imgSave.Visible = True";
Debug.ShouldStop(4194304);
usermd.mostCurrent._imgsave.runMethod(true,"setVisible",usermd.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 152;BA.debugLine="imgSave.Enabled = True";
Debug.ShouldStop(8388608);
usermd.mostCurrent._imgsave.runMethod(true,"setEnabled",usermd.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 153;BA.debugLine="imgEdit.Visible = False";
Debug.ShouldStop(16777216);
usermd.mostCurrent._imgedit.runMethod(true,"setVisible",usermd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 154;BA.debugLine="imgEdit.Enabled = False";
Debug.ShouldStop(33554432);
usermd.mostCurrent._imgedit.runMethod(true,"setEnabled",usermd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgsave_click() throws Exception{
try {
		Debug.PushSubsStack("imgSave_Click (usermd) ","usermd",3,usermd.mostCurrent.activityBA,usermd.mostCurrent,157);
if (RapidSub.canDelegate("imgsave_click")) { return pdv.milotin.usermd.remoteMe.runUserSub(false, "usermd","imgsave_click");}
RemoteObject _strfullname = RemoteObject.createImmutable("");
RemoteObject _stremail = RemoteObject.createImmutable("");
RemoteObject _strpassword = RemoteObject.createImmutable("");
RemoteObject _strphone = RemoteObject.createImmutable("");
 BA.debugLineNum = 157;BA.debugLine="Private Sub imgSave_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 159;BA.debugLine="Dim strFullName As String = txtFullName.Text";
Debug.ShouldStop(1073741824);
_strfullname = usermd.mostCurrent._txtfullname.runMethod(true,"getText");Debug.locals.put("strFullName", _strfullname);Debug.locals.put("strFullName", _strfullname);
 BA.debugLineNum = 160;BA.debugLine="txtFullName.Text = strFullName";
Debug.ShouldStop(-2147483648);
usermd.mostCurrent._txtfullname.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_strfullname));
 BA.debugLineNum = 161;BA.debugLine="Dim strEmail As String = txtEmail.Text";
Debug.ShouldStop(1);
_stremail = usermd.mostCurrent._txtemail.runMethod(true,"getText");Debug.locals.put("strEmail", _stremail);Debug.locals.put("strEmail", _stremail);
 BA.debugLineNum = 162;BA.debugLine="txtEmail.Text = strEmail";
Debug.ShouldStop(2);
usermd.mostCurrent._txtemail.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_stremail));
 BA.debugLineNum = 163;BA.debugLine="Dim strPassword As String = txtPassword.Text";
Debug.ShouldStop(4);
_strpassword = usermd.mostCurrent._txtpassword.runMethod(true,"getText");Debug.locals.put("strPassword", _strpassword);Debug.locals.put("strPassword", _strpassword);
 BA.debugLineNum = 164;BA.debugLine="txtPassword.Text = strPassword";
Debug.ShouldStop(8);
usermd.mostCurrent._txtpassword.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_strpassword));
 BA.debugLineNum = 165;BA.debugLine="Dim strPhone As String = txtPhone.Text";
Debug.ShouldStop(16);
_strphone = usermd.mostCurrent._txtphone.runMethod(true,"getText");Debug.locals.put("strPhone", _strphone);Debug.locals.put("strPhone", _strphone);
 BA.debugLineNum = 166;BA.debugLine="txtPhone.Text = strPhone";
Debug.ShouldStop(32);
usermd.mostCurrent._txtphone.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_strphone));
 BA.debugLineNum = 168;BA.debugLine="txtFullName.Enabled = False";
Debug.ShouldStop(128);
usermd.mostCurrent._txtfullname.runMethod(true,"setEnabled",usermd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 169;BA.debugLine="txtEmail.Enabled = False";
Debug.ShouldStop(256);
usermd.mostCurrent._txtemail.runMethod(true,"setEnabled",usermd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 170;BA.debugLine="txtPassword.Enabled = False";
Debug.ShouldStop(512);
usermd.mostCurrent._txtpassword.runMethod(true,"setEnabled",usermd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 171;BA.debugLine="txtPhone.Enabled = False";
Debug.ShouldStop(1024);
usermd.mostCurrent._txtphone.runMethod(true,"setEnabled",usermd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 172;BA.debugLine="txtFullName.TextColor = Colors.RGB(149,149,149)";
Debug.ShouldStop(2048);
usermd.mostCurrent._txtfullname.runMethod(true,"setTextColor",usermd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 149)),(Object)(BA.numberCast(int.class, 149)),(Object)(BA.numberCast(int.class, 149))));
 BA.debugLineNum = 173;BA.debugLine="txtEmail.TextColor = Colors.RGB(149,149,149)";
Debug.ShouldStop(4096);
usermd.mostCurrent._txtemail.runMethod(true,"setTextColor",usermd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 149)),(Object)(BA.numberCast(int.class, 149)),(Object)(BA.numberCast(int.class, 149))));
 BA.debugLineNum = 174;BA.debugLine="txtPassword.TextColor = Colors.RGB(149,149,149)";
Debug.ShouldStop(8192);
usermd.mostCurrent._txtpassword.runMethod(true,"setTextColor",usermd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 149)),(Object)(BA.numberCast(int.class, 149)),(Object)(BA.numberCast(int.class, 149))));
 BA.debugLineNum = 175;BA.debugLine="txtPhone.TextColor = Colors.RGB(149,149,149)";
Debug.ShouldStop(16384);
usermd.mostCurrent._txtphone.runMethod(true,"setTextColor",usermd.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 149)),(Object)(BA.numberCast(int.class, 149)),(Object)(BA.numberCast(int.class, 149))));
 BA.debugLineNum = 176;BA.debugLine="imgEdit.Visible = True";
Debug.ShouldStop(32768);
usermd.mostCurrent._imgedit.runMethod(true,"setVisible",usermd.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 177;BA.debugLine="imgEdit.Enabled = True";
Debug.ShouldStop(65536);
usermd.mostCurrent._imgedit.runMethod(true,"setEnabled",usermd.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 178;BA.debugLine="imgSave.Visible = False";
Debug.ShouldStop(131072);
usermd.mostCurrent._imgsave.runMethod(true,"setVisible",usermd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 179;BA.debugLine="imgSave.Enabled = False";
Debug.ShouldStop(262144);
usermd.mostCurrent._imgsave.runMethod(true,"setEnabled",usermd.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 180;BA.debugLine="ToastMessageShow(\"Save Succesful!\", True)";
Debug.ShouldStop(524288);
usermd.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Save Succesful!")),(Object)(usermd.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("lblFund_Click (usermd) ","usermd",3,usermd.mostCurrent.activityBA,usermd.mostCurrent,108);
if (RapidSub.canDelegate("lblfund_click")) { return pdv.milotin.usermd.remoteMe.runUserSub(false, "usermd","lblfund_click");}
 BA.debugLineNum = 108;BA.debugLine="Private Sub lblFund_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="StartActivity(\"FundMd\")";
Debug.ShouldStop(4096);
usermd.mostCurrent.__c.runVoidMethod ("StartActivity",usermd.processBA,(Object)((RemoteObject.createImmutable("FundMd"))));
 BA.debugLineNum = 110;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
usermd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("lblHistory_Click (usermd) ","usermd",3,usermd.mostCurrent.activityBA,usermd.mostCurrent,113);
if (RapidSub.canDelegate("lblhistory_click")) { return pdv.milotin.usermd.remoteMe.runUserSub(false, "usermd","lblhistory_click");}
 BA.debugLineNum = 113;BA.debugLine="Private Sub lblHistory_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="StartActivity(\"HistoryMd\")";
Debug.ShouldStop(131072);
usermd.mostCurrent.__c.runVoidMethod ("StartActivity",usermd.processBA,(Object)((RemoteObject.createImmutable("HistoryMd"))));
 BA.debugLineNum = 115;BA.debugLine="Activity.Finish";
Debug.ShouldStop(262144);
usermd.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _lblhome_click() throws Exception{
try {
		Debug.PushSubsStack("lblHome_Click (usermd) ","usermd",3,usermd.mostCurrent.activityBA,usermd.mostCurrent,104);
if (RapidSub.canDelegate("lblhome_click")) { return pdv.milotin.usermd.remoteMe.runUserSub(false, "usermd","lblhome_click");}
 BA.debugLineNum = 104;BA.debugLine="Private Sub lblHome_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="Activity.Finish";
Debug.ShouldStop(256);
usermd.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 106;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("lblUser_Click (usermd) ","usermd",3,usermd.mostCurrent.activityBA,usermd.mostCurrent,118);
if (RapidSub.canDelegate("lbluser_click")) { return pdv.milotin.usermd.remoteMe.runUserSub(false, "usermd","lbluser_click");}
 BA.debugLineNum = 118;BA.debugLine="Private Sub lblUser_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 120;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}