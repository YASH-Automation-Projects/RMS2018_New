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
import com.yash.RMS.POM.SEPG.PageObjects_SEPGActivity;

public class Action_SEPGActivity_PageValidation {
	public static String ascending_order_iterator;
	public static String descending_order_iterator;

	public static String SEPGActivityName_Asc;
	public static String SEPGActivityName_Dsc;

	public static String Mandatory_Dsc;
	public static String Mandatory_Asc;

	public static String Productive_Asc;
	public static String Productive_Dsc;

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
			//click on SEPG Link : main menu click
			if (PageObjects_SEPGActivity.lnk_SEPG(Constant.driver).isDisplayed()) {
				PageObjects_SEPGActivity.lnk_SEPG(Constant.driver).click();
				Thread.sleep(4000);
				Report.ReporterOutput("STEP","SEPG Link is displayed "," SEPG Link","Click on SEPG  Link","SEPG Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","SEPG Link is displayed "," SEPG Link","Click on SEPG  Link","SEPG Link  is not displayed","Fail",null);
			}
			Thread.sleep(1000);
			//Click on lnk_SEPG_Activity : sub menu click 

			if (PageObjects_SEPGActivity.lnk_SPEG_Activity(Constant.driver).isDisplayed()) {
				Thread.sleep(1000);
				PageObjects_SEPGActivity.lnk_SPEG_Activity(Constant.driver).click();

				Report.ReporterOutput("STEP","Verify SPEG Activity link is displayed "," lnk_SPEG_Activity ","Click on SPEG Activity Link","SPEG Activity_Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify SPEG Activity link is displayed "," lnk_SPEG_Activity ","Click on SPEG Activity Link","SPEG Activity_Link not displayed","Fail",null);
			}
			//Verify Text  SEPG Activity on the page
			Thread.sleep(4000);
			String Page_SEPG_ACTIVITY = PageObjects_SEPGActivity.txt_SepgActivity(Constant.driver).getText();
			if (Page_SEPG_ACTIVITY.equalsIgnoreCase("SEPG ACTIVITY")) {
				Report.ReporterOutput("STEP","Verify Text SEPG Activity is Visible ","Text SEPG Activity"," Click on Text SEPG Activity "," Text SEPG Activity is visible","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify Text SEPG Activity is Visible  ","Text SEPG Activity"," Click on Text SEPG Activity "," Text SEPG Activity is not visible","Fail",null);
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
		List<WebElement> pagination = Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[5]"));
		//System.out.println("pagination.size() :"+pagination.size());
		for (int i=pagination.size(); i>=1; i--) 
		{				
			WebElement element = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[5]/a["+i+"]"));
			String SEPGActivityPagination1 = element.getText();
			//System.out.println("SEPG Activity Pagination :"+ element.getText());
			element.click();
			Thread.sleep(2000);
			Report.ReporterOutput("STEP ","Verify Pagination-: "+ SEPGActivityPagination1, " Click on Link. " + SEPGActivityPagination1, SEPGActivityPagination1+" Link should be visible and Clickable .",SEPGActivityPagination1+" Link is visible and clickable", "Pass",null); 
		}	
	}

	//**************To verify Count of Records functionality.********************************************************************
	//to do : Need to alter the code as per the page xpath : for SEPG Module 
	public static void RecordsCount() throws Throwable 
	{
		int rows_count;
		Select dropdown1 = new Select(PageObjects_SEPGActivity.Dropdown_ShowEntry(Constant.driver));
		List<WebElement> values_drop = dropdown1.getOptions();
		for(int i=0;i<values_drop.size();i++)
		{
			////System.out.println("Size of values is : "+values_drop);

			//values_drop
			dropdown1.selectByIndex(i);
			WebElement option = dropdown1.getFirstSelectedOption();
			//System.out.println(option.getText()); 
			Integer x = Integer.valueOf(option.getText());
			//System.out.println(x);
			//This is to verify number of rows and columns

			WebElement mytable = PageObjects_SEPGActivity.SepgTableID(Constant.driver);
			Thread.sleep(700);
			//To locate rows of table.
			List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
			//To calculate no of rows In table.here i have use - 1 b'cas table first row should be minus hence .
			rows_count = rows_table.size()-1;
			//System.out.println(rows_count);
			Thread.sleep(1700);
			if(x.equals(rows_count))
			{ Report.ReporterOutput("STEP ","Verify Count of Record for entry="+ x,"Count="+ x  , "Entries Should be Correct-" + x,"Active Record Count done successfully.--" + x, "Pass",null);		  
			}
		} 	
	}

	//************************************** SERIAL NO SORTING :FOR SEPG Activity Page :**************************************************************
	public static void serialNoSorting() throws Throwable {
		Thread.sleep(1000);
		try {
			if (PageObjects_SEPGActivity.sepgActivity_serialNoSorting(Constant.driver).isDisplayed()) 
			{
				Report.ReporterOutput("STEP","Verify SEPG_Activity_serialNoSorting is Visible ","SEPG_Activity_serialNoSorting ","Click on SEPG_Phases_serialNoSorting ","SEPG_Activity_serialNoSorting displayed and clicked","Pass",null);
			} 
			else
			{
				Report.ReporterOutput("STEP","Verify  SEPG_Activity_serialNoSorting is Visible ","SEPG_Activity_serialNoSorting ","Click on SEPG_Phases_serialNoSorting ","SEPG_Activity_serialNoSorting is not displayed","Fail",null);
			}
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//*************************************Ascending  Serial No Sorting: For SEPG Phase page ************************************************
	public static void Ascending_SerialNoSorting() throws Throwable {
		try {
			//Ascending  Serial No Sorting
			//Click first on Phases column to get original state for column Sr No 
			PageObjects_SEPGActivity.sepgActivity_SEPGActivityNameSorting(Constant.driver).click();
			Thread.sleep(2000);
			//Ready for Ascending sort 
			PageObjects_SEPGActivity.sepgActivity_serialNoSorting(Constant.driver).click();
			Thread.sleep(2000);

			WebElement text1= PageObjects_SEPGActivity.first_serialNoSorting(Constant.driver);
			String text_01 = text1.getText();
			//System.out.println(text_01);
			int x = Integer.parseInt(text_01);
			if (x==1){
				//System.out.println("Ascending  Serial No Sorting...:It is ascending ");
				Report.ReporterOutput("STEP","Verify SEPG Activity ascending serial no sorting",text_01,"Click on SEPG Activity Page ascending serial No Sorting","SEPG Activity Page ascending serial No Sorting should be displayed and clicked","Pass",null);
			}
			else{
				//System.out.println("Ascending  Serial No Sorting...:It is not ascending ");
				Report.ReporterOutput("STEP","Verify SEPG Activity page ascending serial no sorting",text_01,"Click on SEPG Activity Page ascending serial No Sorting","SEPG Activity Page ascending serial No Sorting is not displayed","Fail",null);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//********************************************Descending  Serial No Sorting: SEPG Page *****************************************************
	public static void Decending_SerialNoSorting() throws Throwable {
		try {
			//Descending  Serial No Sorting
			Thread.sleep(2000);		
			PageObjects_SEPGActivity.sepgActivity_serialNoSorting(Constant.driver).click();
			Thread.sleep(1000);
			WebElement text2= PageObjects_SEPGActivity.first_serialNoSorting(Constant.driver);
			String text_02= text2.getText();
			//System.out.println("Descending  Serial No Sorting...");
			//System.out.println(text_02);
			int y = Integer.parseInt(text_02);
			if (y>1){
				//System.out.println("Serial No Sorting.: It is descending ");
				Report.ReporterOutput("STEP","Verify SEPG Activity descending Serial No Sorting is Visible ",text_02,"Click on SEPG Activity descending Serial No Sorting","SEPG Activity descending Serial No Sorting should be displayed and clicked","Pass",null);
			}
			else{
				//System.out.println("Serial No Sorting... :It is not descending ");
				Report.ReporterOutput("STEP","Verify SEPG Activity descending Serial No Sorting is Visible ",text_02,"Click on SEPG Activity descending Serial No Sorting","SEPG Activity descending Serial No Sorting is not displayed","Fial",null);
			}
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//********************************Ascending SEPG Activity Name column Sorting: SEPG *********************************************
	public static void Ascending_SEPGActivityNameSorting() throws Throwable {
		try {

			//Ascending click on SEPG Activity Name sorting column
			PageObjects_SEPGActivity.sepgActivity_SEPGActivityNameSorting(Constant.driver).click();
			Thread.sleep(2000);

			List<WebElement> original_Saved_SEPGActivityName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")));

			Thread.sleep(1000);                                                                  
			//System.out.println("Ascending  SEPG Activity Name column Sorting : For printing List after clicking once");
			for(int i=0; i<original_Saved_SEPGActivityName.size(); i++) 
			{
				String a = original_Saved_SEPGActivityName.get(i).getText();
				originallist1.add(a);
				SEPGActivityName_Asc= originallist1.get(i).toString();
				//System.out.println("SEPG Activity : sepgActivity_SEPGActivityName_Asc-------" +   SEPGActivityName_Asc);
			}


			//Logic to compare Capital wirh Lower case letter 
			Collections.sort(originallist1, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});

			//	//System.out.println("spegPhases_Phases_Asc-------" +   spegPhases_Phases_Asc);
			Iterator<String> iterator = originallist1.listIterator();
			while (iterator.hasNext()) {
				ascending_order_iterator = iterator.next().toString();
				//System.out.println("ascending_order_iterator-----" + ascending_order_iterator);
			}
			if(SEPGActivityName_Asc.equals(ascending_order_iterator)){
				Report.ReporterOutput("STEP","Verify SEPG Activity Name column is displayed in Ascending Order ",originallist1.toString(),"Click on SEPG Activity Name column ","SEPG Activity Name column should be displayed in ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify SEPG Activity Name column is displayed in Ascending Order ",originallist1.toString(),"Click on SEPG Activity Name column ","SEPG Activity Name column should not displayed in ascending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//****************************Descending SEPG Activity Name column Sorting : SEPG Page *******************************************************
	public static void Descending_SEPGActivityNameSorting() throws Throwable {
		try {
			//Uncomment the below code :  when we run  this module independent then we need to  enable below mention code 

			//1st click on Phase column 
			PageObjects_SEPGActivity.sepgActivity_SEPGActivityNameSorting(Constant.driver).click();
			Thread.sleep(2000);

			//2nd click on Phase column :descending_Order_Phases click on SEPG Activity Name column
			//	PageObjects_SEPGActivity.sepgActivity_SEPGActivityNameSorting(Constant.driver).click();
			Thread.sleep(2000);

			List<WebElement>descending_Order_SEPGActivityName= (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")));

			//System.out.println("Descending  SEPG SEPG Activity Name column Sorting : For printing List after clicking 2nd time");
			for(int i=0; i<descending_Order_SEPGActivityName.size(); i++) 
			{
				String b = descending_Order_SEPGActivityName.get(i).getText();
				originallist4.add(b);
				SEPGActivityName_Dsc= originallist4.get(i).toString();
				//System.out.println("SEPG Activity Name_Dsc-------" +   SEPGActivityName_Dsc);
			}

			/*Collections.sort(originallist2);
		Collections.reverse(originallist2);*/
			////System.out.println("SEPG Phases_Dsc-------" +   sepgPhases_Dsc);

			//Logic to compare Capital wirh Lower case letter

			Collections.sort(originallist4, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return -s1.compareToIgnoreCase(s2);
				}
			});

			Iterator<String> iterator01 = originallist4.iterator();
			while (iterator01.hasNext()) {
				descending_order_iterator = iterator01.next().toString();
				//System.out.println("descending_Order_SEPGActivityName-----" + descending_order_iterator);
			}
			if(SEPGActivityName_Dsc.equals(descending_order_iterator)){
				Report.ReporterOutput("STEP","Verify SEPG Activity Name column is displayed in descending Order ",originallist4.toString(),"Click on SEPG Activity Name Column ","SEPG Activity Name column should be displayed in descending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify SEPG Activity Name column is displayed in descending Order ",originallist4.toString(),"Click on SEPG Activity Name column ","SEPG Activity Name column  is not displayed in descending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//****************************Ascending Mandatory column Sorting : SEPG Page  *******************************************************
	public static void Ascending_MandatorySorting() throws Throwable {
		try {

			//Ascending click on Phases sorting column
			PageObjects_SEPGActivity.sepgActivity_MandatorySorting(Constant.driver).click();
			Thread.sleep(2000);

			List<WebElement> original_Mandatory = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]")));

			Thread.sleep(1000);                                                                  
			//System.out.println("Mandatory column Sorting : For printing List after clicking once");
			for(int i=0; i<original_Mandatory.size(); i++) 
			{
				String a = original_Mandatory.get(i).getText();
				originallist3.add(a);
				Mandatory_Asc= originallist3.get(i).toString();
				//System.out.println("SEPG Phases -> SEPG Mandatory_Asc-------" +  Mandatory_Asc);
			}
			//Collections.sort(originallist);

			//Logic to compare Capital with Lower case letter 
			Collections.sort(originallist3, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});

			//	//System.out.println("SEPG Mandatory_Asc-------" +   Mandatory_Asc);
			Iterator<String> iterator = originallist3.listIterator();
			while (iterator.hasNext()) {
				ascending_order_iterator = iterator.next().toString();
				//System.out.println("ascending_order_iterator-----" + ascending_order_iterator);
			}
			if(Mandatory_Asc.equals(ascending_order_iterator)){
				Report.ReporterOutput("STEP","Verify Mandatory column is displayed in Ascending Order ",originallist3.toString(),"Click on Mandatory column ","Mandatory column should be displayed in ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Mandatory column is displayed in Ascending Order ",originallist3.toString(),"Click on Mandatory column ","Mandatory column should not displayed in ascending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//****************************Descending Mandatory column Sorting : SEPG Page   *******************************************************
	public static void Descending_MandatorySorting() throws Throwable {
		try {
			//2nd click on Mandatory column in continuation with the Ascending code   
			PageObjects_SEPGActivity.sepgActivity_MandatorySorting(Constant.driver).click();
			Thread.sleep(2000);

			List<WebElement>original_Mandatory= (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]")));

			//System.out.println("Descending  Mandatory column Sorting : For printing List after clicking 2nd time");
			for(int i=0; i<original_Mandatory.size(); i++) 
			{
				String b = original_Mandatory.get(i).getText();
				originallist7.add(b);
				Mandatory_Dsc= originallist7.get(i).toString();
				//System.out.println("SEPG Engagement_Model_Dsc-------" +   Mandatory_Dsc);
			}

			Collections.sort(originallist1);
			Collections.reverse(originallist1);
			////System.out.println("SEPG Mandatory_Dsc-------" +   sepgMandatory_Dsc);

			//Logic to compare Capital wirh Lower case letter

			Collections.sort(originallist7, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return -s1.compareToIgnoreCase(s2);
				}
			});

			Iterator<String> iterator01 = originallist7.iterator();
			while (iterator01.hasNext()) {
				descending_order_iterator = iterator01.next().toString();
				//System.out.println("descending_Order_Mandatory-----" + descending_order_iterator);
			}
			if(Mandatory_Dsc.equals(descending_order_iterator)){
				Report.ReporterOutput("STEP","Verify  Mandatory column is displayed in descending order ",originallist7.toString(),"Click on Mandatory Column "," Mandatory  column should be displayed in descending order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Mandatory column is displayed in descending order ",originallist7.toString(),"Click on Mandatory column "," Mandatory column  is not displayed in descending order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//****************************Ascending Productive column Sorting : SEPG Page  *******************************************************
	public static void Ascending_ProductiveSorting() throws Throwable {
		try {

			// click on Productive column for Ascending sorting
			PageObjects_SEPGActivity.sepgActivity_ProductiveSorting(Constant.driver).click();
			Thread.sleep(2000);

			List<WebElement> original_Productive= (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[4]")));

			Thread.sleep(1000);                                                                  
			//System.out.println("Productive column Sorting : For printing List after clicking once");
			for(int i=0; i<original_Productive.size(); i++) 
			{
				String a = original_Productive.get(i).getText();
				originallist5.add(a);
				Productive_Asc= originallist5.get(i).toString();
				//System.out.println("SEPG Activity : SEPG Productive_Asc-------" +   Productive_Asc);
			}
			//Collections.sort(originallist);

			//Logic to compare Capital with Lower case letter 
			Collections.sort(originallist5, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});

			//	//System.out.println("SEPG MapActivity_Asc_Asc-------" +   MapActivity_Asc);
			Iterator<String> iterator = originallist5.listIterator();
			while (iterator.hasNext()) {
				ascending_order_iterator = iterator.next().toString();
				//System.out.println("ascending_order_iterator-----" + ascending_order_iterator);
			}
			if(Productive_Asc.equals(ascending_order_iterator)){
				Report.ReporterOutput("STEP","Verify Productive column is displayed in ascending Order ",originallist5.toString(),"Click on Productive   "," Productive column should be displayed in ascending order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Productive  column is displayed in ascending Order ",originallist5.toString(),"Click on Productive   "," Productive column should not displayed in ascending order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//****************************Descending Productive column Sorting : SEPG Page  *******************************************************
	public static void Descending_ProductiveSorting() throws Throwable {
		try {
			// click on MapActivity column for Ascending sorting
			PageObjects_SEPGActivity.sepgActivity_ProductiveSorting(Constant.driver).click();
			Thread.sleep(2000);
			//PageObjects_SEPGActivity.sepgActivity_ProductiveSorting(Constant.driver).click();
			//Thread.sleep(2000);
			List<WebElement> original_Productive= (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[4]")));
			Thread.sleep(1000);                                                                 
			//System.out.println("Productive column Sorting : After clicking 2nd time ");
			for(int i=0; i<original_Productive.size(); i++) 
			{
				String a = original_Productive.get(i).getText();
				originallist6.add(a);
				Productive_Dsc= originallist6.get(i).toString();
				//System.out.println("SEPG Activity : Productive_Dsc -------" +   Productive_Dsc);
			}
			//Collections.sort(originallist);
			/*Collections.sort(originallist1);
			Collections.reverse(originallist1);*/

			//Logic to compare Capital with Lower case letter 
			Collections.sort(originallist6, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return -s1.compareToIgnoreCase(s2);
				}
			});
			//	//System.out.println("SEPG Productive_Dsc-------" +   Productive_Dsc);
			Iterator<String> iterator = originallist6.listIterator();
			while (iterator.hasNext()) {
				descending_order_iterator = iterator.next().toString();
				//System.out.println("ascending_order_iterator-----" + descending_order_iterator);
			}
			if(Productive_Dsc.equals(descending_order_iterator)){
				Report.ReporterOutput("STEP","Verify Productive column is displayed in decending order ",originallist6.toString(),"Click on Productive ","Productive column should be displayed in decending order","Fail",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Productive  column is displayed in decending order ",originallist6.toString(),"Click on Productive ","Productive column should not displayed in decending order","Pass",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*try
		{
		     if(Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).isDisplayed());                                    

		{              
		     Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).click();
		     Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is navigated to RMS      Home page","Pass",null);
		}
		}
		catch(Exception e)
		{
		    System.out.println( e.getMessage());
		 */
	}


}

// END OF CLASS
//**********************************************************************************************************************************************************************

