
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

public class addprojectmd implements IRemote{
	public static addprojectmd mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public addprojectmd() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("addprojectmd"), "pdv.milotin.addprojectmd");
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
		pcBA = new PCBA(this, addprojectmd.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _kvs = RemoteObject.declareNull("b4a.example3.keyvaluestore");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _shared = RemoteObject.createImmutable("");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _pnheader1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblbottom = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhome = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblfund = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistory = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbluser = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhome2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblfund2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblhistory2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbluser2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnframe2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbladdtitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblline4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblprojectname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnprojectname = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblfundamount = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnsetfundamount = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pncontent = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnsetwalletaddress = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblcontent = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblsetwalletaddress = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnprojectsubmit = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _txtprojectname = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtsetfundamount = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtcontent = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtsetwalletaddress = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _imgsetfundamount = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgprojectname = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgcontent = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgsetwalletaddress = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _pnblacktransparent = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnstatus = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnclose = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lblstatus = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imgstatus = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lblline3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbltittle3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imgclose2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static pdv.milotin.main _main = null;
public static pdv.milotin.homemd _homemd = null;
public static pdv.milotin.sendfundmd _sendfundmd = null;
public static pdv.milotin.usermd _usermd = null;
public static pdv.milotin.historymd _historymd = null;
public static pdv.milotin.fundmd _fundmd = null;
public static pdv.milotin.starter _starter = null;
public static pdv.milotin.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",addprojectmd.mostCurrent._activity,"btnClose",addprojectmd.mostCurrent._btnclose,"btnProjectSubmit",addprojectmd.mostCurrent._btnprojectsubmit,"DateUtils",addprojectmd.mostCurrent._dateutils,"FundMd",Debug.moduleToString(pdv.milotin.fundmd.class),"HistoryMd",Debug.moduleToString(pdv.milotin.historymd.class),"HomeMd",Debug.moduleToString(pdv.milotin.homemd.class),"HttpUtils2Service",Debug.moduleToString(pdv.milotin.httputils2service.class),"imgClose2",addprojectmd.mostCurrent._imgclose2,"imgContent",addprojectmd.mostCurrent._imgcontent,"imgProjectName",addprojectmd.mostCurrent._imgprojectname,"imgSetFundAmount",addprojectmd.mostCurrent._imgsetfundamount,"imgSetWalletAddress",addprojectmd.mostCurrent._imgsetwalletaddress,"imgStatus",addprojectmd.mostCurrent._imgstatus,"kvs",addprojectmd.mostCurrent._kvs,"lblAddTitle",addprojectmd.mostCurrent._lbladdtitle,"lblBottom",addprojectmd.mostCurrent._lblbottom,"lblContent",addprojectmd.mostCurrent._lblcontent,"lblFund",addprojectmd.mostCurrent._lblfund,"lblFund2",addprojectmd.mostCurrent._lblfund2,"lblFundAmount",addprojectmd.mostCurrent._lblfundamount,"lblHistory",addprojectmd.mostCurrent._lblhistory,"lblHistory2",addprojectmd.mostCurrent._lblhistory2,"lblHome",addprojectmd.mostCurrent._lblhome,"lblHome2",addprojectmd.mostCurrent._lblhome2,"lblLine3",addprojectmd.mostCurrent._lblline3,"lblLine4",addprojectmd.mostCurrent._lblline4,"lblProjectName",addprojectmd.mostCurrent._lblprojectname,"lblSetWalletAddress",addprojectmd.mostCurrent._lblsetwalletaddress,"lblStatus",addprojectmd.mostCurrent._lblstatus,"lblTittle3",addprojectmd.mostCurrent._lbltittle3,"lblUser",addprojectmd.mostCurrent._lbluser,"lblUser2",addprojectmd.mostCurrent._lbluser2,"Main",Debug.moduleToString(pdv.milotin.main.class),"pnBlackTransparent",addprojectmd.mostCurrent._pnblacktransparent,"pnContent",addprojectmd.mostCurrent._pncontent,"pnFrame2",addprojectmd.mostCurrent._pnframe2,"pnHeader1",addprojectmd.mostCurrent._pnheader1,"pnProjectName",addprojectmd.mostCurrent._pnprojectname,"pnSetFundAmount",addprojectmd.mostCurrent._pnsetfundamount,"pnSetWalletAddress",addprojectmd.mostCurrent._pnsetwalletaddress,"pnStatus",addprojectmd.mostCurrent._pnstatus,"rp",addprojectmd.mostCurrent._rp,"SendFundMd",Debug.moduleToString(pdv.milotin.sendfundmd.class),"shared",addprojectmd.mostCurrent._shared,"SQL1",addprojectmd.mostCurrent._sql1,"Starter",Debug.moduleToString(pdv.milotin.starter.class),"txtContent",addprojectmd.mostCurrent._txtcontent,"txtProjectName",addprojectmd.mostCurrent._txtprojectname,"txtSetFundAmount",addprojectmd.mostCurrent._txtsetfundamount,"txtSetWalletAddress",addprojectmd.mostCurrent._txtsetwalletaddress,"UserMd",Debug.moduleToString(pdv.milotin.usermd.class)};
}
}