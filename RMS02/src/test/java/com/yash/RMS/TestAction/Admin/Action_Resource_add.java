	package com.yash.RMS.TestAction.Admin;
	
	import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Admin.PageFactory_Resources;
	
	public class Action_Resource_add {
	
		@SuppressWarnings({ "static-access", "unused" })
		public static void Add(String Empid,String First_Name,String Middle_Name,String Last_Name,String designation,String Grade
				,String Parent_BGBU,String current_BGBU,String Base_Location,String Current_location ,String Emp_cat,String Ownership,
				String Email,String Contactn1,String Contactn2,String VISA_Status,String VISA_valid,String CurrentRM1,String CurrentRM2
				,String Role,String Customer_UserID,String Competency ,String Profit_Centre, String DOJ,String Confirmation_Date,
				String Resignation_Date,String Release_Date,String Transfer_Date,String Appraisal_Date1,String Appraisal_Date2,String Awards,String Timesheetc) throws Throwable
		{
			
			try
			{
	  PageFactory_Resources resources_add  =  PageFactory.initElements(Constant.driver, PageFactory_Resources.class);
			
			Thread.sleep(3000);
			Constant.driver.manage().window().maximize();
			if (resources_add.lnk_admin.isDisplayed() || resources_add.lnk_admin.isEnabled()) 
				{
					
				resources_add.lnk_admin.click();
					Report.ReporterOutput("STEP ","Verify Admin Link is Visible", "Click on Admin Link.", "Admin Link should be visible.","Admin Link is available", "Pass",null);
	} 
	else 
	{
		
		Report.ReporterOutput("STEP ","Verify Admin Link is Visible", "Click on Admin Link.", "Admin Link should be visible.","Admin Link is not available", "Fail",null);
			
		}
	
	Thread.sleep(2000);
	
	//	if (resources_add.lnk_Resources.isDisplayed() || resources_add.lnk_Resources.isEnabled()) 
		if (resources_add.lnk_Resources.isDisplayed()) 
	{
		
		resources_add.lnk_Resources.click();
	 
		 
		 
		Report.ReporterOutput("STEP ","Verify Resources Link is Visible", "Click on Resources Link.", "Resources Link should be visible.","Resources Link is available", "Pass",null);
	     
		
	 }    
		else 
		{
		
			Report.ReporterOutput("STEP ","Verify Resources Link is Visible", "Click on Resources Link.", "Resources Link should be visible.","Resources Link is not available", "Fail",null);
		
		}
		Thread.sleep(5000);
	resources_add.addbutton.click();
	
	//Data added for New Resource
	
	//***********************Entry of Empid************************************************
	
	
	resources_add.empid.sendKeys(Empid);
	Report.ReporterOutput("STEP ","Verify Emp-ID",Empid, "User should be able to enter Empid ","EmpId Entered.", "Pass",null);
	if (resources_add.emperror.isDisplayed())
	{
		Report.ReporterOutput("STEP ","Duplicate Empid",Empid, "It should not be duplicate.","Duplicate Empid is entered.", "Fail",null);
		
	}
	
	resources_add.Firstname.sendKeys(First_Name);
	Report.ReporterOutput("STEP ","Verify First Name.",First_Name, "User should be able to enter First Name ","First Name Entered.", "Pass",null);
	
	resources_add.middlename.sendKeys(Middle_Name);
	Report.ReporterOutput("STEP ","Verify Middle Name.",Middle_Name, "User should be able to enter Middle Name ","Middle Name Entered.", "Pass",null);
	
	resources_add.lastname.sendKeys(Last_Name);
	Report.ReporterOutput("STEP ","Verify Last Name.",Last_Name, "User should be able to enter Last Name ","Last Name Entered.", "Pass",null);
	
	WebElement Designation = resources_add.designations;
	Designation.sendKeys(designation);
	Designation.click();
	Report.ReporterOutput("STEP ","Verify Designation.",designation, "User should be able to enter Designation.","Designation Entered.", "Pass",null);
	
	WebElement Grade1 = resources_add.grade;
	Grade1.sendKeys(Grade);
	Grade1.click();
	Report.ReporterOutput("STEP ","Verify Grade.",Grade, "User should be able to enter Grade.","Grade Entered.", "Pass",null);
	
	
	WebElement ParentBGBU = resources_add.ParentBGBU;
	ParentBGBU.sendKeys(Parent_BGBU);
	ParentBGBU.click();
	Report.ReporterOutput("STEP ","Verify ParentBG-BU.",Parent_BGBU, "User should be able to enter ParentBG-BU.","ParentBG-BU Entered.", "Pass",null);
	
	
	WebElement CurrentBGBU = resources_add.CurrentBGBU;
	CurrentBGBU.sendKeys(current_BGBU);
	CurrentBGBU.click();
	Report.ReporterOutput("STEP ","Verify Current BG-BU.",current_BGBU, "User should be able to enter Current BG-BU.","Current BG-BU Entered.", "Pass",null);
	
	WebElement Baseloc = resources_add.Baselocation;
	Baseloc.sendKeys(Base_Location);
	Baseloc.click();
	Report.ReporterOutput("STEP ","Verify Base Location.",Base_Location, "User should be able to enter Current BG-BU.","Current BG-BU Entered.", "Pass",null);
	
	
	WebElement Currentloc = resources_add.Currentlocation;
	Currentloc.sendKeys(Current_location);
	Currentloc.click();
	Report.ReporterOutput("STEP ","Verify Current Location.",Current_location, "User should be able to enter Current location.","Current location Entered.", "Pass",null);
	
	WebElement Emp_cat1 = resources_add.Emp_Cat;
	Emp_cat1.sendKeys(Emp_cat);
	Emp_cat1.click();
	Report.ReporterOutput("STEP ","Verify Employee Category.",Emp_cat, "User should be able to enter Employee Category.","Employee Category Entered.", "Pass",null);
	
	WebElement Ownership1 = resources_add.Ownership1;
	Ownership1.sendKeys(Ownership);
	Ownership1.click();
	Report.ReporterOutput("STEP ","Verify Ownership.",Ownership, "User should be able to enter Ownership Details.","Ownership Entered.", "Pass",null);
	
	resources_add.emailid.sendKeys(Email);
	Report.ReporterOutput("STEP ","Verify Email ID.",Email, "User should be able to enter Email ID ","Email ID Entered.", "Pass",null);
	
	resources_add.Contactn1.sendKeys(Contactn1);
	Report.ReporterOutput("STEP ","Verify Contact Number 1.",Contactn1, "User should be able to enter Contact Number1 ","Contact Number 1 Entered.", "Pass",null);
	
	resources_add.Contactn2.sendKeys(Contactn2);
	Report.ReporterOutput("STEP ","Verify Contact Number 2.",Contactn2, "User should be able to enter Contact Number2 ","Contact Number 2 Entered.", "Pass",null);
	
	WebElement Visastat = resources_add.Visastatus;
	Visastat.sendKeys(VISA_Status);
	Visastat.click();
	Report.ReporterOutput("STEP ","Verify Visa Status.",VISA_Status, "User should be able to enter Visa Status.","Visa Status Entered.", "Pass",null);
	
	 
	
	
	((JavascriptExecutor)Constant.driver).executeScript ("document.getElementById('visavalidDate').removeAttribute('readonly',0);"); // Enables the from date box
	
	WebElement fromDateBox= Constant.driver.findElement(By.id("visavalidDate"));
	fromDateBox.clear();
	fromDateBox.sendKeys(VISA_valid); 
	Thread.sleep(500);
	Visastat.sendKeys(Keys.ESCAPE);
	Report.ReporterOutput("STEP ","Verify VISA Valid Date.", VISA_valid, "VISA Valid Date should be entered.","VISA Valid Date Entered.", "Pass",null);	
	
	//*************************************************
	WebElement currrentrm1 = resources_add.CurrentRM1;
	currrentrm1.sendKeys(CurrentRM1);
	String ParentWindow = Constant.driver.getWindowHandle();
	String Confirmation = null;
	Set<String> Handles = Constant.driver.getWindowHandles();
	Iterator<String> iterator1 = Handles.iterator();
	while(iterator1.hasNext())
	{
	      Confirmation = iterator1.next();
	}
	Constant.driver.switchTo().window(Confirmation);
	
	Constant.driver.findElement(By.xpath("html/body/ul[11]/li[1]/a")).click();
	Report.ReporterOutput("STEP ","Verify Current RM1.",CurrentRM1, "User should be able to enter Current RM1.","Current RM1 Entered.", "Pass",null);
	currrentrm1.sendKeys(Keys.TAB);
	
	
	WebElement currrentrm2 = resources_add.CurrentRM2;
	currrentrm2.sendKeys(CurrentRM2);
	String ParentWindow1 = Constant.driver.getWindowHandle();
	String Confirmation1 = null;
	Set<String> Handles1 = Constant.driver.getWindowHandles();
	Iterator<String> iterator2 = Handles.iterator();
	while(iterator2.hasNext())
	{
	      Confirmation = iterator2.next();
	}
	Constant.driver.switchTo().window(Confirmation);
	Constant.driver.findElement(By.xpath("html/body/ul[12]/li[1]/a")).click();
	Report.ReporterOutput("STEP ","Verify Current RM2.",CurrentRM2, "User should be able to enter Current RM2.","Current RM2 Entered.", "Pass",null);
	
	
	
	WebElement Role1 = resources_add.Role;
	Role1.sendKeys(Role);
	Role1.click();
	Report.ReporterOutput("STEP ","Verify Role.",Role, "User should be able to enter Role.","Role Entered.", "Pass",null);
	
	//**************************Userid
	
	resources_add.Cust_UserID.sendKeys(Customer_UserID);
	Report.ReporterOutput("STEP ","Verify Customer User ID Detail.",Customer_UserID, "User should be able to enter Customer User ID Detail.","Customer User ID Detail Entered.", "Pass",null);
	
	//**************************Competency
	WebElement Competency1 = resources_add.Competency;
	Competency1.sendKeys(Competency);
	Competency1.click();
	Report.ReporterOutput("STEP ","Verify Competency.",Competency, "User should be able to enter Competency.","Competency Entered.", "Pass",null);
	
	//**************************Profit Center
	resources_add.ProfitC.sendKeys(Profit_Centre);
	Report.ReporterOutput("STEP ","Verify Profit Center.",Profit_Centre, "User should be able to enter Profit Centre ","Profit Centre Entered.", "Pass",null);
	
	//*****************************Timesheet Comment********
	if(Timesheetc.equalsIgnoreCase("Yes"))
	 {
	 resources_add.timesheetcomment.click();
	 Report.ReporterOutput("STEP ","Verify Timesheet Comment.","Timesheet Comment Selection", "User should be able to tickmark Timesheet Comment ","Timesheet Comment tickmarked.", "Pass",null);
			
	 }
	
	//**************************DOJ
	((JavascriptExecutor)Constant.driver).executeScript ("document.getElementById('dateOfJoining').removeAttribute('readonly',0);"); // Enables the from date box
	WebElement doj= resources_add.DOJ1;
	doj.clear();
	doj.sendKeys(DOJ);
	doj.sendKeys(Keys.ESCAPE);
	Report.ReporterOutput("STEP ","Verify Date of Joining.",DOJ, "User should be able to enter Date of Joining.","Date of Joining Entered.", "Pass",null);
	
	//**************************Confirmation Date
	((JavascriptExecutor)Constant.driver).executeScript ("document.getElementById('confirmationDate').removeAttribute('readonly',0);"); // Enables the from date box
	WebElement confirmationd= resources_add.ConfirmationDate;
	confirmationd.clear();
	confirmationd.sendKeys(Confirmation_Date);
	confirmationd.sendKeys(Keys.ESCAPE);
	Report.ReporterOutput("STEP ","Verify Date of Confirmation.",Confirmation_Date, "User should be able to enter Date of Confirmation.","Date of Confirmation Entered.", "Pass",null);
	confirmationd.sendKeys(Keys.TAB);
	//**************************Resignation Date
	 ((JavascriptExecutor)Constant.driver).executeScript ("document.getElementById('resignationDate').removeAttribute('readonly',0);"); // Enables the from date box
	WebElement Resignationd= resources_add.resignationdate;
	//Resignationd.clear();
	Resignationd.sendKeys(Resignation_Date);
	Resignationd.sendKeys(Keys.ESCAPE);
	Report.ReporterOutput("STEP ","Verify Date of Resignation.",Resignation_Date, "User should be able to enter Date of Resignation.","Date of Resignation Entered.", "Pass",null);
	 
	
	//**************************Release Date
	((JavascriptExecutor)Constant.driver).executeScript ("document.getElementById('releaseDate').removeAttribute('readonly',0);"); // Enables the from date box
	WebElement Released= resources_add.releasedate;
	Released.clear();
	Released.sendKeys(Release_Date);
	Released.sendKeys(Keys.ESCAPE);
	Report.ReporterOutput("STEP ","Verify Date of Release.",Release_Date, "User should be able to enter Date of Release.","Date of Release Entered.", "Pass",null);
	
	
	 //**************************Transfer Date
	((JavascriptExecutor)Constant.driver).executeScript ("document.getElementById('transferDate').removeAttribute('readonly',0);"); // Enables the from date box
	WebElement Transferd= resources_add.trasferdate;
	Transferd.clear();
	Transferd.sendKeys(Transfer_Date);
	Transferd.sendKeys(Keys.ESCAPE);
	Report.ReporterOutput("STEP ","Verify Date of Transfer.",Transfer_Date, "User should be able to enter Date of Transfer.","Date of Transfer Entered.", "Pass",null);
	
	
	//**************************Aprasail Date1
	((JavascriptExecutor)Constant.driver).executeScript ("document.getElementById('lastAppraisalId').removeAttribute('readonly',0);"); // Enables the from date box
	WebElement Apprsaild= resources_add.Apprasaildate1;
	Apprsaild.clear();
	Apprsaild.sendKeys(Appraisal_Date1);
	Apprsaild.sendKeys(Keys.ESCAPE);
	Report.ReporterOutput("STEP ","Verify Date of Apprsail1.",Appraisal_Date1, "User should be able to enter Date of Apprsail1."," Date of Apprsail1 Entered.", "Pass",null);
	
	//**************************Aprasail Date1
	((JavascriptExecutor)Constant.driver).executeScript ("document.getElementById('penultimateAppraisalId').removeAttribute('readonly',0);"); // Enables the from date box
	WebElement Apprsaild1= resources_add.Apprasaildate2;
	Apprsaild1.clear();
	Apprsaild1.sendKeys(Appraisal_Date2);
	Apprsaild1.sendKeys(Keys.ESCAPE);
	Report.ReporterOutput("STEP ","Verify Date of Apprsail2.",Appraisal_Date2, "User should be able to enter Date of Apprsail2."," Date of Apprsail2 Entered.", "Pass",null);
	
	
	
	resources_add.Awards_recognitions.sendKeys(Awards);
	Report.ReporterOutput("STEP ","Verify Awards & recognitions.",Awards, "User should be able to enter Awards & recognitions.","Awards & recognitions Entered.", "Pass",null);
		
	
	
	
	   resources_add.save.click();
	   
	   Thread.sleep(2000);
	   
	   Constant.driver.get("http://inidrrmstsrv01:8080/rms/");
	   
//	   if(resources_add.addbutton.isDisplayed())
//	   {
//	   Report.ReporterOutput("STEP ","Verify Save Functionality.","Save Button Click", "User should be able to click on Save button.","Data Saved Successfully.", "Pass",null);
//	   
//	   }
//	   else
//	   {
//	   Report.ReporterOutput("STEP ","Verify Save Functionality.","Save Button Click", "User should be able to click on Save button.","Data is not Saved Successfully as it was duplicate.", "Fail",null);
//	  
//	   }
//	   
//	   resources_add.lnk_admin.click(); 
//		
		
	}
	 
	catch(Exception e)
	{
		String exception = e.getMessage();
		Report.ReporterOutput("","Exception Catch", "Execution for script is stopped", "Verify Exception catched : "
				+ "", exception.trim() , "Fail", "ID" );	
	} 

	
	}
		
	}
	
	
