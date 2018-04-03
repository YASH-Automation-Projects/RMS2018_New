package com.yash.RMS.Testcase.ProjectAttribute;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.ProjectAttribute.PageObjects_ProjectAttribute;
import com.yash.RMS.Setup.ConfigureBrowser;
import com.yash.RMS.TestAction.ProjectAttribute.Action_InvoiceBy_AddEditDel;
import com.yash.RMS.TestAction.ProjectAttribute.Action_InvoiceBy_PageValidation;
import com.yash.RMS.TestAction.ProjectAttribute.Action_ProjectCategoryAddDel;
import com.yash.RMS.TestAction.ProjectAttribute.Action_ProjectCategory_PageValidation;
//import com.yash.RMS.TestAction.ProjectAttribute.Action_ProjectCategory_PageValidation;
import com.yash.RMS.TestAction.login.Action_ValidLogin;

public class TestCase_ProjectCategory{

	public static List<String> ProjectCategoryAdd_name = new ArrayList<String>();
	public static List<String> Editoutput = new ArrayList<String>();
	//public static List<String> Editoutput_Del = new ArrayList<String>();

	/*	@BeforeClass
	public static void SetUp() throws Exception 
	{
		ConfigureBrowser.SetBrowser();
		ConfigureBrowser.URL_Choice();
	}
		@Test(priority = -1)
	public static void login() throws Throwable
	{
		Report.Report_section_Name("Login");
		Report.ReporterOutputHeader();
		Action_ValidLogin.loginvaliddata();
		Report.TableEnd();
		System.out.println("Login_1_Verify Login with Valid Credential.");
	}*/

	//Sorting 
	@Test
	public static void ProjectCategory_PageValidation() throws Throwable
	{
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 1_Project_Category_Page_Validation.");
			Report.ReporterOutputHeader();
			//	Thread.sleep(2000);

			Action_ProjectCategory_PageValidation.projectCategorypage_PageValidationNavigation();
			Thread.sleep(2000);

			Action_ProjectCategory_PageValidation.projectCategorypage_serialNoSorting();
			//	Thread.sleep(2000);

			Action_ProjectCategory_PageValidation.projectCategorypage_descendingSerialNoSorting();
			//Thread.sleep(2000);

			Action_ProjectCategory_PageValidation.projectCategorypage_ascendingSerialNoSorting();
			//Thread.sleep(2000);

			Action_ProjectCategory_PageValidation.projectCategory_AscendingNameSorting();
			//Thread.sleep(2000);

			Action_ProjectCategory_PageValidation.projectCategory_DescendingNameSorting();
			//	Thread.sleep(2000);

			Action_ProjectCategory_PageValidation.projectCategory_Pagination();
			//Thread.sleep(2000);

			Action_ProjectCategory_PageValidation.projectCategory_RecordsCount();
			Report.TableEnd();
			//	System.out.println("Scenario 1_Project_Category_Page_Validation is completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public static void ProjectCategoryAdd() throws Throwable
	{
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 2_Add_ProjectCategory.");
			Report.ReporterOutputHeader();

			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("ProjectCategory");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) 
				{
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					ProjectCategoryAdd_name.add(CellValue);
				}
				
				Thread.sleep(5000);
				Action_ProjectCategoryAddDel.projectCategorypage_Navigation();
				Thread.sleep(2000);
				PageObjects_ProjectAttribute.masterDataLink(Constant.driver).click();
				//Thread.sleep(2000);
				Action_ProjectCategoryAddDel.projectCategorypage_Add(ProjectCategoryAdd_name.get(0));
				ProjectCategoryAdd_name.clear();
				//		Report.TableEnd();

			}
			Report.TableEnd();
			//	System.out.println("Scenario 2_Add_ProjectCategory_scenario is completed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//************************ Search For created Invoice By Name *************************************

 @Test
	public static void ProjectCategorySearch() throws Throwable
	{
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 3_Verify Project Category Name Search Functionality.");
			Report.ReporterOutputHeader();
			//	Thread.sleep(4000);
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("ProjectCategory");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) 
				{
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					ProjectCategoryAdd_name.add(CellValue);
				}

				//	Thread.sleep(2000);
				Action_ProjectCategoryAddDel.projectCategorypage_Search(ProjectCategoryAdd_name.get(0));
				ProjectCategoryAdd_name.clear();
				//		Report.TableEnd();
				//	System.out.println("Scenario 3_ProjectCategory Name Search Functionality scenario is completed.");
			}
			Report.TableEnd();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}

	//************************************************************************************************************************************************


	@Test
	public static void ProjectCategoryEdit() throws Throwable 
	{
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 4_Edit_ProjectCategory.");
			Report.ReporterOutputHeader();
			//Thread.sleep(2000);
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("ProjectCategory");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{//5row
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) 
				{
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					ProjectCategoryAdd_name.add(CellValue);
					Editoutput.add(CellValue);
				}//Thread.sleep(2000);
				Action_ProjectCategoryAddDel.projectCategorypage_searchEdit(ProjectCategoryAdd_name.get(0));
				//Thread.sleep(2000);
				Action_ProjectCategoryAddDel.projectCategorypage_Edit(Editoutput.get(1));
				//Thread.sleep(1000);
				ProjectCategoryAdd_name.clear();
				Editoutput.clear();
				//		Report.TableEnd();
				System.out.println("Scenario 4_Edit_ProjectCategory_scenario is completed. ");
			}
			Report.TableEnd();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test
	public static void ProjectCategoryDelete() throws Throwable 
	{

		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 5_Delete_ProjectCategory.");
			Report.ReporterOutputHeader();
			//Thread.sleep(2000);
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("ProjectCategory");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 3; sheetcol <= 3; sheetcol++) 
				{
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					Editoutput.add(CellValue);
					//	Editoutput.add(CellValue);

				}}
			Action_ProjectCategoryAddDel.projectCategorypage_searchDel((Editoutput.get(0)));
			Action_ProjectCategoryAddDel.projectCategorypage_Delete((Editoutput.get(0)));
			Editoutput.clear();
			//	Editoutput.clear();
			Report.TableEnd();
			//	System.out.println("Scenario 5_Delete_ProjectCategory_scenario is completed. ");
		}
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








