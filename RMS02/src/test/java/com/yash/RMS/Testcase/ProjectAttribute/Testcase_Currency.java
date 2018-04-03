package com.yash.RMS.Testcase.ProjectAttribute;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.TestAction.ProjectAttribute.Action_Currency;

public class Testcase_Currency {
	public static List<String> CurrencyValue = new ArrayList<String>(); 
	public static List<String> CurrencyValueEdit = new ArrayList<String>(); 
	public static List<String> CurrencyValueDelete = new ArrayList<String>(); 

	/*@BeforeClass
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
	}
*/
	//***************************************************************************************************************************************
	@Test
	public static void CurrencyPageNavigation() throws Throwable{
		try{
			Report.TableEnd();
			Report.Report_section_Name("Scenario 1 _ Master Data _ Project Attribute_ Currency Page Navigation Scenario");
			Report.ReporterOutputHeader();
			Thread.sleep(2000);
			Action_Currency.CurrencyPageNavigation();
			Thread.sleep(2000);
			Action_Currency.ascendingSerialNoSorting();
			Thread.sleep(2000);
			Action_Currency.descendingSerialNoSorting();
			Thread.sleep(2000);
			Action_Currency.ascendingCurrencyNameSorting();
			Thread.sleep(2000);
			Action_Currency.descendingCurrencyNameSorting();
			
			Report.TableEnd();
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
@Test
public static void Create_Currency() throws Throwable{
	try{
		Report.TableEnd();
		Report.Report_section_Name("Scenario 2 _ Master Data _ Project Attribute_Create Currency Scenario");
		Report.ReporterOutputHeader();
		Thread.sleep(2000);
		FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);

		@SuppressWarnings("resource")
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Currency");
		for (int sheetrow = 2; sheetrow <= 2; sheetrow++) 
		{
			@SuppressWarnings("unused")
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 1; sheetcol <= 1; sheetcol++) 
			{
				XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				//error on below line  
				String CellValue = ResultCellValue.toString();
				//System.out.println(CellValue);
				CurrencyValue.add(CellValue);
			}

			Thread.sleep(2000);
		Action_Currency.Create_Currency(CurrencyValue.get(0));
					
		
		Report.TableEnd();
		}
	}catch (Exception e){
		
		e.printStackTrace();
	}
}


	@Test
	public static void Edit_Currency()throws Throwable{
		try{
			Report.TableEnd();
			Report.Report_section_Name("Scenario 3 _ Master Data _ Project Attribute_Edit Currency Scenario");
			Report.ReporterOutputHeader();
			Thread.sleep(2000);
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);

			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Currency");
			for (int sheetrow = 2; sheetrow <= 2; sheetrow++) 
			{
				@SuppressWarnings("unused")
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 1; sheetcol <= 2; sheetcol++) 
				{
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					//error on below line  
					String CellValue = ResultCellValue.toString();
				//	System.out.println(CellValue);
					CurrencyValueEdit.add(CellValue);
			}
			Thread.sleep(2000);
			Action_Currency.Edit_Currency(CurrencyValueEdit.get(0), CurrencyValueEdit.get(1));
			
			
			
			Report.TableEnd();
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@Test
	public static void Delete_Currency() throws Throwable{
		try {
			Report.TableEnd();
			Report.Report_section_Name("Scenario 4 _ MasterData _ Project Attribute _ Delete Currency Scenario");
			Report.ReporterOutputHeader();
			FileInputStream ObjExcelApp= new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook= new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet= ObjWorkBook.getSheet("Currency");
			for (int sheetrow=2; sheetrow<=2; sheetrow++)
			{
				@SuppressWarnings("unused")
				Row row=ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol=2; sheetcol<=2;sheetcol++)
				{
					XSSFCell ResultCellValue=ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					//error on below line  
					String CellValue=ResultCellValue.toString();
			//		System.out.println(CellValue);
					CurrencyValueDelete.add(CellValue);
				}
				Thread.sleep(2000);
				Action_Currency.Delete_Currency(CurrencyValueDelete.get(0));
				
				Report.TableEnd();	
				
			}
			
			
			
		}catch (Exception e){
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

