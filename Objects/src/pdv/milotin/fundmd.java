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

public class fundmd extends Activity implements B4AActivity{
	public static fundmd mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "pdv.milotin", "pdv.milotin.fundmd");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (fundmd).");
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
		activityBA = new BA(this, layout, processBA, "pdv.milotin", "pdv.milotin.fundmd");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "pdv.milotin.fundmd", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (fundmd) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (fundmd) Resume **");
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
		return fundmd.class;
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
            BA.LogInfo("** Activity (fundmd) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (fundmd) Pause event (activity is not paused). **");
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
            fundmd mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (fundmd) Resume **");
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
public pdv.milotin.customlistview _clvfundlist = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblbottom = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhome = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfund = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhistory = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbluser = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhome2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfund2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhistory2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbluser2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlistview3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnheader1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnframe2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblusertitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblline6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltop = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgback = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprojecttitle2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprojectfund2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprojecttitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprojectfund = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprojectprogress = null;
public pdv.milotin.circularprogressbar _cpbar1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprojectprogress2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgproject = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgfunding = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgprogress = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnviewfund = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnaddallocate = null;
public b4a.example.dateutils _dateutils = null;
public pdv.milotin.main _main = null;
public pdv.milotin.homemd _homemd = null;
public pdv.milotin.sendfundmd _sendfundmd = null;
public pdv.milotin.usermd _usermd = null;
public pdv.milotin.historymd _historymd = null;
public pdv.milotin.addprojectmd _addprojectmd = null;
public pdv.milotin.starter _starter = null;
public pdv.milotin.addallocatemd _addallocatemd = null;
public pdv.milotin.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="fundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Activity.LoadLayout(\"FundLy\")";
mostCurrent._activity.LoadLayout("FundLy",mostCurrent.activityBA);
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
mostCurrent._shared = mostCurrent._rp.GetSafeDirDefaultExternal("");
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
mostCurrent._kvs._initialize(processBA,mostCurrent._shared,"Userdatastore");
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"db.db",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db");
 };
RDebugUtils.currentLine=4390923;
 //BA.debugLineNum = 4390923;BA.debugLine="If SQL1.IsInitialized = False Then";
if (mostCurrent._sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=4390924;
 //BA.debugLineNum = 4390924;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
mostCurrent._sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=4390927;
 //BA.debugLineNum = 4390927;BA.debugLine="GetAudit";
_getaudit();
RDebugUtils.currentLine=4390928;
 //BA.debugLineNum = 4390928;BA.debugLine="End Sub";
return "";
}
public static String  _getaudit() throws Exception{
RDebugUtils.currentModule="fundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getaudit", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getaudit", null));}
pdv.milotin.httpjob _jobgetaudit = null;
String _url = "";
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub GetAudit";
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="Dim JobGetAudit As HttpJob";
_jobgetaudit = new pdv.milotin.httpjob();
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="JobGetAudit.Initialize(\"JobGetAudit\", Me)";
_jobgetaudit._initialize /*String*/ (null,processBA,"JobGetAudit",fundmd.getObject());
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
_url = "https://service-testnet.maschain.com/api/audit/audit?tag=5";
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="JobGetAudit.Download(url)";
_jobgetaudit._download /*String*/ (null,_url);
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="JobGetAudit.GetRequest.SetHeader(\"client_id\", kvs";
_jobgetaudit._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_id",BA.ObjectToString(mostCurrent._kvs._get("client_id")));
RDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="JobGetAudit.GetRequest.SetHeader(\"client_secret\",";
_jobgetaudit._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("client_secret",BA.ObjectToString(mostCurrent._kvs._get("client_secret")));
RDebugUtils.currentLine=4587530;
 //BA.debugLineNum = 4587530;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="fundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="kvs.Put(\"ProjectWallet\",\"\")";
mostCurrent._kvs._put("ProjectWallet",(Object)(""));
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="fundmd";
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="fundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="End Sub";
return "";
}
public static String  _clvfundlist_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="fundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clvfundlist_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clvfundlist_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub clvFundList_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="kvs.Put(\"AuditTransactionHash\",Value)";
mostCurrent._kvs._put("AuditTransactionHash",_value);
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="Log(kvs.Get(\"AuditTransactionHash\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("04784132",BA.ObjectToString(mostCurrent._kvs._get("AuditTransactionHash")),0);
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="StartActivity(\"AddAllocateMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("AddAllocateMd"));
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createlistitem(String _strid,String _strproject,String _strfund,String _strprogress,String _strprojectwallet,String _strstatus,int _width,int _height) throws Exception{
RDebugUtils.currentModule="fundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createlistitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createlistitem", new Object[] {_strid,_strproject,_strfund,_strprogress,_strprojectwallet,_strstatus,_width,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub CreateListItem(strID As String, strProject As";
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="Activity.AddView(p, 0, 0, 96%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (96),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=4718598;
 //BA.debugLineNum = 4718598;BA.debugLine="p.LoadLayout(\"ListViewLy4\")";
_p.LoadLayout("ListViewLy4",mostCurrent.activityBA);
RDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=4718601;
 //BA.debugLineNum = 4718601;BA.debugLine="lblProjectTitle2.Text = strProject";
mostCurrent._lblprojecttitle2.setText(BA.ObjectToCharSequence(_strproject));
RDebugUtils.currentLine=4718602;
 //BA.debugLineNum = 4718602;BA.debugLine="lblProjectFund2.Text = \"RM \" & NumberFormat2(strF";
mostCurrent._lblprojectfund2.setText(BA.ObjectToCharSequence("RM "+anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_strfund)),(int) (0),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.True)));
RDebugUtils.currentLine=4718603;
 //BA.debugLineNum = 4718603;BA.debugLine="Log(StrProgress)";
anywheresoftware.b4a.keywords.Common.LogImpl("04718603",_strprogress,0);
RDebugUtils.currentLine=4718604;
 //BA.debugLineNum = 4718604;BA.debugLine="If StrProgress = Null Or StrProgress = \"null\" The";
if (_strprogress== null || (_strprogress).equals("null")) { 
RDebugUtils.currentLine=4718605;
 //BA.debugLineNum = 4718605;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(1, 30";
mostCurrent._lblprojectprogress2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (1),(int) (302),(int) (36)));
RDebugUtils.currentLine=4718606;
 //BA.debugLineNum = 4718606;BA.debugLine="lblProjectProgress2.Text = \"Fundraising Complete";
mostCurrent._lblprojectprogress2.setText(BA.ObjectToCharSequence("Fundraising Completed"));
 }else 
{RDebugUtils.currentLine=4718607;
 //BA.debugLineNum = 4718607;BA.debugLine="Else If StrProgress <> \"100\" Then";
if ((_strprogress).equals("100") == false) { 
RDebugUtils.currentLine=4718608;
 //BA.debugLineNum = 4718608;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(254,";
mostCurrent._lblprojectprogress2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (254),(int) (171),(int) (43)));
RDebugUtils.currentLine=4718609;
 //BA.debugLineNum = 4718609;BA.debugLine="lblProjectProgress2.Text = \"Fundraising in progr";
mostCurrent._lblprojectprogress2.setText(BA.ObjectToCharSequence("Fundraising in progress"));
 }else {
RDebugUtils.currentLine=4718611;
 //BA.debugLineNum = 4718611;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(1, 30";
mostCurrent._lblprojectprogress2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (1),(int) (302),(int) (36)));
RDebugUtils.currentLine=4718612;
 //BA.debugLineNum = 4718612;BA.debugLine="lblProjectProgress2.Text = \"Fundraising Complete";
mostCurrent._lblprojectprogress2.setText(BA.ObjectToCharSequence("Fundraising Completed"));
 }}
;
RDebugUtils.currentLine=4718634;
 //BA.debugLineNum = 4718634;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=4718636;
 //BA.debugLineNum = 4718636;BA.debugLine="End Sub";
return null;
}
public static String  _imgback_click() throws Exception{
RDebugUtils.currentModule="fundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgback_click", null));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Private Sub imgBack_Click";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(pdv.milotin.httpjob _job) throws Exception{
RDebugUtils.currentModule="fundmd";
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
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="Dim jsonString As String = Job.GetString";
_jsonstring = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="Log(jsonString)";
anywheresoftware.b4a.keywords.Common.LogImpl("04653063",_jsonstring,0);
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="parser.Initialize(jsonString)";
_parser.Initialize(_jsonstring);
RDebugUtils.currentLine=4653068;
 //BA.debugLineNum = 4653068;BA.debugLine="If Job.JobName = \"JobGetAudit\" Then";
if ((_job._jobname /*String*/ ).equals("JobGetAudit")) { 
RDebugUtils.currentLine=4653069;
 //BA.debugLineNum = 4653069;BA.debugLine="clvFundList.Clear";
mostCurrent._clvfundlist._clear /*String*/ (null);
RDebugUtils.currentLine=4653072;
 //BA.debugLineNum = 4653072;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=4653073;
 //BA.debugLineNum = 4653073;BA.debugLine="Dim results As List = root.Get(\"result\")";
_results = new anywheresoftware.b4a.objects.collections.List();
_results = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("result"))));
RDebugUtils.currentLine=4653074;
 //BA.debugLineNum = 4653074;BA.debugLine="Dim numberOfItems As Int = results.Size";
_numberofitems = _results.getSize();
RDebugUtils.currentLine=4653075;
 //BA.debugLineNum = 4653075;BA.debugLine="Log(\"Number of items in result: \" & numberOfIte";
anywheresoftware.b4a.keywords.Common.LogImpl("04653075","Number of items in result: "+BA.NumberToString(_numberofitems),0);
RDebugUtils.currentLine=4653076;
 //BA.debugLineNum = 4653076;BA.debugLine="Dim totalFund As Double = 0 ' Initialize total";
_totalfund = 0;
RDebugUtils.currentLine=4653077;
 //BA.debugLineNum = 4653077;BA.debugLine="For Each result As Map In results";
_result = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group14 = _results;
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_result = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group14.Get(index14)));
RDebugUtils.currentLine=4653079;
 //BA.debugLineNum = 4653079;BA.debugLine="Dim metadataString As String = result.Get(\"met";
_metadatastring = BA.ObjectToString(_result.Get((Object)("metadata")));
RDebugUtils.currentLine=4653082;
 //BA.debugLineNum = 4653082;BA.debugLine="Dim metadataParser As JSONParser";
_metadataparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4653083;
 //BA.debugLineNum = 4653083;BA.debugLine="metadataParser.Initialize(metadataString)";
_metadataparser.Initialize(_metadatastring);
RDebugUtils.currentLine=4653084;
 //BA.debugLineNum = 4653084;BA.debugLine="Dim metadata As Map = metadataParser.NextObjec";
_metadata = new anywheresoftware.b4a.objects.collections.Map();
_metadata = _metadataparser.NextObject();
RDebugUtils.currentLine=4653085;
 //BA.debugLineNum = 4653085;BA.debugLine="Dim fund As Double";
_fund = 0;
RDebugUtils.currentLine=4653086;
 //BA.debugLineNum = 4653086;BA.debugLine="fund = metadata.Get(\"fund\")";
_fund = (double)(BA.ObjectToNumber(_metadata.Get((Object)("fund"))));
RDebugUtils.currentLine=4653087;
 //BA.debugLineNum = 4653087;BA.debugLine="totalFund = totalFund + fund";
_totalfund = _totalfund+_fund;
RDebugUtils.currentLine=4653091;
 //BA.debugLineNum = 4653091;BA.debugLine="Log(totalFund)";
anywheresoftware.b4a.keywords.Common.LogImpl("04653091",BA.NumberToString(_totalfund),0);
RDebugUtils.currentLine=4653093;
 //BA.debugLineNum = 4653093;BA.debugLine="clvFundList.Add(CreateListItem(result.Get(\"id\"";
mostCurrent._clvfundlist._add /*String*/ (null,_createlistitem(BA.ObjectToString(_result.Get((Object)("id"))),BA.ObjectToString(_metadata.Get((Object)("project"))),BA.ObjectToString(_metadata.Get((Object)("fund"))),BA.ObjectToString(_metadata.Get((Object)("progress"))),BA.ObjectToString(_metadata.Get((Object)("project_wallet"))),BA.ObjectToString(_metadata.Get((Object)("status"))),mostCurrent._clvfundlist._asview /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ (null).getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (55))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)),_result.Get((Object)("transactionHash")));
RDebugUtils.currentLine=4653094;
 //BA.debugLineNum = 4653094;BA.debugLine="Dim gd As GradientDrawable";
_gd = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=4653095;
 //BA.debugLineNum = 4653095;BA.debugLine="gd.Initialize(\"TR_BL\", Array As Int(Colors.ARG";
_gd.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TR_BL"),new int[]{anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (0),(int) (255),(int) (255),(int) (255)),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (0),(int) (255),(int) (255),(int) (255))});
RDebugUtils.currentLine=4653096;
 //BA.debugLineNum = 4653096;BA.debugLine="gd.CornerRadius = 20dip ' Adjust corner radius";
_gd.setCornerRadius((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20))));
RDebugUtils.currentLine=4653098;
 //BA.debugLineNum = 4653098;BA.debugLine="clvFundList.AsView.Background = gd";
mostCurrent._clvfundlist._asview /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ (null).setBackground((android.graphics.drawable.Drawable)(_gd.getObject()));
 }
};
 }else 
{RDebugUtils.currentLine=4653106;
 //BA.debugLineNum = 4653106;BA.debugLine="Else If Job.JobName = \"JobGetTokenBalance\" Then";
if ((_job._jobname /*String*/ ).equals("JobGetTokenBalance")) { 
RDebugUtils.currentLine=4653107;
 //BA.debugLineNum = 4653107;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=4653108;
 //BA.debugLineNum = 4653108;BA.debugLine="Dim strAmount As String = root.Get(\"result\")";
_stramount = BA.ObjectToString(_root.Get((Object)("result")));
RDebugUtils.currentLine=4653111;
 //BA.debugLineNum = 4653111;BA.debugLine="Dim amount As Double";
_amount = 0;
RDebugUtils.currentLine=4653112;
 //BA.debugLineNum = 4653112;BA.debugLine="amount = strAmount";
_amount = (double)(Double.parseDouble(_stramount));
 }else {
RDebugUtils.currentLine=4653117;
 //BA.debugLineNum = 4653117;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("04653117","Error: "+_job._errormessage /*String*/ ,0);
 }}
;
 }else {
RDebugUtils.currentLine=4653122;
 //BA.debugLineNum = 4653122;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("04653122","Error: "+_job._errormessage /*String*/ ,0);
 };
RDebugUtils.currentLine=4653126;
 //BA.debugLineNum = 4653126;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=4653128;
 //BA.debugLineNum = 4653128;BA.debugLine="End Sub";
return "";
}
public static String  _lblfund_click() throws Exception{
RDebugUtils.currentModule="fundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblfund_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblfund_click", null));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Private Sub lblFund_Click";
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
return "";
}
public static String  _lblhistory_click() throws Exception{
RDebugUtils.currentModule="fundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblhistory_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblhistory_click", null));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Private Sub lblHistory_Click";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="StartActivity(\"HistoryMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("HistoryMd"));
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="End Sub";
return "";
}
public static String  _lblhome_click() throws Exception{
RDebugUtils.currentModule="fundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblhome_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblhome_click", null));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub lblHome_Click";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="End Sub";
return "";
}
public static String  _lbluser_click() throws Exception{
RDebugUtils.currentModule="fundmd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbluser_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbluser_click", null));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Private Sub lblUser_Click";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="StartActivity(\"UserMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("UserMd"));
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="End Sub";
return "";
}
}