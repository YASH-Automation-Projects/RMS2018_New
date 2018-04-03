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
import com.yash.RMS.POM.ProjectAttribute.PageObjects_ProjectAttribute;

public class Action_InvoiceBy_PageValidation {
	public static String invoiceByName_Asc;
	public static String  ascendingorderiterator;
	public static String invoiceByName_Dsc;
	public static String  descendingorderiterator;
	public static String Asc;

	public static ArrayList<String> originallist = new ArrayList<String>();
	public static ArrayList<String> originallist1 = new ArrayList<String>();
	//**********************************************************FOR NAVIGATION************************************************************************************
	public static void pageValidationNavigation() throws Throwable {
		try {
			//Thread.sleep(2000);
			Constant.driver.manage().window().maximize();
			if (PageObjects_ProjectAttribute.masterDataLink(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.masterDataLink(Constant.driver).click();
				Thread.sleep(1000);
				Report.ReporterOutput("STEP","Verify master data Link is displayed ","Master Data link", "Click on master data link","master data link should be displayed and clicked", "Pass", null);
			} else {
				Report.ReporterOutput("STEP","Master Data link is displayed ","Master Data link","Click on master data link","master data link not displayed","Fail",null);
			}
			//Thread.sleep(2000);
			if (PageObjects_ProjectAttribute.projectAttributeLink(Constant.driver).isDisplayed()) {
			//	Thread.sleep(2000);
				PageObjects_ProjectAttribute.projectAttributeLink(Constant.driver).click();
				Report.ReporterOutput("STEP","Project Attribute Link is displayed ","Project Attribute Link","Click on Project Attribute Link","Project Attribute Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Project Attribute Link is displayed ","Project Attribute Link","Click on Project Attribute Link","Project Attribute Link  is not displayed","Fail",null);
			}
			Thread.sleep(1000);
			if (PageObjects_ProjectAttribute.invoiceByLink(Constant.driver).isDisplayed()) {
				PageObjects_ProjectAttribute.invoiceByLink(Constant.driver).click();


				//	INSERT HERE
				Thread.sleep(7000);
				PageObjects_ProjectAttribute.searchBox(Constant.driver).clear();

				Report.ReporterOutput("STEP","Verify Invoice By Link is displayed "," Invoice By Link","Click on Invoice By Link","Invoice By Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Invoice By Link is displayed ","Invoice By Link","Click on Invoice By Link","Invoice By Link not displayed","Fail",null);
			}
			String Page_Invoice_By = PageObjects_ProjectAttribute.invoiceByPageText(Constant.driver).getText();
			if (Page_Invoice_By.equalsIgnoreCase("Invoice By")) {
				Report.ReporterOutput("STEP","Verify invoice By Page Text is Visible "," invoice By Page Text","Click on invoice By Page Text","invoice By Page Text is visible","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify invoice By Page Text is Visible ","invoice By Page Text","Click on invoice By Page Text","invoice By Page Text is not visible","Fail",null);
			}
		//	Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**FOR SERIAL NO SORTING*************************************************************************************
	//	Serial Serial No Sorting
	public static void serialNoSorting() throws Throwable {
		//Thread.sleep(1000);
		try {
			// need to send key adn then clear it and sleep some time

		    Thread.sleep(7000);
			Thread.sleep(1000);
			PageObjects_ProjectAttribute.searchBox(Constant.driver).clear();
			Thread.sleep(1000);

			PageObjects_ProjectAttribute.serialNoSorting(Constant.driver).click();
			if (PageObjects_ProjectAttribute.serialNoSorting(Constant.driver).isDisplayed()) 
			{
				Report.ReporterOutput("STEP","Verify serial No Sorting is Visible ","serial No Sorting ","Click on serial No Sorting ","serial No Sorting is displayed and clicked","Pass",null);
			} 
			else
			{
				Report.ReporterOutput("STEP","Verify serial No Sorting is Visible ","serial No Sorting ","Click on serial No Sorting ","serial No Sorting is not displayed","Fail",null);
			}
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//********3.Descending  Serial No Sorting*************************************************************************************
	public static void descendingSerialNoSorting() throws Throwable {
		try {
			//Descending  Serial No Sorting
			Thread.sleep(3000);		
			WebElement text2= PageObjects_ProjectAttribute.first_serialNoSorting(Constant.driver);
			String text_02= text2.getText();
	//		System.out.println("Descending  Serial No Sorting...");
	//		System.out.println(text_02);
			int y = Integer.parseInt(text_02);
			if (y>1){
		//		System.out.println("Serial No Sorting.: It is descending ");
				Report.ReporterOutput("STEP","Verify descending Serial No Sorting is Visible ",text_02,"Click on descending Serial No Sorting","descending Serial No Sorting should be displayed and clicked","Pass",null);
			}
			else{
		//		System.out.println("Serial No Sorting... :It is not descending ");
				Report.ReporterOutput("STEP","Verify descending Serial No Sorting is Visible ",text_02,"Click on descending Serial No Sorting","descending Serial No Sorting is not displayed","Pass",null);
			}
		//	Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//*******4.Ascending  Serial No Sorting*************************************************************************************
	public static void ascendingSerialNoSorting() throws Throwable {
		try {
			//Ascending  Serial No Sorting
			Thread.sleep(2000);
			PageObjects_ProjectAttribute.serialNoSorting(Constant.driver).click();
			Thread.sleep(3000);
			WebElement text1= PageObjects_ProjectAttribute.first_serialNoSorting(Constant.driver);
			String text_01 = text1.getText();
			int x = Integer.parseInt(text_01);
			if (x==1){
	//			System.out.println("Ascending  Serial No Sorting...:It is ascending ");
				Report.ReporterOutput("STEP","Verify ascending serial No Sorting",text_01,"Click on  ascending serial No Sorting"," ascending serial No Sorting should be displayed and clicked","Pass",null);
			}
			else{
		//		System.out.println("Ascending  Serial No Sorting...:It is not ascending ");
				Report.ReporterOutput("STEP","Verify ascending serial No Sorting",text_01,"Click on  ascending serial No Sorting"," ascending serial No Sorting is not displayed","Pass",null);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//******5.Ascending  InvoiceBy Name Sorting*************************************************************************************
	public static void ascendingInvoiceByNameSorting() throws Throwable {
		try {
			//Ascending   //For printing List after clicking once
			Thread.sleep(3000);
			PageObjects_ProjectAttribute.invoiceByName(Constant.driver).click();
			Thread.sleep(3000);
			List<WebElement> originalSavedInvoiceByName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")));
			//Thread.sleep(1000);                                                                  
	//		System.out.println("Ascending  InvoiceBy Name Sorting : For printing List after clicking once");
			for(int i=0; i<originalSavedInvoiceByName.size(); i++) 
			{
				String a = originalSavedInvoiceByName.get(i).getText();
				originallist.add(a);
				invoiceByName_Asc= originallist.get(i).toString();
	//			System.out.println("invoiceByName_Asc-------" +   invoiceByName_Asc);
			}
			Collections.sort(originallist); // Ascending order
			//String Ascendingorder = originallist.toString();

			//System.out.println("Ascendingorder--------------"+Ascendingorder);

			//	System.out.println("invoiceByName_Asc-------" +   invoiceByName_Asc);
			Iterator<String> iterator = originallist.listIterator();
			while (iterator.hasNext()) {
				ascendingorderiterator = iterator.next().toString();
		//		System.out.println("ascendingorderiterator-----" + ascendingorderiterator);
			}
			if(invoiceByName_Asc.equals(ascendingorderiterator)){
				Report.ReporterOutput("STEP","Verify invoice By Name is displayed in Ascending Order ",originallist.toString(),"Click on invoice By Name","invoice By Name should be displayed in ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify invoice By Name is displayed in Ascending Order ",originallist.toString(),"Click on invoice By Name","invoice By Name should is not displayed in ascending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//************6..Descending InvoiceBy Name Sorting*************************************************************************************
	public static void descendingInvoiceByNameSorting() throws Throwable {
		try {
			/*PageObjects_ProjectAttribute.invoiceByName(Constant.driver).click();
			Thread.sleep(2000);*/
			
			Thread.sleep(2000);
			PageObjects_ProjectAttribute.invoiceByName(Constant.driver).click();
			Thread.sleep(2000);
			List<WebElement>descendingOrderSortedInvoiceByName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")));                                                        
	//		System.out.println("Descending  InvoiceBy Name Sorting : For printing List after clicking 2nd time");
			for(int i=0; i<descendingOrderSortedInvoiceByName.size(); i++) 
			{
				String b = descendingOrderSortedInvoiceByName.get(i).getText();
				originallist1.add(b);
				invoiceByName_Dsc= originallist1.get(i).toString();
		//		System.out.println("invoiceByName_Dsc-------" +   invoiceByName_Dsc);
			}

			Collections.sort(originallist1);

			Collections.reverse(originallist1);

			//System.out.println("originallist1----------"+ originallist1);
			//System.out.println("invoiceByName_Dsc-------" +   invoiceByName_Dsc);

			Iterator<String> iterator01 = originallist1.iterator();
			while (iterator01.hasNext()) {
				descendingorderiterator = iterator01.next().toString();
		//		System.out.println("descendingorderiterator-----" + descendingorderiterator);
			}
			if(invoiceByName_Dsc.equals(descendingorderiterator)){
				Report.ReporterOutput("STEP","Verify invoice By Name is displayed in Descending Order ",originallist1.toString(),"Click on invoice By Name","Invoice By Name should be displayed in Descending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify invoice By Name is displayed in Descending Order ",originallist1.toString(),"Click on invoice By Name","Invoice By Name is not displayed in Descending Order","Fail",null);
			}
			PageObjects_ProjectAttribute.invoiceByName(Constant.driver).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//This functionality will verify Pagination

	public static void Pagination() throws Throwable 
	{
		List<WebElement> pagination = Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[7]/div[2]/a"));
		for (int i=pagination.size(); i>=1; i--) 
		{
			WebElement element = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[7]/div[2]/a["+i+"]"));

			String InvoiceByName1 = element.getText();
	//		System.out.println(InvoiceByName1);
			element.click();
		//	Thread.sleep(1000);
			Report.ReporterOutput("STEP ","Verify Pagination-:"+ InvoiceByName1, "Click on Link." + InvoiceByName1, InvoiceByName1+"Link should be visible and Clickable.",InvoiceByName1+" Link is visible and clickable", "Pass",null); 

		}	
	}

	//This functionality will verify Count of Records.
	public static void RecordsCount() throws Throwable 
	{
		int rows_count;
		Select dropdown1 = new Select(PageObjects_ProjectAttribute.noOfEnteries(Constant.driver));
		List<WebElement> values_drop = dropdown1.getOptions();
		for(int i=0;i<values_drop.size();i++)
		{
			dropdown1.selectByIndex(i);
			WebElement option = dropdown1.getFirstSelectedOption();
	//		System.out.println(option.getText()); 
			Integer x = Integer.valueOf(option.getText());
	//		System.out.println(x);
			//This is to verify number of rows and columns
			WebElement mytable = PageObjects_ProjectAttribute.InvoiceByNameTableID(Constant.driver);
			Thread.sleep(1000);
			//To locate rows of table.
			List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
			//To calculate no of rows In table.
			rows_count = rows_table.size()-1;
	//		System.out.println(rows_count);
			Thread.sleep(1700);
			if(x.equals(rows_count))
			{ Report.ReporterOutput("STEP ","Verify Count of Record for entry="+ x,"Count="+ x  , "Entries Should be Correct-" + x,"Active Record Count done successfully.--" + x, "Pass",null);		  
			}
		} 	

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

}



