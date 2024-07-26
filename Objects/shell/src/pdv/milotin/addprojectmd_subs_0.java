package pdv.milotin;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class addprojectmd_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (addprojectmd) ","addprojectmd",6,addprojectmd.mostCurrent.activityBA,addprojectmd.mostCurrent,60);
if (RapidSub.canDelegate("activity_create")) { return pdv.milotin.addprojectmd.remoteMe.runUserSub(false, "addprojectmd","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 60;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="Activity.LoadLayout(\"AddProjectLy\")";
Debug.ShouldStop(536870912);
addprojectmd.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("AddProjectLy")),addprojectmd.mostCurrent.activityBA);
 BA.debugLineNum = 64;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
Debug.ShouldStop(-2147483648);
addprojectmd.mostCurrent._shared = addprojectmd.mostCurrent._rp.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 65;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
Debug.ShouldStop(1);
addprojectmd.mostCurrent._kvs.runVoidMethod ("_initialize",addprojectmd.processBA,(Object)(addprojectmd.mostCurrent._shared),(Object)(RemoteObject.createImmutable("Userdatastore")));
 BA.debugLineNum = 67;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",addprojectmd.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(addprojectmd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("db.db"))),addprojectmd.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 68;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
Debug.ShouldStop(8);
addprojectmd.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(addprojectmd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("db.db")),(Object)(addprojectmd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("db.db")));
 };
 BA.debugLineNum = 71;BA.debugLine="If SQL1.IsInitialized = False Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",addprojectmd.mostCurrent._sql1.runMethod(true,"IsInitialized"),addprojectmd.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 72;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
Debug.ShouldStop(128);
addprojectmd.mostCurrent._sql1.runVoidMethod ("Initialize",(Object)(addprojectmd.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("db.db")),(Object)(addprojectmd.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Activity_Pause (addprojectmd) ","addprojectmd",6,addprojectmd.mostCurrent.activityBA,addprojectmd.mostCurrent,81);
if (RapidSub.canDelegate("activity_pause")) { return pdv.milotin.addprojectmd.remoteMe.runUserSub(false, "addprojectmd","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 81;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Activity_Resume (addprojectmd) ","addprojectmd",6,addprojectmd.mostCurrent.activityBA,addprojectmd.mostCurrent,77);
if (RapidSub.canDelegate("activity_resume")) { return pdv.milotin.addprojectmd.remoteMe.runUserSub(false, "addprojectmd","activity_resume");}
 BA.debugLineNum = 77;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4096);
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("btnClose_Click (addprojectmd) ","addprojectmd",6,addprojectmd.mostCurrent.activityBA,addprojectmd.mostCurrent,170);
if (RapidSub.canDelegate("btnclose_click")) { return pdv.milotin.addprojectmd.remoteMe.runUserSub(false, "addprojectmd","btnclose_click");}
 BA.debugLineNum = 170;BA.debugLine="Private Sub btnClose_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 172;BA.debugLine="If kvs.Get(\"Status\") = \"success\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",addprojectmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("Status"))),RemoteObject.createImmutable(("success")))) { 
 BA.debugLineNum = 173;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
addprojectmd.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 175;BA.debugLine="pnStatus.Visible = False";
Debug.ShouldStop(16384);
addprojectmd.mostCurrent._pnstatus.runMethod(true,"setVisible",addprojectmd.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnprojectsubmit_click() throws Exception{
try {
		Debug.PushSubsStack("btnProjectSubmit_Click (addprojectmd) ","addprojectmd",6,addprojectmd.mostCurrent.activityBA,addprojectmd.mostCurrent,165);
if (RapidSub.canDelegate("btnprojectsubmit_click")) { return pdv.milotin.addprojectmd.remoteMe.runUserSub(false, "addprojectmd","btnprojectsubmit_click");}
 BA.debugLineNum = 165;BA.debugLine="Private Sub btnProjectSubmit_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="PostAudit";
Debug.ShouldStop(32);
_postaudit();
 BA.debugLineNum = 167;BA.debugLine="pnBlackTransparent.Visible = True";
Debug.ShouldStop(64);
addprojectmd.mostCurrent._pnblacktransparent.runMethod(true,"setVisible",addprojectmd.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
addprojectmd.mostCurrent._kvs = RemoteObject.createNew ("b4a.example3.keyvaluestore");
 //BA.debugLineNum = 16;BA.debugLine="Private rp As RuntimePermissions";
addprojectmd.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 17;BA.debugLine="Private shared As String";
addprojectmd.mostCurrent._shared = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Private SQL1 As SQL";
addprojectmd.mostCurrent._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 19;BA.debugLine="Private pnHeader1 As Panel";
addprojectmd.mostCurrent._pnheader1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private lblBottom As Label";
addprojectmd.mostCurrent._lblbottom = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private lblHome As Label";
addprojectmd.mostCurrent._lblhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private lblFund As Label";
addprojectmd.mostCurrent._lblfund = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private lblHistory As Label";
addprojectmd.mostCurrent._lblhistory = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private lblUser As Label";
addprojectmd.mostCurrent._lbluser = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblHome2 As Label";
addprojectmd.mostCurrent._lblhome2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private lblFund2 As Label";
addprojectmd.mostCurrent._lblfund2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private lblHistory2 As Label";
addprojectmd.mostCurrent._lblhistory2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private lblUser2 As Label";
addprojectmd.mostCurrent._lbluser2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private pnFrame2 As Panel";
addprojectmd.mostCurrent._pnframe2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private lblAddTitle As Label";
addprojectmd.mostCurrent._lbladdtitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private lblLine4 As Label";
addprojectmd.mostCurrent._lblline4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private lblProjectName As Label";
addprojectmd.mostCurrent._lblprojectname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private pnProjectName As Panel";
addprojectmd.mostCurrent._pnprojectname = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private lblFundAmount As Label";
addprojectmd.mostCurrent._lblfundamount = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private pnSetFundAmount As Panel";
addprojectmd.mostCurrent._pnsetfundamount = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private pnContent As Panel";
addprojectmd.mostCurrent._pncontent = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private pnSetWalletAddress As Panel";
addprojectmd.mostCurrent._pnsetwalletaddress = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private lblContent As Label";
addprojectmd.mostCurrent._lblcontent = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private lblSetWalletAddress As Label";
addprojectmd.mostCurrent._lblsetwalletaddress = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private btnProjectSubmit As Button";
addprojectmd.mostCurrent._btnprojectsubmit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private txtProjectName As EditText";
addprojectmd.mostCurrent._txtprojectname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private txtSetFundAmount As EditText";
addprojectmd.mostCurrent._txtsetfundamount = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private txtContent As EditText";
addprojectmd.mostCurrent._txtcontent = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private txtSetWalletAddress As EditText";
addprojectmd.mostCurrent._txtsetwalletaddress = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private imgSetFundAmount As ImageView";
addprojectmd.mostCurrent._imgsetfundamount = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private imgProjectName As ImageView";
addprojectmd.mostCurrent._imgprojectname = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private imgContent As ImageView";
addprojectmd.mostCurrent._imgcontent = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private imgSetWalletAddress As ImageView";
addprojectmd.mostCurrent._imgsetwalletaddress = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private pnBlackTransparent As Panel";
addprojectmd.mostCurrent._pnblacktransparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private pnStatus As Panel";
addprojectmd.mostCurrent._pnstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private btnClose As Button";
addprojectmd.mostCurrent._btnclose = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private lblStatus As Label";
addprojectmd.mostCurrent._lblstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private imgStatus As ImageView";
addprojectmd.mostCurrent._imgstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private lblLine3 As Label";
addprojectmd.mostCurrent._lblline3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private lblTittle3 As Label";
addprojectmd.mostCurrent._lbltittle3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private imgClose2 As ImageView";
addprojectmd.mostCurrent._imgclose2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (addprojectmd) ","addprojectmd",6,addprojectmd.mostCurrent.activityBA,addprojectmd.mostCurrent,116);
if (RapidSub.canDelegate("jobdone")) { return pdv.milotin.addprojectmd.remoteMe.runUserSub(false, "addprojectmd","jobdone", _job);}
RemoteObject _jsonstring = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _status = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _transactionhash = RemoteObject.createImmutable("");
RemoteObject _nonce = RemoteObject.createImmutable(0);
RemoteObject _from = RemoteObject.createImmutable("");
RemoteObject _responsestatus = RemoteObject.createImmutable("");
RemoteObject _receipt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 116;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1048576);
addprojectmd.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 119;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(4194304);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 120;BA.debugLine="Dim jsonString As String = Job.GetString";
Debug.ShouldStop(8388608);
_jsonstring = _job.runClassMethod (pdv.milotin.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("jsonString", _jsonstring);Debug.locals.put("jsonString", _jsonstring);
 BA.debugLineNum = 121;BA.debugLine="Log(jsonString)";
Debug.ShouldStop(16777216);
addprojectmd.mostCurrent.__c.runVoidMethod ("LogImpl","55963781",_jsonstring,0);
 BA.debugLineNum = 123;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(67108864);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 124;BA.debugLine="parser.Initialize(jsonString)";
Debug.ShouldStop(134217728);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstring));
 BA.debugLineNum = 126;BA.debugLine="If Job.JobName = \"PostAuditProject\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("PostAuditProject"))) { 
 BA.debugLineNum = 127;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(1073741824);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 128;BA.debugLine="Dim status As Int = root.Get(\"status\")";
Debug.ShouldStop(-2147483648);
_status = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 129;BA.debugLine="Dim result As Map = root.Get(\"result\")";
Debug.ShouldStop(1);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_result = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 131;BA.debugLine="If status = 200 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_status,BA.numberCast(double.class, 200))) { 
 BA.debugLineNum = 132;BA.debugLine="Dim transactionHash As String = result.Get(\"tr";
Debug.ShouldStop(8);
_transactionhash = BA.ObjectToString(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("transactionHash")))));Debug.locals.put("transactionHash", _transactionhash);Debug.locals.put("transactionHash", _transactionhash);
 BA.debugLineNum = 133;BA.debugLine="Dim nonce As Int = result.Get(\"nonce\")";
Debug.ShouldStop(16);
_nonce = BA.numberCast(int.class, _result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nonce")))));Debug.locals.put("nonce", _nonce);Debug.locals.put("nonce", _nonce);
 BA.debugLineNum = 134;BA.debugLine="Dim from As String = result.Get(\"from\")";
Debug.ShouldStop(32);
_from = BA.ObjectToString(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("from")))));Debug.locals.put("from", _from);Debug.locals.put("from", _from);
 BA.debugLineNum = 135;BA.debugLine="Dim responseStatus As String = result.Get(\"sta";
Debug.ShouldStop(64);
_responsestatus = BA.ObjectToString(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("responseStatus", _responsestatus);Debug.locals.put("responseStatus", _responsestatus);
 BA.debugLineNum = 136;BA.debugLine="Dim receipt As Map = result.Get(\"receipt\")";
Debug.ShouldStop(128);
_receipt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_receipt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("receipt")))));Debug.locals.put("receipt", _receipt);Debug.locals.put("receipt", _receipt);
 BA.debugLineNum = 139;BA.debugLine="Log(\"Transaction Hash: \" & transactionHash)";
Debug.ShouldStop(1024);
addprojectmd.mostCurrent.__c.runVoidMethod ("LogImpl","55963799",RemoteObject.concat(RemoteObject.createImmutable("Transaction Hash: "),_transactionhash),0);
 BA.debugLineNum = 140;BA.debugLine="Log(\"Nonce: \" & nonce)";
Debug.ShouldStop(2048);
addprojectmd.mostCurrent.__c.runVoidMethod ("LogImpl","55963800",RemoteObject.concat(RemoteObject.createImmutable("Nonce: "),_nonce),0);
 BA.debugLineNum = 141;BA.debugLine="Log(\"From: \" & from)";
Debug.ShouldStop(4096);
addprojectmd.mostCurrent.__c.runVoidMethod ("LogImpl","55963801",RemoteObject.concat(RemoteObject.createImmutable("From: "),_from),0);
 BA.debugLineNum = 142;BA.debugLine="Log(\"Status: \" & responseStatus)";
Debug.ShouldStop(8192);
addprojectmd.mostCurrent.__c.runVoidMethod ("LogImpl","55963802",RemoteObject.concat(RemoteObject.createImmutable("Status: "),_responsestatus),0);
 BA.debugLineNum = 143;BA.debugLine="Log(\"Receipt: \" & receipt)";
Debug.ShouldStop(16384);
addprojectmd.mostCurrent.__c.runVoidMethod ("LogImpl","55963803",RemoteObject.concat(RemoteObject.createImmutable("Receipt: "),_receipt),0);
 BA.debugLineNum = 144;BA.debugLine="pnBlackTransparent.Visible = True";
Debug.ShouldStop(32768);
addprojectmd.mostCurrent._pnblacktransparent.runMethod(true,"setVisible",addprojectmd.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 145;BA.debugLine="pnStatus.Visible = True";
Debug.ShouldStop(65536);
addprojectmd.mostCurrent._pnstatus.runMethod(true,"setVisible",addprojectmd.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 149;BA.debugLine="Log(\"Failed to post the job\")";
Debug.ShouldStop(1048576);
addprojectmd.mostCurrent.__c.runVoidMethod ("LogImpl","55963809",RemoteObject.createImmutable("Failed to post the job"),0);
 };
 }else {
 BA.debugLineNum = 153;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(16777216);
addprojectmd.mostCurrent.__c.runVoidMethod ("LogImpl","55963813",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 };
 }else {
 BA.debugLineNum = 157;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(268435456);
addprojectmd.mostCurrent.__c.runVoidMethod ("LogImpl","55963817",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 };
 BA.debugLineNum = 161;BA.debugLine="Job.Release";
Debug.ShouldStop(1);
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
public static RemoteObject  _postaudit() throws Exception{
try {
		Debug.PushSubsStack("PostAudit (addprojectmd) ","addprojectmd",6,addprojectmd.mostCurrent.activityBA,addprojectmd.mostCurrent,85);
if (RapidSub.canDelegate("postaudit")) { return pdv.milotin.addprojectmd.remoteMe.runUserSub(false, "addprojectmd","postaudit");}
RemoteObject _postauditproject = RemoteObject.declareNull("pdv.milotin.httpjob");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _metadata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
 BA.debugLineNum = 85;BA.debugLine="Sub PostAudit";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="Dim PostAuditProject As HttpJob";
Debug.ShouldStop(2097152);
_postauditproject = RemoteObject.createNew ("pdv.milotin.httpjob");Debug.locals.put("PostAuditProject", _postauditproject);
 BA.debugLineNum = 87;BA.debugLine="PostAuditProject.Initialize(\"PostAuditProject\", M";
Debug.ShouldStop(4194304);
_postauditproject.runClassMethod (pdv.milotin.httpjob.class, "_initialize" /*RemoteObject*/ ,addprojectmd.processBA,(Object)(BA.ObjectToString("PostAuditProject")),(Object)(addprojectmd.getObject()));
 BA.debugLineNum = 90;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(33554432);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 91;BA.debugLine="Dim data As Map";
Debug.ShouldStop(67108864);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("data", _data);
 BA.debugLineNum = 92;BA.debugLine="data.Initialize";
Debug.ShouldStop(134217728);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 93;BA.debugLine="data.Put(\"contract_address\", kvs.Get(\"audit-contr";
Debug.ShouldStop(268435456);
_data.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("contract_address"))),(Object)(addprojectmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("audit-contract")))));
 BA.debugLineNum = 94;BA.debugLine="data.Put(\"wallet_address\", txtSetWalletAddress.Te";
Debug.ShouldStop(536870912);
_data.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("wallet_address"))),(Object)((addprojectmd.mostCurrent._txtsetwalletaddress.runMethod(true,"getText"))));
 BA.debugLineNum = 96;BA.debugLine="data.Put(\"callback_url\", \"https://\")";
Debug.ShouldStop(-2147483648);
_data.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("callback_url"))),(Object)((RemoteObject.createImmutable("https://"))));
 BA.debugLineNum = 97;BA.debugLine="Dim metadata As Map";
Debug.ShouldStop(1);
_metadata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("metadata", _metadata);
 BA.debugLineNum = 98;BA.debugLine="metadata.Initialize";
Debug.ShouldStop(2);
_metadata.runVoidMethod ("Initialize");
 BA.debugLineNum = 99;BA.debugLine="metadata.Put(\"project\", txtProjectName.Text)";
Debug.ShouldStop(4);
_metadata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("project"))),(Object)((addprojectmd.mostCurrent._txtprojectname.runMethod(true,"getText"))));
 BA.debugLineNum = 100;BA.debugLine="metadata.Put(\"fund\", txtSetFundAmount.Text)";
Debug.ShouldStop(8);
_metadata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fund"))),(Object)((addprojectmd.mostCurrent._txtsetfundamount.runMethod(true,"getText"))));
 BA.debugLineNum = 101;BA.debugLine="metadata.Put(\"content\", txtContent.Text)";
Debug.ShouldStop(16);
_metadata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("content"))),(Object)((addprojectmd.mostCurrent._txtcontent.runMethod(true,"getText"))));
 BA.debugLineNum = 102;BA.debugLine="data.Put(\"metadata\", metadata)";
Debug.ShouldStop(32);
_data.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("metadata"))),(Object)((_metadata.getObject())));
 BA.debugLineNum = 103;BA.debugLine="json.Initialize(data)";
Debug.ShouldStop(64);
_json.runVoidMethod ("Initialize",(Object)(_data));
 BA.debugLineNum = 106;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
Debug.ShouldStop(512);
_url = BA.ObjectToString("https://service-testnet.maschain.com/api/audit/audit/");Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 107;BA.debugLine="PostAuditProject.PostString(url, json.ToString)";
Debug.ShouldStop(1024);
_postauditproject.runClassMethod (pdv.milotin.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_url),(Object)(_json.runMethod(true,"ToString")));
 BA.debugLineNum = 108;BA.debugLine="PostAuditProject.GetRequest.SetContentType(\"appli";
Debug.ShouldStop(2048);
_postauditproject.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 109;BA.debugLine="PostAuditProject.GetRequest.SetHeader(\"client_id\"";
Debug.ShouldStop(4096);
_postauditproject.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_id")),(Object)(BA.ObjectToString(addprojectmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_id"))))));
 BA.debugLineNum = 110;BA.debugLine="PostAuditProject.GetRequest.SetHeader(\"client_sec";
Debug.ShouldStop(8192);
_postauditproject.runClassMethod (pdv.milotin.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("client_secret")),(Object)(BA.ObjectToString(addprojectmd.mostCurrent._kvs.runMethod(false,"_get",(Object)(RemoteObject.createImmutable("client_secret"))))));
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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