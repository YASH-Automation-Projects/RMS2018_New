package com.yash.RMS.TestAction.Transaction;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.yash.RMS.CustomProperties.CommonMethods;
import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Dashboard.Dashboard;
import com.yash.RMS.POM.Transaction.PageObjects_TimesheetApproval;
import com.yash.RMS.POM.Transaction.PageObjects_TimesheetSubmission;

public class TestAction_TimesheetApproval {

	/*public static String AllweekEndDateList;
	public static ArrayList<String> originallist = new ArrayList<String>();
	public static ArrayList<String> originallist1 = new ArrayList<String>();
	public static String prg_dd_Value;*/

	//************************** Click on TimeSheet Submission Page *******************************

	public static void TimesheetApprovalPage() throws Throwable
	{
		// Click on Transaction link
		try {
			if(PageObjects_TimesheetApproval.lnk_Transaction(Constant.driver).isEnabled())
			{			
				PageObjects_TimesheetApproval.lnk_Transaction(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Transaction link is enabled.","Transaction link", "Transaction link should be enabled and clicked.", "Transaction link is enabled and clicked.", "Pass", null);
			}else{
				Report.ReporterOutput("Step","Verify Transaction link is enabled.","Transaction link", "Transaction link should be enabled and clicked.", "Transaction link is not enabled and clicked.", "Fail", null);
			}
			// Click on TimeSheet Submission link
			if(PageObjects_TimesheetApproval.lnk_TimesheetApproval(Constant.driver).isEnabled())
			{			
				PageObjects_TimesheetApproval.lnk_TimesheetApproval(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Timesheet Approval link is enabled.","Timesheet Approval link", "Timesheet Approval link should be enabled and clicked.", "Timesheet Approval link is enabled and clicked.", "Pass",null);
			}else{
				Report.ReporterOutput("Step","Verify Timesheet Approval link is enabled.","Timesheet Approval link", "Timesheet Approval link should be enabled and clicked.", "Timesheet Approval link is not enabled and clicked.", "Fail", null);
			}	
			//Check whether TimeSheet Approval page is open or not.

			String msg1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1")).getText().trim();
			String msg2= "Timesheet Approval";

			if(msg1.contains(msg2))
			{
				System.out.println("Timesheet Approval page open");
			}else{
				System.out.println("Timesheet Approval page not found");
			}
		} catch (Exception e) {
			System.out.println("Exception in NAvigation to Timesheet Approval page ");
			e.printStackTrace();
		}
	}
	/**APPROVE TIMESHEET FUNCTION **************************************************************************************************/

	//public static void addNewTimesheet(String ProjectName,String ActivityName,String[] addNewTimesheetArrayHrs,String[] addNewTimesheetArrayCmt) throws Throwable //changes with project name

	//public static void ApproveTimesheet(String PersonName) throws Throwable //changes with project name
	public static void ApproveTimesheet(String Empoyee_ID) throws Throwable //changes with project name
	{
		/**Start : Navigation code to  Time sheet page ***Comment below code when we do not run the Add time sheet Individually *********************************/
		// Click on Transaction link
		try {
			if(PageObjects_TimesheetApproval.lnk_Transaction(Constant.driver).isEnabled())
			{			
				PageObjects_TimesheetApproval.lnk_Transaction(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Transaction link is enabled.","Transaction link", "Transaction link should be enabled and clicked.", "Transaction link is enabled and clicked.", "Pass", null);
			}else{
				Report.ReporterOutput("Step","Verify Transaction link is enabled.","Transaction link", "Transaction link should be enabled and clicked.", "Transaction link is not enabled and clicked.", "Fail", null);
			}
			// Click on TimeSheet Submission link
			if(PageObjects_TimesheetApproval.lnk_TimesheetApproval(Constant.driver).isEnabled())
			{			
				PageObjects_TimesheetApproval.lnk_TimesheetApproval(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Timesheet Approval link is enabled.","Timesheet Approval link", "Timesheet Approval link should be enabled and clicked.", "Timesheet Approval link is enabled and clicked.", "Pass",null);
			}else{
				Report.ReporterOutput("Step","Verify Timesheet Approval link is enabled.","Timesheet Approval link", "Timesheet Approval link should be enabled and clicked.", "Timesheet Approval link is not enabled and clicked.", "Fail", null);
			}	
			//Check whether TimeSheet Approval page is open or not.

			String msg1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1")).getText().trim();
			String msg2= "Timesheet Approval";

			if(msg1.contains(msg2))
			{
				System.out.println("Timesheet Approval page open");
			}else{
				System.out.println("Timesheet Approval page not found");
			}
		} catch (Exception e) {
			System.out.println("Exception in NAvigation to Timesheet Approval page ");
			e.printStackTrace();
		}
		/*********************************************************************************************************************************/
		/**Enter data in to SEARCH field***/
		if(PageObjects_TimesheetApproval.txtbx_search(Constant.driver).isEnabled()){	
			//PageObjects_TimesheetApproval.txtbx_search(Constant.driver).click();
			//Search with the Name 
			//PageObjects_TimesheetApproval.txtbx_search(Constant.driver).sendKeys(PersonName); //to check with excel variable
			//Search with the Employee id,, which we can pass through the excel sheet and a parameter to the fucntion as Personal Name .
			PageObjects_TimesheetApproval.txtbx_search(Constant.driver).sendKeys(Empoyee_ID); //to check with excel variable

			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Search Text box is enabled.","Search box is Enable", "Search Box should be enabled and clickable.", "Search Box is enabled and clickable.", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify Search Text box is enabled.","Search box is Enable", "Search Box should be enabled and clickable.", "Search Box is not Enabled and clickable.", "Fail", null);
		}	
		//Click on search Result record  **************//

		if(PageObjects_TimesheetApproval.row_1stEmployeeId(Constant.driver).isEnabled()){	
			PageObjects_TimesheetApproval.row_1stEmployeeId(Constant.driver).click();
			Thread.sleep(2000);
			//PageObjects_TimesheetApproval.txtbx_search(Constant.driver).sendKeys(PersonName); //to check with excel variable
			Report.ReporterOutput("Step","Verify Search Record is displayed and enabled.","Verify Search Record Displayed", " Search Record should be enabled and clickable.", " Search Record is Enabled and clickable.", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify Search Record is displayed and enabled.","Verify Search Record Displayed", " Search Record should be enabled and clickable.", "Search Record is not Enabled and clickable.", "Fail", null);
		}
		//**to Hit the Edit button********/
		if(PageObjects_TimesheetApproval.lnk_Edit(Constant.driver).isEnabled()){	
			PageObjects_TimesheetApproval.lnk_Edit(Constant.driver).click();
			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Edit Button enabled .","Verify Edit Button is Enabled", " Edit Button is should be enabled and clickable.", "Edit Button is enabled and clickable.", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify Edit Button enabled .","Verify Edit Button is Enabled", " Edit Button is should be enabled and clickable.", "Edit Button is not enabled and clickable.", "Fail", null);
		}

		/***to enter planned hours********************/
		if(PageObjects_TimesheetApproval.edit_PlannedHours(Constant.driver).isEnabled()){	
			PageObjects_TimesheetApproval.edit_PlannedHours(Constant.driver).click();
			PageObjects_TimesheetApproval.edit_PlannedHours(Constant.driver).clear();
			//Thread.sleep(200);
			PageObjects_TimesheetApproval.edit_PlannedHours(Constant.driver).sendKeys("1");
			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Planned Hours Edit field is editable.","Verify Planned Hours Edit field is eitable", " Planned Hours Edit field should be editable.", "Planned Hours Edit field is editable.", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify Planned Hours Edit field is editable.","Verify Planned Hours Edit field is eitable", " Planned Hours Edit field should be editable.", "Planned Hours Edit field is NOT editable.", "Fail", null);
		}

		/***to enter Billed  hours******************/
		if(PageObjects_TimesheetApproval.edit_Billed_Hours(Constant.driver).isEnabled()){	
			PageObjects_TimesheetApproval.edit_Billed_Hours(Constant.driver).click();
			PageObjects_TimesheetApproval.edit_Billed_Hours(Constant.driver).clear();
			PageObjects_TimesheetApproval.edit_Billed_Hours(Constant.driver).sendKeys("2");
			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Billed Hours Edit field is editable.","Verify Billed Hours Edit field is eitable", " Billed Hours Edit field should be editable.", "Billed Hours Edit field is editable.", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify Billed Hours Edit field is editable.","Verify Billed Hours Edit field is eitable", " Billed Hours Edit field should be editable.", "Billed Hours Edit field is NOT editable.", "Fail", null);
		}
		/***to enter Remarks*******************/
		if(PageObjects_TimesheetApproval.edit_Remarks(Constant.driver).isEnabled()){	
			PageObjects_TimesheetApproval.edit_Remarks(Constant.driver).click();
			PageObjects_TimesheetApproval.edit_Remarks(Constant.driver).clear();

			PageObjects_TimesheetApproval.edit_Remarks(Constant.driver).sendKeys("2");
			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Remark field is editable.","Verify Remark field is eitable", " Remark field should be editable.", "Remark field is editable.", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify Remark field is editable.","Verify Remark field is eitable", " Remark field should be editable.", "Remark field is NOT editable.", "Fail", null);
		}
		/**Click on SAVE the Report *****************/
		if(PageObjects_TimesheetApproval.lnk_Save(Constant.driver).isEnabled())
		{			
			PageObjects_TimesheetApproval.lnk_Save(Constant.driver).click();
			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Send for save button is enabled and clickable.","Send for save button", "save button should be enabled and clickable.", "Save button is enabled and clickable.", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify Send for save button is enabled and clickable.","Send for save button", "save button should be enabled and clickable.", "Save button is enabled and clickable..", "Fail", null);
		}
		/**Verification  point:  :  Verify for img_RejectTimesheet is enable  *****************/
		WebElement reject_timesheet = Constant.driver.findElement(By.xpath("//img[contains(@src,'resources/images/reject_timesheet.png')]"));
		Actions action = new Actions(Constant.driver);
		action.moveToElement(reject_timesheet).perform();
		reject_timesheet.getAttribute("tittle");

		System.out.println ("tittle");

		/*if(PageObjects_TimesheetApproval.img_RejectTimesheet(Constant.driver).isEnabled())
		{  
			Thread.sleep(1000);
			Report.ReporterOutput("Step","Verify ImageLink of RejectTimesheet is Enables.","Image of RejectTimesheet", "Image of RejectTimesheet should be enabled.", "Image of RejectTimesheet is Enabled.", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify ImageLink of RejectTimesheet is Enables. .","Image of RejectTimesheet", "Image of RejectTimesheet should be enabled.", "Image of RejectTimesheet is NOT Enabled.", "Fail", null);
		}

		 */
		Thread.sleep(1000);
		/**Verify for  img_Approve_Timesheet is enable  *****************/
		WebElement approve_timesheet = Constant.driver.findElement(By.xpath("//img[@src='resources/images/review_icon.png']"));
		Actions action1 = new Actions(Constant.driver);
		action.moveToElement(reject_timesheet).perform();
		approve_timesheet.getAttribute("tittle");

		System.out.println ("tittle");	
		/*if(PageObjects_TimesheetApproval.img_ApproveTimesheet(Constant.driver).isEnabled())
		{		
			Thread.sleep(1000);
			Report.ReporterOutput("Step","Verify ImageLink of Approva TimeSheet is Enables.","Image of Approve Timesheet", "Image of Approve Timesheet should be enabled.", "Image of Approve Timesheet is Enabled.", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify ImageLink of Approva TimeSheet is Enables.","Image of Approve Timesheet", "Image of Approve Timesheet should be enabled.", "Image of Approve Timesheet is Enabled.", "Fail", null);
		}*/
		/**click on Reject Time sheet  *****************/	

		if(PageObjects_TimesheetApproval.txt_Rejection(Constant.driver).isEnabled())
		{			
			PageObjects_TimesheetApproval.txt_Rejection(Constant.driver).click();
			PageObjects_TimesheetApproval.txt_Rejection(Constant.driver).sendKeys(" Timesheet Rejected");
			//PageObjects_TimesheetApproval.txt_Rejection(Constant.driver).sendKeys(" Rejected Timesheet  Reason : Hours not filled correclty ");
			Thread.sleep(1000);
			Report.ReporterOutput("Step","Verify ImageLink of RejectTimesheet is Enables.","Image of RejectTimesheet", "Image of RejectTimesheet should be enabled and clickable .", "Image of RejectTimesheet is Enabled.", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify ImageLink of RejectTimesheet is Enables. .","Image of RejectTimesheet", "Image of RejectTimesheet should be enabled and clickable.", "Image of RejectTimesheet is NOT Enabled.", "Fail", null);
		}
		/**click Ok button for Rejection Edit  *****************/	

		if(PageObjects_TimesheetApproval.btn_ok(Constant.driver).isEnabled())
		{			
			PageObjects_TimesheetApproval.btn_ok(Constant.driver).click();
			Thread.sleep(1000);
			Report.ReporterOutput("Step","Verify Ok button is on RejectTimeSheet is enable and clickable.","Ok button on  RejectTimeSheet", " Ok button is on RejectTimeSheet  should be enabled clakable .", "Ok button on Reject Time sheet is Enabled clicked.", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify Ok button is on RejectTimeSheet is enable and clickable.","Ok button on  RejectTimeSheet", " Ok button is on RejectTimeSheet  should be enabled clakable .", "Ok button on Reject Time sheet is not Enabled and claikable icked.", "Fail", null);
		}
	}
}/**END OF CLASS*************************************************************************************************************************************/


/**********************************************************************************************************************************************************************************************/

/******To verify the Image Status it should  be not submitted then only we need to work on it ** to implement the action class move the cursor to it **/
//img_Statustimesheet
/* or (int k=j; k<ApproveStatus.size(); k++) {
			String ApproveStatus1 = ApproveStatus.get(k).getAttribute("title");
			//String ApproveStatus1 = ApproveStatus.get(i).getAttribute("title");
			System.out.println(ApproveStatus1);

			if(AllweekEndDateList.contentEquals("01/30/2016") && (ApproveStatus1.contentEquals("Not Submitted"))){
				Thread.sleep(400);
				Project.get(j).click();
				break;
				//Thread.sleep(200);   //*Click on Project Link which will satisfy the date and  approval Status then 

			}break;
 */
/******************************************************/

//**Select Month***********/

/*		if(PageObjects_TimesheetSubmission.lnk_AddTimesheetCalendar(Constant.driver).isEnabled())
		{								
			PageObjects_TimesheetSubmission.lnk_AddTimesheetCalendar(Constant.driver).click();
			PageObjects_TimesheetSubmission.dropdown_AddTimesheetMonth(Constant.driver).click();

			//No Need to SELECT  as January month will be Bydefault selected 
			Select dropdown = new Select(PageObjects_TimesheetSubmission.dropdown_AddTimesheetMonth(Constant.driver));
			//dropdown.selectByVisibleText("Feb");
			dropdown.selectByVisibleText("Jan");

			Report.ReporterOutput("Step","Verify Month is selected.","Month selection", "Month should be selected.", "Month is selected.", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify Month is selected.","Month", "Month should be selected.", "Month is not selected.", "Fail", null);
		}*/



//****Select Year*******************/
/*		if(PageObjects_TimesheetSubmission.lnk_AddTimesheetCalendar(Constant.driver).isEnabled())
		{	
			PageObjects_TimesheetSubmission.dropdown_AddTimesheetYear(Constant.driver).click();
			//Year to Select form Drop down 

			Select dropdown = new Select(PageObjects_TimesheetSubmission.dropdown_AddTimesheetYear(Constant.driver));
			dropdown.selectByVisibleText("2016");

			Thread.sleep(2000);
			Report.ReporterOutput("Step","Verify Year is selected.","Year selection", "Year should be selected.", "Year is selected.", "Pass", null);
		}else{	
			Report.ReporterOutput("Step","Verify Year is selected.","Year selection", "Year should be selected.", "Year is not selected.", "Fail", null);
		}

		//****To select the Date from CALENDER for  mention Month and Year*******************/
//Thread.sleep(1000);
/*		if(PageObjects_TimesheetSubmission.lnk_AddTimesheetCalendar(Constant.driver).isEnabled())
		{	
			//To click on Date (mention date in POM )
			PageObjects_TimesheetSubmission.lnk_AddTimesheetDate_date_click(Constant.driver).click();
			Thread.sleep(1000);

			String date=PageObjects_TimesheetSubmission.lnk_AddTimesheetDate_date_click(Constant.driver).getText().trim();
			Thread.sleep(2000);

			//Report.ReporterOutput("Step","Verify Date is selected.","Sep "+date, "Date should be selected.", "Date is selected.", "Pass", null);
			Report.ReporterOutput("Step","Verify Date is selected.","Date selection", "Date should be selected.", "Date is selected.", "Pass", null);
		}else{	
			Report.ReporterOutput("Step","Verify Date is selected.","Date selection", "Date should be selected.", "Date is not selected.", "Fail", null);
		}*/



/**************************************************************************************************************/
//Project Drop down : entire Column

//ROW to capture for Project rows 
/*List<WebElement> Project_dd_Row = Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/form/table/tbody/tr/td[2]/select"));

		//ROW to capture for ACTIVITY rows
		List<WebElement> Activity_dd_Row = Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/form/table/tbody/tr/td[3]/select"));

		for(int i=0; i<Project_dd_Row.size(); i++){

			for(int d=i; d<Activity_dd_Row.size(); d++){
				Thread.sleep(700);
				Project_dd_Row.get(i).click();

				int k =i+1;

				Select Project = new Select	(Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/form/table/tbody/tr["+k+"]/td[2]/select")));

				Select Activity = new Select (Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/form/table/tbody/tr["+k+"]/td[3]/select")));

				Thread.sleep(1000);

				List <WebElement> proj_oSize = Project.getOptions();
				for(int j=0;j<proj_oSize.size();j++){
					String prg_dd_Value = Project.getOptions().get(j).getText();

					//System.out.println(prg_dd_Value);
					//if(prg_dd_Value.equals("TCI Staff Aug-BG4-BU9")){

					if(prg_dd_Value.equals("JDTCI")){ //mention the PROJECT NAME here 
						//if(prg_dd_Value.equals(ProjectName)){ to mention theVariable passes in the function paramter to accept the  PROJECT NAMe directly we can send it here 

						//System.out.println(" JDTCI : Value Selected successfully : passed" );
						Thread.sleep(1000);
						Project.getOptions().get(j).click();

						Thread.sleep(800);
						Activity_dd_Row.get(d).click();

						List <WebElement> act_oSize = Activity.getOptions();
						for(int y=0; y < act_oSize.size() ;y++){

							String act_dd_Value = Activity.getOptions().get(y).getText();
							//System.out.println(act_dd_Value);
							//if(act_dd_Value.equals("AMS - Documentation")){
							if(act_dd_Value.equals("GEN - Internal Request FROM Deere")){
								Thread.sleep(400);
								Activity.getOptions().get(y).click();
								//System.out.println(" For Activity Drop down :GEN - Internal Request FROM Deere : Value seleceted successfully : passed" );
								Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/form/table/tbody/tr["+k+"]/td[4]/input")).click();

								//Report.ReporterOutput("Step","Verify hours text box for "+"Ticket Number"+k+" is enabled.",addNewTimesheetArrayHrs[m-6], "Hours textbox for "+weekTimesheet[-6]+" should be enabled and value should be entered.", "Hours textbox for "+weekTimesheet[m-6]+" is enabled and value is entered.", "Pass", null);
 *//** Logic to enter HOURS and COMMENTS-To put in loop for REMAINING rows--working code ----*//*
									//HIT OK button for comment 
										Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div/form/table/tbody/tr["+k+"]/td["+m+"]/div/div/div[2]/input")).click();//for comment ok button
				//Report.ReporterOutput("Step","Verify hours text box for "+weekTimesheet[m-6]+" is enabled.",addNewTimesheetArrayHrs[m-6], "Hours textbox for "+weekTimesheet[m-6]+" should be enabled and value should be entered.", "Hours textbox for "+weekTimesheet[m-6]+" is enabled and value is entered.", "Pass", null);
				Report.ReporterOutput("Step","Verify hours text box for  "+m+ " is enabled.",m, "Hours textbox for "+m+" should be enabled and value should be entered.", "Hours textbox for "+m+" is enabled and value is entered.", "Pass", null);

								}
							}
						}
					}
				}
				break;
			}	//END of ACTIVITY  Drop down for Loop
		}	//END of PROJECT  Drop down for Loop
  */		/******************************************************************************************************************/
//	Thread.sleep(1000);
//Click on SAVE the Report **************

/*	if(PageObjects_TimesheetSubmission.btn_save(Constant.driver).isEnabled())
		{			
			PageObjects_TimesheetSubmission.btn_save(Constant.driver).click();
			Thread.sleep(1000);
			Report.ReporterOutput("Step","Verify Send for save button is enabled.","Send for save button", "save button should be enabled and clickable.", "Save button is enabled and clickable.", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify Send for save button is enabled.","Send for save button", "save button should be enabled and clickable.", "Save button is enabled and clickable..", "Fail", null);
		}*/
//**********get values in array for weekEndDate date *****************/
//Start date :01/24/2016 end Data : 01/30/2016
//NOTE; ** : Here we need to mention the Week Start Date adn not the Week end date

/*String xyz = "01/30/2016";	// Jan 30 2017 to capture the Project Name from Excel sheet
		//String xyz = "01/24/2016";	// Jan 23 2017 to capture the Project Name from Excel sheet

		Thread.sleep(1000);
		List<WebElement> Project= Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[4]/div[1]/div[2]/div/table/tbody/tr/td[1]/a"));

		//Each WeekEndDate  ROW to capture
		List<WebElement> WeekEndDate = Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[4]/div[1]/div[2]/div/table/tbody/tr/td[2]"));

		List<WebElement> ApproveStatus = Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[4]/div[1]/div[2]/div/table/tbody/tr/td[4]/img"));// for Image to verify with tittle : not submitted
		//Approve Status
		Thread.sleep(1000);
		for(int j=0; j<Project.size(); j++){ 
			String Projects = Project.get(j).getText();
			System.out.println(Projects);

			for(int i=j; i<WeekEndDate.size(); i++){ 
				Thread.sleep(400);
				AllweekEndDateList = WeekEndDate.get(i).getText();
				System.out.println(AllweekEndDateList);

				for (int k=j; k<ApproveStatus.size(); k++) {
					String ApproveStatus1 = ApproveStatus.get(k).getAttribute("title");
					//String ApproveStatus1 = ApproveStatus.get(i).getAttribute("title");
					System.out.println(ApproveStatus1);

					if(AllweekEndDateList.contentEquals("01/30/2016") && (ApproveStatus1.contentEquals("Not Submitted"))){
						Thread.sleep(400);
						Project.get(j).click();
						break;
						//Thread.sleep(200);   //*Click on Project Link which will satisfy the date and  approval Status then 

					}break;
				}break;
			} // after the condition is positive still it once agin ogo in teh project loop and check for condition
		}*/
/**********************************************************************************************************************************/
//Click on Send for Approval button**************
/*		Thread.sleep(1000);
		if(PageObjects_TimesheetSubmission.btn_SendforApproval_AddNewTimesheet(Constant.driver).isEnabled()){
			PageObjects_TimesheetSubmission.btn_SendforApproval_AddNewTimesheet(Constant.driver).click();
			Thread.sleep(1000);
			Report.ReporterOutput("Step","Verify Send for Approval button is enabled.","Send for Approval button", "Send for Approval button should be enabled and clicked.", "Send for Approval button is enabled and clicked.", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify Send for Approval button is enabled.","Send for Approval button", "Send for Approval button should be enabled and clicked.", "Send for Approval button is not enabled and clicked.", "Fail", null);
		}

		// Switching to Alert**confirmation message box : Are you sure you want to submit the time sheet for approval"************     
		Alert alert=Constant.driver.switchTo().alert();	// Capturing alert message.    
		String alertMessage=Constant.driver.switchTo().alert().getText();	// Displaying alert message		
		System.out.println(alertMessage);			// Accepting alert		
		alert.accept();		
		Constant.driver.switchTo().defaultContent();
		System.out.println("********We are switch back to window*******");	//Question : why it i s not getting  stop here , still goin to read the excel for activity data  why so  
	}*/  /*ENd of Function Add New Time sheet*/

/**************************************************************************************************************/





