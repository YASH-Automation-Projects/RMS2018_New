package com.yash.RMS.POM.ProjectAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.CommonMethods;

public class PageObjects_ProjectAttribute {

	private static WebElement element = null;

	public static WebElement masterDataLink(WebDriver driver)
	{


		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='masterDataList']/a")), driver);

		return element;
	}

	public static WebElement projectAttributeLink(WebDriver driver)
	{

		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='projectAttributeList']/a")), driver);
		return element;
	}

	public static WebElement invoiceByLink(WebDriver driver)
	{

		element = CommonMethods.waitForElement(driver.findElement(By.id("menuInvoicebysList")), driver);
		return element;
	}

	public static WebElement addNewLink(WebDriver driver)
	{
	element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[1]/div[2]/a")), driver);
		return element;
	}

	public static WebElement invoiceByNameBox(WebDriver driver)
	{
	element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[2]/input")), driver);
	return element;
	}

	public static WebElement editforDel(WebDriver driver)
	{
	element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='27']/td[2]/input")), driver);
	return element;
	}
public static WebElement saveButton(WebDriver driver)
	{
	element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[3]/a")), driver);
	return element;
	}

	public static WebElement saveButtonConfirmationMessage(WebDriver driver)
	{
	element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);

		return element;
	}


	public static WebElement deleteButton(WebDriver driver)
	{


		element = driver.findElement(By.linkText("Delete"));
		return element;
	}


	public static WebElement deleteOkButton(WebDriver driver)
	{


		//element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='noty_836083546252354800']/div[2]/button[1]")), driver);
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/ul[2]/li/div/div[2]/button[1]")), driver);
		return element;
	}


	public static WebElement deleteConfirmationMsg(WebDriver driver)
	{


		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);

		return element;
	}

	public static WebElement editButton(WebDriver driver)
	{

		//element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='37']/td[3]/a")), driver);

		element = driver.findElement(By.linkText("Edit"));
		return element;
	}


	public static WebElement editButtonConfirmationMessage(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);
		return element;
	}

	public static WebElement invoiceByPageText(WebDriver driver)
	{

		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div/div[1]/div[1]/h1")), driver);
		return element;
	}



	public static WebElement searchBox(WebDriver driver)
	{


		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/div[3]/label/input")), driver);

		return element;
	}
	//default sorting
	public static WebElement serialNoSorting(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[1]")), driver);
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[1]")), driver);
		return element;
	}
	//first item in the list 
	public static WebElement first_serialNoSorting(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[1]")), driver);
		return element;
	}

	public static WebElement invoiceByName(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[2]")), driver);
		return element;//html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]/input
	}
	public static WebElement invoiceByNameSorting(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")), driver);
		return element;
	}

	public static WebElement saveButtonConfirmationMessage1(WebDriver driver)
	{

		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);
		return element;
	}

	public static WebElement noOfEnteries(WebDriver driver)
	{

		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/div[2]/label/select")), driver);
		return element;

	}
	public static WebElement InvoiceByNameTableID(WebDriver driver)
	{

		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']")), driver);
		return element;

	}//
	public static WebElement nomatchingRecordsText(WebDriver driver)
	{

		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr/td")), driver);
		return element;

	}
	

	//------- Objects of "Project Category" Home page------------------------------
	public static  WebElement projectCategory_Link(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/aside/section/ul/li[5]/ul/li[2]/ul/li[4]/a"));
		return element;	
	}


	public static WebElement projectCategory_addNewLink(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[1]/div[2]/a"));
		return element;	
	}

	public static WebElement projectCategory_searchButton(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[3]/label/input"));
		return element;	
	}

	public static WebElement  projectCategory_noOfEnteries(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/div[2]/label/select"));
		return element;	
	}

	public static WebElement  projectCategory_serialNoSorting(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[1]"));
		return element;
	}

	public static WebElement  projectCategory_nameSorting(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[2]"));
		return element;	
	}
	public static WebElement  projectCategory_nameBoxSorting(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[2]/input"));
		element = driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[2]/input"));
		//.//*[@id='example']/tbody/tr[1]/td[2]/input
		return element;	//html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]/input
	}//.//*[@id='example']/tbody/tr[1]/td[2]/input
	public static WebElement  projectCategory_saveButton(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/a"));
		return element;	
	}
	public static WebElement projectCategory_saveButtonConfirmationMessage(WebDriver driver)
	{

		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);
		return element;
	}

	public static WebElement  projectCategory_editButton(WebDriver driver) {
		element = driver.findElement(By.linkText("Edit"));

		return element;	
	}
	public static WebElement projectCategory_editButtonConfirmationMessage(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);
		return element;
	}
	public static WebElement  projectCategory_deleteButton(WebDriver driver) {
		element = driver.findElement(By.linkText("Delete"));
		//	element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[4]"));
		return element;	
	}//Delete
	public static WebElement  projectCategory_deleteokButton(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/ul[2]/li/div/div[2]/button[1]"));
		return element;	
	}
	public static WebElement projectCategory_deleteConfirmationMsg(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);
		return element;
	}
	public static WebElement  projectCategory_pageText(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1"));
		return element;	
	}

	public static WebElement projectCategory_first_serialNoSorting(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[1]")), driver);
		return element;
	}
	
	public static WebElement projectCategory_EmployeeCategoryTableID(WebDriver driver)
	{

		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']")), driver);
		return element;

	}
	public static WebElement projectCategory_nomatchingRecordsText(WebDriver driver)
	{

		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr/td")), driver);
		return element;

	}
	

	

	//******Project Methodology**********************************************************************************************************


	public static WebElement projectMethodology_link(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='menuProjectMethodologyList']")), driver);
		return element;
	}

	public static WebElement projectMethodology_searchButton(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example_filter']/label/input")), driver);
		return element;
	}
	public static WebElement projectMethodology_addNewLink(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='addNew']")), driver);
		return element;
	}
	public static WebElement projectMethodology_nameBox(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[2]/input")), driver);
		return element;
	}
	public static WebElement projectMethodology_saveButton(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[3]/a")), driver);
		return element;
	}
	public static WebElement projectMethodology_saveButtonConfirmationMessage(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);
		return element;
	}
	public static WebElement projectMethodology_editButton(WebDriver driver)
	{
		element = driver.findElement(By.linkText("Edit"));
		return element;
	}
	public static WebElement projectMethodology_editButtonConfirmationMessage(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);
		return element;
	}
	public static WebElement  projectMethodology_deleteButton(WebDriver driver) {
		element = driver.findElement(By.linkText("Delete"));
		return element;	
	}
	public static WebElement  projectMethodology_deleteokButton(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/ul[2]/li/div/div[2]/button[1]"));
		return element;	
	}
	public static WebElement projectMethodology_deleteConfirmationMsg(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);
		return element;
	}
	public static WebElement  projectMethodology_pageText(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1"));
		return element;	
	}
	public static WebElement projectMethodology_serialNoSorting(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[1]")), driver);
		return element;
	}
	public static WebElement projectMethodology_firstserialNoSortingValue(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[1]")), driver);
		return element;
	}
	
	public static WebElement  projectMethodology_nameSorting(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[2]"));
		return element;	
	}
	
	public static WebElement  projectMethodology_noOfEnteries(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/div[2]/label/select"));
		return element;	
	}

	public static WebElement projectMethodology_EmployeeCategoryTableID(WebDriver driver)
	{

		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']")), driver);
		return element;

	}
	public static WebElement projectMethodology_nomatchingRecordsText(WebDriver driver)
	{

		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr/td")), driver);
		return element;

	}

	































}


























































