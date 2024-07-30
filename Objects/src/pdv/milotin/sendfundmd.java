package pdv.milotin;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class sendfundmd extends Activity implements B4AActivity{
	public static sendfundmd mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "pdv.milotin", "pdv.milotin.sendfundmd");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (sendfundmd).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "pdv.milotin", "pdv.milotin.sendfundmd");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "pdv.milotin.sendfundmd", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (sendfundmd) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (sendfundmd) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return sendfundmd.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (sendfundmd) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (sendfundmd) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            sendfundmd mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (sendfundmd) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example3.keyvaluestore _kvs = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static String _shared = "";
public anywheresoftware.b4a.sql.SQL _sql1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblbottom = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhome = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfund = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhistory = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbluser = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhome2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfund2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhistory2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbluser2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnheader1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltop = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnframe1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprojecttittle = null;
public pdv.milotin.circularprogressbar _cpbar2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprojectfund2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprojectprogress2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblline1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldonate = null;
public anywheresoftware.b4a.objects.PanelWrapper _pndonateamount = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnnext = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmethod = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgfpx = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgmaschain = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgcredit = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgbtc = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgback = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnblacktransparent = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnconfirmation = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltittle2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblline2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgcurrency = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldonateamount = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsend = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtdonateamount = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgdonate = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgclose = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltittle3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnstatus = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgclose2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgstatus = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblline3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblstatus = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnclose = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltransactionhash = null;
public b4a.example.dateutils _dateutils = null;
public pdv.milotin.main _main = null;
public pdv.milotin.homemd _homemd = null;
public pdv.milotin.usermd _usermd = null;
public pdv.milotin.historymd _historymd = null;
public pdv.milotin.fundmd _fundmd = null;
public pdv.milotin.addprojectmd _addprojectmd = null;
public pdv.milotin.addallocatemd _addallocatemd = null;
public pdv.milotin.viewallocatemd _viewallocatemd = null;
public pdv.milotin.kyc1md _kyc1md = null;
public pdv.milotin.certmd _certmd = null;
public pdv.milotin.starter _starter = null;
public pdv.milotin.httputils2service _httputils2service = null;

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 67;BA.debugLine="Activity.LoadLayout(\"SendFundLy\")";
mostCurrent._activity.LoadLayout("SendFundLy",mostCurrent.activityBA);
 //BA.debugLineNum = 69;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
mostCurrent._shared = mostCurrent._rp.GetSafeDirDefaultExternal("");
 //BA.debugLineNum = 70;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
mostCurrent._kvs._initialize(processBA,mostCurrent._shared,"Userdatastore");
 //BA.debugLineNum = 72;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 73;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"db.db",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db");
 };
 //BA.debugLineNum = 76;BA.debugLine="If SQL1.IsInitialized = False Then";
if (mostCurrent._sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 77;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
mostCurrent._sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db",anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 80;BA.debugLine="Log(kvs.Get(\"AuditID\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("12162703",BA.ObjectToString(mostCurrent._kvs._get("AuditID")),0);
 //BA.debugLineNum = 81;BA.debugLine="GetAuditByID";
_getauditbyid();
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
 //BA.debugLineNum = 287;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
 //BA.debugLineNum = 288;BA.debugLine="kvs.Put(\"ProjectWallet\",\"\")";
mostCurrent._kvs._put("ProjectWallet",(Object)(""));
 //BA.debugLineNum = 289;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 290;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
public static String  _btncheck_click() throws Exception{
String _url = "";
anywheresoftware.b4a.phone.Phone.PhoneIntents _p = null;
 //BA.debugLineNum = 358;BA.debugLine="Private Sub btnCheck_Click";
 //BA.debugLineNum = 359;BA.debugLine="Dim url As String = \"https://explorer-testnet.mas";
_url = "https://explorer-testnet.maschain.com/"+BA.ObjectToString(mostCurrent._kvs._get("CURRTransactionHash"));
 //BA.debugLineNum = 360;BA.debugLine="Dim p As PhoneIntents";
_p = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
 //BA.debugLineNum = 361;BA.debugLine="StartActivity(p.OpenBrowser(url))";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_p.OpenBrowser(_url)));
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return "";
}
public static String  _btnclose_click() throws Exception{
 //BA.debugLineNum = 324;BA.debugLine="Private Sub btnClose_Click";
 //BA.debugLineNum = 326;BA.debugLine="If kvs.Get(\"Status\") = \"success\" Then";
if ((mostCurrent._kvs._get("Status")).equals((Object)("success"))) { 
 //BA.debugLineNum = 327;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
 //BA.debugLineNum = 329;BA.debugLine="pnStatus.Visible = False";
mostCurrent._pnstatus.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 330;BA.debugLine="pnConfirmation.Visible = False";
mostCurrent._pnconfirmation.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 331;BA.debugLine="btnNext.Visible = True";
mostCurrent._btnnext.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return "";
}
public static String  _btnnext_click() throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Private Sub btnNext_Click";
 //BA.debugLineNum = 297;BA.debugLine="pnBlackTransparent.Visible = True";
mostCurrent._pnblacktransparent.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 298;BA.debugLine="pnConfirmation.Visible = True";
mostCurrent._pnconfirmation.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 299;BA.debugLine="btnNext.Visible = False";
mostCurrent._btnnext.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 300;BA.debugLine="lblDonateAmount.Text = txtDonateAmount.Text";
mostCurrent._lbldonateamount.setText(BA.ObjectToCharSequence(mostCurrent._txtdonateamount.getText()));
 //BA.debugLineNum = 302;BA.debugLine="kvs.Put(\"DonateAmount\",lblDonateAmount.Text)";
mostCurrent._kvs._put("DonateAmount",(Object)(mostCurrent._lbldonateamount.getText()));
 //BA.debugLineNum = 303;BA.debugLine="Log(kvs.Get(\"DonateAmount\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("13014663",BA.ObjectToString(mostCurrent._kvs._get("DonateAmount")),0);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return "";
}
public static String  _btnsend_click() throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Private Sub btnSend_Click";
 //BA.debugLineNum = 309;BA.debugLine="PostTransaction";
_posttransaction();
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return "";
}
public static String  _calculatepercentage(double _part,double _total) throws Exception{
double _percentage = 0;
 //BA.debugLineNum = 335;BA.debugLine="Sub CalculatePercentage(part As Double, total As D";
 //BA.debugLineNum = 336;BA.debugLine="Dim percentage As Double";
_percentage = 0;
 //BA.debugLineNum = 337;BA.debugLine="percentage = (part / total) * 100";
_percentage = (_part/(double)_total)*100;
 //BA.debugLineNum = 338;BA.debugLine="If percentage > 100 Then";
if (_percentage>100) { 
 //BA.debugLineNum = 339;BA.debugLine="cpBar2.Value = \"100\"";
mostCurrent._cpbar2._setvalue /*float*/ ((float)(Double.parseDouble("100")));
 //BA.debugLineNum = 340;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(5,206";
mostCurrent._lblprojectprogress2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (5),(int) (206),(int) (46)));
 //BA.debugLineNum = 341;BA.debugLine="lblProjectProgress2.Text = \"Fundraising complete";
mostCurrent._lblprojectprogress2.setText(BA.ObjectToCharSequence("Fundraising complete"));
 //BA.debugLineNum = 342;BA.debugLine="txtDonateAmount.Enabled = False";
mostCurrent._txtdonateamount.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 343;BA.debugLine="txtDonateAmount.Text = \"-\"";
mostCurrent._txtdonateamount.setText(BA.ObjectToCharSequence("-"));
 }else {
 //BA.debugLineNum = 345;BA.debugLine="cpBar2.Value = NumberFormat(percentage, 1, 3)";
mostCurrent._cpbar2._setvalue /*float*/ ((float)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.NumberFormat(_percentage,(int) (1),(int) (3)))));
 //BA.debugLineNum = 346;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(254,17";
mostCurrent._lblprojectprogress2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (254),(int) (171),(int) (43)));
 //BA.debugLineNum = 347;BA.debugLine="lblProjectProgress2.Text = \"Fundraising in progre";
mostCurrent._lblprojectprogress2.setText(BA.ObjectToCharSequence("Fundraising in progress"));
 };
 //BA.debugLineNum = 350;BA.debugLine="Log(NumberFormat(percentage, 1, 3))";
anywheresoftware.b4a.keywords.Common.LogImpl("13342351",anywheresoftware.b4a.keywords.Common.NumberFormat(_percentage,(int) (1),(int) (3)),0);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return "";
}
public static String  _checkwalletbalance() throws Exception{
pdv.milotin.httpjob _jobcheckwalletbalance = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
anywheresoftware.b4a.objects.collections.Map _data = null;
String _url = "";
 //BA.debugLineNum = 99;BA.debugLine="Sub CheckWalletBalance";
 //BA.debugLineNum = 101;BA.debugLine="Dim JobCheckWalletBalance As HttpJob";
_jobcheckwalletbalance = new pdv.milotin.httpjob();
 //BA.debugLineNum = 102;BA.debugLine="JobCheckWalletBalance.Initialize(\"JobCheckWalletB";
_jobcheckwalletbalance._initialize /*String*/ (processBA,"JobCheckWalletBalance",sendfundmd.getObject());
 //BA.debugLineNum = 105;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 106;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 107;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 108;BA.debugLine="data.Put(\"wallet_address\", kvs.Get(\"ProjectWallet";
_data.Put((Object)("wallet_address"),mostCurrent._kvs._get("ProjectWallet"));
 //BA.debugLineNum = 109;BA.debugLine="data.Put(\"contract_address\", kvs.Get(\"token-contr";
_data.Put((Object)("contract_address"),mostCurrent._kvs._get("token-contract"));
 //BA.debugLineNum = 110;BA.debugLine="json.Initialize(data)";
_json.Initialize(_data);
 //BA.debugLineNum = 113;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
_url = "https://service-testnet.maschain.com/api/token/balance/";
 //BA.debugLineNum = 114;BA.debugLine="JobCheckWalletBalance.PostString(url, json.ToStri";
_jobcheckwalletbalance._poststring /*String*/ (_url,_json.ToString());
 //BA.debugLineNum = 115;BA.debugLine="JobCheckWalletBalance.GetRequest.SetContentType(\"";
_jobcheckwalletbalance._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 116;BA.debugLine="JobCheckWalletBalance.GetRequest.SetHeader(\"clien";
_jobcheckwalletbalance._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("client_id",BA.ObjectToString(mostCurrent._kvs._get("client_id")));
 //BA.debugLineNum = 117;BA.debugLine="JobCheckWalletBalance.GetRequest.SetHeader(\"clien";
_jobcheckwalletbalance._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("client_secret",BA.ObjectToString(mostCurrent._kvs._get("client_secret")));
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public static String  _getauditbyid() throws Exception{
pdv.milotin.httpjob _jobgetauditbyid = null;
String _url = "";
 //BA.debugLineNum = 85;BA.debugLine="Sub GetAuditByID";
 //BA.debugLineNum = 87;BA.debugLine="Dim JobGetAuditByID As HttpJob";
_jobgetauditbyid = new pdv.milotin.httpjob();
 //BA.debugLineNum = 88;BA.debugLine="JobGetAuditByID.Initialize(\"JobGetAuditByID\", Me)";
_jobgetauditbyid._initialize /*String*/ (processBA,"JobGetAuditByID",sendfundmd.getObject());
 //BA.debugLineNum = 90;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
_url = "https://service-testnet.maschain.com/api/audit/audit/"+BA.ObjectToString(mostCurrent._kvs._get("AuditTransactionHash"));
 //BA.debugLineNum = 91;BA.debugLine="Log(\"HASH:\" & kvs.Get(\"AuditTransactionHash\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("12228230","HASH:"+BA.ObjectToString(mostCurrent._kvs._get("AuditTransactionHash")),0);
 //BA.debugLineNum = 92;BA.debugLine="JobGetAuditByID.Download(url)";
_jobgetauditbyid._download /*String*/ (_url);
 //BA.debugLineNum = 93;BA.debugLine="JobGetAuditByID.GetRequest.SetHeader(\"client_id\",";
_jobgetauditbyid._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("client_id",BA.ObjectToString(mostCurrent._kvs._get("client_id")));
 //BA.debugLineNum = 94;BA.debugLine="JobGetAuditByID.GetRequest.SetHeader(\"client_secr";
_jobgetauditbyid._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("client_secret",BA.ObjectToString(mostCurrent._kvs._get("client_secret")));
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private kvs As KeyValueStore";
mostCurrent._kvs = new b4a.example3.keyvaluestore();
 //BA.debugLineNum = 16;BA.debugLine="Private rp As RuntimePermissions";
mostCurrent._rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 17;BA.debugLine="Private shared As String";
mostCurrent._shared = "";
 //BA.debugLineNum = 18;BA.debugLine="Private SQL1 As SQL";
mostCurrent._sql1 = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 19;BA.debugLine="Private lblBottom As Label";
mostCurrent._lblbottom = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private lblHome As Label";
mostCurrent._lblhome = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private lblFund As Label";
mostCurrent._lblfund = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private lblHistory As Label";
mostCurrent._lblhistory = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private lblUser As Label";
mostCurrent._lbluser = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private lblHome2 As Label";
mostCurrent._lblhome2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private lblFund2 As Label";
mostCurrent._lblfund2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private lblHistory2 As Label";
mostCurrent._lblhistory2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private lblUser2 As Label";
mostCurrent._lbluser2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private pnHeader1 As Panel";
mostCurrent._pnheader1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private lblTop As Label";
mostCurrent._lbltop = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private pnFrame1 As Panel";
mostCurrent._pnframe1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private lblProjectTittle As Label";
mostCurrent._lblprojecttittle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private cpBar2 As CircularProgressBar";
mostCurrent._cpbar2 = new pdv.milotin.circularprogressbar();
 //BA.debugLineNum = 33;BA.debugLine="Private lblProjectFund2 As Label";
mostCurrent._lblprojectfund2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private lblProjectProgress2 As Label";
mostCurrent._lblprojectprogress2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private lblLine1 As Label";
mostCurrent._lblline1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private lblDonate As Label";
mostCurrent._lbldonate = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private pnDonateAmount As Panel";
mostCurrent._pndonateamount = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private btnNext As Button";
mostCurrent._btnnext = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private lblMethod As Label";
mostCurrent._lblmethod = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private imgFpx As ImageView";
mostCurrent._imgfpx = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private imgMaschain As ImageView";
mostCurrent._imgmaschain = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private imgCredit As ImageView";
mostCurrent._imgcredit = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private imgBTC As ImageView";
mostCurrent._imgbtc = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private imgBack As ImageView";
mostCurrent._imgback = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private pnBlackTransparent As Panel";
mostCurrent._pnblacktransparent = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private pnConfirmation As Panel";
mostCurrent._pnconfirmation = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private lblTittle2 As Label";
mostCurrent._lbltittle2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private lblLine2 As Label";
mostCurrent._lblline2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private imgCurrency As ImageView";
mostCurrent._imgcurrency = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 50;BA.debugLine="Private lblDonateAmount As Label";
mostCurrent._lbldonateamount = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Private btnSend As Button";
mostCurrent._btnsend = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private txtDonateAmount As EditText";
mostCurrent._txtdonateamount = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private imgDonate As ImageView";
mostCurrent._imgdonate = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 54;BA.debugLine="Private imgClose As ImageView";
mostCurrent._imgclose = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Private lblTittle3 As Label";
mostCurrent._lbltittle3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 56;BA.debugLine="Private pnStatus As Panel";
mostCurrent._pnstatus = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 57;BA.debugLine="Private imgClose2 As ImageView";
mostCurrent._imgclose2 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 58;BA.debugLine="Private imgStatus As ImageView";
mostCurrent._imgstatus = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 59;BA.debugLine="Private lblLine3 As Label";
mostCurrent._lblline3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 60;BA.debugLine="Private lblStatus As Label";
mostCurrent._lblstatus = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 61;BA.debugLine="Private btnClose As Button";
mostCurrent._btnclose = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Private lbltransactionhash As Label";
mostCurrent._lbltransactionhash = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public static String  _imgback_click() throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Private Sub imgBack_Click";
 //BA.debugLineNum = 281;BA.debugLine="kvs.Put(\"ProjectWallet\",\"\")";
mostCurrent._kvs._put("ProjectWallet",(Object)(""));
 //BA.debugLineNum = 282;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return "";
}
public static String  _imgclose_click() throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Private Sub imgClose_Click";
 //BA.debugLineNum = 313;BA.debugLine="pnBlackTransparent.Visible = False";
mostCurrent._pnblacktransparent.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 314;BA.debugLine="pnConfirmation.Visible = False";
mostCurrent._pnconfirmation.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 315;BA.debugLine="btnNext.Visible = True";
mostCurrent._btnnext.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 316;BA.debugLine="kvs.Put(\"DonateAmount\",\"\")";
mostCurrent._kvs._put("DonateAmount",(Object)(""));
 //BA.debugLineNum = 317;BA.debugLine="Log(\"Donate :\" & kvs.Get(\"DonateAmount\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("13145733","Donate :"+BA.ObjectToString(mostCurrent._kvs._get("DonateAmount")),0);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return "";
}
public static String  _imgclose2_click() throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Private Sub imgClose2_Click";
 //BA.debugLineNum = 321;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(pdv.milotin.httpjob _job) throws Exception{
String _jsonstring = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _result = null;
String _metadatastring = "";
anywheresoftware.b4a.objects.collections.JSONParser _metadataparser = null;
anywheresoftware.b4a.objects.collections.Map _metadata = null;
String _strresult = "";
int _status = 0;
 //BA.debugLineNum = 143;BA.debugLine="Sub JobDone(Job As HttpJob)";
 //BA.debugLineNum = 145;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 147;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
 //BA.debugLineNum = 149;BA.debugLine="Dim jsonString As String = Job.GetString";
_jsonstring = _job._getstring /*String*/ ();
 //BA.debugLineNum = 150;BA.debugLine="Log(jsonString)";
anywheresoftware.b4a.keywords.Common.LogImpl("12424839",_jsonstring,0);
 //BA.debugLineNum = 152;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 153;BA.debugLine="parser.Initialize(jsonString)";
_parser.Initialize(_jsonstring);
 //BA.debugLineNum = 155;BA.debugLine="If Job.JobName = \"JobGetAuditByID\" Then";
if ((_job._jobname /*String*/ ).equals("JobGetAuditByID")) { 
 //BA.debugLineNum = 159;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 160;BA.debugLine="Dim result As Map = root.Get(\"result\")";
_result = new anywheresoftware.b4a.objects.collections.Map();
_result = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("result"))));
 //BA.debugLineNum = 163;BA.debugLine="Dim metadataString As String = result.Get(\"meta";
_metadatastring = BA.ObjectToString(_result.Get((Object)("metadata")));
 //BA.debugLineNum = 166;BA.debugLine="Dim metadataParser As JSONParser";
_metadataparser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 167;BA.debugLine="metadataParser.Initialize(metadataString)";
_metadataparser.Initialize(_metadatastring);
 //BA.debugLineNum = 168;BA.debugLine="Dim metadata As Map = metadataParser.NextObject";
_metadata = new anywheresoftware.b4a.objects.collections.Map();
_metadata = _metadataparser.NextObject();
 //BA.debugLineNum = 172;BA.debugLine="lblProjectTittle.Text = metadata.Get(\"project\")";
mostCurrent._lblprojecttittle.setText(BA.ObjectToCharSequence(_metadata.Get((Object)("project"))));
 //BA.debugLineNum = 174;BA.debugLine="kvs.Put(\"metadataFund\",metadata.Get(\"fund\"))";
mostCurrent._kvs._put("metadataFund",_metadata.Get((Object)("fund")));
 //BA.debugLineNum = 176;BA.debugLine="metadata.Get(\"status\")";
_metadata.Get((Object)("status"));
 //BA.debugLineNum = 179;BA.debugLine="Log(metadata.Get(\"project\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("12424868",BA.ObjectToString(_metadata.Get((Object)("project"))),0);
 //BA.debugLineNum = 180;BA.debugLine="Log(metadata.Get(\"fund\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("12424869",BA.ObjectToString(_metadata.Get((Object)("fund"))),0);
 //BA.debugLineNum = 181;BA.debugLine="Log(metadata.Get(\"progress\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("12424870",BA.ObjectToString(_metadata.Get((Object)("progress"))),0);
 //BA.debugLineNum = 182;BA.debugLine="Log(metadata.Get(\"status\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("12424871",BA.ObjectToString(_metadata.Get((Object)("status"))),0);
 //BA.debugLineNum = 183;BA.debugLine="Log(metadata.Get(\"project_wallet\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("12424872",BA.ObjectToString(_metadata.Get((Object)("project_wallet"))),0);
 //BA.debugLineNum = 184;BA.debugLine="kvs.Put(\"ProjectWallet\",metadata.Get(\"project_w";
mostCurrent._kvs._put("ProjectWallet",_metadata.Get((Object)("project_wallet")));
 //BA.debugLineNum = 186;BA.debugLine="If kvs.Get(\"ProjectWallet\") = Null Then";
if (mostCurrent._kvs._get("ProjectWallet")== null) { 
 //BA.debugLineNum = 187;BA.debugLine="kvs.Put(\"ProjectWallet\",kvs.Get(\"WalletAddress";
mostCurrent._kvs._put("ProjectWallet",mostCurrent._kvs._get("WalletAddress"));
 //BA.debugLineNum = 188;BA.debugLine="CheckWalletBalance";
_checkwalletbalance();
 }else {
 //BA.debugLineNum = 190;BA.debugLine="CheckWalletBalance";
_checkwalletbalance();
 };
 }else if((_job._jobname /*String*/ ).equals("JobCheckWalletBalance")) { 
 //BA.debugLineNum = 196;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 197;BA.debugLine="Dim strResult As String = root.Get(\"result\")";
_strresult = BA.ObjectToString(_root.Get((Object)("result")));
 //BA.debugLineNum = 199;BA.debugLine="CalculatePercentage(root.Get(\"result\"),kvs.Get(";
_calculatepercentage((double)(BA.ObjectToNumber(_root.Get((Object)("result")))),(double)(BA.ObjectToNumber(mostCurrent._kvs._get("metadataFund"))));
 //BA.debugLineNum = 201;BA.debugLine="If kvs.Get(\"metadataFund\") < root.Get(\"result\")";
if ((double)(BA.ObjectToNumber(mostCurrent._kvs._get("metadataFund")))<(double)(BA.ObjectToNumber(_root.Get((Object)("result"))))) { 
 //BA.debugLineNum = 202;BA.debugLine="lblProjectFund2.Text = \"RM 0\" & NumberFormat2(";
mostCurrent._lblprojectfund2.setText(BA.ObjectToCharSequence("RM 0"+anywheresoftware.b4a.keywords.Common.NumberFormat2(0,(int) (0),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.True)));
 }else {
 //BA.debugLineNum = 204;BA.debugLine="lblProjectFund2.Text = \"RM \" & NumberFormat2(k";
mostCurrent._lblprojectfund2.setText(BA.ObjectToCharSequence("RM "+anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(BA.ObjectToNumber(mostCurrent._kvs._get("metadataFund")))-(double)(BA.ObjectToNumber(_root.Get((Object)("result")))),(int) (0),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.True)));
 };
 //BA.debugLineNum = 207;BA.debugLine="Log(lblProjectFund2.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("12424896",mostCurrent._lblprojectfund2.getText(),0);
 }else if((_job._jobname /*String*/ ).equals("JobPostTransaction")) { 
 //BA.debugLineNum = 210;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 211;BA.debugLine="Dim status As Int = root.Get(\"status\")";
_status = (int)(BA.ObjectToNumber(_root.Get((Object)("status"))));
 //BA.debugLineNum = 212;BA.debugLine="Dim result As Map = root.Get(\"result\")";
_result = new anywheresoftware.b4a.objects.collections.Map();
_result = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("result"))));
 //BA.debugLineNum = 213;BA.debugLine="Log(root.Get(\"status\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("12424902",BA.ObjectToString(_root.Get((Object)("status"))),0);
 //BA.debugLineNum = 214;BA.debugLine="Log(result.Get(\"transactionHash\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("12424903",BA.ObjectToString(_result.Get((Object)("transactionHash"))),0);
 //BA.debugLineNum = 215;BA.debugLine="lbltransactionhash.Text = result.Get(\"transacti";
mostCurrent._lbltransactionhash.setText(BA.ObjectToCharSequence(_result.Get((Object)("transactionHash"))));
 //BA.debugLineNum = 216;BA.debugLine="kvs.Put(\"CURRTransactionHash\", result.Get(\"tran";
mostCurrent._kvs._put("CURRTransactionHash",_result.Get((Object)("transactionHash")));
 //BA.debugLineNum = 217;BA.debugLine="pnStatus.Visible = True";
mostCurrent._pnstatus.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 218;BA.debugLine="pnConfirmation.Visible = False";
mostCurrent._pnconfirmation.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 221;BA.debugLine="If status = \"200\" Then";
if (_status==(double)(Double.parseDouble("200"))) { 
 //BA.debugLineNum = 223;BA.debugLine="ToastMessageShow(\"Transaction posted successfu";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Transaction posted successfully."),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 224;BA.debugLine="lblStatus.Text = \"Transaction Completed!\" ' Di";
mostCurrent._lblstatus.setText(BA.ObjectToCharSequence("Transaction Completed!"));
 //BA.debugLineNum = 225;BA.debugLine="lblStatus.TextColor = Colors.RGB(5,206,46)";
mostCurrent._lblstatus.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (5),(int) (206),(int) (46)));
 //BA.debugLineNum = 226;BA.debugLine="kvs.Put(\"Status\",\"success\")";
mostCurrent._kvs._put("Status",(Object)("success"));
 }else {
 //BA.debugLineNum = 230;BA.debugLine="ToastMessageShow(\"Failed to post transaction.\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Failed to post transaction."),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 231;BA.debugLine="lblStatus.Text = \"Transaction Failed!\" ' Displ";
mostCurrent._lblstatus.setText(BA.ObjectToCharSequence("Transaction Failed!"));
 //BA.debugLineNum = 232;BA.debugLine="lblStatus.TextColor = Colors.RGB(220,14,13)";
mostCurrent._lblstatus.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (220),(int) (14),(int) (13)));
 //BA.debugLineNum = 234;BA.debugLine="kvs.Put(\"Status\",\"failed\")";
mostCurrent._kvs._put("Status",(Object)("failed"));
 };
 }else {
 //BA.debugLineNum = 239;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("12424928","Error: "+_job._errormessage /*String*/ ,0);
 };
 }else {
 //BA.debugLineNum = 244;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("12424933","Error: "+_job._errormessage /*String*/ ,0);
 };
 //BA.debugLineNum = 248;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return "";
}
public static String  _lblfund_click() throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Private Sub lblFund_Click";
 //BA.debugLineNum = 266;BA.debugLine="StartActivity(\"FundMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("FundMd"));
 //BA.debugLineNum = 267;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return "";
}
public static String  _lblhistory_click() throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Private Sub lblHistory_Click";
 //BA.debugLineNum = 271;BA.debugLine="StartActivity(\"HistoryMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("HistoryMd"));
 //BA.debugLineNum = 272;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return "";
}
public static String  _lblhome_click() throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Private Sub lblHome_Click";
 //BA.debugLineNum = 262;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return "";
}
public static String  _lbluser_click() throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Private Sub lblUser_Click";
 //BA.debugLineNum = 276;BA.debugLine="StartActivity(\"UserMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("UserMd"));
 //BA.debugLineNum = 277;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return "";
}
public static String  _posttransaction() throws Exception{
pdv.milotin.httpjob _jobposttransaction = null;
String _url = "";
anywheresoftware.b4a.objects.collections.Map _data = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
 //BA.debugLineNum = 121;BA.debugLine="Sub PostTransaction";
 //BA.debugLineNum = 122;BA.debugLine="Dim JobPostTransaction As HttpJob";
_jobposttransaction = new pdv.milotin.httpjob();
 //BA.debugLineNum = 123;BA.debugLine="JobPostTransaction.Initialize(\"JobPostTransaction";
_jobposttransaction._initialize /*String*/ (processBA,"JobPostTransaction",sendfundmd.getObject());
 //BA.debugLineNum = 125;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
_url = "https://service-testnet.maschain.com/api/token/token-transfer/";
 //BA.debugLineNum = 126;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 127;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 128;BA.debugLine="data.Put(\"wallet_address\", kvs.Get(\"WalletAddress";
_data.Put((Object)("wallet_address"),mostCurrent._kvs._get("WalletAddress"));
 //BA.debugLineNum = 129;BA.debugLine="data.Put(\"to\", kvs.Get(\"ProjectWallet\"))";
_data.Put((Object)("to"),mostCurrent._kvs._get("ProjectWallet"));
 //BA.debugLineNum = 130;BA.debugLine="data.Put(\"amount\", kvs.Get(\"DonateAmount\"))";
_data.Put((Object)("amount"),mostCurrent._kvs._get("DonateAmount"));
 //BA.debugLineNum = 131;BA.debugLine="data.Put(\"contract_address\", \"0x5BA886F619b95E2b2";
_data.Put((Object)("contract_address"),(Object)("0x5BA886F619b95E2b2a875503e2FCE58c14027ade"));
 //BA.debugLineNum = 132;BA.debugLine="data.Put(\"callback_url\", \"https://\")";
_data.Put((Object)("callback_url"),(Object)("https://"));
 //BA.debugLineNum = 134;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 135;BA.debugLine="json.Initialize(data)";
_json.Initialize(_data);
 //BA.debugLineNum = 137;BA.debugLine="JobPostTransaction.PostString(url, json.ToString)";
_jobposttransaction._poststring /*String*/ (_url,_json.ToString());
 //BA.debugLineNum = 138;BA.debugLine="JobPostTransaction.GetRequest.SetContentType(\"app";
_jobposttransaction._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 139;BA.debugLine="JobPostTransaction.GetRequest.SetHeader(\"client_i";
_jobposttransaction._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("client_id",BA.ObjectToString(mostCurrent._kvs._get("client_id")));
 //BA.debugLineNum = 140;BA.debugLine="JobPostTransaction.GetRequest.SetHeader(\"client_s";
_jobposttransaction._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("client_secret",BA.ObjectToString(mostCurrent._kvs._get("client_secret")));
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
}
