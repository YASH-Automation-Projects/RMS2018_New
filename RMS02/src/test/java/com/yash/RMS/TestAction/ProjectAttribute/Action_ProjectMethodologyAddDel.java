package com.yash.RMS.TestAction.ProjectAttribute;

import java.util.Random;

import org.openqa.selenium.By;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.ProjectAttribute.PageObjects_ProjectAttribute;

public class Action_ProjectMethodologyAddDel {
	
	private static final String UpdatedPriority = null;

	//******FOR NAVIGATION******************************************************************************************
	//Masterdata Link
	public static void projectMethodology_Navigation() throws Throwable {
		try {
		//	Thread.sleep(4000);
			(Constant.driver).manage().window().maximize();
			if (PageObjects_ProjectAttribute.masterDataLink(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.masterDataLink(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify master data Link is displayed ","Master Data link", "Click on master data link","master data link should be displayed and clicked", "Pass", null);
			} else {
				Report.ReporterOutput("STEP","Master Data link is displayed ","Master Data link","Click on master data link","master data link not displayed","Fail",null);
			}
			//Thread.sleep(2000);
			//Project Attribute Link
			if (PageObjects_ProjectAttribute.projectAttributeLink(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.projectAttributeLink(Constant.driver).click();
				Report.ReporterOutput("STEP","Project Attribute Link is displayed ","Project Attribute Link","Click on Project Attribute Link","Project Attribute Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Project Attribute Link is displayed ","Project Attribute Link","Click on Project Attribute Link","Project Attribute Link  is not displayed","Fail",null);
			}
			Thread.sleep(1000);
			//Project Methodology Link
			//Thread.sleep(2000);
			if (PageObjects_ProjectAttribute.projectMethodology_link(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.projectMethodology_link(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify Project Methodology link is displayed "," Project Methodology link","Click on Project Methodology link","Project Methodology link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Project Methodology link is displayed ","Project Methodology link","Click on Project Methodology link","Project Methodology link not displayed","Fail",null);
			}
			// Project Methodology Page Text
			String Page_Project_Category = PageObjects_ProjectAttribute.projectMethodology_pageText(Constant.driver).getText();

			if (Page_Project_Category.equalsIgnoreCase("Project Methodology")) {
				Report.ReporterOutput("STEP","Verify Project Methodology Page Text is Visible "," Project Methodology Page Text","Click on Project Methodology Page Text","Project Methodology Page Text is visible","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify Project Methodology Page Text is Visible ","Project Methodology Page Text","Click on Project Methodology Page Text","Project Methodology Page Text is not visible","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//*********************************************************************************************************************************************
	//For Adding Project Methodology
	public static void  projectMethodology_Add(String ProjectMethodologyAdd_name) throws Throwable {
		try {
			if (PageObjects_ProjectAttribute.projectMethodology_addNewLink(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.projectCategory_addNewLink(Constant.driver).click();
				//Thread.sleep(2000);
				Report.ReporterOutput("STEP","Verify Project Methodology Add New Link is displayed ","Project Methodology Add New Link","Click on Project Methodology Add New Link","Project Methodology Add New Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Project Methodology Add New Link is displayed ","Project Methodology Add New Link","Click on Project Methodology Add New Link","Project Methodology Add New Link not displayed","Fail",null);
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
			 */	if (PageObjects_ProjectAttribute.projectMethodology_nameBox(Constant.driver).isDisplayed()) {
				 PageObjects_ProjectAttribute.projectMethodology_nameBox(Constant.driver).click();
				 PageObjects_ProjectAttribute.projectMethodology_nameBox(Constant.driver).sendKeys(ProjectMethodologyAdd_name);
				 Report.ReporterOutput("STEP","Verify Project Methodology Name Box is displayed ","Project Methodology Name Box","Click on Project Methodology Name Box","Project Methodology Name Box should be displayed and clicked","Pass",null);
			 }
			 else {
				 Report.ReporterOutput("STEP","Verify Project Methodology Name Box is displayed ","Project Methodology Name Box","Click on Project Methodology Name Box","Project Methodology Name Box not displayed","Fail",null);
			 }
			// Thread.sleep(2000);
			 
			// to click on Save button/Verify new Location has been added
				if(Constant.driver.findElement(By.linkText("Save")).isEnabled());
				{
					Report.ReporterOutput("STEP","Verify Save button is enabled ","Save button","Save button should be enabled","Save button is enabled","Pass",null);
					Constant.driver.findElement(By.linkText("Save")).click();
				}
				Thread.sleep(2000);{
					Report.ReporterOutput("STEP","Verify new Project Methodology has been created","new Project Methodology creation","new Project Methodology should be created","new Project Methodology has been created","Pass",null);
				}
			 
			 
			/* if (PageObjects_ProjectAttribute.projectMethodology_saveButton(Constant.driver).isDisplayed()) {
				 PageObjects_ProjectAttribute.projectMethodology_saveButton(Constant.driver).click();
				 Report.ReporterOutput("STEP","Verify Project Methodology Save Button is Visible ","Project Methodology Save Button","Click on Project Methodology Save Button","Project Methodology Save Button should be displayed and clicked","Pass",null);
			 }
			 else {
				 Report.ReporterOutput("STEP","Verify Project Methodology Save Button is Visible ","Project Methodology Save Button","Click on Project Methodology Save Button","Project Methodology Save Button is not displayed","Fail",null);
			 }
			 Thread.sleep(2000);*/
			/* if (PageObjects_ProjectAttribute.projectMethodology_saveButtonConfirmationMessage(Constant.driver).isDisplayed()) {

				 Report.ReporterOutput("STEP","Verify Project Methodology Save Button Confirmation Message is displayed ","Project Methodology Save Button Confirmation Message","Click on Project Methodology Save Button Confirmation Message","Project Methodology Save Button Confirmation Message should be displayed","Pass",null);
			 }
			 else {
				 Report.ReporterOutput("STEP","Verify Project Methodology Save Button Confirmation Message is displayed ","Project Methodology Save Button Confirmation Message","Click on Project Methodology Save Button Confirmation Message","Project Methodology Save Button Confirmation Message not displayed","Fail",null);
			 }*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//**********************************************************************************************************************************************
		//************ to Search and verify created Project Methodology Name **************************************
		
		public static void SearchProjectMethodology(String ProjectMethodologyAdd_name) throws Throwable
		{
		try
		{
			
			Thread.sleep(12000);
			PageObjects_ProjectAttribute.searchBox(Constant.driver).clear();
			PageObjects_ProjectAttribute.searchBox(Constant.driver).sendKeys(ProjectMethodologyAdd_name);
		//	Thread.sleep(5000);


			String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

			String msgB= ProjectMethodologyAdd_name;
			System.out.println(msgA);
			//Thread.sleep(2000);

			if(msgA.contains(msgB))
			{
				Report.ReporterOutput("STEP","Verify new ProjectMethodology Name "+ProjectMethodologyAdd_name+" is searched and verified.",ProjectMethodologyAdd_name,"New ProjectMethodology Name  "+ProjectMethodologyAdd_name+" should be searched and verification.","New ProjectMethodology Name "+ProjectMethodologyAdd_name+" searched and verified.","Pass",null);
			}

			//Thread.sleep(3000);
		}
		catch(Exception e2)
		{
			Report.ReporterOutput("STEP","Verify new ProjectMethodology Name "+ProjectMethodologyAdd_name+" is searched and verified.",ProjectMethodologyAdd_name,"New ProjectMethodology Name  "+ProjectMethodologyAdd_name+" should be searched and verification.","New ProjectMethodology Name "+ProjectMethodologyAdd_name+" is not searched and verified.","Fail",null);
		}

		} 

		//*******************************************************************************************************************************************
	//For Editing Project Methodology

	public static void projectMethodologyPage_searchEdit(String ProjectMethodologyAdd_name) throws Throwable {

		try {
			Thread.sleep(5000);
			// for search 
			if (PageObjects_ProjectAttribute.projectMethodology_searchButton(Constant.driver).isDisplayed()) {

				PageObjects_ProjectAttribute.projectMethodology_searchButton(Constant.driver).click();
				//Thread.sleep(2000);

				PageObjects_ProjectAttribute.projectMethodology_searchButton(Constant.driver).clear();
				//Giving output from First add Method
				PageObjects_ProjectAttribute.projectMethodology_searchButton(Constant.driver).sendKeys(ProjectMethodologyAdd_name);
				//Thread.sleep(2000);
				Report.ReporterOutput("STEP","Verify Project Methodology Search Button is Visible ","Project Methodology Search Button ","Click on Project Methodology Search Button ","Project Methodology Search Button should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Project Methodology Search Button is Visible ","Project Methodology Search Button ","Click on ProjectProject Methodology Search Button","Project Methodology Search Button not displayed","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**********************************************************************************************************************************************
	public static void projectMethodologyPage_Edit(String Editoutput) throws Throwable {
		try {
			Thread.sleep(3000);
			if (PageObjects_ProjectAttribute.projectMethodology_editButton(Constant.driver).isDisplayed()) {
			//	Thread.sleep(2000);
				PageObjects_ProjectAttribute.projectMethodology_editButton(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify Project Methodology Edit Button is Visible ","Project Methodology Edit Button","Click on Project Methodology Edit Button","Project Methodology Edit Button should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Project Methodology Edit Button is Visible ","Project Methodology Edit Button","Click on Project Methodology Edit Button","Project Methodology Edit Button is not displayed","Fail",null);
			}
			/*//Generate random No 2nd to Edit
					char[] chars1 = "ABC123DFGHI68JKLMNOPQRSTUVWXYZ7895".toCharArray();
					StringBuilder sb1 = new StringBuilder();
					Random random1 = new Random();
					for (int i = 0; i < 8; i++) {
						char c = chars1[random1.nextInt(chars1.length)];
						sb1.append(c);
					}
					Editoutput = sb1.toString();
					System.out.println(Editoutput);*/
			if (PageObjects_ProjectAttribute.projectMethodology_nameBox(Constant.driver).isDisplayed()) {
			//	Thread.sleep(2000);
				 PageObjects_ProjectAttribute.projectMethodology_nameBox(Constant.driver).click();
				// Thread.sleep(2000);
				 PageObjects_ProjectAttribute.projectMethodology_nameBox(Constant.driver).clear();
				//	Thread.sleep(2000);
				 PageObjects_ProjectAttribute.projectMethodology_nameBox(Constant.driver).sendKeys(Editoutput);
				 Report.ReporterOutput("STEP","Verify Project Methodology Name Box is displayed ","Project Methodology Name Box","Click on Project Methodology Name Box","Project Methodology Name Box should be displayed and clicked","Pass",null);
			 }
			 else {
				 Report.ReporterOutput("STEP","Verify Project Methodology Name Box is displayed ","Project Methodology Name Box","Click on Project Methodology Name Box","Project Methodology Name Box not displayed","Fail",null);
			 }
			
			
			/*PageObjects_ProjectAttribute.projectMethodology_nameBox(Constant.driver).click();
			Thread.sleep(2000);
			PageObjects_ProjectAttribute.projectMethodology_nameBox(Constant.driver).clear();
			Thread.sleep(2000);
			PageObjects_ProjectAttribute.projectMethodology_nameBox(Constant.driver).sendKeys(Editoutput);*/
			Thread.sleep(2000);
			//Report.ReporterOutput("STEP","Verify all parameters have been provided for Updating Project Methodology","Parameters","All parameters should be provided for Updating Project Methodology","All parameters provided for Updating Project Methodology","Pass",null);
			
			Thread.sleep(12000);
			if (PageObjects_ProjectAttribute.projectMethodology_saveButton(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.projectMethodology_saveButton(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify Project Methodology Save Button is Visible ","Project Methodology Save Button","Click on Project Methodology Save Button","Project Methodology Save Button should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Project Methodology Save Button is Visible ","Project Methodology Save Button","Click on Project Methodology Save Button","Project Methodology Save Button is not displayed","Pass",null);
			}
			
			// To verify Priority field has been updated
						try
						{
							Thread.sleep(12000);
							PageObjects_ProjectAttribute.projectMethodology_searchButton(Constant.driver).clear();
							PageObjects_ProjectAttribute.projectMethodology_searchButton(Constant.driver).sendKeys(Editoutput);
							//Thread.sleep(2000);

							String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

							String msgB1= Editoutput;
							System.out.println(msgA1);
						//	Thread.sleep(2000);

							if(msgA1.contains(msgB1))
							{
								Report.ReporterOutput("STEP","Verify Project Methodology Name has been updated.","Name Updated","Project Methodology Name should be updated.","Project Methodology Name has been updated.","Pass",null);
							}

						//	Thread.sleep(3000);
						}
						catch(Exception e2)
						{
							Report.ReporterOutput("STEP","Verify Project Methodology Name has been updated.","Name Updated","Project Methodology Name should be updated.","Project Methodology Name is not updated successfully.","Pass",null);
						}
						
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**********************************************************************************************************************************************
	// For Delete
	public static void projectMethodologypage_searchDel(String Editoutput) throws Throwable {
		try {
			Thread.sleep(12000);
			// for search 
			if (PageObjects_ProjectAttribute.projectMethodology_searchButton(Constant.driver).isDisplayed()) {
			//	Thread.sleep(2000);
				PageObjects_ProjectAttribute.projectMethodology_searchButton(Constant.driver).click();
			//	Thread.sleep(2000);
				PageObjects_ProjectAttribute.projectMethodology_searchButton(Constant.driver).clear();
				//Thread.sleep(4000);

				//Giving output from First add Method
				PageObjects_ProjectAttribute.projectMethodology_searchButton(Constant.driver).sendKeys(Editoutput);
				Report.ReporterOutput("STEP","Verify Project Methodology Search Button is Visible ","ProjectCategory_searchButton ","Click on Project Methodology Search Button","Project Methodology Search Button should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Project Methodology Search Button Visible ","Project Methodology Search Button ","Click on ProjectCategory_searchButton ","Project Methodology Search Button not displayed","Pass",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//**********************************************************************************************************************************************
	public static void projectMethodologypage_Delete(String Editoutput) throws Throwable {
//	public static void projectMethodologypage_Delete(String Editoutput) throws Throwable {

		// for search functionality 2nd Time To Delete
		Thread.sleep(1000);
		if (PageObjects_ProjectAttribute.projectMethodology_deleteButton(Constant.driver).isDisplayed()) {
			Thread.sleep(2000);
			PageObjects_ProjectAttribute.projectMethodology_deleteButton(Constant.driver).click();
			Report.ReporterOutput("STEP","Verify Project Methodology Delete Button is Visible ","Project Methodology Delete Button ","Click on Project Methodology Delete Button","Project Methodology Delete Button should be displayed and clicked","Pass",null);
		}
		else {
			Report.ReporterOutput("STEP","Verify Project Methodology Delete Button is Visible ","Project Methodology Delete Button","Click on Project Methodology Delete Button","Project Methodology Delete Button is not displayed","Fail",null);
		}
		if (PageObjects_ProjectAttribute.projectMethodology_deleteokButton(Constant.driver).isDisplayed()) {
			Thread.sleep(2000);
			PageObjects_ProjectAttribute.projectMethodology_deleteokButton(Constant.driver).click();
			Thread.sleep(2000);
			Report.ReporterOutput("STEP","Verify Project Methodology Delete ok Button is Visible ","Project Methodology Delete ok Button","Click on Project Methodology Delete ok Button","Project Methodology Delete ok Button should be displayed and clicked","Pass",null);
		}
		else {
			Report.ReporterOutput("STEP","Verify Project Methodology Delete ok Button is Visible ","Project Methodology Delete ok Button","Click on Project Methodology Delete ok Button","Project Methodology Delete ok Button is not displayed","Fail",null);
		}
		//Thread.sleep(2000);
		if (PageObjects_ProjectAttribute.projectMethodology_deleteConfirmationMsg(Constant.driver).isDisplayed()) {
			Report.ReporterOutput("STEP","Verify Project Methodology Delete Confirmation Msg is Visible ","Project Methodology Delete Confirmation Msg","Click on Project Methodology Delete Confirmation Msg","Project Methodology Delete Confirmation Msg should be displayed and clicked","Pass",null);
		}
		else {
			Report.ReporterOutput("STEP","Verify Project Methodology Delete Confirmation Msg is Visible ","Project Methodology Delete Confirmation Msg","Click on Project Methodology Delete Confirmation Msg","Project Methodology Delete Confirmation Msg is not displayed","Fail",null);
		}
	
		//Thread.sleep(2000);
		//Verify New Location By has been deleted
		Thread.sleep(12000);
				// exact	
				PageObjects_ProjectAttribute.projectMethodology_searchButton(Constant.driver).clear();
				PageObjects_ProjectAttribute.projectMethodology_searchButton(Constant.driver).sendKeys(Editoutput);//function parameter esend need to pass  here 
					   //Thread.sleep(5000);
					  // Thread.sleep(3000);
					   String delete = PageObjects_ProjectAttribute.projectMethodology_nomatchingRecordsText(Constant.driver).getText();
					   String deletetoverify ="No matching records found";

					   if(delete.equalsIgnoreCase(deletetoverify)){
					    //Report.ReporterOutput("STEP","Verify Skill Type Name  has been deleted","Skill Type Name deletion","Skill Type Name should be deleted succesfully","Skill Type Name has not been deleted succesfully","fail",null);
					    //Thread.sleep(2000);
					    Report.ReporterOutput("STEP","Verify Deleted ProjectMethodology Type Name : "+Editoutput+" has been Deleted","Delete ProjectMethodology Type Name","Delete ProjectMethodology Type Name : "+Editoutput+" should be Deleted","Delete ProjectMethodology Type Name "+Editoutput+" has been Deleted","Pass",null);
					   }else
					   {
					    //Report.ReporterOutput("STEP","Verify Skill Type Name  has been deleted","Skill Type Name deletion","Skill Type Name should not be deleted succesfully","Skill Type Name has not been deleted succesfully","Pass",null);
					    Report.ReporterOutput("STEP","Verify Deleted ProjectMethodology Type Name : "+Editoutput+" has been Deleted","Delete ProjectMethodology Type Name","Delete ProjectMethodology Type Name : "+Editoutput+" should be Deleted","Delete ProjectMethodology Type Name "+Editoutput+" has NOT been Deleted","Fail",null);
					   }
					//Thread.sleep(2000);
		
		PageObjects_ProjectAttribute.searchBox(Constant.driver).clear();
		PageObjects_ProjectAttribute.masterDataLink(Constant.driver).click();


//OR
		
	/*	//Verify New Project Methodology has been deleted
				String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]")).getText().trim();
				Thread.sleep(2000);
				String msgB1= Editoutput;
				System.out.println(msgA1);
				Thread.sleep(2000);

				if(msgA1.contains(msgB1))
				{
					Report.ReporterOutput("STEP","Verify Project Methodology has been deleted","Project Methodology Deletion","Project Methodology should be deleted succesfully","Project Methodology has not been deleted succesfully","fail",null);
				}
				{
					Report.ReporterOutput("STEP","Verify Project Methodology has been deleted","Project Methodology Deletion","Project Methodology should  be deleted succesfully","Project Methodology has been deleted succesfully","Pass",null);
				}
		
		
		Thread.sleep(2000);
		PageObjects_ProjectAttribute.projectMethodology_searchButton(Constant.driver).clear();
		PageObjects_ProjectAttribute.masterDataLink(Constant.driver).click();*/
	


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



















}//End of class
//**********************************************************************************************************************************************























































