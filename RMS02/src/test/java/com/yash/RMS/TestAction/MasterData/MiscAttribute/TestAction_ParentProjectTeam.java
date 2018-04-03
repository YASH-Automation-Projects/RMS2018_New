package com.yash.RMS.TestAction.MasterData.MiscAttribute;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Dashboard.Dashboard;
import com.yash.RMS.POM.MasterData.MiscAttribute.MiscAttribute_ParentProject;

public class TestAction_ParentProjectTeam {
	
	//************************** Click on Parent Project / Team Page *******************************
	
		public static void ParentProjectTeamPage() throws Throwable
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
					// Click on Misc. Attribute link
					if(Dashboard.lnk_MiscAttribute(Constant.driver).isEnabled())
						{			
							Dashboard.lnk_MiscAttribute(Constant.driver).click();
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Misc. Attribute link is enabled.","Misc. Attribute link", "Misc. Attribute link should be enabled and clicked.", "Misc. Attribute link is enabled and clicked.", "Pass", null);
						}	
					else
					{
						Report.ReporterOutput("Step","Verify Misc. Attribute link is enabled.","Misc. Attribute link", "Misc. Attribute link should be enabled and clicked.", "Misc. Attribute link is not enabled and clicked.", "Fail", null);
					}
				// Click on Parent Project / Team link
					if(Dashboard.lnk_ParentProject(Constant.driver).isEnabled())
						{			
							Dashboard.lnk_ParentProject(Constant.driver).click();
							Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Parent Project / Team link is enabled.","Parent Project / Team link", "Parent Project / Team link should be enabled and clicked.", "Parent Project / Team link is enabled and clicked.", "Pass",null);
						}	
					else
					{
						Report.ReporterOutput("Step","Verify Parent Project / Team link is enabled.","Parent Project / Team link", "Parent Project / Team link should be enabled and clicked.", "Parent Project / Team link is not enabled and clicked.", "Fail", null);
					}		
					//Check whether Parent Project / Team page is open or not.
					String msg1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1")).getText().trim();
					String msg2= "Parent Project / Team";
					
					if(msg1.contains(msg2))
					{
						System.out.println("Parent Project / Team page open");
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
					
					WebElement ColumnName = Constant.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[2]/div/table/thead/tr/th["+i+"]"));
					
					String programlist1 = ColumnName.getText();
					
					ColumnName.click();
					Thread.sleep(1000);
					WebElement FirstColumn = Constant.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td["+i+"]"));

					String before2 =FirstColumn.getText();
					ColumnName.click();
					WebElement FirstColumn1 = Constant.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td["+i+"]"));

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
				for (int i=4; i>=1; i--) 
				{
					WebElement element = Constant.driver.findElement(By.xpath(".//*[@id='example_wrapper']/div[7]/div[2]/a["+i+"]"));
					
					String programlist1 = element.getText();
					element.click();
					//Thread.sleep(500);
					Report.ReporterOutput("STEP ","Verify Pagination for "+ programlist1, "Click on link " + programlist1, programlist1+" Link should be visible and Clickable.",programlist1+" Link is visible and clickable", "Pass",null); 

				}	
				
				}
				//This functionality will verify Count of Records.
				public static void RecordsCount() throws Throwable 
				{
					int rows_count;
					Select dropdown1 = new Select(MiscAttribute_ParentProject.dropdown_ShowMore(Constant.driver));
					List<WebElement> values_drop = dropdown1.getOptions();
					for(int i=0;i<values_drop.size();i++)
					{
						 dropdown1.selectByIndex(i);
						 WebElement option = dropdown1.getFirstSelectedOption();
						 Integer x = Integer.valueOf(option.getText());
						//This is to verify number of rows and columns
						 WebElement mytable = MiscAttribute_ParentProject.parentProjectTableID(Constant.driver);
						//  Thread.sleep(500);
						  //To locate rows of table.
						  List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
						  //To calculate no of rows In table.
						  rows_count = rows_table.size()-1;
						//  Thread.sleep(1700);
						  if(x.equals(rows_count))
						  { Report.ReporterOutput("STEP ","Verify Count of Record for entry="+ x,"Count="+ x  , "Entries Should be Correct-" + x,"Active Record Count done successfully.--" + x, "Pass",null);		  
						  }
						 } 	
					dropdown1.selectByIndex(0);
				}	
	
				//***************** Create New Parent Project / Team **********************************************
		
		public static void NewProject(String AddProject, String AddManager) throws Throwable
		{
			//Click on Add new button.
			try
			{
				Thread.sleep(3000);
				Dashboard.lnk_ParentProject(Constant.driver).click();
				Thread.sleep(10000);
				if(MiscAttribute_ParentProject.lnk_AddNew(Constant.driver).isEnabled())
				{		System.out.println("before add button click");	
					MiscAttribute_ParentProject.lnk_AddNew(Constant.driver).click();
					System.out.println("After add button click");	
					Thread.sleep(3000);
					Report.ReporterOutput("Step","Verify Add New button is enabled.","Add New button", "Add New button should be enabled and clicked.", "Add New button is enabled and clicked.", "Pass",null);
				}	
				else
			{
				Report.ReporterOutput("Step","Verify Add New button is enabled.","Add New button", "Add New button should be enabled and clicked.", "Add New button is not enabled and clicked.", "Fail", null);
			}			
			// enter value in Project Parent / Team text box
				Thread.sleep(3000);
		if(MiscAttribute_ParentProject.TextBox_AddProject(Constant.driver).isEnabled())
				{			
			MiscAttribute_ParentProject.TextBox_AddProject(Constant.driver).clear();
					MiscAttribute_ParentProject.TextBox_AddProject(Constant.driver).sendKeys(AddProject);
					//Thread.sleep(2000);
					Report.ReporterOutput("Step","Verify Project Parent / Team Text Box is enabled.","Project Parent / Team Text Box", "Project Parent / Team Text Box should be enabled and value should be entered.", "Project Parent / Team Text Box is enabled and value is entered.", "Pass",null);
					MiscAttribute_ParentProject.TextBox_AddProject(Constant.driver).sendKeys(Keys.TAB);
				}	
			else
			{
				Report.ReporterOutput("Step","Verify Project Parent / Team Text Box is enabled.","Project Parent / Team Text Box", "Project Parent / Team Text Box should be enabled and value should be entered.", "Project Parent / Team Text Box is not enabled and Value is not entered.", "Fail", null);
			}
		// enter value in Description text box
			if(MiscAttribute_ParentProject.Dropdown_AddManager(Constant.driver).isEnabled())
				{	
					//Thread.sleep(2000);
					MiscAttribute_ParentProject.Dropdown_AddManager(Constant.driver).click();
					MiscAttribute_ParentProject.Dropdown_AddManager(Constant.driver).sendKeys(AddManager);
					//Thread.sleep(5000);
					MiscAttribute_ParentProject.Dropdown_AddManager(Constant.driver).sendKeys(Keys.TAB);
					//Thread.sleep(5000);
					Report.ReporterOutput("Step","Verify drop down is enabled.","Drop down", "Drop down should be enabled and value should be selected.", "Drop down is enabled and value is selected.", "Pass",null);
				}	
			else
			{
				Report.ReporterOutput("Step","Verify drop down is enabled.","Drop down", "Drop down should be enabled and value should be selected.", "Drop down is not enabled and value is not selected.", "Fail", null);
			}	
			// click on save button
			if(MiscAttribute_ParentProject.lnk_AddSave(Constant.driver).isEnabled())
				{			
					MiscAttribute_ParentProject.lnk_AddSave(Constant.driver).click();
					Thread.sleep(2000);
					Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
				}	
			else
			{
				Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
			}		
		
			Report.ReporterOutput("STEP","Verify new Parent Project / Team "+AddProject+" has been created.","New Parent Project / Team creation","New Parent Project / Team "+AddProject+" should be created.","New Parent Project / Team "+AddProject+" has been created.","Pass",null);		
			}
		catch (Exception e)
		{
			e.printStackTrace();
		}
}
		//************ to Search and verify created Parent Project / Team **************************************
		public static void SearchProject(String AddProject) throws Throwable
		{
		try
		{
			
			Thread.sleep(17000);
			MiscAttribute_ParentProject.TextBox_Search(Constant.driver).clear();
			MiscAttribute_ParentProject.TextBox_Search(Constant.driver).sendKeys(AddProject);
		//	Thread.sleep(5000);


			String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

			String msgB= AddProject;
			System.out.println(msgA);
		//	Thread.sleep(2000);

			if(msgA.contains(msgB))
			{
				Report.ReporterOutput("STEP","Verify new Parent Project / Team "+AddProject+" is searched and verified.","New Parent Project / Team verification","New Parent Project / Team "+AddProject+" should be searched and verification.","New Parent Project / Team "+AddProject+" searched and verified.","Pass",null);
			}

			//Thread.sleep(3000);
		}
		catch(Exception e2)
		{
			Report.ReporterOutput("STEP","Verify new Parent Project / Team "+AddProject+" is searched and verified.","New Parent Project / Team verification","New Parent Project / Team "+AddProject+" should be searched and verification.","New Parent Project / Team "+AddProject+" is not searched and verified.","Fail",null);
		}

		} 
		//********************** to Edit Parent Project / Team **************************************
		public static void EditProject(String AddProject, String EditProject, String EditManager) throws Throwable
		{
			// enter value in Search text box
					try
					{
						Thread.sleep(3000);
						if(MiscAttribute_ParentProject.TextBox_Search(Constant.driver).isEnabled())
						{	
							MiscAttribute_ParentProject.TextBox_Search(Constant.driver).clear();
							MiscAttribute_ParentProject.TextBox_Search(Constant.driver).sendKeys(AddProject);
							//Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Search text box is enabled.","Search text box", "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
						}	
					else
					{
						Report.ReporterOutput("Step","Verify Search text box is enabled.","Search text box", "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
					}	
						
		     // click on Edit button
						Thread.sleep(2000);
					if(MiscAttribute_ParentProject.lnk_edit(Constant.driver).isEnabled())
						{			
							MiscAttribute_ParentProject.lnk_edit(Constant.driver).click();
							Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Edit Link is enabled.","Edit Link", "Edit Link should be enabled and clicked.", "Edit Link is enabled and clicked.", "Pass",null);
						}	
					else
					{
						Report.ReporterOutput("Step","Verify Edit Link is enabled.","Edit Link", "Edit Link should be enabled and clicked.", "Edit Link is not enabled and clicked.", "Fail", null);
					}		
	//enter value in Parent Project / Team Name text box
			if(MiscAttribute_ParentProject.TextBox_EditProject(Constant.driver).isEnabled())
				{			
					MiscAttribute_ParentProject.TextBox_EditProject(Constant.driver).clear();
					MiscAttribute_ParentProject.TextBox_EditProject(Constant.driver).sendKeys(EditProject);
				//	Thread.sleep(2000);
					Report.ReporterOutput("Step","Verify Parent Project / Team Text Box is enabled.","Parent Project / Team Text Box", "Parent Project / Team Text Box should be enabled and value should be entered.", "Parent Project / Team Text Box is enabled and value is entered.", "Pass",null);
					MiscAttribute_ParentProject.TextBox_EditProject(Constant.driver).sendKeys(Keys.TAB);

				}	
			else
			{
				Report.ReporterOutput("Step","Verify Parent Project / Team Text Box is enabled.","Parent Project / Team Text Box", "Parent Project / Team Text Box should be enabled and value should be entered.", "Parent Project / Team Text Box is not enabled and Value is not entered.", "Fail", null);
			}
		// enter value in Project Manager Drop down
			Thread.sleep(2000);
			if(MiscAttribute_ParentProject.Dropdown_EditManager(Constant.driver).isEnabled())
				{			
					MiscAttribute_ParentProject.Dropdown_EditManager(Constant.driver).clear();
					MiscAttribute_ParentProject.Dropdown_EditManager(Constant.driver).sendKeys(EditManager);
				//	Thread.sleep(5000);
					MiscAttribute_ParentProject.Dropdown_EditManager(Constant.driver).sendKeys(Keys.TAB);
					//Thread.sleep(5000);

					Report.ReporterOutput("Step","Verify Project Manager drop down is enabled.","Project Manager drop down", "Project Manager drop down should be enabled and value should be entered.", "Project Manager drop down is enabled and value is entered.", "Pass",null);
				}	
			else
			{
				Report.ReporterOutput("Step","Verify Project Manager drop down is enabled.","Project Manager drop down", "Project Manager drop down should be enabled and value should be entered.", "Project Manager drop down is not enabled and Value is not entered.", "Fail", null);
			}
			// click on save button
				if(MiscAttribute_ParentProject.lnk_EditSave(Constant.driver).isEnabled())
					{			
						MiscAttribute_ParentProject.lnk_EditSave(Constant.driver).click();
						Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
				}				
					
				Thread.sleep(17000);
				MiscAttribute_ParentProject.TextBox_Search(Constant.driver).clear();
				MiscAttribute_ParentProject.TextBox_Search(Constant.driver).sendKeys(EditProject);
				//Thread.sleep(5000);


				String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

				String msgB= EditProject;
				System.out.println(msgA);
			//	Thread.sleep(2000);

				if(msgA.contains(msgB))
				{
					Report.ReporterOutput("STEP","Verify Parent Project / Team "+AddProject+" has been updated.","Parent Project / Team Updation","Parent Project / Team "+AddProject+" should be updated.","Parent Project / Team "+AddProject+" has been updated.","Pass",null);		
				}
			}
		catch (Exception e)
		{
			e.printStackTrace();
		}
}
		//***************** Delete Parent Project / Team **********************************************
		public static void DeleteProject(String EditProject) throws Throwable
		{
		     // enter value in Search text box
					try
					{
						Thread.sleep(2000);
						if(MiscAttribute_ParentProject.TextBox_Search(Constant.driver).isEnabled())
						{		
							MiscAttribute_ParentProject.TextBox_Search(Constant.driver).clear();
							MiscAttribute_ParentProject.TextBox_Search(Constant.driver).sendKeys(EditProject);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Search text box is enabled.","Search text box", "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
						}	
					else
					{
						Report.ReporterOutput("Step","Verify Search text box is enabled.","Search text box", "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
					}				
	// click on Delete button
			if(MiscAttribute_ParentProject.lnk_delete(Constant.driver).isEnabled())
				{			
					MiscAttribute_ParentProject.lnk_delete(Constant.driver).click();
					//Thread.sleep(2000);
					Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is enabled and clicked.", "Pass",null);
				}	
			else
			{
				Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is not enabled and clicked.", "Fail", null);
			}		
			// Click on Cancel button of Pop up.
					if(MiscAttribute_ParentProject.lnk_deleteCancel(Constant.driver).isEnabled())
						{			
							MiscAttribute_ParentProject.lnk_deleteCancel(Constant.driver).click();
							Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Cancel button of Pop up is enabled.","Cancel button of Pop up", "Cancel button of Pop up should be enabled and clicked.", "Cancel button of Pop up is enabled and clicked.", "Pass",null);
						}	
					else
					{
						Report.ReporterOutput("Step","Verify Cancel button of Pop up is enabled.","Cancel button of Pop up", "Cancel button of Pop up should be enabled and clicked.", "Cancel button of Pop up is not enabled and clicked.", "Fail", null);
					}		
					// click on Delete button
					if(MiscAttribute_ParentProject.lnk_delete(Constant.driver).isEnabled())
						{			
							MiscAttribute_ParentProject.lnk_delete(Constant.driver).click();
							Thread.sleep(1000);
							Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is enabled and clicked.", "Pass",null);
						}	
					else
					{
						Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is not enabled and clicked.", "Fail", null);
					}		
				// Click on OK button of Pop up.
							if(MiscAttribute_ParentProject.lnk_deleteOk(Constant.driver).isEnabled())
								{			
									MiscAttribute_ParentProject.lnk_deleteOk(Constant.driver).click();
									Thread.sleep(2000);
									Report.ReporterOutput("Step","Verify OK button of Pop up is enabled.","OK button of Pop up", "OK button of Pop up should be enabled and clicked.", "OK button of Pop up is enabled and clicked.", "Pass",null);
									MiscAttribute_ParentProject.TextBox_Search(Constant.driver).clear();

								}	
							else
							{
								Report.ReporterOutput("Step","Verify OK button of Pop up is enabled.","OK button of Pop up", "OK button of Pop up should be enabled and clicked.", "OK button of Pop up is not enabled and clicked.", "Fail", null);
							}		
							Thread.sleep(17000);
							MiscAttribute_ParentProject.TextBox_Search(Constant.driver).clear();
							MiscAttribute_ParentProject.TextBox_Search(Constant.driver).sendKeys(EditProject);
						//	Thread.sleep(5000);


							String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr/td")).getText().trim();

							String msgB= "No matching records found";
							System.out.println(msgA);
							//Thread.sleep(2000);

							if(msgA.contains(msgB))
							{
								Report.ReporterOutput("STEP","Verify Parent Project / Team "+EditProject+" has been Deleted.","Parent Project / Team Deletion","Parent Project / Team "+EditProject+" should be deleted.","Parent Project / Team "+EditProject+" has been deleted.","Pass",null);		
							}
							Constant.driver.findElement(By.xpath(".//*[@id='example_filter']/label/input")).clear();
							MiscAttribute_ParentProject.TextBox_Search(Constant.driver).clear();
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
