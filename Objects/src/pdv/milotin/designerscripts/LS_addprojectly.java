package pdv.milotin.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_addprojectly{

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
views.get("lbladdtitle").vw.setWidth((int)((80d / 100 * width)));
views.get("lbladdtitle").vw.setHeight((int)((40d * scale)));
views.get("lbladdtitle").vw.setLeft((int)((50d / 100 * width) - (views.get("lbladdtitle").vw.getWidth() / 2)));
views.get("lbladdtitle").vw.setTop((int)((views.get("pnframe2").vw.getTop())+(1d / 100 * height)));
views.get("lblline4").vw.setWidth((int)((90d / 100 * width)));
views.get("lblline4").vw.setHeight((int)((20d * scale)));
views.get("lblline4").vw.setLeft((int)((50d / 100 * width) - (views.get("lblline4").vw.getWidth() / 2)));
views.get("lblline4").vw.setTop((int)((views.get("lbladdtitle").vw.getTop() + views.get("lbladdtitle").vw.getHeight())));
views.get("lblprojectname").vw.setWidth((int)((80d / 100 * width)));
views.get("lblprojectname").vw.setHeight((int)((40d * scale)));
views.get("lblprojectname").vw.setLeft((int)((50d / 100 * width) - (views.get("lblprojectname").vw.getWidth() / 2)));
views.get("lblprojectname").vw.setTop((int)((views.get("lblline4").vw.getTop() + views.get("lblline4").vw.getHeight())));
views.get("pnprojectname").vw.setWidth((int)((80d / 100 * width)));
views.get("pnprojectname").vw.setHeight((int)((50d * scale)));
views.get("pnprojectname").vw.setLeft((int)((50d / 100 * width) - (views.get("pnprojectname").vw.getWidth() / 2)));
views.get("pnprojectname").vw.setTop((int)((views.get("lblprojectname").vw.getTop() + views.get("lblprojectname").vw.getHeight())));
views.get("txtprojectname").vw.setWidth((int)((60d / 100 * width)));
views.get("txtprojectname").vw.setLeft((int)((views.get("imgprojectname").vw.getLeft() + views.get("imgprojectname").vw.getWidth())+(2d / 100 * width)));
views.get("imgprojectname").vw.setHeight((int)((20d * scale)));
views.get("imgprojectname").vw.setWidth((int)((views.get("imgprojectname").vw.getHeight())));
views.get("imgprojectname").vw.setTop((int)((views.get("pnprojectname").vw.getHeight())/2d-(views.get("imgprojectname").vw.getHeight())/2d));
views.get("lblfundamount").vw.setWidth((int)((views.get("lblprojectname").vw.getWidth())));
views.get("lblfundamount").vw.setHeight((int)((views.get("lblprojectname").vw.getHeight())));
views.get("lblfundamount").vw.setLeft((int)((views.get("lblprojectname").vw.getLeft())));
views.get("lblfundamount").vw.setTop((int)((views.get("pnprojectname").vw.getTop() + views.get("pnprojectname").vw.getHeight())));
views.get("pnsetfundamount").vw.setWidth((int)((views.get("pnprojectname").vw.getWidth())));
views.get("pnsetfundamount").vw.setHeight((int)((views.get("pnprojectname").vw.getHeight())));
views.get("pnsetfundamount").vw.setLeft((int)((views.get("pnprojectname").vw.getLeft())));
views.get("pnsetfundamount").vw.setTop((int)((views.get("lblfundamount").vw.getTop() + views.get("lblfundamount").vw.getHeight())));
views.get("txtsetfundamount").vw.setWidth((int)((views.get("txtprojectname").vw.getWidth())));
views.get("txtsetfundamount").vw.setLeft((int)((views.get("txtprojectname").vw.getLeft())));
views.get("imgsetfundamount").vw.setHeight((int)((views.get("imgprojectname").vw.getWidth())));
views.get("imgsetfundamount").vw.setWidth((int)((views.get("imgprojectname").vw.getHeight())));
views.get("imgsetfundamount").vw.setTop((int)((views.get("pnsetfundamount").vw.getHeight())/2d-(views.get("imgsetfundamount").vw.getHeight())/2d));
views.get("lblcontent").vw.setWidth((int)((views.get("lblprojectname").vw.getWidth())));
views.get("lblcontent").vw.setHeight((int)((views.get("lblprojectname").vw.getHeight())));
views.get("lblcontent").vw.setLeft((int)((views.get("lblprojectname").vw.getLeft())));
views.get("lblcontent").vw.setTop((int)((views.get("pnsetfundamount").vw.getTop() + views.get("pnsetfundamount").vw.getHeight())));
views.get("pncontent").vw.setWidth((int)((views.get("pnprojectname").vw.getWidth())));
views.get("pncontent").vw.setHeight((int)((views.get("pnprojectname").vw.getHeight())));
views.get("pncontent").vw.setLeft((int)((views.get("pnprojectname").vw.getLeft())));
views.get("pncontent").vw.setTop((int)((views.get("lblcontent").vw.getTop() + views.get("lblcontent").vw.getHeight())));
views.get("txtcontent").vw.setWidth((int)((views.get("txtprojectname").vw.getWidth())));
views.get("txtcontent").vw.setLeft((int)((views.get("txtprojectname").vw.getLeft())));
views.get("imgcontent").vw.setHeight((int)((views.get("imgprojectname").vw.getWidth())));
views.get("imgcontent").vw.setWidth((int)((views.get("imgprojectname").vw.getHeight())));
views.get("imgcontent").vw.setTop((int)((views.get("pncontent").vw.getHeight())/2d-(views.get("imgcontent").vw.getHeight())/2d));
views.get("lblsetwalletaddress").vw.setWidth((int)((views.get("lblprojectname").vw.getWidth())));
views.get("lblsetwalletaddress").vw.setHeight((int)((views.get("lblprojectname").vw.getHeight())));
views.get("lblsetwalletaddress").vw.setLeft((int)((views.get("lblprojectname").vw.getLeft())));
views.get("lblsetwalletaddress").vw.setTop((int)((views.get("pncontent").vw.getTop() + views.get("pncontent").vw.getHeight())));
views.get("pnsetwalletaddress").vw.setWidth((int)((views.get("pnprojectname").vw.getWidth())));
views.get("pnsetwalletaddress").vw.setHeight((int)((views.get("pnprojectname").vw.getHeight())));
views.get("pnsetwalletaddress").vw.setLeft((int)((views.get("pnprojectname").vw.getLeft())));
views.get("pnsetwalletaddress").vw.setTop((int)((views.get("lblsetwalletaddress").vw.getTop() + views.get("lblsetwalletaddress").vw.getHeight())));
views.get("txtsetwalletaddress").vw.setWidth((int)((views.get("txtprojectname").vw.getWidth())));
views.get("txtsetwalletaddress").vw.setLeft((int)((views.get("txtprojectname").vw.getLeft())));
views.get("imgsetwalletaddress").vw.setHeight((int)((views.get("imgprojectname").vw.getWidth())));
views.get("imgsetwalletaddress").vw.setWidth((int)((views.get("imgprojectname").vw.getHeight())));
views.get("imgsetwalletaddress").vw.setTop((int)((views.get("pnsetwalletaddress").vw.getHeight())/2d-(views.get("imgsetwalletaddress").vw.getHeight())/2d));
views.get("btnprojectsubmit").vw.setWidth((int)((80d / 100 * width)));
views.get("btnprojectsubmit").vw.setHeight((int)((50d * scale)));
views.get("btnprojectsubmit").vw.setLeft((int)((views.get("lbladdtitle").vw.getLeft() + views.get("lbladdtitle").vw.getWidth()/2) - (views.get("btnprojectsubmit").vw.getWidth() / 2)));
views.get("btnprojectsubmit").vw.setTop((int)((views.get("pnsetwalletaddress").vw.getTop() + views.get("pnsetwalletaddress").vw.getHeight())+(5d / 100 * height)));
views.get("lblbottom").vw.setWidth((int)((100d / 100 * width)));
views.get("lblbottom").vw.setHeight((int)((80d * scale)));
views.get("lblbottom").vw.setLeft((int)((0d / 100 * width)));
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
views.get("pnblacktransparent").vw.setWidth((int)((100d / 100 * width)));
views.get("pnblacktransparent").vw.setHeight((int)((100d / 100 * height)));
views.get("pnblacktransparent").vw.setLeft((int)((0d / 100 * width)));
views.get("pnblacktransparent").vw.setTop((int)((0d / 100 * height)));
views.get("pnstatus").vw.setWidth((int)((90d / 100 * width)));
views.get("pnstatus").vw.setHeight((int)((50d / 100 * height)));
views.get("pnstatus").vw.setLeft((int)((50d / 100 * width) - (views.get("pnstatus").vw.getWidth() / 2)));
views.get("pnstatus").vw.setTop((int)((50d / 100 * height) - (views.get("pnstatus").vw.getHeight() / 2)));
views.get("lbltittle3").vw.setWidth((int)((80d / 100 * width)));
views.get("lbltittle3").vw.setHeight((int)((40d * scale)));
views.get("lbltittle3").vw.setLeft((int)((5d / 100 * width)));
views.get("lbltittle3").vw.setTop((int)((1d / 100 * height)));
views.get("imgclose2").vw.setWidth((int)((25d * scale)));
views.get("imgclose2").vw.setHeight((int)((views.get("imgclose2").vw.getWidth())));
views.get("imgclose2").vw.setLeft((int)((views.get("lbltittle3").vw.getLeft() + views.get("lbltittle3").vw.getWidth()) - (views.get("imgclose2").vw.getWidth())));
views.get("imgclose2").vw.setTop((int)((views.get("lbltittle3").vw.getTop() + views.get("lbltittle3").vw.getHeight()/2) - (views.get("imgclose2").vw.getHeight() / 2)));
views.get("lblline3").vw.setWidth((int)((90d / 100 * width)));
views.get("lblline3").vw.setHeight((int)((20d * scale)));
views.get("lblline3").vw.setLeft((int)((0d / 100 * width)));
views.get("lblline3").vw.setTop((int)((views.get("lbltittle3").vw.getTop() + views.get("lbltittle3").vw.getHeight())));
views.get("imgstatus").vw.setWidth((int)((80d * scale)));
views.get("imgstatus").vw.setHeight((int)((80d * scale)));
views.get("imgstatus").vw.setLeft((int)((views.get("lbltittle3").vw.getLeft() + views.get("lbltittle3").vw.getWidth()/2) - (views.get("imgstatus").vw.getWidth() / 2)));
views.get("imgstatus").vw.setTop((int)((views.get("lblline3").vw.getTop() + views.get("lblline3").vw.getHeight())+(1d / 100 * height)));
views.get("lblstatus").vw.setWidth((int)((views.get("lbltittle3").vw.getWidth())));
views.get("lblstatus").vw.setHeight((int)((views.get("lbltittle3").vw.getHeight())));
views.get("lblstatus").vw.setLeft((int)((views.get("lbltittle3").vw.getLeft())));
views.get("lblstatus").vw.setTop((int)((views.get("imgstatus").vw.getTop() + views.get("imgstatus").vw.getHeight())+(2d / 100 * height)));
views.get("btnclose").vw.setWidth((int)((70d / 100 * width)));
views.get("btnclose").vw.setHeight((int)((50d * scale)));
views.get("btnclose").vw.setLeft((int)((views.get("lbltittle3").vw.getLeft() + views.get("lbltittle3").vw.getWidth()/2) - (views.get("btnclose").vw.getWidth() / 2)));
views.get("btnclose").vw.setTop((int)((views.get("lblstatus").vw.getTop() + views.get("lblstatus").vw.getHeight())+(10d / 100 * height)));

}
}