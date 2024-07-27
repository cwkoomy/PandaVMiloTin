package pdv.milotin.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_addallocately{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[AddAllocateLy/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="lblTop.Width = 100%x"[AddAllocateLy/General script]
views.get("lbltop").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 5;BA.debugLine="lblTop.Height = 60dip"[AddAllocateLy/General script]
views.get("lbltop").vw.setHeight((int)((60d * scale)));
//BA.debugLineNum = 6;BA.debugLine="lblTop.Left = 0%x"[AddAllocateLy/General script]
views.get("lbltop").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 7;BA.debugLine="lblTop.Top = 0%y"[AddAllocateLy/General script]
views.get("lbltop").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 9;BA.debugLine="imgBack.Width = 30dip"[AddAllocateLy/General script]
views.get("imgback").vw.setWidth((int)((30d * scale)));
//BA.debugLineNum = 10;BA.debugLine="imgBack.Height = 30dip"[AddAllocateLy/General script]
views.get("imgback").vw.setHeight((int)((30d * scale)));
//BA.debugLineNum = 11;BA.debugLine="imgBack.Left = 3%x"[AddAllocateLy/General script]
views.get("imgback").vw.setLeft((int)((3d / 100 * width)));
//BA.debugLineNum = 12;BA.debugLine="imgBack.VerticalCenter = lblTop.VerticalCenter"[AddAllocateLy/General script]
views.get("imgback").vw.setTop((int)((views.get("lbltop").vw.getTop() + views.get("lbltop").vw.getHeight()/2) - (views.get("imgback").vw.getHeight() / 2)));
//BA.debugLineNum = 14;BA.debugLine="pnHeader1.Width = 100%x"[AddAllocateLy/General script]
views.get("pnheader1").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 15;BA.debugLine="pnHeader1.Height = 250dip"[AddAllocateLy/General script]
views.get("pnheader1").vw.setHeight((int)((250d * scale)));
//BA.debugLineNum = 16;BA.debugLine="pnHeader1.Left = 0%x"[AddAllocateLy/General script]
views.get("pnheader1").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 17;BA.debugLine="pnHeader1.Top = 0%y"[AddAllocateLy/General script]
views.get("pnheader1").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 19;BA.debugLine="pnFrame1.Width = 90%x"[AddAllocateLy/General script]
views.get("pnframe1").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 20;BA.debugLine="pnFrame1.Height = 69%y"[AddAllocateLy/General script]
views.get("pnframe1").vw.setHeight((int)((69d / 100 * height)));
//BA.debugLineNum = 21;BA.debugLine="pnFrame1.HorizontalCenter = 50%x"[AddAllocateLy/General script]
views.get("pnframe1").vw.setLeft((int)((50d / 100 * width) - (views.get("pnframe1").vw.getWidth() / 2)));
//BA.debugLineNum = 22;BA.debugLine="pnFrame1.Top = pnHeader1.VerticalCenter"[AddAllocateLy/General script]
views.get("pnframe1").vw.setTop((int)((views.get("pnheader1").vw.getTop() + views.get("pnheader1").vw.getHeight()/2)));
//BA.debugLineNum = 24;BA.debugLine="lblProjectTittle.Width = 80%x"[AddAllocateLy/General script]
views.get("lblprojecttittle").vw.setWidth((int)((80d / 100 * width)));
//BA.debugLineNum = 25;BA.debugLine="lblProjectTittle.Height = 40dip"[AddAllocateLy/General script]
views.get("lblprojecttittle").vw.setHeight((int)((40d * scale)));
//BA.debugLineNum = 26;BA.debugLine="lblProjectTittle.HorizontalCenter = 50%x"[AddAllocateLy/General script]
views.get("lblprojecttittle").vw.setLeft((int)((50d / 100 * width) - (views.get("lblprojecttittle").vw.getWidth() / 2)));
//BA.debugLineNum = 27;BA.debugLine="lblProjectTittle.Top = pnFrame1.Top +1%y"[AddAllocateLy/General script]
views.get("lblprojecttittle").vw.setTop((int)((views.get("pnframe1").vw.getTop())+(1d / 100 * height)));
//BA.debugLineNum = 29;BA.debugLine="lblLine1.Width = 90%x"[AddAllocateLy/General script]
views.get("lblline1").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 30;BA.debugLine="lblLine1.Height = 20dip"[AddAllocateLy/General script]
views.get("lblline1").vw.setHeight((int)((20d * scale)));
//BA.debugLineNum = 31;BA.debugLine="lblLine1.HorizontalCenter = 50%x"[AddAllocateLy/General script]
views.get("lblline1").vw.setLeft((int)((50d / 100 * width) - (views.get("lblline1").vw.getWidth() / 2)));
//BA.debugLineNum = 32;BA.debugLine="lblLine1.Top = lblProjectTittle.Bottom"[AddAllocateLy/General script]
views.get("lblline1").vw.setTop((int)((views.get("lblprojecttittle").vw.getTop() + views.get("lblprojecttittle").vw.getHeight())));
//BA.debugLineNum = 34;BA.debugLine="lblAllocateCategory.Width = 70%x"[AddAllocateLy/General script]
views.get("lblallocatecategory").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 35;BA.debugLine="lblAllocateCategory.Height = 40dip"[AddAllocateLy/General script]
views.get("lblallocatecategory").vw.setHeight((int)((40d * scale)));
//BA.debugLineNum = 36;BA.debugLine="lblAllocateCategory.HorizontalCenter = 50%x"[AddAllocateLy/General script]
views.get("lblallocatecategory").vw.setLeft((int)((50d / 100 * width) - (views.get("lblallocatecategory").vw.getWidth() / 2)));
//BA.debugLineNum = 37;BA.debugLine="lblAllocateCategory.Top = lblLine1.Bottom +2%y"[AddAllocateLy/General script]
views.get("lblallocatecategory").vw.setTop((int)((views.get("lblline1").vw.getTop() + views.get("lblline1").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 39;BA.debugLine="pnCategory.Width = 70%x"[AddAllocateLy/General script]
views.get("pncategory").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 40;BA.debugLine="pnCategory.Height = 50dip"[AddAllocateLy/General script]
views.get("pncategory").vw.setHeight((int)((50d * scale)));
//BA.debugLineNum = 41;BA.debugLine="pnCategory.HorizontalCenter = 50%x"[AddAllocateLy/General script]
views.get("pncategory").vw.setLeft((int)((50d / 100 * width) - (views.get("pncategory").vw.getWidth() / 2)));
//BA.debugLineNum = 42;BA.debugLine="pnCategory.Top = lblAllocateCategory.Bottom"[AddAllocateLy/General script]
views.get("pncategory").vw.setTop((int)((views.get("lblallocatecategory").vw.getTop() + views.get("lblallocatecategory").vw.getHeight())));
//BA.debugLineNum = 44;BA.debugLine="imgCategory.Height = 20dip"[AddAllocateLy/General script]
views.get("imgcategory").vw.setHeight((int)((20d * scale)));
//BA.debugLineNum = 45;BA.debugLine="imgCategory.Width = imgCategory.Height"[AddAllocateLy/General script]
views.get("imgcategory").vw.setWidth((int)((views.get("imgcategory").vw.getHeight())));
//BA.debugLineNum = 46;BA.debugLine="imgCategory.Top=pnCategory.Height/2 - imgCategory.Height/2"[AddAllocateLy/General script]
views.get("imgcategory").vw.setTop((int)((views.get("pncategory").vw.getHeight())/2d-(views.get("imgcategory").vw.getHeight())/2d));
//BA.debugLineNum = 48;BA.debugLine="cboCategory.Width = 50%x"[AddAllocateLy/General script]
views.get("cbocategory").vw.setWidth((int)((50d / 100 * width)));
//BA.debugLineNum = 49;BA.debugLine="cboCategory.Left = imgCategory.Right +2%x"[AddAllocateLy/General script]
views.get("cbocategory").vw.setLeft((int)((views.get("imgcategory").vw.getLeft() + views.get("imgcategory").vw.getWidth())+(2d / 100 * width)));
//BA.debugLineNum = 52;BA.debugLine="lblAllocateFund.Width = 70%x"[AddAllocateLy/General script]
views.get("lblallocatefund").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 53;BA.debugLine="lblAllocateFund.Height = 40dip"[AddAllocateLy/General script]
views.get("lblallocatefund").vw.setHeight((int)((40d * scale)));
//BA.debugLineNum = 54;BA.debugLine="lblAllocateFund.HorizontalCenter = 50%x"[AddAllocateLy/General script]
views.get("lblallocatefund").vw.setLeft((int)((50d / 100 * width) - (views.get("lblallocatefund").vw.getWidth() / 2)));
//BA.debugLineNum = 55;BA.debugLine="lblAllocateFund.Top = pnCategory.Bottom"[AddAllocateLy/General script]
views.get("lblallocatefund").vw.setTop((int)((views.get("pncategory").vw.getTop() + views.get("pncategory").vw.getHeight())));
//BA.debugLineNum = 57;BA.debugLine="pnAllocateFund.Width = 70%x"[AddAllocateLy/General script]
views.get("pnallocatefund").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 58;BA.debugLine="pnAllocateFund.Height = 50dip"[AddAllocateLy/General script]
views.get("pnallocatefund").vw.setHeight((int)((50d * scale)));
//BA.debugLineNum = 59;BA.debugLine="pnAllocateFund.HorizontalCenter = 50%x"[AddAllocateLy/General script]
views.get("pnallocatefund").vw.setLeft((int)((50d / 100 * width) - (views.get("pnallocatefund").vw.getWidth() / 2)));
//BA.debugLineNum = 60;BA.debugLine="pnAllocateFund.Top = lblAllocateFund.Bottom"[AddAllocateLy/General script]
views.get("pnallocatefund").vw.setTop((int)((views.get("lblallocatefund").vw.getTop() + views.get("lblallocatefund").vw.getHeight())));
//BA.debugLineNum = 62;BA.debugLine="imgAllocateFund.Height = 20dip"[AddAllocateLy/General script]
views.get("imgallocatefund").vw.setHeight((int)((20d * scale)));
//BA.debugLineNum = 63;BA.debugLine="imgAllocateFund.Width = imgAllocateFund.Height"[AddAllocateLy/General script]
views.get("imgallocatefund").vw.setWidth((int)((views.get("imgallocatefund").vw.getHeight())));
//BA.debugLineNum = 64;BA.debugLine="imgAllocateFund.Top=pnAllocateFund.Height/2 - imgAllocateFund.Height/2"[AddAllocateLy/General script]
views.get("imgallocatefund").vw.setTop((int)((views.get("pnallocatefund").vw.getHeight())/2d-(views.get("imgallocatefund").vw.getHeight())/2d));
//BA.debugLineNum = 66;BA.debugLine="txtAllocateFund.Width = 50%x"[AddAllocateLy/General script]
views.get("txtallocatefund").vw.setWidth((int)((50d / 100 * width)));
//BA.debugLineNum = 67;BA.debugLine="txtAllocateFund.Left = imgAllocateFund.Right +2%x"[AddAllocateLy/General script]
views.get("txtallocatefund").vw.setLeft((int)((views.get("imgallocatefund").vw.getLeft() + views.get("imgallocatefund").vw.getWidth())+(2d / 100 * width)));
//BA.debugLineNum = 69;BA.debugLine="lblRemark.Width = 70%x"[AddAllocateLy/General script]
views.get("lblremark").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 70;BA.debugLine="lblRemark.Height = 40dip"[AddAllocateLy/General script]
views.get("lblremark").vw.setHeight((int)((40d * scale)));
//BA.debugLineNum = 71;BA.debugLine="lblRemark.HorizontalCenter = 50%x"[AddAllocateLy/General script]
views.get("lblremark").vw.setLeft((int)((50d / 100 * width) - (views.get("lblremark").vw.getWidth() / 2)));
//BA.debugLineNum = 72;BA.debugLine="lblRemark.Top = pnAllocateFund.Bottom"[AddAllocateLy/General script]
views.get("lblremark").vw.setTop((int)((views.get("pnallocatefund").vw.getTop() + views.get("pnallocatefund").vw.getHeight())));
//BA.debugLineNum = 74;BA.debugLine="pnRemark.Width = 70%x"[AddAllocateLy/General script]
views.get("pnremark").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 75;BA.debugLine="pnRemark.Height = 50dip"[AddAllocateLy/General script]
views.get("pnremark").vw.setHeight((int)((50d * scale)));
//BA.debugLineNum = 76;BA.debugLine="pnRemark.HorizontalCenter = 50%x"[AddAllocateLy/General script]
views.get("pnremark").vw.setLeft((int)((50d / 100 * width) - (views.get("pnremark").vw.getWidth() / 2)));
//BA.debugLineNum = 77;BA.debugLine="pnRemark.Top = lblRemark.Bottom"[AddAllocateLy/General script]
views.get("pnremark").vw.setTop((int)((views.get("lblremark").vw.getTop() + views.get("lblremark").vw.getHeight())));
//BA.debugLineNum = 79;BA.debugLine="imgRemark.Height = 20dip"[AddAllocateLy/General script]
views.get("imgremark").vw.setHeight((int)((20d * scale)));
//BA.debugLineNum = 80;BA.debugLine="imgRemark.Width = imgRemark.Height"[AddAllocateLy/General script]
views.get("imgremark").vw.setWidth((int)((views.get("imgremark").vw.getHeight())));
//BA.debugLineNum = 81;BA.debugLine="imgRemark.Top=pnRemark.Height/2 - imgRemark.Height/2"[AddAllocateLy/General script]
views.get("imgremark").vw.setTop((int)((views.get("pnremark").vw.getHeight())/2d-(views.get("imgremark").vw.getHeight())/2d));
//BA.debugLineNum = 83;BA.debugLine="txtAllocateFund.Width = 50%x"[AddAllocateLy/General script]
views.get("txtallocatefund").vw.setWidth((int)((50d / 100 * width)));
//BA.debugLineNum = 84;BA.debugLine="txtAllocateFund.Left = imgAllocateFund.Right +2%x"[AddAllocateLy/General script]
views.get("txtallocatefund").vw.setLeft((int)((views.get("imgallocatefund").vw.getLeft() + views.get("imgallocatefund").vw.getWidth())+(2d / 100 * width)));
//BA.debugLineNum = 86;BA.debugLine="btnNext.Width = pnCategory.Width"[AddAllocateLy/General script]
views.get("btnnext").vw.setWidth((int)((views.get("pncategory").vw.getWidth())));
//BA.debugLineNum = 87;BA.debugLine="btnNext.Height = 50dip"[AddAllocateLy/General script]
views.get("btnnext").vw.setHeight((int)((50d * scale)));
//BA.debugLineNum = 88;BA.debugLine="btnNext.HorizontalCenter = 50%x"[AddAllocateLy/General script]
views.get("btnnext").vw.setLeft((int)((50d / 100 * width) - (views.get("btnnext").vw.getWidth() / 2)));
//BA.debugLineNum = 89;BA.debugLine="btnNext.Bottom = pnFrame1.Bottom -5%y"[AddAllocateLy/General script]
views.get("btnnext").vw.setTop((int)((views.get("pnframe1").vw.getTop() + views.get("pnframe1").vw.getHeight())-(5d / 100 * height) - (views.get("btnnext").vw.getHeight())));
//BA.debugLineNum = 91;BA.debugLine="lblBottom.Width = 100%x"[AddAllocateLy/General script]
views.get("lblbottom").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 92;BA.debugLine="lblBottom.Height = 80dip"[AddAllocateLy/General script]
views.get("lblbottom").vw.setHeight((int)((80d * scale)));
//BA.debugLineNum = 93;BA.debugLine="lblBottom.Left = 0%x"[AddAllocateLy/General script]
views.get("lblbottom").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 94;BA.debugLine="lblBottom.Bottom = 100%y"[AddAllocateLy/General script]
views.get("lblbottom").vw.setTop((int)((100d / 100 * height) - (views.get("lblbottom").vw.getHeight())));
//BA.debugLineNum = 96;BA.debugLine="lblHome2.Width = 25%x"[AddAllocateLy/General script]
views.get("lblhome2").vw.setWidth((int)((25d / 100 * width)));
//BA.debugLineNum = 97;BA.debugLine="lblHome2.Height = 20dip"[AddAllocateLy/General script]
views.get("lblhome2").vw.setHeight((int)((20d * scale)));
//BA.debugLineNum = 98;BA.debugLine="lblHome2.HorizontalCenter = 12.5%x"[AddAllocateLy/General script]
views.get("lblhome2").vw.setLeft((int)((12.5d / 100 * width) - (views.get("lblhome2").vw.getWidth() / 2)));
//BA.debugLineNum = 99;BA.debugLine="lblHome2.Bottom = lblBottom.Bottom -1%y"[AddAllocateLy/General script]
views.get("lblhome2").vw.setTop((int)((views.get("lblbottom").vw.getTop() + views.get("lblbottom").vw.getHeight())-(1d / 100 * height) - (views.get("lblhome2").vw.getHeight())));
//BA.debugLineNum = 101;BA.debugLine="lblFund2.Width = lblHome2.Width"[AddAllocateLy/General script]
views.get("lblfund2").vw.setWidth((int)((views.get("lblhome2").vw.getWidth())));
//BA.debugLineNum = 102;BA.debugLine="lblFund2.Height = lblHome2.Height"[AddAllocateLy/General script]
views.get("lblfund2").vw.setHeight((int)((views.get("lblhome2").vw.getHeight())));
//BA.debugLineNum = 103;BA.debugLine="lblFund2.HorizontalCenter = 37.5%x"[AddAllocateLy/General script]
views.get("lblfund2").vw.setLeft((int)((37.5d / 100 * width) - (views.get("lblfund2").vw.getWidth() / 2)));
//BA.debugLineNum = 104;BA.debugLine="lblFund2.Bottom = lblHome2.Bottom"[AddAllocateLy/General script]
views.get("lblfund2").vw.setTop((int)((views.get("lblhome2").vw.getTop() + views.get("lblhome2").vw.getHeight()) - (views.get("lblfund2").vw.getHeight())));
//BA.debugLineNum = 106;BA.debugLine="lblHistory2.Width = lblHome2.Width"[AddAllocateLy/General script]
views.get("lblhistory2").vw.setWidth((int)((views.get("lblhome2").vw.getWidth())));
//BA.debugLineNum = 107;BA.debugLine="lblHistory2.Height = lblHome2.Height"[AddAllocateLy/General script]
views.get("lblhistory2").vw.setHeight((int)((views.get("lblhome2").vw.getHeight())));
//BA.debugLineNum = 108;BA.debugLine="lblHistory2.HorizontalCenter = 62.5%x"[AddAllocateLy/General script]
views.get("lblhistory2").vw.setLeft((int)((62.5d / 100 * width) - (views.get("lblhistory2").vw.getWidth() / 2)));
//BA.debugLineNum = 109;BA.debugLine="lblHistory2.Bottom = lblHome2.Bottom"[AddAllocateLy/General script]
views.get("lblhistory2").vw.setTop((int)((views.get("lblhome2").vw.getTop() + views.get("lblhome2").vw.getHeight()) - (views.get("lblhistory2").vw.getHeight())));
//BA.debugLineNum = 111;BA.debugLine="lblUser2.Width = lblHome2.Width"[AddAllocateLy/General script]
views.get("lbluser2").vw.setWidth((int)((views.get("lblhome2").vw.getWidth())));
//BA.debugLineNum = 112;BA.debugLine="lblUser2.Height = lblHome2.Height"[AddAllocateLy/General script]
views.get("lbluser2").vw.setHeight((int)((views.get("lblhome2").vw.getHeight())));
//BA.debugLineNum = 113;BA.debugLine="lblUser2.HorizontalCenter = 87.5%x"[AddAllocateLy/General script]
views.get("lbluser2").vw.setLeft((int)((87.5d / 100 * width) - (views.get("lbluser2").vw.getWidth() / 2)));
//BA.debugLineNum = 114;BA.debugLine="lblUser2.Bottom = lblHome2.Bottom"[AddAllocateLy/General script]
views.get("lbluser2").vw.setTop((int)((views.get("lblhome2").vw.getTop() + views.get("lblhome2").vw.getHeight()) - (views.get("lbluser2").vw.getHeight())));
//BA.debugLineNum = 116;BA.debugLine="lblHome.Width = 25dip"[AddAllocateLy/General script]
views.get("lblhome").vw.setWidth((int)((25d * scale)));
//BA.debugLineNum = 117;BA.debugLine="lblHome.Height = 25dip"[AddAllocateLy/General script]
views.get("lblhome").vw.setHeight((int)((25d * scale)));
//BA.debugLineNum = 118;BA.debugLine="lblHome.HorizontalCenter = 12.5%x"[AddAllocateLy/General script]
views.get("lblhome").vw.setLeft((int)((12.5d / 100 * width) - (views.get("lblhome").vw.getWidth() / 2)));
//BA.debugLineNum = 119;BA.debugLine="lblHome.Bottom = lblHome2.Top -1%y"[AddAllocateLy/General script]
views.get("lblhome").vw.setTop((int)((views.get("lblhome2").vw.getTop())-(1d / 100 * height) - (views.get("lblhome").vw.getHeight())));
//BA.debugLineNum = 121;BA.debugLine="lblFund.Width = lblHome.Width"[AddAllocateLy/General script]
views.get("lblfund").vw.setWidth((int)((views.get("lblhome").vw.getWidth())));
//BA.debugLineNum = 122;BA.debugLine="lblFund.Height = lblHome.Height"[AddAllocateLy/General script]
views.get("lblfund").vw.setHeight((int)((views.get("lblhome").vw.getHeight())));
//BA.debugLineNum = 123;BA.debugLine="lblFund.HorizontalCenter = 37.5%x"[AddAllocateLy/General script]
views.get("lblfund").vw.setLeft((int)((37.5d / 100 * width) - (views.get("lblfund").vw.getWidth() / 2)));
//BA.debugLineNum = 124;BA.debugLine="lblFund.Bottom = lblHome.Bottom"[AddAllocateLy/General script]
views.get("lblfund").vw.setTop((int)((views.get("lblhome").vw.getTop() + views.get("lblhome").vw.getHeight()) - (views.get("lblfund").vw.getHeight())));
//BA.debugLineNum = 126;BA.debugLine="lblHistory.Width = lblHome.Width"[AddAllocateLy/General script]
views.get("lblhistory").vw.setWidth((int)((views.get("lblhome").vw.getWidth())));
//BA.debugLineNum = 127;BA.debugLine="lblHistory.Height = lblHome.Height"[AddAllocateLy/General script]
views.get("lblhistory").vw.setHeight((int)((views.get("lblhome").vw.getHeight())));
//BA.debugLineNum = 128;BA.debugLine="lblHistory.HorizontalCenter = 62.5%x"[AddAllocateLy/General script]
views.get("lblhistory").vw.setLeft((int)((62.5d / 100 * width) - (views.get("lblhistory").vw.getWidth() / 2)));
//BA.debugLineNum = 129;BA.debugLine="lblHistory.Bottom = lblHome.Bottom"[AddAllocateLy/General script]
views.get("lblhistory").vw.setTop((int)((views.get("lblhome").vw.getTop() + views.get("lblhome").vw.getHeight()) - (views.get("lblhistory").vw.getHeight())));
//BA.debugLineNum = 131;BA.debugLine="lblUser.Width = lblHome.Width"[AddAllocateLy/General script]
views.get("lbluser").vw.setWidth((int)((views.get("lblhome").vw.getWidth())));
//BA.debugLineNum = 132;BA.debugLine="lblUser.Height = lblHome.Height"[AddAllocateLy/General script]
views.get("lbluser").vw.setHeight((int)((views.get("lblhome").vw.getHeight())));
//BA.debugLineNum = 133;BA.debugLine="lblUser.HorizontalCenter = 87.5%x"[AddAllocateLy/General script]
views.get("lbluser").vw.setLeft((int)((87.5d / 100 * width) - (views.get("lbluser").vw.getWidth() / 2)));
//BA.debugLineNum = 134;BA.debugLine="lblUser.Bottom = lblHome.Bottom"[AddAllocateLy/General script]
views.get("lbluser").vw.setTop((int)((views.get("lblhome").vw.getTop() + views.get("lblhome").vw.getHeight()) - (views.get("lbluser").vw.getHeight())));
//BA.debugLineNum = 138;BA.debugLine="pnBlackTransparent.Width = 100%x"[AddAllocateLy/General script]
views.get("pnblacktransparent").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 139;BA.debugLine="pnBlackTransparent.Height = 100%y"[AddAllocateLy/General script]
views.get("pnblacktransparent").vw.setHeight((int)((100d / 100 * height)));
//BA.debugLineNum = 140;BA.debugLine="pnBlackTransparent.Left = 0%x"[AddAllocateLy/General script]
views.get("pnblacktransparent").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 141;BA.debugLine="pnBlackTransparent.Top = 0%y"[AddAllocateLy/General script]
views.get("pnblacktransparent").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 143;BA.debugLine="pnConfirmation.Width = 90%x"[AddAllocateLy/General script]
views.get("pnconfirmation").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 144;BA.debugLine="pnConfirmation.Height = 50%y"[AddAllocateLy/General script]
views.get("pnconfirmation").vw.setHeight((int)((50d / 100 * height)));
//BA.debugLineNum = 145;BA.debugLine="pnConfirmation.HorizontalCenter = 50%x"[AddAllocateLy/General script]
views.get("pnconfirmation").vw.setLeft((int)((50d / 100 * width) - (views.get("pnconfirmation").vw.getWidth() / 2)));
//BA.debugLineNum = 146;BA.debugLine="pnConfirmation.VerticalCenter = 50%y"[AddAllocateLy/General script]
views.get("pnconfirmation").vw.setTop((int)((50d / 100 * height) - (views.get("pnconfirmation").vw.getHeight() / 2)));
//BA.debugLineNum = 148;BA.debugLine="lblTittle2.Width = 80%x"[AddAllocateLy/General script]
views.get("lbltittle2").vw.setWidth((int)((80d / 100 * width)));
//BA.debugLineNum = 149;BA.debugLine="lblTittle2.Height = 40dip"[AddAllocateLy/General script]
views.get("lbltittle2").vw.setHeight((int)((40d * scale)));
//BA.debugLineNum = 150;BA.debugLine="lblTittle2.Left = 5%x"[AddAllocateLy/General script]
views.get("lbltittle2").vw.setLeft((int)((5d / 100 * width)));
//BA.debugLineNum = 151;BA.debugLine="lblTittle2.Top = 1%y"[AddAllocateLy/General script]
views.get("lbltittle2").vw.setTop((int)((1d / 100 * height)));
//BA.debugLineNum = 153;BA.debugLine="imgClose.Width = 25dip"[AddAllocateLy/General script]
views.get("imgclose").vw.setWidth((int)((25d * scale)));
//BA.debugLineNum = 154;BA.debugLine="imgClose.Height = imgClose.Width"[AddAllocateLy/General script]
views.get("imgclose").vw.setHeight((int)((views.get("imgclose").vw.getWidth())));
//BA.debugLineNum = 155;BA.debugLine="imgClose.Right = lblTittle2.Right"[AddAllocateLy/General script]
views.get("imgclose").vw.setLeft((int)((views.get("lbltittle2").vw.getLeft() + views.get("lbltittle2").vw.getWidth()) - (views.get("imgclose").vw.getWidth())));
//BA.debugLineNum = 156;BA.debugLine="imgClose.VerticalCenter = lblTittle2.VerticalCenter"[AddAllocateLy/General script]
views.get("imgclose").vw.setTop((int)((views.get("lbltittle2").vw.getTop() + views.get("lbltittle2").vw.getHeight()/2) - (views.get("imgclose").vw.getHeight() / 2)));
//BA.debugLineNum = 158;BA.debugLine="lblLine2.Width = 90%x"[AddAllocateLy/General script]
views.get("lblline2").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 159;BA.debugLine="lblLine2.Height = 20dip"[AddAllocateLy/General script]
views.get("lblline2").vw.setHeight((int)((20d * scale)));
//BA.debugLineNum = 160;BA.debugLine="lblLine2.Left = 0%x"[AddAllocateLy/General script]
views.get("lblline2").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 161;BA.debugLine="lblLine2.Top = lblTittle2.Bottom"[AddAllocateLy/General script]
views.get("lblline2").vw.setTop((int)((views.get("lbltittle2").vw.getTop() + views.get("lbltittle2").vw.getHeight())));
//BA.debugLineNum = 163;BA.debugLine="imgCurrency.Width = 80dip"[AddAllocateLy/General script]
views.get("imgcurrency").vw.setWidth((int)((80d * scale)));
//BA.debugLineNum = 164;BA.debugLine="imgCurrency.Height = 80dip"[AddAllocateLy/General script]
views.get("imgcurrency").vw.setHeight((int)((80d * scale)));
//BA.debugLineNum = 165;BA.debugLine="imgCurrency.HorizontalCenter = lblTittle2.HorizontalCenter"[AddAllocateLy/General script]
views.get("imgcurrency").vw.setLeft((int)((views.get("lbltittle2").vw.getLeft() + views.get("lbltittle2").vw.getWidth()/2) - (views.get("imgcurrency").vw.getWidth() / 2)));
//BA.debugLineNum = 166;BA.debugLine="imgCurrency.Top = lblLine2.Bottom +1%y"[AddAllocateLy/General script]
views.get("imgcurrency").vw.setTop((int)((views.get("lblline2").vw.getTop() + views.get("lblline2").vw.getHeight())+(1d / 100 * height)));
//BA.debugLineNum = 168;BA.debugLine="lblAllocateAmount.Width = lblTittle2.Width"[AddAllocateLy/General script]
views.get("lblallocateamount").vw.setWidth((int)((views.get("lbltittle2").vw.getWidth())));
//BA.debugLineNum = 169;BA.debugLine="lblAllocateAmount.Height = lblTittle2.Height"[AddAllocateLy/General script]
views.get("lblallocateamount").vw.setHeight((int)((views.get("lbltittle2").vw.getHeight())));
//BA.debugLineNum = 170;BA.debugLine="lblAllocateAmount.Left = lblTittle2.Left"[AddAllocateLy/General script]
views.get("lblallocateamount").vw.setLeft((int)((views.get("lbltittle2").vw.getLeft())));
//BA.debugLineNum = 171;BA.debugLine="lblAllocateAmount.Top = imgCurrency.Bottom +2%y"[AddAllocateLy/General script]
views.get("lblallocateamount").vw.setTop((int)((views.get("imgcurrency").vw.getTop() + views.get("imgcurrency").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 173;BA.debugLine="btnSend.Width = 70%x"[AddAllocateLy/General script]
views.get("btnsend").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 174;BA.debugLine="btnSend.Height = 50dip"[AddAllocateLy/General script]
views.get("btnsend").vw.setHeight((int)((50d * scale)));
//BA.debugLineNum = 175;BA.debugLine="btnSend.HorizontalCenter = lblTittle2.HorizontalCenter"[AddAllocateLy/General script]
views.get("btnsend").vw.setLeft((int)((views.get("lbltittle2").vw.getLeft() + views.get("lbltittle2").vw.getWidth()/2) - (views.get("btnsend").vw.getWidth() / 2)));
//BA.debugLineNum = 176;BA.debugLine="btnSend.Top = lblAllocateAmount.Bottom +10%y"[AddAllocateLy/General script]
views.get("btnsend").vw.setTop((int)((views.get("lblallocateamount").vw.getTop() + views.get("lblallocateamount").vw.getHeight())+(10d / 100 * height)));
//BA.debugLineNum = 180;BA.debugLine="pnStatus.Width = 90%x"[AddAllocateLy/General script]
views.get("pnstatus").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 181;BA.debugLine="pnStatus.Height = 50%y"[AddAllocateLy/General script]
views.get("pnstatus").vw.setHeight((int)((50d / 100 * height)));
//BA.debugLineNum = 182;BA.debugLine="pnStatus.HorizontalCenter = 50%x"[AddAllocateLy/General script]
views.get("pnstatus").vw.setLeft((int)((50d / 100 * width) - (views.get("pnstatus").vw.getWidth() / 2)));
//BA.debugLineNum = 183;BA.debugLine="pnStatus.VerticalCenter = 50%y"[AddAllocateLy/General script]
views.get("pnstatus").vw.setTop((int)((50d / 100 * height) - (views.get("pnstatus").vw.getHeight() / 2)));
//BA.debugLineNum = 185;BA.debugLine="lblTittle3.Width = 80%x"[AddAllocateLy/General script]
views.get("lbltittle3").vw.setWidth((int)((80d / 100 * width)));
//BA.debugLineNum = 186;BA.debugLine="lblTittle3.Height = 40dip"[AddAllocateLy/General script]
views.get("lbltittle3").vw.setHeight((int)((40d * scale)));
//BA.debugLineNum = 187;BA.debugLine="lblTittle3.Left = 5%x"[AddAllocateLy/General script]
views.get("lbltittle3").vw.setLeft((int)((5d / 100 * width)));
//BA.debugLineNum = 188;BA.debugLine="lblTittle3.Top = 1%y"[AddAllocateLy/General script]
views.get("lbltittle3").vw.setTop((int)((1d / 100 * height)));
//BA.debugLineNum = 190;BA.debugLine="imgClose2.Width = 25dip"[AddAllocateLy/General script]
views.get("imgclose2").vw.setWidth((int)((25d * scale)));
//BA.debugLineNum = 191;BA.debugLine="imgClose2.Height = imgClose.Width"[AddAllocateLy/General script]
views.get("imgclose2").vw.setHeight((int)((views.get("imgclose").vw.getWidth())));
//BA.debugLineNum = 192;BA.debugLine="imgClose2.Right = lblTittle3.Right"[AddAllocateLy/General script]
views.get("imgclose2").vw.setLeft((int)((views.get("lbltittle3").vw.getLeft() + views.get("lbltittle3").vw.getWidth()) - (views.get("imgclose2").vw.getWidth())));
//BA.debugLineNum = 193;BA.debugLine="imgClose2.VerticalCenter = lblTittle3.VerticalCenter"[AddAllocateLy/General script]
views.get("imgclose2").vw.setTop((int)((views.get("lbltittle3").vw.getTop() + views.get("lbltittle3").vw.getHeight()/2) - (views.get("imgclose2").vw.getHeight() / 2)));
//BA.debugLineNum = 195;BA.debugLine="lblLine3.Width = 90%x"[AddAllocateLy/General script]
views.get("lblline3").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 196;BA.debugLine="lblLine3.Height = 20dip"[AddAllocateLy/General script]
views.get("lblline3").vw.setHeight((int)((20d * scale)));
//BA.debugLineNum = 197;BA.debugLine="lblLine3.Left = 0%x"[AddAllocateLy/General script]
views.get("lblline3").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 198;BA.debugLine="lblLine3.Top = lblTittle3.Bottom"[AddAllocateLy/General script]
views.get("lblline3").vw.setTop((int)((views.get("lbltittle3").vw.getTop() + views.get("lbltittle3").vw.getHeight())));
//BA.debugLineNum = 200;BA.debugLine="imgStatus.Width = 80dip"[AddAllocateLy/General script]
views.get("imgstatus").vw.setWidth((int)((80d * scale)));
//BA.debugLineNum = 201;BA.debugLine="imgStatus.Height = 80dip"[AddAllocateLy/General script]
views.get("imgstatus").vw.setHeight((int)((80d * scale)));
//BA.debugLineNum = 202;BA.debugLine="imgStatus.HorizontalCenter = lblTittle3.HorizontalCenter"[AddAllocateLy/General script]
views.get("imgstatus").vw.setLeft((int)((views.get("lbltittle3").vw.getLeft() + views.get("lbltittle3").vw.getWidth()/2) - (views.get("imgstatus").vw.getWidth() / 2)));
//BA.debugLineNum = 203;BA.debugLine="imgStatus.Top = lblLine3.Bottom +1%y"[AddAllocateLy/General script]
views.get("imgstatus").vw.setTop((int)((views.get("lblline3").vw.getTop() + views.get("lblline3").vw.getHeight())+(1d / 100 * height)));
//BA.debugLineNum = 205;BA.debugLine="lblStatus.Width = lblTittle3.Width"[AddAllocateLy/General script]
views.get("lblstatus").vw.setWidth((int)((views.get("lbltittle3").vw.getWidth())));
//BA.debugLineNum = 206;BA.debugLine="lblStatus.Height = lblTittle3.Height"[AddAllocateLy/General script]
views.get("lblstatus").vw.setHeight((int)((views.get("lbltittle3").vw.getHeight())));
//BA.debugLineNum = 207;BA.debugLine="lblStatus.Left = lblTittle3.Left"[AddAllocateLy/General script]
views.get("lblstatus").vw.setLeft((int)((views.get("lbltittle3").vw.getLeft())));
//BA.debugLineNum = 208;BA.debugLine="lblStatus.Top = imgStatus.Bottom +2%y"[AddAllocateLy/General script]
views.get("lblstatus").vw.setTop((int)((views.get("imgstatus").vw.getTop() + views.get("imgstatus").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 210;BA.debugLine="btnClose.Width = 70%x"[AddAllocateLy/General script]
views.get("btnclose").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 211;BA.debugLine="btnClose.Height = 50dip"[AddAllocateLy/General script]
views.get("btnclose").vw.setHeight((int)((50d * scale)));
//BA.debugLineNum = 212;BA.debugLine="btnClose.HorizontalCenter = lblTittle3.HorizontalCenter"[AddAllocateLy/General script]
views.get("btnclose").vw.setLeft((int)((views.get("lbltittle3").vw.getLeft() + views.get("lbltittle3").vw.getWidth()/2) - (views.get("btnclose").vw.getWidth() / 2)));
//BA.debugLineNum = 213;BA.debugLine="btnClose.Top = lblStatus.Bottom +10%y"[AddAllocateLy/General script]
views.get("btnclose").vw.setTop((int)((views.get("lblstatus").vw.getTop() + views.get("lblstatus").vw.getHeight())+(10d / 100 * height)));

}
}