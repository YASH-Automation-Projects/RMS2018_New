package com.yash.RMS.Testcase.Dashboard;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.TestAction.Dashboard.TestAction_ReleaseNotes;
import com.yash.RMS.TestAction.SEPG.Action_SEPGActivity_PageValidation;

public class Testcase_ReleaseNotes {
	@Test
	public static void ReleaseNote_Navigation() throws Throwable{
		try
		{
			Report.TableEnd();
			Report.Report_section_Name("Release Notes");
			Report.ReporterOutputHeader();
			/*FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("");*/

			Thread.sleep(2000);
			TestAction_ReleaseNotes.ReleaseNotesNavigation();
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

