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

public class addallocatemd extends Activity implements B4AActivity{
	public static addallocatemd mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "pdv.milotin", "pdv.milotin.addallocatemd");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (addallocatemd).");
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
		activityBA = new BA(this, layout, processBA, "pdv.milotin", "pdv.milotin.addallocatemd");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "pdv.milotin.addallocatemd", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (addallocatemd) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (addallocatemd) Resume **");
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
		return addallocatemd.class;
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
            BA.LogInfo("** Activity (addallocatemd) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (addallocatemd) Pause event (activity is not paused). **");
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
            addallocatemd mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (addallocatemd) Resume **");
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
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
public anywheresoftware.b4a.objects.LabelWrapper _lblallocatecategory = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _cbocategory = null;
public anywheresoftware.b4a.objects.PanelWrapper _pncategory = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgcategory = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblallocatefund = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtallocatefund = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnallocatefund = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgallocatefund = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblallocateamount = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblremark = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnremark = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtremark = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgremark = null;
public b4a.example.dateutils _dateutils = null;
public pdv.milotin.main _main = null;
public pdv.milotin.homemd _homemd = null;
public pdv.milotin.sendfundmd _sendfundmd = null;
public pdv.milotin.usermd _usermd = null;
public pdv.milotin.historymd _historymd = null;
public pdv.milotin.fundmd _fundmd = null;
public pdv.milotin.addprojectmd _addprojectmd = null;
public pdv.milotin.starter _starter = null;
public pdv.milotin.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="addallocatemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="Activity.LoadLayout(\"AddAllocateLy\")";
mostCurrent._activity.LoadLayout("AddAllocateLy",mostCurrent.activityBA);
RDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
mostCurrent._shared = mostCurrent._rp.GetSafeDirDefaultExternal("");
RDebugUtils.currentLine=13434885;
 //BA.debugLineNum = 13434885;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
mostCurrent._kvs._initialize(processBA,mostCurrent._shared,"Userdatastore");
RDebugUtils.currentLine=13434887;
 //BA.debugLineNum = 13434887;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=13434888;
 //BA.debugLineNum = 13434888;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"db.db",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db");
 };
RDebugUtils.currentLine=13434891;
 //BA.debugLineNum = 13434891;BA.debugLine="If SQL1.IsInitialized = False Then";
if (mostCurrent._sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=13434892;
 //BA.debugLineNum = 13434892;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
mostCurrent._sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=13434896;
 //BA.debugLineNum = 13434896;BA.debugLine="GetAuditByID";
_getauditbyid();
RDebugUtils.currentLine=13434898;
 //BA.debugLineNum = 13434898;BA.debugLine="End Sub";
return "";
}
public static String  _getauditbyid() throws Exception{
RDebugUtils.currentModule="addallocatemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getauditbyid", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getauditbyid", null));}
pdv.milotin.httpjob _jobgetauditbyid = null;
String _url = "";
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Sub GetAuditByID";
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="Dim JobGetAuditByID As HttpJob";
_jobgetauditbyid = new pdv.milotin.httpjob();
RDebugUtils.currentLine=13631491;
 //BA.debugLineNum = 13631491;BA.debugLine="JobGetAuditByID.Initialize(\"JobGetAuditByID\", Me)";
_jobgetauditbyid._initialize /*String*/ (null,processBA,"JobGetAuditByID",addallocatemd.getObject());
RDebugUtils.currentLine=13631493;
 //BA.debugLineNum = 13631493;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
_url = "https://service-testnet.maschain.com/api/audit/audit/"+BA.ObjectToString(mostCurrent._kvs._get("AuditTransactionHash"));
RDebugUtils.currentLine=13631494;
 //BA.debugLineNum = 13631494;BA.debugLine="Log(\"HASH:\" & kvs.Get(\"AuditTransactionHash\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("413631494","HASH:"+BA.ObjectToString(mostCurrent._kvs._get("AuditTransactionHash")),0);
RDebugUtils.currentLine=13631495;
 //BA.debugLineNum = 13631495;BA.debugLine="JobGetAuditByID.Download(url)";
_jobgetauditbyid._download /*String*/ (null,_url);
RDebugUtils.currentLine=13631496;
 //BA.debugLineNum = 13631496;BA.debugLine="JobGetAuditByID.GetRequest.SetHeader(\"client_id\",";
_jobgetauditbyid._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_id",BA.ObjectToString(mostCurrent._kvs._get("client_id")));
RDebugUtils.currentLine=13631497;
 //BA.debugLineNum = 13631497;BA.debugLine="JobGetAuditByID.GetRequest.SetHeader(\"client_secr";
_jobgetauditbyid._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_secret",BA.ObjectToString(mostCurrent._kvs._get("client_secret")));
RDebugUtils.currentLine=13631500;
 //BA.debugLineNum = 13631500;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="addallocatemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=14221315;
 //BA.debugLineNum = 14221315;BA.debugLine="kvs.Put(\"ProjectWallet\",\"\")";
mostCurrent._kvs._put("ProjectWallet",(Object)(""));
RDebugUtils.currentLine=14221316;
 //BA.debugLineNum = 14221316;BA.debugLine="kvs.Put(\"ProjectTitle\",\"\")";
mostCurrent._kvs._put("ProjectTitle",(Object)(""));
RDebugUtils.currentLine=14221317;
 //BA.debugLineNum = 14221317;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=14221318;
 //BA.debugLineNum = 14221318;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=14221322;
 //BA.debugLineNum = 14221322;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="addallocatemd";
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="addallocatemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="End Sub";
return "";
}
public static String  _btnclose_click() throws Exception{
RDebugUtils.currentModule="addallocatemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnclose_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnclose_click", null));}
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Private Sub btnClose_Click";
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="If kvs.Get(\"Status\") = \"success\" Then";
if ((mostCurrent._kvs._get("Status")).equals((Object)("success"))) { 
RDebugUtils.currentLine=14548995;
 //BA.debugLineNum = 14548995;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=14548997;
 //BA.debugLineNum = 14548997;BA.debugLine="pnStatus.Visible = False";
mostCurrent._pnstatus.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14548998;
 //BA.debugLineNum = 14548998;BA.debugLine="pnConfirmation.Visible = False";
mostCurrent._pnconfirmation.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14548999;
 //BA.debugLineNum = 14548999;BA.debugLine="btnNext.Visible = True";
mostCurrent._btnnext.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=14549001;
 //BA.debugLineNum = 14549001;BA.debugLine="End Sub";
return "";
}
public static String  _btnnext_click() throws Exception{
RDebugUtils.currentModule="addallocatemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnnext_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnnext_click", null));}
String _strselectcategory = "";
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Private Sub btnNext_Click";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="Dim strSelectCategory As String";
_strselectcategory = "";
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="pnBlackTransparent.Visible = True";
mostCurrent._pnblacktransparent.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="pnConfirmation.Visible = True";
mostCurrent._pnconfirmation.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="btnNext.Visible = False";
mostCurrent._btnnext.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14286853;
 //BA.debugLineNum = 14286853;BA.debugLine="strSelectCategory = cboCategory.GetItem(cboCatego";
_strselectcategory = mostCurrent._cbocategory.GetItem(mostCurrent._cbocategory.getSelectedIndex());
RDebugUtils.currentLine=14286854;
 //BA.debugLineNum = 14286854;BA.debugLine="kvs.Put(\"SelectedCategory\", strSelectCategory)";
mostCurrent._kvs._put("SelectedCategory",(Object)(_strselectcategory));
RDebugUtils.currentLine=14286855;
 //BA.debugLineNum = 14286855;BA.debugLine="Log(strSelectCategory)";
anywheresoftware.b4a.keywords.Common.LogImpl("414286855",_strselectcategory,0);
RDebugUtils.currentLine=14286856;
 //BA.debugLineNum = 14286856;BA.debugLine="lblAllocateAmount.Text = txtAllocateFund.Text";
mostCurrent._lblallocateamount.setText(BA.ObjectToCharSequence(mostCurrent._txtallocatefund.getText()));
RDebugUtils.currentLine=14286858;
 //BA.debugLineNum = 14286858;BA.debugLine="End Sub";
return "";
}
public static String  _btnsend_click() throws Exception{
RDebugUtils.currentModule="addallocatemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsend_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsend_click", null));}
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Private Sub btnSend_Click";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="PostAllocate";
_postallocate();
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="End Sub";
return "";
}
public static String  _postallocate() throws Exception{
RDebugUtils.currentModule="addallocatemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "postallocate", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "postallocate", null));}
pdv.milotin.httpjob _postauditallocate = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
anywheresoftware.b4a.objects.collections.Map _data = null;
anywheresoftware.b4a.objects.collections.List _tagids = null;
anywheresoftware.b4a.objects.collections.Map _metadata = null;
String _url = "";
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Sub PostAllocate";
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="Dim PostAuditAllocate As HttpJob";
_postauditallocate = new pdv.milotin.httpjob();
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="PostAuditAllocate.Initialize(\"PostAuditAllocate\",";
_postauditallocate._initialize /*String*/ (null,processBA,"PostAuditAllocate",addallocatemd.getObject());
RDebugUtils.currentLine=16121861;
 //BA.debugLineNum = 16121861;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=16121862;
 //BA.debugLineNum = 16121862;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16121863;
 //BA.debugLineNum = 16121863;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=16121864;
 //BA.debugLineNum = 16121864;BA.debugLine="data.Put(\"contract_address\", kvs.Get(\"audit-contr";
_data.Put((Object)("contract_address"),mostCurrent._kvs._get("audit-contract"));
RDebugUtils.currentLine=16121865;
 //BA.debugLineNum = 16121865;BA.debugLine="data.Put(\"wallet_address\", kvs.Get(\"WalletAddress";
_data.Put((Object)("wallet_address"),mostCurrent._kvs._get("WalletAddress"));
RDebugUtils.currentLine=16121868;
 //BA.debugLineNum = 16121868;BA.debugLine="Dim tagIds As List";
_tagids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=16121869;
 //BA.debugLineNum = 16121869;BA.debugLine="tagIds.Initialize";
_tagids.Initialize();
RDebugUtils.currentLine=16121870;
 //BA.debugLineNum = 16121870;BA.debugLine="tagIds.Add(4) ' Assuming 4 is the tag ID";
_tagids.Add((Object)(4));
RDebugUtils.currentLine=16121871;
 //BA.debugLineNum = 16121871;BA.debugLine="data.Put(\"tag_id\", tagIds)";
_data.Put((Object)("tag_id"),(Object)(_tagids.getObject()));
RDebugUtils.currentLine=16121872;
 //BA.debugLineNum = 16121872;BA.debugLine="data.Put(\"callback_url\", \"https://postman-echo.co";
_data.Put((Object)("callback_url"),(Object)("https://postman-echo.com/post?"));
RDebugUtils.currentLine=16121875;
 //BA.debugLineNum = 16121875;BA.debugLine="Dim metadata As Map";
_metadata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16121876;
 //BA.debugLineNum = 16121876;BA.debugLine="metadata.Initialize";
_metadata.Initialize();
RDebugUtils.currentLine=16121877;
 //BA.debugLineNum = 16121877;BA.debugLine="metadata.Put(\"Category\", kvs.Get(\"SelectedCategor";
_metadata.Put((Object)("Category"),mostCurrent._kvs._get("SelectedCategory"));
RDebugUtils.currentLine=16121878;
 //BA.debugLineNum = 16121878;BA.debugLine="metadata.Put(\"AllocateFund\", txtAllocateFund.Text";
_metadata.Put((Object)("AllocateFund"),(Object)(mostCurrent._txtallocatefund.getText()));
RDebugUtils.currentLine=16121879;
 //BA.debugLineNum = 16121879;BA.debugLine="metadata.Put(\"Remark\", txtRemark.Text)";
_metadata.Put((Object)("Remark"),(Object)(mostCurrent._txtremark.getText()));
RDebugUtils.currentLine=16121880;
 //BA.debugLineNum = 16121880;BA.debugLine="data.Put(\"metadata\", metadata)";
_data.Put((Object)("metadata"),(Object)(_metadata.getObject()));
RDebugUtils.currentLine=16121882;
 //BA.debugLineNum = 16121882;BA.debugLine="json.Initialize(data)";
_json.Initialize(_data);
RDebugUtils.currentLine=16121885;
 //BA.debugLineNum = 16121885;BA.debugLine="Log(json.ToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("416121885",_json.ToString(),0);
RDebugUtils.currentLine=16121888;
 //BA.debugLineNum = 16121888;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
_url = "https://service-testnet.maschain.com/api/audit/audit/";
RDebugUtils.currentLine=16121889;
 //BA.debugLineNum = 16121889;BA.debugLine="PostAuditAllocate.PostString(url, json.ToString)";
_postauditallocate._poststring /*String*/ (null,_url,_json.ToString());
RDebugUtils.currentLine=16121890;
 //BA.debugLineNum = 16121890;BA.debugLine="PostAuditAllocate.GetRequest.SetContentType(\"appl";
_postauditallocate._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=16121891;
 //BA.debugLineNum = 16121891;BA.debugLine="PostAuditAllocate.GetRequest.SetHeader(\"client_id";
_postauditallocate._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_id",BA.ObjectToString(mostCurrent._kvs._get("client_id")));
RDebugUtils.currentLine=16121892;
 //BA.debugLineNum = 16121892;BA.debugLine="PostAuditAllocate.GetRequest.SetHeader(\"client_se";
_postauditallocate._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_secret",BA.ObjectToString(mostCurrent._kvs._get("client_secret")));
RDebugUtils.currentLine=16121893;
 //BA.debugLineNum = 16121893;BA.debugLine="End Sub";
return "";
}
public static String  _calculatepercentage(double _part,double _total) throws Exception{
RDebugUtils.currentModule="addallocatemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "calculatepercentage", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "calculatepercentage", new Object[] {_part,_total}));}
double _percentage = 0;
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Sub CalculatePercentage(part As Double, total As D";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="Dim percentage As Double";
_percentage = 0;
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="percentage = (part / total) * 100";
_percentage = (_part/(double)_total)*100;
RDebugUtils.currentLine=14614531;
 //BA.debugLineNum = 14614531;BA.debugLine="If percentage > 100 Then";
if (_percentage>100) { 
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="cpBar2.Value = \"100\"";
mostCurrent._cpbar2._setvalue /*float*/ (null,(float)(Double.parseDouble("100")));
RDebugUtils.currentLine=14614533;
 //BA.debugLineNum = 14614533;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(5,206";
mostCurrent._lblprojectprogress2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (5),(int) (206),(int) (46)));
RDebugUtils.currentLine=14614534;
 //BA.debugLineNum = 14614534;BA.debugLine="lblProjectProgress2.Text = \"Fundraising complete";
mostCurrent._lblprojectprogress2.setText(BA.ObjectToCharSequence("Fundraising complete"));
RDebugUtils.currentLine=14614535;
 //BA.debugLineNum = 14614535;BA.debugLine="txtDonateAmount.Enabled = False";
mostCurrent._txtdonateamount.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14614536;
 //BA.debugLineNum = 14614536;BA.debugLine="txtDonateAmount.Text = \"-\"";
mostCurrent._txtdonateamount.setText(BA.ObjectToCharSequence("-"));
 }else {
RDebugUtils.currentLine=14614538;
 //BA.debugLineNum = 14614538;BA.debugLine="cpBar2.Value = NumberFormat(percentage, 1, 3)";
mostCurrent._cpbar2._setvalue /*float*/ (null,(float)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.NumberFormat(_percentage,(int) (1),(int) (3)))));
RDebugUtils.currentLine=14614539;
 //BA.debugLineNum = 14614539;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(254,1";
mostCurrent._lblprojectprogress2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (254),(int) (171),(int) (43)));
RDebugUtils.currentLine=14614540;
 //BA.debugLineNum = 14614540;BA.debugLine="lblProjectProgress2.Text = \"Fundraising in progr";
mostCurrent._lblprojectprogress2.setText(BA.ObjectToCharSequence("Fundraising in progress"));
 };
RDebugUtils.currentLine=14614543;
 //BA.debugLineNum = 14614543;BA.debugLine="Log(NumberFormat(percentage, 1, 3))";
anywheresoftware.b4a.keywords.Common.LogImpl("414614543",anywheresoftware.b4a.keywords.Common.NumberFormat(_percentage,(int) (1),(int) (3)),0);
RDebugUtils.currentLine=14614544;
 //BA.debugLineNum = 14614544;BA.debugLine="End Sub";
return "";
}
public static String  _getauditcategory() throws Exception{
RDebugUtils.currentModule="addallocatemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getauditcategory", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getauditcategory", null));}
pdv.milotin.httpjob _jobgetauditcategory = null;
String _url = "";
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Sub GetAuditCategory";
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="Dim JobGetAuditCategory As HttpJob";
_jobgetauditcategory = new pdv.milotin.httpjob();
RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="JobGetAuditCategory.Initialize(\"JobGetAuditCatego";
_jobgetauditcategory._initialize /*String*/ (null,processBA,"JobGetAuditCategory",addallocatemd.getObject());
RDebugUtils.currentLine=15204357;
 //BA.debugLineNum = 15204357;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
_url = "https://service-testnet.maschain.com/api/audit/category/";
RDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="JobGetAuditCategory.Download(url)";
_jobgetauditcategory._download /*String*/ (null,_url);
RDebugUtils.currentLine=15204359;
 //BA.debugLineNum = 15204359;BA.debugLine="JobGetAuditCategory.GetRequest.SetHeader(\"client_";
_jobgetauditcategory._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_id",BA.ObjectToString(mostCurrent._kvs._get("client_id")));
RDebugUtils.currentLine=15204360;
 //BA.debugLineNum = 15204360;BA.debugLine="JobGetAuditCategory.GetRequest.SetHeader(\"client_";
_jobgetauditcategory._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_secret",BA.ObjectToString(mostCurrent._kvs._get("client_secret")));
RDebugUtils.currentLine=15204363;
 //BA.debugLineNum = 15204363;BA.debugLine="End Sub";
return "";
}
public static String  _imgback_click() throws Exception{
RDebugUtils.currentModule="addallocatemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgback_click", null));}
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Private Sub imgBack_Click";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="kvs.Put(\"ProjectWallet\",\"\")";
mostCurrent._kvs._put("ProjectWallet",(Object)(""));
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="kvs.Put(\"ProjectTitle\",\"\")";
mostCurrent._kvs._put("ProjectTitle",(Object)(""));
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=14155780;
 //BA.debugLineNum = 14155780;BA.debugLine="End Sub";
return "";
}
public static String  _imgclose_click() throws Exception{
RDebugUtils.currentModule="addallocatemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgclose_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgclose_click", null));}
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Private Sub imgClose_Click";
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="pnBlackTransparent.Visible = False";
mostCurrent._pnblacktransparent.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="pnConfirmation.Visible = False";
mostCurrent._pnconfirmation.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14417923;
 //BA.debugLineNum = 14417923;BA.debugLine="btnNext.Visible = True";
mostCurrent._btnnext.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="kvs.Put(\"DonateAmount\",\"\")";
mostCurrent._kvs._put("DonateAmount",(Object)(""));
RDebugUtils.currentLine=14417925;
 //BA.debugLineNum = 14417925;BA.debugLine="Log(\"Donate :\" & kvs.Get(\"DonateAmount\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("414417925","Donate :"+BA.ObjectToString(mostCurrent._kvs._get("DonateAmount")),0);
RDebugUtils.currentLine=14417926;
 //BA.debugLineNum = 14417926;BA.debugLine="End Sub";
return "";
}
public static String  _imgclose2_click() throws Exception{
RDebugUtils.currentModule="addallocatemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgclose2_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgclose2_click", null));}
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Private Sub imgClose2_Click";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(pdv.milotin.httpjob _job) throws Exception{
RDebugUtils.currentModule="addallocatemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
String _jsonstring = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _results = null;
anywheresoftware.b4a.objects.collections.List _categories = null;
anywheresoftware.b4a.objects.collections.Map _result = null;
String _name = "";
int _id = 0;
int _status = 0;
String _transactionhash = "";
int _nonce = 0;
String _from = "";
String _responsestatus = "";
anywheresoftware.b4a.objects.collections.Map _receipt = null;
String _metadatastring = "";
anywheresoftware.b4a.objects.collections.JSONParser _metadataparser = null;
anywheresoftware.b4a.objects.collections.Map _metadata = null;
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="Dim jsonString As String = Job.GetString";
_jsonstring = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=13828103;
 //BA.debugLineNum = 13828103;BA.debugLine="Log(jsonString)";
anywheresoftware.b4a.keywords.Common.LogImpl("413828103",_jsonstring,0);
RDebugUtils.currentLine=13828105;
 //BA.debugLineNum = 13828105;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=13828106;
 //BA.debugLineNum = 13828106;BA.debugLine="parser.Initialize(jsonString)";
_parser.Initialize(_jsonstring);
RDebugUtils.currentLine=13828108;
 //BA.debugLineNum = 13828108;BA.debugLine="If Job.JobName = \"JobGetAuditCategory\" Then";
if ((_job._jobname /*String*/ ).equals("JobGetAuditCategory")) { 
RDebugUtils.currentLine=13828111;
 //BA.debugLineNum = 13828111;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=13828112;
 //BA.debugLineNum = 13828112;BA.debugLine="Dim results As List = root.Get(\"result\")";
_results = new anywheresoftware.b4a.objects.collections.List();
_results = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("result"))));
RDebugUtils.currentLine=13828113;
 //BA.debugLineNum = 13828113;BA.debugLine="Dim categories As List";
_categories = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13828114;
 //BA.debugLineNum = 13828114;BA.debugLine="categories.Initialize";
_categories.Initialize();
RDebugUtils.currentLine=13828115;
 //BA.debugLineNum = 13828115;BA.debugLine="For Each result As Map In results";
_result = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group12 = _results;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_result = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group12.Get(index12)));
RDebugUtils.currentLine=13828116;
 //BA.debugLineNum = 13828116;BA.debugLine="Dim name As String = result.Get(\"name\")";
_name = BA.ObjectToString(_result.Get((Object)("name")));
RDebugUtils.currentLine=13828117;
 //BA.debugLineNum = 13828117;BA.debugLine="categories.Add(name)";
_categories.Add((Object)(_name));
RDebugUtils.currentLine=13828119;
 //BA.debugLineNum = 13828119;BA.debugLine="Dim id As Int = result.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_result.Get((Object)("id"))));
 }
};
RDebugUtils.currentLine=13828123;
 //BA.debugLineNum = 13828123;BA.debugLine="cboCategory.AddAll(categories)";
mostCurrent._cbocategory.AddAll(_categories);
 }else 
{RDebugUtils.currentLine=13828126;
 //BA.debugLineNum = 13828126;BA.debugLine="Else If Job.JobName = \"PostAuditAllocate\" Then";
if ((_job._jobname /*String*/ ).equals("PostAuditAllocate")) { 
RDebugUtils.currentLine=13828127;
 //BA.debugLineNum = 13828127;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=13828128;
 //BA.debugLineNum = 13828128;BA.debugLine="Dim status As Int = root.Get(\"status\")";
_status = (int)(BA.ObjectToNumber(_root.Get((Object)("status"))));
RDebugUtils.currentLine=13828129;
 //BA.debugLineNum = 13828129;BA.debugLine="Dim result As Map = root.Get(\"result\")";
_result = new anywheresoftware.b4a.objects.collections.Map();
_result = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("result"))));
RDebugUtils.currentLine=13828131;
 //BA.debugLineNum = 13828131;BA.debugLine="If status = 200 Then";
if (_status==200) { 
RDebugUtils.currentLine=13828132;
 //BA.debugLineNum = 13828132;BA.debugLine="Dim transactionHash As String = result.Get(\"tr";
_transactionhash = BA.ObjectToString(_result.Get((Object)("transactionHash")));
RDebugUtils.currentLine=13828133;
 //BA.debugLineNum = 13828133;BA.debugLine="Dim nonce As Int = result.Get(\"nonce\")";
_nonce = (int)(BA.ObjectToNumber(_result.Get((Object)("nonce"))));
RDebugUtils.currentLine=13828134;
 //BA.debugLineNum = 13828134;BA.debugLine="Dim from As String = result.Get(\"from\")";
_from = BA.ObjectToString(_result.Get((Object)("from")));
RDebugUtils.currentLine=13828135;
 //BA.debugLineNum = 13828135;BA.debugLine="Dim responseStatus As String = result.Get(\"sta";
_responsestatus = BA.ObjectToString(_result.Get((Object)("status")));
RDebugUtils.currentLine=13828136;
 //BA.debugLineNum = 13828136;BA.debugLine="Dim receipt As Map = result.Get(\"receipt\")";
_receipt = new anywheresoftware.b4a.objects.collections.Map();
_receipt = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_result.Get((Object)("receipt"))));
RDebugUtils.currentLine=13828139;
 //BA.debugLineNum = 13828139;BA.debugLine="Log(\"Transaction Hash: \" & transactionHash)";
anywheresoftware.b4a.keywords.Common.LogImpl("413828139","Transaction Hash: "+_transactionhash,0);
RDebugUtils.currentLine=13828140;
 //BA.debugLineNum = 13828140;BA.debugLine="Log(\"Nonce: \" & nonce)";
anywheresoftware.b4a.keywords.Common.LogImpl("413828140","Nonce: "+BA.NumberToString(_nonce),0);
RDebugUtils.currentLine=13828141;
 //BA.debugLineNum = 13828141;BA.debugLine="Log(\"From: \" & from)";
anywheresoftware.b4a.keywords.Common.LogImpl("413828141","From: "+_from,0);
RDebugUtils.currentLine=13828142;
 //BA.debugLineNum = 13828142;BA.debugLine="Log(\"Status: \" & responseStatus)";
anywheresoftware.b4a.keywords.Common.LogImpl("413828142","Status: "+_responsestatus,0);
RDebugUtils.currentLine=13828143;
 //BA.debugLineNum = 13828143;BA.debugLine="Log(\"Receipt: \" & receipt)";
anywheresoftware.b4a.keywords.Common.LogImpl("413828143","Receipt: "+BA.ObjectToString(_receipt),0);
RDebugUtils.currentLine=13828144;
 //BA.debugLineNum = 13828144;BA.debugLine="pnBlackTransparent.Visible = True";
mostCurrent._pnblacktransparent.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=13828145;
 //BA.debugLineNum = 13828145;BA.debugLine="pnStatus.Visible = True";
mostCurrent._pnstatus.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 }else 
{RDebugUtils.currentLine=13828148;
 //BA.debugLineNum = 13828148;BA.debugLine="Else If Job.JobName = \"JobGetAuditByID\" Then";
if ((_job._jobname /*String*/ ).equals("JobGetAuditByID")) { 
RDebugUtils.currentLine=13828150;
 //BA.debugLineNum = 13828150;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=13828151;
 //BA.debugLineNum = 13828151;BA.debugLine="Dim result As Map = root.Get(\"result\")";
_result = new anywheresoftware.b4a.objects.collections.Map();
_result = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("result"))));
RDebugUtils.currentLine=13828154;
 //BA.debugLineNum = 13828154;BA.debugLine="Dim metadataString As String = result.Get(\"meta";
_metadatastring = BA.ObjectToString(_result.Get((Object)("metadata")));
RDebugUtils.currentLine=13828157;
 //BA.debugLineNum = 13828157;BA.debugLine="Dim metadataParser As JSONParser";
_metadataparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=13828158;
 //BA.debugLineNum = 13828158;BA.debugLine="metadataParser.Initialize(metadataString)";
_metadataparser.Initialize(_metadatastring);
RDebugUtils.currentLine=13828159;
 //BA.debugLineNum = 13828159;BA.debugLine="Dim metadata As Map = metadataParser.NextObject";
_metadata = new anywheresoftware.b4a.objects.collections.Map();
_metadata = _metadataparser.NextObject();
RDebugUtils.currentLine=13828163;
 //BA.debugLineNum = 13828163;BA.debugLine="lblProjectTittle.Text = metadata.Get(\"project\")";
mostCurrent._lblprojecttittle.setText(BA.ObjectToCharSequence(_metadata.Get((Object)("project"))));
RDebugUtils.currentLine=13828165;
 //BA.debugLineNum = 13828165;BA.debugLine="metadata.Get(\"status\")";
_metadata.Get((Object)("status"));
RDebugUtils.currentLine=13828167;
 //BA.debugLineNum = 13828167;BA.debugLine="Log(metadata.Get(\"project\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("413828167",BA.ObjectToString(_metadata.Get((Object)("project"))),0);
RDebugUtils.currentLine=13828168;
 //BA.debugLineNum = 13828168;BA.debugLine="Log(metadata.Get(\"fund\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("413828168",BA.ObjectToString(_metadata.Get((Object)("fund"))),0);
RDebugUtils.currentLine=13828169;
 //BA.debugLineNum = 13828169;BA.debugLine="Log(metadata.Get(\"progress\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("413828169",BA.ObjectToString(_metadata.Get((Object)("progress"))),0);
RDebugUtils.currentLine=13828170;
 //BA.debugLineNum = 13828170;BA.debugLine="Log(metadata.Get(\"status\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("413828170",BA.ObjectToString(_metadata.Get((Object)("status"))),0);
RDebugUtils.currentLine=13828171;
 //BA.debugLineNum = 13828171;BA.debugLine="Log(metadata.Get(\"project_wallet\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("413828171",BA.ObjectToString(_metadata.Get((Object)("project_wallet"))),0);
RDebugUtils.currentLine=13828173;
 //BA.debugLineNum = 13828173;BA.debugLine="GetAuditCategory";
_getauditcategory();
 }else {
RDebugUtils.currentLine=13828176;
 //BA.debugLineNum = 13828176;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("413828176","Error: "+_job._errormessage /*String*/ ,0);
 }}}
;
 }else {
RDebugUtils.currentLine=13828181;
 //BA.debugLineNum = 13828181;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("413828181","Error: "+_job._errormessage /*String*/ ,0);
 };
RDebugUtils.currentLine=13828185;
 //BA.debugLineNum = 13828185;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=13828187;
 //BA.debugLineNum = 13828187;BA.debugLine="End Sub";
return "";
}
public static String  _lblfund_click() throws Exception{
RDebugUtils.currentModule="addallocatemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblfund_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblfund_click", null));}
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Private Sub lblFund_Click";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="StartActivity(\"FundMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("FundMd"));
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=13959171;
 //BA.debugLineNum = 13959171;BA.debugLine="End Sub";
return "";
}
public static String  _lblhistory_click() throws Exception{
RDebugUtils.currentModule="addallocatemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblhistory_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblhistory_click", null));}
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Private Sub lblHistory_Click";
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="StartActivity(\"HistoryMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("HistoryMd"));
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="End Sub";
return "";
}
public static String  _lblhome_click() throws Exception{
RDebugUtils.currentModule="addallocatemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblhome_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblhome_click", null));}
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Private Sub lblHome_Click";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="kvs.Put(\"ProjectTitle\",\"\")";
mostCurrent._kvs._put("ProjectTitle",(Object)(""));
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="End Sub";
return "";
}
public static String  _lbluser_click() throws Exception{
RDebugUtils.currentModule="addallocatemd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbluser_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbluser_click", null));}
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Private Sub lblUser_Click";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="StartActivity(\"UserMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("UserMd"));
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=14090243;
 //BA.debugLineNum = 14090243;BA.debugLine="End Sub";
return "";
}
}