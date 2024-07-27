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
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Public Sub setValue(NewValue As Float)";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="AnimateValueTo(NewValue)";
__ref._animatevalueto /*void*/ (null,_newvalue);
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="LoopIndex = LoopIndex + 1";
__ref._loopindex /*int*/  = (int) (__ref._loopindex /*int*/ +1);
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="Dim MyIndex As Int = LoopIndex";
_myindex = __ref._loopindex /*int*/ ;
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="Dim n As Long = DateTime.Now";
_n = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=13041668;
 //BA.debugLineNum = 13041668;BA.debugLine="Dim duration As Int = Abs(currentValue - NewValue";
_duration = (int) (parent.__c.Abs(__ref._currentvalue /*float*/ -_newvalue)/(double)100*__ref._durationfromzeroto100 /*int*/ +1000);
RDebugUtils.currentLine=13041669;
 //BA.debugLineNum = 13041669;BA.debugLine="Dim start As Float = currentValue";
_start = __ref._currentvalue /*float*/ ;
RDebugUtils.currentLine=13041670;
 //BA.debugLineNum = 13041670;BA.debugLine="currentValue = NewValue";
__ref._currentvalue /*float*/  = _newvalue;
RDebugUtils.currentLine=13041671;
 //BA.debugLineNum = 13041671;BA.debugLine="Dim tempValue As Float";
_tempvalue = 0f;
RDebugUtils.currentLine=13041672;
 //BA.debugLineNum = 13041672;BA.debugLine="Do While DateTime.Now < n + duration";
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
RDebugUtils.currentLine=13041673;
 //BA.debugLineNum = 13041673;BA.debugLine="tempValue = ValueFromTimeEaseInOut(DateTime.Now";
_tempvalue = __ref._valuefromtimeeaseinout /*float*/ (null,(float) (parent.__c.DateTime.getNow()-_n),_start,(float) (_newvalue-_start),_duration);
RDebugUtils.currentLine=13041674;
 //BA.debugLineNum = 13041674;BA.debugLine="DrawValue(tempValue)";
__ref._drawvalue /*String*/ (null,_tempvalue);
RDebugUtils.currentLine=13041675;
 //BA.debugLineNum = 13041675;BA.debugLine="Sleep(15)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "circularprogressbar", "animatevalueto"),(int) (15));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
RDebugUtils.currentLine=13041676;
 //BA.debugLineNum = 13041676;BA.debugLine="If MyIndex <> LoopIndex Then Return";
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
RDebugUtils.currentLine=13041678;
 //BA.debugLineNum = 13041678;BA.debugLine="DrawValue(currentValue)";
__ref._drawvalue /*String*/ (null,__ref._currentvalue /*float*/ );
RDebugUtils.currentLine=13041679;
 //BA.debugLineNum = 13041679;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Private Sub ValueFromTimeEaseInOut(Time As Float,";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="Time = Time / (Duration / 2)";
_time = (float) (_time/(double)(_duration/(double)2));
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="If Time < 1 Then";
if (_time<1) { 
RDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="Return ChangeInValue / 2 * Time * Time * Time *";
if (true) return (float) (_changeinvalue/(double)2*_time*_time*_time*_time+_start);
 }else {
RDebugUtils.currentLine=13107205;
 //BA.debugLineNum = 13107205;BA.debugLine="Time = Time - 2";
_time = (float) (_time-2);
RDebugUtils.currentLine=13107206;
 //BA.debugLineNum = 13107206;BA.debugLine="Return -ChangeInValue / 2 * (Time * Time * Time";
if (true) return (float) (-_changeinvalue/(double)2*(_time*_time*_time*_time-2)+_start);
 };
RDebugUtils.currentLine=13107208;
 //BA.debugLineNum = 13107208;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Private Sub DrawValue(Value As Float)";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="bc.DrawRect2(bc.TargetRect, TransparentBrush, Tru";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawrect2(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._transparentbrush /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="mLbl.Text = $\"$1.0{Value}\"$";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("1.0",(Object)(_value))+"")));
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="Dim startAngle = -90, sweepAngle = Value / 100 *";
_startangle = (float) (-90);
_sweepangle = (float) (_value/(double)100*361);
RDebugUtils.currentLine=13172740;
 //BA.debugLineNum = 13172740;BA.debugLine="bc.DrawArc2(cx, cy, radius, emptyBrush, False, st";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawarc2(__ref._cx /*float*/ ,__ref._cy /*float*/ ,__ref._radius /*float*/ ,__ref._emptybrush /*b4a.example.bcpath._bcbrush*/ ,__c.False,(int) (__ref._stroke /*float*/ ),_startangle,(float) (-(360-_sweepangle)));
RDebugUtils.currentLine=13172741;
 //BA.debugLineNum = 13172741;BA.debugLine="bc.DrawArc2(cx, cy, radius, fullBrush, False, str";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawarc2(__ref._cx /*float*/ ,__ref._cy /*float*/ ,__ref._radius /*float*/ ,__ref._fullbrush /*b4a.example.bcpath._bcbrush*/ ,__c.False,(int) (__ref._stroke /*float*/ ),_startangle,_sweepangle);
RDebugUtils.currentLine=13172742;
 //BA.debugLineNum = 13172742;BA.debugLine="Dim halfStroke As Float = stroke / 2";
_halfstroke = (float) (__ref._stroke /*float*/ /(double)2);
RDebugUtils.currentLine=13172743;
 //BA.debugLineNum = 13172743;BA.debugLine="If Value > 0 Then";
if (_value>0) { 
RDebugUtils.currentLine=13172744;
 //BA.debugLineNum = 13172744;BA.debugLine="bc.DrawCircle2(cx + Round((radius - halfStroke)";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawcircle2((float) (__ref._cx /*float*/ +__c.Round((__ref._radius /*float*/ -_halfstroke)*__c.CosD(_startangle+_sweepangle))),(float) (__ref._cy /*float*/ +__c.Round((__ref._radius /*float*/ -_halfstroke)*__c.SinD(_startangle+_sweepangle))),_halfstroke,__ref._fullbrush /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (0));
 };
RDebugUtils.currentLine=13172747;
 //BA.debugLineNum = 13172747;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, iv)";
__ref._bc /*b4a.example.bitmapcreator*/ ._setbitmaptoimageview(__ref._bc /*b4a.example.bitmapcreator*/ ._getbitmap(),__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=13172748;
 //BA.debugLineNum = 13172748;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(pdv.milotin.circularprogressbar __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="circularprogressbar";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _w = 0;
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="Dim w As Int = Min(Width, Height)";
_w = (int) (__c.Min(_width,_height));
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="cx = w / 2";
__ref._cx /*float*/  = (float) (_w/(double)2);
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="cy = w / 2";
__ref._cy /*float*/  = (float) (_w/(double)2);
RDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="radius = cx - 10dip";
__ref._radius /*float*/  = (float) (__ref._cx /*float*/ -__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=12845061;
 //BA.debugLineNum = 12845061;BA.debugLine="iv.SetLayoutAnimated(0, 0, 0, w, w)";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_w,_w);
RDebugUtils.currentLine=12845062;
 //BA.debugLineNum = 12845062;BA.debugLine="If bc.mWidth <> w Then";
if (__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth!=_w) { 
RDebugUtils.currentLine=12845063;
 //BA.debugLineNum = 12845063;BA.debugLine="ResetBC";
__ref._resetbc /*String*/ (null);
 };
RDebugUtils.currentLine=12845065;
 //BA.debugLineNum = 12845065;BA.debugLine="mLbl.SetLayoutAnimated(0, 0, cy - 20dip, w, 40dip";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (__ref._cy /*float*/ -__c.DipToCurrent((int) (20))),_w,__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=12845066;
 //BA.debugLineNum = 12845066;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Private Sub ResetBC";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="bc.Initialize(iv.Width, iv.Width)";
__ref._bc /*b4a.example.bitmapcreator*/ ._initialize(ba,__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="Dim g As BitmapCreator";
_g = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="g.Initialize(bc.mWidth, bc.mHeight)";
_g._initialize(ba,__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth,__ref._bc /*b4a.example.bitmapcreator*/ ._mheight);
RDebugUtils.currentLine=12779524;
 //BA.debugLineNum = 12779524;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=12779525;
 //BA.debugLineNum = 12779525;BA.debugLine="r.Initialize(0, 0, bc.mWidth, 2) 'ignore";
_r.Initialize((float) (0),(float) (0),(float) (__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth),(float) (2));
RDebugUtils.currentLine=12779526;
 //BA.debugLineNum = 12779526;BA.debugLine="bc.FillGradient(Array As Int(clr1, clr2), r, \"LEF";
__ref._bc /*b4a.example.bitmapcreator*/ ._fillgradient(new int[]{__ref._clr1 /*int*/ ,__ref._clr2 /*int*/ },_r,"LEFT_RIGHT");
RDebugUtils.currentLine=12779527;
 //BA.debugLineNum = 12779527;BA.debugLine="For y = 0 To g.mHeight - 1";
{
final int step7 = 1;
final int limit7 = (int) (_g._mheight-1);
_y = (int) (0) ;
for (;_y <= limit7 ;_y = _y + step7 ) {
RDebugUtils.currentLine=12779528;
 //BA.debugLineNum = 12779528;BA.debugLine="For x = 0 To g.mWidth - 1";
{
final int step8 = 1;
final int limit8 = (int) (_g._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit8 ;_x = _x + step8 ) {
RDebugUtils.currentLine=12779529;
 //BA.debugLineNum = 12779529;BA.debugLine="Dim angle As Float = ATan2D(y - cy, x - cx) + 9";
_angle = (float) (__c.ATan2D(_y-__ref._cy /*float*/ ,_x-__ref._cx /*float*/ )+90.5);
RDebugUtils.currentLine=12779530;
 //BA.debugLineNum = 12779530;BA.debugLine="If angle < 0 Then angle = angle + 360";
if (_angle<0) { 
_angle = (float) (_angle+360);};
RDebugUtils.currentLine=12779531;
 //BA.debugLineNum = 12779531;BA.debugLine="g.CopyPixel(bc, bc.mWidth * angle / 360, 0, x,";
_g._copypixel(__ref._bc /*b4a.example.bitmapcreator*/ ,(int) (__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth*_angle/(double)360),(int) (0),_x,_y);
 }
};
 }
};
RDebugUtils.currentLine=12779534;
 //BA.debugLineNum = 12779534;BA.debugLine="fullBrush = bc.CreateBrushFromBitmapCreator(g)";
__ref._fullbrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfrombitmapcreator(_g);
RDebugUtils.currentLine=12779535;
 //BA.debugLineNum = 12779535;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(pdv.milotin.circularprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="circularprogressbar";
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="Private mLbl As B4XView";
_mlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12582917;
 //BA.debugLineNum = 12582917;BA.debugLine="Private cx, cy, radius As Float";
_cx = 0f;
_cy = 0f;
_radius = 0f;
RDebugUtils.currentLine=12582918;
 //BA.debugLineNum = 12582918;BA.debugLine="Private stroke As Float";
_stroke = 0f;
RDebugUtils.currentLine=12582919;
 //BA.debugLineNum = 12582919;BA.debugLine="Private mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12582920;
 //BA.debugLineNum = 12582920;BA.debugLine="Private currentValue As Float";
_currentvalue = 0f;
RDebugUtils.currentLine=12582921;
 //BA.debugLineNum = 12582921;BA.debugLine="Private DurationFromZeroTo100 As Int";
_durationfromzeroto100 = 0;
RDebugUtils.currentLine=12582922;
 //BA.debugLineNum = 12582922;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=12582923;
 //BA.debugLineNum = 12582923;BA.debugLine="Private emptyBrush As BCBrush";
_emptybrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=12582924;
 //BA.debugLineNum = 12582924;BA.debugLine="Private fullBrush As BCBrush";
_fullbrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=12582925;
 //BA.debugLineNum = 12582925;BA.debugLine="Private TransparentBrush As BCBrush";
_transparentbrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=12582926;
 //BA.debugLineNum = 12582926;BA.debugLine="Private iv As B4XView";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12582927;
 //BA.debugLineNum = 12582927;BA.debugLine="Private clr1, clr2 As Int";
_clr1 = 0;
_clr2 = 0;
RDebugUtils.currentLine=12582928;
 //BA.debugLineNum = 12582928;BA.debugLine="Private LoopIndex As Int";
_loopindex = 0;
RDebugUtils.currentLine=12582929;
 //BA.debugLineNum = 12582929;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(pdv.milotin.circularprogressbar __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="circularprogressbar";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
int _clrempty = 0;
anywheresoftware.b4a.objects.ImageViewWrapper _iiv = null;
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),(int) (__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())),(int) (__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())));
RDebugUtils.currentLine=12713987;
 //BA.debugLineNum = 12713987;BA.debugLine="Dim clrEmpty As Int = xui.PaintOrColorToColor(Pro";
_clrempty = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ColorEmpty")));
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="clr1 = xui.PaintOrColorToColor(Props.Get(\"FirstCo";
__ref._clr1 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("FirstColor")));
RDebugUtils.currentLine=12713989;
 //BA.debugLineNum = 12713989;BA.debugLine="clr2 = xui.PaintOrColorToColor(Props.Get(\"SecondC";
__ref._clr2 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SecondColor")));
RDebugUtils.currentLine=12713990;
 //BA.debugLineNum = 12713990;BA.debugLine="stroke = DipToCurrent(Props.Get(\"StrokeWidth\"))";
__ref._stroke /*float*/  = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("StrokeWidth"))))));
RDebugUtils.currentLine=12713991;
 //BA.debugLineNum = 12713991;BA.debugLine="DurationFromZeroTo100 = Props.Get(\"Duration\")";
__ref._durationfromzeroto100 /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Duration"))));
RDebugUtils.currentLine=12713992;
 //BA.debugLineNum = 12713992;BA.debugLine="mLbl = Lbl";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=12713993;
 //BA.debugLineNum = 12713993;BA.debugLine="cx = mBase.Width / 2";
__ref._cx /*float*/  = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2);
RDebugUtils.currentLine=12713994;
 //BA.debugLineNum = 12713994;BA.debugLine="cy = mBase.Height / 2";
__ref._cy /*float*/  = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=12713995;
 //BA.debugLineNum = 12713995;BA.debugLine="radius = cx - 10dip";
__ref._radius /*float*/  = (float) (__ref._cx /*float*/ -__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=12713996;
 //BA.debugLineNum = 12713996;BA.debugLine="mLbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=12713997;
 //BA.debugLineNum = 12713997;BA.debugLine="Dim iiv As ImageView";
_iiv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=12713998;
 //BA.debugLineNum = 12713998;BA.debugLine="iiv.Initialize(\"\")";
_iiv.Initialize(ba,"");
RDebugUtils.currentLine=12713999;
 //BA.debugLineNum = 12713999;BA.debugLine="iv = iiv";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iiv.getObject()));
RDebugUtils.currentLine=12714000;
 //BA.debugLineNum = 12714000;BA.debugLine="mBase.AddView(iv, 0, 0, mBase.Width, mBase.Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=12714001;
 //BA.debugLineNum = 12714001;BA.debugLine="mBase.AddView(mLbl, 0, mBase.Height / 2 - 20dip,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-__c.DipToCurrent((int) (20))),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=12714002;
 //BA.debugLineNum = 12714002;BA.debugLine="ResetBC";
__ref._resetbc /*String*/ (null);
RDebugUtils.currentLine=12714003;
 //BA.debugLineNum = 12714003;BA.debugLine="emptyBrush = bc.CreateBrushFromColor(clrEmpty)";
__ref._emptybrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(_clrempty);
RDebugUtils.currentLine=12714004;
 //BA.debugLineNum = 12714004;BA.debugLine="TransparentBrush = bc.CreateBrushFromColor(xui.Co";
__ref._transparentbrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=12714005;
 //BA.debugLineNum = 12714005;BA.debugLine="DrawValue(currentValue)";
__ref._drawvalue /*String*/ (null,__ref._currentvalue /*float*/ );
RDebugUtils.currentLine=12714006;
 //BA.debugLineNum = 12714006;BA.debugLine="End Sub";
return "";
}
public float  _getvalue(pdv.milotin.circularprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="circularprogressbar";
if (Debug.shouldDelegate(ba, "getvalue", false))
	 {return ((Float) Debug.delegate(ba, "getvalue", null));}
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Public Sub getValue As Float";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="Return currentValue";
if (true) return __ref._currentvalue /*float*/ ;
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="End Sub";
return 0f;
}
public String  _initialize(pdv.milotin.circularprogressbar __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="circularprogressbar";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="End Sub";
return "";
}
}