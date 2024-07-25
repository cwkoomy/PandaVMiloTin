B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=5.2
@EndOfDesignText@
'Class module
Sub Class_Globals
	
	Dim nativeMe As JavaObject
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
	nativeMe = Me

End Sub

Sub drawQRCode (data As String) As Bitmap
	
	Return nativeMe.RunMethod("drawQRCode", Array(data))
	
End Sub


#If Java

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


#End If

