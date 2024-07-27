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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "pdv.milotin", "pdv.milotin.addprojectmd");
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
public pdv.milotin.starter _starter = null;
public pdv.milotin.addallocatemd _addallocatemd = null;
public pdv.milotin.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="addprojectmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Activity.LoadLayout(\"AddProjectLy\")";
mostCurrent._activity.LoadLayout("AddProjectLy",mostCurrent.activityBA);
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
mostCurrent._shared = mostCurrent._rp.GetSafeDirDefaultExternal("");
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
mostCurrent._kvs._initialize(processBA,mostCurrent._shared,"Userdatastore");
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=5701640;
 //BA.debugLineNum = 5701640;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"db.db",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db");
 };
RDebugUtils.currentLine=5701643;
 //BA.debugLineNum = 5701643;BA.debugLine="If SQL1.IsInitialized = False Then";
if (mostCurrent._sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=5701644;
 //BA.debugLineNum = 5701644;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
mostCurrent._sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=5701648;
 //BA.debugLineNum = 5701648;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="addprojectmd";
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="addprojectmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="End Sub";
return "";
}
public static String  _btnclose_click() throws Exception{
RDebugUtils.currentModule="addprojectmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnclose_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnclose_click", null));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Private Sub btnClose_Click";
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="If kvs.Get(\"Status\") = \"success\" Then";
if ((mostCurrent._kvs._get("Status")).equals((Object)("success"))) { 
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="pnStatus.Visible = False";
mostCurrent._pnstatus.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="End Sub";
return "";
}
public static String  _btnprojectsubmit_click() throws Exception{
RDebugUtils.currentModule="addprojectmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnprojectsubmit_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnprojectsubmit_click", null));}
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Private Sub btnProjectSubmit_Click";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="PostAudit";
_postaudit();
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="pnBlackTransparent.Visible = True";
mostCurrent._pnblacktransparent.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="End Sub";
return "";
}
public static String  _postaudit() throws Exception{
RDebugUtils.currentModule="addprojectmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "postaudit", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "postaudit", null));}
pdv.milotin.httpjob _postauditproject = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
anywheresoftware.b4a.objects.collections.Map _data = null;
anywheresoftware.b4a.objects.collections.Map _metadata = null;
String _url = "";
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub PostAudit";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Dim PostAuditProject As HttpJob";
_postauditproject = new pdv.milotin.httpjob();
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="PostAuditProject.Initialize(\"PostAuditProject\", M";
_postauditproject._initialize /*String*/ (null,processBA,"PostAuditProject",addprojectmd.getObject());
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5898247;
 //BA.debugLineNum = 5898247;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=5898248;
 //BA.debugLineNum = 5898248;BA.debugLine="data.Put(\"contract_address\", kvs.Get(\"audit-contr";
_data.Put((Object)("contract_address"),mostCurrent._kvs._get("audit-contract"));
RDebugUtils.currentLine=5898249;
 //BA.debugLineNum = 5898249;BA.debugLine="data.Put(\"wallet_address\", txtSetWalletAddress.Te";
_data.Put((Object)("wallet_address"),(Object)(mostCurrent._txtsetwalletaddress.getText()));
RDebugUtils.currentLine=5898251;
 //BA.debugLineNum = 5898251;BA.debugLine="data.Put(\"callback_url\", \"https://\")";
_data.Put((Object)("callback_url"),(Object)("https://"));
RDebugUtils.currentLine=5898252;
 //BA.debugLineNum = 5898252;BA.debugLine="Dim metadata As Map";
_metadata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5898253;
 //BA.debugLineNum = 5898253;BA.debugLine="metadata.Initialize";
_metadata.Initialize();
RDebugUtils.currentLine=5898254;
 //BA.debugLineNum = 5898254;BA.debugLine="metadata.Put(\"project\", txtProjectName.Text)";
_metadata.Put((Object)("project"),(Object)(mostCurrent._txtprojectname.getText()));
RDebugUtils.currentLine=5898255;
 //BA.debugLineNum = 5898255;BA.debugLine="metadata.Put(\"fund\", txtSetFundAmount.Text)";
_metadata.Put((Object)("fund"),(Object)(mostCurrent._txtsetfundamount.getText()));
RDebugUtils.currentLine=5898256;
 //BA.debugLineNum = 5898256;BA.debugLine="metadata.Put(\"content\", txtContent.Text)";
_metadata.Put((Object)("content"),(Object)(mostCurrent._txtcontent.getText()));
RDebugUtils.currentLine=5898257;
 //BA.debugLineNum = 5898257;BA.debugLine="data.Put(\"metadata\", metadata)";
_data.Put((Object)("metadata"),(Object)(_metadata.getObject()));
RDebugUtils.currentLine=5898258;
 //BA.debugLineNum = 5898258;BA.debugLine="json.Initialize(data)";
_json.Initialize(_data);
RDebugUtils.currentLine=5898261;
 //BA.debugLineNum = 5898261;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
_url = "https://service-testnet.maschain.com/api/audit/audit/";
RDebugUtils.currentLine=5898262;
 //BA.debugLineNum = 5898262;BA.debugLine="PostAuditProject.PostString(url, json.ToString)";
_postauditproject._poststring /*String*/ (null,_url,_json.ToString());
RDebugUtils.currentLine=5898263;
 //BA.debugLineNum = 5898263;BA.debugLine="PostAuditProject.GetRequest.SetContentType(\"appli";
_postauditproject._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=5898264;
 //BA.debugLineNum = 5898264;BA.debugLine="PostAuditProject.GetRequest.SetHeader(\"client_id\"";
_postauditproject._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_id",BA.ObjectToString(mostCurrent._kvs._get("client_id")));
RDebugUtils.currentLine=5898265;
 //BA.debugLineNum = 5898265;BA.debugLine="PostAuditProject.GetRequest.SetHeader(\"client_sec";
_postauditproject._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_secret",BA.ObjectToString(mostCurrent._kvs._get("client_secret")));
RDebugUtils.currentLine=5898267;
 //BA.debugLineNum = 5898267;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(pdv.milotin.httpjob _job) throws Exception{
RDebugUtils.currentModule="addprojectmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
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
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="Dim jsonString As String = Job.GetString";
_jsonstring = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="Log(jsonString)";
anywheresoftware.b4a.keywords.Common.LogImpl("45963781",_jsonstring,0);
RDebugUtils.currentLine=5963783;
 //BA.debugLineNum = 5963783;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5963784;
 //BA.debugLineNum = 5963784;BA.debugLine="parser.Initialize(jsonString)";
_parser.Initialize(_jsonstring);
RDebugUtils.currentLine=5963786;
 //BA.debugLineNum = 5963786;BA.debugLine="If Job.JobName = \"PostAuditProject\" Then";
if ((_job._jobname /*String*/ ).equals("PostAuditProject")) { 
RDebugUtils.currentLine=5963787;
 //BA.debugLineNum = 5963787;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=5963788;
 //BA.debugLineNum = 5963788;BA.debugLine="Dim status As Int = root.Get(\"status\")";
_status = (int)(BA.ObjectToNumber(_root.Get((Object)("status"))));
RDebugUtils.currentLine=5963789;
 //BA.debugLineNum = 5963789;BA.debugLine="Dim result As Map = root.Get(\"result\")";
_result = new anywheresoftware.b4a.objects.collections.Map();
_result = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("result"))));
RDebugUtils.currentLine=5963791;
 //BA.debugLineNum = 5963791;BA.debugLine="If status = 200 Then";
if (_status==200) { 
RDebugUtils.currentLine=5963792;
 //BA.debugLineNum = 5963792;BA.debugLine="Dim transactionHash As String = result.Get(\"tr";
_transactionhash = BA.ObjectToString(_result.Get((Object)("transactionHash")));
RDebugUtils.currentLine=5963793;
 //BA.debugLineNum = 5963793;BA.debugLine="Dim nonce As Int = result.Get(\"nonce\")";
_nonce = (int)(BA.ObjectToNumber(_result.Get((Object)("nonce"))));
RDebugUtils.currentLine=5963794;
 //BA.debugLineNum = 5963794;BA.debugLine="Dim from As String = result.Get(\"from\")";
_from = BA.ObjectToString(_result.Get((Object)("from")));
RDebugUtils.currentLine=5963795;
 //BA.debugLineNum = 5963795;BA.debugLine="Dim responseStatus As String = result.Get(\"sta";
_responsestatus = BA.ObjectToString(_result.Get((Object)("status")));
RDebugUtils.currentLine=5963796;
 //BA.debugLineNum = 5963796;BA.debugLine="Dim receipt As Map = result.Get(\"receipt\")";
_receipt = new anywheresoftware.b4a.objects.collections.Map();
_receipt = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_result.Get((Object)("receipt"))));
RDebugUtils.currentLine=5963799;
 //BA.debugLineNum = 5963799;BA.debugLine="Log(\"Transaction Hash: \" & transactionHash)";
anywheresoftware.b4a.keywords.Common.LogImpl("45963799","Transaction Hash: "+_transactionhash,0);
RDebugUtils.currentLine=5963800;
 //BA.debugLineNum = 5963800;BA.debugLine="Log(\"Nonce: \" & nonce)";
anywheresoftware.b4a.keywords.Common.LogImpl("45963800","Nonce: "+BA.NumberToString(_nonce),0);
RDebugUtils.currentLine=5963801;
 //BA.debugLineNum = 5963801;BA.debugLine="Log(\"From: \" & from)";
anywheresoftware.b4a.keywords.Common.LogImpl("45963801","From: "+_from,0);
RDebugUtils.currentLine=5963802;
 //BA.debugLineNum = 5963802;BA.debugLine="Log(\"Status: \" & responseStatus)";
anywheresoftware.b4a.keywords.Common.LogImpl("45963802","Status: "+_responsestatus,0);
RDebugUtils.currentLine=5963803;
 //BA.debugLineNum = 5963803;BA.debugLine="Log(\"Receipt: \" & receipt)";
anywheresoftware.b4a.keywords.Common.LogImpl("45963803","Receipt: "+BA.ObjectToString(_receipt),0);
RDebugUtils.currentLine=5963804;
 //BA.debugLineNum = 5963804;BA.debugLine="pnBlackTransparent.Visible = True";
mostCurrent._pnblacktransparent.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5963805;
 //BA.debugLineNum = 5963805;BA.debugLine="pnStatus.Visible = True";
mostCurrent._pnstatus.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=5963809;
 //BA.debugLineNum = 5963809;BA.debugLine="Log(\"Failed to post the job\")";
anywheresoftware.b4a.keywords.Common.LogImpl("45963809","Failed to post the job",0);
 };
 }else {
RDebugUtils.currentLine=5963813;
 //BA.debugLineNum = 5963813;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("45963813","Error: "+_job._errormessage /*String*/ ,0);
 };
 }else {
RDebugUtils.currentLine=5963817;
 //BA.debugLineNum = 5963817;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("45963817","Error: "+_job._errormessage /*String*/ ,0);
 };
RDebugUtils.currentLine=5963821;
 //BA.debugLineNum = 5963821;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=5963822;
 //BA.debugLineNum = 5963822;BA.debugLine="End Sub";
return "";
}
}