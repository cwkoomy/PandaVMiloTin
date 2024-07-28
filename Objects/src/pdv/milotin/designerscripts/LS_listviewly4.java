package pdv.milotin.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_listviewly4{

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
views.get("lblprojecttitle2").vw.setWidth((int)((60d / 100 * width)));
views.get("lblprojecttitle2").vw.setHeight((int)((20d * scale)));
views.get("lblprojecttitle2").vw.setLeft((int)((views.get("imgproject").vw.getLeft() + views.get("imgproject").vw.getWidth())+(2d / 100 * width)));
views.get("lblprojecttitle2").vw.setTop((int)((views.get("imgproject").vw.getTop())));
views.get("lblprojectfund2").vw.setWidth((int)((views.get("lblprojecttitle2").vw.getWidth())));
views.get("lblprojectfund2").vw.setHeight((int)((views.get("lblprojecttitle2").vw.getHeight())));
views.get("lblprojectfund2").vw.setLeft((int)((views.get("lblprojecttitle2").vw.getLeft())));
views.get("lblprojectfund2").vw.setTop((int)((views.get("lblprojecttitle2").vw.getTop() + views.get("lblprojecttitle2").vw.getHeight())));
views.get("lblprojectprogress2").vw.setWidth((int)((views.get("lblprojecttitle2").vw.getWidth())));
views.get("lblprojectprogress2").vw.setHeight((int)((views.get("lblprojecttitle2").vw.getHeight())));
views.get("lblprojectprogress2").vw.setLeft((int)((views.get("lblprojecttitle2").vw.getLeft())));
views.get("lblprojectprogress2").vw.setTop((int)((views.get("lblprojectfund2").vw.getTop() + views.get("lblprojectfund2").vw.getHeight())));
views.get("btndisfund").vw.setWidth((int)((25d * scale)));
views.get("btndisfund").vw.setHeight((int)((views.get("btndisfund").vw.getWidth())));
views.get("btndisfund").vw.setLeft((int)((90d / 100 * width) - (views.get("btndisfund").vw.getWidth())));
views.get("btndisfund").vw.setTop((int)((views.get("lblprojecttitle2").vw.getTop())));
views.get("btncheckfund").vw.setWidth((int)((25d * scale)));
views.get("btncheckfund").vw.setHeight((int)((views.get("btndisfund").vw.getHeight())));
views.get("btncheckfund").vw.setLeft((int)((90d / 100 * width) - (views.get("btncheckfund").vw.getWidth())));
views.get("btncheckfund").vw.setTop((int)((views.get("lblprojectprogress2").vw.getTop() + views.get("lblprojectprogress2").vw.getHeight()) - (views.get("btncheckfund").vw.getHeight())));

}
}