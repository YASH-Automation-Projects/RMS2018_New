package com.yash.RMS.POM.SEPG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.CommonMethods;
import com.yash.RMS.CustomProperties.Constant;

public class PageObjects_SEPGPhases {

	private static WebElement element = null;

	public static WebElement lnk_SEPG(WebDriver driver) 
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='sepgList']/a/span")), driver);
		return element;
	}
	//sub menu SEPG Phases
	public static WebElement lnk_SPEG_Phases(WebDriver driver) 
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='menuSepgPhasesList']")), driver);
		return element;
	}

	public static WebElement Dropdown_ShowEntry(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/label/select")), driver);
		return element;	
	}

	public static WebElement txt_SepgPhases(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div/div[1]/h1")), driver);
		return element;	
	}

	public static WebElement sepgPhases_serialNoSorting(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[1]")), driver);
		return element;
	}

	public static WebElement first_serialNoSorting(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[1]")), driver);
		return element;
	}

	public static WebElement sepgPhases_PhasesSorting(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[2]")), driver);
		return element;	
	}

	public static WebElement sepgPhases_EngagementModel(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[3]")), driver);
		return element;	
	}

	public static WebElement sepgPhases_Edit(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[5]")), driver);
		return element;	
	}

	public static WebElement searchBox(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/div[3]/label/input")), driver);
		return element;
	}

	public static WebElement NewLink(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[1]/div[2]/a")), driver);
		return element;
	}

	public static WebElement btn_Previous(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example_previous']")), driver);
		return element;
	}

	public static WebElement btn_next(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example_next']")), driver);
		return element;
	}

	public static WebElement lnk_addNew(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.id("addNew")), driver);
		return element;
	}

	public static WebElement btn_savePhases(WebDriver driver)
	{
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='saveSEPGid']")), driver);
		//element = CommonMethods.waitForElement(driver.findElement(By.linkText("save")), driver);
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='143']/td[5]/a[1]")), driver);
		return element;
	}
	public static WebElement btn_cancelPhases(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='143']/td[5]/a[2]")), driver);
		return element;
	}
	public static WebElement saveButtonConfirmationMessage1(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[2]/div")), driver);
		return element;
	}

	public static WebElement btn_cancel(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='cancelSEPGid']")), driver);
		return element;
	}

	public static WebElement SepgTableID(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']")), driver);
		return element;	
	}

	public static WebElement sepgPhases_MapActivity(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[4]")), driver);
		return element;	
	}

	public static WebElement btn_EditPhases(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.linkText("Edit Phase")), driver);
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='136']/td[5]/a")), driver);
		return element;	
	}
	//Edit box Add Phases
	public static WebElement txt_Edit_Phase(WebDriver driver) {
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='PhasesNames']")), driver);
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='143']/td[2]/input")), driver);
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[2]/input")), driver);
		return element;	
	}

	//Text Phases to verify
	public static WebElement txt_EditPhases(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='1']/td[2]")), driver);
		return element;	
	}
	//Add Phases Edit Box 
	public static WebElement txt_AddPhases(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='PhasesNames']")), driver);
		return element;	
	}
	// click on save button on SEPG List 
	public static WebElement btn_saveSEPG(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='saveSEPGid']")), driver);
		return element;	
	}

	// click on save button on SEPG List 
	public static WebElement btn_addPhases_save(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.id("createPhase")), driver);
		//driver.findElement(By.id("createPhase")).click();
		return element;	
	}
	// In Edit Mode when we click on Edit Phrases when save and cancel button both button is present  xpath at that time
	// In Edit Mode : save button     
	public static WebElement lnk_savePhases(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.linkText("Save"))), driver);
		//element = CommonMethods.waitForElement(driver.findElement((By.xpath("//a[@class='edit']"))), driver);
		return element;	
	}
	// In Edit Mode : CANCEL button     
	public static WebElement lnk_cancelPhases(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.linkText("Cancel"))), driver);
		return element;	
	}
	// In Edit Mode : cancel button     
	public static WebElement btn_Edit_cancelPhases(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='10']/td[5]/a[2]")), driver);
		return element;	
	}

	// For the confirmation message : universal Xpath : we can use for all the confirmation msg in teh RMS applicaiton
	//to do : need to copy paste the code from Neha  code 
	public static WebElement saveButtonConfirmationMessage(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);
		return element;
	}
}
//*****************************************************************************************************