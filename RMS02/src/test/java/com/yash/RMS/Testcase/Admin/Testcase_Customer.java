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
import com.yash.RMS.TestAction.Admin.Action_Customeradd;
import com.yash.RMS.TestAction.Admin.Action_Customers;
 

public class Testcase_Customer
{
	
	public static List<String> Customers = new ArrayList<String>();
	@SuppressWarnings({ "resource", "unused" })
	@Test
	
	public static void Customer_List() throws Throwable
	{	
		Report.TableEnd();
		Report.Report_section_Name("Verify Customer Page");
		Report.ReporterOutputHeader();
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Customers");
		for (int sheetrow =5; sheetrow <= 5; sheetrow++) 
		{
			 
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 1; sheetcol <= 1; sheetcol++) 
			{
				Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				System.out.println(CellValue);
				Customers.add(CellValue);
			}
			 
			Action_Customers.Customers(Customers.get(0));
			Customers.clear();
			
		}
		ObjWorkBook = null;
		ObjExcelApp.close();
		Report.TableEnd();	 
		System.out.println("Verify Customer Scenario completed.");			
	}
	
	@SuppressWarnings({ "unused", "resource" })
	@Test
	
	public static void Customeradd() throws Throwable
	{	
		Report.TableEnd();
		Report.Report_section_Name("Add Customer Details.");
		Report.ReporterOutputHeader();
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Customers");
		for (int sheetrow =2; sheetrow <= 2; sheetrow++) 
		{
			 
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 1; sheetcol <= 6; sheetcol++) 
			{
				Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				System.out.println(CellValue);
				Customers.add(CellValue);
			}
			 
			Action_Customeradd.Customersadd(Customers.get(0),Customers.get(1),Customers.get(2),Customers.get(3),Customers.get(4),Customers.get(5));
			Customers.clear();
				
		}
		ObjWorkBook = null;
		ObjExcelApp.close();
		Report.TableEnd();	 
		System.out.println("Add Customer Details Scenario completed.");			
	}
	
					
	
	@SuppressWarnings({ "resource", "unused" })
	@Test
	
	public static void Customerupdate() throws Throwable
	{	
		Report.TableEnd();
		Report.Report_section_Name("Update Customer Details.");
		Report.ReporterOutputHeader();
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Customers");
		for (int sheetrow =8; sheetrow <= 8; sheetrow++) 
		{
			 
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 1; sheetcol <= 6; sheetcol++) 
			{
				Cell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				System.out.println(CellValue);
				Customers.add(CellValue);
			}
			 
			
			 Action_Customeradd.Customersupdate(Customers.get(0),Customers.get(1),Customers.get(2),Customers.get(3),Customers.get(4),Customers.get(5));
			 Customers.clear();
				
		}
		ObjWorkBook = null;
		ObjExcelApp.close();
		Report.TableEnd();	 
		System.out.println("Update Customer Details Scenario completed.");			
	}
	
					
	

}
