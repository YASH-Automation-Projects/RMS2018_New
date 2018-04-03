package com.yash.RMS.TestAction.Transaction;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.yash.RMS.CustomProperties.CommonMethods;
import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.ExcelUtility;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Transaction.PageObjects_TimesheetApproval;

public class TestAction_TimesheetApproval2 {
		
	public static List<String>  employeIdForTSApprove = new ArrayList<String>();
	public static List<String>  employeNameForTSApprove = new ArrayList<String>();
	public static List<String>  dateForTSApprove = new ArrayList<String>();
	public static List<String>  plandHourForTSApprove = new ArrayList<String>();
	public static List<String>  buildHourForTSApprove = new ArrayList<String>();	
	public static List<String>  remarkForTSApprove = new ArrayList<String>();
	public static List<String>  employeIdForTSReject = new ArrayList<String>();
	public static List<String>  employeNameForTSReject  = new ArrayList<String>();
	public static List<String>  dateForTSReject = new ArrayList<String>();
	public static List<String>  rejectionCommentForTSReject  = new ArrayList<String>();	

	
	public static void getTestData(){
		try{ExcelUtility testData = new ExcelUtility(Constant.RMS_TEST_DATA, "TimeSheet_Approval");
		for(int i=2; i<=testData.ws.getLastRowNum(); i++){
			for(int j=0; j<=5; j++){
				Cell cell = testData.ws.getRow(i).getCell(j);
				getTimeSheetAproveData(j, cell);
			}
			for(int k=6; k<=9; k++){
				Cell cell = testData.ws.getRow(i).getCell(k);
				getTimeSheetRejectionData(k, cell);
			}
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void getTimeSheetAproveData(int j, Cell cell){
		if(j==0){
			employeIdForTSApprove.add(cell.getStringCellValue());			
		}else if (j==1) {
			employeNameForTSApprove.add(cell.getStringCellValue());
		}else if (j==2) {
			dateForTSApprove.add(cell.getStringCellValue());
		}else if (j==3) {
			plandHourForTSApprove.add( cell.getStringCellValue());
		}else if (j==4) {
			buildHourForTSApprove.add(cell.getStringCellValue());
		}else if (j==5) {
			remarkForTSApprove.add(cell.getStringCellValue());
		}
	}
	
	public static void getTimeSheetRejectionData(int k, Cell cell){
		if(k==6){
			employeIdForTSReject.add(cell.getStringCellValue());
		}else if (k==7) {
			employeNameForTSReject.add(cell.getStringCellValue());
		}else if (k==8) {
			dateForTSReject.add(cell.getStringCellValue());
		}else if (k==9) {
			rejectionCommentForTSReject.add(cell.getStringCellValue());
		}
	}
	
	public static void navigateToTimeSheetApprovalpage() throws Throwable{
		try{
			if(PageObjects_TimesheetApproval.lnk_Transaction(Constant.driver).isEnabled()){
				PageObjects_TimesheetApproval.lnk_Transaction(Constant.driver).click();			
				Report.ReporterOutput("Step","Verify Transaction link is enabled.","Transaction link", "Transaction link should be enabled and clicked.", "Transaction link is enabled and clicked.", "Pass", null);
				if(PageObjects_TimesheetApproval.lnk_TimesheetApproval(Constant.driver).isEnabled()){
					PageObjects_TimesheetApproval.lnk_TimesheetApproval(Constant.driver).click();
					Report.ReporterOutput("Step","Verify TimeSheet Approval link is enabled.","TimeSheet Approval link", "TimeSheet Approval link should be enabled and clicked.", "TimeSheet Approval link is enabled and clickable.", "Pass", null);
				}else{
					Report.ReporterOutput("Step","Verify TimeSheet Approval link is enabled.","TimeSheet Approval link", "TimeSheet Approval link should be enabled and clicked.", "TimeSheet Approval link is not enabled and not clickable.", "Fail", null);
				}
			}else{
				Report.ReporterOutput("Step","Verify Transaction link is enabled.","Transaction link", "Transaction link should be enabled and clicked.", "Transaction link is not enabled and clickable.", "Fail", null);
			}
		}catch(Exception e){
			Report.ReporterOutput("Step","Verify Transaction and TimeSheet Approval links are not throwing any exception.","Transection and TimeSheet Approval link", "Transection and TimeSheet Approval links should be enabled and clicked.", "Exception in Transection :- "+e.getMessage()+"", "Fail", null);
		}
	}
	
	public static void verifyExcelDownloadingFunctionality() throws Throwable{
		try{
			PageObjects_TimesheetApproval.excelDownloadButtonForAllTimeSheets(Constant.driver).click();
			Thread.sleep(1000);
			String FolderPath = System.getProperty("user.dir");
			Runtime.getRuntime().exec(FolderPath+"/src/test/resources/AutoIt Files/Chrome_Timesheet_approval_download.exe");			 
			String filePath = System.getProperty("user.home") + "/Desktop/Resource Timehours Entry.xls";
			Path path = Paths.get(filePath);
			if (Files.exists(path)) {
				Report.ReporterOutput("Step","Verify Excel download functipnality is working fine and file is exist on desktop.","Timesheets excel downloading", "Excel fine should be working fine and file should be downloaded on desktop", "Download functionality is working fine and File is exist on desktop", "Pass", null);
			}else{
				Report.ReporterOutput("Step","Verify Excel download functipnality is working fine and file is exist on desktop.","Timesheets excel downloading", "Excel fine should be working fine and file should be downloaded on desktop", "Download functionality is not working fine and File is not exist on desktop", "Fail", null);
			}
		}catch(Exception e){
			Report.ReporterOutput("Step","Verify Excel download functipnality is not throwing any exception.","Timesheets excel downloading", "Excel fine should not throw any exception", "Exception in downloading excel file :- "+e.getMessage()+"", "Fail", null);
		}
	}
	
	public static void verifySortingElementsOnTimeSheetApprovalpage() throws Throwable{
		try{
			new Select(PageObjects_TimesheetApproval.dd_timeSheetType(Constant.driver)).selectByVisibleText("All");
			CommonMethods.waitForPageToBeLoaded();
			verifyNumberOfActiveAndInactiveTimeSheets();
			showNumberOfSheetOnPage();
			verifyPaginationData();
		}catch(Exception e){
			Report.ReporterOutput("Step","Verify elements sorting is working fine.","Sorting of elements", "Elemetns sortings should be working fine.", "Exception in elements sorting :- "+e.getMessage()+"", "Fail", null);
		}
	}
	
	public static void verifyNumberOfActiveAndInactiveTimeSheets() throws Throwable{
		try{
			CommonMethods.waitForPageToBeLoaded();
			String activeCount = PageObjects_TimesheetApproval.activeSheetCount(Constant.driver).getText();
			new Select(PageObjects_TimesheetApproval.dd_timeSheetStatus(Constant.driver)).selectByVisibleText("All");
			CommonMethods.waitForPageToBeLoaded();
			String allSheetCount = PageObjects_TimesheetApproval.activeSheetCount(Constant.driver).getText();
			Report.ReporterOutput("Step","Verify Active Time Sheet Count on the timesheet approval page.","Getting active and all timesheet counts", "Active and All timesheets count should be visible on the page.", "Active timesheets count is: "+activeCount.substring(19,activeCount.length()-0)+" \n All Timesheet Counts is :"+allSheetCount.substring(19,allSheetCount.length()-0)+"", "Pass", null);
		}catch(Exception e){
			Report.ReporterOutput("Step","Verify Active Time Sheet Count on the timesheet approval page.","Getting active and all timesheet counts", "Active and All timesheets count should be visible on the page.", "Exception to verify active and all timesheet counts", "Fail", null);
		}
	}
	
	public static void closeNotificationBar(){
		if(PageObjects_TimesheetApproval.notificationBarCloseButton(Constant.driver).isDisplayed()){
			PageObjects_TimesheetApproval.notificationBarCloseButton(Constant.driver).click();
		}
	}
	
	public static void showNumberOfSheetOnPage() throws Throwable{
		List<WebElement> Rows = new Select(PageObjects_TimesheetApproval.dd_ShowEntryOnPage(Constant.driver)).getOptions();
		for(int i=0; i<=Rows.size()-1; i++){
			new Select(PageObjects_TimesheetApproval.dd_ShowEntryOnPage(Constant.driver)).selectByIndex(i);
			String numberTextFromDropDown = Rows.get(i).getText().toString();
			int numberSelected = Integer.parseInt(numberTextFromDropDown);
			String numberTextOnPage = PageObjects_TimesheetApproval.activeSheetCount(Constant.driver).getText();
			String numberFromString = CommonMethods.getWordFromString(numberTextOnPage, 3);
			
			List<WebElement> numberOfTimesheetsOnPage = PageObjects_TimesheetApproval.employeListPage(Constant.driver).findElements(By.tagName("tr"));
			if(numberFromString.equalsIgnoreCase(numberTextFromDropDown) && numberOfTimesheetsOnPage.size() == numberSelected){
				Report.ReporterOutput("Step","Verify DropDown to show number of TimeSheets on page.","DropDown to show number of TimeSheets on page", "Timesheets should be visible on the page as per DropDown value", "DropDown selected value is :- "+numberTextFromDropDown+" and number of TimeSheets are visible on page is:-  "+numberFromString+"", "Pass", null);
			}else{
				Report.ReporterOutput("Step","Verify DropDown to show number of TimeSheets on page.","DropDown to show number of TimeSheets on page", "Timesheets should be visible on the page as per DropDown value", "DropDown selected value is :- "+numberTextFromDropDown+" and number of TimeSheets are visible on page is:-  "+numberFromString+"", "Fail", null);
			}
		}
	}
	
	public static void verifyPaginationData() throws Throwable{
		try{
			new Select(PageObjects_TimesheetApproval.dd_ShowEntryOnPage(Constant.driver)).selectByVisibleText("10");
			int i=1;
			do{
				closeNotificationBar();
				CommonMethods.waitForElementClickable(PageObjects_TimesheetApproval.paginationNumberCount(Constant.driver), Constant.driver);
				String text = PageObjects_TimesheetApproval.activeSheetCount(Constant.driver).getText();
				String text2 = text.substring(8,text.length()-0);
				String timeSheetnumberOnPage = text2.substring(0,8).trim();
				paginationValidate(i, timeSheetnumberOnPage);
				i++;
				Constant.driver.findElement(By.xpath("//div[@class='bottom']/div[@class='dataTables_paginate paging_full_numbers']/span/a["+i+"]")).click();
				Thread.sleep(1000);
			}while(i<=4);
		}catch (Exception e) {
			Report.ReporterOutput("Step","Verify Pagination is working on page.","Pagination on Timesheet approval page", "Pagination should work properly", "Pagination is Not working fine on Timesheet approval page.", "Fail", null);
		}
	}	

	public static void paginationValidate(int i, String timeSheetnumberOnPage) throws Throwable{
		List<WebElement> Rows = PageObjects_TimesheetApproval.employeListPage(Constant.driver).findElements(By.tagName("tr"));
		if(i==1 && Rows.size()==10 && timeSheetnumberOnPage.equalsIgnoreCase("1 to 10")){
			Report.ReporterOutput("Step","Verify Pagination is working on page.","Pagination on Timesheet approval page", "Timesheets should be display on the page as per Selected Days from the DropDown", "On page number "+i+" number of Timesheets are :- "+timeSheetnumberOnPage+"", "Pass", null);
		}else if (i==2 && Rows.size()==10 && timeSheetnumberOnPage.equalsIgnoreCase("11 to 20")) {
			Report.ReporterOutput("Step","Verify Pagination is working on page.","Pagination on Timesheet approval page", "Timesheets should be display on the page as per Selected Days from the DropDown", "On page number "+i+" number of Timesheets are :- "+timeSheetnumberOnPage+"", "Pass", null);
		}else if (i==3 && Rows.size()==10 && timeSheetnumberOnPage.equalsIgnoreCase("21 to 30")) {
			Report.ReporterOutput("Step","Verify Pagination is working on page.","Pagination on Timesheet approval page", "Timesheets should be display on the page as per Selected Days from the DropDown", "On page number "+i+" number of Timesheets are :- "+timeSheetnumberOnPage+"", "Pass", null);
		}
	}
	
	public static void searchUserByPerametersAndApproveTimeSheet() throws Throwable{
		try{
			for(int i=0; i<=employeIdForTSApprove.size()-1; i++){
				PageObjects_TimesheetApproval.searchTextBox(Constant.driver).sendKeys(employeIdForTSApprove.get(i));
				Thread.sleep(2000);
				if(PageObjects_TimesheetApproval.employeIdLinkOnPage(Constant.driver).isEnabled()){
					PageObjects_TimesheetApproval.employeIdLinkOnPage(Constant.driver).click();
					Report.ReporterOutput("Step","Verify Employe Id Link is enable and clickable on timesheet approval page.","Employe Id Link on timesheet list page", "Employe Id Link should be enable and clickable", "Employe Id Link is working fine, Selected Employe Name is :- "+employeNameForTSApprove.get(i)+" and Employe ID is :- "+employeIdForTSApprove.get(i)+"", "Pass", null);
					CommonMethods.waitForPageToBeLoaded();
					Thread.sleep(1000);
					String emptyTimeSheetMessage = PageObjects_TimesheetApproval.timeSheetEmptyList(Constant.driver).getText();
					if(!emptyTimeSheetMessage.equalsIgnoreCase("No matching records found") || emptyTimeSheetMessage.equalsIgnoreCase("No data available in table")){
						verifyTimeSheetsAreVisibleForselectedUser(employeNameForTSApprove.get(i));
						searchTimeSheetByDateAndValidate(dateForTSApprove.get(i));
						approveTimeSheet(dateForTSApprove.get(i), i);
						Constant.driver.navigate().refresh();
						Thread.sleep(1000);
					}else{
						Report.ReporterOutput("Step","Verify that timesheets is visible or not for the searched date.","Timesheets visibility for searched date", "Timesheets should be visible on the page if present in the system", "Timesheets are not available for the searched date", "Fail", null);
					}
				}else{
					Report.ReporterOutput("Step","Verify Employe Id Link is enable and clickable on timesheet approval page.","Employe Id Link on timesheet list page", "Employe Id Link should be enable and clickable", "Employe Id Link is Not working fine, Searched employe Name was  :- "+employeNameForTSApprove.get(i)+" and Employe ID was :- "+employeIdForTSApprove.get(i)+"", "Fail", null);
				}
			}
		}catch(Exception e){
			Report.ReporterOutput("Step","Verify system is not throwing any exception while Approving timesheet functionality.","Approve functionality", "System should not throwing any exception while Approving timesheet functionality.", "System is throwing Exception :- "+e.getMessage()+"", "Fail", null);
		}
	}
	
	public static void searchUserByperametersAndRejectTimeSheet() throws Throwable{
		try{
			for(int i=0; i<=employeIdForTSReject.size()-1; i++){
				PageObjects_TimesheetApproval.searchTextBox(Constant.driver).sendKeys(employeIdForTSReject.get(i));
				PageObjects_TimesheetApproval.employeIdLinkOnPage(Constant.driver).click();
				CommonMethods.waitForPageToBeLoaded();
				Thread.sleep(2000);
				String emptyTimeSheetMessage = PageObjects_TimesheetApproval.timeSheetEmptyList(Constant.driver).getText();
				if(!emptyTimeSheetMessage.equalsIgnoreCase("No matching records found") || emptyTimeSheetMessage.equalsIgnoreCase("No data available in table")){
					PageObjects_TimesheetApproval.userTimeSheetSearchBox(Constant.driver).sendKeys(dateForTSReject.get(i));
					Thread.sleep(2000);
					String projectName = PageObjects_TimesheetApproval.getProjectName(Constant.driver).getText();
					String employeName = PageObjects_TimesheetApproval.userNameText(Constant.driver, 1).getText();
					String employeId = PageObjects_TimesheetApproval.userEmployeIdText(Constant.driver).getText();
					String Date = dateForTSReject.get(i);
					rejectTimeSheet(projectName, Date, employeName, employeId);
					Constant.driver.navigate().refresh();
					Thread.sleep(1000);
				}else{
					Report.ReporterOutput("Step","Verify that timesheets is visible or not for the searched date.","Timesheets visibility for searched date", "Timesheets should be visible on the page if present in the system", "Timesheets are not available for the searched date", "Fail", null);
				}
			}
		}catch(Exception e){
			Report.ReporterOutput("Step","Verify system is not throwing any exception while Rejecting timesheet functionality.","Reject functionality", "System should not throwing any exception while Rejecting timesheet functionality.", "System is throwing Exception :- "+e.getMessage()+"", "Fail", null);
		}
	}
	
	public static void rejectTimeSheet(String projectName, String Date, String employeName, String employeId) throws Throwable{
		String successMessage = null;
		int k =0;
		List<WebElement> Rows = PageObjects_TimesheetApproval.numberOfSearchRecords(Constant.driver).findElements(By.tagName("tr"));
		for(int j=1; j<=Rows.size(); j++){
			PageObjects_TimesheetApproval.userTimeSheetRejectButton(Constant.driver).click();
			CommonMethods.waitForElement(PageObjects_TimesheetApproval.timeSheetRejectionCommentsDiv(Constant.driver), Constant.driver);
			Thread.sleep(1000);
			PageObjects_TimesheetApproval.enterTimeSheetRejectionComments(Constant.driver).sendKeys(rejectionCommentForTSReject.get(k));
			Thread.sleep(1000);
			PageObjects_TimesheetApproval.clickOkONTimeSheetRejectionCommentBox(Constant.driver).click();
			CommonMethods.waitForElement(PageObjects_TimesheetApproval.successMessage(Constant.driver), Constant.driver);			
			if(PageObjects_TimesheetApproval.successMessage(Constant.driver).isDisplayed()){
				successMessage = PageObjects_TimesheetApproval.successMessage(Constant.driver).getText();
				Report.ReporterOutput("Step","Verify timesheet reject functionality is working fine or not","Timesheet reject functionality", "Timesheet reject functionality should work fine for EmployeId :- "+employeId+" and EmployeName"+employeName+"", "Timesheet has been Rejected for PROJECT :- "+projectName+" and for DATE :- "+Date+"  with success message:- "+successMessage+"", "Pass", null);
			}else{
				Report.ReporterOutput("Step","Verify timesheet reject functionality is working fine or not","Timesheet reject functionality", "Timesheet reject functionality should work fine for EmployeId :- "+employeId+" and EmployeName"+employeName+"", "Timesheet reject functionality is Not working fine  for PROJECT :- "+projectName+" and for DATE :- "+Date+"", "Fail", null);
			}
			Thread.sleep(2000);
			PageObjects_TimesheetApproval.userTimeSheetSearchBox(Constant.driver).sendKeys(Date);
			k++;
			Thread.sleep(1000);
		}
	}
	
	public static void verifyTimeSheetsAreVisibleForselectedUser(String Name) throws Throwable{
		int flagSelectUserTimeSheet=0;
		List<WebElement> Rows = PageObjects_TimesheetApproval.numberOfSearchRecords(Constant.driver).findElements(By.tagName("tr"));
		for(int j=1; j<=Rows.size(); j++){
			if(PageObjects_TimesheetApproval.userNameText(Constant.driver, j).getText().equalsIgnoreCase(Name)){
				flagSelectUserTimeSheet++;			
			}
		}
		if(flagSelectUserTimeSheet==Rows.size()){
			Report.ReporterOutput("Step","Verify timesheets are visible for selected user only.","TimeSheets visibility for selected user", "TimeSheets sahould be visible only for selected user", "TimeSheets are visible only for selected user :- "+Name+"", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify timesheets are visible for selected user only.","TimeSheets visibility for selected user", "TimeSheets sahould be visible only for selected user", "TimeSheets are NOT visible only for selected user :- "+Name+"", "Fail", null);
		}
	}
	
	public static void searchTimeSheetByDateAndValidate(String Date) throws Throwable{
		if(!Date.equals(" ")){
			PageObjects_TimesheetApproval.userTimeSheetSearchBox(Constant.driver).sendKeys(Date);			
			List<WebElement> Rows = PageObjects_TimesheetApproval.numberOfSearchRecords(Constant.driver).findElements(By.tagName("tr"));
			int flagDateVerification=0;
			for(int k=1; k<=Rows.size(); k++){
				String getDate = PageObjects_TimesheetApproval.userTimeSheetWeekEndDateText(Constant.driver, k).getText();
				if(Date.equalsIgnoreCase(getDate)){
					flagDateVerification++;					
				}
			}
			if(flagDateVerification==Rows.size()){
				Report.ReporterOutput("Step","Verify Timesheets are visible only for searched date","Timesheets sorting for date", "Timesheets should be visible only for the searched date :"+Date+"", "Timesheets are visible for the searched date: "+Date+".", "Pass", null);
			}else{
				Report.ReporterOutput("Step","Verify Timesheets are visible only for searched date","Timesheets sorting for date", "Timesheets should be visible only for the searched date :"+Date+"", "Timesheets is NOT visible for the searched date: "+Date+".", "Fail", null);
			}	
		}
	}
	
	public static void approveTimeSheet(String Date, int i) throws Throwable{
		int flagTimeSheetApprovalStatus=0;
		List<WebElement> Rows = PageObjects_TimesheetApproval.numberOfSearchRecords(Constant.driver).findElements(By.tagName("tr"));
		for(int j=1; j<=Rows.size(); j++){
			PageObjects_TimesheetApproval.userTimeSheetPlanedHour(Constant.driver).clear();
			PageObjects_TimesheetApproval.userTimeSheetPlanedHour(Constant.driver).sendKeys(plandHourForTSApprove.get(i));			
			PageObjects_TimesheetApproval.userTimeSheetBuildHour(Constant.driver).clear();
			PageObjects_TimesheetApproval.userTimeSheetBuildHour(Constant.driver).sendKeys(buildHourForTSApprove.get(i));
			PageObjects_TimesheetApproval.userTimeSheetRemarks(Constant.driver).clear();
			PageObjects_TimesheetApproval.userTimeSheetRemarks(Constant.driver).sendKeys(remarkForTSApprove.get(i));
			String projectName = PageObjects_TimesheetApproval.getProjectName(Constant.driver).getText();
			String employeName = PageObjects_TimesheetApproval.userNameText(Constant.driver, 1).getText();
			String employeId = PageObjects_TimesheetApproval.userEmployeIdText(Constant.driver).getText();
			PageObjects_TimesheetApproval.userTimeSheetApproveButton(Constant.driver).click();
			Thread.sleep(1000);
			CommonMethods.acceptAlertMessage(Constant.driver);
			flagTimeSheetApprovalStatus++;
			isTimeSheetApproved(projectName, Date, employeName, employeId);
			PageObjects_TimesheetApproval.userTimeSheetSearchBox(Constant.driver).sendKeys(Date);	
		}
		if(flagTimeSheetApprovalStatus==Rows.size()){
			Report.ReporterOutput("Step","Verify timesheet approve button is enable and clickable.","Timesheet approve button functionality", "Timesheet approve button should be enable and clickable", "Timesheet approve button is working fine.", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify timesheet approve button is enable and clickable.","Timesheet approve button functionality", "Timesheet approve button should be enable and clickable", "Timesheet approve button is Not working fine.", "Fail", null);
		}
	}
	
	public static void isTimeSheetApproved(String projectName, String Date, String employeName, String employeId) throws Throwable{
		CommonMethods.waitForElement(PageObjects_TimesheetApproval.successMessage(Constant.driver), Constant.driver);
		String successMessage = PageObjects_TimesheetApproval.successMessage(Constant.driver).getText();
		if(PageObjects_TimesheetApproval.successMessage(Constant.driver).isDisplayed()){
			Report.ReporterOutput("Step","Verify timesheet approve functionality is working fine or not","Timesheet approve functionality", "Timesheet approve functionality should work fine for EmployeId :- "+employeId+" and EmployeName :- "+employeName+"", "Timesheet has been approved for PROJECT :- "+projectName+" and for DATE :- "+Date+"  with success message:- "+successMessage+"", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify timesheet approve functionality is working fine or not","Timesheet approve functionality", "Timesheet approve functionality should work fine for EmployeId :- "+employeId+" and EmployeName :- "+employeName+"", "Timesheet approve functionality is NOT working for PROJECT :- "+projectName+" and for DATE :- "+Date+"", "Fail", null);
		}
		Thread.sleep(2000);
	}
	
	public static void validateApprovedTimeSheet() throws Throwable{
		try{
			Constant.driver.navigate().refresh();
			CommonMethods.waitForPageToBeLoaded();
			for(int i=0; i<=employeIdForTSApprove.size()-1; i++){
				PageObjects_TimesheetApproval.searchTextBox(Constant.driver).sendKeys(employeIdForTSApprove.get(i));
				Thread.sleep(2000);
				String employeName = employeNameForTSApprove.get(i);
				String Date = dateForTSApprove.get(i);
				PageObjects_TimesheetApproval.employeIdLinkOnPage(Constant.driver).click();
				CommonMethods.waitForPageToBeLoaded();
				Thread.sleep(2000);
				PageObjects_TimesheetApproval.userTimeSheetSearchBox(Constant.driver).sendKeys(dateForTSApprove.get(i));
				Thread.sleep(2000);
				if(isTimeSheetStillPresentForApprove("Approved", employeName, Date)){
					Thread.sleep(1000);
					isApprovedTimeSheetStatusChangedToApproved(Date, "Approved", employeName);
					Constant.driver.navigate().refresh();
					Thread.sleep(1000);
				}
			}
		}catch(Exception e){
			Report.ReporterOutput("Step","Verify system is not throwing any exception while validating approved timesheet functionality.","Validating approved timesheets functionality", "System should not throwing any exception while validating approved timesheets.", "System is throwing Exception :- "+e.getMessage()+"", "Fail", null);
		}
	}
	
	public static void validateRejectedTimeSheet() throws Throwable{
		try{
			Constant.driver.navigate().refresh();
			CommonMethods.waitForPageToBeLoaded();
			Thread.sleep(1000);
			for(int i=0; i<=employeIdForTSReject.size()-1; i++){
				PageObjects_TimesheetApproval.searchTextBox(Constant.driver).sendKeys(employeIdForTSReject.get(i));
				Thread.sleep(2000);
				String employeName = employeNameForTSReject.get(i);
				String Date = dateForTSReject.get(i);
				PageObjects_TimesheetApproval.employeIdLinkOnPage(Constant.driver).click();
				CommonMethods.waitForPageToBeLoaded();
				Thread.sleep(2000);
				PageObjects_TimesheetApproval.userTimeSheetSearchBox(Constant.driver).sendKeys(dateForTSReject.get(i));
				Thread.sleep(2000);
				if(isTimeSheetStillPresentForApprove("Rejected", employeName, Date)){
					Thread.sleep(1000);
					isApprovedTimeSheetStatusChangedToApproved(Date, "Rejected", employeName);
					Constant.driver.navigate().refresh();
					Thread.sleep(1000);
				}
			}
		}catch(Exception e){
			Report.ReporterOutput("Step","Verify system is not throwing any exception while validating rejected timesheet functionality.","Validating rejected timesheets functionality", "System should not throwing any exception while validating rejected timesheets.", "System is throwing Exception :- "+e.getMessage()+"", "Fail", null);
		}
	}
	
	public static boolean isTimeSheetStillPresentForApprove(String timeSheetType, String employeName, String Date) throws Throwable{
		boolean result = false;
		String emptyTimeSheetMessage = PageObjects_TimesheetApproval.timeSheetEmptyList(Constant.driver).getText();
		if(emptyTimeSheetMessage.equalsIgnoreCase("No matching records found") || emptyTimeSheetMessage.equalsIgnoreCase("No data available in table")){
			Report.ReporterOutput("Step","Verify that already "+timeSheetType+" timesheets is still visible in REVIEWED section or not.",""+timeSheetType+" timesheet verification in REVIEWED section", ""+employeName+"'s "+timeSheetType+" timesheets should not be visible in the REVIEWED section for Date:- "+Date+"", ""+timeSheetType+" timesheets is not visible on the page for "+Date+"", "Pass", null);
			result = true;
		}else{
			Report.ReporterOutput("Step","Verify that already "+timeSheetType+" timesheets is still visible in REVIEWED section or not.",""+timeSheetType+" timesheet verification in REVIEWED section", ""+employeName+"'s "+timeSheetType+" timesheets should not be visible in the REVIEWED section for Date:- "+Date+"", ""+timeSheetType+" timesheets is still visible on the page for "+Date+"", "Fail", null);
			result = false;
		}
		return result;
	}
	
	public static void isApprovedTimeSheetStatusChangedToApproved(String Date, String timeSheetStatus, String employeName) throws Throwable{
		String projectName = null;
		String statusOfTimeSheet = null;
		new Select(PageObjects_TimesheetApproval.timeSheetStatusDropDown(Constant.driver)).selectByVisibleText(timeSheetStatus);
		Thread.sleep(3000);
		PageObjects_TimesheetApproval.userTimeSheetSearchBox(Constant.driver).sendKeys(Date);
		Thread.sleep(2000);
		List<WebElement> Rows = PageObjects_TimesheetApproval.numberOfSearchRecords(Constant.driver).findElements(By.tagName("tr"));
		for(int j=1; j<=Rows.size(); j++){			
			String getDate = PageObjects_TimesheetApproval.userTimeSheetWeekEndDateText(Constant.driver, j).getText();
			if(Date.equalsIgnoreCase(getDate)){
				projectName = PageObjects_TimesheetApproval.getProjectNameWithRowNumber(Constant.driver, j).getText();
				statusOfTimeSheet = PageObjects_TimesheetApproval.getTimeSheetStatus(Constant.driver, j).getText();
				if(statusOfTimeSheet.equalsIgnoreCase(timeSheetStatus)){
					Report.ReporterOutput("Step","Verify that already "+timeSheetStatus+" timesheets status is changed to "+timeSheetStatus+".","Checking "+timeSheetStatus+" timesheet status", ""+employeName+"'s "+timeSheetStatus+" timesheets status should be changed to "+timeSheetStatus+" for Date:- "+Date+"", ""+timeSheetStatus+" timesheets status changed to :- "+statusOfTimeSheet+" for the date :-"+Date+" and Project :-"+projectName+".", "Pass", null);
				}else{
					Report.ReporterOutput("Step","Verify that already "+timeSheetStatus+" timesheets status is changed to "+timeSheetStatus+".","Checking "+timeSheetStatus+" timesheet status", ""+employeName+"'s "+timeSheetStatus+" timesheets status should be changed to "+timeSheetStatus+" for Date:- "+Date+"", ""+timeSheetStatus+" timesheets status changed to :- "+statusOfTimeSheet+" for the date :-"+Date+" and Project :-"+projectName+".", "Fail", null);
				}
			}else{
				Report.ReporterOutput("Step","Verify that already "+timeSheetStatus+" timesheets status is changed to "+timeSheetStatus+".","Checking "+timeSheetStatus+" timesheet status", ""+timeSheetStatus+" timesheets status should be changed to "+timeSheetStatus+"", ""+timeSheetStatus+" timesheets are not visible for the DATE:- "+Date+" and Project :-"+projectName+".", "Fail", null);
			}
		}
	}
	
	
}
