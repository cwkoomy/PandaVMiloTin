
package pdv.milotin;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class qrcode {
    public static RemoteObject myClass;
	public qrcode() {
	}
    public static PCBA staticBA = new PCBA(null, qrcode.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _nativeme = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
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
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"nativeMe",_ref.getField(false, "_nativeme")};
}
}