package com.yash.RMS.Testcase.Configurations;

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
import com.yash.RMS.TestAction.Configurations.Action_ConfigureMailSettings;
import com.yash.RMS.TestAction.login.Action_ValidLogin;

public class TestCase_ConfigureMailSettings {

	public static List<String> Search_Project = new ArrayList<String>();
	/*@BeforeClassa
	public static void SetUp() throws Exception 
	{
		ConfigureBrowser.SetBrowser();
		ConfigureBrowser.URL_Choice();
	}
	 *//************************************************************************************************************************************//*
	@Test(priority = 1)
	public static void login() throws Throwable
	{
		Report.Report_section_Name("Login");
		Report.ReporterOutputHeader();
		Action_ValidLogin.loginvaliddata();
		Report.TableEnd();

		System.out.println("Login_1_Verify Login with Valid Credential.");
	}*/

	/************************************************************************************************************************************/
	//@Test(priority = 2)
	@Test
	public static void Action_ConfigureMailSettings() throws Throwable {


		try {
			Report.TableEnd();
			Report.Report_section_Name("Scenario 1 _ Configure Mail Settings Page Navigation Scenario");
			Report.ReporterOutputHeader();
			Thread.sleep(2000);
			Action_ConfigureMailSettings.ConfigureMailSettingsPageNavigation();
			//Action_ConfigureMailSettings.ascendingProjectIDSorting();
			//Thread.sleep(2000);
			//Action_ConfigureMailSettings.descendingProjectIDSorting();
			Thread.sleep(2000);
			Action_ConfigureMailSettings.ascendingProjectNameSorting();
			Thread.sleep(2000);	
		//	Action_ConfigureMailSettings.descendingProjectNameSorting();
			Thread.sleep(2000);
			Action_ConfigureMailSettings.ascendingCustomerNameSorting();
			Thread.sleep(2000);
			Action_ConfigureMailSettings.descendingCustomerNameSorting();
			Thread.sleep(2000);
			Action_ConfigureMailSettings.ascendingProjectManagerSorting();
			Thread.sleep(2000);
	//		Action_ConfigureMailSettings.descendingProjectManagerSorting();
			Thread.sleep(2000);
			Action_ConfigureMailSettings.ascendingProjectKickoffDateSorting();
			Thread.sleep(2000);
	//		Action_ConfigureMailSettings.descendingProjectKickoffDateSorting();
			Thread.sleep(2000);
			Report.TableEnd();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**************************************************************************************/
	//@Test(priority = 3)
	@Test
	public static void AssignPrivilegesToRole() throws Throwable {


		try {
			Thread.sleep(2000);
			Report.TableEnd();
			Report.Report_section_Name("Scenario 2 _ Assign Privileges To Role Settings Page Scenario");
			Report.ReporterOutputHeader();
			FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
			XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("ConfigureMailSettings");
			for (int sheetrow = 15; sheetrow <= 15; sheetrow++) 
			{
				@SuppressWarnings("unused")
				Row row = ObjWorkSheet.getRow(sheetrow);
				for (int sheetcol = 2; sheetcol <= 2; sheetcol++) 
				{
					XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);

					String CellValue = ResultCellValue.toString();
					Search_Project.add(CellValue);
					
				}

				Thread.sleep(2000);
				System.out.println(Search_Project);
				Action_ConfigureMailSettings.search_ProjectID(Search_Project.get(0));
				Thread.sleep(2000);
				Action_ConfigureMailSettings.AssignPrivilegesToRole();
				Search_Project.clear();
				Report.TableEnd();
				ObjWorkBook=null;
				ObjExcelApp.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}/*EOC: class***********************************************************************************************************************************/