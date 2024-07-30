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

public class usermd extends Activity implements B4AActivity{
	public static usermd mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "pdv.milotin", "pdv.milotin.usermd");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (usermd).");
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
		activityBA = new BA(this, layout, processBA, "pdv.milotin", "pdv.milotin.usermd");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "pdv.milotin.usermd", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (usermd) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (usermd) Resume **");
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
		return usermd.class;
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
            BA.LogInfo("** Activity (usermd) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (usermd) Pause event (activity is not paused). **");
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
            usermd mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (usermd) Resume **");
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
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmr = null;
public pdv.milotin.qrcode _qr = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnheader1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltop = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblbottom = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhome = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfund = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhistory = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbluser = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmybalance = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblamount = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblline1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhome2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfund2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhistory2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbluser2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgback = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgqr = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmyaddress = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncopyaddress = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imguseravatar = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnframe2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfullname = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnfullname = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblemail = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnemail = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnpassword = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnphone = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblpassword = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblphone = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtfullname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtemail = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtpassword = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtphone = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgphone = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgpassword = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgemail = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgfullname = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgedit = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgsave = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcertificate = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncertificate = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgkyc = null;
public b4a.example.dateutils _dateutils = null;
public pdv.milotin.main _main = null;
public pdv.milotin.homemd _homemd = null;
public pdv.milotin.sendfundmd _sendfundmd = null;
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
 //BA.debugLineNum = 67;BA.debugLine="Activity.LoadLayout(\"UserLy\")";
mostCurrent._activity.LoadLayout("UserLy",mostCurrent.activityBA);
 //BA.debugLineNum = 69;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
mostCurrent._shared = mostCurrent._rp.GetSafeDirDefaultExternal("");
 //BA.debugLineNum = 70;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
mostCurrent._kvs._initialize(processBA,mostCurrent._shared,"Userdatastore");
 //BA.debugLineNum = 71;BA.debugLine="qr.Initialize";
mostCurrent._qr._initialize /*String*/ (processBA);
 //BA.debugLineNum = 73;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 74;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"db.db",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db");
 };
 //BA.debugLineNum = 77;BA.debugLine="If SQL1.IsInitialized = False Then";
if (mostCurrent._sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 78;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
mostCurrent._sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db",anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public static String  _btncertificate_click() throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Private Sub btnCertificate_Click";
 //BA.debugLineNum = 187;BA.debugLine="StartActivity(\"CertMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("CertMd"));
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 19;BA.debugLine="Dim bmr As Bitmap";
mostCurrent._bmr = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim qr As QRcode";
mostCurrent._qr = new pdv.milotin.qrcode();
 //BA.debugLineNum = 22;BA.debugLine="Private pnHeader1 As Panel";
mostCurrent._pnheader1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private lblTop As Label";
mostCurrent._lbltop = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private lblBottom As Label";
mostCurrent._lblbottom = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private lblHome As Label";
mostCurrent._lblhome = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private lblFund As Label";
mostCurrent._lblfund = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private lblHistory As Label";
mostCurrent._lblhistory = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private lblUser As Label";
mostCurrent._lbluser = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private lblMyBalance As Label";
mostCurrent._lblmybalance = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private lblAmount As Label";
mostCurrent._lblamount = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private lblLine1 As Label";
mostCurrent._lblline1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private lblHome2 As Label";
mostCurrent._lblhome2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private lblFund2 As Label";
mostCurrent._lblfund2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private lblHistory2 As Label";
mostCurrent._lblhistory2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private lblUser2 As Label";
mostCurrent._lbluser2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private imgBack As ImageView";
mostCurrent._imgback = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private imgQR As ImageView";
mostCurrent._imgqr = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private lblMyAddress As Label";
mostCurrent._lblmyaddress = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private btnCopyAddress As Button";
mostCurrent._btncopyaddress = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private imgUserAvatar As ImageView";
mostCurrent._imguseravatar = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private pnFrame2 As Panel";
mostCurrent._pnframe2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private lblFullName As Label";
mostCurrent._lblfullname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private pnFullName As Panel";
mostCurrent._pnfullname = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private lblEmail As Label";
mostCurrent._lblemail = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private pnEmail As Panel";
mostCurrent._pnemail = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private pnPassword As Panel";
mostCurrent._pnpassword = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private pnPhone As Panel";
mostCurrent._pnphone = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private lblPassword As Label";
mostCurrent._lblpassword = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private lblPhone As Label";
mostCurrent._lblphone = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 50;BA.debugLine="Private txtFullName As EditText";
mostCurrent._txtfullname = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Private txtEmail As EditText";
mostCurrent._txtemail = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private txtPassword As EditText";
mostCurrent._txtpassword = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private txtPhone As EditText";
mostCurrent._txtphone = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 54;BA.debugLine="Private imgPhone As ImageView";
mostCurrent._imgphone = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Private imgPassword As ImageView";
mostCurrent._imgpassword = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 56;BA.debugLine="Private imgEmail As ImageView";
mostCurrent._imgemail = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 57;BA.debugLine="Private imgFullName As ImageView";
mostCurrent._imgfullname = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 58;BA.debugLine="Private imgEdit As ImageView";
mostCurrent._imgedit = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 59;BA.debugLine="Private imgSave As ImageView";
mostCurrent._imgsave = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 60;BA.debugLine="Private lblCertificate As Label";
mostCurrent._lblcertificate = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 61;BA.debugLine="Private btnCertificate As Button";
mostCurrent._btncertificate = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Private imgKYC As ImageView";
mostCurrent._imgkyc = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public static String  _imgback_click() throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Private Sub imgBack_Click";
 //BA.debugLineNum = 126;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public static String  _imgedit_click() throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Private Sub imgEdit_Click";
 //BA.debugLineNum = 146;BA.debugLine="txtFullName.Enabled = True";
mostCurrent._txtfullname.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 147;BA.debugLine="txtEmail.Enabled = True";
mostCurrent._txtemail.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 148;BA.debugLine="txtPassword.Enabled = True";
mostCurrent._txtpassword.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 149;BA.debugLine="txtPhone.Enabled = True";
mostCurrent._txtphone.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 150;BA.debugLine="txtFullName.TextColor = Colors.RGB(0,0,0)";
mostCurrent._txtfullname.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 151;BA.debugLine="txtEmail.TextColor = Colors.RGB(0,0,0)";
mostCurrent._txtemail.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 152;BA.debugLine="txtPassword.TextColor = Colors.RGB(0,0,0)";
mostCurrent._txtpassword.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 153;BA.debugLine="txtPhone.TextColor = Colors.RGB(0,0,0)";
mostCurrent._txtphone.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 154;BA.debugLine="imgSave.Visible = True";
mostCurrent._imgsave.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 155;BA.debugLine="imgSave.Enabled = True";
mostCurrent._imgsave.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 156;BA.debugLine="imgEdit.Visible = False";
mostCurrent._imgedit.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 157;BA.debugLine="imgEdit.Enabled = False";
mostCurrent._imgedit.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public static String  _imgkyc_click() throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Private Sub imgKYC_Click";
 //BA.debugLineNum = 192;BA.debugLine="StartActivity(\"KYC1Md\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("KYC1Md"));
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public static String  _imgsave_click() throws Exception{
String _strfullname = "";
String _stremail = "";
String _strpassword = "";
String _strphone = "";
 //BA.debugLineNum = 160;BA.debugLine="Private Sub imgSave_Click";
 //BA.debugLineNum = 162;BA.debugLine="Dim strFullName As String = txtFullName.Text";
_strfullname = mostCurrent._txtfullname.getText();
 //BA.debugLineNum = 163;BA.debugLine="txtFullName.Text = strFullName";
mostCurrent._txtfullname.setText(BA.ObjectToCharSequence(_strfullname));
 //BA.debugLineNum = 164;BA.debugLine="Dim strEmail As String = txtEmail.Text";
_stremail = mostCurrent._txtemail.getText();
 //BA.debugLineNum = 165;BA.debugLine="txtEmail.Text = strEmail";
mostCurrent._txtemail.setText(BA.ObjectToCharSequence(_stremail));
 //BA.debugLineNum = 166;BA.debugLine="Dim strPassword As String = txtPassword.Text";
_strpassword = mostCurrent._txtpassword.getText();
 //BA.debugLineNum = 167;BA.debugLine="txtPassword.Text = strPassword";
mostCurrent._txtpassword.setText(BA.ObjectToCharSequence(_strpassword));
 //BA.debugLineNum = 168;BA.debugLine="Dim strPhone As String = txtPhone.Text";
_strphone = mostCurrent._txtphone.getText();
 //BA.debugLineNum = 169;BA.debugLine="txtPhone.Text = strPhone";
mostCurrent._txtphone.setText(BA.ObjectToCharSequence(_strphone));
 //BA.debugLineNum = 171;BA.debugLine="txtFullName.Enabled = False";
mostCurrent._txtfullname.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 172;BA.debugLine="txtEmail.Enabled = False";
mostCurrent._txtemail.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 173;BA.debugLine="txtPassword.Enabled = False";
mostCurrent._txtpassword.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 174;BA.debugLine="txtPhone.Enabled = False";
mostCurrent._txtphone.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 175;BA.debugLine="txtFullName.TextColor = Colors.RGB(149,149,149)";
mostCurrent._txtfullname.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (149),(int) (149),(int) (149)));
 //BA.debugLineNum = 176;BA.debugLine="txtEmail.TextColor = Colors.RGB(149,149,149)";
mostCurrent._txtemail.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (149),(int) (149),(int) (149)));
 //BA.debugLineNum = 177;BA.debugLine="txtPassword.TextColor = Colors.RGB(149,149,149)";
mostCurrent._txtpassword.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (149),(int) (149),(int) (149)));
 //BA.debugLineNum = 178;BA.debugLine="txtPhone.TextColor = Colors.RGB(149,149,149)";
mostCurrent._txtphone.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (149),(int) (149),(int) (149)));
 //BA.debugLineNum = 179;BA.debugLine="imgEdit.Visible = True";
mostCurrent._imgedit.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 180;BA.debugLine="imgEdit.Enabled = True";
mostCurrent._imgedit.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 181;BA.debugLine="imgSave.Visible = False";
mostCurrent._imgsave.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 182;BA.debugLine="imgSave.Enabled = False";
mostCurrent._imgsave.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 183;BA.debugLine="ToastMessageShow(\"Save Succesful!\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Save Succesful!"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public static String  _lblfund_click() throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Private Sub lblFund_Click";
 //BA.debugLineNum = 112;BA.debugLine="StartActivity(\"FundMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("FundMd"));
 //BA.debugLineNum = 113;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public static String  _lblhistory_click() throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Private Sub lblHistory_Click";
 //BA.debugLineNum = 117;BA.debugLine="StartActivity(\"HistoryMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("HistoryMd"));
 //BA.debugLineNum = 118;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public static String  _lblhome_click() throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Private Sub lblHome_Click";
 //BA.debugLineNum = 108;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public static String  _lbluser_click() throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Private Sub lblUser_Click";
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
}
