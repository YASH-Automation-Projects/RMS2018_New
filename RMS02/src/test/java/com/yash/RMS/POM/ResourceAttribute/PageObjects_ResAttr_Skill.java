package com.yash.RMS.POM.ResourceAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.yash.RMS.CustomProperties.CommonMethods;

/*PageObjects_ResourceAttribute_Skill
PageObjects_ResAttr_Skill*/

public class PageObjects_ResAttr_Skill {
	private static WebElement element = null;

	//No matching records found: when we search a skill type and do not get any matching record then 
	public static WebElement txt_No_matching_records_found(WebDriver driver) 
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr/td")), driver);
		//html/body/div/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td
		return element;
	}
	//sub menu Skill Link Phases
	public static WebElement lnk_MasterData(WebDriver driver) 
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='masterDataList']/a/span")), driver);
		return element;
	}
	//sub menu Resource Attribute 
	public static WebElement lnk_ResourceAttribute(WebDriver driver) 
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='resourceAttributeList']/a")),driver);
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath("//a[contains(.,' Resource Attribute ')]")), driver);
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div/aside/section/ul/li[5]/ul/li[3]/a")),driver);
		return element;
	}
	//sub menu Skill Link Phases
	public static WebElement lnk_Skill(WebDriver driver) 
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='menuSkillsList']")), driver);
		return element;
	}

	//To verify the Skill Text 
	public static WebElement txt_Skill(WebDriver driver) 
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div/div[1]/div[1]/h1")), driver);
		return element;
	}

	public static WebElement Dropdown_ShowEntry(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/label/select")), driver);
		return element;               
	}

	//to click on SR NO column Sorting  
	public static WebElement skillSr_NoSorting(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[1]")), driver);
		return element;
	}

	//to click on first text of sr no column to compare   
	public static WebElement sr_Nofirst_text(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[1]")), driver);
		//.//*[@id='1']/td[1]
		return element;
	}
	//to click on skill Name column Sorting   
	public static WebElement skillNameSorting(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[2]")), driver);
		return element;               
	}

	// Web List  of entire column for originalSaved_SkillType later to compare with 
	public static WebElement originalSaved_SkillType(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[3]")), driver);
		return element;               
	}

	// Web List   entire column for originalSaved_SkillName later to compare with 
	public static WebElement originalSaved_SkillName(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[3]")), driver);
		return element;               
	}

	public static WebElement skillType(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[3]")), driver);
		return element;               
	}
	//Edit Skill Name field :to verify txt_SkillName when we click on Edit button  
	public static WebElement txtbox_SkillName(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[2]/input")), driver);
		return element;               
	}
	//to verify teh Edit Link  bedise the delete button is present or not   
	public static WebElement lnk_Edit_SkillName(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[2]/input")), driver);
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='1']/td[4]/a")), driver);
		return element;               
	}
	//Sorting to capture first txt to verify sorting 

	//To verify  first SR no after we click on SR NO sorting   
	public static WebElement txt_First_SrNo(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[1]")), driver);
		return element;               
	}

	//to verify  first Skill Name when we click on Skill Name column Name to verify sorting    
	public static WebElement txt_First_SkillName(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]")), driver);
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='1']/td[2]")), driver);
		return element;               
	}

	//to verify first Skill Type when we click on Skill Type column Name to verify sorting    
	public static WebElement txt_First_SkillType(WebDriver driver) {
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='1']/td[3]")), driver);
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]")), driver);
		return element;               
	}

	public static WebElement sepgPhases_serialNoSorting(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[1]")), driver);
		return element;
	}


	public static WebElement skill_Delete(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[5]")), driver);
		return element;               
	}

	public static WebElement txt_searchBox(WebDriver driver)
	{
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/div[3]/label/input")), driver);
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example_filter']/label/input")), driver);
		return element;
	}
	//for Navigation Previous button 
	public static WebElement btn_Previous(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example_previous']")), driver);
		return element;
	}
	//for Navigation First button 
	public static WebElement btn_First(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example_first']")), driver);
		return element;
	}

	//for Navigation 1st number  button 
	public static WebElement btn_1st(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example_paginate']/span/a[1]")), driver);
		return element;
	}
	//for Navigation 2nd number button 
	public static WebElement btn_1st_nav(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example_paginate']/span/a[2]")), driver);
		return element;
	}
	//for Navigation 3rd number button 
	public static WebElement btn_2nd_nav(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example_paginate']/span/a[3]")), driver);
		return element;
	}
	//for Navigation 4th number button 
	public static WebElement btn_3rd_nav(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example_paginate']/span/a[4]")), driver);
		return element;
	}
	//for Navigation 5th number button 
	public static WebElement btn_4th_nav(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example_paginate']/span/a[5]")), driver);
		return element;
	}
	//Navigation btn_Next
	public static WebElement btn_Next(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example_next']")), driver);
		return element;
	}
	//Navigation btn_Last
	public static WebElement btn_Last(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example_last']")), driver);
		return element;
	}
	//click on Add New Link 
	public static WebElement lnk_addNew(WebDriver driver)
	{
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='addNew']")), driver);
		//if above fail tehn use below  ok  
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div/div[1]/div[2]/a")), driver);
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[@id='add']/a")), driver);
		return element;
	}
	public static WebElement lnk_saveSkill(WebDriver driver)
	{
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[4]/a")), driver);
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//a[contains(.,'Save')]")), driver);
		return element;
	}
	//drop down : dd Skill Type 
	public static WebElement dd_SkillType(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='1']/td[3]/select")), driver);
		return element;
	}

	public static WebElement saveButtonConfirmationMessage1(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[2]/div")), driver);
		return element;
	}
	//done
	public static WebElement lnk_cancel(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='cancelSEPGid']")), driver);
		return element;
	}
	public static WebElement lnk_delete(WebDriver driver)
	{
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='1']/td[5]/a")), driver);
		element = CommonMethods.waitForElement(driver.findElement(By.linkText("Delete")), driver);
		return element;
	}

	public static WebElement skillTableID(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']")), driver);
		return element;               
	}

	public static WebElement lnk_edit(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.linkText("Edit")), driver);
		//element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='1']/td[4]/a")), driver);
		return element;               
	}
	//Edit box Add Phases
	public static WebElement txt_Edit_Phase(WebDriver driver) {
		return element;               
	}

	//Text Phases to verify
	public static WebElement txt_EditPhases(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='1']/td[2]")), driver);
		return element;               
	}
	// Delete ButtonConfirmationMessage
	public static WebElement deleteButtonConfirmationMessage(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='noty_1282418183682446800']/div[2]/button[1]")), driver);
		////button[contains(.,'Ok')]
		//html/body/ul[2]/li/div/div[2]/button[1]
		return element;
	}
	//SkillType Name  Edit Box 
	public static WebElement txt_AddPhases(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='PhasesNames']")), driver);
		return element;               
	}

	public static WebElement saveButtonConfirmationMessage(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(.,'Success')]")), driver);
		return element;
	}
	public static WebElement saveAddNewSkill(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[4]/a")), driver);
		return element;
	}
	//.//*[@id='example']/tbody/tr[1]/td[4]/a
}              
//*****************************************************************************************************
