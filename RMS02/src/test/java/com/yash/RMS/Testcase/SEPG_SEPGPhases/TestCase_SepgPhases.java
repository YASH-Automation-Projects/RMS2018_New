package com.yash.RMS.Testcase.SEPG_SEPGPhases;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.TestAction.ResourceAttribute.TestAction_EmployeeCategory;
import com.yash.RMS.TestAction.SEPG.Action_SEPGPhases_AddNewEdit;
import com.yash.RMS.TestAction.SEPG.Action_SEPGPhases_PageValidation;
import com.yash.RMS.Setup.ConfigureBrowser;
import com.yash.RMS.TestAction.login.Action_ValidLogin;

public class TestCase_SepgPhases {
	public static List<String> Add_New_Phases = new ArrayList<String>();
	public static List<String> Edit_Add_New_Phases = new ArrayList<String>();
	public static List<String> Structure_Library = new ArrayList<String>();
	//  public static String EmployeeCategoryName,EditEmployeeCategory;
	//	public static  String AddNewPhases_01, EditNewPhases_01;

	// when we run the TestNG module only then only  Un-comment  the below code other wise comment it   
	/*	@BeforeClass
	public static void SetUp() throws Exception 
	{
		ConfigureBrowser.SetBrowser();
		ConfigureBrowser.URL_Choice();
	}
	//************************************************************************************************************************************
	@Test(priority = 1)
	public static void login() throws Throwable
	{
		Report.Report_section_Name("Login");
		Report.ReporterOutputHeader();
		Action_ValidLogin.loginvaliddata();
		Report.TableEnd();
		System.out.println("Login_1_Verify Login with Valid Credential.");
	}*/
	//************Scenario_01_SEPG Page Validation.; Pagination: RecordsCount: serialNoSorting: ascending and Descending and all***************************************************************************************************************
	//Sorting 
	@Test
	//@Test(priority = 2)
	public static void SepgPhases_PageValidation() throws Throwable
	{
		try {
			Report.TableEnd();
			Report.Report_section_Name("Scenario_01_SEPG Page Validation.");
			Report.ReporterOutputHeader();
			Thread.sleep(2000);

			// to PageNavigation
			Action_SEPGPhases_PageValidation.PageNavigation();
			Thread.sleep(2000);

			Action_SEPGPhases_PageValidation.Pagination();
			Thread.sleep(2000);

			Action_SEPGPhases_PageValidation.RecordsCount();
			Thread.sleep(2000);

			Action_SEPGPhases_PageValidation.serialNoSorting();
			Thread.sleep(2000);

			Action_SEPGPhases_PageValidation.Ascending_SerialNoSorting();
			Thread.sleep(2000);

			Action_SEPGPhases_PageValidation.Decending_SerialNoSorting();
			Thread.sleep(2000);

			Action_SEPGPhases_PageValidation.Ascending_PhasesSorting();
			Thread.sleep(2000);

			Action_SEPGPhases_PageValidation.Descending_PhasesSorting();
			Thread.sleep(2000);

			Action_SEPGPhases_PageValidation.Ascending_EngagementModel();
			Thread.sleep(2000);

			Action_SEPGPhases_PageValidation.Descending_EngagementModel();
			Thread.sleep(2000);

			Action_SEPGPhases_PageValidation.Ascending_MapActivity();
			Thread.sleep(2000);

			Action_SEPGPhases_PageValidation.Descending_MapActivity();
			Thread.sleep(2000);

			Report.TableEnd();
			System.out.println("Scenario_01_SEPG Page Validation scenario completed successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//****************Scenario 2_Add New SEPG Phases.**********************************************************************************************
	//@Test(priority = 1)
	@Test
	public static void Phases_AddName() throws Throwable
	{
		//code for Navigate to SEPG Phrase Page
		//Action_SEPGPhases_PageValidation.PageNavigation();
		Thread.sleep(2000);
		try {
			Report.TableEnd();
			Report.Report_section_Name("Scenario 2_Add New SEPG Phases.");
			Report.ReporterOutputHeader();

			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("SEPGPhases");
			for (int sheetrow = 3; sheetrow <= 3; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 2; sheetcol++) 
				{
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					Add_New_Phases.add(CellValue);
				}
				//to Navigate to search page 
				Action_SEPGPhases_PageValidation.PageNavigation();
				Thread.sleep(2000);

				//To Add New Phrase
				Action_SEPGPhases_AddNewEdit.Add_NewPhases(Add_New_Phases.get(0));

				//To Search Phrase which we have already created in Add New Phrase
				Action_SEPGPhases_AddNewEdit.search_Phases(Add_New_Phases.get(0));
				//to clear the array 
				Add_New_Phases.clear();
				Thread.sleep(2000);
				System.out.println("Scenario 2_Add New SEPG Phases scenario completed successfully.");

				Report.TableEnd();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**New 1 ********************** Edit created Employee Category *************************************
	@Test
	public static void Edit_PhasesName() throws Throwable
	{
		try{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 3_Verify SEPG Phases Edit Functionality.");
		Report.ReporterOutputHeader();
		//--
		FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);

		@SuppressWarnings("resource")
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("SEPGPhases");
		for (int sheetrow = 3; sheetrow <= 3; sheetrow++) {
			@SuppressWarnings("unused")
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 2; sheetcol <= 3; sheetcol++) {
				XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				Structure_Library.add(CellValue);
			}
			Action_SEPGPhases_AddNewEdit.EditPhasesName_01(Structure_Library.get(0), Structure_Library.get(1));
			Structure_Library.clear();
		}
		/*ObjWorkBook = null;
		ObjExcelApp.close();*/

		Report.TableEnd();
		Thread.sleep(2000);
		System.out.println("Scenario 3_SEPG Phases Edit Functionality scenario is completed.");
	}
	catch(Exception e){
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
	//***New end **********************************************************
	}//END OF CLASS
}
//************************************************************************************************************************************************
//**********Scenario 03_To Edit the Phrases Name by clicking the Edit button ****************************************
/*@Test(priority = 3)
	public static void Edit_PhrasesName() throws Throwable
	{
		try {
			//if report is not valid then cmt the belwo line 
			Report.TableEnd();
			Report.Report_section_Name("Scenario 3_Edit_PhrasesName Scenario.");
			Report.ReporterOutputHeader();
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("SEPGPhases");
			for (int sheetrow = 3; sheetrow <= 3; sheetrow++) 
			{
				@SuppressWarnings("unused")
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) 
				{
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);

					String CellValue = ResultCellValue.toString();
					Edit_Add_New_Phases.add(CellValue);
				}

				//to Navigate for Edit Phrases
				//Action_SEPGPhases_PageValidation.PageNavigation();
				Thread.sleep(2000);

				//To Search the Newly Add New Phrase

				Action_SEPGPhases_AddNewEdit.search_Phrases(Edit_Add_New_Phases.get(0));
				Thread.sleep(2000);

				//search_Phrases(String phrasesToSearch) 
				//To Edit the Newly Add New Phrase 
				Action_SEPGPhases_AddNewEdit.Edit_PhraseName(Edit_Add_New_Phases.get(1));
				Thread.sleep(2000);
				//to verify the Edited Phases name is able to search successfully
				Action_SEPGPhases_AddNewEdit.search_Phrases(Edit_Add_New_Phases.get(1));
				Thread.sleep(2000);

				//to clear the arrays 
				Edit_Add_New_Phases.clear();
				//***NAVIGATING INTO RMS HOME PAGE: TO CLICK ON HOME PAGE***
				try
				{
					if(Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).isDisplayed());                                    
					{              
						Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).click();
						Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is navigated to RMS      Home page","Pass",null);
					}
				}
				catch(Exception e)
				{
					System.out.println( e.getMessage());

				}
				Thread.sleep(2000);
				Report.TableEnd();
				System.out.println("Scenario 3_Edit_PhrasesName Scenario completed succesfully.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
//************************************************************************************************************************************************