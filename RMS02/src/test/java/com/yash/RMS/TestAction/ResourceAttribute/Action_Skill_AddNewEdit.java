package com.yash.RMS.TestAction.ResourceAttribute;
//PageObjects_ResAtt
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.ResourceAttribute.PageObjects_ResAttr_Skill;

public class Action_Skill_AddNewEdit{
	//*************************FOR ADDING A NEW PHASES********************************************************************
	public static void Add_NewSkillNameType(String NewSkillNameType_01) throws Throwable {
		//Header Verification Scenario :  Skill as Text is present for the page 
		try {
			if((PageObjects_ResAttr_Skill.txt_Skill(Constant.driver)).isDisplayed())
			{
			//	System.out.println("Header Verification Scenario :  Skill as Text is present for the page ");
				Report.ReporterOutput("STEP"," Verify Header :Skill text is displayed ","Skill type","Skill type link should be displayed","Skill type link is displayed","Pass",null);
				PageObjects_ResAttr_Skill.txt_Skill(Constant.driver).click();
				Thread.sleep(3000);
				// to verify user entered Allocation type home page
				String msg=Constant.driver.findElement(By.xpath("html/body/div/div[1]/div[1]/h1")).getText().trim();
				String msg2="Skill";
				//System.out.println(msg);
				if(msg.contains(msg2))
				{
					Report.ReporterOutput("STEP","Verify Header Verification Scenario : Skill text is displayed"," Skill text is displayed ","Header: Skill text should be displayed"," Header Skill text is displayed","Pass",null);
				}else
				{
					Report.ReporterOutput("STEP","Verify Header Verification Scenario : Skill text is displayed"," Skill text is  displayed ","Header: Skill text should not be displayed"," Header Skill text is not displayed","Fail",null);
				}

				Thread.sleep(4000);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		//	To click on to ADDNEW button: Logic to Generate the Ramdom Number to avoid the time Excecution
		/*	Thread.sleep(2000);
			char[] chars = "ABC123DFGHI68JKLMNOPQRSTUVWXYZ7895".toCharArray();
			StringBuilder sb = new StringBuilder();
			Random random = new Random();
			for (int i = 0; i < 8; i++) {
				char c = chars[random.nextInt(chars.length)];
				sb.append(c);
			}
			String output = sb.toString();
			System.out.println("first output "+output);*/
		try {
			if (PageObjects_ResAttr_Skill.lnk_addNew(Constant.driver).isDisplayed())
			{
				PageObjects_ResAttr_Skill.lnk_addNew(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("STEP","Verify Add New Link is Visible "," Add New Link"," Click on Add New Link","Add New Link should be Visible","Pass",null);
			}
			else{
				Report.ReporterOutput("STEP","Verify Add New Link is Visible "," Add New Link","  Click on Add New Link","Add New Link not Visible","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(3000);
		//to verify the text box skill Name is visible 
		try {
			if (PageObjects_ResAttr_Skill.txtbox_SkillName(Constant.driver).isDisplayed()) {
				PageObjects_ResAttr_Skill.txtbox_SkillName(Constant.driver).click();
				//TO SEND the OUTPUT from Excel sheet 
				PageObjects_ResAttr_Skill.txtbox_SkillName(Constant.driver).sendKeys(NewSkillNameType_01);
				Thread.sleep(2000);
			}
			else
			{
				System.out.println("The Skill Type Edit button is not visible");
			}
			Thread.sleep(2000);
			//select Drop down value for Skill Type DD by 3)SelectByVisibleText
			Select select = new Select(Constant.driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[3]/select")));
			select.selectByVisibleText("Secondary"); // passes from function arguments //Primary, Secondary
			Thread.sleep(3000);

			// to click on Save button/Verify new Skill has been added for SkillPage 
			//if (PageObjects_ResAttr_Skill.lnk_saveSkill(Constant.driver).isDisplayed()) {
			if (PageObjects_ResAttr_Skill.lnk_saveSkill(Constant.driver).isEnabled()) {
				PageObjects_ResAttr_Skill.lnk_saveSkill(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify save Button is Enabled ","save Button ","Save button should be Enabled","Save button is Enabled","Pass",null);
				Thread.sleep(800);
				Report.ReporterOutput("STEP","Verify New Skill Type : "+NewSkillNameType_01+" has been created","New Skill Type","New Skill Type : "+NewSkillNameType_01+" should be created","New Skill Type "+NewSkillNameType_01+" has been created","Pass",null);

			}
			else {
				Report.ReporterOutput("STEP","Verify save Button is Enabled ","save Button ","Save button should be Enabled","Save button is Enabled","Pass",null);
				Thread.sleep(800);
				Report.ReporterOutput("STEP","Verify New Skill Type : "+NewSkillNameType_01+" has been created","New Skill Type","New Skill Type : "+NewSkillNameType_01+" should be created","New Skill Type "+NewSkillNameType_01+" has NOT been created","Pass",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/********************************************************************************************************************************************/
	//**** to Search and verify created Activity ****************
	public static void Search_NewSkillType1(String SkillType_01) throws Throwable
	{
		try
		{
			Thread.sleep(16000);
			PageObjects_ResAttr_Skill.txt_searchBox(Constant.driver).clear();
			PageObjects_ResAttr_Skill.txt_searchBox(Constant.driver).sendKeys(SkillType_01);
			Thread.sleep(3000);
			String msgA= Constant.driver.findElement(By.xpath(".//*[@id]/td[2]")).getText().trim();//xpath for entire column 
			String msgB= SkillType_01;
		//	System.out.println(msgA);
			Thread.sleep(2000);
			if(msgA.contains(msgB))
			{
				Report.ReporterOutput("STEP","Verify New Search : " +SkillType_01+ " should be searched and verified","New Skill Type verification","new Skill Type : "+SkillType_01+" should be searched and verification","new Skill Type "+SkillType_01+" searched and verified","Pass",null);
			}else {
				Report.ReporterOutput("STEP8","Verify New Search : " +SkillType_01+ " should be searched and verified","New Skill Type verification","new Activity : "+SkillType_01+" should be searched and verification","new Skill Type "+SkillType_01+" not searched and verified ","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/********************************************************************************************************************************************/
	//****** to Edit and verify Updated Newly create Skill Type Name  *******
	public static void Update_SkillTypeName1(String UpdatedSkillTypeName) throws Throwable
	{
		try
		{
			if(Constant.driver.findElement(By.linkText("Edit")).isEnabled()){
				Report.ReporterOutput("STEP","Verify Edit button is enabled","Edit button","Edit should be enabled","Edit button is enabled","Pass",null);
				Thread.sleep(2000);
				Constant.driver.findElement(By.linkText("Edit")).click();
				Thread.sleep(500);
				Report.ReporterOutput("STEP","Verify Updated Skill Type Name : "+UpdatedSkillTypeName+" has been Updated","Updated Skill Type Name","Updated skill Type : "+UpdatedSkillTypeName+" should be Updated","New Skill Type "+UpdatedSkillTypeName+" has been Updated","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Edit button is enabled","Edit button","Edit should be enabled","Edit button is not enabled","Fail",null);
				Thread.sleep(500);
				Report.ReporterOutput("STEP","Verify Updated Skill Type Name : "+UpdatedSkillTypeName+" has been Updated","Updated Skill Type Name","Updated skill Type : "+UpdatedSkillTypeName+" should be Updated","New Skill Type "+UpdatedSkillTypeName+" has not been Updated Successfully ","Pass",null);
			} 
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		Thread.sleep(5000);
		PageObjects_ResAttr_Skill.txtbox_SkillName(Constant.driver).clear();
		PageObjects_ResAttr_Skill.txtbox_SkillName(Constant.driver).sendKeys(UpdatedSkillTypeName);

		Thread.sleep(2000);
		// to click on Save button
		try
		{
			//if(PageObjects_ResAttr_Skill.saveAddNewSkill(Constant.driver)
			if(PageObjects_ResAttr_Skill.saveAddNewSkill(Constant.driver).isEnabled()){
				Report.ReporterOutput("STEP","Verify Save button is enabled","Save button","Save should be enabled","Save button is enabled","Pass",null);
				//	Constant.driver.findElement(By.linkText("Save")).click();
				PageObjects_ResAttr_Skill.saveAddNewSkill(Constant.driver).click();
				//lnk_saveSkill
				/*if(Constant.driver.findElement(By.linkText("Save")).isEnabled()){
				Report.ReporterOutput("STEP","Verify Save button is enabled","Save button","Save should be enabled","Save button is enabled","Pass",null);
				Constant.driver.findElement(By.linkText("Save")).click();
				//verify the link is enable or not :lnk_saveSkill
				 */			
			}else
			{
				Report.ReporterOutput("STEP","Verify Save button is enabled","Save button","Save should be enabled","Save button is not enabled","Fail",null);
			} 
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		Thread.sleep(16000);
		// To verify Activity has been updated or not 
		PageObjects_ResAttr_Skill.txt_searchBox(Constant.driver).clear();
		PageObjects_ResAttr_Skill.txt_searchBox(Constant.driver).sendKeys(UpdatedSkillTypeName);
		Thread.sleep(5000);
		String msgA1= Constant.driver.findElement(By.xpath(".//*[@id]/td[2]")).getText().trim();
		String msgB1= UpdatedSkillTypeName;
	//	System.out.println(msgA1);
		Thread.sleep(2000);
		try
		{
			if(msgA1.contains(msgB1)){
				Report.ReporterOutput("STEP","Verify Skill Type Name  has been updated","Skill Type Name Updation","Skill Type Name should be Updated succesfully","Skill Type Name has been updated succesfully","Pass",null);
				Constant.driver.findElement(By.linkText("Save")).click();
			}else
			{
				Report.ReporterOutput("STEP","Verify Skill Type Name  has been updated","Skill Type Name Updation","Skill Type Name should not be Updated succesfully","Skill Type Name has been updated succesfully","Fail",null);
			} 
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
	}
	/********************************************************************************************************************************************/
	//************ to Delete created Activity **********************
	public static void Delete_SkillTypeName1(String Delete_SkillTypeName1) throws Throwable
	{		
		try {
			Thread.sleep(3000);
			// to clear and fill Search text box
			PageObjects_ResAttr_Skill.txt_searchBox(Constant.driver).clear();
			PageObjects_ResAttr_Skill.txt_searchBox(Constant.driver).sendKeys(Delete_SkillTypeName1);
			Thread.sleep(3000);
			if(Constant.driver.findElement(By.linkText("Delete")).isEnabled()){
				Report.ReporterOutput("STEP","Verify Delete button is enabled ","Delete button","Delete button should be enabled","Delete button enabled","Pass",null);
				Thread.sleep(2000);
				Constant.driver.findElement(By.linkText("Delete")).click();
			}else{
				Report.ReporterOutput("STEP"," Verify Delete button is enabled ","Delete button","Delete button should be enabled","Delete button is not enabled","Fail",null);
			} 
			Thread.sleep(400);
			// Click OK button on Pop up 
			Constant.driver.findElement(By.xpath("html/body/ul[2]/li/div/div[2]/button[1]")).click();
			Report.ReporterOutput("STEP"," Verify Pop up window should get opened and OK button should be clicked","Pop up window","Pop up window should get opened and OK button should be clicked","Pop up window should get opened and OK button is clicked","Pass",null);
			Thread.sleep(2000);
			Thread.sleep(16000);
			//RT new :To confirm  if Delete Skill Type Name (Delete Activity) has been deleted successfully
			PageObjects_ResAttr_Skill.txt_searchBox(Constant.driver).clear();
			PageObjects_ResAttr_Skill.txt_searchBox(Constant.driver).sendKeys(Delete_SkillTypeName1);//function parameter esend need to pass  here 
			//Thread.sleep(5000);
			Thread.sleep(3000);
			String delete = PageObjects_ResAttr_Skill.txt_No_matching_records_found(Constant.driver).getText();
			String deletetoverify ="No matching records found";

			if(delete.equalsIgnoreCase(deletetoverify)){
				//Report.ReporterOutput("STEP","Verify Skill Type Name  has been deleted","Skill Type Name deletion","Skill Type Name should be deleted succesfully","Skill Type Name has not been deleted succesfully","fail",null);
				//Thread.sleep(2000);
				Report.ReporterOutput("STEP","Verify Deleted Skill Type Name : "+Delete_SkillTypeName1+" has been Deleted","Delete Skill Type Name","Delete skill Type Name : "+Delete_SkillTypeName1+" should be Deleted","Delete Skill Type Name "+Delete_SkillTypeName1+" has been Deleted","Pass",null);
			}else
			{
				//Report.ReporterOutput("STEP","Verify Skill Type Name  has been deleted","Skill Type Name deletion","Skill Type Name should not be deleted succesfully","Skill Type Name has not been deleted succesfully","Pass",null);
				Report.ReporterOutput("STEP","Verify Deleted Skill Type Name : "+Delete_SkillTypeName1+" has been Deleted","Delete Skill Type Name","Delete skill Type Name : "+Delete_SkillTypeName1+" should be Deleted","Delete Skill Type Name "+Delete_SkillTypeName1+" has NOT been Deleted","Pass",null);
			} 

			/*	//To confirm  if Delete Skill Type Name (Delete Activity) has been deleted successfully
			PageObjects_ResAttr_Skill.txt_searchBox(Constant.driver).clear();
			PageObjects_ResAttr_Skill.txt_searchBox(Constant.driver).sendKeys(Delete_SkillTypeName1);//function parameter esend need to pass  here 
			Thread.sleep(5000);
			String msgA1= Constant.driver.findElement(By.xpath(".//*[@id]/td[2]")).getText().trim();//xpath of entire column 

			//##to do : Wrong  step : the value is getting stored a sting  where as the  passes values should get save in variable ###

			//		String msgB1= "Delete_SkillTypeName1";
			String msgB1 = Delete_SkillTypeName1;
			System.out.println(msgA1);
			Thread.sleep(2000);*/

			//To compare and Verify whether it is present or not 
			/*if(msgA1.contains(msgB1)){
				//Report.ReporterOutput("STEP","Verify Skill Type Name  has been deleted","Skill Type Name deletion","Skill Type Name should be deleted succesfully","Skill Type Name has not been deleted succesfully","fail",null);
				//Thread.sleep(2000);
				Constant.driver.findElement(By.linkText("Delete")).click();
			}else
			{
				Report.ReporterOutput("STEP","Verify Deleted Skill Type Name : "+Delete_SkillTypeName1+" has been Deleted","Delete Skill Type Name","Delete skill Type Name : "+Delete_SkillTypeName1+" should be Deleted","Delete Skill Type Name "+Delete_SkillTypeName1+" has NOT been Deleted","Pass",null);
			} */

			//***To navigate on Home page***************
			if(Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).isDisplayed()){
				Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).click();
				Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is navigated to RMS Home page","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is not navigated to RMS Home page","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}//END OF CLASS
/********************************************************************************************************************************************/