package com.yash.RMS.Testcase.ResourceAttribute;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.yash.RMS.TestAction.ResourceAttribute.TestAction_Competency;
import com.yash.RMS.TestAction.ResourceAttribute.TestAction_Ownership;
import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.Setup.ConfigureBrowser;

public class Testcase_Ownership {
	public static List<String> Structure_Library = new ArrayList<String>();
	public static int ModificationFlag = 0;
	public static WebElement from = null;
	public static String OwnershipName,EditOwnership;

	//************************ Open Ownership page*************************************

	@Test
	public static void Ownership_Page() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 1_Ownership page is open.");
		Report.ReporterOutputHeader();
		TestAction_Ownership.OwnershipPage(); 
		TestAction_Ownership.Sorting(); 
		TestAction_Ownership.Pagination(); 
		TestAction_Ownership.RecordsCount(); 	
		Report.TableEnd();
		System.out.println("Scenario 1_Ownership page is open.");

	}

	//************************ New Ownership Creation*************************************
	@Test
	public static void New_Ownership() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 2_New Ownership creation scenario.");
		Report.ReporterOutputHeader();

		//TestAction_Ownership.OwnershipPage();
		//--
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);

		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Ownership");
		for (int sheetrow = 4; sheetrow <= 4; sheetrow++) {
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 2; sheetcol <= 2; sheetcol++) {
				XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				Structure_Library.add(CellValue);
				//System.out.println(Structure_Library);
			}
			//--
			OwnershipName=Structure_Library.get(0);

			TestAction_Ownership.NewOwnership(OwnershipName); 


			Structure_Library.clear();

		}
		ObjWorkBook = null;
		ObjExcelApp.close();
		Report.TableEnd();
		System.out.println("Scenario 2_New Ownership creation scenario is completed.");

	} 
	//************************ Search created Ownership *************************************

	@Test
	public static void Search_Project() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 3_Search Ownership scenario.");
		Report.ReporterOutputHeader();


		TestAction_Ownership.SearchOwnership(OwnershipName); 

		Report.TableEnd();
		System.out.println("Scenario 3_Search Ownership scenario is completed.");
	} 

	//************************ Edit created Ownership *************************************
	@Test
	public static void Edit_Ownership() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 4_Edit Ownership scenario.");
		Report.ReporterOutputHeader();
		//--
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);

		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Ownership");
		for (int sheetrow = 5; sheetrow <= 5; sheetrow++) {
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 2; sheetcol <= 2; sheetcol++) {
				XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				Structure_Library.add(CellValue);
				//System.out.println(Structure_Library);
			}
			//--
			EditOwnership=Structure_Library.get(0);

			TestAction_Ownership.EditOwnership(OwnershipName,EditOwnership); 


			Structure_Library.clear();

		}
		ObjWorkBook = null;
		ObjExcelApp.close();

		Report.TableEnd();
		System.out.println("Scenario 4_Edit Ownership scenario is completed.");
	}


	//************************ Delete Ownership *************************************
	@Test
	public static void Delete_Ownership() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 5_Delete Ownership scenario.");
		Report.ReporterOutputHeader();


		TestAction_Ownership.DeleteOwnership(EditOwnership); 

		Report.TableEnd();
		System.out.println("Scenario 5_Delete Ownership scenario is completed.");
	} 

	//************************  *************************************












}
