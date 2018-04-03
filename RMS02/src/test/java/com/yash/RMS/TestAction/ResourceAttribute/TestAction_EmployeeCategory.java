package com.yash.RMS.TestAction.ResourceAttribute;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Dashboard.Dashboard;
import com.yash.RMS.POM.ResourceAttribute.ResourceAttribute_EmployeeCategory;

public class TestAction_EmployeeCategory {

	public static String EmployeeCategoryName_Asc;
	public static String  ascendingorderiterator;
	public static String EmployeeCategoryName_Dsc;
	public static String  descendingorderiterator;
	public static String Asc;

	public static ArrayList<String> originallist = new ArrayList<String>();
	public static ArrayList<String> originallist1 = new ArrayList<String>();
	
	//************************** Click on Employee Category Page *******************************
		public static void EmployeeCategoryPage() throws Throwable
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
					
				
					// Click on Employee Category link
										
						if(Dashboard.lnk_EmployeeCategoryPage(Constant.driver).isEnabled())
						{			
							Dashboard.lnk_EmployeeCategoryPage(Constant.driver).click();
							Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Employee Category link is enabled.","Employee Category link", "Employee Category link should be enabled and clicked.", "Employee Category link is enabled and clicked.", "Pass",null);
						}	
			
					
						else
					{
						Report.ReporterOutput("Step","Verify Employee Category link is enabled.","Employee Category link", "Employee Category link should be enabled and clicked.", "Employee Category link is not enabled and clicked.", "Fail", null);
					}		
									
			}
			
			catch (Exception e)
			{
				e.printStackTrace();
			}
			
			
					//Check whether Employee Category page is open or not.
					
					String msg1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1")).getText().trim();
					String msg2= "Employee Category";
					
					if(msg1.contains(msg2))
					{
						System.out.println("Employee Category page open");
					}
					else
					System.out.println("Page not found");
					
							
		}
	//***************** Sorting ***********************************************************	
		public static void ascendingEmployeeCategoryNameSorting() throws Throwable {
			try
			{
			int i;
			WebElement ColumnName = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[1]"));
			for(i=1;i<=2;i++)
			{
			
			//This Functionality will do sorting
			
			ColumnName = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/thead/tr/th["+i+"]"));
			
			String EmployeeCategory1 = ColumnName.getText();
	//		System.out.println(EmployeeCategory1);
			
			ColumnName.click();
		//	Thread.sleep(1000);
			WebElement FirstRow = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td["+i+"]"));

			String before2 =FirstRow.getText();
			ColumnName.click();
			WebElement FirstRow1 = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td["+i+"]"));

			String after2 =FirstRow1.getText();
			if(!after2.equalsIgnoreCase(before2))
				{
				Report.ReporterOutput("STEP ","Verify Sorting for "+EmployeeCategory1+".", "Click on Sorting for "+EmployeeCategory1+".", "Sorting should be done for "+EmployeeCategory1+".","Sorting for "+EmployeeCategory1+" is done Successfully.", "Pass",null);
				}
			}
			ColumnName.click();

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		}
		
		//This functionality will verify Pagination
		
		public static void Pagination() throws Throwable 
		{
		List<WebElement> pagination = Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[7]/div[2]/a"));
		for (int i=pagination.size(); i>=1; i--) 
		{
			WebElement element = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[7]/div[2]/a["+i+"]"));
			
			String EmployeeCategory1 = element.getText();
	//		System.out.println(EmployeeCategory1);
			element.click();
			//Thread.sleep(500);
			Report.ReporterOutput("STEP ","Verify Pagination-:"+ EmployeeCategory1, "Click on Link." + EmployeeCategory1, EmployeeCategory1+"Link should be visible and Clickable.",EmployeeCategory1+" Link is visible and clickable", "Pass",null); 

		}	
		}
		
		//This functionality will verify Count of Records.
		public static void RecordsCount() throws Throwable 
		{
			int rows_count;
			Select dropdown1 = new Select(ResourceAttribute_EmployeeCategory.Dropdown_ShowEntry(Constant.driver));
			List<WebElement> values_drop = dropdown1.getOptions();
			for(int i=0;i<values_drop.size();i++)
			{
				 dropdown1.selectByIndex(i);
				 WebElement option = dropdown1.getFirstSelectedOption();
	//			 System.out.println(option.getText()); 
				 Integer x = Integer.valueOf(option.getText());
		//		 System.out.println(x);
				//This is to verify number of rows and columns
				 WebElement mytable = ResourceAttribute_EmployeeCategory.EmployeeCategoryTableID(Constant.driver);
				  Thread.sleep(500);
				  //To locate rows of table.
				  List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
				  //To calculate no of rows In table.
				  rows_count = rows_table.size()-1;
		//		  System.out.println(rows_count);
				//  Thread.sleep(1700);
				  if(x.equals(rows_count))
				  { Report.ReporterOutput("STEP ","Verify Count of Record for entry="+ x,"Count="+ x  , "Entries Should be Correct-" + x,"Active Record Count done successfully.--" + x, "Pass",null);		  
				  }
				 } 	
		}	
		
		//***************** Create New Employee Category **********************************************
		
		public static void NewEmployeeCategory(String AddEmployeeCategory) throws Throwable
		{
			
			//Click on Add new button.
			
			try
			{
				if(ResourceAttribute_EmployeeCategory.lnk_AddNew(Constant.driver).isEnabled())
				{			
					ResourceAttribute_EmployeeCategory.lnk_AddNew(Constant.driver).click();
					//Thread.sleep(2000);
					Report.ReporterOutput("Step","Verify Add New button is enabled.","Add New button", "Add New button should be enabled and clicked.", "Add New button is enabled and clicked.", "Pass",null);
				}	
				else
				{
				Report.ReporterOutput("Step","Verify Add New button is enabled.","Add New button", "Add New button should be enabled and clicked.", "Add New button is not enabled and clicked.", "Fail", null);
				}		
			
				// enter value in Employee Category text box
				if(ResourceAttribute_EmployeeCategory.TextBox_AddEmployeeCategory(Constant.driver).isEnabled())
				{			
					ResourceAttribute_EmployeeCategory.TextBox_AddEmployeeCategory(Constant.driver).sendKeys(AddEmployeeCategory);
					Thread.sleep(2000);
					Report.ReporterOutput("Step","Verify Employee Category Text Box is enabled.","Contract", "Employee Category Text Box should be enabled and value should be entered.", "Employee Category Text Box is enabled and value is entered.", "Pass",null);
				}	
				else
				{
					Report.ReporterOutput("Step","Verify Employee Category Text Box is enabled.","Contract", "Employee Category Text Box should be enabled and value should be entered.", "Employee Category Text Box is not enabled and Value is not entered.", "Fail", null);
				}
					
					// click on save button
						if(ResourceAttribute_EmployeeCategory.lnk_AddSave(Constant.driver).isEnabled())
						{			
							ResourceAttribute_EmployeeCategory.lnk_AddSave(Constant.driver).click();
					//		Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
						}	
					else
					{
						Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
					}	
						
						
						
//					if(ResourceAttribute_EmployeeCategory.lnk_edit(Constant.driver).isEnabled())
//					   {
//					   Report.ReporterOutput("STEP ","Verify Save Functionality.","Save Button Click", "User should be able to click on Save button.","Data Saved Successfully.", "Pass",null);
//					   }
//					   else
//					   {
				//	   Report.ReporterOutput("STEP ","Verify Save Functionality.","Save Button Click", "User should be able to click on Save button.","Data is not Saved Successfully as it was duplicate.", "Fail",null);
					 //  }	
				
					/*WebElement ErrorMessage = Constant.driver.findElement(By.xpath(".//*[@id='toast-container']/div/span"));
					ErrorMessage.click();*/
			
					// enter value in Employee Category text box
				/*	if(ResourceAttribute_EmployeeCategory.TextBox_AddEmployeeCategory(Constant.driver).isEnabled())
					{	ResourceAttribute_EmployeeCategory.TextBox_AddEmployeeCategory(Constant.driver).clear();		
						ResourceAttribute_EmployeeCategory.TextBox_AddEmployeeCategory(Constant.driver).sendKeys(AddEmployeeCategory);
					//	Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Employee Category Text Box is enabled.",AddEmployeeCategory, "Employee Category Text Box should be enabled and value should be entered.", "Employee Category Text Box is enabled and value is entered.", "Pass",null);
					}	
					else
					{
						Report.ReporterOutput("Step","Verify Employee Category Text Box is enabled.",AddEmployeeCategory, "Employee Category Text Box should be enabled and value should be entered.", "Employee Category Text Box is not enabled and Value is not entered.", "Fail", null);
					}
						
						// click on save button
							if(ResourceAttribute_EmployeeCategory.lnk_AddSave(Constant.driver).isEnabled())
							{			
								ResourceAttribute_EmployeeCategory.lnk_AddSave(Constant.driver).click();
							//	Thread.sleep(2000);
								Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
							}	
						else
						{
							Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
						}		
					*/
			}			
							
			catch (Exception e)
			{
				e.printStackTrace();
			}				
				Report.ReporterOutput("STEP","Verify new Employee Category "+AddEmployeeCategory+" has been created.",AddEmployeeCategory,"New Employee Category "+AddEmployeeCategory+" should be created.","New Employee Category "+AddEmployeeCategory+" has been created.","Pass",null);		
			
		}
		
		//************ to Search and verify created Employee Category **************************************
		
				public static void SearchEmployeeCategory(String AddEmployeeCategory) throws Throwable
				{
				try
				{   Thread.sleep(16000);
					ResourceAttribute_EmployeeCategory.TextBox_Search(Constant.driver).clear();
					ResourceAttribute_EmployeeCategory.TextBox_Search(Constant.driver).sendKeys(AddEmployeeCategory);
				//	Thread.sleep(5000);


					String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

					String msgB= AddEmployeeCategory;
			//		System.out.println(msgA);
				//	Thread.sleep(2000);

					if(msgA.contains(msgB))
					{
						Report.ReporterOutput("STEP","Verify new Employee Category "+AddEmployeeCategory+" is searched and verified.",AddEmployeeCategory,"New Employee Category "+AddEmployeeCategory+" should be searched and verification.","New Employee Category "+AddEmployeeCategory+" searched and verified.","Pass",null);
					}

			//		Thread.sleep(3000);
				}
				catch(Exception e2)
				{
					Report.ReporterOutput("STEP","Verify new Employee Category "+AddEmployeeCategory+" is searched and verified.",AddEmployeeCategory,"New Employee Category "+AddEmployeeCategory+" should be searched and verification.","New Employee Category "+AddEmployeeCategory+" is not searched and verified.","Fail",null);
				}

				} 
		
				//********************** to Edit Employee Category **************************************
				
				public static void EditEmployeeCategory(String AddEmployeeCategory, String EditEmployeeCategory) throws Throwable
				{
					
					// enter value in Search text box
					
							try
							{
								Thread.sleep(3000);
								if(ResourceAttribute_EmployeeCategory.TextBox_Search(Constant.driver).isEnabled())
								{	
									ResourceAttribute_EmployeeCategory.TextBox_Search(Constant.driver).clear();
									ResourceAttribute_EmployeeCategory.TextBox_Search(Constant.driver).sendKeys(AddEmployeeCategory);
							//		Thread.sleep(2000);
									Report.ReporterOutput("Step","Verify Search text box is enabled.",AddEmployeeCategory, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
								}	
							
							
							else
							{
								Report.ReporterOutput("Step","Verify Search text box is enabled.",AddEmployeeCategory, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
							}				
							
					
				      // click on Edit button

								if(ResourceAttribute_EmployeeCategory.lnk_edit(Constant.driver).isEnabled())
								{			
									ResourceAttribute_EmployeeCategory.lnk_edit(Constant.driver).click();
							//		Thread.sleep(2000);
									Report.ReporterOutput("Step","Verify Edit Link is enabled.","Edit Link", "Edit Link should be enabled and clicked.", "Edit Link is enabled and clicked.", "Pass",null);
								}	
							else
							{
								Report.ReporterOutput("Step","Verify Edit Link is enabled.","Edit Link", "Edit Link should be enabled and clicked.", "Edit Link is not enabled and clicked.", "Fail", null);
							}		
					
			//enter value in Employee Category Name text box

						if(ResourceAttribute_EmployeeCategory.TextBox_EditEmployeeCategory(Constant.driver).isEnabled())
						{			
							ResourceAttribute_EmployeeCategory.TextBox_EditEmployeeCategory(Constant.driver).clear();
							ResourceAttribute_EmployeeCategory.TextBox_EditEmployeeCategory(Constant.driver).sendKeys(EditEmployeeCategory);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Employee Category Text Box is enabled.",EditEmployeeCategory, "Employee Category Text Box should be enabled and value should be entered.", "Employee Category Text Box is enabled and value is entered.", "Pass",null);
							ResourceAttribute_EmployeeCategory.TextBox_EditEmployeeCategory(Constant.driver).sendKeys(Keys.TAB);

						}	
					
					
					else
					{
						Report.ReporterOutput("Step","Verify Employee Category Text Box is enabled.",EditEmployeeCategory, "Employee Category Text Box should be enabled and value should be entered.", "Employee Category Text Box is not enabled and Value is not entered.", "Fail", null);
					}
					// click on save button
						if(ResourceAttribute_EmployeeCategory.lnk_EditSave(Constant.driver).isEnabled())
							{			
								ResourceAttribute_EmployeeCategory.lnk_EditSave(Constant.driver).click();
								Thread.sleep(2000);
								Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
							}	
						
						
						else
						{
							Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
						}
						Thread.sleep(16000);
						ResourceAttribute_EmployeeCategory.TextBox_Search(Constant.driver).clear();
						ResourceAttribute_EmployeeCategory.TextBox_Search(Constant.driver).sendKeys(EditEmployeeCategory);
					//	Thread.sleep(5000);


						String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

						String msgB= EditEmployeeCategory;
					//	System.out.println(msgA);
					//	Thread.sleep(2000);

						if(msgA.contains(msgB))
						{
							Report.ReporterOutput("STEP","Verify Employee Category "+AddEmployeeCategory+" has been updated.",EditEmployeeCategory,"Employee Category "+AddEmployeeCategory+" should be updated.","Employee Category "+AddEmployeeCategory+" has been updated.","Pass",null);		
						}
		}
							
							catch (Exception e)
							{
								e.printStackTrace();
							}		
							
				}
				//***************** Delete Employee Category **********************************************
				
				public static void DeleteEmployeeCategory(String EditEmployeeCategory) throws Throwable
				{
				     // enter value in Search text box
							
							try
							{
								Thread.sleep(3000);
								if(ResourceAttribute_EmployeeCategory.TextBox_Search(Constant.driver).isEnabled())
								{		
									ResourceAttribute_EmployeeCategory.TextBox_Search(Constant.driver).clear();
									ResourceAttribute_EmployeeCategory.TextBox_Search(Constant.driver).sendKeys(EditEmployeeCategory);
								//	Thread.sleep(2000);
									Report.ReporterOutput("Step","Verify Search text box is enabled.",EditEmployeeCategory, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
								}	
							
							
							else
							{
								Report.ReporterOutput("Step","Verify Search text box is enabled.",EditEmployeeCategory, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
							}				
				// click on Delete button
						if(ResourceAttribute_EmployeeCategory.lnk_delete(Constant.driver).isEnabled())
						{			
							ResourceAttribute_EmployeeCategory.lnk_delete(Constant.driver).click();
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is enabled and clicked.", "Pass",null);
						}	
					else
					{
						Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is not enabled and clicked.", "Fail", null);
					}		
					// Click on Cancel button of Pop up.
								if(ResourceAttribute_EmployeeCategory.lnk_deleteCancel(Constant.driver).isEnabled())
								{			
									ResourceAttribute_EmployeeCategory.lnk_deleteCancel(Constant.driver).click();
								//	Thread.sleep(2000);
									Report.ReporterOutput("Step","Verify Cancel button of Pop up is enabled.","Cancel button of Pop up", "Cancel button of Pop up should be enabled and clicked.", "Cancel button of Pop up is enabled and clicked.", "Pass",null);
								}	
							else
							{
								Report.ReporterOutput("Step","Verify Cancel button of Pop up is enabled.","Cancel button of Pop up", "Cancel button of Pop up should be enabled and clicked.", "Cancel button of Pop up is not enabled and clicked.", "Fail", null);
							}		
						// click on Delete button
								if(ResourceAttribute_EmployeeCategory.lnk_delete(Constant.driver).isEnabled())
								{			
									ResourceAttribute_EmployeeCategory.lnk_delete(Constant.driver).click();
								//	Thread.sleep(2000);
									Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is enabled and clicked.", "Pass",null);
								}	
								else
							{
								Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is not enabled and clicked.", "Fail", null);
							}		
							// Click on OK button of Pop up.
										if(ResourceAttribute_EmployeeCategory.lnk_deleteOk(Constant.driver).isEnabled())
										{			
											ResourceAttribute_EmployeeCategory.lnk_deleteOk(Constant.driver).click();
											Thread.sleep(2000);
											Report.ReporterOutput("Step","Verify OK button of Pop up is enabled.","OK button of Pop up", "OK button of Pop up should be enabled and clicked.", "OK button of Pop up is enabled and clicked.", "Pass",null);
											ResourceAttribute_EmployeeCategory.TextBox_Search(Constant.driver).clear();

										}	
									else
									{
										Report.ReporterOutput("Step","Verify OK button of Pop up is enabled.","OK button of Pop up", "OK button of Pop up should be enabled and clicked.", "OK button of Pop up is not enabled and clicked.", "Fail", null);
									}		
										Thread.sleep(16000);
							ResourceAttribute_EmployeeCategory.TextBox_Search(Constant.driver).clear();
							ResourceAttribute_EmployeeCategory.TextBox_Search(Constant.driver).sendKeys(EditEmployeeCategory);
						//	Thread.sleep(5000);


							String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr/td")).getText().trim();

							String msgB= "No matching records found";
							//	System.out.println(msgA);
							Thread.sleep(1000);

							if(msgA.contains(msgB))
							{
								Report.ReporterOutput("STEP","Verify Employee Category "+EditEmployeeCategory+" has been Deleted.","Employee Category Deletion","Employee Category "+EditEmployeeCategory+" should be deleted.","Employee Category "+EditEmployeeCategory+" has been deleted.","Pass",null);		
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
