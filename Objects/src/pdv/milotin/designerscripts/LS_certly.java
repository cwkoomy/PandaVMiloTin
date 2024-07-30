package pdv.milotin.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_certly{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("lbltop").vw.setWidth((int)((100d / 100 * width)));
views.get("lbltop").vw.setHeight((int)((60d * scale)));
views.get("lbltop").vw.setLeft((int)((0d / 100 * width)));
views.get("lbltop").vw.setTop((int)((0d / 100 * height)));
views.get("imgback").vw.setWidth((int)((30d * scale)));
views.get("imgback").vw.setHeight((int)((30d * scale)));
views.get("imgback").vw.setLeft((int)((3d / 100 * width)));
views.get("imgback").vw.setTop((int)((views.get("lbltop").vw.getTop() + views.get("lbltop").vw.getHeight()/2) - (views.get("imgback").vw.getHeight() / 2)));
views.get("pnheader1").vw.setWidth((int)((100d / 100 * width)));
views.get("pnheader1").vw.setHeight((int)((250d * scale)));
views.get("pnheader1").vw.setLeft((int)((0d / 100 * width)));
views.get("pnheader1").vw.setTop((int)((0d / 100 * height)));
views.get("pnframe2").vw.setWidth((int)((90d / 100 * width)));
views.get("pnframe2").vw.setHeight((int)((90d / 100 * height)));
views.get("pnframe2").vw.setLeft((int)((50d / 100 * width) - (views.get("pnframe2").vw.getWidth() / 2)));
views.get("pnframe2").vw.setTop((int)((views.get("lbltop").vw.getTop() + views.get("lbltop").vw.getHeight())));
views.get("lblusertitle").vw.setWidth((int)((80d / 100 * width)));
views.get("lblusertitle").vw.setHeight((int)((40d * scale)));
views.get("lblusertitle").vw.setLeft((int)((50d / 100 * width) - (views.get("lblusertitle").vw.getWidth() / 2)));
views.get("lblusertitle").vw.setTop((int)((views.get("pnframe2").vw.getTop())+(1d / 100 * height)));
views.get("lblline4").vw.setWidth((int)((90d / 100 * width)));
views.get("lblline4").vw.setHeight((int)((20d * scale)));
views.get("lblline4").vw.setLeft((int)((50d / 100 * width) - (views.get("lblline4").vw.getWidth() / 2)));
views.get("lblline4").vw.setTop((int)((views.get("lblusertitle").vw.getTop() + views.get("lblusertitle").vw.getHeight())));
views.get("pnqr").vw.setWidth((int)((250d * scale)));
views.get("pnqr").vw.setHeight((int)((250d * scale)));
views.get("pnqr").vw.setLeft((int)((50d / 100 * width) - (views.get("pnqr").vw.getWidth() / 2)));
views.get("pnqr").vw.setTop((int)((views.get("lblline4").vw.getTop() + views.get("lblline4").vw.getHeight())+(3d / 100 * height)));
views.get("imgqr").vw.setWidth((int)((240d * scale)));
views.get("imgqr").vw.setHeight((int)((240d * scale)));
views.get("imgqr").vw.setLeft((int)((views.get("pnqr").vw.getLeft() + views.get("pnqr").vw.getWidth()/2) - (views.get("imgqr").vw.getWidth() / 2)));
views.get("imgqr").vw.setTop((int)((views.get("pnqr").vw.getTop() + views.get("pnqr").vw.getHeight()/2) - (views.get("imgqr").vw.getHeight() / 2)));
views.get("lblcert").vw.setWidth((int)((48d / 100 * width)));
views.get("lblcert").vw.setHeight((int)((40d * scale)));
views.get("lblcert").vw.setLeft((int)((10d / 100 * width)));
views.get("lblcert").vw.setTop((int)((views.get("imgqr").vw.getTop() + views.get("imgqr").vw.getHeight())+(5d / 100 * height)));
views.get("btncopycert").vw.setWidth((int)((30d / 100 * width)));
views.get("btncopycert").vw.setHeight((int)((40d * scale)));
views.get("btncopycert").vw.setLeft((int)((views.get("lblcert").vw.getLeft() + views.get("lblcert").vw.getWidth())+(2d / 100 * width)));
views.get("btncopycert").vw.setTop((int)((views.get("lblcert").vw.getTop())));

}
}