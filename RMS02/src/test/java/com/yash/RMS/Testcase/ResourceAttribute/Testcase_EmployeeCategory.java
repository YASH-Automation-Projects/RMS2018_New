package com.yash.RMS.Testcase.ResourceAttribute;
import org.testng.annotations.Test;

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
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.TestAction.ResourceAttribute.TestAction_EmployeeCategory;
import com.yash.RMS.CustomProperties.Constant;


public class Testcase_EmployeeCategory {
	public static List<String> Structure_Library = new ArrayList<String>();
	public static int ModificationFlag = 0;
	public static WebElement from = null;
	public static String EmployeeCategoryName,EditEmployeeCategory;

	//************************ Open Employee Category page*************************************

	@Test
	public static void EmployeeCategory_Page() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Verify Employee Category page.");
		Report.ReporterOutputHeader();
		TestAction_EmployeeCategory.EmployeeCategoryPage(); 
		TestAction_EmployeeCategory.ascendingEmployeeCategoryNameSorting(); 
		TestAction_EmployeeCategory.Pagination();
		TestAction_EmployeeCategory.RecordsCount();
		Report.TableEnd();
		System.out.println("Employee Category page scenario completed.");

	}

	
	//************************ New Employee Category Creation*************************************
	@Test
	public static void NewEmployeeCategory() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Verify Employee Category Add Functionality.");
		Report.ReporterOutputHeader();
		//--
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Employee Category");
		for (int sheetrow = 4; sheetrow <= 4; sheetrow++) {
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 2; sheetcol <= 2; sheetcol++) {
				XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				Structure_Library.add(CellValue);
				//System.out.println(Structure_Library);
			}
			//--
			EmployeeCategoryName = Structure_Library.get(0);
		
			TestAction_EmployeeCategory.NewEmployeeCategory(EmployeeCategoryName); 


	Structure_Library.clear();
		
		}
		ObjWorkBook = null;
		ObjExcelApp.close();
	Report.TableEnd();
		System.out.println("Employee Category Add Functionality scenario is completed.");

	} 
	//************************ Search created Employee Category *************************************

	@Test
	public static void Search_Project() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Verify Employee Category Search Functionality.");
		Report.ReporterOutputHeader();
		
		
		TestAction_EmployeeCategory.SearchEmployeeCategory(EmployeeCategoryName); 

		Report.TableEnd();
		System.out.println("Employee Category Search Functionality scenario is completed.");
	} 

	//************************ Edit created Employee Category *************************************
	@Test
	public static void Edit_EmployeeCategory() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Verify Employee Category Edit Functionality.");
		Report.ReporterOutputHeader();
		//--
		 	FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
			
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Employee Category");
			for (int sheetrow = 5; sheetrow <= 5; sheetrow++) {
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 2; sheetcol++) {
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					Structure_Library.add(CellValue);
					//System.out.println(Structure_Library);
				}
				//--
				EditEmployeeCategory=Structure_Library.get(0);
			
				TestAction_EmployeeCategory.EditEmployeeCategory(EmployeeCategoryName,EditEmployeeCategory); 


		Structure_Library.clear();
			
			}
			ObjWorkBook = null;
			ObjExcelApp.close();
		
		Report.TableEnd();
		System.out.println("Employee Category Edit Functionality scenario is completed.");
	}


	//************************ Delete Employee Category *************************************
	@Test
	public static void Delete_EmployeeCategory() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Verify Employee Category Delete Functionality.");
		Report.ReporterOutputHeader();
		
		
		TestAction_EmployeeCategory.DeleteEmployeeCategory(EditEmployeeCategory); 

		Report.TableEnd();
		System.out.println("Employee Category Delete Functionality scenario is completed.");
	}


	
	
	
	
	
	
}
