package com.yash.RMS.TestAction.MasterData.MiscAttribute;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Dashboard.Dashboard;
import com.yash.RMS.POM.MasterData.MiscAttribute.MiscAttribute_Event;


public class TestAction_Event {
	//************************** Click on Event Page *******************************
	
			public static void EventPage() throws Throwable
			{
				// Click on Master data link
						try{
								
							if(Dashboard.lnk_MasterData(Constant.driver).isEnabled())
							{			
								Dashboard.lnk_MasterData(Constant.driver).click();
							//Thread.sleep(2000);
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
						// Click on Event link
						if(Dashboard.lnk_Event(Constant.driver).isEnabled())
							{			
								Dashboard.lnk_Event(Constant.driver).click();
								//Thread.sleep(2000);
								Report.ReporterOutput("Step","Verify Event link is enabled.","Event link", "Event link should be enabled and clicked.", "Event link is enabled and clicked.", "Pass",null);
							}	
						else
						{
							Report.ReporterOutput("Step","Verify Event link is enabled.","Event link", "Event link should be enabled and clicked.", "Event link is not enabled and clicked.", "Fail", null);
						}		
						//Check whether Event page is open or not.
						String msg1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1")).getText().trim();
						String msg2= "Event";
						
						if(msg1.contains(msg2))
						{
							System.out.println("Event page open");
						}
						else
						System.out.println("Page not found");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			}
			
			//This Functionality will verify sorting functionality

			public static void Sorting() throws Throwable 
			{
				try
				{
				int i;
				for(i=1;i<=3;i++)
				{
				
				//This Functionality will verify sorting for Project Name functionality
				
				WebElement ColumnName = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/table/thead/tr/th["+i+"]"));
				
				String programlist1 = ColumnName.getText();
				
				ColumnName.click();
			//	Thread.sleep(1000);
				WebElement FirstColumn = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td["+i+"]"));

				String before2 =FirstColumn.getText();
				ColumnName.click();
				WebElement FirstColumn1 = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td["+i+"]"));

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
				Thread.sleep(500);
				Report.ReporterOutput("STEP ","Verify Pagination for "+ programlist1, "Click on link " + programlist1, programlist1+" Link should be visible and Clickable.",programlist1+" Link is visible and clickable", "Pass",null); 

			}	
			
			}
			//This functionality will verify Count of Records.
			public static void RecordsCount() throws Throwable 
			{
				int rows_count;
				Select dropdown1 = new Select(MiscAttribute_Event.dropdown_ShowMore(Constant.driver));
				List<WebElement> values_drop = dropdown1.getOptions();
				for(int i=0;i<values_drop.size();i++)
				{
					 dropdown1.selectByIndex(i);
					 WebElement option = dropdown1.getFirstSelectedOption();
					 Integer x = Integer.valueOf(option.getText());
					//This is to verify number of rows and columns
					 WebElement mytable = MiscAttribute_Event.eventTableID(Constant.driver);
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
			
	
			//***************** Create New Event **********************************************
			
			public static void NewEvent(String AddEvent, String AddDesc) throws Throwable
			{
				//Click on Add new button.
				try
				{
					if(MiscAttribute_Event.lnk_AddNew(Constant.driver).isEnabled())
					{			
						MiscAttribute_Event.lnk_AddNew(Constant.driver).click();
					//	Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Add New button is enabled.",AddEvent, "Add New button should be enabled and clicked.", "Add New button is enabled and clicked.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Add New button is enabled.",AddEvent, "Add New button should be enabled and clicked.", "Add New button is not enabled and clicked.", "Fail", null);
				}			
				// enter value in Event text box
					if(MiscAttribute_Event.TextBox_AddEvent(Constant.driver).isEnabled())
					{			
						MiscAttribute_Event.TextBox_AddEvent(Constant.driver).sendKeys(AddEvent);
					//	Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Event Text Box is enabled.",AddEvent, "Event Text Box should be enabled and value should be entered.", "Event Text Box is enabled and value is entered.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Event Text Box is enabled.",AddEvent, "Event Text Box should be enabled and value should be entered.", "Event Text Box is not enabled and Value is not entered.", "Fail", null);
				}
				// enter value in Description text box
					if(MiscAttribute_Event.TextBox_AddDesc(Constant.driver).isEnabled())
					{	
				//		Thread.sleep(2000);
				//		MiscAttribute_Event.TextBox_AddDesc(Constant.driver).click();
						MiscAttribute_Event.TextBox_AddDesc(Constant.driver).sendKeys(AddDesc);
					//	Thread.sleep(2000);
					//	MiscAttribute_Event.TextBox_AddDesc(Constant.driver).sendKeys(Keys.TAB);
					//	Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify drop down is enabled.",AddDesc, "Drop down should be enabled and value should be selected.", "Drop down is enabled and value is selected.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify drop down is enabled.",AddDesc, "Drop down should be enabled and value should be selected.", "Drop down is not enabled and value is not selected.", "Fail", null);
				}	
				// click on save button
					if(MiscAttribute_Event.lnk_AddSave(Constant.driver).isEnabled())
					{			
						MiscAttribute_Event.lnk_AddSave(Constant.driver).click();
						Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
				}	
				// click on save Link
					if(MiscAttribute_Event.lnk_AddApplySave(Constant.driver).isEnabled())
					{			
						MiscAttribute_Event.lnk_AddApplySave(Constant.driver).click();
						Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
				}
				Report.ReporterOutput("STEP","Verify new Event "+AddEvent+" has been created.","New Event creation","New Event "+AddEvent+" should be created.","New Event "+AddEvent+" has been created.","Pass",null);		
				}
			catch (Exception e) {
				e.printStackTrace();
			}
			}
			//************ to Search and verify created Event **************************************
			public static void SearchEvent(String AddEvent) throws Throwable
			{
			try
			{   Thread.sleep(17000);
				MiscAttribute_Event.TextBox_Search(Constant.driver).clear();
				MiscAttribute_Event.TextBox_Search(Constant.driver).sendKeys(AddEvent);
			//	Thread.sleep(2000);
				String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

				String msgB= AddEvent;
				System.out.println(msgA);
			//	Thread.sleep(2000);

				if(msgA.contains(msgB))
				{
					Report.ReporterOutput("STEP","Verify new Event "+AddEvent+" is searched and verified.",AddEvent,"New Event "+AddEvent+" should be searched and verification.","New Event "+AddEvent+" searched and verified.","Pass",null);
				}

			//	Thread.sleep(3000);
			}
			catch(Exception e2)
			{
				Report.ReporterOutput("STEP","Verify new Event "+AddEvent+" is searched and verified.",AddEvent,"New Event "+AddEvent+" should be searched and verification.","New Event "+AddEvent+" is not searched and verified.","Fail",null);
			}

			} 			
			
			//********************** to Edit Event **************************************
			
			public static void EditEvent(String AddEvent, String EditEvent, String EditDesc) throws Throwable
			{
				// enter value in Search text box
					try
						{   Thread.sleep(3000);
							if(MiscAttribute_Event.TextBox_Search(Constant.driver).isEnabled())
							{	
								MiscAttribute_Event.TextBox_Search(Constant.driver).clear();
								MiscAttribute_Event.TextBox_Search(Constant.driver).sendKeys(AddEvent);
								//Thread.sleep(2000);
								Report.ReporterOutput("Step","Verify Search text box is enabled.",AddEvent, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
							}	
						else
						{
							Report.ReporterOutput("Step","Verify Search text box is enabled.",AddEvent, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
						}				
						// click on Edit button
						if(MiscAttribute_Event.lnk_edit(Constant.driver).isEnabled())
							{			
								MiscAttribute_Event.lnk_edit(Constant.driver).click();
							//	Thread.sleep(2000);
								Report.ReporterOutput("Step","Verify Edit Link is enabled.","Edit Link", "Edit Link should be enabled and clicked.", "Edit Link is enabled and clicked.", "Pass",null);
							}	
						else
						{
							Report.ReporterOutput("Step","Verify Edit Link is enabled.","Edit Link", "Edit Link should be enabled and clicked.", "Edit Link is not enabled and clicked.", "Fail", null);
						}		
				//enter value in Event text box
						if(MiscAttribute_Event.TextBox_EditEvent(Constant.driver).isEnabled())
						{			
						MiscAttribute_Event.TextBox_EditEvent(Constant.driver).clear();
						MiscAttribute_Event.TextBox_EditEvent(Constant.driver).sendKeys(EditEvent);
					//	Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Event Text Box is enabled.",EditEvent, "Event Text Box should be enabled and value should be entered.", "Event Text Box is enabled and value is entered.", "Pass",null);
						}	
				else
				{
					Report.ReporterOutput("Step","Verify Event Text Box is enabled.",EditEvent, "Event Text Box should be enabled and value should be entered.", "Event Text Box is not enabled and Value is not entered.", "Fail", null);
				}
			// enter value in Description text box
				if(MiscAttribute_Event.Dropdown_EditDesc(Constant.driver).isEnabled())
					{			
						MiscAttribute_Event.Dropdown_EditDesc(Constant.driver).clear();
						MiscAttribute_Event.Dropdown_EditDesc(Constant.driver).sendKeys(EditDesc);
					//	Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Description text box is enabled.",EditDesc, "Description text box should be enabled and value should be entered.", "Description text box is enabled and value is entered.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Description text box is enabled.",EditDesc, "Description text box should be enabled and value should be entered.", "Description text box is not enabled and Value is not entered.", "Fail", null);
				}
				// click on save button
					if(MiscAttribute_Event.lnk_EditSave(Constant.driver).isEnabled())
						{			
							MiscAttribute_Event.lnk_EditSave(Constant.driver).click();
							Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
						}	
					else
					{
						Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
					}				
				// enter value in Event:Apply Rules page
					if(MiscAttribute_Event.Dropdown_EditEmployeeCategory(Constant.driver).isEnabled())
						{	
							// enter value in Employee Category Drop down
							MiscAttribute_Event.Dropdown_EditEmployeeCategory(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditEmployeeCategory(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditEmployeeCategory(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditEmployeeCategory(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Employee Category drop down is enabled.","Yes", "Employee Category Drop down should be enabled and value should be selected.", "Employee Category Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in Grade Drop down
							MiscAttribute_Event.Dropdown_EditGrade(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditGrade(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditGrade(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditGrade(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Grade drop down is enabled.","Yes", "Grade Drop down should be enabled and value should be selected.", "Grade Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in Ownership Drop down
							MiscAttribute_Event.Dropdown_EditOwnership(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditOwnership(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditOwnership(Constant.driver).sendKeys("No");
							MiscAttribute_Event.Dropdown_EditOwnership(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Ownership drop down is enabled.","No", "Ownership Drop down should be enabled and value should be selected.", "Ownership Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in Designation Drop down
							MiscAttribute_Event.Dropdown_EditDesignation(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditDesignation(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditDesignation(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditDesignation(Constant.driver).sendKeys(Keys.TAB);
							//Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Designation drop down is enabled.","Yes", "Designation Drop down should be enabled and value should be selected.", "Designation Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in Parent BG-BU Drop down
							MiscAttribute_Event.Dropdown_EditParentBGBU(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditParentBGBU(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditParentBGBU(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditParentBGBU(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Parent BG-BU drop down is enabled.","Yes", "Parent BG-BU Drop down should be enabled and value should be selected.", "Parent BG-BU Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in Base Location Drop down
							MiscAttribute_Event.Dropdown_EditBaseLocation(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditBaseLocation(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditBaseLocation(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditBaseLocation(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Base Location drop down is enabled.","Yes", "Base Location Drop down should be enabled and value should be selected.", "Base Location Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in Current Location Drop down
							MiscAttribute_Event.Dropdown_EditCurrentLocation(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditCurrentLocation(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditCurrentLocation(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditCurrentLocation(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Current Location drop down is enabled.","Yes", "Current Location Drop down should be enabled and value should be selected.", "Current Location Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in Current RM 2 Drop down
							MiscAttribute_Event.Dropdown_EditCurrentRM2(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditCurrentRM2(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditCurrentRM2(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditCurrentRM2(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Current RM 2 Verify drop down is enabled.","Yes", "Current RM 2 Drop down should be enabled and value should be selected.", "Current RM 2 Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in Current BG-BU Drop down
							MiscAttribute_Event.Dropdown_EditCurrentBGBU(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditCurrentBGBU(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditCurrentBGBU(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditCurrentBGBU(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Current BG-BU drop down is enabled.","Yes", "Current BG-BU Drop down should be enabled and value should be selected.", "Current BG-BU Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in Current RM 1 Drop down
							MiscAttribute_Event.Dropdown_EditCurrentRM1(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditCurrentRM1(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditCurrentRM1(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditCurrentRM1(Constant.driver).sendKeys(Keys.TAB);
							//Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Current RM 1 drop down is enabled.","Yes", "Current RM 1 Drop down should be enabled and value should be selected.", "Current RM 1 Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in Contact Number 2 Drop down
							MiscAttribute_Event.Dropdown_EditContactNumber2(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditContactNumber2(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditContactNumber2(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditContactNumber2(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Contact Number 2 drop down is enabled.","Yes", "Contact Number 2 Drop down should be enabled and value should be selected.", "Contact Number 2 Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in Email Id Drop down
							MiscAttribute_Event.Dropdown_EditEmailId(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditEmailId(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditEmailId(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditEmailId(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Email Id Verify drop down is enabled.","Yes", "Email Id Drop down should be enabled and value should be selected.", "Email Id Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in Contact Number 1 Drop down
							MiscAttribute_Event.Dropdown_EditContactNumber1(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditContactNumber1(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditContactNumber1(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditContactNumber1(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Contact Number 1 drop down is enabled.","Yes", "Contact Number 1 Drop down should be enabled and value should be selected.", "Contact Number 1 Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in Appraisal Date 1 Drop down
							MiscAttribute_Event.Dropdown_EditAppraisalDate1(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditAppraisalDate1(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditAppraisalDate1(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditAppraisalDate1(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Appraisal Date 1 drop down is enabled.","Yes", "Appraisal Date 1 Drop down should be enabled and value should be selected.", "Appraisal Date 1 Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value DOJ in Drop down
							MiscAttribute_Event.Dropdown_EditDOJ(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditDOJ(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditDOJ(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditDOJ(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","DOJ Verify drop down is enabled.","Yes", "DOJ Drop down should be enabled and value should be selected.", "DOJ Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in Confirmation Date Drop down
							MiscAttribute_Event.Dropdown_EditConfirmationDate(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditConfirmationDate(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditConfirmationDate(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditConfirmationDate(Constant.driver).sendKeys(Keys.TAB);
							//Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Confirmation Date drop down is enabled.","Yes", "Confirmation Date Drop down should be enabled and value should be selected.", "Confirmation Date Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in Loan/Transfer Date From Drop down
							MiscAttribute_Event.Dropdown_EditLoanTransferDateFrom(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditLoanTransferDateFrom(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditLoanTransferDateFrom(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditLoanTransferDateFrom(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Loan/Transfer Date From drop down is enabled.","Yes", "Loan/Transfer Date From Drop down should be enabled and value should be selected.", "Loan/Transfer Date From Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in Appraisal Date 2 Drop down
							MiscAttribute_Event.Dropdown_EditAppraisalDate2(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditAppraisalDate2(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditAppraisalDate2(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditAppraisalDate2(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Appraisal Date 2 drop down is enabled.","Yes", "Appraisal Date 2 Drop down should be enabled and value should be selected.", "Appraisal Date 2 Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in Release Date Drop down
							MiscAttribute_Event.Dropdown_EditReleaseDate(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditReleaseDate(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditReleaseDate(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditReleaseDate(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Release Date drop down is enabled.","Yes", "Release Date Drop down should be enabled and value should be selected.", "Release Date Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in Loan/Transfer Date To Drop down
							MiscAttribute_Event.Dropdown_EditLoanTransferDateTo(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditLoanTransferDateTo(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditLoanTransferDateTo(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditLoanTransferDateTo(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Loan/Transfer Date To drop down is enabled.","Yes", "Loan/Transfer Date To Drop down should be enabled and value should be selected.", "Loan/Transfer Date To Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in BGH Name Drop down
							MiscAttribute_Event.Dropdown_EditBGHName(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditBGHName(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditBGHName(Constant.driver).sendKeys("Yes");
						MiscAttribute_Event.Dropdown_EditBGHName(Constant.driver).sendKeys(Keys.TAB);
							//Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify BGH Name drop down is enabled.","Yes", "BGH Name Drop down should be enabled and value should be selected.", "BGH Name Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in BUH Name Drop down
							MiscAttribute_Event.Dropdown_EditBUHName(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditBUHName(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditBUHName(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditBUHName(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify BUH Name drop down is enabled.","Yes", "BUH Name Drop down should be enabled and value should be selected.", "BUH Name Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in HR Name Drop down
							MiscAttribute_Event.Dropdown_EditHRName(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditHRName(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditHRName(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditHRName(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify HR Name drop down is enabled.","Yes", "HR Name Drop down should be enabled and value should be selected.", "HR Name Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in BGH Comments Drop down
							MiscAttribute_Event.Dropdown_EditBGHComments(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditBGHComments(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditBGHComments(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditBGHComments(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify BGH Comments drop down is enabled.","Yes", "BGH Comments Drop down should be enabled and value should be selected.", "BGH Comments Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in BUH Comments Drop down
							MiscAttribute_Event.Dropdown_EditBUHComments(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditBUHComments(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditBUHComments(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditBUHComments(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify BUH Comments drop down is enabled.","Yes", "BUH Comments Drop down should be enabled and value should be selected.", "BUH Comments Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in HR Comments Drop down
							MiscAttribute_Event.Dropdown_EditHRComments(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditHRComments(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditHRComments(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditHRComments(Constant.driver).sendKeys(Keys.TAB);
					//		Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify HR Comments drop down is enabled.","Yes", "HR Comments Drop down should be enabled and value should be selected.", "HR Comments Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in BGH Comments Date Drop down
							MiscAttribute_Event.Dropdown_EditBGHCommentsDate(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditBGHCommentsDate(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditBGHCommentsDate(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditBGHCommentsDate(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify BGH Comments Date drop down is enabled.","Yes", "BGH Comments Date Drop down should be enabled and value should be selected.", "BGH Comments Date Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in BU Comments Date Drop down
							MiscAttribute_Event.Dropdown_EditBUCommentsDate(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditBUCommentsDate(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditBUCommentsDate(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditBUCommentsDate(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify BU Comments Date drop down is enabled.","Yes", "BU Comments Date Drop down should be enabled and value should be selected.", "BU Comments Date Drop down is enabled and value is selected.", "Pass",null);
							
							// enter value in HR Comments Date Drop down
							MiscAttribute_Event.Dropdown_EditHRCommentsDate(Constant.driver).click();
							MiscAttribute_Event.Dropdown_EditHRCommentsDate(Constant.driver).clear();
							MiscAttribute_Event.Dropdown_EditHRCommentsDate(Constant.driver).sendKeys("Yes");
							MiscAttribute_Event.Dropdown_EditHRCommentsDate(Constant.driver).sendKeys(Keys.TAB);
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify HR Comments Date drop down is enabled.","Yes", "HR Comments Date Drop down should be enabled and value should be selected.", "HR Comments Date Drop down is enabled and value is selected.", "Pass",null);
						}	
					else
					{
						Report.ReporterOutput("Step","Verify Employee Category drop down is enabled.","Yes", "Employee Category Drop down should be enabled and value should be selected.", "Employee Category Drop down is not enabled and value is not selected.", "Fail", null);
					}		
					// click on save Link
					if(MiscAttribute_Event.lnk_AddApplySave(Constant.driver).isEnabled())
						{			
							MiscAttribute_Event.lnk_AddApplySave(Constant.driver).click();
						//	Thread.sleep(2000);
							Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
						}	
					else
					{
						Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
					}
					Thread.sleep(17000);
					MiscAttribute_Event.TextBox_Search(Constant.driver).clear();
					MiscAttribute_Event.TextBox_Search(Constant.driver).sendKeys(EditEvent);
				//	Thread.sleep(2000);
					String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

					String msgB= EditEvent;
					System.out.println(msgA);
				//	Thread.sleep(2000);

					if(msgA.contains(msgB))
					{
						Report.ReporterOutput("STEP","Verify Event "+AddEvent+" has been updated.","Event Updation","Event "+AddEvent+" should be updated.","Event "+AddEvent+" has been updated.","Pass",null);		
					}	
					
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			}
			//********************** Click on Event **************************************
			public static void ClickEvent(String EditEvent) throws Throwable
			{
			// enter value in Search text box
				try
				{
					
				if(MiscAttribute_Event.TextBox_Search(Constant.driver).isEnabled())
					{	
						MiscAttribute_Event.TextBox_Search(Constant.driver).clear();
						MiscAttribute_Event.TextBox_Search(Constant.driver).sendKeys(EditEvent);
					//	Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Search text box is enabled.",EditEvent, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Search text box is enabled.",EditEvent, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
				}				
		    // click on Event
					if(MiscAttribute_Event.lnk_EventNo(Constant.driver).isEnabled())
					{			
						MiscAttribute_Event.lnk_EventNo(Constant.driver).click();
					//	Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Event No. Link is enabled.",EditEvent, "Event No. Link should be enabled and clicked.", "Event No. Link is enabled and clicked.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Event No. Link is enabled.",EditEvent, "Event No. Link should be enabled and clicked.", "Event No. Link is not enabled and clicked.", "Fail", null);
				}		
			// click on save Link
					if(MiscAttribute_Event.lnk_AddApplySave(Constant.driver).isEnabled())
					{			
						MiscAttribute_Event.lnk_AddApplySave(Constant.driver).click();
						Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			}
			//***************** Delete Event **********************************************
			public static void DeleteEvent(String EditEvent) throws Throwable
			{
				// enter value in Search text box
				try
				{
					if(MiscAttribute_Event.TextBox_Search(Constant.driver).isEnabled())
					{	
						MiscAttribute_Event.TextBox_Search(Constant.driver).clear();
						MiscAttribute_Event.TextBox_Search(Constant.driver).sendKeys(EditEvent);
					//	Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Search text box is enabled.",EditEvent, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Search text box is enabled.",EditEvent, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
				}	
			// click on Delete button
				/*if(MiscAttribute_Event.lnk_delete(Constant.driver).isEnabled())
					{			
						MiscAttribute_Event.lnk_delete(Constant.driver).click();
					//	Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is enabled and clicked.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is not enabled and clicked.", "Fail", null);
				}		*/
				/*// Click on Cancel button of Pop up.
						if(MiscAttribute_Event.lnk_deleteCancel(Constant.driver).isEnabled())
							{			
								MiscAttribute_Event.lnk_deleteCancel(Constant.driver).click();
							//	Thread.sleep(2000);
								Report.ReporterOutput("Step","Verify Cancel button of Pop up is enabled.","Cancel", "Cancel button of Pop up should be enabled and clicked.", "Cancel button of Pop up is enabled and clicked.", "Pass",null);
							}	
						else
						{
							Report.ReporterOutput("Step","Verify Cancel button of Pop up is enabled.","Cancel", "Cancel button of Pop up should be enabled and clicked.", "Cancel button of Pop up is not enabled and clicked.", "Fail", null);
						}	*/	
						// click on Delete button
						if(MiscAttribute_Event.lnk_delete(Constant.driver).isEnabled())
							{			
								MiscAttribute_Event.lnk_delete(Constant.driver).click();
							//	Thread.sleep(2000);
								Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is enabled and clicked.", "Pass",null);
							}	
						else
						{
							Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is not enabled and clicked.", "Fail", null);
						}		
						// Click on OK button of Pop up.
								if(MiscAttribute_Event.lnk_deleteOk(Constant.driver).isEnabled())
									{			
										MiscAttribute_Event.lnk_deleteOk(Constant.driver).click();
										Thread.sleep(2000);
										Report.ReporterOutput("Step","Verify OK button of Pop up is enabled.","OK", "OK button of Pop up should be enabled and clicked.", "OK button of Pop up is enabled and clicked.", "Pass",null);
									

									}	
								else
								{
									Report.ReporterOutput("Step","Verify OK button of Pop up is enabled.","OK", "OK button of Pop up should be enabled and clicked.", "OK button of Pop up is not enabled and clicked.", "Fail", null);
								}		
							

								Thread.sleep(5000);
								MiscAttribute_Event.TextBox_Search(Constant.driver).clear();
								MiscAttribute_Event.TextBox_Search(Constant.driver).sendKeys(EditEvent);
							//	Thread.sleep(2000);
								String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr/td")).getText().trim();

								String msgB= "No matching records found";
								System.out.println(msgA);
							//	Thread.sleep(2000);

								if(msgA.contains(msgB))
								{
									Report.ReporterOutput("STEP","Verify Event "+EditEvent+" has been Deleted.",EditEvent,"Event "+EditEvent+" should be deleted.","Event "+EditEvent+" has been deleted.","Pass",null);		
								}		
						
								Constant.driver.findElement(By.xpath(".//*[@id='example_filter']/label/input")).clear();
								MiscAttribute_Event.TextBox_Search(Constant.driver).clear();
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
