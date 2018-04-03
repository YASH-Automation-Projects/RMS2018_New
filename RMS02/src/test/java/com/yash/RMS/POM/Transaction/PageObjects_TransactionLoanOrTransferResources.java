package com.yash.RMS.POM.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.CommonMethods;

public class PageObjects_TransactionLoanOrTransferResources {
	private static WebElement element = null;

	// link Transaction
	public static WebElement lnk_Transaction(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='transactionList']/a/span"))), driver);
		return element;	
	}
	// link Loan Or Transfer Resources
	public static WebElement lnk_LoanOrTransferResources(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='menuUserActivityList1']"))), driver);
		return element;	
	}
	// Loan Or Transfer Resources Text
	public static WebElement Text_LoanOrTransferResources(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div[1]/div[1]/div[1]/h1"))), driver);
		return element;	
	}
	//Save link
	public static WebElement Link_Save(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.id("save")), driver);
		return element;
	}


	//Resource Name drop down
	public static WebElement dropdown_ResourceName(WebDriver driver) {
		//element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='loadTransderTable']/tbody/tr[1]/td[2]/span/a/span[1]"))), driver);
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("//*[@id='loadTransderTable']/tbody/tr[1]/td[2]/span/input"))), driver);
		
		//element = CommonMethods.waitForElement(driver.findElement((By.xpath("//table[@id='loadTransderTable']/tbody/tr/td[2]/span/a/span"))), driver);

		
		return element;	
	}

	// Event drop down
	public static WebElement dropdown_Event(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='loadTransderTable']/tbody/tr[1]/td[4]/span/input")), driver);
		return element;
	}

	//Employee Category drop down
	public static WebElement dropdown_EmployeeCategory(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='loadTransderTable']/tbody/tr[1]/td[6]/span/a/span[1]")), driver);
		return element;
	}
	//Employee Id text box
	public static WebElement textbox_EmployeeId(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.id("yashEmpId")), driver);
		return element;
	}
	//Designation drop down
	public static WebElement dropdown_Designation(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='loadTransderTable']/tbody/tr[1]/td[6]/span/a/span[1]")), driver);
		return element;
	}
	
	//Ownership drop down
	public static WebElement dropdown_Ownership(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='loadTransderTable']/tbody/tr[3]/td[2]/span/a/span[1]")), driver);
		return element;
	}
	//Base Location drop down
	public static WebElement dropdown_BaseLocation(WebDriver driver){
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='loadTransderTable']/tbody/tr[4]/td[2]/span/a/span[1]")), driver);
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/form/table/tbody/tr[4]/td[2]/span/input")), driver);
		return element;
	}
	//Current RM 1 drop down
	public static WebElement dropdown_CurrentRM1(WebDriver driver){
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='loadTransderTable']/tbody/tr[5]/td[2]/span/a/span[1]")), driver);
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='loadTransderTable']/tbody/tr[5]/td[2]/span/input")), driver);
		return element;
	}
	// Contact Number 1 text box
	public static WebElement textbox_ContactNumber1(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.id("contactNumber")), driver);
		return element;
	}
	// Confirmation Date text box
	public static WebElement textbox_ConfirmationDate(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.id("confirmationDate")), driver);
		return element;
	}
	//Release Date  text box
	public static WebElement textbox_ReleaseDate(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.id("releaseDate")), driver);
		return element;
	}
	//BGH Name drop down
	public static WebElement dropdown_BGHName(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='loadTransderTable']/tbody/tr[9]/td[2]/span/a")), driver);
		return element;
	}
	//BGH Comments  text box
	public static WebElement textbox_BGHComments(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.id("bGHComments")), driver);
		return element;
	}
	//BGH Comments  text box
	public static WebElement textbox_BGHCommentsDate(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.id("bGHComments")), driver);
		return element;
	}
	//Current Location drop down
	public static WebElement dropdown_CurrentLocation(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='loadTransderTable']/tbody/tr[4]/td[4]/span/a/span[1]")), driver);
		return element;
	}
	//Current RM 2 drop down
	public static WebElement dropdown_CurrentRM2(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='loadTransderTable']/tbody/tr[5]/td[4]/span/a/span[1]")), driver);
		return element;
	}
	//Contact Number 2  text box
	public static WebElement textbox_ContactNumber2(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.id("contactNumberTwo")), driver);
		return element;
	}
	//Appraisal Date 1  text box
	public static WebElement textbox_AppraisalDate1(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.id("lastAppraisal")), driver);
		return element;
	}
	//Loan/Transfer Date From  text box
	public static WebElement textbox_LoanTransferDateFrom(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.id("transferDate")), driver);
		return element;
	}
	//BUH Name drop down
	public static WebElement dropdown_BUHName(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='loadTransderTable']/tbody/tr[9]/td[4]/span/a/span[1]")), driver);
		return element;
	}
	//BUH Comments  text box
	public static WebElement textbox_BUHComments(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.id("bUHComments")), driver);
		return element;
	}
	//BU Comments Date  text box
	public static WebElement textbox_BUCommentsDate(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.id("bUCommentsTimestamp")), driver);
		return element;
	}
	// Grade drop down
		public static WebElement dropdown_Grade(WebDriver driver){
			element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='loadTransderTable']/tbody/tr[2]/td[6]/span/input")), driver);
			return element;                                                    
		}
	//Parent BG-BU  drop down
	public static WebElement textbox_ParentBGBU(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='loadTransderTable']/tbody/tr[3]/td[6]/span/a/span[1]")), driver);
		return element;
	}
	//Current BG-BU drop down
	public static WebElement dropdown_CurrentBGBU(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='loadTransderTable']/tbody/tr[4]/td[6]/span/a/span[1]")), driver);
		return element;
	}
	//Email Id text box
	public static WebElement textbox_EmailId(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.id("emailId")), driver);
		return element;
	}
	//DOJ text box
	public static WebElement textbox_DOJ(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.id("dateOfJoining")), driver);
		return element;
	}
	//Appraisal Date 2 text box
	public static WebElement textbox_AppraisalDate2(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.id("penultimateAppraisal")), driver);
		return element;
	}
	//Loan Transfer Date To text box
	public static WebElement textbox_LoanTransferDateTo(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.id("transferTo")), driver);
		return element;
	}
	//HR Name drop down
	public static WebElement dropdown_HRName(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='loadTransderTable']/tbody/tr[9]/td[6]/span/a/span[1]")), driver);
		return element;
	}
	//HR Comments text box
	public static WebElement textbox_HRComments(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.id("hRComments")), driver);
		return element;
	}
	//HR Comments Date text box
	public static WebElement textbox_HRCommentsDate(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.id("hRCommentsTimestamp")), driver);
		return element;
	}
	
	public static WebElement lnk_Admin(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='adminList']/a/span"))), driver);
		return element;	
	}
	public static WebElement lnk_Resources(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='menuResourceList']"))), driver);
		return element;	
	}
	public static WebElement dropdown_Status(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.id("Activerecord"))), driver);
		return element;	
	}
	

}
