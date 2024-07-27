package pdv.milotin;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class circularprogressbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "pdv.milotin.circularprogressbar");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public pdv.milotin.httputils2service _httputils2service = null;
public String  _setvalue(pdv.milotin.circularprogressbar __ref,float _newvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="circularprogressbar";
if (Debug.shouldDelegate(ba, "setvalue", false))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_newvalue}));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Public Sub setValue(NewValue As Float)";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="AnimateValueTo(NewValue)";
__ref._animatevalueto /*void*/ (null,_newvalue);
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="End Sub";
return "";
}
public void  _animatevalueto(pdv.milotin.circularprogressbar __ref,float _newvalue) throws Exception{
RDebugUtils.currentModule="circularprogressbar";
if (Debug.shouldDelegate(ba, "animatevalueto", false))
	 {Debug.delegate(ba, "animatevalueto", new Object[] {_newvalue}); return;}
ResumableSub_AnimateValueTo rsub = new ResumableSub_AnimateValueTo(this,__ref,_newvalue);
rsub.resume(ba, null);
}
public static class ResumableSub_AnimateValueTo extends BA.ResumableSub {
public ResumableSub_AnimateValueTo(pdv.milotin.circularprogressbar parent,pdv.milotin.circularprogressbar __ref,float _newvalue) {
this.parent = parent;
this.__ref = __ref;
this._newvalue = _newvalue;
this.__ref = parent;
}
pdv.milotin.circularprogressbar __ref;
pdv.milotin.circularprogressbar parent;
float _newvalue;
int _myindex = 0;
long _n = 0L;
int _duration = 0;
float _start = 0f;
float _tempvalue = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="circularprogressbar";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="LoopIndex = LoopIndex + 1";
__ref._loopindex /*int*/  = (int) (__ref._loopindex /*int*/ +1);
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="Dim MyIndex As Int = LoopIndex";
_myindex = __ref._loopindex /*int*/ ;
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="Dim n As Long = DateTime.Now";
_n = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="Dim duration As Int = Abs(currentValue - NewValue";
_duration = (int) (parent.__c.Abs(__ref._currentvalue /*float*/ -_newvalue)/(double)100*__ref._durationfromzeroto100 /*int*/ +1000);
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="Dim start As Float = currentValue";
_start = __ref._currentvalue /*float*/ ;
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="currentValue = NewValue";
__ref._currentvalue /*float*/  = _newvalue;
RDebugUtils.currentLine=9240583;
 //BA.debugLineNum = 9240583;BA.debugLine="Dim tempValue As Float";
_tempvalue = 0f;
RDebugUtils.currentLine=9240584;
 //BA.debugLineNum = 9240584;BA.debugLine="Do While DateTime.Now < n + duration";
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
RDebugUtils.currentLine=9240585;
 //BA.debugLineNum = 9240585;BA.debugLine="tempValue = ValueFromTimeEaseInOut(DateTime.Now";
_tempvalue = __ref._valuefromtimeeaseinout /*float*/ (null,(float) (parent.__c.DateTime.getNow()-_n),_start,(float) (_newvalue-_start),_duration);
RDebugUtils.currentLine=9240586;
 //BA.debugLineNum = 9240586;BA.debugLine="DrawValue(tempValue)";
__ref._drawvalue /*String*/ (null,_tempvalue);
RDebugUtils.currentLine=9240587;
 //BA.debugLineNum = 9240587;BA.debugLine="Sleep(15)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "circularprogressbar", "animatevalueto"),(int) (15));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
RDebugUtils.currentLine=9240588;
 //BA.debugLineNum = 9240588;BA.debugLine="If MyIndex <> LoopIndex Then Return";
if (true) break;

case 4:
//if
this.state = 9;
if (_myindex!=__ref._loopindex /*int*/ ) { 
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
RDebugUtils.currentLine=9240590;
 //BA.debugLineNum = 9240590;BA.debugLine="DrawValue(currentValue)";
__ref._drawvalue /*String*/ (null,__ref._currentvalue /*float*/ );
RDebugUtils.currentLine=9240591;
 //BA.debugLineNum = 9240591;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public float  _valuefromtimeeaseinout(pdv.milotin.circularprogressbar __ref,float _time,float _start,float _changeinvalue,int _duration) throws Exception{
__ref = this;
RDebugUtils.currentModule="circularprogressbar";
if (Debug.shouldDelegate(ba, "valuefromtimeeaseinout", false))
	 {return ((Float) Debug.delegate(ba, "valuefromtimeeaseinout", new Object[] {_time,_start,_changeinvalue,_duration}));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Private Sub ValueFromTimeEaseInOut(Time As Float,";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Time = Time / (Duration / 2)";
_time = (float) (_time/(double)(_duration/(double)2));
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="If Time < 1 Then";
if (_time<1) { 
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="Return ChangeInValue / 2 * Time * Time * Time *";
if (true) return (float) (_changeinvalue/(double)2*_time*_time*_time*_time+_start);
 }else {
RDebugUtils.currentLine=9306117;
 //BA.debugLineNum = 9306117;BA.debugLine="Time = Time - 2";
_time = (float) (_time-2);
RDebugUtils.currentLine=9306118;
 //BA.debugLineNum = 9306118;BA.debugLine="Return -ChangeInValue / 2 * (Time * Time * Time";
if (true) return (float) (-_changeinvalue/(double)2*(_time*_time*_time*_time-2)+_start);
 };
RDebugUtils.currentLine=9306120;
 //BA.debugLineNum = 9306120;BA.debugLine="End Sub";
return 0f;
}
public String  _drawvalue(pdv.milotin.circularprogressbar __ref,float _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="circularprogressbar";
if (Debug.shouldDelegate(ba, "drawvalue", false))
	 {return ((String) Debug.delegate(ba, "drawvalue", new Object[] {_value}));}
float _startangle = 0f;
float _sweepangle = 0f;
float _halfstroke = 0f;
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Private Sub DrawValue(Value As Float)";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="bc.DrawRect2(bc.TargetRect, TransparentBrush, Tru";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawrect2(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._transparentbrush /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="mLbl.Text = $\"$1.0{Value}\"$";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("1.0",(Object)(_value))+"")));
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="Dim startAngle = -90, sweepAngle = Value / 100 *";
_startangle = (float) (-90);
_sweepangle = (float) (_value/(double)100*361);
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="bc.DrawArc2(cx, cy, radius, emptyBrush, False, st";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawarc2(__ref._cx /*float*/ ,__ref._cy /*float*/ ,__ref._radius /*float*/ ,__ref._emptybrush /*b4a.example.bcpath._bcbrush*/ ,__c.False,(int) (__ref._stroke /*float*/ ),_startangle,(float) (-(360-_sweepangle)));
RDebugUtils.currentLine=9371653;
 //BA.debugLineNum = 9371653;BA.debugLine="bc.DrawArc2(cx, cy, radius, fullBrush, False, str";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawarc2(__ref._cx /*float*/ ,__ref._cy /*float*/ ,__ref._radius /*float*/ ,__ref._fullbrush /*b4a.example.bcpath._bcbrush*/ ,__c.False,(int) (__ref._stroke /*float*/ ),_startangle,_sweepangle);
RDebugUtils.currentLine=9371654;
 //BA.debugLineNum = 9371654;BA.debugLine="Dim halfStroke As Float = stroke / 2";
_halfstroke = (float) (__ref._stroke /*float*/ /(double)2);
RDebugUtils.currentLine=9371655;
 //BA.debugLineNum = 9371655;BA.debugLine="If Value > 0 Then";
if (_value>0) { 
RDebugUtils.currentLine=9371656;
 //BA.debugLineNum = 9371656;BA.debugLine="bc.DrawCircle2(cx + Round((radius - halfStroke)";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawcircle2((float) (__ref._cx /*float*/ +__c.Round((__ref._radius /*float*/ -_halfstroke)*__c.CosD(_startangle+_sweepangle))),(float) (__ref._cy /*float*/ +__c.Round((__ref._radius /*float*/ -_halfstroke)*__c.SinD(_startangle+_sweepangle))),_halfstroke,__ref._fullbrush /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (0));
 };
RDebugUtils.currentLine=9371659;
 //BA.debugLineNum = 9371659;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, iv)";
__ref._bc /*b4a.example.bitmapcreator*/ ._setbitmaptoimageview(__ref._bc /*b4a.example.bitmapcreator*/ ._getbitmap(),__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=9371660;
 //BA.debugLineNum = 9371660;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(pdv.milotin.circularprogressbar __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="circularprogressbar";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _w = 0;
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Dim w As Int = Min(Width, Height)";
_w = (int) (__c.Min(_width,_height));
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="cx = w / 2";
__ref._cx /*float*/  = (float) (_w/(double)2);
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="cy = w / 2";
__ref._cy /*float*/  = (float) (_w/(double)2);
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="radius = cx - 10dip";
__ref._radius /*float*/  = (float) (__ref._cx /*float*/ -__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="iv.SetLayoutAnimated(0, 0, 0, w, w)";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_w,_w);
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="If bc.mWidth <> w Then";
if (__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth!=_w) { 
RDebugUtils.currentLine=9043975;
 //BA.debugLineNum = 9043975;BA.debugLine="ResetBC";
__ref._resetbc /*String*/ (null);
 };
RDebugUtils.currentLine=9043977;
 //BA.debugLineNum = 9043977;BA.debugLine="mLbl.SetLayoutAnimated(0, 0, cy - 20dip, w, 40dip";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (__ref._cy /*float*/ -__c.DipToCurrent((int) (20))),_w,__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=9043978;
 //BA.debugLineNum = 9043978;BA.debugLine="End Sub";
return "";
}
public String  _resetbc(pdv.milotin.circularprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="circularprogressbar";
if (Debug.shouldDelegate(ba, "resetbc", false))
	 {return ((String) Debug.delegate(ba, "resetbc", null));}
b4a.example.bitmapcreator _g = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _y = 0;
int _x = 0;
float _angle = 0f;
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Private Sub ResetBC";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="bc.Initialize(iv.Width, iv.Width)";
__ref._bc /*b4a.example.bitmapcreator*/ ._initialize(ba,__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="Dim g As BitmapCreator";
_g = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="g.Initialize(bc.mWidth, bc.mHeight)";
_g._initialize(ba,__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth,__ref._bc /*b4a.example.bitmapcreator*/ ._mheight);
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="r.Initialize(0, 0, bc.mWidth, 2) 'ignore";
_r.Initialize((float) (0),(float) (0),(float) (__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth),(float) (2));
RDebugUtils.currentLine=8978438;
 //BA.debugLineNum = 8978438;BA.debugLine="bc.FillGradient(Array As Int(clr1, clr2), r, \"LEF";
__ref._bc /*b4a.example.bitmapcreator*/ ._fillgradient(new int[]{__ref._clr1 /*int*/ ,__ref._clr2 /*int*/ },_r,"LEFT_RIGHT");
RDebugUtils.currentLine=8978439;
 //BA.debugLineNum = 8978439;BA.debugLine="For y = 0 To g.mHeight - 1";
{
final int step7 = 1;
final int limit7 = (int) (_g._mheight-1);
_y = (int) (0) ;
for (;_y <= limit7 ;_y = _y + step7 ) {
RDebugUtils.currentLine=8978440;
 //BA.debugLineNum = 8978440;BA.debugLine="For x = 0 To g.mWidth - 1";
{
final int step8 = 1;
final int limit8 = (int) (_g._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit8 ;_x = _x + step8 ) {
RDebugUtils.currentLine=8978441;
 //BA.debugLineNum = 8978441;BA.debugLine="Dim angle As Float = ATan2D(y - cy, x - cx) + 9";
_angle = (float) (__c.ATan2D(_y-__ref._cy /*float*/ ,_x-__ref._cx /*float*/ )+90.5);
RDebugUtils.currentLine=8978442;
 //BA.debugLineNum = 8978442;BA.debugLine="If angle < 0 Then angle = angle + 360";
if (_angle<0) { 
_angle = (float) (_angle+360);};
RDebugUtils.currentLine=8978443;
 //BA.debugLineNum = 8978443;BA.debugLine="g.CopyPixel(bc, bc.mWidth * angle / 360, 0, x,";
_g._copypixel(__ref._bc /*b4a.example.bitmapcreator*/ ,(int) (__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth*_angle/(double)360),(int) (0),_x,_y);
 }
};
 }
};
RDebugUtils.currentLine=8978446;
 //BA.debugLineNum = 8978446;BA.debugLine="fullBrush = bc.CreateBrushFromBitmapCreator(g)";
__ref._fullbrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfrombitmapcreator(_g);
RDebugUtils.currentLine=8978447;
 //BA.debugLineNum = 8978447;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(pdv.milotin.circularprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="circularprogressbar";
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="Private mLbl As B4XView";
_mlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="Private cx, cy, radius As Float";
_cx = 0f;
_cy = 0f;
_radius = 0f;
RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="Private stroke As Float";
_stroke = 0f;
RDebugUtils.currentLine=8781831;
 //BA.debugLineNum = 8781831;BA.debugLine="Private mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="Private currentValue As Float";
_currentvalue = 0f;
RDebugUtils.currentLine=8781833;
 //BA.debugLineNum = 8781833;BA.debugLine="Private DurationFromZeroTo100 As Int";
_durationfromzeroto100 = 0;
RDebugUtils.currentLine=8781834;
 //BA.debugLineNum = 8781834;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=8781835;
 //BA.debugLineNum = 8781835;BA.debugLine="Private emptyBrush As BCBrush";
_emptybrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=8781836;
 //BA.debugLineNum = 8781836;BA.debugLine="Private fullBrush As BCBrush";
_fullbrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=8781837;
 //BA.debugLineNum = 8781837;BA.debugLine="Private TransparentBrush As BCBrush";
_transparentbrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=8781838;
 //BA.debugLineNum = 8781838;BA.debugLine="Private iv As B4XView";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8781839;
 //BA.debugLineNum = 8781839;BA.debugLine="Private clr1, clr2 As Int";
_clr1 = 0;
_clr2 = 0;
RDebugUtils.currentLine=8781840;
 //BA.debugLineNum = 8781840;BA.debugLine="Private LoopIndex As Int";
_loopindex = 0;
RDebugUtils.currentLine=8781841;
 //BA.debugLineNum = 8781841;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(pdv.milotin.circularprogressbar __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="circularprogressbar";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
int _clrempty = 0;
anywheresoftware.b4a.objects.ImageViewWrapper _iiv = null;
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),(int) (__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())),(int) (__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())));
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="Dim clrEmpty As Int = xui.PaintOrColorToColor(Pro";
_clrempty = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ColorEmpty")));
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="clr1 = xui.PaintOrColorToColor(Props.Get(\"FirstCo";
__ref._clr1 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("FirstColor")));
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="clr2 = xui.PaintOrColorToColor(Props.Get(\"SecondC";
__ref._clr2 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SecondColor")));
RDebugUtils.currentLine=8912902;
 //BA.debugLineNum = 8912902;BA.debugLine="stroke = DipToCurrent(Props.Get(\"StrokeWidth\"))";
__ref._stroke /*float*/  = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("StrokeWidth"))))));
RDebugUtils.currentLine=8912903;
 //BA.debugLineNum = 8912903;BA.debugLine="DurationFromZeroTo100 = Props.Get(\"Duration\")";
__ref._durationfromzeroto100 /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Duration"))));
RDebugUtils.currentLine=8912904;
 //BA.debugLineNum = 8912904;BA.debugLine="mLbl = Lbl";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=8912905;
 //BA.debugLineNum = 8912905;BA.debugLine="cx = mBase.Width / 2";
__ref._cx /*float*/  = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2);
RDebugUtils.currentLine=8912906;
 //BA.debugLineNum = 8912906;BA.debugLine="cy = mBase.Height / 2";
__ref._cy /*float*/  = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=8912907;
 //BA.debugLineNum = 8912907;BA.debugLine="radius = cx - 10dip";
__ref._radius /*float*/  = (float) (__ref._cx /*float*/ -__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=8912908;
 //BA.debugLineNum = 8912908;BA.debugLine="mLbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=8912909;
 //BA.debugLineNum = 8912909;BA.debugLine="Dim iiv As ImageView";
_iiv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=8912910;
 //BA.debugLineNum = 8912910;BA.debugLine="iiv.Initialize(\"\")";
_iiv.Initialize(ba,"");
RDebugUtils.currentLine=8912911;
 //BA.debugLineNum = 8912911;BA.debugLine="iv = iiv";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iiv.getObject()));
RDebugUtils.currentLine=8912912;
 //BA.debugLineNum = 8912912;BA.debugLine="mBase.AddView(iv, 0, 0, mBase.Width, mBase.Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=8912913;
 //BA.debugLineNum = 8912913;BA.debugLine="mBase.AddView(mLbl, 0, mBase.Height / 2 - 20dip,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-__c.DipToCurrent((int) (20))),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=8912914;
 //BA.debugLineNum = 8912914;BA.debugLine="ResetBC";
__ref._resetbc /*String*/ (null);
RDebugUtils.currentLine=8912915;
 //BA.debugLineNum = 8912915;BA.debugLine="emptyBrush = bc.CreateBrushFromColor(clrEmpty)";
__ref._emptybrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(_clrempty);
RDebugUtils.currentLine=8912916;
 //BA.debugLineNum = 8912916;BA.debugLine="TransparentBrush = bc.CreateBrushFromColor(xui.Co";
__ref._transparentbrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=8912917;
 //BA.debugLineNum = 8912917;BA.debugLine="DrawValue(currentValue)";
__ref._drawvalue /*String*/ (null,__ref._currentvalue /*float*/ );
RDebugUtils.currentLine=8912918;
 //BA.debugLineNum = 8912918;BA.debugLine="End Sub";
return "";
}
public float  _getvalue(pdv.milotin.circularprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="circularprogressbar";
if (Debug.shouldDelegate(ba, "getvalue", false))
	 {return ((Float) Debug.delegate(ba, "getvalue", null));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Public Sub getValue As Float";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Return currentValue";
if (true) return __ref._currentvalue /*float*/ ;
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="End Sub";
return 0f;
}
public String  _initialize(pdv.milotin.circularprogressbar __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="circularprogressbar";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="End Sub";
return "";
}
}