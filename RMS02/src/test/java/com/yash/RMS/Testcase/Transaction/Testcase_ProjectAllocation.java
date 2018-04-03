package com.yash.RMS.Testcase.Transaction;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.Setup.ConfigureBrowser;
import com.yash.RMS.TestAction.Transaction.Action_ProjectAllocation;
import com.yash.RMS.TestAction.Transaction.Action_ProjectAllocation;
import com.yash.RMS.TestAction.login.Action_ValidLogin;

public class Testcase_ProjectAllocation {
	
	public static List<String> AddNewResource = new ArrayList<String>(); 
	public static List<String> DeleteResource= new ArrayList<String>();
	public static List<String> EditResourceDetails= new ArrayList<String>();
	
//	@BeforeClass
//	public static void Setup() throws Exception
//	{
//		 Runtime.getRuntime().exec("D:\\Project\\RMS2.0\\Automation_RMS_27-Dec-2017\\Automation_RMS_27-Dec-2017\\AutoItAuthenticationScript.exe");
//		ConfigureBrowser.SetBrowser();
//		ConfigureBrowser.URL_Choice();
//	}
	//********************************************************************************
//	@Test(priority=1)
//	public static void login() throws Throwable
//	{
//		Report.TableEnd();
//		Report.Report_section_Name("Login");
//		Report.ReporterOutputHeader();
//		Action_ValidLogin.loginvaliddata();
//		System.out.println("Login_1_Verify Login with Valid Credential.");
//		Report.TableEnd();
//	}
	
	@Test(priority=1)
	public static void Transaction_ProjectAllocationNavigation() throws Throwable
	{
		Report.TableEnd();
		Report.Report_section_Name("Scenario 1 _Transaction_Project Allocation Page Navigation Scenario");
		Report.ReporterOutputHeader();
		Action_ProjectAllocation.ProjectAllocationPageNavigation();
		Thread.sleep(4000);
		Action_ProjectAllocation.ascendingProjectNameSorting();
		Thread.sleep(4000);
		Action_ProjectAllocation.descendingProjectNameSorting();
		Thread.sleep(4000);
		Action_ProjectAllocation.ascendingCustomerNameSorting();
		Thread.sleep(4000);
		Action_ProjectAllocation.descendingCustomerNameSorting();
		Thread.sleep(4000);
		Action_ProjectAllocation.ascendingOffshoreManagerSorting();
		Thread.sleep(4000);
		Action_ProjectAllocation.descendingOffshoreManagerSorting();
		Thread.sleep(4000);
		Action_ProjectAllocation.ascendingOnsiteManagerSorting();
		Thread.sleep(4000);
		Action_ProjectAllocation.descendingOnsiteManagerSorting();
		Thread.sleep(4000);
		Action_ProjectAllocation.ascendingProjectKickoffDateSorting();
		Thread.sleep(4000);
		Action_ProjectAllocation.descendingProjectKickoffDateSorting();
		Thread.sleep(4000);
		Action_ProjectAllocation.ascendingProjectEndDateSorting();
		Thread.sleep(4000);
		Action_ProjectAllocation.descendingProjectEndDateSorting();
		Thread.sleep(4000);
		Action_ProjectAllocation.Pagination();
		Thread.sleep(4000);
		Action_ProjectAllocation.RecordsCount();
	
		
		Report.ReporterOutputHeader();
		Report.TableEnd();
	}
	
	@Test(priority=2)
	public static void Transaction_AddNewResourceToProject() throws Throwable
	{
		try{
			Report.TableEnd();
			Report.Report_section_Name("Scenario 2 _Transaction_Project Allocation_Add New Resource To Project Scenario");
			Report.ReporterOutputHeader();
	
			
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("ProjectAllocation");
			
			for(int row=2;row<=2; row++)

			{
				
					for(int col=1; col<=6; col++)
					{
						XSSFCell result=ObjWorkSheet.getRow(row).getCell(col);
		
						String CellValue=result.toString();
						System.out.println(CellValue);
						
						AddNewResource.add(CellValue);
		
		
					}

				
			
			}
			
		}catch (Exception e){

			e.printStackTrace();
		}
		
		Action_ProjectAllocation.AddNewResourceToProject(AddNewResource);
		Report.TableEnd();
	}
	
	@Test(priority=4)
	public static void Transaction_DeleteResourceFromProject() throws Throwable
	{
		try{
			Report.TableEnd();
			Report.Report_section_Name("Scenario 4 _Transaction_Project Allocation_Delete Resource From Project Scenario");
			Report.ReporterOutputHeader();
			//Report.ReporterOutputHeader();
			
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("ProjectAllocation");
			
			for(int row=2;row<=2; row++)

			{
				
					for(int col=12; col<=13; col++)
					{
						XSSFCell result=ObjWorkSheet.getRow(row).getCell(col);
		
						String CellValue=result.toString();
						System.out.println(CellValue);
						
						DeleteResource.add(CellValue);
		
		
					}

			}
			
		}catch (Exception e){

			e.printStackTrace();
		}
		
		Action_ProjectAllocation.DeleteResourceFromProject(DeleteResource);
		Report.TableEnd();
	}
	
	@Test(priority=3)
	public static void Transaction_EditFResourceDetails() throws Throwable{
		try{
			Report.TableEnd();
			Report.Report_section_Name("Scenario 3 _Transaction_Project Allocation_Edit Project Details Scenario");
			Report.ReporterOutputHeader();
			Thread.sleep(2000);
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);

			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("ProjectAllocation");
			for (int sheetrow = 2; sheetrow <= 2; sheetrow++) 
			{
				@SuppressWarnings("unused")
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 7; sheetcol <= 11; sheetcol++) 
				{
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
					//error on below line  
					String CellValue = ResultCellValue.toString();
					//System.out.println(CellValue);
					EditResourceDetails.add(CellValue);
				}


				Thread.sleep(2000);
				Action_ProjectAllocation.Edit_ProjectDetails(EditResourceDetails.get(0),EditResourceDetails.get(1),EditResourceDetails.get(2),EditResourceDetails.get(3),EditResourceDetails.get(4));


				Report.TableEnd();
			}



		}catch (Exception e){

			e.printStackTrace();
		}
	}

	
	@AfterClass
	public static void SetupClose() throws Exception
	{
		//Constant.driver.close();
	}
}
