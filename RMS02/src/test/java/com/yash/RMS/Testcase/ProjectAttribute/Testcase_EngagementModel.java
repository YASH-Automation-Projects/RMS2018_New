//package com.yash.RMS.Testcase.MasterData.ProjectAttribute;

package com.yash.RMS.Testcase.ProjectAttribute;

//package com.yash.RMS.Testcase.ProjectAttribute;

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
import com.yash.RMS.TestAction.ProjectAttribute.Action_EngagementModel;

public class Testcase_EngagementModel {
	public static List<String> Add_EngagementModel = new ArrayList<String>();
	public static List<String> Add_EngagementModel1 = new ArrayList<String>();
	public static List<String> Add_EngagementModel2 = new ArrayList<String>();
	/*	@BeforeClass
	public static void SetUp() throws Exception 
	{
		ConfigureBrowser.SetBrowser();
		ConfigureBrowser.URL_Choice();
	}*/
	//************************************************************************************************************************************
	/*	@Test(priority = 1)
	public static void login() throws Throwable
	{
		Report.Report_section_Name("Login");
		Report.ReporterOutputHeader();
		Action_ValidLogin.loginvaliddata();
		Report.TableEnd();
		System.out.println("Login_1_Verify Login with Valid Credential.");
	}
	 */
	//***********************************************************************************************************************************

	//@Test(priority=2)
	@Test
	public static void EngagementModelPageNavigation() throws Throwable{
		try{
			Report.TableEnd();
			Report.Report_section_Name("Scenario 1 _ Master Data _ Project Attribute_ Engagement Model Page Navigation Scenario");
			Report.ReporterOutputHeader();

			Action_EngagementModel.EngagementModelPageNavigation();
			Thread.sleep(2000);
			Action_EngagementModel.ascendingSerialNoSorting();
			Thread.sleep(2000);
			Action_EngagementModel.descendingSerialNoSorting();
			Thread.sleep(2000);
			Action_EngagementModel.ascendingEngagementModelNameSorting();
			Thread.sleep(2000);
			Action_EngagementModel.descendingEngagementModelNameSorting();


			Thread.sleep(2000);
			Report.TableEnd();

		}catch (Exception e){
			e.printStackTrace();
		}
	}
	//********************************************************************************************************************
	@Test
	//@Test(priority=3)
	public static void AddNew_EngagementModel() throws Throwable{
		try{
			
			Report.TableEnd();
			Report.Report_section_Name("Scenario 2 _ Add New Engagement Model scenario");
			Report.ReporterOutputHeader();
			FileInputStream ObjExcelApp =new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook =new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet=ObjWorkBook.getSheet("EngagementModel");
			for (int sheetrow = 1;sheetrow<=1;sheetrow++)
			{
				Row row= ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol=1;sheetcol<=1;sheetcol++)
				{
					XSSFCell ResultCellValue=ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue =ResultCellValue.toString();
					Add_EngagementModel.add(CellValue);
				}
				Thread.sleep(2000);
				Action_EngagementModel.AddNew_EngagementModel(Add_EngagementModel.get(0));
				Thread.sleep(2000);
				Add_EngagementModel.clear();
				Report.TableEnd();
			}


		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//********************************************************************************************************//*
	//@Test(priority=4)
	@Test
	public static void Edit_EngagementModel() throws Throwable{
		try{
			
			Report.TableEnd();
			Report.Report_section_Name("Scenario 3 _ Edit Engagement Model scenario");
			Report.ReporterOutputHeader();
			FileInputStream ObjExcelApp =new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook =new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet=ObjWorkBook.getSheet("EngagementModel");
			for (int sheetrow = 1;sheetrow<=1;sheetrow++)
			{
				Row row= ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol=1;sheetcol<=2;sheetcol++)
				{
					XSSFCell ResultCellValue=ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue =ResultCellValue.toString();
					Add_EngagementModel.add(CellValue);
					Add_EngagementModel1.add(CellValue);
				}

				Action_EngagementModel.search_EngagementModel(Add_EngagementModel.get(0));
				Thread.sleep(2000);

				//To Edit the Newly Add New Phrase 
				Action_EngagementModel.Edit_EngagementModel(Add_EngagementModel1.get(0),Add_EngagementModel1.get(1));
				//Thread.sleep(2000);

				Add_EngagementModel.clear();
				Add_EngagementModel1.clear();

				Report.TableEnd();
			}


		}catch(Exception e){
			e.printStackTrace();
		}
	}
		//**********************************************************************************************
	@Test
	//@Test(priority=5)
	public static void Delete_EngagementModel() throws Throwable {
		try{
			Report.TableEnd();
			Report.Report_section_Name("Scenario 4 _ MasterData _ Project Attribute _ Delete Engagement Model Scenario");
			Report.ReporterOutputHeader();
			FileInputStream ObjExcelApp=new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook= new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet= ObjWorkBook.getSheet("EngagementModel");
			for(int sheetrow = 1; sheetrow<=1;sheetrow++)
			{
				Row row=ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol=2;sheetcol<=2;sheetcol++)
				{
					XSSFCell ResultCellValue=ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					Add_EngagementModel2.add(CellValue);
				}
				//Action_EngagementModel.search_EngagementModel(Add_EngagementModel2.get(0));
				Thread.sleep(2000);
				Action_EngagementModel.Delete_EngagementModel(Add_EngagementModel2.get(0));
				Add_EngagementModel2.clear();
				Report.TableEnd();
			}

		}catch(Exception e){
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
