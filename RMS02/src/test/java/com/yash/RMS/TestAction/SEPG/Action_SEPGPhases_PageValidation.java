package com.yash.RMS.TestAction.SEPG;

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
import com.yash.RMS.POM.SEPG.PageObjects_SEPGPhases;

public class Action_SEPGPhases_PageValidation {
	public static String ascending_order_iterator;
	public static String descending_order_iterator;

	public static String sepgPhases_Asc;
	public static String sepgPhases_Dsc;

	public static String EngagementModel_Dsc;
	public static String EngagementModel_Asc;

	public static String MapActivity_Asc;

	public static ArrayList<String> originallist = new ArrayList<String>();
	public static ArrayList<String> originallist1 = new ArrayList<String>();
	public static ArrayList<String> originallist2 = new ArrayList<String>();
	public static ArrayList<String> originallist3 = new ArrayList<String>();
	public static ArrayList<String> originallist4 = new ArrayList<String>();
	public static ArrayList<String> originallist5 = new ArrayList<String>();
	public static ArrayList<String> originallist6 = new ArrayList<String>();
	public static ArrayList<String> originallist7 = new ArrayList<String>();

	//*************************FOR NAVIGATION SEPG Phases ******************************************************************** 
	public static void PageNavigation() throws Throwable {
		try {
			Thread.sleep(4000);
			//click on  main menu SEPG Link click
			if (PageObjects_SEPGPhases.lnk_SEPG(Constant.driver).isDisplayed()) {
				PageObjects_SEPGPhases.lnk_SEPG(Constant.driver).click();
				Thread.sleep(4000);
				Report.ReporterOutput("STEP","SEPG Link is displayed "," SEPG Link","Click on SEPG  Link","SEPG Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","SEPG Link is displayed "," SEPG Link","Click on SEPG  Link","SEPG Link  is not displayed","Fail",null);
			}
			Thread.sleep(3000);
			//Click on lnk_SPEG_Phases : sub menu click 
			//ERror Here 
			if (PageObjects_SEPGPhases.lnk_SPEG_Phases(Constant.driver).isDisplayed()) {
				PageObjects_SEPGPhases.lnk_SPEG_Phases(Constant.driver).click();
				//Thread.sleep(2000);
				Report.ReporterOutput("STEP","Verify SPEG Phases link is displayed "," lnk_SPEG_Phases ","Click on SPEG Phases Link","SPEG Phases_Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify SPEG Phases link is displayed "," lnk_SPEG_Phases ","Click on SPEG Phases Link","SPEG Phases_Link not displayed","Fail",null);
			}
			//Verify Text  SPEG Phases on the page
			Thread.sleep(4000);
			String Page_SEPG_PHASES = PageObjects_SEPGPhases.txt_SepgPhases(Constant.driver).getText();
			if (Page_SEPG_PHASES.equalsIgnoreCase("SEPG PHASES")) {
				Report.ReporterOutput("STEP","Verify Text Sepg Phases is Visible ","Text Sepg Phases"," Click on Text Sepg Phases "," Text Sepg Phases is visible","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify Text Sepg Phases is Visible  ","Text Sepg Phases"," Click on Text Sepg Phases "," Text Sepg Phases is not visible","Fail",null);
			}
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//*************************To Verify the Pagination Functionality********************************************************************
	//to do : Need to alter the code as per the page xpath : for SEPG Module  
	public static void Pagination() throws Throwable 
	{
		//List<WebElement> pagination = Constant.driver.findElements(By.xpath("html/body/div[1]/div/div[2]/div/div[2]/div/div[5]"));
		List<WebElement> pagination = Constant.driver.findElements(By.xpath("html/body/div[1]/div/div[2]/div/div[2]/div/div[5]/a"));
		System.out.println("pagination.size() :"+pagination.size());
		for (int i=pagination.size(); i>=1; i--) 
		{				
			WebElement element = Constant.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[2]/div/div[5]/a["+i+"]"));
			String SEPGPhasePagination1 = element.getText();
			System.out.println("SEPG Phase Pagination :"+ element.getText());
			element.click();
			Thread.sleep(2000);
			Report.ReporterOutput("STEP ","Verify Pagination-: "+ SEPGPhasePagination1, " Click on Link. " + SEPGPhasePagination1, SEPGPhasePagination1+" Link should be visible and Clickable .",SEPGPhasePagination1+" Link is visible and clickable", "Pass",null); 
		}	
	}
	//**************To verify Count of Records functionality.********************************************************************
	//to do : Need to alter the code as per the page xpath : for SEPG Module 
	public static void RecordsCount() throws Throwable 
	{
		int rows_count;
		Select dropdown1 = new Select(PageObjects_SEPGPhases.Dropdown_ShowEntry(Constant.driver));
		List<WebElement> values_drop = dropdown1.getOptions();
		for(int i=0;i<values_drop.size();i++)
		{
			//System.out.println("Size of values is : "+values_drop);
			//values_drop
			dropdown1.selectByIndex(i);
			WebElement option = dropdown1.getFirstSelectedOption();
			System.out.println(option.getText()); 
			Integer x = Integer.valueOf(option.getText());
			System.out.println(x);
			//This is to verify number of rows and columns

			WebElement mytable = PageObjects_SEPGPhases.SepgTableID(Constant.driver);
			Thread.sleep(700);
			//To locate rows of table.
			List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
			//To calculate no of rows In table.here i have use - 1 b'cas table first row should be minus hence .
			rows_count = rows_table.size()-1;
			System.out.println(rows_count);
			Thread.sleep(1700);
			if(x.equals(rows_count))
			{ Report.ReporterOutput("STEP ","Verify Count of Record for entry="+ x,"Count="+ x  , "Entries Should be Correct-" + x,"Active Record Count done successfully.--" + x, "Pass",null);		  
			}
		} 
		//To click on first value(Drop down value 10) in Drop down values : so report will be maintian only 10 record 
		Thread.sleep(1700);

		Select dropdown_02 = new Select(PageObjects_SEPGPhases.Dropdown_ShowEntry(Constant.driver));
		List<WebElement> values_dropDown_02 = dropdown_02.getOptions();
		for(int j=0;j<values_dropDown_02.size();j++)
		{
			System.out.println(dropdown_02.getOptions().get(j).getText());
			//To select it through visible text options
			dropdown_02.selectByVisibleText("10");
			//To select it by index
			//dropdown_02.selectByIndex(1);
			//break();
			Thread.sleep(2000);
		}
	}	
	//************************************** SERIAL NO SORTING :FOR SEPG Phases Page :**************************************************************
	public static void serialNoSorting() throws Throwable {
		Thread.sleep(1000);
		try {
			if (PageObjects_SEPGPhases.sepgPhases_serialNoSorting(Constant.driver).isDisplayed()) 
			{
				Report.ReporterOutput("STEP","Verify SEPG_Phases_serialNoSorting is Visible ","SEPG_Phases_serialNoSorting ","Click on SEPG_Phases_serialNoSorting ","SEPG_Phases_serialNoSorting displayed and clicked","Pass",null);
			} 
			else
			{
				Report.ReporterOutput("STEP","Verify  SEPG_Phases_serialNoSorting is Visible ","SEPG_Phases_serialNoSorting ","Click on SEPG_Phases_serialNoSorting ","SEPG_Phases_serialNoSorting is not displayed","Fail",null);
			}
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//*************************************Ascending  Serial No Sorting: For SEPG Phase page ************************************************
	public static void Ascending_SerialNoSorting() throws Throwable {
		try {
			//Ascending  Serial No Sorting
			//Click first on Phases column to get original state for column Sr No 
			PageObjects_SEPGPhases.sepgPhases_PhasesSorting(Constant.driver).click();
			Thread.sleep(2000);
			//Ready for Ascending sort 
			PageObjects_SEPGPhases.sepgPhases_serialNoSorting(Constant.driver).click();
			Thread.sleep(2000);

			WebElement text1= PageObjects_SEPGPhases.first_serialNoSorting(Constant.driver);
			String text_01 = text1.getText();
			System.out.println(text_01);
			int x = Integer.parseInt(text_01);
			if (x==1){
				System.out.println("Ascending  Serial No Sorting...:It is ascending ");
				Report.ReporterOutput("STEP","Verify SEPG Phases Ascending serial No Sorting",text_01,"Click on SEPG Phases Page ascending serial No Sorting","SEPG Phases Page ascending serial No Sorting should be displayed and clicked","Pass",null);
			}
			else{
				System.out.println("Ascending  Serial No Sorting...:It is not ascending ");
				Report.ReporterOutput("STEP","Verify SEPG Phases Page ascending serial No Sorting",text_01,"Click on SEPG Phases Page ascending serial No Sorting","SEPG Phases Page ascending serial No Sorting is not displayed","Pass",null);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//********************************************Descending  Serial No Sorting: SEPg Page *****************************************************
	public static void Decending_SerialNoSorting() throws Throwable {
		try {
			//Descending  Serial No Sorting
			Thread.sleep(2000);		
			PageObjects_SEPGPhases.sepgPhases_serialNoSorting(Constant.driver).click();
			Thread.sleep(1000);
			WebElement text2= PageObjects_SEPGPhases.first_serialNoSorting(Constant.driver);
			String text_02= text2.getText();
			System.out.println("Descending  Serial No Sorting...");
			System.out.println(text_02);
			int y = Integer.parseInt(text_02);
			if (y>1){
				System.out.println("Serial No Sorting.: It is descending ");
				Report.ReporterOutput("STEP","Verify SEPG Phases descending Serial No Sorting is Visible ",text_02,"Click on SEPG Phases descending Serial No Sorting","SEPG Phases Descending Serial No Sorting should be displayed and clicked","Pass",null);
			}
			else{
				System.out.println("Serial No Sorting... :It is not descending ");
				Report.ReporterOutput("STEP","Verify SEPG Phases descending Serial No Sorting is Visible ",text_02,"Click on SEPG Phases descending Serial No Sorting","SEPG Phases descending Serial No Sorting is not displayed","Fial",null);
			}
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//********************************Ascending Phases column Sorting: SEPG Phase*********************************************
	public static void Ascending_PhasesSorting() throws Throwable {
		try {
			//to make normal position Phases column: First click on Serial number sorting  column so that the Phases column will come in normal position before clicking on it  
			//	PageObjects_SEPGPhases.sepgPhases_serialNoSorting(Constant.driver).click();
			//Thread.sleep(2000);
			//Ascending click on Phases sorting column
			PageObjects_SEPGPhases.sepgPhases_PhasesSorting(Constant.driver).click();
			Thread.sleep(2000);

			List<WebElement> original_Saved_Phases = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")));

			Thread.sleep(1000);                                                                  
			System.out.println("Ascending  Phases column Sorting : For printing List after clicking once");
			for(int i=0; i<original_Saved_Phases.size(); i++) 
			{
				String a = original_Saved_Phases.get(i).getText();
				originallist1.add(a);
				sepgPhases_Asc= originallist1.get(i).toString();
				System.out.println("SEPG Phases : sepgPhases_Phases_Asc-------" +   sepgPhases_Asc);
			}
			//Collections.sort(originallist);

			//Logic to compare Capital with Lower case letter 
			Collections.sort(originallist1, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});

			//	System.out.println("spegPhases_Phases_Asc-------" +   spegPhases_Phases_Asc);
			Iterator<String> iterator = originallist1.listIterator();
			while (iterator.hasNext()) {
				ascending_order_iterator = iterator.next().toString();
				System.out.println("ascending_order_iterator-----" + ascending_order_iterator);
			}
			if(sepgPhases_Asc.equals(ascending_order_iterator)){
				Report.ReporterOutput("STEP","Verify SEPG Phases column is displayed in Ascending Order ",originallist1.toString(),"Click on SEPG Phases column ","SEPG Phases column should be displayed in ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify SEPG Phases column is displayed in Ascending Order ",originallist1.toString(),"Click on SEPG Phases column ","SEPG Phases column should not displayed in ascending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//****************************Descending Phases column Sorting : SEPG Page  *******************************************************
	public static void Descending_PhasesSorting() throws Throwable {
		try {
			//Uncomment the below code :  when we run  this module independent then we need to  enable below mention code 

			//1st click on Phase column 
			/*PageObjects_SEPGPhases.sepgPhases_PhasesSorting(Constant.driver).click();
		Thread.sleep(2000);*/

			//2nd click on Phase column :descending_Order_Phases click on Phases sorting column
			PageObjects_SEPGPhases.sepgPhases_PhasesSorting(Constant.driver).click();
			Thread.sleep(2000);

			List<WebElement>descending_Order_Phases= (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")));

			System.out.println("Descending  SEPG Phases column Sorting : For printing List after clicking 2nd time");
			for(int i=0; i<descending_Order_Phases.size(); i++) 
			{
				String b = descending_Order_Phases.get(i).getText();
				originallist2.add(b);
				sepgPhases_Dsc= originallist2.get(i).toString();
				System.out.println("SEPG Phases_Dsc-------" +   sepgPhases_Dsc);
			}

			/*Collections.sort(originallist1);
		Collections.reverse(originallist1);*/
			//System.out.println("SEPG Phases_Dsc-------" +   sepgPhases_Dsc);

			//Logic to compare Capital wirh Lower case letter

			Collections.sort(originallist1, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return -s1.compareToIgnoreCase(s2);
				}
			});

			Iterator<String> iterator01 = originallist2.iterator();
			while (iterator01.hasNext()) {
				descending_order_iterator = iterator01.next().toString();
				System.out.println("descending_Order_Phases-----" + descending_order_iterator);
			}
			if(sepgPhases_Dsc.equals(descending_order_iterator)){
				Report.ReporterOutput("STEP","Verify SEPG Phases column is displayed in Descending Order ",originallist2.toString(),"Click on SEPG Phases Column ","SEPG Phases column should be displayed in Descending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify SEPG Phases column is displayed in Descending Order ",originallist2.toString(),"Click on SEPG Phases column ","SEPG Phases column  is not displayed in Descending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//****************************Ascending Engagement Model column Sorting : SEPG Page  *******************************************************
	public static void Ascending_EngagementModel() throws Throwable {
		try {

			//Ascending click on Phases sorting column
			PageObjects_SEPGPhases.sepgPhases_EngagementModel(Constant.driver).click();
			Thread.sleep(2000);

			List<WebElement> original_Engagement_Model = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]")));

			Thread.sleep(1000);                                                                  
			System.out.println("Engagement Model column Sorting : For printing List after clicking once");
			for(int i=0; i<original_Engagement_Model.size(); i++) 
			{
				String a = original_Engagement_Model.get(i).getText();
				originallist3.add(a);
				EngagementModel_Asc= originallist3.get(i).toString();
				System.out.println("SEPG Phases -> SEPG Engagement Model_Asc-------" +   EngagementModel_Asc);
			}
			//Collections.sort(originallist);

			//Logic to compare Capital with Lower case letter 
			Collections.sort(originallist3, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});

			//	System.out.println("SEPG Engagement Model_Asc-------" +   EngagementModel_Asc);
			Iterator<String> iterator = originallist3.listIterator();
			while (iterator.hasNext()) {
				ascending_order_iterator = iterator.next().toString();
				System.out.println("ascending_order_iterator-----" + ascending_order_iterator);
			}
			if(EngagementModel_Asc.equals(ascending_order_iterator)){
				Report.ReporterOutput("STEP","Verify Engagement Model column is displayed in Ascending Order ",originallist3.toString(),"Click on Engagement Model column ","Engagement Model column should be displayed in ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Engagement Model column is displayed in Ascending Order ",originallist3.toString(),"Click on Engagement Model column ","Engagement Model column should not displayed in ascending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//****************************Descending Engagement Model column Sorting : SEPG Page   *******************************************************
	public static void Descending_EngagementModel() throws Throwable {
		try {
			//2nd click onEngagement Model column in continuation with the Ascending code   
			PageObjects_SEPGPhases.sepgPhases_EngagementModel(Constant.driver).click();
			Thread.sleep(2000);

			List<WebElement>original_Engagement_Model= (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]")));

			System.out.println("Descending  Engagement Model column Sorting : For printing List after clicking 2nd time");
			for(int i=0; i<original_Engagement_Model.size(); i++) 
			{
				String b = original_Engagement_Model.get(i).getText();
				originallist4.add(b);
				EngagementModel_Dsc= originallist4.get(i).toString();
				System.out.println("SEPG Engagement_Model_Dsc-------" +   EngagementModel_Dsc);
			}

			/*Collections.sort(originallist1);
			Collections.reverse(originallist1);*/
			//System.out.println("SEPG Phases_Dsc-------" +   sepgPhases_Dsc);

			//Logic to compare Capital wirh Lower case letter

			Collections.sort(originallist4, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return -s1.compareToIgnoreCase(s2);
				}
			});

			Iterator<String> iterator01 = originallist4.iterator();
			while (iterator01.hasNext()) {
				descending_order_iterator = iterator01.next().toString();
				System.out.println("descending_Order_Phases-----" + descending_order_iterator);
			}
			if(EngagementModel_Dsc.equals(descending_order_iterator)){
				Report.ReporterOutput("STEP","Verify  Engagement Model column is displayed in Descending Order ",originallist4.toString(),"Click on Engagement Model Column "," Engagement Model  column should be displayed in Descending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Engagement Model  column is displayed in Descending Order ",originallist4.toString(),"Click on Engagement Model  column "," Engagement Model column  is not displayed in Descending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//****************************Ascending Map Activity column Sorting : SEPG Page  *******************************************************
	public static void Ascending_MapActivity() throws Throwable {
		try {

			// click on MapActivity column for Ascending sorting
			PageObjects_SEPGPhases.sepgPhases_MapActivity(Constant.driver).click();
			Thread.sleep(2000);

			List<WebElement> original_MapActivity= (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[4]")));

			Thread.sleep(1000);                                                                  
			System.out.println("Engagement Model column Sorting : For printing List after clicking once");
			for(int i=0; i<original_MapActivity.size(); i++) 
			{
				String a = original_MapActivity.get(i).getText();
				originallist5.add(a);
				MapActivity_Asc= originallist5.get(i).toString();
				System.out.println("SEPG Phases : SEPG Engagement Model_Asc-------" +   MapActivity_Asc);
			}
			//Collections.sort(originallist);

			//Logic to compare Capital with Lower case letter 
			Collections.sort(originallist5, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});

			//	System.out.println("SEPG MapActivity_Asc_Asc-------" +   MapActivity_Asc);
			Iterator<String> iterator = originallist5.listIterator();
			while (iterator.hasNext()) {
				ascending_order_iterator = iterator.next().toString();
				System.out.println("ascending_order_iterator-----" + ascending_order_iterator);
			}
			if(MapActivity_Asc.equals(ascending_order_iterator)){
				Report.ReporterOutput("STEP","Verify Map Activity column is displayed in Ascending Order ",originallist5.toString(),"Click on Map Activity   "," Map Activity column should be displayed in ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Map Activity  column is displayed in Ascending Order ",originallist5.toString(),"Click on Map Activity   "," Map Activity column should not displayed in ascending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//****************************Descending Map Activity column Sorting : SEPG Page  *******************************************************
	public static void Descending_MapActivity() throws Throwable {
		try {
			// click on MapActivity column for Ascending sorting
			PageObjects_SEPGPhases.sepgPhases_MapActivity(Constant.driver).click();
			Thread.sleep(2000);
			List<WebElement> original_MapActivity= (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[4]")));
			Thread.sleep(1000);                                                                 
			System.out.println("Map Activity column Sorting : After clicking 2nd time ");
			for(int i=0; i<original_MapActivity.size(); i++) 
			{
				String a = original_MapActivity.get(i).getText();
				originallist6.add(a);
				MapActivity_Asc= originallist6.get(i).toString();
				System.out.println("SEPG Phases : MapActivity_Asc -------" +   MapActivity_Asc);
			}
			//Collections.sort(originallist);

			//Logic to compare Capital with Lower case letter 
			Collections.sort(originallist6, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return -s1.compareToIgnoreCase(s2);
				}
			});
			//	System.out.println("SEPG MapActivity_Asc_Asc-------" +   MapActivity_Asc);
			Iterator<String> iterator = originallist6.listIterator();
			while (iterator.hasNext()) {
				descending_order_iterator = iterator.next().toString();
				System.out.println("ascending_order_iterator-----" + descending_order_iterator);
			}
			if(MapActivity_Asc.equals(descending_order_iterator)){
				Report.ReporterOutput("STEP","Verify Map Activity column is displayed in Decending Order ",originallist6.toString(),"Click on Map Activity ","Map Activity column should be displayed in Decending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Map Activity  column is displayed in Decending Order ",originallist6.toString(),"Click on Map Activity ","Map Activity column should not displayed in Decending Order","Fail",null);
			}
			//***************************************************************************************
			/*to NEUTRALISE the Reverse oder need to click on Main Menu Link on SEPG only   */
			Thread.sleep(2000);
			//click on  main menu SEPG Link click
			if (PageObjects_SEPGPhases.lnk_SEPG(Constant.driver).isDisplayed()) {
				PageObjects_SEPGPhases.lnk_SEPG(Constant.driver).click();
				Thread.sleep(4000);
				//	Report.ReporterOutput("STEP","SEPG Link is displayed "," SEPG Link","Click on SEPG  Link","SEPG Link should be displayed and clicked","Pass",null);
			}
			else {
				//Report.ReporterOutput("STEP","SEPG Link is displayed "," SEPG Link","Click on SEPG  Link","SEPG Link  is not displayed","Fail",null);
			}
			Thread.sleep(2000);
			//***************************************************************************************

			//***To NAVIGATION on Home page***************
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

}// END OF CLASS
//**********************************************************************************************************************************************************************

