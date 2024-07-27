package pdv.milotin;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.content.Context;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class qrcode extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "pdv.milotin.qrcode");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", pdv.milotin.qrcode.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _nativeme = null;
public b4a.example.dateutils _dateutils = null;
public pdv.milotin.main _main = null;
public pdv.milotin.homemd _homemd = null;
public pdv.milotin.sendfundmd _sendfundmd = null;
public pdv.milotin.usermd _usermd = null;
public pdv.milotin.historymd _historymd = null;
public pdv.milotin.fundmd _fundmd = null;
public pdv.milotin.addprojectmd _addprojectmd = null;
public pdv.milotin.starter _starter = null;
public pdv.milotin.addallocatemd _addallocatemd = null;
public pdv.milotin.httputils2service _httputils2service = null;
public String  _initialize(pdv.milotin.qrcode __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="qrcode";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="nativeMe = Me";
__ref._nativeme /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=14483460;
 //BA.debugLineNum = 14483460;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _drawqrcode(pdv.milotin.qrcode __ref,String _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="qrcode";
if (Debug.shouldDelegate(ba, "drawqrcode", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "drawqrcode", new Object[] {_data}));}
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Sub drawQRCode (data As String) As Bitmap";
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="Return nativeMe.RunMethod(\"drawQRCode\", Array(dat";
if (true) return (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(__ref._nativeme /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("drawQRCode",new Object[]{(Object)(_data)})));
RDebugUtils.currentLine=14548996;
 //BA.debugLineNum = 14548996;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(pdv.milotin.qrcode __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="qrcode";
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="Dim nativeMe As JavaObject";
_nativeme = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="End Sub";
return "";
}






public Bitmap drawQRCode (String data) {
        Bitmap bitmap = encodeAsBitmap(data, 200, 200);
		return bitmap;
}

public Bitmap encodeAsBitmap(String text, int width, int height){
    QRCodeWriter writer = new QRCodeWriter();
    BitMatrix matrix = null;
    try {
        matrix = writer.encode(text, BarcodeFormat.QR_CODE, width, height);
    } catch (WriterException ex) {
        ex.printStackTrace();
    }
    Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
    for (int x = 0; x < width; x++){
        for (int y = 0; y < height; y++){
            bmp.setPixel(x, y, matrix.get(x,y) ? 0xff000000 : 0xffffffff);
        }
    }
    return bmp;
}


}