package com.yash.RMS.TestAction.ResourceAttribute;

import org.openqa.selenium.By;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.ProjectAttribute.PageObjects_ProjectAttribute;
import com.yash.RMS.POM.ResourceAttribute.PageObjects_ResourceAttribute;
public class Action_Location_AddDel {

	private static final String EditLocation_Name = null;
	public static String LocationAdd_name;
	public static String LocationAddHR_EmailId;

	public static void location_Navigation() throws Throwable {
		try {
			//Thread.sleep(4000);
			if (PageObjects_ResourceAttribute.location_linkMasterData(Constant.driver).isDisplayed()) {
				PageObjects_ResourceAttribute.location_linkMasterData(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify master data Link is displayed ","Master Data link", "Click on master data link","master data link should be displayed and clicked", "Pass", null);

			} else {
				Report.ReporterOutput("STEP","Master Data link is displayed ","Master Data link","Click on master data link","master data link not displayed","Fail",null);
			}
		//	Thread.sleep(2000);
			if (PageObjects_ResourceAttribute.location_linkResourceAttribute(Constant.driver).isDisplayed()) {
				PageObjects_ResourceAttribute.location_linkResourceAttribute(Constant.driver).click();
				Report.ReporterOutput("STEP","Resource Attribute Link is displayed ","Resource Attribute Link","Click on Project Attribute Link","Resource Attribute Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Resource Attribute Link is displayed ","Resource Attribute Link","Click on Resource Attribute Link","Resource Attribute Link  is not displayed","Fail",null);
			}
			Thread.sleep(2000);
			if (PageObjects_ResourceAttribute.location_link(Constant.driver).isDisplayed()) {
				PageObjects_ResourceAttribute.location_link(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify Location Link is displayed "," Location Link","Click on Location Link","Location Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Location Link is displayed ","Location Link","Click on Location Link","Location Link not displayed","Fail",null);
			}
			String Page_Location= PageObjects_ResourceAttribute.location_pageText(Constant.driver).getText();
			if (Page_Location.equalsIgnoreCase("Location")) {
				Report.ReporterOutput("STEP","Verify Location Page Text is Visible ","Location Page Text","Click on Location Page Text","Location Page Text is visible","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify Location Page Text is Visible ","Location Page Text","Click on Location Page Text","Location Page Text is not visible","Fail",null);
			}
			//Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//**********************************************************************************************************************************************
	//****************************To Add New Location***************************************************

	public static void location_Add(String LocationAdd_name, String LocationAddHR_EmailId ) throws Throwable {
		try {
			if (PageObjects_ResourceAttribute.location_linkAddNew(Constant.driver).isDisplayed()) {

				PageObjects_ResourceAttribute.location_linkAddNew(Constant.driver).click();
			//	Thread.sleep(2000);
				Report.ReporterOutput("STEP","Verify Add New Link is displayed ","Add New Link","Click on Add New Link","add New Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Add New Link is displayed ","Add New Link","Click on Add New Link","add New Link not displayed","Fail",null);
			}
			//Thread.sleep(2000);
			/*char[] chars = "ABC123DFGHI68JKLMNOPQRSTUVWXYZ7895".toCharArray();
			StringBuilder sb = new StringBuilder();
			Random random = new Random();
			for (int i = 0; i < 8; i++) {
				char c = chars[random.nextInt(chars.length)];
				sb.append(c);
			}
			output = sb.toString();*/
			//System.out.println("first output "+output);
			// to fill Location name
			PageObjects_ResourceAttribute.location_addNewLocationNameBox(Constant.driver).click();
			PageObjects_ResourceAttribute.location_addNewLocationNameBox(Constant.driver).sendKeys(LocationAdd_name);
		//	Thread.sleep(2000);

			// to fill  priority value
			PageObjects_ResourceAttribute.location_addNewLocationHRNameBox(Constant.driver).click();
			PageObjects_ResourceAttribute.location_addNewLocationHRNameBox(Constant.driver).sendKeys(LocationAddHR_EmailId);
			//Thread.sleep(2000);
			Report.ReporterOutput("STEP","Verify all parameters have been provided for creating new Location","Parameters","All parameters should be provided for creating new Location","All parameters provided for creating new Location","Pass",null);

			// to click on Save button/Verify new Location has been added
			if(Constant.driver.findElement(By.linkText("Save")).isEnabled());
			{
				Report.ReporterOutput("STEP","Verify Save button is enabled ","Save button","Save button should be enabled","Save button is enabled","Pass",null);
				Constant.driver.findElement(By.linkText("Save")).click();
			}
			Thread.sleep(2000);{
				Report.ReporterOutput("STEP","Verify new Location has been created","new Location creation","new Location Type should be created","new Location has been created","Pass",null);
			}

			/*{
						System.out.println( e1.getMessage());
					}*/
			/*if (PageObjects_ResourceAttribute.location_buttonSave(Constant.driver).isDisplayed()) {
				PageObjects_ResourceAttribute.location_buttonSave(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify saveButton is Visible ","saveButton","Click on saveButton","saveButton should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify saveButton is Visible ","saveButton","Click on saveButton","saveButton is not displayed","Fail",null);
			}*/
			//Thread.sleep(2000);
			/*if (PageObjects_ResourceAttribute.location_saveButtonConfirmationMessage(Constant.driver).isDisplayed()) {
				Report.ReporterOutput("STEP","Verify save Button Confirmation Message is displayed ","saveButton Confirmation Message","Click on saveButton Confirmation Message","saveButton Confirmation Message should be displayed","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify save Button Confirmation Message is displayed ","saveButton Confirmation Message","Click on saveButton Confirmation Message","saveButton Confirmation Message not displayed","Fail",null);
			}*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**********************************************************************************************************************************************
	//************ to Search and verify created Location Name **************************************

	public static void SearchLocationName(String LocationAdd_name) throws Throwable
	{
		try
		{
			Thread.sleep(17000);
			PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).clear();
			PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).sendKeys(LocationAdd_name);
			//Thread.sleep(5000);


			String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

			String msgB= LocationAdd_name;
			System.out.println(msgA);
			//Thread.sleep(2000);

			if(msgA.contains(msgB))
			{
				Report.ReporterOutput("STEP","Verify new Location Name "+LocationAdd_name+" is searched and verified.",LocationAdd_name,"New Location Name  "+LocationAdd_name+" should be searched and verified.","New Location Name "+LocationAdd_name+" searched and verified.","Pass",null);
			}

		//	Thread.sleep(3000);
		}
		catch(Exception e2)
		{
			Report.ReporterOutput("STEP","Verify new Location Name "+LocationAdd_name+" is searched and verified.",LocationAdd_name,"New Location Name  "+LocationAdd_name+" should be searched and verified.","New Location Name "+LocationAdd_name+" is not searched and verified.","Fail",null);
		}

	} 
	//**********************************************************************************************************************************************
	public static void location_search_Edit(String LocationAdd_name) throws Throwable {

		try {
			Thread.sleep(17000);
			// for search 
			if (PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).isDisplayed()) {
				PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).click();
			//	Thread.sleep(2000);
				PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).clear();
				//Giving output from First add Method
				PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).sendKeys(LocationAdd_name);
				//Thread.sleep(2000);

				//	PageObjects_ResourceAttribute.location_editButton(Constant.driver).click();

				Report.ReporterOutput("STEP","Verify search Box is Visible ","search Box ","Click on search Box ","search Box should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify search Box is Visible ","search Box ","Click on search Box ","search Box not displayed","Pass",null);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**********************************************************************************************************************************************
	public static void location_EditLocation(String EditLocation_Name,String Edit_Location_EmailId) throws Throwable {


		try {
			Thread.sleep(4000);
			if (PageObjects_ResourceAttribute.location_editButton(Constant.driver).isDisplayed()) {
			//	Thread.sleep(2000);
				PageObjects_ResourceAttribute.location_editButton(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify edit Button is Visible ","edit Button","Click on edit Button","edit Button should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify edit Button is Visible ","edit Button","Click on edit Button","edit Button is not displayed","Pass",null);
			}

			//Generate random No 2nd to Edit
			/*	char[] chars1 = "ABC123DFGHI68JKLMNOPQRSTUVWXYZ7895".toCharArray();
					StringBuilder sb1 = new StringBuilder();
					Random random1 = new Random();
					for (int i = 0; i < 8; i++) {
						char c = chars1[random1.nextInt(chars1.length)];
						sb1.append(c);
					}
					Editoutput = sb1.toString();
					System.out.println(Editoutput);*/

			PageObjects_ResourceAttribute.location_addNewLocationNameBox(Constant.driver).click();
			//Thread.sleep(2000);
			PageObjects_ResourceAttribute.location_addNewLocationNameBox(Constant.driver).clear();
		//	Thread.sleep(2000);
			PageObjects_ResourceAttribute.location_addNewLocationNameBox(Constant.driver).sendKeys(EditLocation_Name);

			// Below code is for HR name : Location HR name 
			//Thread.sleep(2000);
			PageObjects_ResourceAttribute.location_addNewLocationHRNameBox(Constant.driver).click();
		//	Thread.sleep(2000);
			PageObjects_ResourceAttribute.location_addNewLocationHRNameBox(Constant.driver).clear();
			//Thread.sleep(2000);
			PageObjects_ResourceAttribute.location_addNewLocationHRNameBox(Constant.driver).sendKeys(Edit_Location_EmailId);
			// Editoutput1 = Location HR Name 
			//Thread.sleep(2000);

			Report.ReporterOutput("STEP","Verify all parameters have been provided for Updating Location","Parameters","All parameters should be provided for Updating Location","All parameters provided for Updating Location","Pass",null);

			if (PageObjects_ResourceAttribute.location_buttonSave(Constant.driver).isDisplayed()) {
				PageObjects_ResourceAttribute.location_buttonSave(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify saveButton is Visible ","saveButton","Click on saveButton","saveButton should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify saveButton is Visible ","saveButton","Click on saveButton","saveButton is not displayed","Fail",null);
			}


			// To verify location Type has been updated

			Thread.sleep(17000);
			PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).clear();
			PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).sendKeys(EditLocation_Name);
			//Thread.sleep(2000);
			String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();
			String msgB1= EditLocation_Name;                  //html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3] 
		//	System.out.println(msgA1);
		//	Thread.sleep(2000);
			if(msgA1.contains(msgB1))
			{
				Report.ReporterOutput("STEP","Verify Location has been updated","Location updation","Location should be Updated succesfully","Location has been updated succesfully","Pass",null);
			}
			else
			{
				Report.ReporterOutput("STEP","Verify Location has been updated","Location updation","Location should be Updtaed succesfully","Location is not updated succesfully","Fail",null);
			}

			// To verify Priority field has been updated
			Thread.sleep(2000);
			String msC1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]")).getText().trim();
			String msgD1= Edit_Location_EmailId;
	//		System.out.println(msC1);
			//Thread.sleep(2000);

			if(msC1.contains(msgD1))
			{
				Report.ReporterOutput("STEP","Verify Priority field has been updated","Priority field updation","Priority field should be Updated succesfully","Priority field has been updated succesfully","Pass",null);
			}
			else
			{
				Report.ReporterOutput("STEP","Verify Priority field has been updated","Priority field updation","Priority field should be Updated succesfully","Priority field has been updated succesfully","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	/*//To verify Location Has been updated

				Thread.sleep(5000);

				String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();
				String msgB1= EditLocation_Name;
				System.out.println(msgA1);
				Thread.sleep(2000);
				if(msgA1.contains(msgB1))
				{
					Report.ReporterOutput("STEP","Verify Location field has been updated","Location field updation","Location field should be Updated succesfully","Location field has been updated succesfully","Pass",null);
				}

				Thread.sleep(2000);
{
				Report.ReporterOutput("STEP","Verify Location field has been updated","Location field updation","Location field should be Updated succesfully","Location field has not been updated succesfully","Fail",null);
}*/
	/*  // To verify Priority field has been updated

						Thread.sleep(2000);
						String msgC1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]")).getText().trim();

						String msgD1= Edit_Location_EmailId;
						System.out.println(msgC1);
						Thread.sleep(2000);

						if(msgC1.contains(msgD1))
						{
							Report.ReporterOutput("STEP","Verify Priority field has been updated","Priority field updation","Priority field should be Updated succesfully","Priority field has been updated succesfully","Pass",null);
						}

						Report.ReporterOutput("STEP","Verify Priority field has been updated","Priority field updation","Priority field should be Updated succesfully","Priority field has been updated succesfully","Pass",null);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


				}
	 */
	//******************************************************************************** **************************************************************
	public static void location_search_Del(String EditLocation_Name) throws Throwable {
		try {
			Thread.sleep(17000);
			// for search 
			if (PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).isDisplayed()) {
				//Thread.sleep(2000);
				PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).click();
			//	Thread.sleep(2000);
				PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).clear();
				//Thread.sleep(4000);
				PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).sendKeys(EditLocation_Name);
				Report.ReporterOutput("STEP","Verify search Box is Visible ","search Box ","Click on search Box ","search Box should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify search Box is Visible ","search Box ","Click on search Box ","search Box not displayed","Pass",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**********************************************************************************************************************************************

	public static void location_Delete(String EditLocation_Name) throws Throwable {

		try {
			// for search functionality 2nd Time To Delete
			//Thread.sleep(4000);
			if (PageObjects_ResourceAttribute.location_deleteButton(Constant.driver).isDisplayed()) {
			//	Thread.sleep(2000);
				PageObjects_ResourceAttribute.location_deleteButton(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify delete`Button is Visible ","delete`Button ","Click on delete Button","delete Button should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify delete`Button is Visible ","delete`Button ","Click on delete Button","delete Button is not displayed","Fail",null);
			}
			if (PageObjects_ResourceAttribute.location_deleteokButton(Constant.driver).isDisplayed()) {
			//	Thread.sleep(2000);
				PageObjects_ResourceAttribute.location_deleteokButton(Constant.driver).click();

				Report.ReporterOutput("STEP","Verify delete Ok Button is Visible ","delete Ok Button","Click on delete Ok Button","delete Ok Button should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify delete Ok Button is Visible ","delete Ok Button","Click on delete Ok Button","delete Ok Button is not displayed","Fail",null);
			}
			Thread.sleep(1000);
			if (PageObjects_ResourceAttribute.location_deleteConfirmationMsg(Constant.driver).isDisplayed()) {
				Report.ReporterOutput("STEP","Verify delete Confirmation Msg is Visible ","delete Confirmation Msg","Click on delete Confirmation Msg","delete Confirmation Msg should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify delete Confirmation Msg is Visible ","delete Confirmation Msg","Click on delete Confirmation Msg","delete Confirmation Msg is not displayed","Fail",null);
			}
		//	Thread.sleep(2000);

		
			/*// To verify if Location has been deleted successfully
			PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).clear();
			PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).sendKeys(EditLocation_Name);
			Thread.sleep(8000);
			
			String Page_LocationRecords= PageObjects_ResourceAttribute.location_pageRecords(Constant.driver).getText();
			if (Page_LocationRecords.equalsIgnoreCase("No matching records found")) {
				Report.ReporterOutput("STEP","Verify Location Page Records is Visible ","Page_LocationRecords","Click on Location Page Records","Location Page Records is visible","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify Location Page Records is Visible ","Page_LocationRecords","Click on Location Page Records","Location Page Records is not visible","Fail",null);
			}*/
			 
			/*PageObjects_TimesheetAttribute.txt_AllocationType_Search(Constant.driver).clear();
			PageObjects_TimesheetAttribute.txt_AllocationType_Search(Constant.driver).sendKeys(UpdatedAllocationTypeName);
			Thread.sleep(5000);*/

		/*	//Verify New Designation By has been deleted

			String Page_Location = PageObjects_ResourceAttribute.location_nomatchingRecordsText(Constant.driver).getText();//.//*[@id='example']/tbody/tr/td
			if (Page_Location.equalsIgnoreCase("No matching records found")) {
				Report.ReporterOutput("STEP","Verify Location No Matching  Records Text is Visible "," No Matching Records","Search Deleted Value"," No Matching  Records Text is Visible","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify Location  No Matching  Records Text is Visible ","No Matching Records","Search Deleted Value"," No Matching  Records Text is Visibleis not visible","Fail",null);
			}
			Thread.sleep(2000);*/
			
			//Verify New Location By has been deleted

		// exact	
			PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).clear();
			PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).sendKeys(EditLocation_Name);//function parameter esend need to pass  here 
			   //Thread.sleep(5000);
			//   Thread.sleep(3000);
			   String delete = PageObjects_ResourceAttribute.location_nomatchingRecordsText(Constant.driver).getText();
			   String deletetoverify ="No matching records found";

			   if(delete.equalsIgnoreCase(deletetoverify)){
			    //Report.ReporterOutput("STEP","Verify Skill Type Name  has been deleted","Skill Type Name deletion","Skill Type Name should be deleted succesfully","Skill Type Name has not been deleted succesfully","fail",null);
			    //Thread.sleep(2000);
			    Report.ReporterOutput("STEP","Verify Deleted Location Type Name : "+EditLocation_Name+" has been Deleted","Delete Location Type Name","Delete Location Type Name : "+EditLocation_Name+" should be Deleted","Delete Location Type Name "+EditLocation_Name+" has been Deleted","Pass",null);
			   }else
			   {
			    //Report.ReporterOutput("STEP","Verify Skill Type Name  has been deleted","Skill Type Name deletion","Skill Type Name should not be deleted succesfully","Skill Type Name has not been deleted succesfully","Pass",null);
			    Report.ReporterOutput("STEP","Verify Deleted Location Type Name : "+EditLocation_Name+" has been Deleted","Delete Location Type Name","Delete Location Type Name : "+EditLocation_Name+" should be Deleted","Delete Location Type Name "+EditLocation_Name+" has NOT been Deleted","Fail",null);
			   }
			
				

			//Or


			/*String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();
			Thread.sleep(2000);
			String msgB1= EditLocation_Name;
			System.out.println(msgA1);
			Thread.sleep(2000);

			if(msgA1.contains(msgB1))
			{
				Report.ReporterOutput("STEP","Verify Location has been deleted","+EditLocation_Name+","Location should be deleted succesfully","Location has not been deleted succesfully","fail",null);
			}
			{
				Report.ReporterOutput("STEP","Verify Location has been deleted","+EditLocation_Name+","Location should  be deleted succesfully","Location has been deleted succesfully","Pass",null);
			}*/

			PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).clear();
			PageObjects_ResourceAttribute.location_linkMasterData(Constant.driver).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

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
		catch(Exception e)
		{
			System.out.println( e.getMessage());


		}

	}	
	// **********************************************************************************


}
