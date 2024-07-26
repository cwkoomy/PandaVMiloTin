package pdv.milotin;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class customlistview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "pdv.milotin.customlistview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", pdv.milotin.customlistview.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.ScrollViewWrapper _sv = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public anywheresoftware.b4a.objects.collections.List _panels = null;
public float _dividerheight = 0f;
public String _eventname = "";
public Object _callback = null;
public anywheresoftware.b4a.objects.StringUtils _su = null;
public int _defaulttextsize = 0;
public int _defaulttextcolor = 0;
public int _defaulttextbackgroundcolor = 0;
public Object _defaulttextbackground = null;
public anywheresoftware.b4a.objects.drawable.ColorDrawable _presseddrawable = null;
public long _lastadditemstime = 0L;
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
public String  _clear(pdv.milotin.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "clear", false))
	 {return ((String) Debug.delegate(ba, "clear", null));}
int _i = 0;
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="items.Clear";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="panels.Clear";
__ref._panels /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="sv.Panel.Height = 0";
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight((int) (0));
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="For i = sv.Panel.NumberOfViews - 1 To 0 Step -1";
{
final int step4 = -1;
final int limit4 = (int) (0);
_i = (int) (__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getNumberOfViews()-1) ;
for (;_i >= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=9371653;
 //BA.debugLineNum = 9371653;BA.debugLine="sv.Panel.RemoveViewAt(i)";
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().RemoveViewAt(_i);
 }
};
RDebugUtils.currentLine=9371655;
 //BA.debugLineNum = 9371655;BA.debugLine="End Sub";
return "";
}
public String  _add(pdv.milotin.customlistview __ref,anywheresoftware.b4a.objects.PanelWrapper _pnl,int _itemheight,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "add", false))
	 {return ((String) Debug.delegate(ba, "add", new Object[] {_pnl,_itemheight,_value}));}
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Public Sub Add(Pnl As Panel, ItemHeight As Int, Va";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="InsertAt(items.Size, Pnl, ItemHeight, Value)";
__ref._insertat /*String*/ (null,__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize(),_pnl,_itemheight,_value);
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(pdv.milotin.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Return sv";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject()));
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="End Sub";
return null;
}
public String  _insertat(pdv.milotin.customlistview __ref,int _index,anywheresoftware.b4a.objects.PanelWrapper _pnl,int _itemheight,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "insertat", false))
	 {return ((String) Debug.delegate(ba, "insertat", new Object[] {_index,_pnl,_itemheight,_value}));}
anywheresoftware.b4a.objects.drawable.StateListDrawable _sd = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
int _top = 0;
anywheresoftware.b4a.objects.PanelWrapper _previouspanel = null;
anywheresoftware.b4a.objects.PanelWrapper _p2 = null;
int _i = 0;
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Public Sub InsertAt(Index As Int, Pnl As Panel, It";
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="Dim sd As StateListDrawable";
_sd = new anywheresoftware.b4a.objects.drawable.StateListDrawable();
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="sd.Initialize";
_sd.Initialize();
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="sd.AddState(sd.State_Pressed, PressedDrawable)";
_sd.AddState(_sd.State_Pressed,(android.graphics.drawable.Drawable)(__ref._presseddrawable /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .getObject()));
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="sd.AddCatchAllState(Pnl.Background)";
_sd.AddCatchAllState(_pnl.getBackground());
RDebugUtils.currentLine=9830408;
 //BA.debugLineNum = 9830408;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9830409;
 //BA.debugLineNum = 9830409;BA.debugLine="p.Initialize(\"panel\")";
_p.Initialize(ba,"panel");
RDebugUtils.currentLine=9830410;
 //BA.debugLineNum = 9830410;BA.debugLine="p.Background = sd";
_p.setBackground((android.graphics.drawable.Drawable)(_sd.getObject()));
RDebugUtils.currentLine=9830411;
 //BA.debugLineNum = 9830411;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=9830412;
 //BA.debugLineNum = 9830412;BA.debugLine="cd.Initialize(Colors.Transparent, 0)";
_cd.Initialize(__c.Colors.Transparent,(int) (0));
RDebugUtils.currentLine=9830413;
 //BA.debugLineNum = 9830413;BA.debugLine="Pnl.Background = cd";
_pnl.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
RDebugUtils.currentLine=9830414;
 //BA.debugLineNum = 9830414;BA.debugLine="p.AddView(Pnl, 0, 0, sv.Width, ItemHeight)";
_p.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth(),_itemheight);
RDebugUtils.currentLine=9830415;
 //BA.debugLineNum = 9830415;BA.debugLine="p.Tag = Index";
_p.setTag((Object)(_index));
RDebugUtils.currentLine=9830417;
 //BA.debugLineNum = 9830417;BA.debugLine="If Index = items.Size Then";
if (_index==__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=9830418;
 //BA.debugLineNum = 9830418;BA.debugLine="items.Add(Value)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Add(_value);
RDebugUtils.currentLine=9830419;
 //BA.debugLineNum = 9830419;BA.debugLine="panels.Add(p)";
__ref._panels /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_p.getObject()));
RDebugUtils.currentLine=9830420;
 //BA.debugLineNum = 9830420;BA.debugLine="Dim top As Int";
_top = 0;
RDebugUtils.currentLine=9830421;
 //BA.debugLineNum = 9830421;BA.debugLine="If Index = 0 Then top = dividerHeight Else top =";
if (_index==0) { 
_top = (int) (__ref._dividerheight /*float*/ );}
else {
_top = __ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getHeight();};
RDebugUtils.currentLine=9830422;
 //BA.debugLineNum = 9830422;BA.debugLine="sv.Panel.AddView(p, 0, top, sv.Width, ItemHeight";
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().AddView((android.view.View)(_p.getObject()),(int) (0),_top,__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth(),_itemheight);
 }else {
RDebugUtils.currentLine=9830424;
 //BA.debugLineNum = 9830424;BA.debugLine="Dim top As Int";
_top = 0;
RDebugUtils.currentLine=9830425;
 //BA.debugLineNum = 9830425;BA.debugLine="If Index = 0 Then";
if (_index==0) { 
RDebugUtils.currentLine=9830426;
 //BA.debugLineNum = 9830426;BA.debugLine="top = dividerHeight";
_top = (int) (__ref._dividerheight /*float*/ );
 }else {
RDebugUtils.currentLine=9830428;
 //BA.debugLineNum = 9830428;BA.debugLine="Dim previousPanel As Panel";
_previouspanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9830429;
 //BA.debugLineNum = 9830429;BA.debugLine="previousPanel = panels.Get(Index - 1)";
_previouspanel = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._panels /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_index-1))));
RDebugUtils.currentLine=9830430;
 //BA.debugLineNum = 9830430;BA.debugLine="top = previousPanel.top + previousPanel.Height";
_top = (int) (_previouspanel.getTop()+_previouspanel.getHeight()+__ref._dividerheight /*float*/ );
 };
RDebugUtils.currentLine=9830433;
 //BA.debugLineNum = 9830433;BA.debugLine="Dim p2 As Panel";
_p2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9830434;
 //BA.debugLineNum = 9830434;BA.debugLine="For i = Index To panels.Size - 1";
{
final int step29 = 1;
final int limit29 = (int) (__ref._panels /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = _index ;
for (;_i <= limit29 ;_i = _i + step29 ) {
RDebugUtils.currentLine=9830435;
 //BA.debugLineNum = 9830435;BA.debugLine="p2 = panels.Get(i)";
_p2 = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._panels /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=9830436;
 //BA.debugLineNum = 9830436;BA.debugLine="p2.top = p2.top + ItemHeight + dividerHeight";
_p2.setTop((int) (_p2.getTop()+_itemheight+__ref._dividerheight /*float*/ ));
RDebugUtils.currentLine=9830437;
 //BA.debugLineNum = 9830437;BA.debugLine="p2.Tag = i + 1";
_p2.setTag((Object)(_i+1));
 }
};
RDebugUtils.currentLine=9830439;
 //BA.debugLineNum = 9830439;BA.debugLine="items.InsertAt(Index, Value)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_index,_value);
RDebugUtils.currentLine=9830440;
 //BA.debugLineNum = 9830440;BA.debugLine="panels.InsertAt(Index, p)";
__ref._panels /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_index,(Object)(_p.getObject()));
RDebugUtils.currentLine=9830441;
 //BA.debugLineNum = 9830441;BA.debugLine="sv.Panel.AddView(p, 0, top, sv.Width, ItemHeight";
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().AddView((android.view.View)(_p.getObject()),(int) (0),_top,__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth(),_itemheight);
 };
RDebugUtils.currentLine=9830443;
 //BA.debugLineNum = 9830443;BA.debugLine="sv.Panel.Height = sv.Panel.Height + ItemHeight +";
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight((int) (__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getHeight()+_itemheight+__ref._dividerheight /*float*/ ));
RDebugUtils.currentLine=9830444;
 //BA.debugLineNum = 9830444;BA.debugLine="If items.Size = 1 Then sv.Panel.Height = sv.Panel";
if (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight((int) (__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getHeight()+__ref._dividerheight /*float*/ ));};
RDebugUtils.currentLine=9830445;
 //BA.debugLineNum = 9830445;BA.debugLine="End Sub";
return "";
}
public String  _addtextitem(pdv.milotin.customlistview __ref,String _text,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "addtextitem", false))
	 {return ((String) Debug.delegate(ba, "addtextitem", new Object[] {_text,_value}));}
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Public Sub AddTextItem(Text As String, Value As Ob";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="InsertAtTextItem(items.Size, Text, Value)";
__ref._insertattextitem /*String*/ (null,__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize(),_text,_value);
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="End Sub";
return "";
}
public String  _insertattextitem(pdv.milotin.customlistview __ref,int _index,String _text,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "insertattextitem", false))
	 {return ((String) Debug.delegate(ba, "insertattextitem", new Object[] {_index,_text,_value}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
int _minheight = 0;
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Public Sub InsertAtTextItem(Index As Int, Text As";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="pnl.Initialize(\"\")";
_pnl.Initialize(ba,"");
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="lbl.Gravity = Bit.Or(Gravity.CENTER_VERTICAL, Gra";
_lbl.setGravity(__c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.LEFT));
RDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="pnl.AddView(lbl, 5dip, 2dip, sv.Width - 5dip, 20d";
_pnl.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (2)),(int) (__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (5))),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=9764871;
 //BA.debugLineNum = 9764871;BA.debugLine="lbl.Text = Text";
_lbl.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="lbl.TextSize = DefaultTextSize";
_lbl.setTextSize((float) (__ref._defaulttextsize /*int*/ ));
RDebugUtils.currentLine=9764873;
 //BA.debugLineNum = 9764873;BA.debugLine="lbl.TextColor = DefaultTextColor";
_lbl.setTextColor(__ref._defaulttextcolor /*int*/ );
RDebugUtils.currentLine=9764874;
 //BA.debugLineNum = 9764874;BA.debugLine="If DefaultTextBackground <> Null Then";
if (__ref._defaulttextbackground /*Object*/ != null) { 
RDebugUtils.currentLine=9764875;
 //BA.debugLineNum = 9764875;BA.debugLine="pnl.Background = DefaultTextBackground";
_pnl.setBackground((android.graphics.drawable.Drawable)(__ref._defaulttextbackground /*Object*/ ));
 }else {
RDebugUtils.currentLine=9764877;
 //BA.debugLineNum = 9764877;BA.debugLine="pnl.Color = DefaultTextBackgroundColor";
_pnl.setColor(__ref._defaulttextbackgroundcolor /*int*/ );
 };
RDebugUtils.currentLine=9764879;
 //BA.debugLineNum = 9764879;BA.debugLine="Dim minHeight As Int";
_minheight = 0;
RDebugUtils.currentLine=9764880;
 //BA.debugLineNum = 9764880;BA.debugLine="minHeight = su.MeasureMultilineTextHeight(lbl, Te";
_minheight = __ref._su /*anywheresoftware.b4a.objects.StringUtils*/ .MeasureMultilineTextHeight((android.widget.TextView)(_lbl.getObject()),BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=9764881;
 //BA.debugLineNum = 9764881;BA.debugLine="lbl.Height = Max(50dip, minHeight)";
_lbl.setHeight((int) (__c.Max(__c.DipToCurrent((int) (50)),_minheight)));
RDebugUtils.currentLine=9764882;
 //BA.debugLineNum = 9764882;BA.debugLine="InsertAt(Index, pnl, lbl.Height + 2dip, Value)";
__ref._insertat /*String*/ (null,_index,_pnl,(int) (_lbl.getHeight()+__c.DipToCurrent((int) (2))),_value);
RDebugUtils.currentLine=9764883;
 //BA.debugLineNum = 9764883;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(pdv.milotin.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Private sv As ScrollView";
_sv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="Private items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="Private panels As List";
_panels = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="Private dividerHeight As Float";
_dividerheight = 0f;
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="Private EventName As String";
_eventname = "";
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="Private CallBack As Object";
_callback = new Object();
RDebugUtils.currentLine=9043975;
 //BA.debugLineNum = 9043975;BA.debugLine="Private su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=9043976;
 //BA.debugLineNum = 9043976;BA.debugLine="Public DefaultTextSize As Int";
_defaulttextsize = 0;
RDebugUtils.currentLine=9043977;
 //BA.debugLineNum = 9043977;BA.debugLine="Public DefaultTextColor As Int";
_defaulttextcolor = 0;
RDebugUtils.currentLine=9043978;
 //BA.debugLineNum = 9043978;BA.debugLine="Public DefaultTextBackgroundColor As Int";
_defaulttextbackgroundcolor = 0;
RDebugUtils.currentLine=9043979;
 //BA.debugLineNum = 9043979;BA.debugLine="Private DefaultTextBackground As Object";
_defaulttextbackground = new Object();
RDebugUtils.currentLine=9043980;
 //BA.debugLineNum = 9043980;BA.debugLine="Private PressedDrawable As ColorDrawable";
_presseddrawable = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=9043981;
 //BA.debugLineNum = 9043981;BA.debugLine="Private lastAddItemsTime As Long";
_lastadditemstime = 0L;
RDebugUtils.currentLine=9043982;
 //BA.debugLineNum = 9043982;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(pdv.milotin.customlistview __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Public Sub DesignerCreateView(base As Panel, lbl A";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="ReplaceBasePanelWithView(base, sv)";
__ref._replacebasepanelwithview /*String*/ (null,_base,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject())));
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="sv.Color = props.Get(\"DividerColor\")";
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setColor((int)(BA.ObjectToNumber(_props.Get((Object)("DividerColor")))));
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="dividerHeight = DipToCurrent(props.Get(\"DividerHe";
__ref._dividerheight /*float*/  = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("DividerHeight"))))));
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="PressedDrawable.Initialize(props.Get(\"PressedColo";
__ref._presseddrawable /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .Initialize((int)(BA.ObjectToNumber(_props.Get((Object)("PressedColor")))),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="DefaultTextSize = lbl.TextSize";
__ref._defaulttextsize /*int*/  = (int) (_lbl.getTextSize());
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="DefaultTextColor = lbl.TextColor";
__ref._defaulttextcolor /*int*/  = _lbl.getTextColor();
RDebugUtils.currentLine=9240583;
 //BA.debugLineNum = 9240583;BA.debugLine="DefaultTextBackground = base.Background";
__ref._defaulttextbackground /*Object*/  = (Object)(_base.getBackground());
RDebugUtils.currentLine=9240584;
 //BA.debugLineNum = 9240584;BA.debugLine="End Sub";
return "";
}
public String  _replacebasepanelwithview(pdv.milotin.customlistview __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.ConcreteViewWrapper _view) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "replacebasepanelwithview", false))
	 {return ((String) Debug.delegate(ba, "replacebasepanelwithview", new Object[] {_base,_view}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.PanelWrapper _parent = null;
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Private Sub ReplaceBasePanelWithView(base As Panel";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Dim jo As JavaObject = base";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_base.getObject()));
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="Dim parent As Panel = jo.RunMethod(\"getParent\", N";
_parent = new anywheresoftware.b4a.objects.PanelWrapper();
_parent = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_jo.RunMethod("getParent",(Object[])(__c.Null))));
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="parent.AddView(view, base.Left, base.Top, base.Wi";
_parent.AddView((android.view.View)(_view.getObject()),_base.getLeft(),_base.getTop(),_base.getWidth(),_base.getHeight());
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="base.RemoveView";
_base.RemoveView();
RDebugUtils.currentLine=9306117;
 //BA.debugLineNum = 9306117;BA.debugLine="End Sub";
return "";
}
public int  _getitemfromview(pdv.milotin.customlistview __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getitemfromview", false))
	 {return ((Integer) Debug.delegate(ba, "getitemfromview", new Object[] {_v}));}
Object _parent = null;
Object _current = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Public Sub GetItemFromView(v As View) As Int";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Dim parent = v, current As Object";
_parent = (Object)(_v.getObject());
_current = new Object();
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="Do While (parent Is Panel) = False Or sv.Panel <>";
while ((_parent instanceof android.view.ViewGroup)==__c.False || (__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel()).equals((android.view.ViewGroup)(_parent)) == false) {
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="current = parent";
_current = _parent;
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="Dim jo As JavaObject = current";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_current));
RDebugUtils.currentLine=10158085;
 //BA.debugLineNum = 10158085;BA.debugLine="parent = jo.RunMethod(\"getParent\", Null)";
_parent = _jo.RunMethod("getParent",(Object[])(__c.Null));
 }
;
RDebugUtils.currentLine=10158087;
 //BA.debugLineNum = 10158087;BA.debugLine="v = current";
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_current));
RDebugUtils.currentLine=10158088;
 //BA.debugLineNum = 10158088;BA.debugLine="Return v.Tag";
if (true) return (int)(BA.ObjectToNumber(_v.getTag()));
RDebugUtils.currentLine=10158089;
 //BA.debugLineNum = 10158089;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(pdv.milotin.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", new Object[] {_index}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Public Sub GetPanel(Index As Int) As Panel";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="p = panels.Get(Index) 'this is the parent panel";
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._panels /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index)));
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="Return p.GetView(0)";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="End Sub";
return null;
}
public int  _getsize(pdv.milotin.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getsize", false))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Public Sub GetSize As Int";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="Return items.Size";
if (true) return __ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="End Sub";
return 0;
}
public Object  _getvalue(pdv.milotin.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getvalue", false))
	 {return ((Object) Debug.delegate(ba, "getvalue", new Object[] {_index}));}
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="Return items.Get(Index)";
if (true) return __ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index);
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="End Sub";
return null;
}
public String  _initialize(pdv.milotin.customlistview __ref,anywheresoftware.b4a.BA _ba,Object _vcallback,String _veventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vcallback,_veventname}));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Public Sub Initialize (vCallback As Object, vEvent";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="EventName = vEventName";
__ref._eventname /*String*/  = _veventname;
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="CallBack = vCallback";
__ref._callback /*Object*/  = _vcallback;
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="sv.Initialize2(0, \"sv\")";
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .Initialize2(ba,(int) (0),"sv");
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="items.Initialize";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="panels.Initialize";
__ref._panels /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=9109512;
 //BA.debugLineNum = 9109512;BA.debugLine="dividerHeight = 2dip";
__ref._dividerheight /*float*/  = (float) (__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=9109513;
 //BA.debugLineNum = 9109513;BA.debugLine="sv.Color = 0xFFD9D7DE";
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setColor(((int)0xffd9d7de));
RDebugUtils.currentLine=9109514;
 //BA.debugLineNum = 9109514;BA.debugLine="DefaultTextColor = Colors.White";
__ref._defaulttextcolor /*int*/  = __c.Colors.White;
RDebugUtils.currentLine=9109515;
 //BA.debugLineNum = 9109515;BA.debugLine="DefaultTextSize = 16";
__ref._defaulttextsize /*int*/  = (int) (16);
RDebugUtils.currentLine=9109516;
 //BA.debugLineNum = 9109516;BA.debugLine="DefaultTextBackgroundColor = Colors.Black";
__ref._defaulttextbackgroundcolor /*int*/  = __c.Colors.Black;
RDebugUtils.currentLine=9109517;
 //BA.debugLineNum = 9109517;BA.debugLine="DefaultTextBackground = Null";
__ref._defaulttextbackground /*Object*/  = __c.Null;
RDebugUtils.currentLine=9109518;
 //BA.debugLineNum = 9109518;BA.debugLine="PressedDrawable.Initialize(0xFF7EB4FA, 2dip)";
__ref._presseddrawable /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .Initialize(((int)0xff7eb4fa),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=9109519;
 //BA.debugLineNum = 9109519;BA.debugLine="End Sub";
return "";
}
public String  _jumptoitem(pdv.milotin.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "jumptoitem", false))
	 {return ((String) Debug.delegate(ba, "jumptoitem", new Object[] {_index}));}
int _top = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _i = 0;
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Public Sub JumpToItem(Index As Int)";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="Dim top As Int";
_top = 0;
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="For i = 0 To Min(Index - 1, items.Size - 1)";
{
final int step3 = 1;
final int limit3 = (int) (__c.Min(_index-1,__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="p = panels.Get(i)";
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._panels /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=10027013;
 //BA.debugLineNum = 10027013;BA.debugLine="top = top + p.Height + dividerHeight";
_top = (int) (_top+_p.getHeight()+__ref._dividerheight /*float*/ );
 }
};
RDebugUtils.currentLine=10027015;
 //BA.debugLineNum = 10027015;BA.debugLine="sv.ScrollPosition = top";
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setScrollPosition(_top);
RDebugUtils.currentLine=10027017;
 //BA.debugLineNum = 10027017;BA.debugLine="DoEvents";
__c.DoEvents();
RDebugUtils.currentLine=10027018;
 //BA.debugLineNum = 10027018;BA.debugLine="sv.ScrollPosition = top";
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setScrollPosition(_top);
RDebugUtils.currentLine=10027019;
 //BA.debugLineNum = 10027019;BA.debugLine="DoEvents";
__c.DoEvents();
RDebugUtils.currentLine=10027020;
 //BA.debugLineNum = 10027020;BA.debugLine="End Sub";
return "";
}
public String  _panel_click(pdv.milotin.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "panel_click", false))
	 {return ((String) Debug.delegate(ba, "panel_click", null));}
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Private Sub Panel_Click";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="If SubExists(CallBack, EventName & \"_ItemClick\")";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ItemClick")) { 
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="Dim v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="v = Sender";
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__c.Sender(ba)));
RDebugUtils.currentLine=10092548;
 //BA.debugLineNum = 10092548;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemClick\", v.T";
__c.CallSubNew3(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ItemClick",_v.getTag(),__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get((int)(BA.ObjectToNumber(_v.getTag()))));
 };
RDebugUtils.currentLine=10092550;
 //BA.debugLineNum = 10092550;BA.debugLine="End Sub";
return "";
}
public String  _removeat(pdv.milotin.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "removeat", false))
	 {return ((String) Debug.delegate(ba, "removeat", new Object[] {_index}));}
anywheresoftware.b4a.objects.PanelWrapper _removepanel = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _i = 0;
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Public Sub RemoveAt(Index As Int)";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Dim removePanel, p As Panel";
_removepanel = new anywheresoftware.b4a.objects.PanelWrapper();
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="removePanel = panels.Get(Index)";
_removepanel = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._panels /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index)));
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="For i = Index + 1 To items.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (_index+1) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="p = panels.Get(i)";
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._panels /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="p.Tag = i - 1";
_p.setTag((Object)(_i-1));
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="p.Top = p.Top - removePanel.Height - dividerHeig";
_p.setTop((int) (_p.getTop()-_removepanel.getHeight()-__ref._dividerheight /*float*/ ));
 }
};
RDebugUtils.currentLine=9633800;
 //BA.debugLineNum = 9633800;BA.debugLine="sv.Panel.Height = sv.Panel.Height - removePanel.H";
__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight((int) (__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getHeight()-_removepanel.getHeight()-__ref._dividerheight /*float*/ ));
RDebugUtils.currentLine=9633801;
 //BA.debugLineNum = 9633801;BA.debugLine="items.RemoveAt(Index)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=9633802;
 //BA.debugLineNum = 9633802;BA.debugLine="panels.RemoveAt(Index)";
__ref._panels /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=9633803;
 //BA.debugLineNum = 9633803;BA.debugLine="removePanel.RemoveView";
_removepanel.RemoveView();
RDebugUtils.currentLine=9633804;
 //BA.debugLineNum = 9633804;BA.debugLine="End Sub";
return "";
}
public String  _sv_scrollchanged(pdv.milotin.customlistview __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "sv_scrollchanged", false))
	 {return ((String) Debug.delegate(ba, "sv_scrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Private Sub sv_ScrollChanged(Position As Int)";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="If Position + sv.Height >= sv.Panel.Height Then";
if (_position+__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getHeight()>=__ref._sv /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getHeight()) { 
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="If DateTime.Now > lastAddItemsTime + 200 Then";
if (__c.DateTime.getNow()>__ref._lastadditemstime /*long*/ +200) { 
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="lastAddItemsTime = DateTime.Now";
__ref._lastadditemstime /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="CallSub(CallBack, EventName & \"_AddItems\")";
__c.CallSubNew(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_AddItems");
 };
 };
RDebugUtils.currentLine=9961481;
 //BA.debugLineNum = 9961481;BA.debugLine="End Sub";
return "";
}
}