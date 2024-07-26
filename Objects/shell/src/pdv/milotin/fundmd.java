
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

public class fundmd implements IRemote{
	public static fundmd mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public fundmd() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("fundmd"), "pdv.milotin.fundmd");
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
		pcBA = new PCBA(this, fundmd.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _kvs = RemoteObject.declareNull("b4a.example3.keyvaluestore");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _shared = RemoteObject.createImmutable("");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _clvfundlist = RemoteObject.declareNull("pdv.milotin.customlistview");
public static RemoteObject _lblbottom = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhome = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblfund = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistory = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbluser = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhome2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblfund2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistory2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbluser2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnlistview3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnheader1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnframe2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblusertitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblline6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbltop = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imgback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lblprojecttitle2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblprojectfund2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblprojecttitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblprojectfund = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblprojectprogress = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _cpbar1 = RemoteObject.declareNull("pdv.milotin.circularprogressbar");
public static RemoteObject _lblprojectprogress2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imgproject = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgfunding = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgprogress = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static pdv.milotin.main _main = null;
public static pdv.milotin.homemd _homemd = null;
public static pdv.milotin.sendfundmd _sendfundmd = null;
public static pdv.milotin.usermd _usermd = null;
public static pdv.milotin.historymd _historymd = null;
public static pdv.milotin.addprojectmd _addprojectmd = null;
public static pdv.milotin.starter _starter = null;
public static pdv.milotin.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",fundmd.mostCurrent._activity,"AddProjectMd",Debug.moduleToString(pdv.milotin.addprojectmd.class),"clvFundList",fundmd.mostCurrent._clvfundlist,"cpBar1",fundmd.mostCurrent._cpbar1,"DateUtils",fundmd.mostCurrent._dateutils,"HistoryMd",Debug.moduleToString(pdv.milotin.historymd.class),"HomeMd",Debug.moduleToString(pdv.milotin.homemd.class),"HttpUtils2Service",Debug.moduleToString(pdv.milotin.httputils2service.class),"imgBack",fundmd.mostCurrent._imgback,"imgFunding",fundmd.mostCurrent._imgfunding,"imgProgress",fundmd.mostCurrent._imgprogress,"imgProject",fundmd.mostCurrent._imgproject,"kvs",fundmd.mostCurrent._kvs,"lblBottom",fundmd.mostCurrent._lblbottom,"lblFund",fundmd.mostCurrent._lblfund,"lblFund2",fundmd.mostCurrent._lblfund2,"lblHistory",fundmd.mostCurrent._lblhistory,"lblHistory2",fundmd.mostCurrent._lblhistory2,"lblHome",fundmd.mostCurrent._lblhome,"lblHome2",fundmd.mostCurrent._lblhome2,"lblLine6",fundmd.mostCurrent._lblline6,"lblProjectFund",fundmd.mostCurrent._lblprojectfund,"lblProjectFund2",fundmd.mostCurrent._lblprojectfund2,"lblProjectProgress",fundmd.mostCurrent._lblprojectprogress,"lblProjectProgress2",fundmd.mostCurrent._lblprojectprogress2,"lblProjectTitle",fundmd.mostCurrent._lblprojecttitle,"lblProjectTitle2",fundmd.mostCurrent._lblprojecttitle2,"lblTop",fundmd.mostCurrent._lbltop,"lblUser",fundmd.mostCurrent._lbluser,"lblUser2",fundmd.mostCurrent._lbluser2,"lblUserTitle",fundmd.mostCurrent._lblusertitle,"Main",Debug.moduleToString(pdv.milotin.main.class),"pnFrame2",fundmd.mostCurrent._pnframe2,"pnHeader1",fundmd.mostCurrent._pnheader1,"pnListView3",fundmd.mostCurrent._pnlistview3,"rp",fundmd.mostCurrent._rp,"SendFundMd",Debug.moduleToString(pdv.milotin.sendfundmd.class),"shared",fundmd.mostCurrent._shared,"SQL1",fundmd.mostCurrent._sql1,"Starter",Debug.moduleToString(pdv.milotin.starter.class),"UserMd",Debug.moduleToString(pdv.milotin.usermd.class)};
}
}