
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

public class addallocatemd implements IRemote{
	public static addallocatemd mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public addallocatemd() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("addallocatemd"), "pdv.milotin.addallocatemd");
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
		pcBA = new PCBA(this, addallocatemd.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _kvs = RemoteObject.declareNull("b4a.example3.keyvaluestore");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _shared = RemoteObject.createImmutable("");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
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
public static RemoteObject _lblallocatecategory = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _cbocategory = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _pncategory = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _imgcategory = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lblallocatefund = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _txtallocatefund = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _pnallocatefund = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _imgallocatefund = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lblallocateamount = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblremark = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnremark = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _txtremark = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _imgremark = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
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
  public Object[] GetGlobals() {
		return new Object[] {"Activity",addallocatemd.mostCurrent._activity,"AddProjectMd",Debug.moduleToString(pdv.milotin.addprojectmd.class),"btnClose",addallocatemd.mostCurrent._btnclose,"btnNext",addallocatemd.mostCurrent._btnnext,"btnSend",addallocatemd.mostCurrent._btnsend,"cboCategory",addallocatemd.mostCurrent._cbocategory,"cpBar2",addallocatemd.mostCurrent._cpbar2,"DateUtils",addallocatemd.mostCurrent._dateutils,"FundMd",Debug.moduleToString(pdv.milotin.fundmd.class),"HistoryMd",Debug.moduleToString(pdv.milotin.historymd.class),"HomeMd",Debug.moduleToString(pdv.milotin.homemd.class),"HttpUtils2Service",Debug.moduleToString(pdv.milotin.httputils2service.class),"imgAllocateFund",addallocatemd.mostCurrent._imgallocatefund,"imgBack",addallocatemd.mostCurrent._imgback,"imgBTC",addallocatemd.mostCurrent._imgbtc,"imgCategory",addallocatemd.mostCurrent._imgcategory,"imgClose",addallocatemd.mostCurrent._imgclose,"imgClose2",addallocatemd.mostCurrent._imgclose2,"imgCredit",addallocatemd.mostCurrent._imgcredit,"imgCurrency",addallocatemd.mostCurrent._imgcurrency,"imgDonate",addallocatemd.mostCurrent._imgdonate,"imgFpx",addallocatemd.mostCurrent._imgfpx,"imgMaschain",addallocatemd.mostCurrent._imgmaschain,"imgRemark",addallocatemd.mostCurrent._imgremark,"imgStatus",addallocatemd.mostCurrent._imgstatus,"kvs",addallocatemd.mostCurrent._kvs,"lblAllocateAmount",addallocatemd.mostCurrent._lblallocateamount,"lblAllocateCategory",addallocatemd.mostCurrent._lblallocatecategory,"lblAllocateFund",addallocatemd.mostCurrent._lblallocatefund,"lblBottom",addallocatemd.mostCurrent._lblbottom,"lblDonate",addallocatemd.mostCurrent._lbldonate,"lblDonateAmount",addallocatemd.mostCurrent._lbldonateamount,"lblFund",addallocatemd.mostCurrent._lblfund,"lblFund2",addallocatemd.mostCurrent._lblfund2,"lblHistory",addallocatemd.mostCurrent._lblhistory,"lblHistory2",addallocatemd.mostCurrent._lblhistory2,"lblHome",addallocatemd.mostCurrent._lblhome,"lblHome2",addallocatemd.mostCurrent._lblhome2,"lblLine1",addallocatemd.mostCurrent._lblline1,"lblLine2",addallocatemd.mostCurrent._lblline2,"lblLine3",addallocatemd.mostCurrent._lblline3,"lblMethod",addallocatemd.mostCurrent._lblmethod,"lblProjectFund2",addallocatemd.mostCurrent._lblprojectfund2,"lblProjectProgress2",addallocatemd.mostCurrent._lblprojectprogress2,"lblProjectTittle",addallocatemd.mostCurrent._lblprojecttittle,"lblRemark",addallocatemd.mostCurrent._lblremark,"lblStatus",addallocatemd.mostCurrent._lblstatus,"lblTittle2",addallocatemd.mostCurrent._lbltittle2,"lblTittle3",addallocatemd.mostCurrent._lbltittle3,"lblTop",addallocatemd.mostCurrent._lbltop,"lblUser",addallocatemd.mostCurrent._lbluser,"lblUser2",addallocatemd.mostCurrent._lbluser2,"Main",Debug.moduleToString(pdv.milotin.main.class),"pnAllocateFund",addallocatemd.mostCurrent._pnallocatefund,"pnBlackTransparent",addallocatemd.mostCurrent._pnblacktransparent,"pnCategory",addallocatemd.mostCurrent._pncategory,"pnConfirmation",addallocatemd.mostCurrent._pnconfirmation,"pnDonateAmount",addallocatemd.mostCurrent._pndonateamount,"pnFrame1",addallocatemd.mostCurrent._pnframe1,"pnHeader1",addallocatemd.mostCurrent._pnheader1,"pnRemark",addallocatemd.mostCurrent._pnremark,"pnStatus",addallocatemd.mostCurrent._pnstatus,"rp",addallocatemd.mostCurrent._rp,"SendFundMd",Debug.moduleToString(pdv.milotin.sendfundmd.class),"shared",addallocatemd.mostCurrent._shared,"SQL1",addallocatemd.mostCurrent._sql1,"Starter",Debug.moduleToString(pdv.milotin.starter.class),"txtAllocateFund",addallocatemd.mostCurrent._txtallocatefund,"txtDonateAmount",addallocatemd.mostCurrent._txtdonateamount,"txtRemark",addallocatemd.mostCurrent._txtremark,"UserMd",Debug.moduleToString(pdv.milotin.usermd.class),"xui",addallocatemd.mostCurrent._xui};
}
}