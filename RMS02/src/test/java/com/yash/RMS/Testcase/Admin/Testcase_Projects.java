package com.yash.RMS.Testcase.Admin;

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
import com.yash.RMS.TestAction.Admin.TestAction_Projects;

public class Testcase_Projects {
	public static List<String> Structure_Library = new ArrayList<String>();
	static String[] addNewProjectArray = new String[18];
	static String[] editProjectArray = new String[18];
	public static int ModificationFlag = 0;
	public static WebElement from = null;

	
	//***********Projects Page**************************
		@Test
	
		 public static void projects_Page() throws Throwable
		{
		 	Report.TableEnd(); 
		 	Report.Report_section_Name("Verify Projects page is open scenario.");
			Report.ReporterOutputHeader();
			TestAction_Projects.projectsPage(); 
			TestAction_Projects.Sorting(); 
			TestAction_Projects.Status(); 
			TestAction_Projects.Pagination(); 
			TestAction_Projects.RecordsCount(); 
		    Report.TableEnd();
			System.out.println("Projects page is open scenario completed.");
		 
		}
	// Add New Project
		@Test
	
		 public static void add_NewProject() throws Throwable
		{
		 	Report.TableEnd(); 
		 	Report.Report_section_Name("Verify Add New Project scenario.");
		 	Report.ReporterOutputHeader();
		 		 	//--
		 		 	FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		 			
		 			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		 			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Projects");
		 			for (int sheetrow = 4; sheetrow <= 4; sheetrow++) {
		 				Row row = ObjWorkSheet.getRow(sheetrow);
		 				for (int sheetcol = 2; sheetcol <= 19; sheetcol++) {
		 					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
		 					String CellValue = ResultCellValue.toString();
		 					Structure_Library.add(CellValue);
		 					//System.out.println(Structure_Library);
		 				}
		 	 		
		 				//--
		 				for(int i=0;i<18;i++)
		 				{
		 					addNewProjectArray[i]=Structure_Library.get(i);
		 				
		 				}
		 				TestAction_Projects.addNewProject(addNewProjectArray);

		 				Structure_Library.clear();
		 			}
		 			ObjWorkBook = null;
		 			ObjExcelApp.close();

		 	Report.TableEnd();
		 	System.out.println("Add New Project scenario is completed.");
		 }
	// Search already created project
		@Test
	
		 public static void search_Project() throws Throwable
		{
		 	Report.TableEnd(); 
		 	Report.Report_section_Name("Verify Search Project scenario.");
			Report.ReporterOutputHeader();
			TestAction_Projects.searchProject(addNewProjectArray); 
		    Report.TableEnd();
			System.out.println("Search Project scenario completed.");
		 
		}
		
		// Edit Project
				@Test
	
				 public static void edit_Project() throws Throwable
				{
					try{
				 	Report.TableEnd(); 
				 	Report.Report_section_Name("Verify Edit project scenario.");
				 	Report.ReporterOutputHeader();
				 		 	//--
				 		 	FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
				 			
				 			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
				 			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Projects");
				 			for (int sheetrow = 5; sheetrow <= 5; sheetrow++) {
				 				Row row = ObjWorkSheet.getRow(sheetrow);
				 				for (int sheetcol = 2; sheetcol <= 19; sheetcol++) {
				 					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				 					String CellValue = ResultCellValue.toString();
				 					Structure_Library.add(CellValue);
				 					//System.out.println(Structure_Library);
				 				}
				 	 		
				 				//--
				 				for(int i=0;i<18;i++)
				 				{
				 					editProjectArray[i]=Structure_Library.get(i);
				 					
				 				}
				 				TestAction_Projects.editProject(addNewProjectArray,editProjectArray);

				 				Structure_Library.clear();
				 			}
				 			ObjWorkBook = null;
				 			ObjExcelApp.close();

				 	Report.TableEnd();
				 	System.out.println("Edit project scenario is completed.");
				 	
		
				} catch (Exception e) {
					e.printStackTrace();
				}
		
		
				}
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	


