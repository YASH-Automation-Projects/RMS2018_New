package com.yash.RMS.Testcase.MiscAttribute;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.TestAction.MasterData.MiscAttribute.TestAction_ParentProjectTeam;
import com.yash.RMS.TestAction.ResourceAttribute.TestAction_Ownership;


public class Testcase_ParentProjectTeam {
	
	public static List<String> Structure_Library = new ArrayList<String>();
	public static int ModificationFlag = 0; 
	public static WebElement from = null;
	public static String ProjectName, ManagerName,EditProject,EditManager;
	
	 //************************ Open Parent Project / Team page*************************************

	 @Test
	 public static void ParentProjectTeam_Page() throws Throwable
	{
	 	Report.TableEnd(); 
	 	Report.Report_section_Name("Scenario 1_Parent Project / Team page is open.");
		Report.ReporterOutputHeader();
		TestAction_ParentProjectTeam.ParentProjectTeamPage();
		TestAction_ParentProjectTeam.Sorting(); 
		TestAction_ParentProjectTeam.Pagination(); 
		TestAction_ParentProjectTeam.RecordsCount(); 	
		
	    Report.TableEnd();
		System.out.println("Scenario 1_Parent Project / Team page is open.");
	 
	}

	//************************ New Parent Project / Team Creation*************************************
	@Test
	public static void New_Project() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 2_New Parent Project / Team creation scenario.");
		Report.ReporterOutputHeader();
		//--
		FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("ParentProjectTeam");
		for (int sheetrow = 4; sheetrow <= 4; sheetrow++) {
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 2; sheetcol <= 3; sheetcol++) {
				XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				Structure_Library.add(CellValue);
				//System.out.println(Structure_Library);
			}
			//--
			ProjectName=Structure_Library.get(0);
			ManagerName=Structure_Library.get(1);
			System.out.println(ProjectName);
			System.out.println(ManagerName);
			
			TestAction_ParentProjectTeam.NewProject(ProjectName, ManagerName); 


	Structure_Library.clear();
		
		}
		ObjWorkBook = null;
		ObjExcelApp.close();
	   Report.TableEnd();
		System.out.println("Scenario 2_New Parent Project / Team creation scenario is completed.");

	} 
	//************************ Search created Parent Project / Team *************************************

	@Test
	public static void Search_Project() throws Throwable
	{
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 3_Search Parent Project / Team scenario.");
		Report.ReporterOutputHeader();
		
		
		TestAction_ParentProjectTeam.SearchProject(ProjectName); 

		Report.TableEnd();
		System.out.println("Scenario 3_Search Parent Project / Team scenario is completed.");
	} 

	//************************ Edit created Parent Project / Team *************************************
	@Test
	public static void Edit_Project() throws Throwable
	{
		
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 4_Edit Parent Project / Team scenario.");
		Report.ReporterOutputHeader();
		//--
		 	FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
			
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("ParentProjectTeam");
			for (int sheetrow = 5; sheetrow <= 5; sheetrow++) {
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 3; sheetcol++) {
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					String CellValue = ResultCellValue.toString();
					Structure_Library.add(CellValue);
					//System.out.println(Structure_Library);
				}
				//--
				EditProject=Structure_Library.get(0);
				EditManager=Structure_Library.get(1);
				
				TestAction_ParentProjectTeam.EditProject(ProjectName,EditProject,EditManager); 


		Structure_Library.clear();
			
			}
			ObjWorkBook = null;
			ObjExcelApp.close();
		
		Report.TableEnd();
		System.out.println("Scenario 4_Edit Parent Project / Team scenario is completed.");
	}
	 
	@Test
	public static void Delete_Project() throws Throwable
	{try {
		Report.TableEnd(); 
		Report.Report_section_Name("Scenario 5_Delete Parent Project / Team scenario.");
		Report.ReporterOutputHeader();
		
		
		TestAction_ParentProjectTeam.DeleteProject(EditProject); 

		Report.TableEnd();
		System.out.println("Scenario 5_Delete Parent Project / Team scenario is completed.");
	
	 
} catch (Exception e) {
	e.printStackTrace();
}
try
{
	if(Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).isDisplayed());                                    

	{              
		Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).click();
		//  Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is navigated to RMS      Home page","Pass",null);
	}
}
catch(Exception e8)
{
	System.out.println( e8.getMessage());

}
	
	}
}
	
	
	
	


