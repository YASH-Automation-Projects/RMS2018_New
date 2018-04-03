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
import com.yash.RMS.TestAction.ResourceAttribute.Action_Designation_AddDel;
import com.yash.RMS.TestAction.ResourceAttribute.Action_Designation_PageValidation;
import com.yash.RMS.TestAction.ResourceAttribute.Action_Location_AddDel;
import com.yash.RMS.TestAction.ResourceAttribute.Action_Location_PageValidation;
import com.yash.RMS.TestAction.login.Action_ValidLogin;

public class TestCase_LocationAddDel{
	public static List<String> LocationAdd_name = new ArrayList<String>();
	public static List<String> LocationAddHR_EmailId = new ArrayList<String>();
	public static List<String> EditLocation_Name = new ArrayList<String>();
	public static List<String> Edit_Location_EmailId = new ArrayList<String>();
	/*@BeforeClass
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
	}*/

	//Sorting 
	//	@Test
	@Test
	public static void locationPageValidation() throws Throwable
	{
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 1_Location_Page_Validation.");
			Report.ReporterOutputHeader();
			//Thread.sleep(2000);

			Action_Location_PageValidation.location_Navigation();
			//Thread.sleep(2000);

			Action_Location_PageValidation.locationPage_serialNoSorting();
			//Thread.sleep(2000);

			Action_Location_PageValidation.locationPage_descendingSerialNoSorting();
			//Thread.sleep(2000);

			Action_Location_PageValidation.locationPage_ascendingSerialNoSorting();
			//Thread.sleep(2000);

			Action_Location_PageValidation.locationPage_AscendingNameSorting();
			//Thread.sleep(2000);

			Action_Location_PageValidation.locationPage_DescendingNameSorting();
			//Thread.sleep(2000);

			Action_Location_PageValidation.locationPage_AscendingLocationHRSorting();
		//	Thread.sleep(2000);

			Action_Location_PageValidation.locationPage_DescendingLocationHRSorting();
			//Thread.sleep(2000);

			Action_Location_PageValidation.Pagination();
			//Thread.sleep(2000);

			Action_Location_PageValidation.RecordsCount();
			Report.TableEnd();

			System.out.println("Scenario 1_Location_Page Validation is completed");
			Report.TableEnd();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//*******************************************************************************************************************		
	//@Test
	@Test
	public static void locationAdd() throws Throwable
	{
		try {
			Report.TableEnd();
			Report.Report_section_Name("Scenario 2_Add_Location.");
			Report.ReporterOutputHeader();

			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Location");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) 
				{
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();

					LocationAdd_name.add(CellValue);
					LocationAddHR_EmailId.add(CellValue);
				}
				//homer location_Navigation
				Action_Location_AddDel.location_Navigation();

				PageObjects_ResourceAttribute.location_linkMasterData(Constant.driver).click();
			//	Thread.sleep(2000);
				Action_Location_AddDel.location_Add(LocationAdd_name.get(0), LocationAddHR_EmailId.get(1));
				LocationAdd_name.clear();
				LocationAddHR_EmailId.clear();
				Report.TableEnd();
			}
			System.out.println("Scenario 2_Add_Location scenario is completed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//*******************************************************************************************************************************************************
	//************************ Search For created Location By Name *************************************
	//@Test
	@Test
	public static void LocationNameSearch() throws Throwable
	{
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 3_Verify Location Name Search Functionality.");
			Report.ReporterOutputHeader();
		//	Thread.sleep(4000);
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Location");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) 
				{
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					LocationAdd_name.add(CellValue);
				}

				//Thread.sleep(2000);
				Action_Location_AddDel.SearchLocationName(LocationAdd_name.get(0));
				LocationAdd_name.clear();
				Report.TableEnd();
				System.out.println("Scenario 3 Location Name Search Functionality scenario is completed.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}

	//************************************************************************************************************************************************
	//@Test
	@Test
	public static void locationEdit() throws Throwable 
	{
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 4_Verify Location Edit Functionality.");
			Report.ReporterOutputHeader();
			//Thread.sleep(4000);
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Location");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 5; sheetcol++) 
				{
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					LocationAdd_name.add(CellValue);
					EditLocation_Name.add(CellValue);
					Edit_Location_EmailId.add(CellValue);
				}
			//	Thread.sleep(2000);
				Action_Location_AddDel.location_search_Edit(LocationAdd_name.get(0));
				//Thread.sleep(2000);
				Action_Location_AddDel.location_EditLocation(EditLocation_Name.get(2), Edit_Location_EmailId.get(3));
				//Thread.sleep(2000);
				LocationAdd_name.clear();
				EditLocation_Name.clear();
				Edit_Location_EmailId.clear();
				Report.TableEnd();
				System.out.println("Scenario 4 Location Edit is completed. ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	//*****************************************************************************************************************************************************************				
	//@Test
	@Test
	public static void locationDelete() throws Throwable 
	{
		try {
			Report.TableEnd(); 
			Report.Report_section_Name("Scenario 5_Verify location Delete Functionality.");
			Report.ReporterOutputHeader();
			//Thread.sleep(4000);
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Location");
			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) 
			{
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 4; sheetcol <= 4; sheetcol++) 
				{
					Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					EditLocation_Name.add(CellValue);
					EditLocation_Name.add(CellValue);

				}}
			Thread.sleep(2000);
			Action_Location_AddDel.location_search_Del(EditLocation_Name.get(0));
		//	Thread.sleep(2000);
			Action_Location_AddDel.location_Delete(EditLocation_Name.get(0));
			EditLocation_Name.clear();
			EditLocation_Name.clear();
			Report.TableEnd();
			System.out.println("Scenario 5_Delete_location_scenario is completed. ");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
//**********************************************************************************************************************************************