package pdv.milotin.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_kyc1ly{

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
views.get("pnframe2").vw.setHeight((int)((88d / 100 * height)));
views.get("pnframe2").vw.setLeft((int)((50d / 100 * width) - (views.get("pnframe2").vw.getWidth() / 2)));
views.get("pnframe2").vw.setTop((int)((views.get("lbltop").vw.getTop() + views.get("lbltop").vw.getHeight())));
views.get("lblkyctitle").vw.setWidth((int)((80d / 100 * width)));
views.get("lblkyctitle").vw.setHeight((int)((40d * scale)));
views.get("lblkyctitle").vw.setLeft((int)((50d / 100 * width) - (views.get("lblkyctitle").vw.getWidth() / 2)));
views.get("lblkyctitle").vw.setTop((int)((views.get("pnframe2").vw.getTop())+(1d / 100 * height)));
views.get("lblline4").vw.setWidth((int)((90d / 100 * width)));
views.get("lblline4").vw.setHeight((int)((20d * scale)));
views.get("lblline4").vw.setLeft((int)((50d / 100 * width) - (views.get("lblline4").vw.getWidth() / 2)));
views.get("lblline4").vw.setTop((int)((views.get("lblkyctitle").vw.getTop() + views.get("lblkyctitle").vw.getHeight())));
views.get("scrollview1").vw.setWidth((int)((views.get("pnframe2").vw.getWidth())));
views.get("scrollview1").vw.setHeight((int)((76d / 100 * height)));
views.get("scrollview1").vw.setLeft((int)((views.get("pnframe2").vw.getLeft())));
views.get("scrollview1").vw.setTop((int)((views.get("lblline4").vw.getTop() + views.get("lblline4").vw.getHeight())));
views.get("pnkycstart").vw.setWidth((int)((100d / 100 * width)));
views.get("pnkycstart").vw.setHeight((int)((100d / 100 * height)));
views.get("pnkycstart").vw.setLeft((int)((0d / 100 * width)));
views.get("pnkycstart").vw.setTop((int)((0d / 100 * height)));
views.get("imgkyc").vw.setWidth((int)((80d * scale)));
views.get("imgkyc").vw.setHeight((int)((views.get("imgkyc").vw.getWidth())));
views.get("imgkyc").vw.setLeft((int)((50d / 100 * width) - (views.get("imgkyc").vw.getWidth() / 2)));
views.get("imgkyc").vw.setTop((int)((views.get("lbltop").vw.getTop() + views.get("lbltop").vw.getHeight())));
views.get("lbltitlekyc1").vw.setWidth((int)((75d / 100 * width)));
views.get("lbltitlekyc1").vw.setHeight((int)((40d * scale)));
views.get("lbltitlekyc1").vw.setLeft((int)((50d / 100 * width) - (views.get("lbltitlekyc1").vw.getWidth() / 2)));
views.get("lbltitlekyc1").vw.setTop((int)((views.get("imgkyc").vw.getTop() + views.get("imgkyc").vw.getHeight())+(5d / 100 * height)));
views.get("lbltitlekyc2").vw.setWidth((int)((views.get("lbltitlekyc1").vw.getWidth())));
views.get("lbltitlekyc2").vw.setHeight((int)((120d * scale)));
views.get("lbltitlekyc2").vw.setLeft((int)((50d / 100 * width) - (views.get("lbltitlekyc2").vw.getWidth() / 2)));
views.get("lbltitlekyc2").vw.setTop((int)((views.get("lbltitlekyc1").vw.getTop() + views.get("lbltitlekyc1").vw.getHeight())));
views.get("btnstartverify").vw.setWidth((int)((75d / 100 * width)));
views.get("btnstartverify").vw.setHeight((int)((50d * scale)));
views.get("btnstartverify").vw.setLeft((int)((50d / 100 * width) - (views.get("btnstartverify").vw.getWidth() / 2)));
views.get("btnstartverify").vw.setTop((int)((85d / 100 * height) - (views.get("btnstartverify").vw.getHeight())));

}
}