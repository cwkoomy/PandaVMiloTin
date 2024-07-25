package pdv.milotin.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_mainly{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("pnmain").vw.setWidth((int)((100d / 100 * width)));
views.get("pnmain").vw.setHeight((int)((100d / 100 * height)));
views.get("pnmain").vw.setLeft((int)((0d / 100 * width)));
views.get("pnmain").vw.setTop((int)((0d / 100 * height)));
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