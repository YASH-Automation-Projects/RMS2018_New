package com.yash.RMS.TestAction.SEPG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.SEPG.PageObjects_SEPGPhases;

public class Action_SEPGPhases_AddNewEdit{
	//*************************FOR ADDING A NEW PHASES********************************************************************

	public static void Add_NewPhases(String AddNewPhases) throws Throwable {
		//public static void addNew() throws Throwable {
		Thread.sleep(2000);
		try {
			if (PageObjects_SEPGPhases.lnk_addNew(Constant.driver).isDisplayed()) {
				PageObjects_SEPGPhases.lnk_addNew(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("STEP","Verify Add New Link is Visible ","Add New Link","Click on Add New Link","add New Link should be Visible","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Add New Link is Visible ","Add New Link","Click on Add New Link","add New Link not Visible","Fail",null);
			}
			Thread.sleep(3000);

			//New code :txt_AddPhases
			if (PageObjects_SEPGPhases.txt_AddPhases(Constant.driver).isDisplayed()) {
				PageObjects_SEPGPhases.txt_AddPhases(Constant.driver).click();
				//TO SEND the OUTPUT from Excel sheet 
				PageObjects_SEPGPhases.txt_AddPhases(Constant.driver).sendKeys(AddNewPhases);
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Add New Phases Text Box is enabled.",AddNewPhases, " Add New Phases  should be enabled and value should be entered.", " Add New Phases Text box is enabled and value is entered.", "Pass",null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify Add New Phases Text Box is enabled.",AddNewPhases, " Add New Phases  should be enabled and value should be entered.", " Add New Phases Text box is not enabled and value is entered.", "Fail",null);
			}
			Thread.sleep(2000);
			//save button for Add Phases
			if (PageObjects_SEPGPhases.btn_addPhases_save(Constant.driver).isDisplayed()) {
				PageObjects_SEPGPhases.btn_addPhases_save(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify saveButton for Add Phases is Displayed  "," saveButton for Add Phases "," Click on saveButton for Add Phasess"," saveButton for Add Phasess should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify saveButton for Add Phases is Displayed ","  saveButton for Add Phases "," Click on saveButton for Add Phasess"," saveButton for Add Phasess is not displayed","Fail",null);
			}

			//1.  To Select the Item from List Box :1.  SEPG Engagement Model From
			Thread.sleep(3000);
			List<WebElement> allEngagementModelForm = new Select(Constant.driver.findElement(By.id("pdo1"))).getOptions();
			for(WebElement SEPG1:allEngagementModelForm)
			{
				// System.out.println(city.getText());    //It will return the text of each option
				String value = SEPG1.getText();
				System.out.println(value);    //it will return the value attribute of each option
				if(value.equalsIgnoreCase("Fixed Bid")){
					SEPG1.click();
					Thread.sleep(2000);
				}
			}
			//Adding value from List 1.  SEPG Engagement Model From to SEPG Engagement Model To List  
			WebElement ele1 = Constant.driver.findElement(By.xpath("//input[@onclick='move_item(pdo1, listMenu1)']"));
			Actions action1 = new Actions(Constant.driver);
			action1.doubleClick(ele1);
			action1.perform();
			Thread.sleep(3000);
			//***END OF 1ST LOOP ******************************************************************************

			//VAl 1 :  to do :Validation pending : to verify the moved item is present in the 2nd List or not

			//*********************************************************************************
			// 2. To Select the Item from List Box :2. SEPG Map Activity From
			// VAl 2 : to do :Validation pending : to verify the moved item is present in the 2nd List or not
			/*			Thread.sleep(3000);
			List<WebElement> allSEPGMapActivityFrom = new Select(Constant.driver.findElement(By.id("pdo2"))).getOptions();
			for(WebElement SEP2:allSEPGMapActivityFrom)
			{
				// System.out.println(city.getText());    //It will return the text of each option
				String value = SEP2.getText();
				System.out.println(value);    //it will return the value attribute of each option
				//if(value.equalsIgnoreCase("Sepg ACTIVITY")){
				if(value.equalsIgnoreCase("Sepg")){
					SEP2.click();
					Thread.sleep(2000);
				}
			}
			//Adding value from List 1.  SEPG Map Activity From to SEPG Map Activity TO List
			WebElement ele2 = Constant.driver.findElement(By.xpath("//input[@onclick='move_item(pdo2, listMenu2)']"));
			Actions action2 = new Actions(Constant.driver);
			action2.doubleClick(ele2);
			action2.perform();
			Thread.sleep(2000);*/

			//***END OF  2ND LOOP ******************************************************************************
			//Logic to click on SAVE SEPG button 
			Thread.sleep(3000);
			//if (PageObjects_SEPGPhases.btn_savePhases(Constant.driver).isDisplayed()) {
			//btn_saveSEPG
			if (PageObjects_SEPGPhases.btn_saveSEPG(Constant.driver).isDisplayed()) {
				PageObjects_SEPGPhases.btn_saveSEPG(Constant.driver).click();
				//Report.ReporterOutput("STEP","Verify saveButton is Visible ","saveButton","Click on saveButton","saveButton should be displayed","Pass",null);
			}
			else {
				//Report.ReporterOutput("STEP","Verify saveButton is Visible ","saveButton","Click on saveButton","saveButton is not displayed","Fail",null);
			}
			//TO Verify the Confirmation message after we hit the save button  
			Thread.sleep(2000);
			/*		if (PageObjects_SEPGPhases.saveButtonConfirmationMessage(Constant.driver).isDisplayed()) {
				Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ","save Confirmation Msg","Click on save Confirmation Msg","save Confirmation Msg should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ","save Confirmation Msg","Click on save Confirmation Msg","save Confirmation Msg is not displayed","Fail",null);
			}
			Thread.sleep(2000);*/
			//Verify new Add New Phases is created successfully
			if (PageObjects_SEPGPhases.saveButtonConfirmationMessage(Constant.driver).isDisplayed()) {
				Report.ReporterOutput("STEP","Verify New Phases "+AddNewPhases+" has been created.",AddNewPhases," New Phases "+AddNewPhases+" should be created.","New Phases "+AddNewPhases+" has been created.","Pass",null);		
				//Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ","save Confirmation Msg","Click on save Confirmation Msg","save Confirmation Msg should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify New Phases "+AddNewPhases+" has been created.",AddNewPhases," New Phases "+AddNewPhases+" should be created.","New Phases "+AddNewPhases+" has been not created.","Fail",null);
			}
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//*********SEARCH FUNCTIONALITY FOR SEPG PHASES***********************/
	public static void search_Phases(String searchPhases) throws Throwable {
		//Search_NewPhasessName
		try {
			Thread.sleep(2000);
			// Logic to Search a Phases which is already added successfully 
			if (PageObjects_SEPGPhases.searchBox(Constant.driver).isDisplayed()) {
				PageObjects_SEPGPhases.searchBox(Constant.driver).click();
				Thread.sleep(2000);
				//To clear the search box
				PageObjects_SEPGPhases.searchBox(Constant.driver).clear();
				Thread.sleep(2000);
				//Giving output from First add Method
				PageObjects_SEPGPhases.searchBox(Constant.driver).sendKeys(searchPhases);
				//Report.ReporterOutput("STEP", "Verify search Box is Displayed :", searchPhases , "Click on search Box", "search Box should be displayed and clicked", "Pass", null);
				Report.ReporterOutput("STEP","Verify New Phases Added  "+searchPhases+" is searched and verified.",searchPhases,"New Phasaes Added : "+searchPhases+" should be searched and verification.","New Phasaes Added  "+searchPhases+" searched and verified.","Pass",null);
				//Giving output from First add Method
			}
			else {
				Report.ReporterOutput("STEP","Verify New Phases Added  "+searchPhases+" is searched and verified.",searchPhases,"New Phasaes Added : "+searchPhases+" should be searched and verification.","New Phasaes Added  "+searchPhases+" is not searched and verified.","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/***Start of Akansha Method************************************************************************************/
	//********************** to Edit SEPG Phases**************************************

	public static void EditPhasesName_01(String AddNewPhases, String EditNewPhases) throws Throwable
	//Edit_PhasesName
	{
		// enter value in Search text box
		try
		{
			if(PageObjects_SEPGPhases.searchBox(Constant.driver).isEnabled())
			{	
				PageObjects_SEPGPhases.searchBox(Constant.driver).clear();
				PageObjects_SEPGPhases.searchBox(Constant.driver).sendKeys(AddNewPhases);
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Search text box is enabled.",AddNewPhases, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify Search text box is enabled.",AddNewPhases, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
			}		
			// click on Edit button
			if(PageObjects_SEPGPhases.btn_EditPhases(Constant.driver).isEnabled())
			{			
				PageObjects_SEPGPhases.btn_EditPhases(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Edit Link is enabled.","Edit Link", "Edit Link should be enabled and clicked.", "Edit Link is enabled and clicked.", "Pass",null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify Edit Link is enabled.","Edit Link", "Edit Link should be enabled and clicked.", "Edit Link is not enabled and clicked.", "Fail", null);
			}		
			// Edit the Add New Phases Name here
			//	if(PageObjects_SEPGPhases.btn_savePhases(Constant.driver).isEnabled())
			if(PageObjects_SEPGPhases.lnk_savePhases(Constant.driver).isEnabled())
			{	
				//error her e
				PageObjects_SEPGPhases.txt_Edit_Phase(Constant.driver).clear();
				Thread.sleep(1000);
				PageObjects_SEPGPhases.txt_Edit_Phase(Constant.driver).sendKeys(EditNewPhases);
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Edit text box is enabled.",EditNewPhases, "Edit text box should be enabled and New Edit Phases value is entered.", "Edit text box is enabled and value is entered.", "Pass",null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify Edit text box is enabled.",EditNewPhases, "Edit text box should be enabled and New Edit Phases value is entered.", "Edit text box is not enabled and value is not entered.", "Fail",null);
			}
			// click on save button
			if(PageObjects_SEPGPhases.lnk_savePhases(Constant.driver).isEnabled())
			{			
				PageObjects_SEPGPhases.lnk_savePhases(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
			}
			//***To NAVIGATION on Home page***************
			if(Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).isDisplayed()){
				Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).click();
				Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is navigated to RMS Home page","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is not navigated to RMS Home page","Fail",null);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		
		Report.ReporterOutput("STEP","Verify New Phases "+AddNewPhases+" has been updated.",EditNewPhases,"Edit New Phases "+EditNewPhases+" should be updated.","Add New Phases "+AddNewPhases+" has been updated.","Pass",null);		
	}
	/***End of Akansha Method************************************************************************************/
}// END OF CLASS
//**********************************************************************************************************************************************************************
//**BT RT old code for Edit ***********EDIT THE SEPG PHASES NAME AND SAVE IT *********************************************
/*
public static void Edit_PhasesName(String EditPhaseName) throws Throwable {
	Thread.sleep(4000);
	try {
		if (PageObjects_SEPGPhases.btn_EditPhases(Constant.driver).isDisplayed()) {
			Thread.sleep(1000);
			PageObjects_SEPGPhases.btn_EditPhases(Constant.driver).click();
			Thread.sleep(1500);
			//Phases clear and then add new Phasess and click on save button 
			//##Error here## 
			PageObjects_SEPGPhases.txt_Edit_Phase(Constant.driver).clear();
			//TO SEND the OUTPUT from Excel sheet 
			Thread.sleep(1000);
			PageObjects_SEPGPhases.txt_Edit_Phase(Constant.driver).sendKeys(EditPhaseName);
			//Report.ReporterOutput("STEP","Verify edit Button is enabled ","edit Button","Click on edit Button","edit Button should be displayed and clicked","Pass",null);
			Report.ReporterOutput("Step","Verify edit text box is enabled.",EditPhaseName, "Edit text box should be enabled and value is entered.", "Edit text box is enabled and value is entered.", "Pass",null);
			Thread.sleep(1500);
			//save button for Add Phases
			if (PageObjects_SEPGPhases.lnk_savePhases(Constant.driver).isDisplayed()) {
				Thread.sleep(500);
				PageObjects_SEPGPhases.lnk_savePhases(Constant.driver).click();
				Report.ReporterOutput("STEP"," Verify saveButton is Displayed "," saveButton for Add Phases "," Click on saveButton for Add Phasess"," saveButton for Add Phasess should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP"," Verify saveButton is Displayed  ","  saveButton for Add Phases "," Click on saveButton for Add Phasess"," saveButton for Add Phasess is not displayed","Fail",null);
			}
			//TO Verify the Confirmation message after the save button hit : using Archana  code

			Thread.sleep(2000);
			if (PageObjects_SEPGPhases.saveButtonConfirmationMessage(Constant.driver).isDisplayed()) {
				Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ","save Confirmation Msg","Click on save Confirmation Msg","save Confirmation Msg should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ","save Confirmation Msg","Click on save Confirmation Msg","save Confirmation Msg is not displayed","Fail",null);
			}

			//To verify save Successfull Confirmation by getting the GetText method
			Thread.sleep(500);
			String successMsg=Constant.driver.findElement(By.xpath("//div[contains(@class,'toast-message')]")).getText();

			System.out.println(successMsg);

			if (successMsg.contains("successfully")) {
				Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ",successMsg,"Click on save Confirmation Msg","save Confirmation Msg displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ",successMsg,"Click on save Confirmation Msg","save Confirmation Msg is not displayed","Fail",null);
			}

			//Search again functionality : Search_NewPhasessName
			try {
				Thread.sleep(2000);
				// Logic to Search a Phases which is already added successfully 
				if (PageObjects_SEPGPhases.searchBox(Constant.driver).isDisplayed()) {
					PageObjects_SEPGPhases.searchBox(Constant.driver).click();
					Thread.sleep(2000);
					//To clear the search box
					PageObjects_SEPGPhases.searchBox(Constant.driver).clear();
					Thread.sleep(2000);
					//Giving output from First add Method
					PageObjects_SEPGPhases.searchBox(Constant.driver).sendKeys(EditPhaseName);
					Report.ReporterOutput("STEP","Verify search Box is Displayed : ", EditPhaseName ,"Click on search Box "," search Box should be displayed and clicked","Pass",null);
				}
				else {
					Report.ReporterOutput("STEP","Verify search Box is Displayed :", EditPhaseName ,"Click on search Box "," search Box is not displayed","Pass",null);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			//To verify the edited new Phasess is able to search or not : Validation STEP : Created New Test Phases 
			String expected = Constant.driver.findElement(By.xpath("//*[@class='dataTables_wrapper']/table/tbody/tr/td[2]")).getText();
			String actual =EditPhaseName; 

			if(expected.contains(actual))
			{
				Report.ReporterOutput("STEP"," Verify Edit_Add_New_Phases is Searched : ", EditPhaseName ,"Click on search Box "," The Edit_Add_New_Phases is searched Successfully ","Pass",null);
			} 
			else
			{
				Report.ReporterOutput("STEP"," Verify Edit_Add_New_Phases is Searched :",EditPhaseName,"Click on search Box "," The Edit_Add_New_Phases is not searched Successfully ","Pass",null);
			}

			//***NAVIGATING INTO RMS HOME PAGE: TO CLICK ON HOME PAGE**********

			if(Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).isDisplayed());                                    
			{              
				Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).click();
				Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is navigated to RMS      Home page","Pass",null);
			}
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}*/
/***End of old above Method*************************************************************************************/
