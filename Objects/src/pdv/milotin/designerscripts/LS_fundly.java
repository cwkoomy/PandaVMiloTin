package pdv.milotin.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_fundly{

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
views.get("pnframe2").vw.setHeight((int)((95d * scale)));
views.get("pnframe2").vw.setLeft((int)((50d / 100 * width) - (views.get("pnframe2").vw.getWidth() / 2)));
views.get("pnframe2").vw.setTop((int)((views.get("lbltop").vw.getTop() + views.get("lbltop").vw.getHeight())));
views.get("pnlistview3").vw.setWidth((int)((90d / 100 * width)));
views.get("pnlistview3").vw.setHeight((int)((72d / 100 * height)));
views.get("pnlistview3").vw.setLeft((int)((50d / 100 * width) - (views.get("pnlistview3").vw.getWidth() / 2)));
views.get("pnlistview3").vw.setTop((int)((views.get("pnframe2").vw.getTop() + views.get("pnframe2").vw.getHeight())-(5d / 100 * height)));
views.get("clvfundlist").vw.setWidth((int)((90d / 100 * width)));
views.get("clvfundlist").vw.setHeight((int)((68d / 100 * height)));
views.get("clvfundlist").vw.setLeft((int)((0d / 100 * width)));
views.get("clvfundlist").vw.setTop((int)((0d / 100 * height)));
views.get("lblusertitle").vw.setWidth((int)((80d / 100 * width)));
views.get("lblusertitle").vw.setHeight((int)((40d * scale)));
views.get("lblusertitle").vw.setLeft((int)((50d / 100 * width) - (views.get("lblusertitle").vw.getWidth() / 2)));
views.get("lblusertitle").vw.setTop((int)((views.get("pnframe2").vw.getTop())+(1d / 100 * height)));
views.get("lblline6").vw.setWidth((int)((90d / 100 * width)));
views.get("lblline6").vw.setHeight((int)((20d * scale)));
views.get("lblline6").vw.setLeft((int)((50d / 100 * width) - (views.get("lblline6").vw.getWidth() / 2)));
views.get("lblline6").vw.setTop((int)((views.get("lblusertitle").vw.getTop() + views.get("lblusertitle").vw.getHeight())));
views.get("lblbottom").vw.setWidth((int)((100d / 100 * width)));
views.get("lblbottom").vw.setHeight((int)((80d * scale)));
views.get("lblbottom").vw.setLeft((int)((50d / 100 * width) - (views.get("lblbottom").vw.getWidth() / 2)));
views.get("lblbottom").vw.setTop((int)((100d / 100 * height) - (views.get("lblbottom").vw.getHeight())));
views.get("lblhome2").vw.setWidth((int)((25d / 100 * width)));
views.get("lblhome2").vw.setHeight((int)((20d * scale)));
views.get("lblhome2").vw.setLeft((int)((12.5d / 100 * width) - (views.get("lblhome2").vw.getWidth() / 2)));
views.get("lblhome2").vw.setTop((int)((views.get("lblbottom").vw.getTop() + views.get("lblbottom").vw.getHeight())-(1d / 100 * height) - (views.get("lblhome2").vw.getHeight())));
views.get("lblfund2").vw.setWidth((int)((views.get("lblhome2").vw.getWidth())));
views.get("lblfund2").vw.setHeight((int)((views.get("lblhome2").vw.getHeight())));
views.get("lblfund2").vw.setLeft((int)((37.5d / 100 * width) - (views.get("lblfund2").vw.getWidth() / 2)));
views.get("lblfund2").vw.setTop((int)((views.get("lblhome2").vw.getTop() + views.get("lblhome2").vw.getHeight()) - (views.get("lblfund2").vw.getHeight())));
views.get("lblhistory2").vw.setWidth((int)((views.get("lblhome2").vw.getWidth())));
views.get("lblhistory2").vw.setHeight((int)((views.get("lblhome2").vw.getHeight())));
views.get("lblhistory2").vw.setLeft((int)((62.5d / 100 * width) - (views.get("lblhistory2").vw.getWidth() / 2)));
views.get("lblhistory2").vw.setTop((int)((views.get("lblhome2").vw.getTop() + views.get("lblhome2").vw.getHeight()) - (views.get("lblhistory2").vw.getHeight())));
views.get("lbluser2").vw.setWidth((int)((views.get("lblhome2").vw.getWidth())));
views.get("lbluser2").vw.setHeight((int)((views.get("lblhome2").vw.getHeight())));
views.get("lbluser2").vw.setLeft((int)((87.5d / 100 * width) - (views.get("lbluser2").vw.getWidth() / 2)));
views.get("lbluser2").vw.setTop((int)((views.get("lblhome2").vw.getTop() + views.get("lblhome2").vw.getHeight()) - (views.get("lbluser2").vw.getHeight())));
views.get("lblhome").vw.setWidth((int)((25d * scale)));
views.get("lblhome").vw.setHeight((int)((25d * scale)));
views.get("lblhome").vw.setLeft((int)((12.5d / 100 * width) - (views.get("lblhome").vw.getWidth() / 2)));
views.get("lblhome").vw.setTop((int)((views.get("lblhome2").vw.getTop())-(1d / 100 * height) - (views.get("lblhome").vw.getHeight())));
views.get("lblfund").vw.setWidth((int)((views.get("lblhome").vw.getWidth())));
views.get("lblfund").vw.setHeight((int)((views.get("lblhome").vw.getHeight())));
views.get("lblfund").vw.setLeft((int)((37.5d / 100 * width) - (views.get("lblfund").vw.getWidth() / 2)));
views.get("lblfund").vw.setTop((int)((views.get("lblhome").vw.getTop() + views.get("lblhome").vw.getHeight()) - (views.get("lblfund").vw.getHeight())));
views.get("lblhistory").vw.setWidth((int)((views.get("lblhome").vw.getWidth())));
views.get("lblhistory").vw.setHeight((int)((views.get("lblhome").vw.getHeight())));
views.get("lblhistory").vw.setLeft((int)((62.5d / 100 * width) - (views.get("lblhistory").vw.getWidth() / 2)));
views.get("lblhistory").vw.setTop((int)((views.get("lblhome").vw.getTop() + views.get("lblhome").vw.getHeight()) - (views.get("lblhistory").vw.getHeight())));
views.get("lbluser").vw.setWidth((int)((views.get("lblhome").vw.getWidth())));
views.get("lbluser").vw.setHeight((int)((views.get("lblhome").vw.getHeight())));
views.get("lbluser").vw.setLeft((int)((87.5d / 100 * width) - (views.get("lbluser").vw.getWidth() / 2)));
views.get("lbluser").vw.setTop((int)((views.get("lblhome").vw.getTop() + views.get("lblhome").vw.getHeight()) - (views.get("lbluser").vw.getHeight())));

}
}