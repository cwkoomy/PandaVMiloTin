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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "pdv.milotin", "pdv.milotin.usermd");
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
public b4a.example.dateutils _dateutils = null;
public pdv.milotin.main _main = null;
public pdv.milotin.homemd _homemd = null;
public pdv.milotin.sendfundmd _sendfundmd = null;
public pdv.milotin.historymd _historymd = null;
public pdv.milotin.fundmd _fundmd = null;
public pdv.milotin.addprojectmd _addprojectmd = null;
public pdv.milotin.starter _starter = null;
public pdv.milotin.addallocatemd _addallocatemd = null;
public pdv.milotin.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="usermd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Activity.LoadLayout(\"UserLy\")";
mostCurrent._activity.LoadLayout("UserLy",mostCurrent.activityBA);
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
mostCurrent._shared = mostCurrent._rp.GetSafeDirDefaultExternal("");
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
mostCurrent._kvs._initialize(processBA,mostCurrent._shared,"Userdatastore");
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="qr.Initialize";
mostCurrent._qr._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"db.db",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db");
 };
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="If SQL1.IsInitialized = False Then";
if (mostCurrent._sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
mostCurrent._sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=2883600;
 //BA.debugLineNum = 2883600;BA.debugLine="GenerateQR";
_generateqr();
RDebugUtils.currentLine=2883602;
 //BA.debugLineNum = 2883602;BA.debugLine="End Sub";
return "";
}
public static String  _generateqr() throws Exception{
RDebugUtils.currentModule="usermd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "generateqr", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "generateqr", null));}
String _strqrcode = "";
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub GenerateQR";
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="Dim strQRCode As String";
_strqrcode = "";
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="strQRCode = kvs.Get(\"WalletAddress\")";
_strqrcode = BA.ObjectToString(mostCurrent._kvs._get("WalletAddress"));
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="bmr = qr.drawQRCode(strQRCode)";
mostCurrent._bmr = mostCurrent._qr._drawqrcode /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (null,_strqrcode);
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="imgQR.Bitmap = bmr";
mostCurrent._imgqr.setBitmap((android.graphics.Bitmap)(mostCurrent._bmr.getObject()));
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="Log(strQRCode)";
anywheresoftware.b4a.keywords.Common.LogImpl("03080199",_strqrcode,0);
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="usermd";
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="usermd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return "";
}
public static String  _imgback_click() throws Exception{
RDebugUtils.currentModule="usermd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgback_click", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub imgBack_Click";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return "";
}
public static String  _imgedit_click() throws Exception{
RDebugUtils.currentModule="usermd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgedit_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgedit_click", null));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub imgEdit_Click";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="txtFullName.Enabled = True";
mostCurrent._txtfullname.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="txtEmail.Enabled = True";
mostCurrent._txtemail.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="txtPassword.Enabled = True";
mostCurrent._txtpassword.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="txtPhone.Enabled = True";
mostCurrent._txtphone.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="txtFullName.TextColor = Colors.RGB(0,0,0)";
mostCurrent._txtfullname.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="txtEmail.TextColor = Colors.RGB(0,0,0)";
mostCurrent._txtemail.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="txtPassword.TextColor = Colors.RGB(0,0,0)";
mostCurrent._txtpassword.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="txtPhone.TextColor = Colors.RGB(0,0,0)";
mostCurrent._txtphone.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=3473417;
 //BA.debugLineNum = 3473417;BA.debugLine="imgSave.Visible = True";
mostCurrent._imgsave.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3473418;
 //BA.debugLineNum = 3473418;BA.debugLine="imgSave.Enabled = True";
mostCurrent._imgsave.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3473419;
 //BA.debugLineNum = 3473419;BA.debugLine="imgEdit.Visible = False";
mostCurrent._imgedit.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3473420;
 //BA.debugLineNum = 3473420;BA.debugLine="imgEdit.Enabled = False";
mostCurrent._imgedit.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3473421;
 //BA.debugLineNum = 3473421;BA.debugLine="End Sub";
return "";
}
public static String  _imgsave_click() throws Exception{
RDebugUtils.currentModule="usermd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgsave_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgsave_click", null));}
String _strfullname = "";
String _stremail = "";
String _strpassword = "";
String _strphone = "";
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Private Sub imgSave_Click";
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Dim strFullName As String = txtFullName.Text";
_strfullname = mostCurrent._txtfullname.getText();
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="txtFullName.Text = strFullName";
mostCurrent._txtfullname.setText(BA.ObjectToCharSequence(_strfullname));
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="Dim strEmail As String = txtEmail.Text";
_stremail = mostCurrent._txtemail.getText();
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="txtEmail.Text = strEmail";
mostCurrent._txtemail.setText(BA.ObjectToCharSequence(_stremail));
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="Dim strPassword As String = txtPassword.Text";
_strpassword = mostCurrent._txtpassword.getText();
RDebugUtils.currentLine=3538951;
 //BA.debugLineNum = 3538951;BA.debugLine="txtPassword.Text = strPassword";
mostCurrent._txtpassword.setText(BA.ObjectToCharSequence(_strpassword));
RDebugUtils.currentLine=3538952;
 //BA.debugLineNum = 3538952;BA.debugLine="Dim strPhone As String = txtPhone.Text";
_strphone = mostCurrent._txtphone.getText();
RDebugUtils.currentLine=3538953;
 //BA.debugLineNum = 3538953;BA.debugLine="txtPhone.Text = strPhone";
mostCurrent._txtphone.setText(BA.ObjectToCharSequence(_strphone));
RDebugUtils.currentLine=3538955;
 //BA.debugLineNum = 3538955;BA.debugLine="txtFullName.Enabled = False";
mostCurrent._txtfullname.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3538956;
 //BA.debugLineNum = 3538956;BA.debugLine="txtEmail.Enabled = False";
mostCurrent._txtemail.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3538957;
 //BA.debugLineNum = 3538957;BA.debugLine="txtPassword.Enabled = False";
mostCurrent._txtpassword.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3538958;
 //BA.debugLineNum = 3538958;BA.debugLine="txtPhone.Enabled = False";
mostCurrent._txtphone.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3538959;
 //BA.debugLineNum = 3538959;BA.debugLine="txtFullName.TextColor = Colors.RGB(149,149,149)";
mostCurrent._txtfullname.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (149),(int) (149),(int) (149)));
RDebugUtils.currentLine=3538960;
 //BA.debugLineNum = 3538960;BA.debugLine="txtEmail.TextColor = Colors.RGB(149,149,149)";
mostCurrent._txtemail.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (149),(int) (149),(int) (149)));
RDebugUtils.currentLine=3538961;
 //BA.debugLineNum = 3538961;BA.debugLine="txtPassword.TextColor = Colors.RGB(149,149,149)";
mostCurrent._txtpassword.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (149),(int) (149),(int) (149)));
RDebugUtils.currentLine=3538962;
 //BA.debugLineNum = 3538962;BA.debugLine="txtPhone.TextColor = Colors.RGB(149,149,149)";
mostCurrent._txtphone.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (149),(int) (149),(int) (149)));
RDebugUtils.currentLine=3538963;
 //BA.debugLineNum = 3538963;BA.debugLine="imgEdit.Visible = True";
mostCurrent._imgedit.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3538964;
 //BA.debugLineNum = 3538964;BA.debugLine="imgEdit.Enabled = True";
mostCurrent._imgedit.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3538965;
 //BA.debugLineNum = 3538965;BA.debugLine="imgSave.Visible = False";
mostCurrent._imgsave.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3538966;
 //BA.debugLineNum = 3538966;BA.debugLine="imgSave.Enabled = False";
mostCurrent._imgsave.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3538967;
 //BA.debugLineNum = 3538967;BA.debugLine="ToastMessageShow(\"Save Succesful!\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Save Succesful!"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3538968;
 //BA.debugLineNum = 3538968;BA.debugLine="End Sub";
return "";
}
public static String  _lblfund_click() throws Exception{
RDebugUtils.currentModule="usermd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblfund_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblfund_click", null));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub lblFund_Click";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="StartActivity(\"FundMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("FundMd"));
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="End Sub";
return "";
}
public static String  _lblhistory_click() throws Exception{
RDebugUtils.currentModule="usermd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblhistory_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblhistory_click", null));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub lblHistory_Click";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="StartActivity(\"HistoryMd\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("HistoryMd"));
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="End Sub";
return "";
}
public static String  _lblhome_click() throws Exception{
RDebugUtils.currentModule="usermd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblhome_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblhome_click", null));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub lblHome_Click";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="End Sub";
return "";
}
public static String  _lbluser_click() throws Exception{
RDebugUtils.currentModule="usermd";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbluser_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbluser_click", null));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub lblUser_Click";
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="End Sub";
return "";
}
}