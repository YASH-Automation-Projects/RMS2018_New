package com.yash.RMS.POM.ResourceAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.CommonMethods;

public class PageObjects_ResourceAttribute {
	private static WebElement element = null;

	//------- Objects of "Designation" Home page------------------------------

	public static WebElement designation_linkMasterData(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='masterDataList']/a")), driver);
		return element;
	}

	public static  WebElement designation_linkResourceAttribute(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='resourceAttributeList']/a"));
		return element;	
	}

	public static  WebElement link_designation(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='menuDesignationsList']"));
		return element;	
	}


	public static WebElement designation_linkaddNew(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='addNew']"));
		return element;	
	}

	public static WebElement designation_buttonSearch(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_filter']/label/input"));
		return element;	
	}

	public static WebElement  designation_dropdownShowEntries(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='resourceAttributeList']/a"));
		return element;	
	}

	public static WebElement  designation_serialNoSorting(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[1]"));
		return element;
	}

	public static WebElement  designation_nameSorting(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='resourceAttributeList']/a"));//html/body/div/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[2]
		element = driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[2]"));
		return element;	
	}
	public static WebElement   designation_nameBox(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[2]/input"));
		return element;	
	}
	public static WebElement  designation_saveButton(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[3]/a"));
		return element;	
	}
	public static WebElement designation_saveButtonConfirmationMessage(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);
		return element;
	}

	public static WebElement  designation_editButton(WebDriver driver) {
	//	element = driver.findElement(By.linkText("Edit"));
		element = driver.findElement(By.xpath(".//table/tbody/tr[1]/td[3]/a"));

		return element;	
	}
	public static WebElement designation_editButtonConfirmationMessage(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);
		return element;
	}
	public static WebElement  designation_deleteButton(WebDriver driver) {
		element = driver.findElement(By.linkText("Delete"));
		return element;	
	}
	public static WebElement  designation_deleteokButton(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/ul[2]/li/div/div[2]/button[1]"));
		return element;	
	}
	public static WebElement  designation_deleteConfirmationMsg(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);
		return element;
	}
	public static WebElement   designation_pageText(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1"));
		return element;	
	}

	public static WebElement designation_first_serialNoSorting(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[1]")), driver);
		return element;
	}
	public static WebElement  designation_noOfEnteries(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/div[2]/label/select"));
		return element;	
	}

	public static WebElement designation_EmployeeCategoryTableID(WebDriver driver)
	{

		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']")), driver);
		return element;

	}
	public static WebElement designation_nomatchingRecordsText(WebDriver driver)
	{

		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr/td")), driver);
		return element;
//                                                                            .//*[@id='example']/tbody/tr/td
	}


	//------- Objects of "Grade" Home page------------------------------

	public static WebElement grade_linkMasterData(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='masterDataList']/a")), driver);
		return element;
	}

	public static  WebElement grade_linkResourceAttribute(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='resourceAttributeList']/a"));
		return element;	
	}

	public static WebElement grade_link(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='menuGradeList']")), driver);
		return element;
	}

	public static WebElement grade_linkAddNew(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='addNew']")), driver);
		return element;
	}
	public static WebElement grade_addNewNameBox(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[2]/input")), driver);
		return element;                                                   //.//*[@id='example']/tbody/tr[1]/td[2]/input
	}

	public static WebElement grade_buttonSave(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[3]/a")), driver);
		return element;
	}
	public static WebElement grade_saveButtonConfirmationMessage(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);
		return element;
	}

	public static WebElement  grade_editButton(WebDriver driver) {
		element = driver.findElement(By.linkText("Edit"));
		return element;	
	}
	public static WebElement grade_editButtonConfirmationMessage(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);
		return element;
	}
	public static WebElement  grade_deleteButton(WebDriver driver) {
	//	element = driver.findElement(By.linkText("Delete"));
		element = driver.findElement(By.xpath(".//table/tbody/tr[1]/td[4]/a"));
		
		return element;	
	}
	public static WebElement  grade_deleteokButton(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/ul[2]/li/div/div[2]/button[1]"));
		return element;	
	}
	public static WebElement  grade_deleteConfirmationMsg(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);
		return element;
	}
	public static WebElement   grade_pageText(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1"));
		return element;	
	}

	public static WebElement grade_first_serialNoSorting(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[1]")), driver);
		return element;
	}
	public static WebElement grade_buttonSearch(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_filter']/label/input"));
		return element;	
	}

	public static WebElement  grade_dropdownShowEntries(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='resourceAttributeList']/a"));
		return element;	
	}
	public static WebElement  grade_serialNoSorting(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[1]"));
		return element;
	}

	public static WebElement  grade_nameSorting(WebDriver driver) {
		//element = driver.findElement(By.xpath(".//*[@id='resourceAttributeList']/a"));
		element = driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[2]"));

		return element;	
	}
		public static WebElement  grade_noOfEnteries(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/div[2]/label/select"));
			return element;	
		}

		public static WebElement grade_EmployeeCategoryTableID(WebDriver driver)
		{

			element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']")), driver);
			return element;

		}
	

	//------- Objects of "Location" Home page------------------------------

	public static WebElement location_linkMasterData(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='masterDataList']/a")), driver);
		return element;
	}

	public static  WebElement location_linkResourceAttribute(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='resourceAttributeList']/a"));
		return element;	
	}

	public static WebElement location_link(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='menuLocationList']")), driver);
		return element;
	}

	public static WebElement location_linkAddNew(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='addNew']")), driver);
		return element;
	}
	public static WebElement location_addNewLocationNameBox(WebDriver driver)
	{ 	
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[2]/input")), driver);
		//	element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]/input")), driver);

		return element;
	}
	public static WebElement location_addNewLocationHRNameBox(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[3]/input")), driver);
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/input")), driver);

		return element;
	}
	public static WebElement location_buttonSave(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[4]/a")), driver);
		return element;
	}
	public static WebElement location_saveButtonConfirmationMessage(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);
		return element;
	}
	public static WebElement location_buttonSearch(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_filter']/label/input"));
		return element;	
	}
	public static WebElement location_editButton(WebDriver driver) {
		//	element = driver.findElement(By.xpath(".//*[@id='1']/td[4]/a"));//html/body/div/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[4]/a
		element = driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[4]/a"));
		return element;	
	}//
	public static WebElement location_editButtonConfirmationMessage(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);
		return element;
	}
	public static WebElement location_deleteButton(WebDriver driver) {
		//element = driver.findElement(By.xpath(".//*[@id='1']/td[5]/a"));//
		//element = driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[5]/a"));
		element = driver.findElement(By.linkText("Delete"));
		return element;	
	}//
	public static WebElement location_deleteokButton(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/ul[2]/li/div/div[2]/button[1]"));
		return element;	
	}
	public static WebElement location_deleteConfirmationMsg(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);
		return element;
	}
	public static WebElement location_pageText(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1"));
		return element;	
	}
	public static WebElement location_pageRecords(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/tbody/tr/td"));
		return element;	
	}
	public static WebElement location_first_serialNoSorting(WebDriver driver)
	{
		//	element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='1']/td[1]")), driver);
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[1]")), driver);
		return element;
	}
	public static WebElement location_serialNoSorting(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='example']/thead/tr/th[1]"));
		return element;
	}
	public static WebElement location_nameSorting(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[2]"));
		return element;	
	}
	public static WebElement location_HRnameSorting(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[3]"));
		return element;	
	}
	public static WebElement location_dropdownShowEntries(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_length']/label/select"));
		return element;	
	}
	
	public static WebElement  location_noOfEnteries(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/div[2]/label/select"));
		return element;	
	}

	public static WebElement location_EmployeeCategoryTableID(WebDriver driver)
	{

		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']")), driver);
		return element;

	}
	public static WebElement location_nomatchingRecordsText(WebDriver driver)
	{

		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr/td")), driver);
		return element;

	}


}
