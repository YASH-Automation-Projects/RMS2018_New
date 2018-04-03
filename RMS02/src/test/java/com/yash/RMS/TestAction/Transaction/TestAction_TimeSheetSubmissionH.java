package com.yash.RMS.TestAction.Transaction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.velocity.runtime.directive.Parse;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Dashboard.Dashboard;
import com.yash.RMS.POM.Transaction.PageObjects_TimesheetSubmission;

public class TestAction_TimeSheetSubmissionH {

	public static void TimeSheetSubmissioLink() throws Throwable {

		try {

			if (PageObjects_TimesheetSubmission.lnk_Transaction(Constant.driver).isEnabled()) {

				PageObjects_TimesheetSubmission.lnk_Transaction(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step", "Verify Transaction link is enabled.", "Transaction link",
						"Transaction link should be enabled and clicked.", "Transaction link is enabled and clicked.",
						"Pass", null);
			} else {
				Report.ReporterOutput("Step", "Verify Transaction link is enabled.", "Transaction link",
						"Transaction link should be enabled and clicked.",
						"Transaction link is not enabled and clicked.", "Fail", null);
			}
			// Click on TimeSheet Submission link
			if (PageObjects_TimesheetSubmission.lnk_TimesheetSubmission(Constant.driver).isEnabled())

			{

				PageObjects_TimesheetSubmission.lnk_TimesheetSubmission(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step", "Verify Timesheet Submission link is enabled.",
						"Timesheet Submission link", "Timesheet Submission link should be enabled and clicked.",
						"Timesheet Submission link is enabled and clicked.", "Pass", null);
			} else {
				Report.ReporterOutput("Step", "Verify Timesheet Submission link is enabled.",
						"Timesheet Submission link", "Timesheet Submission link should be enabled and clicked.",
						"Timesheet Submission link is not enabled and clicked.", "Fail", null);
			}
			// Check whether TimeSheet Submission page is open or not.

			String msg1 = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1")).getText().trim();
			String msg2 = "Timesheet Submission";

			if (msg1.contains(msg2)) {
				Report.ReporterOutput("Step", "Verify Timesheet Submission link is Opened",
						"Timesheet Submission link Opened", "Timesheet Submission link should work and Open the Page.",
						"Timesheet Submission link is Opened", "Pass", null);
				System.out.println("Timesheet Submission page open");
			} else {
				Report.ReporterOutput("Step", "Verify Timesheet Submission link is Opened",
						"Timesheet Submission link Opened", "Timesheet Submission link should work and Open the Page",
						"Timesheet Submission link is Not Opened", "Fail", null);
				System.out.println("Timesheet Submission page not found");
			}

		} catch (Exception e) {

		}

	}

	public static void AddTimeSheet() throws Throwable {

		try {

			
			System.out.println(""+ Constant.Path_TestData+"RMS_Automaiton_TestData.xlsx");
			String TextModule = null;
			String TextSubModule = null;

			FileInputStream ObjExcelApp = new FileInputStream(
					""+ Constant.Path_TestData+"RMS_Automaiton_TestData.xlsx");
			XSSFWorkbook TestWorkbook = new XSSFWorkbook(ObjExcelApp);
			String sheetName = "TimeSheet_Submission";
			Sheet NewSheet = TestWorkbook.getSheet("TimeSheet_Submission");

			if (PageObjects_TimesheetSubmission.lnk_AddTimesheet(Constant.driver).isEnabled()) {
				PageObjects_TimesheetSubmission.lnk_AddTimesheet(Constant.driver).click();

				Report.ReporterOutput("Step", "Verify Add TimeSheet link is enabled.", "Add TimeSheet link",
						"Add time Sheet link should be enabled and clicked.",
						"Add TimeSheet link is enabled and clicked.", "Pass", null);
			} else {

				Report.ReporterOutput("Step", "Verify Add TimeSheet link is enabled.", "Add TimeSheet link",
						"Add time Sheet link should be enabled and clicked.",
						"Add TimeSheet link is not enabled and clicked.", "Fail", null);

			}

			Thread.sleep(7000);
		//	Constant.driver.findElement(By.xpath(".//*[@id='frmSelect']/div[1]/span[2]/im")).click();
			ArrayList<String> Date = new ArrayList<String>();
			DataFormatter formatter = new DataFormatter(Locale.US);

			for (int i = 3; i <= 5; i++) {
				String date = formatter.formatCellValue(NewSheet.getRow(7).getCell(i));
				Date.add(date);
			}

			String[] Out = Date.get(0).split("/");
			DateSelect(Out[1], Out[0], Out[2]);

			Thread.sleep(3000);

			/***********************
			 * adding time sheet rows and Updating fields
			 ********************************/
			ArrayList<String> Proj_Action = new ArrayList<String>();
			DataFormatter formatter1 = new DataFormatter(Locale.US);

			for (int j = 15; j <= 16; j++) {
				for (int i = 1; i <= 5; i++) {

					String Text = formatter1.formatCellValue(NewSheet.getRow(j).getCell(i));
					Proj_Action.add(Text);
				}
			
			}
			int m = 0;
			for (int k = 0; k <= 1; k++) {
				for (; m <= 5; m++) {

					UpdatingTimeSheetRow(k, Proj_Action.get(m), Proj_Action.get(m + 1), Proj_Action.get(m + 2),
							Proj_Action.get(m + 3), Proj_Action.get(m + 4), NewSheet, formatter1);

					if (m == 0) {
						m = m + 5;
						break;

					}
				}
			}

			/***********************
			 * adding time sheet rows and Updating fields Ends
			 ********************************/

			if (PageObjects_TimesheetSubmission.Link_Timesheet_Copy(Constant.driver, 0).isEnabled()) {
				PageObjects_TimesheetSubmission.Link_Timesheet_Copy(Constant.driver, 0).click();
				Report.ReporterOutput("Step", "Copy link is enabled and Workfine", "Copy Link",
						"Copy link Should be enabled and Clickable", "Copy link is enabled and Clickable", "Pass",
						null);
			}

			else {

				Report.ReporterOutput("Step", "Copy link is enabled and Workfine", "Copy Link",
						"Copy link Should be enabled and Clickable", "Copy link is not enabled and Clickable", "Fail",
						null);
			}

			/********************************
			 * Saving Time Sheet
			 **************************/

			if (PageObjects_TimesheetSubmission.Button_Timesheet_Save(Constant.driver).isEnabled()) {
				PageObjects_TimesheetSubmission.Button_Timesheet_Save(Constant.driver).click();

				Report.ReporterOutput("Step", "Save Button is enabled and work fine", "Save Button",
						"Save button is enables and Clickable", "Save button is enabled and Clickable", "Pass", null);

			} else {

				Report.ReporterOutput("Step", "Save Button is enabled and work fine", "Save Button",
						"Save button is enables and Clickable", "Save button is not enabled and Clickable", "Fail",
						null);

			}

			// ********Sleep Wait*****************
			Thread.sleep(2000);

			System.out.println(Date.get(0));
			SimpleDateFormat inFormat = new SimpleDateFormat("MM/dd/yyy");
			SimpleDateFormat outFormat = new SimpleDateFormat("dd-MMM-yyyy");

			System.out.println(outFormat.format(inFormat.parse(Date.get(0))));

			if (PageObjects_TimesheetSubmission.Text_SearchBox(Constant.driver).isEnabled()) {
				PageObjects_TimesheetSubmission.Text_SearchBox(Constant.driver).clear();
				PageObjects_TimesheetSubmission.Text_SearchBox(Constant.driver)
						.sendKeys(outFormat.format(inFormat.parse(Date.get(0))));

				Report.ReporterOutput("Step", "Saerching Saved Timesheet using Date", "Search Text Box",
						"Search text is enabled and time sheet can be searched",
						"Search text is enabled and time sheet searched", "Pass", null);

			} else {

				Report.ReporterOutput("Step", "Saerching Saved Timesheet using Date", "Search Text Box",
						"Search text is enabled and time sheet can be searched",
						"Search text is not enabled and searched", "Fail", null);

			}

			if (PageObjects_TimesheetSubmission.Link_SavedTimeSheet(Constant.driver).isEnabled()) {
				PageObjects_TimesheetSubmission.Link_SavedTimeSheet(Constant.driver).click();

				Report.ReporterOutput("Step", "Saved time sheet link is enabled and Clickable", "Saved Time Sheet link",
						"saved time sheet link should be enabled and Clickable",
						"saved time sheet link enabled and Clickable", "Pass", null);

			} else {

				Report.ReporterOutput("Step", "Saved time sheet link is enabled and Clickable", "Saved Time Sheet link",
						"saved time sheet link should be enabled and Clickable",
						"saved time sheet link is not enabled and Clickable", "Fail", null);

			}

			/*****************
			 * Verifying the Enter text in the fields get display properly
			 *********************/

			int f = 0;
			for (int i = 1; i >= 0; i--) {
				for (; f <= 5; f++) {
					WebElement ElementProject = PageObjects_TimesheetSubmission
							.DropDown_TimesheetProject(Constant.driver, i);
					Select DropElementProject = new Select(ElementProject);

					String Projectfield = DropElementProject.getFirstSelectedOption().getText();

					WebElement ElementActivity = PageObjects_TimesheetSubmission
							.DropDown_TimesheetActivity(Constant.driver, i);
					Select DropElementActivity = new Select(ElementActivity);

					String Activityfield = DropElementActivity.getFirstSelectedOption().getText();

					WebElement Module_Element = PageObjects_TimesheetSubmission.TextBox_TimesheetModule(Constant.driver,
							i);

					if (Module_Element.getTagName().contains("select")) {

						Select DropElementModule = new Select(Module_Element);
						TextModule = DropElementModule.getFirstSelectedOption().getText();

					} else {

						TextModule = Module_Element.getAttribute("value");

					}

					WebElement SubModule_Element = PageObjects_TimesheetSubmission
							.TextBox_TimesheetsubModule(Constant.driver, i);

					if (SubModule_Element.getTagName().contains("select")) {
						Select DropElementSubModule = new Select(SubModule_Element);
						TextSubModule = DropElementSubModule.getFirstSelectedOption().getText();

					} else {

						TextSubModule = SubModule_Element.getAttribute("value");

					}

					String TextTicketNo = PageObjects_TimesheetSubmission.TextBox_Timesheet_TicketNo(Constant.driver, i)
							.getAttribute("value");

					/*******************************************
					 * Verifying the content of the TimeSheet Fields are
					 *********************************/

					if (Projectfield.equalsIgnoreCase(Proj_Action.get(f))) {

						Report.ReporterOutput("Step", "Verifying Project Name Field :- " + i + "", "Project Name Field",
								"Verifying Project Name Field", "Content is same as filled", "Pass", null);

					} else {

						Report.ReporterOutput("Step", "Verifying Project Name Field:- " + i + "", "Project Name Field",
								"Verifying Project Name Field", "Content is not same as filled", "Fail", null);

					}

					if (Activityfield.equalsIgnoreCase(Proj_Action.get(f + 1))) {

						Report.ReporterOutput("Step", "Verifying Activity Name Field :- " + i + "", "Activity Field",
								"Verifying Activity Name Field", "Content is same as filled", "Pass", null);

					} else {

						Report.ReporterOutput("Step", "Verifying Activity Name Field of Row :- " + i + "",
								"Activity Field", "Verifying Activity Name Field", "Content is not same as filled",
								"Fail", null);

					}

					if (TextModule.equalsIgnoreCase(Proj_Action.get(f + 2))) {

						Report.ReporterOutput("Step", "Verifying Module Name Field :- " + i + "", "Module Field",
								"Verifying Module Name Field", "Content is same as filled", "Pass", null);

					} else {

						Report.ReporterOutput("Step", "Verifying Module Name Field of Row :- " + i + "", "Module Field",
								"Verifying Module Name Field", "Content is not same as filled", "Fail", null);

					}

					if (TextSubModule.equalsIgnoreCase(Proj_Action.get(f + 3))) {

						Report.ReporterOutput("Step", "Verifying SubModule Name Field :- " + i + "", "SubModule Field",
								"Verifying SubModule Name Field", "Content is same as filled", "Pass", null);

					} else {

						Report.ReporterOutput("Step", "Verifying SubModule Name Field of Row :- " + i + "",
								"SubModule Field", "Verifying SubModule Name Field", "Content is not same as filled",
								"Fail", null);

					}

					if (TextTicketNo.equalsIgnoreCase(Proj_Action.get(f + 4))) {

						Report.ReporterOutput("Step", "Verifying SubModule Name Field :- " + i + "", "Ticket No. Field",
								"Verifying Ticket No. Name Field", "Content is same as filled", "Pass", null);

					} else {

						Report.ReporterOutput("Step", "Verifying Ticket No. Name Field of Row :- " + i + "",
								"Ticket No. Field", "Verifying Ticket No. Name Field", "Content is not same as filled",
								"Fail", null);

					}

					if (f == 0) {
						f = f + 5;

						break;
					}

				}
			}

			if (PageObjects_TimesheetSubmission.Img_Timesheet_DeleteImage(Constant.driver, 2).isEnabled()) {
				PageObjects_TimesheetSubmission.Img_Timesheet_DeleteImage(Constant.driver, 2).click();

				Report.ReporterOutput("Step", "Delete Cross is enabled and Clickable", "Delete Cross",
						"Delete Cross should be enabled and Clickable", "Delete Cross should be enabled and Clickable",
						"Pass", null);

			} else {

				Report.ReporterOutput("Step", "Delete Cross is enabled and Clickable", "Delete Cross",
						"Delete Cross should be enabled and Clickable", "Delete Cross not enabled and Clickable",
						"Fail", null);

			}

			String DeletPermissionText = PageObjects_TimesheetSubmission.Delete_Permission_Prompt(Constant.driver)
					.getText();

			if (DeletPermissionText.contentEquals("Are you sure you want to delete this row ?")) {

				PageObjects_TimesheetSubmission.Button_DeleteOk(Constant.driver).click();

				Report.ReporterOutput("Step", "Delete Permission Prompt get Display and Ok Button is Clickable",
						"Delete Permission Prompt",
						"Delete Permission Prompt should get Display and Ok Button should be Clickable",
						"Delete Permission Prompt  get Display and Ok Button Clickable", "Pass", null);

			} else {
				Report.ReporterOutput("Step", "Delete Permission Prompt get Display and Ok Button is Clickable",
						"Delete Permission Prompt",
						"Delete Permission Prompt should get Display and Ok Button should be Clickable",
						"Delete Permission Prompt not  get Display and Ok Button Clickable", "Fail", null);

			}

			/**************** Submiting Time Sheet *******************/

			Thread.sleep(2000);

			if (PageObjects_TimesheetSubmission.Submit_Button(Constant.driver).isEnabled()) {
				PageObjects_TimesheetSubmission.Submit_Button(Constant.driver).click();
				Report.ReporterOutput("Step", "Verifying Submit Button is Enabled and Clickable", "Submit Button",
						"Submit button should be enabled and Clickable", "Submit button is Enabled and Clickable",
						"Pass", null);

			} else {

				Report.ReporterOutput("Step", "Verifying Submit Button is Enabled and Clickable", "Submit Button",
						"Submit button should be enabled and Clickable", "Submit button is not Enabled and Clickable",
						"Fail", null);

			}

			Thread.sleep(2000);
			Constant.driver.switchTo().alert().accept();
			Thread.sleep(4000);
			PageObjects_TimesheetSubmission.Text_SearchBox(Constant.driver).clear();

		}

		catch (Exception e) {

		}

	}

	/*******************************
	 * Shorting
	 * 
	 * @throws Throwable
	 *************************/
	public static void Shorting() throws Throwable {
		try {

			FileInputStream ObjExcelApp = new FileInputStream(
					""+ Constant.Path_TestData+"RMS_Automaiton_TestData.xlsx");
			XSSFWorkbook TestWorkbook = new XSSFWorkbook(ObjExcelApp);
			String sheetName = "TimeSheet_Submission";
			Sheet NewSheet = TestWorkbook.getSheet("TimeSheet_Submission");
			Thread.sleep(5000);
			ArrayList<String> Date = new ArrayList<String>();
			DataFormatter formatter = new DataFormatter(Locale.US);

			for (int i = 3; i <= 5; i++) {
				String date = formatter.formatCellValue(NewSheet.getRow(7).getCell(i));
				Date.add(date);
			}

			PageObjects_TimesheetSubmission.Text_SearchBox(Constant.driver).clear();
			Thread.sleep(2000);

			String[] Out = Date.get(0).split("/");
			int Month = Integer.parseInt(Out[0]) - 1;
			String s = String.valueOf(Month);

			Thread.sleep(2000);

			
	        PageObjects_TimesheetSubmission.DateSearchSubmissionPage(Constant.driver).click();
	        Thread.sleep(2000);
			WebElement Month_Element = PageObjects_TimesheetSubmission.DateSearch_Month_Select(Constant.driver);
			Select Date_Month = new Select(Month_Element);
			Date_Month.selectByValue(s);

			WebElement Year_Select = PageObjects_TimesheetSubmission.DateSearch_YearDropDown(Constant.driver);
			Select Date_Year = new Select(Year_Select);
			Date_Year.selectByValue(Out[2]);

			PageObjects_TimesheetSubmission.DateSearch_ViewTimeSheet(Constant.driver).click();

			Thread.sleep(3000);

			/*
			 * <*******************Project Field
			 * Shorting***********************************>
			
			 */
			PageObjects_TimesheetSubmission.Text_SearchBox(Constant.driver).clear();
			Constant.driver.findElement(By.xpath("//th[contains(.,'Project')]")).click();
			List<WebElement> All_Projects = Constant.driver.findElements(By.xpath(".//*[@id='oldRow']"));
			System.out.println(All_Projects.size());
			Constant.driver.findElement(By.xpath("//th[contains(.,'Project')]")).click();
			List<WebElement> All_Projects_AfterSort = Constant.driver.findElements(By.xpath(".//*[@id='oldRow']"));
			int k = 0;
			int m = 0;
			for (int i = 0, j = All_Projects.size() - 1; i <= All_Projects.size() - 1 || j >= 0; i++, j--) {
				Boolean Status = All_Projects.get(i).getText().equals(All_Projects_AfterSort.get(j).getText());
				if (Status) {
					k = k + 1;

				} else {

					k = 0;
					m = 1;
					break;
				}

			}

			if (k > m) {

				Report.ReporterOutput("Step", "Verifying Project Column Sorting by project name", "Project Sorting",
						"Project sorting should work properly according to project name",
						"Project sorting works properly according to project name", "Pass", null);

			} else {

				Report.ReporterOutput("Step", "Verifying Project Column Sorting by project name", "Project Sorting",
						"Project shorting should work properly according to project name",
						"Project shorting does not works properly according to project name", "Fail", null);
			}

			/*
			 * <*******************Week Days Shorting Field
			 * Shorting***********************************>
			 */

			Constant.driver.findElement(By.xpath("//th[contains(.,'Week End Date')]")).click();
			ArrayList<String> WeekDays_BeforeSort = new ArrayList<String>();
			int a = 0;
			int b = 0;
			for (int i = 1; i <= All_Projects.size(); i++) {
				WeekDays_BeforeSort.add(Constant.driver
						.findElement(By.xpath("//table[@id='userActivityTableId']/tbody/tr[" + i + "]/td[2]"))
						.getText());
			}

			ArrayList<String> WeekDays_AfterSort = new ArrayList<String>();
			Constant.driver.findElement(By.xpath("//th[contains(.,'Week End Date')]")).click();
			for (int i = 1; i <= All_Projects.size(); i++) {
				WeekDays_AfterSort.add(Constant.driver
						.findElement(By.xpath("//table[@id='userActivityTableId']/tbody/tr[" + i + "]/td[2]"))
						.getText());
			}
			for (int i = 0, j = WeekDays_BeforeSort.size() - 1; i <= WeekDays_BeforeSort.size() - 1
					|| j >= 0; i++, j--) {
				Boolean Status1 = WeekDays_BeforeSort.get(i).equals(WeekDays_AfterSort.get(j));
				if (Status1) {
					a = a + 1;

				} else {

					a = 0;
					b = 1;
					break;
				}

			}
			if (a > b) {

				Report.ReporterOutput("Step", "Verifying WeekDay Column Sorting by Weekday", "WeekDay Sorting",
						"WeekDay sorting should work properly according to Week day",
						"WeekDay sorting works properly according to Week day", "Pass", null);

			} else {

				Report.ReporterOutput("Step", "Verifying WeekDay Column Sorting by Weekday", "WeekDay Sorting",
						"WeekDay sorting should work properly according to Week day",
						"WeekDay sorting does not works properly according to Week day", "Fail", null);
			}

			/*
			 * <*******************Total Hours Field Shorting Field
			 * Shorting***********************************>
			 */

			Constant.driver.findElement(By.xpath("//th[contains(.,'Total (Hrs)')]")).click();
			ArrayList<String> Hours_BeforeSort = new ArrayList<String>();
			int c = 0;
			int d = 0;
			for (int i = 1; i <= All_Projects.size(); i++) {
				Hours_BeforeSort.add(Constant.driver
						.findElement(By.xpath("//table[@id='userActivityTableId']/tbody/tr[" + i + "]/td[3]"))
						.getText());
			}

			ArrayList<String> Hours_AfterSort = new ArrayList<String>();
			Constant.driver.findElement(By.xpath("//th[contains(.,'Total (Hrs)')]")).click();
			for (int i = 1; i <= All_Projects.size(); i++) {
				Hours_AfterSort.add(Constant.driver
						.findElement(By.xpath("//table[@id='userActivityTableId']/tbody/tr[" + i + "]/td[3]"))
						.getText());
			}
			for (int i = 0, j = Hours_BeforeSort.size() - 1; i <= Hours_BeforeSort.size() - 1 || j >= 0; i++, j--) {
				Boolean Status1 = Hours_BeforeSort.get(i).equals(Hours_AfterSort.get(j));
				if (Status1) {
					c = c + 1;

				} else {

					c = 0;
					d = 1;
					break;
				}

			}
			if (c > d) {

				Report.ReporterOutput("Step", "Verifying Hours Column Sorting by Hours", "Hours Sorting",
						"Hours sorting should work properly according to Hours ",
						"Hours sorting works properly according to Hours", "Pass", null);

			} else {

				Report.ReporterOutput("Step", "Verifying Hours Column Sorting by Hours", "Hours Sorting",
						"Hours sorting should work properly according to Week day",
						"Hours sorting does not works properly according to Week day", "Fail", null);
			}

			Thread.sleep(1000);
			PageObjects_TimesheetSubmission.MainPageLogo(Constant.driver).click();

		}

		catch (Exception ex) {

		}

	}

	/************************************************
	 * \Method to Select Date|
	 **********************/
	public static void DateSelect(String dd, String mm, String yyyy) {

		Integer text = new Integer(mm);
		String month =String.valueOf(text-1);
		PageObjects_TimesheetSubmission.DateCalendarImg(Constant.driver).click();

		Select Year = new Select(PageObjects_TimesheetSubmission.DateCaledarYearDropDown(Constant.driver));

		Year.selectByValue(yyyy);
		Select MonthDrop = new Select(PageObjects_TimesheetSubmission.DateCaledarMonthDropDown(Constant.driver));
		
		
		MonthDrop.selectByValue(month);
		PageObjects_TimesheetSubmission.DateCaledarDate(Constant.driver, dd).click();

	}

	/************************************************
	 * adding Time Items in TimeSheet
	 * 
	 * @throws Throwable
	 **********************/
	public static void UpdatingTimeSheetRow(int i, String Project, String Activity, String Module, String SubModule,
			String TicketNo, Sheet NewSheet, DataFormatter formatter) throws Throwable {

		Report.ReporterOutput("Step",
				"Updating Time Sheet Fields for Row = " + i + " as Project =>" + Project + " , Activity => " + Activity
						+ ", Module => " + Module + ", SubModule => " + SubModule + ", TicketNo =>" + TicketNo + "",
				"Updating Fields", "Updating Fields by taking data from Data sheet",
				"Data Fields Get updated Successfully", "Pass", null);
		Thread.sleep(1000);

		WebElement ElementProject = PageObjects_TimesheetSubmission.DropDown_TimesheetProject(Constant.driver, i);
		Select DropElementProject = new Select(ElementProject);

		DropElementProject.selectByVisibleText(Project);
		WebElement ElementActivity = PageObjects_TimesheetSubmission.DropDown_TimesheetActivity(Constant.driver, i);
		Select DropElementActivity = new Select(ElementActivity);

		DropElementActivity.selectByVisibleText(Activity);
		WebElement Module_Element = PageObjects_TimesheetSubmission.TextBox_TimesheetModule(Constant.driver, i);
		System.out.println(Module_Element.getTagName());
		if (Module_Element.getTagName().contains("select")) {

			Select ModuleSelect = new Select(Module_Element);
			ModuleSelect.selectByValue(Module);

		} else {
			Module_Element.clear();
			Module_Element.sendKeys(Module);

		}

		Thread.sleep(1000);
		WebElement SubModule_Element = PageObjects_TimesheetSubmission.TextBox_TimesheetsubModule(Constant.driver, i);

		if (SubModule_Element.getTagName().contains("select")) {
			Select SubModuleSelect = new Select(SubModule_Element);
			SubModuleSelect.selectByValue(SubModule);

		} else {
			SubModule_Element.clear();
			SubModule_Element.sendKeys(SubModule);

		}

		PageObjects_TimesheetSubmission.TextBox_Timesheet_TicketNo(Constant.driver, i).clear();
		PageObjects_TimesheetSubmission.TextBox_Timesheet_TicketNo(Constant.driver, i).sendKeys(TicketNo);

		ArrayList<String> Time_Comen = new ArrayList<String>();
		for (int j = 3; j <= 7; j++) {
			for (int k = 3; k <= 4; k++) {

				String Text = formatter.formatCellValue(NewSheet.getRow(k).getCell(j));
				Time_Comen.add(Text);
			}
		}

		int l = 0;

		for (int j = 2; j <= 6; j++) {
			while (l <= 9) {

				Thread.sleep(2000);

				Report.ReporterOutput("Step",
						"Updating Time Sheet Fields for Row = " + i + " and Day = " + j + " as Time => "
								+ Time_Comen.get(l) + " and Comments => " + Time_Comen.get(l + 1) + "",
						"Updating Time and Comments",
						"Updating time and comments Fields by taking data from Data sheet",
						"Time and Comments fields get updated successfully", "Pass", null);
				PageObjects_TimesheetSubmission.TextBox_Timesheet_DayHours(Constant.driver, i, j).clear();
				PageObjects_TimesheetSubmission.TextBox_Timesheet_DayHours(Constant.driver, i, j)
						.sendKeys(Time_Comen.get(l));
				PageObjects_TimesheetSubmission.Lnk_Timesheet_Comments(Constant.driver, i, j + 6).click();
				Thread.sleep(2000);
				PageObjects_TimesheetSubmission.TextBox_Timesheet_Comments_Box(Constant.driver, i, j).clear();
				PageObjects_TimesheetSubmission.TextBox_Timesheet_Comments_Box(Constant.driver, i, j)
						.sendKeys(Time_Comen.get(l + 1));
				PageObjects_TimesheetSubmission.TextBox_Timesheet_CommentBoxOkButton(Constant.driver, i, j + 6).click();

				l = l + 2;
				break;

			}

		}

		if (i < 1) {
			PageObjects_TimesheetSubmission.Link_Timesheet_AddRow(Constant.driver).click();
		}

	}

}
