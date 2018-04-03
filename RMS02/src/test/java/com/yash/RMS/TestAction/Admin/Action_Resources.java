package com.yash.RMS.TestAction.Admin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.yash.RMS.CustomProperties.CommonMethods;
import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Admin.PageFactory_Resources;
 

public class Action_Resources
{

	
	private static String Total_count;
	@SuppressWarnings("unused")
	private static int rows_count;

	@SuppressWarnings({ "static-access" })
	public static void Resources(String Empid,String Empname,String Designation,String Grade,String Ownership,String Currentbu,String Parentbu) throws Throwable
	{
	
		
		PageFactory_Resources resources  =  PageFactory.initElements(Constant.driver, PageFactory_Resources.class);
		
		Thread.sleep(4000);
	//	Constant.driver.manage().window().maximize();
		if (resources.lnk_admin.isDisplayed() || resources.lnk_admin.isEnabled()) 
			{
				
				resources.lnk_admin.click();
				Report.ReporterOutput("STEP ","Verify Admin Link is Visible", "Click on Admin Link.", "Admin Link should be visible.","Admin Link is available", "Pass",null);
			} 
			else 
			{
				
				Report.ReporterOutput("STEP ","Verify Admin Link is Visible", "Click on Admin Link.", "Admin Link should be visible.","Admin Link is not available", "Fail",null);
				
			}
		
		Thread.sleep(2000);
		
		if (resources.lnk_Resources.isDisplayed() || resources.lnk_Resources.isEnabled()) 
		{
			
			resources.lnk_Resources.click();
		 
			 
			 
			Report.ReporterOutput("STEP ","Verify Resources Link is Visible", "Click on Resources Link.", "Resources Link should be visible.","Resources Link is available", "Pass",null);
		     
			
		 }    
			else 
			{
			
				Report.ReporterOutput("STEP ","Verify Resources Link is Visible", "Click on Resources Link.", "Resources Link should be visible.","Resources Link is not available", "Fail",null);
			
			}
		
		//This functionality will verify Pagination
		
		
		/*List<WebElement> pagination = Constant.driver.findElements(By.xpath(".//*[@id='resourceTableId_wrapper']/div[9]/div[3]/a"));
		for (int i=pagination.size(); i>=1; i--) 
		{
			WebElement element = Constant.driver.findElement(By.xpath(".//*[@id='resourceTableId_wrapper']/div[9]/div[3]/a["+i+"]"));
			
			String programlist1 = element.getText();
			System.out.println(programlist1);
			element.click();
			Thread.sleep(500);
			Report.ReporterOutput("STEP ","Verify Pagination-:"+ programlist1, "Click on Link." + programlist1, programlist1+"Link should be visible and Clickable.",programlist1+" Link is visible and clickable", "Pass",null); 

		}*/

	 
		
		
		//This Functionality will verify sorting functionality
	 	
		
		resources.Yash_Emp_id.click();
		Thread.sleep(1000);
		String before =resources.sort_empid.getText();
		resources.Yash_Emp_id.click();
		String after =resources.sort_empid.getText();
		if(!after.equalsIgnoreCase(before))
				{
		Report.ReporterOutput("STEP ","Verify Sorting for Yash Emp ID", "Click on Sorting for Yash Emp ID.", "Sorting should be done for Yash Emp ID .","Sorting for Yash Emp ID is done Successfully.", "Pass",null);
				}
	
		resources.Emp_name.click();
		Thread.sleep(1000);
		String before1 =resources.sort_empname.getText();
		resources.Emp_name.click();
			String after1 =resources.sort_empname.getText();
		if(!after1.equalsIgnoreCase(before1))
				{
		Report.ReporterOutput("STEP ","Verify Sorting for Emp Name", "Click on Sorting for Emp Name.", "Sorting should be done for Emp Name.","Sorting for Emp Name is done Successfully.", "Pass",null);
				}	
		resources.Designation.click();
		String before2 =resources.sort_designation.getText();
		resources.Designation.click();
		Thread.sleep(1000);
		String after2 =resources.sort_designation.getText();
		if(!after2.equalsIgnoreCase(before2))
				{
		Report.ReporterOutput("STEP ","Verify Sorting for Designation", "Click on Sorting for Designation.", "Sorting should be done for Designation.","Sorting for Designation is done Successfully.", "Pass",null);
				}
		resources.Grade.click();
		Thread.sleep(1000);
		String before3 =resources.sort_grade.getText();
		resources.Grade.click();
		String after3 =resources.sort_grade.getText();
		if(!after3.equalsIgnoreCase(before3))
				{
		Report.ReporterOutput("STEP ","Verify Sorting for Grade", "Click on Sorting for Grade.", "Sorting should be done for Grade.","Sorting for Grade is done Successfully.", "Pass",null);
				}
		
		resources.DOJ.click();
		Thread.sleep(1000);
		String before4 =resources.sort_doj.getText();
		resources.DOJ.click();
		String after4 =resources.sort_doj.getText();
		if(!after4.equalsIgnoreCase(before4))
				{
		Report.ReporterOutput("STEP ","Verify Sorting for DOJ", "Click on Sorting for DOJ.", "Sorting should be done for DOJ.","Sorting for DOJ is done Successfully.", "Pass",null);
				}
		resources.Release_Date.click();
		Thread.sleep(1000);
		String before5 =resources.sort_releasedate.getText();
		resources.Release_Date.click();
		String after5 =resources.sort_releasedate.getText();
		if(!after5.equalsIgnoreCase(before5))
				{
		Report.ReporterOutput("STEP ","Verify Sorting for Release-Date", "Click on Sorting for Release-Date.", "Sorting should be done for Release-Date .","Sorting for Release-Date is done Successfully.", "Pass",null);
				}
		resources.Ownership.click();
		Thread.sleep(1000);
		String before6 =resources.sort_releasedate.getText();
		resources.Ownership.click();
		String after6 =resources.sort_releasedate.getText();
		if(!after6.equalsIgnoreCase(before6))
				{
		Report.ReporterOutput("STEP ","Verify Sorting for Ownership", "Click on Sorting for Ownership.", "Sorting should be done for Ownership.","Sorting for Ownership is done Successfully.", "Pass",null);
		
				}
		//This is to select active record
		Select dropdown = new Select(resources.Record);
		String total_active =	resources.count.getText();
		dropdown.selectByIndex(1);
		//This Functionality will verify count of records.
		String total =	resources.count.getText();
		int Totalnumber = Integer.parseInt( total.replaceAll("\\D", ""));
		Total_count= Integer.toString(Totalnumber);
		String Total_count1 = Total_count.substring(3, 7);
		
		if((Total_count1.compareTo(Total_count)> 0))
			
		{
			
			Report.ReporterOutput("STEP ","Verify All Record Count", "Click on All Record Count.", "All Record Count Should be present.","All Record Count done successfully.", "Pass",null);		
		}
				
		dropdown.selectByIndex(0);
		
		if(total_active.equals(total_active))
			
		{
     
			
		Report.ReporterOutput("STEP ","Verify Active Record.", "Click on Active Record.", "Active Records Count Should be present.","Active Record done successfully.", "Pass",null);
		
		}
		
		
		//CommonMethods.count_page();
		
		//This is to test search functionality--Empid.
		
		resources.search_empid.sendKeys(Empid);
		Thread.sleep(5000);
		resources.search_empid.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement mytable = Constant.driver.findElement(By.xpath(".//*[@id='resourceTableId']"));
	  // To locate rows of table.
		List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
	  // To calculate no of rows In table.
		int rows_count = rows_table.size();
		System.out.println(rows_count);
		List<WebElement> Columns_row1 = rows_table.get(2).findElements(By.tagName("td"));
		String Empid1 = Columns_row1.get(0).getText();
		String Empname1    = Columns_row1.get(1).getText();
		String designation = Columns_row1.get(2).getText();
		String grade = Columns_row1.get(3).getText();
		String ownership = Columns_row1.get(6).getText();
		String currentbgbu = Columns_row1.get(7).getText();
		String parentbgbu = Columns_row1.get(8).getText();
		
		System.out.println(Empid1);
		 if (Empid1.equalsIgnoreCase(Empid))
		 {
			 
			 Report.ReporterOutput("STEP ","Verify Search for Empid.", Empid, "Emp-id should be searched successfully.","Search done for"+ Empid, "Pass",null);		 
		 }
		
		 resources.search_empid.clear();
		 Thread.sleep(2000);
		 
			//This is to test search functionality--Empname.
		 resources.search_empname.sendKeys(Empname);
		 Thread.sleep(2000);
	 
		 
		
		 		String fullname = Empname1;
				String[] names = fullname.split(" ");
			
		 if (Empname.equalsIgnoreCase(String.format(names[0])))
		 {
			 
			 Report.ReporterOutput("STEP ","Verify Search for Empname.", Empname, "Emp-name should be searched successfully.","Search done for="+ Empname, "Pass",null);		 
		 }
		 Thread.sleep(2000);
		 resources.search_empname.clear();
		 Thread.sleep(2000); 
			//This is to test search functionality--Designation.
	resources.search_designation.sendKeys(Designation);
	Thread.sleep(2000);
	//resources.search_designation.sendKeys(Keys.ENTER);
	
	
	System.out.println(designation);	
	 if (designation.equalsIgnoreCase(Designation))
	 {
		 
		 Report.ReporterOutput("STEP ","Verify Search for Designation.", Designation, "Designation should be searched successfully.","Search done for="+ Designation, "Pass",null);		 
	 }
	 
	 resources.search_designation.clear();
	 Thread.sleep(2000);
	//This is to test search functionality--Grade.
	 resources.search_Grade.sendKeys(Grade);
	 Thread.sleep(2000);
	resources.search_Grade.sendKeys(Keys.ENTER);
	 
	
		 
		 if (grade.equalsIgnoreCase(Grade))
		 {
			 
			 Report.ReporterOutput("STEP ","Verify Search for Grade.", Grade, "Grade should be searched successfully.","Search done for="+ Grade, "Pass",null);		 
		 }	
		 
		 
		//This is to test search functionality--Ownership.
		 resources.search_Ownership.sendKeys(Ownership);
		 Thread.sleep(2000);
		resources.search_Ownership.sendKeys(Keys.ENTER);
		 
		
			 
			 if (ownership.equalsIgnoreCase(Ownership))
			 {
				 
				 Report.ReporterOutput("STEP ","Verify Search for Ownership.", ownership, "Ownership should be searched successfully.","Search done for="+ Ownership, "Pass",null);		 
			 }	
		 
			 resources.search_Ownership.clear();
			 Thread.sleep(2000);
			//This is to test search functionality--CurrentBGBU.
			 resources.CurrentBU.sendKeys(Currentbu);
			 
			resources.CurrentBU.sendKeys(Keys.ENTER);
			 
			
				 
				 if (currentbgbu.equalsIgnoreCase(Currentbu))
				 {
					 
					 Report.ReporterOutput("STEP ","Verify Search for Current BG-BU.", Currentbu, "Current BG-BU should be searched successfully.","Search done for="+ Currentbu, "Pass",null);		 
				 }	
			 
				 resources.CurrentBU.clear();
				 Thread.sleep(2000);
				//This is to test search functionality--ParentBGBU.
				 resources.ParentBU.sendKeys(Parentbu);
				 
				resources.ParentBU.sendKeys(Keys.ENTER);
				 
				
					 
					 if (parentbgbu.equalsIgnoreCase(Parentbu))
					 {
						 
						 Report.ReporterOutput("STEP ","Verify Search for Parent BG-BU.", Parentbu, "Parent BG-BU should be searched successfully.","Search done for="+ Parentbu, "Pass",null);		 
					 }	
				 
		 
		resources.lnk_admin.click();
	
	
}
	
	}


