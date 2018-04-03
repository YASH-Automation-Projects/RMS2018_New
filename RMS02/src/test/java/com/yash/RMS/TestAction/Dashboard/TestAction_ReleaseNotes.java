package com.yash.RMS.TestAction.Dashboard;

import org.openqa.selenium.WebDriver;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Dashboard.PageObjects_ReleaseNotes;

public class TestAction_ReleaseNotes {
	
	public static void ReleaseNotesNavigation() throws Throwable {
		try{
			
			Thread.sleep(2000);
			if (PageObjects_ReleaseNotes.link_Dashboard(Constant.driver).isDisplayed()){
			//	PageObjects_ReleaseNotes.link_Dashboard(Constant.driver).click();
				Thread.sleep(4000);
				Report.ReporterOutput("STEP","Dashboard is displayed. "," Dashboard Link"," Dashboard  Link display","Dashboard Link displayed successfully.","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Dashboard is displayed. "," Dashboard Link","Dashboard  Link display ","Dashboard Link  is not displayed.","Fail",null);
			}
			Thread.sleep(3000);
			if (PageObjects_ReleaseNotes.link_ReleaseNotes(Constant.driver).isDisplayed()) {
				PageObjects_ReleaseNotes.link_ReleaseNotes(Constant.driver).click();
				
				Report.ReporterOutput("STEP","Verify Release Notes link is displayed. "," Release Notes ","Click on Release Notes Link","Release Notes link displayed and clicked.","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Release Notes link is displayed. "," Release Notes ","Click on Release Notes Link","Release Notes Link not displayed.","Fail",null);
			}
			//Verify Text  SPEG Phases on the page
			Thread.sleep(4000);
		//	WebDriver driver = new FirefoxDriver();
			Constant.driver.switchTo().frame(0);
	//		driver.switchTo.frame("fancybox-frame1496738844773");
			String Page_ReleaseNote = PageObjects_ReleaseNotes.text_ReleaseNote(Constant.driver).getText();
			if (Page_ReleaseNote.equalsIgnoreCase("Release Notes")) {
				Report.ReporterOutput("STEP","Verify Text Release Notes is Visible. ","Text Release Notes"," Click on Text Release Notes "," Text Release Notes is visibled.","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify Text Release Notes is Visible.  ","Text Release Notes"," Click on Text Release Notes "," Text Release Notes is not visible.","Fail",null);
			}
			Thread.sleep(3000);
			Constant.driver.switchTo().defaultContent(); 
			if (PageObjects_ReleaseNotes.close_ReleaseNoteicon(Constant.driver).isDisplayed()) {
				PageObjects_ReleaseNotes.close_ReleaseNoteicon(Constant.driver).click();
				//Thread.sleep(2000);
				Report.ReporterOutput("STEP","Verify close Release Notes. "," Close Release Note ","Click on close Release Notes icon","Close Release Notes successfully.","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify close Release Notes.  "," Close Release Note","Click on close Release Notes icon","Not Close Release Notes successfully.","Fail",null);
			}
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
