package com.yash.RMS.TestAction.ResourceAttribute;

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
import com.yash.RMS.POM.ResourceAttribute.PageObjects_ResourceAttribute;

public class Action_Grade_PageValidation {

	public static String gradeName_Asc; 
	public static String  ascendingorderiterator; 
	public static String gradeName_Dsc;;      
	public static String  descendingorderiterator;
	public static String Asc;

	public static ArrayList<String> originallist = new ArrayList<String>();
	public static ArrayList<String> originallist1 = new ArrayList<String>();

	//******FOR NAVIGATION******************************************************************************************
	//Masterdata Link
	public static void grade_Navigation() throws Throwable {
		try {
			//Thread.sleep(4000);
			(Constant.driver).manage().window().maximize();
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

			//Grade Link
			Thread.sleep(2000);
			if (PageObjects_ResourceAttribute.grade_link(Constant.driver).isDisplayed()) {
				PageObjects_ResourceAttribute.grade_link(Constant.driver).click();

				//				INSERT HERE 
				PageObjects_ResourceAttribute.designation_buttonSearch(Constant.driver).clear();
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
	//********FOR GRade SERIAL NO SORTING*************************************************************************************
	//	Serial Serial No Sorting
	public static void gradePage_serialNoSorting() throws Throwable {
		Thread.sleep(1000);
		try {
			// need to send key adn then clear it and sleep some time
			PageObjects_ResourceAttribute.grade_buttonSearch(Constant.driver).sendKeys("a");
			//Thread.sleep(2000);
			PageObjects_ResourceAttribute.grade_buttonSearch(Constant.driver).clear();
			//Thread.sleep(2000);
			PageObjects_ResourceAttribute.grade_serialNoSorting(Constant.driver).click();
			if (PageObjects_ResourceAttribute.grade_serialNoSorting(Constant.driver).isDisplayed()) 
			{
				Report.ReporterOutput("STEP","Verify Grade Page Serial No Sorting is Visible ","Grade Page Serial No Sorting ","Click on Grade Page Serial No Sorting ","Grade Page Serial No Sorting displayed and clicked","Pass",null);
			} 
			else
			{
				Report.ReporterOutput("STEP","Verify Grade Page Serial No Sorting is Visible ","Grade Page Serial No Sorting ","Click on Grade Page Serial No Sorting ","Grade Page Serial No Sorting is not displayed","Fail",null);
			}
			//Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//********3.FOR Grade Descending  Serial No Sorting*************************************************************************************
	public static void gradePage_descendingSerialNoSorting() throws Throwable {
		try {
			//Descending  Serial No Sorting
		//	Thread.sleep(1000);		
			WebElement text2= PageObjects_ResourceAttribute.grade_first_serialNoSorting(Constant.driver);
			String text_02= text2.getText();
	//		System.out.println("Descending  Serial No Sorting...");
	//		System.out.println(text_02);
			int y = Integer.parseInt(text_02);
			if (y>1){
	//			System.out.println("Serial No Sorting.: It is descending ");
				Report.ReporterOutput("STEP","Verify Grade descending Serial No Sorting is Visible ",text_02,"Click on Grade descending Serial No Sorting","Grade descending Serial No Sorting should be displayed and clicked","Pass",null);
			}
			else{
	//			System.out.println("Serial No Sorting... :It is not descending ");
				Report.ReporterOutput("STEP","Verify Grade descending Serial No Sorting is Visible ",text_02,"Click on Grade descending Serial No Sorting","Grade descending Serial No Sorting is not displayed","Pass",null);
			}
			//Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//*******4.Grade Ascending  Serial No Sorting*************************************************************************************
	public static void gradePage_ascendingSerialNoSorting() throws Throwable {
		try {
			//Ascending  Serial No Sorting
			PageObjects_ResourceAttribute.grade_serialNoSorting(Constant.driver).click();
		//	Thread.sleep(2000);
			WebElement text1= PageObjects_ResourceAttribute.grade_first_serialNoSorting(Constant.driver);
			String text_01 = text1.getText();
			int x = Integer.parseInt(text_01);
			if (x==1){
	//			System.out.println("Ascending  Serial No Sorting...:It is ascending ");
				Report.ReporterOutput("STEP","Verify Grade Page ascending serial No Sorting",text_01,"Click on Grade Page ascending serial No Sorting","Grade Page ascending serial No Sorting should be displayed and clicked","Pass",null);
			}
			else{
	//			System.out.println("Ascending  Serial No Sorting...:It is not ascending ");
				Report.ReporterOutput("STEP","Verify Grade Page ascending serial No Sorting",text_01,"Click on Grade Page ascending serial No Sorting","Grade Page ascending serial No Sorting is not displayed","Pass",null);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//******5.Ascending Grade Name  Sorting*********************************************************************************************************************
	public static void gradePage_AscendingNameSorting() throws Throwable {
		try {
			//Ascending   //For printing List after clicking once
			PageObjects_ResourceAttribute.grade_nameSorting(Constant.driver).click();
			//Thread.sleep(2000);
			List<WebElement> originalSavedGradeName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")));
		//	Thread.sleep(1000);                                                                  
	//		System.out.println("Ascending  InvoiceBy Name Sorting : For printing List after clicking once");
			for(int i=0; i<originalSavedGradeName.size(); i++) 
			{
				String a = originalSavedGradeName.get(i).getText();
				originallist.add(a);
				gradeName_Asc= originallist.get(i).toString();
	//			System.out.println("gradeName_Asc-------" +   gradeName_Asc);
			}
			Collections.sort(originallist); // Ascending order
			//String Ascendingorder = originallist.toString();

			//System.out.println("Ascendingorder--------------"+Ascendingorder);

			//	System.out.println("gradeName_Asc-------" +   gradeName_Asc);
			Iterator<String> iterator = originallist.listIterator();
			while (iterator.hasNext()) {
				ascendingorderiterator = iterator.next().toString();
		//		System.out.println("ascendingorderiterator-----" + ascendingorderiterator);
			}
			if(gradeName_Asc.equals(ascendingorderiterator)){
				Report.ReporterOutput("STEP","Verify Grade Name is displayed in Ascending Order ",originallist.toString(),"Click on Grade Name","Grade Name should be displayed in ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Grade Name is displayed in Ascending Order ",originallist.toString(),"Click on Grade Name","Grade Name should is not displayed in ascending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//************6..Descending  Grade Name  Sorting*************************************************************************************
	public static void gradePage_DescendingNameSorting() throws Throwable {
		try {
			/*PageObjects_ProjectAttribute.invoiceByName(Constant.driver).click();
					Thread.sleep(2000);*/
			PageObjects_ResourceAttribute.grade_nameSorting(Constant.driver).click();
			//Thread.sleep(2000);

			List<WebElement>descendingOrderSortedGrade = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")));                                                        
	//		System.out.println("Descending  Grade Name Sorting : For printing List after clicking 2nd time");
			for(int i=0; i<descendingOrderSortedGrade.size(); i++) 
			{
				String b = descendingOrderSortedGrade.get(i).getText();
				originallist1.add(b);
				gradeName_Dsc= originallist1.get(i).toString();
	//			System.out.println("gradeName_Dsc-------" +   gradeName_Dsc);
			}

			Collections.sort(originallist1);
			Collections.reverse(originallist1);

			//System.out.println("originallist1----------"+ originallist1);
			//System.out.println("gradeName_Dsc-------" +   gradeName_Dsc);
			Iterator<String> iterator01 = originallist1.iterator();
			while (iterator01.hasNext()) {
				descendingorderiterator = iterator01.next().toString();
	//			System.out.println("descendingorderiterator-----" + descendingorderiterator);
			}
			if(gradeName_Dsc.equals(descendingorderiterator)){
				Report.ReporterOutput("STEP","Verify Grade Name is displayed in Descending Order ",originallist1.toString(),"Click on Grade Name","Grade Name should be displayed in Descending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Grade Name is displayed in Descending Order ",originallist1.toString(),"Click on Grade Name","Grade Name is not displayed in Descending Order","Fail",null);
			}
			PageObjects_ResourceAttribute.grade_nameSorting(Constant.driver).click();
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

			String GradeName1 = element.getText();
	//		System.out.println(GradeName1);
			element.click();
		//	Thread.sleep(500);
			Report.ReporterOutput("STEP ","Verify Pagination-:"+ GradeName1, "Click on Link." + GradeName1, GradeName1+"Link should be visible and Clickable.",GradeName1+" Link is visible and clickable", "Pass",null); 

		}	
	}

	//This functionality will verify Count of Records.
	public static void RecordsCount() throws Throwable 
	{
		int rows_count;
		Select dropdown1 = new Select(PageObjects_ResourceAttribute.grade_noOfEnteries(Constant.driver));
		List<WebElement> values_drop = dropdown1.getOptions();
		for(int i=0;i<values_drop.size();i++)
		{
			dropdown1.selectByIndex(i);
			WebElement option = dropdown1.getFirstSelectedOption();
	//		System.out.println(option.getText()); 
			Integer x = Integer.valueOf(option.getText());
	//		System.out.println(x);
			//This is to verify number of rows and columns
			WebElement mytable = PageObjects_ResourceAttribute.grade_EmployeeCategoryTableID(Constant.driver);
		//	Thread.sleep(500);
			//To locate rows of table.
			List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
			//To calculate no of rows In table.
			rows_count = rows_table.size()-1;
	//		System.out.println(rows_count);
			//Thread.sleep(1700);
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




	}}






