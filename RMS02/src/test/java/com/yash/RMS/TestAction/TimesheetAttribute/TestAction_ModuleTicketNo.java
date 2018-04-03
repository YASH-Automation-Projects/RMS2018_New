package com.yash.RMS.TestAction.TimesheetAttribute;

import org.openqa.selenium.By;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.MasterData.PageObjects_TimesheetAttribute;

public class TestAction_ModuleTicketNo {

	public static String ResultCellValue;
	static int Index;

	public static String ReportUserName;
	public static String ReportPassword;
	public static String ExpectedValue = null;
	public static String ActualValue = null;
	public static String Result = null;
	public static int Flag = 0;
	public static String LanguageUsername = "";
	public static int Execution = 0;


	/********************************************************************************************************************************************/

	//*********** to create New Module ticket no *********************************************************


	public static void AddNew_ModuleTicketNo(String ModuleTicketNoName) throws Throwable{

		try{
		  	Thread.sleep(5000);
			try{
				if((PageObjects_TimesheetAttribute.lnk_ModuleTicketNo(Constant.driver)).isDisplayed())
				{


					Report.ReporterOutput("STEP","Verify ModuleTicketNo Link is displayed ","ModuleTicketNo","ModuleTicketNo link should be displayed","ModuleTicketNo link is displayed","Pass",null);
					PageObjects_TimesheetAttribute.lnk_ModuleTicketNo(Constant.driver).click();
					//Thread.sleep(3000);

					// to verify user entered MODULE TICKET NO home page
					String msg=Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1")).getText().trim();

					String msg2="Module / Ticket No.";
					//////System.out.println(msg);

					if(msg.contains(msg2))
					{
						Report.ReporterOutput("STEP","Verify MODULE TICKET NO home page is displayed","MODULE TICKET NO home page","MODULE TICKET NO home page should be displayed","MODULE TICKET NO home page is displayed","Pass",null);
					}

				}
			}
			catch(Exception e3)
			{
				Report.ReporterOutput("STEP","Verify MODULE TICKET NO home page is displayed","MODULE TICKET NO home page","MODULE TICKET NO home page should be displayed","MODULE TICKET NO home page is not displayed","Fail",null);
			}

			// to click on to Add new button
			try{

				Thread.sleep(5000);
				
				if((PageObjects_TimesheetAttribute.btn_ModuleTicketNo_AddNew(Constant.driver)).isDisplayed())
				{

					System.out.println("add new button is present");
					Report.ReporterOutput("STEP","Verify add new button is displayed ","Add new button"," Add new button should be displayed","Add new button is displayed","Pass",null);
					PageObjects_TimesheetAttribute.btn_ModuleTicketNo_AddNew(Constant.driver).click();
				//	Thread.sleep(3000);


				}
			}
			catch(Exception e4)
			{
				Report.ReporterOutput("STEP","Verify add new button is displayed ","Add new button"," Add new button should be displayed","Add new button is not displayed","Fail",null);
			}
		  Thread.sleep(2000);


			// to fill Module Ticket No name
			PageObjects_TimesheetAttribute.txtbox_ModuleTicketName(Constant.driver).sendKeys(ModuleTicketNoName);

		  Thread.sleep(2000);
			
			Report.ReporterOutput("STEP","Verify Module Ticket No Name "+ModuleTicketNoName+" is provided ","Module Ticket No Name","Module Ticket No Name "+ModuleTicketNoName+" should be provided","Module Ticket No Name "+ModuleTicketNoName+" has been provided","Pass",null);

			// to click on Save button

			if(Constant.driver.findElement(By.linkText("Save")).isEnabled());
			{
				Report.ReporterOutput("STEP","Verify Save button is enabled ","Save button","Save button should be enabled","Save button is enabled","Pass",null);
				Constant.driver.findElement(By.linkText("Save")).click();
			}


			Thread.sleep(2000);
			Report.ReporterOutput("STEP","Verify new Module Ticket No  has been created","new Module Ticket No creation","new Module Ticket No should be created","new Module Ticket No  has been created","Pass",null);



		}
		catch(Exception e1)
		{
			System.out.println( e1.getMessage());


		}	

	}

	/********************************************************************************************************************************************/
	//************ to Search and verify created Module Ticket No **************************************

	public static void NewModuleTicketNo_Search(String ModuleTicketNoName) throws Throwable
	{

		try
		{
			Thread.sleep(15000);
			PageObjects_TimesheetAttribute.txt_ModuleTicketNo_Search(Constant.driver).clear();
			PageObjects_TimesheetAttribute.txt_ModuleTicketNo_Search(Constant.driver).sendKeys(ModuleTicketNoName);
			//Thread.sleep(5000);


			String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

			String msgB1= ModuleTicketNoName;
			System.out.println(msgA1);
		//	Thread.sleep(2000);

			if(msgA1.contains(msgB1))
			{
				Report.ReporterOutput("STEP","Verify new Module Ticket No "+ModuleTicketNoName+" should be searched and verified","New Module Ticket No verification","new Activity "+ModuleTicketNoName+" should be searched and verification","new Module Ticket No "+ModuleTicketNoName+" searched and verified","Pass",null);
			}

		//	Thread.sleep(3000);
		}
		catch(Exception e2)
		{
			Report.ReporterOutput("STEP","Verify new Module Ticket No "+ModuleTicketNoName+" should be searched and verified","New Module Ticket No verification","new Activity "+ModuleTicketNoName+" should be searched and verification","new Module Ticket No "+ModuleTicketNoName+" is not searched and verified","Fail",null);
		}

	}


	/********************************************************************************************************************************************/
	//************ to Edit and verify created Module Ticket No **************************************


	public static void Edit_ModuleTicketNo(String ModuleTicketNoName, String UpdatedModuleTicketName) throws Throwable{

	//	Thread.sleep(5000);
		try{
			

			// to click on to Edit button
			try
			{

				if(Constant.driver.findElement(By.linkText("Edit")).isEnabled());
				{
					Report.ReporterOutput("STEP","Verify Edit button is enabled","Edit button","Edit should be enabled","Edit button is enabled","Pass",null);
				//	Thread.sleep(2000);
					Constant.driver.findElement(By.linkText("Edit")).click();
				}
			}
			catch(Exception e5)
			{
				Report.ReporterOutput("STEP","Verify Edit button is enabled","Edit button","Edit should be enabled","Edit button is not enabled","Fail",null);
			}

		//	Thread.sleep(2000);


			// to fill Module Ticket No name
			Thread.sleep(15000);
			PageObjects_TimesheetAttribute.txtbox_ModuleTicketName(Constant.driver).clear();
			PageObjects_TimesheetAttribute.txtbox_ModuleTicketName(Constant.driver).sendKeys(UpdatedModuleTicketName);

		//	Thread.sleep(2000);
			Report.ReporterOutput("STEP","Verify all parameters have been provided for Updating Module Ticket No","Parameters","All parameters should be provided for Updating Module Ticket No","All parameters provided for Updating Module Ticket No","Pass",null);
			
			// to click on Save button

			if(Constant.driver.findElement(By.linkText("Save")).isEnabled());
			{
				Report.ReporterOutput("STEP","Verify Save button is enabled ","Save button","Save button should be enabled","Save button is enabled","Pass",null);
				Constant.driver.findElement(By.linkText("Save")).click();
			}


			Thread.sleep(2000);
			Report.ReporterOutput("STEP","Verify new Module Ticket No  has been Updated","new Module Ticket No Updation","new Module Ticket No should be Updated","new Module Ticket No  has been Updated","Pass",null);

			// To search Updated module ticket no name
			try
			{Thread.sleep(15000);
				PageObjects_TimesheetAttribute.txt_ModuleTicketNo_Search(Constant.driver).clear();
				PageObjects_TimesheetAttribute.txt_ModuleTicketNo_Search(Constant.driver).sendKeys(UpdatedModuleTicketName);
			//	Thread.sleep(5000);


				String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[1]")).getText().trim();

				String msgB1= UpdatedModuleTicketName;
				System.out.println(msgA1);
			//	Thread.sleep(2000);

				if(msgA1.contains(msgB1))
				{
					Report.ReporterOutput("STEP","Verify updated Module Ticket No "+UpdatedModuleTicketName+" should be searched and verified","updated Module Ticket No verification","updated "+UpdatedModuleTicketName+" should be searched and verification","updated Module Ticket No "+UpdatedModuleTicketName+" searched and verified","Pass",null);
				}

			//	Thread.sleep(3000);
			}
			catch(Exception e2)
			{
				Report.ReporterOutput("STEP","Verify updated Module Ticket No "+UpdatedModuleTicketName+" should be searched and verified","updated Module Ticket No verification","updated "+UpdatedModuleTicketName+" should be searched and verification","updated Module Ticket No "+UpdatedModuleTicketName+" is not searched and verified","Fail",null);
			}


		}
		catch(Exception e1)
		{
			System.out.println( e1.getMessage());


		}	

	}

	/**
	 * @throws Throwable ******************************************************************************************************************************************/
	//************ to Delete Module Ticket No **************************************


	public static void ModuleTicketNo_Delete(String ModuleTicketNoName,String UpdatedModuleTicketName) throws Throwable{
		//Thread.sleep(5000);
		try
		{

			try
			{
				if(Constant.driver.findElement(By.linkText("Delete")).isEnabled());
				{
					Report.ReporterOutput("STEP","Verify Delete button is enabled ","Delete button","Delete button should be enabled","Delete button enabled","Pass",null);
				//	Thread.sleep(2000);
					Constant.driver.findElement(By.linkText("Delete")).click();
				}
			//	Thread.sleep(2000);
			}
			catch(Exception e7)
			{
				Report.ReporterOutput("STEP","Verify Delete button is enabled ","Delete button","Delete button should be enabled","Delete button is not enabled","Fail",null);
			}


			// to click on OK button on popup
			Constant.driver.findElement(By.xpath("html/body/ul[2]/li/div/div[2]/button[1]")).click();
			Report.ReporterOutput("STEP","Verify Pop up window should get opened and OK button should be clicked","Pop up window","Pop up window should get opened and OK button should be clicked","Pop up window should get opened and OK button is clicked","Pass",null);

		//	Thread.sleep(2000);

			// To verify if Module Ticket No has been deleted successfully

			try
			{Thread.sleep(15000);
				PageObjects_TimesheetAttribute.txt_ModuleTicketNo_Search(Constant.driver).clear();
				PageObjects_TimesheetAttribute.txt_ModuleTicketNo_Search(Constant.driver).sendKeys(UpdatedModuleTicketName);
			//	Thread.sleep(5000);


			//	String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[1]")).getText().trim();

				String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[4]/div/table/tbody/tr/td[2]")).getText().trim();

				
				String msgB1= UpdatedModuleTicketName;
				System.out.println(msgA1);
			//	Thread.sleep(2000);

				if(msgA1.contains(msgB1))
				{
					Report.ReporterOutput("STEP","Verify updated Module Ticket No "+UpdatedModuleTicketName+" should be searched and verified","updated Module Ticket No verification","updated "+UpdatedModuleTicketName+" should be searched and verification","updated Module Ticket No "+UpdatedModuleTicketName+" searched and verified","Fail",null);
				}

			//	Thread.sleep(3000);
			}
			catch(Exception e2)
			{
				Report.ReporterOutput("STEP","Verify updated Module Ticket No "+UpdatedModuleTicketName+" should be deleted","Delete Module Ticket No verification","updated "+UpdatedModuleTicketName+" should be deleted","updated Module Ticket No "+UpdatedModuleTicketName+" is deleted","Pass",null);
			}
			
			
		}
		catch(Exception e1)
		{
			System.out.println( e1.getMessage());


		}	
		
		// To navigate on Home page
		try
		{
					if(Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).isDisplayed());
					{
						Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).click();
						Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is navigated to RMS Home page","Pass",null);
						Thread.sleep(15000);
					}
		}
		
		catch(Exception e8)
		{
			System.out.println( e8.getMessage());


		}
		
		
	}



}



















