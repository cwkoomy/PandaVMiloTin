package pdv.milotin;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cameraexclass_subs_0 {


public static RemoteObject  _camera_focusdone(RemoteObject __ref,RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("Camera_FocusDone (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,289);
if (RapidSub.canDelegate("camera_focusdone")) { return __ref.runUserSub(false, "cameraexclass","camera_focusdone", __ref, _success);}
Debug.locals.put("Success", _success);
 BA.debugLineNum = 289;BA.debugLine="Private Sub Camera_FocusDone (Success As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 290;BA.debugLine="If Success Then";
Debug.ShouldStop(2);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 291;BA.debugLine="TakePicture";
Debug.ShouldStop(4);
__ref.runClassMethod (pdv.milotin.cameraexclass.class, "_takepicture" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 293;BA.debugLine="Log(\"AutoFocus error.\")";
Debug.ShouldStop(16);
cameraexclass.__c.runVoidMethod ("LogImpl","48716292",RemoteObject.createImmutable("AutoFocus error."),0);
 };
 BA.debugLineNum = 295;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _camera_picturetaken(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("Camera_PictureTaken (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("camera_picturetaken")) { return __ref.runUserSub(false, "cameraexclass","camera_picturetaken", __ref, _data);}
Debug.locals.put("Data", _data);
 BA.debugLineNum = 103;BA.debugLine="Private Sub Camera_PictureTaken (Data() As Byte)";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="CallSub2(target, event & \"_PictureTaken\", Data)";
Debug.ShouldStop(128);
cameraexclass.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_PictureTaken"))),(Object)((_data)));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _camera_preview(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("Camera_Preview (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("camera_preview")) { return __ref.runUserSub(false, "cameraexclass","camera_preview", __ref, _data);}
Debug.locals.put("Data", _data);
 BA.debugLineNum = 94;BA.debugLine="Sub Camera_Preview (Data() As Byte)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="If SubExists(target, event & \"_preview\") Then";
Debug.ShouldStop(1073741824);
if (cameraexclass.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_preview")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 96;BA.debugLine="CallSub2(target, event & \"_preview\", Data)";
Debug.ShouldStop(-2147483648);
cameraexclass.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_preview"))),(Object)((_data)));
 };
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _camera_ready(RemoteObject __ref,RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("Camera_Ready (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("camera_ready")) { return __ref.runUserSub(false, "cameraexclass","camera_ready", __ref, _success);}
Debug.locals.put("Success", _success);
 BA.debugLineNum = 81;BA.debugLine="Private Sub Camera_Ready (Success As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="If Success Then";
Debug.ShouldStop(131072);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 83;BA.debugLine="r.target = cam";
Debug.ShouldStop(262144);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",(__ref.getField(false,"_cam" /*RemoteObject*/ )));
 BA.debugLineNum = 84;BA.debugLine="nativeCam = r.GetField(\"camera\")";
Debug.ShouldStop(524288);
__ref.setField ("_nativecam" /*RemoteObject*/ ,__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("camera"))));
 BA.debugLineNum = 85;BA.debugLine="r.target = nativeCam";
Debug.ShouldStop(1048576);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_nativecam" /*RemoteObject*/ ));
 BA.debugLineNum = 86;BA.debugLine="parameters = r.RunMethod(\"getParameters\")";
Debug.ShouldStop(2097152);
__ref.setField ("_parameters" /*RemoteObject*/ ,__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getParameters"))));
 BA.debugLineNum = 87;BA.debugLine="SetDisplayOrientation";
Debug.ShouldStop(4194304);
__ref.runClassMethod (pdv.milotin.cameraexclass.class, "_setdisplayorientation" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 89;BA.debugLine="Log(\"success = false, \" & LastException)";
Debug.ShouldStop(16777216);
cameraexclass.__c.runVoidMethod ("LogImpl","46815752",RemoteObject.concat(RemoteObject.createImmutable("success = false, "),cameraexclass.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 91;BA.debugLine="CallSub2(target, event & \"_ready\", Success)";
Debug.ShouldStop(67108864);
cameraexclass.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_ready"))),(Object)((_success)));
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private nativeCam As Object";
cameraexclass._nativecam = RemoteObject.createNew ("Object");__ref.setField("_nativecam",cameraexclass._nativecam);
 //BA.debugLineNum = 8;BA.debugLine="Private cam As Camera";
cameraexclass._cam = RemoteObject.createNew ("anywheresoftware.b4a.objects.CameraW");__ref.setField("_cam",cameraexclass._cam);
 //BA.debugLineNum = 9;BA.debugLine="Private r As Reflector";
cameraexclass._r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");__ref.setField("_r",cameraexclass._r);
 //BA.debugLineNum = 10;BA.debugLine="Private target As Object";
cameraexclass._target = RemoteObject.createNew ("Object");__ref.setField("_target",cameraexclass._target);
 //BA.debugLineNum = 11;BA.debugLine="Private event As String";
cameraexclass._event = RemoteObject.createImmutable("");__ref.setField("_event",cameraexclass._event);
 //BA.debugLineNum = 12;BA.debugLine="Public Front As Boolean";
cameraexclass._front = RemoteObject.createImmutable(false);__ref.setField("_front",cameraexclass._front);
 //BA.debugLineNum = 13;BA.debugLine="Type CameraInfoAndId (CameraInfo As Object, Id As";
;
 //BA.debugLineNum = 14;BA.debugLine="Type CameraSize (Width As Int, Height As Int)";
;
 //BA.debugLineNum = 15;BA.debugLine="Private parameters As Object";
cameraexclass._parameters = RemoteObject.createNew ("Object");__ref.setField("_parameters",cameraexclass._parameters);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _closenow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CloseNow (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,280);
if (RapidSub.canDelegate("closenow")) { return __ref.runUserSub(false, "cameraexclass","closenow", __ref);}
 BA.debugLineNum = 280;BA.debugLine="Public Sub CloseNow";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 281;BA.debugLine="cam.Release";
Debug.ShouldStop(16777216);
__ref.getField(false,"_cam" /*RemoteObject*/ ).runVoidMethod ("Release");
 BA.debugLineNum = 282;BA.debugLine="r.target = cam";
Debug.ShouldStop(33554432);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",(__ref.getField(false,"_cam" /*RemoteObject*/ )));
 BA.debugLineNum = 283;BA.debugLine="r.RunMethod2(\"releaseCameras\", True, \"java.lang.b";
Debug.ShouldStop(67108864);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("releaseCameras")),(Object)(BA.ObjectToString(cameraexclass.__c.getField(true,"True"))),(Object)(RemoteObject.createImmutable("java.lang.boolean")));
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _commitparameters(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CommitParameters (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("commitparameters")) { return __ref.runUserSub(false, "cameraexclass","commitparameters", __ref);}
 BA.debugLineNum = 136;BA.debugLine="Public Sub CommitParameters";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 138;BA.debugLine="r.target = nativeCam";
Debug.ShouldStop(512);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_nativecam" /*RemoteObject*/ ));
 BA.debugLineNum = 139;BA.debugLine="r.RunMethod4(\"setParameters\", Array As Object(pa";
Debug.ShouldStop(1024);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setParameters")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_parameters" /*RemoteObject*/ )})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("android.hardware.Camera$Parameters")})));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 141;BA.debugLine="ToastMessageShow(\"Error setting parameters.\", Tr";
Debug.ShouldStop(4096);
cameraexclass.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Error setting parameters.")),(Object)(cameraexclass.__c.getField(true,"True")));
 BA.debugLineNum = 142;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
cameraexclass.__c.runVoidMethod ("LogImpl","47471110",BA.ObjectToString(cameraexclass.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
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
public static RemoteObject  _findcamera(RemoteObject __ref,RemoteObject _frontcamera) throws Exception{
try {
		Debug.PushSubsStack("FindCamera (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("findcamera")) { return __ref.runUserSub(false, "cameraexclass","findcamera", __ref, _frontcamera);}
RemoteObject _ci = RemoteObject.declareNull("pdv.milotin.cameraexclass._camerainfoandid");
RemoteObject _camerainfo = RemoteObject.declareNull("Object");
RemoteObject _cameravalue = RemoteObject.createImmutable(0);
RemoteObject _numberofcameras = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("frontCamera", _frontcamera);
 BA.debugLineNum = 35;BA.debugLine="Private Sub FindCamera (frontCamera As Boolean) As";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Dim ci As CameraInfoAndId";
Debug.ShouldStop(8);
_ci = RemoteObject.createNew ("pdv.milotin.cameraexclass._camerainfoandid");Debug.locals.put("ci", _ci);
 BA.debugLineNum = 37;BA.debugLine="Dim cameraInfo As Object";
Debug.ShouldStop(16);
_camerainfo = RemoteObject.createNew ("Object");Debug.locals.put("cameraInfo", _camerainfo);
 BA.debugLineNum = 38;BA.debugLine="Dim cameraValue As Int";
Debug.ShouldStop(32);
_cameravalue = RemoteObject.createImmutable(0);Debug.locals.put("cameraValue", _cameravalue);
 BA.debugLineNum = 39;BA.debugLine="If frontCamera Then cameraValue = 1 Else cameraVa";
Debug.ShouldStop(64);
if (_frontcamera.<Boolean>get().booleanValue()) { 
_cameravalue = BA.numberCast(int.class, 1);Debug.locals.put("cameraValue", _cameravalue);}
else {
_cameravalue = BA.numberCast(int.class, 0);Debug.locals.put("cameraValue", _cameravalue);};
 BA.debugLineNum = 40;BA.debugLine="cameraInfo = r.CreateObject(\"android.hardware.Cam";
Debug.ShouldStop(128);
_camerainfo = __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"CreateObject",(Object)(RemoteObject.createImmutable("android.hardware.Camera$CameraInfo")));Debug.locals.put("cameraInfo", _camerainfo);
 BA.debugLineNum = 41;BA.debugLine="Dim numberOfCameras As Int = r.RunStaticMethod(\"a";
Debug.ShouldStop(256);
_numberofcameras = BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunStaticMethod",(Object)(BA.ObjectToString("android.hardware.Camera")),(Object)(BA.ObjectToString("getNumberOfCameras")),(Object)((cameraexclass.__c.getField(false,"Null"))),(Object)((cameraexclass.__c.getField(false,"Null")))));Debug.locals.put("numberOfCameras", _numberofcameras);Debug.locals.put("numberOfCameras", _numberofcameras);
 BA.debugLineNum = 42;BA.debugLine="For i = 0 To numberOfCameras - 1";
Debug.ShouldStop(512);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_numberofcameras,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 43;BA.debugLine="r.RunStaticMethod(\"android.hardware.Camera\", \"ge";
Debug.ShouldStop(1024);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunStaticMethod",(Object)(BA.ObjectToString("android.hardware.Camera")),(Object)(BA.ObjectToString("getCameraInfo")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable((_i)),_camerainfo})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("android.hardware.Camera$CameraInfo")})));
 BA.debugLineNum = 45;BA.debugLine="r.target = cameraInfo";
Debug.ShouldStop(4096);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",_camerainfo);
 BA.debugLineNum = 46;BA.debugLine="If r.GetField(\"facing\") = cameraValue Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("facing"))),(_cameravalue))) { 
 BA.debugLineNum = 47;BA.debugLine="ci.cameraInfo = r.target";
Debug.ShouldStop(16384);
_ci.setField ("CameraInfo" /*RemoteObject*/ ,__ref.getField(false,"_r" /*RemoteObject*/ ).getField(false,"Target"));
 BA.debugLineNum = 48;BA.debugLine="ci.Id = i";
Debug.ShouldStop(32768);
_ci.setField ("Id" /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 BA.debugLineNum = 49;BA.debugLine="Return ci";
Debug.ShouldStop(65536);
if (true) return _ci;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 52;BA.debugLine="ci.id = -1";
Debug.ShouldStop(524288);
_ci.setField ("Id" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 53;BA.debugLine="Return ci";
Debug.ShouldStop(1048576);
if (true) return _ci;
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _focusandtakepicture(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FocusAndTakePicture (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,286);
if (RapidSub.canDelegate("focusandtakepicture")) { return __ref.runUserSub(false, "cameraexclass","focusandtakepicture", __ref);}
 BA.debugLineNum = 286;BA.debugLine="Public Sub FocusAndTakePicture";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 287;BA.debugLine="cam.AutoFocus";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_cam" /*RemoteObject*/ ).runVoidMethod ("AutoFocus");
 BA.debugLineNum = 288;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcoloreffect(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetColorEffect (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("getcoloreffect")) { return __ref.runUserSub(false, "cameraexclass","getcoloreffect", __ref);}
 BA.debugLineNum = 146;BA.debugLine="Public Sub GetColorEffect As String";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="Return GetParameter(\"effect\")";
Debug.ShouldStop(262144);
if (true) return __ref.runClassMethod (pdv.milotin.cameraexclass.class, "_getparameter" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("effect")));
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getflashmode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetFlashMode (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("getflashmode")) { return __ref.runUserSub(false, "cameraexclass","getflashmode", __ref);}
 BA.debugLineNum = 181;BA.debugLine="Public Sub GetFlashMode As String";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 182;BA.debugLine="r.target = parameters";
Debug.ShouldStop(2097152);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 183;BA.debugLine="Return r.RunMethod(\"getFlashMode\")";
Debug.ShouldStop(4194304);
if (true) return BA.ObjectToString(__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getFlashMode"))));
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfocusdistances(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetFocusDistances (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,272);
if (RapidSub.canDelegate("getfocusdistances")) { return __ref.runUserSub(false, "cameraexclass","getfocusdistances", __ref);}
RemoteObject _f = null;
 BA.debugLineNum = 272;BA.debugLine="Public Sub GetFocusDistances As Float()";
Debug.ShouldStop(32768);
 BA.debugLineNum = 273;BA.debugLine="Dim F(3) As Float";
Debug.ShouldStop(65536);
_f = RemoteObject.createNewArray ("float", new int[] {3}, new Object[]{});Debug.locals.put("F", _f);
 BA.debugLineNum = 274;BA.debugLine="r.target = parameters";
Debug.ShouldStop(131072);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 275;BA.debugLine="r.RunMethod4(\"getFocusDistances\", Array As Object";
Debug.ShouldStop(262144);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("getFocusDistances")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_f)})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("[F")})));
 BA.debugLineNum = 276;BA.debugLine="Return F";
Debug.ShouldStop(524288);
if (true) return _f;
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getparameter(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("GetParameter (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("getparameter")) { return __ref.runUserSub(false, "cameraexclass","getparameter", __ref, _key);}
Debug.locals.put("Key", _key);
 BA.debugLineNum = 131;BA.debugLine="Public Sub GetParameter(Key As String) As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="r.target = parameters";
Debug.ShouldStop(8);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 133;BA.debugLine="Return r.RunMethod2(\"get\", Key, \"java.lang.String";
Debug.ShouldStop(16);
if (true) return BA.ObjectToString(__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("get")),(Object)(_key),(Object)(RemoteObject.createImmutable("java.lang.String"))));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpicturesize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetPictureSize (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,205);
if (RapidSub.canDelegate("getpicturesize")) { return __ref.runUserSub(false, "cameraexclass","getpicturesize", __ref);}
RemoteObject _cs = RemoteObject.declareNull("pdv.milotin.cameraexclass._camerasize");
 BA.debugLineNum = 205;BA.debugLine="Public Sub GetPictureSize As CameraSize";
Debug.ShouldStop(4096);
 BA.debugLineNum = 206;BA.debugLine="r.target = parameters";
Debug.ShouldStop(8192);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 207;BA.debugLine="r.target = r.RunMethod(\"getPictureSize\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getPictureSize"))));
 BA.debugLineNum = 208;BA.debugLine="Dim cs As CameraSize";
Debug.ShouldStop(32768);
_cs = RemoteObject.createNew ("pdv.milotin.cameraexclass._camerasize");Debug.locals.put("cs", _cs);
 BA.debugLineNum = 209;BA.debugLine="cs.Width = r.GetField(\"width\")";
Debug.ShouldStop(65536);
_cs.setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("width")))));
 BA.debugLineNum = 210;BA.debugLine="cs.Height = r.GetField(\"height\")";
Debug.ShouldStop(131072);
_cs.setField ("Height" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("height")))));
 BA.debugLineNum = 211;BA.debugLine="Return cs";
Debug.ShouldStop(262144);
if (true) return _cs;
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpreviewsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetPreviewSize (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("getpreviewsize")) { return __ref.runUserSub(false, "cameraexclass","getpreviewsize", __ref);}
RemoteObject _cs = RemoteObject.declareNull("pdv.milotin.cameraexclass._camerasize");
 BA.debugLineNum = 196;BA.debugLine="Public Sub GetPreviewSize As CameraSize";
Debug.ShouldStop(8);
 BA.debugLineNum = 197;BA.debugLine="r.target = parameters";
Debug.ShouldStop(16);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 198;BA.debugLine="r.target = r.RunMethod(\"getPreviewSize\")";
Debug.ShouldStop(32);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getPreviewSize"))));
 BA.debugLineNum = 199;BA.debugLine="Dim cs As CameraSize";
Debug.ShouldStop(64);
_cs = RemoteObject.createNew ("pdv.milotin.cameraexclass._camerasize");Debug.locals.put("cs", _cs);
 BA.debugLineNum = 200;BA.debugLine="cs.Width = r.GetField(\"width\")";
Debug.ShouldStop(128);
_cs.setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("width")))));
 BA.debugLineNum = 201;BA.debugLine="cs.Height = r.GetField(\"height\")";
Debug.ShouldStop(256);
_cs.setField ("Height" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("height")))));
 BA.debugLineNum = 202;BA.debugLine="Return cs";
Debug.ShouldStop(512);
if (true) return _cs;
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedcoloreffects(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSupportedColorEffects (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("getsupportedcoloreffects")) { return __ref.runUserSub(false, "cameraexclass","getsupportedcoloreffects", __ref);}
 BA.debugLineNum = 191;BA.debugLine="Public Sub GetSupportedColorEffects As List";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="r.target = parameters";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 193;BA.debugLine="Return r.RunMethod(\"getSupportedColorEffects\")";
Debug.ShouldStop(1);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getSupportedColorEffects"))));
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedflashmodes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSupportedFlashModes (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("getsupportedflashmodes")) { return __ref.runUserSub(false, "cameraexclass","getsupportedflashmodes", __ref);}
 BA.debugLineNum = 186;BA.debugLine="Public Sub GetSupportedFlashModes As List";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 187;BA.debugLine="r.target = parameters";
Debug.ShouldStop(67108864);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 188;BA.debugLine="Return r.RunMethod(\"getSupportedFlashModes\")";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getSupportedFlashModes"))));
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedfocusmodes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSupportedFocusModes (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,237);
if (RapidSub.canDelegate("getsupportedfocusmodes")) { return __ref.runUserSub(false, "cameraexclass","getsupportedfocusmodes", __ref);}
RemoteObject _fm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 237;BA.debugLine="Public Sub GetSupportedFocusModes As List";
Debug.ShouldStop(4096);
 BA.debugLineNum = 238;BA.debugLine="r.target = parameters";
Debug.ShouldStop(8192);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 239;BA.debugLine="Dim fm As List";
Debug.ShouldStop(16384);
_fm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("fm", _fm);
 BA.debugLineNum = 240;BA.debugLine="fm.initialize";
Debug.ShouldStop(32768);
_fm.runVoidMethod ("Initialize");
 BA.debugLineNum = 241;BA.debugLine="fm=r.RunMethod(\"getSupportedFocusModes\")";
Debug.ShouldStop(65536);
_fm = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getSupportedFocusModes"))));Debug.locals.put("fm", _fm);
 BA.debugLineNum = 242;BA.debugLine="If fm.Get(0)=\"auto\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_fm.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable(("auto")))) { 
 BA.debugLineNum = 243;BA.debugLine="FocusAndTakePicture";
Debug.ShouldStop(262144);
__ref.runClassMethod (pdv.milotin.cameraexclass.class, "_focusandtakepicture" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 245;BA.debugLine="TakePicture";
Debug.ShouldStop(1048576);
__ref.runClassMethod (pdv.milotin.cameraexclass.class, "_takepicture" /*RemoteObject*/ );
 };
 BA.debugLineNum = 247;BA.debugLine="Return r.RunMethod(\"getSupportedFocusModes\")";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getSupportedFocusModes"))));
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedpicturessizes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSupportedPicturesSizes (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,154);
if (RapidSub.canDelegate("getsupportedpicturessizes")) { return __ref.runUserSub(false, "cameraexclass","getsupportedpicturessizes", __ref);}
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cs = null;
int _i = 0;
 BA.debugLineNum = 154;BA.debugLine="Public Sub GetSupportedPicturesSizes As CameraSize";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 155;BA.debugLine="r.target = parameters";
Debug.ShouldStop(67108864);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 156;BA.debugLine="Dim list1 As List = r.RunMethod(\"getSupportedPict";
Debug.ShouldStop(134217728);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_list1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getSupportedPictureSizes"))));Debug.locals.put("list1", _list1);Debug.locals.put("list1", _list1);
 BA.debugLineNum = 157;BA.debugLine="Dim cs(list1.Size) As CameraSize";
Debug.ShouldStop(268435456);
_cs = RemoteObject.createNewArray ("pdv.milotin.cameraexclass._camerasize", new int[] {_list1.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("cs", _cs);
 BA.debugLineNum = 158;BA.debugLine="For i = 0 To list1.Size - 1";
Debug.ShouldStop(536870912);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 159;BA.debugLine="r.target = list1.Get(i)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 160;BA.debugLine="cs(i).Width = r.GetField(\"width\")";
Debug.ShouldStop(-2147483648);
_cs.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("width")))));
 BA.debugLineNum = 161;BA.debugLine="cs(i).Height = r.GetField(\"height\")";
Debug.ShouldStop(1);
_cs.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, _i)).setField ("Height" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("height")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 163;BA.debugLine="Return cs";
Debug.ShouldStop(4);
if (true) return _cs;
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _panel1,RemoteObject _frontcamera,RemoteObject _targetmodule,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cameraexclass","initialize", __ref, _ba, _panel1, _frontcamera, _targetmodule, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _id = RemoteObject.createImmutable(0);
Debug.locals.put("ba", _ba);
Debug.locals.put("Panel1", _panel1);
Debug.locals.put("FrontCamera", _frontcamera);
Debug.locals.put("TargetModule", _targetmodule);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize (Panel1 As Panel, FrontCamer";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="target = TargetModule";
Debug.ShouldStop(262144);
__ref.setField ("_target" /*RemoteObject*/ ,_targetmodule);
 BA.debugLineNum = 20;BA.debugLine="event = EventName";
Debug.ShouldStop(524288);
__ref.setField ("_event" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 21;BA.debugLine="Front = FrontCamera";
Debug.ShouldStop(1048576);
__ref.setField ("_front" /*RemoteObject*/ ,_frontcamera);
 BA.debugLineNum = 22;BA.debugLine="Dim id As Int";
Debug.ShouldStop(2097152);
_id = RemoteObject.createImmutable(0);Debug.locals.put("id", _id);
 BA.debugLineNum = 23;BA.debugLine="id = FindCamera(Front).id";
Debug.ShouldStop(4194304);
_id = __ref.runClassMethod (pdv.milotin.cameraexclass.class, "_findcamera" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_front" /*RemoteObject*/ ))).getField(true,"Id" /*RemoteObject*/ );Debug.locals.put("id", _id);
 BA.debugLineNum = 24;BA.debugLine="If id = -1 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_id,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 25;BA.debugLine="Front = Not(Front) 'try different camera";
Debug.ShouldStop(16777216);
__ref.setField ("_front" /*RemoteObject*/ ,cameraexclass.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_front" /*RemoteObject*/ ))));
 BA.debugLineNum = 26;BA.debugLine="id = FindCamera(Front).id";
Debug.ShouldStop(33554432);
_id = __ref.runClassMethod (pdv.milotin.cameraexclass.class, "_findcamera" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_front" /*RemoteObject*/ ))).getField(true,"Id" /*RemoteObject*/ );Debug.locals.put("id", _id);
 BA.debugLineNum = 27;BA.debugLine="If id = -1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_id,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 28;BA.debugLine="ToastMessageShow(\"No camera found.\", True)";
Debug.ShouldStop(134217728);
cameraexclass.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No camera found.")),(Object)(cameraexclass.__c.getField(true,"True")));
 BA.debugLineNum = 29;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 32;BA.debugLine="cam.Initialize2(Panel1, \"camera\", id)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_cam" /*RemoteObject*/ ).runVoidMethod ("Initialize2",__ref.getField(false, "ba"),(Object)((_panel1.getObject())),(Object)(BA.ObjectToString("camera")),(Object)(_id));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _previewimagetojpeg(RemoteObject __ref,RemoteObject _data,RemoteObject _quality) throws Exception{
try {
		Debug.PushSubsStack("PreviewImageToJpeg (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("previewimagetojpeg")) { return __ref.runUserSub(false, "cameraexclass","previewimagetojpeg", __ref, _data, _quality);}
RemoteObject _size = RemoteObject.declareNull("Object");
RemoteObject _previewformat = RemoteObject.declareNull("Object");
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _yuvimage = RemoteObject.declareNull("Object");
RemoteObject _rect1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("data", _data);
Debug.locals.put("quality", _quality);
 BA.debugLineNum = 216;BA.debugLine="Public Sub PreviewImageToJpeg(data() As Byte, qual";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="Dim size, previewFormat As Object";
Debug.ShouldStop(16777216);
_size = RemoteObject.createNew ("Object");Debug.locals.put("size", _size);
_previewformat = RemoteObject.createNew ("Object");Debug.locals.put("previewFormat", _previewformat);
 BA.debugLineNum = 218;BA.debugLine="r.target = parameters";
Debug.ShouldStop(33554432);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 219;BA.debugLine="size = r.RunMethod(\"getPreviewSize\")";
Debug.ShouldStop(67108864);
_size = __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getPreviewSize")));Debug.locals.put("size", _size);
 BA.debugLineNum = 220;BA.debugLine="previewFormat = r.RunMethod(\"getPreviewFormat\")";
Debug.ShouldStop(134217728);
_previewformat = __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getPreviewFormat")));Debug.locals.put("previewFormat", _previewformat);
 BA.debugLineNum = 221;BA.debugLine="r.target = size";
Debug.ShouldStop(268435456);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",_size);
 BA.debugLineNum = 222;BA.debugLine="Dim width = r.GetField(\"width\"), height = r.GetFi";
Debug.ShouldStop(536870912);
_width = BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("width"))));Debug.locals.put("width", _width);Debug.locals.put("width", _width);
_height = BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("height"))));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 223;BA.debugLine="Dim yuvImage As Object = r.CreateObject2(\"android";
Debug.ShouldStop(1073741824);
_yuvimage = __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"CreateObject2",(Object)(BA.ObjectToString("android.graphics.YuvImage")),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_data),_previewformat,(_width),(_height),cameraexclass.__c.getField(false,"Null")})),(Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString("[B"),BA.ObjectToString("java.lang.int"),BA.ObjectToString("java.lang.int"),BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("[I")})));Debug.locals.put("yuvImage", _yuvimage);Debug.locals.put("yuvImage", _yuvimage);
 BA.debugLineNum = 226;BA.debugLine="r.target = yuvImage";
Debug.ShouldStop(2);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",_yuvimage);
 BA.debugLineNum = 227;BA.debugLine="Dim rect1 As Rect";
Debug.ShouldStop(4);
_rect1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("rect1", _rect1);
 BA.debugLineNum = 228;BA.debugLine="rect1.Initialize(0, 0, r.RunMethod(\"getWidth\"), r";
Debug.ShouldStop(8);
_rect1.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getWidth"))))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getHeight"))))));
 BA.debugLineNum = 229;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(16);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 230;BA.debugLine="out.InitializeToBytesArray(100)";
Debug.ShouldStop(32);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 100)));
 BA.debugLineNum = 231;BA.debugLine="r.RunMethod4(\"compressToJpeg\", Array As Object(re";
Debug.ShouldStop(64);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("compressToJpeg")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_rect1.getObject()),(_quality),(_out.getObject())})),(Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("android.graphics.Rect"),BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.io.OutputStream")})));
 BA.debugLineNum = 233;BA.debugLine="Return out.ToBytesArray";
Debug.ShouldStop(256);
if (true) return _out.runMethod(false,"ToBytesArray");
 BA.debugLineNum = 234;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _release(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Release (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("release")) { return __ref.runUserSub(false, "cameraexclass","release", __ref);}
 BA.debugLineNum = 115;BA.debugLine="Public Sub Release";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="cam.Release";
Debug.ShouldStop(524288);
__ref.getField(false,"_cam" /*RemoteObject*/ ).runVoidMethod ("Release");
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savepicturetofile(RemoteObject __ref,RemoteObject _data,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("SavePictureToFile (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("savepicturetofile")) { return __ref.runUserSub(false, "cameraexclass","savepicturetofile", __ref, _data, _dir, _filename);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("Data", _data);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 120;BA.debugLine="Public Sub SavePictureToFile(Data() As Byte, Dir A";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
Debug.ShouldStop(16777216);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = cameraexclass.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(_dir),(Object)(_filename),(Object)(cameraexclass.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 122;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
Debug.ShouldStop(33554432);
_out.runVoidMethod ("WriteBytes",(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_data.getField(true,"length")));
 BA.debugLineNum = 123;BA.debugLine="out.Close";
Debug.ShouldStop(67108864);
_out.runVoidMethod ("Close");
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
public static RemoteObject  _setcoloreffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("SetColorEffect (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("setcoloreffect")) { return __ref.runUserSub(false, "cameraexclass","setcoloreffect", __ref, _effect);}
Debug.locals.put("Effect", _effect);
 BA.debugLineNum = 150;BA.debugLine="Public Sub SetColorEffect(Effect As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="SetParameter(\"effect\", Effect)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (pdv.milotin.cameraexclass.class, "_setparameter" /*RemoteObject*/ ,(Object)(BA.ObjectToString("effect")),(Object)(_effect));
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcontinuousautofocus(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetContinuousAutoFocus (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("setcontinuousautofocus")) { return __ref.runUserSub(false, "cameraexclass","setcontinuousautofocus", __ref);}
RemoteObject _modes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 256;BA.debugLine="Public Sub SetContinuousAutoFocus";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 257;BA.debugLine="Dim modes As List = GetSupportedFocusModes";
Debug.ShouldStop(1);
_modes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_modes = __ref.runClassMethod (pdv.milotin.cameraexclass.class, "_getsupportedfocusmodes" /*RemoteObject*/ );Debug.locals.put("modes", _modes);Debug.locals.put("modes", _modes);
 BA.debugLineNum = 258;BA.debugLine="If modes.IndexOf(\"continuous-picture\") > -1 Th";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_modes.runMethod(true,"IndexOf",(Object)((RemoteObject.createImmutable("continuous-picture")))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 259;BA.debugLine="SetFocusMode(\"continuous-picture\")";
Debug.ShouldStop(4);
__ref.runClassMethod (pdv.milotin.cameraexclass.class, "_setfocusmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("continuous-picture")));
 }else 
{ BA.debugLineNum = 260;BA.debugLine="Else If modes.IndexOf(\"continuous-video\") > -1";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_modes.runMethod(true,"IndexOf",(Object)((RemoteObject.createImmutable("continuous-video")))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 261;BA.debugLine="SetFocusMode(\"continuous-video\")";
Debug.ShouldStop(16);
__ref.runClassMethod (pdv.milotin.cameraexclass.class, "_setfocusmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("continuous-video")));
 }else {
 BA.debugLineNum = 263;BA.debugLine="Log(\"Continuous focus mode is not availabl";
Debug.ShouldStop(64);
cameraexclass.__c.runVoidMethod ("LogImpl","48388615",RemoteObject.createImmutable("Continuous focus mode is not available"),0);
 }}
;
 BA.debugLineNum = 265;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisplayorientation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetDisplayOrientation (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("setdisplayorientation")) { return __ref.runUserSub(false, "cameraexclass","setdisplayorientation", __ref);}
RemoteObject _previewresult = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _degrees = RemoteObject.createImmutable(0);
RemoteObject _ci = RemoteObject.declareNull("pdv.milotin.cameraexclass._camerainfoandid");
RemoteObject _orientation = RemoteObject.createImmutable(0);
 BA.debugLineNum = 56;BA.debugLine="Private Sub SetDisplayOrientation";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="r.target = r.GetActivity";
Debug.ShouldStop(16777216);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",(__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetActivity",__ref.getField(false, "ba"))));
 BA.debugLineNum = 58;BA.debugLine="r.target = r.RunMethod(\"getWindowManager\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getWindowManager"))));
 BA.debugLineNum = 59;BA.debugLine="r.target = r.RunMethod(\"getDefaultDisplay\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getDefaultDisplay"))));
 BA.debugLineNum = 60;BA.debugLine="r.target = r.RunMethod(\"getRotation\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getRotation"))));
 BA.debugLineNum = 61;BA.debugLine="Dim previewResult, result, degrees As Int = r.tar";
Debug.ShouldStop(268435456);
_previewresult = RemoteObject.createImmutable(0);Debug.locals.put("previewResult", _previewresult);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
_degrees = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_r" /*RemoteObject*/ ).getField(false,"Target")),RemoteObject.createImmutable(90)}, "*",0, 0));Debug.locals.put("degrees", _degrees);Debug.locals.put("degrees", _degrees);
 BA.debugLineNum = 62;BA.debugLine="Dim ci As CameraInfoAndId = FindCamera(Front)";
Debug.ShouldStop(536870912);
_ci = __ref.runClassMethod (pdv.milotin.cameraexclass.class, "_findcamera" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_front" /*RemoteObject*/ )));Debug.locals.put("ci", _ci);Debug.locals.put("ci", _ci);
 BA.debugLineNum = 63;BA.debugLine="r.target = ci.CameraInfo";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",_ci.getField(false,"CameraInfo" /*RemoteObject*/ ));
 BA.debugLineNum = 64;BA.debugLine="Dim orientation As Int = r.GetField(\"orientation\"";
Debug.ShouldStop(-2147483648);
_orientation = BA.numberCast(int.class, __ref.getField(false,"_r" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("orientation"))));Debug.locals.put("orientation", _orientation);Debug.locals.put("orientation", _orientation);
 BA.debugLineNum = 65;BA.debugLine="If Front Then";
Debug.ShouldStop(1);
if (__ref.getField(true,"_front" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 66;BA.debugLine="previewResult = (orientation + degrees) Mod 360";
Debug.ShouldStop(2);
_previewresult = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_orientation,_degrees}, "+",1, 1)),RemoteObject.createImmutable(360)}, "%",0, 1);Debug.locals.put("previewResult", _previewresult);
 BA.debugLineNum = 67;BA.debugLine="result = previewResult";
Debug.ShouldStop(4);
_result = _previewresult;Debug.locals.put("result", _result);
 BA.debugLineNum = 68;BA.debugLine="previewResult = (360 - previewResult) Mod 360";
Debug.ShouldStop(8);
_previewresult = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_previewresult}, "-",1, 1)),RemoteObject.createImmutable(360)}, "%",0, 1);Debug.locals.put("previewResult", _previewresult);
 }else {
 BA.debugLineNum = 70;BA.debugLine="previewResult = (orientation - degrees + 360) Mo";
Debug.ShouldStop(32);
_previewresult = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_orientation,_degrees,RemoteObject.createImmutable(360)}, "-+",2, 1)),RemoteObject.createImmutable(360)}, "%",0, 1);Debug.locals.put("previewResult", _previewresult);
 BA.debugLineNum = 71;BA.debugLine="result = previewResult";
Debug.ShouldStop(64);
_result = _previewresult;Debug.locals.put("result", _result);
 BA.debugLineNum = 72;BA.debugLine="Log(previewResult)";
Debug.ShouldStop(128);
cameraexclass.__c.runVoidMethod ("LogImpl","46750224",BA.NumberToString(_previewresult),0);
 };
 BA.debugLineNum = 74;BA.debugLine="r.target = nativeCam";
Debug.ShouldStop(512);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_nativecam" /*RemoteObject*/ ));
 BA.debugLineNum = 75;BA.debugLine="r.RunMethod2(\"setDisplayOrientation\", previewResu";
Debug.ShouldStop(1024);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setDisplayOrientation")),(Object)(BA.NumberToString(_previewresult)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 76;BA.debugLine="r.target = parameters";
Debug.ShouldStop(2048);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 77;BA.debugLine="r.RunMethod2(\"setRotation\", result, \"java.lang.in";
Debug.ShouldStop(4096);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setRotation")),(Object)(BA.NumberToString(_result)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 78;BA.debugLine="CommitParameters";
Debug.ShouldStop(8192);
__ref.runClassMethod (pdv.milotin.cameraexclass.class, "_commitparameters" /*RemoteObject*/ );
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
public static RemoteObject  _setflashmode(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("SetFlashMode (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("setflashmode")) { return __ref.runUserSub(false, "cameraexclass","setflashmode", __ref, _mode);}
Debug.locals.put("Mode", _mode);
 BA.debugLineNum = 176;BA.debugLine="Public Sub SetFlashMode(Mode As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="r.target = parameters";
Debug.ShouldStop(65536);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 178;BA.debugLine="r.RunMethod2(\"setFlashMode\", Mode, \"java.lang.Str";
Debug.ShouldStop(131072);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setFlashMode")),(Object)(_mode),(Object)(RemoteObject.createImmutable("java.lang.String")));
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfocusmode(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("SetFocusMode (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,267);
if (RapidSub.canDelegate("setfocusmode")) { return __ref.runUserSub(false, "cameraexclass","setfocusmode", __ref, _mode);}
Debug.locals.put("Mode", _mode);
 BA.debugLineNum = 267;BA.debugLine="Public Sub SetFocusMode(Mode As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 268;BA.debugLine="r.target = parameters";
Debug.ShouldStop(2048);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 269;BA.debugLine="r.RunMethod2(\"setFocusMode\", Mode, \"java.lang.";
Debug.ShouldStop(4096);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setFocusMode")),(Object)(_mode),(Object)(RemoteObject.createImmutable("java.lang.String")));
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
public static RemoteObject  _setjpegquality(RemoteObject __ref,RemoteObject _quality) throws Exception{
try {
		Debug.PushSubsStack("SetJpegQuality (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("setjpegquality")) { return __ref.runUserSub(false, "cameraexclass","setjpegquality", __ref, _quality);}
Debug.locals.put("Quality", _quality);
 BA.debugLineNum = 171;BA.debugLine="Public Sub SetJpegQuality(Quality As Int)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="r.target = parameters";
Debug.ShouldStop(2048);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 173;BA.debugLine="r.RunMethod2(\"setJpegQuality\", Quality, \"java.lan";
Debug.ShouldStop(4096);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setJpegQuality")),(Object)(BA.NumberToString(_quality)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setparameter(RemoteObject __ref,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetParameter (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("setparameter")) { return __ref.runUserSub(false, "cameraexclass","setparameter", __ref, _key, _value);}
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 126;BA.debugLine="Public Sub SetParameter(Key As String, Value As St";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="r.target = parameters";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 128;BA.debugLine="r.RunMethod3(\"set\", Key, \"java.lang.String\", Valu";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod3",(Object)(BA.ObjectToString("set")),(Object)(_key),(Object)(BA.ObjectToString("java.lang.String")),(Object)(_value),(Object)(RemoteObject.createImmutable("java.lang.String")));
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpicturesize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetPictureSize (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,166);
if (RapidSub.canDelegate("setpicturesize")) { return __ref.runUserSub(false, "cameraexclass","setpicturesize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 166;BA.debugLine="Public Sub SetPictureSize(Width As Int, Height As";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="r.target = parameters";
Debug.ShouldStop(64);
__ref.getField(false,"_r" /*RemoteObject*/ ).setField ("Target",__ref.getField(false,"_parameters" /*RemoteObject*/ ));
 BA.debugLineNum = 168;BA.debugLine="r.RunMethod3(\"setPictureSize\", Width, \"java.lang.";
Debug.ShouldStop(128);
__ref.getField(false,"_r" /*RemoteObject*/ ).runVoidMethod ("RunMethod3",(Object)(BA.ObjectToString("setPictureSize")),(Object)(BA.NumberToString(_width)),(Object)(BA.ObjectToString("java.lang.int")),(Object)(BA.NumberToString(_height)),(Object)(RemoteObject.createImmutable("java.lang.int")));
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
public static RemoteObject  _startpreview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StartPreview (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("startpreview")) { return __ref.runUserSub(false, "cameraexclass","startpreview", __ref);}
 BA.debugLineNum = 107;BA.debugLine="Public Sub StartPreview";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="cam.StartPreview";
Debug.ShouldStop(2048);
__ref.getField(false,"_cam" /*RemoteObject*/ ).runVoidMethod ("StartPreview");
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
public static RemoteObject  _stoppreview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StopPreview (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("stoppreview")) { return __ref.runUserSub(false, "cameraexclass","stoppreview", __ref);}
 BA.debugLineNum = 111;BA.debugLine="Public Sub StopPreview";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="cam.StopPreview";
Debug.ShouldStop(32768);
__ref.getField(false,"_cam" /*RemoteObject*/ ).runVoidMethod ("StopPreview");
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _takepicture(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TakePicture (cameraexclass) ","cameraexclass",8,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("takepicture")) { return __ref.runUserSub(false, "cameraexclass","takepicture", __ref);}
 BA.debugLineNum = 99;BA.debugLine="Public Sub TakePicture";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="cam.TakePicture";
Debug.ShouldStop(8);
__ref.getField(false,"_cam" /*RemoteObject*/ ).runVoidMethod ("TakePicture");
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}