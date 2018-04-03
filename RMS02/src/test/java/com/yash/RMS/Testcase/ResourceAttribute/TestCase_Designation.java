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
import com.yash.RMS.TestAction.ProjectAttribute.Action_InvoiceBy_AddEditDel;
import com.yash.RMS.TestAction.ProjectAttribute.Action_InvoiceBy_PageValidation;
import com.yash.RMS.TestAction.ResourceAttribute.Action_Designation_AddDel;
import com.yash.RMS.TestAction.ResourceAttribute.Action_Designation_PageValidation;
import com.yash.RMS.TestAction.ResourceAttribute.Action_Grade_AddDel;
import com.yash.RMS.TestAction.login.Action_ValidLogin;

public class TestCase_Designation {


	public static List<String> DesignationAdd_name = new ArrayList<String>();
	public static List<String> Editoutput = new ArrayList<String>();

	/*@BeforeClass
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
		System.out.println("Login_1_Verify Login with Valid Credential.");	}
		*/
		//Sorting 
		@Test
		public static void designationPageValidation() throws Throwable
		{
			try {
				Report.TableEnd(); 
				Report.Report_section_Name("Scenario 1_Designation_Page Validation_Validation.");
				Report.ReporterOutputHeader();
				//Thread.sleep(2000);
				
				Action_Designation_PageValidation.designationPage_Navigation();
				//Thread.sleep(2000);
				
				Action_Designation_PageValidation.designationPage_serialNoSorting();
				//Thread.sleep(2000);
				
				Action_Designation_PageValidation.designationPage_descendingSerialNoSorting();
				//Thread.sleep(2000);
				
				Action_Designation_PageValidation.designationPage_ascendingSerialNoSorting();
				//Thread.sleep(2000);
				
				Action_Designation_PageValidation.designationPage_AscendingNameSorting();
				//Thread.sleep(2000);
				
				Action_Designation_PageValidation.designationPage_DescendingNameSorting();
				//Thread.sleep(2000);
				
				Action_Designation_PageValidation.Pagination();
				//Thread.sleep(2000);
				
				Action_Designation_PageValidation.RecordsCount();
				Report.TableEnd();
				System.out.println("Scenario 1_Designation_Page Validation is completed");
				Report.TableEnd();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
//*******************************************************************************************************************		
	@Test
	public static void designationAdd() throws Throwable
	{
		 try {
				Report.TableEnd();
				Report.Report_section_Name("Scenario 2_Add_Designation.");
				Report.ReporterOutputHeader();
				FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Designation");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) 
				{
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					DesignationAdd_name.add(CellValue);
				}
				Action_Designation_AddDel.designationPage_Navigation();
			//	Thread.sleep(2000);
				PageObjects_ResourceAttribute.designation_linkMasterData(Constant.driver).click();
				//Thread.sleep(2000);
				Action_Designation_AddDel.designationPage_Add(DesignationAdd_name.get(0));
				DesignationAdd_name.clear();
				Report.TableEnd();
			}
			System.out.println("Scenario 2_Add_Designation scenario is completed.");
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	 
	//************************************************************************************************************************************************
			//************************ Search For created Invoice By Name *************************************

			@Test
			public static void DesignationNameSearch() throws Throwable
			{
				try {
					Report.TableEnd(); 
					Report.Report_section_Name("Scenario 3_Verify Designation Name Search Functionality.");
					Report.ReporterOutputHeader();
				//	Thread.sleep(4000);
					FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
						@SuppressWarnings("resource")
						XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
						XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Designation");
						for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
						{
							Row row = ObjWorkSheet.getRow(sheetrow);
							for (int sheetcol = 2; sheetcol <= 3; sheetcol++) 
							{
								XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
								String CellValue = ResultCellValue.toString();
								DesignationAdd_name.add(CellValue);
							}
					
							//Thread.sleep(2000);
							Action_Designation_AddDel.SearchDesignationName(DesignationAdd_name.get(0));
					DesignationAdd_name.clear();
					Report.TableEnd();
					System.out.println("Scenario 3 Designation Name Search Functionality scenario is completed.");
						}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
				
	//************************************************************************************************************************************************


	@Test
	public static void designationEdit() throws Throwable 
	{
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 3_Verify Designation Edit Functionality.");
			Report.ReporterOutputHeader();
		//	Thread.sleep(4000);
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Designation");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) 
				{
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					DesignationAdd_name.add(CellValue);
					Editoutput.add(CellValue);
				}
				//Thread.sleep(2000);
				Action_Designation_AddDel.designationPage_searchEdit(DesignationAdd_name.get(0));
				//Thread.sleep(2000);
				Action_Designation_AddDel.designationPage_Edit(Editoutput.get(1));
		//	Thread.sleep(2000);
			DesignationAdd_name.clear();
			Editoutput.clear();
			Report.TableEnd();
			System.out.println("Scenario 3 Designation Edit is completed. ");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	//*********************************************************************************************************
	@Test
	public static void designationDelete() throws Throwable 
	{
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 5_Verify Designation Delete Functionality.");
			Report.ReporterOutputHeader();
		//	Thread.sleep(4000);
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Designation");
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
		//	Thread.sleep(2000);
			Action_Designation_AddDel.designationPage_searchDel((Editoutput.get(0)));
			Action_Designation_AddDel.designationPage_Delete((Editoutput.get(0)));
			Editoutput.clear();
			Editoutput.clear();
			Report.TableEnd();
			System.out.println("Scenario 5_Delete_Designation_scenario is completed. ");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}






}
