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

public class addprojectmd extends Activity implements B4AActivity{
	public static addprojectmd mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "pdv.milotin", "pdv.milotin.addprojectmd");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (addprojectmd).");
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
		activityBA = new BA(this, layout, processBA, "pdv.milotin", "pdv.milotin.addprojectmd");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "pdv.milotin.addprojectmd", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (addprojectmd) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (addprojectmd) Resume **");
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
		return addprojectmd.class;
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
            BA.LogInfo("** Activity (addprojectmd) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (addprojectmd) Pause event (activity is not paused). **");
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
            addprojectmd mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (addprojectmd) Resume **");
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
public anywheresoftware.b4a.objects.PanelWrapper _pnheader1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblbottom = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhome = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfund = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhistory = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbluser = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhome2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfund2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhistory2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbluser2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnframe2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbladdtitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblline4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprojectname = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnprojectname = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfundamount = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnsetfundamount = null;
public anywheresoftware.b4a.objects.PanelWrapper _pncontent = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnsetwalletaddress = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcontent = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsetwalletaddress = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnprojectsubmit = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtprojectname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsetfundamount = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtcontent = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsetwalletaddress = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgsetfundamount = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgprojectname = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgcontent = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgsetwalletaddress = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnblacktransparent = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnstatus = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnclose = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblstatus = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgstatus = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblline3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltittle3 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgclose2 = null;
public b4a.example.dateutils _dateutils = null;
public pdv.milotin.main _main = null;
public pdv.milotin.homemd _homemd = null;
public pdv.milotin.sendfundmd _sendfundmd = null;
public pdv.milotin.usermd _usermd = null;
public pdv.milotin.historymd _historymd = null;
public pdv.milotin.fundmd _fundmd = null;
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
 //BA.debugLineNum = 60;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 62;BA.debugLine="Activity.LoadLayout(\"AddProjectLy\")";
mostCurrent._activity.LoadLayout("AddProjectLy",mostCurrent.activityBA);
 //BA.debugLineNum = 64;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
mostCurrent._shared = mostCurrent._rp.GetSafeDirDefaultExternal("");
 //BA.debugLineNum = 65;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
mostCurrent._kvs._initialize(processBA,mostCurrent._shared,"Userdatastore");
 //BA.debugLineNum = 67;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 68;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"db.db",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db");
 };
 //BA.debugLineNum = 71;BA.debugLine="If SQL1.IsInitialized = False Then";
if (mostCurrent._sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 72;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
mostCurrent._sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db",anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public static String  _btnclose_click() throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Private Sub btnClose_Click";
 //BA.debugLineNum = 171;BA.debugLine="If kvs.Get(\"Status\") = \"success\" Then";
if ((mostCurrent._kvs._get("Status")).equals((Object)("success"))) { 
 //BA.debugLineNum = 172;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
 //BA.debugLineNum = 174;BA.debugLine="pnStatus.Visible = False";
mostCurrent._pnstatus.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public static String  _btnprojectsubmit_click() throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Private Sub btnProjectSubmit_Click";
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 19;BA.debugLine="Private pnHeader1 As Panel";
mostCurrent._pnheader1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private lblBottom As Label";
mostCurrent._lblbottom = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private lblHome As Label";
mostCurrent._lblhome = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private lblFund As Label";
mostCurrent._lblfund = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private lblHistory As Label";
mostCurrent._lblhistory = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private lblUser As Label";
mostCurrent._lbluser = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private lblHome2 As Label";
mostCurrent._lblhome2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private lblFund2 As Label";
mostCurrent._lblfund2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private lblHistory2 As Label";
mostCurrent._lblhistory2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private lblUser2 As Label";
mostCurrent._lbluser2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private pnFrame2 As Panel";
mostCurrent._pnframe2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private lblAddTitle As Label";
mostCurrent._lbladdtitle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private lblLine4 As Label";
mostCurrent._lblline4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private lblProjectName As Label";
mostCurrent._lblprojectname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private pnProjectName As Panel";
mostCurrent._pnprojectname = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private lblFundAmount As Label";
mostCurrent._lblfundamount = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private pnSetFundAmount As Panel";
mostCurrent._pnsetfundamount = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private pnContent As Panel";
mostCurrent._pncontent = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private pnSetWalletAddress As Panel";
mostCurrent._pnsetwalletaddress = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private lblContent As Label";
mostCurrent._lblcontent = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private lblSetWalletAddress As Label";
mostCurrent._lblsetwalletaddress = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private btnProjectSubmit As Button";
mostCurrent._btnprojectsubmit = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private txtProjectName As EditText";
mostCurrent._txtprojectname = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private txtSetFundAmount As EditText";
mostCurrent._txtsetfundamount = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private txtContent As EditText";
mostCurrent._txtcontent = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private txtSetWalletAddress As EditText";
mostCurrent._txtsetwalletaddress = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private imgSetFundAmount As ImageView";
mostCurrent._imgsetfundamount = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private imgProjectName As ImageView";
mostCurrent._imgprojectname = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private imgContent As ImageView";
mostCurrent._imgcontent = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private imgSetWalletAddress As ImageView";
mostCurrent._imgsetwalletaddress = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private pnBlackTransparent As Panel";
mostCurrent._pnblacktransparent = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 50;BA.debugLine="Private pnStatus As Panel";
mostCurrent._pnstatus = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Private btnClose As Button";
mostCurrent._btnclose = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private lblStatus As Label";
mostCurrent._lblstatus = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private imgStatus As ImageView";
mostCurrent._imgstatus = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 54;BA.debugLine="Private lblLine3 As Label";
mostCurrent._lblline3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Private lblTittle3 As Label";
mostCurrent._lbltittle3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 56;BA.debugLine="Private imgClose2 As ImageView";
mostCurrent._imgclose2 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public static String  _imgback_click() throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Private Sub imgBack_Click";
 //BA.debugLineNum = 179;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(pdv.milotin.httpjob _job) throws Exception{
String _jsonstring = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _status = 0;
anywheresoftware.b4a.objects.collections.Map _result = null;
String _transactionhash = "";
int _nonce = 0;
String _from = "";
String _responsestatus = "";
anywheresoftware.b4a.objects.collections.Map _receipt = null;
 //BA.debugLineNum = 115;BA.debugLine="Sub JobDone(Job As HttpJob)";
 //BA.debugLineNum = 116;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 118;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
 //BA.debugLineNum = 119;BA.debugLine="Dim jsonString As String = Job.GetString";
_jsonstring = _job._getstring /*String*/ ();
 //BA.debugLineNum = 120;BA.debugLine="Log(jsonString)";
anywheresoftware.b4a.keywords.Common.LogImpl("16553605",_jsonstring,0);
 //BA.debugLineNum = 122;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 123;BA.debugLine="parser.Initialize(jsonString)";
_parser.Initialize(_jsonstring);
 //BA.debugLineNum = 125;BA.debugLine="If Job.JobName = \"PostAuditProject\" Then";
if ((_job._jobname /*String*/ ).equals("PostAuditProject")) { 
 //BA.debugLineNum = 126;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 127;BA.debugLine="Dim status As Int = root.Get(\"status\")";
_status = (int)(BA.ObjectToNumber(_root.Get((Object)("status"))));
 //BA.debugLineNum = 128;BA.debugLine="Dim result As Map = root.Get(\"result\")";
_result = new anywheresoftware.b4a.objects.collections.Map();
_result = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("result"))));
 //BA.debugLineNum = 130;BA.debugLine="If status = 200 Then";
if (_status==200) { 
 //BA.debugLineNum = 131;BA.debugLine="Dim transactionHash As String = result.Get(\"tr";
_transactionhash = BA.ObjectToString(_result.Get((Object)("transactionHash")));
 //BA.debugLineNum = 132;BA.debugLine="Dim nonce As Int = result.Get(\"nonce\")";
_nonce = (int)(BA.ObjectToNumber(_result.Get((Object)("nonce"))));
 //BA.debugLineNum = 133;BA.debugLine="Dim from As String = result.Get(\"from\")";
_from = BA.ObjectToString(_result.Get((Object)("from")));
 //BA.debugLineNum = 134;BA.debugLine="Dim responseStatus As String = result.Get(\"sta";
_responsestatus = BA.ObjectToString(_result.Get((Object)("status")));
 //BA.debugLineNum = 135;BA.debugLine="Dim receipt As Map = result.Get(\"receipt\")";
_receipt = new anywheresoftware.b4a.objects.collections.Map();
_receipt = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_result.Get((Object)("receipt"))));
 //BA.debugLineNum = 138;BA.debugLine="Log(\"Transaction Hash: \" & transactionHash)";
anywheresoftware.b4a.keywords.Common.LogImpl("16553623","Transaction Hash: "+_transactionhash,0);
 //BA.debugLineNum = 139;BA.debugLine="Log(\"Nonce: \" & nonce)";
anywheresoftware.b4a.keywords.Common.LogImpl("16553624","Nonce: "+BA.NumberToString(_nonce),0);
 //BA.debugLineNum = 140;BA.debugLine="Log(\"From: \" & from)";
anywheresoftware.b4a.keywords.Common.LogImpl("16553625","From: "+_from,0);
 //BA.debugLineNum = 141;BA.debugLine="Log(\"Status: \" & responseStatus)";
anywheresoftware.b4a.keywords.Common.LogImpl("16553626","Status: "+_responsestatus,0);
 //BA.debugLineNum = 142;BA.debugLine="Log(\"Receipt: \" & receipt)";
anywheresoftware.b4a.keywords.Common.LogImpl("16553627","Receipt: "+BA.ObjectToString(_receipt),0);
 //BA.debugLineNum = 143;BA.debugLine="pnBlackTransparent.Visible = True";
mostCurrent._pnblacktransparent.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 144;BA.debugLine="pnStatus.Visible = True";
mostCurrent._pnstatus.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 148;BA.debugLine="Log(\"Failed to post the job\")";
anywheresoftware.b4a.keywords.Common.LogImpl("16553633","Failed to post the job",0);
 };
 }else {
 //BA.debugLineNum = 152;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("16553637","Error: "+_job._errormessage /*String*/ ,0);
 };
 }else {
 //BA.debugLineNum = 156;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("16553641","Error: "+_job._errormessage /*String*/ ,0);
 };
 //BA.debugLineNum = 160;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public static String  _postaudit() throws Exception{
pdv.milotin.httpjob _postauditproject = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
anywheresoftware.b4a.objects.collections.Map _data = null;
anywheresoftware.b4a.objects.collections.Map _metadata = null;
String _url = "";
 //BA.debugLineNum = 86;BA.debugLine="Sub PostAudit";
 //BA.debugLineNum = 87;BA.debugLine="Dim PostAuditProject As HttpJob";
_postauditproject = new pdv.milotin.httpjob();
 //BA.debugLineNum = 88;BA.debugLine="PostAuditProject.Initialize(\"PostAuditProject\", M";
_postauditproject._initialize /*String*/ (processBA,"PostAuditProject",addprojectmd.getObject());
 //BA.debugLineNum = 91;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 92;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 93;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 94;BA.debugLine="data.Put(\"contract_address\", kvs.Get(\"audit-contr";
_data.Put((Object)("contract_address"),mostCurrent._kvs._get("audit-contract"));
 //BA.debugLineNum = 95;BA.debugLine="data.Put(\"wallet_address\", txtSetWalletAddress.Te";
_data.Put((Object)("wallet_address"),(Object)(mostCurrent._txtsetwalletaddress.getText()));
 //BA.debugLineNum = 97;BA.debugLine="data.Put(\"callback_url\", \"https://\")";
_data.Put((Object)("callback_url"),(Object)("https://"));
 //BA.debugLineNum = 98;BA.debugLine="Dim metadata As Map";
_metadata = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 99;BA.debugLine="metadata.Initialize";
_metadata.Initialize();
 //BA.debugLineNum = 100;BA.debugLine="metadata.Put(\"project\", txtProjectName.Text)";
_metadata.Put((Object)("project"),(Object)(mostCurrent._txtprojectname.getText()));
 //BA.debugLineNum = 101;BA.debugLine="metadata.Put(\"fund\", txtSetFundAmount.Text)";
_metadata.Put((Object)("fund"),(Object)(mostCurrent._txtsetfundamount.getText()));
 //BA.debugLineNum = 102;BA.debugLine="metadata.Put(\"content\", txtContent.Text)";
_metadata.Put((Object)("content"),(Object)(mostCurrent._txtcontent.getText()));
 //BA.debugLineNum = 103;BA.debugLine="data.Put(\"metadata\", metadata)";
_data.Put((Object)("metadata"),(Object)(_metadata.getObject()));
 //BA.debugLineNum = 104;BA.debugLine="json.Initialize(data)";
_json.Initialize(_data);
 //BA.debugLineNum = 107;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
_url = "https://service-testnet.maschain.com/api/audit/audit/";
 //BA.debugLineNum = 108;BA.debugLine="PostAuditProject.PostString(url, json.ToString)";
_postauditproject._poststring /*String*/ (_url,_json.ToString());
 //BA.debugLineNum = 109;BA.debugLine="PostAuditProject.GetRequest.SetContentType(\"appli";
_postauditproject._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 110;BA.debugLine="PostAuditProject.GetRequest.SetHeader(\"client_id\"";
_postauditproject._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("client_id",BA.ObjectToString(mostCurrent._kvs._get("client_id")));
 //BA.debugLineNum = 111;BA.debugLine="PostAuditProject.GetRequest.SetHeader(\"client_sec";
_postauditproject._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("client_secret",BA.ObjectToString(mostCurrent._kvs._get("client_secret")));
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
}
