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

public class homemd extends Activity implements B4AActivity{
	public static homemd mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "pdv.milotin", "pdv.milotin.homemd");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (homemd).");
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
		activityBA = new BA(this, layout, processBA, "pdv.milotin", "pdv.milotin.homemd");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "pdv.milotin.homemd", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (homemd) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (homemd) Resume **");
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
		return homemd.class;
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
            BA.LogInfo("** Activity (homemd) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (homemd) Pause event (activity is not paused). **");
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
            homemd mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (homemd) Resume **");
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
public anywheresoftware.b4a.objects.LabelWrapper _lblheaderbg = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltop = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblbottom = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfund = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhistory = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbluser = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblheader1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblheader2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblamount = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltotal = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprojecttitle2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprojectfund2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprojecttitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprojectfund = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprojectprogress = null;
public pdv.milotin.customlistview _clvhome = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnheader1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhome = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblline1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhome2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfund2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhistory2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbluser2 = null;
public pdv.milotin.circularprogressbar _cpbar1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprojectprogress2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblwalletname = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgmenu = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgproject = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgfunding = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgprogress = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlistview = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnadd = null;
public b4a.example.dateutils _dateutils = null;
public pdv.milotin.main _main = null;
public pdv.milotin.sendfundmd _sendfundmd = null;
public pdv.milotin.usermd _usermd = null;
public pdv.milotin.historymd _historymd = null;
public pdv.milotin.fundmd _fundmd = null;
public pdv.milotin.addprojectmd _addprojectmd = null;
public pdv.milotin.starter _starter = null;
public pdv.milotin.addallocatemd _addallocatemd = null;
public pdv.milotin.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="homemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Activity.LoadLayout(\"HomeLy\")";
mostCurrent._activity.LoadLayout("HomeLy",mostCurrent.activityBA);
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
mostCurrent._shared = mostCurrent._rp.GetSafeDirDefaultExternal("");
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
mostCurrent._kvs._initialize(processBA,mostCurrent._shared,"Userdatastore");
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"db.db",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db");
 };
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="If SQL1.IsInitialized = False Then";
if (mostCurrent._sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
mostCurrent._sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="lblWalletName.Text = kvs.Get(\"WalletName\")";
mostCurrent._lblwalletname.setText(BA.ObjectToCharSequence(mostCurrent._kvs._get("WalletName")));
RDebugUtils.currentLine=458769;
 //BA.debugLineNum = 458769;BA.debugLine="GetAudit";
_getaudit();
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="End Sub";
return "";
}
public static String  _getaudit() throws Exception{
RDebugUtils.currentModule="homemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getaudit", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getaudit", null));}
pdv.milotin.httpjob _jobgetaudit = null;
String _url = "";
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub GetAudit";
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Dim JobGetAudit As HttpJob";
_jobgetaudit = new pdv.milotin.httpjob();
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="JobGetAudit.Initialize(\"JobGetAudit\", Me)";
_jobgetaudit._initialize /*String*/ (null,processBA,"JobGetAudit",homemd.getObject());
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
_url = "https://service-testnet.maschain.com/api/audit/audit?tag=5";
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="JobGetAudit.Download(url)";
_jobgetaudit._download /*String*/ (null,_url);
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="JobGetAudit.GetRequest.SetHeader(\"client_id\", kvs";
_jobgetaudit._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_id",BA.ObjectToString(mostCurrent._kvs._get("client_id")));
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="JobGetAudit.GetRequest.SetHeader(\"client_secret\",";
_jobgetaudit._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_secret",BA.ObjectToString(mostCurrent._kvs._get("client_secret")));
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="homemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
String _str1 = "";
String _str2 = "";
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Dim str1 As String";
_str1 = "";
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Dim str2 As String";
_str2 = "";
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="Select Case \"English\" 'kvs.GetSimple(\"CurrLangua";
switch (BA.switchObjectToInt("English","中文","English")) {
case 0: {
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="str1 = \"确定要离开吗?\"";
_str1 = "确定要离开吗?";
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="str2 = \"温馨提醒\"";
_str2 = "温馨提醒";
 break; }
case 1: {
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="str1 = \"Are You Sure Want to Exit?\"";
_str1 = "Are You Sure Want to Exit?";
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="str2 = \"Reminder\"";
_str2 = "Reminder";
 break; }
}
;
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="Select Msgbox2(str1,str2,\"Yes\",\"\",\"No\",Null)";
switch (BA.switchObjectToInt(anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(_str1),BA.ObjectToCharSequence(_str2),"Yes","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) {
case 0: {
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="kvs.Put(\"LEAVE\",\"YES\")";
mostCurrent._kvs._put("LEAVE",(Object)("YES"));
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="kvs.put(\"Logout\",\"NO\")";
mostCurrent._kvs._put("Logout",(Object)("NO"));
RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 break; }
default: {
RDebugUtils.currentLine=983063;
 //BA.debugLineNum = 983063;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
}
;
 };
RDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="homemd";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="homemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
public static String  _btnadd_click() throws Exception{
RDebugUtils.currentModule="homemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnadd_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnadd_click", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub btnAdd_Click";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="StartActivity(\"AddProjectMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("AddProjectMd"));
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return "";
}
public static String  _clvhome_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="homemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clvhome_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clvhome_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub clvHome_ItemClick (Index As Int, Value As Obje";
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="kvs.Put(\"AuditTransactionHash\",Value)";
mostCurrent._kvs._put("AuditTransactionHash",_value);
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Log(kvs.Get(\"AuditTransactionHash\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("0917508",BA.ObjectToString(mostCurrent._kvs._get("AuditTransactionHash")),0);
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="StartActivity(\"SendFundMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("SendFundMd"));
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createlistitem(String _strid,String _strproject,String _strfund,String _strprogress,String _strprojectwallet,String _strstatus,int _width,int _height) throws Exception{
RDebugUtils.currentModule="homemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createlistitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createlistitem", new Object[] {_strid,_strproject,_strfund,_strprogress,_strprojectwallet,_strstatus,_width,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub CreateListItem(strID As String, strProject As";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Activity.AddView(p, 0, 0, 96%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (96),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="p.LoadLayout(\"ListViewLy1\")";
_p.LoadLayout("ListViewLy1",mostCurrent.activityBA);
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="lblProjectTitle2.Text = strProject";
mostCurrent._lblprojecttitle2.setText(BA.ObjectToCharSequence(_strproject));
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="lblProjectFund2.Text = \"RM \" & NumberFormat2(str";
mostCurrent._lblprojectfund2.setText(BA.ObjectToCharSequence("RM "+anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_strfund)),(int) (0),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.True)));
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="Log(StrProgress)";
anywheresoftware.b4a.keywords.Common.LogImpl("0851979",_strprogress,0);
RDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="If StrProgress = Null Or StrProgress = \"null\" The";
if (_strprogress== null || (_strprogress).equals("null")) { 
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(1, 30";
mostCurrent._lblprojectprogress2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (1),(int) (302),(int) (36)));
RDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="lblProjectProgress2.Text = \"Fundraising Complete";
mostCurrent._lblprojectprogress2.setText(BA.ObjectToCharSequence("Fundraising Completed"));
 }else 
{RDebugUtils.currentLine=851983;
 //BA.debugLineNum = 851983;BA.debugLine="Else If StrProgress <> \"100\" Then";
if ((_strprogress).equals("100") == false) { 
RDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(254,";
mostCurrent._lblprojectprogress2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (254),(int) (171),(int) (43)));
RDebugUtils.currentLine=851985;
 //BA.debugLineNum = 851985;BA.debugLine="lblProjectProgress2.Text = \"Fundraising in progr";
mostCurrent._lblprojectprogress2.setText(BA.ObjectToCharSequence("Fundraising in progress"));
 }else {
RDebugUtils.currentLine=851987;
 //BA.debugLineNum = 851987;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(1, 30";
mostCurrent._lblprojectprogress2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (1),(int) (302),(int) (36)));
RDebugUtils.currentLine=851988;
 //BA.debugLineNum = 851988;BA.debugLine="lblProjectProgress2.Text = \"Fundraising Complete";
mostCurrent._lblprojectprogress2.setText(BA.ObjectToCharSequence("Fundraising Completed"));
 }}
;
RDebugUtils.currentLine=852003;
 //BA.debugLineNum = 852003;BA.debugLine="If StrProgress = Null Or StrProgress = \"null\" The";
if (_strprogress== null || (_strprogress).equals("null")) { 
RDebugUtils.currentLine=852004;
 //BA.debugLineNum = 852004;BA.debugLine="StrProgress = \"30\"";
_strprogress = "30";
RDebugUtils.currentLine=852005;
 //BA.debugLineNum = 852005;BA.debugLine="cpBar1.Value = StrProgress";
mostCurrent._cpbar1._setvalue /*float*/ (null,(float)(Double.parseDouble(_strprogress)));
 }else {
RDebugUtils.currentLine=852007;
 //BA.debugLineNum = 852007;BA.debugLine="cpBar1.Value = StrProgress";
mostCurrent._cpbar1._setvalue /*float*/ (null,(float)(Double.parseDouble(_strprogress)));
 };
RDebugUtils.currentLine=852009;
 //BA.debugLineNum = 852009;BA.debugLine="cpBar1.Value = StrProgress";
mostCurrent._cpbar1._setvalue /*float*/ (null,(float)(Double.parseDouble(_strprogress)));
RDebugUtils.currentLine=852010;
 //BA.debugLineNum = 852010;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=852012;
 //BA.debugLineNum = 852012;BA.debugLine="End Sub";
return null;
}
public static String  _gettokenbalance() throws Exception{
RDebugUtils.currentModule="homemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "gettokenbalance", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "gettokenbalance", null));}
pdv.milotin.httpjob _jobgettokenbalance = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
anywheresoftware.b4a.objects.collections.Map _data = null;
String _url = "";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub GetTokenBalance";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim JobGetTokenBalance As HttpJob";
_jobgettokenbalance = new pdv.milotin.httpjob();
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="JobGetTokenBalance.Initialize(\"JobGetTokenBalance";
_jobgettokenbalance._initialize /*String*/ (null,processBA,"JobGetTokenBalance",homemd.getObject());
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="data.Put(\"wallet_address\", kvs.Get(\"WalletAddress";
_data.Put((Object)("wallet_address"),mostCurrent._kvs._get("WalletAddress"));
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="data.Put(\"contract_address\", kvs.Get(\"token-contr";
_data.Put((Object)("contract_address"),mostCurrent._kvs._get("token-contract"));
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="json.Initialize(data)";
_json.Initialize(_data);
RDebugUtils.currentLine=655374;
 //BA.debugLineNum = 655374;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
_url = "https://service-testnet.maschain.com/api/token/balance/";
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="JobGetTokenBalance.PostString(url, json.ToString)";
_jobgettokenbalance._poststring /*String*/ (null,_url,_json.ToString());
RDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="JobGetTokenBalance.GetRequest.SetContentType(\"app";
_jobgettokenbalance._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=655377;
 //BA.debugLineNum = 655377;BA.debugLine="JobGetTokenBalance.GetRequest.SetHeader(\"client_i";
_jobgettokenbalance._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_id",BA.ObjectToString(mostCurrent._kvs._get("client_id")));
RDebugUtils.currentLine=655378;
 //BA.debugLineNum = 655378;BA.debugLine="JobGetTokenBalance.GetRequest.SetHeader(\"client_s";
_jobgettokenbalance._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_secret",BA.ObjectToString(mostCurrent._kvs._get("client_secret")));
RDebugUtils.currentLine=655379;
 //BA.debugLineNum = 655379;BA.debugLine="End Sub";
return "";
}
public static String  _imgmenu_click() throws Exception{
RDebugUtils.currentModule="homemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgmenu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgmenu_click", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub imgMenu_Click";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(pdv.milotin.httpjob _job) throws Exception{
RDebugUtils.currentModule="homemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
String _jsonstring = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _results = null;
int _numberofitems = 0;
double _totalfund = 0;
anywheresoftware.b4a.objects.collections.Map _result = null;
String _metadatastring = "";
anywheresoftware.b4a.objects.collections.JSONParser _metadataparser = null;
anywheresoftware.b4a.objects.collections.Map _metadata = null;
double _fund = 0;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gd = null;
String _stramount = "";
double _amount = 0;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="Dim jsonString As String = Job.GetString";
_jsonstring = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="Log(jsonString)";
anywheresoftware.b4a.keywords.Common.LogImpl("0786439",_jsonstring,0);
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="parser.Initialize(jsonString)";
_parser.Initialize(_jsonstring);
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="If Job.JobName = \"JobGetAudit\" Then";
if ((_job._jobname /*String*/ ).equals("JobGetAudit")) { 
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="clvHome.Clear";
mostCurrent._clvhome._clear /*String*/ (null);
RDebugUtils.currentLine=786448;
 //BA.debugLineNum = 786448;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="Dim results As List = root.Get(\"result\")";
_results = new anywheresoftware.b4a.objects.collections.List();
_results = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("result"))));
RDebugUtils.currentLine=786450;
 //BA.debugLineNum = 786450;BA.debugLine="Dim numberOfItems As Int = results.Size";
_numberofitems = _results.getSize();
RDebugUtils.currentLine=786451;
 //BA.debugLineNum = 786451;BA.debugLine="Log(\"Number of items in result: \" & numberOfIte";
anywheresoftware.b4a.keywords.Common.LogImpl("0786451","Number of items in result: "+BA.NumberToString(_numberofitems),0);
RDebugUtils.currentLine=786452;
 //BA.debugLineNum = 786452;BA.debugLine="Dim totalFund As Double = 0 ' Initialize total";
_totalfund = 0;
RDebugUtils.currentLine=786453;
 //BA.debugLineNum = 786453;BA.debugLine="For Each result As Map In results";
_result = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group14 = _results;
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_result = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group14.Get(index14)));
RDebugUtils.currentLine=786455;
 //BA.debugLineNum = 786455;BA.debugLine="Dim metadataString As String = result.Get(\"met";
_metadatastring = BA.ObjectToString(_result.Get((Object)("metadata")));
RDebugUtils.currentLine=786458;
 //BA.debugLineNum = 786458;BA.debugLine="Dim metadataParser As JSONParser";
_metadataparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=786459;
 //BA.debugLineNum = 786459;BA.debugLine="metadataParser.Initialize(metadataString)";
_metadataparser.Initialize(_metadatastring);
RDebugUtils.currentLine=786460;
 //BA.debugLineNum = 786460;BA.debugLine="Dim metadata As Map = metadataParser.NextObjec";
_metadata = new anywheresoftware.b4a.objects.collections.Map();
_metadata = _metadataparser.NextObject();
RDebugUtils.currentLine=786461;
 //BA.debugLineNum = 786461;BA.debugLine="Dim fund As Double";
_fund = 0;
RDebugUtils.currentLine=786462;
 //BA.debugLineNum = 786462;BA.debugLine="fund = metadata.Get(\"fund\")";
_fund = (double)(BA.ObjectToNumber(_metadata.Get((Object)("fund"))));
RDebugUtils.currentLine=786463;
 //BA.debugLineNum = 786463;BA.debugLine="totalFund = totalFund + fund";
_totalfund = _totalfund+_fund;
RDebugUtils.currentLine=786465;
 //BA.debugLineNum = 786465;BA.debugLine="lblTotal.Text = root.Get(\"result\")";
mostCurrent._lbltotal.setText(BA.ObjectToCharSequence(_root.Get((Object)("result"))));
RDebugUtils.currentLine=786466;
 //BA.debugLineNum = 786466;BA.debugLine="lblAmount.Text = \"RM \" & NumberFormat2(totalFu";
mostCurrent._lblamount.setText(BA.ObjectToCharSequence("RM "+anywheresoftware.b4a.keywords.Common.NumberFormat2(_totalfund,(int) (0),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.True)));
RDebugUtils.currentLine=786467;
 //BA.debugLineNum = 786467;BA.debugLine="Log(totalFund)";
anywheresoftware.b4a.keywords.Common.LogImpl("0786467",BA.NumberToString(_totalfund),0);
RDebugUtils.currentLine=786469;
 //BA.debugLineNum = 786469;BA.debugLine="clvHome.Add(CreateListItem(result.Get(\"id\"),me";
mostCurrent._clvhome._add /*String*/ (null,_createlistitem(BA.ObjectToString(_result.Get((Object)("id"))),BA.ObjectToString(_metadata.Get((Object)("project"))),BA.ObjectToString(_metadata.Get((Object)("fund"))),BA.ObjectToString(_metadata.Get((Object)("progress"))),BA.ObjectToString(_metadata.Get((Object)("project_wallet"))),BA.ObjectToString(_metadata.Get((Object)("status"))),mostCurrent._clvhome._asview /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ (null).getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (55))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)),_result.Get((Object)("transactionHash")));
RDebugUtils.currentLine=786470;
 //BA.debugLineNum = 786470;BA.debugLine="Dim gd As GradientDrawable";
_gd = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=786471;
 //BA.debugLineNum = 786471;BA.debugLine="gd.Initialize(\"TR_BL\", Array As Int(Colors.ARG";
_gd.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TR_BL"),new int[]{anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (0),(int) (255),(int) (255),(int) (255)),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (0),(int) (255),(int) (255),(int) (255))});
RDebugUtils.currentLine=786472;
 //BA.debugLineNum = 786472;BA.debugLine="gd.CornerRadius = 20dip ' Adjust corner radius";
_gd.setCornerRadius((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20))));
RDebugUtils.currentLine=786474;
 //BA.debugLineNum = 786474;BA.debugLine="clvHome.AsView.Background = gd";
mostCurrent._clvhome._asview /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ (null).setBackground((android.graphics.drawable.Drawable)(_gd.getObject()));
 }
};
RDebugUtils.currentLine=786478;
 //BA.debugLineNum = 786478;BA.debugLine="lblTotal.Text = numberOfItems";
mostCurrent._lbltotal.setText(BA.ObjectToCharSequence(_numberofitems));
RDebugUtils.currentLine=786480;
 //BA.debugLineNum = 786480;BA.debugLine="GetTokenBalance";
_gettokenbalance();
 }else 
{RDebugUtils.currentLine=786482;
 //BA.debugLineNum = 786482;BA.debugLine="Else If Job.JobName = \"JobGetTokenBalance\" Then";
if ((_job._jobname /*String*/ ).equals("JobGetTokenBalance")) { 
RDebugUtils.currentLine=786483;
 //BA.debugLineNum = 786483;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=786484;
 //BA.debugLineNum = 786484;BA.debugLine="Dim strAmount As String = root.Get(\"result\")";
_stramount = BA.ObjectToString(_root.Get((Object)("result")));
RDebugUtils.currentLine=786487;
 //BA.debugLineNum = 786487;BA.debugLine="Dim amount As Double";
_amount = 0;
RDebugUtils.currentLine=786488;
 //BA.debugLineNum = 786488;BA.debugLine="amount = strAmount";
_amount = (double)(Double.parseDouble(_stramount));
 }else {
RDebugUtils.currentLine=786493;
 //BA.debugLineNum = 786493;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("0786493","Error: "+_job._errormessage /*String*/ ,0);
 }}
;
 }else {
RDebugUtils.currentLine=786498;
 //BA.debugLineNum = 786498;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("0786498","Error: "+_job._errormessage /*String*/ ,0);
 };
RDebugUtils.currentLine=786502;
 //BA.debugLineNum = 786502;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=786504;
 //BA.debugLineNum = 786504;BA.debugLine="End Sub";
return "";
}
public static String  _lblfund_click() throws Exception{
RDebugUtils.currentModule="homemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblfund_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblfund_click", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub lblFund_Click";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="StartActivity(\"FundMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("FundMd"));
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
public static String  _lblhistory_click() throws Exception{
RDebugUtils.currentModule="homemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblhistory_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblhistory_click", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub lblHistory_Click";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="StartActivity(\"HistoryMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("HistoryMd"));
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return "";
}
public static String  _lbluser_click() throws Exception{
RDebugUtils.currentModule="homemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbluser_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbluser_click", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub lblUser_Click";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="StartActivity(\"UserMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("UserMd"));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="End Sub";
return "";
}
}