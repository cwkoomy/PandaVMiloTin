package pdv.milotin.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_mainly{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("lbltop").vw.setWidth((int)((75d / 100 * width)));
views.get("lbltop").vw.setHeight((int)((60d * scale)));
views.get("lbltop").vw.setLeft((int)((50d / 100 * width) - (views.get("lbltop").vw.getWidth() / 2)));
views.get("lbltop").vw.setTop((int)((10d / 100 * height)));
views.get("pnmain").vw.setWidth((int)((100d / 100 * width)));
views.get("pnmain").vw.setHeight((int)((100d / 100 * height)));
views.get("pnmain").vw.setLeft((int)((0d / 100 * width)));
views.get("pnmain").vw.setTop((int)((0d / 100 * height)));
views.get("pnusername").vw.setWidth((int)((75d / 100 * width)));
views.get("pnusername").vw.setTop((int)((views.get("lbltop").vw.getTop() + views.get("lbltop").vw.getHeight())+(2d / 100 * height)));
views.get("txtusername").vw.setWidth((int)((50d / 100 * width)));
views.get("pnpassword").vw.setWidth((int)((75d / 100 * width)));
views.get("pnpassword").vw.setTop((int)((views.get("pnusername").vw.getTop() + views.get("pnusername").vw.getHeight())+(2d / 100 * height)));
views.get("txtpassword").vw.setWidth((int)((50d / 100 * width)));
views.get("pnwallet").vw.setWidth((int)((75d / 100 * width)));
views.get("pnwallet").vw.setTop((int)((views.get("pnpassword").vw.getTop() + views.get("pnpassword").vw.getHeight())+(2d / 100 * height)));
views.get("txtwalletaddress").vw.setWidth((int)((50d / 100 * width)));
views.get("btnlogin").vw.setWidth((int)((75d / 100 * width)));
views.get("btnlogin").vw.setTop((int)((views.get("pnwallet").vw.getTop() + views.get("pnwallet").vw.getHeight())+(2d / 100 * height)));
views.get("lblforgotpassword").vw.setWidth((int)((75d / 100 * width)));
views.get("lblforgotpassword").vw.setTop((int)((views.get("btnlogin").vw.getTop() + views.get("btnlogin").vw.getHeight())+(2d / 100 * height)));
views.get("iconcheck").vw.setLeft((int)((views.get("txtusername").vw.getLeft() + views.get("txtusername").vw.getWidth())+(1d / 100 * width)));
views.get("imgusername").vw.setTop((int)((views.get("pnusername").vw.getHeight())/2d-(views.get("imgusername").vw.getHeight())/2d));
views.get("imgpassword").vw.setTop((int)((views.get("pnpassword").vw.getHeight())/2d-(views.get("imgpassword").vw.getHeight())/2d));
views.get("imgwallet").vw.setTop((int)((views.get("pnwallet").vw.getHeight())/2d-(views.get("imgwallet").vw.getHeight())/2d));
views.get("iconcheck").vw.setTop((int)((views.get("pnusername").vw.getHeight())/2d-(views.get("iconcheck").vw.getHeight())/2d));
views.get("pnsplash").vw.setWidth((int)((100d / 100 * width)));
views.get("pnsplash").vw.setHeight((int)((100d / 100 * height)));
views.get("pnsplash").vw.setLeft((int)((0d / 100 * width)));
views.get("pnsplash").vw.setTop((int)((0d / 100 * height)));
views.get("lblcopyright").vw.setWidth((int)((100d / 100 * width)));
views.get("lblcopyright").vw.setHeight((int)((60d * scale)));
views.get("lblcopyright").vw.setLeft((int)((0d / 100 * width)));
views.get("lblcopyright").vw.setTop((int)((100d / 100 * height) - (views.get("lblcopyright").vw.getHeight())));

}
}