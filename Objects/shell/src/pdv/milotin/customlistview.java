
package pdv.milotin;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class customlistview {
    public static RemoteObject myClass;
	public customlistview() {
	}
    public static PCBA staticBA = new PCBA(null, customlistview.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _panels = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _dividerheight = RemoteObject.createImmutable(0f);
public static RemoteObject _eventname = RemoteObject.createImmutable("");
public static RemoteObject _callback = RemoteObject.declareNull("Object");
public static RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
public static RemoteObject _defaulttextsize = RemoteObject.createImmutable(0);
public static RemoteObject _defaulttextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _defaulttextbackgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _defaulttextbackground = RemoteObject.declareNull("Object");
public static RemoteObject _presseddrawable = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
public static RemoteObject _lastadditemstime = RemoteObject.createImmutable(0L);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static pdv.milotin.main _main = null;
public static pdv.milotin.homemd _homemd = null;
public static pdv.milotin.sendfundmd _sendfundmd = null;
public static pdv.milotin.usermd _usermd = null;
public static pdv.milotin.historymd _historymd = null;
public static pdv.milotin.fundmd _fundmd = null;
public static pdv.milotin.addprojectmd _addprojectmd = null;
public static pdv.milotin.starter _starter = null;
public static pdv.milotin.addallocatemd _addallocatemd = null;
public static pdv.milotin.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CallBack",_ref.getField(false, "_callback"),"DateUtils",_ref.getField(false, "_dateutils"),"DefaultTextBackground",_ref.getField(false, "_defaulttextbackground"),"DefaultTextBackgroundColor",_ref.getField(false, "_defaulttextbackgroundcolor"),"DefaultTextColor",_ref.getField(false, "_defaulttextcolor"),"DefaultTextSize",_ref.getField(false, "_defaulttextsize"),"dividerHeight",_ref.getField(false, "_dividerheight"),"EventName",_ref.getField(false, "_eventname"),"items",_ref.getField(false, "_items"),"lastAddItemsTime",_ref.getField(false, "_lastadditemstime"),"panels",_ref.getField(false, "_panels"),"PressedDrawable",_ref.getField(false, "_presseddrawable"),"su",_ref.getField(false, "_su"),"sv",_ref.getField(false, "_sv")};
}
}