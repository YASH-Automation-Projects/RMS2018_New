package com.yash.RMS.TestAction.Dashboard;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Dashboard.PageObjects_Help;
import com.yash.RMS.POM.Dashboard.PageObjects_ReleaseNotes;

public class TestAction_Help {
	
	public static void HelpNavigation() throws Throwable {
		try{
			
			Thread.sleep(2000);
			if (PageObjects_Help.link_Dashboard(Constant.driver).isDisplayed()){
			//	PageObjects_ReleaseNotes.link_Dashboard(Constant.driver).click();
				Thread.sleep(4000);
				Report.ReporterOutput("STEP","Dashboard is display "," Dashboard Link"," Dashboard  Link display","Dashboard Link displayed successfully.","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Dashboard is display "," Dashboard Link","Dashboard  Link display ","Dashboard Link  is not displayed.","Fail",null);
			}
			Thread.sleep(3000);
			if (PageObjects_Help.link_Help(Constant.driver).isDisplayed()) {
				PageObjects_Help.link_Help(Constant.driver).click();
				
				Report.ReporterOutput("STEP","Verify Help link is display "," Help ","Click on Help Link","Help link displayed and clicked.","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Help link is display "," Help ","Click on Help Link","Help Link not displayed","Fail",null);
			}
			//Verify Text  SPEG Phases on the page
			Thread.sleep(4000);
		//	WebDriver driver = new FirefoxDriver();
			Constant.driver.switchTo().frame(0);
	//		driver.switchTo.frame("fancybox-frame1496738844773");
			String Page_help = PageObjects_Help.text_RMSGuide(Constant.driver).getText();
			if (Page_help.equalsIgnoreCase("RMS Guide")) {
				Report.ReporterOutput("STEP","Verify Text RMS Guide is Visible ","Text RMS Guide"," Click on Text RMS Guide "," Text RMS Guide is Displayed successfully.","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify Text RMS Guide is Visible  ","Text RMS Guide"," Click on Text RMS Guide "," Text RMS Guide is not visible","Fail",null);
			}
			Thread.sleep(3000);
			String link_GuideforRole_BG_Admin = PageObjects_Help.lnk_GuideforRole_BG_Admin(Constant.driver).getText();
			if (link_GuideforRole_BG_Admin.equalsIgnoreCase("Guide for Role_BG_Admin")) {
				Report.ReporterOutput("STEP","Verify link Guide for Role_BG_Admin is Visible ","link Guide for Role_BG_Admin"," GuideforRole_BG_Admin link should display"," link Guide for Role_BG_Admin is visibled successfully.","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify link Guidef or Role_BG_Admin is Visible  ","link Guide for Role_BG_Admin"," GuideforRole_BG_Admin link should display "," link Guide for Role_BG_Admin is not visibled.","Fail",null);
			}
			Thread.sleep(3000);
			String link_GuideforRole_Del_Manager = PageObjects_Help.lnk_GuideforRole_Del_Manager(Constant.driver).getText();
			if (link_GuideforRole_Del_Manager.equalsIgnoreCase("Guide for Role_Del_Manager")) {
				Report.ReporterOutput("STEP","Verify link Guide for Role_Del_Manager is Visible ","link Guide for Role_Del_Manager"," Click on link GuideforRole_Del_Manager "," link Guide for Role_Del_Manager is visibled successfully.","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify link Guide for Role_Del_Manager is Visible  ","link Guide for Role_Del_Manager"," Click on link GuideforRole_Del_Manager "," link Guide for Role_Del_Manager is not visible","Fail",null);
			}
			Thread.sleep(3000);
			String link_GuideforRole_Manager = PageObjects_Help.lnk_GuideforRole_Manager(Constant.driver).getText();
			if (link_GuideforRole_Manager.equalsIgnoreCase("Guide for Role_Manager")) {
				Report.ReporterOutput("STEP","Verify link Guide for Role_Manager is Visible "," link Guide for Role_Manager"," link Guide for Role_Manager should display "," link Guide for Role_Manager is visibled successfully.","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify link Guide for Role_Manager is Visible  "," link Guide for Role_Manager"," link Guide for Role_Manager should display "," link Guide for Role_Manager is not visible","Fail",null);
			}
			Thread.sleep(3000);
		
			String link_GuideforRole_User = PageObjects_Help.lnk_GuideforRole_User(Constant.driver).getText();
			if (link_GuideforRole_User.equalsIgnoreCase("Guide for Role_User")) {
				Report.ReporterOutput("STEP","Verify link Guide for Role_User is Visible "," link Guide for Role_User"," link Guide for Role_User should display "," link Guide for Role_User is visibled successfully.","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify link Guide for Role_User is Visible  "," link Guide for Role_User"," link Guide for Role_User should display "," link Guide for Role_User is not visibled","Fail",null);
			}
			Thread.sleep(3000);
			Constant.driver.switchTo().defaultContent(); 
			if (PageObjects_Help.close_Help(Constant.driver).isDisplayed()) {
				PageObjects_Help.close_Help(Constant.driver).click();
				//Thread.sleep(2000);
				Report.ReporterOutput("STEP","Verify close Help "," Close Help ","Click on close Help icon","Closed Help successfully","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify close Help  "," Close Help","Click on close Help icon","Not Closed Help successfully","Fail",null);
			}
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
