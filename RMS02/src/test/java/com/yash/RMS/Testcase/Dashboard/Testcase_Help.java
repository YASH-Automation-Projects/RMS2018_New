package com.yash.RMS.Testcase.Dashboard;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.TestAction.Dashboard.TestAction_Help;
import com.yash.RMS.TestAction.Dashboard.TestAction_ReleaseNotes;

public class Testcase_Help {
	
	@Test
	public static void Help_Navigation() throws Throwable{
		try
		{
			Report.TableEnd();
			Report.Report_section_Name("Help");
			Report.ReporterOutputHeader();
			
			Thread.sleep(2000);
			TestAction_Help.HelpNavigation();
			Thread.sleep(2000);

		}catch(Exception e){
			e.printStackTrace();
		}
		try
		{
			if(Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).isDisplayed());                                    

			{              
				Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).click();
				//  Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is navigated to RMS      Home page","Pass",null);
			}
		}
		catch(Exception e8)
		{
			System.out.println( e8.getMessage());

		}

	}

}
