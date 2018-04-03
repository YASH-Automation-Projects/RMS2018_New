package com.yash.RMS.Testcase.Configurations;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.TestAction.Configurations.TestAction_ProjectActivity;

public class TestCase_ProjectActivity {
	//RMS-> Configuration -> Configure Project Activity

	public static List<String> Structure_Library = new ArrayList<String>();
	public static int ModificationFlag = 0;
	public static WebElement from = null;
	public static String ProjectActivityCount;
	//**Enable below code in case running through the TEST NG Module **********************************************************************************************************************************
	/*@BeforeClass
	public static void SetUp() throws Exception 
	{
		ConfigureBrowser.SetBrowser();
		ConfigureBrowser.URL_Choice();
	}
	//************************************************************************************************************************************
	@Test(priority = -1)// it will also work in case we do not mention the   priority No  
	public static void login() throws Throwable
	{
		Report.Report_section_Name("Login");
		Report.ReporterOutputHeader();
		Action_ValidLogin.loginvaliddata();
		Report.TableEnd();
		System.out.println("Login_1_Verify Login with Valid Credential.");
	}*/
	//************************ Open Project Activity page*************************************
	@Test
	public static void ProjectActivity_Page() throws Throwable
	{
		Report.TableEnd(); 
		
		Report.Report_section_Name("Verify Project Activity page.");

		Report.ReporterOutputHeader();

		TestAction_ProjectActivity.ProjectActivityPage();

		TestAction_ProjectActivity.Sorting();

		TestAction_ProjectActivity.Status();

		TestAction_ProjectActivity.Pagination();

		TestAction_ProjectActivity.RecordsCount();

		Report.TableEnd();
		System.out.println("Verify Project Activity page scenario completed.");
	}
	/**************************************************************************************************************/
	@Test
	public static void Update_ProjectActivity() throws Throwable
	{
		try{
		
		System.out.println("entered in Update_ProjectActivity" );
		Report.TableEnd(); 
		Report.Report_section_Name("Verify whether updated Project Activity is getting reflected or not.");
		Report.ReporterOutputHeader();
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		
	
		//******************************* For 1 Activity mapping **************************************************************		
		
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		//XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Project Activity");
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Configure_Project_Activity");
		for (int sheetrow = 4; sheetrow <= 4; sheetrow++) {
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 2; sheetcol <= 2; sheetcol++) {
				XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				Structure_Library.add(CellValue);
				System.out.println(Structure_Library);
			}

			ProjectActivityCount=Structure_Library.get(0);

			TestAction_ProjectActivity.UpdateProjectActivity(ProjectActivityCount); 
			Structure_Library.clear();
		}
		//TestAction_ProjectActivity.ProjectActivityPage(); 

		ObjWorkBook = null;
		ObjExcelApp.close();
		Report.TableEnd();
		System.out.println("Verify whether Project Activity is set for selected project or not completed.");
		} catch (Exception e) {
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
/*EOC (End of Class )*************************************************************************************************************/
