
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

public class homemd implements IRemote{
	public static homemd mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public homemd() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("homemd"), "pdv.milotin.homemd");
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
		pcBA = new PCBA(this, homemd.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _kvs = RemoteObject.declareNull("b4a.example3.keyvaluestore");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _shared = RemoteObject.createImmutable("");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _lblheaderbg = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbltop = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblbottom = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblfund = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistory = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbluser = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblheader1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblheader2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblamount = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbltotal = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblprojecttitle2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblprojectfund2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblprojecttitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblprojectfund = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblprojectprogress = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _clvhome = RemoteObject.declareNull("pdv.milotin.customlistview");
public static RemoteObject _pnheader1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblhome = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblline1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhome2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblfund2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistory2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbluser2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _cpbar1 = RemoteObject.declareNull("pdv.milotin.circularprogressbar");
public static RemoteObject _lblprojectprogress2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblwalletname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imgmenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgproject = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgfunding = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgprogress = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _pnlistview = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnadd = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static pdv.milotin.main _main = null;
public static pdv.milotin.sendfundmd _sendfundmd = null;
public static pdv.milotin.usermd _usermd = null;
public static pdv.milotin.historymd _historymd = null;
public static pdv.milotin.fundmd _fundmd = null;
public static pdv.milotin.addprojectmd _addprojectmd = null;
public static pdv.milotin.starter _starter = null;
public static pdv.milotin.addallocatemd _addallocatemd = null;
public static pdv.milotin.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",homemd.mostCurrent._activity,"AddAllocateMd",Debug.moduleToString(pdv.milotin.addallocatemd.class),"AddProjectMd",Debug.moduleToString(pdv.milotin.addprojectmd.class),"btnAdd",homemd.mostCurrent._btnadd,"clvHome",homemd.mostCurrent._clvhome,"cpBar1",homemd.mostCurrent._cpbar1,"DateUtils",homemd.mostCurrent._dateutils,"FundMd",Debug.moduleToString(pdv.milotin.fundmd.class),"HistoryMd",Debug.moduleToString(pdv.milotin.historymd.class),"HttpUtils2Service",Debug.moduleToString(pdv.milotin.httputils2service.class),"imgFunding",homemd.mostCurrent._imgfunding,"imgMenu",homemd.mostCurrent._imgmenu,"imgProgress",homemd.mostCurrent._imgprogress,"imgProject",homemd.mostCurrent._imgproject,"kvs",homemd.mostCurrent._kvs,"lblAmount",homemd.mostCurrent._lblamount,"lblBottom",homemd.mostCurrent._lblbottom,"lblFund",homemd.mostCurrent._lblfund,"lblFund2",homemd.mostCurrent._lblfund2,"lblHeader1",homemd.mostCurrent._lblheader1,"lblHeader2",homemd.mostCurrent._lblheader2,"lblHeaderBg",homemd.mostCurrent._lblheaderbg,"lblHistory",homemd.mostCurrent._lblhistory,"lblHistory2",homemd.mostCurrent._lblhistory2,"lblHome",homemd.mostCurrent._lblhome,"lblHome2",homemd.mostCurrent._lblhome2,"lblLine1",homemd.mostCurrent._lblline1,"lblProjectFund",homemd.mostCurrent._lblprojectfund,"lblProjectFund2",homemd.mostCurrent._lblprojectfund2,"lblProjectProgress",homemd.mostCurrent._lblprojectprogress,"lblProjectProgress2",homemd.mostCurrent._lblprojectprogress2,"lblProjectTitle",homemd.mostCurrent._lblprojecttitle,"lblProjectTitle2",homemd.mostCurrent._lblprojecttitle2,"lblTop",homemd.mostCurrent._lbltop,"lblTotal",homemd.mostCurrent._lbltotal,"lblUser",homemd.mostCurrent._lbluser,"lblUser2",homemd.mostCurrent._lbluser2,"lblWalletName",homemd.mostCurrent._lblwalletname,"Main",Debug.moduleToString(pdv.milotin.main.class),"pnHeader1",homemd.mostCurrent._pnheader1,"pnListView",homemd.mostCurrent._pnlistview,"rp",homemd.mostCurrent._rp,"SendFundMd",Debug.moduleToString(pdv.milotin.sendfundmd.class),"shared",homemd.mostCurrent._shared,"SQL1",homemd.mostCurrent._sql1,"Starter",Debug.moduleToString(pdv.milotin.starter.class),"UserMd",Debug.moduleToString(pdv.milotin.usermd.class)};
}
}