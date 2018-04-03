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
import com.yash.RMS.TestAction.MasterData.MiscAttribute.TestAction_Event;
import com.yash.RMS.TestAction.ResourceAttribute.TestAction_Ownership;


public class Testcase_Event {
	public static List<String> Structure_Library = new ArrayList<String>();
	public static int ModificationFlag = 0;
	public static WebElement from = null;
	public static String EventName, EventDesc, EditEvent, EditDescEvent;


	//************************ Open Event page*************************************

	 @Test(priority = 1)
	public static void Event_Page() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 1_Event page is open.");
		Report.ReporterOutputHeader();
		TestAction_Event.EventPage(); 
		TestAction_Event.Sorting(); 
		TestAction_Event.Pagination(); 
		TestAction_Event.RecordsCount(); 	
		
	   Report.TableEnd();
		System.out.println("Scenario 1_Event page is open.");

	}

	//************************ New Event Creation*************************************
	@Test(priority = 2)
	public static void New_Event() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 2_New Event creation scenario.");
		Report.ReporterOutputHeader();
		//--
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Event");
		for (int sheetrow = 4; sheetrow <= 4; sheetrow++) {
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 2; sheetcol <= 3; sheetcol++) {
				XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				Structure_Library.add(CellValue);
				//System.out.println(Structure_Library);
			}
			//--
			EventName=Structure_Library.get(0);
			EventDesc=Structure_Library.get(1);
			
			TestAction_Event.NewEvent(EventName, EventDesc); 


	Structure_Library.clear();
		
		}
		ObjWorkBook = null;
		ObjExcelApp.close();
	  Report.TableEnd();
		System.out.println("Scenario 2_New Event scenario creation is completed.");

	} 
	 
	//************************ Search created Event *************************************

	@Test(priority = 3)
	public static void Search_Event() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 3_Search Event scenario.");
		Report.ReporterOutputHeader();
		
		
		TestAction_Event.SearchEvent(EventName); 

		Report.TableEnd();
		System.out.println("Scenario 3_Search Event scenario is completed.");
	} 

	//************************ Edit created Event *************************************
	@Test(priority = 4)
	public static void Edit_Event() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 4_Edit Event scenario.");
		Report.ReporterOutputHeader();
		//--
		 	FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
			
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Event");
			for (int sheetrow = 5; sheetrow <= 5; sheetrow++) {
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) {
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					Structure_Library.add(CellValue);
					//System.out.println(Structure_Library);
				}
				//--
				EditEvent=Structure_Library.get(0);
				EditDescEvent=Structure_Library.get(1);
				
				TestAction_Event.EditEvent(EventName,EditEvent, EditDescEvent); 


		Structure_Library.clear();
			
			}
			ObjWorkBook = null;
			ObjExcelApp.close();
		
		Report.TableEnd();
		System.out.println("Scenario 4_Edit Event scenario is completed.");
	} 
	 
	//************************ Click on Event *************************************

	@Test(priority = 5)
	public static void Click_Event() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 5_Click on Event scenario.");
		Report.ReporterOutputHeader();
		
		
		TestAction_Event.ClickEvent(EditEvent); 

		Report.TableEnd();
		System.out.println("Scenario 5_Click on Event scenario is completed.");
	} 
	 
	//************************ Delete Event *************************************

	@Test(priority = 6)
	public static void Delete_Event() throws Throwable
	{
		try {
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 6_Delete Event scenario.");
		Report.ReporterOutputHeader();
		
		
		TestAction_Event.DeleteEvent(EditEvent); 

		Report.TableEnd();
		System.out.println("Scenario 6_Delete Event scenario is completed.");
	
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
