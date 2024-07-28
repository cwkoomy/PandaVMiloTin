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
			processBA = new BA(this.getApplicationContext(), null, null, "pdv.milotin", "pdv.milotin.main");
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
public anywheresoftware.b4a.objects.LabelWrapper _lbltopic = null;
public b4a.example.dateutils _dateutils = null;
public pdv.milotin.homemd _homemd = null;
public pdv.milotin.sendfundmd _sendfundmd = null;
public pdv.milotin.usermd _usermd = null;
public pdv.milotin.historymd _historymd = null;
public pdv.milotin.fundmd _fundmd = null;
public pdv.milotin.addprojectmd _addprojectmd = null;
public pdv.milotin.starter _starter = null;
public pdv.milotin.addallocatemd _addallocatemd = null;
public pdv.milotin.viewallocatemd _viewallocatemd = null;
public pdv.milotin.httputils2service _httputils2service = null;

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
vis = vis | (viewallocatemd.mostCurrent != null);
return vis;}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub	 Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 54;BA.debugLine="Activity.LoadLayout(\"MainLy\")";
mostCurrent._activity.LoadLayout("MainLy",mostCurrent.activityBA);
 //BA.debugLineNum = 56;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
mostCurrent._shared = mostCurrent._rp.GetSafeDirDefaultExternal("");
 //BA.debugLineNum = 57;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
mostCurrent._kvs._initialize(processBA,mostCurrent._shared,"Userdatastore");
 //BA.debugLineNum = 59;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 60;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"db.db",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db");
 };
 //BA.debugLineNum = 63;BA.debugLine="If SQL1.IsInitialized = False Then";
if (_sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 64;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
_sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db",anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 67;BA.debugLine="kvs.Put(\"client_id\",ClientKey)";
mostCurrent._kvs._put("client_id",(Object)(_clientkey));
 //BA.debugLineNum = 68;BA.debugLine="kvs.Put(\"client_secret\",HashedClientSecret)";
mostCurrent._kvs._put("client_secret",(Object)(_hashedclientsecret));
 //BA.debugLineNum = 69;BA.debugLine="kvs.Put(\"token-contract\",TokenContractAddress)";
mostCurrent._kvs._put("token-contract",(Object)(_tokencontractaddress));
 //BA.debugLineNum = 70;BA.debugLine="kvs.Put(\"audit-contract\",AuditContractAddress)";
mostCurrent._kvs._put("audit-contract",(Object)(_auditcontractaddress));
 //BA.debugLineNum = 71;BA.debugLine="kvs.Put(\"wallet-address\",txtWalletAddress.Text)";
mostCurrent._kvs._put("wallet-address",(Object)(mostCurrent._txtwalletaddress.getText()));
 //BA.debugLineNum = 75;BA.debugLine="If FirstTime Then '如果第一次，显示splash screen";
if (_firsttime) { 
 //BA.debugLineNum = 76;BA.debugLine="btnLogin.Visible = False";
mostCurrent._btnlogin.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 77;BA.debugLine="pnSplash.Visible=True";
mostCurrent._pnsplash.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 79;BA.debugLine="lblCopyright.Visible = True";
mostCurrent._lblcopyright.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 80;BA.debugLine="Timer1.Initialize(\"Timer1\", 3000)";
_timer1.Initialize(processBA,"Timer1",(long) (3000));
 //BA.debugLineNum = 81;BA.debugLine="Timer1.Enabled=True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 83;BA.debugLine="pnSplash.Visible=False";
mostCurrent._pnsplash.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 84;BA.debugLine="Timer1.Enabled=False";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 86;BA.debugLine="lblCopyright.Visible = False";
mostCurrent._lblcopyright.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 87;BA.debugLine="btnLogin.Visible = True";
mostCurrent._btnlogin.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 91;BA.debugLine="txtUsername.Text = \"admin\"";
mostCurrent._txtusername.setText(BA.ObjectToCharSequence("admin"));
 //BA.debugLineNum = 92;BA.debugLine="txtPassword.Text = \"admin\"";
mostCurrent._txtpassword.setText(BA.ObjectToCharSequence("admin"));
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
String _str1 = "";
String _str2 = "";
 //BA.debugLineNum = 225;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
 //BA.debugLineNum = 227;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
 //BA.debugLineNum = 229;BA.debugLine="Dim str1 As String";
_str1 = "";
 //BA.debugLineNum = 230;BA.debugLine="Dim str2 As String";
_str2 = "";
 //BA.debugLineNum = 232;BA.debugLine="Select Case \"English\" 'kvs.GetSimple(\"CurrLangua";
switch (BA.switchObjectToInt("English","中文","English")) {
case 0: {
 //BA.debugLineNum = 234;BA.debugLine="str1 = \"确定要离开吗?\"";
_str1 = "确定要离开吗?";
 //BA.debugLineNum = 235;BA.debugLine="str2 = \"温馨提醒\"";
_str2 = "温馨提醒";
 break; }
case 1: {
 //BA.debugLineNum = 237;BA.debugLine="str1 = \"Are You Sure Want to Exit?\"";
_str1 = "Are You Sure Want to Exit?";
 //BA.debugLineNum = 238;BA.debugLine="str2 = \"Reminder\"";
_str2 = "Reminder";
 break; }
}
;
 //BA.debugLineNum = 241;BA.debugLine="Select Msgbox2(str1,str2,\"Yes\",\"\",\"No\",Null)";
switch (BA.switchObjectToInt(anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(_str1),BA.ObjectToCharSequence(_str2),"Yes","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) {
case 0: {
 //BA.debugLineNum = 244;BA.debugLine="kvs.Put(\"LEAVE\",\"YES\")";
mostCurrent._kvs._put("LEAVE",(Object)("YES"));
 //BA.debugLineNum = 245;BA.debugLine="kvs.put(\"Logout\",\"NO\")";
mostCurrent._kvs._put("Logout",(Object)("NO"));
 //BA.debugLineNum = 246;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 break; }
default: {
 //BA.debugLineNum = 248;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
}
;
 };
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public static String  _btnlogin_click() throws Exception{
anywheresoftware.b4a.phone.Phone _phone1 = null;
 //BA.debugLineNum = 176;BA.debugLine="Sub btnLogin_Click";
 //BA.debugLineNum = 181;BA.debugLine="If txtUsername.Text = \"\" Then";
if ((mostCurrent._txtusername.getText()).equals("")) { 
 //BA.debugLineNum = 182;BA.debugLine="Msgbox(\"Please Fill In Username!\",\"LOGIN\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please Fill In Username!"),BA.ObjectToCharSequence("LOGIN"),mostCurrent.activityBA);
 };
 //BA.debugLineNum = 185;BA.debugLine="If txtPassword.Text = \"\" Then";
if ((mostCurrent._txtpassword.getText()).equals("")) { 
 //BA.debugLineNum = 186;BA.debugLine="Msgbox(\"Please Fill In Password!\",\"LOGIN\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please Fill In Password!"),BA.ObjectToCharSequence("LOGIN"),mostCurrent.activityBA);
 };
 //BA.debugLineNum = 189;BA.debugLine="cursor1 = SQL1.ExecQuery(\"SELECT * FROM ttUser WH";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sql1.ExecQuery("SELECT * FROM ttUser WHERE ttStatus = 1 AND ttUsername = '"+mostCurrent._txtusername.getText()+"'"+" AND ttPassword = '"+mostCurrent._txtpassword.getText()+"'")));
 //BA.debugLineNum = 191;BA.debugLine="If cursor1.RowCount > 0 Then";
if (_cursor1.getRowCount()>0) { 
 //BA.debugLineNum = 192;BA.debugLine="Private Phone1 As Phone";
_phone1 = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 193;BA.debugLine="DoEvents";
anywheresoftware.b4a.keywords.Common.DoEvents();
 //BA.debugLineNum = 194;BA.debugLine="Phone1.HideKeyboard(Activity)";
_phone1.HideKeyboard(mostCurrent._activity);
 //BA.debugLineNum = 195;BA.debugLine="DoEvents";
anywheresoftware.b4a.keywords.Common.DoEvents();
 //BA.debugLineNum = 199;BA.debugLine="cursor1.Position = 0";
_cursor1.setPosition((int) (0));
 //BA.debugLineNum = 200;BA.debugLine="kvs.Put(\"CURRID\", cursor1.GetString(\"ID\"))";
mostCurrent._kvs._put("CURRID",(Object)(_cursor1.GetString("ID")));
 //BA.debugLineNum = 202;BA.debugLine="kvs.Put(\"REMUSERID\", txtUsername.Text)";
mostCurrent._kvs._put("REMUSERID",(Object)(mostCurrent._txtusername.getText()));
 //BA.debugLineNum = 203;BA.debugLine="kvs.Put(\"CURRUSERNAME\", cursor1.GetString(\"ttUse";
mostCurrent._kvs._put("CURRUSERNAME",(Object)(_cursor1.GetString("ttUsername")));
 //BA.debugLineNum = 204;BA.debugLine="kvs.Put(\"CURRUSERROLE\", cursor1.GetString(\"ttUse";
mostCurrent._kvs._put("CURRUSERROLE",(Object)(_cursor1.GetString("ttUserRole")));
 }else {
 //BA.debugLineNum = 207;BA.debugLine="Msgbox(\"Incorrect Username Or Password!\",\"LOGIN";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Incorrect Username Or Password!"),BA.ObjectToCharSequence("LOGIN FAIL"),mostCurrent.activityBA);
 //BA.debugLineNum = 208;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 221;BA.debugLine="GetWallet";
_getwallet();
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return "";
}
public static String  _getwallet() throws Exception{
pdv.milotin.httpjob _jobgetwallet = null;
String _address = "";
String _url = "";
 //BA.debugLineNum = 119;BA.debugLine="Sub GetWallet";
 //BA.debugLineNum = 121;BA.debugLine="Dim JobGetWallet As HttpJob";
_jobgetwallet = new pdv.milotin.httpjob();
 //BA.debugLineNum = 122;BA.debugLine="JobGetWallet.Initialize(\"JobGetWallet\", Me)";
_jobgetwallet._initialize /*String*/ (processBA,"JobGetWallet",main.getObject());
 //BA.debugLineNum = 123;BA.debugLine="Dim address As String = txtWalletAddress.Text'\"0x";
_address = mostCurrent._txtwalletaddress.getText();
 //BA.debugLineNum = 124;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
_url = "https://service-testnet.maschain.com/api/wallet/wallet/"+_address;
 //BA.debugLineNum = 125;BA.debugLine="JobGetWallet.Download(url)";
_jobgetwallet._download /*String*/ (_url);
 //BA.debugLineNum = 126;BA.debugLine="JobGetWallet.GetRequest.SetHeader(\"client_id\", Cl";
_jobgetwallet._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("client_id",_clientkey);
 //BA.debugLineNum = 127;BA.debugLine="JobGetWallet.GetRequest.SetHeader(\"client_secret\"";
_jobgetwallet._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("client_secret",_hashedclientsecret);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 27;BA.debugLine="Private kvs As KeyValueStore";
mostCurrent._kvs = new b4a.example3.keyvaluestore();
 //BA.debugLineNum = 28;BA.debugLine="Private rp As RuntimePermissions";
mostCurrent._rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 29;BA.debugLine="Private shared As String";
mostCurrent._shared = "";
 //BA.debugLineNum = 32;BA.debugLine="Private pnMain As Panel";
mostCurrent._pnmain = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private lblTop As Label";
mostCurrent._lbltop = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private pnUsername As Panel";
mostCurrent._pnusername = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private imgUsername As ImageView";
mostCurrent._imgusername = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private txtUsername As EditText";
mostCurrent._txtusername = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private iconCheck As Label";
mostCurrent._iconcheck = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private pnPassword As Panel";
mostCurrent._pnpassword = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private imgPassword As ImageView";
mostCurrent._imgpassword = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private txtPassword As EditText";
mostCurrent._txtpassword = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private pnWallet As Panel";
mostCurrent._pnwallet = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private imgWallet As ImageView";
mostCurrent._imgwallet = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private txtWalletAddress As EditText";
mostCurrent._txtwalletaddress = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private btnLogin As Button";
mostCurrent._btnlogin = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private lblForgotPassword As Label";
mostCurrent._lblforgotpassword = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private pnSplash As Panel";
mostCurrent._pnsplash = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private lblCopyright As Label";
mostCurrent._lblcopyright = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private lblTopic As Label";
mostCurrent._lbltopic = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(pdv.milotin.httpjob _job) throws Exception{
String _jsonstring = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _result = null;
 //BA.debugLineNum = 131;BA.debugLine="Sub JobDone(job As HttpJob)";
 //BA.debugLineNum = 132;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 134;BA.debugLine="If job.Success = True Then";
if (_job._success /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 136;BA.debugLine="Dim jsonString As String = job.GetString";
_jsonstring = _job._getstring /*String*/ ();
 //BA.debugLineNum = 137;BA.debugLine="Log(jsonString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6327686",_jsonstring,0);
 //BA.debugLineNum = 139;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 140;BA.debugLine="parser.Initialize(jsonString)";
_parser.Initialize(_jsonstring);
 //BA.debugLineNum = 142;BA.debugLine="If job.JobName = \"JobGetWallet\" Then";
if ((_job._jobname /*String*/ ).equals("JobGetWallet")) { 
 //BA.debugLineNum = 145;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 146;BA.debugLine="Dim result As Map = root.Get(\"result\")";
_result = new anywheresoftware.b4a.objects.collections.Map();
_result = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("result"))));
 //BA.debugLineNum = 149;BA.debugLine="kvs.Put(\"WalletId\",result.Get(\"id\"))";
mostCurrent._kvs._put("WalletId",_result.Get((Object)("id")));
 //BA.debugLineNum = 150;BA.debugLine="kvs.Put(\"WalletAddress\",result.Get(\"address\"))";
mostCurrent._kvs._put("WalletAddress",_result.Get((Object)("address")));
 //BA.debugLineNum = 151;BA.debugLine="kvs.Put(\"WalletName\",result.Get(\"name\"))";
mostCurrent._kvs._put("WalletName",_result.Get((Object)("name")));
 };
 }else {
 //BA.debugLineNum = 158;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 162;BA.debugLine="job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 164;BA.debugLine="StartActivity(\"HomeMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("HomeMd"));
 //BA.debugLineNum = 165;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
main._process_globals();
homemd._process_globals();
sendfundmd._process_globals();
usermd._process_globals();
historymd._process_globals();
fundmd._process_globals();
addprojectmd._process_globals();
starter._process_globals();
addallocatemd._process_globals();
viewallocatemd._process_globals();
httputils2service._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 17;BA.debugLine="Private Timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 18;BA.debugLine="Private SQL1 As SQL";
_sql1 = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 19;BA.debugLine="Private cursor1, cursorSetting As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cursorsetting = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private ClientKey As String = \"29ce9025492f7af261";
_clientkey = "29ce9025492f7af26177ff2c85b3703a1ec763dbbc49a19dff1442d6b810b68b";
 //BA.debugLineNum = 21;BA.debugLine="Private HashedClientSecret As String = \"sk_71a349";
_hashedclientsecret = "sk_71a349f5467456ee1c321604553cc6afa62b3e8a9482f5749ab4ab70f10b7380";
 //BA.debugLineNum = 22;BA.debugLine="Private TokenContractAddress As String = \"0x5BA88";
_tokencontractaddress = "0x5BA886F619b95E2b2a875503e2FCE58c14027ade";
 //BA.debugLineNum = 23;BA.debugLine="Private AuditContractAddress As String = \"0x352D1";
_auditcontractaddress = "0x352D1B542278e277061617b2CcEcb6B56E62b757";
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub Timer1_tick";
 //BA.debugLineNum = 112;BA.debugLine="pnSplash.Visible=False";
mostCurrent._pnsplash.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 113;BA.debugLine="Timer1.Enabled = False";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 115;BA.debugLine="btnLogin.Visible = True";
mostCurrent._btnlogin.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
}
