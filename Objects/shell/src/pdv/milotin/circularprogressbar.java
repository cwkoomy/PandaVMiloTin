
package pdv.milotin;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class circularprogressbar {
    public static RemoteObject myClass;
	public circularprogressbar() {
	}
    public static PCBA staticBA = new PCBA(null, circularprogressbar.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _cx = RemoteObject.createImmutable(0f);
public static RemoteObject _cy = RemoteObject.createImmutable(0f);
public static RemoteObject _radius = RemoteObject.createImmutable(0f);
public static RemoteObject _stroke = RemoteObject.createImmutable(0f);
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _currentvalue = RemoteObject.createImmutable(0f);
public static RemoteObject _durationfromzeroto100 = RemoteObject.createImmutable(0);
public static RemoteObject _bc = RemoteObject.declareNull("b4a.example.bitmapcreator");
public static RemoteObject _emptybrush = RemoteObject.declareNull("b4a.example.bcpath._bcbrush");
public static RemoteObject _fullbrush = RemoteObject.declareNull("b4a.example.bcpath._bcbrush");
public static RemoteObject _transparentbrush = RemoteObject.declareNull("b4a.example.bcpath._bcbrush");
public static RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _clr1 = RemoteObject.createImmutable(0);
public static RemoteObject _clr2 = RemoteObject.createImmutable(0);
public static RemoteObject _loopindex = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static pdv.milotin.main _main = null;
public static pdv.milotin.homemd _homemd = null;
public static pdv.milotin.sendfundmd _sendfundmd = null;
public static pdv.milotin.usermd _usermd = null;
public static pdv.milotin.historymd _historymd = null;
public static pdv.milotin.fundmd _fundmd = null;
public static pdv.milotin.addprojectmd _addprojectmd = null;
public static pdv.milotin.starter _starter = null;
public static pdv.milotin.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"bc",_ref.getField(false, "_bc"),"clr1",_ref.getField(false, "_clr1"),"clr2",_ref.getField(false, "_clr2"),"currentValue",_ref.getField(false, "_currentvalue"),"cx",_ref.getField(false, "_cx"),"cy",_ref.getField(false, "_cy"),"DateUtils",_ref.getField(false, "_dateutils"),"DurationFromZeroTo100",_ref.getField(false, "_durationfromzeroto100"),"emptyBrush",_ref.getField(false, "_emptybrush"),"fullBrush",_ref.getField(false, "_fullbrush"),"iv",_ref.getField(false, "_iv"),"LoopIndex",_ref.getField(false, "_loopindex"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"mLbl",_ref.getField(false, "_mlbl"),"radius",_ref.getField(false, "_radius"),"stroke",_ref.getField(false, "_stroke"),"TransparentBrush",_ref.getField(false, "_transparentbrush"),"xui",_ref.getField(false, "_xui")};
}
}