package com.yash.RMS.Testcase.SEPG_SEPGPhases;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.TestAction.SEPG.Action_SEPGActivity_AddNew;
import com.yash.RMS.TestAction.SEPG.Action_SEPGActivity_PageValidation;
import com.yash.RMS.Setup.ConfigureBrowser;
import com.yash.RMS.TestAction.login.Action_ValidLogin;
import com.yash.RMS.POM.SEPG.PageObjects_SEPGActivity;

public class TestCase_SepgActivity_PageValidation {

	public static List<String> Phases_Name_Add = new ArrayList<String>();
	public static List<String> Add_New_Phrases = new ArrayList<String>();
	public static List<String> Edit_PhrasesName = new ArrayList<String>();
	public static List<String> Editoutput = new ArrayList<String>();
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
	//************************************************************************************************************************************
	//Sorting 
	//@Test(priority = 2)
	@Test
	public static void SepgActivity_PageValidation() throws Throwable
	{
		try {
			Report.Report_section_Name("Scenario 1 _ SEPG Activity Page Validation scenario.");
			Report.ReporterOutputHeader();
			Thread.sleep(2000);

			Action_SEPGActivity_PageValidation.PageNavigation();
			Thread.sleep(2000);

			Action_SEPGActivity_PageValidation.Pagination();
			Thread.sleep(2000);

			Action_SEPGActivity_PageValidation.RecordsCount();
			Thread.sleep(2000);
			Action_SEPGActivity_PageValidation.serialNoSorting();
			Thread.sleep(2000);

			Action_SEPGActivity_PageValidation.Ascending_SerialNoSorting();
			Thread.sleep(2000);
			Action_SEPGActivity_PageValidation.Decending_SerialNoSorting();
			Thread.sleep(2000);

			Action_SEPGActivity_PageValidation.Ascending_SEPGActivityNameSorting();
			Thread.sleep(2000);
			Action_SEPGActivity_PageValidation.Descending_SEPGActivityNameSorting();

			Action_SEPGActivity_PageValidation.Ascending_MandatorySorting();
			Thread.sleep(2000);
			Action_SEPGActivity_PageValidation.Descending_MandatorySorting();
			Thread.sleep(2000);

			Action_SEPGActivity_PageValidation.Ascending_ProductiveSorting();
			Thread.sleep(2000);
			Action_SEPGActivity_PageValidation.Descending_ProductiveSorting();
			Thread.sleep(2000);


			Report.TableEnd();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**************************************************************************************************************
	@Test
	public static void PhasesAdd_Name() throws Throwable
	{
		//code for Navigate to SEPG Phrase Page
		
		Thread.sleep(2000);

		try {
			Report.TableEnd();
			Report.Report_section_Name("Scenario 2 _ Add New SEPG Activity scenario");
			Report.ReporterOutputHeader();
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("SEPGActivity");
			for (int sheetrow = 3; sheetrow <= 3; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 2; sheetcol++) 
				{
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					//error on below line  
					String CellValue = ResultCellValue.toString();
					Add_New_Phrases.add(CellValue);
				}
				//to Navigate
				//Action_SEPGActivity_PageValidation.PageNavigation();
				Thread.sleep(2000);
				//To Add New Phrase
				Action_SEPGActivity_AddNew.addNew(Add_New_Phrases.get(0));
				//Add_New_Phrases.clear();

				//Top Search a Phrases
				Action_SEPGActivity_AddNew.search_Phrases(Add_New_Phrases.get(0));
				Thread.sleep(2000);
				Report.TableEnd();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//********** Scenario 4_To Edit the Phrases Name by clicking the Edit button ****************************************

	@Test
	public static void Edit_PhrasesName() throws Throwable
	{
		try {
			Report.Report_section_Name("Scenario 3 _ Activity Edit scenario.");
			Report.ReporterOutputHeader();
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("SEPGActivity");
			for (int sheetrow = 3; sheetrow <= 3; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) 
				{
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);

					String CellValue = ResultCellValue.toString();
					Edit_PhrasesName.add(CellValue);
				}
				

				Action_SEPGActivity_AddNew.search_Phrases(Edit_PhrasesName.get(0));
				Thread.sleep(2000);

				
				//To Edit the Newly Add New Phrase 
				Action_SEPGActivity_AddNew.Edit_PhraseName(Edit_PhrasesName.get(1));
				
				//Thread.sleep(2000);
				Edit_PhrasesName.clear();

				System.out.println("Phrases Name Edited scenario is completed succesfully.");
				
				Thread.sleep(2000);
				Report.TableEnd();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//**********************************
	@Test
	public static void Delete_PhrasesName() throws Throwable
	{
		try {
			Report.Report_section_Name("Scenario 4 _ Delete Activity scenario.");
			Report.ReporterOutputHeader();
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("SEPGActivity");
			for (int sheetrow = 3; sheetrow <= 3; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) 
				{
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);

					String CellValue = ResultCellValue.toString();
					Edit_PhrasesName.add(CellValue);
				}
				

				Action_SEPGActivity_AddNew.search_Phrases(Edit_PhrasesName.get(1));
				Thread.sleep(2000);

				//search_Phrases(String phrasesToSearch) 
				//To Edit the Newly Add New Phrase 
				Action_SEPGActivity_AddNew.Delete_PhraseName(Edit_PhrasesName.get(1));

				
				System.out.println("Phrases Name Deleted; scenario is completed succesfully.");
				//Add_New_Phrases.clear();


				
				Thread.sleep(2000);
				Report.TableEnd();
			}
			
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
}//END OF CLASS
//***************************************************************************************************************
