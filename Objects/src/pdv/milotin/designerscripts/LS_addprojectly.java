package pdv.milotin.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_addprojectly{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[AddProjectLy/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="lblTop.Width = 100%x"[AddProjectLy/General script]
views.get("lbltop").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 5;BA.debugLine="lblTop.Height = 60dip"[AddProjectLy/General script]
views.get("lbltop").vw.setHeight((int)((60d * scale)));
//BA.debugLineNum = 6;BA.debugLine="lblTop.Left = 0%x"[AddProjectLy/General script]
views.get("lbltop").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 7;BA.debugLine="lblTop.Top = 0%y"[AddProjectLy/General script]
views.get("lbltop").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 9;BA.debugLine="imgBack.Width = 30dip"[AddProjectLy/General script]
views.get("imgback").vw.setWidth((int)((30d * scale)));
//BA.debugLineNum = 10;BA.debugLine="imgBack.Height = 30dip"[AddProjectLy/General script]
views.get("imgback").vw.setHeight((int)((30d * scale)));
//BA.debugLineNum = 11;BA.debugLine="imgBack.Left = 3%x"[AddProjectLy/General script]
views.get("imgback").vw.setLeft((int)((3d / 100 * width)));
//BA.debugLineNum = 12;BA.debugLine="imgBack.VerticalCenter = lblTop.VerticalCenter"[AddProjectLy/General script]
views.get("imgback").vw.setTop((int)((views.get("lbltop").vw.getTop() + views.get("lbltop").vw.getHeight()/2) - (views.get("imgback").vw.getHeight() / 2)));
//BA.debugLineNum = 14;BA.debugLine="pnHeader1.Width = 100%x"[AddProjectLy/General script]
views.get("pnheader1").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 15;BA.debugLine="pnHeader1.Height = 250dip"[AddProjectLy/General script]
views.get("pnheader1").vw.setHeight((int)((250d * scale)));
//BA.debugLineNum = 16;BA.debugLine="pnHeader1.Left = 0%x"[AddProjectLy/General script]
views.get("pnheader1").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 17;BA.debugLine="pnHeader1.Top = 0%y"[AddProjectLy/General script]
views.get("pnheader1").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 19;BA.debugLine="pnFrame2.Width = 90%x"[AddProjectLy/General script]
views.get("pnframe2").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 20;BA.debugLine="pnFrame2.Height = 71%y"[AddProjectLy/General script]
views.get("pnframe2").vw.setHeight((int)((71d / 100 * height)));
//BA.debugLineNum = 21;BA.debugLine="pnFrame2.HorizontalCenter = 50%x"[AddProjectLy/General script]
views.get("pnframe2").vw.setLeft((int)((50d / 100 * width) - (views.get("pnframe2").vw.getWidth() / 2)));
//BA.debugLineNum = 22;BA.debugLine="pnFrame2.Top = pnHeader1.VerticalCenter"[AddProjectLy/General script]
views.get("pnframe2").vw.setTop((int)((views.get("pnheader1").vw.getTop() + views.get("pnheader1").vw.getHeight()/2)));
//BA.debugLineNum = 24;BA.debugLine="lblAddTitle.Width = 80%x"[AddProjectLy/General script]
views.get("lbladdtitle").vw.setWidth((int)((80d / 100 * width)));
//BA.debugLineNum = 25;BA.debugLine="lblAddTitle.Height = 40dip"[AddProjectLy/General script]
views.get("lbladdtitle").vw.setHeight((int)((40d * scale)));
//BA.debugLineNum = 26;BA.debugLine="lblAddTitle.HorizontalCenter = 50%x"[AddProjectLy/General script]
views.get("lbladdtitle").vw.setLeft((int)((50d / 100 * width) - (views.get("lbladdtitle").vw.getWidth() / 2)));
//BA.debugLineNum = 27;BA.debugLine="lblAddTitle.Top = pnFrame2.Top +1%y"[AddProjectLy/General script]
views.get("lbladdtitle").vw.setTop((int)((views.get("pnframe2").vw.getTop())+(1d / 100 * height)));
//BA.debugLineNum = 29;BA.debugLine="lblLine4.Width = 90%x"[AddProjectLy/General script]
views.get("lblline4").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 30;BA.debugLine="lblLine4.Height = 20dip"[AddProjectLy/General script]
views.get("lblline4").vw.setHeight((int)((20d * scale)));
//BA.debugLineNum = 31;BA.debugLine="lblLine4.HorizontalCenter = 50%x"[AddProjectLy/General script]
views.get("lblline4").vw.setLeft((int)((50d / 100 * width) - (views.get("lblline4").vw.getWidth() / 2)));
//BA.debugLineNum = 32;BA.debugLine="lblLine4.Top = lblAddTitle.Bottom"[AddProjectLy/General script]
views.get("lblline4").vw.setTop((int)((views.get("lbladdtitle").vw.getTop() + views.get("lbladdtitle").vw.getHeight())));
//BA.debugLineNum = 34;BA.debugLine="lblProjectName.Width = 70%x"[AddProjectLy/General script]
views.get("lblprojectname").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 35;BA.debugLine="lblProjectName.Height = 40dip"[AddProjectLy/General script]
views.get("lblprojectname").vw.setHeight((int)((40d * scale)));
//BA.debugLineNum = 36;BA.debugLine="lblProjectName.HorizontalCenter = 50%x"[AddProjectLy/General script]
views.get("lblprojectname").vw.setLeft((int)((50d / 100 * width) - (views.get("lblprojectname").vw.getWidth() / 2)));
//BA.debugLineNum = 37;BA.debugLine="lblProjectName.Top = lblLine4.Bottom"[AddProjectLy/General script]
views.get("lblprojectname").vw.setTop((int)((views.get("lblline4").vw.getTop() + views.get("lblline4").vw.getHeight())));
//BA.debugLineNum = 39;BA.debugLine="pnProjectName.Width = 70%x"[AddProjectLy/General script]
views.get("pnprojectname").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 40;BA.debugLine="pnProjectName.Height = 50dip"[AddProjectLy/General script]
views.get("pnprojectname").vw.setHeight((int)((50d * scale)));
//BA.debugLineNum = 41;BA.debugLine="pnProjectName.HorizontalCenter = 50%x"[AddProjectLy/General script]
views.get("pnprojectname").vw.setLeft((int)((50d / 100 * width) - (views.get("pnprojectname").vw.getWidth() / 2)));
//BA.debugLineNum = 42;BA.debugLine="pnProjectName.Top = lblProjectName.Bottom"[AddProjectLy/General script]
views.get("pnprojectname").vw.setTop((int)((views.get("lblprojectname").vw.getTop() + views.get("lblprojectname").vw.getHeight())));
//BA.debugLineNum = 43;BA.debugLine="txtProjectName.Width = 50%x"[AddProjectLy/General script]
views.get("txtprojectname").vw.setWidth((int)((50d / 100 * width)));
//BA.debugLineNum = 44;BA.debugLine="txtProjectName.Left = imgProjectName.Right +2%x"[AddProjectLy/General script]
views.get("txtprojectname").vw.setLeft((int)((views.get("imgprojectname").vw.getLeft() + views.get("imgprojectname").vw.getWidth())+(2d / 100 * width)));
//BA.debugLineNum = 45;BA.debugLine="imgProjectName.Height = 20dip"[AddProjectLy/General script]
views.get("imgprojectname").vw.setHeight((int)((20d * scale)));
//BA.debugLineNum = 46;BA.debugLine="imgProjectName.Width = imgProjectName.Height"[AddProjectLy/General script]
views.get("imgprojectname").vw.setWidth((int)((views.get("imgprojectname").vw.getHeight())));
//BA.debugLineNum = 47;BA.debugLine="imgProjectName.Top = pnProjectName.Height/2 - imgProjectName.Height/2"[AddProjectLy/General script]
views.get("imgprojectname").vw.setTop((int)((views.get("pnprojectname").vw.getHeight())/2d-(views.get("imgprojectname").vw.getHeight())/2d));
//BA.debugLineNum = 49;BA.debugLine="lblFundAmount.Width = lblProjectName.Width"[AddProjectLy/General script]
views.get("lblfundamount").vw.setWidth((int)((views.get("lblprojectname").vw.getWidth())));
//BA.debugLineNum = 50;BA.debugLine="lblFundAmount.Height = lblProjectName.Height"[AddProjectLy/General script]
views.get("lblfundamount").vw.setHeight((int)((views.get("lblprojectname").vw.getHeight())));
//BA.debugLineNum = 51;BA.debugLine="lblFundAmount.Left = lblProjectName.Left"[AddProjectLy/General script]
views.get("lblfundamount").vw.setLeft((int)((views.get("lblprojectname").vw.getLeft())));
//BA.debugLineNum = 52;BA.debugLine="lblFundAmount.Top = pnProjectName.Bottom"[AddProjectLy/General script]
views.get("lblfundamount").vw.setTop((int)((views.get("pnprojectname").vw.getTop() + views.get("pnprojectname").vw.getHeight())));
//BA.debugLineNum = 54;BA.debugLine="pnSetFundAmount.Width = pnProjectName.Width"[AddProjectLy/General script]
views.get("pnsetfundamount").vw.setWidth((int)((views.get("pnprojectname").vw.getWidth())));
//BA.debugLineNum = 55;BA.debugLine="pnSetFundAmount.Height = pnProjectName.Height"[AddProjectLy/General script]
views.get("pnsetfundamount").vw.setHeight((int)((views.get("pnprojectname").vw.getHeight())));
//BA.debugLineNum = 56;BA.debugLine="pnSetFundAmount.Left = pnProjectName.Left"[AddProjectLy/General script]
views.get("pnsetfundamount").vw.setLeft((int)((views.get("pnprojectname").vw.getLeft())));
//BA.debugLineNum = 57;BA.debugLine="pnSetFundAmount.Top = lblFundAmount.Bottom"[AddProjectLy/General script]
views.get("pnsetfundamount").vw.setTop((int)((views.get("lblfundamount").vw.getTop() + views.get("lblfundamount").vw.getHeight())));
//BA.debugLineNum = 58;BA.debugLine="txtSetFundAmount.Width = txtProjectName.Width"[AddProjectLy/General script]
views.get("txtsetfundamount").vw.setWidth((int)((views.get("txtprojectname").vw.getWidth())));
//BA.debugLineNum = 59;BA.debugLine="txtSetFundAmount.Left = txtProjectName.Left"[AddProjectLy/General script]
views.get("txtsetfundamount").vw.setLeft((int)((views.get("txtprojectname").vw.getLeft())));
//BA.debugLineNum = 60;BA.debugLine="imgSetFundAmount.Height = imgProjectName.Width"[AddProjectLy/General script]
views.get("imgsetfundamount").vw.setHeight((int)((views.get("imgprojectname").vw.getWidth())));
//BA.debugLineNum = 61;BA.debugLine="imgSetFundAmount.Width = imgProjectName.Height"[AddProjectLy/General script]
views.get("imgsetfundamount").vw.setWidth((int)((views.get("imgprojectname").vw.getHeight())));
//BA.debugLineNum = 62;BA.debugLine="imgSetFundAmount.Top = pnSetFundAmount.Height/2 - imgSetFundAmount.Height/2"[AddProjectLy/General script]
views.get("imgsetfundamount").vw.setTop((int)((views.get("pnsetfundamount").vw.getHeight())/2d-(views.get("imgsetfundamount").vw.getHeight())/2d));
//BA.debugLineNum = 64;BA.debugLine="lblContent.Width = lblProjectName.Width"[AddProjectLy/General script]
views.get("lblcontent").vw.setWidth((int)((views.get("lblprojectname").vw.getWidth())));
//BA.debugLineNum = 65;BA.debugLine="lblContent.Height = lblProjectName.Height"[AddProjectLy/General script]
views.get("lblcontent").vw.setHeight((int)((views.get("lblprojectname").vw.getHeight())));
//BA.debugLineNum = 66;BA.debugLine="lblContent.Left = lblProjectName.Left"[AddProjectLy/General script]
views.get("lblcontent").vw.setLeft((int)((views.get("lblprojectname").vw.getLeft())));
//BA.debugLineNum = 67;BA.debugLine="lblContent.Top = pnSetFundAmount.Bottom"[AddProjectLy/General script]
views.get("lblcontent").vw.setTop((int)((views.get("pnsetfundamount").vw.getTop() + views.get("pnsetfundamount").vw.getHeight())));
//BA.debugLineNum = 69;BA.debugLine="pnContent.Width = pnProjectName.Width"[AddProjectLy/General script]
views.get("pncontent").vw.setWidth((int)((views.get("pnprojectname").vw.getWidth())));
//BA.debugLineNum = 70;BA.debugLine="pnContent.Height = pnProjectName.Height"[AddProjectLy/General script]
views.get("pncontent").vw.setHeight((int)((views.get("pnprojectname").vw.getHeight())));
//BA.debugLineNum = 71;BA.debugLine="pnContent.Left = pnProjectName.Left"[AddProjectLy/General script]
views.get("pncontent").vw.setLeft((int)((views.get("pnprojectname").vw.getLeft())));
//BA.debugLineNum = 72;BA.debugLine="pnContent.Top = lblContent.Bottom"[AddProjectLy/General script]
views.get("pncontent").vw.setTop((int)((views.get("lblcontent").vw.getTop() + views.get("lblcontent").vw.getHeight())));
//BA.debugLineNum = 73;BA.debugLine="txtContent.Width = txtProjectName.Width"[AddProjectLy/General script]
views.get("txtcontent").vw.setWidth((int)((views.get("txtprojectname").vw.getWidth())));
//BA.debugLineNum = 74;BA.debugLine="txtContent.Left = txtProjectName.Left"[AddProjectLy/General script]
views.get("txtcontent").vw.setLeft((int)((views.get("txtprojectname").vw.getLeft())));
//BA.debugLineNum = 75;BA.debugLine="imgContent.Height = imgProjectName.Width"[AddProjectLy/General script]
views.get("imgcontent").vw.setHeight((int)((views.get("imgprojectname").vw.getWidth())));
//BA.debugLineNum = 76;BA.debugLine="imgContent.Width = imgProjectName.Height"[AddProjectLy/General script]
views.get("imgcontent").vw.setWidth((int)((views.get("imgprojectname").vw.getHeight())));
//BA.debugLineNum = 77;BA.debugLine="imgContent.Top = pnContent.Height/2 - imgContent.Height/2"[AddProjectLy/General script]
views.get("imgcontent").vw.setTop((int)((views.get("pncontent").vw.getHeight())/2d-(views.get("imgcontent").vw.getHeight())/2d));
//BA.debugLineNum = 79;BA.debugLine="lblSetWalletAddress.Width = lblProjectName.Width"[AddProjectLy/General script]
views.get("lblsetwalletaddress").vw.setWidth((int)((views.get("lblprojectname").vw.getWidth())));
//BA.debugLineNum = 80;BA.debugLine="lblSetWalletAddress.Height = lblProjectName.Height"[AddProjectLy/General script]
views.get("lblsetwalletaddress").vw.setHeight((int)((views.get("lblprojectname").vw.getHeight())));
//BA.debugLineNum = 81;BA.debugLine="lblSetWalletAddress.Left = lblProjectName.Left"[AddProjectLy/General script]
views.get("lblsetwalletaddress").vw.setLeft((int)((views.get("lblprojectname").vw.getLeft())));
//BA.debugLineNum = 82;BA.debugLine="lblSetWalletAddress.Top = pnContent.Bottom"[AddProjectLy/General script]
views.get("lblsetwalletaddress").vw.setTop((int)((views.get("pncontent").vw.getTop() + views.get("pncontent").vw.getHeight())));
//BA.debugLineNum = 84;BA.debugLine="pnSetWalletAddress.Width = pnProjectName.Width"[AddProjectLy/General script]
views.get("pnsetwalletaddress").vw.setWidth((int)((views.get("pnprojectname").vw.getWidth())));
//BA.debugLineNum = 85;BA.debugLine="pnSetWalletAddress.Height = pnProjectName.Height"[AddProjectLy/General script]
views.get("pnsetwalletaddress").vw.setHeight((int)((views.get("pnprojectname").vw.getHeight())));
//BA.debugLineNum = 86;BA.debugLine="pnSetWalletAddress.Left = pnProjectName.Left"[AddProjectLy/General script]
views.get("pnsetwalletaddress").vw.setLeft((int)((views.get("pnprojectname").vw.getLeft())));
//BA.debugLineNum = 87;BA.debugLine="pnSetWalletAddress.Top = lblSetWalletAddress.Bottom"[AddProjectLy/General script]
views.get("pnsetwalletaddress").vw.setTop((int)((views.get("lblsetwalletaddress").vw.getTop() + views.get("lblsetwalletaddress").vw.getHeight())));
//BA.debugLineNum = 88;BA.debugLine="txtSetWalletAddress.Width = txtProjectName.Width"[AddProjectLy/General script]
views.get("txtsetwalletaddress").vw.setWidth((int)((views.get("txtprojectname").vw.getWidth())));
//BA.debugLineNum = 89;BA.debugLine="txtSetWalletAddress.Left = txtProjectName.Left"[AddProjectLy/General script]
views.get("txtsetwalletaddress").vw.setLeft((int)((views.get("txtprojectname").vw.getLeft())));
//BA.debugLineNum = 90;BA.debugLine="imgSetWalletAddress.Height = imgProjectName.Width"[AddProjectLy/General script]
views.get("imgsetwalletaddress").vw.setHeight((int)((views.get("imgprojectname").vw.getWidth())));
//BA.debugLineNum = 91;BA.debugLine="imgSetWalletAddress.Width = imgProjectName.Height"[AddProjectLy/General script]
views.get("imgsetwalletaddress").vw.setWidth((int)((views.get("imgprojectname").vw.getHeight())));
//BA.debugLineNum = 92;BA.debugLine="imgSetWalletAddress.Top = pnSetWalletAddress.Height/2 - imgSetWalletAddress.Height/2"[AddProjectLy/General script]
views.get("imgsetwalletaddress").vw.setTop((int)((views.get("pnsetwalletaddress").vw.getHeight())/2d-(views.get("imgsetwalletaddress").vw.getHeight())/2d));
//BA.debugLineNum = 94;BA.debugLine="btnProjectSubmit.Width = 70%x"[AddProjectLy/General script]
views.get("btnprojectsubmit").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 95;BA.debugLine="btnProjectSubmit.Height = 50dip"[AddProjectLy/General script]
views.get("btnprojectsubmit").vw.setHeight((int)((50d * scale)));
//BA.debugLineNum = 96;BA.debugLine="btnProjectSubmit.HorizontalCenter = lblAddTitle.HorizontalCenter"[AddProjectLy/General script]
views.get("btnprojectsubmit").vw.setLeft((int)((views.get("lbladdtitle").vw.getLeft() + views.get("lbladdtitle").vw.getWidth()/2) - (views.get("btnprojectsubmit").vw.getWidth() / 2)));
//BA.debugLineNum = 97;BA.debugLine="btnProjectSubmit.Top = pnSetWalletAddress.Bottom +3%y"[AddProjectLy/General script]
views.get("btnprojectsubmit").vw.setTop((int)((views.get("pnsetwalletaddress").vw.getTop() + views.get("pnsetwalletaddress").vw.getHeight())+(3d / 100 * height)));
//BA.debugLineNum = 99;BA.debugLine="lblBottom.Width = 100%x"[AddProjectLy/General script]
views.get("lblbottom").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 100;BA.debugLine="lblBottom.Height = 80dip"[AddProjectLy/General script]
views.get("lblbottom").vw.setHeight((int)((80d * scale)));
//BA.debugLineNum = 101;BA.debugLine="lblBottom.HorizontalCenter = 50%x"[AddProjectLy/General script]
views.get("lblbottom").vw.setLeft((int)((50d / 100 * width) - (views.get("lblbottom").vw.getWidth() / 2)));
//BA.debugLineNum = 102;BA.debugLine="lblBottom.Bottom = 100%y"[AddProjectLy/General script]
views.get("lblbottom").vw.setTop((int)((100d / 100 * height) - (views.get("lblbottom").vw.getHeight())));
//BA.debugLineNum = 104;BA.debugLine="lblHome2.Width = 25%x"[AddProjectLy/General script]
views.get("lblhome2").vw.setWidth((int)((25d / 100 * width)));
//BA.debugLineNum = 105;BA.debugLine="lblHome2.Height = 20dip"[AddProjectLy/General script]
views.get("lblhome2").vw.setHeight((int)((20d * scale)));
//BA.debugLineNum = 106;BA.debugLine="lblHome2.HorizontalCenter = 12.5%x"[AddProjectLy/General script]
views.get("lblhome2").vw.setLeft((int)((12.5d / 100 * width) - (views.get("lblhome2").vw.getWidth() / 2)));
//BA.debugLineNum = 107;BA.debugLine="lblHome2.Bottom = lblBottom.Bottom -1%y"[AddProjectLy/General script]
views.get("lblhome2").vw.setTop((int)((views.get("lblbottom").vw.getTop() + views.get("lblbottom").vw.getHeight())-(1d / 100 * height) - (views.get("lblhome2").vw.getHeight())));
//BA.debugLineNum = 109;BA.debugLine="lblFund2.Width = lblHome2.Width"[AddProjectLy/General script]
views.get("lblfund2").vw.setWidth((int)((views.get("lblhome2").vw.getWidth())));
//BA.debugLineNum = 110;BA.debugLine="lblFund2.Height = lblHome2.Height"[AddProjectLy/General script]
views.get("lblfund2").vw.setHeight((int)((views.get("lblhome2").vw.getHeight())));
//BA.debugLineNum = 111;BA.debugLine="lblFund2.HorizontalCenter = 37.5%x"[AddProjectLy/General script]
views.get("lblfund2").vw.setLeft((int)((37.5d / 100 * width) - (views.get("lblfund2").vw.getWidth() / 2)));
//BA.debugLineNum = 112;BA.debugLine="lblFund2.Bottom = lblHome2.Bottom"[AddProjectLy/General script]
views.get("lblfund2").vw.setTop((int)((views.get("lblhome2").vw.getTop() + views.get("lblhome2").vw.getHeight()) - (views.get("lblfund2").vw.getHeight())));
//BA.debugLineNum = 114;BA.debugLine="lblHistory2.Width = lblHome2.Width"[AddProjectLy/General script]
views.get("lblhistory2").vw.setWidth((int)((views.get("lblhome2").vw.getWidth())));
//BA.debugLineNum = 115;BA.debugLine="lblHistory2.Height = lblHome2.Height"[AddProjectLy/General script]
views.get("lblhistory2").vw.setHeight((int)((views.get("lblhome2").vw.getHeight())));
//BA.debugLineNum = 116;BA.debugLine="lblHistory2.HorizontalCenter = 62.5%x"[AddProjectLy/General script]
views.get("lblhistory2").vw.setLeft((int)((62.5d / 100 * width) - (views.get("lblhistory2").vw.getWidth() / 2)));
//BA.debugLineNum = 117;BA.debugLine="lblHistory2.Bottom = lblHome2.Bottom"[AddProjectLy/General script]
views.get("lblhistory2").vw.setTop((int)((views.get("lblhome2").vw.getTop() + views.get("lblhome2").vw.getHeight()) - (views.get("lblhistory2").vw.getHeight())));
//BA.debugLineNum = 119;BA.debugLine="lblUser2.Width = lblHome2.Width"[AddProjectLy/General script]
views.get("lbluser2").vw.setWidth((int)((views.get("lblhome2").vw.getWidth())));
//BA.debugLineNum = 120;BA.debugLine="lblUser2.Height = lblHome2.Height"[AddProjectLy/General script]
views.get("lbluser2").vw.setHeight((int)((views.get("lblhome2").vw.getHeight())));
//BA.debugLineNum = 121;BA.debugLine="lblUser2.HorizontalCenter = 87.5%x"[AddProjectLy/General script]
views.get("lbluser2").vw.setLeft((int)((87.5d / 100 * width) - (views.get("lbluser2").vw.getWidth() / 2)));
//BA.debugLineNum = 122;BA.debugLine="lblUser2.Bottom = lblHome2.Bottom"[AddProjectLy/General script]
views.get("lbluser2").vw.setTop((int)((views.get("lblhome2").vw.getTop() + views.get("lblhome2").vw.getHeight()) - (views.get("lbluser2").vw.getHeight())));
//BA.debugLineNum = 124;BA.debugLine="lblHome.Width = 25dip"[AddProjectLy/General script]
views.get("lblhome").vw.setWidth((int)((25d * scale)));
//BA.debugLineNum = 125;BA.debugLine="lblHome.Height = 25dip"[AddProjectLy/General script]
views.get("lblhome").vw.setHeight((int)((25d * scale)));
//BA.debugLineNum = 126;BA.debugLine="lblHome.HorizontalCenter = 12.5%x"[AddProjectLy/General script]
views.get("lblhome").vw.setLeft((int)((12.5d / 100 * width) - (views.get("lblhome").vw.getWidth() / 2)));
//BA.debugLineNum = 127;BA.debugLine="lblHome.Bottom = lblHome2.Top -1%y"[AddProjectLy/General script]
views.get("lblhome").vw.setTop((int)((views.get("lblhome2").vw.getTop())-(1d / 100 * height) - (views.get("lblhome").vw.getHeight())));
//BA.debugLineNum = 129;BA.debugLine="lblFund.Width = lblHome.Width"[AddProjectLy/General script]
views.get("lblfund").vw.setWidth((int)((views.get("lblhome").vw.getWidth())));
//BA.debugLineNum = 130;BA.debugLine="lblFund.Height = lblHome.Height"[AddProjectLy/General script]
views.get("lblfund").vw.setHeight((int)((views.get("lblhome").vw.getHeight())));
//BA.debugLineNum = 131;BA.debugLine="lblFund.HorizontalCenter = 37.5%x"[AddProjectLy/General script]
views.get("lblfund").vw.setLeft((int)((37.5d / 100 * width) - (views.get("lblfund").vw.getWidth() / 2)));
//BA.debugLineNum = 132;BA.debugLine="lblFund.Bottom = lblHome.Bottom"[AddProjectLy/General script]
views.get("lblfund").vw.setTop((int)((views.get("lblhome").vw.getTop() + views.get("lblhome").vw.getHeight()) - (views.get("lblfund").vw.getHeight())));
//BA.debugLineNum = 134;BA.debugLine="lblHistory.Width = lblHome.Width"[AddProjectLy/General script]
views.get("lblhistory").vw.setWidth((int)((views.get("lblhome").vw.getWidth())));
//BA.debugLineNum = 135;BA.debugLine="lblHistory.Height = lblHome.Height"[AddProjectLy/General script]
views.get("lblhistory").vw.setHeight((int)((views.get("lblhome").vw.getHeight())));
//BA.debugLineNum = 136;BA.debugLine="lblHistory.HorizontalCenter = 62.5%x"[AddProjectLy/General script]
views.get("lblhistory").vw.setLeft((int)((62.5d / 100 * width) - (views.get("lblhistory").vw.getWidth() / 2)));
//BA.debugLineNum = 137;BA.debugLine="lblHistory.Bottom = lblHome.Bottom"[AddProjectLy/General script]
views.get("lblhistory").vw.setTop((int)((views.get("lblhome").vw.getTop() + views.get("lblhome").vw.getHeight()) - (views.get("lblhistory").vw.getHeight())));
//BA.debugLineNum = 139;BA.debugLine="lblUser.Width = lblHome.Width"[AddProjectLy/General script]
views.get("lbluser").vw.setWidth((int)((views.get("lblhome").vw.getWidth())));
//BA.debugLineNum = 140;BA.debugLine="lblUser.Height = lblHome.Height"[AddProjectLy/General script]
views.get("lbluser").vw.setHeight((int)((views.get("lblhome").vw.getHeight())));
//BA.debugLineNum = 141;BA.debugLine="lblUser.HorizontalCenter = 87.5%x"[AddProjectLy/General script]
views.get("lbluser").vw.setLeft((int)((87.5d / 100 * width) - (views.get("lbluser").vw.getWidth() / 2)));
//BA.debugLineNum = 142;BA.debugLine="lblUser.Bottom = lblHome.Bottom"[AddProjectLy/General script]
views.get("lbluser").vw.setTop((int)((views.get("lblhome").vw.getTop() + views.get("lblhome").vw.getHeight()) - (views.get("lbluser").vw.getHeight())));
//BA.debugLineNum = 146;BA.debugLine="pnBlackTransparent.Width = 100%x"[AddProjectLy/General script]
views.get("pnblacktransparent").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 147;BA.debugLine="pnBlackTransparent.Height = 100%y"[AddProjectLy/General script]
views.get("pnblacktransparent").vw.setHeight((int)((100d / 100 * height)));
//BA.debugLineNum = 148;BA.debugLine="pnBlackTransparent.Left = 0%x"[AddProjectLy/General script]
views.get("pnblacktransparent").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 149;BA.debugLine="pnBlackTransparent.Top = 0%y"[AddProjectLy/General script]
views.get("pnblacktransparent").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 151;BA.debugLine="pnStatus.Width = 90%x"[AddProjectLy/General script]
views.get("pnstatus").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 152;BA.debugLine="pnStatus.Height = 50%y"[AddProjectLy/General script]
views.get("pnstatus").vw.setHeight((int)((50d / 100 * height)));
//BA.debugLineNum = 153;BA.debugLine="pnStatus.HorizontalCenter = 50%x"[AddProjectLy/General script]
views.get("pnstatus").vw.setLeft((int)((50d / 100 * width) - (views.get("pnstatus").vw.getWidth() / 2)));
//BA.debugLineNum = 154;BA.debugLine="pnStatus.VerticalCenter = 50%y"[AddProjectLy/General script]
views.get("pnstatus").vw.setTop((int)((50d / 100 * height) - (views.get("pnstatus").vw.getHeight() / 2)));
//BA.debugLineNum = 156;BA.debugLine="lblTittle3.Width = 80%x"[AddProjectLy/General script]
views.get("lbltittle3").vw.setWidth((int)((80d / 100 * width)));
//BA.debugLineNum = 157;BA.debugLine="lblTittle3.Height = 40dip"[AddProjectLy/General script]
views.get("lbltittle3").vw.setHeight((int)((40d * scale)));
//BA.debugLineNum = 158;BA.debugLine="lblTittle3.Left = 5%x"[AddProjectLy/General script]
views.get("lbltittle3").vw.setLeft((int)((5d / 100 * width)));
//BA.debugLineNum = 159;BA.debugLine="lblTittle3.Top = 1%y"[AddProjectLy/General script]
views.get("lbltittle3").vw.setTop((int)((1d / 100 * height)));
//BA.debugLineNum = 161;BA.debugLine="imgClose2.Width = 25dip"[AddProjectLy/General script]
views.get("imgclose2").vw.setWidth((int)((25d * scale)));
//BA.debugLineNum = 162;BA.debugLine="imgClose2.Height = imgClose2.Width"[AddProjectLy/General script]
views.get("imgclose2").vw.setHeight((int)((views.get("imgclose2").vw.getWidth())));
//BA.debugLineNum = 163;BA.debugLine="imgClose2.Right = lblTittle3.Right"[AddProjectLy/General script]
views.get("imgclose2").vw.setLeft((int)((views.get("lbltittle3").vw.getLeft() + views.get("lbltittle3").vw.getWidth()) - (views.get("imgclose2").vw.getWidth())));
//BA.debugLineNum = 164;BA.debugLine="imgClose2.VerticalCenter = lblTittle3.VerticalCenter"[AddProjectLy/General script]
views.get("imgclose2").vw.setTop((int)((views.get("lbltittle3").vw.getTop() + views.get("lbltittle3").vw.getHeight()/2) - (views.get("imgclose2").vw.getHeight() / 2)));
//BA.debugLineNum = 166;BA.debugLine="lblLine3.Width = 90%x"[AddProjectLy/General script]
views.get("lblline3").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 167;BA.debugLine="lblLine3.Height = 20dip"[AddProjectLy/General script]
views.get("lblline3").vw.setHeight((int)((20d * scale)));
//BA.debugLineNum = 168;BA.debugLine="lblLine3.Left = 0%x"[AddProjectLy/General script]
views.get("lblline3").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 169;BA.debugLine="lblLine3.Top = lblTittle3.Bottom"[AddProjectLy/General script]
views.get("lblline3").vw.setTop((int)((views.get("lbltittle3").vw.getTop() + views.get("lbltittle3").vw.getHeight())));
//BA.debugLineNum = 171;BA.debugLine="imgStatus.Width = 80dip"[AddProjectLy/General script]
views.get("imgstatus").vw.setWidth((int)((80d * scale)));
//BA.debugLineNum = 172;BA.debugLine="imgStatus.Height = 80dip"[AddProjectLy/General script]
views.get("imgstatus").vw.setHeight((int)((80d * scale)));
//BA.debugLineNum = 173;BA.debugLine="imgStatus.HorizontalCenter = lblTittle3.HorizontalCenter"[AddProjectLy/General script]
views.get("imgstatus").vw.setLeft((int)((views.get("lbltittle3").vw.getLeft() + views.get("lbltittle3").vw.getWidth()/2) - (views.get("imgstatus").vw.getWidth() / 2)));
//BA.debugLineNum = 174;BA.debugLine="imgStatus.Top = lblLine3.Bottom +1%y"[AddProjectLy/General script]
views.get("imgstatus").vw.setTop((int)((views.get("lblline3").vw.getTop() + views.get("lblline3").vw.getHeight())+(1d / 100 * height)));
//BA.debugLineNum = 176;BA.debugLine="lblStatus.Width = lblTittle3.Width"[AddProjectLy/General script]
views.get("lblstatus").vw.setWidth((int)((views.get("lbltittle3").vw.getWidth())));
//BA.debugLineNum = 177;BA.debugLine="lblStatus.Height = lblTittle3.Height"[AddProjectLy/General script]
views.get("lblstatus").vw.setHeight((int)((views.get("lbltittle3").vw.getHeight())));
//BA.debugLineNum = 178;BA.debugLine="lblStatus.Left = lblTittle3.Left"[AddProjectLy/General script]
views.get("lblstatus").vw.setLeft((int)((views.get("lbltittle3").vw.getLeft())));
//BA.debugLineNum = 179;BA.debugLine="lblStatus.Top = imgStatus.Bottom +2%y"[AddProjectLy/General script]
views.get("lblstatus").vw.setTop((int)((views.get("imgstatus").vw.getTop() + views.get("imgstatus").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 181;BA.debugLine="btnClose.Width = 70%x"[AddProjectLy/General script]
views.get("btnclose").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 182;BA.debugLine="btnClose.Height = 50dip"[AddProjectLy/General script]
views.get("btnclose").vw.setHeight((int)((50d * scale)));
//BA.debugLineNum = 183;BA.debugLine="btnClose.HorizontalCenter = lblTittle3.HorizontalCenter"[AddProjectLy/General script]
views.get("btnclose").vw.setLeft((int)((views.get("lbltittle3").vw.getLeft() + views.get("lbltittle3").vw.getWidth()/2) - (views.get("btnclose").vw.getWidth() / 2)));
//BA.debugLineNum = 184;BA.debugLine="btnClose.Top = lblStatus.Bottom +10%y"[AddProjectLy/General script]
views.get("btnclose").vw.setTop((int)((views.get("lblstatus").vw.getTop() + views.get("lblstatus").vw.getHeight())+(10d / 100 * height)));

}
}