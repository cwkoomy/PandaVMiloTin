
package pdv.milotin;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class starter implements IRemote{
	public static starter mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public starter() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("starter"), "pdv.milotin.starter");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("pdv.milotin.starter");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, starter.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) mostCurrent.pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static pdv.milotin.main _main = null;
public static pdv.milotin.homemd _homemd = null;
public static pdv.milotin.sendfundmd _sendfundmd = null;
public static pdv.milotin.usermd _usermd = null;
public static pdv.milotin.historymd _historymd = null;
public static pdv.milotin.fundmd _fundmd = null;
public static pdv.milotin.addprojectmd _addprojectmd = null;
public static pdv.milotin.addallocatemd _addallocatemd = null;
public static pdv.milotin.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"AddAllocateMd",Debug.moduleToString(pdv.milotin.addallocatemd.class),"AddProjectMd",Debug.moduleToString(pdv.milotin.addprojectmd.class),"DateUtils",starter.mostCurrent._dateutils,"FundMd",Debug.moduleToString(pdv.milotin.fundmd.class),"HistoryMd",Debug.moduleToString(pdv.milotin.historymd.class),"HomeMd",Debug.moduleToString(pdv.milotin.homemd.class),"HttpUtils2Service",Debug.moduleToString(pdv.milotin.httputils2service.class),"Main",Debug.moduleToString(pdv.milotin.main.class),"SendFundMd",Debug.moduleToString(pdv.milotin.sendfundmd.class),"Service",starter.mostCurrent._service,"UserMd",Debug.moduleToString(pdv.milotin.usermd.class)};
}
}