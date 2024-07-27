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

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "pdv.milotin", "pdv.milotin.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
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
		activityBA = new BA(this, layout, processBA, "pdv.milotin", "pdv.milotin.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "pdv.milotin.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
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
		return main.class;
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
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
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
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
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
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (homemd.mostCurrent != null);
vis = vis | (sendfundmd.mostCurrent != null);
vis = vis | (usermd.mostCurrent != null);
vis = vis | (historymd.mostCurrent != null);
vis = vis | (fundmd.mostCurrent != null);
vis = vis | (addprojectmd.mostCurrent != null);
vis = vis | (addallocatemd.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (homemd.previousOne != null) {
				__a = homemd.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(homemd.mostCurrent == null ? null : homemd.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (sendfundmd.previousOne != null) {
				__a = sendfundmd.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(sendfundmd.mostCurrent == null ? null : sendfundmd.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (usermd.previousOne != null) {
				__a = usermd.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(usermd.mostCurrent == null ? null : usermd.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (historymd.previousOne != null) {
				__a = historymd.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(historymd.mostCurrent == null ? null : historymd.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (fundmd.previousOne != null) {
				__a = fundmd.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(fundmd.mostCurrent == null ? null : fundmd.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (addprojectmd.previousOne != null) {
				__a = addprojectmd.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(addprojectmd.mostCurrent == null ? null : addprojectmd.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
 {
            Activity __a = null;
            if (addallocatemd.previousOne != null) {
				__a = addallocatemd.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(addallocatemd.mostCurrent == null ? null : addallocatemd.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4a.objects.Timer _timer1 = null;
public static anywheresoftware.b4a.sql.SQL _sql1 = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _cursorsetting = null;
public static String _clientkey = "";
public static String _hashedclientsecret = "";
public static String _tokencontractaddress = "";
public static String _auditcontractaddress = "";
public b4a.example3.keyvaluestore _kvs = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static String _shared = "";
public anywheresoftware.b4a.objects.PanelWrapper _pnmain = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltop = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnusername = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgusername = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtusername = null;
public anywheresoftware.b4a.objects.LabelWrapper _iconcheck = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnpassword = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgpassword = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtpassword = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnwallet = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgwallet = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtwalletaddress = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlogin = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblforgotpassword = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnsplash = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcopyright = null;
public b4a.example.dateutils _dateutils = null;
public pdv.milotin.homemd _homemd = null;
public pdv.milotin.sendfundmd _sendfundmd = null;
public pdv.milotin.usermd _usermd = null;
public pdv.milotin.historymd _historymd = null;
public pdv.milotin.fundmd _fundmd = null;
public pdv.milotin.addprojectmd _addprojectmd = null;
public pdv.milotin.starter _starter = null;
public pdv.milotin.addallocatemd _addallocatemd = null;
public pdv.milotin.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub	 Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Activity.LoadLayout(\"MainLy\")";
mostCurrent._activity.LoadLayout("MainLy",mostCurrent.activityBA);
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
mostCurrent._shared = mostCurrent._rp.GetSafeDirDefaultExternal("");
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
mostCurrent._kvs._initialize(processBA,mostCurrent._shared,"Userdatastore");
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"db.db",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db");
 };
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="If SQL1.IsInitialized = False Then";
if (_sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
_sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=131087;
 //BA.debugLineNum = 131087;BA.debugLine="kvs.Put(\"client_id\",ClientKey)";
mostCurrent._kvs._put("client_id",(Object)(_clientkey));
RDebugUtils.currentLine=131088;
 //BA.debugLineNum = 131088;BA.debugLine="kvs.Put(\"client_secret\",HashedClientSecret)";
mostCurrent._kvs._put("client_secret",(Object)(_hashedclientsecret));
RDebugUtils.currentLine=131089;
 //BA.debugLineNum = 131089;BA.debugLine="kvs.Put(\"token-contract\",TokenContractAddress)";
mostCurrent._kvs._put("token-contract",(Object)(_tokencontractaddress));
RDebugUtils.currentLine=131090;
 //BA.debugLineNum = 131090;BA.debugLine="kvs.Put(\"audit-contract\",AuditContractAddress)";
mostCurrent._kvs._put("audit-contract",(Object)(_auditcontractaddress));
RDebugUtils.currentLine=131091;
 //BA.debugLineNum = 131091;BA.debugLine="kvs.Put(\"wallet-address\",txtWalletAddress.Text)";
mostCurrent._kvs._put("wallet-address",(Object)(mostCurrent._txtwalletaddress.getText()));
RDebugUtils.currentLine=131095;
 //BA.debugLineNum = 131095;BA.debugLine="If FirstTime Then '如果第一次，显示splash screen";
if (_firsttime) { 
RDebugUtils.currentLine=131096;
 //BA.debugLineNum = 131096;BA.debugLine="btnLogin.Visible = False";
mostCurrent._btnlogin.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131097;
 //BA.debugLineNum = 131097;BA.debugLine="pnSplash.Visible=True";
mostCurrent._pnsplash.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131099;
 //BA.debugLineNum = 131099;BA.debugLine="lblCopyright.Visible = True";
mostCurrent._lblcopyright.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131100;
 //BA.debugLineNum = 131100;BA.debugLine="Timer1.Initialize(\"Timer1\", 3000)";
_timer1.Initialize(processBA,"Timer1",(long) (3000));
RDebugUtils.currentLine=131101;
 //BA.debugLineNum = 131101;BA.debugLine="Timer1.Enabled=True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=131103;
 //BA.debugLineNum = 131103;BA.debugLine="pnSplash.Visible=False";
mostCurrent._pnsplash.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131104;
 //BA.debugLineNum = 131104;BA.debugLine="Timer1.Enabled=False";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131106;
 //BA.debugLineNum = 131106;BA.debugLine="lblCopyright.Visible = False";
mostCurrent._lblcopyright.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131107;
 //BA.debugLineNum = 131107;BA.debugLine="btnLogin.Visible = True";
mostCurrent._btnlogin.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=131111;
 //BA.debugLineNum = 131111;BA.debugLine="txtUsername.Text = \"admin\"";
mostCurrent._txtusername.setText(BA.ObjectToCharSequence("admin"));
RDebugUtils.currentLine=131112;
 //BA.debugLineNum = 131112;BA.debugLine="txtPassword.Text = \"admin\"";
mostCurrent._txtpassword.setText(BA.ObjectToCharSequence("admin"));
RDebugUtils.currentLine=131128;
 //BA.debugLineNum = 131128;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
String _str1 = "";
String _str2 = "";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Dim str1 As String";
_str1 = "";
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Dim str2 As String";
_str2 = "";
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Select Case \"English\" 'kvs.GetSimple(\"CurrLangua";
switch (BA.switchObjectToInt("English","中文","English")) {
case 0: {
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="str1 = \"确定要离开吗?\"";
_str1 = "确定要离开吗?";
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="str2 = \"温馨提醒\"";
_str2 = "温馨提醒";
 break; }
case 1: {
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="str1 = \"Are You Sure Want to Exit?\"";
_str1 = "Are You Sure Want to Exit?";
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="str2 = \"Reminder\"";
_str2 = "Reminder";
 break; }
}
;
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="Select Msgbox2(str1,str2,\"Yes\",\"\",\"No\",Null)";
switch (BA.switchObjectToInt(anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(_str1),BA.ObjectToCharSequence(_str2),"Yes","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) {
case 0: {
RDebugUtils.currentLine=589843;
 //BA.debugLineNum = 589843;BA.debugLine="kvs.Put(\"LEAVE\",\"YES\")";
mostCurrent._kvs._put("LEAVE",(Object)("YES"));
RDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="kvs.put(\"Logout\",\"NO\")";
mostCurrent._kvs._put("Logout",(Object)("NO"));
RDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 break; }
default: {
RDebugUtils.currentLine=589847;
 //BA.debugLineNum = 589847;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
}
;
 };
RDebugUtils.currentLine=589851;
 //BA.debugLineNum = 589851;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="End Sub";
return "";
}
public static String  _btnlogin_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlogin_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnlogin_click", null));}
anywheresoftware.b4a.phone.Phone _phone1 = null;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub btnLogin_Click";
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="If txtUsername.Text = \"\" Then";
if ((mostCurrent._txtusername.getText()).equals("")) { 
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="Msgbox(\"Please Fill In Username!\",\"LOGIN\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please Fill In Username!"),BA.ObjectToCharSequence("LOGIN"),mostCurrent.activityBA);
 };
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="If txtPassword.Text = \"\" Then";
if ((mostCurrent._txtpassword.getText()).equals("")) { 
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="Msgbox(\"Please Fill In Password!\",\"LOGIN\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please Fill In Password!"),BA.ObjectToCharSequence("LOGIN"),mostCurrent.activityBA);
 };
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="cursor1 = SQL1.ExecQuery(\"SELECT * FROM ttUser WH";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM ttUser WHERE ttStatus = 1 AND ttUsername = '"+mostCurrent._txtusername.getText()+"'"+" AND ttPassword = '"+mostCurrent._txtpassword.getText()+"'")));
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="If cursor1.RowCount > 0 Then";
if (_cursor1.getRowCount()>0) { 
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="Private Phone1 As Phone";
_phone1 = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="DoEvents";
anywheresoftware.b4a.keywords.Common.DoEvents();
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="Phone1.HideKeyboard(Activity)";
_phone1.HideKeyboard(mostCurrent._activity);
RDebugUtils.currentLine=524307;
 //BA.debugLineNum = 524307;BA.debugLine="DoEvents";
anywheresoftware.b4a.keywords.Common.DoEvents();
RDebugUtils.currentLine=524311;
 //BA.debugLineNum = 524311;BA.debugLine="cursor1.Position = 0";
_cursor1.setPosition((int) (0));
RDebugUtils.currentLine=524312;
 //BA.debugLineNum = 524312;BA.debugLine="kvs.Put(\"CURRID\", cursor1.GetString(\"ID\"))";
mostCurrent._kvs._put("CURRID",(Object)(_cursor1.GetString("ID")));
RDebugUtils.currentLine=524314;
 //BA.debugLineNum = 524314;BA.debugLine="kvs.Put(\"REMUSERID\", txtUsername.Text)";
mostCurrent._kvs._put("REMUSERID",(Object)(mostCurrent._txtusername.getText()));
RDebugUtils.currentLine=524315;
 //BA.debugLineNum = 524315;BA.debugLine="kvs.Put(\"CURRUSERNAME\", cursor1.GetString(\"ttUse";
mostCurrent._kvs._put("CURRUSERNAME",(Object)(_cursor1.GetString("ttUsername")));
RDebugUtils.currentLine=524316;
 //BA.debugLineNum = 524316;BA.debugLine="kvs.Put(\"CURRUSERROLE\", cursor1.GetString(\"ttUse";
mostCurrent._kvs._put("CURRUSERROLE",(Object)(_cursor1.GetString("ttUserRole")));
 }else {
RDebugUtils.currentLine=524319;
 //BA.debugLineNum = 524319;BA.debugLine="Msgbox(\"Incorrect Username Or Password!\",\"LOGIN";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Incorrect Username Or Password!"),BA.ObjectToCharSequence("LOGIN FAIL"),mostCurrent.activityBA);
RDebugUtils.currentLine=524320;
 //BA.debugLineNum = 524320;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=524333;
 //BA.debugLineNum = 524333;BA.debugLine="GetWallet";
_getwallet();
RDebugUtils.currentLine=524335;
 //BA.debugLineNum = 524335;BA.debugLine="End Sub";
return "";
}
public static String  _getwallet() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getwallet", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getwallet", null));}
pdv.milotin.httpjob _jobgetwallet = null;
String _address = "";
String _url = "";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub GetWallet";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="Dim JobGetWallet As HttpJob";
_jobgetwallet = new pdv.milotin.httpjob();
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="JobGetWallet.Initialize(\"JobGetWallet\", Me)";
_jobgetwallet._initialize /*String*/ (null,processBA,"JobGetWallet",main.getObject());
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="Dim address As String = txtWalletAddress.Text'\"0x";
_address = mostCurrent._txtwalletaddress.getText();
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
_url = "https://service-testnet.maschain.com/api/wallet/wallet/"+_address;
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="JobGetWallet.Download(url)";
_jobgetwallet._download /*String*/ (null,_url);
RDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="JobGetWallet.GetRequest.SetHeader(\"client_id\", Cl";
_jobgetwallet._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_id",_clientkey);
RDebugUtils.currentLine=262152;
 //BA.debugLineNum = 262152;BA.debugLine="JobGetWallet.GetRequest.SetHeader(\"client_secret\"";
_jobgetwallet._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_secret",_hashedclientsecret);
RDebugUtils.currentLine=262154;
 //BA.debugLineNum = 262154;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(pdv.milotin.httpjob _job) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
String _jsonstring = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _result = null;
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub JobDone(job As HttpJob)";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="If job.Success = True Then";
if (_job._success /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="Dim jsonString As String = job.GetString";
_jsonstring = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="Log(jsonString)";
anywheresoftware.b4a.keywords.Common.LogImpl("4327686",_jsonstring,0);
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="parser.Initialize(jsonString)";
_parser.Initialize(_jsonstring);
RDebugUtils.currentLine=327691;
 //BA.debugLineNum = 327691;BA.debugLine="If job.JobName = \"JobGetWallet\" Then";
if ((_job._jobname /*String*/ ).equals("JobGetWallet")) { 
RDebugUtils.currentLine=327694;
 //BA.debugLineNum = 327694;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=327695;
 //BA.debugLineNum = 327695;BA.debugLine="Dim result As Map = root.Get(\"result\")";
_result = new anywheresoftware.b4a.objects.collections.Map();
_result = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("result"))));
RDebugUtils.currentLine=327698;
 //BA.debugLineNum = 327698;BA.debugLine="kvs.Put(\"WalletId\",result.Get(\"id\"))";
mostCurrent._kvs._put("WalletId",_result.Get((Object)("id")));
RDebugUtils.currentLine=327699;
 //BA.debugLineNum = 327699;BA.debugLine="kvs.Put(\"WalletAddress\",result.Get(\"address\"))";
mostCurrent._kvs._put("WalletAddress",_result.Get((Object)("address")));
RDebugUtils.currentLine=327700;
 //BA.debugLineNum = 327700;BA.debugLine="kvs.Put(\"WalletName\",result.Get(\"name\"))";
mostCurrent._kvs._put("WalletName",_result.Get((Object)("name")));
 };
 }else {
RDebugUtils.currentLine=327707;
 //BA.debugLineNum = 327707;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=327711;
 //BA.debugLineNum = 327711;BA.debugLine="job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=327713;
 //BA.debugLineNum = 327713;BA.debugLine="StartActivity(\"HomeMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("HomeMd"));
RDebugUtils.currentLine=327714;
 //BA.debugLineNum = 327714;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=327715;
 //BA.debugLineNum = 327715;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "timer1_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "timer1_tick", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Timer1_tick";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="pnSplash.Visible=False";
mostCurrent._pnsplash.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="Timer1.Enabled = False";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="btnLogin.Visible = True";
mostCurrent._btnlogin.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=196615;
 //BA.debugLineNum = 196615;BA.debugLine="End Sub";
return "";
}
}