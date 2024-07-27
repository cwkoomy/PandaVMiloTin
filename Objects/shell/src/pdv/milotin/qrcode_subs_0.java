package pdv.milotin;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class qrcode_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Dim nativeMe As JavaObject";
qrcode._nativeme = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_nativeme",qrcode._nativeme);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _drawqrcode(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("drawQRCode (qrcode) ","qrcode",11,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("drawqrcode")) { return __ref.runUserSub(false, "qrcode","drawqrcode", __ref, _data);}
Debug.locals.put("data", _data);
 BA.debugLineNum = 15;BA.debugLine="Sub drawQRCode (data As String) As Bitmap";
Debug.ShouldStop(16384);
 BA.debugLineNum = 17;BA.debugLine="Return nativeMe.RunMethod(\"drawQRCode\", Array(dat";
Debug.ShouldStop(65536);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), __ref.getField(false,"_nativeme" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("drawQRCode")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_data)}))));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (qrcode) ","qrcode",11,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "qrcode","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 11;BA.debugLine="nativeMe = Me";
Debug.ShouldStop(1024);
__ref.getField(false,"_nativeme" /*RemoteObject*/ ).setObject (__ref);
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}