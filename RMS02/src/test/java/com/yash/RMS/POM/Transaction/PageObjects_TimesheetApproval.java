package com.yash.RMS.POM.Transaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.CommonMethods;

//***********************************************************************************************************************************
public class PageObjects_TimesheetApproval{

	private static WebElement element = null;
	/******************************************************************************************************************************/
	public static WebElement lnk_Save(WebDriver driver){
		//element = CommonMethods.waitForElement(driver.findElement(By.linkText("save")), driver);
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='8791']/td[10]/a[1]")), driver);
		//html/body/div[1]/div[1]/div[3]/div[2]/div[1]/form/div/table/tbody/tr/td[10]/a[1]
		return element;	
	}
	public static WebElement txt_Rejection(WebDriver driver){
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='rejectionTxt]")), driver);
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//textarea[contains(@id,'rejectionTxt')]")), driver);

		return element;	
	}
	//txt Reject Ok button
	public static WebElement btn_ok(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//input[contains(@id,'ok')]")), driver);
		// .//*[@id='ok']a]
		return element;	
	}
	//txt Reject cancel button  
	public static WebElement btn_cancel(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//input[contains(@id,'cancel')]")), driver);
		// .//*[@id='ok']a]
		return element;	
	}
	//RejectTimesheet // to very after it I hit the save button:  : Veri'fiaciton point  
	public static WebElement img_RejectTimesheet(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//img[contains(@src,'resources/images/reject_timesheet.png')]")), driver);
		//html/body/div[1]/div[1]/div[3]/div[2]/div[1]/form/div/table/tbody/tr/td[12]/a[1]/img
		return element;	
	}

	//change to APPROVE STATUS IMP :// to very hit the save button  then : Veri'fiaciton point  
	public static WebElement img_ApproveTimesheet(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//img[@src='resources/images/review_icon.png']")), driver);
		return element;	
	}

	public static WebElement lnk_Cancel(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='cancel']")), driver);
		return element;	
	}
	public static WebElement edit_PlannedHours(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='plannedHrs']")), driver);

		return element;	
	}
	public static WebElement edit_Billed_Hours(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='billedHrs']")), driver);
		return element;	
	}
	public static WebElement edit_Remarks(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='remarks']")), driver);
		return element;	
	}
	public static WebElement row_1stEmployeeId(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='3416']/td[1]/a")), driver);
		return element;	
	}
	public static WebElement img_Statustimesheet(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='comment_timehrsList']/img")), driver);
		return element;	
	}

	public static WebElement lnk_Transaction(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='transactionList']/a/span")), driver);
		return element;	
	}
	public static WebElement lnk_TimesheetApproval(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='menuTimeHoursEntry']")), driver);
		return element;	
	}
	public static WebElement lnk_Edit(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='8791']/td[10]/a")), driver);
		return element;	
	}
	public static WebElement lnk_ConfigurationPage(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='mailConfigurationList']/a/span")), driver);
		return element;	
	}

	public static WebElement lnk_Admin(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='adminList']/a")), driver);
		return element;	
	}

	public static WebElement lnk_ProjectsPage(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='menuProjectList']")), driver);
		return element;	
	}

	/******************************************************************************************************************************/
	public static WebElement Dropdown_ShowEntry(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='timehrsTableId1_length']/label/select")), driver);
		return element;	
	}

	public static WebElement txtbx_search(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='timehrsTableId1_filter']/label/input")), driver);
		return element;	
	}

	public static WebElement status(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='activeOrAll']")), driver);
		return element;	
	}

	public static WebElement lnk_AddTimesheet(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[4]/div[1]/div[1]/div/div[1]/a")), driver);
		return element;	
	}

	//To select the YEAR from Drop down
	public static WebElement dd_newTimeSheetStatus(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='newTimeSheetStatus']")), driver);
		return element;
	}
	public static WebElement lnk_AddNewTimesheetActivityDeleteOK(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/ul[2]/li/div/div[2]/button[1]")), driver);
		return element;	
	}
	public static WebElement btn_AddNewTimesheetSave(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[4]/div[2]/div[2]/div[4]/input[1]")), driver);
		return element;	
	}

	//to click an particular  date 
	public static WebElement lnk_AddTimesheetDate_date_click(WebDriver driver) {
		// 24 JAN 2016 : 01/24/2016 week end date : 01/30/2016 
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr[5]/td[1]/a")), driver);
		return element;

	}
	
	//***************************Sorting elements on the page******************************//
	
	public static WebElement dd_timeSheetType(WebDriver driver){
		element = driver.findElement(By.id("newTimeSheetStatus"));
		return element;
	}
	
	public static WebElement dd_timeSheetStatus(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='activeOrAll']"));
		return element;	
	}
	
	public static WebElement activeSheetCount(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='bottom']/div"));
		return element;	
	}
	
	public static WebElement paginationNumberCount(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='bottom']/div[@class='dataTables_paginate paging_full_numbers']/span/a"));
		return element;	
	}
	
	public static WebElement notificationBarCloseButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='notification-bar']/span"));
		return element;	
	}
	
	public static WebElement dd_ShowEntryOnPage(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='timehrsTableId1_length']/label/select"));
		return element;	
	}
	
	public static WebElement searchTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='dataTables_filter']/label/input"));
		return element;	
	}
	
	public static WebElement employeIdLinkOnPage(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='timehrsTableId1']/tbody/tr/td/a"));
		return element;	
	}
	
	public static WebElement employeListPage(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='timehrsTableId1']/tbody"));
		return element;	
	}
	
	//********************** searched user Time sheet list page********/////////////////////
	
	public static WebElement userEmployeIdText(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='timehrsTableId2']/tbody/tr/td"));
		return element;	
	}
	
	public static WebElement userNameText(WebDriver driver, int row) {
		element = driver.findElement(By.xpath("//table[@id='timehrsTableId2']/tbody/tr["+row+"]/td[2]"));
		return element;	
	}
	
	public static WebElement userTimeSheetWeekEndDateText(WebDriver driver, int row) {
		element = driver.findElement(By.xpath("//table[@id='timehrsTableId2']/tbody/tr["+row+"]/td[6]"));
		return element;	
	}
	
	public static WebElement getProjectName(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='timehrsTableId2']/tbody/tr/td[4]"));
		return element;	
	}
	
	public static WebElement getProjectNameWithRowNumber(WebDriver driver, int row) {
		element = driver.findElement(By.xpath("//table[@id='timehrsTableId2']/tbody/tr["+row+"]/td[4]"));
		return element;	
	}
	
	public static WebElement userTimeSheetPlanedHour(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='timehrsTableId2']/tbody/tr/td[5]/input"));
		return element;	
	}
	
	public static WebElement userTimeSheetBuildHour(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='timehrsTableId2']/tbody/tr/td[8]/input"));
		return element;	
	}
	
	public static WebElement userTimeSheetRemarks(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='timehrsTableId2']/tbody/tr/td[9]/input"));
		return element;	
	}
	
	public static WebElement userTimeSheetApproveButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='timehrsTableId2']/tbody/tr/td[10]/a"));
		return element;	
	}
	
	public static WebElement userTimeSheetRejectButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='timehrsTableId2']/tbody/tr/td[12]/a"));
		return element;	
	}
	
	public static WebElement timeSheetRejectionCommentsDiv(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='fancybox-skin']"));
		return element;	
	}
	
	public static WebElement enterTimeSheetRejectionComments(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='fancybox-skin']/div/div/div/table/tbody/tr[2]/td/textarea"));
		return element;	
	}
	
	public static WebElement clickOkONTimeSheetRejectionCommentBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='fancybox-skin']/div/div/div/table/tbody/tr[3]/td/input"));
		return element;	
	}
	
	public static WebElement userTimeSheetSearchBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='timehrsTableId2_filter']/label/input"));
		return element;	
	}
	
	public static WebElement numberOfSearchRecords(WebDriver driver){
		element = driver.findElement(By.xpath("//table[@id='timehrsTableId2']/tbody"));
		return element;	
	}
	
	public static WebElement timeSheetListTab(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@class='tab_seaction']/ul/li/a"));
		return element;	
	}
	
	public static WebElement timeSheetEmptyList(WebDriver driver){
		element = driver.findElement(By.xpath("//table[@id='timehrsTableId2']/tbody/tr/td"));
		return element;	
	}
	
	public static WebElement excelDownloadButtonForAllTimeSheets(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@class='DTTT_container']/a"));
		return element;	
	}
	
	public static WebElement successMessage(WebDriver driver) {
		element = driver.findElement(By.className("toast-message"));
		return element;
	}
	
	public static WebElement timeSheetStatusDropDown(WebDriver driver) {
		element = driver.findElement(By.id("timeSheetStatus"));
		return element;
	}
	
	public static WebElement getTimeSheetStatus(WebDriver driver, int row) {
		element = driver.findElement(By.xpath("//table[@id='timehrsTableId2']/tbody/tr["+row+"]/td[11]"));
		return element;
	}
}
//End of File ***********************************************************************************************************************************