package com.yash.RMS.Testcase.ResourceAttribute;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.TestAction.ResourceAttribute.TestAction_Visa;

public class Testcase_Visa {
	public static List<String> Structure_Library = new ArrayList<String>();
	public static int ModificationFlag = 0;
	public static WebElement from = null;
	public static String visaName, editName;

	@Test
	public static void Visa_Page() throws Throwable
	{
		Report.TableEnd();
		Report.Report_section_Name("Verify Visa Page is open scenario.");
		Report.ReporterOutputHeader();
		TestAction_Visa.VisaPage();
		TestAction_Visa.Sorting(); 
		TestAction_Visa.Pagination(); 
		TestAction_Visa.RecordsCount(); 

		Report.TableEnd();
		System.out.println("Visa Page is open scenario completed.");
	}
	@Test
	public static String New_VisaCreation() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Verify New Visa creation scenario.");
		Report.ReporterOutputHeader();
		//--
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);

		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Visa");
		for (int sheetrow = 4; sheetrow <= 4; sheetrow++) {
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 2; sheetcol <= 2; sheetcol++) {
				XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				Structure_Library.add(CellValue);
				//System.out.println(Structure_Library);
			}
			//--
			visaName=Structure_Library.get(0);
			TestAction_Visa.NewVisa(visaName);

		//	Structure_Library.clear();

		}
		ObjWorkBook = null;
		ObjExcelApp.close();

		Report.TableEnd();
		System.out.println("New Visa creation scenario is completed.");
		return visaName;
	}

	@Test
	public static void Search_Visa() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Verify Search of recently created Visa scenario.");
		Report.ReporterOutputHeader();

String visaName = New_VisaCreation();
System.out.println(visaName);
		TestAction_Visa.SearchVisa(visaName); 

		Report.TableEnd();
		System.out.println("Search of recently created Visa scenario is completed.");
	} 


	@Test
	public static void Edit_Visa() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Verify Edit Visa scenario.");
		Report.ReporterOutputHeader();
		//--
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);

		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Visa");
		for (int sheetrow = 5; sheetrow <= 5; sheetrow++) {
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 2; sheetcol <= 2; sheetcol++) {
				XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				Structure_Library.add(CellValue);
				//System.out.println(Structure_Library);
			}
			//--
			editName=Structure_Library.get(0);
			TestAction_Visa.EditVisa(visaName,editName); 

			Structure_Library.clear();

		}
		ObjWorkBook = null;
		ObjExcelApp.close();

		Report.TableEnd();
		System.out.println("Edit Visa scenario is completed.");
	}

	@Test
	public static void Delete_Visa() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Verify Delete Visa scenario.");
		Report.ReporterOutputHeader();


		TestAction_Visa.DeleteVisa(editName); 

		Report.TableEnd();
		System.out.println("Delete Visa scenario is completed.");
	} 



}
