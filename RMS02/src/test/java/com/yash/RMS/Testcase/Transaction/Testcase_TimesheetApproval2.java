package com.yash.RMS.Testcase.Transaction;

import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.TestAction.Transaction.TestAction_TimesheetApproval2;

public class Testcase_TimesheetApproval2 {
	
	@Test(priority = 1)
	public static void TimesheetApproval_PageNavigation() throws Throwable{
		Report.TableEnd(); 
		Report.Report_section_Name("Verify Timesheet Approval page is open.");
		Report.ReporterOutputHeader();
		TestAction_TimesheetApproval2.getTestData();
		TestAction_TimesheetApproval2.navigateToTimeSheetApprovalpage();
		Report.TableEnd();
	}

	@Test(priority = 2)
	public static void View_Approved_Timesheets() throws Throwable{
		Report.TableEnd(); 
		Report.Report_section_Name("Verify Dropdown and sorting elements on Timesheet Approval page is working.");
		Report.ReporterOutputHeader();
		TestAction_TimesheetApproval2.verifySortingElementsOnTimeSheetApprovalpage();
		Report.TableEnd();
	}
	
	@Test(priority = 3)
	public static void VerifyTimesheetsExcelIsDownloading() throws Throwable{
		Report.TableEnd(); 
		Report.Report_section_Name("Verify Excel file of TimeSheets is downloading.");
		Report.ReporterOutputHeader();
		TestAction_TimesheetApproval2.verifyExcelDownloadingFunctionality();
		Report.TableEnd();
	}	
	
	@Test(priority = 4)
	public static void searchUserAndApproveTimesheet() throws Throwable{
		Report.TableEnd(); 
		Report.Report_section_Name("Verify Time sheets search and Approve functionality is working or not");
		Report.ReporterOutputHeader();
		TestAction_TimesheetApproval2.searchUserByPerametersAndApproveTimeSheet();		
		Report.TableEnd();
	}
		
	@Test(priority = 6)
	public static void searchUserAndRejectTimesheet() throws Throwable{
		Report.TableEnd(); 
		Report.Report_section_Name("Verify Time sheets search and Rejection functionality is working or not");
		Report.ReporterOutputHeader();
		TestAction_TimesheetApproval2.searchUserByperametersAndRejectTimeSheet();		
		Report.TableEnd();
	}
	
	@Test(priority = 7)
	public static void validateApprovedAndRejectedTimeSheet() throws Throwable{
		Report.TableEnd(); 
		Report.Report_section_Name("validate timesheets are visible or not after approving it.");
		Report.ReporterOutputHeader();
		TestAction_TimesheetApproval2.validateApprovedTimeSheet();
		TestAction_TimesheetApproval2.validateRejectedTimeSheet();
		Report.TableEnd();
	}
}
