package com.yash.RMS.TestAction.ResourceAttribute;
//PageObjects_ResAtt

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.ResourceAttribute.PageObjects_ResAttr_Skill;

public class Action_Skill_PageValidation{

	static ArrayList<String> originalSavedSkillType;

	public static String skillName_Asc;
	public static String skillName_Dsc;

	public static String skillType_Dsc;
	public static String skillType_Asc;

	public static String ascending_order_iterator;
	public static String decending_order_iterator;

	static ArrayList<String> ascendingOrderSorted_SkillNames;
	static ArrayList<String> decendingOrderSorted_SkillNames;

	static ArrayList<String> ascendingOrderSorted_SkillType;
	static ArrayList<String> decendingOrderSorted_SkillType;

	public static ArrayList<String> originalSaved_SkillName = new ArrayList<String>();
	public static ArrayList<String> originalSaved_SkillType = new ArrayList<String>();

	public static ArrayList<String> original_List = new ArrayList<String>();
	public static ArrayList<String> original_List1 = new ArrayList<String>();
	public static ArrayList<String> original_List2 = new ArrayList<String>();
	public static ArrayList<String> original_List3 = new ArrayList<String>();
	public static ArrayList<String> original_List4 = new ArrayList<String>();

	//******FOR NAVIGATION********************************
	//Skill Link
	public static void SkillPage_Navigation() throws Throwable {
		try {
			
			Thread.sleep(2000);
			(Constant.driver).manage().window().maximize();
			if(PageObjects_ResAttr_Skill.lnk_MasterData(Constant.driver).isDisplayed()) {
				PageObjects_ResAttr_Skill.lnk_MasterData(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify Master Data Link is displayed ","Master Data link", "Click on Master Data Link","Master Data Link should be displayed and clicked", "Pass", null);
			} else {
				Report.ReporterOutput("STEP","Verify Master Data Link is displayed ","Master Data link", "Click on Master Data Link","Master Data Link should not be displayed and clicked","Fail",null);
			}
			Thread.sleep(2000);
			//Thread.sleep(4000);
			//click on Resource Attribute Link
			//issue 2nd time it is not visible 
			if(PageObjects_ResAttr_Skill.lnk_ResourceAttribute(Constant.driver).isDisplayed()) {
				PageObjects_ResAttr_Skill.lnk_ResourceAttribute(Constant.driver).click();
				Report.ReporterOutput("STEP","Resource Attribute Link is displayed ","Resource Attribute Link","Click on Resource Attribute Link","Resource Attribute Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Resource Attribute Link is displayed ","Resource Attribute Link","Click on Resource Attribute Link","Resource Attribute Link  is not displayed","Fail",null);
			}
			//click on Skill Link
			Thread.sleep(2000);
			if (PageObjects_ResAttr_Skill.lnk_Skill(Constant.driver).isDisplayed()) {
				PageObjects_ResAttr_Skill.lnk_Skill(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify Skill Link is displayed ","Skill Link","Click on Skill Link","Skill Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Skill Link is displayed ","Skill Link","Click on Skill Link","Skill Link should not be displayed and clicked","Fail",null);
			}
			// Skill Page Text
			//alread covered this fun other module  
	/*		String Page_location = PageObjects_ResAttr_Skill.txt_Skill(Constant.driver).getText();

			if (Page_location.equalsIgnoreCase("Skill")) {
				Report.ReporterOutput("STEP","Verify Skill Page Text is Visible ","Skill Page Text","Click on Skill Page Text","Skill Page Text is visible","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify Skill Page Text is Visible ","Skill Page Text","Click on Skill Page Text","Skill Page Text is not visible","Fail",null);
			}*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//*****To Verify the Pagination Functionality********************************************************************
	//to do : Need to alter the code as per the page xpath : for SEPG Module  
	public static void Pagination() throws Throwable 
	{
		List<WebElement> pagination = Constant.driver.findElements(By.xpath("html/body/div[1]/div/div[2]/div/div[2]/div/div[5]/a"));
	//	System.out.println("pagination.size() :"+pagination.size());
		for (int i=pagination.size(); i>=1; i--) 
		{				
			WebElement element = Constant.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[2]/div/div[5]/a["+i+"]"));
			String SkillPagination1 = element.getText();
	//		System.out.println("Skill Pagination :"+ element.getText());
			element.click();
			Thread.sleep(2000);
			Report.ReporterOutput("STEP ","Verify Pagination-: "+ SkillPagination1, " Click on Link. " + SkillPagination1, SkillPagination1+" Link should be visible and Clickable .",SkillPagination1+" Link is visible and clickable", "Pass",null); 
		}	
	}
	//**************To verify Count of Records functionality.********************************************************************
	//to do : Need to alter the code as per the page xpath : for SEPG Module 
	public static void RecordsCount() throws Throwable 
	{
		int rows_count;
		Select dropdown_01 = new Select(PageObjects_ResAttr_Skill.Dropdown_ShowEntry(Constant.driver));
		List<WebElement> values_dropDown_01 = dropdown_01.getOptions();
		for(int i=0;i<values_dropDown_01.size();i++)
		{
			//System.out.println("Sizse of values is : "+values_drop);
			//values_drop
			dropdown_01.selectByIndex(i);
			WebElement option = dropdown_01.getFirstSelectedOption();
			//System.out.println(option.getText()); 
			Integer x = Integer.valueOf(option.getText());
			//System.out.println(x);
			//This is to verify number of rows and columns
			WebElement mytable = PageObjects_ResAttr_Skill.skillTableID(Constant.driver);
			Thread.sleep(700);
			//To locate rows of table.
			List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
			//To calculate no of rows In table.here i have use - 1 b'cas table first row should be minus hence .
			rows_count = rows_table.size()-1;
			//System.out.println(rows_count);
			Thread.sleep(1700);
			if(x.equals(rows_count))
			{ Report.ReporterOutput("STEP "," Verify Count of Record for entry= "+ x," Count= "+ x  , " Entries Should be Correct-" + x,"Active Record Count done successfully.--" + x, "Pass",null);		  
			}else
			{ Report.ReporterOutput("STEP "," Verify Count of Record for entry= "+ x," Count= "+ x  , " Entries Should not be Correct-" + x,"Active Record Count done not Matcheh --" + x, "Fail",null);		  
			}
		} 
		//To click on first value in Drop down values : so report will be maintian only 10 record 
		Thread.sleep(1700);
		Select dropdown_02 = new Select(PageObjects_ResAttr_Skill.Dropdown_ShowEntry(Constant.driver));
		List<WebElement> values_dropDown_02 = dropdown_02.getOptions();
		for(int j=0;j<values_dropDown_02.size();j++)
		{
		//	System.out.println(dropdown_02.getOptions().get(j).getText());
			//To select it through visible text options
			dropdown_02.selectByVisibleText("10");
			//To select it by index
			//dropdown_02.selectByIndex(1);
			//break();
			Thread.sleep(2000);
		}
	}
	//**FOR SR NO (SERIAL NO SORTING)*************************************************************************************
	public static void serialNoSorting_SkillPage() throws Throwable {
		Thread.sleep(1000);
		try {//no need to click on column as it by default in Ascending  sorting order 
			//PageObjects_ResAttr_Skill.sr_NoSorting(Constant.driver).click();
			if (PageObjects_ResAttr_Skill.skillSr_NoSorting(Constant.driver).isDisplayed()) 
			{
				Report.ReporterOutput("STEP","Verify Skill Page Serial No Sorting is Visible ","Skill Page Serial No Sorting ","Click on Skill Page Serial No Sorting ","Skill Page Serial No Sorting displayed and clicked","Pass",null);
			} 
			else
			{
				Report.ReporterOutput("STEP","Verify Skill Page Serial No Sorting is Visible ","Skill Page Serial No Sorting ","Click on Skill Page Serial No Sorting ","location Page Serial No Sorting is not displayed","Fail",null);
			}
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**4. Ascending Serial No Sorting :Skill Page  *************************************************************************************
	public static void ascendingSerialNoSorting_SkillPage() throws Throwable {
		try {
			//Ascending  Serial No Sorting
			//PageObjects_ResAttr_Skill.sr_NoSorting(Constant.driver).click();
			Thread.sleep(2000);
			WebElement text1= PageObjects_ResAttr_Skill.txt_First_SrNo(Constant.driver);
			String text_01 = text1.getText();
			int x = Integer.parseInt(text_01);
			if (x==1){
			//	System.out.println("Ascending  Serial No Sorting...:It is ascending ");
				Report.ReporterOutput("STEP","Verify Skill Page Ascending serial No Sorting",text_01,"Click on Skill Page Ascending serial No Sorting","Skill Page Ascending serial No Sorting should be displayed and clicked","Pass",null);
			}
			else{
			//	System.out.println("Ascending  Serial No Sorting...:It is not ascending ");
				Report.ReporterOutput("STEP","Verify Skill Page Ascending serial No Sorting",text_01,"Click on Skill Page Ascending serial No Sorting","Skill Page Ascending serial No Sorting should not be displayed and clicked","Fail",null);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//********3.Descending  Serial No Sorting Skill Page *************************************************************************************
	public static void descendingSerialNoSorting_SkillPage() throws Throwable {
		try {
			//Descending  Serial No Sorting: need to click once to make the column in descending order  
			PageObjects_ResAttr_Skill.skillSr_NoSorting(Constant.driver).click();
			Thread.sleep(1000);		
			WebElement text2= PageObjects_ResAttr_Skill.txt_First_SrNo(Constant.driver);
			String text_02= text2.getText();
	//		System.out.println("Descending  Serial No Sorting...");
	//		System.out.println(text_02);
			int y = Integer.parseInt(text_02);
			if (y>1){
			//	System.out.println("Serial No Sorting.: It is descending ");
				Report.ReporterOutput("STEP","Verify Skill Descending Serial No Sorting is Visible ",text_02,"Click on Skill Descending Serial No Sorting","Skill Descending Serial No Sorting should be displayed and clicked","Pass",null);
			}
			else{
			//	System.out.println("Serial No Sorting... :It is not descending ");
				Report.ReporterOutput("STEP","Verify Skill Descending Serial No Sorting is Visible ",text_02,"Click on Skill Descending Serial No Sorting","Skill Descending Serial No Sorting should be displayed and clicked","Pass",null);
			}
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//******5.Ascending Skill Name Sorting*********************************************************************************************************************
	public static void ascendingSorting_SkillName() throws Throwable {
		try {
			//click on SR sorting to get the default position sorting for  Skill Type 
			PageObjects_ResAttr_Skill.skillSr_NoSorting(Constant.driver).click();
			Thread.sleep(2000);
			//Ascending   //For printing List after clicking once
			PageObjects_ResAttr_Skill.skillNameSorting(Constant.driver).click();
			Thread.sleep(2000);
			List<WebElement> originalSaved_SkillName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")));
			Thread.sleep(1500);                                                                  
		//	System.out.println("Ascending  Skill Name Sorting : For printing List after clicking once");
			for(int i=0; i<originalSaved_SkillName.size(); i++) 
			{
				String a = originalSaved_SkillName.get(i).getText();
				original_List.add(a);
				skillName_Asc= original_List.get(i).toString();
			//	System.out.println("skillName_Asc-------" +   skillName_Asc);
			}
			//Below function will sort in ascending order 
			Collections.sort(original_List, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			Iterator<String> iterator = original_List.listIterator();
			while (iterator.hasNext()) {
				ascending_order_iterator = iterator.next().toString();
			//	System.out.println("ascending order iterator-----" + ascending_order_iterator);
			}
			if(skillName_Asc.equals(ascending_order_iterator)){
				Report.ReporterOutput("STEP","Verify Skill Name is displayed in Ascending Order ",original_List.toString(),"Click on Skill Name","Skill Name should be displayed in Ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Skill Name is displayed in Ascending Order ",original_List.toString(),"Click on Skill Name","Skill Name should be displayed in Ascending Order","Fail",null);
			}
			original_List.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//************6..Descending Skill Name Sorting*************************************************************************************
	public static void decendingSorting_SkillName() throws Throwable {
		try {
			//Descending : For printing List after clicking once
			PageObjects_ResAttr_Skill.skillNameSorting(Constant.driver).click();
			Thread.sleep(2000);

			List<WebElement>descendingOrderSorted_SkillName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")));                                                        
		//	System.out.println("Decending  Skill Name Sorting : For printing List after clicking 2nd time");

			for(int i=0; i<descendingOrderSorted_SkillName.size(); i++) 
			{
				String b = descendingOrderSorted_SkillName.get(i).getText();
				original_List1.add(b);
				skillName_Dsc= original_List1.get(i).toString();
		//		System.out.println("SkillName_Dsc-------" +   skillName_Dsc);
			}
			//Below function will sort in Descending order 
			Collections.sort(original_List1, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return -s1.compareToIgnoreCase(s2);
				}
			});
			Iterator<String> iterator01 = original_List1.iterator();
			while (iterator01.hasNext()) {
				decending_order_iterator = iterator01.next().toString();
			//	System.out.println("descending_order_iterator-----" + decending_order_iterator);
			}
			if(skillName_Dsc.equals(decending_order_iterator)){
				Report.ReporterOutput("STEP","Verify Skill Name is displayed in Descending Order ",original_List1.toString(),"Click on Skill Name","Original_List1 Name should be displayed in Descending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Skill Name is displayed in Descending Order ",original_List1.toString(),"Click on Skill Name","Original_List1 Name should not be displayed in Descending Order","Fail",null);
			}
			original_List1.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//***********5.Ascending SkillType Column Sorting*************************************************
	public static void ascendingSorting_SkillType() throws Throwable {
		//click on Skill Name to Nutralise the Skill Type((Default type ) column before sorting  
		PageObjects_ResAttr_Skill.skillNameSorting(Constant.driver).click();
		Thread.sleep(1500);
		//Ascending :clicking 1st Time on Location HR
		PageObjects_ResAttr_Skill.skillType(Constant.driver).click();
		Thread.sleep(2000);
		//for Skill Type Only  
		try {
			List<WebElement> originalSavedSkillType =(Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]")));
			Thread.sleep(1000);                                                                  
	//		System.out.println("Ascending : Skill Type Column : For printing List after clicking once");

			for(int i=0; i<originalSavedSkillType.size(); i++) 
			{
				String a = originalSavedSkillType.get(i).getText();
				original_List3.add(a);
				skillType_Asc= original_List3.get(i).toString();
		//		System.out.println("SkillType_Asc-------" +   skillType_Asc);
			}
			//Sorting Logic   
			Collections.sort(original_List3, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			Iterator<String> iterator = original_List3.listIterator();
			while (iterator.hasNext()) {
				ascending_order_iterator = iterator.next().toString();
		//		System.out.println("ascending_order_iterator-----" + ascending_order_iterator);
			}
			if(skillType_Asc.equals(ascending_order_iterator)){
				Report.ReporterOutput("STEP","Verify Skill Type column is displayed in Ascending Order ",original_List3.toString(),"Click on Skill Type  ","Skill Type  should be displayed in Ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Skill Type column is displayed in Ascending Order ",original_List3.toString(),"Click on Skill Type  ","Skill Type  should not be displayed in Ascending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//5**********.sorting in Descending Skill Type column *********************************************************
	public static void descendingSorting_SkillType() throws Throwable {

		try {
			//Descending : clicking 2nd time on Location HR 

			PageObjects_ResAttr_Skill.skillType(Constant.driver).click();
			Thread.sleep(2000);
			List<WebElement>descendingOrderSortedSkillType = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]")));                                                        
	//		System.out.println("Descending Skill Type Sorting : For printing List after clicking 2nd time");
			for(int i=0; i<descendingOrderSortedSkillType.size(); i++) 
			{
				String b = descendingOrderSortedSkillType.get(i).getText();
				original_List4.add(b);
				skillType_Dsc= original_List4.get(i).toString();
		//		System.out.println("skillType_Dsc-------" +   skillType_Dsc);
			}
			Collections.sort(original_List3, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return -s1.compareToIgnoreCase(s2);
				}
			});
			Iterator<String> iterator01 = original_List4.iterator();
			while (iterator01.hasNext()) {
				decending_order_iterator = iterator01.next().toString();
				//	System.out.println(decending_order_iterator);
			//	System.out.println("decending_order_iterator-----" + decending_order_iterator);
			}
			if(skillType_Dsc.equals(decending_order_iterator)){
				Report.ReporterOutput("STEP","Verify Skill Type is displayed in Descending Order ",original_List4.toString(),"Click on Skill Type ","Skill Type  should be displayed in Descending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Skill Type  is displayed in Descending Order ",original_List4.toString(),"Click on Skill Type ","Skill Type is not displayed in Descending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//***To navigate on Home page*************************************************************************************************
		Thread.sleep(2000);
		try
		{
			if(Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).isDisplayed()){
				Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).click();
				Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is navigated to RMS Home page","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is not navigated to RMS Home page","Fail",null);
			}
		}
		catch(Exception e8)
		{
			System.out.println( e8.getMessage());
		}
	}
}//END OF CLASS
//*****************************************************************************************************************
