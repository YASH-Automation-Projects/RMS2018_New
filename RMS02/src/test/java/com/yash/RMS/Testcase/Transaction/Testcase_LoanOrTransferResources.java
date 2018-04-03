package com.yash.RMS.Testcase.Transaction;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.Setup.ConfigureBrowser;
import com.yash.RMS.TestAction.Transaction.Action_LoanOrTransferResources;
import com.yash.RMS.TestAction.login.Action_ValidLogin;

public class Testcase_LoanOrTransferResources {
	public static List<String> LoanOrTransferResourcesValue = new ArrayList<String>(); 

	/*@BeforeClass
	public static void SetUp() throws Exception 
	{
		ConfigureBrowser.SetBrowser();
		ConfigureBrowser.URL_Choice();
	}
	//************************************************************************************************************************************
	@Test(priority = 1)
	public static void login() throws Throwable
	{
		Report.Report_section_Name("Login");
		Report.ReporterOutputHeader();
		Action_ValidLogin.loginvaliddata();
		Report.TableEnd();
		System.out.println("Login_1_Verify Login with Valid Credential.");
	}*/


	@Test(priority=4)
	public static void LoanOrTransferResourcesPageNavigation() throws Throwable {


		try {
			Report.Report_section_Name("Scenario 1 _ Loan or Transfer Resources Page Navigation Scenario");
			Report.ReporterOutputHeader();
			Thread.sleep(2000);
			Action_LoanOrTransferResources.LoanOrTransferResourcesPageNavigation();
			Report.TableEnd();
				Thread.sleep(2000);
									
		} catch (Exception e) {
			e.printStackTrace();
		}

	
	}
	
	@Test(priority=6)
		public static void Create_LoanOrTransferResourcesPage() throws Throwable {


			try {
				Report.Report_section_Name("Scenario 2 _ Loan or Transfer Resources Page Validation Scenario");
				Report.ReporterOutputHeader();
				Thread.sleep(2000);
				FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
				@SuppressWarnings("resource")
				XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
				XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("LoanOrTransferResources");
				for (int sheetrow = 2; sheetrow <= 2; sheetrow++) 
				{
					@SuppressWarnings("unused")
					Row row = ObjWorkSheet.getRow(sheetrow);
					for (int sheetcol = 1; sheetcol <= 32; sheetcol++) 
					{
						XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
						//error on below line  
						String CellValue = ResultCellValue.toString();
						System.out.println(CellValue);
						LoanOrTransferResourcesValue.add(CellValue);
					}

					Thread.sleep(2000);
					
			
					//Action_LoanOrTransferResources.LoanOrTransferResourcesPageNavigation();
					Action_LoanOrTransferResources.Create_LoanOrTransferResources(LoanOrTransferResourcesValue.get(0),LoanOrTransferResourcesValue.get(1),LoanOrTransferResourcesValue.get(2),LoanOrTransferResourcesValue.get(3),LoanOrTransferResourcesValue.get(4),LoanOrTransferResourcesValue.get(5), LoanOrTransferResourcesValue.get(6), LoanOrTransferResourcesValue.get(7),LoanOrTransferResourcesValue.get(8),LoanOrTransferResourcesValue.get(9),LoanOrTransferResourcesValue.get(10), LoanOrTransferResourcesValue.get(11),LoanOrTransferResourcesValue.get(12),LoanOrTransferResourcesValue.get(13),LoanOrTransferResourcesValue.get(14),LoanOrTransferResourcesValue.get(15),LoanOrTransferResourcesValue.get(16),LoanOrTransferResourcesValue.get(17), LoanOrTransferResourcesValue.get(18), LoanOrTransferResourcesValue.get(19), LoanOrTransferResourcesValue.get(20), LoanOrTransferResourcesValue.get(21),  LoanOrTransferResourcesValue.get(22),  LoanOrTransferResourcesValue.get(23),  LoanOrTransferResourcesValue.get(24),  LoanOrTransferResourcesValue.get(25),  LoanOrTransferResourcesValue.get(26), LoanOrTransferResourcesValue.get(27), LoanOrTransferResourcesValue.get(28), LoanOrTransferResourcesValue.get(29), LoanOrTransferResourcesValue.get(30), LoanOrTransferResourcesValue.get(31));
					Report.TableEnd();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

	}

}








