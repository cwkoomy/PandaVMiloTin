
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

public class sendfundmd implements IRemote{
	public static sendfundmd mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public sendfundmd() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("sendfundmd"), "pdv.milotin.sendfundmd");
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
		pcBA = new PCBA(this, sendfundmd.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _kvs = RemoteObject.declareNull("b4a.example3.keyvaluestore");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _shared = RemoteObject.createImmutable("");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _lblbottom = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhome = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblfund = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistory = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbluser = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhome2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblfund2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistory2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbluser2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnheader1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbltop = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnframe1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblprojecttittle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _cpbar2 = RemoteObject.declareNull("pdv.milotin.circularprogressbar");
public static RemoteObject _lblprojectfund2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblprojectprogress2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblline1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbldonate = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pndonateamount = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnnext = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lblmethod = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imgfpx = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgmaschain = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgcredit = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgbtc = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _pnblacktransparent = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnconfirmation = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbltittle2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblline2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imgcurrency = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lbldonateamount = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnsend = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _txtdonateamount = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _imgdonate = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgclose = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lbltittle3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnstatus = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _imgclose2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgstatus = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lblline3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblstatus = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnclose = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static pdv.milotin.main _main = null;
public static pdv.milotin.homemd _homemd = null;
public static pdv.milotin.usermd _usermd = null;
public static pdv.milotin.historymd _historymd = null;
public static pdv.milotin.fundmd _fundmd = null;
public static pdv.milotin.addprojectmd _addprojectmd = null;
public static pdv.milotin.starter _starter = null;
public static pdv.milotin.addallocatemd _addallocatemd = null;
public static pdv.milotin.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",sendfundmd.mostCurrent._activity,"AddAllocateMd",Debug.moduleToString(pdv.milotin.addallocatemd.class),"AddProjectMd",Debug.moduleToString(pdv.milotin.addprojectmd.class),"btnClose",sendfundmd.mostCurrent._btnclose,"btnNext",sendfundmd.mostCurrent._btnnext,"btnSend",sendfundmd.mostCurrent._btnsend,"cpBar2",sendfundmd.mostCurrent._cpbar2,"DateUtils",sendfundmd.mostCurrent._dateutils,"FundMd",Debug.moduleToString(pdv.milotin.fundmd.class),"HistoryMd",Debug.moduleToString(pdv.milotin.historymd.class),"HomeMd",Debug.moduleToString(pdv.milotin.homemd.class),"HttpUtils2Service",Debug.moduleToString(pdv.milotin.httputils2service.class),"imgBack",sendfundmd.mostCurrent._imgback,"imgBTC",sendfundmd.mostCurrent._imgbtc,"imgClose",sendfundmd.mostCurrent._imgclose,"imgClose2",sendfundmd.mostCurrent._imgclose2,"imgCredit",sendfundmd.mostCurrent._imgcredit,"imgCurrency",sendfundmd.mostCurrent._imgcurrency,"imgDonate",sendfundmd.mostCurrent._imgdonate,"imgFpx",sendfundmd.mostCurrent._imgfpx,"imgMaschain",sendfundmd.mostCurrent._imgmaschain,"imgStatus",sendfundmd.mostCurrent._imgstatus,"kvs",sendfundmd.mostCurrent._kvs,"lblBottom",sendfundmd.mostCurrent._lblbottom,"lblDonate",sendfundmd.mostCurrent._lbldonate,"lblDonateAmount",sendfundmd.mostCurrent._lbldonateamount,"lblFund",sendfundmd.mostCurrent._lblfund,"lblFund2",sendfundmd.mostCurrent._lblfund2,"lblHistory",sendfundmd.mostCurrent._lblhistory,"lblHistory2",sendfundmd.mostCurrent._lblhistory2,"lblHome",sendfundmd.mostCurrent._lblhome,"lblHome2",sendfundmd.mostCurrent._lblhome2,"lblLine1",sendfundmd.mostCurrent._lblline1,"lblLine2",sendfundmd.mostCurrent._lblline2,"lblLine3",sendfundmd.mostCurrent._lblline3,"lblMethod",sendfundmd.mostCurrent._lblmethod,"lblProjectFund2",sendfundmd.mostCurrent._lblprojectfund2,"lblProjectProgress2",sendfundmd.mostCurrent._lblprojectprogress2,"lblProjectTittle",sendfundmd.mostCurrent._lblprojecttittle,"lblStatus",sendfundmd.mostCurrent._lblstatus,"lblTittle2",sendfundmd.mostCurrent._lbltittle2,"lblTittle3",sendfundmd.mostCurrent._lbltittle3,"lblTop",sendfundmd.mostCurrent._lbltop,"lblUser",sendfundmd.mostCurrent._lbluser,"lblUser2",sendfundmd.mostCurrent._lbluser2,"Main",Debug.moduleToString(pdv.milotin.main.class),"pnBlackTransparent",sendfundmd.mostCurrent._pnblacktransparent,"pnConfirmation",sendfundmd.mostCurrent._pnconfirmation,"pnDonateAmount",sendfundmd.mostCurrent._pndonateamount,"pnFrame1",sendfundmd.mostCurrent._pnframe1,"pnHeader1",sendfundmd.mostCurrent._pnheader1,"pnStatus",sendfundmd.mostCurrent._pnstatus,"rp",sendfundmd.mostCurrent._rp,"shared",sendfundmd.mostCurrent._shared,"SQL1",sendfundmd.mostCurrent._sql1,"Starter",Debug.moduleToString(pdv.milotin.starter.class),"txtDonateAmount",sendfundmd.mostCurrent._txtdonateamount,"UserMd",Debug.moduleToString(pdv.milotin.usermd.class)};
}
}