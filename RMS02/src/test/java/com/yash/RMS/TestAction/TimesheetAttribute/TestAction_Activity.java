package com.yash.RMS.TestAction.TimesheetAttribute;

import org.openqa.selenium.By;

import com.yash.RMS.CustomProperties.CommonMethods;
import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.MasterData.PageObjects_TimesheetAttribute;


public class TestAction_Activity {

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

	public static void Navigation_TimesheetAttribute() throws Throwable
	{

		try
		{
		    Thread.sleep(5000);
			if((PageObjects_TimesheetAttribute.lnk_MasterData(Constant.driver)).isDisplayed());
			{

				System.out.println("master data link is present");
				Report.ReporterOutput("STEP","Verify master data Link is displayed ","Master Data link","Click on master data link","master data link should be displayed","Pass",null);
				PageObjects_TimesheetAttribute.lnk_MasterData(Constant.driver).click();
				Thread.sleep(2000);

			}

		}
		catch(Exception e1)
		{
			Report.ReporterOutput("STEP","Verify master data Link is displayed ","Master Data link","Click on master data link","master data link not displayed","Fail",null);
		}

		try
		{
			Thread.sleep(5000);
			if((PageObjects_TimesheetAttribute.lnk_TimesheetAttribute(Constant.driver)).isDisplayed());
			{

				System.out.println("Timesheet attribute link is present");
				Report.ReporterOutput("STEP","Verify Timesheet attribute Link is displayed ","Timesheet attribute link","Timesheet attribute link should be displayed and clicked","Timesheet attribute link displayed and clicked","Pass",null);
				PageObjects_TimesheetAttribute.lnk_TimesheetAttribute(Constant.driver).click();
				Thread.sleep(2000);

			}


		}
		catch(Exception e2)
		{
			Report.ReporterOutput("STEP","Verify Timesheet attribute Link is displayed ","Timesheet attribute link","Timesheet attribute link should be displayed and clicked","Timesheet attribute link not displayed and clicked","Fail",null);

		}

	}

	/********************************************************************************************************************************************/

	//*********** to create New Activity *********************************************************

	public static void NewActivity_Creation(String ActivityName, String Mandatory, String Type, String Max, String Format, String Productive) throws Throwable
	{


		try{
			Thread.sleep(5000);
			try{
				if((PageObjects_TimesheetAttribute.lnk_Activity(Constant.driver)).isDisplayed())
				{

					System.out.println("Activity link is present");
					Report.ReporterOutput("STEP","Verify Activity Link is displayed ","Activity link","Activity link should be displayed","Activity link is displayed","Pass",null);
					PageObjects_TimesheetAttribute.lnk_Activity(Constant.driver).click();
					Thread.sleep(3000);

					// to verify user entered Activity home page
					String msg=Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1")).getText().trim();

					String msg2="Activity";
					//////System.out.println(msg);

					if(msg.contains(msg2))
					{
						Report.ReporterOutput("STEP","Verify Activity home page is displayed","Activity home page","Activity home page should be displayed","Activity home page is displayed","Pass",null);
					}

				}
			}
			catch(Exception e3)
			{
				Report.ReporterOutput("STEP","Verify Activity Link is displayed ","Activity link","Activity link should be displayed","Activity link is not displayed","Pass",null);
			}

			// to click on to Add new button
			try{


				if((PageObjects_TimesheetAttribute.btn_AddNew(Constant.driver)).isDisplayed())
				{

					System.out.println("add new button is present");
					Report.ReporterOutput("STEP","Verify add new button is displayed ","Add new button"," Add new button should be displayed","Add new button is displayed","Pass",null);
					PageObjects_TimesheetAttribute.btn_AddNew(Constant.driver).click();
					Thread.sleep(3000);


				}
			}
			catch(Exception e4)
			{
				Report.ReporterOutput("STEP","Verify add new button is displayed ","Add new button"," Add new button should be displayed","Add new button is not displayed","Fail",null);
			}

			// to fill Activity name
			PageObjects_TimesheetAttribute.txtbox_ActivityName(Constant.driver).sendKeys(ActivityName);

			// to fill Mandatory dropdown

			if((PageObjects_TimesheetAttribute.drpdwn_Activity_Mandatory(Constant.driver)).isEnabled())
			{

				System.out.println("mandatory drp dwn is enabled");
				PageObjects_TimesheetAttribute.drpdwn_Activity_Mandatory(Constant.driver).sendKeys(Mandatory);
				Thread.sleep(3000);

			}


			// to fill Type
			PageObjects_TimesheetAttribute.txtbox_Activity_Type(Constant.driver).sendKeys(Type);

			//Thread.sleep(3000);

			// to fill Max
			PageObjects_TimesheetAttribute.txtbox_Max(Constant.driver).sendKeys("0");

		//	Thread.sleep(3000);

			// to fill Format
			PageObjects_TimesheetAttribute.txtbox_Format(Constant.driver).sendKeys(Format);

		//	Thread.sleep(3000);

			// to fill dropdown productive value
			PageObjects_TimesheetAttribute.drpdwn_Activity_Productive(Constant.driver).sendKeys(Productive);


			Report.ReporterOutput("STEP","Verify all parameters have been provided for creating new Activity","Parameters","All parameters should be provided for creating new Activity","All parameters provided for creating new Activity","Pass",null);
		//	Thread.sleep(4000);

			// to click on Save button

			if(Constant.driver.findElement(By.linkText("Save")).isEnabled());
			{
				Report.ReporterOutput("STEP","Verify Save button is enabled ","Save button","Save button should be enabled","Save button is enabled","Pass",null);
			//	Thread.sleep(4000);
				Constant.driver.findElement(By.linkText("Save")).click();
			}


			Thread.sleep(2000);
			Report.ReporterOutput("STEP","Verify new Activity "+ActivityName+" has been created","new Activity creation","new Activity "+ActivityName+" should be created","new Activity "+ActivityName+" has been created","Pass",null);

			Thread.sleep(9000);
		}
		catch(Exception e1)
		{
			System.out.println( e1.getMessage());


		}
	}

	/********************************************************************************************************************************************/
	//************ to Search and verify created Activity **************************************


	public static void NewActivity_Search(String ActivityName) throws Throwable
	{
		try
		{
			
			//Thread.sleep(9000);
			Thread.sleep(15000);
			
			//PageObjects_TimesheetAttribute.txt_Activity_Search(Constant.driver).clear();
			//PageObjects_TimesheetAttribute.txt_Activity_Search(Constant.driver).sendKeys(ActivityName);
			CommonMethods.waitForElement(PageObjects_TimesheetAttribute.txt_Activity_Search(Constant.driver), Constant.driver).clear();
			CommonMethods.waitForElement(PageObjects_TimesheetAttribute.txt_Activity_Search(Constant.driver), Constant.driver).sendKeys(ActivityName);
			
			//	Thread.sleep(5000);

            
			String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[4]/div/table/tbody/tr/td[2]")).getText().trim();

			String msgB= ActivityName;
			System.out.println(msgA);
			//Thread.sleep(2000);

			if(msgA.contains(msgB))
			{
				Report.ReporterOutput("STEP","Verify new Activity "+ActivityName+" should be searched and verified","New Activity verification","new Activity "+ActivityName+" should be searched and verification","new Activity "+ActivityName+" searched and verified","Pass",null);
			}

			//Thread.sleep(3000);
		}
		catch(Exception e2)
		{
			Report.ReporterOutput("STEP8","Verify new Activity "+ActivityName+" should be searched and verified","New Activity verification","new Activity "+ActivityName+" should be searched and verification","new Activity "+ActivityName+" not searched and verified","Fail",null);
		}

	}

	/********************************************************************************************************************************************/
	//************ to Edit and verify created Activity **************************************


	public static void NewActivity_Edit(String UpdatedActivityName, String UpdatedMandatory, String UpdatedType, String UpdatedMax, String UpdatedFormat, String UpdatedProductive) throws Throwable
	{
		
	    Thread.sleep(5000);

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

	//	Thread.sleep(2000);

		// to fill Activity name

		//String UpdatedActivityName = "Updated_Activity";
		
		PageObjects_TimesheetAttribute.txtbox_ActivityName(Constant.driver).clear();
		PageObjects_TimesheetAttribute.txtbox_ActivityName(Constant.driver).sendKeys(UpdatedActivityName);
	//	Thread.sleep(2000);

		// to fill Mandatory dropdown
		if((PageObjects_TimesheetAttribute.drpdwn_Activity_Mandatory(Constant.driver)).isEnabled())
		{

			
			PageObjects_TimesheetAttribute.drpdwn_Activity_Mandatory(Constant.driver).sendKeys(UpdatedMandatory);
		//	Thread.sleep(5000);

		}
		else
		{
			System.out.println("mandatory drp dwn is not enabled");
		}

	//	Thread.sleep(2000);

		// to fill Type
		PageObjects_TimesheetAttribute.txtbox_Activity_Type(Constant.driver).clear();
		PageObjects_TimesheetAttribute.txtbox_Activity_Type(Constant.driver).sendKeys(UpdatedType);

	//	Thread.sleep(2000);

		// to fill Max
		PageObjects_TimesheetAttribute.txtbox_Max(Constant.driver).clear();
		PageObjects_TimesheetAttribute.txtbox_Max(Constant.driver).sendKeys("1");

	//	Thread.sleep(2000);

		// to fill Format
		PageObjects_TimesheetAttribute.txtbox_Format(Constant.driver).clear();
		PageObjects_TimesheetAttribute.txtbox_Format(Constant.driver).sendKeys(UpdatedFormat);

	//	Thread.sleep(2000);

		// to fill dropdown productive value

		PageObjects_TimesheetAttribute.drpdwn_Activity_Productive(Constant.driver).sendKeys(UpdatedProductive);


		Report.ReporterOutput("STEP","Verify all parameters have been provided for Updating Activity","Parameters","All parameters should be provided for Updating Activity","All parameters provided for Updating Activity","Pass",null);
		//Thread.sleep(4000);

		// to click on Save button
		try
		{

			if(Constant.driver.findElement(By.linkText("Save")).isEnabled());
			{
				Report.ReporterOutput("STEP","Verify Save button is enabled","Save button","Save should be enabled","Save button is enabled","Pass",null);
				Constant.driver.findElement(By.linkText("Save")).click();
			}
			Thread.sleep(18000);

		}
		catch(Exception e6)
		{
			Report.ReporterOutput("STEP","Verify Save button is enabled","Save button","Save should be enabled","Save button is not enabled","Fail",null);
		}

		
		
		
		// To verify Activity has been updated
		try
		{
			Thread.sleep(18000);
			CommonMethods.waitForElement(PageObjects_TimesheetAttribute.txt_Activity_Search(Constant.driver), Constant.driver).clear();
			CommonMethods.waitForElement(PageObjects_TimesheetAttribute.txt_Activity_Search(Constant.driver), Constant.driver).sendKeys(UpdatedActivityName);

			
			
			/*CommonMethods.waitForElementClickable(PageObjects_TimesheetAttribute.txt_Activity_Search(Constant.driver), Constant.driver).clear();
			CommonMethods.waitForElementClickable(PageObjects_TimesheetAttribute.txt_Activity_Search(Constant.driver), Constant.driver).sendKeys(UpdatedActivityName);*/
			/*PageObjects_TimesheetAttribute.txt_Activity_Search(Constant.driver).clear();
			PageObjects_TimesheetAttribute.txt_Activity_Search(Constant.driver).sendKeys(UpdatedActivityName);
		//	Thread.sleep(5000);
*/
			Thread.sleep(2000);
			String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[4]/div/table/tbody/tr/td[2]")).getText().trim();

			String msgB1= UpdatedActivityName.trim();
			System.out.println(msgA1);
		

			if(msgA1.contains(msgB1))
			{
				Report.ReporterOutput("STEP","Verify Activity has been updated","Activity updation","Activity should be Updated succesfully","Activity has been updated succesfully","Pass",null);
			}

			//Thread.sleep(3000);
		}
		catch(Exception e2)
		{
			Report.ReporterOutput("STEP","Verify Activity has been updated","Activity updation","Activity should be Updated succesfully","Activity is not updated succesfully","Fail",null);
		}

		// To verify Mandatory field has been updated
		try
		{

		//	Thread.sleep(5000);

			String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[4]/div/table/tbody/tr/td[3]")).getText().trim();

			String msgB1= UpdatedMandatory;
			System.out.println(msgA1);
			Thread.sleep(2000);

			if(msgA1.contains(msgB1))
			{
				Report.ReporterOutput("STEP","Verify Mandatory field has been updated","Mandatory field updation","Mandatory field should be Updated succesfully","Mandatory field has been updated succesfully","Pass",null);
			}

		//	Thread.sleep(3000);
		}
		catch(Exception e2)
		{
			Report.ReporterOutput("STEP","Verify Mandatory field has been updated","Mandatory field updation","Mandatory field should be Updated succesfully","Mandatory field has not been updated succesfully","Fail",null);
		}
		
		// To verify Type field has been updated
				try
				{

				//	Thread.sleep(5000);

					String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[4]/div/table/tbody/tr/td[4]")).getText().trim();

					String msgB1= UpdatedType;
					System.out.println(msgA1);
			//		Thread.sleep(2000);

					if(msgA1.contains(msgB1))
					{
						Report.ReporterOutput("STEP","Verify Type field has been updated","Type field updation","Type field should be Updated succesfully","Type field has been updated succesfully","Pass",null);
					}

				//	Thread.sleep(3000);
				}
				catch(Exception e2)
				{
					Report.ReporterOutput("STEP","Verify Type field has been updated","Type field updation","Type field should be Updated succesfully","Type field has not been updated succesfully","Fail",null);
				}
				
				// To verify Max field has been updated
				try
				{

				//	Thread.sleep(5000);

					String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[4]/div/table/tbody/tr/td[5]")).getText().trim();

					String msgB1= "1";
					System.out.println(msgA1);
					Thread.sleep(2000);

					if(msgA1.contains(msgB1))
					{
						Report.ReporterOutput("STEP","Verify Max field has been updated","Max field updation","Max field should be Updated succesfully","Max field has been updated succesfully","Pass",null);
					}

				//	Thread.sleep(3000);
				}
				catch(Exception e2)
				{
					Report.ReporterOutput("STEP","Verify Max field has been updated","Max field updation","Max field should be Updated succesfully","Max field has not been updated succesfully","Fail",null);
				}
				
				// To verify Format field has been updated
				try
				{

				//	Thread.sleep(5000);

					String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[4]/div/table/tbody/tr/td[6]")).getText().trim();

					String msgB1= UpdatedFormat;
					System.out.println(msgA1);
				//	Thread.sleep(2000);

					if(msgA1.contains(msgB1))
					{
						Report.ReporterOutput("STEP","Verify Format field has been updated","Format field updation","Format field should be Updated succesfully","Format field has been updated succesfully","Pass",null);
					}

				//	Thread.sleep(3000);
				}
				catch(Exception e2)
				{
					Report.ReporterOutput("STEP","Verify Format field has been updated","Format field updation","Format field should be Updated succesfully","Format field has not been updated succesfully","Fail",null);
				}
				
				// To verify Productive field has been updated
				try
				{

				//	Thread.sleep(5000);

					String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[4]/div/table/tbody/tr/td[7]")).getText().trim();

					String msgB1= UpdatedProductive;
					System.out.println(msgA1);
				//	Thread.sleep(2000);

					if(msgA1.contains(msgB1))
					{
						Report.ReporterOutput("STEP","Verify Productive field has been updated","Productive field updation","Productive field should be Updated succesfully","Productive field has been updated succesfully","Pass",null);
					}

				//	Thread.sleep(3000);
				}
				catch(Exception e2)
				{
					Report.ReporterOutput("STEP","Verify Productive field has been updated","Productive field updation","Productive field should be Updated succesfully","Productive field has not been updated succesfully","Fail",null);
				}

	}
	/********************************************************************************************************************************************/
	//************ to Delete created Activity **************************************

	public static void NewActivity_Delete(String UpdatedActivityName) throws Throwable
	{		

		try
		{

			Thread.sleep(15000);
			
			// to clear and fill Search text box

			
			
			PageObjects_TimesheetAttribute.txt_Activity_Search(Constant.driver).clear();
			PageObjects_TimesheetAttribute.txt_Activity_Search(Constant.driver).sendKeys(UpdatedActivityName);

			Thread.sleep(3000);

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

		    Thread.sleep(16000);

			// To verify if Activity has been deleted successfully

			try
			{
				/*PageObjects_TimesheetAttribute.txt_Activity_Search(Constant.driver).clear();
				PageObjects_TimesheetAttribute.txt_Activity_Search(Constant.driver).sendKeys(UpdatedActivityName);*/
				Thread.sleep(15000);
				
				CommonMethods.waitForElement(PageObjects_TimesheetAttribute.txt_Activity_Search(Constant.driver), Constant.driver).clear();
				CommonMethods.waitForElement(PageObjects_TimesheetAttribute.txt_Activity_Search(Constant.driver), Constant.driver).sendKeys(UpdatedActivityName);



				String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[4]/div/table/tbody/tr/td[2]")).getText().trim();

				String msgB1= "UpdatedActivityName";
				System.out.println(msgA1);
				//Thread.sleep(2000);

				if(msgA1.contains(msgB1))
				{
					Report.ReporterOutput("STEP","Verify Activity has been deleted","Activity deletion","Activity should be deleted succesfully","Activity has not been deleted succesfully","fail",null);
				}

			//	Thread.sleep(3000);
			}
			catch(Exception e2)
			{
				Report.ReporterOutput("STEP","Verify Activity has been deleted","Activity deletion","Activity should be deleted succesfully","Activity has been deleted succesfully","Pass",null);
			}
		}

		catch(Exception e10)
		{
			System.out.println( e10.getMessage());
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



