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
			processBA = new BA(this.getApplicationContext(), null, null, "pdv.milotin", "pdv.milotin.homemd");
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
 //BA.debugLineNum = 61;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 63;BA.debugLine="Activity.LoadLayout(\"HomeLy\")";
mostCurrent._activity.LoadLayout("HomeLy",mostCurrent.activityBA);
 //BA.debugLineNum = 65;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
mostCurrent._shared = mostCurrent._rp.GetSafeDirDefaultExternal("");
 //BA.debugLineNum = 66;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
mostCurrent._kvs._initialize(processBA,mostCurrent._shared,"Userdatastore");
 //BA.debugLineNum = 68;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 69;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"db.db",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db");
 };
 //BA.debugLineNum = 72;BA.debugLine="If SQL1.IsInitialized = False Then";
if (mostCurrent._sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 73;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
mostCurrent._sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db",anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 76;BA.debugLine="lblWalletName.Text = kvs.Get(\"WalletName\")";
mostCurrent._lblwalletname.setText(BA.ObjectToCharSequence(mostCurrent._kvs._get("WalletName")));
 //BA.debugLineNum = 78;BA.debugLine="GetAudit";
_getaudit();
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
String _str1 = "";
String _str2 = "";
 //BA.debugLineNum = 264;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
 //BA.debugLineNum = 266;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
 //BA.debugLineNum = 268;BA.debugLine="Dim str1 As String";
_str1 = "";
 //BA.debugLineNum = 269;BA.debugLine="Dim str2 As String";
_str2 = "";
 //BA.debugLineNum = 271;BA.debugLine="Select Case \"English\" 'kvs.GetSimple(\"CurrLangua";
switch (BA.switchObjectToInt("English","中文","English")) {
case 0: {
 //BA.debugLineNum = 273;BA.debugLine="str1 = \"确定要离开吗?\"";
_str1 = "确定要离开吗?";
 //BA.debugLineNum = 274;BA.debugLine="str2 = \"温馨提醒\"";
_str2 = "温馨提醒";
 break; }
case 1: {
 //BA.debugLineNum = 276;BA.debugLine="str1 = \"Are You Sure Want to Exit?\"";
_str1 = "Are You Sure Want to Exit?";
 //BA.debugLineNum = 277;BA.debugLine="str2 = \"Reminder\"";
_str2 = "Reminder";
 break; }
}
;
 //BA.debugLineNum = 280;BA.debugLine="Select Msgbox2(str1,str2,\"Yes\",\"\",\"No\",Null)";
switch (BA.switchObjectToInt(anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(_str1),BA.ObjectToCharSequence(_str2),"Yes","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) {
case 0: {
 //BA.debugLineNum = 283;BA.debugLine="kvs.Put(\"LEAVE\",\"YES\")";
mostCurrent._kvs._put("LEAVE",(Object)("YES"));
 //BA.debugLineNum = 284;BA.debugLine="kvs.put(\"Logout\",\"NO\")";
mostCurrent._kvs._put("Logout",(Object)("NO"));
 //BA.debugLineNum = 285;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 break; }
default: {
 //BA.debugLineNum = 287;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
}
;
 };
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public static String  _btnadd_click() throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Private Sub btnAdd_Click";
 //BA.debugLineNum = 311;BA.debugLine="StartActivity(\"AddProjectMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("AddProjectMd"));
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return "";
}
public static String  _clvhome_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub clvHome_ItemClick (Index As Int, Value As Obje";
 //BA.debugLineNum = 256;BA.debugLine="kvs.Put(\"AuditTransactionHash\",Value)";
mostCurrent._kvs._put("AuditTransactionHash",_value);
 //BA.debugLineNum = 258;BA.debugLine="Log(kvs.Get(\"AuditTransactionHash\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("11310724",BA.ObjectToString(mostCurrent._kvs._get("AuditTransactionHash")),0);
 //BA.debugLineNum = 259;BA.debugLine="StartActivity(\"SendFundMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("SendFundMd"));
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createlistitem(String _strid,String _strproject,String _strfund,String _strprogress,String _strprojectwallet,String _strstatus,int _width,int _height) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _p = null;
 //BA.debugLineNum = 220;BA.debugLine="Sub CreateListItem(strID As String, strProject As";
 //BA.debugLineNum = 222;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 223;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 225;BA.debugLine="Activity.AddView(p, 0, 0, 96%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (96),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 226;BA.debugLine="p.LoadLayout(\"ListViewLy1\")";
_p.LoadLayout("ListViewLy1",mostCurrent.activityBA);
 //BA.debugLineNum = 227;BA.debugLine="p.RemoveView";
_p.RemoveView();
 //BA.debugLineNum = 229;BA.debugLine="lblProjectTitle2.Text = strProject";
mostCurrent._lblprojecttitle2.setText(BA.ObjectToCharSequence(_strproject));
 //BA.debugLineNum = 230;BA.debugLine="lblProjectFund2.Text = \"RM \" & NumberFormat2(str";
mostCurrent._lblprojectfund2.setText(BA.ObjectToCharSequence("RM "+anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_strfund)),(int) (0),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.True)));
 //BA.debugLineNum = 231;BA.debugLine="Log(StrProgress)";
anywheresoftware.b4a.keywords.Common.LogImpl("11245195",_strprogress,0);
 //BA.debugLineNum = 232;BA.debugLine="If StrProgress = Null Or StrProgress = \"null\" The";
if (_strprogress== null || (_strprogress).equals("null")) { 
 //BA.debugLineNum = 233;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(5,206";
mostCurrent._lblprojectprogress2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (5),(int) (206),(int) (46)));
 //BA.debugLineNum = 234;BA.debugLine="lblProjectProgress2.Text = \"Fundraising Complete";
mostCurrent._lblprojectprogress2.setText(BA.ObjectToCharSequence("Fundraising Completed"));
 }else if((_strprogress).equals("100") == false) { 
 //BA.debugLineNum = 236;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(254,";
mostCurrent._lblprojectprogress2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (254),(int) (171),(int) (43)));
 //BA.debugLineNum = 237;BA.debugLine="lblProjectProgress2.Text = \"Fundraising in progr";
mostCurrent._lblprojectprogress2.setText(BA.ObjectToCharSequence("Fundraising in progress"));
 }else {
 //BA.debugLineNum = 239;BA.debugLine="lblProjectProgress2.TextColor = Colors.RGB(5,206";
mostCurrent._lblprojectprogress2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (5),(int) (206),(int) (46)));
 //BA.debugLineNum = 240;BA.debugLine="lblProjectProgress2.Text = \"Fundraising Complete";
mostCurrent._lblprojectprogress2.setText(BA.ObjectToCharSequence("Fundraising Completed"));
 };
 //BA.debugLineNum = 243;BA.debugLine="If StrProgress = Null Or StrProgress = \"null\" The";
if (_strprogress== null || (_strprogress).equals("null")) { 
 //BA.debugLineNum = 244;BA.debugLine="StrProgress = \"100\"";
_strprogress = "100";
 //BA.debugLineNum = 245;BA.debugLine="cpBar1.Value = StrProgress";
mostCurrent._cpbar1._setvalue /*float*/ ((float)(Double.parseDouble(_strprogress)));
 }else {
 //BA.debugLineNum = 247;BA.debugLine="cpBar1.Value = StrProgress";
mostCurrent._cpbar1._setvalue /*float*/ ((float)(Double.parseDouble(_strprogress)));
 };
 //BA.debugLineNum = 249;BA.debugLine="cpBar1.Value = StrProgress";
mostCurrent._cpbar1._setvalue /*float*/ ((float)(Double.parseDouble(_strprogress)));
 //BA.debugLineNum = 250;BA.debugLine="Return p";
if (true) return _p;
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public static String  _getaudit() throws Exception{
pdv.milotin.httpjob _jobgetaudit = null;
String _url = "";
 //BA.debugLineNum = 133;BA.debugLine="Sub GetAudit";
 //BA.debugLineNum = 135;BA.debugLine="Dim JobGetAudit As HttpJob";
_jobgetaudit = new pdv.milotin.httpjob();
 //BA.debugLineNum = 136;BA.debugLine="JobGetAudit.Initialize(\"JobGetAudit\", Me)";
_jobgetaudit._initialize /*String*/ (processBA,"JobGetAudit",homemd.getObject());
 //BA.debugLineNum = 138;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
_url = "https://service-testnet.maschain.com/api/audit/audit?tag=5";
 //BA.debugLineNum = 139;BA.debugLine="JobGetAudit.Download(url)";
_jobgetaudit._download /*String*/ (_url);
 //BA.debugLineNum = 140;BA.debugLine="JobGetAudit.GetRequest.SetHeader(\"client_id\", kvs";
_jobgetaudit._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("client_id",BA.ObjectToString(mostCurrent._kvs._get("client_id")));
 //BA.debugLineNum = 141;BA.debugLine="JobGetAudit.GetRequest.SetHeader(\"client_secret\",";
_jobgetaudit._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("client_secret",BA.ObjectToString(mostCurrent._kvs._get("client_secret")));
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public static String  _gettokenbalance() throws Exception{
pdv.milotin.httpjob _jobgettokenbalance = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
anywheresoftware.b4a.objects.collections.Map _data = null;
String _url = "";
 //BA.debugLineNum = 90;BA.debugLine="Sub GetTokenBalance";
 //BA.debugLineNum = 91;BA.debugLine="Dim JobGetTokenBalance As HttpJob";
_jobgettokenbalance = new pdv.milotin.httpjob();
 //BA.debugLineNum = 92;BA.debugLine="JobGetTokenBalance.Initialize(\"JobGetTokenBalance";
_jobgettokenbalance._initialize /*String*/ (processBA,"JobGetTokenBalance",homemd.getObject());
 //BA.debugLineNum = 95;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 96;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 97;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 98;BA.debugLine="data.Put(\"wallet_address\", kvs.Get(\"WalletAddress";
_data.Put((Object)("wallet_address"),mostCurrent._kvs._get("WalletAddress"));
 //BA.debugLineNum = 99;BA.debugLine="data.Put(\"contract_address\", kvs.Get(\"token-contr";
_data.Put((Object)("contract_address"),mostCurrent._kvs._get("token-contract"));
 //BA.debugLineNum = 100;BA.debugLine="json.Initialize(data)";
_json.Initialize(_data);
 //BA.debugLineNum = 104;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
_url = "https://service-testnet.maschain.com/api/token/balance/";
 //BA.debugLineNum = 105;BA.debugLine="JobGetTokenBalance.PostString(url, json.ToString)";
_jobgettokenbalance._poststring /*String*/ (_url,_json.ToString());
 //BA.debugLineNum = 106;BA.debugLine="JobGetTokenBalance.GetRequest.SetContentType(\"app";
_jobgettokenbalance._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 107;BA.debugLine="JobGetTokenBalance.GetRequest.SetHeader(\"client_i";
_jobgettokenbalance._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("client_id",BA.ObjectToString(mostCurrent._kvs._get("client_id")));
 //BA.debugLineNum = 108;BA.debugLine="JobGetTokenBalance.GetRequest.SetHeader(\"client_s";
_jobgettokenbalance._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("client_secret",BA.ObjectToString(mostCurrent._kvs._get("client_secret")));
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 19;BA.debugLine="Private lblHeaderBg As Label";
mostCurrent._lblheaderbg = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private lblTop As Label";
mostCurrent._lbltop = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private lblBottom As Label";
mostCurrent._lblbottom = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private lblFund As Label";
mostCurrent._lblfund = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private lblHistory As Label";
mostCurrent._lblhistory = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private lblUser As Label";
mostCurrent._lbluser = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private lblHeader1 As Label";
mostCurrent._lblheader1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private lblHeader2 As Label";
mostCurrent._lblheader2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private lblAmount As Label";
mostCurrent._lblamount = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private lblTotal As Label";
mostCurrent._lbltotal = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private lblProjectTitle2 As Label";
mostCurrent._lblprojecttitle2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private lblProjectFund2 As Label";
mostCurrent._lblprojectfund2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private lblProjectTitle As Label";
mostCurrent._lblprojecttitle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private lblProjectFund As Label";
mostCurrent._lblprojectfund = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private lblProjectProgress As Label";
mostCurrent._lblprojectprogress = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private clvHome As CustomListView";
mostCurrent._clvhome = new pdv.milotin.customlistview();
 //BA.debugLineNum = 41;BA.debugLine="Private pnHeader1 As Panel";
mostCurrent._pnheader1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private lblHome As Label";
mostCurrent._lblhome = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private lblLine1 As Label";
mostCurrent._lblline1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private lblHome2 As Label";
mostCurrent._lblhome2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private lblFund2 As Label";
mostCurrent._lblfund2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private lblHistory2 As Label";
mostCurrent._lblhistory2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private lblUser2 As Label";
mostCurrent._lbluser2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private cpBar1 As CircularProgressBar";
mostCurrent._cpbar1 = new pdv.milotin.circularprogressbar();
 //BA.debugLineNum = 49;BA.debugLine="Private lblProjectProgress2 As Label";
mostCurrent._lblprojectprogress2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private lblWalletName As Label";
mostCurrent._lblwalletname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private imgMenu As ImageView";
mostCurrent._imgmenu = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 54;BA.debugLine="Private imgProject As ImageView";
mostCurrent._imgproject = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Private imgFunding As ImageView";
mostCurrent._imgfunding = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 56;BA.debugLine="Private imgProgress As ImageView";
mostCurrent._imgprogress = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 57;BA.debugLine="Private pnListView As Panel";
mostCurrent._pnlistview = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 58;BA.debugLine="Private btnAdd As Button";
mostCurrent._btnadd = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public static String  _imgadd_click() throws Exception{
 //BA.debugLineNum = 330;BA.debugLine="Private Sub imgAdd_Click";
 //BA.debugLineNum = 331;BA.debugLine="StartActivity(\"AddProjectMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("AddProjectMd"));
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return "";
}
public static String  _imgmenu_click() throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Private Sub imgMenu_Click";
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(pdv.milotin.httpjob _job) throws Exception{
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
 //BA.debugLineNum = 146;BA.debugLine="Sub JobDone(Job As HttpJob)";
 //BA.debugLineNum = 148;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 150;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
 //BA.debugLineNum = 152;BA.debugLine="Dim jsonString As String = Job.GetString";
_jsonstring = _job._getstring /*String*/ ();
 //BA.debugLineNum = 153;BA.debugLine="Log(jsonString)";
anywheresoftware.b4a.keywords.Common.LogImpl("11179655",_jsonstring,0);
 //BA.debugLineNum = 155;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 156;BA.debugLine="parser.Initialize(jsonString)";
_parser.Initialize(_jsonstring);
 //BA.debugLineNum = 158;BA.debugLine="If Job.JobName = \"JobGetAudit\" Then";
if ((_job._jobname /*String*/ ).equals("JobGetAudit")) { 
 //BA.debugLineNum = 159;BA.debugLine="clvHome.Clear";
mostCurrent._clvhome._clear /*String*/ ();
 //BA.debugLineNum = 162;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 163;BA.debugLine="Dim results As List = root.Get(\"result\")";
_results = new anywheresoftware.b4a.objects.collections.List();
_results = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("result"))));
 //BA.debugLineNum = 164;BA.debugLine="Dim numberOfItems As Int = results.Size";
_numberofitems = _results.getSize();
 //BA.debugLineNum = 165;BA.debugLine="Log(\"Number of items in result: \" & numberOfIte";
anywheresoftware.b4a.keywords.Common.LogImpl("11179667","Number of items in result: "+BA.NumberToString(_numberofitems),0);
 //BA.debugLineNum = 166;BA.debugLine="Dim totalFund As Double = 0 ' Initialize total";
_totalfund = 0;
 //BA.debugLineNum = 167;BA.debugLine="For Each result As Map In results";
_result = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group14 = _results;
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_result = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group14.Get(index14)));
 //BA.debugLineNum = 169;BA.debugLine="Dim metadataString As String = result.Get(\"met";
_metadatastring = BA.ObjectToString(_result.Get((Object)("metadata")));
 //BA.debugLineNum = 172;BA.debugLine="Dim metadataParser As JSONParser";
_metadataparser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 173;BA.debugLine="metadataParser.Initialize(metadataString)";
_metadataparser.Initialize(_metadatastring);
 //BA.debugLineNum = 174;BA.debugLine="Dim metadata As Map = metadataParser.NextObjec";
_metadata = new anywheresoftware.b4a.objects.collections.Map();
_metadata = _metadataparser.NextObject();
 //BA.debugLineNum = 175;BA.debugLine="Dim fund As Double";
_fund = 0;
 //BA.debugLineNum = 176;BA.debugLine="fund = metadata.Get(\"fund\")";
_fund = (double)(BA.ObjectToNumber(_metadata.Get((Object)("fund"))));
 //BA.debugLineNum = 177;BA.debugLine="totalFund = totalFund + fund";
_totalfund = _totalfund+_fund;
 //BA.debugLineNum = 179;BA.debugLine="lblTotal.Text = root.Get(\"result\")";
mostCurrent._lbltotal.setText(BA.ObjectToCharSequence(_root.Get((Object)("result"))));
 //BA.debugLineNum = 180;BA.debugLine="lblAmount.Text = \"RM \" & NumberFormat2(totalFu";
mostCurrent._lblamount.setText(BA.ObjectToCharSequence("RM "+anywheresoftware.b4a.keywords.Common.NumberFormat2(_totalfund,(int) (0),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.True)));
 //BA.debugLineNum = 181;BA.debugLine="Log(totalFund)";
anywheresoftware.b4a.keywords.Common.LogImpl("11179683",BA.NumberToString(_totalfund),0);
 //BA.debugLineNum = 183;BA.debugLine="clvHome.Add(CreateListItem(result.Get(\"id\"),me";
mostCurrent._clvhome._add /*String*/ (_createlistitem(BA.ObjectToString(_result.Get((Object)("id"))),BA.ObjectToString(_metadata.Get((Object)("project"))),BA.ObjectToString(_metadata.Get((Object)("fund"))),BA.ObjectToString(_metadata.Get((Object)("progress"))),BA.ObjectToString(_metadata.Get((Object)("project_wallet"))),BA.ObjectToString(_metadata.Get((Object)("status"))),mostCurrent._clvhome._asview /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ ().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (55))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)),_result.Get((Object)("transactionHash")));
 //BA.debugLineNum = 184;BA.debugLine="Dim gd As GradientDrawable";
_gd = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
 //BA.debugLineNum = 185;BA.debugLine="gd.Initialize(\"TR_BL\", Array As Int(Colors.ARG";
_gd.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TR_BL"),new int[]{anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (0),(int) (255),(int) (255),(int) (255)),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (0),(int) (255),(int) (255),(int) (255))});
 //BA.debugLineNum = 186;BA.debugLine="gd.CornerRadius = 20dip ' Adjust corner radius";
_gd.setCornerRadius((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20))));
 //BA.debugLineNum = 188;BA.debugLine="clvHome.AsView.Background = gd";
mostCurrent._clvhome._asview /*anywheresoftware.b4a.objects.ConcreteViewWrapper*/ ().setBackground((android.graphics.drawable.Drawable)(_gd.getObject()));
 }
};
 //BA.debugLineNum = 192;BA.debugLine="lblTotal.Text = numberOfItems";
mostCurrent._lbltotal.setText(BA.ObjectToCharSequence(_numberofitems));
 //BA.debugLineNum = 194;BA.debugLine="GetTokenBalance";
_gettokenbalance();
 }else if((_job._jobname /*String*/ ).equals("JobGetTokenBalance")) { 
 //BA.debugLineNum = 197;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 198;BA.debugLine="Dim strAmount As String = root.Get(\"result\")";
_stramount = BA.ObjectToString(_root.Get((Object)("result")));
 //BA.debugLineNum = 201;BA.debugLine="Dim amount As Double";
_amount = 0;
 //BA.debugLineNum = 202;BA.debugLine="amount = strAmount";
_amount = (double)(Double.parseDouble(_stramount));
 }else {
 //BA.debugLineNum = 207;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("11179709","Error: "+_job._errormessage /*String*/ ,0);
 };
 }else {
 //BA.debugLineNum = 212;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("11179714","Error: "+_job._errormessage /*String*/ ,0);
 };
 //BA.debugLineNum = 216;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return "";
}
public static String  _lblfund_click() throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Private Sub lblFund_Click";
 //BA.debugLineNum = 294;BA.debugLine="StartActivity(\"FundMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("FundMd"));
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return "";
}
public static String  _lblfund2_click() throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Private Sub lblFund2_Click";
 //BA.debugLineNum = 319;BA.debugLine="StartActivity(\"FundMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("FundMd"));
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return "";
}
public static String  _lblhistory_click() throws Exception{
 //BA.debugLineNum = 297;BA.debugLine="Private Sub lblHistory_Click";
 //BA.debugLineNum = 298;BA.debugLine="StartActivity(\"HistoryMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("HistoryMd"));
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return "";
}
public static String  _lblhistory2_click() throws Exception{
 //BA.debugLineNum = 322;BA.debugLine="Private Sub lblHistory2_Click";
 //BA.debugLineNum = 323;BA.debugLine="StartActivity(\"HistoryMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("HistoryMd"));
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return "";
}
public static String  _lblhome2_click() throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Private Sub lblHome2_Click";
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return "";
}
public static String  _lbluser_click() throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Private Sub lblUser_Click";
 //BA.debugLineNum = 302;BA.debugLine="StartActivity(\"UserMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("UserMd"));
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return "";
}
public static String  _lbluser2_click() throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Private Sub lblUser2_Click";
 //BA.debugLineNum = 327;BA.debugLine="StartActivity(\"UserMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("UserMd"));
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
}
