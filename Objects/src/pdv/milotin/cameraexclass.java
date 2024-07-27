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
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Private Sub Camera_FocusDone (Success As Boolean)";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="TakePicture";
__ref._takepicture /*String*/ (null);
 }else {
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="Log(\"AutoFocus error.\")";
__c.LogImpl("48716292","AutoFocus error.",0);
 };
RDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="End Sub";
return "";
}
public String  _takepicture(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "takepicture", false))
	 {return ((String) Debug.delegate(ba, "takepicture", null));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Public Sub TakePicture";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="cam.TakePicture";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .TakePicture();
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="End Sub";
return "";
}
public String  _camera_picturetaken(pdv.milotin.cameraexclass __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "camera_picturetaken", false))
	 {return ((String) Debug.delegate(ba, "camera_picturetaken", new Object[] {_data}));}
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Private Sub Camera_PictureTaken (Data() As Byte)";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="CallSub2(target, event & \"_PictureTaken\", Data)";
__c.CallSubNew2(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_PictureTaken",(Object)(_data));
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="End Sub";
return "";
}
public String  _camera_preview(pdv.milotin.cameraexclass __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "camera_preview", false))
	 {return ((String) Debug.delegate(ba, "camera_preview", new Object[] {_data}));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub Camera_Preview (Data() As Byte)";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="If SubExists(target, event & \"_preview\") Then";
if (__c.SubExists(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_preview")) { 
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="CallSub2(target, event & \"_preview\", Data)";
__c.CallSubNew2(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_preview",(Object)(_data));
 };
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="End Sub";
return "";
}
public String  _camera_ready(pdv.milotin.cameraexclass __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "camera_ready", false))
	 {return ((String) Debug.delegate(ba, "camera_ready", new Object[] {_success}));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Private Sub Camera_Ready (Success As Boolean)";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="r.target = cam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = (Object)(__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ );
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="nativeCam = r.GetField(\"camera\")";
__ref._nativecam /*Object*/  = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("camera");
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="r.target = nativeCam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._nativecam /*Object*/ ;
RDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="parameters = r.RunMethod(\"getParameters\")";
__ref._parameters /*Object*/  = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getParameters");
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="SetDisplayOrientation";
__ref._setdisplayorientation /*String*/ (null);
 }else {
RDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="Log(\"success = false, \" & LastException)";
__c.LogImpl("46815752","success = false, "+BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=6815754;
 //BA.debugLineNum = 6815754;BA.debugLine="CallSub2(target, event & \"_ready\", Success)";
__c.CallSubNew2(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_ready",(Object)(_success));
RDebugUtils.currentLine=6815755;
 //BA.debugLineNum = 6815755;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Private Sub SetDisplayOrientation";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="r.target = r.GetActivity";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = (Object)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetActivity(ba));
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="r.target = r.RunMethod(\"getWindowManager\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getWindowManager");
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="r.target = r.RunMethod(\"getDefaultDisplay\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getDefaultDisplay");
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="r.target = r.RunMethod(\"getRotation\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getRotation");
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="Dim previewResult, result, degrees As Int = r.tar";
_previewresult = 0;
_result = 0;
_degrees = (int) ((double)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target))*90);
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="Dim ci As CameraInfoAndId = FindCamera(Front)";
_ci = __ref._findcamera /*pdv.milotin.cameraexclass._camerainfoandid*/ (null,__ref._front /*boolean*/ );
RDebugUtils.currentLine=6750215;
 //BA.debugLineNum = 6750215;BA.debugLine="r.target = ci.CameraInfo";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _ci.CameraInfo /*Object*/ ;
RDebugUtils.currentLine=6750216;
 //BA.debugLineNum = 6750216;BA.debugLine="Dim orientation As Int = r.GetField(\"orientation\"";
_orientation = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("orientation")));
RDebugUtils.currentLine=6750217;
 //BA.debugLineNum = 6750217;BA.debugLine="If Front Then";
if (__ref._front /*boolean*/ ) { 
RDebugUtils.currentLine=6750218;
 //BA.debugLineNum = 6750218;BA.debugLine="previewResult = (orientation + degrees) Mod 360";
_previewresult = (int) ((_orientation+_degrees)%360);
RDebugUtils.currentLine=6750219;
 //BA.debugLineNum = 6750219;BA.debugLine="result = previewResult";
_result = _previewresult;
RDebugUtils.currentLine=6750220;
 //BA.debugLineNum = 6750220;BA.debugLine="previewResult = (360 - previewResult) Mod 360";
_previewresult = (int) ((360-_previewresult)%360);
 }else {
RDebugUtils.currentLine=6750222;
 //BA.debugLineNum = 6750222;BA.debugLine="previewResult = (orientation - degrees + 360) Mo";
_previewresult = (int) ((_orientation-_degrees+360)%360);
RDebugUtils.currentLine=6750223;
 //BA.debugLineNum = 6750223;BA.debugLine="result = previewResult";
_result = _previewresult;
RDebugUtils.currentLine=6750224;
 //BA.debugLineNum = 6750224;BA.debugLine="Log(previewResult)";
__c.LogImpl("46750224",BA.NumberToString(_previewresult),0);
 };
RDebugUtils.currentLine=6750226;
 //BA.debugLineNum = 6750226;BA.debugLine="r.target = nativeCam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._nativecam /*Object*/ ;
RDebugUtils.currentLine=6750227;
 //BA.debugLineNum = 6750227;BA.debugLine="r.RunMethod2(\"setDisplayOrientation\", previewResu";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setDisplayOrientation",BA.NumberToString(_previewresult),"java.lang.int");
RDebugUtils.currentLine=6750228;
 //BA.debugLineNum = 6750228;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=6750229;
 //BA.debugLineNum = 6750229;BA.debugLine="r.RunMethod2(\"setRotation\", result, \"java.lang.in";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setRotation",BA.NumberToString(_result),"java.lang.int");
RDebugUtils.currentLine=6750230;
 //BA.debugLineNum = 6750230;BA.debugLine="CommitParameters";
__ref._commitparameters /*String*/ (null);
RDebugUtils.currentLine=6750231;
 //BA.debugLineNum = 6750231;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="Private nativeCam As Object";
_nativecam = new Object();
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="Private cam As Camera";
_cam = new anywheresoftware.b4a.objects.CameraW();
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="Private r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="Private target As Object";
_target = new Object();
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="Private event As String";
_event = "";
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="Public Front As Boolean";
_front = false;
RDebugUtils.currentLine=6553607;
 //BA.debugLineNum = 6553607;BA.debugLine="Type CameraInfoAndId (CameraInfo As Object, Id As";
;
RDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="Type CameraSize (Width As Int, Height As Int)";
;
RDebugUtils.currentLine=6553609;
 //BA.debugLineNum = 6553609;BA.debugLine="Private parameters As Object";
_parameters = new Object();
RDebugUtils.currentLine=6553610;
 //BA.debugLineNum = 6553610;BA.debugLine="End Sub";
return "";
}
public String  _closenow(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "closenow", false))
	 {return ((String) Debug.delegate(ba, "closenow", null));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub CloseNow";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="cam.Release";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .Release();
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="r.target = cam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = (Object)(__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ );
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="r.RunMethod2(\"releaseCameras\", True, \"java.lang.b";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("releaseCameras",BA.ObjectToString(__c.True),"java.lang.boolean");
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="End Sub";
return "";
}
public String  _commitparameters(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "commitparameters", false))
	 {return ((String) Debug.delegate(ba, "commitparameters", null));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Public Sub CommitParameters";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="Try";
try {RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="r.target = nativeCam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._nativecam /*Object*/ ;
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="r.RunMethod4(\"setParameters\", Array As Object(pa";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod4("setParameters",new Object[]{__ref._parameters /*Object*/ },new String[]{"android.hardware.Camera$Parameters"});
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="ToastMessageShow(\"Error setting parameters.\", Tr";
__c.ToastMessageShow(BA.ObjectToCharSequence("Error setting parameters."),__c.True);
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="Log(LastException)";
__c.LogImpl("47471110",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=7471112;
 //BA.debugLineNum = 7471112;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Private Sub FindCamera (frontCamera As Boolean) As";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Dim ci As CameraInfoAndId";
_ci = new pdv.milotin.cameraexclass._camerainfoandid();
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="Dim cameraInfo As Object";
_camerainfo = new Object();
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="Dim cameraValue As Int";
_cameravalue = 0;
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="If frontCamera Then cameraValue = 1 Else cameraVa";
if (_frontcamera) { 
_cameravalue = (int) (1);}
else {
_cameravalue = (int) (0);};
RDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="cameraInfo = r.CreateObject(\"android.hardware.Cam";
_camerainfo = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .CreateObject("android.hardware.Camera$CameraInfo");
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="Dim numberOfCameras As Int = r.RunStaticMethod(\"a";
_numberofcameras = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunStaticMethod("android.hardware.Camera","getNumberOfCameras",(Object[])(__c.Null),(String[])(__c.Null))));
RDebugUtils.currentLine=6684679;
 //BA.debugLineNum = 6684679;BA.debugLine="For i = 0 To numberOfCameras - 1";
{
final int step7 = 1;
final int limit7 = (int) (_numberofcameras-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="r.RunStaticMethod(\"android.hardware.Camera\", \"ge";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunStaticMethod("android.hardware.Camera","getCameraInfo",new Object[]{(Object)(_i),_camerainfo},new String[]{"java.lang.int","android.hardware.Camera$CameraInfo"});
RDebugUtils.currentLine=6684682;
 //BA.debugLineNum = 6684682;BA.debugLine="r.target = cameraInfo";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _camerainfo;
RDebugUtils.currentLine=6684683;
 //BA.debugLineNum = 6684683;BA.debugLine="If r.GetField(\"facing\") = cameraValue Then";
if ((__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("facing")).equals((Object)(_cameravalue))) { 
RDebugUtils.currentLine=6684684;
 //BA.debugLineNum = 6684684;BA.debugLine="ci.cameraInfo = r.target";
_ci.CameraInfo /*Object*/  = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target;
RDebugUtils.currentLine=6684685;
 //BA.debugLineNum = 6684685;BA.debugLine="ci.Id = i";
_ci.Id /*int*/  = _i;
RDebugUtils.currentLine=6684686;
 //BA.debugLineNum = 6684686;BA.debugLine="Return ci";
if (true) return _ci;
 };
 }
};
RDebugUtils.currentLine=6684689;
 //BA.debugLineNum = 6684689;BA.debugLine="ci.id = -1";
_ci.Id /*int*/  = (int) (-1);
RDebugUtils.currentLine=6684690;
 //BA.debugLineNum = 6684690;BA.debugLine="Return ci";
if (true) return _ci;
RDebugUtils.currentLine=6684691;
 //BA.debugLineNum = 6684691;BA.debugLine="End Sub";
return null;
}
public String  _focusandtakepicture(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "focusandtakepicture", false))
	 {return ((String) Debug.delegate(ba, "focusandtakepicture", null));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Public Sub FocusAndTakePicture";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="cam.AutoFocus";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .AutoFocus();
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="End Sub";
return "";
}
public String  _getcoloreffect(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getcoloreffect", false))
	 {return ((String) Debug.delegate(ba, "getcoloreffect", null));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Public Sub GetColorEffect As String";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="Return GetParameter(\"effect\")";
if (true) return __ref._getparameter /*String*/ (null,"effect");
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="End Sub";
return "";
}
public String  _getparameter(pdv.milotin.cameraexclass __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getparameter", false))
	 {return ((String) Debug.delegate(ba, "getparameter", new Object[] {_key}));}
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Public Sub GetParameter(Key As String) As String";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="Return r.RunMethod2(\"get\", Key, \"java.lang.String";
if (true) return BA.ObjectToString(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("get",_key,"java.lang.String"));
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="End Sub";
return "";
}
public String  _getflashmode(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getflashmode", false))
	 {return ((String) Debug.delegate(ba, "getflashmode", null));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Public Sub GetFlashMode As String";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="Return r.RunMethod(\"getFlashMode\")";
if (true) return BA.ObjectToString(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getFlashMode"));
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="End Sub";
return "";
}
public float[]  _getfocusdistances(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getfocusdistances", false))
	 {return ((float[]) Debug.delegate(ba, "getfocusdistances", null));}
float[] _f = null;
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Public Sub GetFocusDistances As Float()";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="Dim F(3) As Float";
_f = new float[(int) (3)];
;
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="r.RunMethod4(\"getFocusDistances\", Array As Object";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod4("getFocusDistances",new Object[]{(Object)(_f)},new String[]{"[F"});
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="Return F";
if (true) return _f;
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="End Sub";
return null;
}
public pdv.milotin.cameraexclass._camerasize  _getpicturesize(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getpicturesize", false))
	 {return ((pdv.milotin.cameraexclass._camerasize) Debug.delegate(ba, "getpicturesize", null));}
pdv.milotin.cameraexclass._camerasize _cs = null;
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub GetPictureSize As CameraSize";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="r.target = r.RunMethod(\"getPictureSize\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPictureSize");
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="Dim cs As CameraSize";
_cs = new pdv.milotin.cameraexclass._camerasize();
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="cs.Width = r.GetField(\"width\")";
_cs.Width /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="cs.Height = r.GetField(\"height\")";
_cs.Height /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
RDebugUtils.currentLine=8192006;
 //BA.debugLineNum = 8192006;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=8192007;
 //BA.debugLineNum = 8192007;BA.debugLine="End Sub";
return null;
}
public pdv.milotin.cameraexclass._camerasize  _getpreviewsize(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getpreviewsize", false))
	 {return ((pdv.milotin.cameraexclass._camerasize) Debug.delegate(ba, "getpreviewsize", null));}
pdv.milotin.cameraexclass._camerasize _cs = null;
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub GetPreviewSize As CameraSize";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="r.target = r.RunMethod(\"getPreviewSize\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPreviewSize");
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="Dim cs As CameraSize";
_cs = new pdv.milotin.cameraexclass._camerasize();
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="cs.Width = r.GetField(\"width\")";
_cs.Width /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="cs.Height = r.GetField(\"height\")";
_cs.Height /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
RDebugUtils.currentLine=8126470;
 //BA.debugLineNum = 8126470;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=8126471;
 //BA.debugLineNum = 8126471;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedcoloreffects(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedcoloreffects", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedcoloreffects", null));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub GetSupportedColorEffects As List";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="Return r.RunMethod(\"getSupportedColorEffects\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedColorEffects")));
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedflashmodes(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedflashmodes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedflashmodes", null));}
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Public Sub GetSupportedFlashModes As List";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="Return r.RunMethod(\"getSupportedFlashModes\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedFlashModes")));
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedfocusmodes(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedfocusmodes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedfocusmodes", null));}
anywheresoftware.b4a.objects.collections.List _fm = null;
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub GetSupportedFocusModes As List";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="Dim fm As List";
_fm = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="fm.initialize";
_fm.Initialize();
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="fm=r.RunMethod(\"getSupportedFocusModes\")";
_fm = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedFocusModes")));
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="If fm.Get(0)=\"auto\" Then";
if ((_fm.Get((int) (0))).equals((Object)("auto"))) { 
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="FocusAndTakePicture";
__ref._focusandtakepicture /*String*/ (null);
 }else {
RDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="TakePicture";
__ref._takepicture /*String*/ (null);
 };
RDebugUtils.currentLine=8323082;
 //BA.debugLineNum = 8323082;BA.debugLine="Return r.RunMethod(\"getSupportedFocusModes\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedFocusModes")));
RDebugUtils.currentLine=8323083;
 //BA.debugLineNum = 8323083;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Public Sub GetSupportedPicturesSizes As CameraSize";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="Dim list1 As List = r.RunMethod(\"getSupportedPict";
_list1 = new anywheresoftware.b4a.objects.collections.List();
_list1 = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedPictureSizes")));
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="Dim cs(list1.Size) As CameraSize";
_cs = new pdv.milotin.cameraexclass._camerasize[_list1.getSize()];
{
int d0 = _cs.length;
for (int i0 = 0;i0 < d0;i0++) {
_cs[i0] = new pdv.milotin.cameraexclass._camerasize();
}
}
;
RDebugUtils.currentLine=7667716;
 //BA.debugLineNum = 7667716;BA.debugLine="For i = 0 To list1.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=7667717;
 //BA.debugLineNum = 7667717;BA.debugLine="r.target = list1.Get(i)";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _list1.Get(_i);
RDebugUtils.currentLine=7667718;
 //BA.debugLineNum = 7667718;BA.debugLine="cs(i).Width = r.GetField(\"width\")";
_cs[_i].Width /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
RDebugUtils.currentLine=7667719;
 //BA.debugLineNum = 7667719;BA.debugLine="cs(i).Height = r.GetField(\"height\")";
_cs[_i].Height /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
 }
};
RDebugUtils.currentLine=7667721;
 //BA.debugLineNum = 7667721;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=7667722;
 //BA.debugLineNum = 7667722;BA.debugLine="End Sub";
return null;
}
public String  _initialize(pdv.milotin.cameraexclass __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _panel1,boolean _frontcamera,Object _targetmodule,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_panel1,_frontcamera,_targetmodule,_eventname}));}
int _id = 0;
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Public Sub Initialize (Panel1 As Panel, FrontCamer";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="target = TargetModule";
__ref._target /*Object*/  = _targetmodule;
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="event = EventName";
__ref._event /*String*/  = _eventname;
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="Front = FrontCamera";
__ref._front /*boolean*/  = _frontcamera;
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="Dim id As Int";
_id = 0;
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="id = FindCamera(Front).id";
_id = __ref._findcamera /*pdv.milotin.cameraexclass._camerainfoandid*/ (null,__ref._front /*boolean*/ ).Id /*int*/ ;
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="If id = -1 Then";
if (_id==-1) { 
RDebugUtils.currentLine=6619143;
 //BA.debugLineNum = 6619143;BA.debugLine="Front = Not(Front) 'try different camera";
__ref._front /*boolean*/  = __c.Not(__ref._front /*boolean*/ );
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="id = FindCamera(Front).id";
_id = __ref._findcamera /*pdv.milotin.cameraexclass._camerainfoandid*/ (null,__ref._front /*boolean*/ ).Id /*int*/ ;
RDebugUtils.currentLine=6619145;
 //BA.debugLineNum = 6619145;BA.debugLine="If id = -1 Then";
if (_id==-1) { 
RDebugUtils.currentLine=6619146;
 //BA.debugLineNum = 6619146;BA.debugLine="ToastMessageShow(\"No camera found.\", True)";
__c.ToastMessageShow(BA.ObjectToCharSequence("No camera found."),__c.True);
RDebugUtils.currentLine=6619147;
 //BA.debugLineNum = 6619147;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=6619150;
 //BA.debugLineNum = 6619150;BA.debugLine="cam.Initialize2(Panel1, \"camera\", id)";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .Initialize2(ba,(android.view.ViewGroup)(_panel1.getObject()),"camera",_id);
RDebugUtils.currentLine=6619151;
 //BA.debugLineNum = 6619151;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Public Sub PreviewImageToJpeg(data() As Byte, qual";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Dim size, previewFormat As Object";
_size = new Object();
_previewformat = new Object();
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="size = r.RunMethod(\"getPreviewSize\")";
_size = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPreviewSize");
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="previewFormat = r.RunMethod(\"getPreviewFormat\")";
_previewformat = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPreviewFormat");
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="r.target = size";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _size;
RDebugUtils.currentLine=8257542;
 //BA.debugLineNum = 8257542;BA.debugLine="Dim width = r.GetField(\"width\"), height = r.GetFi";
_width = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
_height = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
RDebugUtils.currentLine=8257543;
 //BA.debugLineNum = 8257543;BA.debugLine="Dim yuvImage As Object = r.CreateObject2(\"android";
_yuvimage = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .CreateObject2("android.graphics.YuvImage",new Object[]{(Object)(_data),_previewformat,(Object)(_width),(Object)(_height),__c.Null},new String[]{"[B","java.lang.int","java.lang.int","java.lang.int","[I"});
RDebugUtils.currentLine=8257546;
 //BA.debugLineNum = 8257546;BA.debugLine="r.target = yuvImage";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _yuvimage;
RDebugUtils.currentLine=8257547;
 //BA.debugLineNum = 8257547;BA.debugLine="Dim rect1 As Rect";
_rect1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=8257548;
 //BA.debugLineNum = 8257548;BA.debugLine="rect1.Initialize(0, 0, r.RunMethod(\"getWidth\"), r";
_rect1.Initialize((int) (0),(int) (0),(int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getWidth"))),(int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getHeight"))));
RDebugUtils.currentLine=8257549;
 //BA.debugLineNum = 8257549;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=8257550;
 //BA.debugLineNum = 8257550;BA.debugLine="out.InitializeToBytesArray(100)";
_out.InitializeToBytesArray((int) (100));
RDebugUtils.currentLine=8257551;
 //BA.debugLineNum = 8257551;BA.debugLine="r.RunMethod4(\"compressToJpeg\", Array As Object(re";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod4("compressToJpeg",new Object[]{(Object)(_rect1.getObject()),(Object)(_quality),(Object)(_out.getObject())},new String[]{"android.graphics.Rect","java.lang.int","java.io.OutputStream"});
RDebugUtils.currentLine=8257553;
 //BA.debugLineNum = 8257553;BA.debugLine="Return out.ToBytesArray";
if (true) return _out.ToBytesArray();
RDebugUtils.currentLine=8257554;
 //BA.debugLineNum = 8257554;BA.debugLine="End Sub";
return null;
}
public String  _release(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "release", false))
	 {return ((String) Debug.delegate(ba, "release", null));}
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Public Sub Release";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="cam.Release";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .Release();
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="End Sub";
return "";
}
public String  _savepicturetofile(pdv.milotin.cameraexclass __ref,byte[] _data,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "savepicturetofile", false))
	 {return ((String) Debug.delegate(ba, "savepicturetofile", new Object[] {_data,_dir,_filename}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Public Sub SavePictureToFile(Data() As Byte, Dir A";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_dir,_filename,__c.False);
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="End Sub";
return "";
}
public String  _setcoloreffect(pdv.milotin.cameraexclass __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setcoloreffect", false))
	 {return ((String) Debug.delegate(ba, "setcoloreffect", new Object[] {_effect}));}
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub SetColorEffect(Effect As String)";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="SetParameter(\"effect\", Effect)";
__ref._setparameter /*String*/ (null,"effect",_effect);
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="End Sub";
return "";
}
public String  _setparameter(pdv.milotin.cameraexclass __ref,String _key,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setparameter", false))
	 {return ((String) Debug.delegate(ba, "setparameter", new Object[] {_key,_value}));}
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Public Sub SetParameter(Key As String, Value As St";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="r.RunMethod3(\"set\", Key, \"java.lang.String\", Valu";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod3("set",_key,"java.lang.String",_value,"java.lang.String");
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="End Sub";
return "";
}
public String  _setcontinuousautofocus(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setcontinuousautofocus", false))
	 {return ((String) Debug.delegate(ba, "setcontinuousautofocus", null));}
anywheresoftware.b4a.objects.collections.List _modes = null;
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Public Sub SetContinuousAutoFocus";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Dim modes As List = GetSupportedFocusModes";
_modes = new anywheresoftware.b4a.objects.collections.List();
_modes = __ref._getsupportedfocusmodes /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="If modes.IndexOf(\"continuous-picture\") > -1 Th";
if (_modes.IndexOf((Object)("continuous-picture"))>-1) { 
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="SetFocusMode(\"continuous-picture\")";
__ref._setfocusmode /*String*/ (null,"continuous-picture");
 }else 
{RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="Else If modes.IndexOf(\"continuous-video\") > -1";
if (_modes.IndexOf((Object)("continuous-video"))>-1) { 
RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="SetFocusMode(\"continuous-video\")";
__ref._setfocusmode /*String*/ (null,"continuous-video");
 }else {
RDebugUtils.currentLine=8388615;
 //BA.debugLineNum = 8388615;BA.debugLine="Log(\"Continuous focus mode is not availabl";
__c.LogImpl("48388615","Continuous focus mode is not available",0);
 }}
;
RDebugUtils.currentLine=8388617;
 //BA.debugLineNum = 8388617;BA.debugLine="End Sub";
return "";
}
public String  _setfocusmode(pdv.milotin.cameraexclass __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setfocusmode", false))
	 {return ((String) Debug.delegate(ba, "setfocusmode", new Object[] {_mode}));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Public Sub SetFocusMode(Mode As String)";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="r.RunMethod2(\"setFocusMode\", Mode, \"java.lang.";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setFocusMode",_mode,"java.lang.String");
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="End Sub";
return "";
}
public String  _setflashmode(pdv.milotin.cameraexclass __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setflashmode", false))
	 {return ((String) Debug.delegate(ba, "setflashmode", new Object[] {_mode}));}
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub SetFlashMode(Mode As String)";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="r.RunMethod2(\"setFlashMode\", Mode, \"java.lang.Str";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setFlashMode",_mode,"java.lang.String");
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="End Sub";
return "";
}
public String  _setjpegquality(pdv.milotin.cameraexclass __ref,int _quality) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setjpegquality", false))
	 {return ((String) Debug.delegate(ba, "setjpegquality", new Object[] {_quality}));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Public Sub SetJpegQuality(Quality As Int)";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="r.RunMethod2(\"setJpegQuality\", Quality, \"java.lan";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setJpegQuality",BA.NumberToString(_quality),"java.lang.int");
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="End Sub";
return "";
}
public String  _setpicturesize(pdv.milotin.cameraexclass __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setpicturesize", false))
	 {return ((String) Debug.delegate(ba, "setpicturesize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub SetPictureSize(Width As Int, Height As";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="r.RunMethod3(\"setPictureSize\", Width, \"java.lang.";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod3("setPictureSize",BA.NumberToString(_width),"java.lang.int",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="End Sub";
return "";
}
public String  _startpreview(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "startpreview", false))
	 {return ((String) Debug.delegate(ba, "startpreview", null));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Public Sub StartPreview";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="cam.StartPreview";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .StartPreview();
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="End Sub";
return "";
}
public String  _stoppreview(pdv.milotin.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "stoppreview", false))
	 {return ((String) Debug.delegate(ba, "stoppreview", null));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Public Sub StopPreview";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="cam.StopPreview";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .StopPreview();
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="End Sub";
return "";
}
}