package com.yash.RMS.TestAction.ResourceAttribute;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Dashboard.Dashboard;
import com.yash.RMS.POM.ResourceAttribute.ResourceAttribute_Visa;

public class TestAction_Visa {
	
	//************************** Click on Visa Page *******************************
	
	public static void VisaPage() throws Throwable
	{
		// Click on Master data link
				try{
						
					if(Dashboard.lnk_MasterData(Constant.driver).isEnabled())
					{			
						Dashboard.lnk_MasterData(Constant.driver).click();
					Thread.sleep(2000);
					Report.ReporterOutput("Step","Verify Master Data link is enabled.","Master Data link", "Master Data link should be enabled and clicked.", "Master Data link is enabled and clicked.", "Pass", null);
					}
					else
					{
					Report.ReporterOutput("Step","Verify Master Data link is enabled.","Master Data link", "Master Data link should be enabled and clicked.", "Master Data link is not enabled and clicked.", "Fail", null);
					}
					// Click on Resource Attribute link
					if(Dashboard.lnk_ResourceAttribute(Constant.driver).isEnabled())
					{			
						Dashboard.lnk_ResourceAttribute(Constant.driver).click();
						Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Resource Attribute link is enabled.","Resource Attribute link", "Resource Attribute link should be enabled and clicked.", "Resource Attribute link is enabled and clicked.", "Pass", null);
					}	
					else
					{
					Report.ReporterOutput("Step","Verify Resource Attribute link is enabled.","Resource Attribute link", "Resource Attribute link should be enabled and clicked.", "Resource Attribute link is not enabled and clicked.", "Fail", null);
					}
					// Click on Visa link
					if(Dashboard.lnk_VisaPage(Constant.driver).isEnabled())
					{			
						Dashboard.lnk_VisaPage(Constant.driver).click();
						Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Visa link is enabled.","Visa link", "Visa link should be enabled and clicked.", "Visa link is enabled and clicked.", "Pass",null);
					}	
					else
					{
					Report.ReporterOutput("Step","Verify Visa link is enabled.","Visa link", "Visa link should be enabled and clicked.", "Visa link is not enabled and clicked.", "Fail", null);
					}
				}
				catch(Exception e)
				{			e.printStackTrace();
				}
				
				//Check whether Visa page is open or not.
				
				String msg1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1")).getText().trim();
				String msg2= "Visa";
				
				if(msg1.contains(msg2))
				{
					System.out.println("Visa page open");
				}
				else
				System.out.println("Page not found");
}
	
	//This Functionality will verify sorting functionality

		public static void Sorting() throws Throwable 
		{
			try
			{
				
			int i;
			for(i=1;i<=2;i++)
			{
			
			//This Functionality will verify sorting for Project Name functionality
			
			WebElement ColumnName = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/thead/tr/th["+i+"]"));
			
			String projectColumn = ColumnName.getText();
			System.out.println(projectColumn);
			
			ColumnName.click();
			Thread.sleep(1000);
			WebElement FirstColumn = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td["+i+"]"));

			String before2 =FirstColumn.getText();
			ColumnName.click();
			WebElement FirstColumn1 = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td["+i+"]"));

			String after2 =FirstColumn1.getText();
			if(!after2.equalsIgnoreCase(before2))
				{
				Report.ReporterOutput("STEP ","Verify Sorting for "+projectColumn+".", "Click on Sorting for "+projectColumn+".", "Sorting should be done for "+projectColumn+".","Sorting for "+projectColumn+" is done Successfully.", "Pass",null);
				}
			ColumnName.click();
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		}
	
		//This functionality will verify Pagination
		
		public static void Pagination() throws Throwable 
		{
		List<WebElement> pagination = Constant.driver.findElements(By.xpath(".//*[@id='example_wrapper']/div[7]/div[2]/a"));
		for (int i=pagination.size(); i>=1; i--) 
		{
			WebElement element = Constant.driver.findElement(By.xpath(".//*[@id='example_wrapper']/div[7]/div[2]/a["+i+"]"));
			
			String projectColumn = element.getText();
		//	System.out.println(projectColumn);
			element.click();
			Thread.sleep(500);
			Report.ReporterOutput("STEP ","Verify Pagination "+ projectColumn, "Click on Link " + projectColumn, projectColumn+" Link should be visible and Clickable.",projectColumn+" Link is visible and clickable", "Pass",null); 

		}	
		
		}
		//This functionality will verify Count of Records.
		public static void RecordsCount() throws Throwable 
		{
			int rows_count;
			Select dropdown1 = new Select(ResourceAttribute_Visa.dropdown_ShowEntry(Constant.driver));
			List<WebElement> values_drop = dropdown1.getOptions();
			for(int i=0;i<values_drop.size();i++)
			{
				 dropdown1.selectByIndex(i);
				 WebElement option = dropdown1.getFirstSelectedOption();
			//	 System.out.println(option.getText()); 
				 Integer x = Integer.valueOf(option.getText());
			//	 System.out.println(x);
				//This is to verify number of rows and columns
				 WebElement mytable = ResourceAttribute_Visa.visaTableID(Constant.driver);
				  Thread.sleep(500);
				  //To locate rows of table.
				  List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
				  //To calculate no of rows In table.
				  rows_count = rows_table.size()-1;
			//	  System.out.println(rows_count);
				  Thread.sleep(1700);
				  if(x.equals(rows_count))
				  { Report.ReporterOutput("STEP ","Verify Count of Record for entry="+ x,"Count="+ x  , "Entries Should be Correct-" + x,"Active Record Count done successfully.--" + x, "Pass",null);		  
				  }
				 } 	
		}	
		
	//***************** Create New Visa **********************************************
	
	public static void NewVisa(String visaName) throws Throwable
	{ System.out.println("visaName" +visaName);
		//WebDriver driver = new FirefoxDriver();
		
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//		driver.get("http://inidrrmstsrv01:8080/rms/dashboard/userdashboard");
//		Thread.sleep(5000);
		
		//Click on Add new button.
		
		try
		{
			Thread.sleep(9000);
			if(ResourceAttribute_Visa.lnk_AddNew(Constant.driver).isEnabled())
			{		System.out.println(visaName);
				Thread.sleep(3000);	
				ResourceAttribute_Visa.lnk_AddNew(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Add New link is enabled.","Add New link", "Add New link should be enabled and clicked.", "Add New link is enabled and clicked.", "Pass",null);
			}	
			else
			{
			Report.ReporterOutput("Step","Verify Add New link is enabled.","Add New link", "Add New link should be enabled and clicked.", "Add New link is not enabled and clicked.", "Fail", null);
			}	
		
		// enter value in text box
			if(ResourceAttribute_Visa.TextBox_Add(Constant.driver).isEnabled())
			{			
				ResourceAttribute_Visa.TextBox_Add(Constant.driver).sendKeys(visaName);
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Text Box is enabled.",visaName, "Text Box should be enabled and value should be entered.", "Text Box is enabled and value is entered.", "Pass",null);
			}	
			else	
			{
			Report.ReporterOutput("Step","Verify Text Box is enabled.",visaName, "Text Box should be enabled and value should be entered.", "Text Box is not enabled and Value is not entered.", "Fail", null);
			}
		// click on save button
		if(ResourceAttribute_Visa.Button_Save(Constant.driver).isEnabled())
			{			
				ResourceAttribute_Visa.Button_Save(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
			}	
		else
		{
			Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
		}		
	//Click on Add new button.
		
		
		Thread.sleep(4000);
		/*
		if(ResourceAttribute_Visa.lnk_AddNew(Constant.driver).isEnabled())
			{			
				ResourceAttribute_Visa.lnk_AddNew(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Add New button is enabled.","Add New button", "Add New button should be enabled and clicked.", "Add New button is enabled and clicked.", "Pass",null);
			}	
		else	{
			Report.ReporterOutput("Step","Verify Add New button is enabled.","Add New button", "Add New button should be enabled and clicked.", "Add New button is not enabled and clicked.", "Fail", null);
		}			
		// enter value in text box
		if(ResourceAttribute_Visa.TextBox_Add(Constant.driver).isEnabled())
		{			
			ResourceAttribute_Visa.TextBox_Add(Constant.driver).sendKeys(visaName);
			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Text Box is enabled.",visaName, "Text Box should be enabled and value should be entered.", "Text Box is enabled and value is entered.", "Pass",null);
		}	
		else		
		{
			Report.ReporterOutput("Step","Verify Text Box is enabled.",visaName, "Text Box should be enabled and value should be entered.", "Text Box is not enabled and Value is not entered.", "Fail", null);
		}
	// click on cancel button
			if(ResourceAttribute_Visa.Button_Cancel(Constant.driver).isEnabled())
					{			
						ResourceAttribute_Visa.Button_Cancel(Constant.driver).click();
						Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Cancel Link is enabled.","Cancel Link", "Cancel Link should be enabled and clicked.", "Cancel Link is enabled and clicked.", "Pass",null);
					}	
			else{
					Report.ReporterOutput("Step","Verify Cancel Link is enabled.","Cancel Link", "Cancel Link should be enabled and clicked.", "Cancel Link is not enabled and clicked.", "Fail", null);
				}				*/
				/*Report.ReporterOutput("STEP","Verify new Visa "+visaName+" has been created.","New Visa creation","New Visa "+visaName+" should be created.","New Visa "+visaName+" has been created.","Pass",null);*/		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		}

	//************ to Search and verify created Visa **************************************
	
	public static void SearchVisa(String visaName) throws Throwable
	{
	try
	{Thread.sleep(18000);
		ResourceAttribute_Visa.TextBox_Search(Constant.driver).clear();
		ResourceAttribute_Visa.TextBox_Search(Constant.driver).sendKeys(visaName);
		


		String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

		String msgB= visaName;
		System.out.println(msgA);
		Thread.sleep(2000);

		if(msgA.contains(msgB))
		{
			Report.ReporterOutput("STEP","Verify new Visa "+visaName+" should be searched and verified.",visaName,"New Visa "+visaName+" should be searched and verification.","New Visa "+visaName+" searched and verified.","Pass",null);
		}

		Thread.sleep(3000);
	}
	catch(Exception e2)
	{
		Report.ReporterOutput("STEP","Verify new Visa "+visaName+" should be searched and verified.",visaName,"New Visa "+visaName+" should be searched and verification.","New Visa "+visaName+" not searched and verified.","Fail",null);
	}

	}
	
	//***************** Edit Visa **********************************************
	
	public static void EditVisa(String visaName, String editName) throws Throwable
	{
	
		// enter value in Search text box
		
		try
		{
			Thread.sleep(3000);
			if(ResourceAttribute_Visa.TextBox_Search(Constant.driver).isEnabled())
			{	Thread.sleep(3000);
				ResourceAttribute_Visa.TextBox_Search(Constant.driver).clear();
				ResourceAttribute_Visa.TextBox_Search(Constant.driver).sendKeys(visaName);
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Search text box is enabled.",visaName, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
			}
			else{
			Report.ReporterOutput("Step","Verify Search text box is enabled.",visaName, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
		}				
	// click on Edit button
			if(ResourceAttribute_Visa.lnk_edit(Constant.driver).isEnabled())
			{			
				ResourceAttribute_Visa.lnk_edit(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Edit Link is enabled.","Edit Link", "Edit Link should be enabled and clicked.", "Edit Link is enabled and clicked.", "Pass",null);
			}	
			else{
			Report.ReporterOutput("Step","Verify Edit Link is enabled.","Edit Link", "Edit Link should be enabled and clicked.", "Edit Link is not enabled and clicked.", "Fail", null);
			}		
		// Enter value in text box
			if(ResourceAttribute_Visa.TextBox_Edit(Constant.driver).isEnabled())
					{		
						ResourceAttribute_Visa.TextBox_Edit(Constant.driver).clear();
						ResourceAttribute_Visa.TextBox_Edit(Constant.driver).sendKeys(editName);
						Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Search text box is enabled.",editName, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
					}	
			else	{
					Report.ReporterOutput("Step","Verify Search text box is enabled.",editName, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
				}				
			// click on Save button
			if(ResourceAttribute_Visa.Button_EditSave(Constant.driver).isEnabled())
					{			
						ResourceAttribute_Visa.Button_EditSave(Constant.driver).click();
						Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
					}	
			else	{
					Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
				}
			Thread.sleep(17000);
			ResourceAttribute_Visa.TextBox_Search(Constant.driver).clear();
			ResourceAttribute_Visa.TextBox_Search(Constant.driver).sendKeys(visaName);
			Thread.sleep(5000);


			String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

			String msgB= visaName;
			System.out.println(msgA);
			Thread.sleep(2000);

			if(msgA.contains(msgB))
			{
				Report.ReporterOutput("STEP","Verify new Visa "+visaName+" should be searched and verified.",visaName,"New Visa "+visaName+" should be searched and verification.","New Visa "+visaName+" searched and verified.","Pass",null);
			}

			
			
			
			Report.ReporterOutput("STEP","Verify Visa "+visaName+" has been updated with "+editName+".",editName,"Visa "+visaName+" should be updated with "+editName+".","Visa "+visaName+" has been updated with "+editName+".","Pass",null);		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
}
	//***************** Delete Visa **********************************************
		
	public static void DeleteVisa(String editName) throws Throwable
	{
	     // enter value in Search text box
				try
				{Thread.sleep(3000);
					if(ResourceAttribute_Visa.TextBox_Search(Constant.driver).isEnabled())
					{		Thread.sleep(3000);
						ResourceAttribute_Visa.TextBox_Search(Constant.driver).clear();
						ResourceAttribute_Visa.TextBox_Search(Constant.driver).sendKeys(editName);
						Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Search text box is enabled.",editName, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
					}	
					else{
					Report.ReporterOutput("Step","Verify Search text box is enabled.",editName, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
					}				
	// click on Delete button
			if(ResourceAttribute_Visa.lnk_delete(Constant.driver).isEnabled())
			{			
				ResourceAttribute_Visa.lnk_delete(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is enabled and clicked.", "Pass",null);
			}	
			else{
			Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is not enabled and clicked.", "Fail", null);
		}		
		// Click on Cancel button of Pop up.
			if(ResourceAttribute_Visa.lnk_DeleteCancel(Constant.driver).isEnabled())
					{			
						ResourceAttribute_Visa.lnk_DeleteCancel(Constant.driver).click();
						Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Cancel button of Pop up is enabled.","Cancel button of Pop up", "Cancel button of Pop up should be enabled and clicked.", "Cancel button of Pop up is enabled and clicked.", "Pass",null);
					}	
			else			
			{
					Report.ReporterOutput("Step","Verify Cancel button of Pop up is enabled.","Cancel button of Pop up", "Cancel button of Pop up should be enabled and clicked.", "Cancel button of Pop up is not enabled and clicked.", "Fail", null);
			}		
		// click on Delete button
			if(ResourceAttribute_Visa.lnk_delete(Constant.driver).isEnabled())
					{			
						ResourceAttribute_Visa.lnk_delete(Constant.driver).click();
						Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is enabled and clicked.", "Pass",null);
					}	
			else		{
					Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is not enabled and clicked.", "Fail", null);
				}		
		// Click on OK button of Pop up.
			if(ResourceAttribute_Visa.lnk_DeleteOk(Constant.driver).isEnabled())
					{			
						ResourceAttribute_Visa.lnk_DeleteOk(Constant.driver).click();
						Thread.sleep(17000);
						Report.ReporterOutput("Step","Verify OK button of Pop up is enabled.",editName, "OK button of Pop up should be enabled and clicked.", "OK button of Pop up is enabled and clicked.", "Pass",null);
						ResourceAttribute_Visa.TextBox_Search(Constant.driver).clear();
					}	
			else	{
							Report.ReporterOutput("Step","Verify OK button of Pop up is enabled.",editName, "OK button of Pop up should be enabled and clicked.", "OK button of Pop up is not enabled and clicked.", "Fail", null);
					}		

			            Thread.sleep(15000);
						ResourceAttribute_Visa.TextBox_Search(Constant.driver).clear();
						ResourceAttribute_Visa.TextBox_Search(Constant.driver).sendKeys(editName);
						Thread.sleep(5000);


						String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr/td")).getText().trim();

						String msgB= "No matching records found";
						System.out.println(msgA);
						Thread.sleep(2000);

						if(msgA.contains(msgB))
						{
							Report.ReporterOutput("STEP","Verify Visa "+editName+" has been Deleted.",editName,"Visa "+editName+" should be deleted.","Visa "+editName+" has been deleted.","Pass",null);		
						}

						
						// to click on Home page

              if(Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).isDisplayed());                                    
				{              
			     Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).click();
			     Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is navigated to RMS      Home page","Pass",null);
				}
			}
				
	catch (Exception e) {
		e.printStackTrace();
	}
	}		

}
	
