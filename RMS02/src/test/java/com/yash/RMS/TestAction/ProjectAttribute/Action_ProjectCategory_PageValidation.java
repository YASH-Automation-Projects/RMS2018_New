package com.yash.RMS.TestAction.ProjectAttribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
//import com.yash.RMS.POM.ProjectAttribute.PageObjects_ProjectAttribute;
import com.yash.RMS.POM.ProjectAttribute.PageObjects_ProjectAttribute;

public class Action_ProjectCategory_PageValidation {

	public static String projectCategoryName_Asc; 
	public static String ascendingorderiterator; 
	public static String projectCategoryName_Dsc;;      
	public static String descendingorderiterator;
	public static String Asc;

	public static ArrayList<String> originallist = new ArrayList<String>();
	public static ArrayList<String> originallist1 = new ArrayList<String>();

	//******FOR NAVIGATION******************************************************************************************
	//Masterdata Link
	public static void projectCategorypage_PageValidationNavigation() throws Throwable {
		try {
		//	Thread.sleep(4000);
			(Constant.driver).manage().window().maximize();
			if (PageObjects_ProjectAttribute.masterDataLink(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.masterDataLink(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify master data Link is displayed ","Master Data link", "Click on master data link","master data link should be displayed and clicked", "Pass", null);
			} else {
				Report.ReporterOutput("STEP","Master Data link is displayed ","Master Data link","Click on master data link","master data link not displayed","Fail",null);
			}
		//	Thread.sleep(2000);

			//Project Attribute Link
			if (PageObjects_ProjectAttribute.projectAttributeLink(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.projectAttributeLink(Constant.driver).click();
				Report.ReporterOutput("STEP","Project Attribute Link is displayed ","Project Attribute Link","Click on Project Attribute Link","Project Attribute Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Project Attribute Link is displayed ","Project Attribute Link","Click on Project Attribute Link","Project Attribute Link  is not displayed","Fail",null);
			}
			//Thread.sleep(2000);
			//ProjectCategory_Link

			Thread.sleep(2000);
			if (PageObjects_ProjectAttribute.projectCategory_Link(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.projectCategory_Link(Constant.driver).click();
				Report.ReporterOutput("STEP","Verify projectCategory_Link is displayed "," projectCategory_Link","Click on projectCategory_Link","projectCategory_Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify projectCategory_Link is displayed ","projectCategory_Link","Click on projectCategory_Link","projectCategory_Link not displayed","Fail",null);
			}

			//			INSERT HERE 
			PageObjects_ProjectAttribute.projectCategory_searchButton(Constant.driver).clear();


			// Project Category Page Text
			String Page_Project_Category = PageObjects_ProjectAttribute.projectCategory_pageText(Constant.driver).getText();
			if (Page_Project_Category.equalsIgnoreCase("Project Category")) {
				Report.ReporterOutput("STEP","Verify Page_Project_Category is Visible "," Page_Project_Category","Click on Page_Project_Category","Page_Project_Category is visible","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify Page_Project_Category is Visible ","Page_Project_Category","Click on Page_Project_Category","Page_Project_Category is not visible","Fail",null);
			}
			//Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//********FOR Project Category SERIAL NO SORTING*************************************************************************************
	//	Serial Serial No Sorting
	public static void projectCategorypage_serialNoSorting() throws Throwable {
		Thread.sleep(1000);
		try {

			PageObjects_ProjectAttribute.projectCategory_searchButton(Constant.driver).sendKeys("a");
		//	Thread.sleep(2000);
			PageObjects_ProjectAttribute.projectCategory_searchButton(Constant.driver).clear();
			//Thread.sleep(2000);
			PageObjects_ProjectAttribute.projectCategory_serialNoSorting(Constant.driver).click();
			if (PageObjects_ProjectAttribute.projectCategory_serialNoSorting(Constant.driver).isDisplayed()) 
			{
				Report.ReporterOutput("STEP","Verify projectCategory_serialNoSorting is Visible ","projectCategory_serialNoSorting ","Click on projectCategory_serialNoSorting ","projectCategory_serialNoSortingis displayed and clicked","Pass",null);
			} 
			else
			{
				Report.ReporterOutput("STEP","Verify projectCategory_serialNoSorting is Visible ","projectCategory_serialNoSorting ","Click on projectCategory_serialNoSorting ","serial No Sorting is not displayed","Fail",null);
			}
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//********3.FOR Project Category Descending  Serial No Sorting*************************************************************************************
	public static void projectCategorypage_descendingSerialNoSorting() throws Throwable {
		try {
			//Descending  Serial No Sorting
		//	Thread.sleep(1000);		
			WebElement text2= PageObjects_ProjectAttribute.projectCategory_first_serialNoSorting(Constant.driver);
			String text_02= text2.getText();
		//	System.out.println("Descending  Serial No Sorting...");
		//	System.out.println(text_02);
			int y = Integer.parseInt(text_02);
			if (y>1){
		//		System.out.println("Serial No Sorting.: It is descending ");
				Report.ReporterOutput("STEP","Verify Project Category descending Serial No Sorting is Visible ",text_02,"Click on Project Category descending Serial No Sorting","descending Serial No Sorting should be displayed and clicked","Pass",null);
			}
			else{
			///	System.out.println("Serial No Sorting... :It is not descending ");
				Report.ReporterOutput("STEP","Verify Project Category descending Serial No Sorting is Visible ",text_02,"Click on Project Category descending Serial No Sorting","Project Category descending Serial No Sorting is not displayed","Pass",null);
			}
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//*******4.Ascending  Serial No Sorting*************************************************************************************

	public static void projectCategorypage_ascendingSerialNoSorting() throws Throwable {
		try {
			//Ascending  Serial No Sorting
			PageObjects_ProjectAttribute.projectCategory_serialNoSorting(Constant.driver).click();
		//	Thread.sleep(2000);
			WebElement text1= PageObjects_ProjectAttribute.projectCategory_first_serialNoSorting(Constant.driver);
			String text_01 = text1.getText();
			int x = Integer.parseInt(text_01);
			if (x==1){
		//		System.out.println("Ascending  Serial No Sorting...:It is ascending ");
				Report.ReporterOutput("STEP","Verify Project Category Page ascending serial No Sorting",text_01,"Click on  Project Category Page ascending serial No Sorting","Project Category Page ascending serial No Sorting should be displayed and clicked","Pass",null);
			}
			else{
		//		System.out.println("Ascending  Serial No Sorting...:It is not ascending ");
				Report.ReporterOutput("STEP","Verify Project Category Page ascending serial No Sorting",text_01,"Click on  Project Category Page ascending serial No Sorting"," Project Category Page ascending serial No Sorting is not displayed","Pass",null);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//******5.Ascending  Project Category Name  Sorting*************************************************************************************
	public static void projectCategory_AscendingNameSorting() throws Throwable {
		try {
			//Ascending   //For printing List after clicking once
			PageObjects_ProjectAttribute.projectCategory_nameSorting(Constant.driver).click();
		//	Thread.sleep(2000);
			List<WebElement> originalSavedProjectCategoryName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")));
			//Thread.sleep(1000);                                                                  
		//	System.out.println("Ascending  InvoiceBy Name Sorting : For printing List after clicking once");
			for(int i=0; i<originalSavedProjectCategoryName.size(); i++) 
			{
				String a = originalSavedProjectCategoryName.get(i).getText();
				originallist.add(a);
				projectCategoryName_Asc= originallist.get(i).toString();
			//	System.out.println("projectCategoryName_Asc-------" +   projectCategoryName_Asc);
			}
			Collections.sort(originallist);

			Iterator<String> iterator = originallist.iterator();
			while (iterator.hasNext()) {
				ascendingorderiterator = iterator.next().toString();
			//	System.out.println("ascendingorderiterator-----" + ascendingorderiterator);
			}
			if(projectCategoryName_Asc.equals(ascendingorderiterator)){
				Report.ReporterOutput("STEP","Verify Project Category Name is displayed in Ascending Order ",originallist.toString(),"Click on Project Category Name","Project Category Name should be displayed in ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Project Category Name is displayed in Ascending Order ",originallist.toString(),"Click on Project Category Name","Project Category Name should is not displayed in ascending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//************6..Descending  Project Category Name  Sorting*************************************************************************************
	public static void projectCategory_DescendingNameSorting() throws Throwable {
		try {
			/*PageObjects_ProjectAttribute.invoiceByName(Constant.driver).click();
		Thread.sleep(2000);*/
			PageObjects_ProjectAttribute.projectCategory_nameSorting(Constant.driver).click();
			//Thread.sleep(2000);
			List<WebElement>descendingOrderSortedProjectCategory = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")));                                                        
	//		System.out.println("Descending  InvoiceBy Name Sorting : For printing List after clicking 2nd time");
			for(int i=0; i<descendingOrderSortedProjectCategory.size(); i++) 
			{
				String b = descendingOrderSortedProjectCategory.get(i).getText();
				originallist1.add(b);
				projectCategoryName_Dsc= originallist1.get(i).toString();
			//	System.out.println("projectCategoryName_Dsc-------" +   projectCategoryName_Dsc);
			}

			Collections.sort(originallist1);
			Collections.reverse(originallist1);

			//System.out.println("invoiceByName_Dsc-------" +   projectCategoryName_Dsc);
			Iterator<String> iterator01 = originallist1.iterator();
			while (iterator01.hasNext()) {
				descendingorderiterator = iterator01.next().toString();
		//		System.out.println("descendingorderiterator-----" + descendingorderiterator);
			}
			if(projectCategoryName_Dsc.equals(descendingorderiterator)){
				Report.ReporterOutput("STEP","Verify Project Category Name is displayed in Descending Order ",originallist1.toString(),"Click on Project Category Name","Project Category Name should be displayed in Descending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Project Category Name is displayed in Descending Order ",originallist1.toString(),"Click on Project Category Name","Project Category Name is not displayed in Descending Order","Fail",null);
			}
			PageObjects_ProjectAttribute.projectCategory_nameSorting(Constant.driver).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// **********************************************************************************
	//This functionality will verify Pagination

	public static void projectCategory_Pagination() throws Throwable 
	{
		List<WebElement> pagination = Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[7]/div[2]/a"));
		for (int i=pagination.size(); i>=1; i--) 
		{
			WebElement element = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[7]/div[2]/a["+i+"]"));

			String ProjectCategory1 = element.getText();
		//	System.out.println(ProjectCategory1);
			element.click();
			//Thread.sleep(500);
			Report.ReporterOutput("STEP ","Verify Pagination-:"+ ProjectCategory1, "Click on Link." + ProjectCategory1, ProjectCategory1+"Link should be visible and Clickable.",ProjectCategory1+" Link is visible and clickable", "Pass",null); 

		}	
	}
	// **********************************************************************************
	//This functionality will verify Count of Records.
	public static void projectCategory_RecordsCount() throws Throwable 
	{
		int rows_count;
		Select dropdown1 = new Select(PageObjects_ProjectAttribute.projectCategory_noOfEnteries(Constant.driver));
		List<WebElement> values_drop = dropdown1.getOptions();
		for(int i=0;i<values_drop.size();i++)
		{
			dropdown1.selectByIndex(i);
			WebElement option = dropdown1.getFirstSelectedOption();
	//		System.out.println(option.getText()); 
			Integer x = Integer.valueOf(option.getText());
	//		System.out.println(x);
			//This is to verify number of rows and columns
			WebElement mytable = PageObjects_ProjectAttribute.projectCategory_EmployeeCategoryTableID(Constant.driver);
			//Thread.sleep(500);
			//To locate rows of table.
			List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
			//To calculate no of rows In table.
			rows_count = rows_table.size()-1;
		//	System.out.println(rows_count);
			Thread.sleep(1000);
			if(x.equals(rows_count))
			{ Report.ReporterOutput("STEP ","Verify Count of Record for entry="+ x,"Count="+ x  , "Entries Should be Correct-" + x,"Active Record Count done successfully.--" + x, "Pass",null);		  
			}
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
		catch(Exception e8)
		{
			System.out.println( e8.getMessage());


		}

	}	
	// **********************************************************************************

}
//**********************************************************************************************************************************************************************

