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
public pdv.milotin.addallocatemd _addallocatemd = null;
public pdv.milotin.httputils2service _httputils2service = null;
public String  _camera_focusdone(pdv.milotin.cameraexclass __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "camera_focusdone", false))
	 {return ((String) Debug.delegate(ba, "camera_focusdone", new Object[] {_success}));}
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Private Sub Camera_FocusDone (Success As Boolean)";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="TakePicture";
__ref._takepicture /*String*/ (null);
 }else {
RDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="Log(\"AutoFocus error.\")";
__c.LogImpl("012517380","AutoFocus error.",0);
 };
RDebugUtils.currentLine=12517382;
 //BA.debugLineNum = 12517382;BA.debugLine="End Sub";
return "";
}
public String  _takepicture(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "takepicture", false))
	 {return ((String) Debug.delegate(ba, "takepicture", null));}
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Public Sub TakePicture";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="cam.TakePicture";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .TakePicture();
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="End Sub";
return "";
}
public String  _camera_picturetaken(pdv.milotin.cameraexclass __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "camera_picturetaken", false))
	 {return ((String) Debug.delegate(ba, "camera_picturetaken", new Object[] {_data}));}
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Private Sub Camera_PictureTaken (Data() As Byte)";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="CallSub2(target, event & \"_PictureTaken\", Data)";
__c.CallSubNew2(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_PictureTaken",(Object)(_data));
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="End Sub";
return "";
}
public String  _camera_preview(pdv.milotin.cameraexclass __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "camera_preview", false))
	 {return ((String) Debug.delegate(ba, "camera_preview", new Object[] {_data}));}
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Sub Camera_Preview (Data() As Byte)";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="If SubExists(target, event & \"_preview\") Then";
if (__c.SubExists(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_preview")) { 
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="CallSub2(target, event & \"_preview\", Data)";
__c.CallSubNew2(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_preview",(Object)(_data));
 };
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="End Sub";
return "";
}
public String  _camera_ready(pdv.milotin.cameraexclass __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "camera_ready", false))
	 {return ((String) Debug.delegate(ba, "camera_ready", new Object[] {_success}));}
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Private Sub Camera_Ready (Success As Boolean)";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="r.target = cam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = (Object)(__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ );
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="nativeCam = r.GetField(\"camera\")";
__ref._nativecam /*Object*/  = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("camera");
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="r.target = nativeCam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._nativecam /*Object*/ ;
RDebugUtils.currentLine=10616837;
 //BA.debugLineNum = 10616837;BA.debugLine="parameters = r.RunMethod(\"getParameters\")";
__ref._parameters /*Object*/  = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getParameters");
RDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="SetDisplayOrientation";
__ref._setdisplayorientation /*String*/ (null);
 }else {
RDebugUtils.currentLine=10616840;
 //BA.debugLineNum = 10616840;BA.debugLine="Log(\"success = false, \" & LastException)";
__c.LogImpl("010616840","success = false, "+BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=10616842;
 //BA.debugLineNum = 10616842;BA.debugLine="CallSub2(target, event & \"_ready\", Success)";
__c.CallSubNew2(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_ready",(Object)(_success));
RDebugUtils.currentLine=10616843;
 //BA.debugLineNum = 10616843;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Private Sub SetDisplayOrientation";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="r.target = r.GetActivity";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = (Object)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetActivity(ba));
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="r.target = r.RunMethod(\"getWindowManager\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getWindowManager");
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="r.target = r.RunMethod(\"getDefaultDisplay\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getDefaultDisplay");
RDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="r.target = r.RunMethod(\"getRotation\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getRotation");
RDebugUtils.currentLine=10551301;
 //BA.debugLineNum = 10551301;BA.debugLine="Dim previewResult, result, degrees As Int = r.tar";
_previewresult = 0;
_result = 0;
_degrees = (int) ((double)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target))*90);
RDebugUtils.currentLine=10551302;
 //BA.debugLineNum = 10551302;BA.debugLine="Dim ci As CameraInfoAndId = FindCamera(Front)";
_ci = __ref._findcamera /*pdv.milotin.cameraexclass._camerainfoandid*/ (null,__ref._front /*boolean*/ );
RDebugUtils.currentLine=10551303;
 //BA.debugLineNum = 10551303;BA.debugLine="r.target = ci.CameraInfo";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _ci.CameraInfo /*Object*/ ;
RDebugUtils.currentLine=10551304;
 //BA.debugLineNum = 10551304;BA.debugLine="Dim orientation As Int = r.GetField(\"orientation\"";
_orientation = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("orientation")));
RDebugUtils.currentLine=10551305;
 //BA.debugLineNum = 10551305;BA.debugLine="If Front Then";
if (__ref._front /*boolean*/ ) { 
RDebugUtils.currentLine=10551306;
 //BA.debugLineNum = 10551306;BA.debugLine="previewResult = (orientation + degrees) Mod 360";
_previewresult = (int) ((_orientation+_degrees)%360);
RDebugUtils.currentLine=10551307;
 //BA.debugLineNum = 10551307;BA.debugLine="result = previewResult";
_result = _previewresult;
RDebugUtils.currentLine=10551308;
 //BA.debugLineNum = 10551308;BA.debugLine="previewResult = (360 - previewResult) Mod 360";
_previewresult = (int) ((360-_previewresult)%360);
 }else {
RDebugUtils.currentLine=10551310;
 //BA.debugLineNum = 10551310;BA.debugLine="previewResult = (orientation - degrees + 360) Mo";
_previewresult = (int) ((_orientation-_degrees+360)%360);
RDebugUtils.currentLine=10551311;
 //BA.debugLineNum = 10551311;BA.debugLine="result = previewResult";
_result = _previewresult;
RDebugUtils.currentLine=10551312;
 //BA.debugLineNum = 10551312;BA.debugLine="Log(previewResult)";
__c.LogImpl("010551312",BA.NumberToString(_previewresult),0);
 };
RDebugUtils.currentLine=10551314;
 //BA.debugLineNum = 10551314;BA.debugLine="r.target = nativeCam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._nativecam /*Object*/ ;
RDebugUtils.currentLine=10551315;
 //BA.debugLineNum = 10551315;BA.debugLine="r.RunMethod2(\"setDisplayOrientation\", previewResu";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setDisplayOrientation",BA.NumberToString(_previewresult),"java.lang.int");
RDebugUtils.currentLine=10551316;
 //BA.debugLineNum = 10551316;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=10551317;
 //BA.debugLineNum = 10551317;BA.debugLine="r.RunMethod2(\"setRotation\", result, \"java.lang.in";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setRotation",BA.NumberToString(_result),"java.lang.int");
RDebugUtils.currentLine=10551318;
 //BA.debugLineNum = 10551318;BA.debugLine="CommitParameters";
__ref._commitparameters /*String*/ (null);
RDebugUtils.currentLine=10551319;
 //BA.debugLineNum = 10551319;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Private nativeCam As Object";
_nativecam = new Object();
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="Private cam As Camera";
_cam = new anywheresoftware.b4a.objects.CameraW();
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="Private r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="Private target As Object";
_target = new Object();
RDebugUtils.currentLine=10354693;
 //BA.debugLineNum = 10354693;BA.debugLine="Private event As String";
_event = "";
RDebugUtils.currentLine=10354694;
 //BA.debugLineNum = 10354694;BA.debugLine="Public Front As Boolean";
_front = false;
RDebugUtils.currentLine=10354695;
 //BA.debugLineNum = 10354695;BA.debugLine="Type CameraInfoAndId (CameraInfo As Object, Id As";
;
RDebugUtils.currentLine=10354696;
 //BA.debugLineNum = 10354696;BA.debugLine="Type CameraSize (Width As Int, Height As Int)";
;
RDebugUtils.currentLine=10354697;
 //BA.debugLineNum = 10354697;BA.debugLine="Private parameters As Object";
_parameters = new Object();
RDebugUtils.currentLine=10354698;
 //BA.debugLineNum = 10354698;BA.debugLine="End Sub";
return "";
}
public String  _closenow(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "closenow", false))
	 {return ((String) Debug.delegate(ba, "closenow", null));}
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Public Sub CloseNow";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="cam.Release";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .Release();
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="r.target = cam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = (Object)(__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ );
RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="r.RunMethod2(\"releaseCameras\", True, \"java.lang.b";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("releaseCameras",BA.ObjectToString(__c.True),"java.lang.boolean");
RDebugUtils.currentLine=12386308;
 //BA.debugLineNum = 12386308;BA.debugLine="End Sub";
return "";
}
public String  _commitparameters(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "commitparameters", false))
	 {return ((String) Debug.delegate(ba, "commitparameters", null));}
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Public Sub CommitParameters";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Try";
try {RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="r.target = nativeCam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._nativecam /*Object*/ ;
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="r.RunMethod4(\"setParameters\", Array As Object(pa";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod4("setParameters",new Object[]{__ref._parameters /*Object*/ },new String[]{"android.hardware.Camera$Parameters"});
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="ToastMessageShow(\"Error setting parameters.\", Tr";
__c.ToastMessageShow(BA.ObjectToCharSequence("Error setting parameters."),__c.True);
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="Log(LastException)";
__c.LogImpl("011272198",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=11272200;
 //BA.debugLineNum = 11272200;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Private Sub FindCamera (frontCamera As Boolean) As";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="Dim ci As CameraInfoAndId";
_ci = new pdv.milotin.cameraexclass._camerainfoandid();
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="Dim cameraInfo As Object";
_camerainfo = new Object();
RDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="Dim cameraValue As Int";
_cameravalue = 0;
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="If frontCamera Then cameraValue = 1 Else cameraVa";
if (_frontcamera) { 
_cameravalue = (int) (1);}
else {
_cameravalue = (int) (0);};
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="cameraInfo = r.CreateObject(\"android.hardware.Cam";
_camerainfo = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .CreateObject("android.hardware.Camera$CameraInfo");
RDebugUtils.currentLine=10485766;
 //BA.debugLineNum = 10485766;BA.debugLine="Dim numberOfCameras As Int = r.RunStaticMethod(\"a";
_numberofcameras = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunStaticMethod("android.hardware.Camera","getNumberOfCameras",(Object[])(__c.Null),(String[])(__c.Null))));
RDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="For i = 0 To numberOfCameras - 1";
{
final int step7 = 1;
final int limit7 = (int) (_numberofcameras-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=10485768;
 //BA.debugLineNum = 10485768;BA.debugLine="r.RunStaticMethod(\"android.hardware.Camera\", \"ge";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunStaticMethod("android.hardware.Camera","getCameraInfo",new Object[]{(Object)(_i),_camerainfo},new String[]{"java.lang.int","android.hardware.Camera$CameraInfo"});
RDebugUtils.currentLine=10485770;
 //BA.debugLineNum = 10485770;BA.debugLine="r.target = cameraInfo";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _camerainfo;
RDebugUtils.currentLine=10485771;
 //BA.debugLineNum = 10485771;BA.debugLine="If r.GetField(\"facing\") = cameraValue Then";
if ((__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("facing")).equals((Object)(_cameravalue))) { 
RDebugUtils.currentLine=10485772;
 //BA.debugLineNum = 10485772;BA.debugLine="ci.cameraInfo = r.target";
_ci.CameraInfo /*Object*/  = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target;
RDebugUtils.currentLine=10485773;
 //BA.debugLineNum = 10485773;BA.debugLine="ci.Id = i";
_ci.Id /*int*/  = _i;
RDebugUtils.currentLine=10485774;
 //BA.debugLineNum = 10485774;BA.debugLine="Return ci";
if (true) return _ci;
 };
 }
};
RDebugUtils.currentLine=10485777;
 //BA.debugLineNum = 10485777;BA.debugLine="ci.id = -1";
_ci.Id /*int*/  = (int) (-1);
RDebugUtils.currentLine=10485778;
 //BA.debugLineNum = 10485778;BA.debugLine="Return ci";
if (true) return _ci;
RDebugUtils.currentLine=10485779;
 //BA.debugLineNum = 10485779;BA.debugLine="End Sub";
return null;
}
public String  _focusandtakepicture(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "focusandtakepicture", false))
	 {return ((String) Debug.delegate(ba, "focusandtakepicture", null));}
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Public Sub FocusAndTakePicture";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="cam.AutoFocus";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .AutoFocus();
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="End Sub";
return "";
}
public String  _getcoloreffect(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getcoloreffect", false))
	 {return ((String) Debug.delegate(ba, "getcoloreffect", null));}
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Public Sub GetColorEffect As String";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="Return GetParameter(\"effect\")";
if (true) return __ref._getparameter /*String*/ (null,"effect");
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="End Sub";
return "";
}
public String  _getparameter(pdv.milotin.cameraexclass __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getparameter", false))
	 {return ((String) Debug.delegate(ba, "getparameter", new Object[] {_key}));}
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Public Sub GetParameter(Key As String) As String";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="Return r.RunMethod2(\"get\", Key, \"java.lang.String";
if (true) return BA.ObjectToString(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("get",_key,"java.lang.String"));
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="End Sub";
return "";
}
public String  _getflashmode(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getflashmode", false))
	 {return ((String) Debug.delegate(ba, "getflashmode", null));}
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Public Sub GetFlashMode As String";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="Return r.RunMethod(\"getFlashMode\")";
if (true) return BA.ObjectToString(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getFlashMode"));
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="End Sub";
return "";
}
public float[]  _getfocusdistances(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getfocusdistances", false))
	 {return ((float[]) Debug.delegate(ba, "getfocusdistances", null));}
float[] _f = null;
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Public Sub GetFocusDistances As Float()";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="Dim F(3) As Float";
_f = new float[(int) (3)];
;
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="r.RunMethod4(\"getFocusDistances\", Array As Object";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod4("getFocusDistances",new Object[]{(Object)(_f)},new String[]{"[F"});
RDebugUtils.currentLine=12320772;
 //BA.debugLineNum = 12320772;BA.debugLine="Return F";
if (true) return _f;
RDebugUtils.currentLine=12320773;
 //BA.debugLineNum = 12320773;BA.debugLine="End Sub";
return null;
}
public pdv.milotin.cameraexclass._camerasize  _getpicturesize(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getpicturesize", false))
	 {return ((pdv.milotin.cameraexclass._camerasize) Debug.delegate(ba, "getpicturesize", null));}
pdv.milotin.cameraexclass._camerasize _cs = null;
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Public Sub GetPictureSize As CameraSize";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="r.target = r.RunMethod(\"getPictureSize\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPictureSize");
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="Dim cs As CameraSize";
_cs = new pdv.milotin.cameraexclass._camerasize();
RDebugUtils.currentLine=11993092;
 //BA.debugLineNum = 11993092;BA.debugLine="cs.Width = r.GetField(\"width\")";
_cs.Width /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
RDebugUtils.currentLine=11993093;
 //BA.debugLineNum = 11993093;BA.debugLine="cs.Height = r.GetField(\"height\")";
_cs.Height /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
RDebugUtils.currentLine=11993094;
 //BA.debugLineNum = 11993094;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=11993095;
 //BA.debugLineNum = 11993095;BA.debugLine="End Sub";
return null;
}
public pdv.milotin.cameraexclass._camerasize  _getpreviewsize(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getpreviewsize", false))
	 {return ((pdv.milotin.cameraexclass._camerasize) Debug.delegate(ba, "getpreviewsize", null));}
pdv.milotin.cameraexclass._camerasize _cs = null;
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Public Sub GetPreviewSize As CameraSize";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="r.target = r.RunMethod(\"getPreviewSize\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPreviewSize");
RDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="Dim cs As CameraSize";
_cs = new pdv.milotin.cameraexclass._camerasize();
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="cs.Width = r.GetField(\"width\")";
_cs.Width /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
RDebugUtils.currentLine=11927557;
 //BA.debugLineNum = 11927557;BA.debugLine="cs.Height = r.GetField(\"height\")";
_cs.Height /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
RDebugUtils.currentLine=11927558;
 //BA.debugLineNum = 11927558;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=11927559;
 //BA.debugLineNum = 11927559;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedcoloreffects(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedcoloreffects", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedcoloreffects", null));}
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Public Sub GetSupportedColorEffects As List";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="Return r.RunMethod(\"getSupportedColorEffects\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedColorEffects")));
RDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedflashmodes(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedflashmodes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedflashmodes", null));}
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Public Sub GetSupportedFlashModes As List";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="Return r.RunMethod(\"getSupportedFlashModes\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedFlashModes")));
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedfocusmodes(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedfocusmodes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedfocusmodes", null));}
anywheresoftware.b4a.objects.collections.List _fm = null;
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Public Sub GetSupportedFocusModes As List";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="Dim fm As List";
_fm = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="fm.initialize";
_fm.Initialize();
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="fm=r.RunMethod(\"getSupportedFocusModes\")";
_fm = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedFocusModes")));
RDebugUtils.currentLine=12124165;
 //BA.debugLineNum = 12124165;BA.debugLine="If fm.Get(0)=\"auto\" Then";
if ((_fm.Get((int) (0))).equals((Object)("auto"))) { 
RDebugUtils.currentLine=12124166;
 //BA.debugLineNum = 12124166;BA.debugLine="FocusAndTakePicture";
__ref._focusandtakepicture /*String*/ (null);
 }else {
RDebugUtils.currentLine=12124168;
 //BA.debugLineNum = 12124168;BA.debugLine="TakePicture";
__ref._takepicture /*String*/ (null);
 };
RDebugUtils.currentLine=12124170;
 //BA.debugLineNum = 12124170;BA.debugLine="Return r.RunMethod(\"getSupportedFocusModes\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedFocusModes")));
RDebugUtils.currentLine=12124171;
 //BA.debugLineNum = 12124171;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Public Sub GetSupportedPicturesSizes As CameraSize";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="Dim list1 As List = r.RunMethod(\"getSupportedPict";
_list1 = new anywheresoftware.b4a.objects.collections.List();
_list1 = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedPictureSizes")));
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="Dim cs(list1.Size) As CameraSize";
_cs = new pdv.milotin.cameraexclass._camerasize[_list1.getSize()];
{
int d0 = _cs.length;
for (int i0 = 0;i0 < d0;i0++) {
_cs[i0] = new pdv.milotin.cameraexclass._camerasize();
}
}
;
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="For i = 0 To list1.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="r.target = list1.Get(i)";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _list1.Get(_i);
RDebugUtils.currentLine=11468806;
 //BA.debugLineNum = 11468806;BA.debugLine="cs(i).Width = r.GetField(\"width\")";
_cs[_i].Width /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
RDebugUtils.currentLine=11468807;
 //BA.debugLineNum = 11468807;BA.debugLine="cs(i).Height = r.GetField(\"height\")";
_cs[_i].Height /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
 }
};
RDebugUtils.currentLine=11468809;
 //BA.debugLineNum = 11468809;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=11468810;
 //BA.debugLineNum = 11468810;BA.debugLine="End Sub";
return null;
}
public String  _initialize(pdv.milotin.cameraexclass __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _panel1,boolean _frontcamera,Object _targetmodule,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_panel1,_frontcamera,_targetmodule,_eventname}));}
int _id = 0;
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Public Sub Initialize (Panel1 As Panel, FrontCamer";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="target = TargetModule";
__ref._target /*Object*/  = _targetmodule;
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="event = EventName";
__ref._event /*String*/  = _eventname;
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="Front = FrontCamera";
__ref._front /*boolean*/  = _frontcamera;
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="Dim id As Int";
_id = 0;
RDebugUtils.currentLine=10420229;
 //BA.debugLineNum = 10420229;BA.debugLine="id = FindCamera(Front).id";
_id = __ref._findcamera /*pdv.milotin.cameraexclass._camerainfoandid*/ (null,__ref._front /*boolean*/ ).Id /*int*/ ;
RDebugUtils.currentLine=10420230;
 //BA.debugLineNum = 10420230;BA.debugLine="If id = -1 Then";
if (_id==-1) { 
RDebugUtils.currentLine=10420231;
 //BA.debugLineNum = 10420231;BA.debugLine="Front = Not(Front) 'try different camera";
__ref._front /*boolean*/  = __c.Not(__ref._front /*boolean*/ );
RDebugUtils.currentLine=10420232;
 //BA.debugLineNum = 10420232;BA.debugLine="id = FindCamera(Front).id";
_id = __ref._findcamera /*pdv.milotin.cameraexclass._camerainfoandid*/ (null,__ref._front /*boolean*/ ).Id /*int*/ ;
RDebugUtils.currentLine=10420233;
 //BA.debugLineNum = 10420233;BA.debugLine="If id = -1 Then";
if (_id==-1) { 
RDebugUtils.currentLine=10420234;
 //BA.debugLineNum = 10420234;BA.debugLine="ToastMessageShow(\"No camera found.\", True)";
__c.ToastMessageShow(BA.ObjectToCharSequence("No camera found."),__c.True);
RDebugUtils.currentLine=10420235;
 //BA.debugLineNum = 10420235;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=10420238;
 //BA.debugLineNum = 10420238;BA.debugLine="cam.Initialize2(Panel1, \"camera\", id)";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .Initialize2(ba,(android.view.ViewGroup)(_panel1.getObject()),"camera",_id);
RDebugUtils.currentLine=10420239;
 //BA.debugLineNum = 10420239;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Public Sub PreviewImageToJpeg(data() As Byte, qual";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="Dim size, previewFormat As Object";
_size = new Object();
_previewformat = new Object();
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=12058627;
 //BA.debugLineNum = 12058627;BA.debugLine="size = r.RunMethod(\"getPreviewSize\")";
_size = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPreviewSize");
RDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="previewFormat = r.RunMethod(\"getPreviewFormat\")";
_previewformat = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPreviewFormat");
RDebugUtils.currentLine=12058629;
 //BA.debugLineNum = 12058629;BA.debugLine="r.target = size";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _size;
RDebugUtils.currentLine=12058630;
 //BA.debugLineNum = 12058630;BA.debugLine="Dim width = r.GetField(\"width\"), height = r.GetFi";
_width = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
_height = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
RDebugUtils.currentLine=12058631;
 //BA.debugLineNum = 12058631;BA.debugLine="Dim yuvImage As Object = r.CreateObject2(\"android";
_yuvimage = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .CreateObject2("android.graphics.YuvImage",new Object[]{(Object)(_data),_previewformat,(Object)(_width),(Object)(_height),__c.Null},new String[]{"[B","java.lang.int","java.lang.int","java.lang.int","[I"});
RDebugUtils.currentLine=12058634;
 //BA.debugLineNum = 12058634;BA.debugLine="r.target = yuvImage";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _yuvimage;
RDebugUtils.currentLine=12058635;
 //BA.debugLineNum = 12058635;BA.debugLine="Dim rect1 As Rect";
_rect1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=12058636;
 //BA.debugLineNum = 12058636;BA.debugLine="rect1.Initialize(0, 0, r.RunMethod(\"getWidth\"), r";
_rect1.Initialize((int) (0),(int) (0),(int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getWidth"))),(int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getHeight"))));
RDebugUtils.currentLine=12058637;
 //BA.debugLineNum = 12058637;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=12058638;
 //BA.debugLineNum = 12058638;BA.debugLine="out.InitializeToBytesArray(100)";
_out.InitializeToBytesArray((int) (100));
RDebugUtils.currentLine=12058639;
 //BA.debugLineNum = 12058639;BA.debugLine="r.RunMethod4(\"compressToJpeg\", Array As Object(re";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod4("compressToJpeg",new Object[]{(Object)(_rect1.getObject()),(Object)(_quality),(Object)(_out.getObject())},new String[]{"android.graphics.Rect","java.lang.int","java.io.OutputStream"});
RDebugUtils.currentLine=12058641;
 //BA.debugLineNum = 12058641;BA.debugLine="Return out.ToBytesArray";
if (true) return _out.ToBytesArray();
RDebugUtils.currentLine=12058642;
 //BA.debugLineNum = 12058642;BA.debugLine="End Sub";
return null;
}
public String  _release(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "release", false))
	 {return ((String) Debug.delegate(ba, "release", null));}
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Public Sub Release";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="cam.Release";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .Release();
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="End Sub";
return "";
}
public String  _savepicturetofile(pdv.milotin.cameraexclass __ref,byte[] _data,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "savepicturetofile", false))
	 {return ((String) Debug.delegate(ba, "savepicturetofile", new Object[] {_data,_dir,_filename}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Public Sub SavePictureToFile(Data() As Byte, Dir A";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_dir,_filename,__c.False);
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
RDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="End Sub";
return "";
}
public String  _setcoloreffect(pdv.milotin.cameraexclass __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setcoloreffect", false))
	 {return ((String) Debug.delegate(ba, "setcoloreffect", new Object[] {_effect}));}
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Public Sub SetColorEffect(Effect As String)";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="SetParameter(\"effect\", Effect)";
__ref._setparameter /*String*/ (null,"effect",_effect);
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="End Sub";
return "";
}
public String  _setparameter(pdv.milotin.cameraexclass __ref,String _key,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setparameter", false))
	 {return ((String) Debug.delegate(ba, "setparameter", new Object[] {_key,_value}));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Public Sub SetParameter(Key As String, Value As St";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="r.RunMethod3(\"set\", Key, \"java.lang.String\", Valu";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod3("set",_key,"java.lang.String",_value,"java.lang.String");
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="End Sub";
return "";
}
public String  _setcontinuousautofocus(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setcontinuousautofocus", false))
	 {return ((String) Debug.delegate(ba, "setcontinuousautofocus", null));}
anywheresoftware.b4a.objects.collections.List _modes = null;
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Public Sub SetContinuousAutoFocus";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="Dim modes As List = GetSupportedFocusModes";
_modes = new anywheresoftware.b4a.objects.collections.List();
_modes = __ref._getsupportedfocusmodes /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="If modes.IndexOf(\"continuous-picture\") > -1 Th";
if (_modes.IndexOf((Object)("continuous-picture"))>-1) { 
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="SetFocusMode(\"continuous-picture\")";
__ref._setfocusmode /*String*/ (null,"continuous-picture");
 }else 
{RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="Else If modes.IndexOf(\"continuous-video\") > -1";
if (_modes.IndexOf((Object)("continuous-video"))>-1) { 
RDebugUtils.currentLine=12189701;
 //BA.debugLineNum = 12189701;BA.debugLine="SetFocusMode(\"continuous-video\")";
__ref._setfocusmode /*String*/ (null,"continuous-video");
 }else {
RDebugUtils.currentLine=12189703;
 //BA.debugLineNum = 12189703;BA.debugLine="Log(\"Continuous focus mode is not availabl";
__c.LogImpl("012189703","Continuous focus mode is not available",0);
 }}
;
RDebugUtils.currentLine=12189705;
 //BA.debugLineNum = 12189705;BA.debugLine="End Sub";
return "";
}
public String  _setfocusmode(pdv.milotin.cameraexclass __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setfocusmode", false))
	 {return ((String) Debug.delegate(ba, "setfocusmode", new Object[] {_mode}));}
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Public Sub SetFocusMode(Mode As String)";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="r.RunMethod2(\"setFocusMode\", Mode, \"java.lang.";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setFocusMode",_mode,"java.lang.String");
RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="End Sub";
return "";
}
public String  _setflashmode(pdv.milotin.cameraexclass __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setflashmode", false))
	 {return ((String) Debug.delegate(ba, "setflashmode", new Object[] {_mode}));}
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Public Sub SetFlashMode(Mode As String)";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="r.RunMethod2(\"setFlashMode\", Mode, \"java.lang.Str";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setFlashMode",_mode,"java.lang.String");
RDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="End Sub";
return "";
}
public String  _setjpegquality(pdv.milotin.cameraexclass __ref,int _quality) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setjpegquality", false))
	 {return ((String) Debug.delegate(ba, "setjpegquality", new Object[] {_quality}));}
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Public Sub SetJpegQuality(Quality As Int)";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="r.RunMethod2(\"setJpegQuality\", Quality, \"java.lan";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setJpegQuality",BA.NumberToString(_quality),"java.lang.int");
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="End Sub";
return "";
}
public String  _setpicturesize(pdv.milotin.cameraexclass __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setpicturesize", false))
	 {return ((String) Debug.delegate(ba, "setpicturesize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Public Sub SetPictureSize(Width As Int, Height As";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="r.RunMethod3(\"setPictureSize\", Width, \"java.lang.";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod3("setPictureSize",BA.NumberToString(_width),"java.lang.int",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="End Sub";
return "";
}
public String  _startpreview(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "startpreview", false))
	 {return ((String) Debug.delegate(ba, "startpreview", null));}
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Public Sub StartPreview";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="cam.StartPreview";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .StartPreview();
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="End Sub";
return "";
}
public String  _stoppreview(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "stoppreview", false))
	 {return ((String) Debug.delegate(ba, "stoppreview", null));}
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Public Sub StopPreview";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="cam.StopPreview";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .StopPreview();
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="End Sub";
return "";
}
}