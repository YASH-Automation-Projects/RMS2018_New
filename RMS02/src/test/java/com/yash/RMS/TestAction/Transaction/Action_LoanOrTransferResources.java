package com.yash.RMS.TestAction.Transaction;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Transaction.PageObjects_TransactionLoanOrTransferResources;

public class Action_LoanOrTransferResources {
	
	
	//************************** Click on Loan Or Transfer Resources Page *******************************
	public static void LoanOrTransferResourcesPageNavigation() throws Throwable{
	
		// Click on Transaction link
		Thread.sleep(2000);
		try {
			if (PageObjects_TransactionLoanOrTransferResources.lnk_Transaction(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.lnk_Transaction(Constant.driver).isEnabled()){
				PageObjects_TransactionLoanOrTransferResources.lnk_Transaction(Constant.driver).click();

				Report.ReporterOutput("STEP","Verify Transaction link is enabled.","Transaction link", "Transaction link should be enabled and clicked.", "Transaction link is enabled and clicked.", "Pass", null);
			}
			else
			{
				Report.ReporterOutput("STEP","Verify Transaction link is enabled.","Transaction link", "Transaction link should be enabled and clicked.", "Transaction link is not enabled and clicked.", "Fail", null);
			}
			// Click on Loan Or Transfer Resource link
			Thread.sleep(2000);
			if(PageObjects_TransactionLoanOrTransferResources.lnk_LoanOrTransferResources(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.lnk_LoanOrTransferResources(Constant.driver).isEnabled())
			{			
				PageObjects_TransactionLoanOrTransferResources.lnk_LoanOrTransferResources(Constant.driver).click();

				Report.ReporterOutput("Step","Verify Loan Or Transfer Resources link is enabled.","Loan Or Transfer Resources link", "Loan Or Transfer Resources link should be enabled and clicked.", "Loan Or Transfer Resources link is enabled and clicked.", "Pass",null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify Loan Or Transfer Resources link is enabled.","Loan Or Transfer Resources link", "Loan Or Transfer Resources link should be enabled and clicked.", "Loan Or Transfer Resources link is not enabled and clicked.", "Fail", null);
			}
			Thread.sleep(4000);
			String Text_Transaction_LoanOrTransferResources = PageObjects_TransactionLoanOrTransferResources.Text_LoanOrTransferResources(Constant.driver).getText();

			if (Text_Transaction_LoanOrTransferResources.equalsIgnoreCase("Loan or Transfer Resources")) {

				Report.ReporterOutput("STEP","Verify Text Loan or Transfer Resources is Visible ","Text Loan or Transfer Resources"," Click on Text Loan or Transfer Resources "," Text Loan or Transfer Resources is visible","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify Text Loan or Transfer Resources is Visible  ","Text Loan or Transfer Resources"," Click on Text Loan or Transfer Resources "," Text Loan or Transfer Resources is not visible","Fail",null);
			}
			Thread.sleep(4000);
				

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	//*******************************************
	
		
	public static void Create_LoanOrTransferResources(String Resorce_Name,String Event_name, String Employee_Category,String Employee_Id,String Ownership,String BaseLocation,String designation_Name,String Current_RM1,String Contact_Number1, String Confirmation_Date, String Release_Date, String BGH_Name , String BGH_Comments,String BGHComments_Date, String Current_Location,String Current_RM2,String Contact_Number2,String Appraisal_Date1,String LoanTransfer_DateFrom, String BUH_Name,String BUH_Comments,String BUComments_Date,String Grade, String Parent_BGBU,String Current_BGBU,String Email_Id,String DOJ,String Appraisal_Date2,String LoanTransfer_DateTo,String HRName,String HR_Comments,String HRComments_Date) throws Throwable
	{
		
		
       		Thread.sleep(2000);
	try {
		//********************************Verify Resource Name field *********************************************************************
		if(PageObjects_TransactionLoanOrTransferResources.dropdown_ResourceName(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.dropdown_ResourceName(Constant.driver).isEnabled())
		{		

			
		
			
			WebElement enterRes = PageObjects_TransactionLoanOrTransferResources.dropdown_ResourceName(Constant.driver);
			
			enterRes.click();
			
			Thread.sleep(2000);
			List<WebElement> resourceNameList = Constant.driver.findElements(By.xpath("html/body/ul[2]/li/a"));
			
			for(int i=0; i< resourceNameList.size(); i++){
				
				String resource_Name = resourceNameList.get(i).getText();
				
				
				
				if( resource_Name.contentEquals(Resorce_Name)){
					
					 
					resourceNameList.get(i).click();
					Thread.sleep(2000);
				
				
			
			
		
				
					
					break;
				}
				
			}
										
			
			Report.ReporterOutput("Step","Verify Resource Name field is enabled and Clickable.", Resorce_Name , "Resource Name field should be enabled and Clickable successfully.", "Resource Name field is enabled and Clickable successfully.", "Pass",null);
		}	
		else
		{
			Report.ReporterOutput("Step","Verify Resource Name field is enabled and Clickable .",Resorce_Name, "Resource Name field should be enabled and Clickable successfully.", "Resource Name field is  not enabled and Clickable successfully.", "Fail", null);
		}
		
		//********************************Verify Event field *********************************************************************
	if(PageObjects_TransactionLoanOrTransferResources.dropdown_Event(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.dropdown_Event(Constant.driver).isEnabled())
		{		

			
			
			
			
			WebElement Event_Click = PageObjects_TransactionLoanOrTransferResources.dropdown_Event(Constant.driver);
			
			Event_Click.click();
			
			Thread.sleep(2000);
			List<WebElement> EventList = Constant.driver.findElements(By.xpath("html/body/ul[16]/li/a"));
			
			for(int i=0; i< EventList.size(); i++){
				
				String Event = EventList.get(i).getText();
				
				//System.out.println("EventList.............." +  Event );
				
				if( Event.contentEquals(Event_name)){
					
					
					EventList.get(i).click();
					
					break;
				}
				
			}
										
			
			Report.ReporterOutput("Step","Verify Event field is enabled and clickable.",Event_name, "Event field should be enabled and Clickable successfully.", "Event field is enabled and Clickable successfully.", "Pass",null);
		}	
		else
		{
			Report.ReporterOutput("Step","Verify Event field is enabled and clickable.",Event_name, "Event field should be enabled and Clickable successfully.", "Event field is  not enabled and Clickable successfully.", "Fail", null);
		}
//********************************Verify Employee Category field *********************************************************************
	
	if(PageObjects_TransactionLoanOrTransferResources.dropdown_EmployeeCategory(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.dropdown_EmployeeCategory(Constant.driver).isEnabled())
	{		

		
		
		
		Thread.sleep(2000);
		
		WebElement EmployeeCategory_Click = PageObjects_TransactionLoanOrTransferResources.dropdown_EmployeeCategory(Constant.driver);
		
		EmployeeCategory_Click.click();
		
		Thread.sleep(2000);
		List<WebElement> employeeCategoryList = Constant.driver.findElements(By.xpath("html/body/ul[3]/li/a"));
		
		for(int i=0; i< employeeCategoryList.size(); i++){
			
			String employee_Category = employeeCategoryList.get(i).getText();
			
			//System.out.println("employee_Category.............." +  employee_Category );
			
			if( employee_Category.contentEquals(Employee_Category)){
				
				
				employeeCategoryList.get(i).click();
				
				break;
			}
			
		}
									
		
		Report.ReporterOutput("Step","Verify Employee Category field is enabled and clickable.",Employee_Category, "Employee Category field should be enabled and clickable successfully.", "Employee Category field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify Employee Category field is enabled and clickable.",Employee_Category, "Employee Category field should be enabled and clickable successfully.", "Employee Category field is  not enabled and clickable successfully.", "Fail", null);
	}
	if(PageObjects_TransactionLoanOrTransferResources.textbox_EmployeeId(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.textbox_EmployeeId(Constant.driver).isEnabled())
	{		

		
		
		Select resourceName =new Select(Constant.driver.findElement(By.xpath("//*[@id='loadTransderTable']/tbody/tr[1]/td[2]/span/input")));
		resourceName.selectByVisibleText(Resorce_Name);
		
		Thread.sleep(2000);
		PageObjects_TransactionLoanOrTransferResources.textbox_EmployeeId(Constant.driver).clear();
		PageObjects_TransactionLoanOrTransferResources.textbox_EmployeeId(Constant.driver).sendKeys(Employee_Id);
		WebElement enterRes = PageObjects_TransactionLoanOrTransferResources.textbox_EmployeeId(Constant.driver);
		
		enterRes.click();
		
		Thread.sleep(2000);
		List<WebElement> resourceNameList = Constant.driver.findElements(By.xpath("html/body/ul[2]/li/a"));
		
		for(int i=0; i< resourceNameList.size(); i++){
			
			String resource_Name = resourceNameList.get(i).getText();
			
			//System.out.println("value.............." +  resource_Name );
			
			if( resource_Name.contentEquals(Resorce_Name)){
				
				
				resourceNameList.get(i).click();
				
				break;
			}
			
		}
									
		
		Report.ReporterOutput("Step","Verify Employee Id field is enabled and clickable.",Employee_Id, "Employee Id field should be enabled and clickable successfully.", "Employee Id field is enabled and clickable successfully.", "Fail",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify Employee Id field is enabled and clickable.",Employee_Id, "Employee Id field should be enabled and clickable successfully.", "Employee Id field is not enabled and clickable successfully.", "Pass", null);
	}
	
	//********************************Verify Designation field *********************************************************************
	
	if(PageObjects_TransactionLoanOrTransferResources.dropdown_Designation(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.dropdown_Designation(Constant.driver).isEnabled())
	{		

		
		
		
		
		Thread.sleep(2000);
		
		WebElement Designation_Click = PageObjects_TransactionLoanOrTransferResources.dropdown_Designation(Constant.driver);
		
		Designation_Click.click();
		
		Thread.sleep(2000);
		List<WebElement> DesignationList = Constant.driver.findElements(By.xpath("html/body/ul[6]/li/a"));
		
		for(int i=0; i< DesignationList.size(); i++){
			
			String designation = DesignationList.get(i).getText();
			
			//System.out.println("value.............." +  designation );
			
			if( designation.contentEquals(designation_Name)){
				
				
				DesignationList.get(i).click();
				
				break;
			}
			
		}
									
		
		Report.ReporterOutput("Step","Verify Designation field is enabled and clickable  .",designation_Name, "Designation field should be enabled and clickable successfully.", "Designation field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify Designation field is enabled and clickable.",designation_Name, "Designation field should be enabled and clickable successfully.", "Designation field is  not enabled and clickable successfully.", "Fail", null);
	}
	
	//********************************Verify Ownership field *********************************************************************
	
	if(PageObjects_TransactionLoanOrTransferResources.dropdown_Ownership(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.dropdown_Ownership(Constant.driver).isEnabled())
	{		

		

		
		Thread.sleep(2000);
		
		WebElement ownership_Click = PageObjects_TransactionLoanOrTransferResources.dropdown_Ownership(Constant.driver);
		
		ownership_Click.click();
		
		Thread.sleep(2000);
		List<WebElement> ownershipList = Constant.driver.findElements(By.xpath("html/body/ul[5]/li/a"));
		
		for(int i=0; i< ownershipList.size(); i++){
			
			String ownership_Name = ownershipList.get(i).getText();
			
			//System.out.println("ownership_Name.............." +  ownership_Name );
			
			if( ownership_Name.contentEquals(Ownership)){
				
				
				ownershipList.get(i).click();
				
				break;
			}
			
		}
									
		
		Report.ReporterOutput("Step","Verify Ownership field is enabled and clickable.",Ownership, "Ownership field should be enabled and clickable successfully.", "Ownership field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify Ownership field is enabled and clickable.",Ownership, "Ownership field should be enabled and clickable successfully.", "Ownership field is  not enabled and clickable successfully.", "Fail", null);
	}
	
	//********************************Verify Base Location field *********************************************************************
	if(PageObjects_TransactionLoanOrTransferResources.dropdown_BaseLocation(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.dropdown_BaseLocation(Constant.driver).isEnabled())
	{		

		
		
		
		
		Thread.sleep(1000);
		
		WebElement baseLocation_Click = PageObjects_TransactionLoanOrTransferResources.dropdown_BaseLocation(Constant.driver);
		
		baseLocation_Click.click();
		
		Thread.sleep(2000);
		List<WebElement> baseLocationList = Constant.driver.findElements(By.xpath("html/body/ul[8]/li/a"));
		
		for(int i=0; i< baseLocationList.size(); i++){
			
			String baseLocation_Name = baseLocationList.get(i).getText();
			
			//System.out.println("baseLocation_Name.............." +  baseLocation_Name );
			
			if( baseLocation_Name.contentEquals(BaseLocation)){
				
				
				baseLocationList.get(i).click();
				
				break;
			}
			
		}
									
		
		Report.ReporterOutput("Step","Verify Base Location field is enabled and clickable.",BaseLocation, "Base Location field should be enabled and clickable successfully.", "Base Location field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify Base Location field is enabled and clickable.",BaseLocation, "Base Location field should be enabled and clickable successfully.", "Base Location field is  not enabled and clickable successfully.", "Fail", null);
	}
	
	//********************************Verify Current RM 1 field *********************************************************************
	
	if(PageObjects_TransactionLoanOrTransferResources.dropdown_CurrentRM1(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.dropdown_CurrentRM1(Constant.driver).isEnabled())
	{		

		
		
	
		
		Thread.sleep(2000);
		
		WebElement CurrentRM1_Click = PageObjects_TransactionLoanOrTransferResources.dropdown_CurrentRM1(Constant.driver);
		
		CurrentRM1_Click.click();
		
		Thread.sleep(2000);
		List<WebElement> CurrentRM1List = Constant.driver.findElements(By.xpath("html/body/ul[11]/li/a"));
		
		for(int i=0; i< CurrentRM1List.size(); i++){
			
			String CurrentRM1 = CurrentRM1List.get(i).getText();
			
			//System.out.println("Current RM 1.............." +  CurrentRM1 );
			
			if( CurrentRM1.contentEquals(Current_RM1)){
				
				
				CurrentRM1List.get(i).click();
				
				break;
			}
			
		}
									
		
		Report.ReporterOutput("Step","Verify Current RM1 field is enabled and clickable.",Current_RM1, "Current RM1 field should be enabled and clickable successfully.", "Current RM1 field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify Current RM1 field is enabled and clickable.",Current_RM1, "Current RM1 field should be enabled and clickable successfully.", "Current RM1 field is  not enabled and clickable successfully.", "Fail", null);
	}
	
	//********************************Verify Contact Number 1 field *********************************************************************
	
	if(PageObjects_TransactionLoanOrTransferResources.textbox_ContactNumber1(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.textbox_ContactNumber1(Constant.driver).isEnabled())
	{		
				
		Thread.sleep(2000);
		PageObjects_TransactionLoanOrTransferResources.textbox_ContactNumber1(Constant.driver).clear();
		PageObjects_TransactionLoanOrTransferResources.textbox_ContactNumber1(Constant.driver).sendKeys(Contact_Number1);
										
		
		Report.ReporterOutput("Step","Verify Contact Number 1 field is enabled and clickable.",Contact_Number1, "Employee Id field should be enabled and clickable successfully.", "Contact Number 1 field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify Contact Number 1 field is enabled and clickable.",Contact_Number1, "Employee Id field should be enabled and clickable successfully.", "Contact Number 1 field is  not enabled and clickable successfully.", "Fail", null);
	}
	
	//**************************************** Verify Confirmation Date field *********************************************************************
	
	if(PageObjects_TransactionLoanOrTransferResources.textbox_ConfirmationDate(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.textbox_ConfirmationDate(Constant.driver).isEnabled())
	{		
				
		Thread.sleep(2000);
	
	
	  String[] ConfirmationDate = Confirmation_Date.split("-");
	  String DateVal = ConfirmationDate[0];
	  String MonthVal = ConfirmationDate[1];
	  String YearVal = ConfirmationDate[2];
	  
	  Thread.sleep(2000);
			
		Constant.driver.findElement(By.id("confirmationDate")).click();
		
		Thread.sleep(1000);
        		
        		 Select MonthList=new Select(Constant.driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/select[1]")));
        		 MonthList.selectByVisibleText(MonthVal);
        		 
        		 Thread.sleep(1000);
        		 
        		 Select YearList=new Select(Constant.driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/select[2]")));
        		 YearList.selectByVisibleText(YearVal);
        		 
        	Thread.sleep(1000);	 
        	
        List<WebElement>  date_list = Constant.driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
        	
        	for(int i=0; i<date_list.size(); i++){
        	  		
        String getDate_list = date_list.get(i).getText();
        Thread.sleep(1000);
        		
        		if(getDate_list.contentEquals(DateVal)){
        			
        			Thread.sleep(1000);
        			date_list.get(i).click();
        			
        			
        			break;
        		}
        	}
        		       
        	       
        	
		
		Report.ReporterOutput("Step","Verify Confirmation Date field is enabled and clickable.",Confirmation_Date, "Confirmation Date field should be enabled and clickable successfully.", "Confirmation Date field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify Confirmation Date field is enabled and clickable.",Confirmation_Date, "Confirmation Date field should be enabled and clickable successfully.", "Confirmation Date field is  not enabled and clickable successfully.", "Fail", null);
	}
	
	
	
	
	
	
		
	//********************************Verify Release Date field *********************************************************************
	
	if(PageObjects_TransactionLoanOrTransferResources.textbox_ReleaseDate(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.textbox_ReleaseDate(Constant.driver).isEnabled())
	{		
				
		Thread.sleep(2000);
		
		
		  String[] DateValueReleaseDate = Release_Date.split("-");
		  String DateValReleaseDate = DateValueReleaseDate[0];
		  String MonthValReleaseDate = DateValueReleaseDate[1];
		  String YearValReleaseDate = DateValueReleaseDate[2];
		  
		  System.out.println(DateValReleaseDate);
		  System.out.println(MonthValReleaseDate);
		  System.out.println(YearValReleaseDate);
		  
			
		
			Constant.driver.findElement(By.xpath(".//*[@id='releaseDate']")).click();
			
			Thread.sleep(1000);
	        		
	        		 Select MonthList=new Select(Constant.driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/select[1]")));
	        		 MonthList.selectByVisibleText(MonthValReleaseDate);
	        		 
	        		 Thread.sleep(1000);
	        		 
	        		 Select YearList=new Select(Constant.driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/select[2]")));
	        		 YearList.selectByVisibleText(YearValReleaseDate);
	        		 
	        	Thread.sleep(2000);	 
	        	
	        List<WebElement>  date_list = Constant.driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
	        	
	        	for(int i=0; i<date_list.size(); i++){
	        	  		
	        String getDate_list = date_list.get(i).getText();
	  
	        		
	        		if(getDate_list.contentEquals(DateValReleaseDate)){
	        			
	        			date_list.get(i).click();
	        			
	        			
	        			break;
	        		}
	        	}
	        		       
												
		
		Report.ReporterOutput("Step","Verify Release Date field is enabled and clickable.",Release_Date, "Release Date field should be enabled and clickable successfully.", "Release Date field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify Release Date field is enabled and clickable.",Release_Date, "Release Date field should be enabled and clickable successfully.", "Release Date field is  not enabled and clickable successfully.", "Fail", null);
	}
	
	//********************************Verify BGH Name field *********************************************************************
	
	if(PageObjects_TransactionLoanOrTransferResources.dropdown_BGHName(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.dropdown_BGHName(Constant.driver).isEnabled())
	{		
	
		
		
		Thread.sleep(1000);
		
		WebElement BGHName_Click = PageObjects_TransactionLoanOrTransferResources.dropdown_BGHName(Constant.driver);
		
		BGHName_Click.click();
		
		Thread.sleep(2000);
		List<WebElement> BGHNameList = Constant.driver.findElements(By.xpath("html/body/ul[13]/li/a"));
		
		for(int i=0; i< BGHNameList.size(); i++){
			
			String BGHName = BGHNameList.get(i).getText();
			
			//System.out.println("BGH Name.............." +  BGHName );
			
			if( BGHName.contentEquals(BGH_Name)){
				
				
				BGHNameList.get(i).click();
				
				break;
			}
		}
									
		
		Report.ReporterOutput("Step","Verify BGH Name field is enabled and clickable.",BGH_Name, "BGH Name field should be enabled and clickable successfully.", "BGH Name field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify BGH Name field is enabled and clickable.",BGH_Name, "BGH Name field should be enabled and clickable successfully.", "BGH Name field is  not enabled and clickable successfully.", "Fail", null);
	}
	
	//********************************Verify BGH Comments field *********************************************************************
	
	if(PageObjects_TransactionLoanOrTransferResources.textbox_BGHComments(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.textbox_BGHComments(Constant.driver).isEnabled())
	{		
		
					
		Thread.sleep(2000);
		PageObjects_TransactionLoanOrTransferResources.textbox_BGHComments(Constant.driver).clear();
		PageObjects_TransactionLoanOrTransferResources.textbox_BGHComments(Constant.driver).sendKeys(BGH_Comments);
											
		
		Report.ReporterOutput("Step","Verify BGH Comments field is enabled and clickable.",BGH_Comments, "BGH Comments field should be enabled and clickable successfully.", "BGH Comments field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify BGH Comments field is enabled and clickable.",BGH_Comments, "BGH Comments field should be enabled and clickable successfully.", "BGH Comments field is  not enabled and clickable successfully.", "Fail", null);
	}
	
	//********************************Verify BGH Comments Date field *********************************************************************
	
	if(PageObjects_TransactionLoanOrTransferResources.textbox_BGHCommentsDate(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.textbox_BGHCommentsDate(Constant.driver).isEnabled())
	{		
				
		Thread.sleep(2000);
		
		
		  String[] DateValue = BGHComments_Date.split("-");
		  String DateVal = DateValue[0];
		  String MonthVal = DateValue[1];
		  String YearVal = DateValue[2];
		  	 
		  			
		
			Constant.driver.findElement(By.xpath(".//*[@id='bGCommentsTimestamp']")).click();
			
			Thread.sleep(1000);
	        		
	        		 Select MonthList=new Select(Constant.driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/select[1]")));
	        		 MonthList.selectByVisibleText(MonthVal);
	        		 
	        		 Thread.sleep(1000);
	        		 
	        		 Select YearList=new Select(Constant.driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/select[2]")));
	        		 YearList.selectByVisibleText(YearVal);
	        		 
	        	Thread.sleep(2000);	 
	        	
	        List<WebElement>  date_list = Constant.driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
	        	
	        	for(int i=0; i<date_list.size(); i++){
	        	  		
	        String getDate_list = date_list.get(i).getText();
	  
	        		
	        		if(getDate_list.contentEquals(DateVal)){
	        			
	        			date_list.get(i).click();
	        			
	        			
	        			break;
	        		}
	        	}
	        		       		
		
		Report.ReporterOutput("Step","Verify BGH Comments Date field is enabled and clickable.",BGHComments_Date, "BGH Comments Date field should be enabled and clickable successfully.", "BGH Comments Date field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify BGH Comments Date field is enabled and clickable.",BGHComments_Date, "BGH Comments Date field should be enabled and clickable successfully.", "BGH Comments Date field is  not enabled and clickable successfully.", "Fail", null);
	}
	
	//********************************Verify Current Location field *********************************************************************
	
	if(PageObjects_TransactionLoanOrTransferResources.dropdown_CurrentLocation(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.dropdown_CurrentLocation(Constant.driver).isEnabled())
	{		

			
	
		
		Thread.sleep(1000);
		
		WebElement CurrentLocation_Click = PageObjects_TransactionLoanOrTransferResources.dropdown_CurrentLocation(Constant.driver);
		
		CurrentLocation_Click.click();
		
		Thread.sleep(2000);
		List<WebElement> CurrentLocationList = Constant.driver.findElements(By.xpath("html/body/ul[9]/li/a"));
		
		for(int i=0; i< CurrentLocationList.size(); i++){
			
			String CurrentLocation_Name = CurrentLocationList.get(i).getText();
			
			//System.out.println("CurrentLocation_Name.............." +  CurrentLocation_Name );
			
			if( CurrentLocation_Name.contentEquals(Current_Location)){
				
				
				CurrentLocationList.get(i).click();
				
				break;
			}
			
		}
									
		
		Report.ReporterOutput("Step","Verify Current Location field is enabled and clickable.",Current_Location, "Current Location field should be enabled and clickable successfully.", "Current Location field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify Current Location field is enabled and clickable.",Current_Location, "Current Location field should be enabled and clickable successfully.", "Current Location field is  not enabled and clickable successfully.", "Fail", null);
	}
	
	//********************************Verify Current RM 2 field *********************************************************************
	
	if(PageObjects_TransactionLoanOrTransferResources.dropdown_CurrentRM2(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.dropdown_CurrentRM2(Constant.driver).isEnabled())
	{		

			
		
		Thread.sleep(1000);
		
		WebElement CurrentRM2_Click = PageObjects_TransactionLoanOrTransferResources.dropdown_CurrentRM2(Constant.driver);
		
		CurrentRM2_Click.click();
		
		Thread.sleep(2000);
		List<WebElement> CurrentRM2List = Constant.driver.findElements(By.xpath("html/body/ul[12]/li/a"));
		
		for(int i=0; i< CurrentRM2List.size(); i++){
			
			String CurrentRM2_Name = CurrentRM2List.get(i).getText();
			
			//System.out.println("CurrentRM2_Name.............." +  CurrentRM2_Name );
			
			if( CurrentRM2_Name.contentEquals(Current_RM2)){
				
				
				CurrentRM2List.get(i).click();
				
				break;
			}
			
		}
									
		
		Report.ReporterOutput("Step","Verify Current RM2 field is enabled and clickable.",Current_RM2, "Current RM2 field should be enabled and clickable successfully.", "Current RM2 field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify Current RM2 field is enabled and clickable.",Current_RM2, "Current RM2 field should be enabled and clickable successfully.", "Current RM2 field is  not enabled and clickable successfully.", "Fail", null);
	}
	
	//********************************Verify Contact Number 2 field *********************************************************************
	
	if(PageObjects_TransactionLoanOrTransferResources.textbox_ContactNumber2(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.textbox_ContactNumber2(Constant.driver).isEnabled())
	{		
				
		Thread.sleep(2000);
		PageObjects_TransactionLoanOrTransferResources.textbox_ContactNumber2(Constant.driver).clear();
		PageObjects_TransactionLoanOrTransferResources.textbox_ContactNumber2(Constant.driver).sendKeys(Contact_Number2);
										
		
		Report.ReporterOutput("Step","Verify Contact Number 2 field is enabled and clickable.",Contact_Number2, "Contact Number 2 field should be enabled and clickable successfully.", "Contact Number 2 field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify Contact Number 2 field is enabled and clickable.",Contact_Number2, "Contact Number 2 field should be enabled and clickable successfully.", "Contact Number 2 field is  not enabled and clickable successfully.", "Fail", null);
	}
		
	//******************************** Verify Appraisal Date 1 field *********************************************************************
	
	if(PageObjects_TransactionLoanOrTransferResources.textbox_AppraisalDate1(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.textbox_AppraisalDate1(Constant.driver).isEnabled())
	{		
				
		Thread.sleep(2000);
		
		
		  String[] Appraisal_Date = Appraisal_Date1.split("-");
		  String DateVal = Appraisal_Date[0];
		  String MonthVal = Appraisal_Date[1];
		  String YearVal = Appraisal_Date[2];
		  
		
		  Thread.sleep(1000);
		
			Constant.driver.findElement(By.id("lastAppraisal")).click();
			
			Thread.sleep(1000);
	        		
	        		 Select MonthList=new Select(Constant.driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/select[1]")));
	        		 MonthList.selectByVisibleText(MonthVal);  
	        		 
	        		 Thread.sleep(1000);
	        		 
	        		 Select YearList=new Select(Constant.driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/select[2]")));
	        		 YearList.selectByVisibleText(YearVal);
	        		 
	        	Thread.sleep(1500);	 
	        	
	        List<WebElement>  date_list = Constant.driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
	        	
	        	for(int i=0; i<date_list.size(); i++){
	        	  		
	        String getDate_list = date_list.get(i).getText();
	  
	        		
	        		if(getDate_list.contentEquals(DateVal)){
	        			
	        			Thread.sleep(1000);
	        			
	        			date_list.get(i).click();
	        			
	        			
	        			break;
	        		}
	        	}

		
		Report.ReporterOutput("Step","Verify Appraisal Date 1 field is enabled and clickable.",Appraisal_Date1, "Appraisal Date 1 field should be enabled and clickable successfully.", "Appraisal Date 1 field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify Appraisal Date 1 field is enabled and clickable.",Appraisal_Date1, "Appraisal Date 1 field should be enabled and clickable successfully.", "Appraisal Date 1 field is  not enabled and clickable successfully.", "Fail", null);
	}
		//********************************Verify LoanTransfer Date From field *********************************************************************
	
	if(PageObjects_TransactionLoanOrTransferResources.textbox_LoanTransferDateFrom(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.textbox_LoanTransferDateFrom(Constant.driver).isEnabled())	{		
		
	//	DatePicker.testDAtePicker("2016", Constant.driver.findElement(By.id("transferDate")), "12/31/2016");
		
		 Thread.sleep(1000);
		   String[] excelArr = LoanTransfer_DateFrom.split("-");
			  
			  String MonthXls = excelArr[1];
			  String YearXls = excelArr[2];
			  String DateXls = excelArr[0];
			  
			  System.out.println(MonthXls);
			  System.out.println(YearXls);
			  System.out.println(DateXls);
			  int diffMonth=0;
		        Date date;
		        Thread.sleep(2000);
		        Constant.driver.findElement(By.id("transferDate")).click();
		        date = new SimpleDateFormat("MMMM").parse(excelArr[1]);
	              Calendar cal = Calendar.getInstance();
	              cal.setTime(date);
	              
	              Calendar calendar =  Calendar.getInstance();
	              calendar.set(Calendar.MONTH, cal.get(Calendar.MONTH));
	              calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(excelArr[0]));
	              calendar.set(Calendar.YEAR,Integer.parseInt(excelArr[2]));
	              
	              Calendar currCalendar =  Calendar.getInstance();
	              
	              int diffYear = calendar.get(Calendar.YEAR) - currCalendar.get(Calendar.YEAR);
	              diffMonth = diffYear * 12 + calendar.get(Calendar.MONTH) - currCalendar.get(Calendar.MONTH);
	              
	              System.out.println(diffMonth);
	        
	              if(diffMonth<0)
	              {
	              	for(int i=0;i>diffMonth;i--){
	              		Constant.driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/a[1]/span")).click();
	              	}
	              }
	              else if(diffMonth>0)
	              {
	            	  for(int i=0;i<diffMonth;i++){
		              		Constant.driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/a[2]/span")).click();
		              	} 
	              }
	              	            	  
	              
	              Thread.sleep(1500);	 
		        	
		  	        List<WebElement>  date_list = Constant.driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
	             
		  	        for(int j=0; j<date_list.size(); j++){
	        	  		
	      	        String getDate_list = date_list.get(j).getText();
	      	  
	      	        		
	      	        		if(getDate_list.contentEquals(excelArr[0])){
	      	        			
	      	        			Thread.sleep(1000);
	      	        			
	      	        			date_list.get(j).click();
	      	        			
	      	        			
	      	        			break;
	      	        		}
	      	        	}

		
           
   
		
		Report.ReporterOutput("Step","Verify Loan Transfer Date From field is enabled and clickable.",LoanTransfer_DateFrom, "Loan Transfer Date From field should be enabled and clickable successfully.", "Loan Transfer Date From field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify Loan Transfer Date From is enabled and clickable.",LoanTransfer_DateFrom, "Loan Transfer Date From field should be enabled and clickable successfully.", "Loan Transfer Date From field is  not enabled and clickable .", "Fail", null);
	}
	
	//********************************Verify BUH Name field *********************************************************************
	
		if(PageObjects_TransactionLoanOrTransferResources.dropdown_BUHName(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.dropdown_BUHName(Constant.driver).isEnabled())
	{		

			
		
		Thread.sleep(1000);
		
		WebElement BUHName_Click = PageObjects_TransactionLoanOrTransferResources.dropdown_BUHName(Constant.driver);
		
		BUHName_Click.click();
		
		Thread.sleep(2000);
		List<WebElement> BUHNameList = Constant.driver.findElements(By.xpath("html/body/ul[14]/li/a"));
		
		for(int i=0; i< BUHNameList.size(); i++){
			
			String BUHName_Name = BUHNameList.get(i).getText();
			
			//System.out.println("BUHName_Name.............." +  BUHName_Name );
			
			if( BUHName_Name.contentEquals(BUH_Name)){
				
				
				BUHNameList.get(i).click();
				
				break;
			}
			
		}
									
		
		Report.ReporterOutput("Step","Verify BUH Name field is enabled and clickable.",BUH_Name, "BUH Name field should be enabled and clickable successfully.", "BUH Name field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify BUH Name field is enabled and clickable.",BUH_Name, "BUH Name field should be enabled and clickable .", "BUH Name field is  not enabled and clickable .", "Fail", null);
	}	
	
	//********************************Verify BUH Comments field *********************************************************************
	
	if(PageObjects_TransactionLoanOrTransferResources.textbox_BUHComments(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.textbox_BUHComments(Constant.driver).isEnabled())
	{		
				
		Thread.sleep(2000);
		PageObjects_TransactionLoanOrTransferResources.textbox_BUHComments(Constant.driver).clear();
		PageObjects_TransactionLoanOrTransferResources.textbox_BUHComments(Constant.driver).sendKeys(BUH_Comments);
										
		
		Report.ReporterOutput("Step","Verify BUH Comments field is enabled and clickable.",BUH_Comments, "BUH Comments field should be enabled and clickable successfully.", "BUH Comments field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify BUH Comments field is enabled and clickable.",BUH_Comments, "BUH Comments field should be enabled and clickable.", "BUH Comments field is  not enabled and clickable.", "Fail", null);
	}
	
	//********************************Verify BU Comments Date field *********************************************************************
	
	if(PageObjects_TransactionLoanOrTransferResources.textbox_BUCommentsDate(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.textbox_BUCommentsDate(Constant.driver).isEnabled())	{		
		
		Thread.sleep(2000);
		
		
		  String[] BUCommentsDate = BUComments_Date.split("-");
		  String DateVal = BUCommentsDate[0];
		  String MonthVal = BUCommentsDate[1];
		  String YearVal = BUCommentsDate[2];
		  
		
		  
			
		
			Constant.driver.findElement(By.id("bUCommentsTimestamp")).click();
			
			Thread.sleep(1000);
	        		
	        		 Select MonthList=new Select(Constant.driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/select[1]")));
	        		 MonthList.selectByVisibleText(MonthVal);
	        		 
	        		 Thread.sleep(1000);
	        		 
	        		 Select YearList=new Select(Constant.driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/select[2]")));
	        		 YearList.selectByVisibleText(YearVal);
	        		 
	        	Thread.sleep(2000);	 
	        	
	        List<WebElement>  date_list = Constant.driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
	        	
	        	for(int i=0; i<date_list.size(); i++){
	        	  		
	        String getDate_list = date_list.get(i).getText();
	  
	        		
	        		if(getDate_list.contentEquals(DateVal)){
	        			 Thread.sleep(1000);
	        			date_list.get(i).click();
	        			
	        			
	        			break;
	        		}
	        	}
					
		
		Report.ReporterOutput("Step","Verify BU Comments Date field is enabled and clickable.",BUComments_Date, "BU Comments Date field should be enabled and clickable successfully.", "BU Comments Date field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify BU Comments Date is enabled and clickable.",BUComments_Date, "BU Comments Date field should be enabled and clickable.", "BU Comments Date field is  not enabled and clickable .", "Fail", null);
	}
	
	//********************************Verify Grade field *********************************************************************
	
		if(PageObjects_TransactionLoanOrTransferResources.dropdown_Grade(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.dropdown_Grade(Constant.driver).isEnabled())
	{		

			
		
		Thread.sleep(1000);
		
		WebElement Grade_Click = PageObjects_TransactionLoanOrTransferResources.dropdown_Grade(Constant.driver);
		
		Grade_Click.click();
		
		Thread.sleep(2000);
		List<WebElement> GradeList = Constant.driver.findElements(By.xpath("html/body/ul[4]/li/a"));
		
		for(int i=0; i<GradeList.size(); i++){
			
			String Grade_Name = GradeList.get(i).getText();
			
			//System.out.println("Grade_Name.............." +  Grade_Name );
			
			if( Grade_Name.contentEquals(Grade)){
				
				Thread.sleep(1000);
				GradeList.get(i).click();
				
				break;
			}
			
		}
									
		
		Report.ReporterOutput("Step","Verify  Grade field is enabled and clickable.",Grade, " Grade field should be enabled and clickable successfully.", " Grade field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify  Grade field is enabled and clickable.",Grade, " Grade field should be enabled and clickable.", " Grade field is  not enabled and clickable.", "Fail", null);
	}
	
		
		//********************************Verify Parent BGBU field *********************************************************************
	
	if(PageObjects_TransactionLoanOrTransferResources.textbox_ParentBGBU(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.textbox_ParentBGBU(Constant.driver).isEnabled())
	{		

			
		
		Thread.sleep(1000);
		
		WebElement ParentBGBU_Click = PageObjects_TransactionLoanOrTransferResources.textbox_ParentBGBU(Constant.driver);
		
		ParentBGBU_Click.click();
		
		Thread.sleep(2000);
		List<WebElement> ParentBGBUList = Constant.driver.findElements(By.xpath("html/body/ul[7]/li/a"));
		
		for(int i=0; i< ParentBGBUList.size(); i++){
			
			String ParentBGBU_Name = ParentBGBUList.get(i).getText();
			
			//System.out.println("ParentBGBU_Name.............." +  ParentBGBU_Name );
			
			if( ParentBGBU_Name.contentEquals(Parent_BGBU)){
				
				
				ParentBGBUList.get(i).click();
				
				break;
			}
			
		}
									
		
		Report.ReporterOutput("Step","Verify  Parent BG-BU field is enabled and clickable.",Parent_BGBU, " Parent BG-BU field should be enabled and clickable successfully.", " Parent BG-BU field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify  Parent BG-BU field is enabled and clickable.",Parent_BGBU, " Parent BG-BU field should be enabled and clickable.", " Parent BG-BU field is  not enabled and clickable.", "Fail", null);
	}
	
	//******************************** Verify Current BGBU field *********************************************************************
	
	if(PageObjects_TransactionLoanOrTransferResources.dropdown_CurrentBGBU(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.dropdown_CurrentBGBU(Constant.driver).isEnabled())
	{		

			
		
		Thread.sleep(1000);
		
		WebElement CurrentBGBU_Click = PageObjects_TransactionLoanOrTransferResources.dropdown_CurrentBGBU(Constant.driver);
		
		CurrentBGBU_Click.click();
		
		Thread.sleep(2000);
		List<WebElement> CurrentBGBUList = Constant.driver.findElements(By.xpath("html/body/ul[10]/li/a"));
		
		for(int i=0; i< CurrentBGBUList.size(); i++){
			
			String CurrentBGBU_Name = CurrentBGBUList.get(i).getText();
			
			//System.out.println("CurrentBGBU_Name.............." +  CurrentBGBU_Name );
			
			if( CurrentBGBU_Name.contentEquals(Current_BGBU)){
				
				
				CurrentBGBUList.get(i).click();
				
				break;
			}
			
		}
									
		
		Report.ReporterOutput("Step","Verify  Current BG-BU field is enabled and clickable.",Current_BGBU, " Current BG-BU field should be enabled and clickable successfully.", " Current BG-BU field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify  Current BG-BU field is enabled and clickable.",Current_BGBU, " Current BG-BU field should be enabled and clickable.", " Current BG-BU field is  not enabled and clickable.", "Fail", null);
	}
	
		
		//********************************Verify Email Id field *********************************************************************
		
	if(PageObjects_TransactionLoanOrTransferResources.textbox_EmailId(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.textbox_EmailId(Constant.driver).isEnabled())
	{		
				
		Thread.sleep(2000);
		PageObjects_TransactionLoanOrTransferResources.textbox_EmailId(Constant.driver).clear();
		PageObjects_TransactionLoanOrTransferResources.textbox_EmailId(Constant.driver).sendKeys(Email_Id);
										
		
		Report.ReporterOutput("Step","Verify Email Id field is enabled and clickable.",Email_Id, "Email Id field should be enabled and clickable successfully.", "Email Id field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify Email Id field is enabled and clickable.",Email_Id, "Email Id field should be enabled and clickable .", "Email Id field is  not enabled and clickable .", "Fail", null);
	}
	
	//********************************Verify DOJ field *********************************************************************
	
if(PageObjects_TransactionLoanOrTransferResources.textbox_DOJ(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.textbox_DOJ(Constant.driver).isEnabled())	{		
		
		Thread.sleep(2000);
		
		 DateFormat dateFormat2 = new SimpleDateFormat("dd"); 
         Date date2 = new Date();

         String today = dateFormat2.format(date2); 

         
         
         Constant.driver.findElement(By.xpath(".//*[@id='dateOfJoining']")).click();
         //find the calendar
         Thread.sleep(2000);
         WebElement dateWidget = Constant.driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']"));  
         List<WebElement> columns=dateWidget.findElements(By.tagName("td"));  

         //comparing the text of cell with today's date and clicking it.
         for (WebElement cell : columns)
         {
            if (cell.getText().equals(today))
            {
               cell.click();
               break;
            }
         }
											
		
		Report.ReporterOutput("Step","Verify DOJ field is enabled and clickable.",DOJ, "DOJ field should be enabled and clickable successfully.", "DOJ field is enabled and clickable successfully.", "Pass",null);
	}	
	else
	{
		Report.ReporterOutput("Step","Verify DOJ field is enabled and clickable.",DOJ, "DOJ field should be enabled and clickable .", "DOJ field is  not enabled and clickable .", "Fail", null);
	}
	
	
	//******************************** Verify Appraisal Date 2 field *********************************************************************
	
if(PageObjects_TransactionLoanOrTransferResources.textbox_AppraisalDate2(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.textbox_AppraisalDate2(Constant.driver).isEnabled())	{		
	
	Thread.sleep(2000);
	
	
	  String[] AppraisalDate2 = Appraisal_Date2.split("-");
	  String DateVal = AppraisalDate2[0];
	  String MonthVal = AppraisalDate2[1];
	  String YearVal = AppraisalDate2[2];
	  
	
	  
		
	
		Constant.driver.findElement(By.xpath(".//*[@id='penultimateAppraisal']")).click();
		
		Thread.sleep(1000);
      		
      		 Select MonthList=new Select(Constant.driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/select[1]")));
      		 MonthList.selectByVisibleText(MonthVal);
      		 
      		 Thread.sleep(1000);
      		 
      		 Select YearList=new Select(Constant.driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/select[2]")));
      		 YearList.selectByVisibleText(YearVal);
      		 
      	Thread.sleep(2000);	 
      	
      List<WebElement>  date_list = Constant.driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
      	
      	for(int i=0; i<date_list.size(); i++){
      	  		
      String getDate_list = date_list.get(i).getText();

      		
      		if(getDate_list.contentEquals(DateVal)){
      			
      			date_list.get(i).click();
      			
      			
      			break;
      		}
      	}
					
	
	Report.ReporterOutput("Step","Verify Appraisal Date 2 field is enabled and clickable.",Appraisal_Date2, " Appraisal Date 2 field should be enabled and clickable successfully.", " Appraisal Date 2 field is enabled and clickable successfully.", "Pass",null);
}	
else
{
	Report.ReporterOutput("Step","Verify  Appraisal Date 2 field is enabled and clickable.",Appraisal_Date2, " Appraisal Date 2 field should be enabled and clickable .", " Appraisal Date 2 field is  not enabled and clickable .", "Fail", null);
}

//******************************** Verify Loan Transfer Date To field *********************************************************************

 if(PageObjects_TransactionLoanOrTransferResources.textbox_LoanTransferDateTo(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.textbox_LoanTransferDateTo(Constant.driver).isEnabled())	{		
	
	Thread.sleep(2000);
	
	
	  String[] LoanTransferDateTo = LoanTransfer_DateTo.split("-");
	  String DateVal = LoanTransferDateTo[0];
	  String MonthVal = LoanTransferDateTo[1];
	  String YearVal = LoanTransferDateTo[2];
	  
			
		Constant.driver.findElement(By.xpath(".//*[@id='transferTo']")).click();
		
		
		 
		   String[] excelArrTransferTo = LoanTransfer_DateTo.split("-");
			  
			  String MonthXls = excelArrTransferTo[1];
			  String YearXls = excelArrTransferTo[2];
			  String DateXls = excelArrTransferTo[0];
			  
			  System.out.println(MonthXls);
			  System.out.println(YearXls);
			  System.out.println(DateXls);
			  int diffMonths=0;
		        Date date;
		        Thread.sleep(2000);
		        Constant.driver.findElement(By.id("transferTo")).click();
		        date = new SimpleDateFormat("MMMM").parse(excelArrTransferTo[1]);
	              Calendar cal = Calendar.getInstance();
	              cal.setTime(date);
	              
	              Calendar calendar =  Calendar.getInstance();
	              calendar.set(Calendar.MONTH, cal.get(Calendar.MONTH));
	              calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(excelArrTransferTo[0]));
	              calendar.set(Calendar.YEAR,Integer.parseInt(excelArrTransferTo[2]));
	              
	              Calendar currCalendar =  Calendar.getInstance();
	              
	              int diffYears = calendar.get(Calendar.YEAR) - currCalendar.get(Calendar.YEAR);
	              diffMonths = diffYears * 12 + calendar.get(Calendar.MONTH) - currCalendar.get(Calendar.MONTH);
	              
	              System.out.println(diffMonths);
	           //   WebElement next = Constant.driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/a[2]/span"));
	              if(diffMonths<0)
	              {
	              	for(int i=0;i>diffMonths;i--){
	              		Constant.driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/a[1]/span")).click();
	              	}
	              }
	              else if(diffMonths>0)
	              {
	            	  for(int i=0;i<diffMonths;i++){
		              		Constant.driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/a[2]/span")).click();
		              	} 
	              }
	              	            	  
	              
	              Thread.sleep(1500);	 
		        	
		  	        List<WebElement>  date_list = Constant.driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
	             
		  	        for(int j=0; j<date_list.size(); j++){
	        	  		
	      	        String getDate_list = date_list.get(j).getText();
	      	  
	      	        		
	      	        		if(getDate_list.contentEquals(excelArrTransferTo[0])){
	      	        			
	      	        			Thread.sleep(1000);
	      	        			
	      	        			date_list.get(j).click();
	      	        			
	      	        			
	      	        			break;
	      	        		}
	      	        	}
		
		
	
	Report.ReporterOutput("Step","Verify Loan Transfer Date To  field is enabled and clickable.",LoanTransfer_DateTo, " Loan Transfer Date To field should be enabled and clickable successfully.", " Loan Transfer Date To field is enabled and clickable successfully.", "Pass",null);
}	
else
{
	Report.ReporterOutput("Step","Verify  Loan Transfer Date To field is enabled and clickable.",LoanTransfer_DateTo, " Loan Transfer Date To field should be enabled and clickable .", " Loan Transfer Date To field is  not enabled and clickable .", "Fail", null);
}
	
		
		//******************************** Verify HR Name field *********************************************************************
		
if(PageObjects_TransactionLoanOrTransferResources.dropdown_HRName(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.dropdown_HRName(Constant.driver).isEnabled())
{		

		
	
	Thread.sleep(1000);
	
	WebElement HRName_Click = PageObjects_TransactionLoanOrTransferResources.dropdown_HRName(Constant.driver);
	
	HRName_Click.click();
	
	Thread.sleep(2000);
	List<WebElement> HRNameList = Constant.driver.findElements(By.xpath("html/body/ul[15]/li/a"));
	
	for(int i=0; i< HRNameList.size(); i++){
		
		String HRName_Name = HRNameList.get(i).getText();
		
		//System.out.println("HRName_Name.............." +  HRName_Name );
		
		if( HRName_Name.contentEquals(HRName)){
			
			
			HRNameList.get(i).click();
			
			break;
		}
		
	}
								
	
	Report.ReporterOutput("Step","Verify  HR Name field is enabled and clickable.",HRName, " HR Name field should be enabled and clickable successfully.", " HR Name field is enabled and clickable successfully.", "Pass",null);
}	
else
{
	Report.ReporterOutput("Step","Verify  HR Name field is enabled and clickable.",HRName, " HR Name field should be enabled and clickable .", " HR Name field is  not enabled and clickable .", "Fail", null);
}	

//******************************** Verify HR Comments field *********************************************************************

if(PageObjects_TransactionLoanOrTransferResources.textbox_HRComments(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.textbox_HRComments(Constant.driver).isEnabled())
{		
			
	Thread.sleep(2000);
	PageObjects_TransactionLoanOrTransferResources.textbox_HRComments(Constant.driver).clear();
	PageObjects_TransactionLoanOrTransferResources.textbox_HRComments(Constant.driver).sendKeys(HR_Comments);
									
	
	Report.ReporterOutput("Step","Verify HR Comments field is enabled and clickable.",HR_Comments, "HR Comments field should be enabled and clickable successfully.", "HR Comments field is enabled and clickable successfully.", "Pass",null);
}	
else
{
	Report.ReporterOutput("Step","Verify HR Comments field is enabled and clickable.",HR_Comments, "HR Comments field should be enabled and clickable .", "HR Comments field is  not enabled and clickable .", "Fail", null);
}
	
		
		//******************************** Verify HR Comments Date field *********************************************************************

if(PageObjects_TransactionLoanOrTransferResources.textbox_HRCommentsDate(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.textbox_HRCommentsDate(Constant.driver).isEnabled())	{		
	
	Thread.sleep(2000);
	
	
	  String[] HRCommentsDate = HRComments_Date.split("-");
	  String DateVal = HRCommentsDate[0];
	  String MonthVal = HRCommentsDate[1];
	  String YearVal = HRCommentsDate[2];
	  
	
	  
		
	
		Constant.driver.findElement(By.xpath(".//*[@id='hRCommentsTimestamp']")).click();
		
		Thread.sleep(1000);
      		
      		 Select MonthList=new Select(Constant.driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/select[1]")));
      		 MonthList.selectByVisibleText(MonthVal);
      		 
      		 Thread.sleep(1000);
      		 
      		 Select YearList=new Select(Constant.driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/select[2]")));
      		 YearList.selectByVisibleText(YearVal);
      		 
      	Thread.sleep(2000);	 
      	
      List<WebElement>  date_list = Constant.driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
      	
      	for(int i=0; i<date_list.size(); i++){
      	  		
      String getDate_list = date_list.get(i).getText();

      		
      		if(getDate_list.contentEquals(DateVal)){
      			
      			date_list.get(i).click();
      			
      			
      			break;
      		}
      	}

										
	
	Report.ReporterOutput("Step","Verify HR Comments Date  field is enabled and clickable.",HRComments_Date, " HR Comments Date field should be enabled and clickable successfully.", " HR Comments Date field is enabled and clickable successfully.", "Pass",null);
}	
else
{
	Report.ReporterOutput("Step","Verify  HR Comments Date field is enabled and clickable.",HRComments_Date, " HR Comments Date field should be enabled and clickable .", " HR Comments Date field is  not enabled and clickable .", "Fail", null);
}


//******************************** Verify Save button field functionality  *********************************************************************

if(PageObjects_TransactionLoanOrTransferResources.Link_Save(Constant.driver).isDisplayed() && PageObjects_TransactionLoanOrTransferResources.Link_Save(Constant.driver).isEnabled())
{		
			
	Thread.sleep(1000);
	WebElement Save_Click = PageObjects_TransactionLoanOrTransferResources.Link_Save(Constant.driver);
	Save_Click.click();

			
						
	
	Report.ReporterOutput("Step","Verify Save button is enabled & Save entered values.","Save", "Save button should be enabled and clickable successfully.", "Save button is enabled and clickable successfully.", "Pass",null);
}	
else
{
	Report.ReporterOutput("Step","Verify Save button is enabled & Save entered values.","Save", "Save button should be enabled and clickable .", "Save button is not enabled and clickable .", "Fail", null);
}

//************************** Verify entered values are saved successfully *******************************

Thread.sleep(8000);


String getResourseNameval = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/form/table/tbody/tr[1]/td[2]/span/input")).getAttribute("value");

  
int excelInt = Integer.parseInt(Resorce_Name.replaceAll("\\D", ""));
int appInt = Integer.parseInt(getResourseNameval.replaceAll("\\D", ""));


System.out.println(excelInt);

System.out.println(appInt);


 if(excelInt==appInt){
			 
Report.ReporterOutput("Step","Verify entered value saved successfully.","Saved successfully", "Verify  entered value saved successfully.", "Verifed entered value saved successfully.", "Pass",null);
}else{
	Report.ReporterOutput("Step","Verify entered value saved successfully.","Not Saved successfully", "Verify  entered value not saved.", "Verified entered value not saved successfully.", "Fail", null);
}


	
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
	try
	{
	     if(Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).isDisplayed());                                    

	{              
	     Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).click();
	     Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is navigated to RMS      Home page","Pass",null);
	}
	}
	catch(Exception e)
	{
	    System.out.println( e.getMessage());

	}}

		
		
		
}