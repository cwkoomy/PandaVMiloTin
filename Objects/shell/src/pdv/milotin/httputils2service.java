
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

public class httputils2service implements IRemote{
	public static httputils2service mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public httputils2service() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("httputils2service"), "pdv.milotin.httputils2service");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _receiver;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _receiver = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("pdv.milotin.httputils2service");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, httputils2service.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _hc = RemoteObject.declareNull("anywheresoftware.b4h.okhttp.OkHttpClientWrapper");
public static RemoteObject _taskidtojob = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _tempfolder = RemoteObject.createImmutable("");
public static RemoteObject _taskcounter = RemoteObject.createImmutable(0);
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
  public Object[] GetGlobals() {
		return new Object[] {"AddAllocateMd",Debug.moduleToString(pdv.milotin.addallocatemd.class),"AddProjectMd",Debug.moduleToString(pdv.milotin.addprojectmd.class),"DateUtils",httputils2service.mostCurrent._dateutils,"FundMd",Debug.moduleToString(pdv.milotin.fundmd.class),"hc",httputils2service._hc,"HistoryMd",Debug.moduleToString(pdv.milotin.historymd.class),"HomeMd",Debug.moduleToString(pdv.milotin.homemd.class),"Main",Debug.moduleToString(pdv.milotin.main.class),"Receiver",httputils2service.mostCurrent._receiver,"SendFundMd",Debug.moduleToString(pdv.milotin.sendfundmd.class),"Starter",Debug.moduleToString(pdv.milotin.starter.class),"taskCounter",httputils2service._taskcounter,"TaskIdToJob",httputils2service._taskidtojob,"TempFolder",httputils2service._tempfolder,"UserMd",Debug.moduleToString(pdv.milotin.usermd.class)};
}
}