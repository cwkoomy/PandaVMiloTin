package pdv.milotin.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_userly{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("lbltop").vw.setWidth((int)((100d / 100 * width)));
views.get("lbltop").vw.setHeight((int)((60d * scale)));
views.get("lbltop").vw.setLeft((int)((0d / 100 * width)));
views.get("lbltop").vw.setTop((int)((0d / 100 * height)));
views.get("imgback").vw.setWidth((int)((40d * scale)));
views.get("imgback").vw.setHeight((int)((40d * scale)));
views.get("imgback").vw.setLeft((int)((3d / 100 * width)));
views.get("imgback").vw.setTop((int)((views.get("lbltop").vw.getTop() + views.get("lbltop").vw.getHeight()/2) - (views.get("imgback").vw.getHeight() / 2)));
views.get("pnheader1").vw.setWidth((int)((100d / 100 * width)));
views.get("pnheader1").vw.setHeight((int)((250d * scale)));
views.get("pnheader1").vw.setLeft((int)((0d / 100 * width)));
views.get("pnheader1").vw.setTop((int)((0d / 100 * height)));
views.get("lblmybalance").vw.setWidth((int)((90d / 100 * width)));
views.get("lblmybalance").vw.setHeight((int)((40d * scale)));
views.get("lblmybalance").vw.setLeft((int)((50d / 100 * width) - (views.get("lblmybalance").vw.getWidth() / 2)));
views.get("lblmybalance").vw.setTop((int)((views.get("lbltop").vw.getTop() + views.get("lbltop").vw.getHeight())+(3d / 100 * height)));
views.get("lblline1").vw.setWidth((int)((90d / 100 * width)));
views.get("lblline1").vw.setHeight((int)((20d * scale)));
views.get("lblline1").vw.setLeft((int)((50d / 100 * width) - (views.get("lblline1").vw.getWidth() / 2)));
views.get("lblline1").vw.setTop((int)((views.get("lblmybalance").vw.getTop() + views.get("lblmybalance").vw.getHeight())));
views.get("lblamount").vw.setWidth((int)((90d / 100 * width)));
views.get("lblamount").vw.setHeight((int)((40d * scale)));
views.get("lblamount").vw.setLeft((int)((50d / 100 * width) - (views.get("lblamount").vw.getWidth() / 2)));
views.get("lblamount").vw.setTop((int)((views.get("lblline1").vw.getTop() + views.get("lblline1").vw.getHeight())));
views.get("imguseravatar").vw.setWidth((int)((80d * scale)));
views.get("imguseravatar").vw.setHeight((int)((80d * scale)));
views.get("imguseravatar").vw.setLeft((int)((50d / 100 * width) - (views.get("imguseravatar").vw.getWidth() / 2)));
views.get("imguseravatar").vw.setTop((int)((views.get("pnheader1").vw.getTop() + views.get("pnheader1").vw.getHeight()) - (views.get("imguseravatar").vw.getHeight() / 2)));
views.get("imgqr").vw.setWidth((int)((250d * scale)));
views.get("imgqr").vw.setHeight((int)((250d * scale)));
views.get("imgqr").vw.setLeft((int)((50d / 100 * width) - (views.get("imgqr").vw.getWidth() / 2)));
views.get("imgqr").vw.setTop((int)((views.get("imguseravatar").vw.getTop() + views.get("imguseravatar").vw.getHeight())+(3d / 100 * height)));
views.get("lblmyaddress").vw.setWidth((int)((48d / 100 * width)));
views.get("lblmyaddress").vw.setHeight((int)((40d * scale)));
views.get("lblmyaddress").vw.setLeft((int)((10d / 100 * width)));
views.get("lblmyaddress").vw.setTop((int)((views.get("imgqr").vw.getTop() + views.get("imgqr").vw.getHeight())+(3d / 100 * height)));
views.get("btncopyaddress").vw.setWidth((int)((30d / 100 * width)));
views.get("btncopyaddress").vw.setHeight((int)((40d * scale)));
views.get("btncopyaddress").vw.setLeft((int)((views.get("lblmyaddress").vw.getLeft() + views.get("lblmyaddress").vw.getWidth())+(2d / 100 * width)));
views.get("btncopyaddress").vw.setTop((int)((views.get("lblmyaddress").vw.getTop())));
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
views.get("lblhome").vw.setWidth((int)((30d * scale)));
views.get("lblhome").vw.setHeight((int)((30d * scale)));
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