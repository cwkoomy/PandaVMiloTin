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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "pdv.milotin", "pdv.milotin.sendfundmd");
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



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
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
public b4a.example.dateutils _dateutils = null;
public pdv.milotin.main _main = null;
public pdv.milotin.homemd _homemd = null;
public pdv.milotin.usermd _usermd = null;
public pdv.milotin.historymd _historymd = null;
public pdv.milotin.fundmd _fundmd = null;
public pdv.milotin.addprojectmd _addprojectmd = null;
public pdv.milotin.starter _starter = null;
public pdv.milotin.addallocatemd _addallocatemd = null;
public pdv.milotin.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="sendfundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Activity.LoadLayout(\"SendFundLy\")";
mostCurrent._activity.LoadLayout("SendFundLy",mostCurrent.activityBA);
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
mostCurrent._shared = mostCurrent._rp.GetSafeDirDefaultExternal("");
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
mostCurrent._kvs._initialize(processBA,mostCurrent._shared,"Userdatastore");
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"db.db",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db");
 };
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="If SQL1.IsInitialized = False Then";
if (mostCurrent._sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
mostCurrent._sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1835023;
 //BA.debugLineNum = 1835023;BA.debugLine="Log(kvs.Get(\"AuditID\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("41835023",BA.ObjectToString(mostCurrent._kvs._get("AuditID")),0);
RDebugUtils.currentLine=1835024;
 //BA.debugLineNum = 1835024;BA.debugLine="GetAuditByID";
_getauditbyid();
RDebugUtils.currentLine=1835025;
 //BA.debugLineNum = 1835025;BA.debugLine="End Sub";
return "";
}
public static String  _getauditbyid() throws Exception{
RDebugUtils.currentModule="sendfundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getauditbyid", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getauditbyid", null));}
pdv.milotin.httpjob _jobgetauditbyid = null;
String _url = "";
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub GetAuditByID";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Dim JobGetAuditByID As HttpJob";
_jobgetauditbyid = new pdv.milotin.httpjob();
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="JobGetAuditByID.Initialize(\"JobGetAuditByID\", Me)";
_jobgetauditbyid._initialize /*String*/ (null,processBA,"JobGetAuditByID",sendfundmd.getObject());
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
_url = "https://service-testnet.maschain.com/api/audit/audit/"+BA.ObjectToString(mostCurrent._kvs._get("AuditTransactionHash"));
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="Log(\"HASH:\" & kvs.Get(\"AuditTransactionHash\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("41900550","HASH:"+BA.ObjectToString(mostCurrent._kvs._get("AuditTransactionHash")),0);
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="JobGetAuditByID.Download(url)";
_jobgetauditbyid._download /*String*/ (null,_url);
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="JobGetAuditByID.GetRequest.SetHeader(\"client_id\",";
_jobgetauditbyid._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_id",BA.ObjectToString(mostCurrent._kvs._get("client_id")));
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="JobGetAuditByID.GetRequest.SetHeader(\"client_secr";
_jobgetauditbyid._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_secret",BA.ObjectToString(mostCurrent._kvs._get("client_secret")));
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="sendfundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="kvs.Put(\"ProjectWallet\",\"\")";
mostCurrent._kvs._put("ProjectWallet",(Object)(""));
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="sendfundmd";
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="sendfundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return "";
}
public static String  _btnclose_click() throws Exception{
RDebugUtils.currentModule="sendfundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnclose_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnclose_click", null));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub btnClose_Click";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="If kvs.Get(\"Status\") = \"success\" Then";
if ((mostCurrent._kvs._get("Status")).equals((Object)("success"))) { 
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="pnStatus.Visible = False";
mostCurrent._pnstatus.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="pnConfirmation.Visible = False";
mostCurrent._pnconfirmation.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="btnNext.Visible = True";
mostCurrent._btnnext.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="End Sub";
return "";
}
public static String  _btnnext_click() throws Exception{
RDebugUtils.currentModule="sendfundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnnext_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnnext_click", null));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub btnNext_Click";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="pnBlackTransparent.Visible = True";
mostCurrent._pnblacktransparent.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="pnConfirmation.Visible = True";
mostCurrent._pnconfirmation.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="btnNext.Visible = False";
mostCurrent._btnnext.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="lblDonateAmount.Text = txtDonateAmount.Text";
mostCurrent._lbldonateamount.setText(BA.ObjectToCharSequence(mostCurrent._txtdonateamount.getText()));
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="kvs.Put(\"DonateAmount\",lblDonateAmount.Text)";
mostCurrent._kvs._put("DonateAmount",(Object)(mostCurrent._lbldonateamount.getText()));
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="Log(kvs.Get(\"DonateAmount\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("42686983",BA.ObjectToString(mostCurrent._kvs._get("DonateAmount")),0);
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="End Sub";
return "";
}
public static String  _btnsend_click() throws Exception{
RDebugUtils.currentModule="sendfundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsend_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsend_click", null));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Private Sub btnSend_Click";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="PostTransaction";
_posttransaction();
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
return "";
}
public static String  _posttransaction() throws Exception{
RDebugUtils.currentModule="sendfundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "posttransaction", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "posttransaction", null));}
pdv.milotin.httpjob _jobposttransaction = null;
String _url = "";
anywheresoftware.b4a.objects.collections.Map _data = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub PostTransaction";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Dim JobPostTransaction As HttpJob";
_jobposttransaction = new pdv.milotin.httpjob();
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="JobPostTransaction.Initialize(\"JobPostTransaction";
_jobposttransaction._initialize /*String*/ (null,processBA,"JobPostTransaction",sendfundmd.getObject());
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
_url = "https://service-testnet.maschain.com/api/token/token-transfer/";
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="data.Put(\"wallet_address\", kvs.Get(\"WalletAddress";
_data.Put((Object)("wallet_address"),mostCurrent._kvs._get("WalletAddress"));
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="data.Put(\"to\", kvs.Get(\"ProjectWallet\"))";
_data.Put((Object)("to"),mostCurrent._kvs._get("ProjectWallet"));
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="data.Put(\"amount\", kvs.Get(\"DonateAmount\"))";
_data.Put((Object)("amount"),mostCurrent._kvs._get("DonateAmount"));
RDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="data.Put(\"contract_address\", \"0x5BA886F619b95E2b2";
_data.Put((Object)("contract_address"),(Object)("0x5BA886F619b95E2b2a875503e2FCE58c14027ade"));
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="data.Put(\"callback_url\", \"https://\")";
_data.Put((Object)("callback_url"),(Object)("https://"));
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="json.Initialize(data)";
_json.Initialize(_data);
RDebugUtils.currentLine=2031632;
 //BA.debugLineNum = 2031632;BA.debugLine="JobPostTransaction.PostString(url, json.ToString)";
_jobposttransaction._poststring /*String*/ (null,_url,_json.ToString());
RDebugUtils.currentLine=2031633;
 //BA.debugLineNum = 2031633;BA.debugLine="JobPostTransaction.GetRequest.SetContentType(\"app";
_jobposttransaction._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=2031634;
 //BA.debugLineNum = 2031634;BA.debugLine="JobPostTransaction.GetRequest.SetHeader(\"client_i";
_jobposttransaction._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_id",BA.ObjectToString(mostCurrent._kvs._get("client_id")));
RDebugUtils.currentLine=2031635;
 //BA.debugLineNum = 2031635;BA.debugLine="JobPostTransaction.GetRequest.SetHeader(\"client_s";
_jobposttransaction._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_secret",BA.ObjectToString(mostCurrent._kvs._get("client_secret")));
RDebugUtils.currentLine=2031636;
 //BA.debugLineNum = 2031636;BA.debugLine="End Sub";
return "";
}
public static String  _calculatepercentage(double _part,double _total) throws Exception{
RDebugUtils.currentModule="sendfundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "calculatepercentage", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "calculatepercentage", new Object[] {_part,_total}));}
double _percentage = 0;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub CalculatePercentage(part As Double, total As D";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Dim percentage As Double";
_percentage = 0;
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="percentage = (part / total) * 100";
_percentage = (_part/(double)_total)*100;
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="If percentage > 100 Then";
if (_percentage>100) { 
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="cpBar2.Value = \"100\"";
mostCurrent._cpbar2._setvalue /*float*/ (null,(float)(Double.parseDouble("100")));
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(5,206";
mostCurrent._lblprojectprogress2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (5),(int) (206),(int) (46)));
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="lblProjectProgress2.Text = \"Fundraising complete";
mostCurrent._lblprojectprogress2.setText(BA.ObjectToCharSequence("Fundraising complete"));
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="txtDonateAmount.Enabled = False";
mostCurrent._txtdonateamount.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="txtDonateAmount.Text = \"-\"";
mostCurrent._txtdonateamount.setText(BA.ObjectToCharSequence("-"));
 }else {
RDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="cpBar2.Value = NumberFormat(percentage, 1, 3)";
mostCurrent._cpbar2._setvalue /*float*/ (null,(float)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.NumberFormat(_percentage,(int) (1),(int) (3)))));
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(254,17";
mostCurrent._lblprojectprogress2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (254),(int) (171),(int) (43)));
RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="lblProjectProgress2.Text = \"Fundraising in progre";
mostCurrent._lblprojectprogress2.setText(BA.ObjectToCharSequence("Fundraising in progress"));
 };
RDebugUtils.currentLine=3014671;
 //BA.debugLineNum = 3014671;BA.debugLine="Log(NumberFormat(percentage, 1, 3))";
anywheresoftware.b4a.keywords.Common.LogImpl("43014671",anywheresoftware.b4a.keywords.Common.NumberFormat(_percentage,(int) (1),(int) (3)),0);
RDebugUtils.currentLine=3014672;
 //BA.debugLineNum = 3014672;BA.debugLine="End Sub";
return "";
}
public static String  _checkwalletbalance() throws Exception{
RDebugUtils.currentModule="sendfundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkwalletbalance", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkwalletbalance", null));}
pdv.milotin.httpjob _jobcheckwalletbalance = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
anywheresoftware.b4a.objects.collections.Map _data = null;
String _url = "";
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub CheckWalletBalance";
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Dim JobCheckWalletBalance As HttpJob";
_jobcheckwalletbalance = new pdv.milotin.httpjob();
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="JobCheckWalletBalance.Initialize(\"JobCheckWalletB";
_jobcheckwalletbalance._initialize /*String*/ (null,processBA,"JobCheckWalletBalance",sendfundmd.getObject());
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="data.Put(\"wallet_address\", kvs.Get(\"ProjectWallet";
_data.Put((Object)("wallet_address"),mostCurrent._kvs._get("ProjectWallet"));
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="data.Put(\"contract_address\", kvs.Get(\"token-contr";
_data.Put((Object)("contract_address"),mostCurrent._kvs._get("token-contract"));
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="json.Initialize(data)";
_json.Initialize(_data);
RDebugUtils.currentLine=1966094;
 //BA.debugLineNum = 1966094;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
_url = "https://service-testnet.maschain.com/api/token/balance/";
RDebugUtils.currentLine=1966095;
 //BA.debugLineNum = 1966095;BA.debugLine="JobCheckWalletBalance.PostString(url, json.ToStri";
_jobcheckwalletbalance._poststring /*String*/ (null,_url,_json.ToString());
RDebugUtils.currentLine=1966096;
 //BA.debugLineNum = 1966096;BA.debugLine="JobCheckWalletBalance.GetRequest.SetContentType(\"";
_jobcheckwalletbalance._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=1966097;
 //BA.debugLineNum = 1966097;BA.debugLine="JobCheckWalletBalance.GetRequest.SetHeader(\"clien";
_jobcheckwalletbalance._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_id",BA.ObjectToString(mostCurrent._kvs._get("client_id")));
RDebugUtils.currentLine=1966098;
 //BA.debugLineNum = 1966098;BA.debugLine="JobCheckWalletBalance.GetRequest.SetHeader(\"clien";
_jobcheckwalletbalance._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_secret",BA.ObjectToString(mostCurrent._kvs._get("client_secret")));
RDebugUtils.currentLine=1966100;
 //BA.debugLineNum = 1966100;BA.debugLine="End Sub";
return "";
}
public static String  _imgback_click() throws Exception{
RDebugUtils.currentModule="sendfundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgback_click", null));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub imgBack_Click";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="kvs.Put(\"ProjectWallet\",\"\")";
mostCurrent._kvs._put("ProjectWallet",(Object)(""));
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="End Sub";
return "";
}
public static String  _imgclose_click() throws Exception{
RDebugUtils.currentModule="sendfundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgclose_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgclose_click", null));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Private Sub imgClose_Click";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="pnBlackTransparent.Visible = False";
mostCurrent._pnblacktransparent.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="pnConfirmation.Visible = False";
mostCurrent._pnconfirmation.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="btnNext.Visible = True";
mostCurrent._btnnext.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="kvs.Put(\"DonateAmount\",\"\")";
mostCurrent._kvs._put("DonateAmount",(Object)(""));
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="Log(\"Donate :\" & kvs.Get(\"DonateAmount\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("42818053","Donate :"+BA.ObjectToString(mostCurrent._kvs._get("DonateAmount")),0);
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="End Sub";
return "";
}
public static String  _imgclose2_click() throws Exception{
RDebugUtils.currentModule="sendfundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgclose2_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgclose2_click", null));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Private Sub imgClose2_Click";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(pdv.milotin.httpjob _job) throws Exception{
RDebugUtils.currentModule="sendfundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
String _jsonstring = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _result = null;
String _metadatastring = "";
anywheresoftware.b4a.objects.collections.JSONParser _metadataparser = null;
anywheresoftware.b4a.objects.collections.Map _metadata = null;
String _strresult = "";
int _status = 0;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="Dim jsonString As String = Job.GetString";
_jsonstring = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="Log(jsonString)";
anywheresoftware.b4a.keywords.Common.LogImpl("42097159",_jsonstring,0);
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="parser.Initialize(jsonString)";
_parser.Initialize(_jsonstring);
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="If Job.JobName = \"JobGetAuditByID\" Then";
if ((_job._jobname /*String*/ ).equals("JobGetAuditByID")) { 
RDebugUtils.currentLine=2097168;
 //BA.debugLineNum = 2097168;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=2097169;
 //BA.debugLineNum = 2097169;BA.debugLine="Dim result As Map = root.Get(\"result\")";
_result = new anywheresoftware.b4a.objects.collections.Map();
_result = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("result"))));
RDebugUtils.currentLine=2097172;
 //BA.debugLineNum = 2097172;BA.debugLine="Dim metadataString As String = result.Get(\"meta";
_metadatastring = BA.ObjectToString(_result.Get((Object)("metadata")));
RDebugUtils.currentLine=2097175;
 //BA.debugLineNum = 2097175;BA.debugLine="Dim metadataParser As JSONParser";
_metadataparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2097176;
 //BA.debugLineNum = 2097176;BA.debugLine="metadataParser.Initialize(metadataString)";
_metadataparser.Initialize(_metadatastring);
RDebugUtils.currentLine=2097177;
 //BA.debugLineNum = 2097177;BA.debugLine="Dim metadata As Map = metadataParser.NextObject";
_metadata = new anywheresoftware.b4a.objects.collections.Map();
_metadata = _metadataparser.NextObject();
RDebugUtils.currentLine=2097181;
 //BA.debugLineNum = 2097181;BA.debugLine="lblProjectTittle.Text = metadata.Get(\"project\")";
mostCurrent._lblprojecttittle.setText(BA.ObjectToCharSequence(_metadata.Get((Object)("project"))));
RDebugUtils.currentLine=2097183;
 //BA.debugLineNum = 2097183;BA.debugLine="kvs.Put(\"metadataFund\",metadata.Get(\"fund\"))";
mostCurrent._kvs._put("metadataFund",_metadata.Get((Object)("fund")));
RDebugUtils.currentLine=2097185;
 //BA.debugLineNum = 2097185;BA.debugLine="metadata.Get(\"status\")";
_metadata.Get((Object)("status"));
RDebugUtils.currentLine=2097188;
 //BA.debugLineNum = 2097188;BA.debugLine="Log(metadata.Get(\"project\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("42097188",BA.ObjectToString(_metadata.Get((Object)("project"))),0);
RDebugUtils.currentLine=2097189;
 //BA.debugLineNum = 2097189;BA.debugLine="Log(metadata.Get(\"fund\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("42097189",BA.ObjectToString(_metadata.Get((Object)("fund"))),0);
RDebugUtils.currentLine=2097190;
 //BA.debugLineNum = 2097190;BA.debugLine="Log(metadata.Get(\"progress\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("42097190",BA.ObjectToString(_metadata.Get((Object)("progress"))),0);
RDebugUtils.currentLine=2097191;
 //BA.debugLineNum = 2097191;BA.debugLine="Log(metadata.Get(\"status\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("42097191",BA.ObjectToString(_metadata.Get((Object)("status"))),0);
RDebugUtils.currentLine=2097192;
 //BA.debugLineNum = 2097192;BA.debugLine="Log(metadata.Get(\"project_wallet\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("42097192",BA.ObjectToString(_metadata.Get((Object)("project_wallet"))),0);
RDebugUtils.currentLine=2097193;
 //BA.debugLineNum = 2097193;BA.debugLine="kvs.Put(\"ProjectWallet\",metadata.Get(\"project_w";
mostCurrent._kvs._put("ProjectWallet",_metadata.Get((Object)("project_wallet")));
RDebugUtils.currentLine=2097195;
 //BA.debugLineNum = 2097195;BA.debugLine="If kvs.Get(\"ProjectWallet\") = Null Then";
if (mostCurrent._kvs._get("ProjectWallet")== null) { 
RDebugUtils.currentLine=2097196;
 //BA.debugLineNum = 2097196;BA.debugLine="kvs.Put(\"ProjectWallet\",kvs.Get(\"WalletAddress";
mostCurrent._kvs._put("ProjectWallet",mostCurrent._kvs._get("WalletAddress"));
RDebugUtils.currentLine=2097197;
 //BA.debugLineNum = 2097197;BA.debugLine="CheckWalletBalance";
_checkwalletbalance();
 }else {
RDebugUtils.currentLine=2097199;
 //BA.debugLineNum = 2097199;BA.debugLine="CheckWalletBalance";
_checkwalletbalance();
 };
 }else 
{RDebugUtils.currentLine=2097203;
 //BA.debugLineNum = 2097203;BA.debugLine="Else If Job.JobName = \"JobCheckWalletBalance\" Th";
if ((_job._jobname /*String*/ ).equals("JobCheckWalletBalance")) { 
RDebugUtils.currentLine=2097205;
 //BA.debugLineNum = 2097205;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=2097206;
 //BA.debugLineNum = 2097206;BA.debugLine="Dim strResult As String = root.Get(\"result\")";
_strresult = BA.ObjectToString(_root.Get((Object)("result")));
RDebugUtils.currentLine=2097208;
 //BA.debugLineNum = 2097208;BA.debugLine="CalculatePercentage(root.Get(\"result\"),kvs.Get(";
_calculatepercentage((double)(BA.ObjectToNumber(_root.Get((Object)("result")))),(double)(BA.ObjectToNumber(mostCurrent._kvs._get("metadataFund"))));
RDebugUtils.currentLine=2097210;
 //BA.debugLineNum = 2097210;BA.debugLine="If kvs.Get(\"metadataFund\") < root.Get(\"result\")";
if ((double)(BA.ObjectToNumber(mostCurrent._kvs._get("metadataFund")))<(double)(BA.ObjectToNumber(_root.Get((Object)("result"))))) { 
RDebugUtils.currentLine=2097211;
 //BA.debugLineNum = 2097211;BA.debugLine="lblProjectFund2.Text = \"RM 0\" & NumberFormat2(";
mostCurrent._lblprojectfund2.setText(BA.ObjectToCharSequence("RM 0"+anywheresoftware.b4a.keywords.Common.NumberFormat2(0,(int) (0),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.True)));
 }else {
RDebugUtils.currentLine=2097213;
 //BA.debugLineNum = 2097213;BA.debugLine="lblProjectFund2.Text = \"RM \" & NumberFormat2(k";
mostCurrent._lblprojectfund2.setText(BA.ObjectToCharSequence("RM "+anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(BA.ObjectToNumber(mostCurrent._kvs._get("metadataFund")))-(double)(BA.ObjectToNumber(_root.Get((Object)("result")))),(int) (0),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.True)));
 };
RDebugUtils.currentLine=2097216;
 //BA.debugLineNum = 2097216;BA.debugLine="Log(lblProjectFund2.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("42097216",mostCurrent._lblprojectfund2.getText(),0);
 }else 
{RDebugUtils.currentLine=2097217;
 //BA.debugLineNum = 2097217;BA.debugLine="Else If Job.JobName = \"JobPostTransaction\" Then";
if ((_job._jobname /*String*/ ).equals("JobPostTransaction")) { 
RDebugUtils.currentLine=2097219;
 //BA.debugLineNum = 2097219;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=2097220;
 //BA.debugLineNum = 2097220;BA.debugLine="Dim status As Int = root.Get(\"status\")";
_status = (int)(BA.ObjectToNumber(_root.Get((Object)("status"))));
RDebugUtils.currentLine=2097221;
 //BA.debugLineNum = 2097221;BA.debugLine="Log(root.Get(\"status\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("42097221",BA.ObjectToString(_root.Get((Object)("status"))),0);
RDebugUtils.currentLine=2097223;
 //BA.debugLineNum = 2097223;BA.debugLine="pnStatus.Visible = True";
mostCurrent._pnstatus.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2097224;
 //BA.debugLineNum = 2097224;BA.debugLine="pnConfirmation.Visible = False";
mostCurrent._pnconfirmation.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2097227;
 //BA.debugLineNum = 2097227;BA.debugLine="If status = \"200\" Then";
if (_status==(double)(Double.parseDouble("200"))) { 
RDebugUtils.currentLine=2097229;
 //BA.debugLineNum = 2097229;BA.debugLine="ToastMessageShow(\"Transaction posted successfu";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Transaction posted successfully."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2097230;
 //BA.debugLineNum = 2097230;BA.debugLine="lblStatus.Text = \"Transaction Completed!\" ' Di";
mostCurrent._lblstatus.setText(BA.ObjectToCharSequence("Transaction Completed!"));
RDebugUtils.currentLine=2097231;
 //BA.debugLineNum = 2097231;BA.debugLine="lblStatus.TextColor = Colors.RGB(5,206,46)";
mostCurrent._lblstatus.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (5),(int) (206),(int) (46)));
RDebugUtils.currentLine=2097232;
 //BA.debugLineNum = 2097232;BA.debugLine="kvs.Put(\"Status\",\"success\")";
mostCurrent._kvs._put("Status",(Object)("success"));
 }else {
RDebugUtils.currentLine=2097236;
 //BA.debugLineNum = 2097236;BA.debugLine="ToastMessageShow(\"Failed to post transaction.\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Failed to post transaction."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2097237;
 //BA.debugLineNum = 2097237;BA.debugLine="lblStatus.Text = \"Transaction Failed!\" ' Displ";
mostCurrent._lblstatus.setText(BA.ObjectToCharSequence("Transaction Failed!"));
RDebugUtils.currentLine=2097238;
 //BA.debugLineNum = 2097238;BA.debugLine="lblStatus.TextColor = Colors.RGB(220,14,13)";
mostCurrent._lblstatus.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (220),(int) (14),(int) (13)));
RDebugUtils.currentLine=2097240;
 //BA.debugLineNum = 2097240;BA.debugLine="kvs.Put(\"Status\",\"failed\")";
mostCurrent._kvs._put("Status",(Object)("failed"));
 };
 }else {
RDebugUtils.currentLine=2097245;
 //BA.debugLineNum = 2097245;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("42097245","Error: "+_job._errormessage /*String*/ ,0);
 }}}
;
 }else {
RDebugUtils.currentLine=2097250;
 //BA.debugLineNum = 2097250;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("42097250","Error: "+_job._errormessage /*String*/ ,0);
 };
RDebugUtils.currentLine=2097254;
 //BA.debugLineNum = 2097254;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=2097256;
 //BA.debugLineNum = 2097256;BA.debugLine="End Sub";
return "";
}
public static String  _lblfund_click() throws Exception{
RDebugUtils.currentModule="sendfundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblfund_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblfund_click", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub lblFund_Click";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="StartActivity(\"FundMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("FundMd"));
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="End Sub";
return "";
}
public static String  _lblhistory_click() throws Exception{
RDebugUtils.currentModule="sendfundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblhistory_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblhistory_click", null));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Private Sub lblHistory_Click";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="StartActivity(\"HistoryMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("HistoryMd"));
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="End Sub";
return "";
}
public static String  _lblhome_click() throws Exception{
RDebugUtils.currentModule="sendfundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblhome_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblhome_click", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Private Sub lblHome_Click";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return "";
}
public static String  _lbluser_click() throws Exception{
RDebugUtils.currentModule="sendfundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbluser_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbluser_click", null));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub lblUser_Click";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="StartActivity(\"UserMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("UserMd"));
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="End Sub";
return "";
}
}