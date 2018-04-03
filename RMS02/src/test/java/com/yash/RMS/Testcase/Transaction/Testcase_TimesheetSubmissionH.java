package com.yash.RMS.Testcase.Transaction;

import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.TestAction.Transaction.TestAction_TimeSheetSubmissionH;

public class Testcase_TimesheetSubmissionH {
	@Test(priority = 1)
	public static void TimesheetSubmission_Page() throws Throwable {
		try {
			Report.TableEnd();
			Report.Report_section_Name("Verify Timesheet Submission page is open");
			Report.ReporterOutputHeader();
			TestAction_TimeSheetSubmissionH.TimeSheetSubmissioLink();
			
			Report.TableEnd();
			System.out.println("Timesheet Submission page is open scenario completed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public static void TimesheetSubmission_AddingTimeSheet() throws Throwable {
		try {
			
			Report.TableEnd();
			Report.Report_section_Name("Verify Timesheet Added and Saved Successfully");
			Report.ReporterOutputHeader();
			TestAction_TimeSheetSubmissionH.AddTimeSheet();
			Report.TableEnd();
			System.out.println("Timesheet Added and Saved Successfully scenario completed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public static void TimesheetSubmission_Shorting() throws Throwable {
		try {
			Report.TableEnd();
			Report.Report_section_Name("Verify Shorting in TimeSheet Page");
			Report.ReporterOutputHeader();
			TestAction_TimeSheetSubmissionH.Shorting();
			Report.TableEnd();
			System.out.println("Shorting in TimeSheet Page scenario completed.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
