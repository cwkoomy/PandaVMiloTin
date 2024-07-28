package pdv.milotin;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class circularprogressbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "pdv.milotin.circularprogressbar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", pdv.milotin.circularprogressbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mlbl = null;
public float _cx = 0f;
public float _cy = 0f;
public float _radius = 0f;
public float _stroke = 0f;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public float _currentvalue = 0f;
public int _durationfromzeroto100 = 0;
public b4a.example.bitmapcreator _bc = null;
public b4a.example.bcpath._bcbrush _emptybrush = null;
public b4a.example.bcpath._bcbrush _fullbrush = null;
public b4a.example.bcpath._bcbrush _transparentbrush = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
public int _clr1 = 0;
public int _clr2 = 0;
public int _loopindex = 0;
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
public pdv.milotin.viewallocatemd _viewallocatemd = null;
public pdv.milotin.httputils2service _httputils2service = null;
public void  _animatevalueto(float _newvalue) throws Exception{
ResumableSub_AnimateValueTo rsub = new ResumableSub_AnimateValueTo(this,_newvalue);
rsub.resume(ba, null);
}
public static class ResumableSub_AnimateValueTo extends BA.ResumableSub {
public ResumableSub_AnimateValueTo(pdv.milotin.circularprogressbar parent,float _newvalue) {
this.parent = parent;
this._newvalue = _newvalue;
}
pdv.milotin.circularprogressbar parent;
float _newvalue;
int _myindex = 0;
long _n = 0L;
int _duration = 0;
float _start = 0f;
float _tempvalue = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 95;BA.debugLine="LoopIndex = LoopIndex + 1";
parent._loopindex = (int) (parent._loopindex+1);
 //BA.debugLineNum = 96;BA.debugLine="Dim MyIndex As Int = LoopIndex";
_myindex = parent._loopindex;
 //BA.debugLineNum = 97;BA.debugLine="Dim n As Long = DateTime.Now";
_n = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 98;BA.debugLine="Dim duration As Int = Abs(currentValue - NewValue";
_duration = (int) (parent.__c.Abs(parent._currentvalue-_newvalue)/(double)100*parent._durationfromzeroto100+1000);
 //BA.debugLineNum = 99;BA.debugLine="Dim start As Float = currentValue";
_start = parent._currentvalue;
 //BA.debugLineNum = 100;BA.debugLine="currentValue = NewValue";
parent._currentvalue = _newvalue;
 //BA.debugLineNum = 101;BA.debugLine="Dim tempValue As Float";
_tempvalue = 0f;
 //BA.debugLineNum = 102;BA.debugLine="Do While DateTime.Now < n + duration";
if (true) break;

case 1:
//do while
this.state = 10;
while (parent.__c.DateTime.getNow()<_n+_duration) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 103;BA.debugLine="tempValue = ValueFromTimeEaseInOut(DateTime.Now";
_tempvalue = parent._valuefromtimeeaseinout((float) (parent.__c.DateTime.getNow()-_n),_start,(float) (_newvalue-_start),_duration);
 //BA.debugLineNum = 104;BA.debugLine="DrawValue(tempValue)";
parent._drawvalue(_tempvalue);
 //BA.debugLineNum = 105;BA.debugLine="Sleep(15)";
parent.__c.Sleep(ba,this,(int) (15));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
 //BA.debugLineNum = 106;BA.debugLine="If MyIndex <> LoopIndex Then Return";
if (true) break;

case 4:
//if
this.state = 9;
if (_myindex!=parent._loopindex) { 
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
 //BA.debugLineNum = 108;BA.debugLine="DrawValue(currentValue)";
parent._drawvalue(parent._currentvalue);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _base_resize(double _width,double _height) throws Exception{
int _w = 0;
 //BA.debugLineNum = 74;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 75;BA.debugLine="Dim w As Int = Min(Width, Height)";
_w = (int) (__c.Min(_width,_height));
 //BA.debugLineNum = 76;BA.debugLine="cx = w / 2";
_cx = (float) (_w/(double)2);
 //BA.debugLineNum = 77;BA.debugLine="cy = w / 2";
_cy = (float) (_w/(double)2);
 //BA.debugLineNum = 78;BA.debugLine="radius = cx - 10dip";
_radius = (float) (_cx-__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 79;BA.debugLine="iv.SetLayoutAnimated(0, 0, 0, w, w)";
_iv.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_w,_w);
 //BA.debugLineNum = 80;BA.debugLine="If bc.mWidth <> w Then";
if (_bc._mwidth!=_w) { 
 //BA.debugLineNum = 81;BA.debugLine="ResetBC";
_resetbc();
 };
 //BA.debugLineNum = 83;BA.debugLine="mLbl.SetLayoutAnimated(0, 0, cy - 20dip, w, 40dip";
_mlbl.SetLayoutAnimated((int) (0),(int) (0),(int) (_cy-__c.DipToCurrent((int) (20))),_w,__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 11;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 12;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 13;BA.debugLine="Private mLbl As B4XView";
_mlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private cx, cy, radius As Float";
_cx = 0f;
_cy = 0f;
_radius = 0f;
 //BA.debugLineNum = 15;BA.debugLine="Private stroke As Float";
_stroke = 0f;
 //BA.debugLineNum = 16;BA.debugLine="Private mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private currentValue As Float";
_currentvalue = 0f;
 //BA.debugLineNum = 18;BA.debugLine="Private DurationFromZeroTo100 As Int";
_durationfromzeroto100 = 0;
 //BA.debugLineNum = 19;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 20;BA.debugLine="Private emptyBrush As BCBrush";
_emptybrush = new b4a.example.bcpath._bcbrush();
 //BA.debugLineNum = 21;BA.debugLine="Private fullBrush As BCBrush";
_fullbrush = new b4a.example.bcpath._bcbrush();
 //BA.debugLineNum = 22;BA.debugLine="Private TransparentBrush As BCBrush";
_transparentbrush = new b4a.example.bcpath._bcbrush();
 //BA.debugLineNum = 23;BA.debugLine="Private iv As B4XView";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private clr1, clr2 As Int";
_clr1 = 0;
_clr2 = 0;
 //BA.debugLineNum = 25;BA.debugLine="Private LoopIndex As Int";
_loopindex = 0;
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
int _clrempty = 0;
anywheresoftware.b4a.objects.ImageViewWrapper _iiv = null;
 //BA.debugLineNum = 33;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 34;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 35;BA.debugLine="mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,";
_mbase.SetLayoutAnimated((int) (0),_mbase.getLeft(),_mbase.getTop(),(int) (__c.Min(_mbase.getWidth(),_mbase.getHeight())),(int) (__c.Min(_mbase.getWidth(),_mbase.getHeight())));
 //BA.debugLineNum = 36;BA.debugLine="Dim clrEmpty As Int = xui.PaintOrColorToColor(Pro";
_clrempty = _xui.PaintOrColorToColor(_props.Get((Object)("ColorEmpty")));
 //BA.debugLineNum = 37;BA.debugLine="clr1 = xui.PaintOrColorToColor(Props.Get(\"FirstCo";
_clr1 = _xui.PaintOrColorToColor(_props.Get((Object)("FirstColor")));
 //BA.debugLineNum = 38;BA.debugLine="clr2 = xui.PaintOrColorToColor(Props.Get(\"SecondC";
_clr2 = _xui.PaintOrColorToColor(_props.Get((Object)("SecondColor")));
 //BA.debugLineNum = 39;BA.debugLine="stroke = DipToCurrent(Props.Get(\"StrokeWidth\"))";
_stroke = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("StrokeWidth"))))));
 //BA.debugLineNum = 40;BA.debugLine="DurationFromZeroTo100 = Props.Get(\"Duration\")";
_durationfromzeroto100 = (int)(BA.ObjectToNumber(_props.Get((Object)("Duration"))));
 //BA.debugLineNum = 41;BA.debugLine="mLbl = Lbl";
_mlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 42;BA.debugLine="cx = mBase.Width / 2";
_cx = (float) (_mbase.getWidth()/(double)2);
 //BA.debugLineNum = 43;BA.debugLine="cy = mBase.Height / 2";
_cy = (float) (_mbase.getHeight()/(double)2);
 //BA.debugLineNum = 44;BA.debugLine="radius = cx - 10dip";
_radius = (float) (_cx-__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 45;BA.debugLine="mLbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_mlbl.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 46;BA.debugLine="Dim iiv As ImageView";
_iiv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 47;BA.debugLine="iiv.Initialize(\"\")";
_iiv.Initialize(ba,"");
 //BA.debugLineNum = 48;BA.debugLine="iv = iiv";
_iv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iiv.getObject()));
 //BA.debugLineNum = 49;BA.debugLine="mBase.AddView(iv, 0, 0, mBase.Width, mBase.Height";
_mbase.AddView((android.view.View)(_iv.getObject()),(int) (0),(int) (0),_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 50;BA.debugLine="mBase.AddView(mLbl, 0, mBase.Height / 2 - 20dip,";
_mbase.AddView((android.view.View)(_mlbl.getObject()),(int) (0),(int) (_mbase.getHeight()/(double)2-__c.DipToCurrent((int) (20))),_mbase.getWidth(),__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 51;BA.debugLine="ResetBC";
_resetbc();
 //BA.debugLineNum = 52;BA.debugLine="emptyBrush = bc.CreateBrushFromColor(clrEmpty)";
_emptybrush = _bc._createbrushfromcolor(_clrempty);
 //BA.debugLineNum = 53;BA.debugLine="TransparentBrush = bc.CreateBrushFromColor(xui.Co";
_transparentbrush = _bc._createbrushfromcolor(_xui.Color_Transparent);
 //BA.debugLineNum = 54;BA.debugLine="DrawValue(currentValue)";
_drawvalue(_currentvalue);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _drawvalue(float _value) throws Exception{
float _startangle = 0f;
float _sweepangle = 0f;
float _halfstroke = 0f;
 //BA.debugLineNum = 131;BA.debugLine="Private Sub DrawValue(Value As Float)";
 //BA.debugLineNum = 132;BA.debugLine="bc.DrawRect2(bc.TargetRect, TransparentBrush, Tru";
_bc._drawrect2(_bc._targetrect,_transparentbrush,__c.True,(int) (0));
 //BA.debugLineNum = 133;BA.debugLine="mLbl.Text = $\"$1.0{Value}\"$";
_mlbl.setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("1.0",(Object)(_value))+"")));
 //BA.debugLineNum = 134;BA.debugLine="Dim startAngle = -90, sweepAngle = Value / 100 *";
_startangle = (float) (-90);
_sweepangle = (float) (_value/(double)100*361);
 //BA.debugLineNum = 135;BA.debugLine="bc.DrawArc2(cx, cy, radius, emptyBrush, False, st";
_bc._drawarc2(_cx,_cy,_radius,_emptybrush,__c.False,(int) (_stroke),_startangle,(float) (-(360-_sweepangle)));
 //BA.debugLineNum = 136;BA.debugLine="bc.DrawArc2(cx, cy, radius, fullBrush, False, str";
_bc._drawarc2(_cx,_cy,_radius,_fullbrush,__c.False,(int) (_stroke),_startangle,_sweepangle);
 //BA.debugLineNum = 137;BA.debugLine="Dim halfStroke As Float = stroke / 2";
_halfstroke = (float) (_stroke/(double)2);
 //BA.debugLineNum = 138;BA.debugLine="If Value > 0 Then";
if (_value>0) { 
 //BA.debugLineNum = 139;BA.debugLine="bc.DrawCircle2(cx + Round((radius - halfStroke)";
_bc._drawcircle2((float) (_cx+__c.Round((_radius-_halfstroke)*__c.CosD(_startangle+_sweepangle))),(float) (_cy+__c.Round((_radius-_halfstroke)*__c.SinD(_startangle+_sweepangle))),_halfstroke,_fullbrush,__c.True,(int) (0));
 };
 //BA.debugLineNum = 142;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, iv)";
_bc._setbitmaptoimageview(_bc._getbitmap(),_iv);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public float  _getvalue() throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Public Sub getValue As Float";
 //BA.debugLineNum = 91;BA.debugLine="Return currentValue";
if (true) return _currentvalue;
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return 0f;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 28;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 29;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 30;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _resetbc() throws Exception{
b4a.example.bitmapcreator _g = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _y = 0;
int _x = 0;
float _angle = 0f;
 //BA.debugLineNum = 57;BA.debugLine="Private Sub ResetBC";
 //BA.debugLineNum = 58;BA.debugLine="bc.Initialize(iv.Width, iv.Width)";
_bc._initialize(ba,_iv.getWidth(),_iv.getWidth());
 //BA.debugLineNum = 59;BA.debugLine="Dim g As BitmapCreator";
_g = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 60;BA.debugLine="g.Initialize(bc.mWidth, bc.mHeight)";
_g._initialize(ba,_bc._mwidth,_bc._mheight);
 //BA.debugLineNum = 61;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 62;BA.debugLine="r.Initialize(0, 0, bc.mWidth, 2) 'ignore";
_r.Initialize((float) (0),(float) (0),(float) (_bc._mwidth),(float) (2));
 //BA.debugLineNum = 63;BA.debugLine="bc.FillGradient(Array As Int(clr1, clr2), r, \"LEF";
_bc._fillgradient(new int[]{_clr1,_clr2},_r,"LEFT_RIGHT");
 //BA.debugLineNum = 64;BA.debugLine="For y = 0 To g.mHeight - 1";
{
final int step7 = 1;
final int limit7 = (int) (_g._mheight-1);
_y = (int) (0) ;
for (;_y <= limit7 ;_y = _y + step7 ) {
 //BA.debugLineNum = 65;BA.debugLine="For x = 0 To g.mWidth - 1";
{
final int step8 = 1;
final int limit8 = (int) (_g._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit8 ;_x = _x + step8 ) {
 //BA.debugLineNum = 66;BA.debugLine="Dim angle As Float = ATan2D(y - cy, x - cx) + 9";
_angle = (float) (__c.ATan2D(_y-_cy,_x-_cx)+90.5);
 //BA.debugLineNum = 67;BA.debugLine="If angle < 0 Then angle = angle + 360";
if (_angle<0) { 
_angle = (float) (_angle+360);};
 //BA.debugLineNum = 68;BA.debugLine="g.CopyPixel(bc, bc.mWidth * angle / 360, 0, x,";
_g._copypixel(_bc,(int) (_bc._mwidth*_angle/(double)360),(int) (0),_x,_y);
 }
};
 }
};
 //BA.debugLineNum = 71;BA.debugLine="fullBrush = bc.CreateBrushFromBitmapCreator(g)";
_fullbrush = _bc._createbrushfrombitmapcreator(_g);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(float _newvalue) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Public Sub setValue(NewValue As Float)";
 //BA.debugLineNum = 87;BA.debugLine="AnimateValueTo(NewValue)";
_animatevalueto(_newvalue);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public float  _valuefromtimeeaseinout(float _time,float _start,float _changeinvalue,int _duration) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Private Sub ValueFromTimeEaseInOut(Time As Float,";
 //BA.debugLineNum = 113;BA.debugLine="Time = Time / (Duration / 2)";
_time = (float) (_time/(double)(_duration/(double)2));
 //BA.debugLineNum = 114;BA.debugLine="If Time < 1 Then";
if (_time<1) { 
 //BA.debugLineNum = 115;BA.debugLine="Return ChangeInValue / 2 * Time * Time * Time *";
if (true) return (float) (_changeinvalue/(double)2*_time*_time*_time*_time+_start);
 }else {
 //BA.debugLineNum = 117;BA.debugLine="Time = Time - 2";
_time = (float) (_time-2);
 //BA.debugLineNum = 118;BA.debugLine="Return -ChangeInValue / 2 * (Time * Time * Time";
if (true) return (float) (-_changeinvalue/(double)2*(_time*_time*_time*_time-2)+_start);
 };
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return 0f;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
