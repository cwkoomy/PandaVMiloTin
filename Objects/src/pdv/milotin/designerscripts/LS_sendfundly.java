package pdv.milotin.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_sendfundly{

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
views.get("pnframe1").vw.setWidth((int)((90d / 100 * width)));
views.get("pnframe1").vw.setHeight((int)((71d / 100 * height)));
views.get("pnframe1").vw.setLeft((int)((50d / 100 * width) - (views.get("pnframe1").vw.getWidth() / 2)));
views.get("pnframe1").vw.setTop((int)((views.get("pnheader1").vw.getTop() + views.get("pnheader1").vw.getHeight()/2)));
views.get("lblprojecttittle").vw.setWidth((int)((80d / 100 * width)));
views.get("lblprojecttittle").vw.setHeight((int)((40d * scale)));
views.get("lblprojecttittle").vw.setLeft((int)((50d / 100 * width) - (views.get("lblprojecttittle").vw.getWidth() / 2)));
views.get("lblprojecttittle").vw.setTop((int)((views.get("pnframe1").vw.getTop())+(1d / 100 * height)));
views.get("lblline1").vw.setWidth((int)((90d / 100 * width)));
views.get("lblline1").vw.setHeight((int)((20d * scale)));
views.get("lblline1").vw.setLeft((int)((50d / 100 * width) - (views.get("lblline1").vw.getWidth() / 2)));
views.get("lblline1").vw.setTop((int)((views.get("lblprojecttittle").vw.getTop() + views.get("lblprojecttittle").vw.getHeight())));
views.get("cpbar2").vw.setWidth((int)((100d * scale)));
views.get("cpbar2").vw.setHeight((int)((views.get("cpbar2").vw.getWidth())));
views.get("cpbar2").vw.setLeft((int)((views.get("lblprojecttittle").vw.getLeft())));
views.get("cpbar2").vw.setTop((int)((views.get("lblline1").vw.getTop() + views.get("lblline1").vw.getHeight())));
views.get("lblprojectfund2").vw.setWidth((int)((52d / 100 * width)));
views.get("lblprojectfund2").vw.setHeight((int)((40d * scale)));
views.get("lblprojectfund2").vw.setLeft((int)((views.get("lblprojecttittle").vw.getLeft() + views.get("lblprojecttittle").vw.getWidth()) - (views.get("lblprojectfund2").vw.getWidth())));
views.get("lblprojectfund2").vw.setTop((int)((views.get("cpbar2").vw.getTop())+(3d / 100 * height)));
views.get("lblprojectprogress2").vw.setWidth((int)((52d / 100 * width)));
views.get("lblprojectprogress2").vw.setHeight((int)((20d * scale)));
views.get("lblprojectprogress2").vw.setLeft((int)((views.get("lblprojectfund2").vw.getLeft() + views.get("lblprojectfund2").vw.getWidth()) - (views.get("lblprojectprogress2").vw.getWidth())));
views.get("lblprojectprogress2").vw.setTop((int)((views.get("lblprojectfund2").vw.getTop() + views.get("lblprojectfund2").vw.getHeight())));
views.get("lbldonate").vw.setWidth((int)((70d / 100 * width)));
views.get("lbldonate").vw.setHeight((int)((40d * scale)));
views.get("lbldonate").vw.setLeft((int)((50d / 100 * width) - (views.get("lbldonate").vw.getWidth() / 2)));
views.get("lbldonate").vw.setTop((int)((views.get("cpbar2").vw.getTop() + views.get("cpbar2").vw.getHeight())+(2d / 100 * height)));
views.get("pndonateamount").vw.setWidth((int)((70d / 100 * width)));
views.get("pndonateamount").vw.setHeight((int)((50d * scale)));
views.get("pndonateamount").vw.setLeft((int)((50d / 100 * width) - (views.get("pndonateamount").vw.getWidth() / 2)));
views.get("pndonateamount").vw.setTop((int)((views.get("lbldonate").vw.getTop() + views.get("lbldonate").vw.getHeight())));
views.get("imgdonate").vw.setTop((int)((views.get("pndonateamount").vw.getHeight())/2d-(views.get("imgdonate").vw.getHeight())/2d));
views.get("lblmethod").vw.setWidth((int)((70d / 100 * width)));
views.get("lblmethod").vw.setHeight((int)((40d * scale)));
views.get("lblmethod").vw.setLeft((int)((50d / 100 * width) - (views.get("lblmethod").vw.getWidth() / 2)));
views.get("lblmethod").vw.setTop((int)((views.get("pndonateamount").vw.getTop() + views.get("pndonateamount").vw.getHeight())+(2d / 100 * height)));
views.get("imgmaschain").vw.setWidth((int)((60d * scale)));
views.get("imgmaschain").vw.setHeight((int)((40d * scale)));
views.get("imgmaschain").vw.setLeft((int)((views.get("lblmethod").vw.getLeft())));
views.get("imgmaschain").vw.setTop((int)((views.get("lblmethod").vw.getTop() + views.get("lblmethod").vw.getHeight())));
views.get("imgbtc").vw.setWidth((int)((views.get("imgmaschain").vw.getWidth())));
views.get("imgbtc").vw.setHeight((int)((views.get("imgmaschain").vw.getHeight())));
views.get("imgbtc").vw.setLeft((int)((views.get("imgmaschain").vw.getLeft() + views.get("imgmaschain").vw.getWidth())+(3d / 100 * width)));
views.get("imgbtc").vw.setTop((int)((views.get("imgmaschain").vw.getTop())));
views.get("imgfpx").vw.setWidth((int)((views.get("imgmaschain").vw.getWidth())));
views.get("imgfpx").vw.setHeight((int)((views.get("imgmaschain").vw.getHeight())));
views.get("imgfpx").vw.setLeft((int)((views.get("imgbtc").vw.getLeft() + views.get("imgbtc").vw.getWidth())+(3d / 100 * width)));
views.get("imgfpx").vw.setTop((int)((views.get("imgmaschain").vw.getTop())));
views.get("imgcredit").vw.setWidth((int)((views.get("imgmaschain").vw.getWidth())));
views.get("imgcredit").vw.setHeight((int)((views.get("imgmaschain").vw.getHeight())));
views.get("imgcredit").vw.setLeft((int)((views.get("lblmethod").vw.getLeft() + views.get("lblmethod").vw.getWidth()) - (views.get("imgcredit").vw.getWidth())));
views.get("imgcredit").vw.setTop((int)((views.get("imgmaschain").vw.getTop())));
views.get("btnnext").vw.setWidth((int)((views.get("pndonateamount").vw.getWidth())));
views.get("btnnext").vw.setHeight((int)((50d * scale)));
views.get("btnnext").vw.setLeft((int)((50d / 100 * width) - (views.get("btnnext").vw.getWidth() / 2)));
views.get("btnnext").vw.setTop((int)((views.get("pnframe1").vw.getTop() + views.get("pnframe1").vw.getHeight())-(5d / 100 * height) - (views.get("btnnext").vw.getHeight())));
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
//BA.debugLineNum = 112;BA.debugLine="lblUser2.HorizontalCenter = 87.5%x"[SendFundLy/General script]
views.get("lbluser2").vw.setLeft((int)((87.5d / 100 * width) - (views.get("lbluser2").vw.getWidth() / 2)));
//BA.debugLineNum = 113;BA.debugLine="lblUser2.Bottom = lblHome2.Bottom"[SendFundLy/General script]
views.get("lbluser2").vw.setTop((int)((views.get("lblhome2").vw.getTop() + views.get("lblhome2").vw.getHeight()) - (views.get("lbluser2").vw.getHeight())));
//BA.debugLineNum = 115;BA.debugLine="lblHome.Width = 30dip"[SendFundLy/General script]
views.get("lblhome").vw.setWidth((int)((30d * scale)));
//BA.debugLineNum = 116;BA.debugLine="lblHome.Height = 30dip"[SendFundLy/General script]
views.get("lblhome").vw.setHeight((int)((30d * scale)));
//BA.debugLineNum = 117;BA.debugLine="lblHome.HorizontalCenter = 12.5%x"[SendFundLy/General script]
views.get("lblhome").vw.setLeft((int)((12.5d / 100 * width) - (views.get("lblhome").vw.getWidth() / 2)));
//BA.debugLineNum = 118;BA.debugLine="lblHome.Bottom = lblHome2.Top -1%y"[SendFundLy/General script]
views.get("lblhome").vw.setTop((int)((views.get("lblhome2").vw.getTop())-(1d / 100 * height) - (views.get("lblhome").vw.getHeight())));
//BA.debugLineNum = 120;BA.debugLine="lblFund.Width = lblHome.Width"[SendFundLy/General script]
views.get("lblfund").vw.setWidth((int)((views.get("lblhome").vw.getWidth())));
//BA.debugLineNum = 121;BA.debugLine="lblFund.Height = lblHome.Height"[SendFundLy/General script]
views.get("lblfund").vw.setHeight((int)((views.get("lblhome").vw.getHeight())));
//BA.debugLineNum = 122;BA.debugLine="lblFund.HorizontalCenter = 37.5%x"[SendFundLy/General script]
views.get("lblfund").vw.setLeft((int)((37.5d / 100 * width) - (views.get("lblfund").vw.getWidth() / 2)));
//BA.debugLineNum = 123;BA.debugLine="lblFund.Bottom = lblHome.Bottom"[SendFundLy/General script]
views.get("lblfund").vw.setTop((int)((views.get("lblhome").vw.getTop() + views.get("lblhome").vw.getHeight()) - (views.get("lblfund").vw.getHeight())));
//BA.debugLineNum = 125;BA.debugLine="lblHistory.Width = lblHome.Width"[SendFundLy/General script]
views.get("lblhistory").vw.setWidth((int)((views.get("lblhome").vw.getWidth())));
//BA.debugLineNum = 126;BA.debugLine="lblHistory.Height = lblHome.Height"[SendFundLy/General script]
views.get("lblhistory").vw.setHeight((int)((views.get("lblhome").vw.getHeight())));
//BA.debugLineNum = 127;BA.debugLine="lblHistory.HorizontalCenter = 62.5%x"[SendFundLy/General script]
views.get("lblhistory").vw.setLeft((int)((62.5d / 100 * width) - (views.get("lblhistory").vw.getWidth() / 2)));
//BA.debugLineNum = 128;BA.debugLine="lblHistory.Bottom = lblHome.Bottom"[SendFundLy/General script]
views.get("lblhistory").vw.setTop((int)((views.get("lblhome").vw.getTop() + views.get("lblhome").vw.getHeight()) - (views.get("lblhistory").vw.getHeight())));
//BA.debugLineNum = 130;BA.debugLine="lblUser.Width = lblHome.Width"[SendFundLy/General script]
views.get("lbluser").vw.setWidth((int)((views.get("lblhome").vw.getWidth())));
//BA.debugLineNum = 131;BA.debugLine="lblUser.Height = lblHome.Height"[SendFundLy/General script]
views.get("lbluser").vw.setHeight((int)((views.get("lblhome").vw.getHeight())));
//BA.debugLineNum = 132;BA.debugLine="lblUser.HorizontalCenter = 87.5%x"[SendFundLy/General script]
views.get("lbluser").vw.setLeft((int)((87.5d / 100 * width) - (views.get("lbluser").vw.getWidth() / 2)));
//BA.debugLineNum = 133;BA.debugLine="lblUser.Bottom = lblHome.Bottom"[SendFundLy/General script]
views.get("lbluser").vw.setTop((int)((views.get("lblhome").vw.getTop() + views.get("lblhome").vw.getHeight()) - (views.get("lbluser").vw.getHeight())));
//BA.debugLineNum = 137;BA.debugLine="pnBlackTransparent.Width = 100%x"[SendFundLy/General script]
views.get("pnblacktransparent").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 138;BA.debugLine="pnBlackTransparent.Height = 100%y"[SendFundLy/General script]
views.get("pnblacktransparent").vw.setHeight((int)((100d / 100 * height)));
//BA.debugLineNum = 139;BA.debugLine="pnBlackTransparent.Left = 0%x"[SendFundLy/General script]
views.get("pnblacktransparent").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 140;BA.debugLine="pnBlackTransparent.Top = 0%y"[SendFundLy/General script]
views.get("pnblacktransparent").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 142;BA.debugLine="pnConfirmation.Width = 90%x"[SendFundLy/General script]
views.get("pnconfirmation").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 143;BA.debugLine="pnConfirmation.Height = 50%y"[SendFundLy/General script]
views.get("pnconfirmation").vw.setHeight((int)((50d / 100 * height)));
//BA.debugLineNum = 144;BA.debugLine="pnConfirmation.HorizontalCenter = 50%x"[SendFundLy/General script]
views.get("pnconfirmation").vw.setLeft((int)((50d / 100 * width) - (views.get("pnconfirmation").vw.getWidth() / 2)));
//BA.debugLineNum = 145;BA.debugLine="pnConfirmation.VerticalCenter = 50%y"[SendFundLy/General script]
views.get("pnconfirmation").vw.setTop((int)((50d / 100 * height) - (views.get("pnconfirmation").vw.getHeight() / 2)));
//BA.debugLineNum = 147;BA.debugLine="lblTittle2.Width = 80%x"[SendFundLy/General script]
views.get("lbltittle2").vw.setWidth((int)((80d / 100 * width)));
//BA.debugLineNum = 148;BA.debugLine="lblTittle2.Height = 40dip"[SendFundLy/General script]
views.get("lbltittle2").vw.setHeight((int)((40d * scale)));
//BA.debugLineNum = 149;BA.debugLine="lblTittle2.Left = 5%x"[SendFundLy/General script]
views.get("lbltittle2").vw.setLeft((int)((5d / 100 * width)));
//BA.debugLineNum = 150;BA.debugLine="lblTittle2.Top = 1%y"[SendFundLy/General script]
views.get("lbltittle2").vw.setTop((int)((1d / 100 * height)));
//BA.debugLineNum = 152;BA.debugLine="imgClose.Width = 25dip"[SendFundLy/General script]
views.get("imgclose").vw.setWidth((int)((25d * scale)));
//BA.debugLineNum = 153;BA.debugLine="imgClose.Height = imgClose.Width"[SendFundLy/General script]
views.get("imgclose").vw.setHeight((int)((views.get("imgclose").vw.getWidth())));
//BA.debugLineNum = 154;BA.debugLine="imgClose.Right = lblTittle2.Right"[SendFundLy/General script]
views.get("imgclose").vw.setLeft((int)((views.get("lbltittle2").vw.getLeft() + views.get("lbltittle2").vw.getWidth()) - (views.get("imgclose").vw.getWidth())));
//BA.debugLineNum = 155;BA.debugLine="imgClose.VerticalCenter = lblTittle2.VerticalCenter"[SendFundLy/General script]
views.get("imgclose").vw.setTop((int)((views.get("lbltittle2").vw.getTop() + views.get("lbltittle2").vw.getHeight()/2) - (views.get("imgclose").vw.getHeight() / 2)));
//BA.debugLineNum = 157;BA.debugLine="lblLine2.Width = 90%x"[SendFundLy/General script]
views.get("lblline2").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 158;BA.debugLine="lblLine2.Height = 20dip"[SendFundLy/General script]
views.get("lblline2").vw.setHeight((int)((20d * scale)));
//BA.debugLineNum = 159;BA.debugLine="lblLine2.Left = 0%x"[SendFundLy/General script]
views.get("lblline2").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 160;BA.debugLine="lblLine2.Top = lblTittle2.Bottom"[SendFundLy/General script]
views.get("lblline2").vw.setTop((int)((views.get("lbltittle2").vw.getTop() + views.get("lbltittle2").vw.getHeight())));
//BA.debugLineNum = 162;BA.debugLine="imgCurrency.Width = 80dip"[SendFundLy/General script]
views.get("imgcurrency").vw.setWidth((int)((80d * scale)));
//BA.debugLineNum = 163;BA.debugLine="imgCurrency.Height = 80dip"[SendFundLy/General script]
views.get("imgcurrency").vw.setHeight((int)((80d * scale)));
//BA.debugLineNum = 164;BA.debugLine="imgCurrency.HorizontalCenter = lblTittle2.HorizontalCenter"[SendFundLy/General script]
views.get("imgcurrency").vw.setLeft((int)((views.get("lbltittle2").vw.getLeft() + views.get("lbltittle2").vw.getWidth()/2) - (views.get("imgcurrency").vw.getWidth() / 2)));
//BA.debugLineNum = 165;BA.debugLine="imgCurrency.Top = lblLine2.Bottom +1%y"[SendFundLy/General script]
views.get("imgcurrency").vw.setTop((int)((views.get("lblline2").vw.getTop() + views.get("lblline2").vw.getHeight())+(1d / 100 * height)));
//BA.debugLineNum = 167;BA.debugLine="lblDonateAmount.Width = lblTittle2.Width"[SendFundLy/General script]
views.get("lbldonateamount").vw.setWidth((int)((views.get("lbltittle2").vw.getWidth())));
//BA.debugLineNum = 168;BA.debugLine="lblDonateAmount.Height = lblTittle2.Height"[SendFundLy/General script]
views.get("lbldonateamount").vw.setHeight((int)((views.get("lbltittle2").vw.getHeight())));
//BA.debugLineNum = 169;BA.debugLine="lblDonateAmount.Left = lblTittle2.Left"[SendFundLy/General script]
views.get("lbldonateamount").vw.setLeft((int)((views.get("lbltittle2").vw.getLeft())));
//BA.debugLineNum = 170;BA.debugLine="lblDonateAmount.Top = imgCurrency.Bottom +2%y"[SendFundLy/General script]
views.get("lbldonateamount").vw.setTop((int)((views.get("imgcurrency").vw.getTop() + views.get("imgcurrency").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 172;BA.debugLine="btnSend.Width = 70%x"[SendFundLy/General script]
views.get("btnsend").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 173;BA.debugLine="btnSend.Height = 50dip"[SendFundLy/General script]
views.get("btnsend").vw.setHeight((int)((50d * scale)));
//BA.debugLineNum = 174;BA.debugLine="btnSend.HorizontalCenter = lblTittle2.HorizontalCenter"[SendFundLy/General script]
views.get("btnsend").vw.setLeft((int)((views.get("lbltittle2").vw.getLeft() + views.get("lbltittle2").vw.getWidth()/2) - (views.get("btnsend").vw.getWidth() / 2)));
//BA.debugLineNum = 175;BA.debugLine="btnSend.Top = lblDonateAmount.Bottom +10%y"[SendFundLy/General script]
views.get("btnsend").vw.setTop((int)((views.get("lbldonateamount").vw.getTop() + views.get("lbldonateamount").vw.getHeight())+(10d / 100 * height)));
//BA.debugLineNum = 179;BA.debugLine="pnStatus.Width = 90%x"[SendFundLy/General script]
views.get("pnstatus").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 180;BA.debugLine="pnStatus.Height = 50%y"[SendFundLy/General script]
views.get("pnstatus").vw.setHeight((int)((50d / 100 * height)));
//BA.debugLineNum = 181;BA.debugLine="pnStatus.HorizontalCenter = 50%x"[SendFundLy/General script]
views.get("pnstatus").vw.setLeft((int)((50d / 100 * width) - (views.get("pnstatus").vw.getWidth() / 2)));
//BA.debugLineNum = 182;BA.debugLine="pnStatus.VerticalCenter = 50%y"[SendFundLy/General script]
views.get("pnstatus").vw.setTop((int)((50d / 100 * height) - (views.get("pnstatus").vw.getHeight() / 2)));
//BA.debugLineNum = 184;BA.debugLine="lblTittle3.Width = 80%x"[SendFundLy/General script]
views.get("lbltittle3").vw.setWidth((int)((80d / 100 * width)));
//BA.debugLineNum = 185;BA.debugLine="lblTittle3.Height = 40dip"[SendFundLy/General script]
views.get("lbltittle3").vw.setHeight((int)((40d * scale)));
//BA.debugLineNum = 186;BA.debugLine="lblTittle3.Left = 5%x"[SendFundLy/General script]
views.get("lbltittle3").vw.setLeft((int)((5d / 100 * width)));
//BA.debugLineNum = 187;BA.debugLine="lblTittle3.Top = 1%y"[SendFundLy/General script]
views.get("lbltittle3").vw.setTop((int)((1d / 100 * height)));
//BA.debugLineNum = 189;BA.debugLine="imgClose2.Width = 25dip"[SendFundLy/General script]
views.get("imgclose2").vw.setWidth((int)((25d * scale)));
//BA.debugLineNum = 190;BA.debugLine="imgClose2.Height = imgClose.Width"[SendFundLy/General script]
views.get("imgclose2").vw.setHeight((int)((views.get("imgclose").vw.getWidth())));
//BA.debugLineNum = 191;BA.debugLine="imgClose2.Right = lblTittle3.Right"[SendFundLy/General script]
views.get("imgclose2").vw.setLeft((int)((views.get("lbltittle3").vw.getLeft() + views.get("lbltittle3").vw.getWidth()) - (views.get("imgclose2").vw.getWidth())));
//BA.debugLineNum = 192;BA.debugLine="imgClose2.VerticalCenter = lblTittle3.VerticalCenter"[SendFundLy/General script]
views.get("imgclose2").vw.setTop((int)((views.get("lbltittle3").vw.getTop() + views.get("lbltittle3").vw.getHeight()/2) - (views.get("imgclose2").vw.getHeight() / 2)));
//BA.debugLineNum = 194;BA.debugLine="lblLine3.Width = 90%x"[SendFundLy/General script]
views.get("lblline3").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 195;BA.debugLine="lblLine3.Height = 20dip"[SendFundLy/General script]
views.get("lblline3").vw.setHeight((int)((20d * scale)));
//BA.debugLineNum = 196;BA.debugLine="lblLine3.Left = 0%x"[SendFundLy/General script]
views.get("lblline3").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 197;BA.debugLine="lblLine3.Top = lblTittle3.Bottom"[SendFundLy/General script]
views.get("lblline3").vw.setTop((int)((views.get("lbltittle3").vw.getTop() + views.get("lbltittle3").vw.getHeight())));
//BA.debugLineNum = 199;BA.debugLine="imgStatus.Width = 80dip"[SendFundLy/General script]
views.get("imgstatus").vw.setWidth((int)((80d * scale)));
//BA.debugLineNum = 200;BA.debugLine="imgStatus.Height = 80dip"[SendFundLy/General script]
views.get("imgstatus").vw.setHeight((int)((80d * scale)));
//BA.debugLineNum = 201;BA.debugLine="imgStatus.HorizontalCenter = lblTittle3.HorizontalCenter"[SendFundLy/General script]
views.get("imgstatus").vw.setLeft((int)((views.get("lbltittle3").vw.getLeft() + views.get("lbltittle3").vw.getWidth()/2) - (views.get("imgstatus").vw.getWidth() / 2)));
//BA.debugLineNum = 202;BA.debugLine="imgStatus.Top = lblLine3.Bottom +1%y"[SendFundLy/General script]
views.get("imgstatus").vw.setTop((int)((views.get("lblline3").vw.getTop() + views.get("lblline3").vw.getHeight())+(1d / 100 * height)));
//BA.debugLineNum = 204;BA.debugLine="lblStatus.Width = lblTittle3.Width"[SendFundLy/General script]
views.get("lblstatus").vw.setWidth((int)((views.get("lbltittle3").vw.getWidth())));
//BA.debugLineNum = 205;BA.debugLine="lblStatus.Height = lblTittle3.Height"[SendFundLy/General script]
views.get("lblstatus").vw.setHeight((int)((views.get("lbltittle3").vw.getHeight())));
//BA.debugLineNum = 206;BA.debugLine="lblStatus.Left = lblTittle3.Left"[SendFundLy/General script]
views.get("lblstatus").vw.setLeft((int)((views.get("lbltittle3").vw.getLeft())));
//BA.debugLineNum = 207;BA.debugLine="lblStatus.Top = imgStatus.Bottom +2%y"[SendFundLy/General script]
views.get("lblstatus").vw.setTop((int)((views.get("imgstatus").vw.getTop() + views.get("imgstatus").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 209;BA.debugLine="btnClose.Width = 70%x"[SendFundLy/General script]
views.get("btnclose").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 210;BA.debugLine="btnClose.Height = 50dip"[SendFundLy/General script]
views.get("btnclose").vw.setHeight((int)((50d * scale)));
//BA.debugLineNum = 211;BA.debugLine="btnClose.HorizontalCenter = lblTittle3.HorizontalCenter"[SendFundLy/General script]
views.get("btnclose").vw.setLeft((int)((views.get("lbltittle3").vw.getLeft() + views.get("lbltittle3").vw.getWidth()/2) - (views.get("btnclose").vw.getWidth() / 2)));
//BA.debugLineNum = 212;BA.debugLine="btnClose.Top = lblStatus.Bottom +10%y"[SendFundLy/General script]
views.get("btnclose").vw.setTop((int)((views.get("lblstatus").vw.getTop() + views.get("lblstatus").vw.getHeight())+(10d / 100 * height)));

}
}