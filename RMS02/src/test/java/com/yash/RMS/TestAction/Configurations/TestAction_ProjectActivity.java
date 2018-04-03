package com.yash.RMS.TestAction.Configurations;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
//import com.yash.RMS.POM.Configurations.PageObjects_ProjectActivity;
import com.yash.RMS.POM.Configurations.PageObjects_ProjectActivity;
import com.yash.RMS.POM.Dashboard.Dashboard;
import com.yash.RMS.POM.Transaction.PageObjects_TimesheetSubmission;

public class TestAction_ProjectActivity {
	//RMS-> Configuration -> Configure Project Activity
	public static String SEPGActivityName_Asc1;
	public static ArrayList<String> TimesheetActivityValue = new ArrayList<String>();
	private static String defaultActivityMappedValues2[];
	private static String MapSEPGMappedValues2[];
	private static String MapCustomMappedValues2[];
	
	
	
	

	//************************** Click on Project Activity Page *******************************
	public static void ProjectActivityPage() throws Throwable
	{
		// Click on Configuration link
		try{
			if(Dashboard.lnk_ConfigurationPage(Constant.driver).isEnabled())
			{			
				Dashboard.lnk_ConfigurationPage(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Configurations link is enabled.","Configurations link", "Configurations link should be enabled and clicked.", "Configurations link is enabled and clicked.", "Pass", null);
			}else{
				Report.ReporterOutput("Step","Verify Configurations link is enabled.","Configurations link", "Configurations link should be enabled and clicked.", "Configurations link is not enabled and clicked.", "Fail", null);
			}

			// *******Click on Project Activity link*******

			if(Dashboard.lnk_ProjectActivityPage(Constant.driver).isEnabled())
			{			
				Dashboard.lnk_ProjectActivityPage(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Project Activity link is enabled.","Project Activity link", "Project Activity link should be enabled and clicked.", "Project Activity link is enabled and clicked.", "Pass",null);
			}else{
				Report.ReporterOutput("Step","Verify Project Activity link is enabled.","Project Activity link", "Project Activity link should be enabled and clicked.", "Project Activity link is not enabled and clicked.", "Fail", null);
			}		
		}
		catch (Exception e){	
			e.printStackTrace();
		}
		//**Check whether Project Activity page is open or not*******.

		String msg1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1")).getText().trim();
		String msg2= "Project Activity";

		if(msg1.contains(msg2))
		{
			Report.ReporterOutput("Step","Verify Project Activity text display on page.","Project Activity text", "Project Activity text should be display on the page.", "Project Activity text displayed on page successfully.", "Pass",null);
			System.out.println("Project Activity page open");
		}else
			Report.ReporterOutput("Step","Verify Project Activity ltext display on page.","Project Activity text", "Project Activity text should be display on the page.", "Project Activity text not display on page successfully", "Fail", null);
			System.out.println("Page not found");
	}
	//********************************************************************************************//
	//This Functionality will verify sorting functionality

	public static void Sorting() throws Throwable 
	{
		try
		{
			int i;
		//	for(i=1;i<=8;i++)
			for(i=2;i<=8;i++)
			{
				//This Functionality will verify sorting for Project Name functionality

		//		WebElement ColumnName = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/thead/tr/th["+i+"]"));
				WebElement ColumnName = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[8]/div[1]/div/table/thead/tr[1]/th["+i+"]"));

				String programlist1 = ColumnName.getText();
			//	System.out.println(programlist1);
				Thread.sleep(1000);
				ColumnName.click();
				Thread.sleep(2000);
			//	WebElement FirstColumn = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr[1]/td["+i+"]"));
				WebElement FirstColumn = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[8]/div[2]/table/tbody/tr[1]/td["+i+"]"));
				String before2 =FirstColumn.getText();
				
				ColumnName.click();
		//		WebElement FirstColumn1 = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr[1]/td["+i+"]"));
				WebElement FirstColumn1 = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[8]/div[2]/table/tbody/tr[1]/td["+i+"]"));
				String after2 =FirstColumn1.getText();
				if(!after2.equalsIgnoreCase(before2))
				{
					Report.ReporterOutput("STEP ","Verify Sorting for "+programlist1+".", "Click on Sorting for "+programlist1+".", "Sorting should be done for "+programlist1+".","Sorting for "+programlist1+" is done Successfully.", "Pass",null);
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	//********************************************************************************************//

	public static void Status() throws Throwable 
	{
		try
		{	//This is to select active record
			Select dropdown = new Select(PageObjects_ProjectActivity.Dropdown_Status(Constant.driver));
			dropdown.selectByVisibleText("Active");
			//Thread.sleep(5000);
			Thread.sleep(3000);

	//		WebElement countRecords_active = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[7]/div[1]"));
	//		WebElement countRecords_active = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[8]/div[2]/table/tbody/tr/td[1]"));
			WebElement countRecords_active = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[9]/div[2]"));
			String total_active =	countRecords_active.getText();

			String activeRecords = total_active.split(" ")[5];

			int Totalnumber_Active = Integer.parseInt(activeRecords);
			Thread.sleep(2000);

			Select dropdown1 = new Select(PageObjects_ProjectActivity.Dropdown_Status(Constant.driver));
			dropdown1.selectByVisibleText("All");
			//Thread.sleep(5000);
			Thread.sleep(3000);
			//This Functionality will verify count of records.
//			WebElement countRecords = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[7]/div[1]"));
	//		WebElement countRecords = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[8]/div[2]/table/tbody/tr/td[1]"));
			WebElement countRecords = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[9]/div[2]"));
			
			String total =	countRecords.getText();
			Thread.sleep(2000);
			String allRecords = total.split(" ")[5];

			int TotalRecords = Integer.parseInt(allRecords);
			if(Totalnumber_Active!=TotalRecords){
				Report.ReporterOutput("STEP ","Verify All Records.", "Click on All Record.", "All Records should be shown.","All Records are shown successfully.", "Pass",null);		
			}
			Select dropdown3 = new Select(PageObjects_ProjectActivity.Dropdown_Status(Constant.driver));			
			dropdown3.selectByVisibleText("Active");

			if(total_active.equals(total_active)){
				Report.ReporterOutput("STEP ","Verify Active Records.", "Click on Active Record.", "All Active Records should be shown.","All Active Records are shown successfully.", "Pass",null);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	//********************************************************************************************//
	//This functionality will verify Pagination

	public static void Pagination() throws Throwable 
	{
		List<WebElement> pagination = Constant.driver.findElements(By.xpath(".//*[@id='projectTableId_wrapper']/div[7]/div[2]/a"));
		for (int i=pagination.size(); i>=1; i--) 
		{
			WebElement element = Constant.driver.findElement(By.xpath(".//*[@id='projectTableId_wrapper']/div[7]/div[2]/a["+i+"]"));

			String programlist1 = element.getText();
	//		System.out.println(programlist1);
			element.click();
			Thread.sleep(500);
			Report.ReporterOutput("STEP ","Verify Pagination-:"+ programlist1, "Click on Link." + programlist1, programlist1+"Link should be visible and Clickable.",programlist1+" Link is visible and clickable", "Pass",null); 
		}	
	}
	//********************************************************************************************//
	//This functionality will verify Count of Records.
	public static void RecordsCount() throws Throwable 
	{
		int rows_count;
		Select dropdown1 = new Select(PageObjects_ProjectActivity.Dropdown_ShowEntry(Constant.driver));
		List<WebElement> values_drop = dropdown1.getOptions();
		for(int i=0;i<values_drop.size();i++)
		{
			dropdown1.selectByIndex(i);
			WebElement option = dropdown1.getFirstSelectedOption();
	//		System.out.println(option.getText()); 
			Integer x = Integer.valueOf(option.getText());
	//		System.out.println(x);
			//This is to verify number of rows and columns
			WebElement mytable = PageObjects_ProjectActivity.ProjectID(Constant.driver);
			Thread.sleep(500);
			//To locate rows of table.
			List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
			//To calculate no of rows In table.
			rows_count = rows_table.size()-1;
	//		System.out.println(rows_count);
			Thread.sleep(1700);
			if(x.equals(rows_count))
			{ Report.ReporterOutput("STEP ","Verify Count of Record for entry="+ x,"Count="+ x  , "Entries Should be Correct-" + x,"Active Record Count done successfully.--" + x, "Pass",null);		  
			}
		} 	
	}	
	//**************************************************************************************************************************//
	//************************Update Activity for Project*************************************************		
	public static void UpdateProjectActivity(String ProjectActivityCount) throws Throwable
	{
		try{	
System.out.println(ProjectActivityCount);
			/**Start ; Navigation to  Configuration Activity Page ****comment the code when we run both the Module for Navigation an dUpdation ****/
			/*Thread.sleep(5000);
			if(Dashboard.lnk_ConfigurationPage(Constant.driver).isEnabled())
			{			
				Dashboard.lnk_ConfigurationPage(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Transaction link is enabled.","Transaction link", "Transaction link should be enabled and clicked.", "Transaction link is enabled and clicked.", "Pass", null);
			}else{
				Report.ReporterOutput("Step","Verify Transaction link is enabled.","Transaction link", "Transaction link should be enabled and clicked.", "Transaction link is not enabled and clicked.", "Fail", null);
			}

			// *******Click on COnfigure Project Activity link*******

			if(Dashboard.lnk_ProjectActivityPage(Constant.driver).isEnabled())
			{			
				Dashboard.lnk_ProjectActivityPage(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Project Activity link is enabled.","Project Activity link", "Project Activity link should be enabled and clicked.", "Project Activity link is enabled and clicked.", "Pass",null);
			}else{
				Report.ReporterOutput("Step","Verify Project Activity link is enabled.","Project Activity link", "Project Activity link should be enabled and clicked.", "Project Activity link is not enabled and clicked.", "Fail", null);
			}		*/

			/**END : Navigation to  Configuration Activity Page *********************************************************************/


			// enter value in Search text box
			//Thread.sleep(5000);
			Thread.sleep(3000);
			if(PageObjects_ProjectActivity.TextBox_Search(Constant.driver).isEnabled())
			{			
				PageObjects_ProjectActivity.TextBox_Search(Constant.driver).clear();
				//PageObjects_ProjectActivity.TextBox_Search(Constant.driver).sendKeys("BU4Stanley Black and Decker417");
		//		PageObjects_ProjectActivity.TextBox_Search(Constant.driver).sendKeys("MOCI (GPA)-SCRY156");
			//	PageObjects_ProjectActivity.TextBox_Search(Constant.driver).sendKeys("JDTCI");
				PageObjects_ProjectActivity.TextBox_Search(Constant.driver).sendKeys("TCI Staff Aug-BG4-BU9");
				
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Search Text Box is enabled.","TCI Staff Aug-BG4-BU9", "Search Text Box should be enabled and value should be entered.", "Search Text Box is enabled and value is entered successfully.", "Pass",null);
			}else{
				Report.ReporterOutput("Step","Verify Search Text Box is enabled.","TCI Staff Aug-BG4-BU9", "Ownership Text Box should be enabled and value should be entered.", "Ownership Text Box is not enabled and Value is not entered.", "Fail", null);
			}
			// Click on Project Name link
		//	if(PageObjects_ProjectActivity.lnk_ProjectName(Constant.driver).isEnabled())
				if(PageObjects_ProjectActivity.lnk_searchedProjectName(Constant.driver).isEnabled())
			{
				Thread.sleep(2000);

		//		String ProjectName = PageObjects_ProjectActivity.lnk_ProjectName(Constant.driver).getText().trim();
		//		PageObjects_ProjectActivity.lnk_ProjectName(Constant.driver).click();
				
				String ProjectName = PageObjects_ProjectActivity.lnk_searchedProjectName(Constant.driver).getText().trim();
				PageObjects_ProjectActivity.lnk_searchedProjectName(Constant.driver).click();

				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Project ID link is enabled.",ProjectName, "Project ID link should be enabled and clicked.", "Project ID link is enabled and clicked.", "Pass", null);
			}else{
				Report.ReporterOutput("Step","Verify Project ID link is enabled.","ProjectName", "Project ID link should be enabled and clicked.", "Project ID link is not enabled and clicked.", "Fail", null);
			}
			// Click on Cancel link
			if(PageObjects_ProjectActivity.lnk_Cancel(Constant.driver).isEnabled())
			{
				Thread.sleep(2000);
				PageObjects_ProjectActivity.lnk_Cancel(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Cancel link is enabled.","Cancel link", "Cancel link should be enabled and clicked.", "Cancel link is enabled and clicked.", "Pass", null);
			}else{
				Report.ReporterOutput("Step","Verify Cancel link is enabled.","Cancel link", "Cancel link should be enabled and clicked.", "Cancel link is not enabled and clicked.", "Fail", null);
			}
			// Click on Project Name link
	//		if(PageObjects_ProjectActivity.lnk_ProjectName(Constant.driver).isEnabled())
				if(PageObjects_ProjectActivity.lnk_searchedProjectName(Constant.driver).isEnabled())
			{
				Thread.sleep(2000);

				String ProjectName = PageObjects_ProjectActivity.lnk_searchedProjectName(Constant.driver).getText().trim();
				PageObjects_ProjectActivity.lnk_searchedProjectName(Constant.driver).click();

				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Project ID link is enabled.",ProjectName, "Project ID link should be enabled and clicked.", "Project ID link is enabled and clicked.", "Pass", null);
			}else{
				Report.ReporterOutput("Step","Verify Project ID link is enabled.","Project Name", "Project ID link should be enabled and clicked.", "Project ID link is not enabled and clicked.", "Fail", null);
			} //End - Click on Project Name link

			// Drag and Drop Functionality for Default Activity

			int ProjectActivityCt = Integer.parseInt(ProjectActivityCount);
	//		System.out.println("ProjectActivityCt value"+ProjectActivityCt);

			List<WebElement> DefaultActivityValue = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/table/tbody/tr/td/form/table[1]/tbody/tr[1]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[1]/span/select/option")));
	//		System.out.println("Size is: ============="+DefaultActivityValue.size());

			for(int i=0; i<ProjectActivityCt; i++) 
			{
				String DefaultActivity = PageObjects_ProjectActivity.lnk_DefaultActivity(Constant.driver).getText().trim();

				PageObjects_ProjectActivity.lnk_DefaultActivity(Constant.driver).click();
				Thread.sleep(1000);
				PageObjects_ProjectActivity.Button_DefaultActivityToLeft(Constant.driver).click();
				Thread.sleep(1000);
				Report.ReporterOutput("Step","Verify Map Default Activity is selected.",DefaultActivity, "Map Default Activity should be selected.", "Map Default Activity is selected.", "Pass", null);
			}
			defaultActivityMappedValues2 = null;
			// Get values in Default Activity Mapped Text area
			List<WebElement> DefaultActivityMapped = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/table/tbody/tr/td/form/table[1]/tbody/tr[1]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[3]/table/tbody/tr/td/span/select/option")));
	//		System.out.println("Size is: ============="+DefaultActivityMapped.size());

			defaultActivityMappedValues2 = new String[DefaultActivityMapped.size()];
			for(int i=0;i<DefaultActivityMapped.size();i++){
				//Print the text
		//		System.out.println(DefaultActivityMapped.get(i).getText());
				defaultActivityMappedValues2[i] = DefaultActivityMapped.get(i).getText();
			}
			
			
			//*************************************new added functionality ****************************\
			 
			// Map SEPG 
//			int ProjectActivityCt = Integer.parseInt(ProjectActivityCount);
	//		System.out.println("ProjectActivityCt value"+ProjectActivityCt);

			List<WebElement> MapSEPGValue = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/table/tbody/tr/td/form/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[1]/span/select/option")));
	//		System.out.println("Size is: ============="+MapSEPGValue.size());

			for(int i=0; i<ProjectActivityCt; i++) 
			{
				String SEPGActivity = PageObjects_ProjectActivity.lnk_SEPGActivity(Constant.driver).getText().trim();

				PageObjects_ProjectActivity.lnk_SEPGActivity(Constant.driver).click();
				Thread.sleep(1000);
				PageObjects_ProjectActivity.Button_SEPGActivityToLeft(Constant.driver).click();
				Thread.sleep(1000);
				Report.ReporterOutput("Step","Verify Map SEPG Activity is selected.",SEPGActivity, " Map SEPG Activity should be selected.", " Map SEPG Activity is selected.", "Pass", null);
			}
			MapSEPGMappedValues2 = null;
			// Get values in SEPG Activity Mapped Text area
			List<WebElement> MapSEPGValueMapped = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/table/tbody/tr/td/form/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[3]/table/tbody/tr/td/span/select/option")));
		//	System.out.println("Size is: ============="+MapSEPGValueMapped.size());

			MapSEPGMappedValues2 = new String[MapSEPGValueMapped.size()];
			for(int i=0;i<MapSEPGValueMapped.size();i++){
				//Print the text
			//	System.out.println(MapSEPGValueMapped.get(i).getText());
				MapSEPGMappedValues2[i] = MapSEPGValueMapped.get(i).getText();
			}
			
			// Map Custom
			
			List<WebElement> MapCustomValue = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/table/tbody/tr/td/form/table[3]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[1]/span/select/option")));
	//		System.out.println("Size is: ============="+MapCustomValue.size());

			for(int i=0; i<ProjectActivityCt; i++) 
			{
				String MapCustomActivity = PageObjects_ProjectActivity.lnk_CustomActivity(Constant.driver).getText().trim();

				PageObjects_ProjectActivity.lnk_CustomActivity(Constant.driver).click();
				Thread.sleep(1000);
				PageObjects_ProjectActivity.Button_CustomActivityToLeft(Constant.driver).click();
				Thread.sleep(1000);
				Report.ReporterOutput("Step","Verify Map Custom Activity is selected.",MapCustomActivity, "Map Custom Activity should be selected.", "Map Custom Activity is selected.", "Pass", null);
			}
			MapCustomMappedValues2 = null;
			// Get values in Custom Activity Mapped Text area
			List<WebElement> MapCustomValueMapped = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/table/tbody/tr/td/form/table[3]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[3]/table/tbody/tr/td/span/select/option")));
	//		System.out.println("Size is: ============="+MapCustomValueMapped.size());

			MapCustomMappedValues2 = new String[MapCustomValueMapped.size()];
			for(int i=0;i<MapCustomValueMapped.size();i++){
				//Print the text
		//		System.out.println(MapCustomValueMapped.get(i).getText());
				MapCustomMappedValues2[i] = MapCustomValueMapped.get(i).getText();
			}
						 			
			
			//***********************************************End*******************************
			// Click on Save Activity link
			if(PageObjects_ProjectActivity.lnk_SaveActivity(Constant.driver).isEnabled())
			{
				//Thread.sleep(5000);
				Thread.sleep(2000);

				PageObjects_ProjectActivity.lnk_SaveActivity(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Save Activity link is enabled.","Save Activity link", "Save Activity link should be enabled and clicked.", "Save Activity link is enabled and clicked.", "Pass", null);
			}else{
				Report.ReporterOutput("Step","Verify Save Activity link is enabled.","Save Activity link", "Save Activity link should be enabled and clicked.", "Save Activity link is not enabled and clicked.", "Fail", null);
			}
			// verify saved successfully
			Thread.sleep(4000);
			String title1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1")).getText().trim();
			String title2= "Project Activity";

			if(title1.contains(title2))
			{
				Report.ReporterOutput("Step","Verify Project Activity text display on page.","Project Activity text", "Project Activity text should be display on the page.", "Project Activity text displayed on page successfully.", "Pass",null);
				System.out.println("Project Activity page open");
			}else
				Report.ReporterOutput("Step","Verify Project Activity ltext display on page.","Project Activity text", "Project Activity text should be display on the page.", "Project Activity text not display on page successfully", "Fail", null);
				System.out.println("Page not found");
		
			
			
			
			//To verify save Successfull Confirmation by getting the GetText method
			/*Thread.sleep(1000);
			String successMsg=Constant.driver.findElement(By.xpath("//div[contains(@class,'toast-message')]")).getText();
		//	String successMsg=Constant.driver.findElement(By.xpath("//div[contains(.,'Project Activities has been saved successfully')]")).getText();
		//	String successMsg=Constant.driver.findElement(By.xpath("//div[contains(.,'Project Activities has been saved successfully')]")).getText();

			System.out.println(successMsg);

			if (successMsg.contains("successfully")) {
				Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ",successMsg,"Click on save Confirmation Msg","save Confirmation Msg displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ",successMsg,"Click on save Confirmation Msg","save Confirmation Msg is not displayed","Fail",null);
			}*/
			
			
			
			// Click on Transaction link
		/*	if(Dashboard.lnk_Transaction(Constant.driver).isEnabled())
			{			
				Dashboard.lnk_Transaction(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Project Activity link is enabled.","Project Activity link", "Project Activity link should be enabled and clicked.", "Project Activity link is enabled and clicked.", "Pass",null);
			}else{
				Report.ReporterOutput("Step","Verify Project Activity link is enabled.","Project Activity link", "Project Activity link should be enabled and clicked.", "Project Activity link is not enabled and clicked.", "Fail", null);
			}	
			// Click on Timesheet Submission link
			if(Dashboard.lnk_TimesheetSubmission(Constant.driver).isEnabled())
			{			
				Dashboard.lnk_TimesheetSubmission(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Timesheet Submission link is enabled.","Timesheet Submission link", "Timesheet Submission link should be enabled and clicked.", "Timesheet Submission link is enabled and clicked.", "Pass",null);
			}else{
				Report.ReporterOutput("Step","Verify Timesheet Submission link is enabled.","Timesheet Submission link", "Timesheet Submission link should be enabled and clicked.", "Timesheet Submission link is not enabled and clicked.", "Fail", null);
			}	

			// Click on Add Timesheet link


			*//**Altered  code ***********************************************************************************************************//*
			if(PageObjects_TimesheetSubmission.lnk_AddTimesheet(Constant.driver).isEnabled())
			{			
				PageObjects_TimesheetSubmission.lnk_AddTimesheet(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Add Timesheet link is enabled.","Add Timesheet link", "Add Timesheet link should be enabled and clicked.", "Add Timesheet link is enabled and clicked.", "Pass",null);
			}else{
				Report.ReporterOutput("Step","Verify Add Timesheet link is enabled.","Add Timesheet link", "Add Timesheet link should be enabled and clicked.", "Add Timesheet link is not enabled and clicked.", "Fail", null);
			}
			*//**Altered Code End ***********************************************************************************************************//*

			// Read values from Activity dropdown in Timesheet submission page.
			//WebElement elementDropdown = Constant.driver.findElement(By.id("activityId0"));
			WebElement elementDropdown = Constant.driver.findElement(By.xpath("//select[contains(@id,'activityId0')]"));//Activity Drop down 

			Select selectDropdown = new Select(elementDropdown);

			List <WebElement> elementcount = selectDropdown.getOptions();

			String TimesheetActivityValue[]=null;

			TimesheetActivityValue = new String[elementcount.size()];

			for(int i=0;i<elementcount.size();i++){
				//Print the text
				System.out.println(elementcount.get(i).getText());
			TimesheetActivityValue[i] = elementcount.get(i).getText();
			
		
				
				*//*********my code********//*
				String	TimesheetActivityValue1 = elementcount.get(i).getText();
				//String a = original_Saved_SEPGActivityName.get(i).getText();
				TimesheetActivityValue.add(TimesheetActivityValue1);
				SEPGActivityName_Asc1= TimesheetActivityValue.get(i).toString();
				
				
			}
			System.out.println(elementcount.size());
			
	//		Report.ReporterOutput("Step","Verify values shown in Activity dropdown.",TimesheetActivityValue[i], "Activity should be shown same as selected.", "Activity is shown same as selected.", "Pass", null);
			
			for (int i=0; i<elementcount.size(); i++)
			{//Error Here 
				if(defaultActivityMappedValues2[i].equalsIgnoreCase(TimesheetActivityValue[i]))
				{
					System.out.println("String matches ");
					Report.ReporterOutput("Step","Verify values shown in Activity dropdown.",TimesheetActivityValue[i], "Activity should be shown same as selected.", "Activity is shown same as selected.", "Pass", null);
				}
			}*/
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}//**EOC-(End of Class)********************************************************************************************//
