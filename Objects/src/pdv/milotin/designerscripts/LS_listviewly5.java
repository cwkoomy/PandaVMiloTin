package pdv.milotin.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_listviewly5{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("lblcategory").vw.setWidth((int)((50d / 100 * width)));
views.get("lblcategory").vw.setHeight((int)((20d * scale)));
views.get("lblcategory").vw.setLeft((int)((15d / 100 * width)));
views.get("lblcategory").vw.setTop((int)((1d / 100 * height)));
views.get("lbltransactionhashid").vw.setWidth((int)((views.get("lblcategory").vw.getWidth())));
views.get("lbltransactionhashid").vw.setHeight((int)((views.get("lblcategory").vw.getHeight())));
views.get("lbltransactionhashid").vw.setLeft((int)((views.get("lblcategory").vw.getLeft())));
views.get("lbltransactionhashid").vw.setTop((int)((views.get("lblcategory").vw.getTop() + views.get("lblcategory").vw.getHeight())));
views.get("lblremark").vw.setWidth((int)((views.get("lblcategory").vw.getWidth())));
views.get("lblremark").vw.setHeight((int)((views.get("lblcategory").vw.getHeight())));
views.get("lblremark").vw.setLeft((int)((views.get("lblcategory").vw.getLeft())));
views.get("lblremark").vw.setTop((int)((views.get("lbltransactionhashid").vw.getTop() + views.get("lbltransactionhashid").vw.getHeight())));
views.get("lblallocatefund").vw.setWidth((int)((25d / 100 * width)));
views.get("lblallocatefund").vw.setHeight((int)((views.get("lblcategory").vw.getHeight())));
views.get("lblallocatefund").vw.setLeft((int)((94d / 100 * width) - (views.get("lblallocatefund").vw.getWidth())));
views.get("lblallocatefund").vw.setTop((int)((views.get("lbltransactionhashid").vw.getTop())));
views.get("imgstatus1").vw.setWidth((int)((30d * scale)));
views.get("imgstatus1").vw.setHeight((int)((30d * scale)));
views.get("imgstatus1").vw.setLeft((int)((4d / 100 * width)));
views.get("imgstatus1").vw.setTop((int)((views.get("lbltransactionhashid").vw.getTop() + views.get("lbltransactionhashid").vw.getHeight()/2) - (views.get("imgstatus1").vw.getHeight() / 2)));

}
}