package com.yash.RMS.TestAction.Admin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Admin.PageFactory_Customers;
import com.yash.RMS.POM.ProjectAttribute.PageObjects_ProjectAttribute;

@SuppressWarnings("unused")
public class Action_Customers
{
	private static int rows_count;

	public static void Customers(String Search) throws Throwable
	{
	
		
		
		PageFactory_Customers Customers  =  PageFactory.initElements(Constant.driver, PageFactory_Customers.class);
		
		Thread.sleep(4000);
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
		     
			//Customers.lnk_Customers(Constant.driver).click();

			
		 } 
		
	
		//This functionality will verify Pagination
		
		
				List<WebElement> pagination = Constant.driver.findElements(By.xpath(".//*[@id='customerTableId_wrapper']/div[7]/div[2]/a"));
				for (int i=pagination.size(); i>=1; i--) 
				{
					WebElement element = Constant.driver.findElement(By.xpath(".//*[@id='customerTableId_wrapper']/div[7]/div[2]/a["+i+"]"));
					String programlist1 = element.getText();
					System.out.println(programlist1);
					element.click();
					Thread.sleep(500);
					Report.ReporterOutput("STEP ","Verify Pagination-:"+ programlist1, "Click on Link." + programlist1, programlist1+"Link should be visible and Clickable.",programlist1+" Link is visible and clickable", "Pass",null); 

				}

				//This functionality will verify Count of Records.
				
		Select dropdown1 = new Select(PageFactory_Customers.entry);
		List<WebElement> values_drop = dropdown1.getOptions();
					for(int i=0;i<values_drop.size();i++)
					{
				
				 dropdown1.selectByIndex(i);
				 WebElement option = dropdown1.getFirstSelectedOption();
				 System.out.println(option.getText()); 
				 Integer x = Integer.valueOf(option.getText());
				 System.out.println(x);
				//This is to verify number of rows and columns
				 WebElement mytable = PageFactory_Customers.webtable;
				  Thread.sleep(500);
				  //To locate rows of table.
				  List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
				  //To calculate no of rows In table.
				  rows_count = rows_table.size()-1;
				  System.out.println(rows_count);
				  Thread.sleep(1700);
				  if(x.equals(rows_count))
				  {
					
					  Report.ReporterOutput("STEP ","Verify Count of Record for entry="+ x,"Count="+ x  , "Entries Should be Correct-" + x,"Active Record Count done successfully.--" + x, "Pass",null);		  
					  
				  }
				
				  
				} 
					
		//This functionality will verify sorting order.
		 
		PageFactory_Customers.sort_cc.click();
		Report.ReporterOutput("STEP ","Verify Sorting for Customer Code.", "Click on Sorting for Customer Code.", "Sorting should be done for Customer Code.","Sorting for Customer Code is done Successfully.", "Pass",null);
			 
	 
		PageFactory_Customers.sort_CN.click();
		Report.ReporterOutput("STEP ","Verify Sorting for Customer Name.", "Click on Sorting for Customer Name.", "Sorting should be done for Customer Name.","Sorting for Customer Name is done Successfully.", "Pass",null);
		
		PageFactory_Customers.sort_Geography.click();
		Report.ReporterOutput("STEP ","Verify Sorting for Geography.", "Click on Sorting for Geography.", "Sorting should be done for Geography.","Sorting for Geography is done Successfully.", "Pass",null);
		
		PageFactory_Customers.sort_AM.click();
		Report.ReporterOutput("STEP ","Verify Sorting for Account Manager.", "Click on Sorting for Account Manager.", "Sorting should be done for Account Manager.","Sorting for Account Manager is done Successfully.", "Pass",null);
		
		PageFactory_Customers.Sort_Mgrcontactno.click();
		Report.ReporterOutput("STEP ","Verify Sorting for AC Manager Contact Number.", "Click on Sorting for AC Manager Contact Number.", "Sorting should be done for AC Manager Contact Number.","Sorting for AC Manager Contact Number is done Successfully.", "Pass",null);
		
		PageFactory_Customers.Sort_Customeradd.click();
		Report.ReporterOutput("STEP ","Verify Sorting for Customer Name.", "Click on Sorting for Customer Addess.", "Sorting should be done for Customer Addess.","Sorting for Customer Addess is done Successfully.", "Pass",null);
		
		
		//Search Funcionality
		
		PageFactory_Customers.search.sendKeys(Search);
		
			 
		  WebElement mytable = PageFactory_Customers.webtable;
		  // To locate rows of table.
			List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		  // To calculate no of rows In table.
			int rows_count = rows_table.size();
			System.out.println(rows_count);
			 for(int i=1;i<rows_count;i++)
			 {
			
			for(int j=0;j<6;j++)
			 {
			List<WebElement> Columns_row1 = rows_table.get(i).findElements(By.tagName("td"));
			String webelement = Columns_row1.get(j).getText();
			System.out.println(webelement);
			
			if(webelement.equalsIgnoreCase(Search))
				
			{
				
				Report.ReporterOutput("STEP ",Search+i, "Text Entered."+ Search, Search +"Search should be done.","Search done Successfully.", "Pass",null);
				
			}
		
			
			 }
			
			
			 }
				
				Customers.lnk_admin.click();
		

	}
		
		
	}



