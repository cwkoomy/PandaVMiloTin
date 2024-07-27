package pdv.milotin;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class customlistview_subs_0 {


public static RemoteObject  _add(RemoteObject __ref,RemoteObject _pnl,RemoteObject _itemheight,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Add (customlistview) ","customlistview",10,__ref.getField(false, "ba"),__ref,184);
if (RapidSub.canDelegate("add")) { return __ref.runUserSub(false, "customlistview","add", __ref, _pnl, _itemheight, _value);}
Debug.locals.put("Pnl", _pnl);
Debug.locals.put("ItemHeight", _itemheight);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 184;BA.debugLine="Public Sub Add(Pnl As Panel, ItemHeight As Int, Va";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="InsertAt(items.Size, Pnl, ItemHeight, Value)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (pdv.milotin.customlistview.class, "_insertat" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize")),(Object)(_pnl),(Object)(_itemheight),(Object)(_value));
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtextitem(RemoteObject __ref,RemoteObject _text,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddTextItem (customlistview) ","customlistview",10,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("addtextitem")) { return __ref.runUserSub(false, "customlistview","addtextitem", __ref, _text, _value);}
Debug.locals.put("Text", _text);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 109;BA.debugLine="Public Sub AddTextItem(Text As String, Value As Ob";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="InsertAtTextItem(items.Size, Text, Value)";
Debug.ShouldStop(8192);
__ref.runClassMethod (pdv.milotin.customlistview.class, "_insertattextitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize")),(Object)(_text),(Object)(_value));
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
public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (customlistview) ","customlistview",10,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "customlistview","asview", __ref);}
 BA.debugLineNum = 41;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="Return sv";
Debug.ShouldStop(512);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_sv" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private sv As ScrollView";
customlistview._sv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_sv",customlistview._sv);
 //BA.debugLineNum = 8;BA.debugLine="Private items As List";
customlistview._items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_items",customlistview._items);
 //BA.debugLineNum = 9;BA.debugLine="Private panels As List";
customlistview._panels = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_panels",customlistview._panels);
 //BA.debugLineNum = 10;BA.debugLine="Private dividerHeight As Float";
customlistview._dividerheight = RemoteObject.createImmutable(0f);__ref.setField("_dividerheight",customlistview._dividerheight);
 //BA.debugLineNum = 11;BA.debugLine="Private EventName As String";
customlistview._eventname = RemoteObject.createImmutable("");__ref.setField("_eventname",customlistview._eventname);
 //BA.debugLineNum = 12;BA.debugLine="Private CallBack As Object";
customlistview._callback = RemoteObject.createNew ("Object");__ref.setField("_callback",customlistview._callback);
 //BA.debugLineNum = 13;BA.debugLine="Private su As StringUtils";
customlistview._su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");__ref.setField("_su",customlistview._su);
 //BA.debugLineNum = 14;BA.debugLine="Public DefaultTextSize As Int";
customlistview._defaulttextsize = RemoteObject.createImmutable(0);__ref.setField("_defaulttextsize",customlistview._defaulttextsize);
 //BA.debugLineNum = 15;BA.debugLine="Public DefaultTextColor As Int";
customlistview._defaulttextcolor = RemoteObject.createImmutable(0);__ref.setField("_defaulttextcolor",customlistview._defaulttextcolor);
 //BA.debugLineNum = 16;BA.debugLine="Public DefaultTextBackgroundColor As Int";
customlistview._defaulttextbackgroundcolor = RemoteObject.createImmutable(0);__ref.setField("_defaulttextbackgroundcolor",customlistview._defaulttextbackgroundcolor);
 //BA.debugLineNum = 17;BA.debugLine="Private DefaultTextBackground As Object";
customlistview._defaulttextbackground = RemoteObject.createNew ("Object");__ref.setField("_defaulttextbackground",customlistview._defaulttextbackground);
 //BA.debugLineNum = 18;BA.debugLine="Private PressedDrawable As ColorDrawable";
customlistview._presseddrawable = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");__ref.setField("_presseddrawable",customlistview._presseddrawable);
 //BA.debugLineNum = 19;BA.debugLine="Private lastAddItemsTime As Long";
customlistview._lastadditemstime = RemoteObject.createImmutable(0L);__ref.setField("_lastadditemstime",customlistview._lastadditemstime);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (customlistview) ","customlistview",10,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "customlistview","clear", __ref);}
int _i = 0;
 BA.debugLineNum = 65;BA.debugLine="Public Sub Clear";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="items.Clear";
Debug.ShouldStop(2);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 67;BA.debugLine="panels.Clear";
Debug.ShouldStop(4);
__ref.getField(false,"_panels" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 68;BA.debugLine="sv.Panel.Height = 0";
Debug.ShouldStop(8);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, 0));
 BA.debugLineNum = 69;BA.debugLine="For i = sv.Panel.NumberOfViews - 1 To 0 Step -1";
Debug.ShouldStop(16);
{
final int step4 = -1;
final int limit4 = 0;
_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 70;BA.debugLine="sv.Panel.RemoveViewAt(i)";
Debug.ShouldStop(32);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("RemoveViewAt",(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
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
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (customlistview) ","customlistview",10,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "customlistview","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("base", _base);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("props", _props);
 BA.debugLineNum = 46;BA.debugLine="Public Sub DesignerCreateView(base As Panel, lbl A";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="ReplaceBasePanelWithView(base, sv)";
Debug.ShouldStop(16384);
__ref.runClassMethod (pdv.milotin.customlistview.class, "_replacebasepanelwithview" /*RemoteObject*/ ,(Object)(_base),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_sv" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 48;BA.debugLine="sv.Color = props.Get(\"DividerColor\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DividerColor"))))));
 BA.debugLineNum = 49;BA.debugLine="dividerHeight = DipToCurrent(props.Get(\"DividerHe";
Debug.ShouldStop(65536);
__ref.setField ("_dividerheight" /*RemoteObject*/ ,BA.numberCast(float.class, customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DividerHeight")))))))));
 BA.debugLineNum = 50;BA.debugLine="PressedDrawable.Initialize(props.Get(\"PressedColo";
Debug.ShouldStop(131072);
__ref.getField(false,"_presseddrawable" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PressedColor")))))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 51;BA.debugLine="DefaultTextSize = lbl.TextSize";
Debug.ShouldStop(262144);
__ref.setField ("_defaulttextsize" /*RemoteObject*/ ,BA.numberCast(int.class, _lbl.runMethod(true,"getTextSize")));
 BA.debugLineNum = 52;BA.debugLine="DefaultTextColor = lbl.TextColor";
Debug.ShouldStop(524288);
__ref.setField ("_defaulttextcolor" /*RemoteObject*/ ,_lbl.runMethod(true,"getTextColor"));
 BA.debugLineNum = 53;BA.debugLine="DefaultTextBackground = base.Background";
Debug.ShouldStop(1048576);
__ref.setField ("_defaulttextbackground" /*RemoteObject*/ ,(_base.runMethod(false,"getBackground")));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getitemfromview(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("GetItemFromView (customlistview) ","customlistview",10,__ref.getField(false, "ba"),__ref,223);
if (RapidSub.canDelegate("getitemfromview")) { return __ref.runUserSub(false, "customlistview","getitemfromview", __ref, _v);}
RemoteObject _parent = RemoteObject.declareNull("Object");
RemoteObject _current = RemoteObject.declareNull("Object");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("v", _v);
 BA.debugLineNum = 223;BA.debugLine="Public Sub GetItemFromView(v As View) As Int";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 224;BA.debugLine="Dim parent = v, current As Object";
Debug.ShouldStop(-2147483648);
_parent = (_v.getObject());Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
_current = RemoteObject.createNew ("Object");Debug.locals.put("current", _current);
 BA.debugLineNum = 225;BA.debugLine="Do While (parent Is Panel) = False Or sv.Panel <>";
Debug.ShouldStop(1);
while (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_parent, RemoteObject.createImmutable("android.view.ViewGroup")))),customlistview.__c.getField(true,"False")) || RemoteObject.solveBoolean("!",__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel"),_parent)) {
 BA.debugLineNum = 226;BA.debugLine="current = parent";
Debug.ShouldStop(2);
_current = _parent;Debug.locals.put("current", _current);
 BA.debugLineNum = 227;BA.debugLine="Dim jo As JavaObject = current";
Debug.ShouldStop(4);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _current);Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 228;BA.debugLine="parent = jo.RunMethod(\"getParent\", Null)";
Debug.ShouldStop(8);
_parent = _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getParent")),(Object)((customlistview.__c.getField(false,"Null"))));Debug.locals.put("parent", _parent);
 }
;
 BA.debugLineNum = 230;BA.debugLine="v = current";
Debug.ShouldStop(32);
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _current);Debug.locals.put("v", _v);
 BA.debugLineNum = 231;BA.debugLine="Return v.Tag";
Debug.ShouldStop(64);
if (true) return BA.numberCast(int.class, _v.runMethod(false,"getTag"));
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (customlistview) ","customlistview",10,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "customlistview","getpanel", __ref, _index);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Index", _index);
 BA.debugLineNum = 82;BA.debugLine="Public Sub GetPanel(Index As Int) As Panel";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(262144);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 84;BA.debugLine="p = panels.Get(Index) 'this is the parent panel";
Debug.ShouldStop(524288);
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_panels" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)));Debug.locals.put("p", _p);
 BA.debugLineNum = 85;BA.debugLine="Return p.GetView(0)";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSize (customlistview) ","customlistview",10,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("getsize")) { return __ref.runUserSub(false, "customlistview","getsize", __ref);}
 BA.debugLineNum = 77;BA.debugLine="Public Sub GetSize As Int";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Return items.Size";
Debug.ShouldStop(8192);
if (true) return __ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize");
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalue(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetValue (customlistview) ","customlistview",10,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "customlistview","getvalue", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 89;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="Return items.Get(Index)";
Debug.ShouldStop(33554432);
if (true) return __ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index));
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _vcallback,RemoteObject _veventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (customlistview) ","customlistview",10,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "customlistview","initialize", __ref, _ba, _vcallback, _veventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("vCallback", _vcallback);
Debug.locals.put("vEventName", _veventname);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize (vCallback As Object, vEvent";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="EventName = vEventName";
Debug.ShouldStop(8388608);
__ref.setField ("_eventname" /*RemoteObject*/ ,_veventname);
 BA.debugLineNum = 25;BA.debugLine="CallBack = vCallback";
Debug.ShouldStop(16777216);
__ref.setField ("_callback" /*RemoteObject*/ ,_vcallback);
 BA.debugLineNum = 26;BA.debugLine="sv.Initialize2(0, \"sv\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runVoidMethod ("Initialize2",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("sv")));
 BA.debugLineNum = 27;BA.debugLine="items.Initialize";
Debug.ShouldStop(67108864);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 28;BA.debugLine="panels.Initialize";
Debug.ShouldStop(134217728);
__ref.getField(false,"_panels" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 31;BA.debugLine="dividerHeight = 2dip";
Debug.ShouldStop(1073741824);
__ref.setField ("_dividerheight" /*RemoteObject*/ ,BA.numberCast(float.class, customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 32;BA.debugLine="sv.Color = 0xFFD9D7DE";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0xffd9d7de)));
 BA.debugLineNum = 33;BA.debugLine="DefaultTextColor = Colors.White";
Debug.ShouldStop(1);
__ref.setField ("_defaulttextcolor" /*RemoteObject*/ ,customlistview.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 34;BA.debugLine="DefaultTextSize = 16";
Debug.ShouldStop(2);
__ref.setField ("_defaulttextsize" /*RemoteObject*/ ,BA.numberCast(int.class, 16));
 BA.debugLineNum = 35;BA.debugLine="DefaultTextBackgroundColor = Colors.Black";
Debug.ShouldStop(4);
__ref.setField ("_defaulttextbackgroundcolor" /*RemoteObject*/ ,customlistview.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 36;BA.debugLine="DefaultTextBackground = Null";
Debug.ShouldStop(8);
__ref.setField ("_defaulttextbackground" /*RemoteObject*/ ,customlistview.__c.getField(false,"Null"));
 BA.debugLineNum = 37;BA.debugLine="PressedDrawable.Initialize(0xFF7EB4FA, 2dip)";
Debug.ShouldStop(16);
__ref.getField(false,"_presseddrawable" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, ((int)0xff7eb4fa))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertat(RemoteObject __ref,RemoteObject _index,RemoteObject _pnl,RemoteObject _itemheight,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("InsertAt (customlistview) ","customlistview",10,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("insertat")) { return __ref.runUserSub(false, "customlistview","insertat", __ref, _index, _pnl, _itemheight, _value);}
RemoteObject _sd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.StateListDrawable");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _previouspanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _p2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
Debug.locals.put("Index", _index);
Debug.locals.put("Pnl", _pnl);
Debug.locals.put("ItemHeight", _itemheight);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 136;BA.debugLine="Public Sub InsertAt(Index As Int, Pnl As Panel, It";
Debug.ShouldStop(128);
 BA.debugLineNum = 138;BA.debugLine="Dim sd As StateListDrawable";
Debug.ShouldStop(512);
_sd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.StateListDrawable");Debug.locals.put("sd", _sd);
 BA.debugLineNum = 139;BA.debugLine="sd.Initialize";
Debug.ShouldStop(1024);
_sd.runVoidMethod ("Initialize");
 BA.debugLineNum = 140;BA.debugLine="sd.AddState(sd.State_Pressed, PressedDrawable)";
Debug.ShouldStop(2048);
_sd.runVoidMethod ("AddState",(Object)(_sd.getField(true,"State_Pressed")),(Object)((__ref.getField(false,"_presseddrawable" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 141;BA.debugLine="sd.AddCatchAllState(Pnl.Background)";
Debug.ShouldStop(4096);
_sd.runVoidMethod ("AddCatchAllState",(Object)(_pnl.runMethod(false,"getBackground")));
 BA.debugLineNum = 144;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(32768);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 145;BA.debugLine="p.Initialize(\"panel\")";
Debug.ShouldStop(65536);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("panel")));
 BA.debugLineNum = 146;BA.debugLine="p.Background = sd";
Debug.ShouldStop(131072);
_p.runMethod(false,"setBackground",(_sd.getObject()));
 BA.debugLineNum = 147;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(262144);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 148;BA.debugLine="cd.Initialize(Colors.Transparent, 0)";
Debug.ShouldStop(524288);
_cd.runVoidMethod ("Initialize",(Object)(customlistview.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 149;BA.debugLine="Pnl.Background = cd";
Debug.ShouldStop(1048576);
_pnl.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 150;BA.debugLine="p.AddView(Pnl, 0, 0, sv.Width, ItemHeight)";
Debug.ShouldStop(2097152);
_p.runVoidMethod ("AddView",(Object)((_pnl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_itemheight));
 BA.debugLineNum = 151;BA.debugLine="p.Tag = Index";
Debug.ShouldStop(4194304);
_p.runMethod(false,"setTag",(_index));
 BA.debugLineNum = 153;BA.debugLine="If Index = items.Size Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, __ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
 BA.debugLineNum = 154;BA.debugLine="items.Add(Value)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_value));
 BA.debugLineNum = 155;BA.debugLine="panels.Add(p)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_panels" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_p.getObject())));
 BA.debugLineNum = 156;BA.debugLine="Dim top As Int";
Debug.ShouldStop(134217728);
_top = RemoteObject.createImmutable(0);Debug.locals.put("top", _top);
 BA.debugLineNum = 157;BA.debugLine="If Index = 0 Then top = dividerHeight Else top =";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 0))) { 
_top = BA.numberCast(int.class, __ref.getField(true,"_dividerheight" /*RemoteObject*/ ));Debug.locals.put("top", _top);}
else {
_top = __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getHeight");Debug.locals.put("top", _top);};
 BA.debugLineNum = 158;BA.debugLine="sv.Panel.AddView(p, 0, top, sv.Width, ItemHeight";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_top),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_itemheight));
 }else {
 BA.debugLineNum = 160;BA.debugLine="Dim top As Int";
Debug.ShouldStop(-2147483648);
_top = RemoteObject.createImmutable(0);Debug.locals.put("top", _top);
 BA.debugLineNum = 161;BA.debugLine="If Index = 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 162;BA.debugLine="top = dividerHeight";
Debug.ShouldStop(2);
_top = BA.numberCast(int.class, __ref.getField(true,"_dividerheight" /*RemoteObject*/ ));Debug.locals.put("top", _top);
 }else {
 BA.debugLineNum = 164;BA.debugLine="Dim previousPanel As Panel";
Debug.ShouldStop(8);
_previouspanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("previousPanel", _previouspanel);
 BA.debugLineNum = 165;BA.debugLine="previousPanel = panels.Get(Index - 1)";
Debug.ShouldStop(16);
_previouspanel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_panels" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("previousPanel", _previouspanel);
 BA.debugLineNum = 166;BA.debugLine="top = previousPanel.top + previousPanel.Height";
Debug.ShouldStop(32);
_top = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_previouspanel.runMethod(true,"getTop"),_previouspanel.runMethod(true,"getHeight"),__ref.getField(true,"_dividerheight" /*RemoteObject*/ )}, "++",2, 0));Debug.locals.put("top", _top);
 };
 BA.debugLineNum = 169;BA.debugLine="Dim p2 As Panel";
Debug.ShouldStop(256);
_p2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p2", _p2);
 BA.debugLineNum = 170;BA.debugLine="For i = Index To panels.Size - 1";
Debug.ShouldStop(512);
{
final int step29 = 1;
final int limit29 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_panels" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = _index.<Integer>get().intValue() ;
for (;(step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29) ;_i = ((int)(0 + _i + step29))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 171;BA.debugLine="p2 = panels.Get(i)";
Debug.ShouldStop(1024);
_p2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_panels" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("p2", _p2);
 BA.debugLineNum = 172;BA.debugLine="p2.top = p2.top + ItemHeight + dividerHeight";
Debug.ShouldStop(2048);
_p2.runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_p2.runMethod(true,"getTop"),_itemheight,__ref.getField(true,"_dividerheight" /*RemoteObject*/ )}, "++",2, 0)));
 BA.debugLineNum = 173;BA.debugLine="p2.Tag = i + 1";
Debug.ShouldStop(4096);
_p2.runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 175;BA.debugLine="items.InsertAt(Index, Value)";
Debug.ShouldStop(16384);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("InsertAt",(Object)(_index),(Object)(_value));
 BA.debugLineNum = 176;BA.debugLine="panels.InsertAt(Index, p)";
Debug.ShouldStop(32768);
__ref.getField(false,"_panels" /*RemoteObject*/ ).runVoidMethod ("InsertAt",(Object)(_index),(Object)((_p.getObject())));
 BA.debugLineNum = 177;BA.debugLine="sv.Panel.AddView(p, 0, top, sv.Width, ItemHeight";
Debug.ShouldStop(65536);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_top),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_itemheight));
 };
 BA.debugLineNum = 179;BA.debugLine="sv.Panel.Height = sv.Panel.Height + ItemHeight +";
Debug.ShouldStop(262144);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getHeight"),_itemheight,__ref.getField(true,"_dividerheight" /*RemoteObject*/ )}, "++",2, 0)));
 BA.debugLineNum = 180;BA.debugLine="If items.Size = 1 Then sv.Panel.Height = sv.Panel";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getHeight"),__ref.getField(true,"_dividerheight" /*RemoteObject*/ )}, "+",1, 0)));};
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
public static RemoteObject  _insertattextitem(RemoteObject __ref,RemoteObject _index,RemoteObject _text,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("InsertAtTextItem (customlistview) ","customlistview",10,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("insertattextitem")) { return __ref.runUserSub(false, "customlistview","insertattextitem", __ref, _index, _text, _value);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _minheight = RemoteObject.createImmutable(0);
Debug.locals.put("Index", _index);
Debug.locals.put("Text", _text);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 114;BA.debugLine="Public Sub InsertAtTextItem(Index As Int, Text As";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(262144);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 116;BA.debugLine="pnl.Initialize(\"\")";
Debug.ShouldStop(524288);
_pnl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 117;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(1048576);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 118;BA.debugLine="lbl.Initialize(\"\")";
Debug.ShouldStop(2097152);
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 119;BA.debugLine="lbl.Gravity = Bit.Or(Gravity.CENTER_VERTICAL, Gra";
Debug.ShouldStop(4194304);
_lbl.runMethod(true,"setGravity",customlistview.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(customlistview.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(customlistview.__c.getField(false,"Gravity").getField(true,"LEFT"))));
 BA.debugLineNum = 120;BA.debugLine="pnl.AddView(lbl, 5dip, 2dip, sv.Width - 5dip, 20d";
Debug.ShouldStop(8388608);
_pnl.runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth"),customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 1)),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 121;BA.debugLine="lbl.Text = Text";
Debug.ShouldStop(16777216);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(_text));
 BA.debugLineNum = 122;BA.debugLine="lbl.TextSize = DefaultTextSize";
Debug.ShouldStop(33554432);
_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, __ref.getField(true,"_defaulttextsize" /*RemoteObject*/ )));
 BA.debugLineNum = 123;BA.debugLine="lbl.TextColor = DefaultTextColor";
Debug.ShouldStop(67108864);
_lbl.runMethod(true,"setTextColor",__ref.getField(true,"_defaulttextcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 124;BA.debugLine="If DefaultTextBackground <> Null Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_defaulttextbackground" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 125;BA.debugLine="pnl.Background = DefaultTextBackground";
Debug.ShouldStop(268435456);
_pnl.runMethod(false,"setBackground",(__ref.getField(false,"_defaulttextbackground" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 127;BA.debugLine="pnl.Color = DefaultTextBackgroundColor";
Debug.ShouldStop(1073741824);
_pnl.runVoidMethod ("setColor",__ref.getField(true,"_defaulttextbackgroundcolor" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 129;BA.debugLine="Dim minHeight As Int";
Debug.ShouldStop(1);
_minheight = RemoteObject.createImmutable(0);Debug.locals.put("minHeight", _minheight);
 BA.debugLineNum = 130;BA.debugLine="minHeight = su.MeasureMultilineTextHeight(lbl, Te";
Debug.ShouldStop(2);
_minheight = __ref.getField(false,"_su" /*RemoteObject*/ ).runMethod(true,"MeasureMultilineTextHeight",(Object)((_lbl.getObject())),(Object)(BA.ObjectToCharSequence(_text)));Debug.locals.put("minHeight", _minheight);
 BA.debugLineNum = 131;BA.debugLine="lbl.Height = Max(50dip, minHeight)";
Debug.ShouldStop(4);
_lbl.runMethod(true,"setHeight",BA.numberCast(int.class, customlistview.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))),(Object)(BA.numberCast(double.class, _minheight)))));
 BA.debugLineNum = 132;BA.debugLine="InsertAt(Index, pnl, lbl.Height + 2dip, Value)";
Debug.ShouldStop(8);
__ref.runClassMethod (pdv.milotin.customlistview.class, "_insertat" /*RemoteObject*/ ,(Object)(_index),(Object)(_pnl),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl.runMethod(true,"getHeight"),customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1)),(Object)(_value));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jumptoitem(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("JumpToItem (customlistview) ","customlistview",10,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("jumptoitem")) { return __ref.runUserSub(false, "customlistview","jumptoitem", __ref, _index);}
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
Debug.locals.put("Index", _index);
 BA.debugLineNum = 200;BA.debugLine="Public Sub JumpToItem(Index As Int)";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="Dim top As Int";
Debug.ShouldStop(256);
_top = RemoteObject.createImmutable(0);Debug.locals.put("top", _top);
 BA.debugLineNum = 202;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(512);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 203;BA.debugLine="For i = 0 To Min(Index - 1, items.Size - 1)";
Debug.ShouldStop(1024);
{
final int step3 = 1;
final int limit3 = (int) (0 + customlistview.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))).<Double>get().doubleValue());
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 204;BA.debugLine="p = panels.Get(i)";
Debug.ShouldStop(2048);
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_panels" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("p", _p);
 BA.debugLineNum = 205;BA.debugLine="top = top + p.Height + dividerHeight";
Debug.ShouldStop(4096);
_top = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_top,_p.runMethod(true,"getHeight"),__ref.getField(true,"_dividerheight" /*RemoteObject*/ )}, "++",2, 0));Debug.locals.put("top", _top);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 207;BA.debugLine="sv.ScrollPosition = top";
Debug.ShouldStop(16384);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollPosition",_top);
 BA.debugLineNum = 209;BA.debugLine="DoEvents";
Debug.ShouldStop(65536);
customlistview.__c.runVoidMethodAndSync ("DoEvents");
 BA.debugLineNum = 210;BA.debugLine="sv.ScrollPosition = top";
Debug.ShouldStop(131072);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollPosition",_top);
 BA.debugLineNum = 211;BA.debugLine="DoEvents";
Debug.ShouldStop(262144);
customlistview.__c.runVoidMethodAndSync ("DoEvents");
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel_Click (customlistview) ","customlistview",10,__ref.getField(false, "ba"),__ref,214);
if (RapidSub.canDelegate("panel_click")) { return __ref.runUserSub(false, "customlistview","panel_click", __ref);}
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
 BA.debugLineNum = 214;BA.debugLine="Private Sub Panel_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 215;BA.debugLine="If SubExists(CallBack, EventName & \"_ItemClick\")";
Debug.ShouldStop(4194304);
if (customlistview.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemClick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 216;BA.debugLine="Dim v As View";
Debug.ShouldStop(8388608);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");Debug.locals.put("v", _v);
 BA.debugLineNum = 217;BA.debugLine="v = Sender";
Debug.ShouldStop(16777216);
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), customlistview.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("v", _v);
 BA.debugLineNum = 218;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemClick\", v.T";
Debug.ShouldStop(33554432);
customlistview.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemClick"))),(Object)(_v.runMethod(false,"getTag")),(Object)(__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _v.runMethod(false,"getTag"))))));
 };
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeat(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("RemoveAt (customlistview) ","customlistview",10,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("removeat")) { return __ref.runUserSub(false, "customlistview","removeat", __ref, _index);}
RemoteObject _removepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
Debug.locals.put("Index", _index);
 BA.debugLineNum = 94;BA.debugLine="Public Sub RemoveAt(Index As Int)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="Dim removePanel, p As Panel";
Debug.ShouldStop(1073741824);
_removepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("removePanel", _removepanel);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 96;BA.debugLine="removePanel = panels.Get(Index)";
Debug.ShouldStop(-2147483648);
_removepanel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_panels" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)));Debug.locals.put("removePanel", _removepanel);
 BA.debugLineNum = 97;BA.debugLine="For i = Index + 1 To items.Size - 1";
Debug.ShouldStop(1);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue() ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 98;BA.debugLine="p = panels.Get(i)";
Debug.ShouldStop(2);
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_panels" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("p", _p);
 BA.debugLineNum = 99;BA.debugLine="p.Tag = i - 1";
Debug.ShouldStop(4);
_p.runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 100;BA.debugLine="p.Top = p.Top - removePanel.Height - dividerHeig";
Debug.ShouldStop(8);
_p.runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getTop"),_removepanel.runMethod(true,"getHeight"),__ref.getField(true,"_dividerheight" /*RemoteObject*/ )}, "--",2, 0)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 102;BA.debugLine="sv.Panel.Height = sv.Panel.Height - removePanel.H";
Debug.ShouldStop(32);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getHeight"),_removepanel.runMethod(true,"getHeight"),__ref.getField(true,"_dividerheight" /*RemoteObject*/ )}, "--",2, 0)));
 BA.debugLineNum = 103;BA.debugLine="items.RemoveAt(Index)";
Debug.ShouldStop(64);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 104;BA.debugLine="panels.RemoveAt(Index)";
Debug.ShouldStop(128);
__ref.getField(false,"_panels" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 105;BA.debugLine="removePanel.RemoveView";
Debug.ShouldStop(256);
_removepanel.runVoidMethod ("RemoveView");
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
public static RemoteObject  _replacebasepanelwithview(RemoteObject __ref,RemoteObject _base,RemoteObject _view) throws Exception{
try {
		Debug.PushSubsStack("ReplaceBasePanelWithView (customlistview) ","customlistview",10,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("replacebasepanelwithview")) { return __ref.runUserSub(false, "customlistview","replacebasepanelwithview", __ref, _base, _view);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _parent = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("base", _base);
Debug.locals.put("view", _view);
 BA.debugLineNum = 56;BA.debugLine="Private Sub ReplaceBasePanelWithView(base As Panel";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Dim jo As JavaObject = base";
Debug.ShouldStop(16777216);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _base.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 58;BA.debugLine="Dim parent As Panel = jo.RunMethod(\"getParent\", N";
Debug.ShouldStop(33554432);
_parent = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_parent = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getParent")),(Object)((customlistview.__c.getField(false,"Null")))));Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
 BA.debugLineNum = 59;BA.debugLine="parent.AddView(view, base.Left, base.Top, base.Wi";
Debug.ShouldStop(67108864);
_parent.runVoidMethod ("AddView",(Object)((_view.getObject())),(Object)(_base.runMethod(true,"getLeft")),(Object)(_base.runMethod(true,"getTop")),(Object)(_base.runMethod(true,"getWidth")),(Object)(_base.runMethod(true,"getHeight")));
 BA.debugLineNum = 60;BA.debugLine="base.RemoveView";
Debug.ShouldStop(134217728);
_base.runVoidMethod ("RemoveView");
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sv_scrollchanged(RemoteObject __ref,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("sv_ScrollChanged (customlistview) ","customlistview",10,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("sv_scrollchanged")) { return __ref.runUserSub(false, "customlistview","sv_scrollchanged", __ref, _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 188;BA.debugLine="Private Sub sv_ScrollChanged(Position As Int)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 189;BA.debugLine="If Position + sv.Height >= sv.Panel.Height Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("g",RemoteObject.solve(new RemoteObject[] {_position,__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1),BA.numberCast(double.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getHeight")))) { 
 BA.debugLineNum = 191;BA.debugLine="If DateTime.Now > lastAddItemsTime + 200 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",customlistview.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_lastadditemstime" /*RemoteObject*/ ),RemoteObject.createImmutable(200)}, "+",1, 2))) { 
 BA.debugLineNum = 192;BA.debugLine="lastAddItemsTime = DateTime.Now";
Debug.ShouldStop(-2147483648);
__ref.setField ("_lastadditemstime" /*RemoteObject*/ ,customlistview.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 193;BA.debugLine="CallSub(CallBack, EventName & \"_AddItems\")";
Debug.ShouldStop(1);
customlistview.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_AddItems"))));
 };
 };
 BA.debugLineNum = 197;BA.debugLine="End Sub";
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