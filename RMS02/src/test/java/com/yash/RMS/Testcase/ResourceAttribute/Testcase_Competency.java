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

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.Setup.ConfigureBrowser;
import com.yash.RMS.TestAction.ResourceAttribute.TestAction_Competency;

public class Testcase_Competency {
	
	public static List<String> Structure_Library = new ArrayList<String>();
	public static int ModificationFlag = 0;
	public static WebElement from = null;
	public static String CompetencyName,EditCompetency;

	//************************ Open Competency page*************************************

	 @Test
	public static void Competency_Page() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 1_Competency page is open.");
		Report.ReporterOutputHeader();
		TestAction_Competency.CompetencyPage(); 
		TestAction_Competency.Sorting(); 
		TestAction_Competency.Pagination(); 
		TestAction_Competency.RecordsCount(); 
		Report.TableEnd();
		System.out.println("Scenario 1_Competency page is open.");

	}

	//************************ New Competency Creation*************************************
	@Test
	public static void New_Competency() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 2_New Competency creation scenario.");
		Report.ReporterOutputHeader();
		//--
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Competency");
		for (int sheetrow = 4; sheetrow <= 4; sheetrow++) {
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 2; sheetcol <= 2; sheetcol++) {
				XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				Structure_Library.add(CellValue);
				//System.out.println(Structure_Library);
			}
			//--
			CompetencyName=Structure_Library.get(0);
		
			TestAction_Competency.NewCompetency(CompetencyName); 


	Structure_Library.clear();
		
		}
		ObjWorkBook = null;
		ObjExcelApp.close();
	  Report.TableEnd();
		System.out.println("Scenario 2_New Competency creation scenario is completed.");

	} 
	//************************ Search created Competency *************************************

	@Test
	public static void Search_Competency() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 3_Search Competency scenario.");
		Report.ReporterOutputHeader();
		
		
		TestAction_Competency.SearchCompetency(CompetencyName); 

		Report.TableEnd();
		System.out.println("Scenario 3_Search Competency scenario is completed.");
	} 

	//************************ Edit created Competency *************************************
	@Test
	public static void Edit_Competency() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 4_Edit Competency scenario.");
		Report.ReporterOutputHeader();
		//--
		 	FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
			
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Competency");
			for (int sheetrow = 5; sheetrow <= 5; sheetrow++) {
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 2; sheetcol++) {
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					Structure_Library.add(CellValue);
					//System.out.println(Structure_Library);
				}
				//--
				EditCompetency=Structure_Library.get(0);
			
				TestAction_Competency.EditCompetency(CompetencyName,EditCompetency); 


		Structure_Library.clear();
			
			}
			ObjWorkBook = null;
			ObjExcelApp.close();
		
		Report.TableEnd();
		System.out.println("Scenario 4_Edit Competency scenario is completed.");
	}


	//************************ Delete Competency *************************************
	@Test
	public static void Delete_Competency() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 5_Delete Competency scenario.");
		Report.ReporterOutputHeader();
		
		
		TestAction_Competency.DeleteCompetency(EditCompetency); 

		Report.TableEnd();
		System.out.println("Scenario 5_Delete Competency scenario is completed.");
	} 

	
	

}
