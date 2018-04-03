package com.yash.RMS.Testcase.ProjectAttribute;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;
import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.ProjectAttribute.PageObjects_ProjectAttribute;
import com.yash.RMS.Setup.ConfigureBrowser;
import com.yash.RMS.TestAction.ProjectAttribute.Action_InvoiceBy_AddEditDel;
import com.yash.RMS.TestAction.ProjectAttribute.Action_InvoiceBy_PageValidation;
import com.yash.RMS.TestAction.login.Action_ValidLogin;


public class TestCase_InvoiceBy 
{
	//public static WebElement from = null;
	public static List<String> InvoiceByAdd_name = new ArrayList<String>();
	public static List<String> Editoutput = new ArrayList<String>();
	//public static List<String> Editoutput_Del = new ArrayList<String>();

	/*	@BeforeClass
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
	}
	 */
	//**************************************************************************************************************************************
	
	@Test
	public static void InvoiceBy_PageValidation() throws Throwable
	{
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 1_InvoiceBy_Sorting_Validation.");
			Report.ReporterOutputHeader();
			Action_InvoiceBy_PageValidation.pageValidationNavigation();
			Thread.sleep(2000);

			 Action_InvoiceBy_PageValidation.serialNoSorting();
			Thread.sleep(2000);

			 Action_InvoiceBy_PageValidation.descendingSerialNoSorting();
			Thread.sleep(1000);

			Action_InvoiceBy_PageValidation.ascendingSerialNoSorting();
			Thread.sleep(1000);

			Action_InvoiceBy_PageValidation.ascendingInvoiceByNameSorting();
			Thread.sleep(1000);

			Action_InvoiceBy_PageValidation.descendingInvoiceByNameSorting();
			Thread.sleep(1000);

			Action_InvoiceBy_PageValidation.Pagination();
			Thread.sleep(1000);

			Action_InvoiceBy_PageValidation.RecordsCount();
		
			Report.TableEnd();
			//	System.out.println("Scenario 1_InvoiceBy_Sorting_Validation is completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//************************************************************************************************************************************************
	@Test
	public static void InvoiceByAdd () throws Throwable
	{

		try {
			Report.TableEnd();
			Report.Report_section_Name("Scenario 2_Add_InvoiceBy.");
			Report.ReporterOutputHeader();
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("InvoiceByname");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) 
				{
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					InvoiceByAdd_name.add(CellValue);
				}
				Action_InvoiceBy_AddEditDel.Navigation();
				Thread.sleep(4000);

				PageObjects_ProjectAttribute.masterDataLink(Constant.driver).click();
				Thread.sleep(4000);

				Action_InvoiceBy_AddEditDel.Add(InvoiceByAdd_name.get(0));
				InvoiceByAdd_name.clear();

				//		Report.TableEnd();
				//	System.out.println("Scenario 2_Add_InvoiceBy is completed");
			}
			Report.TableEnd();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//************************ Search For created Invoice By Name *************************************

	@Test
	public static void InvoiceByNameSearch() throws Throwable
	{
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 3_Verify InvoiceBy Name Search Functionality.");
			Report.ReporterOutputHeader();
			//	Thread.sleep(4000);
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("InvoiceByname");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 2; sheetcol++) 
				{
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					InvoiceByAdd_name.add(CellValue);
				}

				//Thread.sleep(2000);
				Action_InvoiceBy_AddEditDel.SearchInvoiceByName(InvoiceByAdd_name.get(0));
				InvoiceByAdd_name.clear();
				//	Report.TableEnd();
				System.out.println("Scenario 3_InvoiceBy Name Search Functionality scenario is completed.");
			}

			Report.TableEnd();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//************************************************************************************************************************************************


	@Test
	public static void InvoiceByEdit() throws Throwable 
	{

		try {
			Report.TableEnd();
			Report.Report_section_Name("Scenario 4_Edit_InvoiceBy.");
			Report.ReporterOutputHeader();
			//Thread.sleep(2000);
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("InvoiceByname");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) 

				{
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					InvoiceByAdd_name.add(CellValue);
					Editoutput.add(CellValue);
				}
				Thread.sleep(1000);
				Action_InvoiceBy_AddEditDel.search_Edit(InvoiceByAdd_name.get(0));
				//	Thread.sleep(2000);
				Action_InvoiceBy_AddEditDel.Edit(Editoutput.get(1));
				InvoiceByAdd_name.clear();
				Editoutput.clear();
				//	Report.TableEnd();
				System.out.println("Scenario 4_Edit_InvoiceBy scenario is completed.");
			}
			Report.TableEnd();
			//Report.Report_section_Name("Scenario 3_Edit_InvoiceBy_scenario is completed. ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//************************************************************************************************************
	@Test

	public static void InvoiceByDelete() throws Throwable 
	{

		try {
			Report.TableEnd();
			Report.Report_section_Name("Scenario 5_Delete_InvoiceBy.");
			Report.ReporterOutputHeader();
			//	Thread.sleep(2000);
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("InvoiceByname");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 3; sheetcol <= 3; sheetcol++) 
				{
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					Editoutput.add(CellValue);
					Editoutput.add(CellValue);
				}
			}
			Action_InvoiceBy_AddEditDel.search_Del((Editoutput.get(0)));
			Action_InvoiceBy_AddEditDel.Delete((Editoutput.get(0)));
			Editoutput.clear();
			Editoutput.clear();
			Report.TableEnd();
		//	System.out.println("Scenario 5_Delete_InvoiceBy scenario is completed.");
		}
		//Report.Report_section_Name("Scenario 4_Delete_InvoiceBy_scenario is completed. ");
		catch (Exception e) {
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


//************************************************************************************************************************************************


