package com.yash.RMS.Testcase.MiscAttribute;

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

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.Setup.ConfigureBrowser;
import com.yash.RMS.TestAction.MasterData.MiscAttribute.TestAction_BGBU;
import com.yash.RMS.TestAction.ResourceAttribute.TestAction_Ownership;

public class Testcase_BGBU {
	public static List<String> Structure_Library = new ArrayList<String>();
	public static int ModificationFlag = 0;
	public static WebElement from = null;
	public static String BGBUName, BGBUDesc,BGBUHead, EditName, EditDesc, EditBGBUHead, BGBUNameOrg, BGBUDescOrg,BGBUHeadOrg;

	 //************************ Open BG/BU page*************************************

	 @Test
	 public static void BGBU_Page() throws Throwable
	{
	 	Report.TableEnd(); 
	 	Report.Report_section_Name("Scenario 1_BG/BU page is open.");
		Report.ReporterOutputHeader();
		TestAction_BGBU.BGBUPage(); 
		TestAction_BGBU.Sorting(); 
		TestAction_BGBU.Pagination(); 
		TestAction_BGBU.RecordsCount(); 	
	    Report.TableEnd();
		System.out.println("Scenario 1_BG/BU page is open.");
	 
	}
	 
	 //************************ New BG/BU Creation*************************************
	 @Test
	 public static void NewBGBU() throws Throwable
	{
	 	Report.TableEnd(); 
	 	Report.Report_section_Name("Scenario 2_New BG/BU creation scenario.");
		Report.ReporterOutputHeader();
		//--
	 	FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("BGBU");
		for (int sheetrow = 4; sheetrow <= 4; sheetrow++) {
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 2; sheetcol <= 4; sheetcol++) {
				XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				Structure_Library.add(CellValue);
				//System.out.println(Structure_Library);
			}
			//--
			BGBUName=Structure_Library.get(0);
			BGBUDesc=Structure_Library.get(1);
			BGBUHead=Structure_Library.get(2);
			TestAction_BGBU.NewBGBU(BGBUName, BGBUDesc, BGBUHead); 


	Structure_Library.clear();
		
		}
		ObjWorkBook = null;
		ObjExcelApp.close();
	    Report.TableEnd();
		System.out.println("Scenario 2_New BG/BU creation scenario is completed.");
	 
	}

	 //************************ Search created BG/BU *************************************

	 @Test
	 public static void Search_BGBU() throws Throwable
	 {
	 	Report.TableEnd(); 
	 	Report.Report_section_Name("Scenario 3_Search BG/BU scenario.");
	 	Report.ReporterOutputHeader();
	 	
		
			TestAction_BGBU.SearchBGBU(BGBUName); 

	 	Report.TableEnd();
	 	System.out.println("Scenario 3_Search BG/BU scenario is completed.");
	 } 
	 
	 //************************ Edit created BG/BU *************************************
	 @Test
	 public static void Edit_BGBU() throws Throwable
	 {
	 	Report.TableEnd(); 
	 	Report.Report_section_Name("Scenario 4_Edit BG/BU scenario.");
	 	Report.ReporterOutputHeader();
	 	//--
	 	 	FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
	 		
	 		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
	 		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("BGBU");
	 		for (int sheetrow = 5; sheetrow <= 5; sheetrow++) {
	 			Row row = ObjWorkSheet.getRow(sheetrow);
	 			for (int sheetcol = 2; sheetcol <= 4; sheetcol++) {
	 				XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
	 				String CellValue = ResultCellValue.toString();
	 				Structure_Library.add(CellValue);
	 				//System.out.println(Structure_Library);
	 			}
	 			//--
	 			EditName=Structure_Library.get(0);
	 			EditDesc=Structure_Library.get(1);
	 			
	 			TestAction_BGBU.EditBGBU(BGBUName,EditName,EditDesc); 


	 	Structure_Library.clear();
			
			}
			ObjWorkBook = null;
			ObjExcelApp.close();
		
	 	Report.TableEnd();
	 	System.out.println("Scenario 4_Edit BG/BU scenario is completed.");
	 }
	 
	 //************************ Deactivate BG/BU *************************************
	 @Test
	 public static void Deactivate_BGBU() throws Throwable
	 {
	 	Report.TableEnd(); 
	 	Report.Report_section_Name("Scenario 5_Deactivate BG/BU scenario.");
	 	Report.ReporterOutputHeader();
	 	
		
			TestAction_BGBU.DeactivateBGBU(EditName); 

	 	Report.TableEnd();
	 	System.out.println("Scenario 5_Deactivate BG/BU scenario is completed.");
	 }
	 
	 //************************ Activate BG/BU *************************************

	 @Test
	 public static void Activate_BGBU() throws Throwable
	 {
	 	Report.TableEnd(); 
	 	Report.Report_section_Name("Scenario 6_Activate BG/BU scenario.");
	 	Report.ReporterOutputHeader();
	 	
		
			TestAction_BGBU.ActivateBGBU(EditName); 

	 	Report.TableEnd();
	 	System.out.println("Scenario 6_Activate BG/BU scenario is completed.");
	 } 
	 
	//************************ New BG/BU Creation for organization*************************************
	@Test
	public static void AddBGBU_Org() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 7_New BG/BU for organization creation scenario.");
		Report.ReporterOutputHeader();
		//--
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("BGBU");
		for (int sheetrow = 6; sheetrow <= 6; sheetrow++) {
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 2; sheetcol <= 4; sheetcol++) {
				XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				Structure_Library.add(CellValue);
				//System.out.println(Structure_Library);
			}
			//--
			BGBUNameOrg=Structure_Library.get(0);
			BGBUDescOrg=Structure_Library.get(1);
			BGBUHead=Structure_Library.get(2);
			TestAction_BGBU.AddBGBUOrg(EditName,BGBUNameOrg,BGBUDescOrg,BGBUHead); 


	Structure_Library.clear();
		
		}
		ObjWorkBook = null;
		ObjExcelApp.close();
	   Report.TableEnd();
		System.out.println("Scenario 7_New BG/BU for organization creation scenario is completed.");

	}

	//************************ Move BG/BU to another BG/BU:*************************************

	@Test
	public static void MoveBGBU_Org() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 8_Move BG/BU to another BG/BU scenario.");
		Report.ReporterOutputHeader();
		
			TestAction_BGBU.MoveBGBUOrg(EditName,BGBUNameOrg); 

	   Report.TableEnd();
		System.out.println("Scenario 8_Move BG/BU to another BG/BU scenario is completed.");

	} 
	//************************ Verify Moved BG/BU*************************************

	@Test
	public static void checkMoveBGBU_Org() throws Throwable
	{
		try {
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 9_Verifying Moved BG/BU to another BG/BU scenario.");
		Report.ReporterOutputHeader();

			
			TestAction_BGBU.checkMoveBGBUOrg(EditName,BGBUNameOrg); 

	   Report.TableEnd();
		System.out.println("Scenario 9_Verifying Moved BG/BU to another BG/BU scenario is completed.");

	 
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


