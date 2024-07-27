
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

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "pdv.milotin.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _timer1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _cursorsetting = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _clientkey = RemoteObject.createImmutable("");
public static RemoteObject _hashedclientsecret = RemoteObject.createImmutable("");
public static RemoteObject _tokencontractaddress = RemoteObject.createImmutable("");
public static RemoteObject _auditcontractaddress = RemoteObject.createImmutable("");
public static RemoteObject _kvs = RemoteObject.declareNull("b4a.example3.keyvaluestore");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _shared = RemoteObject.createImmutable("");
public static RemoteObject _pnmain = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbltop = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnusername = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _imgusername = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _txtusername = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _iconcheck = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnpassword = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _imgpassword = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _txtpassword = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _pnwallet = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _imgwallet = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _txtwalletaddress = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnlogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lblforgotpassword = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnsplash = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblcopyright = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static pdv.milotin.homemd _homemd = null;
public static pdv.milotin.sendfundmd _sendfundmd = null;
public static pdv.milotin.usermd _usermd = null;
public static pdv.milotin.historymd _historymd = null;
public static pdv.milotin.fundmd _fundmd = null;
public static pdv.milotin.addprojectmd _addprojectmd = null;
public static pdv.milotin.starter _starter = null;
public static pdv.milotin.addallocatemd _addallocatemd = null;
public static pdv.milotin.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"AddAllocateMd",Debug.moduleToString(pdv.milotin.addallocatemd.class),"AddProjectMd",Debug.moduleToString(pdv.milotin.addprojectmd.class),"AuditContractAddress",main._auditcontractaddress,"btnLogin",main.mostCurrent._btnlogin,"ClientKey",main._clientkey,"cursor1",main._cursor1,"cursorSetting",main._cursorsetting,"DateUtils",main.mostCurrent._dateutils,"FundMd",Debug.moduleToString(pdv.milotin.fundmd.class),"HashedClientSecret",main._hashedclientsecret,"HistoryMd",Debug.moduleToString(pdv.milotin.historymd.class),"HomeMd",Debug.moduleToString(pdv.milotin.homemd.class),"HttpUtils2Service",Debug.moduleToString(pdv.milotin.httputils2service.class),"iconCheck",main.mostCurrent._iconcheck,"imgPassword",main.mostCurrent._imgpassword,"imgUsername",main.mostCurrent._imgusername,"imgWallet",main.mostCurrent._imgwallet,"kvs",main.mostCurrent._kvs,"lblCopyright",main.mostCurrent._lblcopyright,"lblForgotPassword",main.mostCurrent._lblforgotpassword,"lblTop",main.mostCurrent._lbltop,"pnMain",main.mostCurrent._pnmain,"pnPassword",main.mostCurrent._pnpassword,"pnSplash",main.mostCurrent._pnsplash,"pnUsername",main.mostCurrent._pnusername,"pnWallet",main.mostCurrent._pnwallet,"rp",main.mostCurrent._rp,"SendFundMd",Debug.moduleToString(pdv.milotin.sendfundmd.class),"shared",main.mostCurrent._shared,"SQL1",main._sql1,"Starter",Debug.moduleToString(pdv.milotin.starter.class),"Timer1",main._timer1,"TokenContractAddress",main._tokencontractaddress,"txtPassword",main.mostCurrent._txtpassword,"txtUsername",main.mostCurrent._txtusername,"txtWalletAddress",main.mostCurrent._txtwalletaddress,"UserMd",Debug.moduleToString(pdv.milotin.usermd.class),"xui",main._xui};
}
}