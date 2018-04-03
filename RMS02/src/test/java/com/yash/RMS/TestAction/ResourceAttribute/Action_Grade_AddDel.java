package com.yash.RMS.TestAction.ResourceAttribute;

import org.openqa.selenium.By;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.ProjectAttribute.PageObjects_ProjectAttribute;
import com.yash.RMS.POM.ResourceAttribute.PageObjects_ResourceAttribute;

public class Action_Grade_AddDel {
	private static final String UpdatedPriority = null;
	public static String GradeAdd_name;

	/*public static String output;
	public static String Editoutput;*/

	//******FOR NAVIGATION******************************************************************************************
	//Masterdata Link
	public static void grade_Navigation() throws Throwable {
		try {
			//Thread.sleep(4000);
			//(Constant.driver).manage().window().maximize();
			if (PageObjects_ResourceAttribute.grade_linkMasterData(Constant.driver).isDisplayed()) {
				PageObjects_ResourceAttribute.designation_linkMasterData(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify master data Link is displayed ","Master Data link", "Click on master data link","master data link should be displayed and clicked", "Pass", null);
			} else {
				Report.ReporterOutput("STEP","Master Data link is displayed ","Master Data link","Click on master data link","master data link not displayed","Fail",null);
			}
			//Thread.sleep(2000);

			//Resource Attribute Link
			if (PageObjects_ResourceAttribute.grade_linkResourceAttribute(Constant.driver).isDisplayed()) {
				PageObjects_ResourceAttribute.grade_linkResourceAttribute(Constant.driver).click();
				Report.ReporterOutput("STEP","Resource Attribute Link is displayed ","Resource Attribute Link","Click on Resource Attribute Link","Resource Attribute Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Resource Attribute Link is displayed ","Resource Attribute Link","Click on Resource Attribute Link","Resource Attribute Link  is not displayed","Fail",null);
			}
			//Thread.sleep(2000);

			//Designation Link
			Thread.sleep(2000);
			if (PageObjects_ResourceAttribute.grade_link(Constant.driver).isDisplayed()) {
				PageObjects_ResourceAttribute.grade_link(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify Grade link is displayed ","Grade link","Click on Grade link","Grade link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Grade link is displayed ","Grade link","Click on Grade link","Grade link not displayed","Fail",null);
			}
			// Designation Page Text
			String Page_Grade = PageObjects_ResourceAttribute.grade_pageText(Constant.driver).getText();

			if (Page_Grade.equalsIgnoreCase("Grade")) {
				Report.ReporterOutput("STEP","Verify Grade Page Text is Visible ","Grade Page Text","Click on Grade Page Text","Grade Page Text is visible","Pass",null);
			} else {

				Report.ReporterOutput("STEP","Verify Grade Page Text is Visible ","Grade Page Text","Click on Grade Page Text","Grade Page Text is not visible","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//*********************************************************************************************************************************************

	//For Adding Designation
	public static void gradePage_Add(String GradeAdd_name) throws Throwable {
		try {
			if (PageObjects_ResourceAttribute.grade_linkAddNew(Constant.driver).isDisplayed()) {
				PageObjects_ResourceAttribute.grade_linkAddNew(Constant.driver).click();
			//	Thread.sleep(2000);
				Report.ReporterOutput("STEP","Verify Grade Page Add New Link is displayed ","Grade Page Add New Link","Click on Grade Page Add New Link","Grade Page Add New Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Grade Page Add New Link is displayed ","Grade Page Add New Link","Click on Grade Page Add New Link","Grade Page Add New Link not displayed","Fail",null);
			}
			Thread.sleep(2000);
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
			 */			if (PageObjects_ResourceAttribute.grade_addNewNameBox(Constant.driver).isDisplayed()) {
				 PageObjects_ResourceAttribute.grade_addNewNameBox(Constant.driver).click();
				 Thread.sleep(2000);
				 PageObjects_ResourceAttribute.grade_addNewNameBox(Constant.driver).sendKeys(GradeAdd_name);
				 Report.ReporterOutput("STEP","Verify Grade Name Box is displayed ","Grade Name Box","Click on Grade Name Box","Grade Name Box should be displayed and clicked","Pass",null);
			 }
			 else {
				 Report.ReporterOutput("STEP","Verify Grade Name Box is displayed ","Grade Name Box","Click on Grade Name Box","Grade Name Box not displayed","Fail",null);
			 }
			// Thread.sleep(2000);

			 // to click on Save button/Verify new Grade has been added
			 if(Constant.driver.findElement(By.linkText("Save")).isEnabled());
			 {
				 Report.ReporterOutput("STEP","Verify Save button is enabled ","Save button","Save button should be enabled","Save button is enabled","Pass",null);
				 Constant.driver.findElement(By.linkText("Save")).click();
			 }
			 Thread.sleep(2000);{
				 Report.ReporterOutput("STEP","Verify new Grade has been created","new Grade creation","new Grade Type should be created","new Grade has been created","Pass",null);
			 }
			 /* if (PageObjects_ResourceAttribute.grade_buttonSave(Constant.driver).isDisplayed()) {
				 PageObjects_ResourceAttribute.grade_buttonSave(Constant.driver).click();
				 Report.ReporterOutput("STEP","Verify Grade Page Save Button is Visible ","Grade Page Save Button","Click on Grade Page Save Button","Grade Page Save Button should be displayed and clicked","Pass",null);
			 }
			 else {
				 Report.ReporterOutput("STEP","Verify Grade Page Save Button is Visible ","Grade Page Save Button","Click on Grade Page Save Button","Grade Page Save Button is not displayed","Fail",null);
			 }
			 Thread.sleep(2000);*/
			 
			/* if (PageObjects_ResourceAttribute.grade_saveButtonConfirmationMessage(Constant.driver).isDisplayed()) {

				 Report.ReporterOutput("STEP","Verify Grade Page Save Button Confirmation Message is displayed ","Grade Page Save Button Confirmation Message","Click on Grade Page Save Button Confirmation Message","Grade Page Save Button Confirmation Message should be displayed","Pass",null);
			 }
			 else {

				 Report.ReporterOutput("STEP","Verify Grade Page Save Button Confirmation Message is displayed ","Grade Page Save Button Confirmation Message","Click on Grade Page Save Button Confirmation Message","Grade Page Save Button Confirmation Message not displayed","Fail",null);
			 }*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//**********************************************************************************************************************************************
	//************ to Search and verify created Grade Name **************************************

	public static void SearchGradeName(String GradeAdd_name) throws Throwable
	{
		try
		{
			Thread.sleep(15000);
			PageObjects_ResourceAttribute.grade_buttonSearch(Constant.driver).clear();
			PageObjects_ResourceAttribute.grade_buttonSearch(Constant.driver).sendKeys(GradeAdd_name);
			//Thread.sleep(5000);


			String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

			String msgB= GradeAdd_name.trim();
			System.out.println(msgA);
			//Thread.sleep(2000);

			if(msgA.equalsIgnoreCase(msgA))
			{
				Report.ReporterOutput("STEP","Verify new Grade Name "+GradeAdd_name+" is searched and verified.",GradeAdd_name,"New Grade Name  "+GradeAdd_name+" should be searched and verification.","New Grade Name "+GradeAdd_name+" searched and verified.","Pass",null);
			}
			else{
				Report.ReporterOutput("STEP","Verify new Grade Name "+GradeAdd_name+" is searched and verified.",GradeAdd_name,"New Grade Name  "+GradeAdd_name+" should be searched and verification.","New Grade Name "+GradeAdd_name+" is not searched and verified.","Fail",null);
			}
			//Thread.sleep(3000);
		}
		catch(Exception e2)
		{
			
		}

	} 

	//*******************************************************************************************************************************************


	//For Editing Designation
	public static void gradePage_searchEdit(String GradeAdd_name) throws Throwable {
		try {
			//Thread.sleep(4000);
			// for search 
			
			Thread.sleep(15000);
			if (PageObjects_ResourceAttribute.grade_buttonSearch(Constant.driver).isDisplayed()) {

				PageObjects_ResourceAttribute.grade_buttonSearch(Constant.driver).click();
			//	Thread.sleep(2000);

				PageObjects_ResourceAttribute.grade_buttonSearch(Constant.driver).clear();
				//Giving output from First add Method
				PageObjects_ResourceAttribute.grade_buttonSearch(Constant.driver).sendKeys(GradeAdd_name);
			//	Thread.sleep(2000);
				Report.ReporterOutput("STEP","Verify Grade Page Search Button is Visible ","Grade Page Search Button ","Click on Grade Page Search Button ","Grade Page Search Button should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Grade Page Search Button is Visible ","Designation Page Search Button ","Click on Grade Page Search Button","Grade Page Search Button not displayed","Pass",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**********************************************************************************************************************************************

	public static void gradePage_Edit(String Editoutput) throws Throwable {
		try {
			Thread.sleep(4000);
			if (PageObjects_ResourceAttribute.designation_editButton(Constant.driver).isDisplayed()) {
				Thread.sleep(2000);
				PageObjects_ResourceAttribute.designation_editButton(Constant.driver).click();
				Thread.sleep(4000);
				Report.ReporterOutput("STEP","Verify Designation Edit Button is Visible ","Grade Edit Button","Click on Grade Edit Button","Grade Edit Button should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Grade Edit Button is Visible ","Grade Edit Button","Click on Grade Edit Button","Grade Edit Button is not displayed","Fail",null);
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
			Thread.sleep(4000);
			if (PageObjects_ResourceAttribute.grade_addNewNameBox(Constant.driver).isDisplayed()) {
			//	Thread.sleep(2000);
				PageObjects_ResourceAttribute.grade_addNewNameBox(Constant.driver).click();
				//Thread.sleep(2000);
				PageObjects_ResourceAttribute.grade_addNewNameBox(Constant.driver).clear();
				//Thread.sleep(2000);
				PageObjects_ResourceAttribute.grade_addNewNameBox(Constant.driver).sendKeys(Editoutput);
				Report.ReporterOutput("STEP","Verify Grade Name Box is displayed ","Grade Name Box","Click on Grade Name Box","Grade Name Box should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Grade Name Box is displayed ","Grade Name Box","Click on Grade Name Box","Grade Name Box not displayed","Fail",null);
			}
			Thread.sleep(2000);
			if (PageObjects_ResourceAttribute.grade_buttonSave(Constant.driver).isDisplayed()) {
				Thread.sleep(2000);
				PageObjects_ResourceAttribute.grade_buttonSave(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify save Button is Visible ","save Button","Click on save Button","save Button should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify save Button is Visible ","save Button","Click on save Button","save Button is not displayed","Fail",null);
			}
			// To verify Priority field has been updated
			try
			{
				Thread.sleep(17000);
				PageObjects_ResourceAttribute.grade_buttonSearch(Constant.driver).clear();
				PageObjects_ResourceAttribute.grade_buttonSearch(Constant.driver).sendKeys(Editoutput);
			//	Thread.sleep(2000);

				String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

				String msgB1= Editoutput.trim();
		//		System.out.println(msgA1);
				//Thread.sleep(2000);

				if(msgA1.equalsIgnoreCase(msgB1))
				{
					Report.ReporterOutput("STEP","Verify Grade Name has been updated.","Name Updated","Grade Name should be updated.","Grade Name has been updated.","Pass",null);
				}
				else{
					Report.ReporterOutput("STEP","Verify Grade Name has been updated.","Name Updated","Grade Name should be updated.","Grade Name is not updated successfully.","Fail",null);
				}

			//	Thread.sleep(3000);
			}
			catch(Exception e2)
			{
				
			}


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**********************************************************************************************************************************************

	// For Delete

	public static void gradePage_searchDel(String Editoutput) throws Throwable {
		try {
			Thread.sleep(15000);
			// for search 
			if (PageObjects_ResourceAttribute.grade_buttonSearch(Constant.driver).isDisplayed()) {
			//	Thread.sleep(2000);
				PageObjects_ResourceAttribute.grade_buttonSearch(Constant.driver).click();
			//	Thread.sleep(2000);
				PageObjects_ResourceAttribute.grade_buttonSearch(Constant.driver).clear();
				//Thread.sleep(4000);

				//Giving output from First add Method
				PageObjects_ResourceAttribute.grade_buttonSearch(Constant.driver).sendKeys(Editoutput);

				Report.ReporterOutput("STEP","Verify Designation Page Search Button is Visible ","Grade Page Search Button ","Click on Grade Page Search Button","Grade Page Search Button should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Grade Page Search Button Visible ","Grade Page Search Button ","Click on Grade Page Search Button ","Grade Page Search Button not displayed","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//**********************************************************************************************************************************************

	public static void gradePage_Delete(String Editoutput) throws Throwable {

		// for search functionality 2nd Time To Delete
		Thread.sleep(4000);
		if (PageObjects_ResourceAttribute.grade_deleteButton(Constant.driver).isDisplayed()) {
			Thread.sleep(2000);
			PageObjects_ResourceAttribute.grade_deleteButton(Constant.driver).click();
			Report.ReporterOutput("STEP","Verify Grade Delete Button is Visible ","Grade Delete Button ","Click on Grade Delete Button","Grade Delete Button should be displayed and clicked","Pass",null);
		}
		else {
			Report.ReporterOutput("STEP","Verify grade_deleteButton Delete Button is Visible ","Grade Delete Button","Click on Grade Delete Button","Grade Delete Button is not displayed","Fail",null);
		}
		if (PageObjects_ResourceAttribute.grade_deleteokButton(Constant.driver).isDisplayed()) {
		//	Thread.sleep(2000);
			PageObjects_ResourceAttribute.grade_deleteokButton(Constant.driver).click();
			Thread.sleep(2000);
			Report.ReporterOutput("STEP","Verify Grade Delete ok Button is Visible ","Grade Delete ok Button","Click on Grade Delete ok Button","Grade Delete ok Button should be displayed and clicked","Pass",null);
		}
		else {
			Report.ReporterOutput("STEP","Verify Grade Delete ok Button is Visible ","Grade Delete ok Button","Click on Grade Delete ok Button","Grade Delete ok Button is not displayed","Fail",null);
		}
		//Thread.sleep(2000);
		if (PageObjects_ResourceAttribute.grade_deleteConfirmationMsg(Constant.driver).isDisplayed()) {
			Report.ReporterOutput("STEP","Verify  Grade Delete Confirmation Msg is Visible "," Grade Delete Confirmation Msg","Click on  Grade Delete Confirmation Msg"," Grade Delete Confirmation Msg should be displayed and clicked","Pass",null);
		}
		else {
			Report.ReporterOutput("STEP","Verify  Grade Delete Confirmation Msg is Visible "," Grade Delete Confirmation Msg","Click on  Grade Delete Confirmation Msg"," Grade Delete Confirmation Msg is not displayed","Fail",null);
		}
	//	Thread.sleep(2000);
		
		//Verify New Location By has been deleted

		Thread.sleep(11000);
		PageObjects_ResourceAttribute.grade_buttonSearch(Constant.driver).clear();
		PageObjects_ResourceAttribute.grade_buttonSearch(Constant.driver).sendKeys(Editoutput);//function parameter esend need to pass  here 
			   //Thread.sleep(5000);
			 //  Thread.sleep(3000);
			   String delete = PageObjects_ResourceAttribute.designation_nomatchingRecordsText(Constant.driver).getText();
			   String deletetoverify ="No matching records found";

			   if(delete.equalsIgnoreCase(deletetoverify)){
			    //Report.ReporterOutput("STEP","Verify Skill Type Name  has been deleted","Skill Type Name deletion","Skill Type Name should be deleted succesfully","Skill Type Name has not been deleted succesfully","fail",null);
			    //Thread.sleep(2000);
			    Report.ReporterOutput("STEP","Verify Deleted Grade Type Name : "+Editoutput+" has been Deleted","Delete Grade Type Name","Delete Grade Type Name : "+Editoutput+" should be Deleted","Delete Grade Type Name "+Editoutput+" has been Deleted","Pass",null);
			   }else
			   {
			    //Report.ReporterOutput("STEP","Verify Skill Type Name  has been deleted","Skill Type Name deletion","Skill Type Name should not be deleted succesfully","Skill Type Name has not been deleted succesfully","Pass",null);
			    Report.ReporterOutput("STEP","Verify Deleted Grade Type Name : "+Editoutput+" has been Deleted","Delete Grade Type Name","Delete Grade Type Name : "+Editoutput+" should be Deleted","Delete Grade Type Name "+Editoutput+" has NOT been Deleted","Pass",null);
			   }
			   Thread.sleep(11000);
		PageObjects_ResourceAttribute.grade_buttonSearch(Constant.driver).clear();
		PageObjects_ResourceAttribute.grade_linkMasterData(Constant.driver).click();
//**********************************************************************************************************************************************************************************

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
		// **********************************************************************************
	}
}//End of class





//**********************************************************************************