package com.yash.RMS.Testcase.Admin;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.TestAction.Admin.Action_Resource_add;
import com.yash.RMS.TestAction.Admin.Action_Resource_update;
import com.yash.RMS.TestAction.Admin.Action_Resources;

public class Testcase_Resources 
{
	public static List<String> Resources = new ArrayList<String>();
	@Test
		public static void Resources_List() throws Throwable
	{	
		Thread.sleep(2000);
		Report.TableEnd();
		Report.Report_section_Name("Verify Resources Page");
		Report.ReporterOutputHeader();
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		@SuppressWarnings("resource")
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Resources");
		for (int sheetrow =6; sheetrow <= 6; sheetrow++) 
		{
			@SuppressWarnings("unused")
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 1; sheetcol <= 7; sheetcol++) 
			{
				Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				System.out.println(CellValue);
				Resources.add(CellValue);
			}
			
			Action_Resources.Resources(Resources.get(0),Resources.get(1),Resources.get(2),Resources.get(3),Resources.get(4),Resources.get(5),Resources.get(6));
			Resources.clear();
						
		}
		ObjWorkBook = null;
		ObjExcelApp.close();
		Report.TableEnd();
		
		System.out.println("Verify Resources Page Scenario Completed."); 
		
					
	}
		
	@Test
	
	public static void Resources_add() throws Throwable
	{	
		Report.TableEnd();
		Report.Report_section_Name("Verify Resources Add Functionality.");
		Report.ReporterOutputHeader();
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		@SuppressWarnings("resource")
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Resources");
		for (int sheetrow =2; sheetrow <= 2; sheetrow++) 
		{
			@SuppressWarnings("unused")
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 1; sheetcol <= 32; sheetcol++) 
			{
				Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				//System.out.println(CellValue);
				Resources.add(CellValue);
			}

			Action_Resource_add.Add(Resources.get(0),Resources.get(1),Resources.get(2),Resources.get(3),Resources.get(4),Resources.get(5),
			Resources.get(6),Resources.get(7),Resources.get(8),Resources.get(9),Resources.get(10),Resources.get(11),Resources.get(12)
			,Resources.get(13),Resources.get(14),Resources.get(15),Resources.get(16),Resources.get(17),Resources.get(18),Resources.get(19),
			Resources.get(20),Resources.get(21),Resources.get(22),Resources.get(23),Resources.get(24),Resources.get(25),Resources.get(26),
			Resources.get(27),Resources.get(28),Resources.get(29),Resources.get(30),Resources.get(31));
			
			Resources.clear();
		}
		ObjWorkBook = null;
		ObjExcelApp.close();
		Report.TableEnd();
		System.out.println("Verify Resources Add Functionality Scenario Completed.");
	}
		
	
	
	@Test
	
	public static void Resources_update() throws Throwable
	{	
		Report.TableEnd();
		Report.Report_section_Name("Verify Resources Update Functionality.");
		Report.ReporterOutputHeader();
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		@SuppressWarnings("resource")
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Resources");
		for (int sheetrow = 9; sheetrow <= 9; sheetrow++) 
		{
			@SuppressWarnings("unused")
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 1; sheetcol <= 32; sheetcol++) 
			{
				Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				System.out.println(CellValue);
				Resources.add(CellValue);
			}

			Action_Resource_update.update(Resources.get(0),Resources.get(1),Resources.get(2),Resources.get(3),Resources.get(4),Resources.get(5),
			Resources.get(6),Resources.get(7),Resources.get(8),Resources.get(9),Resources.get(10),Resources.get(11),Resources.get(12)
			,Resources.get(13),Resources.get(14),Resources.get(15),Resources.get(16),Resources.get(17),Resources.get(18),Resources.get(19),
			Resources.get(20),Resources.get(21),Resources.get(22),Resources.get(23),Resources.get(24),Resources.get(25),Resources.get(26),
			Resources.get(27),Resources.get(28),Resources.get(29),Resources.get(30),Resources.get(31));
			
			Resources.clear();
		}
		ObjWorkBook = null;
		ObjExcelApp.close();
		Report.TableEnd();
		System.out.println("Verify Resources Update Functionality Scenario Completed.");
	}
		
	
}	

		
 