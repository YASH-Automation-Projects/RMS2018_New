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
import com.yash.RMS.TestAction.ProjectAttribute.Action_ProjectCategoryAddDel;
import com.yash.RMS.TestAction.ProjectAttribute.Action_ProjectMethodologyAddDel;
import com.yash.RMS.TestAction.ProjectAttribute.Action_ProjectMethodologyPageValidation;
import com.yash.RMS.TestAction.login.Action_ValidLogin;

public class TestCase_ProjectMethodology {

	public static List<String> ProjectMethodologyAdd_name = new ArrayList<String>();
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
	
	//Sorting 
	@Test
			public static void ProjectMethodology_PageValidation() throws Throwable
			{
				try {
					Report.TableEnd(); 
					Report.Report_section_Name("Scenario 1_Project_Methodology_Page_Validation.");
					Report.ReporterOutputHeader();
					//Thread.sleep(2000);
					
					Action_ProjectMethodologyPageValidation.projectMethodology_PageValidationNavigation();
					//Thread.sleep(2000);
					
					Action_ProjectMethodologyPageValidation.projectMethodology_serialNoSorting();
					Thread.sleep(2000);
					
					Action_ProjectMethodologyPageValidation.projectMethodology_descendingSerialNoSorting();
				//	Thread.sleep(2000);
					
					Action_ProjectMethodologyPageValidation.projectMethodology_ascendingSerialNoSorting();
					//Thread.sleep(2000);
					
					Action_ProjectMethodologyPageValidation.projectMethodology_AscendingNameSorting();
					//Thread.sleep(2000);
					
					Action_ProjectMethodologyPageValidation.projectMethodology_DescendingNameSorting();
					//Thread.sleep(2000);
					
					Action_ProjectMethodologyPageValidation.projectMethodology_Pagination();
					//Thread.sleep(2000);
					
					Action_ProjectMethodologyPageValidation.projectMethodology_RecordsCount();
					Report.TableEnd();
					
					System.out.println("Scenario 1_Project_Methodology_Page_Validation is completed");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
	
	@Test
	public static void ProjectMethodologyAdd() throws Throwable
	{
		
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 2_Add_Project Methodology.");
			Report.ReporterOutputHeader();

			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("ProjectMethodology");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) 
				{
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					ProjectMethodologyAdd_name.add(CellValue);
				}
				Action_ProjectMethodologyAddDel.projectMethodology_Navigation();
				PageObjects_ProjectAttribute.masterDataLink(Constant.driver).click();
				Thread.sleep(1000);
				Action_ProjectMethodologyAddDel.projectMethodology_Add(ProjectMethodologyAdd_name.get(0));
				ProjectMethodologyAdd_name.clear();
				Report.TableEnd();

			}
			System.out.println("Scenario 2_Add_Project Methodology_scenario is completed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//************************************************************************************************************************************************
			//************************ Search For created Invoice By Name *************************************

			@Test
			public static void ProjectMethodologySearch() throws Throwable
			{
				try {
					Report.TableEnd(); 
					Report.Report_section_Name("Scenario 3_Verify Project Methodology Name Search Functionality.");
					Report.ReporterOutputHeader();
					//Thread.sleep(4000);
					FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
						@SuppressWarnings("resource")
						XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
						XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("ProjectMethodology");
						for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
						{
							Row row = ObjWorkSheet.getRow(sheetrow);
							for (int sheetcol = 2; sheetcol <= 3; sheetcol++) 
							{
								XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
								String CellValue = ResultCellValue.toString();
								ProjectMethodologyAdd_name.add(CellValue);
							}
					
							//Thread.sleep(2000);
					Action_InvoiceBy_AddEditDel.SearchInvoiceByName(ProjectMethodologyAdd_name.get(0));
					ProjectMethodologyAdd_name.clear();
					Report.TableEnd();
					System.out.println("Scenario 3__Verify Project Methodology Name Search Functionality scenario is completed.");
						}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
				
	//************************************************************************************************************************************************

	@Test
	public static void ProjectMethodologyEdit() throws Throwable 
	{
		
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 4_Edit_Project_Methodology. ");
			Report.ReporterOutputHeader();

			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("ProjectMethodology");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) 
				{
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					ProjectMethodologyAdd_name.add(CellValue);
					Editoutput.add(CellValue);
				}
				Action_ProjectMethodologyAddDel.projectMethodologyPage_searchEdit(ProjectMethodologyAdd_name.get(0));
//gettign error here  : neeed to remove the error from here 
				Action_ProjectMethodologyAddDel.projectMethodologyPage_Edit(Editoutput.get(0));
				//Thread.sleep(3000);
				ProjectMethodologyAdd_name.clear();
				Editoutput.clear();
				Report.TableEnd();
			}
			System.out.println("Scenario 4_Edit_Project_Methodology_scenario is completed. ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//***********************************************************************************************************
	@Test
	public static void ProjectMethodologyDelete() throws Throwable 
	{
		
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 5_Delete_Project Methodology.");
			Report.ReporterOutputHeader();

			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("ProjectMethodology");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 3; sheetcol <= 3; sheetcol++) 
				{
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					Editoutput.add(CellValue);
					Editoutput.add(CellValue);
				}}
			//Thread.sleep(2000);
			Action_ProjectMethodologyAddDel.projectMethodologypage_searchDel((Editoutput.get(0)));
			Action_ProjectMethodologyAddDel.projectMethodologypage_Delete((Editoutput.get(0)));
			Editoutput.clear();
			Editoutput.clear();
			//Editoutput_Del.clear();
			Report.TableEnd();
		
		System.out.println("Scenario 5 Delete_Project_Methodology_scenario is completed. ");
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
}}
	//***********************************************************************************************************











































