package com.yash.RMS.Testcase.ResourceAttribute;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.ResourceAttribute.PageObjects_ResourceAttribute;
import com.yash.RMS.Setup.ConfigureBrowser;
import com.yash.RMS.TestAction.ResourceAttribute.Action_Grade_AddDel;
import com.yash.RMS.TestAction.ResourceAttribute.Action_Grade_PageValidation;
import com.yash.RMS.TestAction.login.Action_ValidLogin;

public class TestCase_Grade {

	public static List<String> GradeAdd_name = new ArrayList<String>();
	public static List<String> Editoutput = new ArrayList<String>();

	/*	@BeforeClass
	public static void SetUp() throws Exception 
	{
		ConfigureBrowser.SetBrowser();
		ConfigureBrowser.URL_Choice();
	}
	@Test
	public static void login() throws Throwable
	{
		Report.Report_section_Name("Login");
		Report.ReporterOutputHeader();
		Action_ValidLogin.loginvaliddata();
		Report.TableEnd();
		System.out.println("Login_1_Verify Login with Valid Credential.");
	}*/


	@Test
	public static void gradePageValidation() throws Throwable
	{
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 1_Grade_Page Validation.");
			Report.ReporterOutputHeader();
			
			Action_Grade_PageValidation.grade_Navigation();
			//Thread.sleep(2000);
			
			Action_Grade_PageValidation.gradePage_serialNoSorting();
		//	Thread.sleep(2000);
			
			Action_Grade_PageValidation.gradePage_descendingSerialNoSorting();
		//	Thread.sleep(2000);
			
			Action_Grade_PageValidation.gradePage_ascendingSerialNoSorting();
		//	Thread.sleep(2000);
			
			Action_Grade_PageValidation.gradePage_AscendingNameSorting();
			//Thread.sleep(2000);
			
			Action_Grade_PageValidation.gradePage_DescendingNameSorting();
			//Thread.sleep(2000);
			
			Action_Grade_PageValidation.Pagination();
			
			Action_Grade_PageValidation.RecordsCount();
			Report.TableEnd();
			System.out.println("Scenario 1_Grade_Page Validation is completed");
			Report.TableEnd();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//*******************************************************************************************************************	

	@Test
	public static void gradeAdd() throws Throwable
	{
		try {
			Report.TableEnd();
			Report.Report_section_Name("Scenario 2_Add_Grade.");
			Report.ReporterOutputHeader();
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Grade");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) 
				{
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					GradeAdd_name.add(CellValue);
				}
				Action_Grade_PageValidation.grade_Navigation();
				//Thread.sleep(2000);
				PageObjects_ResourceAttribute.grade_linkMasterData(Constant.driver).click();
				//Thread.sleep(2000);
				Action_Grade_AddDel.gradePage_Add(GradeAdd_name.get(0));
				GradeAdd_name.clear();
				Report.TableEnd();
			}
			System.out.println("Scenario 2_Add_Grade scenario is completed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//************************************************************************************************************************************************
	//************************ Search For created Invoice By Name *************************************

	@Test
	public static void GradeNameSearch() throws Throwable
	{
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 3_Verify Grade Name Search Functionality.");
			Report.ReporterOutputHeader();
			//Thread.sleep(4000);
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Grade");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) 
				{
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					GradeAdd_name.add(CellValue);
				}

			//	Thread.sleep(2000);
				Action_Grade_AddDel.SearchGradeName(GradeAdd_name.get(0));
				GradeAdd_name.clear();
				Report.TableEnd();
				System.out.println("Scenario 3 Grade Name Search Functionality scenario is completed.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}

	//************************************************************************************************************************************************
	@Test
	public static void gradeEdit() throws Throwable 
	{
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 4_Verify Grade Edit Functionality.");
			Report.ReporterOutputHeader();
		//	Thread.sleep(4000);
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Grade");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) 
				{
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					GradeAdd_name.add(CellValue);
					Editoutput.add(CellValue);
				}
			//	Thread.sleep(2000);
				Action_Grade_AddDel.gradePage_searchEdit(GradeAdd_name.get(0));
				//Thread.sleep(2000);
				Action_Grade_AddDel.gradePage_Edit(Editoutput.get(1));
				//Thread.sleep(2000);
				GradeAdd_name.clear();
				Editoutput.clear();
				Report.TableEnd();
				System.out.println("Scenario 4 Grade Edit is completed. ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	//*********************************************************************************************************
	@Test
	public static void gradeDelete() throws Throwable 
	{
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 5_Verify Grade Delete Functionality.");
			Report.ReporterOutputHeader();
		//	Thread.sleep(4000);
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Grade");
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
			Action_Grade_AddDel.gradePage_searchDel((Editoutput.get(0)));
			Action_Grade_AddDel.gradePage_Delete((Editoutput.get(0)));
			Editoutput.clear();
			Editoutput.clear();
			Report.TableEnd();
			System.out.println("Scenario 5_Delete_Grade_scenario is completed. ");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}


























}
