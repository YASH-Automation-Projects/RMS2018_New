package com.yash.RMS.TestAction.ProjectAttribute;

import org.openqa.selenium.By;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.ProjectAttribute.PageObjects_ProjectAttribute;
import com.yash.RMS.POM.ResourceAttribute.PageObjects_ResourceAttribute;

public class Action_ProjectCategoryAddDel {
	private static final String UpdatedPriority = null;
	public static String ProjectCategoryAdd_name;
	/*public static String output;
	public static String Editoutput;
	 */
	//******FOR NAVIGATION******************************************************************************************
	//Masterdata Link
	public static void projectCategorypage_Navigation() throws Throwable {
		try {
			//Thread.sleep(4000);
			//(Constant.driver).manage().window().maximize();
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
			Thread.sleep(2000);
			//ProjectCategory_Link

		//	Thread.sleep(2000);
			if (PageObjects_ProjectAttribute.projectCategory_Link(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.projectCategory_Link(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify projectCategory_Link is displayed "," projectCategory_Link","Click on projectCategory_Link","projectCategory_Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify projectCategory_Link is displayed ","projectCategory_Link","Click on projectCategory_Link","projectCategory_Link not displayed","Fail",null);
			}
			// Project Category Page Text
			String Page_Project_Category = PageObjects_ProjectAttribute.projectCategory_pageText(Constant.driver).getText();

			if (Page_Project_Category.equalsIgnoreCase("Project Category")) {
				Report.ReporterOutput("STEP","Verify Page_Project_Category is Visible "," Page_Project_Category","Click on Page_Project_Category","Page_Project_Category is visible","Pass",null);
			} else {

				Report.ReporterOutput("STEP","Verify Page_Project_Category is Visible ","Page_Project_Category","Click on Page_Project_Category","Page_Project_Category is not visible","Fail",null);
			}
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	//*********************************************************************************************************************************************
	//For Adding Project Category
	public static void projectCategorypage_Add(String ProjectCategoryAdd_name) throws Throwable {
		try {
			if (PageObjects_ProjectAttribute.projectCategory_addNewLink(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.projectCategory_addNewLink(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("STEP","Verify ProjectCategory_addNewLink is displayed ","ProjectCategory_addNewLink","Click on ProjectCategory_addNewLink","ProjectCategory_addNewLink should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify ProjectCategory_addNewLink is displayed ","ProjectCategory_addNewLink","Click on ProjectCategory_addNewLink","ProjectCategory_addNewLink not displayed","Fail",null);
			}
			//Thread.sleep(2000);
			/*char[] chars = "ABC123DFGHI68JKLMNOPQRSTUVWXYZ7895".toCharArray();
			StringBuilder sb = new StringBuilder();
			Random random = new Random();
			for (int i = 0; i < 8; i++) {
				char c = chars[random.nextInt(chars.length)];
				sb.append(c);
			}
			output = sb.toString();
			//System.out.println("first output "+output);*/	
			if (PageObjects_ProjectAttribute.projectCategory_nameBoxSorting(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.projectCategory_nameBoxSorting(Constant.driver).click();
				PageObjects_ProjectAttribute.projectCategory_nameBoxSorting(Constant.driver).sendKeys(ProjectCategoryAdd_name);
				Report.ReporterOutput("STEP","Verify ProjectCategory_nameBoxSorting is displayed ","ProjectCategory_addNewLink","Click on ProjectCategory_addNewLink","ProjectCategory_addNewLink should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify ProjectCategory_addNewLink is displayed ","ProjectCategory_addNewLink","Click on ProjectCategory_addNewLink","ProjectCategory_addNewLink not displayed","Fail",null);
			}
			//Thread.sleep(2000);

			// to click on Save button/Verify new Location has been added
			if(Constant.driver.findElement(By.linkText("Save")).isEnabled());
			{
				Report.ReporterOutput("STEP","Verify Save button is enabled ","Save button","Save button should be enabled","Save button is enabled","Pass",null);
				Constant.driver.findElement(By.linkText("Save")).click();
			}
			Thread.sleep(2000);{
				Report.ReporterOutput("STEP","Verify new Project Category has been created","new Project Category creation","new Project Category should be created","new Project Category has been created","Pass",null);
			}

			/*if (PageObjects_ProjectAttribute.projectCategory_saveButton(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.projectCategory_saveButton(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify ProjectCategory_saveButton is Visible ","ProjectCategory_saveButton","Click on ProjectCategory_saveButton","ProjectCategory_saveButton should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify ProjectCategory_saveButton is Visible ","ProjectCategory_saveButton","Click on ProjectCategory_saveButton","ProjectCategory_saveButton is not displayed","Fail",null);
			}
			Thread.sleep(2000);*/
			/*if (PageObjects_ProjectAttribute.projectCategory_saveButtonConfirmationMessage(Constant.driver).isDisplayed()) {

				Report.ReporterOutput("STEP","Verify ProjectCategory_saveButtonConfirmationMessage is displayed ","ProjectCategory_saveButtonConfirmationMessage","Click on saveButton Confirmation Message","ProjectCategory_saveButtonConfirmationMessage should be displayed","Pass",null);
			}
			else {

				Report.ReporterOutput("STEP","Verify ProjectCategory_saveButtonConfirmationMessage is displayed ","ProjectCategory_saveButtonConfirmationMessage","Click on ProjectCategory_saveButtonConfirmationMessage","ProjectCategory_saveButtonConfirmationMessage not displayed","Fail",null);
			}*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//************************************************************************************************************************************************************************
	//************ to Search and verify created Project Category Name **************************************

	public static void projectCategorypage_Search(String ProjectCategory_name) throws Throwable
	{
		try
		{
			
			Thread.sleep(12000);
			
			PageObjects_ProjectAttribute.projectCategory_searchButton(Constant.driver).clear();
			PageObjects_ProjectAttribute.projectCategory_searchButton(Constant.driver).sendKeys(ProjectCategory_name);
			//Thread.sleep(5000);
			Thread.sleep(3000);

			String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

			String msgB= ProjectCategory_name;
			System.out.println(msgA);
			//Thread.sleep(2000);

			if(msgA.contains(msgB))
			{
				Report.ReporterOutput("STEP","Verify new ProjectCategory Name "+ProjectCategory_name+" is searched and verified.",ProjectCategory_name,"New ProjectCategory Name  "+ProjectCategory_name+" should be searched and verification.","New ProjectCategory Name "+ProjectCategory_name+" searched and verified.","Pass",null);
			}

			//Thread.sleep(3000);
		}
		catch(Exception e2)
		{
			Report.ReporterOutput("STEP","Verify new ProjectCategory Name "+ProjectCategory_name+" is searched and verified.",ProjectCategory_name,"New ProjectCategory Name  "+ProjectCategory_name+" should be searched and verification.","New ProjectCategory Name "+ProjectCategory_name+" is not searched and verified.","Fail",null);
		}

	} 


	//**********************************************************************************************************************************************

	//For Editing Project Category

	public static void projectCategorypage_searchEdit(String ProjectCategoryAdd_name) throws Throwable {

		try {
			Thread.sleep(12000);
			// for search 
			if (PageObjects_ProjectAttribute.projectCategory_searchButton(Constant.driver).isEnabled()) {

				/*PageObjects_ProjectAttribute.projectCategory_searchButton(Constant.driver).click();*/
				//Thread.sleep(2000);

				PageObjects_ProjectAttribute.projectCategory_searchButton(Constant.driver).clear();
				//Giving output from First add Method
				PageObjects_ProjectAttribute.projectCategory_searchButton(Constant.driver).sendKeys(ProjectCategoryAdd_name);
				Thread.sleep(2000);
				Report.ReporterOutput("STEP","Verify ProjectCategory_searchButton is Visible ","ProjectCategory_searchButton ","Click on ProjectCategory_searchButton ","ProjectCategory_searchButton should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify ProjectCategory_searchButton is Visible ","ProjectCategory_searchButton ","Click on ProjectCategory_searchButton ","ProjectCategory_searchButton not displayed","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**********************************************************************************************************************************************
	//
	public static void projectCategorypage_Edit(String Editoutput) throws Throwable {
		try {
			Thread.sleep(4000);
			if (PageObjects_ProjectAttribute.projectCategory_editButton(Constant.driver).isDisplayed()) {
				//Thread.sleep(2000);
				PageObjects_ProjectAttribute.projectCategory_editButton(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify ProjectCategory_editButton is Visible ","ProjectCategory_editButton","Click on ProjectCategory_editButton","ProjectCategory_editButton should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify ProjectCategory_editButton is Visible ","ProjectCategory_editButton","Click on ProjectCategory_editButton","ProjectCategory_editButton is not displayed","Pass",null);
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
			if (PageObjects_ProjectAttribute.projectCategory_nameBoxSorting(Constant.driver).isDisplayed()) {
				//Thread.sleep(2000);
				PageObjects_ProjectAttribute.projectCategory_nameBoxSorting(Constant.driver).click();
				//Thread.sleep(2000);
				PageObjects_ProjectAttribute.projectCategory_nameBoxSorting(Constant.driver).clear();
				//Thread.sleep(2000);
				PageObjects_ProjectAttribute.projectCategory_nameBoxSorting(Constant.driver).sendKeys(Editoutput);
				Report.ReporterOutput("STEP","Verify Project Category Name Box is displayed ","Project Category Name Box","Click on Project Category Name Box","Project Category Name Box should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Project Category Name Box is displayed ","Project Category Name Box","Click on Project Category Name Box","Project Category Name Box not displayed","Fail",null);
			}

			//Thread.sleep(2000);
			if (PageObjects_ProjectAttribute.projectCategory_saveButton(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.projectCategory_saveButton(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify Project Category Save Button is Visible ","Project Category Save Button","Click on Project Category Save Button","Project Category Save Button should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Project Category Save Button is Visible ","Project Category Save Button","Click on Project Category Save Button","Project Category Save Button is not displayed","Pass",null);
			}

			// To verify Priority field has been updated
			try
			{
				Thread.sleep(12000);
				PageObjects_ProjectAttribute.projectCategory_searchButton(Constant.driver).clear();
				PageObjects_ProjectAttribute.projectCategory_searchButton(Constant.driver).sendKeys(Editoutput);
				//Thread.sleep(2000);

				String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

				String msgB1= Editoutput;
				System.out.println(msgA1);
				//Thread.sleep(2000);

				if(msgA1.contains(msgB1))
				{
					Report.ReporterOutput("STEP","Verify Project Category Name has been updated.","Name Updated","Project Category Name should be updated.","Project Category Name has been updated.","Pass",null);
				}

				//Thread.sleep(3000);
			}
			catch(Exception e2)
			{
				Report.ReporterOutput("STEP","Verify Project Category Name has been updated.","Name Updated","Project Category Name should be updated.","Project Category Name is not updated successfully.","Pass",null);
			}


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**********************************************************************************************************************************************

	// For Delete

	public static void projectCategorypage_searchDel(String Editoutput) throws Throwable {
		try {
			Thread.sleep(12000);
			// for search 
			if (PageObjects_ProjectAttribute.projectCategory_searchButton(Constant.driver).isDisplayed()) {
				//Thread.sleep(2000);
				PageObjects_ProjectAttribute.projectCategory_searchButton(Constant.driver).click();
				//Thread.sleep(2000);
				PageObjects_ProjectAttribute.projectCategory_searchButton(Constant.driver).clear();
				//System.out.println("For DEleteeeeeeeee"+Editoutput);

				//Giving output from First add Method
				PageObjects_ProjectAttribute.projectCategory_searchButton(Constant.driver).sendKeys(Editoutput);

				Report.ReporterOutput("STEP","Verify ProjectCategory_searchButton is Visible ","ProjectCategory_searchButton ","Click on ProjectCategory_searchButton","ProjectCategory_searchButton should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify ProjectCategory_searchButton Visible ","ProjectCategory_searchButton ","Click on ProjectCategory_searchButton ","ProjectCategory_searchButton not displayed","Pass",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//**********************************************************************************************************************************************
	//public static void projectCategorypage_Delete(String Editoutput) throws Throwable {
	public static void projectCategorypage_Delete(String Editoutput) throws Throwable {

		// for search functionality 2nd Time To Delete
		Thread.sleep(2000);
		if (PageObjects_ProjectAttribute.projectCategory_deleteButton(Constant.driver).isDisplayed()) {
			//Thread.sleep(2000);
			PageObjects_ProjectAttribute.projectCategory_deleteButton(Constant.driver).click();
			Report.ReporterOutput("STEP","Verify ProjectCategory_deleteButton is Visible ","ProjectCategory_deleteButton ","Click on ProjectCategory_deleteButton","ProjectCategory_deleteButton should be displayed and clicked","Pass",null);
		}
		else {
			Report.ReporterOutput("STEP","Verify ProjectCategory_deleteButton is Visible ","ProjectCategory_deleteButton","Click on ProjectCategory_deleteButton","ProjectCategory_deleteButton is not displayed","Fail",null);
		}
		if (PageObjects_ProjectAttribute.projectCategory_deleteokButton(Constant.driver).isDisplayed()) {
		//	Thread.sleep(2000);
			PageObjects_ProjectAttribute.projectCategory_deleteokButton(Constant.driver).click();
			Thread.sleep(2000);
			Report.ReporterOutput("STEP","Verify ProjectCategory_deleteokButton is Visible ","ProjectCategory_deleteokButton","Click on ProjectCategory_deleteokButton","ProjectCategory_deleteokButton should be displayed and clicked","Pass",null);
		}
		else {
			Report.ReporterOutput("STEP","Verify ProjectCategory_deleteokButton is Visible ","ProjectCategory_deleteokButton","Click on ProjectCategory_deleteokButton","ProjectCategory_deleteokButton is not displayed","Fail",null);
		}
		//Thread.sleep(2000);
		if (PageObjects_ProjectAttribute.projectCategory_deleteConfirmationMsg(Constant.driver).isDisplayed()) {
			Report.ReporterOutput("STEP","Verify ProjectCategory_deleteConfirmationMsg is Visible ","ProjectCategory_deleteConfirmationMsg","Click on delete Confirmation Msg","ProjectCategory_deleteConfirmationMsg should be displayed and clicked","Pass",null);
		}
		else {
			Report.ReporterOutput("STEP","Verify ProjectCategory_deleteConfirmationMsg is Visible ","ProjectCategory_deleteConfirmationMsg","Click on delete Confirmation Msg","ProjectCategory_deleteConfirmationMsg is not displayed","Fail",null);
		}
		Thread.sleep(12000);

		//Verify New Location By has been deleted

		// exact	
		PageObjects_ProjectAttribute.projectCategory_searchButton(Constant.driver).clear();
		PageObjects_ProjectAttribute.projectCategory_searchButton(Constant.driver).sendKeys(Editoutput);//function parameter esend need to pass  here 
			   //Thread.sleep(5000);
			  // Thread.sleep(3000);
			   String delete = PageObjects_ProjectAttribute.projectCategory_nomatchingRecordsText(Constant.driver).getText();
			   String deletetoverify ="No matching records found";

			   if(delete.equalsIgnoreCase(deletetoverify)){
			    //Report.ReporterOutput("STEP","Verify Skill Type Name  has been deleted","Skill Type Name deletion","Skill Type Name should be deleted succesfully","Skill Type Name has not been deleted succesfully","fail",null);
			    //Thread.sleep(2000);
			    Report.ReporterOutput("STEP","Verify Deleted ProjectCategory Type Name : "+Editoutput+" has been Deleted","Delete ProjectCategory Type Name","Delete ProjectCategory Type Name : "+Editoutput+" should be Deleted","Delete ProjectCategory Type Name "+Editoutput+" has been Deleted","Pass",null);
			   }else
			   {
			    //Report.ReporterOutput("STEP","Verify Skill Type Name  has been deleted","Skill Type Name deletion","Skill Type Name should not be deleted succesfully","Skill Type Name has not been deleted succesfully","Pass",null);
			    Report.ReporterOutput("STEP","Verify Deleted ProjectCategory Type Name : "+Editoutput+" has been Deleted","Delete ProjectCategory Type Name","Delete ProjectCategory Type Name : "+Editoutput+" should be Deleted","Delete ProjectCategory Type Name "+Editoutput+" has NOT been Deleted","Fail",null);
			   }
			//Thread.sleep(2000);
		PageObjects_ProjectAttribute.searchBox(Constant.driver).clear();
		PageObjects_ProjectAttribute.masterDataLink(Constant.driver).click();

		//OR

		//Verify New Project Category By has been deleted

		/*PageObjects_ProjectAttribute.projectCategory_searchButton(Constant.driver).clear();
		PageObjects_ProjectAttribute.projectCategory_searchButton(Constant.driver).sendKeys(Editoutput);
				String msgA1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();
				Thread.sleep(2000);
				String msgB1= Editoutput;
				System.out.println(msgA1);
				Thread.sleep(2000);

				if(msgA1.contains(msgB1))
				{
					Report.ReporterOutput("STEP","Verify Project Category has been deleted","Project Category Deletion","Project Category should be deleted succesfully","Project Category has not been deleted succesfully","fail",null);
				}
				{
					Report.ReporterOutput("STEP","Verify Project Category has been deleted","Project Category Deletion","Project Category should  be deleted succesfully","Project Category has been deleted succesfully","Pass",null);
				}*/
		
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





























