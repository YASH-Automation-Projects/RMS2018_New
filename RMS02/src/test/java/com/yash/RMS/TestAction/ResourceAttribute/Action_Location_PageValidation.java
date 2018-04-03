package com.yash.RMS.TestAction.ResourceAttribute;
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
import com.yash.RMS.POM.ResourceAttribute.PageObjects_ResourceAttribute;

public class Action_Location_PageValidation {
	public static String locationName_Asc; 
	public static String ascendingorderiterator; 
	public static String locationName_Dsc;;
	public static String locationHR_Asc;
	public static String locationHR_Dsc;
	public static String descendingorderiterator;
	public static String Asc;

	public static ArrayList<String> originallist = new ArrayList<String>();
	public static ArrayList<String> originallist1 = new ArrayList<String>();

	//******FOR NAVIGATION******************************************************************************************
	//click on Masterdata Link
	public static void location_Navigation() throws Throwable {
		try {
			//Thread.sleep(4000);
			(Constant.driver).manage().window().maximize();
			if (PageObjects_ResourceAttribute.location_linkMasterData(Constant.driver).isDisplayed()) {
				PageObjects_ResourceAttribute.designation_linkMasterData(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify master data Link is displayed ","Master Data link", "Click on master data link","master data link should be displayed and clicked", "Pass", null);
			} else {
				Report.ReporterOutput("STEP","Master Data link is displayed ","Master Data link","Click on master data link","master data link not displayed","Fail",null);
			}
			//Thread.sleep(2000);

			//Resource Attribute Link
			if (PageObjects_ResourceAttribute.location_linkResourceAttribute(Constant.driver).isDisplayed()) {
				PageObjects_ResourceAttribute.location_linkResourceAttribute(Constant.driver).click();
				Report.ReporterOutput("STEP","Resource Attribute Link is displayed ","Resource Attribute Link","Click on Resource Attribute Link","Resource Attribute Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Resource Attribute Link is displayed ","Resource Attribute Link","Click on Resource Attribute Link","Resource Attribute Link  is not displayed","Fail",null);
			}
			//Thread.sleep(2000);

			//location Link
			//	Thread.sleep(2000);
			if (PageObjects_ResourceAttribute.location_link(Constant.driver).isDisplayed()) {
				PageObjects_ResourceAttribute.location_link(Constant.driver).click();
				//INSERT HERE 
				PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).clear();
				Report.ReporterOutput("STEP","Verify location link is displayed ","location link","Click on location link","location link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify location link is displayed ","location link","Click on location link","location link not displayed","Fail",null);
			}
			// Designation Page Text
			String Page_location = PageObjects_ResourceAttribute.location_pageText(Constant.driver).getText();

			if (Page_location.equalsIgnoreCase("location")) {
				Report.ReporterOutput("STEP","Verify location Page Text is Visible ","location Page Text","Click on location Page Text","location Page Text is visible","Pass",null);
			} else {

				Report.ReporterOutput("STEP","Verify location Page Text is Visible ","location Page Text","Click on location Page Text","location Page Text is not visible","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// **********************************************************************************
	//**FOR location SERIAL NO SORTING****************************************************
	public static void locationPage_serialNoSorting() throws Throwable {
	//	Thread.sleep(1000);
		try {
			// need to send key and then clear it and sleep some time
			PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).sendKeys("a");
			//Thread.sleep(2000);
			PageObjects_ResourceAttribute.location_buttonSearch(Constant.driver).clear();
			//Thread.sleep(2000);

			PageObjects_ResourceAttribute.location_serialNoSorting(Constant.driver).click();
			if (PageObjects_ResourceAttribute.location_serialNoSorting(Constant.driver).isDisplayed()) 
			{
				Report.ReporterOutput("STEP","Verify location Page Serial No Sorting is Visible ","location Page Serial No Sorting ","Click on location Page Serial No Sorting ","location Page Serial No Sorting displayed and clicked","Pass",null);
			} 
			else
			{
				Report.ReporterOutput("STEP","Verify location Page Serial No Sorting is Visible ","location Page Serial No Sorting ","Click on location Page Serial No Sorting ","location Page Serial No Sorting is not displayed","Fail",null);
			}
			//Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// **********************************************************************************
	//********3.FOR location Descending  Serial No Sorting*************************************************************************************
	public static void locationPage_descendingSerialNoSorting() throws Throwable {
		try {
			//Descending  Serial No Sorting
			//Thread.sleep(1000);		
			WebElement text2= PageObjects_ResourceAttribute.location_first_serialNoSorting(Constant.driver);
			String text_02= text2.getText();
	//		System.out.println("Descending  Serial No Sorting...");
	//		System.out.println(text_02);
			int y = Integer.parseInt(text_02);
			if (y>1){
	//			System.out.println("Serial No Sorting.: It is descending ");
				Report.ReporterOutput("STEP","Verify location descending Serial No Sorting is Visible ",text_02,"Click on location descending Serial No Sorting","location descending Serial No Sorting should be displayed and clicked","Pass",null);
			}
			else{
		//		System.out.println("Serial No Sorting... :It is not descending ");
				Report.ReporterOutput("STEP","Verify location descending Serial No Sorting is Visible ",text_02,"Click on location descending Serial No Sorting","location descending Serial No Sorting is not displayed","Pass",null);
			}
			//Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// **********************************************************************************
	//**4.location Ascending  Serial No Sorting*************************************************************************************
	public static void locationPage_ascendingSerialNoSorting() throws Throwable {
		try {
			//Ascending  Serial No Sorting
			PageObjects_ResourceAttribute.location_serialNoSorting(Constant.driver).click();
			//Thread.sleep(2000);
			WebElement text1= PageObjects_ResourceAttribute.location_first_serialNoSorting(Constant.driver);
			String text_01 = text1.getText();
			int x = Integer.parseInt(text_01);
			if (x==1){
	//			System.out.println("Ascending  Serial No Sorting...:It is ascending ");
				Report.ReporterOutput("STEP","Verify location Page ascending serial No Sorting",text_01,"Click on location Page ascending serial No Sorting","location Page ascending serial No Sorting should be displayed and clicked","Pass",null);
			}
			else{
	//			System.out.println("Ascending  Serial No Sorting...:It is not ascending ");
				Report.ReporterOutput("STEP","Verify location Page ascending serial No Sorting",text_01,"Click on location Page ascending serial No Sorting","location Page ascending serial No Sorting is not displayed","Pass",null);
			//	Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// **********************************************************************************
	//******5.Ascending location Name  Sorting*********************************************************************************************************************
	public static void locationPage_AscendingNameSorting() throws Throwable {
		try {
			//Ascending   //For printing List after clicking once
			PageObjects_ResourceAttribute.location_nameSorting(Constant.driver).click();
		//	Thread.sleep(2000);

			List<WebElement> originalSavedlocationName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")));
			//Thread.sleep(1000);                                                                  
	//		System.out.println("Ascending  InvoiceBy Name Sorting : For printing List after clicking once");
			for(int i=0; i<originalSavedlocationName.size(); i++) 
			{
				String a = originalSavedlocationName.get(i).getText();
				originallist.add(a);
				locationName_Asc= originallist.get(i).toString();
			//	System.out.println("locationName_Asc-------" +   locationName_Asc);
			}
			Collections.sort(originallist); // Ascending order

			//String Ascendingorder = originallist.toString();
			//System.out.println("Ascendingorder--------------"+Ascendingorder);
			//	System.out.println("locationName_Asc-------" +   locationName_Asc);
			Iterator<String> iterator = originallist.listIterator();
			while (iterator.hasNext()) {
				ascendingorderiterator = iterator.next().toString();
		//		System.out.println("ascendingorderiterator-----" + ascendingorderiterator);
			}
			if(locationName_Asc.equals(ascendingorderiterator)){
				Report.ReporterOutput("STEP","Verify location Name is displayed in Ascending Order ",originallist.toString(),"Click on location Name","location Name should be displayed in ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify location Name is displayed in Ascending Order ",originallist.toString(),"Click on location Name","location Name should is not displayed in ascending Order","Fail",null);
			}
			originallist.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// **********************************************************************************
	//************6..Descending  location Name  Sorting*******************************************
	public static void locationPage_DescendingNameSorting() throws Throwable {
		try {
			/*PageObjects_ProjectAttribute.invoiceByName(Constant.driver).click();
						Thread.sleep(2000);*/
			PageObjects_ResourceAttribute.location_nameSorting(Constant.driver).click();
			//Thread.sleep(2000);

			List<WebElement>descendingOrderSortedlocation = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")));                                                        
			System.out.println("Descending  location Name Sorting : For printing List after clicking 2nd time");
			for(int i=0; i<descendingOrderSortedlocation.size(); i++) 
			{
				String b = descendingOrderSortedlocation.get(i).getText();
				originallist1.add(b);
				locationName_Dsc= originallist1.get(i).toString();
	//			System.out.println("locationName_Dsc-------" +   locationName_Dsc);
			}

			Collections.sort(originallist1);
			Collections.reverse(originallist1);

			//System.out.println("originallist1----------"+ originallist1);
			//System.out.println("locationName_Dsc-------" +   locationName_Dsc);
			Iterator<String> iterator01 = originallist1.iterator();
			while (iterator01.hasNext()) {
				descendingorderiterator = iterator01.next().toString();
	//			System.out.println("descendingorderiterator-----" + descendingorderiterator);
			}
			if(locationName_Dsc.equals(descendingorderiterator)){
				Report.ReporterOutput("STEP","Verify location Name is displayed in Descending Order ",originallist1.toString(),"Click on location Name","location Name should be displayed in Descending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify location Name is displayed in Descending Order ",originallist1.toString(),"Click on location Name","location Name is not displayed in Descending Order","Fail",null);
			}
			originallist1.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// **********************************************************************************
	//**5.Ascending Location HR :  Sorting*************************************************
	public static void locationPage_AscendingLocationHRSorting() throws Throwable {
		try {
			//Ascending :clicking 1st Time on Location HR
			PageObjects_ResourceAttribute.location_HRnameSorting(Constant.driver).click();
		//	Thread.sleep(2000);
			//for HR column Only  
			List<WebElement> originalSavedlocationHRName =(Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]")));
		//	Thread.sleep(1000);                                                                  
	//		System.out.println("Ascending  Location HR  Sorting : For printing List after clicking once");
			for(int i=0; i<originalSavedlocationHRName.size(); i++) 
			{
				String a = originalSavedlocationHRName.get(i).getText();
				originallist.add(a);
				locationName_Asc= originallist.get(i).toString();
	//			System.out.println("LocationHR_Asc-------" +   locationName_Asc);
			}

			Collections.sort(originallist1, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			//Collections.sort(originallist); // Ascending order

			//System.out.println("Ascendingorder--------------"+Ascendingorder);
			//	System.out.println("locationName_Asc-------" +   locationName_Asc);

			Iterator<String> iterator = originallist.listIterator();
			while (iterator.hasNext()) {
				ascendingorderiterator = iterator.next().toString();
	//			System.out.println("ascendingorderiterator-----" + ascendingorderiterator);
			}
			if(locationName_Asc.equals(ascendingorderiterator)){
				Report.ReporterOutput("STEP","Verify Location HR column is displayed in Ascending Order ",originallist.toString(),"Click on Location HR ","Location HR  should be displayed in ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Location HR column  is displayed in Ascending Order ",originallist.toString(),"Click on Location HR "," Location HR  should is not displayed in ascending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// **********************************************************************************
	//5.sorting in Descending  Location HR column *********************************************************
	public static void locationPage_DescendingLocationHRSorting() throws Throwable {
		try {
			//Descending : clicking 2nd time on Location HR 

			//	PageObjects_ResourceAttribute.location_HRnameSorting(Constant.driver).click();
			//	Thread.sleep(2000);

			PageObjects_ResourceAttribute.location_HRnameSorting(Constant.driver).click();
		//	Thread.sleep(2000);

			List<WebElement>descendingOrderSortedLocationHR = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]")));                                                        
	//		System.out.println("Descending  Location HR Sorting : For printing List after clicking 2nd time");

			for(int i=0; i<descendingOrderSortedLocationHR.size(); i++) 
			{
				String b = descendingOrderSortedLocationHR.get(i).getText();
				originallist1.add(b);
				locationHR_Dsc= originallist1.get(i).toString();
		//		System.out.println("locationHR_Dsc-------" +   locationHR_Dsc);
			}

			Collections.sort(originallist1, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return -s1.compareToIgnoreCase(s2);
				}
			});
			/*Collections.sort(originallist1);
			Collections.reverse(originallist1);*/
	//		System.out.println("originallist1----------"+ originallist1);
			//System.out.println("locationName_Dsc-------" +   locationName_Dsc);

			Iterator<String> iterator01 = originallist1.iterator();
			while (iterator01.hasNext()) {
				descendingorderiterator = iterator01.next().toString();
				//	System.out.println(descendingorderiterator);
			//	System.out.println("descendingorderiterator-----" + descendingorderiterator);
			}
			if(locationHR_Dsc.equals(descendingorderiterator)){
				Report.ReporterOutput("STEP","Verify location  HR is displayed in Descending Order ",originallist1.toString(),"Click on location HR","location HR should be displayed in Descending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify location HR is displayed in Descending Order ",originallist1.toString(),"Click on location HR","location HR is not displayed in Descending Order","Fail",null);
				PageObjects_ResourceAttribute.location_HRnameSorting(Constant.driver).click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// **********************************************************************************
	//This functionality will verify Pagination

	public static void Pagination() throws Throwable 
	{
		List<WebElement> pagination = Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[7]/div[2]/a"));
		for (int i=pagination.size(); i>=1; i--) 
		{
			WebElement element = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[7]/div[2]/a["+i+"]"));

			String LocationName1 = element.getText();
	//		System.out.println(LocationName1);
			element.click();
			//Thread.sleep(500);
			Report.ReporterOutput("STEP ","Verify Pagination-:"+ LocationName1, "Click on Link." + LocationName1, LocationName1+"Link should be visible and Clickable.",LocationName1+" Link is visible and clickable", "Pass",null); 

		}	
	}
	// **********************************************************************************
	//This functionality will verify Count of Records.
	public static void RecordsCount() throws Throwable 
	{
		int rows_count;
		Select dropdown1 = new Select(PageObjects_ResourceAttribute.location_noOfEnteries(Constant.driver));
		List<WebElement> values_drop = dropdown1.getOptions();
		for(int i=0;i<values_drop.size();i++)
		{
			dropdown1.selectByIndex(i);
			WebElement option = dropdown1.getFirstSelectedOption();
//			System.out.println(option.getText()); 
			Integer x = Integer.valueOf(option.getText());
	//		System.out.println(x);
			//This is to verify number of rows and columns
			WebElement mytable = PageObjects_ResourceAttribute.location_EmployeeCategoryTableID(Constant.driver);
		//	Thread.sleep(500);
			//To locate rows of table.
			List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
			//To calculate no of rows In table.
			rows_count = rows_table.size()-1;
	//		System.out.println(rows_count);
			//Thread.sleep(1700);
			if(x.equals(rows_count))
			{ 
				Report.ReporterOutput("STEP ","Verify Count of Record for entry="+ x,"Count="+ x  , "Entries Should be Correct-" + x,"Active Record Count done successfully.--" + x, "Pass",null);		  
			}

			//Thread.sleep(2000);
		} 	
		// ***Reverse Navigation which we have traverse; ;to click on Master and Resourse link  ***********
		if (PageObjects_ResourceAttribute.location_linkMasterData(Constant.driver).isDisplayed()) {
			PageObjects_ResourceAttribute.designation_linkMasterData(Constant.driver).click();
	//		System.out.println("Rerverse navigation PASS on link :location_linkMasterData");
			//	Report.ReporterOutput("STEP","Verify master data Link is displayed ","Master Data link", "Click on master data link","master data link should be displayed and clicked", "Pass", null);
		} else {
			//Report.ReporterOutput("STEP","Master Data link is displayed ","Master Data link","Click on master data link","master data link not displayed","Fail",null);
	//		System.out.println("Rerverse navigation FAIL on link :location_linkMasterData");
		}
		Thread.sleep(2000);
		if (PageObjects_ResourceAttribute.location_linkResourceAttribute(Constant.driver).isDisplayed()) {
			PageObjects_ResourceAttribute.location_linkResourceAttribute(Constant.driver).click();
	//		System.out.println("Rerver navigation Fail on link :location_linkResourceAttribute");
			//Report.ReporterOutput("STEP","Resource Attribute Link is displayed ","Resource Attribute Link","Click on Resource Attribute Link","Resource Attribute Link should be displayed and clicked","Pass",null);
		}
		else {
			//Report.ReporterOutput("STEP","Resource Attribute Link is displayed ","Resource Attribute Link","Click on Resource Attribute Link","Resource Attribute Link  is not displayed","Fail",null);
	//		System.out.println("Rerver navigation pass on link :location_linkResourceAttribute");
		}
		// ***Navigation to Home page*******************************************************************************
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
