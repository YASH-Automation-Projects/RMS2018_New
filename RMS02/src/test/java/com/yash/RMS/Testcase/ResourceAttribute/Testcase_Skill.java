package com.yash.RMS.Testcase.ResourceAttribute;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.ResourceAttribute.PageObjects_ResAttr_Skill;
import com.yash.RMS.TestAction.ResourceAttribute.Action_Skill_AddNewEdit;
import com.yash.RMS.TestAction.ResourceAttribute.Action_Skill_PageValidation;

public class Testcase_Skill{

	public static List<String> Structure_Library = new ArrayList<String>();
	public static List<String> Structure_Library1 = new ArrayList<String>();

	// when we run the TestNG module only then only  UNCOMMENT  the below code other wise comment it   
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
	//************Scenario 1_Sepg Skill_PageValidation; Pagination: RecordsCount: serialNoSorting: ascending and Descending and all***************************************************************************************************************
	//Sorting 
	@Test
	//@Test(priority = 2)
	public static void Skill_PageValidation() throws Throwable
	{
		try {
			Report.Report_section_Name("Scenario_01 Skill Page Validation Scenario .");
			Report.ReporterOutputHeader();
			Thread.sleep(2000);
			// to PageNavigation
			Action_Skill_PageValidation.SkillPage_Navigation();
			Thread.sleep(2000);

			Action_Skill_PageValidation.Pagination();
			Thread.sleep(2000);

			Action_Skill_PageValidation.RecordsCount();
			Thread.sleep(2000);

			Action_Skill_PageValidation.serialNoSorting_SkillPage();
			Thread.sleep(2000);

			Action_Skill_PageValidation.ascendingSerialNoSorting_SkillPage();
		Thread.sleep(2000);

			Action_Skill_PageValidation.descendingSerialNoSorting_SkillPage();
		Thread.sleep(2000);

			Action_Skill_PageValidation.ascendingSorting_SkillName();
			Thread.sleep(2000);

			Action_Skill_PageValidation.decendingSorting_SkillName();
		Thread.sleep(2000);

			Action_Skill_PageValidation.ascendingSorting_SkillType();
			Thread.sleep(2000);

			Action_Skill_PageValidation.descendingSorting_SkillType();
			Thread.sleep(2000);
			//with out the else look p
			//***TO Collapse the Menu for Master Data *to NEUTRALISE TEH NAVIGATION flow in Reverse order ***************************************
			//****************************************
		/*	Thread.sleep(4000);
			if(PageObjects_ResAttr_Skill.lnk_ResourceAttribute(Constant.driver).isDisplayed()) {
				PageObjects_ResAttr_Skill.lnk_ResourceAttribute(Constant.driver).click();
				//Report.ReporterOutput("STEP","Verify Master Data Link is displayed ","Master Data link", "Click on Master Data Link","Master Data Link should be displayed and clicked", "Pass", null);
			} else {
					//	Report.ReporterOutput("STEP","Verify Master Data Link is displayed ","Master Data link", "Click on Master Data Link","Master Data Link should not be displayed and clicked","Fail",null);
				}
			Thread.sleep(2000);
			if(PageObjects_ResAttr_Skill.lnk_MasterData(Constant.driver).isDisplayed()) {
				PageObjects_ResAttr_Skill.lnk_MasterData(Constant.driver).click();
				//Report.ReporterOutput("STEP","Verify Master Data Link is displayed ","Master Data link", "Click on Master Data Link","Master Data Link should be displayed and clicked", "Pass", null);
			} else {
					//	Report.ReporterOutput("STEP","Verify Master Data Link is displayed ","Master Data link", "Click on Master Data Link","Master Data Link should not be displayed and clicked","Fail",null);
				}
				} catch (Exception e) {
				System.out.println("Ïssue in Colapse of Menu in Reverse order ");
			}
			Thread.sleep(2000);
			//****************************************

			//with out the else look p
			//***TO Collapse the Menu for Master Data *to NEUTRALISE TEH NAVIGATION flow in Reverse order ***************************************
			//****************************************
			try {
				(Constant.driver).manage().window().maximize();
				if(PageObjects_ResAttr_Skill.lnk_ResourceAttribute(Constant.driver).isDisplayed()) {
					PageObjects_ResAttr_Skill.lnk_ResourceAttribute(Constant.driver).click();
					//Report.ReporterOutput("STEP","Verify Master Data Link is displayed ","Master Data link", "Click on Master Data Link","Master Data Link should be displayed and clicked", "Pass", null);
				} else {
					//	Report.ReporterOutput("STEP","Verify Master Data Link is displayed ","Master Data link", "Click on Master Data Link","Master Data Link should not be displayed and clicked","Fail",null);
				}
				Thread.sleep(2000);

				(Constant.driver).manage().window().maximize();
				if(PageObjects_ResAttr_Skill.lnk_MasterData(Constant.driver).isDisplayed()) {
					PageObjects_ResAttr_Skill.lnk_MasterData(Constant.driver).click();
					//Report.ReporterOutput("STEP","Verify Master Data Link is displayed ","Master Data link", "Click on Master Data Link","Master Data Link should be displayed and clicked", "Pass", null);
				} else {
					//	Report.ReporterOutput("STEP","Verify Master Data Link is displayed ","Master Data link", "Click on Master Data Link","Master Data Link should not be displayed and clicked","Fail",null);
				}*/
			/*} catch (Exception e) {
				System.out.println("Ïssue in Colapse of Menu in Reverse order ");
			}*/
			Thread.sleep(2000);
			//****************************************
			//*
			//***TO Collapse the Menu for Master Data *to NEUTRALISE TEH NAVIGATION flow in Reverse order ***************************************
			/*try {
				(Constant.driver).manage().window().maximize();
				if(PageObjects_ResAttr_Skill.lnk_ResourceAttribute(Constant.driver).isDisplayed()) {
					PageObjects_ResAttr_Skill.lnk_ResourceAttribute(Constant.driver).click();
					//Report.ReporterOutput("STEP","Verify Master Data Link is displayed ","Master Data link", "Click on Master Data Link","Master Data Link should be displayed and clicked", "Pass", null);
				} else {
					//	Report.ReporterOutput("STEP","Verify Master Data Link is displayed ","Master Data link", "Click on Master Data Link","Master Data Link should not be displayed and clicked","Fail",null);
				}
				Thread.sleep(2000);

				(Constant.driver).manage().window().maximize();
				if(PageObjects_ResAttr_Skill.lnk_MasterData(Constant.driver).isDisplayed()) {
					PageObjects_ResAttr_Skill.lnk_MasterData(Constant.driver).click();
					//Report.ReporterOutput("STEP","Verify Master Data Link is displayed ","Master Data link", "Click on Master Data Link","Master Data Link should be displayed and clicked", "Pass", null);
				} else {
					//	Report.ReporterOutput("STEP","Verify Master Data Link is displayed ","Master Data link", "Click on Master Data Link","Master Data Link should not be displayed and clicked","Fail",null);
				}
			} catch (Exception e) {
				System.out.println("Ïssue in Colapse of Menu in Reverse order ");
			}
			Thread.sleep(2000);*/
			//********************************************

			Report.TableEnd();
		//	System.out.println("Scenario_01 Skill Page Validation Scenario completed succcessfully .");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	// ************************** Add New Skill Type********************************************** //
	@Test
	//@Test(priority = 1)
	public static void AddNew_SkillType() throws Throwable
	{
		//**to navigate to skill page: when we run individuall the need to Uncomment the below code other wise not , when wee run for all Module with Navigation then no need  ***********
		/*	try {

			Thread.sleep(2000);
			(Constant.driver).manage().window().maximize();
			if(PageObjects_ResAttr_Skill.lnk_MasterData(Constant.driver).isDisplayed()) {
				PageObjects_ResAttr_Skill.lnk_MasterData(Constant.driver).click();
				//Report.ReporterOutput("STEP","Verify Master Data Link is displayed ","Master Data link", "Click on Master Data Link","Master Data Link should be displayed and clicked", "Pass", null);
			} else {
				//Report.ReporterOutput("STEP","Verify Master Data Link is displayed ","Master Data link", "Click on Master Data Link","Master Data Link should not be displayed and clicked","Fail",null);
			}
			Thread.sleep(2000);
			//Thread.sleep(4000);
			//click on Resource Attribute Link
			//issue 2nd time it is not visible 
			if(PageObjects_ResAttr_Skill.lnk_ResourceAttribute(Constant.driver).isDisplayed()) {
				PageObjects_ResAttr_Skill.lnk_ResourceAttribute(Constant.driver).click();
				//Report.ReporterOutput("STEP","Resource Attribute Link is displayed ","Resource Attribute Link","Click on Resource Attribute Link","Resource Attribute Link should be displayed and clicked","Pass",null);
			}
			else {
				//	Report.ReporterOutput("STEP","Resource Attribute Link is displayed ","Resource Attribute Link","Click on Resource Attribute Link","Resource Attribute Link  is not displayed","Fail",null);
			}
			//click on Skill Link
			Thread.sleep(2000);
			if (PageObjects_ResAttr_Skill.lnk_Skill(Constant.driver).isDisplayed()) {
				PageObjects_ResAttr_Skill.lnk_Skill(Constant.driver).click();
				//Report.ReporterOutput("STEP","Verify Skill Link is displayed ","Skill Link","Click on Skill Link","Skill Link should be displayed and clicked","Pass",null);
			}
			else {
				//Report.ReporterOutput("STEP","Verify Skill Link is displayed ","Skill Link","Click on Skill Link","Skill Link should not be displayed and clicked","Fail",null);
			}
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Exception in the Skill page Navigation");
		}*/

		//**************************************
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario_02_Add New Skill Name Type Scenario ");
			Report.ReporterOutputHeader();

			//****NAVIGATION  to  Skill page : to Navigate to Skill Search page : when run Individually  then***  
			Action_Skill_PageValidation.SkillPage_Navigation();

			//Problem :to click on the Skill NAme column once aging to take in Ascending ordwer  asn whenw e clcik on Add new it will not be dispaleyd hence
			//click on skillNameSorting to get the default position sorting for  Skill Type 
			//##Error here e##s
			PageObjects_ResAttr_Skill.skillNameSorting(Constant.driver).click();
			Thread.sleep(2000);
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Skill");
			for (int sheetrow = 3; sheetrow <= 3; sheetrow++) {
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 1; sheetcol <= 1; sheetcol++) {
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					Structure_Library.add(CellValue);
				//	System.out.println(Structure_Library);
				}
				Action_Skill_AddNewEdit.Add_NewSkillNameType(Structure_Library.get(0));
				Thread.sleep(2000);
				Structure_Library.clear();
			}
			ObjWorkBook = null;
			ObjExcelApp.close();

			Report.TableEnd();

		//	System.out.println("Scenario_02_Add New Skill Type Scenario completed succcessfully .");
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	//****************Scenario_03_New SkillType Search scenario.**********************************************************************************************
	@Test
	//@Test(priority = 2)
	public static void Search_NewSkillType() throws Throwable
	{
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario_03_New Skill Type Search Scenario");
			Report.ReporterOutputHeader();

			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings({ "resource" })
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Skill");
			for (int sheetrow = 3; sheetrow <= 3; sheetrow++) {
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 1; sheetcol <= 1; sheetcol++) {
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					Structure_Library.add(CellValue);
					//	System.out.println(Structure_Library);
				}
				Thread.sleep(5000);
				Action_Skill_AddNewEdit.Search_NewSkillType1(Structure_Library.get(0)); 
				Thread.sleep(2000);
				Structure_Library.clear();
			}
			ObjWorkBook = null;
			ObjExcelApp.close();

			Report.TableEnd();

		//	System.out.println("Scenario_03_New Skill Type Search Scenario completed successfully .");
		} catch (Exception e3) {
			e3.printStackTrace();
		}
	}
	//***************Scenario 3_Update the Skill Type Name Scenario   .**********************************************************************************************
	@Test
	//@Test(priority = 3)
	public static void Update_SkillTypeName() throws Throwable
	{
		Thread.sleep(2000);
		try {
			Report.TableEnd();
			Report.Report_section_Name("Scenario 04_Update the Skill Type Name Scenario .");
			Report.ReporterOutputHeader();

			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Skill");
			for (int sheetrow = 3; sheetrow <= 3; sheetrow++) 
			{
				@SuppressWarnings("unused")
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 1; sheetcol <= 3; sheetcol++) 
				{
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					//	Add_New_Phases.add(CellValue);
					Structure_Library.add(CellValue);
				}
				Thread.sleep(2000);
				//To Search Skill type which is already created ,then update it   
				Action_Skill_AddNewEdit.Search_NewSkillType1(Structure_Library.get(0)); 
				Thread.sleep(2000);

				//To Update : //To Search Skill type which is already created ,then update it   
				Action_Skill_AddNewEdit.Update_SkillTypeName1(Structure_Library.get(2)); 
				Thread.sleep(2000);
				//to clear the array 
				Structure_Library.clear();
				Thread.sleep(2000);
			//	System.out.println("Scenario 04 Update the Skill Type Name Scenario Completed Succcessfully .");
				Report.TableEnd();

			}
		} catch (Exception e4) {
			e4.printStackTrace();
		}
	}
	//***********************************************************************************************
	//@Test(priority = 4)
	@Test
	public static void Delete_SkillTypeName() throws Throwable
	{
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 05_Delete Updated Skill Type Name Scenario");
			Report.ReporterOutputHeader();

			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);

			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Skill");
			for (int sheetrow = 3; sheetrow <= 3; sheetrow++) {
				@SuppressWarnings("unused")
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 3; sheetcol <= 3; sheetcol++) {
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					Structure_Library.add(CellValue);
					//System.out.println(Structure_Library);
				}
				Thread.sleep(2000);
				//To Delete the SEarch Skill Type Name   
				Action_Skill_AddNewEdit.Delete_SkillTypeName1(Structure_Library.get(0)); 
				Thread.sleep(2000);
				Structure_Library.clear();
			}
			ObjWorkBook = null;
			ObjExcelApp.close();

			Report.TableEnd();

		//	System.out.println("Scenario 05_Delete Updated Skill Type Name Scenario Completed Successfully ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}//END OF CLASS
//************************************************************************************************************************************************
