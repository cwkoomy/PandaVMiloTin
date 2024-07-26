package pdv.milotin.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_listviewly3{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("imgproject").vw.setWidth((int)((20d * scale)));
views.get("imgproject").vw.setHeight((int)((20d * scale)));
views.get("imgproject").vw.setLeft((int)((3d / 100 * width)));
views.get("imgproject").vw.setTop((int)((1d / 100 * height)));
views.get("imgfunding").vw.setWidth((int)((views.get("imgproject").vw.getWidth())));
views.get("imgfunding").vw.setHeight((int)((views.get("imgproject").vw.getHeight())));
views.get("imgfunding").vw.setLeft((int)((views.get("imgproject").vw.getLeft())));
views.get("imgfunding").vw.setTop((int)((views.get("imgproject").vw.getTop() + views.get("imgproject").vw.getHeight())));
views.get("imgprogress").vw.setWidth((int)((views.get("imgproject").vw.getWidth())));
views.get("imgprogress").vw.setHeight((int)((views.get("imgproject").vw.getHeight())));
views.get("imgprogress").vw.setLeft((int)((views.get("imgproject").vw.getLeft())));
views.get("imgprogress").vw.setTop((int)((views.get("imgfunding").vw.getTop() + views.get("imgfunding").vw.getHeight())));
views.get("lblprojecttitle").vw.setWidth((int)((20d * scale)));
views.get("lblprojecttitle").vw.setHeight((int)((20d * scale)));
views.get("lblprojecttitle").vw.setLeft((int)((views.get("imgproject").vw.getLeft() + views.get("imgproject").vw.getWidth())));
views.get("lblprojecttitle").vw.setTop((int)((1d / 100 * height)));
views.get("lblprojectfund").vw.setWidth((int)((views.get("lblprojecttitle").vw.getWidth())));
views.get("lblprojectfund").vw.setHeight((int)((views.get("lblprojecttitle").vw.getHeight())));
views.get("lblprojectfund").vw.setLeft((int)((views.get("lblprojecttitle").vw.getLeft())));
views.get("lblprojectfund").vw.setTop((int)((views.get("lblprojecttitle").vw.getTop() + views.get("lblprojecttitle").vw.getHeight())));
views.get("lblprojectprogress").vw.setWidth((int)((views.get("lblprojecttitle").vw.getWidth())));
views.get("lblprojectprogress").vw.setHeight((int)((views.get("lblprojecttitle").vw.getHeight())));
views.get("lblprojectprogress").vw.setLeft((int)((views.get("lblprojecttitle").vw.getLeft())));
views.get("lblprojectprogress").vw.setTop((int)((views.get("lblprojectfund").vw.getTop() + views.get("lblprojectfund").vw.getHeight())));
views.get("lblprojecttitle2").vw.setWidth((int)((60d / 100 * width)));
views.get("lblprojecttitle2").vw.setHeight((int)((20d * scale)));
views.get("lblprojecttitle2").vw.setLeft((int)((views.get("lblprojecttitle").vw.getLeft() + views.get("lblprojecttitle").vw.getWidth())));
views.get("lblprojecttitle2").vw.setTop((int)((views.get("imgproject").vw.getTop())));
views.get("lblprojectfund2").vw.setWidth((int)((views.get("lblprojecttitle2").vw.getWidth())));
views.get("lblprojectfund2").vw.setHeight((int)((views.get("lblprojecttitle2").vw.getHeight())));
views.get("lblprojectfund2").vw.setLeft((int)((views.get("lblprojecttitle2").vw.getLeft())));
views.get("lblprojectfund2").vw.setTop((int)((views.get("lblprojecttitle2").vw.getTop() + views.get("lblprojecttitle2").vw.getHeight())));
views.get("lblprojectprogress2").vw.setWidth((int)((views.get("lblprojecttitle2").vw.getWidth())));
views.get("lblprojectprogress2").vw.setHeight((int)((views.get("lblprojecttitle2").vw.getHeight())));
views.get("lblprojectprogress2").vw.setLeft((int)((views.get("lblprojecttitle2").vw.getLeft())));
views.get("lblprojectprogress2").vw.setTop((int)((views.get("lblprojectfund2").vw.getTop() + views.get("lblprojectfund2").vw.getHeight())));
views.get("cpbar1").vw.setWidth((int)((60d * scale)));
views.get("cpbar1").vw.setHeight((int)((60d * scale)));
views.get("cpbar1").vw.setLeft((int)((views.get("lblprojecttitle2").vw.getLeft() + views.get("lblprojecttitle2").vw.getWidth())));
views.get("cpbar1").vw.setTop((int)((views.get("lblprojectfund2").vw.getTop() + views.get("lblprojectfund2").vw.getHeight()/2) - (views.get("cpbar1").vw.getHeight() / 2)));

}
}