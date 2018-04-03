package com.yash.RMS.POM.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.CommonMethods;

//***********************************************************************************************************************************
public class PageObjects_TimesheetSubmission {

	private static WebElement element = null;

	/******************************************************************************/

	public static WebElement lnk_Transaction(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//span[text()='Transaction']")), driver);
		return element;
	}

	public static WebElement lnk_TimesheetSubmission(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//a[@id='menuUserActivityList']")), driver);
		// element =
		// CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='menuTimeHoursEntry']")),
		// driver);
		return element;
	}

	public static WebElement lnk_AddTimesheet(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.id("addUpdate")), driver);
		// .//*[@id='addUpdate']
		return element;
	}

	public static WebElement DateCalendarImg(WebDriver driver) {
		// element =
		// driver.findElement(By.xpath(".//*[@id='frmSelect']/div[1]/span[2]/img"));
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='frmSelect']/div[1]/span[2]/img")),
				driver);
		return element;

	}

	public static WebElement DateCaledarMonthDropDown(WebDriver driver) {
		// element =
		// driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")),
				driver);
		return element;
	}

	public static WebElement DateCaledarYearDropDown(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")),
				driver);
		// element =
		// driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		return element;
	}

	public static WebElement DateCaledarDate(WebDriver driver, String i) {
		element = CommonMethods
				.waitForElement(driver.findElement(By.xpath("//a[text()='" + i + "']")), driver);
		// element = driver.findElement(By.xpath("//a[contains(text(),'"+ i
		// +"')][@href='#']"));
		return element;
	}

	public static WebElement StartDate(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.id("weekStartDate")), driver);
		// element = driver.findElement(By.id("weekStartDate"));
		return element;
	}

	public static WebElement EndDate(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='weekEndDate']")), driver);
		// element = driver.findElement(By.xpath(".//*[@id='weekEndDate']"));
		return element;
	}

	public static WebElement DropDown_TimesheetProject(WebDriver driver, int i) {
		element = CommonMethods.waitForElement(driver.findElement(By.id("resourceAllocIdrow" + i + "")), driver);
		// element = driver.findElement(By.id("resourceAllocIdrow"+ i +""));

		return element;
	}

	public static WebElement DropDown_TimesheetActivity(WebDriver driver, int i) {

		element = CommonMethods.waitForElement(driver.findElement(By.id("activityId" + i + "")), driver);

		// element = driver.findElement(By.id("activityId"+ i +""));

		return element;
	}

	public static WebElement TextBox_TimesheetModule(WebDriver driver, int i) {
		element = CommonMethods.waitForElement(driver.findElement(By.id("module" + i + "")), driver);
		// element = driver.findElement(By.id("module"+ i +""));

		return element;
	}

	public static WebElement TextBox_TimesheetsubModule(WebDriver driver, int i) {
		element = CommonMethods.waitForElement(driver.findElement(By.id("subModule" + i + "")), driver);
		// element = driver.findElement(By.id("subModule"+ i +""));

		return element;
	}

	public static WebElement TextBox_Timesheet_TicketNo(WebDriver driver, int i) {
		element = CommonMethods.waitForElement(driver.findElement(By.id("ticketNo" + i + "")), driver);
		// element = driver.findElement(By.id("ticketNo"+ i +""));
		return element;
	}

	public static WebElement TextBox_Timesheet_DayHours(WebDriver driver, int i, int j) {
		element = CommonMethods.waitForElement(driver.findElement(By.id("d" + j + "Hoursrow" + i + "")), driver);
		// element = driver.findElement(By.id("d"+ j +"d1Hoursrow0"+ i +""));
		return element;
	}

	public static WebElement Lnk_Timesheet_Comments(WebDriver driver, int i, int j) {
		element = CommonMethods
				.waitForElement(driver.findElement(By.xpath(".//*[@id='row" + i + "']/td[" + j + "]/div/img")), driver);
		// element =
		// driver.findElement(By.xpath(".//*[@id='row"+i+"']/td["+j+"]/div/img"));
		return element;
	}

	public static WebElement TextBox_Timesheet_Comments_Box(WebDriver driver, int i, int j) {
		// element =
		// CommonMethods.waitForElement(driver.findElement(By.xpath("//textarea[@id='d"+j+"Commentrow"+i+"']")),
		// driver);

		// driver.findElement(By.xpath("//textarea[@id='d1Commentrow0']"));
		element = driver.findElement(By.id("d" + j + "Commentrow" + i + ""));

		return element;
	}

	public static WebElement Img_Timesheet_DeleteImage(WebDriver driver, int i) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='row" + i + "']/td[14]/img")),
				driver);
		// element =
		// driver.findElement(By.xpath(".//*[@id='row"+i+"']/td[14]/img"));
		return element;
	}

	public static WebElement Link_Timesheet_Copy(WebDriver driver, int i) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='row" + i + "']/td[15]/a")),
				driver);
		// element =
		// driver.findElement(By.xpath(".//*[@id='row"+i+"']/td[15]/a"));
		return element;
	}

	public static WebElement TextBox_Timesheet_CommentBoxOkButton(WebDriver driver, int i, int j) {
		element = CommonMethods.waitForElement(
				driver.findElement(By.xpath(".//*[@id='row" + i + "']/td[" + j + "]/div/div/div[2]/input")), driver);
		// element = driver.findElement(By.xpath("//input[@value='Ok']"));
		return element;
	}

	public static WebElement Link_Timesheet_AddRow(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.id("addNewRow")), driver);
		/* element = driver.findElement(By.id("addNewRow")); */
		return element;
	}

	public static WebElement Button_Timesheet_Save(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.id("saveValues")), driver);
		/* element = driver.findElement(By.id("addNewRow")); */
		return element;
	}

	public static WebElement Link_To_SavedTimeSheet(WebDriver driver) {
		element = CommonMethods
				.waitForElement(driver.findElement(By.xpath("//a[contains(.,'StellarSupport-SCRY123')]")), driver);

		return element;
	}

	public static WebElement Text_SearchBox(WebDriver driver) {
		element = CommonMethods
				.waitForElement(driver.findElement(By.xpath("//input[@aria-controls='userActivityTableId']")), driver);

		return element;
	}

	public static WebElement Link_SavedTimeSheet(WebDriver driver) {
		element = CommonMethods
				.waitForElement(driver.findElement(By.xpath("//a[contains(.,'StellarSupport-SCRY123')]")), driver);

		return element;
	}

	public static WebElement Delete_Permission_Prompt(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//span[@class='noty_text']")), driver);

		return element;
	}

	public static WebElement Button_DeleteOk(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//button[@class='btn btn-primary']")),
				driver);

		return element;
	}

	public static WebElement Submit_Button(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.id("submit")), driver);

		return element;
	}

	public static WebElement Project_Short(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//th[contains(.,'Project')]")), driver);

		return element;
	}

	public static WebElement Date_Short(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//th[contains(.,'Week End Date')]")),
				driver);

		return element;
	}

	public static WebElement TotalHours_Short(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//th[contains(.,'Total (Hrs)')]")), driver);

		return element;
	}

	public static WebElement MainPageLogo(WebDriver driver) {
		element = CommonMethods.waitForElement(
				driver.findElement(By.xpath("//img[@src='/rms/resources/dashboardscript/bootstrap/img/logo.png']")),
				driver);

		return element;
	}

	public static WebElement DateSearchSubmissionPage(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.id("dateSearch")), driver);

		return element;
	}

	public static WebElement DateSearch_Month_Select(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")),
				driver);

		return element;
	}

	public static WebElement DateSearch_YearDropDown(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")),
				driver);

		return element;
	}

	public static WebElement DateSearch_ViewTimeSheet(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.id("view")), driver);

		return element;
	}

}
// End of File
// ***********************************************************************************************************************************