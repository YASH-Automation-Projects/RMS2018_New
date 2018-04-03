package com.yash.RMS.TestAction.Useful_links;

import java.util.ArrayList;

import org.openqa.selenium.support.PageFactory;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Useful_links.PageFactory_Useful_Links;

public class Action_PageFuseful {

	 
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public static void Navigation() throws Throwable
		{
		
			
			PageFactory_Useful_Links usefulLinks  =  PageFactory.initElements(Constant.driver, PageFactory_Useful_Links.class);
			
			Thread.sleep(4000);
			Constant.driver.manage().window().maximize();
			if (usefulLinks.navig_useful_links.isDisplayed() || usefulLinks.navig_useful_links.isEnabled()) 
				{
					
				usefulLinks.navig_useful_links.click();
					Report.ReporterOutput("STEP ","Verify Useful Link is Visible", "Click on Useful Link.", "Useful Link should be visible.","Useful Link is available", "Pass",null);
				} 
				else 
				{
					
					Report.ReporterOutput("STEP ","Verify Useful Link is Visible", "Click on Useful Link.", "Useful Link should be visible.","Useful Link is not available", "Fail",null);
					
				}
			
			
			Thread.sleep(2000);
			
			
			if (usefulLinks.Iconnect_link.isDisplayed() || usefulLinks.Iconnect_link.isEnabled()) 
			{
				
				usefulLinks.Iconnect_link.click();
			 
				 
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
		    	
			    if (usefulLinks.You_Portal_link.isDisplayed() ||usefulLinks.You_Portal_link.isEnabled())
			    
			    {
				
				usefulLinks.You_Portal_link.click();
				
				 
					Report.ReporterOutput("STEP ","Verify You Portal Link is Visible", "Click on You Portal Link.", "You Portal Link should be visible.","You Portal Link is available", "Pass",null);
			     } 
				
				
			
			else 
			{
				
				Report.ReporterOutput("STEP ","Verify You Portal Link is Visible", "Click on You Portal Link.", "You Portal Link should be visible.","You Portal Link is not available", "Fail",null);
				
			}
			//Close all rest tabs except main
			    String originalHandle = Constant.driver.getWindowHandle();

			    //Do something to open new tabs

			    for(String handle : Constant.driver.getWindowHandles()) {
			        if (!handle.equals(originalHandle)) {
			        	Constant.driver.switchTo().window(handle);
			        	Constant.driver.close();
			        }
			    }

			    Constant.driver.switchTo().window(originalHandle);
			 
	}

		
	}


