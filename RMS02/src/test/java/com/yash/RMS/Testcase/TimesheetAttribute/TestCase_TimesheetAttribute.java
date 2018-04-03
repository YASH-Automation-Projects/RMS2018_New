package com.yash.RMS.Testcase.TimesheetAttribute;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.Setup.ConfigureBrowser;
import com.yash.RMS.TestAction.TimesheetAttribute.TestAction_Activity;
import com.yash.RMS.TestAction.TimesheetAttribute.TestAction_AllocationType;
import com.yash.RMS.TestAction.TimesheetAttribute.TestAction_ModuleTicketNo;
import com.yash.RMS.TestAction.login.Action_ValidLogin;



public class TestCase_TimesheetAttribute 
{
	public static List<String> Structure_Library = new ArrayList<String>();
	public static int ModificationFlag = 0;
	public static WebElement from = null;
	
/*@BeforeClass
public static void SetUp() throws Exception 
{
	ConfigureBrowser.SetBrowser();
	ConfigureBrowser.URL_Choice();
	
}

 @Test(priority = 1)
    public static void login() throws Throwable
    {
                    Report.Report_section_Name("Login");
                    Report.ReporterOutputHeader();
                    Action_ValidLogin.loginvaliddata();
                    Report.TableEnd();
                    System.out.println("Login_1_Verify Login with Valid Credential.");
    }*/

 // ************************** Activity Module scenarios ********************************************** //
 
@Test(priority =1)
public static void New_ActivityCreation() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 1_New Activity creation scenario");
	Report.ReporterOutputHeader();
	 //Alerthandling.alerthandling();
	TestAction_Activity.Navigation_TimesheetAttribute();
	//--
	FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
	
	XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
	XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("TimesheetAttribute");
	for (int sheetrow = 4; sheetrow <= 4; sheetrow++) {
		Row row = ObjWorkSheet.getRow(sheetrow);
		for (int sheetcol = 2; sheetcol <= 7; sheetcol++) {
			Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
			String CellValue = ResultCellValue.toString();
			Structure_Library.add(CellValue);
			//System.out.println(Structure_Library);
		}
		//--
	TestAction_Activity.NewActivity_Creation(Structure_Library.get(0),Structure_Library.get(1),Structure_Library.get(2),Structure_Library.get(3),Structure_Library.get(4),Structure_Library.get(5)); 

Structure_Library.clear();
	
	}
	ObjWorkBook = null;
	ObjExcelApp.close();

	Report.TableEnd();
	System.out.println("Scenario 1 _ New Activity creation scenario is completed");
}

@Test(priority=2)
public static void Search_Activity() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 2 _ Activity Search scenario");
	Report.ReporterOutputHeader();
	 //Alerthandling.alerthandling();
	
	FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
	
	XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
	XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("TimesheetAttribute");
	for (int sheetrow = 4; sheetrow <= 4; sheetrow++) {
		Row row = ObjWorkSheet.getRow(sheetrow);
		for (int sheetcol = 2; sheetcol <= 2; sheetcol++) {
			Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
			String CellValue = ResultCellValue.toString();
			Structure_Library.add(CellValue);
			//System.out.println(Structure_Library);
		}
		//--
		System.out.println(Structure_Library.get(0));
	TestAction_Activity.NewActivity_Search(Structure_Library.get(0)); 

Structure_Library.clear();
	
	}
	ObjWorkBook = null;
	ObjExcelApp.close();

	Report.TableEnd();
	System.out.println("Scenario 2 _ New Activity search scenario is completed");
}

@Test(priority=3)
public static void Edit_Activity() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 3 _ Activity Edit scenario");
	Report.ReporterOutputHeader();
		
	FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
	
	XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
	XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("TimesheetAttribute");
	for (int sheetrow = 6; sheetrow <= 6; sheetrow++) {
		Row row = ObjWorkSheet.getRow(sheetrow);
		for (int sheetcol = 2; sheetcol <= 7; sheetcol++) {
			Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
			String CellValue = ResultCellValue.toString();
			Structure_Library.add(CellValue);
			//System.out.println(Structure_Library);
		}
		//--
	TestAction_Activity.NewActivity_Edit(Structure_Library.get(0),Structure_Library.get(1),Structure_Library.get(2),Structure_Library.get(3),Structure_Library.get(4),Structure_Library.get(5)); 

Structure_Library.clear();
	
	}
	ObjWorkBook = null;
	ObjExcelApp.close();

	Report.TableEnd();
	System.out.println("Scenario 3 _ Activity Edit scenario is completed");
}
	@Test(priority=4)
	public static void Delete_Activity() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 4 _ Activity Delete scenario");
		Report.ReporterOutputHeader();
			
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("TimesheetAttribute");
		for (int sheetrow = 6; sheetrow <= 6; sheetrow++) {
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 2; sheetcol <= 2; sheetcol++) {
				Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				Structure_Library.add(CellValue);
				//System.out.println(Structure_Library);
			}
			//--
		TestAction_Activity.NewActivity_Delete(Structure_Library.get(0)); 

		Thread.sleep(5000);
		
	Structure_Library.clear();
		
		}
		ObjWorkBook = null;
		ObjExcelApp.close();

		Report.TableEnd();
		System.out.println("Scenario 4 _ Activity Delete scenario is completed");
}

	// ************************** Allocation Type  Module scenarios ********************************************** //
	
	@Test
	public static void New_AllocationTypeCreation() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 1 _ New Allocation Type creation scenario");
		Report.ReporterOutputHeader();
		 //Alerthandling.alerthandling();
		TestAction_Activity.Navigation_TimesheetAttribute();
		//--
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		DataFormatter formatter = new DataFormatter(Locale.US);
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("TimesheetAttribute");
		for (int sheetrow = 10; sheetrow <= 10; sheetrow++) {
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 2; sheetcol <= 3; sheetcol++) {
				
				String CellValue = formatter.formatCellValue(ObjWorkSheet.getRow(sheetrow).getCell(sheetcol));
			/*	Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
			*/	Structure_Library.add(CellValue);
				//System.out.println(Structure_Library);
			}
			//--
		TestAction_AllocationType.NewAllocation_Creation(Structure_Library.get(0),Structure_Library.get(1)); 

	Structure_Library.clear();
		
		}
		ObjWorkBook = null;
		ObjExcelApp.close();

		Report.TableEnd();
		System.out.println("Scenario 1 _ New Allocation Type creation scenario is completed");
	}

	@Test
	public static void Search_Allocation() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 2 _ Allocation Type Search scenario");
		Report.ReporterOutputHeader();
		 //Alerthandling.alerthandling();
		DataFormatter formatter = new DataFormatter(Locale.US);
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("TimesheetAttribute");
		for (int sheetrow = 10; sheetrow <= 10; sheetrow++) {
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 2; sheetcol <= 2; sheetcol++) {
				
				String CellValue = formatter.formatCellValue(ObjWorkSheet.getRow(sheetrow).getCell(sheetcol));
				/*Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();*/
				Structure_Library.add(CellValue);
				//System.out.println(Structure_Library);
			}
			//--
			TestAction_AllocationType.NewAllocationType_Search(Structure_Library.get(0)); 

	Structure_Library.clear();
		
		}
		ObjWorkBook = null;
		ObjExcelApp.close();

		Report.TableEnd();
		System.out.println("Scenario 2 _ Allocation Type Search scenario is completed");
	}

	@Test
	public static void Edit_Allocation() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 3 _ Allocation Type Edit scenario");
		Report.ReporterOutputHeader();
			
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		DataFormatter formatter = new DataFormatter(Locale.US);
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("TimesheetAttribute");
		for (int sheetrow = 12; sheetrow <= 12; sheetrow++) {
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 2; sheetcol <= 3; sheetcol++) {
				String CellValue = formatter.formatCellValue(ObjWorkSheet.getRow(sheetrow).getCell(sheetcol));
				/*Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();*/
				Structure_Library.add(CellValue);
				//System.out.println(Structure_Library);
			}
			//--
			TestAction_AllocationType.NewAllocationType_Edit(Structure_Library.get(0),Structure_Library.get(1)); 

	Structure_Library.clear();
		
		}
		ObjWorkBook = null;
		ObjExcelApp.close();

		Report.TableEnd();
		System.out.println("Scenario 3 _ Allocation Type Edit scenario is completed");
	}
		@Test
		public static void Delete_Allocation() throws Throwable
		{
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 4 _ Allocation Type Delete scenario");
			Report.ReporterOutputHeader();
				
			FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
			
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("TimesheetAttribute");
			for (int sheetrow = 12; sheetrow <= 12; sheetrow++) {
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 2; sheetcol++) {
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					Structure_Library.add(CellValue);
					//System.out.println(Structure_Library);
				}
				//--
				TestAction_AllocationType.NewActivity_Delete(Structure_Library.get(0)); 
                Thread.sleep(4000);
		         Structure_Library.clear();
			
			}
			ObjWorkBook = null;
			ObjExcelApp.close();

			Report.TableEnd();
			System.out.println("Scenario 4 _ Allocation Type Delete scenario is completed");
	}

		// **************************  Module Ticket No scenarios ********************************************** //
		@Test
		public static void New_ModuleCreation() throws Throwable
		{
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 1 _ New Module Ticket No creation scenario");
			Report.ReporterOutputHeader();
			 //Alerthandling.alerthandling();
			TestAction_Activity.Navigation_TimesheetAttribute();
			//--
			FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
			
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("TimesheetAttribute");
			for (int sheetrow = 16; sheetrow <= 16; sheetrow++) {
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) {
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					Structure_Library.add(CellValue);
					//System.out.println(Structure_Library);
				}
				//--
				TestAction_ModuleTicketNo.AddNew_ModuleTicketNo(Structure_Library.get(0)); 

		Structure_Library.clear();
			
			}
			ObjWorkBook = null;
			ObjExcelApp.close();

			Report.TableEnd();
			System.out.println("Scenario 1 _ New Module Ticket No creation scenario is completed");
		}

		@Test
		public static void Module_Search() throws Throwable
		{
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 2 _ Module Search and Verification scenario");
			Report.ReporterOutputHeader();
			 //Alerthandling.alerthandling();
			//TestAction_Activity.Navigation_TimesheetAttribute();
			//--
			FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
			
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("TimesheetAttribute");
			for (int sheetrow = 16; sheetrow <= 16; sheetrow++) {
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) {
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					Structure_Library.add(CellValue);
					//System.out.println(Structure_Library);
				}
				//--
				TestAction_ModuleTicketNo.NewModuleTicketNo_Search(Structure_Library.get(0)); 

		Structure_Library.clear();
			
			}
			ObjWorkBook = null;
			ObjExcelApp.close();

			Report.TableEnd();
			System.out.println("Scenario 2 _ Module Search and Verification scenario is completed");
		}

		@Test
		public static void Module_Edit() throws Throwable
		{
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 3 _ Module Edit and Verification scenario");
			Report.ReporterOutputHeader();
			 //Alerthandling.alerthandling();
			//TestAction_Activity.Navigation_TimesheetAttribute();
			//--
			FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
			
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("TimesheetAttribute");
			for (int sheetrow = 16; sheetrow <= 16; sheetrow++) {
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) {
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					Structure_Library.add(CellValue);
					//System.out.println(Structure_Library);
				}
				//--
				TestAction_ModuleTicketNo.Edit_ModuleTicketNo(Structure_Library.get(0), Structure_Library.get(1)); 

		Structure_Library.clear();
			
			}
			ObjWorkBook = null;
			ObjExcelApp.close();

			Report.TableEnd();
			System.out.println("Scenario 3 _ Module Edit and Verification scenario is completed");
		}


		@Test
		public static void Module_delete() throws Throwable
		{
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 4 _ Module Delete and Verification scenario");
			Report.ReporterOutputHeader();
			 //Alerthandling.alerthandling();
			//TestAction_Activity.Navigation_TimesheetAttribute();
			//--
			FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
			
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("TimesheetAttribute");
			for (int sheetrow = 16; sheetrow <= 16; sheetrow++) {
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) {
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					Structure_Library.add(CellValue);
					//System.out.println(Structure_Library);
				}
				//--
				TestAction_ModuleTicketNo.ModuleTicketNo_Delete(Structure_Library.get(0), Structure_Library.get(1)); 

				Thread.sleep(4000);
				
		       Structure_Library.clear();
			
			}
			ObjWorkBook = null;
			ObjExcelApp.close();

			Report.TableEnd();
			System.out.println("Scenario 4 _ Module Delete and Verification scenario is completed");
		}

	

}


