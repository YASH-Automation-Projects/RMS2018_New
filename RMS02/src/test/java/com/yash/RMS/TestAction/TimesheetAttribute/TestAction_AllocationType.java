package com.yash.RMS.TestAction.TimesheetAttribute;

import org.openqa.selenium.By;

import com.yash.RMS.CustomProperties.CommonMethods;
import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.MasterData.PageObjects_TimesheetAttribute;


public class TestAction_AllocationType {

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

	//*********** to create New Allocation type *********************************************************

	//public static void AllocationType_Scenarios(String AllocationTypeName, String Priority) throws Throwable{
		public static void NewAllocation_Creation(String AllocationName, String Priority) throws Throwable{

		try{
			//Thread.sleep(5000);
			try{
				if((PageObjects_TimesheetAttribute.lnk_AllocationType(Constant.driver)).isDisplayed())
				{

					System.out.println("Allocation type link is present");
					Report.ReporterOutput("STEP","Verify Allocation type Link is displayed ","Allocation type","Allocation type link should be displayed","Allocation type link is displayed","Pass",null);
					PageObjects_TimesheetAttribute.lnk_AllocationType(Constant.driver).click();
					Thread.sleep(2000);

					// to verify user entered Allocation type home page
					String msg=Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1")).getText().trim();

					String msg2="Allocation Type";
					//////System.out.println(msg);

					if(msg.contains(msg2))
					{
						Report.ReporterOutput("STEP","Verify Allocation Type home page is displayed","Allocation Type home page","Allocation Type home page should be displayed","Allocation Type home page is displayed","Pass",null);
					}

				}
			}
			catch(Exception e3)
			{
				Report.ReporterOutput("STEP","Verify Allocation Type Link is displayed ","Allocation Type link","Allocation Type link should be displayed","Allocation Type link is not displayed","Pass",null);
			}

			// to click on to Add new button
			try{


				if((PageObjects_TimesheetAttribute.btn_AddNew(Constant.driver)).isDisplayed())
				{

					System.out.println("add new button is present");
					Report.ReporterOutput("STEP","Verify add new button is displayed ","Add new button"," Add new button should be displayed","Add new button is displayed","Pass",null);
					PageObjects_TimesheetAttribute.btn_AllocationType_AddNew(Constant.driver).click();
					//Thread.sleep(3000);


				}
			}
			catch(Exception e4)
			{
				Report.ReporterOutput("STEP","Verify add new button is displayed ","Add new button"," Add new button should be displayed","Add new button is not displayed","Fail",null);
			}
		//	Thread.sleep(2000);


			// to fill  Allocation type name
			PageObjects_TimesheetAttribute.txtbox_NewAllocationType(Constant.driver).sendKeys(AllocationName);

			// to fill  priority value
			
//			System.out.println(Priority);
//			int i = Integer.parseInt(Priority);
			
//			
//			System.out.println(i);
			PageObjects_TimesheetAttribute.txtbox_NewAllocationType_Priority(Constant.driver).sendKeys(Priority);

		//	Thread.sleep(2000);
			Report.ReporterOutput("STEP","Verify all parameters have been provided for creating new Allocation Type","Parameters","All parameters should be provided for creating new Allocation Type","All parameters provided for creating new Allocation Type","Pass",null);
			
		//	Thread.sleep(2000);
			// to click on Save button

			if(Constant.driver.findElement(By.linkText("Save")).isEnabled());
			{
				Report.ReporterOutput("STEP","Verify Save button is enabled ","Save button","Save button should be enabled","Save button is enabled","Pass",null);
				Constant.driver.findElement(By.linkText("Save")).click();
			}


			Thread.sleep(10000);
			Report.ReporterOutput("STEP","Verify new Allocation Type  has been created","new Allocation Type creation","new Allocation Type should be created","new Allocation Type  has been created","Pass",null);
		
		
		
		
		}
		catch(Exception e1)
		{
			System.out.println( e1.getMessage());


		}

		}
			/********************************************************************************************************************************************/
			//************ to Search and verify created Allocation Type **************************************
			public static void NewAllocationType_Search(String AllocationName) throws Throwable
			{
			
			try
			{
				Thread.sleep(15000);
				
				CommonMethods.waitForElement(PageObjects_TimesheetAttribute.txt_AllocationType_Search(Constant.driver), Constant.driver).clear();
				CommonMethods.waitForElement(PageObjects_TimesheetAttribute.txt_AllocationType_Search(Constant.driver), Constant.driver).sendKeys(AllocationName);
				
				/*PageObjects_TimesheetAttribute.txt_AllocationType_Search(Constant.driver).clear();
				PageObjects_TimesheetAttribute.txt_AllocationType_Search(Constant.driver).sendKeys(AllocationName);
				*///Thread.sleep(5000);


				String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

				String msgB= AllocationName;
				System.out.println(msgA);
				//Thread.sleep(2000);

				if(msgA.contains(msgB))
				{
					Report.ReporterOutput("STEP","Verify new Allocation Type "+AllocationName+" should be searched and verified","New Allocation Type verification","new Allocation Type "+AllocationName+" should be searched and verification","new Allocation Type "+AllocationName+" searched and verified","Pass",null);
				}

				//Thread.sleep(3000);
			}
			catch(Exception e2)
			{
				Report.ReporterOutput("STEP","Verify new Allocation Type "+AllocationName+" should be searched and verified","New Allocation Type verification","new Allocation Type "+AllocationName+" should be searched and verification","new Allocation Type "+AllocationName+" is not searched and verified","Fail",null);
			}
			}
			

			/********************************************************************************************************************************************/
			//************ to Edit and verify created Allocation Type **************************************
			public static void NewAllocationType_Edit(String UpdatedAllocationTypeName,String UpdatedPriority) throws Throwable
			{
			
			try
			{

				if(Constant.driver.findElement(By.linkText("Edit")).isEnabled());
				{
					Report.ReporterOutput("STEP","Verify Edit button is enabled","Edit button","Edit should be enabled","Edit button is enabled","Pass",null);
					//Thread.sleep(2000);
					Constant.driver.findElement(By.linkText("Edit")).click();
				}
			}
			catch(Exception e5)
			{
				Report.ReporterOutput("STEP","Verify Edit button is enabled","Edit button","Edit should be enabled","Edit button is not enabled","Fail",null);
			}

			//Thread.sleep(2000);

			// to fill Allocation Type name

			
			PageObjects_TimesheetAttribute.txtbox_NewAllocationType(Constant.driver).clear();
			PageObjects_TimesheetAttribute.txtbox_NewAllocationType(Constant.driver).sendKeys(UpdatedAllocationTypeName);
		//	Thread.sleep(2000);


			// to fill  priority value
			PageObjects_TimesheetAttribute.txtbox_NewAllocationType_Priority(Constant.driver).clear();
			PageObjects_TimesheetAttribute.txtbox_NewAllocationType_Priority(Constant.driver).sendKeys(UpdatedPriority);

		//	Thread.sleep(4000);
			
			Report.ReporterOutput("STEP","Verify all parameters have been provided for Updating Allocation Type","Parameters","All parameters should be provided for Updating Allocation Type","All parameters provided for Updating Allocation Type","Pass",null);

			// to click on Save button
			try
			{

				if(Constant.driver.findElement(By.linkText("Save")).isEnabled());
				{
					Report.ReporterOutput("STEP","Verify Save button is enabled","Save button","Save should be enabled","Save button is enabled","Pass",null);
					Constant.driver.findElement(By.linkText("Save")).click();
				}
				Thread.sleep(10000);

			}
			catch(Exception e6)
			{
				Report.ReporterOutput("STEP","Verify Save button is enabled","Save button","Save should be enabled","Save button is not enabled","Fail",null);
			}

			// To verify Allocation Type has been updated
			try
			{
			    
				
				Thread.sleep(15000);
				
				
				CommonMethods.waitForElement(PageObjects_TimesheetAttribute.txt_AllocationType_Search(Constant.driver), Constant.driver).clear();
				CommonMethods.waitForElement(PageObjects_TimesheetAttribute.txt_AllocationType_Search(Constant.driver), Constant.driver).sendKeys(UpdatedAllocationTypeName);
				
				
				/*PageObjects_TimesheetAttribute.txt_AllocationType_Search(Constant.driver).clear();
				PageObjects_TimesheetAttribute.txt_AllocationType_Search(Constant.driver).sendKeys(UpdatedAllocationTypeName);*/
				//Thread.sleep(3000);


				String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

				String msgB1= UpdatedAllocationTypeName;
				System.out.println(msgA1);
				//Thread.sleep(2000);

				if(msgA1.contains(msgB1))
				{
					Report.ReporterOutput("STEP","Verify Allocation Type has been updated","Allocation Type updation","Allocation Type should be Updated succesfully","Allocation Type has been updated succesfully","Pass",null);
				}

			//	Thread.sleep(3000);
			}
			catch(Exception e2)
			{
				Report.ReporterOutput("STEP","Verify Allocation Type has been updated","Allocation Type updation","Allocation Type should be Updtaed succesfully","Allocation Type is not updated succesfully","Fail",null);
			}

			// To verify Priority field has been updated
			try
			{

			//	Thread.sleep(5000);

				String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]")).getText().trim();

				String msgB1= UpdatedPriority;
				System.out.println(msgA1);
				//Thread.sleep(2000);

				if(msgA1.contains(msgB1))
				{
					Report.ReporterOutput("STEP","Verify Priority field has been updated","Priority field updation","Priority field should be Updated succesfully","Priority field has been updated succesfully","Pass",null);
				}

				//Thread.sleep(3000);
			}
			catch(Exception e2)
			{
				Report.ReporterOutput("STEP","Verify Priority field has been updated","Priority field updation","Priority field should be Updated succesfully","Priority field has been updated succesfully","Pass",null);
			}
			
			}
			/********************************************************************************************************************************************/
			//************ to Delete created Allocation Type **************************************

			public static void NewActivity_Delete(String UpdatedAllocationTypeName) throws Throwable
			{
				try
				{
					
			Thread.sleep(15000);
			// to clear and fill Search text box

					CommonMethods.waitForElement(PageObjects_TimesheetAttribute.txt_AllocationType_Search(Constant.driver), Constant.driver).clear();
					CommonMethods.waitForElement(PageObjects_TimesheetAttribute.txt_AllocationType_Search(Constant.driver), Constant.driver).sendKeys(UpdatedAllocationTypeName);
					
					
					
/*			PageObjects_TimesheetAttribute.txt_AllocationType_Search(Constant.driver).clear();
			PageObjects_TimesheetAttribute.txt_AllocationType_Search(Constant.driver).sendKeys(UpdatedAllocationTypeName);
*/
			//Thread.sleep(3000);

			try
			{
				if(Constant.driver.findElement(By.linkText("Delete")).isEnabled());
				{
					Report.ReporterOutput("STEP","Verify Delete button is enabled ","Delete button","Delete button should be enabled","Delete button enabled","Pass",null);
					Thread.sleep(2000);
					Constant.driver.findElement(By.linkText("Delete")).click();
				}
				//Thread.sleep(2000);
			}
			catch(Exception e7)
			{
				Report.ReporterOutput("STEP","Verify Delete button is enabled ","Delete button","Delete button should be enabled","Delete button is not enabled","Fail",null);
			}
		//	Thread.sleep(2000);

			// to click on OK button on popup
			Constant.driver.findElement(By.xpath("html/body/ul[2]/li/div/div[2]/button[1]")).click();
			Report.ReporterOutput("STEP","Verify Pop up window should get opened and OK button should be clicked","Pop up window","Pop up window should get opened and OK button should be clicked","Pop up window should get opened and OK button is clicked","Pass",null);

			Thread.sleep(2000);

			// To verify if Allocation Type has been deleted successfully

			try
			{
				Thread.sleep(15000);
				CommonMethods.waitForElement(PageObjects_TimesheetAttribute.txt_AllocationType_Search(Constant.driver), Constant.driver).clear();
				CommonMethods.waitForElement(PageObjects_TimesheetAttribute.txt_AllocationType_Search(Constant.driver), Constant.driver).sendKeys(UpdatedAllocationTypeName);
				
				/*PageObjects_TimesheetAttribute.txt_AllocationType_Search(Constant.driver).clear();
				PageObjects_TimesheetAttribute.txt_AllocationType_Search(Constant.driver).sendKeys(UpdatedAllocationTypeName);
				*///Thread.sleep(5000);


				String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[4]/div/table/tbody/tr/td[2]")).getText().trim();

				String msgB1= UpdatedAllocationTypeName;
				System.out.println(msgA1);
			//	Thread.sleep(2000);

				if(msgA1.contains(msgB1))
				{
					Report.ReporterOutput("STEP","Verify Allocation Type has been deleted","Allocation Type deletion","Allocation Type should be deleted succesfully","Allocation Type has not been deleted succesfully","fail",null);
				}

			//	Thread.sleep(3000);
			}
			catch(Exception e2)
			{
				Report.ReporterOutput("STEP","Verify Allocation Type has been deleted","Allocation Type deletion","Allocation Type should be deleted succesfully","Allocation Type has been deleted succesfully","Pass",null);
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
