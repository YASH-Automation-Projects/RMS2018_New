package com.yash.RMS.Testcase.Login;


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
import com.yash.RMS.TestAction.Configurations.TestAction_ProjectActivity;
import com.yash.RMS.TestAction.MasterData.MiscAttribute.TestAction_BGBU;
import com.yash.RMS.TestAction.MasterData.MiscAttribute.TestAction_Event;
import com.yash.RMS.TestAction.MasterData.MiscAttribute.TestAction_ParentProjectTeam;
import com.yash.RMS.TestAction.ResourceAttribute.TestAction_Competency;
import com.yash.RMS.TestAction.ResourceAttribute.TestAction_EmployeeCategory;
import com.yash.RMS.TestAction.ResourceAttribute.TestAction_Ownership;
import com.yash.RMS.TestAction.ResourceAttribute.TestAction_Visa;
import com.yash.RMS.TestAction.login.Action_ValidLogin;



public class TestCase_Login 
{
	public static List<String> Structure_Library = new ArrayList<String>();
	public static int ModificationFlag = 0;
	public static WebElement from = null;
	public static String visaName, editName;
	public static String BGBUName, BGBUDesc, EditName, EditDesc, BGBUNameOrg, BGBUDescOrg;
	public static String ProjectName, ManagerName,EditProject,EditManager;
	public static String EventName, EventDesc, EditEvent, EditDescEvent;
	public static String CompetencyName,EditCompetency;
	public static String OwnershipName,EditOwnership;
	public static String EmployeeCategoryName,EditEmployeeCategory;
//	public static List<int> Structure_Library1 = new ArrayList<int>();

	
@BeforeClass
public static void SetUp() throws Exception 
{
	ConfigureBrowser.SetBrowser();
	ConfigureBrowser.URL_Choice();
	
}

 @Test
    public static void login() throws Throwable
    {				Report.TableEnd();
                    Report.Report_section_Name("Login");
                    Report.ReporterOutputHeader();
                    Action_ValidLogin.loginvaliddata();
                    Report.TableEnd();
                    System.out.println("Login_1_Verify Login with Valid Credential.");
    }

/* @Test(priority = 2)
 public static void Visa_Page() throws Throwable
 {
                 Report.Report_section_Name("Scenario 1_Visa Page is open.");
                 Report.ReporterOutputHeader();
                 TestAction_Visa.VisaPage();
                 Report.TableEnd();
                 System.out.println("Scenario 1_Visa Page is open.");
 }

 
 
 @Test(priority = 3)
 public static void New_VisaCreation() throws Throwable
{
 	Report.TableEnd(); 
 	Report.Report_section_Name("Scenario 2_New Visa creation scenario.");
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

 		Structure_Library.clear();
 			
 			}
 			ObjWorkBook = null;
 			ObjExcelApp.close();

 	Report.TableEnd();
 	System.out.println("Scenario 2_New Visa creation scenario is completed.");
 }
 
 @Test(priority = 4)
 public static void Search_Visa() throws Throwable
 {
 	Report.TableEnd(); 
 	Report.Report_section_Name("Scenario 3_Search Visa scenario.");
 	Report.ReporterOutputHeader();
 	
	
		TestAction_Visa.SearchVisa(visaName); 

 	Report.TableEnd();
 	System.out.println("Scenario 3_Search Visa scenario is completed.");
 } 
 
  
 @Test(priority = 5)
 public static void Edit_Visa() throws Throwable
 {
 	Report.TableEnd(); 
 	Report.Report_section_Name("Scenario 4_Edit Visa scenario.");
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
 	System.out.println("Scenario 4_Edit Visa scenario is completed.");
 }
 
 @Test(priority = 6)
 public static void Delete_Visa() throws Throwable
 {
 	Report.TableEnd(); 
 	Report.Report_section_Name("Scenario 5_Delete Visa scenario.");
 	Report.ReporterOutputHeader();
 	
	
		TestAction_Visa.DeleteVisa(editName); 

 	Report.TableEnd();
 	System.out.println("Scenario 5_Delete Visa scenario is completed.");
 } */
 
 //************************ Open BG/BU page*************************************

/* @Test(priority = 4)
 public static void BGBU_Page() throws Throwable
{
 	Report.TableEnd(); 
 	Report.Report_section_Name("Scenario 1_BG/BU page is open.");
	Report.ReporterOutputHeader();
	TestAction_BGBU.BGBUPage(); 
    Report.TableEnd();
	System.out.println("Scenario 1_BG/BU page is open.");
 
}
 
 //************************ New BG/BU Creation*************************************
 @Test(priority = 5)
 public static void NewBGBU() throws Throwable
{
 	Report.TableEnd(); 
 	Report.Report_section_Name("Scenario 2_New BG/BU creation scenario.");
	Report.ReporterOutputHeader();
	//--
 	FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
	
	XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
	XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("BGBU");
	for (int sheetrow = 4; sheetrow <= 4; sheetrow++) {
		Row row = ObjWorkSheet.getRow(sheetrow);
		for (int sheetcol = 2; sheetcol <= 3; sheetcol++) {
			XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
			String CellValue = ResultCellValue.toString();
			Structure_Library.add(CellValue);
			//System.out.println(Structure_Library);
		}
		//--
		BGBUName=Structure_Library.get(0);
		BGBUDesc=Structure_Library.get(1);
		
		TestAction_BGBU.NewBGBU(BGBUName, BGBUDesc); 


Structure_Library.clear();
	
	}
	ObjWorkBook = null;
	ObjExcelApp.close();
    Report.TableEnd();
	System.out.println("Scenario 2_New BG/BU creation scenario is completed.");
 
}

 //************************ Search created BG/BU *************************************

 @Test(priority = 6)
 public static void Search_BGBU() throws Throwable
 {
 	Report.TableEnd(); 
 	Report.Report_section_Name("Scenario 3_Search BG/BU scenario.");
 	Report.ReporterOutputHeader();
 	
	
		TestAction_BGBU.SearchBGBU(BGBUName); 

 	Report.TableEnd();
 	System.out.println("Scenario 3_Search BG/BU scenario is completed.");
 } 
 
 //************************ Edit created BG/BU *************************************
 @Test(priority = 7)
 public static void Edit_BGBU() throws Throwable
 {
 	Report.TableEnd(); 
 	Report.Report_section_Name("Scenario 4_Edit BG/BU scenario.");
 	Report.ReporterOutputHeader();
 	//--
 	 	FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
 		
 		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
 		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("BGBU");
 		for (int sheetrow = 5; sheetrow <= 5; sheetrow++) {
 			Row row = ObjWorkSheet.getRow(sheetrow);
 			for (int sheetcol = 2; sheetcol <= 3; sheetcol++) {
 				XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
 				String CellValue = ResultCellValue.toString();
 				Structure_Library.add(CellValue);
 				//System.out.println(Structure_Library);
 			}
 			//--
 			EditName=Structure_Library.get(0);
 			EditDesc=Structure_Library.get(1);
 			
 			TestAction_BGBU.EditBGBU(BGBUName,EditName,EditDesc); 


 	Structure_Library.clear();
		
		}
		ObjWorkBook = null;
		ObjExcelApp.close();
	
 	Report.TableEnd();
 	System.out.println("Scenario 4_Edit BG/BU scenario is completed.");
 }
 
 //************************ Deactivate BG/BU *************************************
 @Test(priority = 8)
 public static void Deactivate_BGBU() throws Throwable
 {
 	Report.TableEnd(); 
 	Report.Report_section_Name("Scenario 5_Deactivate BG/BU scenario.");
 	Report.ReporterOutputHeader();
 	
	
		TestAction_BGBU.DeactivateBGBU(EditName); 

 	Report.TableEnd();
 	System.out.println("Scenario 5_Deactivate BG/BU scenario is completed.");
 }
 
 //************************ Activate BG/BU *************************************

 @Test(priority = 9)
 public static void Activate_BGBU() throws Throwable
 {
 	Report.TableEnd(); 
 	Report.Report_section_Name("Scenario 6_Activate BG/BU scenario.");
 	Report.ReporterOutputHeader();
 	
	
		TestAction_BGBU.ActivateBGBU(EditName); 

 	Report.TableEnd();
 	System.out.println("Scenario 6_Activate BG/BU scenario is completed.");
 } 
 
//************************ New BG/BU Creation for organization*************************************
@Test(priority = 10)
public static void AddBGBU_Org() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 7_New BG/BU for organization creation scenario.");
	Report.ReporterOutputHeader();
	//--
	FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
	
	XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
	XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("BGBU");
	for (int sheetrow = 6; sheetrow <= 6; sheetrow++) {
		Row row = ObjWorkSheet.getRow(sheetrow);
		for (int sheetcol = 2; sheetcol <= 3; sheetcol++) {
			XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
			String CellValue = ResultCellValue.toString();
			Structure_Library.add(CellValue);
			//System.out.println(Structure_Library);
		}
		//--
		BGBUNameOrg=Structure_Library.get(0);
		BGBUDescOrg=Structure_Library.get(1);
		
		TestAction_BGBU.AddBGBUOrg(EditName,BGBUNameOrg,BGBUDescOrg); 


Structure_Library.clear();
	
	}
	ObjWorkBook = null;
	ObjExcelApp.close();
   Report.TableEnd();
	System.out.println("Scenario 7_New BG/BU for organization creation scenario is completed.");

}

//************************ Move BG/BU to another BG/BU:*************************************

@Test(priority = 11)
public static void MoveBGBU_Org() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 8_Move BG/BU to another BG/BU scenario.");
	Report.ReporterOutputHeader();
	
		TestAction_BGBU.MoveBGBUOrg(EditName,BGBUNameOrg); 

   Report.TableEnd();
	System.out.println("Scenario 8_Move BG/BU to another BG/BU scenario is completed.");

} 
//************************ Verify Moved BG/BU*************************************

@Test(priority = 12)
public static void checkMoveBGBU_Org() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 9_Verifying Moved BG/BU to another BG/BU scenario.");
	Report.ReporterOutputHeader();

		
		TestAction_BGBU.checkMoveBGBUOrg(EditName,BGBUNameOrg); 

   Report.TableEnd();
	System.out.println("Scenario 9_Verifying Moved BG/BU to another BG/BU scenario is completed.");

} 
 */

 //************************ Open Parent Project / Team page*************************************

/* @Test(priority = 4)
 public static void ParentProjectTeam_Page() throws Throwable
{
 	Report.TableEnd(); 
 	Report.Report_section_Name("Scenario 1_Parent Project / Team page is open.");
	Report.ReporterOutputHeader();
	TestAction_ParentProjectTeam.ParentProjectTeamPage(); 
    Report.TableEnd();
	System.out.println("Scenario 1_Parent Project / Team page is open.");
 
}

//************************ New Parent Project / Team Creation*************************************
@Test(priority = 5)
public static void NewProject() throws Throwable
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
		
		TestAction_ParentProjectTeam.NewProject(ProjectName, ManagerName); 


Structure_Library.clear();
	
	}
	ObjWorkBook = null;
	ObjExcelApp.close();
   Report.TableEnd();
	System.out.println("Scenario 2_New Parent Project / Team creation scenario is completed.");

} 
//************************ Search created Parent Project / Team *************************************

@Test(priority = 6)
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
@Test(priority = 7)
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
 
@Test(priority = 8)
public static void Delete_Project() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 5_Delete Parent Project / Team scenario.");
	Report.ReporterOutputHeader();
	
	
	TestAction_ParentProjectTeam.DeleteProject(EditProject); 

	Report.TableEnd();
	System.out.println("Scenario 5_Delete Parent Project / Team scenario is completed.");
} */
 
//************************ Open Event page*************************************

/* @Test(priority = 4)
public static void Event_Page() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 1_Event page is open.");
	Report.ReporterOutputHeader();
	TestAction_Event.EventPage(); 
   Report.TableEnd();
	System.out.println("Scenario 1_Event page is open.");

}

//************************ New Event Creation*************************************
@Test(priority = 5)
public static void NewProject() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 2_New Event creation scenario.");
	Report.ReporterOutputHeader();
	//--
	FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
	
	XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
	XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Event");
	for (int sheetrow = 4; sheetrow <= 4; sheetrow++) {
		Row row = ObjWorkSheet.getRow(sheetrow);
		for (int sheetcol = 2; sheetcol <= 3; sheetcol++) {
			XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
			String CellValue = ResultCellValue.toString();
			Structure_Library.add(CellValue);
			//System.out.println(Structure_Library);
		}
		//--
		EventName=Structure_Library.get(0);
		EventDesc=Structure_Library.get(1);
		
		TestAction_Event.NewEvent(EventName, EventDesc); 


Structure_Library.clear();
	
	}
	ObjWorkBook = null;
	ObjExcelApp.close();
  Report.TableEnd();
	System.out.println("Scenario 2_New Event scenario creation is completed.");

} 
 
//************************ Search created Event *************************************

@Test(priority = 6)
public static void Search_Event() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 3_Search Event scenario.");
	Report.ReporterOutputHeader();
	
	
	TestAction_Event.SearchEvent(EventName); 

	Report.TableEnd();
	System.out.println("Scenario 3_Search Event scenario is completed.");
} 

//************************ Edit created Parent Project / Team *************************************
@Test(priority = 7)
public static void Edit_Event() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 4_Edit Event scenario.");
	Report.ReporterOutputHeader();
	//--
	 	FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Event");
		for (int sheetrow = 5; sheetrow <= 5; sheetrow++) {
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 2; sheetcol <= 3; sheetcol++) {
				XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				Structure_Library.add(CellValue);
				//System.out.println(Structure_Library);
			}
			//--
			EditEvent=Structure_Library.get(0);
			EditDescEvent=Structure_Library.get(1);
			
			TestAction_Event.EditEvent(EventName,EditEvent, EditDescEvent); 


	Structure_Library.clear();
		
		}
		ObjWorkBook = null;
		ObjExcelApp.close();
	
	Report.TableEnd();
	System.out.println("Scenario 4_Edit Event scenario is completed.");
} 
 
//************************ Click on Event *************************************

@Test(priority = 8)
public static void Click_Event() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 5_Click on Event scenario.");
	Report.ReporterOutputHeader();
	
	
	TestAction_Event.ClickEvent(EditEvent); 

	Report.TableEnd();
	System.out.println("Scenario 5_Click on Event scenario is completed.");
} 
 
//************************ Delete Event *************************************

@Test(priority = 9)
public static void Delete_Event() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 6_Delete Event scenario.");
	Report.ReporterOutputHeader();
	
	
	TestAction_Event.DeleteEvent(EditEvent); 

	Report.TableEnd();
	System.out.println("Scenario 6_Delete Event scenario is completed.");
} */

//************************ Open Competency page*************************************

/* @Test(priority = 4)
public static void Competency_Page() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 1_Competency page is open.");
	Report.ReporterOutputHeader();
	TestAction_Competency.CompetencyPage(); 
   Report.TableEnd();
	System.out.println("Scenario 1_Competency page is open.");

}

//************************ New Competency Creation*************************************
@Test(priority = 5)
public static void NewCompetency() throws Throwable
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

@Test(priority = 6)
public static void Search_Project() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 3_Search Competency scenario.");
	Report.ReporterOutputHeader();
	
	
	TestAction_Competency.SearchCompetency(CompetencyName); 

	Report.TableEnd();
	System.out.println("Scenario 3_Search Competency scenario is completed.");
} 

//************************ Edit created Competency *************************************
@Test(priority = 7)
public static void Edit_Project() throws Throwable
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
@Test(priority = 8)
public static void Delete_Competency() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 5_Delete Competency scenario.");
	Report.ReporterOutputHeader();
	
	
	TestAction_Competency.DeleteCompetency(EditCompetency); 

	Report.TableEnd();
	System.out.println("Scenario 5_Delete Competency scenario is completed.");
} */


//************************ Open Ownership page*************************************

/*@Test(priority = 4)
public static void Ownership_Page() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 1_Ownership page is open.");
	Report.ReporterOutputHeader();
	TestAction_Ownership.OwnershipPage(); 
  Report.TableEnd();
	System.out.println("Scenario 1_Ownership page is open.");

}
//************************Ascending Order Ownership Name*****************************
@Test(priority = 5)
public static void ascendingOwnershipNameSorting1() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 2_Ascending Order by Ownership Name scenario.");
	Report.ReporterOutputHeader();
	TestAction_Ownership.ascendingOwnershipNameSorting(); 
  Report.TableEnd();
	System.out.println("Scenario 2_Ascending Order by Ownership Name scenario completed.");

}
//************************Descending Order Ownership Name*****************************
@Test(priority = 6)
public static void descendingOwnershipNameSorting1() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 3_Descending Order by Ownership Name scenario.");
	Report.ReporterOutputHeader();
	TestAction_Ownership.descendingOwnershipNameSorting(); 
  Report.TableEnd();
	System.out.println("Scenario 3_Descending Order by Ownership Name scenario completed.");

}
//************************ New Ownership Creation*************************************
@Test(priority = 7)
public static void NewOwnership() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 4_New Ownership creation scenario.");
	Report.ReporterOutputHeader();
	//--
	FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
	
	XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
	XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Ownership");
	for (int sheetrow = 4; sheetrow <= 4; sheetrow++) {
		Row row = ObjWorkSheet.getRow(sheetrow);
		for (int sheetcol = 2; sheetcol <= 2; sheetcol++) {
			XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
			String CellValue = ResultCellValue.toString();
			Structure_Library.add(CellValue);
			//System.out.println(Structure_Library);
		}
		//--
		OwnershipName=Structure_Library.get(0);
	
		TestAction_Ownership.NewOwnership(OwnershipName); 


Structure_Library.clear();
	
	}
	ObjWorkBook = null;
	ObjExcelApp.close();
 Report.TableEnd();
	System.out.println("Scenario 4_New Ownership creation scenario is completed.");

} 
//************************ Search created Ownership *************************************

@Test(priority = 8)
public static void Search_Project() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 5_Search Ownership scenario.");
	Report.ReporterOutputHeader();
	
	
	TestAction_Ownership.SearchOwnership(OwnershipName); 

	Report.TableEnd();
	System.out.println("Scenario 5_Search Ownership scenario is completed.");
} 

//************************ Edit created Ownership *************************************
@Test(priority = 9)
public static void Edit_Ownership() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 6_Edit Ownership scenario.");
	Report.ReporterOutputHeader();
	//--
	 	FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
		
		XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Ownership");
		for (int sheetrow = 5; sheetrow <= 5; sheetrow++) {
			Row row = ObjWorkSheet.getRow(sheetrow);
			for (int sheetcol = 2; sheetcol <= 2; sheetcol++) {
				XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
				String CellValue = ResultCellValue.toString();
				Structure_Library.add(CellValue);
				//System.out.println(Structure_Library);
			}
			//--
			EditOwnership=Structure_Library.get(0);
		
			TestAction_Ownership.EditOwnership(OwnershipName,EditOwnership); 


	Structure_Library.clear();
		
		}
		ObjWorkBook = null;
		ObjExcelApp.close();
	
	Report.TableEnd();
	System.out.println("Scenario 6_Edit Ownership scenario is completed.");
}


//************************ Delete Ownership *************************************
@Test(priority = 10)
public static void Delete_Ownership() throws Throwable
{
	Report.TableEnd(); 
	Report.Report_section_Name("Scenario 7_Delete Ownership scenario.");
	Report.ReporterOutputHeader();
	
	
	TestAction_Ownership.DeleteOwnership(EditOwnership); 

	Report.TableEnd();
	System.out.println("Scenario 7_Delete Ownership scenario is completed.");
} */




 
 
 
 
 
}

 