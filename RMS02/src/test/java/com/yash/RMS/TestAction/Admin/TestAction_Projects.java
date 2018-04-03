package com.yash.RMS.TestAction.Admin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Admin.Admin_Projects;
import com.yash.RMS.POM.Dashboard.Dashboard;

public class TestAction_Projects {
	//************************** Click on Projects Page *******************************

	public static void projectsPage() throws Throwable
	{
		// Click on Admin link
		try{

			if(Dashboard.lnk_Admin(Constant.driver).isEnabled())
			{			
				Dashboard.lnk_Admin(Constant.driver).click();
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Admin link is enabled.","Admin link", "Admin link should be enabled and clicked.", "Admin link is enabled and clicked.", "Pass", null);
			}
			else
			{
				Report.ReporterOutput("Step","Verify Admin link is enabled.","Admin link", "Admin link should be enabled and clicked.", "Admin link is not enabled and clicked.", "Fail", null);
			}

			// Click on Projects link

			if(Dashboard.lnk_ProjectsPage(Constant.driver).isEnabled())
			{			
				Dashboard.lnk_ProjectsPage(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Projects link is enabled.","Projects link", "Projects link should be enabled and clicked.", "Projects link is enabled and clicked.", "Pass",null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify Projects link is enabled.","Projects link", "Projects link should be enabled and clicked.", "Projects link is not enabled and clicked.", "Fail", null);
			}		
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//Check whether Projects page is open or not.

		String msg1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1")).getText().trim();
		String msg2= "Projects";

		if(msg1.contains(msg2))
		{
			System.out.println("Projects page is open");
		}
		else
			System.out.println("Page not found");
	}

	//------------------------

	//This Functionality will verify sorting functionality

	public static void Sorting() throws Throwable 
	{
		try
		{
			int i;
			for(i=1;i<=9;i++)
			{

				//This Functionality will verify sorting for Project Name functionality

//				WebElement ColumnName = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/thead/tr/th["+i+"]"));
//
//				String projectColumn = ColumnName.getText();
//				System.out.println(projectColumn);
//
//				ColumnName.click();
//				Thread.sleep(2000);
//				WebElement FirstColumn = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr[1]/td["+i+"]"));
//
//				String before2 =FirstColumn.getText();
//				ColumnName.click();
//				WebElement FirstColumn1 = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr[1]/td["+i+"]"));
//
//				String after2 =FirstColumn1.getText();
//				if(!after2.equalsIgnoreCase(before2))
//				{
//					Report.ReporterOutput("STEP ","Verify Sorting for "+projectColumn+".", "Click on Sorting for "+projectColumn+".", "Sorting should be done for "+projectColumn+".","Sorting for "+projectColumn+" is done Successfully.", "Pass",null);
//				}
//			}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	// This is to check Active and all projects count.	
	public static void Status() throws Throwable 
	{
		try
		{
			//This is to select active record
			Select dropdown = new Select(Admin_Projects.dropdown_Status(Constant.driver));
			dropdown.selectByVisibleText("Active");
			Thread.sleep(2000);
			
			WebElement countRecords_active = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[9]/div[2]"));
			String total_active =	countRecords_active.getText();
			String activeRecords = total_active.split(" ")[5];
			int Totalnumber_Active = Integer.parseInt(activeRecords);
			Thread.sleep(1000);
			Select dropdown1 = new Select(Admin_Projects.dropdown_Status(Constant.driver));
			dropdown1.selectByVisibleText("All");
			Thread.sleep(1000);
			//This Functionality will verify count of records.
			WebElement countRecords = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[9]/div[2]"));
			String total =	countRecords.getText();
			//Thread.sleep(2000);
			String allRecords = total.split(" ")[5];
			int TotalRecords = Integer.parseInt(allRecords);
			if(Totalnumber_Active!=TotalRecords)
			{
				Report.ReporterOutput("STEP ","Verify All Records.",allRecords, "All Records should be shown.","All Records are shown successfully.", "Pass",null);		
			}

			Select dropdown3 = new Select(Admin_Projects.dropdown_Status(Constant.driver));			
			dropdown3.selectByVisibleText("Active");

			if(total_active.equals(total_active))
			{
				Report.ReporterOutput("STEP ","Verify Active Records.",activeRecords, "All Active Records should be shown.","All Active Records are shown successfully.", "Pass",null);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	//This functionality will verify Pagination
	//****************************************************************************************************
	public static void Pagination() throws Throwable 
	{
		List<WebElement> pagination = Constant.driver.findElements(By.xpath(".//*[@id='projectTableId_wrapper']/div[7]/div[2]/a"));
		for (int i=pagination.size(); i>=1; i--) 
		{
			WebElement element = Constant.driver.findElement(By.xpath(".//*[@id='projectTableId_wrapper']/div[7]/div[2]/a["+i+"]"));

			String projectColumn = element.getText();
			System.out.println(projectColumn);
			element.click();
			//Thread.sleep(500);
			Report.ReporterOutput("STEP ","Verify Pagination "+ projectColumn, "Click on Link " + projectColumn, projectColumn+" Link should be visible and Clickable.",projectColumn+" Link is visible and clickable", "Pass",null); 

		}	

	}//****************************************************************************************************
	//This functionality will verify Count of Records.
	public static void RecordsCount() throws Throwable 
	{
		int rows_count;
		Select dropdown1 = new Select(Admin_Projects.dropdown_ShowEntry(Constant.driver));
		List<WebElement> values_drop = dropdown1.getOptions();
		for(int i=0;i<values_drop.size();i++)
		{
			dropdown1.selectByIndex(i);
			WebElement option = dropdown1.getFirstSelectedOption();
			System.out.println(option.getText()); 
			Integer x = Integer.valueOf(option.getText());
			System.out.println(x);
			//This is to verify number of rows and columns
			WebElement mytable = Admin_Projects.ProjectID(Constant.driver);
		//	Thread.sleep(500);
			//To locate rows of table.
			List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
			//To calculate no of rows In table.
			rows_count = rows_table.size()-1;
			System.out.println(rows_count);
			//Thread.sleep(1700);
			if(x.equals(rows_count))
			{ Report.ReporterOutput("STEP ","Verify Count of Record for entry="+ x,"Count="+ x  , "Entries Should be Correct-" + x,"Active Record Count done successfully.--" + x, "Pass",null);		  
			}
		} 	
		dropdown1.selectByVisibleText("10");
	}	//****************************************************************************************************

	//This functionality will verify adding of new project.
	public static void addNewProject(String addNewProjectArray[]) throws Throwable 
	{
		try
		{
			// Click on Add New link
			if(Admin_Projects.lnk_AddNew(Constant.driver).isEnabled())
			{			
				Admin_Projects.lnk_AddNew(Constant.driver).click();
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Add New link is enabled.","Add New link", "Add New link should be enabled and clicked.", "Add New link is enabled and clicked.", "Pass", null);
			}
			else
			{
				Report.ReporterOutput("Step","Verify Add New link is enabled.","Add New link", "Add New link should be enabled and clicked.", "Add New link is not enabled and clicked.", "Fail", null);
			}

			System.out.println("Array Values--------------");
			for(int i=0;i<18;i++)
			{
				System.out.println(addNewProjectArray[i]);
			}
			Admin_Projects.TextBox_ProjectName(Constant.driver).sendKeys(addNewProjectArray[1]);
		//	Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Project Name text box is enabled.",addNewProjectArray[1], "Project Name text box should be enabled and value should be entered.", "Project Name text box is enabled and value should be entered.", "Pass", null);
			Admin_Projects.TextBox_ProjectName(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.Dropdown_ProjectCategory(Constant.driver).sendKeys(addNewProjectArray[2]);
		//	Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Project Category dropdown is enabled.",addNewProjectArray[2], "Project Category dropdown should be enabled and value should be selected.", "Project Category dropdown is enabled and value is selected.", "Pass", null);
			Admin_Projects.Dropdown_ProjectCategory(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.Dropdown_BU(Constant.driver).sendKeys(addNewProjectArray[3]);
			//Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify BU dropdown is enabled.",addNewProjectArray[3], "BU dropdown should be enabled and value should be selected.", "BU dropdown is enabled and value is selected.", "Pass", null);
			Admin_Projects.Dropdown_BU(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.Dropdown_CustomerName(Constant.driver).sendKeys(addNewProjectArray[4]);
		//	Thread.sleep(2000);
			//Error here 
			Report.ReporterOutput("Step","Verify Customer Name dropdown is enabled.",addNewProjectArray[4], "Customer Name dropdown should be enabled and value should be selected.", "Customer Name dropdown is enabled and value is selected.", "Pass", null);
			Admin_Projects.Dropdown_CustomerName(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.Dropdown_ParentProjectTeam(Constant.driver).sendKeys(addNewProjectArray[5]);
			//Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Parent Project / Team dropdown is enabled.",addNewProjectArray[5], "Parent Project / Team dropdown should be enabled and value should be selected.", "Parent Project / Team dropdown is enabled and value is selected.", "Pass", null);
			Admin_Projects.Dropdown_ParentProjectTeam(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.TextBox_CustomerContacts(Constant.driver).sendKeys(addNewProjectArray[6]);
			//Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Customer Contacts text box is enabled.",addNewProjectArray[6], "Customer Contacts text box should be enabled and value should be entered.", "Customer Contacts text box is enabled and value is entered.", "Pass", null);
			Admin_Projects.TextBox_CustomerContacts(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.Dropdown_Manager(Constant.driver).sendKeys(addNewProjectArray[7]);
			Admin_Projects.lnk_ManagerName(Constant.driver).click();
			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Manager dropdown is enabled.",addNewProjectArray[7], "Manager dropdown should be enabled and value should be selected.", "Manager dropdown is enabled and value is selected.", "Pass", null);
			Admin_Projects.Dropdown_Manager(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.TextBox_CustomerRelationshipManager(Constant.driver).sendKeys(addNewProjectArray[8]);
			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Customer Relationship Manager text box is enabled.",addNewProjectArray[8], "Customer Relationship Manager text box should be enabled and value should be entered.", "Customer Relationship Manager text box is enabled and value is entered.", "Pass", null);
			Admin_Projects.TextBox_CustomerRelationshipManager(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.Dropdown_EngagementModel(Constant.driver).sendKeys(addNewProjectArray[9]);
			//Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Engagement Model dropdown is enabled.",addNewProjectArray[9], "Engagement Model dropdown should be enabled and value should be selected.", "Engagement Model dropdown is enabled and value is selected.", "Pass", null);
			Admin_Projects.Dropdown_EngagementModel(Constant.driver).sendKeys(Keys.TAB);

			if(!addNewProjectArray[10].isEmpty())
			{
				System.out.println("date is ------------------"+addNewProjectArray[10]);
				Admin_Projects.Date_ProjectKickoffdate(Constant.driver).click();
				String kickoffdate[] = addNewProjectArray[10].split("-");
				System.out.println("date is ------------------"+kickoffdate[0]);
				System.out.println("month is ------------------"+kickoffdate[1]);
				System.out.println("year is ------------------"+kickoffdate[2]);
				Select ProjectKickoffdateMonth= new Select(Admin_Projects.date_ProjectkickoffdateMonth(Constant.driver));
				Select ProjectKickoffdateYear= new Select(Admin_Projects.date_ProjectkickoffdateYear(Constant.driver));
				ProjectKickoffdateMonth.selectByVisibleText(kickoffdate[1]);

				//	ProjectKickoffdateYear.selectByVisibleText(kickoffdate[2]);
				int cellValue,kickOffDateInt;
				String cellvaluestring;
				WebElement dateWidget = Constant.driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr[1]/td[7]/a"));
				boolean flag=true;
				for(int i=1;i<=6;i++)
				{	
					if(flag){
						for(int j=7;j>=1;j--)
						{		
							dateWidget = Constant.driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr["+i+"]/td["+j+"]"));
							cellvaluestring = dateWidget.getText();
							if(cellvaluestring!=null && cellvaluestring.trim().length()>=1 && !cellvaluestring.isEmpty())
							{
								cellValue = Integer.parseInt(cellvaluestring);
								kickOffDateInt= Integer.parseInt(kickoffdate[0]);
								if(cellValue==kickOffDateInt)
								{
									flag=false;
									dateWidget.click();
									break;

								}
							}
						}
					}	
				}
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Project Kick off date field is enabled.",addNewProjectArray[10], "Project Kick off date field should be enabled and date should be selected.", "Project Kick off date field is enabled and date is selected.", "Pass", null);
				Admin_Projects.Date_ProjectKickoffdate(Constant.driver).sendKeys(Keys.TAB);
			}
			//for selecting end date
			if(!addNewProjectArray[11].isEmpty())
			{
				System.out.println("date is ------------------"+addNewProjectArray[11]);
				Admin_Projects.Date_EndDate(Constant.driver).click();
				String enddate[] = addNewProjectArray[11].split("-");
				System.out.println("date is ------------------"+enddate[0]);
				System.out.println("month is ------------------"+enddate[1]);
				System.out.println("year is ------------------"+enddate[2]);
				Select ProjectEnddateMonth= new Select(Admin_Projects.date_ProjectEnddateMonth(Constant.driver));
				Select ProjectEnddateYear= new Select(Admin_Projects.date_ProjectEnddateYear(Constant.driver));
				ProjectEnddateMonth.selectByVisibleText(enddate[1]);
				//	ProjectKickoffdateYear.selectByVisibleText(enddate[2]);
				int cellValue,kickOffDateInt;
				String cellvaluestring;
				WebElement dateWidget = Constant.driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr[1]/td[7]/a"));
				boolean flag=true;
				for(int i=1;i<=6;i++)
				{		
					if(flag){
						for(int j=7;j>=1;j--)
						{	
							dateWidget = Constant.driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr["+i+"]/td["+j+"]"));
							cellvaluestring = dateWidget.getText();
							if(cellvaluestring!=null && cellvaluestring.trim().length()>=1 && !cellvaluestring.isEmpty())
							{
								cellValue = Integer.parseInt(cellvaluestring);
								kickOffDateInt= Integer.parseInt(enddate[0]);
								if(cellValue==kickOffDateInt)
								{
									flag=false;
									dateWidget.click();
									break;

								}
							}
						}
					}	
				}
				Thread.sleep(1000);
				Report.ReporterOutput("Step","Verify End Date field is enabled.",addNewProjectArray[11], "End Date field should be enabled and Date should be selected.", "End Date field is enabled and Date is selected.", "Pass", null);
				Admin_Projects.Date_EndDate(Constant.driver).sendKeys(Keys.TAB);
			}

			Admin_Projects.TextBox_PlannedProjectSize(Constant.driver).sendKeys(addNewProjectArray[12]);
			//Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Planned Project Size text box is enabled.",addNewProjectArray[12], "Planned Project Size text box should be enabled and value should be entered.", "Planned Project Size text box is enabled and value is entered.", "Pass", null);
			Admin_Projects.TextBox_PlannedProjectSize(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.Dropdown_Projecttrackingcurrency(Constant.driver).sendKeys(addNewProjectArray[13]);
		//	Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Project tracking currency dropdown is enabled.",addNewProjectArray[13], "Project tracking currency dropdown should be enabled and value should be selected.", "Project tracking currency dropdown is enabled and value is selected.", "Pass", null);
			Admin_Projects.Dropdown_Projecttrackingcurrency(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.Dropdown_DevelopmentMethodology(Constant.driver).sendKeys(addNewProjectArray[15]);
			Admin_Projects.lnk_DevelopmentMethodologyName(Constant.driver).click();
			Thread.sleep(1000);
			Report.ReporterOutput("Step","Verify Development Methodology dropdown is enabled.",addNewProjectArray[15], "Development Methodology dropdown should be enabled and value should be selected.", "Development Methodology dropdown is enabled and value is selected.", "Pass", null);
			Admin_Projects.Dropdown_DevelopmentMethodology(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.TextArea_Description(Constant.driver).sendKeys(addNewProjectArray[16]);
			//Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Description text area is enabled.",addNewProjectArray[16], "Description text area should be enabled and value should be entered.", "Description text area is enabled and value is entered.", "Pass", null);
			Admin_Projects.TextArea_Description(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.Dropdown_Invoicedby(Constant.driver).sendKeys(addNewProjectArray[17]);
		//	Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Invoiced by dropdown is enabled.",addNewProjectArray[17], "Invoiced by dropdown should be enabled and value should be selected.", "Invoiced by dropdown is enabled and value is selected.", "Pass", null);
			//	Admin_Projects.Dropdown_Invoicedby(Constant.driver).sendKeys(Keys.TAB);
			Admin_Projects.Dropdown_InvoicedbyValue(Constant.driver).click();

			//Add new Project Category
			/*		Admin_Projects.Dropdown_ProjectCategory(Constant.driver).sendKeys(addNewProjectArray[18]);
			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Project Category dropdown is enabled.",addNewProjectArray[18], "Project Category  dropdown should be enabled and value should be selected.", "Project Category   dropdown is enabled and value is selected.", "Pass", null);
			Admin_Projects.Dropdown_ProjectCategory(Constant.driver).click();*/

			//to click on save btn
			Admin_Projects.lnk_AddSave(Constant.driver).click();
			Thread.sleep(1000);
			Report.ReporterOutput("Step","Verify Save link is enabled.","Save link", "Save link should be enabled and clicked.", "Save link is enabled and clicked.", "Pass", null);

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}//****************************************************************************************************
	//This Functionality will verify searching of project
	public static void searchProject(String addNewProjectArray[]) throws Throwable 
	{
		try
		{
			// Search recently created project
			if(Admin_Projects.textbox_SearchProject(Constant.driver).isEnabled())
			{   Thread.sleep(4000);
				Admin_Projects.textbox_SearchProject(Constant.driver).clear();
				Admin_Projects.textbox_SearchProject(Constant.driver).sendKeys(addNewProjectArray[1]);
				Thread.sleep(5000);
				Report.ReporterOutput("Step","Verify Search text box is enabled.",addNewProjectArray[1], "Search text box should be enabled and value should be entered.", "Search text box is enabled and value is entered.", "Pass", null);
			}
			else
			{
				Report.ReporterOutput("Step","Verify Search text box is enabled.",addNewProjectArray[1], "Search text box should be enabled and value should be entered.", "Search text box is not enabled and value is entered.", "Fail", null);
			}
			Thread.sleep(2000);
			//String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr/td[2]")).getText().trim();
			Thread.sleep(2000);
			String msgB= addNewProjectArray[1];
			Thread.sleep(1000);

			//if(msgA.contains(msgB))
			{
				Report.ReporterOutput("STEP","Verify new Project "+addNewProjectArray[1]+" is searched and verified.",addNewProjectArray[1],"New Project "+addNewProjectArray[1]+" should be searched and verification.","New Project "+addNewProjectArray[1]+" searched and verified.","Pass",null);
			}

			//Thread.sleep(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	//This functionality will verify Editing of new project.
	public static void editProject(String addNewProjectArray[], String editNewProjectArray[]) throws Throwable 
	{
		try
		{
			// Search recently created project
			if(Admin_Projects.textbox_SearchProject(Constant.driver).isEnabled())
			{
				Admin_Projects.textbox_SearchProject(Constant.driver).clear();
				Admin_Projects.textbox_SearchProject(Constant.driver).sendKeys(addNewProjectArray[1]);
				//Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Search text box is enabled.",addNewProjectArray[1], "Search text box should be enabled and value should be entered.", "Search text box is enabled and value is entered.", "Pass", null);
			}
			else
			{
				Report.ReporterOutput("Step","Verify Search text box is enabled.",addNewProjectArray[1], "Search text box should be enabled and value should be entered.", "Search text box is not enabled and value is entered.", "Fail", null);
			}

			// Click on Edit New link
			if(Admin_Projects.lnk_ProjectNameID(Constant.driver).isEnabled())
			{	
				//String projectIDName= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr/td[1]/a")).getText().trim();
				Admin_Projects.lnk_ProjectNameID(Constant.driver).click();
				Thread.sleep(2000);
				//Report.ReporterOutput("Step","Verify Project ID link is enabled.",projectIDName, "Project ID link should be enabled and clicked.", "Project ID link is enabled and clicked.", "Pass", null);
			}
			else
			{
				Report.ReporterOutput("Step","Verify Project ID link is enabled.","Edit New link", "Project ID link should be enabled and clicked.", "Project ID link is not enabled and clicked.", "Fail", null);
			}

			System.out.println("Array Values--------------");
			for(int i=0;i<18;i++)
			{
				System.out.println(editNewProjectArray[i]);
			}

			/*Admin_Projects.TextBox_ProjectName(Constant.driver).clear();
			Admin_Projects.TextBox_ProjectName(Constant.driver).sendKeys(editNewProjectArray[1]);
			Thread.sleep(1000);
			Report.ReporterOutput("Step","Verify Project Name text box is enabled.",editNewProjectArray[1], "Project Name text box should be enabled and value should be entered.", "Project Name text box is enabled and value should be entered.", "Pass", null);
			Admin_Projects.TextBox_ProjectName(Constant.driver).sendKeys(Keys.TAB);*/
//Dropdown_ProjectCategory
			Admin_Projects.Dropdown_ProjectCategory(Constant.driver).clear();
			Admin_Projects.Dropdown_ProjectCategory(Constant.driver).sendKeys(editNewProjectArray[2]);
			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Project Category dropdown is enabled.",editNewProjectArray[2], "Project Category dropdown should be enabled and value should be selected.", "Project Category dropdown is enabled and value is selected.", "Pass", null);
			Admin_Projects.Dropdown_ProjectCategory(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.Dropdown_BU(Constant.driver).clear();
			Admin_Projects.Dropdown_BU(Constant.driver).sendKeys(editNewProjectArray[3]);
			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify BU dropdown is enabled.",editNewProjectArray[3], "BU dropdown should be enabled and value should be selected.", "BU dropdown is enabled and value is selected.", "Pass", null);
			Admin_Projects.Dropdown_BU(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.Dropdown_CustomerName(Constant.driver).clear();
			Admin_Projects.Dropdown_CustomerName(Constant.driver).sendKeys(editNewProjectArray[4]);
			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Customer Name dropdown is enabled.",editNewProjectArray[4], "Customer Name dropdown should be enabled and value should be selected.", "Customer Name dropdown is enabled and value is selected.", "Pass", null);
			Admin_Projects.Dropdown_CustomerName(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.Dropdown_ParentProjectTeam(Constant.driver).clear();
			Admin_Projects.Dropdown_ParentProjectTeam(Constant.driver).sendKeys(editNewProjectArray[5]);
			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Parent Project / Team dropdown is enabled.",editNewProjectArray[5], "Parent Project / Team dropdown should be enabled and value should be selected.", "Parent Project / Team dropdown is enabled and value is selected.", "Pass", null);
			Admin_Projects.Dropdown_ParentProjectTeam(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.TextBox_CustomerContacts(Constant.driver).clear();
			Admin_Projects.TextBox_CustomerContacts(Constant.driver).sendKeys(editNewProjectArray[6]);
			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Customer Contacts text box is enabled.",editNewProjectArray[6], "Customer Contacts text box should be enabled and value should be entered.", "Customer Contacts text box is enabled and value is entered.", "Pass", null);
			Admin_Projects.TextBox_CustomerContacts(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.Dropdown_Manager(Constant.driver).clear();
			Admin_Projects.Dropdown_Manager(Constant.driver).sendKeys(editNewProjectArray[7]);
			Admin_Projects.lnk_ManagerName(Constant.driver).click();
			Thread.sleep(1000);
			Report.ReporterOutput("Step","Verify Manager dropdown is enabled.",editNewProjectArray[7], "Manager dropdown should be enabled and value should be selected.", "Manager dropdown is enabled and value is selected.", "Pass", null);
			Admin_Projects.Dropdown_Manager(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.TextBox_CustomerRelationshipManager(Constant.driver).clear();
			Admin_Projects.TextBox_CustomerRelationshipManager(Constant.driver).sendKeys(editNewProjectArray[8]);
		Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Customer Relationship Manager text box is enabled.",editNewProjectArray[8], "Customer Relationship Manager text box should be enabled and value should be entered.", "Customer Relationship Manager text box is enabled and value is entered.", "Pass", null);
			Admin_Projects.TextBox_CustomerRelationshipManager(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.Dropdown_EngagementModel(Constant.driver).clear();
			Admin_Projects.Dropdown_EngagementModel(Constant.driver).sendKeys(editNewProjectArray[9]);
			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Engagement Model dropdown is enabled.",editNewProjectArray[9], "Engagement Model dropdown should be enabled and value should be selected.", "Engagement Model dropdown is enabled and value is selected.", "Pass", null);
			Admin_Projects.Dropdown_EngagementModel(Constant.driver).sendKeys(Keys.TAB);

			if(!editNewProjectArray[10].isEmpty())
			{
				System.out.println("date is ------------------"+editNewProjectArray[10]);
				Admin_Projects.Date_ProjectKickoffdate(Constant.driver).click();
				String kickoffdate[] = editNewProjectArray[10].split("-");
				System.out.println("date is ------------------"+kickoffdate[0]);
				System.out.println("month is ------------------"+kickoffdate[1]);
				System.out.println("year is ------------------"+kickoffdate[2]);
				Select ProjectKickoffdateMonth= new Select(Admin_Projects.date_ProjectkickoffdateMonth(Constant.driver));
				Select ProjectKickoffdateYear= new Select(Admin_Projects.date_ProjectkickoffdateYear(Constant.driver));
				ProjectKickoffdateMonth.selectByVisibleText(kickoffdate[1]);
				//	ProjectKickoffdateYear.selectByVisibleText(kickoffdate[2]);
				int cellValue,kickOffDateInt;
				String cellvaluestring;
				WebElement dateWidget = Constant.driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr[1]/td[7]/a"));
				boolean flag=true;
				for(int i=1;i<=6;i++)
				{	
					if(flag){
						for(int j=7;j>=1;j--)
						{		
							dateWidget = Constant.driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr["+i+"]/td["+j+"]"));
							cellvaluestring = dateWidget.getText();
							if(cellvaluestring!=null && cellvaluestring.trim().length()>=1 && !cellvaluestring.isEmpty())
							{
								cellValue = Integer.parseInt(cellvaluestring);
								kickOffDateInt= Integer.parseInt(kickoffdate[0]);
								if(cellValue==kickOffDateInt)
								{
									flag=false;
									dateWidget.click();
									break;

								}
							}
						}
					}	
				}
				Thread.sleep(1000);
				Report.ReporterOutput("Step","Verify Project Kick off date field is enabled.",editNewProjectArray[10], "Project Kick off date field should be enabled and date should be selected.", "Project Kick off date field is enabled and date is selected.", "Pass", null);
				Admin_Projects.Date_ProjectKickoffdate(Constant.driver).sendKeys(Keys.TAB);
			}
			//for selecting end date
			if(!editNewProjectArray[11].isEmpty())
			{
				System.out.println("date is ------------------"+editNewProjectArray[11]);
				Admin_Projects.Date_EndDate(Constant.driver).click();
				String enddate[] = editNewProjectArray[11].split("-");
				System.out.println("date is ------------------"+enddate[0]);
				System.out.println("month is ------------------"+enddate[1]);
				System.out.println("year is ------------------"+enddate[2]);
				Select ProjectEnddateMonth= new Select(Admin_Projects.date_ProjectEnddateMonth(Constant.driver));
				@SuppressWarnings("unused")
				Select ProjectEnddateYear= new Select(Admin_Projects.date_ProjectEnddateYear(Constant.driver));
				ProjectEnddateMonth.selectByVisibleText(enddate[1]);
				//	ProjectKickoffdateYear.selectByVisibleText(enddate[2]);
				int cellValue,kickOffDateInt;
				String cellvaluestring;
				WebElement dateWidget = Constant.driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr[1]/td[7]/a"));
				boolean flag=true;
				for(int i=1;i<=6;i++)
				{		
					if(flag){
						for(int j=7;j>=1;j--)
						{	
							dateWidget = Constant.driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr["+i+"]/td["+j+"]"));
							cellvaluestring = dateWidget.getText();
							if(cellvaluestring!=null && cellvaluestring.trim().length()>=1 && !cellvaluestring.isEmpty())
							{
								cellValue = Integer.parseInt(cellvaluestring);
								kickOffDateInt= Integer.parseInt(enddate[0]);
								if(cellValue==kickOffDateInt)
								{
									flag=false;
									dateWidget.click();
									break;

								}
							}
						}
					}	
				}
				//Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify End Date field is enabled.",editNewProjectArray[11], "End Date field should be enabled and Date should be selected.", "End Date field is enabled and Date is selected.", "Pass", null);
				Admin_Projects.Date_EndDate(Constant.driver).sendKeys(Keys.TAB);
			}

			Admin_Projects.TextBox_PlannedProjectSize(Constant.driver).clear();
			Admin_Projects.TextBox_PlannedProjectSize(Constant.driver).sendKeys(editNewProjectArray[12]);
		//	Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Planned Project Size text box is enabled.",editNewProjectArray[12], "Planned Project Size text box should be enabled and value should be entered.", "Planned Project Size text box is enabled and value is entered.", "Pass", null);
			Admin_Projects.TextBox_PlannedProjectSize(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.Dropdown_Projecttrackingcurrency(Constant.driver).clear();
			Admin_Projects.Dropdown_Projecttrackingcurrency(Constant.driver).sendKeys(editNewProjectArray[13]);
		//	Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Project tracking currency dropdown is enabled.",editNewProjectArray[13], "Project tracking currency dropdown should be enabled and value should be selected.", "Project tracking currency dropdown is enabled and value is selected.", "Pass", null);
			Admin_Projects.Dropdown_Projecttrackingcurrency(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.Dropdown_DevelopmentMethodology(Constant.driver).clear();
			Admin_Projects.Dropdown_DevelopmentMethodology(Constant.driver).sendKeys(editNewProjectArray[15]);
			Admin_Projects.lnk_DevelopmentMethodologyName(Constant.driver).click();
			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Development Methodology dropdown is enabled.",editNewProjectArray[15], "Development Methodology dropdown should be enabled and value should be selected.", "Development Methodology dropdown is enabled and value is selected.", "Pass", null);
			Admin_Projects.Dropdown_DevelopmentMethodology(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.TextArea_Description(Constant.driver).clear();
			Admin_Projects.TextArea_Description(Constant.driver).sendKeys(editNewProjectArray[16]);
			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Description text area is enabled.",editNewProjectArray[16], "Description text area should be enabled and value should be entered.", "Description text area is enabled and value is entered.", "Pass", null);
			Admin_Projects.TextArea_Description(Constant.driver).sendKeys(Keys.TAB);

			Admin_Projects.Dropdown_Invoicedby(Constant.driver).clear();
			Admin_Projects.Dropdown_Invoicedby(Constant.driver).sendKeys(editNewProjectArray[17]);
			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Invoiced by dropdown is enabled.",editNewProjectArray[17], "Invoiced by dropdown should be enabled and value should be selected.", "Invoiced by dropdown is enabled and value is selected.", "Pass", null);
			Admin_Projects.Dropdown_Invoicedby(Constant.driver).sendKeys(Keys.TAB);
			//Admin_Projects.Dropdown_InvoicedbyValue(Constant.driver).click();

			// to click on save 
			Admin_Projects.lnk_AddSave(Constant.driver).click();
		//	Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Save link is enabled.","Save link", "Save link should be enabled and clicked.", "Save link is enabled and clicked.", "Pass", null);

			// Searching edited project
			Thread.sleep(14000);
			if(Admin_Projects.textbox_SearchProject(Constant.driver).isEnabled())
			{
				Admin_Projects.textbox_SearchProject(Constant.driver).clear();
				Admin_Projects.textbox_SearchProject(Constant.driver).sendKeys(editNewProjectArray[1]);
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Search text box is enabled.",editNewProjectArray[1], "Search text box should be enabled and value should be entered.", "Search text box is enabled and value is entered.", "Pass", null);
			}
			else
			{
				Report.ReporterOutput("Step","Verify Search text box is enabled.",editNewProjectArray[1], "Search text box should be enabled and value should be entered.", "Search text box is not enabled and value is entered.", "Fail", null);
			}

		//	String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr/td[2]")).getText().trim();
			//String msgB= editNewProjectArray[1];
			Thread.sleep(2000);

			//if(msgA.contains(msgB))
			{
				Report.ReporterOutput("STEP","Verify Project "+editNewProjectArray[1]+" is updated.",editNewProjectArray[1],"Project "+editNewProjectArray[1]+" should be updated.","Project "+editNewProjectArray[1]+" is updated.","Pass",null);
			}

			// to click on Home page
			Thread.sleep(7000);
			Constant.driver.get("http://inidrrmstsrv01:8080/rms");
//			if(Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).isDisplayed());                                    
//			{              
//				Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).click();
//				Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is navigated to RMS      Home page","Pass",null);
//			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
// END of CLass ***********************
