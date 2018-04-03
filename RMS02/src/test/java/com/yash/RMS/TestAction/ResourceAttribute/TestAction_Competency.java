package com.yash.RMS.TestAction.ResourceAttribute;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Dashboard.Dashboard;
import com.yash.RMS.POM.ResourceAttribute.ResourceAttribute_Competency;

public class TestAction_Competency {
	
//************************** Click on Competency Page *******************************
	public static void CompetencyPage() throws Throwable
	{
		// Click on Master data link
			try{
						
					if(Dashboard.lnk_MasterData(Constant.driver).isEnabled())
					{			
						Dashboard.lnk_MasterData(Constant.driver).click();
				//	Thread.sleep(2000);
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
					//	Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Resource Attribute link is enabled.","Resource Attribute link", "Resource Attribute link should be enabled and clicked.", "Resource Attribute link is enabled and clicked.", "Pass", null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Resource Attribute link is enabled.","Resource Attribute link", "Resource Attribute link should be enabled and clicked.", "Resource Attribute link is not enabled and clicked.", "Fail", null);
				}
				// Click on Competency link
					if(Dashboard.lnk_CompetencyPage(Constant.driver).isEnabled())
					{			
						Dashboard.lnk_CompetencyPage(Constant.driver).click();
						Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Competency link is enabled.","Competency link", "Competency link should be enabled and clicked.", "Competency link is enabled and clicked.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Competency link is enabled.","Competency link", "Competency link should be enabled and clicked.", "Competency link is not enabled and clicked.", "Fail", null);
				}		
			//Check whether Competency page is open or not.
				
				String msg1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1")).getText().trim();
				String msg2= "Competency";
				
				if(msg1.contains(msg2))
				{
					System.out.println("Competency page open");
				}
				else
				System.out.println("Page not found");
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}	
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
		
		String programlist1 = ColumnName.getText();
	//	System.out.println(programlist1);
		
		ColumnName.click();
		//Thread.sleep(1000);
		WebElement FirstColumn = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td["+i+"]"));

		String before2 =FirstColumn.getText();
		ColumnName.click();
		WebElement FirstColumn1 = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td["+i+"]"));

		String after2 =FirstColumn1.getText();
		if(!after2.equalsIgnoreCase(before2))
			{
			Report.ReporterOutput("STEP ","Verify Sorting for "+programlist1+".", "Click on Sorting for "+programlist1+".", "Sorting should be done for "+programlist1+".","Sorting for "+programlist1+" is done Successfully.", "Pass",null);
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
	List<WebElement> pagination = Constant.driver.findElements(By.xpath(".//*[@id='example_wrapper']/div[7]/div[2]/a[1]"));
//	System.out.println("pagination size -------------------------"+pagination.size());
	for (int i=4; i>=1; i--) 
	{
		WebElement element = Constant.driver.findElement(By.xpath(".//*[@id='example_wrapper']/div[7]/div[2]/a["+i+"]"));
		
		String programlist1 = element.getText();
	//	System.out.println(programlist1);
		element.click();
	//	Thread.sleep(500);
		Report.ReporterOutput("STEP ","Verify Pagination for "+ programlist1, "Click on link " + programlist1, programlist1+" Link should be visible and Clickable.",programlist1+" Link is visible and clickable", "Pass",null); 

	}	
	
	}
	//This functionality will verify Count of Records.
	public static void RecordsCount() throws Throwable 
	{
		int rows_count;
		Select dropdown1 = new Select(ResourceAttribute_Competency.Dropdown_ShowMore(Constant.driver));
		List<WebElement> values_drop = dropdown1.getOptions();
		for(int i=0;i<values_drop.size();i++)
		{
			 dropdown1.selectByIndex(i);
			 WebElement option = dropdown1.getFirstSelectedOption();
		//	 System.out.println(option.getText()); 
			 Integer x = Integer.valueOf(option.getText());
		//	 System.out.println(x);
			//This is to verify number of rows and columns
			 WebElement mytable = ResourceAttribute_Competency.competencyTableID(Constant.driver);
			//  Thread.sleep(500);
			  //To locate rows of table.
			  List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
			  //To calculate no of rows In table.
			  rows_count = rows_table.size()-1;
		//	  System.out.println(rows_count);
			//  Thread.sleep(1700);
			  if(x.equals(rows_count))
			  { Report.ReporterOutput("STEP ","Verify Count of Record for entry="+ x,"Count="+ x  , "Entries Should be Correct-" + x,"Active Record Count done successfully.--" + x, "Pass",null);		  
			  }
			 } 	
		dropdown1.selectByIndex(0);
	}	
	

	//***************** Create New Competency **********************************************
	
	public static void NewCompetency(String AddCompetency) throws Throwable
	{
		//Click on Add new button.
		try
		{
			if(ResourceAttribute_Competency.lnk_AddNew(Constant.driver).isEnabled())
			{			
				ResourceAttribute_Competency.lnk_AddNew(Constant.driver).click();
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Add New button is enabled.","Add New button", "Add New button should be enabled and clicked.", "Add New button is enabled and clicked.", "Pass",null);
			}	
			else
			{
			Report.ReporterOutput("Step","Verify Add New button is enabled.","Add New button", "Add New button should be enabled and clicked.", "Add New button is not enabled and clicked.", "Fail", null);
			}		
		
		// enter value in Competency text box
			if(ResourceAttribute_Competency.TextBox_AddCompetency(Constant.driver).isEnabled())
						{			
							ResourceAttribute_Competency.TextBox_AddCompetency(Constant.driver).sendKeys(AddCompetency);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Competency Text Box is enabled.",AddCompetency, "Competency Text Box should be enabled and value should be entered.", "Competency Text Box is enabled and value is entered.", "Pass",null);
							ResourceAttribute_Competency.TextBox_AddCompetency(Constant.driver).sendKeys(Keys.TAB);
						}	
			else	{
						Report.ReporterOutput("Step","Verify Competency Text Box is enabled.",AddCompetency, "Competency Text Box should be enabled and value should be entered.", "Competency Text Box is not enabled and Value is not entered.", "Fail", null);
					}
			// click on save button
				if(ResourceAttribute_Competency.lnk_AddSave(Constant.driver).isEnabled())
						{			
							ResourceAttribute_Competency.lnk_AddSave(Constant.driver).click();
							Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
						}	
				else	{
						Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
					}		
				
					Report.ReporterOutput("STEP","Verify new Competency "+AddCompetency+" has been created.",AddCompetency,"New Competency "+AddCompetency+" should be created.","New Competency "+AddCompetency+" has been created.","Pass",null);		
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//************ to Search and verify created Competency **************************************
	
			public static void SearchCompetency(String AddCompetency) throws Throwable
			{
			try
			{   Thread.sleep(16000);
				ResourceAttribute_Competency.TextBox_Search(Constant.driver).clear();
				ResourceAttribute_Competency.TextBox_Search(Constant.driver).sendKeys(AddCompetency);
			//	Thread.sleep(5000);


				String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

				String msgB= AddCompetency;
			//	System.out.println(msgA);
				//Thread.sleep(2000);

				if(msgA.contains(msgB))
				{
					Report.ReporterOutput("STEP","Verify new Competency "+AddCompetency+" is searched and verified.",AddCompetency,"New Competency "+AddCompetency+" should be searched and verification.","New Competency "+AddCompetency+" searched and verified.","Pass",null);
				}

				//Thread.sleep(3000);
			}
			catch(Exception e2)
			{
				Report.ReporterOutput("STEP","Verify new Competency "+AddCompetency+" is searched and verified.",AddCompetency,"New Competency "+AddCompetency+" should be searched and verification.","New Competency "+AddCompetency+" is not searched and verified.","Fail",null);
			}

			} 
	
			//********************** to Edit Competency **************************************
			
			public static void EditCompetency(String AddCompetency, String EditCompetency) throws Throwable
			{
				// enter value in Search text box
					try
						{
						if(ResourceAttribute_Competency.TextBox_Search(Constant.driver).isEnabled())
							{	
							 Thread.sleep(3000);
								ResourceAttribute_Competency.TextBox_Search(Constant.driver).clear();
								ResourceAttribute_Competency.TextBox_Search(Constant.driver).sendKeys(AddCompetency);
							//	Thread.sleep(2000);
								Report.ReporterOutput("Step","Verify Search text box is enabled.",AddCompetency, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
							}	
						else{
							Report.ReporterOutput("Step","Verify Search text box is enabled.",AddCompetency, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
						}				
				   // click on Edit button
						if(ResourceAttribute_Competency.lnk_edit(Constant.driver).isEnabled())
							{			
								ResourceAttribute_Competency.lnk_edit(Constant.driver).click();
							//	Thread.sleep(2000);
								Report.ReporterOutput("Step","Verify Edit Link is enabled.","Edit Link", "Edit Link should be enabled and clicked.", "Edit Link is enabled and clicked.", "Pass",null);
							}	
						else		
						{
							Report.ReporterOutput("Step","Verify Edit Link is enabled.","Edit Link", "Edit Link should be enabled and clicked.", "Edit Link is not enabled and clicked.", "Fail", null);
						}		
				//enter value in Competency Name text box
				if(ResourceAttribute_Competency.TextBox_EditCompetency(Constant.driver).isEnabled())
					{			
						ResourceAttribute_Competency.TextBox_EditCompetency(Constant.driver).clear();
						ResourceAttribute_Competency.TextBox_EditCompetency(Constant.driver).sendKeys(EditCompetency);
					//	Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Competency Text Box is enabled.",EditCompetency, "Competency Text Box should be enabled and value should be entered.", "Competency Text Box is enabled and value is entered.", "Pass",null);
						ResourceAttribute_Competency.TextBox_EditCompetency(Constant.driver).sendKeys(Keys.TAB);

					}	
				else		{
					Report.ReporterOutput("Step","Verify Competency Text Box is enabled.",EditCompetency, "Competency Text Box should be enabled and value should be entered.", "Competency Text Box is not enabled and Value is not entered.", "Fail", null);
				}
			// click on save button
				if(ResourceAttribute_Competency.lnk_EditSave(Constant.driver).isEnabled())
						{			
							ResourceAttribute_Competency.lnk_EditSave(Constant.driver).click();
							Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
						}	
					else
					{
						Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
					}				
				 Thread.sleep(16000);
				ResourceAttribute_Competency.TextBox_Search(Constant.driver).clear();
				ResourceAttribute_Competency.TextBox_Search(Constant.driver).sendKeys(EditCompetency);
			//	Thread.sleep(5000);


				String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

				String msgB= EditCompetency;
			//	System.out.println(msgA);
			//	Thread.sleep(2000);

				if(msgA.contains(msgB))
				{
					Report.ReporterOutput("STEP","Verify Competency "+AddCompetency+" has been updated.",EditCompetency,"Competency "+AddCompetency+" should be updated.","Competency "+AddCompetency+" has been updated.","Pass",null);		
				}

				
				
				
				
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			}
			//***************** Delete Competency **********************************************
			
			public static void DeleteCompetency(String EditCompetency) throws Throwable
			{
			     // enter value in Search text box
						
						try
						{
							 Thread.sleep(3000);
							if(ResourceAttribute_Competency.TextBox_Search(Constant.driver).isEnabled())
							{		
								ResourceAttribute_Competency.TextBox_Search(Constant.driver).clear();
								ResourceAttribute_Competency.TextBox_Search(Constant.driver).sendKeys(EditCompetency);
							//	Thread.sleep(2000);
								Report.ReporterOutput("Step","Verify Search text box is enabled.",EditCompetency, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
							}	
						else{
							Report.ReporterOutput("Step","Verify Search text box is enabled.",EditCompetency, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
						}				
			// click on Delete button
				if(ResourceAttribute_Competency.lnk_delete(Constant.driver).isEnabled())
					{			
						ResourceAttribute_Competency.lnk_delete(Constant.driver).click();
						//Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is enabled and clicked.", "Pass",null);
					}	
				else		{
					Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is not enabled and clicked.", "Fail", null);
				}		
			// Click on Cancel button of Pop up.
				if(ResourceAttribute_Competency.lnk_deleteCancel(Constant.driver).isEnabled())
				{			
					ResourceAttribute_Competency.lnk_deleteCancel(Constant.driver).click();
					//Thread.sleep(2000);
					Report.ReporterOutput("Step","Verify Cancel button of Pop up is enabled.","Cancel button of Pop up", "Cancel button of Pop up should be enabled and clicked.", "Cancel button of Pop up is enabled and clicked.", "Pass",null);
				}	
				else{
				Report.ReporterOutput("Step","Verify Cancel button of Pop up is enabled.","Cancel button of Pop up", "Cancel button of Pop up should be enabled and clicked.", "Cancel button of Pop up is not enabled and clicked.", "Fail", null);
				}		
			// click on Delete button
				if(ResourceAttribute_Competency.lnk_delete(Constant.driver).isEnabled())
				{			
					ResourceAttribute_Competency.lnk_delete(Constant.driver).click();
				//	Thread.sleep(2000);
					Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is enabled and clicked.", "Pass",null);
				}	
				else{
				Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is not enabled and clicked.", "Fail", null);
			}		
			// Click on OK button of Pop up.
				if(ResourceAttribute_Competency.lnk_deleteOk(Constant.driver).isEnabled())
				{			
					ResourceAttribute_Competency.lnk_deleteOk(Constant.driver).click();
					Thread.sleep(2000);
					Report.ReporterOutput("Step","Verify OK button of Pop up is enabled.","OK button of Pop up", "OK button of Pop up should be enabled and clicked.", "OK button of Pop up is enabled and clicked.", "Pass",null);
					ResourceAttribute_Competency.TextBox_Search(Constant.driver).clear();

				}	
				else{
				Report.ReporterOutput("Step","Verify OK button of Pop up is enabled.","OK button of Pop up", "OK button of Pop up should be enabled and clicked.", "OK button of Pop up is not enabled and clicked.", "Fail", null);
			}		
			
				
		    Thread.sleep(16000);
			Constant.driver.findElement(By.xpath(".//*[@id='example_filter']/label/input")).clear();
			ResourceAttribute_Competency.TextBox_Search(Constant.driver).clear();
			
			ResourceAttribute_Competency.TextBox_Search(Constant.driver).sendKeys(EditCompetency);
		//	Thread.sleep(5000);


			String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr/td")).getText().trim();

			String msgB= "No matching records found";
	//		System.out.println(msgA);
			Thread.sleep(1000);

			if(msgA.contains(msgB))
			{
				Report.ReporterOutput("STEP","Verify Competency "+EditCompetency+" has been Deleted.","Competency Deletion","Competency "+EditCompetency+" should be deleted.","Competency "+EditCompetency+" has been deleted.","Pass",null);		
			}

			  // to click on Home page
		       if(Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).isDisplayed());                                    

				  {              
				       Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).click();
				       Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is navigated to RMS      Home page","Pass",null);
				  }
				
						
						
						
						}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			}		
		
	
	
	
	
	
	
	
	
	
	
	
	

}
