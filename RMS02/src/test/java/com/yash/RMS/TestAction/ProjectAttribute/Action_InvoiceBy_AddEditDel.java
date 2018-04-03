package com.yash.RMS.TestAction.ProjectAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.ProjectAttribute.PageObjects_ProjectAttribute;
import com.yash.RMS.POM.ResourceAttribute.PageObjects_ResourceAttribute;

public class Action_InvoiceBy_AddEditDel {
	public static String InvoiceByAdd_name;
	public static void Navigation() throws Throwable {
		try {
			Thread.sleep(1000);
			//(Constant.driver).manage().window().maximize();
			if (PageObjects_ProjectAttribute.masterDataLink(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.masterDataLink(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify master data Link is displayed ","Master Data link", "Click on master data link","master data link should be displayed and clicked", "Pass", null);
			} else {
				Report.ReporterOutput("STEP","Master Data link is displayed ","Master Data link","Click on master data link","master data link not displayed","Fail",null);
			}
			Thread.sleep(4000);
			if (PageObjects_ProjectAttribute.projectAttributeLink(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.projectAttributeLink(Constant.driver).click();
				//Thread.sleep(2000);
				//PageObjects_ProjectAttribute.projectAttributeLink(Constant.driver).click();
				Report.ReporterOutput("STEP","Project Attribute Link is displayed ","Project Attribute Link","Click on Project Attribute Link","Project Attribute Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Project Attribute Link is displayed ","Project Attribute Link","Click on Project Attribute Link","Project Attribute Link  is not displayed","Fail",null);
			}
			 Thread.sleep(1000);

			if (PageObjects_ProjectAttribute.invoiceByLink(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.invoiceByLink(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify Invoice By Link is displayed "," Invoice By Link","Click on Invoice By Link","Invoice By Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Invoice By Link is displayed ","Invoice By Link","Click on Invoice By Link","Invoice By Link not displayed","Fail",null);
			}
			String Page_Invoice_By = PageObjects_ProjectAttribute.invoiceByPageText(Constant.driver).getText();
			if (Page_Invoice_By.equalsIgnoreCase("Invoice By")) {
				Report.ReporterOutput("STEP","Verify invoice By Page Text is Visible "," invoice By Page Text","Click on invoice By Page Text","invoice By Page Text is visible","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify invoice By Page Text is Visible ","invoice By Page Text","Click on invoice By Page Text","invoice By Page Text is not visible","Fail",null);
			}
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**********************************************************************************************************************************************
	public static void Add(String InvoiceByAdd_name) throws Throwable {
		try {
			if (PageObjects_ProjectAttribute.addNewLink(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.addNewLink(Constant.driver).click();
				//Thread.sleep(2000);
				Report.ReporterOutput("STEP","Verify Add New Link is displayed ","Add New Link","Click on Add New Link","add New Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Add New Link is displayed ","Add New Link","Click on Add New Link","add New Link not displayed","Fail",null);
			}
			Thread.sleep(3000);
			/*char[] chars = "ABC123DFGHI68JKLMNOPQRSTUVWXYZ7895".toCharArray();
			StringBuilder sb = new StringBuilder();
			Random random = new Random();
			for (int i = 0; i < 8; i++) {
				char c = chars[random.nextInt(chars.length)];
				sb.append(c);
			}
			output = sb.toString();*/
			//System.out.println("first output "+output);
			if (PageObjects_ProjectAttribute.invoiceByNameBox(Constant.driver).isDisplayed()) {
				Thread.sleep(2000);
				PageObjects_ProjectAttribute.invoiceByNameBox(Constant.driver).click();
				Thread.sleep(1000);
				PageObjects_ProjectAttribute.invoiceByNameBox(Constant.driver).sendKeys(InvoiceByAdd_name);
				Report.ReporterOutput("STEP","Verify invoice By Name is displayed ","Verify invoice By Name","Click on Verify invoice By Name","Verify invoice By Name should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify invoice By Name is displayed ","Verify invoice By Name","Click on Verify invoice By Name","Verify invoice By Name is displayed ","Fail",null);
			}
			Thread.sleep(1000);

			// to click on Save button/Verify new Location has been added
			if(Constant.driver.findElement(By.linkText("Save")).isEnabled());
			{
				Report.ReporterOutput("STEP","Verify Save button is enabled ","Save button","Save button should be enabled","Save button is enabled","Pass",null);
				Constant.driver.findElement(By.linkText("Save")).click();
			}
			Thread.sleep(2000);
			{
				Report.ReporterOutput("STEP","Verify new InvoiceBy has been created",InvoiceByAdd_name,"new InvoiceBy should be created","new InvoiceBy has been created","Pass",null);
			}
			/*	if (PageObjects_ProjectAttribute.saveButton(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.saveButton(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify saveButton is Visible ","saveButton","Click on saveButton","saveButton should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify saveButton is Visible ","saveButton","Click on saveButton","saveButton is not displayed","Fail",null);
			}
			Thread.sleep(2000);*/
	/*		if (PageObjects_ProjectAttribute.saveButtonConfirmationMessage1(Constant.driver).isDisplayed()) {
				Report.ReporterOutput("STEP","Verify save Button Confirmation Message is displayed ","saveButton Confirmation Message","Click on saveButton Confirmation Message","saveButton Confirmation Message should be displayed","Pass",null);

			}
			else {
				Report.ReporterOutput("STEP","Verify save Button Confirmation Message is displayed ","saveButton Confirmation Message","Click on saveButton Confirmation Message","saveButton Confirmation Message not displayed","Fail",null);
			}*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**********************************************************************************************************************************************
	//************ to Search and verify created InvoiceBy Name **************************************
	public static void SearchInvoiceByName(String InvoiceByAdd_name) throws Throwable
	{
		try
		{
			Thread.sleep(15000);
			
			PageObjects_ProjectAttribute.searchBox(Constant.driver).clear();
			PageObjects_ProjectAttribute.searchBox(Constant.driver).sendKeys(InvoiceByAdd_name);
			//Thread.sleep(2000);

			//String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();
			String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();
			String msgB= InvoiceByAdd_name;
		//	System.out.println(msgA);
			Thread.sleep(1000);

			if(msgA.contains(msgB))
			{
				//Report.ReporterOutput("STEP","Verify new Invoice By Type : "+InvoiceByAdd_name+" should be searched and verified","New Invoice By Type verification","new Allocation Type "+InvoiceByAdd_name+" should be searched and Verified","new Invoice By "+InvoiceByAdd_name+" searched and verified","Pass",null);
				Report.ReporterOutput("STEP","Verify new Invoice By Type "+InvoiceByAdd_name+" should be searched and verified","New Invoice By Type verification","New Invoice By Type "+InvoiceByAdd_name+" should be searched and verification","New Invoice By  "+InvoiceByAdd_name+" searched and verified","Pass",null);
			}

		//	Thread.sleep(3000);
		}
		catch(Exception e2)
		{
			//Report.ReporterOutput("STEP","Verify new Invoice By Type :"+InvoiceByAdd_name+" should be searched and verified","New Invoice By Type verification","new Allocation Type "+InvoiceByAdd_name+" should not be searched and Verified","new Invoice By "+InvoiceByAdd_name+" searched and verified","Fail",null);
			Report.ReporterOutput("STEP","Verify new Invoice By Type "+InvoiceByAdd_name+" should be searched and verified","New Invoice By Type verification","New Invoice By Type "+InvoiceByAdd_name+" should be searched and verification","New Invoice By  "+InvoiceByAdd_name+" is not searched and verified","Fail",null);
		}
	}

	//*******************************************************************************************************************************************
	public static void search_Edit(String InvoiceByAdd_name) throws Throwable {
		try {
			Thread.sleep(11000);
			// for search 
			if (PageObjects_ProjectAttribute.searchBox(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.searchBox(Constant.driver).click();
				//Thread.sleep(2000);
				PageObjects_ProjectAttribute.searchBox(Constant.driver).clear();
				//Giving output from First add Method
				PageObjects_ProjectAttribute.searchBox(Constant.driver).sendKeys(InvoiceByAdd_name);
				//Thread.sleep(2000);
				//Report.ReporterOutput("STEP","Verify new Invoice By Type : "+InvoiceByAdd_name+" should be searched and verified","New Invoice By Type verification","new Allocation Type "+InvoiceByAdd_name+" should be searched and Verified","new Invoice By "+InvoiceByAdd_name+" searched and verified","Pass",null);
				//Report.ReporterOutput("STEP","Verify search Box is Visible ","search Box ","Click on search Box ","search Box should be displayed and clicked","Pass",null);
				Report.ReporterOutput("STEP","Verify new Invoice By Type "+InvoiceByAdd_name+" should be searched and verified","New Invoice By Type verification","New Invoice By Type "+InvoiceByAdd_name+" should be searched and verification","New Invoice By  "+InvoiceByAdd_name+" searched and verified","Pass",null);

				//Report.ReporterOutput("STEP","Verify New Search : " +InvoiceByAdd_name+ " should be searched and verified","Invoice By Type verification","Invoice By  : "+InvoiceByAdd_name+" should be searched and verification","new Skill Type "+InvoiceByAdd_name+" searched and verified","Pass",null);
			}
			else {
				//Report.ReporterOutput("STEP","Verify search Box is Visible ","search Box ","Click on search Box ","search Box not displayed","Pass",null);
				Report.ReporterOutput("STEP","Verify new Invoice By Type "+InvoiceByAdd_name+" should be searched and verified","New Invoice By Type verification","New Invoice By Type "+InvoiceByAdd_name+" should be searched and verification","New Invoice By  "+InvoiceByAdd_name+" is not searched and verified","Fail",null);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**********************************************************************************************************************************************
	public static void Edit(String Editoutput) throws Throwable {
		try {
			Thread.sleep(4000);
			if (PageObjects_ProjectAttribute.editButton(Constant.driver).isDisplayed()) {
				//Thread.sleep(2000);
				PageObjects_ProjectAttribute.editButton(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify edit Button is Visible ","edit Button","Click on edit Button","edit Button should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify edit Button is Visible ","edit Button","Click on edit Button","edit Button is not displayed","Pass",null);
			}
			/*//Generate random No 2nd to Edit
			char[] chars1 = "ABC123DFGHI68JKLMNOPQRSTUVWXYZ7895".toCharArray();
			StringBuilder sb1 = new StringBuilder();
			Random random1 = new Random();
			for (int i = 0; i < 8; i++) {
				char c = chars1[random1.nextInt(chars1.length)];
				sb1.append(c);
			}*/
			/*Editoutput = sb1.toString();
			System.out.println(Editoutput);*/
			Thread.sleep(3000);
			if (PageObjects_ProjectAttribute.invoiceByNameBox(Constant.driver).isDisplayed()) {
				//Thread.sleep(2000);
				PageObjects_ProjectAttribute.invoiceByNameBox(Constant.driver).click();
				Thread.sleep(1000);
				PageObjects_ProjectAttribute.invoiceByNameBox(Constant.driver).clear();
				Thread.sleep(1000);
				PageObjects_ProjectAttribute.invoiceByNameBox(Constant.driver).sendKeys(Editoutput);
				Report.ReporterOutput("STEP","Verify InvoiceBy Name Box is displayed ","InvoiceBy Name Box","Click on InvoiceBy Name Box","InvoiceBy Name Box should be displayed and clicked","Pass",null);
				/*Thread.sleep(500);
				Report.ReporterOutput("STEP","Verify Updated Skill Type Name : "+Editoutput+" has been Updated","Updated Skill Type Name","Updated skill Type : "+UpdatedSkillTypeName+" should be Updated","New Skill Type "+UpdatedSkillTypeName+" has been Updated","Pass",null);
				 */
			}
			else {
				Report.ReporterOutput("STEP","Verify InvoiceBy Name Box is displayed ","InvoiceBy Name Box","Click on InvoiceBy Name Box","InvoiceBy Name Box not displayed","Fail",null);
			}

			if (PageObjects_ProjectAttribute.saveButton(Constant.driver).isDisplayed()) {
				//Thread.sleep(2000);
				PageObjects_ProjectAttribute.saveButton(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify save Button is Visible ","save Button","Click on save Button","save Button should be displayed and clicked","Pass",null);
				Thread.sleep(2000);
				//Report.ReporterOutput("STEP","Verify Updated Invoice By Name : "+Editoutput+" has been Updated","Updated Invoice By Name","Updated Invoice By Name : "+Editoutput+" should be Updated","New Invoice By Name "+Editoutput+" has been Updated","Pass",null);
			}
			else {
				//Report.ReporterOutput("STEP","Verify Updated Invoice By Name : "+Editoutput+" has been Updated","Updated Invoice By Name","Updated Invoice By Name : "+Editoutput+" should be Updated","New Invoice By Name "+Editoutput+" has not been Updated","Fail",null);
				//Thread.sleep(2000);
				Report.ReporterOutput("STEP","Verify save Button is Visible ","save Button","Click on save Button","save Button is not displayed","Pass",null);
			}
			Report.ReporterOutput("STEP","Verify Updated Invoice By Name : "+Editoutput+" has been Updated","Updated Invoice By Name","Updated Invoice By Name : "+Editoutput+" should be Updated","New Invoice By Name "+Editoutput+" has been Updated","Pass",null);
			//Verify Edited Value
			try
			{
				Thread.sleep(12000);
				PageObjects_ProjectAttribute.searchBox(Constant.driver).clear();
				PageObjects_ProjectAttribute.searchBox(Constant.driver).sendKeys(Editoutput);
				Thread.sleep(1000);

				String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

				String msgB1= Editoutput;
				System.out.println(msgA1);
			//	Thread.sleep(2000);

				if(msgA1.contains(msgB1))
				{
					Report.ReporterOutput("STEP","Verify InvoiceBy Name has been updated",Editoutput,"InvoiceBy Name should be updated.","InvoiceBy Name has been updated.","Pass",null);
				}

				//Thread.sleep(1000);
			}
			catch(Exception e2)
			{
				Report.ReporterOutput("STEP","Verify InvoiceBy Name has been updated",Editoutput,"InvoiceBy Name should be updated.","InvoiceBy Name has been updated.","Fail",null);
			}


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//******************************************************************************** **************************************************************
	public static void search_Del(String Editoutput) throws Throwable {
		try {
			Thread.sleep(3000);
			// for search 
			if (PageObjects_ProjectAttribute.searchBox(Constant.driver).isDisplayed()) {
				//Thread.sleep(2000);
				PageObjects_ProjectAttribute.searchBox(Constant.driver).click();
				Thread.sleep(1000);
				PageObjects_ProjectAttribute.searchBox(Constant.driver).clear();
				Thread.sleep(1000);
				PageObjects_ProjectAttribute.searchBox(Constant.driver).sendKeys(Editoutput);
				Report.ReporterOutput("STEP","Verify search Box is Visible ",Editoutput,"Click on search Box ","search Box should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify search Box is Visible ",Editoutput,"Click on search Box ","search Box should be displayed and clicked","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**********************************************************************************************************************************************
	public static void Delete(String Editoutput) throws Throwable {
		//public static void Delete() throws Throwable {
		// for search functionality 2nd Time To Delete
		Thread.sleep(3000);

		if (PageObjects_ProjectAttribute.deleteButton(Constant.driver).isDisplayed()) {
			Thread.sleep(2000);

			PageObjects_ProjectAttribute.deleteButton(Constant.driver).click();
			Report.ReporterOutput("STEP","Verify delete`Button is Visible ","delete`Button ","Click on delete Button","delete Button should be displayed and clicked","Pass",null);

		}
		else {
			Report.ReporterOutput("STEP","Verify delete`Button is Visible ","delete`Button ","Click on delete Button","delete Button is not displayed","Fail",null);
		}
		if (PageObjects_ProjectAttribute.deleteOkButton(Constant.driver).isDisplayed()) {
			Thread.sleep(2000);
			
			PageObjects_ProjectAttribute.deleteOkButton(Constant.driver).click();
			
			Report.ReporterOutput("STEP","Verify delete Ok Button is Visible ","delete Ok Button","Click on delete Ok Button","delete Ok Button should be displayed and clicked","Pass",null);
		}
		else {
			Report.ReporterOutput("STEP","Verify delete Ok Button is Visible ","delete Ok Button","Click on delete Ok Button","delete Ok Button is not displayed","Fail",null);
		}
		Thread.sleep(2000);
		
		if (PageObjects_ProjectAttribute.deleteConfirmationMsg(Constant.driver).isDisplayed()) {
			Report.ReporterOutput("STEP","Verify delete Confirmation Msg is Visible ","delete Confirmation Msg","Click on delete Confirmation Msg","delete Confirmation Msg should be displayed and clicked","Pass",null);
		}
		else {
			Report.ReporterOutput("STEP","Verify delete Confirmation Msg is Visible ","delete Confirmation Msg","Click on delete Confirmation Msg","delete Confirmation Msg is not displayed","Fail",null);
		}
		Thread.sleep(12000);

		
		//Verify New Location By has been deleted

		// exact	
		PageObjects_ProjectAttribute.searchBox(Constant.driver).clear();
		PageObjects_ProjectAttribute.searchBox(Constant.driver).sendKeys(Editoutput);//function parameter esend need to pass  here 
			   //Thread.sleep(5000);
			   Thread.sleep(1000);
			   String delete = PageObjects_ProjectAttribute.nomatchingRecordsText(Constant.driver).getText();
			   String deletetoverify ="No matching records found";

			   if(delete.equalsIgnoreCase(deletetoverify)){
			    //Report.ReporterOutput("STEP","Verify Skill Type Name  has been deleted","Skill Type Name deletion","Skill Type Name should be deleted succesfully","Skill Type Name has not been deleted succesfully","fail",null);
			    //Thread.sleep(2000);
			    Report.ReporterOutput("STEP","Verify Deleted InvoiceBy Type Name : "+Editoutput+" has been Deleted","Delete InvoiceBy Type Name","Delete InvoiceBy Type Name : "+Editoutput+" should be Deleted","Delete InvoiceBy Type Name "+Editoutput+" has been Deleted","Pass",null);
			   }else
			   {
			    //Report.ReporterOutput("STEP","Verify Skill Type Name  has been deleted","Skill Type Name deletion","Skill Type Name should not be deleted succesfully","Skill Type Name has not been deleted succesfully","Pass",null);
			    Report.ReporterOutput("STEP","Verify Deleted InvoiceBy Type Name : "+Editoutput+" has been Deleted","Delete InvoiceBy Type Name","Delete InvoiceBy Type Name : "+Editoutput+" should be Deleted","Delete InvoiceBy Type Name "+Editoutput+" has NOT been Deleted","Fail",null);
			   }
			Thread.sleep(1000);
			  
		PageObjects_ProjectAttribute.searchBox(Constant.driver).clear();
		PageObjects_ProjectAttribute.masterDataLink(Constant.driver).click();

		//OR

		/*PageObjects_ProjectAttribute.searchBox(Constant.driver).clear();
		PageObjects_ProjectAttribute.searchBox(Constant.driver).sendKeys(Editoutput);
		Thread.sleep(5000);
		String msgA1= Constant.driver.findElement(By.xpath(".//*[@id='37']/td[2]")).getText().trim();
		Thread.sleep(2000);
		String msgB1= Editoutput;
		System.out.println(msgA1);
		Thread.sleep(2000);

		if(msgA1.contains(msgB1))
		{
			Report.ReporterOutput("STEP","Verify InvoiceBy has been deleted","InvoiceBy Deletion","InvoiceBy should be deleted succesfully","InvoiceBy has not been deleted succesfully","fail",null);
		}
		{
			Report.ReporterOutput("STEP","Verify InvoiceBy has been deleted","InvoiceBy Deletion","InvoiceBy should  be deleted succesfully","InvoiceBy has been deleted succesfully","Pass",null);
		}

		 */
		//**********************************************************************
		// to click on Home page
		try
		{
			if(Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).isDisplayed());
			{
				Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).click();
				Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is navigated to RMS Home page","Pass",null);
			}
		}
		catch(Exception e8)
		{
			System.out.println( e8.getMessage());

		}
		//**********************************************************************
	}

}//End of class
//***************************************************************************************************************