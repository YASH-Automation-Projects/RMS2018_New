package com.yash.RMS.TestAction.Useful_links;

import java.util.ArrayList;
import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Useful_links.Pageobjects_useful_links;

public class Action_Useful_Links
{
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void Navigation() throws Throwable
	{
	
		
		
		
		Thread.sleep(4000);
		(Constant.driver).manage().window().maximize();
		if (Pageobjects_useful_links.navig_useful_links(Constant.driver).isDisplayed() || Pageobjects_useful_links.navig_useful_links(Constant.driver).isEnabled()) 
			{
				
			Pageobjects_useful_links.navig_useful_links(Constant.driver).click();
				Report.ReporterOutput("STEP ","Verify Useful Link is Visible", "Click on Useful Link.", "Useful Link should be visible.","Useful Link is available", "Pass",null);
			} 
			else 
			{
				
				Report.ReporterOutput("STEP ","Verify Useful Link is Visible", "Click on Useful Link.", "Useful Link should be visible.","Useful Link is not available", "Fail",null);
				
			}
		
		
		Thread.sleep(2000);
		
		
		if (Pageobjects_useful_links.Iconnect_link(Constant.driver).isDisplayed() || Pageobjects_useful_links.Iconnect_link(Constant.driver).isEnabled()) 
		{
			
			Pageobjects_useful_links.Iconnect_link(Constant.driver).click();
		 
			 
			ArrayList tabs = new ArrayList (Constant.driver.getWindowHandles());
			String window2 = Constant.driver.switchTo().window((String) tabs.get(1)).getTitle();
			if(window2.equalsIgnoreCase("SPINE HR"))
			{
			 
			Report.ReporterOutput("STEP ","Verify Iconnect Link is Visible", "Click on Iconnect Link.", "Iconnect Link should be visible.","Iconnect Link is available", "Pass",null);
		     } 
			
		 }    
			else 
			{
			
			Report.ReporterOutput("STEP ","Verify Iconnect Link is Visible", "Click on Iconnect Link.", "Iconnect Link should be visible.","Iconnect Link is not available", "Fail",null);
			
			}
		 
		

	      	ArrayList tabs = new ArrayList (Constant.driver.getWindowHandles());
	    	Constant.driver.switchTo().window((String) tabs.get(0));
	    	
		    if (Pageobjects_useful_links.You_Portal_link(Constant.driver).isDisplayed() ||Pageobjects_useful_links.You_Portal_link(Constant.driver).isEnabled())
		    
		    {
			
			Pageobjects_useful_links.You_Portal_link(Constant.driver).click();
			 
			 
				Report.ReporterOutput("STEP ","Verify You Portal Link is Visible", "Click on You Portal Link.", "You Portal Link should be visible.","You Portal Link is available", "Pass",null);
		     } 
			
			
		
		else 
		{
			
			Report.ReporterOutput("STEP ","Verify You Portal Link is Visible", "Click on You Portal Link.", "You Portal Link should be visible.","You Portal Link is not available", "Fail",null);
			
		}
		
	
		 
}

	
}
