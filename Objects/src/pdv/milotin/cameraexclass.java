package pdv.milotin;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cameraexclass extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "pdv.milotin.cameraexclass");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", pdv.milotin.cameraexclass.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _camerainfoandid{
public boolean IsInitialized;
public Object CameraInfo;
public int Id;
public void Initialize() {
IsInitialized = true;
CameraInfo = new Object();
Id = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _camerasize{
public boolean IsInitialized;
public int Width;
public int Height;
public void Initialize() {
IsInitialized = true;
Width = 0;
Height = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public Object _nativecam = null;
public anywheresoftware.b4a.objects.CameraW _cam = null;
public anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
public Object _target = null;
public String _event = "";
public boolean _front = false;
public Object _parameters = null;
public b4a.example.dateutils _dateutils = null;
public pdv.milotin.main _main = null;
public pdv.milotin.homemd _homemd = null;
public pdv.milotin.sendfundmd _sendfundmd = null;
public pdv.milotin.usermd _usermd = null;
public pdv.milotin.historymd _historymd = null;
public pdv.milotin.fundmd _fundmd = null;
public pdv.milotin.addprojectmd _addprojectmd = null;
public pdv.milotin.starter _starter = null;
public pdv.milotin.httputils2service _httputils2service = null;
public String  _camera_focusdone(pdv.milotin.cameraexclass __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "camera_focusdone", false))
	 {return ((String) Debug.delegate(ba, "camera_focusdone", new Object[] {_success}));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Private Sub Camera_FocusDone (Success As Boolean)";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="TakePicture";
__ref._takepicture /*String*/ (null);
 }else {
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="Log(\"AutoFocus error.\")";
__c.LogImpl("58323076","AutoFocus error.",0);
 };
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="End Sub";
return "";
}
public String  _takepicture(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "takepicture", false))
	 {return ((String) Debug.delegate(ba, "takepicture", null));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Public Sub TakePicture";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="cam.TakePicture";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .TakePicture();
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="End Sub";
return "";
}
public String  _camera_picturetaken(pdv.milotin.cameraexclass __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "camera_picturetaken", false))
	 {return ((String) Debug.delegate(ba, "camera_picturetaken", new Object[] {_data}));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Private Sub Camera_PictureTaken (Data() As Byte)";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="CallSub2(target, event & \"_PictureTaken\", Data)";
__c.CallSubNew2(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_PictureTaken",(Object)(_data));
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="End Sub";
return "";
}
public String  _camera_preview(pdv.milotin.cameraexclass __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "camera_preview", false))
	 {return ((String) Debug.delegate(ba, "camera_preview", new Object[] {_data}));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub Camera_Preview (Data() As Byte)";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="If SubExists(target, event & \"_preview\") Then";
if (__c.SubExists(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_preview")) { 
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="CallSub2(target, event & \"_preview\", Data)";
__c.CallSubNew2(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_preview",(Object)(_data));
 };
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="End Sub";
return "";
}
public String  _camera_ready(pdv.milotin.cameraexclass __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "camera_ready", false))
	 {return ((String) Debug.delegate(ba, "camera_ready", new Object[] {_success}));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Private Sub Camera_Ready (Success As Boolean)";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="r.target = cam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = (Object)(__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ );
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="nativeCam = r.GetField(\"camera\")";
__ref._nativecam /*Object*/  = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("camera");
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="r.target = nativeCam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._nativecam /*Object*/ ;
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="parameters = r.RunMethod(\"getParameters\")";
__ref._parameters /*Object*/  = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getParameters");
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="SetDisplayOrientation";
__ref._setdisplayorientation /*String*/ (null);
 }else {
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="Log(\"success = false, \" & LastException)";
__c.LogImpl("56422536","success = false, "+BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=6422538;
 //BA.debugLineNum = 6422538;BA.debugLine="CallSub2(target, event & \"_ready\", Success)";
__c.CallSubNew2(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_ready",(Object)(_success));
RDebugUtils.currentLine=6422539;
 //BA.debugLineNum = 6422539;BA.debugLine="End Sub";
return "";
}
public String  _setdisplayorientation(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setdisplayorientation", false))
	 {return ((String) Debug.delegate(ba, "setdisplayorientation", null));}
int _previewresult = 0;
int _result = 0;
int _degrees = 0;
pdv.milotin.cameraexclass._camerainfoandid _ci = null;
int _orientation = 0;
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Private Sub SetDisplayOrientation";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="r.target = r.GetActivity";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = (Object)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetActivity(ba));
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="r.target = r.RunMethod(\"getWindowManager\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getWindowManager");
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="r.target = r.RunMethod(\"getDefaultDisplay\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getDefaultDisplay");
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="r.target = r.RunMethod(\"getRotation\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getRotation");
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="Dim previewResult, result, degrees As Int = r.tar";
_previewresult = 0;
_result = 0;
_degrees = (int) ((double)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target))*90);
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="Dim ci As CameraInfoAndId = FindCamera(Front)";
_ci = __ref._findcamera /*pdv.milotin.cameraexclass._camerainfoandid*/ (null,__ref._front /*boolean*/ );
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="r.target = ci.CameraInfo";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _ci.CameraInfo /*Object*/ ;
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="Dim orientation As Int = r.GetField(\"orientation\"";
_orientation = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("orientation")));
RDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="If Front Then";
if (__ref._front /*boolean*/ ) { 
RDebugUtils.currentLine=6357002;
 //BA.debugLineNum = 6357002;BA.debugLine="previewResult = (orientation + degrees) Mod 360";
_previewresult = (int) ((_orientation+_degrees)%360);
RDebugUtils.currentLine=6357003;
 //BA.debugLineNum = 6357003;BA.debugLine="result = previewResult";
_result = _previewresult;
RDebugUtils.currentLine=6357004;
 //BA.debugLineNum = 6357004;BA.debugLine="previewResult = (360 - previewResult) Mod 360";
_previewresult = (int) ((360-_previewresult)%360);
 }else {
RDebugUtils.currentLine=6357006;
 //BA.debugLineNum = 6357006;BA.debugLine="previewResult = (orientation - degrees + 360) Mo";
_previewresult = (int) ((_orientation-_degrees+360)%360);
RDebugUtils.currentLine=6357007;
 //BA.debugLineNum = 6357007;BA.debugLine="result = previewResult";
_result = _previewresult;
RDebugUtils.currentLine=6357008;
 //BA.debugLineNum = 6357008;BA.debugLine="Log(previewResult)";
__c.LogImpl("56357008",BA.NumberToString(_previewresult),0);
 };
RDebugUtils.currentLine=6357010;
 //BA.debugLineNum = 6357010;BA.debugLine="r.target = nativeCam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._nativecam /*Object*/ ;
RDebugUtils.currentLine=6357011;
 //BA.debugLineNum = 6357011;BA.debugLine="r.RunMethod2(\"setDisplayOrientation\", previewResu";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setDisplayOrientation",BA.NumberToString(_previewresult),"java.lang.int");
RDebugUtils.currentLine=6357012;
 //BA.debugLineNum = 6357012;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=6357013;
 //BA.debugLineNum = 6357013;BA.debugLine="r.RunMethod2(\"setRotation\", result, \"java.lang.in";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setRotation",BA.NumberToString(_result),"java.lang.int");
RDebugUtils.currentLine=6357014;
 //BA.debugLineNum = 6357014;BA.debugLine="CommitParameters";
__ref._commitparameters /*String*/ (null);
RDebugUtils.currentLine=6357015;
 //BA.debugLineNum = 6357015;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Private nativeCam As Object";
_nativecam = new Object();
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="Private cam As Camera";
_cam = new anywheresoftware.b4a.objects.CameraW();
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="Private r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="Private target As Object";
_target = new Object();
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="Private event As String";
_event = "";
RDebugUtils.currentLine=6160390;
 //BA.debugLineNum = 6160390;BA.debugLine="Public Front As Boolean";
_front = false;
RDebugUtils.currentLine=6160391;
 //BA.debugLineNum = 6160391;BA.debugLine="Type CameraInfoAndId (CameraInfo As Object, Id As";
;
RDebugUtils.currentLine=6160392;
 //BA.debugLineNum = 6160392;BA.debugLine="Type CameraSize (Width As Int, Height As Int)";
;
RDebugUtils.currentLine=6160393;
 //BA.debugLineNum = 6160393;BA.debugLine="Private parameters As Object";
_parameters = new Object();
RDebugUtils.currentLine=6160394;
 //BA.debugLineNum = 6160394;BA.debugLine="End Sub";
return "";
}
public String  _closenow(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "closenow", false))
	 {return ((String) Debug.delegate(ba, "closenow", null));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub CloseNow";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="cam.Release";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .Release();
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="r.target = cam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = (Object)(__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ );
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="r.RunMethod2(\"releaseCameras\", True, \"java.lang.b";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("releaseCameras",BA.ObjectToString(__c.True),"java.lang.boolean");
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="End Sub";
return "";
}
public String  _commitparameters(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "commitparameters", false))
	 {return ((String) Debug.delegate(ba, "commitparameters", null));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Public Sub CommitParameters";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Try";
try {RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="r.target = nativeCam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._nativecam /*Object*/ ;
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="r.RunMethod4(\"setParameters\", Array As Object(pa";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod4("setParameters",new Object[]{__ref._parameters /*Object*/ },new String[]{"android.hardware.Camera$Parameters"});
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=7077893;
 //BA.debugLineNum = 7077893;BA.debugLine="ToastMessageShow(\"Error setting parameters.\", Tr";
__c.ToastMessageShow(BA.ObjectToCharSequence("Error setting parameters."),__c.True);
RDebugUtils.currentLine=7077894;
 //BA.debugLineNum = 7077894;BA.debugLine="Log(LastException)";
__c.LogImpl("57077894",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=7077896;
 //BA.debugLineNum = 7077896;BA.debugLine="End Sub";
return "";
}
public pdv.milotin.cameraexclass._camerainfoandid  _findcamera(pdv.milotin.cameraexclass __ref,boolean _frontcamera) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "findcamera", false))
	 {return ((pdv.milotin.cameraexclass._camerainfoandid) Debug.delegate(ba, "findcamera", new Object[] {_frontcamera}));}
pdv.milotin.cameraexclass._camerainfoandid _ci = null;
Object _camerainfo = null;
int _cameravalue = 0;
int _numberofcameras = 0;
int _i = 0;
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Private Sub FindCamera (frontCamera As Boolean) As";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Dim ci As CameraInfoAndId";
_ci = new pdv.milotin.cameraexclass._camerainfoandid();
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="Dim cameraInfo As Object";
_camerainfo = new Object();
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="Dim cameraValue As Int";
_cameravalue = 0;
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="If frontCamera Then cameraValue = 1 Else cameraVa";
if (_frontcamera) { 
_cameravalue = (int) (1);}
else {
_cameravalue = (int) (0);};
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="cameraInfo = r.CreateObject(\"android.hardware.Cam";
_camerainfo = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .CreateObject("android.hardware.Camera$CameraInfo");
RDebugUtils.currentLine=6291462;
 //BA.debugLineNum = 6291462;BA.debugLine="Dim numberOfCameras As Int = r.RunStaticMethod(\"a";
_numberofcameras = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunStaticMethod("android.hardware.Camera","getNumberOfCameras",(Object[])(__c.Null),(String[])(__c.Null))));
RDebugUtils.currentLine=6291463;
 //BA.debugLineNum = 6291463;BA.debugLine="For i = 0 To numberOfCameras - 1";
{
final int step7 = 1;
final int limit7 = (int) (_numberofcameras-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=6291464;
 //BA.debugLineNum = 6291464;BA.debugLine="r.RunStaticMethod(\"android.hardware.Camera\", \"ge";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunStaticMethod("android.hardware.Camera","getCameraInfo",new Object[]{(Object)(_i),_camerainfo},new String[]{"java.lang.int","android.hardware.Camera$CameraInfo"});
RDebugUtils.currentLine=6291466;
 //BA.debugLineNum = 6291466;BA.debugLine="r.target = cameraInfo";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _camerainfo;
RDebugUtils.currentLine=6291467;
 //BA.debugLineNum = 6291467;BA.debugLine="If r.GetField(\"facing\") = cameraValue Then";
if ((__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("facing")).equals((Object)(_cameravalue))) { 
RDebugUtils.currentLine=6291468;
 //BA.debugLineNum = 6291468;BA.debugLine="ci.cameraInfo = r.target";
_ci.CameraInfo /*Object*/  = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target;
RDebugUtils.currentLine=6291469;
 //BA.debugLineNum = 6291469;BA.debugLine="ci.Id = i";
_ci.Id /*int*/  = _i;
RDebugUtils.currentLine=6291470;
 //BA.debugLineNum = 6291470;BA.debugLine="Return ci";
if (true) return _ci;
 };
 }
};
RDebugUtils.currentLine=6291473;
 //BA.debugLineNum = 6291473;BA.debugLine="ci.id = -1";
_ci.Id /*int*/  = (int) (-1);
RDebugUtils.currentLine=6291474;
 //BA.debugLineNum = 6291474;BA.debugLine="Return ci";
if (true) return _ci;
RDebugUtils.currentLine=6291475;
 //BA.debugLineNum = 6291475;BA.debugLine="End Sub";
return null;
}
public String  _focusandtakepicture(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "focusandtakepicture", false))
	 {return ((String) Debug.delegate(ba, "focusandtakepicture", null));}
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Public Sub FocusAndTakePicture";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="cam.AutoFocus";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .AutoFocus();
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="End Sub";
return "";
}
public String  _getcoloreffect(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getcoloreffect", false))
	 {return ((String) Debug.delegate(ba, "getcoloreffect", null));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Public Sub GetColorEffect As String";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Return GetParameter(\"effect\")";
if (true) return __ref._getparameter /*String*/ (null,"effect");
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="End Sub";
return "";
}
public String  _getparameter(pdv.milotin.cameraexclass __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getparameter", false))
	 {return ((String) Debug.delegate(ba, "getparameter", new Object[] {_key}));}
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Public Sub GetParameter(Key As String) As String";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="Return r.RunMethod2(\"get\", Key, \"java.lang.String";
if (true) return BA.ObjectToString(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("get",_key,"java.lang.String"));
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="End Sub";
return "";
}
public String  _getflashmode(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getflashmode", false))
	 {return ((String) Debug.delegate(ba, "getflashmode", null));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Public Sub GetFlashMode As String";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="Return r.RunMethod(\"getFlashMode\")";
if (true) return BA.ObjectToString(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getFlashMode"));
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="End Sub";
return "";
}
public float[]  _getfocusdistances(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getfocusdistances", false))
	 {return ((float[]) Debug.delegate(ba, "getfocusdistances", null));}
float[] _f = null;
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub GetFocusDistances As Float()";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Dim F(3) As Float";
_f = new float[(int) (3)];
;
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="r.RunMethod4(\"getFocusDistances\", Array As Object";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod4("getFocusDistances",new Object[]{(Object)(_f)},new String[]{"[F"});
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="Return F";
if (true) return _f;
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="End Sub";
return null;
}
public pdv.milotin.cameraexclass._camerasize  _getpicturesize(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getpicturesize", false))
	 {return ((pdv.milotin.cameraexclass._camerasize) Debug.delegate(ba, "getpicturesize", null));}
pdv.milotin.cameraexclass._camerasize _cs = null;
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Public Sub GetPictureSize As CameraSize";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="r.target = r.RunMethod(\"getPictureSize\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPictureSize");
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="Dim cs As CameraSize";
_cs = new pdv.milotin.cameraexclass._camerasize();
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="cs.Width = r.GetField(\"width\")";
_cs.Width /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="cs.Height = r.GetField(\"height\")";
_cs.Height /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=7798791;
 //BA.debugLineNum = 7798791;BA.debugLine="End Sub";
return null;
}
public pdv.milotin.cameraexclass._camerasize  _getpreviewsize(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getpreviewsize", false))
	 {return ((pdv.milotin.cameraexclass._camerasize) Debug.delegate(ba, "getpreviewsize", null));}
pdv.milotin.cameraexclass._camerasize _cs = null;
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub GetPreviewSize As CameraSize";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="r.target = r.RunMethod(\"getPreviewSize\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPreviewSize");
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="Dim cs As CameraSize";
_cs = new pdv.milotin.cameraexclass._camerasize();
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="cs.Width = r.GetField(\"width\")";
_cs.Width /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
RDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="cs.Height = r.GetField(\"height\")";
_cs.Height /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=7733255;
 //BA.debugLineNum = 7733255;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedcoloreffects(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedcoloreffects", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedcoloreffects", null));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Public Sub GetSupportedColorEffects As List";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="Return r.RunMethod(\"getSupportedColorEffects\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedColorEffects")));
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedflashmodes(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedflashmodes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedflashmodes", null));}
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub GetSupportedFlashModes As List";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="Return r.RunMethod(\"getSupportedFlashModes\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedFlashModes")));
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedfocusmodes(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedfocusmodes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedfocusmodes", null));}
anywheresoftware.b4a.objects.collections.List _fm = null;
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Public Sub GetSupportedFocusModes As List";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="Dim fm As List";
_fm = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="fm.initialize";
_fm.Initialize();
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="fm=r.RunMethod(\"getSupportedFocusModes\")";
_fm = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedFocusModes")));
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="If fm.Get(0)=\"auto\" Then";
if ((_fm.Get((int) (0))).equals((Object)("auto"))) { 
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="FocusAndTakePicture";
__ref._focusandtakepicture /*String*/ (null);
 }else {
RDebugUtils.currentLine=7929864;
 //BA.debugLineNum = 7929864;BA.debugLine="TakePicture";
__ref._takepicture /*String*/ (null);
 };
RDebugUtils.currentLine=7929866;
 //BA.debugLineNum = 7929866;BA.debugLine="Return r.RunMethod(\"getSupportedFocusModes\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedFocusModes")));
RDebugUtils.currentLine=7929867;
 //BA.debugLineNum = 7929867;BA.debugLine="End Sub";
return null;
}
public pdv.milotin.cameraexclass._camerasize[]  _getsupportedpicturessizes(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedpicturessizes", false))
	 {return ((pdv.milotin.cameraexclass._camerasize[]) Debug.delegate(ba, "getsupportedpicturessizes", null));}
anywheresoftware.b4a.objects.collections.List _list1 = null;
pdv.milotin.cameraexclass._camerasize[] _cs = null;
int _i = 0;
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Public Sub GetSupportedPicturesSizes As CameraSize";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Dim list1 As List = r.RunMethod(\"getSupportedPict";
_list1 = new anywheresoftware.b4a.objects.collections.List();
_list1 = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedPictureSizes")));
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="Dim cs(list1.Size) As CameraSize";
_cs = new pdv.milotin.cameraexclass._camerasize[_list1.getSize()];
{
int d0 = _cs.length;
for (int i0 = 0;i0 < d0;i0++) {
_cs[i0] = new pdv.milotin.cameraexclass._camerasize();
}
}
;
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="For i = 0 To list1.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="r.target = list1.Get(i)";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _list1.Get(_i);
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="cs(i).Width = r.GetField(\"width\")";
_cs[_i].Width /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
RDebugUtils.currentLine=7274503;
 //BA.debugLineNum = 7274503;BA.debugLine="cs(i).Height = r.GetField(\"height\")";
_cs[_i].Height /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
 }
};
RDebugUtils.currentLine=7274505;
 //BA.debugLineNum = 7274505;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=7274506;
 //BA.debugLineNum = 7274506;BA.debugLine="End Sub";
return null;
}
public String  _initialize(pdv.milotin.cameraexclass __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _panel1,boolean _frontcamera,Object _targetmodule,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_panel1,_frontcamera,_targetmodule,_eventname}));}
int _id = 0;
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Public Sub Initialize (Panel1 As Panel, FrontCamer";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="target = TargetModule";
__ref._target /*Object*/  = _targetmodule;
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="event = EventName";
__ref._event /*String*/  = _eventname;
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="Front = FrontCamera";
__ref._front /*boolean*/  = _frontcamera;
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="Dim id As Int";
_id = 0;
RDebugUtils.currentLine=6225925;
 //BA.debugLineNum = 6225925;BA.debugLine="id = FindCamera(Front).id";
_id = __ref._findcamera /*pdv.milotin.cameraexclass._camerainfoandid*/ (null,__ref._front /*boolean*/ ).Id /*int*/ ;
RDebugUtils.currentLine=6225926;
 //BA.debugLineNum = 6225926;BA.debugLine="If id = -1 Then";
if (_id==-1) { 
RDebugUtils.currentLine=6225927;
 //BA.debugLineNum = 6225927;BA.debugLine="Front = Not(Front) 'try different camera";
__ref._front /*boolean*/  = __c.Not(__ref._front /*boolean*/ );
RDebugUtils.currentLine=6225928;
 //BA.debugLineNum = 6225928;BA.debugLine="id = FindCamera(Front).id";
_id = __ref._findcamera /*pdv.milotin.cameraexclass._camerainfoandid*/ (null,__ref._front /*boolean*/ ).Id /*int*/ ;
RDebugUtils.currentLine=6225929;
 //BA.debugLineNum = 6225929;BA.debugLine="If id = -1 Then";
if (_id==-1) { 
RDebugUtils.currentLine=6225930;
 //BA.debugLineNum = 6225930;BA.debugLine="ToastMessageShow(\"No camera found.\", True)";
__c.ToastMessageShow(BA.ObjectToCharSequence("No camera found."),__c.True);
RDebugUtils.currentLine=6225931;
 //BA.debugLineNum = 6225931;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=6225934;
 //BA.debugLineNum = 6225934;BA.debugLine="cam.Initialize2(Panel1, \"camera\", id)";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .Initialize2(ba,(android.view.ViewGroup)(_panel1.getObject()),"camera",_id);
RDebugUtils.currentLine=6225935;
 //BA.debugLineNum = 6225935;BA.debugLine="End Sub";
return "";
}
public byte[]  _previewimagetojpeg(pdv.milotin.cameraexclass __ref,byte[] _data,int _quality) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "previewimagetojpeg", false))
	 {return ((byte[]) Debug.delegate(ba, "previewimagetojpeg", new Object[] {_data,_quality}));}
Object _size = null;
Object _previewformat = null;
int _width = 0;
int _height = 0;
Object _yuvimage = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _rect1 = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub PreviewImageToJpeg(data() As Byte, qual";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="Dim size, previewFormat As Object";
_size = new Object();
_previewformat = new Object();
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="size = r.RunMethod(\"getPreviewSize\")";
_size = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPreviewSize");
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="previewFormat = r.RunMethod(\"getPreviewFormat\")";
_previewformat = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPreviewFormat");
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="r.target = size";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _size;
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="Dim width = r.GetField(\"width\"), height = r.GetFi";
_width = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
_height = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="Dim yuvImage As Object = r.CreateObject2(\"android";
_yuvimage = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .CreateObject2("android.graphics.YuvImage",new Object[]{(Object)(_data),_previewformat,(Object)(_width),(Object)(_height),__c.Null},new String[]{"[B","java.lang.int","java.lang.int","java.lang.int","[I"});
RDebugUtils.currentLine=7864330;
 //BA.debugLineNum = 7864330;BA.debugLine="r.target = yuvImage";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _yuvimage;
RDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="Dim rect1 As Rect";
_rect1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=7864332;
 //BA.debugLineNum = 7864332;BA.debugLine="rect1.Initialize(0, 0, r.RunMethod(\"getWidth\"), r";
_rect1.Initialize((int) (0),(int) (0),(int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getWidth"))),(int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getHeight"))));
RDebugUtils.currentLine=7864333;
 //BA.debugLineNum = 7864333;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=7864334;
 //BA.debugLineNum = 7864334;BA.debugLine="out.InitializeToBytesArray(100)";
_out.InitializeToBytesArray((int) (100));
RDebugUtils.currentLine=7864335;
 //BA.debugLineNum = 7864335;BA.debugLine="r.RunMethod4(\"compressToJpeg\", Array As Object(re";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod4("compressToJpeg",new Object[]{(Object)(_rect1.getObject()),(Object)(_quality),(Object)(_out.getObject())},new String[]{"android.graphics.Rect","java.lang.int","java.io.OutputStream"});
RDebugUtils.currentLine=7864337;
 //BA.debugLineNum = 7864337;BA.debugLine="Return out.ToBytesArray";
if (true) return _out.ToBytesArray();
RDebugUtils.currentLine=7864338;
 //BA.debugLineNum = 7864338;BA.debugLine="End Sub";
return null;
}
public String  _release(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "release", false))
	 {return ((String) Debug.delegate(ba, "release", null));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Public Sub Release";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="cam.Release";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .Release();
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="End Sub";
return "";
}
public String  _savepicturetofile(pdv.milotin.cameraexclass __ref,byte[] _data,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "savepicturetofile", false))
	 {return ((String) Debug.delegate(ba, "savepicturetofile", new Object[] {_data,_dir,_filename}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Public Sub SavePictureToFile(Data() As Byte, Dir A";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_dir,_filename,__c.False);
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="End Sub";
return "";
}
public String  _setcoloreffect(pdv.milotin.cameraexclass __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setcoloreffect", false))
	 {return ((String) Debug.delegate(ba, "setcoloreffect", new Object[] {_effect}));}
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Public Sub SetColorEffect(Effect As String)";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="SetParameter(\"effect\", Effect)";
__ref._setparameter /*String*/ (null,"effect",_effect);
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="End Sub";
return "";
}
public String  _setparameter(pdv.milotin.cameraexclass __ref,String _key,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setparameter", false))
	 {return ((String) Debug.delegate(ba, "setparameter", new Object[] {_key,_value}));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Public Sub SetParameter(Key As String, Value As St";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="r.RunMethod3(\"set\", Key, \"java.lang.String\", Valu";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod3("set",_key,"java.lang.String",_value,"java.lang.String");
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="End Sub";
return "";
}
public String  _setcontinuousautofocus(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setcontinuousautofocus", false))
	 {return ((String) Debug.delegate(ba, "setcontinuousautofocus", null));}
anywheresoftware.b4a.objects.collections.List _modes = null;
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Public Sub SetContinuousAutoFocus";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="Dim modes As List = GetSupportedFocusModes";
_modes = new anywheresoftware.b4a.objects.collections.List();
_modes = __ref._getsupportedfocusmodes /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="If modes.IndexOf(\"continuous-picture\") > -1 Th";
if (_modes.IndexOf((Object)("continuous-picture"))>-1) { 
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="SetFocusMode(\"continuous-picture\")";
__ref._setfocusmode /*String*/ (null,"continuous-picture");
 }else 
{RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="Else If modes.IndexOf(\"continuous-video\") > -1";
if (_modes.IndexOf((Object)("continuous-video"))>-1) { 
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="SetFocusMode(\"continuous-video\")";
__ref._setfocusmode /*String*/ (null,"continuous-video");
 }else {
RDebugUtils.currentLine=7995399;
 //BA.debugLineNum = 7995399;BA.debugLine="Log(\"Continuous focus mode is not availabl";
__c.LogImpl("57995399","Continuous focus mode is not available",0);
 }}
;
RDebugUtils.currentLine=7995401;
 //BA.debugLineNum = 7995401;BA.debugLine="End Sub";
return "";
}
public String  _setfocusmode(pdv.milotin.cameraexclass __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setfocusmode", false))
	 {return ((String) Debug.delegate(ba, "setfocusmode", new Object[] {_mode}));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub SetFocusMode(Mode As String)";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="r.RunMethod2(\"setFocusMode\", Mode, \"java.lang.";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setFocusMode",_mode,"java.lang.String");
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="End Sub";
return "";
}
public String  _setflashmode(pdv.milotin.cameraexclass __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setflashmode", false))
	 {return ((String) Debug.delegate(ba, "setflashmode", new Object[] {_mode}));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Public Sub SetFlashMode(Mode As String)";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="r.RunMethod2(\"setFlashMode\", Mode, \"java.lang.Str";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setFlashMode",_mode,"java.lang.String");
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="End Sub";
return "";
}
public String  _setjpegquality(pdv.milotin.cameraexclass __ref,int _quality) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setjpegquality", false))
	 {return ((String) Debug.delegate(ba, "setjpegquality", new Object[] {_quality}));}
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Public Sub SetJpegQuality(Quality As Int)";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="r.RunMethod2(\"setJpegQuality\", Quality, \"java.lan";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setJpegQuality",BA.NumberToString(_quality),"java.lang.int");
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="End Sub";
return "";
}
public String  _setpicturesize(pdv.milotin.cameraexclass __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setpicturesize", false))
	 {return ((String) Debug.delegate(ba, "setpicturesize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Public Sub SetPictureSize(Width As Int, Height As";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="r.RunMethod3(\"setPictureSize\", Width, \"java.lang.";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod3("setPictureSize",BA.NumberToString(_width),"java.lang.int",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="End Sub";
return "";
}
public String  _startpreview(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "startpreview", false))
	 {return ((String) Debug.delegate(ba, "startpreview", null));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Public Sub StartPreview";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="cam.StartPreview";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .StartPreview();
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="End Sub";
return "";
}
public String  _stoppreview(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "stoppreview", false))
	 {return ((String) Debug.delegate(ba, "stoppreview", null));}
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Public Sub StopPreview";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="cam.StopPreview";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .StopPreview();
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="End Sub";
return "";
}
}