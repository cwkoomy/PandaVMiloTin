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

public class certmd extends Activity implements B4AActivity{
	public static certmd mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "pdv.milotin", "pdv.milotin.certmd");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (certmd).");
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
		activityBA = new BA(this, layout, processBA, "pdv.milotin", "pdv.milotin.certmd");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "pdv.milotin.certmd", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (certmd) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (certmd) Resume **");
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
		return certmd.class;
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
            BA.LogInfo("** Activity (certmd) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (certmd) Pause event (activity is not paused). **");
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
            certmd mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (certmd) Resume **");
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
public anywheresoftware.b4a.objects.ImageViewWrapper _imgback = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnframe2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblusertitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblline4 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgqr = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcert = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncopycert = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgcertimage = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnqr = null;
public b4a.example.dateutils _dateutils = null;
public pdv.milotin.main _main = null;
public pdv.milotin.homemd _homemd = null;
public pdv.milotin.sendfundmd _sendfundmd = null;
public pdv.milotin.usermd _usermd = null;
public pdv.milotin.historymd _historymd = null;
public pdv.milotin.fundmd _fundmd = null;
public pdv.milotin.addprojectmd _addprojectmd = null;
public pdv.milotin.addallocatemd _addallocatemd = null;
public pdv.milotin.viewallocatemd _viewallocatemd = null;
public pdv.milotin.kyc1md _kyc1md = null;
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
 //BA.debugLineNum = 35;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 37;BA.debugLine="Activity.LoadLayout(\"CertLy\")";
mostCurrent._activity.LoadLayout("CertLy",mostCurrent.activityBA);
 //BA.debugLineNum = 39;BA.debugLine="shared = rp.GetSafeDirDefaultExternal(\"\")";
mostCurrent._shared = mostCurrent._rp.GetSafeDirDefaultExternal("");
 //BA.debugLineNum = 40;BA.debugLine="kvs.Initialize(shared, \"Userdatastore\")";
mostCurrent._kvs._initialize(processBA,mostCurrent._shared,"Userdatastore");
 //BA.debugLineNum = 42;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"db.db\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 43;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",File.DirDefault";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"db.db",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db");
 };
 //BA.debugLineNum = 46;BA.debugLine="If SQL1.IsInitialized = False Then";
if (mostCurrent._sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 47;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"db.db\"";
mostCurrent._sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db",anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 50;BA.debugLine="GetCertificateDetails(\"0xc0ba46ea9907dedbdc0d0952";
_getcertificatedetails("0xc0ba46ea9907dedbdc0d09522e1b71e7d56782513f534e5c0812823206c44aec");
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public static String  _btncopycert_click() throws Exception{
b4a.util.BClipboard _clipb = null;
 //BA.debugLineNum = 131;BA.debugLine="Private Sub btnCopyCert_Click";
 //BA.debugLineNum = 132;BA.debugLine="Dim clipb As BClipboard";
_clipb = new b4a.util.BClipboard();
 //BA.debugLineNum = 133;BA.debugLine="clipb.setText(lblCert.Text = kvs.Get(\"transaction";
_clipb.setText(mostCurrent.activityBA,BA.ObjectToString((mostCurrent._lblcert.getText()).equals(BA.ObjectToString(mostCurrent._kvs._get("transactionHash")))));
 //BA.debugLineNum = 134;BA.debugLine="ToastMessageShow(\"Cert ID Copied\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Cert ID Copied"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public static String  _btncopypaste_click() throws Exception{
b4a.util.BClipboard _something = null;
 //BA.debugLineNum = 138;BA.debugLine="Private Sub btnCopyPaste_Click";
 //BA.debugLineNum = 140;BA.debugLine="Dim something As BClipboard";
_something = new b4a.util.BClipboard();
 //BA.debugLineNum = 141;BA.debugLine="If something.hasText = True Then";
if (_something.hasText(mostCurrent.activityBA)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 142;BA.debugLine="lblCert.Text = something.getText";
mostCurrent._lblcert.setText(BA.ObjectToCharSequence(_something.getText(mostCurrent.activityBA)));
 };
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public static String  _generateqr() throws Exception{
String _strqrcode = "";
 //BA.debugLineNum = 116;BA.debugLine="Sub GenerateQR";
 //BA.debugLineNum = 118;BA.debugLine="Dim strQRCode As String";
_strqrcode = "";
 //BA.debugLineNum = 119;BA.debugLine="strQRCode = kvs.Get(\"CertID\")";
_strqrcode = BA.ObjectToString(mostCurrent._kvs._get("CertID"));
 //BA.debugLineNum = 120;BA.debugLine="qr.Initialize";
mostCurrent._qr._initialize /*String*/ (processBA);
 //BA.debugLineNum = 122;BA.debugLine="bmr = qr.drawQRCode(strQRCode)";
mostCurrent._bmr = mostCurrent._qr._drawqrcode /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (_strqrcode);
 //BA.debugLineNum = 123;BA.debugLine="imgQR.Bitmap = bmr";
mostCurrent._imgqr.setBitmap((android.graphics.Bitmap)(mostCurrent._bmr.getObject()));
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public static String  _getcertificatedetails(String _tx_id) throws Exception{
pdv.milotin.httpjob _jobgetcertificate = null;
String _url = "";
 //BA.debugLineNum = 62;BA.debugLine="Sub GetCertificateDetails(tx_id As String)";
 //BA.debugLineNum = 63;BA.debugLine="Dim JobGetCertificate As HttpJob";
_jobgetcertificate = new pdv.milotin.httpjob();
 //BA.debugLineNum = 64;BA.debugLine="JobGetCertificate.Initialize(\"JobGetCertificate\",";
_jobgetcertificate._initialize /*String*/ (processBA,"JobGetCertificate",certmd.getObject());
 //BA.debugLineNum = 65;BA.debugLine="Dim url As String = \"https://service-testnet.masc";
_url = "https://service-testnet.maschain.com/api/certificate/get-certificate?tx_id="+_tx_id;
 //BA.debugLineNum = 66;BA.debugLine="JobGetCertificate.Download(url)";
_jobgetcertificate._download /*String*/ (_url);
 //BA.debugLineNum = 67;BA.debugLine="JobGetCertificate.GetRequest.SetHeader(\"client_id";
_jobgetcertificate._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("client_id",BA.ObjectToString(mostCurrent._kvs._get("client_id")));
 //BA.debugLineNum = 68;BA.debugLine="JobGetCertificate.GetRequest.SetHeader(\"client_se";
_jobgetcertificate._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("client_secret",BA.ObjectToString(mostCurrent._kvs._get("client_secret")));
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 24;BA.debugLine="Private imgBack As ImageView";
mostCurrent._imgback = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private pnFrame2 As Panel";
mostCurrent._pnframe2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private lblUserTitle As Label";
mostCurrent._lblusertitle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private lblLine4 As Label";
mostCurrent._lblline4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private imgQR As ImageView";
mostCurrent._imgqr = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private lblCert As Label";
mostCurrent._lblcert = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private btnCopyCert As Button";
mostCurrent._btncopycert = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private imgCertImage As ImageView";
mostCurrent._imgcertimage = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private pnQR As Panel";
mostCurrent._pnqr = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public static String  _imgback_click() throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Private Sub imgBack_Click";
 //BA.debugLineNum = 148;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public static String  _imgqr_click() throws Exception{
String _url = "";
anywheresoftware.b4a.phone.Phone.PhoneIntents _p = null;
 //BA.debugLineNum = 156;BA.debugLine="Private Sub imgQR_Click";
 //BA.debugLineNum = 158;BA.debugLine="Dim url As String = \"https://explorer-testnet.mas";
_url = "https://explorer-testnet.maschain.com/"+BA.ObjectToString(mostCurrent._kvs._get("CertID"));
 //BA.debugLineNum = 159;BA.debugLine="Log(kvs.Get(\"CertID\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("110420227",BA.ObjectToString(mostCurrent._kvs._get("CertID")),0);
 //BA.debugLineNum = 160;BA.debugLine="Dim p As PhoneIntents";
_p = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
 //BA.debugLineNum = 161;BA.debugLine="StartActivity(p.OpenBrowser(url))";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_p.OpenBrowser(_url)));
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(pdv.milotin.httpjob _job) throws Exception{
String _jsonstring = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _firstresult = null;
String _transactionhash = "";
String _certificateimagefile = "";
 //BA.debugLineNum = 71;BA.debugLine="Sub JobDone(Job As HttpJob)";
 //BA.debugLineNum = 72;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 74;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
 //BA.debugLineNum = 75;BA.debugLine="Dim jsonString As String = Job.GetString";
_jsonstring = _job._getstring /*String*/ ();
 //BA.debugLineNum = 76;BA.debugLine="Log(jsonString)";
anywheresoftware.b4a.keywords.Common.LogImpl("110092549",_jsonstring,0);
 //BA.debugLineNum = 78;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 79;BA.debugLine="parser.Initialize(jsonString)";
_parser.Initialize(_jsonstring);
 //BA.debugLineNum = 81;BA.debugLine="If Job.JobName = \"JobGetCertificate\" Then";
if ((_job._jobname /*String*/ ).equals("JobGetCertificate")) { 
 //BA.debugLineNum = 83;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 84;BA.debugLine="Dim result As List = root.Get(\"result\")";
_result = new anywheresoftware.b4a.objects.collections.List();
_result = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("result"))));
 //BA.debugLineNum = 86;BA.debugLine="If result.Size > 0 Then";
if (_result.getSize()>0) { 
 //BA.debugLineNum = 87;BA.debugLine="Dim firstResult As Map = result.Get(0)";
_firstresult = new anywheresoftware.b4a.objects.collections.Map();
_firstresult = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_result.Get((int) (0))));
 //BA.debugLineNum = 88;BA.debugLine="Dim transactionHash As String = firstResult.Ge";
_transactionhash = BA.ObjectToString(_firstresult.Get((Object)("transactionHash")));
 //BA.debugLineNum = 89;BA.debugLine="Dim certificateImageFile As String = firstResu";
_certificateimagefile = BA.ObjectToString(_firstresult.Get((Object)("certificate_image_file")));
 //BA.debugLineNum = 92;BA.debugLine="lblCert.Text = transactionHash";
mostCurrent._lblcert.setText(BA.ObjectToCharSequence(_transactionhash));
 //BA.debugLineNum = 95;BA.debugLine="Log(\"TransactionHash: \" & transactionHash)";
anywheresoftware.b4a.keywords.Common.LogImpl("110092568","TransactionHash: "+_transactionhash,0);
 //BA.debugLineNum = 96;BA.debugLine="Log(\"Certificate Image File: \" & certificateIm";
anywheresoftware.b4a.keywords.Common.LogImpl("110092569","Certificate Image File: "+_certificateimagefile,0);
 //BA.debugLineNum = 97;BA.debugLine="kvs.Put(\"CertID\",transactionHash)";
mostCurrent._kvs._put("CertID",(Object)(_transactionhash));
 //BA.debugLineNum = 98;BA.debugLine="kvs.Put(\"CertImage\",certificateImageFile)";
mostCurrent._kvs._put("CertImage",(Object)(_certificateimagefile));
 //BA.debugLineNum = 100;BA.debugLine="GenerateQR";
_generateqr();
 };
 }else {
 //BA.debugLineNum = 104;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("110092577","Error: "+_job._errormessage /*String*/ ,0);
 };
 }else {
 //BA.debugLineNum = 108;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("110092581","Error: "+_job._errormessage /*String*/ ,0);
 };
 //BA.debugLineNum = 112;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public static String  _lblcert_longclick() throws Exception{
String _url = "";
anywheresoftware.b4a.phone.Phone.PhoneIntents _p = null;
 //BA.debugLineNum = 165;BA.debugLine="Private Sub lblCert_LongClick";
 //BA.debugLineNum = 167;BA.debugLine="Dim url As String = kvs.Get(\"CertImage\")";
_url = BA.ObjectToString(mostCurrent._kvs._get("CertImage"));
 //BA.debugLineNum = 168;BA.debugLine="Dim p As PhoneIntents";
_p = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
 //BA.debugLineNum = 169;BA.debugLine="StartActivity(p.OpenBrowser(url))";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_p.OpenBrowser(_url)));
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
}
