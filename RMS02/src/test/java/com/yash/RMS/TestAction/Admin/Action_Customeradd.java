package com.yash.RMS.TestAction.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Admin.PageFactory_Customers;

public class Action_Customeradd {
	
	
	@SuppressWarnings("static-access")
	public static void Customersadd(String Custcode, String Custname,String Geography,String AccountMgr,String AcmgrCno,String Custadd) throws Throwable
	{
		 

	PageFactory_Customers Customers  =  PageFactory.initElements(Constant.driver, PageFactory_Customers.class);
	
	Thread.sleep(5000);
	Constant.driver.manage().window().maximize();
	if (Customers.lnk_admin.isDisplayed() || Customers.lnk_admin.isEnabled()) 
		{
			
	 Customers.lnk_admin.click();
			Report.ReporterOutput("STEP ","Verify Admin Link is Visible", "Click on Admin Link.", "Admin Link should be visible.","Admin Link is available", "Pass",null);
		} 
		else 
		{
			
			Report.ReporterOutput("STEP ","Verify Admin Link is Visible", "Click on Admin Link.", "Admin Link should be visible.","Admin Link is not available", "Fail",null);
			
		}
	
	Thread.sleep(4000);
	
	if (Customers.lnk_Customers.isDisplayed() || Customers.lnk_Customers.isEnabled()) 
	{
		
	Customers.lnk_Customers.click();
	 
		 
		 
		Report.ReporterOutput("STEP ","Verify Customer Link is Visible", "Click on Customer Link.", "Customer Link should be visible.","Customer Link is available", "Pass",null);
	     
		
	 } 
	
	Customers.addnew.click();
	
	//Adding details on Customer Page
	
	Thread.sleep(500);
	
	Customers.Custcode.sendKeys(Custcode);
	Report.ReporterOutput("STEP ","Enter Customer Code.",Custcode, "User should be able to enter Customer Code.","Customer Code Entered.", "Pass",null);
	
	
	Customers.Custname.sendKeys(Custname);
	Report.ReporterOutput("STEP ","Enter Customer Name.",Custname, "User should be able to enter Customer Name.","Customer Name Entered.", "Pass",null);
	
	
	Customers.Geography.sendKeys(Geography);
	Report.ReporterOutput("STEP ","Enter Geography",Geography, "User should be able to enter Geography.","Geography Entered.", "Pass",null);
	
	
	Customers.AaccountManager.sendKeys(AccountMgr);
	Report.ReporterOutput("STEP ","Enter Account Manager.",AccountMgr, "User should be able to enter Account Manager Detail.","Account Manager Detail Entered.", "Pass",null);
	

	Customers.AccmgrCNo.sendKeys(AcmgrCno);
	Report.ReporterOutput("STEP ","Enter Account Manager Contact Number.",AcmgrCno, "User should be able to enter Account Manager Contact Number.","Account Manager Contact Number Entered.", "Pass",null);
	
	
	Customers.Custaddess.sendKeys(Custadd);
	Report.ReporterOutput("STEP ","Enter Customer Address.",Custadd, "User should be able to enter Customer Address.","Customer Address Detail Entered.", "Pass",null);
	
	
	Customers.save.click();
	
	if (Customers.addnew.isDisplayed())
	{
	
		Report.ReporterOutput("STEP ","Verify Details are Saved.","Save Click", "User should be able to save details.","Customer Details saved Successfully.", "Pass",null);
	}
	else
		
	{
		
		Report.ReporterOutput("STEP ","Verify Details are Saved.","Save Click", "User should be able to save details.","Customer Details are not saved Successfully as it was duplicate.", "Fail",null);
		Customers.errorclose.click();
		
		Customers.list.click();
		
	}	

	}
	
	
	
	//This is to update record.
	
	@SuppressWarnings("static-access")
	public static void Customersupdate(String Custcode, String Custname,String Geography,String AccountMgr,String AcmgrCno,String Custadd) throws Throwable
	{
		 

	PageFactory_Customers Customers  =  PageFactory.initElements(Constant.driver, PageFactory_Customers.class);
	
	Thread.sleep(5000);
	Constant.driver.manage().window().maximize();
	if (Customers.lnk_admin.isDisplayed() || Customers.lnk_admin.isEnabled()) 
		{
			
	//  Customers.lnk_admin.click();
			Report.ReporterOutput("STEP ","Verify Admin Link is Visible", "Click on Admin Link.", "Admin Link should be visible.","Admin Link is available", "Pass",null);
		} 
		else 
		{
			
			Report.ReporterOutput("STEP ","Verify Admin Link is Visible", "Click on Admin Link.", "Admin Link should be visible.","Admin Link is not available", "Fail",null);
			
		}
	
	Thread.sleep(4000);
	
	if (Customers.lnk_Customers.isDisplayed() || Customers.lnk_Customers.isEnabled()) 
	{
		
	// Customers.lnk_Customers.click();
	 
		 
		 
		Report.ReporterOutput("STEP ","Verify Customer Link is Visible", "Click on Customer Link.", "Customer Link should be visible.","Customer Link is available", "Pass",null);
	     
		
	 } 
	PageFactory_Customers.search.clear();
	PageFactory_Customers.search.sendKeys(Custcode);
	Constant.driver.findElement(By.linkText(Custcode)).click();
	
	//Adding details on Customer Page
	Customers.Custcode.clear();
	Customers.Custcode.sendKeys(Custcode);
	Report.ReporterOutput("STEP ","Enter New Customer Code.",Custcode, "User should be able to update Customer Code.","New Customer Code Entered.", "Pass",null);
	
	Customers.Custname.clear();
	Customers.Custname.sendKeys(Custname);
	Report.ReporterOutput("STEP ","Enter New Customer Name.",Custname, "User should be able to update Customer Name.","New Customer Name Entered.", "Pass",null);
	
	Customers.Geography.clear();
	Customers.Geography.sendKeys(Geography);
	Report.ReporterOutput("STEP ","Enter New Geography",Geography, "User should be able to update Geography.","New Geography Entered.", "Pass",null);
	
	Customers.AaccountManager.clear();
	Customers.AaccountManager.sendKeys(AccountMgr);
	Report.ReporterOutput("STEP ","Enter New Account Manager.",AccountMgr, "User should be able to update Account Manager Detail.","New Account Manager Detail Entered.", "Pass",null);
	
	Customers.AccmgrCNo.clear();
	Customers.AccmgrCNo.sendKeys(AcmgrCno);
	Report.ReporterOutput("STEP ","Enter New Account Manager Contact Number.",AcmgrCno, "User should be able to update Account Manager Contact Number.","New Account Manager Contact Number Entered.", "Pass",null);
	
	Customers.Custaddess.clear();
	Customers.Custaddess.sendKeys(Custadd);
	Report.ReporterOutput("STEP ","Enter New Customer Address.",Custadd, "User should be able to update Customer Address.","New Customer Address Detail Entered.", "Pass",null);
	
	
	Customers.save.click();
	Thread.sleep(2000);
	Constant.driver.get("http://inidrrmstsrv01:8080/rms");
	
//	if (Customers.addnew.isDisplayed())
//	{
//	
//		Report.ReporterOutput("STEP ","Verify Details are updated.","Save Click", "User should be able to update details.","Customer Details updated Successfully.", "Pass",null);
//	}
//	else
//		
//	{
//		
//		Report.ReporterOutput("STEP ","Verify Details are Saved.","Save Click", "User should be able to update details.","Customer Details are not updated Successfully as it was duplicate.", "Fail",null);
//		Customers.errorclose.click();
//		Customers.list.click();
//		
//		
//	}
//	
//
//
//	}
//	
	
	
	
	}
}
	 
	