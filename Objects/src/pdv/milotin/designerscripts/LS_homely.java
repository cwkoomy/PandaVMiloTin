package pdv.milotin.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_homely{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[HomeLy/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="lblTop.Width = 100%x"[HomeLy/General script]
views.get("lbltop").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 5;BA.debugLine="lblTop.Height = 60dip"[HomeLy/General script]
views.get("lbltop").vw.setHeight((int)((60d * scale)));
//BA.debugLineNum = 6;BA.debugLine="lblTop.Left = 0%x"[HomeLy/General script]
views.get("lbltop").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 7;BA.debugLine="lblTop.Top = 0%y"[HomeLy/General script]
views.get("lbltop").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 9;BA.debugLine="imgMenu.Width = 40dip"[HomeLy/General script]
views.get("imgmenu").vw.setWidth((int)((40d * scale)));
//BA.debugLineNum = 10;BA.debugLine="imgMenu.Height = 40dip"[HomeLy/General script]
views.get("imgmenu").vw.setHeight((int)((40d * scale)));
//BA.debugLineNum = 11;BA.debugLine="imgMenu.Left = 3%x"[HomeLy/General script]
views.get("imgmenu").vw.setLeft((int)((3d / 100 * width)));
//BA.debugLineNum = 12;BA.debugLine="imgMenu.VerticalCenter = lblTop.VerticalCenter"[HomeLy/General script]
views.get("imgmenu").vw.setTop((int)((views.get("lbltop").vw.getTop() + views.get("lbltop").vw.getHeight()/2) - (views.get("imgmenu").vw.getHeight() / 2)));
//BA.debugLineNum = 14;BA.debugLine="imgAvatar.Width = 60dip"[HomeLy/General script]
views.get("imgavatar").vw.setWidth((int)((60d * scale)));
//BA.debugLineNum = 15;BA.debugLine="imgAvatar.Height = 60dip"[HomeLy/General script]
views.get("imgavatar").vw.setHeight((int)((60d * scale)));
//BA.debugLineNum = 16;BA.debugLine="imgAvatar.Right = lblTop.Right -5%x"[HomeLy/General script]
views.get("imgavatar").vw.setLeft((int)((views.get("lbltop").vw.getLeft() + views.get("lbltop").vw.getWidth())-(5d / 100 * width) - (views.get("imgavatar").vw.getWidth())));
//BA.debugLineNum = 17;BA.debugLine="imgAvatar.Top = 2%y"[HomeLy/General script]
views.get("imgavatar").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 19;BA.debugLine="pnHeader1.Width = 100%x"[HomeLy/General script]
views.get("pnheader1").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 20;BA.debugLine="pnHeader1.Height = 250dip"[HomeLy/General script]
views.get("pnheader1").vw.setHeight((int)((250d * scale)));
//BA.debugLineNum = 21;BA.debugLine="pnHeader1.Left = 0%x"[HomeLy/General script]
views.get("pnheader1").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 22;BA.debugLine="pnHeader1.Top = 0%y"[HomeLy/General script]
views.get("pnheader1").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 24;BA.debugLine="lblHeaderBg.Width = 90%x"[HomeLy/General script]
views.get("lblheaderbg").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 25;BA.debugLine="lblHeaderBg.Height = 180dip"[HomeLy/General script]
views.get("lblheaderbg").vw.setHeight((int)((180d * scale)));
//BA.debugLineNum = 26;BA.debugLine="lblHeaderBg.HorizontalCenter = 50%x"[HomeLy/General script]
views.get("lblheaderbg").vw.setLeft((int)((50d / 100 * width) - (views.get("lblheaderbg").vw.getWidth() / 2)));
//BA.debugLineNum = 27;BA.debugLine="lblHeaderBg.Top = pnHeader1.VerticalCenter"[HomeLy/General script]
views.get("lblheaderbg").vw.setTop((int)((views.get("pnheader1").vw.getTop() + views.get("pnheader1").vw.getHeight()/2)));
//BA.debugLineNum = 29;BA.debugLine="lblWalletName.Width = 80%x"[HomeLy/General script]
views.get("lblwalletname").vw.setWidth((int)((80d / 100 * width)));
//BA.debugLineNum = 30;BA.debugLine="lblWalletName.Height = 40dip"[HomeLy/General script]
views.get("lblwalletname").vw.setHeight((int)((40d * scale)));
//BA.debugLineNum = 31;BA.debugLine="lblWalletName.HorizontalCenter = 50%x"[HomeLy/General script]
views.get("lblwalletname").vw.setLeft((int)((50d / 100 * width) - (views.get("lblwalletname").vw.getWidth() / 2)));
//BA.debugLineNum = 32;BA.debugLine="lblWalletName.Bottom = lblHeaderBg.Top"[HomeLy/General script]
views.get("lblwalletname").vw.setTop((int)((views.get("lblheaderbg").vw.getTop()) - (views.get("lblwalletname").vw.getHeight())));
//BA.debugLineNum = 34;BA.debugLine="lblHeader1.Width = 40%x"[HomeLy/General script]
views.get("lblheader1").vw.setWidth((int)((40d / 100 * width)));
//BA.debugLineNum = 35;BA.debugLine="lblHeader1.Height = 40dip"[HomeLy/General script]
views.get("lblheader1").vw.setHeight((int)((40d * scale)));
//BA.debugLineNum = 36;BA.debugLine="lblHeader1.Left = lblHeaderBg.Left +5%x"[HomeLy/General script]
views.get("lblheader1").vw.setLeft((int)((views.get("lblheaderbg").vw.getLeft())+(5d / 100 * width)));
//BA.debugLineNum = 37;BA.debugLine="lblHeader1.Top = lblHeaderBg.Top +1%y"[HomeLy/General script]
views.get("lblheader1").vw.setTop((int)((views.get("lblheaderbg").vw.getTop())+(1d / 100 * height)));
//BA.debugLineNum = 39;BA.debugLine="lblHeader2.Width = 40%x"[HomeLy/General script]
views.get("lblheader2").vw.setWidth((int)((40d / 100 * width)));
//BA.debugLineNum = 40;BA.debugLine="lblHeader2.Height = 40dip"[HomeLy/General script]
views.get("lblheader2").vw.setHeight((int)((40d * scale)));
//BA.debugLineNum = 41;BA.debugLine="lblHeader2.Right = lblHeaderBg.Right -5%x"[HomeLy/General script]
views.get("lblheader2").vw.setLeft((int)((views.get("lblheaderbg").vw.getLeft() + views.get("lblheaderbg").vw.getWidth())-(5d / 100 * width) - (views.get("lblheader2").vw.getWidth())));
//BA.debugLineNum = 42;BA.debugLine="lblHeader2.Top = lblHeader1.Top"[HomeLy/General script]
views.get("lblheader2").vw.setTop((int)((views.get("lblheader1").vw.getTop())));
//BA.debugLineNum = 44;BA.debugLine="lblLine1.Width = 90%x"[HomeLy/General script]
views.get("lblline1").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 45;BA.debugLine="lblLine1.Height = 20dip"[HomeLy/General script]
views.get("lblline1").vw.setHeight((int)((20d * scale)));
//BA.debugLineNum = 46;BA.debugLine="lblLine1.Left = lblHeaderBg.Left"[HomeLy/General script]
views.get("lblline1").vw.setLeft((int)((views.get("lblheaderbg").vw.getLeft())));
//BA.debugLineNum = 47;BA.debugLine="lblLine1.Top = lblHeader1.Bottom"[HomeLy/General script]
views.get("lblline1").vw.setTop((int)((views.get("lblheader1").vw.getTop() + views.get("lblheader1").vw.getHeight())));
//BA.debugLineNum = 49;BA.debugLine="lblTotal.Width = 90dip"[HomeLy/General script]
views.get("lbltotal").vw.setWidth((int)((90d * scale)));
//BA.debugLineNum = 50;BA.debugLine="lblTotal.Height = 90dip"[HomeLy/General script]
views.get("lbltotal").vw.setHeight((int)((90d * scale)));
//BA.debugLineNum = 51;BA.debugLine="lblTotal.Left = lblHeader1.Left"[HomeLy/General script]
views.get("lbltotal").vw.setLeft((int)((views.get("lblheader1").vw.getLeft())));
//BA.debugLineNum = 52;BA.debugLine="lblTotal.Top = lblHeader1.Bottom +3%y"[HomeLy/General script]
views.get("lbltotal").vw.setTop((int)((views.get("lblheader1").vw.getTop() + views.get("lblheader1").vw.getHeight())+(3d / 100 * height)));
//BA.debugLineNum = 54;BA.debugLine="imgTotal.Width = lblTotal.Width"[HomeLy/General script]
views.get("imgtotal").vw.setWidth((int)((views.get("lbltotal").vw.getWidth())));
//BA.debugLineNum = 55;BA.debugLine="imgTotal.Height = lblTotal.Height"[HomeLy/General script]
views.get("imgtotal").vw.setHeight((int)((views.get("lbltotal").vw.getHeight())));
//BA.debugLineNum = 56;BA.debugLine="imgTotal.Left = lblTotal.Left"[HomeLy/General script]
views.get("imgtotal").vw.setLeft((int)((views.get("lbltotal").vw.getLeft())));
//BA.debugLineNum = 57;BA.debugLine="imgTotal.Top = lblTotal.Top"[HomeLy/General script]
views.get("imgtotal").vw.setTop((int)((views.get("lbltotal").vw.getTop())));
//BA.debugLineNum = 59;BA.debugLine="lblAmount.Width = 55%x"[HomeLy/General script]
views.get("lblamount").vw.setWidth((int)((55d / 100 * width)));
//BA.debugLineNum = 60;BA.debugLine="lblAmount.Height = 40dip"[HomeLy/General script]
views.get("lblamount").vw.setHeight((int)((40d * scale)));
//BA.debugLineNum = 61;BA.debugLine="lblAmount.Right = lblHeader2.Right"[HomeLy/General script]
views.get("lblamount").vw.setLeft((int)((views.get("lblheader2").vw.getLeft() + views.get("lblheader2").vw.getWidth()) - (views.get("lblamount").vw.getWidth())));
//BA.debugLineNum = 62;BA.debugLine="lblAmount.VerticalCenter = lblTotal.VerticalCenter"[HomeLy/General script]
views.get("lblamount").vw.setTop((int)((views.get("lbltotal").vw.getTop() + views.get("lbltotal").vw.getHeight()/2) - (views.get("lblamount").vw.getHeight() / 2)));
//BA.debugLineNum = 66;BA.debugLine="clvHome.Width = 90%x"[HomeLy/General script]
views.get("clvhome").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 67;BA.debugLine="clvHome.Height = 45%y"[HomeLy/General script]
views.get("clvhome").vw.setHeight((int)((45d / 100 * height)));
//BA.debugLineNum = 68;BA.debugLine="clvHome.HorizontalCenter = 50%x"[HomeLy/General script]
views.get("clvhome").vw.setLeft((int)((50d / 100 * width) - (views.get("clvhome").vw.getWidth() / 2)));
//BA.debugLineNum = 69;BA.debugLine="clvHome.Top = lblHeaderBg.Bottom +2.5%y"[HomeLy/General script]
views.get("clvhome").vw.setTop((int)((views.get("lblheaderbg").vw.getTop() + views.get("lblheaderbg").vw.getHeight())+(2.5d / 100 * height)));
//BA.debugLineNum = 71;BA.debugLine="lblBottom.Width = 100%x"[HomeLy/General script]
views.get("lblbottom").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 72;BA.debugLine="lblBottom.Height = 80dip"[HomeLy/General script]
views.get("lblbottom").vw.setHeight((int)((80d * scale)));
//BA.debugLineNum = 73;BA.debugLine="lblBottom.HorizontalCenter = 50%x"[HomeLy/General script]
views.get("lblbottom").vw.setLeft((int)((50d / 100 * width) - (views.get("lblbottom").vw.getWidth() / 2)));
//BA.debugLineNum = 74;BA.debugLine="lblBottom.Bottom = 100%y"[HomeLy/General script]
views.get("lblbottom").vw.setTop((int)((100d / 100 * height) - (views.get("lblbottom").vw.getHeight())));
//BA.debugLineNum = 76;BA.debugLine="lblHome2.Width = 25%x"[HomeLy/General script]
views.get("lblhome2").vw.setWidth((int)((25d / 100 * width)));
//BA.debugLineNum = 77;BA.debugLine="lblHome2.Height = 20dip"[HomeLy/General script]
views.get("lblhome2").vw.setHeight((int)((20d * scale)));
//BA.debugLineNum = 78;BA.debugLine="lblHome2.HorizontalCenter = 12.5%x"[HomeLy/General script]
views.get("lblhome2").vw.setLeft((int)((12.5d / 100 * width) - (views.get("lblhome2").vw.getWidth() / 2)));
//BA.debugLineNum = 79;BA.debugLine="lblHome2.Bottom = lblBottom.Bottom -1%y"[HomeLy/General script]
views.get("lblhome2").vw.setTop((int)((views.get("lblbottom").vw.getTop() + views.get("lblbottom").vw.getHeight())-(1d / 100 * height) - (views.get("lblhome2").vw.getHeight())));
//BA.debugLineNum = 81;BA.debugLine="lblFund2.Width = lblHome2.Width"[HomeLy/General script]
views.get("lblfund2").vw.setWidth((int)((views.get("lblhome2").vw.getWidth())));
//BA.debugLineNum = 82;BA.debugLine="lblFund2.Height = lblHome2.Height"[HomeLy/General script]
views.get("lblfund2").vw.setHeight((int)((views.get("lblhome2").vw.getHeight())));
//BA.debugLineNum = 83;BA.debugLine="lblFund2.HorizontalCenter = 37.5%x"[HomeLy/General script]
views.get("lblfund2").vw.setLeft((int)((37.5d / 100 * width) - (views.get("lblfund2").vw.getWidth() / 2)));
//BA.debugLineNum = 84;BA.debugLine="lblFund2.Bottom = lblHome2.Bottom"[HomeLy/General script]
views.get("lblfund2").vw.setTop((int)((views.get("lblhome2").vw.getTop() + views.get("lblhome2").vw.getHeight()) - (views.get("lblfund2").vw.getHeight())));
//BA.debugLineNum = 86;BA.debugLine="lblHistory2.Width = lblHome2.Width"[HomeLy/General script]
views.get("lblhistory2").vw.setWidth((int)((views.get("lblhome2").vw.getWidth())));
//BA.debugLineNum = 87;BA.debugLine="lblHistory2.Height = lblHome2.Height"[HomeLy/General script]
views.get("lblhistory2").vw.setHeight((int)((views.get("lblhome2").vw.getHeight())));
//BA.debugLineNum = 88;BA.debugLine="lblHistory2.HorizontalCenter = 62.5%x"[HomeLy/General script]
views.get("lblhistory2").vw.setLeft((int)((62.5d / 100 * width) - (views.get("lblhistory2").vw.getWidth() / 2)));
//BA.debugLineNum = 89;BA.debugLine="lblHistory2.Bottom = lblHome2.Bottom"[HomeLy/General script]
views.get("lblhistory2").vw.setTop((int)((views.get("lblhome2").vw.getTop() + views.get("lblhome2").vw.getHeight()) - (views.get("lblhistory2").vw.getHeight())));
//BA.debugLineNum = 91;BA.debugLine="lblUser2.Width = lblHome2.Width"[HomeLy/General script]
views.get("lbluser2").vw.setWidth((int)((views.get("lblhome2").vw.getWidth())));
//BA.debugLineNum = 92;BA.debugLine="lblUser2.Height = lblHome2.Height"[HomeLy/General script]
views.get("lbluser2").vw.setHeight((int)((views.get("lblhome2").vw.getHeight())));
//BA.debugLineNum = 93;BA.debugLine="lblUser2.HorizontalCenter = 87.5%x"[HomeLy/General script]
views.get("lbluser2").vw.setLeft((int)((87.5d / 100 * width) - (views.get("lbluser2").vw.getWidth() / 2)));
//BA.debugLineNum = 94;BA.debugLine="lblUser2.Bottom = lblHome2.Bottom"[HomeLy/General script]
views.get("lbluser2").vw.setTop((int)((views.get("lblhome2").vw.getTop() + views.get("lblhome2").vw.getHeight()) - (views.get("lbluser2").vw.getHeight())));
//BA.debugLineNum = 96;BA.debugLine="lblHome.Width = 30dip"[HomeLy/General script]
views.get("lblhome").vw.setWidth((int)((30d * scale)));
//BA.debugLineNum = 97;BA.debugLine="lblHome.Height = 30dip"[HomeLy/General script]
views.get("lblhome").vw.setHeight((int)((30d * scale)));
//BA.debugLineNum = 98;BA.debugLine="lblHome.HorizontalCenter = 12.5%x"[HomeLy/General script]
views.get("lblhome").vw.setLeft((int)((12.5d / 100 * width) - (views.get("lblhome").vw.getWidth() / 2)));
//BA.debugLineNum = 99;BA.debugLine="lblHome.Bottom = lblHome2.Top -1%y"[HomeLy/General script]
views.get("lblhome").vw.setTop((int)((views.get("lblhome2").vw.getTop())-(1d / 100 * height) - (views.get("lblhome").vw.getHeight())));
//BA.debugLineNum = 101;BA.debugLine="lblFund.Width = lblHome.Width"[HomeLy/General script]
views.get("lblfund").vw.setWidth((int)((views.get("lblhome").vw.getWidth())));
//BA.debugLineNum = 102;BA.debugLine="lblFund.Height = lblHome.Height"[HomeLy/General script]
views.get("lblfund").vw.setHeight((int)((views.get("lblhome").vw.getHeight())));
//BA.debugLineNum = 103;BA.debugLine="lblFund.HorizontalCenter = 37.5%x"[HomeLy/General script]
views.get("lblfund").vw.setLeft((int)((37.5d / 100 * width) - (views.get("lblfund").vw.getWidth() / 2)));
//BA.debugLineNum = 104;BA.debugLine="lblFund.Bottom = lblHome.Bottom"[HomeLy/General script]
views.get("lblfund").vw.setTop((int)((views.get("lblhome").vw.getTop() + views.get("lblhome").vw.getHeight()) - (views.get("lblfund").vw.getHeight())));
//BA.debugLineNum = 106;BA.debugLine="lblHistory.Width = lblHome.Width"[HomeLy/General script]
views.get("lblhistory").vw.setWidth((int)((views.get("lblhome").vw.getWidth())));
//BA.debugLineNum = 107;BA.debugLine="lblHistory.Height = lblHome.Height"[HomeLy/General script]
views.get("lblhistory").vw.setHeight((int)((views.get("lblhome").vw.getHeight())));
//BA.debugLineNum = 108;BA.debugLine="lblHistory.HorizontalCenter = 62.5%x"[HomeLy/General script]
views.get("lblhistory").vw.setLeft((int)((62.5d / 100 * width) - (views.get("lblhistory").vw.getWidth() / 2)));
//BA.debugLineNum = 109;BA.debugLine="lblHistory.Bottom = lblHome.Bottom"[HomeLy/General script]
views.get("lblhistory").vw.setTop((int)((views.get("lblhome").vw.getTop() + views.get("lblhome").vw.getHeight()) - (views.get("lblhistory").vw.getHeight())));
//BA.debugLineNum = 111;BA.debugLine="lblUser.Width = lblHome.Width"[HomeLy/General script]
views.get("lbluser").vw.setWidth((int)((views.get("lblhome").vw.getWidth())));
//BA.debugLineNum = 112;BA.debugLine="lblUser.Height = lblHome.Height"[HomeLy/General script]
views.get("lbluser").vw.setHeight((int)((views.get("lblhome").vw.getHeight())));
//BA.debugLineNum = 113;BA.debugLine="lblUser.HorizontalCenter = 87.5%x"[HomeLy/General script]
views.get("lbluser").vw.setLeft((int)((87.5d / 100 * width) - (views.get("lbluser").vw.getWidth() / 2)));
//BA.debugLineNum = 114;BA.debugLine="lblUser.Bottom = lblHome.Bottom"[HomeLy/General script]
views.get("lbluser").vw.setTop((int)((views.get("lblhome").vw.getTop() + views.get("lblhome").vw.getHeight()) - (views.get("lbluser").vw.getHeight())));

}
}