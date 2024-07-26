
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

public class historymd implements IRemote{
	public static historymd mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public historymd() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("historymd"), "pdv.milotin.historymd");
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
		pcBA = new PCBA(this, historymd.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _lblhistorytitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistoryhashid = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imgstatus1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lblhistorydate = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistoryamount = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistorytitle2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistoryhashid2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imgstatus2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lblhistorydate2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistoryamount2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistorytitle3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistoryhashid3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imgstatus3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lblhistorydate3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistoryamount3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistorytitle4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistoryhashid4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imgstatus4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lblhistorydate4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistoryamount4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistorytitle5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistoryhashid5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imgstatus5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lblhistorydate5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistoryamount5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblsaperate = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblsaperate2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblsaperate3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblsaperate4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _clvhistory = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _pnlistview = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static pdv.milotin.main _main = null;
public static pdv.milotin.homemd _homemd = null;
public static pdv.milotin.sendfundmd _sendfundmd = null;
public static pdv.milotin.usermd _usermd = null;
public static pdv.milotin.fundmd _fundmd = null;
public static pdv.milotin.addprojectmd _addprojectmd = null;
public static pdv.milotin.starter _starter = null;
public static pdv.milotin.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",historymd.mostCurrent._activity,"AddProjectMd",Debug.moduleToString(pdv.milotin.addprojectmd.class),"clvHistory",historymd.mostCurrent._clvhistory,"DateUtils",historymd.mostCurrent._dateutils,"FundMd",Debug.moduleToString(pdv.milotin.fundmd.class),"HomeMd",Debug.moduleToString(pdv.milotin.homemd.class),"HttpUtils2Service",Debug.moduleToString(pdv.milotin.httputils2service.class),"imgStatus1",historymd.mostCurrent._imgstatus1,"imgStatus2",historymd.mostCurrent._imgstatus2,"imgStatus3",historymd.mostCurrent._imgstatus3,"imgStatus4",historymd.mostCurrent._imgstatus4,"imgStatus5",historymd.mostCurrent._imgstatus5,"lblHistoryAmount",historymd.mostCurrent._lblhistoryamount,"lblHistoryAmount2",historymd.mostCurrent._lblhistoryamount2,"lblHistoryAmount3",historymd.mostCurrent._lblhistoryamount3,"lblHistoryAmount4",historymd.mostCurrent._lblhistoryamount4,"lblHistoryAmount5",historymd.mostCurrent._lblhistoryamount5,"lblHistoryDate",historymd.mostCurrent._lblhistorydate,"lblHistoryDate2",historymd.mostCurrent._lblhistorydate2,"lblHistoryDate3",historymd.mostCurrent._lblhistorydate3,"lblHistoryDate4",historymd.mostCurrent._lblhistorydate4,"lblHistoryDate5",historymd.mostCurrent._lblhistorydate5,"lblHistoryHashID",historymd.mostCurrent._lblhistoryhashid,"lblHistoryHashID2",historymd.mostCurrent._lblhistoryhashid2,"lblHistoryHashID3",historymd.mostCurrent._lblhistoryhashid3,"lblHistoryHashID4",historymd.mostCurrent._lblhistoryhashid4,"lblHistoryHashID5",historymd.mostCurrent._lblhistoryhashid5,"lblHistorytitle",historymd.mostCurrent._lblhistorytitle,"lblHistorytitle2",historymd.mostCurrent._lblhistorytitle2,"lblHistorytitle3",historymd.mostCurrent._lblhistorytitle3,"lblHistorytitle4",historymd.mostCurrent._lblhistorytitle4,"lblHistorytitle5",historymd.mostCurrent._lblhistorytitle5,"lblSaperate",historymd.mostCurrent._lblsaperate,"lblSaperate2",historymd.mostCurrent._lblsaperate2,"lblSaperate3",historymd.mostCurrent._lblsaperate3,"lblSaperate4",historymd.mostCurrent._lblsaperate4,"Main",Debug.moduleToString(pdv.milotin.main.class),"pnListView",historymd.mostCurrent._pnlistview,"SendFundMd",Debug.moduleToString(pdv.milotin.sendfundmd.class),"Starter",Debug.moduleToString(pdv.milotin.starter.class),"UserMd",Debug.moduleToString(pdv.milotin.usermd.class)};
}
}