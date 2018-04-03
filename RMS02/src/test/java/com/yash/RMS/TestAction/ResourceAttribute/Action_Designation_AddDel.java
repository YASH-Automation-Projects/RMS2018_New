package com.yash.RMS.TestAction.ResourceAttribute;

import java.util.Random;

import org.openqa.selenium.By;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
//import com.yash.RMS.POM.ProjectAttribute.PageObjects_ProjectAttribute;
import com.yash.RMS.POM.ResourceAttribute.PageObjects_ResourceAttribute;
import com.yash.RMS.POM.ResourceAttribute.ResourceAttribute_EmployeeCategory;

public class Action_Designation_AddDel {
	private static final String UpdatedPriority = null;
	public static String DesignationAdd_name;

	/*public static String output;
	public static String Editoutput;*/

	//******FOR NAVIGATION******************************************************************************************
	//Masterdata Link
	public static void designationPage_Navigation() throws Throwable {
		try {
		//	Thread.sleep(4000);
			//(Constant.driver).manage().window().maximize();
			if (PageObjects_ResourceAttribute.designation_linkMasterData(Constant.driver).isDisplayed()) {
				PageObjects_ResourceAttribute.designation_linkMasterData(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify master data Link is displayed ","Master Data link", "Click on master data link","master data link should be displayed and clicked", "Pass", null);
			} else {
				Report.ReporterOutput("STEP","Master Data link is displayed ","Master Data link","Click on master data link","master data link not displayed","Fail",null);
			}
			Thread.sleep(2000);

			//Resource Attribute Link
			if (PageObjects_ResourceAttribute.designation_linkResourceAttribute(Constant.driver).isDisplayed()) {
				PageObjects_ResourceAttribute.designation_linkResourceAttribute(Constant.driver).click();
				Report.ReporterOutput("STEP","Resource Attribute Link is displayed ","Resource Attribute Link","Click on Resource Attribute Link","Resource Attribute Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Resource Attribute Link is displayed ","Resource Attribute Link","Click on Resource Attribute Link","Resource Attribute Link  is not displayed","Fail",null);
			}
			Thread.sleep(2000);

			//Designation Link
		//	Thread.sleep(2000);
			if (PageObjects_ResourceAttribute.link_designation(Constant.driver).isDisplayed()) {
				PageObjects_ResourceAttribute.link_designation(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify designation link is displayed "," designation link","Click on designation link","designation link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify designation link is displayed ","designation link","Click on designation link","designation link not displayed","Fail",null);
			}
			// Designation Page Text
			Thread.sleep(4000);
			String Page_Designation = PageObjects_ResourceAttribute.designation_pageText(Constant.driver).getText();

			if (Page_Designation.equalsIgnoreCase("Designation")) {
				Report.ReporterOutput("STEP","Verify Designation Page Text is Visible ","Designation Page Text","Click on Designation Page Text","Designation Page Text is visible","Pass",null);
			} else {

				Report.ReporterOutput("STEP","Verify Designation Page Text is Visible ","Designation Page Text","Click on Designation Page Text","Designation Page Text is not visible","Fail",null);
			}
		} catch (Exception e) {
			Report.ReporterOutput("STEP","Errorv on the page","Exception thrown","Click on Designation Page Text","Designation Page Text is not visible","Fail",null);
		}

	}
	//*********************************************************************************************************************************************

	//For Adding Designation
	public static void  designationPage_Add(String DesignationAdd_name) throws Throwable {
		try {
			
			Thread.sleep(3000);
			if (PageObjects_ResourceAttribute.designation_linkaddNew(Constant.driver).isDisplayed()) {
				PageObjects_ResourceAttribute.designation_linkaddNew(Constant.driver).click();
			//	Thread.sleep(2000);
				Report.ReporterOutput("STEP","Verify Designation Page Add New Link is displayed ","Designation Page Add New Link","Click on Designation Page Add New Link","Designation Page Add New Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Designation Page Add New Link is displayed ","Designation Page Add New Link","Click on Designation Page Add New Link","Designation Page Add New Link not displayed","Fail",null);
			}
		//	Thread.sleep(2000);
			/*char[] chars = "ABC123DFGHI68JKLMNOPQRSTUVWXYZ7895".toCharArray();
			StringBuilder sb = new StringBuilder();
			Random random = new Random();
			for (int i = 0; i < 8; i++) {
				char c = chars[random.nextInt(chars.length)];
				sb.append(c);
			}
			output = sb.toString();
			//System.out.println("first output "+output);
			 * 
			 */
			Thread.sleep(2000);
			if (PageObjects_ResourceAttribute.designation_nameBox(Constant.driver).isDisplayed()) {
				 PageObjects_ResourceAttribute.designation_nameBox(Constant.driver).click();
				// Thread.sleep(2000);
				 PageObjects_ResourceAttribute.designation_nameBox(Constant.driver).sendKeys(DesignationAdd_name);
				 Report.ReporterOutput("STEP","Verify Designation Name Box is displayed ","Designation Name Box","Click on Designation Name Box","Designation Name Box should be displayed and clicked","Pass",null);
			 }
			 else {
				 Report.ReporterOutput("STEP","Verify Designation Name Box is displayed ","Designation Name Box","Click on Designation Name Box","Designation Name Box not displayed","Fail",null);
			 }
		//	 Thread.sleep(2000);


			 // to click on Save button/Verify new Designation has been added
			 if(Constant.driver.findElement(By.linkText("Save")).isEnabled());
			 {
				 Report.ReporterOutput("STEP","Verify Save button is enabled ","Save button","Save button should be enabled","Save button is enabled","Pass",null);
				 Constant.driver.findElement(By.linkText("Save")).click();
			 }
			 Thread.sleep(1000);{
				 Report.ReporterOutput("STEP","Verify new Designation has been created","new Designation creation","new Designation Type should be created","new Designation has been created","Pass",null);
			 }
			 /*	if (PageObjects_ResourceAttribute.designation_saveButton(Constant.driver).isDisplayed()) {
				PageObjects_ResourceAttribute.designation_saveButton(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify Designation Page Save Button is Visible ","Designation Page Save Button","Click on Designation Page Save Button","Designation Page Save Button should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Designation Page Save Button is Visible ","Designation Page Save Button","Click on Designation Page Save Button","Designation Page Save Button is not displayed","Fail",null);
			}
			Thread.sleep(2000);*/
			/* if (PageObjects_ResourceAttribute.designation_saveButtonConfirmationMessage(Constant.driver).isDisplayed()) {

				 Report.ReporterOutput("STEP","Verify Designation Page Save Button Confirmation Message is displayed ","Designation Page Save Button Confirmation Message","Click on Designation Page Save Button Confirmation Message","Designation Page Save Button Confirmation Message should be displayed","Pass",null);
			 }
			 else {

				 Report.ReporterOutput("STEP","Verify Designation Page Save Button Confirmation Message is displayed ","Designation Page Save Button Confirmation Message","Click on Designation Page Save Button Confirmation Message","Designation Page Save Button Confirmation Message not displayed","Fail",null);
			 }*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//**********************************************************************************************************************************************
	//************ to Search and verify created Designation Name **************************************

	public static void SearchDesignationName(String DesignationAdd_name) throws Throwable
	{
		try
		{
			Thread.sleep(14000);
			PageObjects_ResourceAttribute.designation_buttonSearch(Constant.driver).clear();
			PageObjects_ResourceAttribute.designation_buttonSearch(Constant.driver).sendKeys(DesignationAdd_name);
		


			String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

			String msgB= DesignationAdd_name;
			System.out.println(msgA);
			//Thread.sleep(2000);

			if(msgA.contains(msgB))
			{
				Report.ReporterOutput("STEP","Verify new Designation Name "+DesignationAdd_name+" is searched and verified.",DesignationAdd_name,"New Designation Name  "+DesignationAdd_name+" should be searched and verification.","New Designation Name "+DesignationAdd_name+" searched and verified.","Pass",null);
			}

			//Thread.sleep(3000);
		}
		catch(Exception e2)
		{
			Report.ReporterOutput("STEP","Verify new Designation Name "+DesignationAdd_name+" is searched and verified.",DesignationAdd_name,"New Designation Name  "+DesignationAdd_name+" should be searched and verification.","New Designation Name "+DesignationAdd_name+" is not searched and verified.","Fail",null);
		}

	} 

	//*******************************************************************************************************************************************


	//For Editing Designation
	public static void designationPage_searchEdit(String DesignationAdd_name) throws Throwable {
		try {
			Thread.sleep(14000);
			// for search 
			if (PageObjects_ResourceAttribute.designation_buttonSearch(Constant.driver).isDisplayed()) {

				PageObjects_ResourceAttribute.designation_buttonSearch(Constant.driver).click();
				//Thread.sleep(2000);

				PageObjects_ResourceAttribute.designation_buttonSearch(Constant.driver).clear();
				//Giving output from First add Method
				PageObjects_ResourceAttribute.designation_buttonSearch(Constant.driver).sendKeys(DesignationAdd_name);
				//Thread.sleep(2000);
				Report.ReporterOutput("STEP","Verify Designation Page Search Button is Visible ","Designation Page Search Button ","Click on Designation Page Search Button ","Designation Page Search Button should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Designation Page Search Button is Visible ","Designation Page Search Button ","Click on Designation Page Search Button","Designation Page Search Button not displayed","Pass",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**********************************************************************************************************************************************

	public static void designationPage_Edit(String Editoutput) throws Throwable {
		try {
			Thread.sleep(4000);
			if (PageObjects_ResourceAttribute.designation_editButton(Constant.driver).isDisplayed()) {
				//Thread.sleep(2000);
				PageObjects_ResourceAttribute.designation_editButton(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify Designation Edit Button is Visible ","Designation Edit Button","Click on Designation Edit Button","Designation Edit Button should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Designation Edit Button is Visible ","Designation Edit Button","Click on Designation Edit Button","Designation Edit Button is not displayed","Pass",null);
			}
			/*//Generate random No 2nd to Edit
			char[] chars1 = "ABC123DFGHI68JKLMNOPQRSTUVWXYZ7895".toCharArray();
			StringBuilder sb1 = new StringBuilder();
			Random random1 = new Random();
			for (int i = 0; i < 8; i++) {
				char c = chars1[random1.nextInt(chars1.length)];
				sb1.append(c);
			}*/
			//Editoutput = sb1.toString();
			//	System.out.println(Editoutput);
			if (PageObjects_ResourceAttribute.designation_nameBox(Constant.driver).isDisplayed()) {
				Thread.sleep(2000);
				PageObjects_ResourceAttribute.designation_nameBox(Constant.driver).click();
				Thread.sleep(2000);
				PageObjects_ResourceAttribute.designation_nameBox(Constant.driver).clear();
				Thread.sleep(2000);
				PageObjects_ResourceAttribute.designation_nameBox(Constant.driver).sendKeys(Editoutput);
				Report.ReporterOutput("STEP","Verify Designation Name Box is displayed ","Designation Name Box","Click on Designation Name Box","Designation Name Box should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Designation Name Box is displayed ","Designation Name Box","Click on Designation Name Box","Designation Name Box not displayed","Fail",null);
			}
			//Thread.sleep(2000);
			if (PageObjects_ResourceAttribute.designation_saveButton(Constant.driver).isDisplayed()) {
				Thread.sleep(2000);
				PageObjects_ResourceAttribute.designation_saveButton(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify save Button is Visible ","save Button","Click on save Button","save Button should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify save Button is Visible ","save Button","Click on save Button","save Button is not displayed","Fail",null);
			}
			// To verify Priority field has been updated
			
			
		/*	PageObjects_ResourceAttribute.designation_buttonSearch(Constant.driver).clear();
			PageObjects_ResourceAttribute.designation_buttonSearch(Constant.driver).sendKeys(Editoutput);
			Thread.sleep(5000);


			String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr/td")).getText().trim();

			String msgB= "No matching records found";
				System.out.println(msgA);
			Thread.sleep(2000);

			if(msgA.contains(msgB))
			{
				Report.ReporterOutput("STEP","Verify Employee Category "+Editoutput+" has been Deleted.","Employee Category Deletion","Employee Category "+Editoutput+" should be deleted.","Employee Category "+Editoutput+" has been deleted.","Pass",null);		
			}*/

			
				Thread.sleep(17000);
				PageObjects_ResourceAttribute.designation_buttonSearch(Constant.driver).clear();
				PageObjects_ResourceAttribute.designation_buttonSearch(Constant.driver).sendKeys(Editoutput);
				//Thread.sleep(2000);

				String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();
//html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]
				String msgB1= Editoutput.trim();
		//		System.out.println(msgA1);
				//Thread.sleep(2000);

				if(msgA1.equalsIgnoreCase(msgB1))
				{
					Report.ReporterOutput("STEP","Verify Designation Name has been updated.","Name Updated","Designation Name should be updated.","Designation Name has been updated.","Pass",null);
				}

				else{
				
					Report.ReporterOutput("STEP","Verify Designation Name has been updated.","Name Updated","Designation Name should be updated.","Designation Name is not updated successfully.","Fail",null);
				}
				
				//Thread.sleep(3000);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**********************************************************************************************************************************************

	// For Delete

	public static void designationPage_searchDel(String Editoutput) throws Throwable {
		try {
			Thread.sleep(10000);
			// for search 
			if (PageObjects_ResourceAttribute.designation_buttonSearch(Constant.driver).isDisplayed()) {
				//Thread.sleep(2000);
				PageObjects_ResourceAttribute.designation_buttonSearch(Constant.driver).click();
				//Thread.sleep(2000);
				PageObjects_ResourceAttribute.designation_buttonSearch(Constant.driver).clear();
			//	Thread.sleep(4000);

				//Giving output from First add Method
				PageObjects_ResourceAttribute.designation_buttonSearch(Constant.driver).sendKeys(Editoutput);

				Report.ReporterOutput("STEP","Verify Designation Page Search Button is Visible ","Designation Page Search Button ","Click on Designation Page Search Button","Designation Page Search Button should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Designation Page Search Button Visible ","Designation Page Search Button ","Click on Designation Page Search Button ","Designation Page Search Button not displayed","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//**********************************************************************************************************************************************

	public static void designationPage_Delete(String Editoutput) throws Throwable {

		// for search functionality 2nd Time To Delete
		Thread.sleep(4000);
		if (PageObjects_ResourceAttribute.designation_deleteButton(Constant.driver).isDisplayed()) {
			//Thread.sleep(5000);
			PageObjects_ResourceAttribute.designation_deleteButton(Constant.driver).click();
			Report.ReporterOutput("STEP","Verify Designation Delete Button is Visible ","Designation Delete Button ","Click on Designation Delete Button","Designation Delete Button should be displayed and clicked","Pass",null);
		}
		else {
			Report.ReporterOutput("STEP","Verify Designation Delete Button is Visible ","Project Methodology Delete Button","Click on Designation Delete Button","Designation Delete Button is not displayed","Fail",null);
		}
		if (PageObjects_ResourceAttribute.designation_deleteokButton(Constant.driver).isDisplayed()) {
			//Thread.sleep(2000);
			PageObjects_ResourceAttribute.designation_deleteokButton(Constant.driver).click();
			Thread.sleep(2000);
			Report.ReporterOutput("STEP","Verify Designation Delete ok Button is Visible ","Designation Delete ok Button","Click on Designation Delete ok Button","Designation Delete ok Button should be displayed and clicked","Pass",null);
		}
		else {
			Report.ReporterOutput("STEP","Verify Designation Delete ok Button is Visible ","Designation Delete ok Button","Click on Designation Delete ok Button","Designation Delete ok Button is not displayed","Fail",null);
		}
	//	Thread.sleep(2000);
		/*if (PageObjects_ResourceAttribute.designation_deleteConfirmationMsg(Constant.driver).isDisplayed()) {
			Report.ReporterOutput("STEP","Verify  Designation Delete Confirmation Msg is Visible "," Designation Delete Confirmation Msg","Click on  Designation Delete Confirmation Msg"," Designation Delete Confirmation Msg should be displayed and clicked","Pass",null);
		}
		else {
			Report.ReporterOutput("STEP","Verify  Designation Delete Confirmation Msg is Visible "," Designation Delete Confirmation Msg","Click on  Designation Delete Confirmation Msg"," Designation Delete Confirmation Msg is not displayed","Fail",null);
		}*/
		//Thread.sleep(2000);

		/*//Verify New Designation By has been deleted

		String Page_Designation = PageObjects_ResourceAttribute.designation_nomatchingRecordsText(Constant.driver).getText();//.//*[@id='example']/tbody/tr/td
		if (Page_Designation.equalsIgnoreCase("No matching records found")) {
			Report.ReporterOutput("STEP","Verify Designation No Matching  Records Text is Visible "," No Matching Records","Search Deleted Value"," No Matching  Records Text is Visible","Pass",null);
		} else {
			Report.ReporterOutput("STEP","Verify Designation  No Matching  Records Text is Visible ","No Matching Records","Search Deleted Value"," No Matching  Records Text is Visibleis not visible","Fail",null);
		}
		Thread.sleep(2000);
		*/
		//Verify New Location By has been deleted

				// exact	
		            Thread.sleep(15000);
					PageObjects_ResourceAttribute.designation_buttonSearch(Constant.driver).clear();
					PageObjects_ResourceAttribute.designation_buttonSearch(Constant.driver).sendKeys(Editoutput);//function parameter esend need to pass  here 
					   //Thread.sleep(5000);
					  // Thread.sleep(3000);
					   String delete = PageObjects_ResourceAttribute.designation_nomatchingRecordsText(Constant.driver).getText();
					   String deletetoverify ="No matching records found";

					   if(delete.equalsIgnoreCase(deletetoverify)){
					    //Report.ReporterOutput("STEP","Verify Skill Type Name  has been deleted","Skill Type Name deletion","Skill Type Name should be deleted succesfully","Skill Type Name has not been deleted succesfully","fail",null);
					    //Thread.sleep(2000);
					    Report.ReporterOutput("STEP","Verify Deleted Designation Type Name : "+Editoutput+" has been Deleted","Delete Designation Type Name","Delete Designation Type Name : "+Editoutput+" should be Deleted","Delete Designation Type Name "+Editoutput+" has been Deleted","Pass",null);
					   }else
					   {
					    //Report.ReporterOutput("STEP","Verify Skill Type Name  has been deleted","Skill Type Name deletion","Skill Type Name should not be deleted succesfully","Skill Type Name has not been deleted succesfully","Pass",null);
					    Report.ReporterOutput("STEP","Verify Deleted Designation Type Name : "+Editoutput+" has been Deleted","Delete Designation Type Name","Delete Designation Type Name : "+Editoutput+" should be Deleted","Delete Designation Type Name "+Editoutput+" has NOT been Deleted","Pass",null);
					   }
					   Thread.sleep(12000);
		PageObjects_ResourceAttribute.designation_buttonSearch(Constant.driver).clear();
		PageObjects_ResourceAttribute.designation_linkMasterData(Constant.driver).click();
		// **********************************************************************************
		// to click on Home page
		try
		{
			if(Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).isDisplayed());
			{
				Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).click();
				Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is navigated to RMS Home page","Pass",null);
			}
		}
		catch(Exception e8)
		{
			System.out.println( e8.getMessage());


		}
	}
	// **********************************************************************************

}//End of class
//**********************************************************************************
























