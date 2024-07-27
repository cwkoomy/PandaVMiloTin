package pdv.milotin;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class circularprogressbar_subs_0 {


public static void  _animatevalueto(RemoteObject __ref,RemoteObject _newvalue) throws Exception{
try {
		Debug.PushSubsStack("AnimateValueTo (circularprogressbar) ","circularprogressbar",10,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("animatevalueto")) { __ref.runUserSub(false, "circularprogressbar","animatevalueto", __ref, _newvalue); return;}
ResumableSub_AnimateValueTo rsub = new ResumableSub_AnimateValueTo(null,__ref,_newvalue);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AnimateValueTo extends BA.ResumableSub {
public ResumableSub_AnimateValueTo(pdv.milotin.circularprogressbar parent,RemoteObject __ref,RemoteObject _newvalue) {
this.parent = parent;
this.__ref = __ref;
this._newvalue = _newvalue;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
pdv.milotin.circularprogressbar parent;
RemoteObject _newvalue;
RemoteObject _myindex = RemoteObject.createImmutable(0);
RemoteObject _n = RemoteObject.createImmutable(0L);
RemoteObject _duration = RemoteObject.createImmutable(0);
RemoteObject _start = RemoteObject.createImmutable(0f);
RemoteObject _tempvalue = RemoteObject.createImmutable(0f);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AnimateValueTo (circularprogressbar) ","circularprogressbar",10,__ref.getField(false, "ba"),__ref,94);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("NewValue", _newvalue);
 BA.debugLineNum = 95;BA.debugLine="LoopIndex = LoopIndex + 1";
Debug.ShouldStop(1073741824);
__ref.setField ("_loopindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_loopindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 96;BA.debugLine="Dim MyIndex As Int = LoopIndex";
Debug.ShouldStop(-2147483648);
_myindex = __ref.getField(true,"_loopindex" /*RemoteObject*/ );Debug.locals.put("MyIndex", _myindex);Debug.locals.put("MyIndex", _myindex);
 BA.debugLineNum = 97;BA.debugLine="Dim n As Long = DateTime.Now";
Debug.ShouldStop(1);
_n = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 98;BA.debugLine="Dim duration As Int = Abs(currentValue - NewValue";
Debug.ShouldStop(2);
_duration = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentvalue" /*RemoteObject*/ ),_newvalue}, "-",1, 0))),RemoteObject.createImmutable(100),__ref.getField(true,"_durationfromzeroto100" /*RemoteObject*/ ),RemoteObject.createImmutable(1000)}, "/*+",1, 0));Debug.locals.put("duration", _duration);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 99;BA.debugLine="Dim start As Float = currentValue";
Debug.ShouldStop(4);
_start = __ref.getField(true,"_currentvalue" /*RemoteObject*/ );Debug.locals.put("start", _start);Debug.locals.put("start", _start);
 BA.debugLineNum = 100;BA.debugLine="currentValue = NewValue";
Debug.ShouldStop(8);
__ref.setField ("_currentvalue" /*RemoteObject*/ ,_newvalue);
 BA.debugLineNum = 101;BA.debugLine="Dim tempValue As Float";
Debug.ShouldStop(16);
_tempvalue = RemoteObject.createImmutable(0f);Debug.locals.put("tempValue", _tempvalue);
 BA.debugLineNum = 102;BA.debugLine="Do While DateTime.Now < n + duration";
Debug.ShouldStop(32);
if (true) break;

case 1:
//do while
this.state = 10;
while (RemoteObject.solveBoolean("<",parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.solve(new RemoteObject[] {_n,_duration}, "+",1, 2))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 103;BA.debugLine="tempValue = ValueFromTimeEaseInOut(DateTime.Now";
Debug.ShouldStop(64);
_tempvalue = __ref.runClassMethod (pdv.milotin.circularprogressbar.class, "_valuefromtimeeaseinout" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),_n}, "-",1, 2))),(Object)(_start),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_newvalue,_start}, "-",1, 0))),(Object)(_duration));Debug.locals.put("tempValue", _tempvalue);
 BA.debugLineNum = 104;BA.debugLine="DrawValue(tempValue)";
Debug.ShouldStop(128);
__ref.runClassMethod (pdv.milotin.circularprogressbar.class, "_drawvalue" /*RemoteObject*/ ,(Object)(_tempvalue));
 BA.debugLineNum = 105;BA.debugLine="Sleep(15)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "circularprogressbar", "animatevalueto"),BA.numberCast(int.class, 15));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
 BA.debugLineNum = 106;BA.debugLine="If MyIndex <> LoopIndex Then Return";
Debug.ShouldStop(512);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("!",_myindex,BA.numberCast(double.class, __ref.getField(true,"_loopindex" /*RemoteObject*/ )))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 1;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 108;BA.debugLine="DrawValue(currentValue)";
Debug.ShouldStop(2048);
__ref.runClassMethod (pdv.milotin.circularprogressbar.class, "_drawvalue" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_currentvalue" /*RemoteObject*/ )));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (circularprogressbar) ","circularprogressbar",10,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "circularprogressbar","base_resize", __ref, _width, _height);}
RemoteObject _w = RemoteObject.createImmutable(0);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 74;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="Dim w As Int = Min(Width, Height)";
Debug.ShouldStop(1024);
_w = BA.numberCast(int.class, circularprogressbar.__c.runMethod(true,"Min",(Object)(_width),(Object)(_height)));Debug.locals.put("w", _w);Debug.locals.put("w", _w);
 BA.debugLineNum = 76;BA.debugLine="cx = w / 2";
Debug.ShouldStop(2048);
__ref.setField ("_cx" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_w,RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 77;BA.debugLine="cy = w / 2";
Debug.ShouldStop(4096);
__ref.setField ("_cy" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_w,RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 78;BA.debugLine="radius = cx - 10dip";
Debug.ShouldStop(8192);
__ref.setField ("_radius" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cx" /*RemoteObject*/ ),circularprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 0)));
 BA.debugLineNum = 79;BA.debugLine="iv.SetLayoutAnimated(0, 0, 0, w, w)";
Debug.ShouldStop(16384);
__ref.getField(false,"_iv" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_w),(Object)(_w));
 BA.debugLineNum = 80;BA.debugLine="If bc.mWidth <> w Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mwidth"),BA.numberCast(double.class, _w))) { 
 BA.debugLineNum = 81;BA.debugLine="ResetBC";
Debug.ShouldStop(65536);
__ref.runClassMethod (pdv.milotin.circularprogressbar.class, "_resetbc" /*RemoteObject*/ );
 };
 BA.debugLineNum = 83;BA.debugLine="mLbl.SetLayoutAnimated(0, 0, cy - 20dip, w, 40dip";
Debug.ShouldStop(262144);
__ref.getField(false,"_mlbl" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cy" /*RemoteObject*/ ),circularprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0))),(Object)(_w),(Object)(circularprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private mEventName As String 'ignore";
circularprogressbar._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",circularprogressbar._meventname);
 //BA.debugLineNum = 11;BA.debugLine="Private mCallBack As Object 'ignore";
circularprogressbar._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",circularprogressbar._mcallback);
 //BA.debugLineNum = 12;BA.debugLine="Private xui As XUI";
circularprogressbar._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",circularprogressbar._xui);
 //BA.debugLineNum = 13;BA.debugLine="Private mLbl As B4XView";
circularprogressbar._mlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mlbl",circularprogressbar._mlbl);
 //BA.debugLineNum = 14;BA.debugLine="Private cx, cy, radius As Float";
circularprogressbar._cx = RemoteObject.createImmutable(0f);__ref.setField("_cx",circularprogressbar._cx);
circularprogressbar._cy = RemoteObject.createImmutable(0f);__ref.setField("_cy",circularprogressbar._cy);
circularprogressbar._radius = RemoteObject.createImmutable(0f);__ref.setField("_radius",circularprogressbar._radius);
 //BA.debugLineNum = 15;BA.debugLine="Private stroke As Float";
circularprogressbar._stroke = RemoteObject.createImmutable(0f);__ref.setField("_stroke",circularprogressbar._stroke);
 //BA.debugLineNum = 16;BA.debugLine="Private mBase As B4XView";
circularprogressbar._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",circularprogressbar._mbase);
 //BA.debugLineNum = 17;BA.debugLine="Private currentValue As Float";
circularprogressbar._currentvalue = RemoteObject.createImmutable(0f);__ref.setField("_currentvalue",circularprogressbar._currentvalue);
 //BA.debugLineNum = 18;BA.debugLine="Private DurationFromZeroTo100 As Int";
circularprogressbar._durationfromzeroto100 = RemoteObject.createImmutable(0);__ref.setField("_durationfromzeroto100",circularprogressbar._durationfromzeroto100);
 //BA.debugLineNum = 19;BA.debugLine="Private bc As BitmapCreator";
circularprogressbar._bc = RemoteObject.createNew ("b4a.example.bitmapcreator");__ref.setField("_bc",circularprogressbar._bc);
 //BA.debugLineNum = 20;BA.debugLine="Private emptyBrush As BCBrush";
circularprogressbar._emptybrush = RemoteObject.createNew ("b4a.example.bcpath._bcbrush");__ref.setField("_emptybrush",circularprogressbar._emptybrush);
 //BA.debugLineNum = 21;BA.debugLine="Private fullBrush As BCBrush";
circularprogressbar._fullbrush = RemoteObject.createNew ("b4a.example.bcpath._bcbrush");__ref.setField("_fullbrush",circularprogressbar._fullbrush);
 //BA.debugLineNum = 22;BA.debugLine="Private TransparentBrush As BCBrush";
circularprogressbar._transparentbrush = RemoteObject.createNew ("b4a.example.bcpath._bcbrush");__ref.setField("_transparentbrush",circularprogressbar._transparentbrush);
 //BA.debugLineNum = 23;BA.debugLine="Private iv As B4XView";
circularprogressbar._iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_iv",circularprogressbar._iv);
 //BA.debugLineNum = 24;BA.debugLine="Private clr1, clr2 As Int";
circularprogressbar._clr1 = RemoteObject.createImmutable(0);__ref.setField("_clr1",circularprogressbar._clr1);
circularprogressbar._clr2 = RemoteObject.createImmutable(0);__ref.setField("_clr2",circularprogressbar._clr2);
 //BA.debugLineNum = 25;BA.debugLine="Private LoopIndex As Int";
circularprogressbar._loopindex = RemoteObject.createImmutable(0);__ref.setField("_loopindex",circularprogressbar._loopindex);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (circularprogressbar) ","circularprogressbar",10,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "circularprogressbar","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _clrempty = RemoteObject.createImmutable(0);
RemoteObject _iiv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 33;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="mBase = Base";
Debug.ShouldStop(2);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 35;BA.debugLine="mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,";
Debug.ShouldStop(4);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(BA.numberCast(int.class, circularprogressbar.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")))))),(Object)(BA.numberCast(int.class, circularprogressbar.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")))))));
 BA.debugLineNum = 36;BA.debugLine="Dim clrEmpty As Int = xui.PaintOrColorToColor(Pro";
Debug.ShouldStop(8);
_clrempty = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ColorEmpty"))))));Debug.locals.put("clrEmpty", _clrempty);Debug.locals.put("clrEmpty", _clrempty);
 BA.debugLineNum = 37;BA.debugLine="clr1 = xui.PaintOrColorToColor(Props.Get(\"FirstCo";
Debug.ShouldStop(16);
__ref.setField ("_clr1" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FirstColor")))))));
 BA.debugLineNum = 38;BA.debugLine="clr2 = xui.PaintOrColorToColor(Props.Get(\"SecondC";
Debug.ShouldStop(32);
__ref.setField ("_clr2" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SecondColor")))))));
 BA.debugLineNum = 39;BA.debugLine="stroke = DipToCurrent(Props.Get(\"StrokeWidth\"))";
Debug.ShouldStop(64);
__ref.setField ("_stroke" /*RemoteObject*/ ,BA.numberCast(float.class, circularprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StrokeWidth")))))))));
 BA.debugLineNum = 40;BA.debugLine="DurationFromZeroTo100 = Props.Get(\"Duration\")";
Debug.ShouldStop(128);
__ref.setField ("_durationfromzeroto100" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Duration"))))));
 BA.debugLineNum = 41;BA.debugLine="mLbl = Lbl";
Debug.ShouldStop(256);
__ref.getField(false,"_mlbl" /*RemoteObject*/ ).setObject (_lbl.getObject());
 BA.debugLineNum = 42;BA.debugLine="cx = mBase.Width / 2";
Debug.ShouldStop(512);
__ref.setField ("_cx" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 43;BA.debugLine="cy = mBase.Height / 2";
Debug.ShouldStop(1024);
__ref.setField ("_cy" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 44;BA.debugLine="radius = cx - 10dip";
Debug.ShouldStop(2048);
__ref.setField ("_radius" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cx" /*RemoteObject*/ ),circularprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 0)));
 BA.debugLineNum = 45;BA.debugLine="mLbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_mlbl" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 46;BA.debugLine="Dim iiv As ImageView";
Debug.ShouldStop(8192);
_iiv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("iiv", _iiv);
 BA.debugLineNum = 47;BA.debugLine="iiv.Initialize(\"\")";
Debug.ShouldStop(16384);
_iiv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 48;BA.debugLine="iv = iiv";
Debug.ShouldStop(32768);
__ref.getField(false,"_iv" /*RemoteObject*/ ).setObject (_iiv.getObject());
 BA.debugLineNum = 49;BA.debugLine="mBase.AddView(iv, 0, 0, mBase.Width, mBase.Height";
Debug.ShouldStop(65536);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_iv" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 50;BA.debugLine="mBase.AddView(mLbl, 0, mBase.Height / 2 - 20dip,";
Debug.ShouldStop(131072);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mlbl" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),circularprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "/-",1, 0))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(circularprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 51;BA.debugLine="ResetBC";
Debug.ShouldStop(262144);
__ref.runClassMethod (pdv.milotin.circularprogressbar.class, "_resetbc" /*RemoteObject*/ );
 BA.debugLineNum = 52;BA.debugLine="emptyBrush = bc.CreateBrushFromColor(clrEmpty)";
Debug.ShouldStop(524288);
__ref.setField ("_emptybrush" /*RemoteObject*/ ,__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_createbrushfromcolor",(Object)(_clrempty)));
 BA.debugLineNum = 53;BA.debugLine="TransparentBrush = bc.CreateBrushFromColor(xui.Co";
Debug.ShouldStop(1048576);
__ref.setField ("_transparentbrush" /*RemoteObject*/ ,__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_createbrushfromcolor",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"))));
 BA.debugLineNum = 54;BA.debugLine="DrawValue(currentValue)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (pdv.milotin.circularprogressbar.class, "_drawvalue" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_currentvalue" /*RemoteObject*/ )));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawvalue(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("DrawValue (circularprogressbar) ","circularprogressbar",10,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("drawvalue")) { return __ref.runUserSub(false, "circularprogressbar","drawvalue", __ref, _value);}
RemoteObject _startangle = RemoteObject.createImmutable(0f);
RemoteObject _sweepangle = RemoteObject.createImmutable(0f);
RemoteObject _halfstroke = RemoteObject.createImmutable(0f);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 131;BA.debugLine="Private Sub DrawValue(Value As Float)";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="bc.DrawRect2(bc.TargetRect, TransparentBrush, Tru";
Debug.ShouldStop(8);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawrect2",(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(false,"_targetrect")),(Object)(__ref.getField(false,"_transparentbrush" /*RemoteObject*/ )),(Object)(circularprogressbar.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 133;BA.debugLine="mLbl.Text = $\"$1.0{Value}\"$";
Debug.ShouldStop(16);
__ref.getField(false,"_mlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),circularprogressbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_value))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 134;BA.debugLine="Dim startAngle = -90, sweepAngle = Value / 100 *";
Debug.ShouldStop(32);
_startangle = BA.numberCast(float.class, -(double) (0 + 90));Debug.locals.put("startAngle", _startangle);Debug.locals.put("startAngle", _startangle);
_sweepangle = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_value,RemoteObject.createImmutable(100),RemoteObject.createImmutable(361)}, "/*",0, 0));Debug.locals.put("sweepAngle", _sweepangle);Debug.locals.put("sweepAngle", _sweepangle);
 BA.debugLineNum = 135;BA.debugLine="bc.DrawArc2(cx, cy, radius, emptyBrush, False, st";
Debug.ShouldStop(64);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawarc2",(Object)(__ref.getField(true,"_cx" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_cy" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_radius" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_emptybrush" /*RemoteObject*/ )),(Object)(circularprogressbar.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, __ref.getField(true,"_stroke" /*RemoteObject*/ ))),(Object)(_startangle),(Object)(BA.numberCast(float.class, -(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_sweepangle}, "-",1, 0)).<Double>get().doubleValue())));
 BA.debugLineNum = 136;BA.debugLine="bc.DrawArc2(cx, cy, radius, fullBrush, False, str";
Debug.ShouldStop(128);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawarc2",(Object)(__ref.getField(true,"_cx" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_cy" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_radius" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_fullbrush" /*RemoteObject*/ )),(Object)(circularprogressbar.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, __ref.getField(true,"_stroke" /*RemoteObject*/ ))),(Object)(_startangle),(Object)(_sweepangle));
 BA.debugLineNum = 137;BA.debugLine="Dim halfStroke As Float = stroke / 2";
Debug.ShouldStop(256);
_halfstroke = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_stroke" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("halfStroke", _halfstroke);Debug.locals.put("halfStroke", _halfstroke);
 BA.debugLineNum = 138;BA.debugLine="If Value > 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_value,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 139;BA.debugLine="bc.DrawCircle2(cx + Round((radius - halfStroke)";
Debug.ShouldStop(1024);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawcircle2",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cx" /*RemoteObject*/ ),circularprogressbar.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius" /*RemoteObject*/ ),_halfstroke}, "-",1, 0)),circularprogressbar.__c.runMethod(true,"CosD",(Object)(RemoteObject.solve(new RemoteObject[] {_startangle,_sweepangle}, "+",1, 0)))}, "*",0, 0)))}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cy" /*RemoteObject*/ ),circularprogressbar.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius" /*RemoteObject*/ ),_halfstroke}, "-",1, 0)),circularprogressbar.__c.runMethod(true,"SinD",(Object)(RemoteObject.solve(new RemoteObject[] {_startangle,_sweepangle}, "+",1, 0)))}, "*",0, 0)))}, "+",1, 0))),(Object)(_halfstroke),(Object)(__ref.getField(false,"_fullbrush" /*RemoteObject*/ )),(Object)(circularprogressbar.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 142;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, iv)";
Debug.ShouldStop(8192);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_setbitmaptoimageview",(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_getbitmap")),(Object)(__ref.getField(false,"_iv" /*RemoteObject*/ )));
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getValue (circularprogressbar) ","circularprogressbar",10,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "circularprogressbar","getvalue", __ref);}
 BA.debugLineNum = 90;BA.debugLine="Public Sub getValue As Float";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="Return currentValue";
Debug.ShouldStop(67108864);
if (true) return __ref.getField(true,"_currentvalue" /*RemoteObject*/ );
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (circularprogressbar) ","circularprogressbar",10,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "circularprogressbar","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 28;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(268435456);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 30;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(536870912);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resetbc(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResetBC (circularprogressbar) ","circularprogressbar",10,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("resetbc")) { return __ref.runUserSub(false, "circularprogressbar","resetbc", __ref);}
RemoteObject _g = RemoteObject.declareNull("b4a.example.bitmapcreator");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
int _y = 0;
int _x = 0;
RemoteObject _angle = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 57;BA.debugLine="Private Sub ResetBC";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="bc.Initialize(iv.Width, iv.Width)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_iv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_iv" /*RemoteObject*/ ).runMethod(true,"getWidth")));
 BA.debugLineNum = 59;BA.debugLine="Dim g As BitmapCreator";
Debug.ShouldStop(67108864);
_g = RemoteObject.createNew ("b4a.example.bitmapcreator");Debug.locals.put("g", _g);
 BA.debugLineNum = 60;BA.debugLine="g.Initialize(bc.mWidth, bc.mHeight)";
Debug.ShouldStop(134217728);
_g.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mwidth")),(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mheight")));
 BA.debugLineNum = 61;BA.debugLine="Dim r As B4XRect";
Debug.ShouldStop(268435456);
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("r", _r);
 BA.debugLineNum = 62;BA.debugLine="r.Initialize(0, 0, bc.mWidth, 2) 'ignore";
Debug.ShouldStop(536870912);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, __ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mwidth"))),(Object)(BA.numberCast(float.class, 2)));
 BA.debugLineNum = 63;BA.debugLine="bc.FillGradient(Array As Int(clr1, clr2), r, \"LEF";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_fillgradient",(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {__ref.getField(true,"_clr1" /*RemoteObject*/ ),__ref.getField(true,"_clr2" /*RemoteObject*/ )})),(Object)(_r),(Object)(RemoteObject.createImmutable("LEFT_RIGHT")));
 BA.debugLineNum = 64;BA.debugLine="For y = 0 To g.mHeight - 1";
Debug.ShouldStop(-2147483648);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_g.getField(true,"_mheight"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_y = 0 ;
for (;(step7 > 0 && _y <= limit7) || (step7 < 0 && _y >= limit7) ;_y = ((int)(0 + _y + step7))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 65;BA.debugLine="For x = 0 To g.mWidth - 1";
Debug.ShouldStop(1);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_g.getField(true,"_mwidth"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
for (;(step8 > 0 && _x <= limit8) || (step8 < 0 && _x >= limit8) ;_x = ((int)(0 + _x + step8))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 66;BA.debugLine="Dim angle As Float = ATan2D(y - cy, x - cx) + 9";
Debug.ShouldStop(2);
_angle = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {circularprogressbar.__c.runMethod(true,"ATan2D",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_y),__ref.getField(true,"_cy" /*RemoteObject*/ )}, "-",1, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),__ref.getField(true,"_cx" /*RemoteObject*/ )}, "-",1, 0))),RemoteObject.createImmutable(90.5)}, "+",1, 0));Debug.locals.put("angle", _angle);Debug.locals.put("angle", _angle);
 BA.debugLineNum = 67;BA.debugLine="If angle < 0 Then angle = angle + 360";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("<",_angle,BA.numberCast(double.class, 0))) { 
_angle = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_angle,RemoteObject.createImmutable(360)}, "+",1, 0));Debug.locals.put("angle", _angle);};
 BA.debugLineNum = 68;BA.debugLine="g.CopyPixel(bc, bc.mWidth * angle / 360, 0, x,";
Debug.ShouldStop(8);
_g.runVoidMethod ("_copypixel",(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mwidth"),_angle,RemoteObject.createImmutable(360)}, "*/",0, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)));
 }
}Debug.locals.put("x", _x);
;
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 71;BA.debugLine="fullBrush = bc.CreateBrushFromBitmapCreator(g)";
Debug.ShouldStop(64);
__ref.setField ("_fullbrush" /*RemoteObject*/ ,__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_createbrushfrombitmapcreator",(Object)(_g)));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _newvalue) throws Exception{
try {
		Debug.PushSubsStack("setValue (circularprogressbar) ","circularprogressbar",10,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "circularprogressbar","setvalue", __ref, _newvalue);}
Debug.locals.put("NewValue", _newvalue);
 BA.debugLineNum = 86;BA.debugLine="Public Sub setValue(NewValue As Float)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="AnimateValueTo(NewValue)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (pdv.milotin.circularprogressbar.class, "_animatevalueto" /*void*/ ,(Object)(_newvalue));
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
public static RemoteObject  _valuefromtimeeaseinout(RemoteObject __ref,RemoteObject _time,RemoteObject _start,RemoteObject _changeinvalue,RemoteObject _duration) throws Exception{
try {
		Debug.PushSubsStack("ValueFromTimeEaseInOut (circularprogressbar) ","circularprogressbar",10,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("valuefromtimeeaseinout")) { return __ref.runUserSub(false, "circularprogressbar","valuefromtimeeaseinout", __ref, _time, _start, _changeinvalue, _duration);}
Debug.locals.put("Time", _time);
Debug.locals.put("Start", _start);
Debug.locals.put("ChangeInValue", _changeinvalue);
Debug.locals.put("Duration", _duration);
 BA.debugLineNum = 112;BA.debugLine="Private Sub ValueFromTimeEaseInOut(Time As Float,";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="Time = Time / (Duration / 2)";
Debug.ShouldStop(65536);
_time = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_time,(RemoteObject.solve(new RemoteObject[] {_duration,RemoteObject.createImmutable(2)}, "/",0, 0))}, "/",0, 0));Debug.locals.put("Time", _time);
 BA.debugLineNum = 114;BA.debugLine="If Time < 1 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("<",_time,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 115;BA.debugLine="Return ChangeInValue / 2 * Time * Time * Time *";
Debug.ShouldStop(262144);
if (true) return BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_changeinvalue,RemoteObject.createImmutable(2),_time,_time,_time,_time,_start}, "/****+",1, 0));
 }else {
 BA.debugLineNum = 117;BA.debugLine="Time = Time - 2";
Debug.ShouldStop(1048576);
_time = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_time,RemoteObject.createImmutable(2)}, "-",1, 0));Debug.locals.put("Time", _time);
 BA.debugLineNum = 118;BA.debugLine="Return -ChangeInValue / 2 * (Time * Time * Time";
Debug.ShouldStop(2097152);
if (true) return BA.numberCast(float.class, -(double) (0 + _changeinvalue.<Float>get().floatValue())/(double)(double) (0 + 2)*(RemoteObject.solve(new RemoteObject[] {_time,_time,_time,_time,RemoteObject.createImmutable(2)}, "***-",1, 0)).<Double>get().doubleValue()+(double) (0 + _start.<Float>get().floatValue()));
 };
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}