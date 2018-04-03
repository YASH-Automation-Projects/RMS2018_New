package com.yash.RMS.TestAction.Configurations;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Configurations.PageObjects_ConfigureMailSettings;

public class Action_ConfigureMailSettings {

	public static ArrayList<String> originallist = new ArrayList<String>();
	public static ArrayList<String> originallist1 = new ArrayList<String>();
	public static ArrayList<String> originallist2 = new ArrayList<String>();
	public static ArrayList<String> originallist3 = new ArrayList<String>();
	public static ArrayList<String> originallist4 = new ArrayList<String>();
	public static ArrayList<String> originallist5 = new ArrayList<String>();
	public static ArrayList<String> originallist6 = new ArrayList<String>();
	public static ArrayList<String> originallist7 = new ArrayList<String>();
	public static ArrayList<String> originallist8 = new ArrayList<String>();
	public static ArrayList<String> originallist9 = new ArrayList<String>();
	public static String CurrencyName_Asc;
	public static String ProjectID_Asc;
	public static String ascendingorderiterator;
	public static String CurrencyName_Dsc;
	public static String descendingorderiterator01;
	public static String ProjectID_Dsc;
	public static String ProjectName_Asc;
	public static String ascendingorderiterator2;
	public static String ProjectName_Dsc;
	public static String descendingorderiterator03;
	public static String descendingorderiterator5;
	public static String ProjectManager_Asc;
	public static String ascendingorderiterator6;
	public static String descendingorderiterator7;
	public static String ProjectManager_Dsc;
	public static String CustomerName_Dsc;
	public static String CustomerName_Asc;
	public static String ascendingorderiterator4;
	public static String KickoffDate_Asc;
	public static String ascendingorderiterator8;
	public static String ProjectKickoffDate_Dsc;
	public static String descendingorderiterator9;

	// ***********************************  Navigate on Configure Mail Settings *********************************************************************************************
	public static void ConfigureMailSettingsPageNavigation() throws Throwable{
		try {
			Thread.sleep(4000);
			//Verify and click on Configurations link 
			if(PageObjects_ConfigureMailSettings.link_Configurations(Constant.driver).isDisplayed()){
				PageObjects_ConfigureMailSettings.link_Configurations(Constant.driver).click();
				Thread.sleep(4000);
				Report.ReporterOutput("STEP","Configurations Link is displayed "," Configurations Link","Click on Configurations  Link","Configurations Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Configurations Link is displayed "," Configurations Link","Click on Configurations  Link","Configurations Link  is not displayed","Fail",null);
			}
			Thread.sleep(1000);
			//Verify and Click on Configure Mail Settings

			if (PageObjects_ConfigureMailSettings.link_ConfigureMailSettings(Constant.driver).isDisplayed()) {
				Thread.sleep(1000);
				PageObjects_ConfigureMailSettings.link_ConfigureMailSettings(Constant.driver).click();

				Report.ReporterOutput("STEP","Verify Configure Mail Settings link is displayed "," Configure Mail Settings ","Click on PConfigure Mail Settings Link","Configure Mail Settings Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Configure Mail Settings link is displayed "," Configure Mail Settings ","Click on Configure Mail Settings Link","Configure Mail Settings Link not displayed","Fail",null);
			}
			//Verify Text  Mail Configuration on the page
			Thread.sleep(4000);
			String Text_MailConfiguration = PageObjects_ConfigureMailSettings.Text_MailConfiguration(Constant.driver).getText();
			if (Text_MailConfiguration.equalsIgnoreCase("Mail Configuration")) {
				Report.ReporterOutput("STEP","Verify Mail Configuration is Visible ","Mail Configuration"," Text Mail Configuration is visible "," Text Mail Configuration is visible","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify Mail Configuration is Visible  ","Mail Configuration"," Text Mail Configuration is not visible "," Text Mail Configuration is not visible","Fail",null);
			}
			Thread.sleep(2000);

		}catch(Exception e){
			e.printStackTrace();
		}
	}

	//****** Ascending  Project ID Sorting*************************************************************************************
	public static void ascendingProjectIDSorting() throws Throwable {
		try {
			//Ascending   //For printing List after clicking once
			PageObjects_ConfigureMailSettings.Sorting_ProjectID(Constant.driver).click();
			Thread.sleep(2000);
			List<WebElement> originalSavedProjectID = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr/td[1]/a")));
			Thread.sleep(1000);                                                                  
			//	//System.out.println("Ascending  Project ID Sorting : For printing List after clicking once");
			for(int i=0; i<originalSavedProjectID.size(); i++) 
			{
				String a = originalSavedProjectID.get(i).getText();
				originallist.add(a);
				ProjectID_Asc = originallist.get(i).toString();
				//System.out.println("ProjectID_Asc-------" +   ProjectID_Asc);
			}
			Collections.sort(originallist); // Ascending order


			Iterator<String> iterator = originallist.listIterator();
			while (iterator.hasNext()) {
				ascendingorderiterator = iterator.next().toString();
				//	//System.out.println("ascendingorderiterator-----" + ascendingorderiterator);
			}
			if( ascendingorderiterator.equals(ProjectID_Asc)){
				Report.ReporterOutput("STEP","Verify Project ID is displayed in Ascending Order ",originallist.toString(),"Click on Project ID","Project ID should be displayed in ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Project ID is displayed in Ascending Order ",originallist.toString(),"Click on Project ID","Project ID should is not displayed in ascending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//************..Descending Project ID Sorting*************************************************************************************
	public static void descendingProjectIDSorting() throws Throwable {
		try {
			PageObjects_ConfigureMailSettings.Sorting_ProjectID(Constant.driver).click();
			Thread.sleep(2000);
			PageObjects_ConfigureMailSettings.Sorting_ProjectID(Constant.driver).click();
			//Thread.sleep(2000);
			List<WebElement>descendingOrderSortedProjectID = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr/td[1]/a")));                                                        
			//System.out.println("Descending  Project ID Sorting : For printing List after clicking 2nd time");
			for(int i=0; i<descendingOrderSortedProjectID.size(); i++) 
			{
				String b = descendingOrderSortedProjectID.get(i).getText();
				originallist1.add(b);
				ProjectID_Dsc= originallist1.get(i).toString();
				//		//System.out.println("ProjectID_Dsc-------" +   ProjectID_Dsc);
			}

			Collections.sort(originallist1);
			Collections.reverse(originallist1);


			Iterator<String> iterator01 = originallist1.iterator();
			while (iterator01.hasNext()) {
				descendingorderiterator01 = iterator01.next().toString();
				//		//System.out.println("descendingorderiterator01-----" + descendingorderiterator01);
			}
			if(descendingorderiterator01.equals( ProjectID_Dsc)){
				Report.ReporterOutput("STEP","Verify Project ID is displayed in Descending Order ",originallist1.toString(),"Click on Project ID","Project ID should be displayed in Descending Order","Pass",null);
			}else{
				Report.ReporterOutput("STEP","Verify Project ID is displayed in Descending Order ",originallist1.toString(),"Click on Project ID","Project ID is not displayed in Descending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//****** Ascending  Project Name Sorting*************************************************************************************
	public static void ascendingProjectNameSorting() throws Throwable {
		try {
			//Ascending   //For printing List after clicking once
			PageObjects_ConfigureMailSettings.Sorting_ProjectName(Constant.driver).click();
			Thread.sleep(2000);
		//	List<WebElement> originalSavedProjectName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr/td[2]")));
		//	List<WebElement> originalSavedProjectName = (Constant.driver.findElements(By.xpath(".//table/tbody/tr/td[2]")));
			List<WebElement> originalSavedProjectName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[8]/div[2]/table/tbody/tr/td[2]")));
			
			Thread.sleep(1000);                                                                  
			//System.out.println("Ascending  Project Name  Sorting : For printing List after clicking once");
			for(int i=0; i<originalSavedProjectName.size(); i++) 
			{
				String a = originalSavedProjectName.get(i).getText();
				originallist2.add(a);
				ProjectName_Asc = originallist2.get(i).toString();
			//	System.out.println("CurrencyName_Asc-------" +   CurrencyName_Asc);
			}
			Collections.sort(originallist2); // Ascending order

			Iterator<String> iterator = originallist2.listIterator();
			while (iterator.hasNext()) {
				ascendingorderiterator2 = iterator.next().toString();
			//	System.out.println("ascendingorderiterator-----" + ascendingorderiterator);
			}
			if(! ProjectName_Asc.equals(ascendingorderiterator2)){
				Report.ReporterOutput("STEP","Verify Project Name is displayed in Ascending Order ",originallist2.toString(),"Click on Project Name","Project Name should be displayed in ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Project Name is displayed in Ascending Order ",originallist2.toString(),"Click on Project Name","Project Name should is not displayed in ascending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//************************new************
	
	//************ Descending Project Name Sorting *************************************************************************************
		public static void descendingProjectNameSorting() throws Throwable {
			try {	
				//PageObjects_ProjectAttribute_Currency.Sorting_ProjectNamelist(Constant.driver).click();
				Thread.sleep(2000);
				PageObjects_ConfigureMailSettings.Sorting_ProjectName(Constant.driver).click();
				//Thread.sleep(2000);
			//	List<WebElement>descendingOrderSortedProjectName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr/td[2]")));                                                        
				
				
				List<WebElement>descendingOrderSortedProjectName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[8]/div[2]/table/tbody/tr/td[2]"))); 
				
				//System.out.println("Descending  Project Name Sorting : For printing List after clicking 2nd time");
				for(int i=0; i<descendingOrderSortedProjectName.size(); i++) 
				{
					String cc = descendingOrderSortedProjectName.get(i).getText();
					originallist3.add(cc);
					ProjectName_Dsc= originallist3.get(i).toString();
							//System.out.println("ProjectName_Dsc-------" +   ProjectName_Dsc);
				}

				/*Collections.sort(originallist3);
				Collections.reverse(originallist3);*/

				Collections.sort(originallist3, new Comparator<String>() {
					public int compare(String s1, String s2) {
						return -s1.compareToIgnoreCase(s2);
					}
				});
				

				Iterator<String> iterator01 = originallist3.iterator();
				while (iterator01.hasNext()) {
					descendingorderiterator03 = iterator01.next().toString();
						//System.out.println("descendingorderiterator03-----" + descendingorderiterator03);
				}
				if(ProjectName_Dsc.equals(descendingorderiterator03)){
					Report.ReporterOutput("STEP","Verify Project Name is displayed in Descending Order ",originallist3.toString(),"Click on Project Name","Project Name should be displayed in Descending Order","Pass",null);
				}else
				{
					Report.ReporterOutput("STEP","Verify Project Name is displayed in Descending Order ",originallist3.toString(),"Click on Project Name","Project Name is not displayed in Descending Order","Fail",null);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	
	
	//**********************new*************

	/*//************ Descending Project Name Sorting *************************************************************************************
	public static void descendingProjectNameSorting() throws Throwable {
		try {	
			//PageObjects_ProjectAttribute_Currency.Sorting_ProjectNamelist(Constant.driver).click();
			Thread.sleep(2000);
			PageObjects_ConfigureMailSettings.Sorting_ProjectName(Constant.driver).click();
			//Thread.sleep(2000);
	//		List<WebElement>descendingOrderSortedProjectName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr/td[2]")));                                                        
			
		//	List<WebElement>descendingOrderSortedProjectName = (Constant.driver.findElements(By.xpath(".//table/tbody/tr/td[2]")));
			
			List<WebElement>descendingOrderSortedProjectName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[8]/div[2]/table/tbody/tr/td[2]")));
			List<String> list = new ArrayList<String>();
			System.out.println("Descending  Project Name Size="+descendingOrderSortedProjectName.size());
			for(int i=1; i<=descendingOrderSortedProjectName.size(); i++) 
			{
				originallist3.add(Constant.driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div[1]/div[1]/div/div[8]/div[2]/table/tbody/tr["+i+"]/td[2]")).getText());
				String c = descendingOrderSortedProjectName.get(i).getText();
				originallist3.add(c);
				ProjectName_Dsc= originallist3.get(i).toString();
				//System.out.println("ProjectName_Dsc-------" +   ProjectName_Dsc);
			}

			Collections.sort(originallist3);
			Collections.reverse(originallist3);

			Collections.sort(originallist3, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return -s1.compareToIgnoreCase(s2);
				}
			});


			Iterator<String> iterator01 = originallist3.iterator();
			while (iterator01.hasNext()) {
				descendingorderiterator03 = iterator01.next().toString();
				//System.out.println("descendingorderiterator03-----" + descendingorderiterator03);
			}
			//if(ProjectName_Dsc.equals(descendingorderiterator03)){
			if(originallist3.equals(descendingorderiterator03)){
				Report.ReporterOutput("STEP","Verify Project Name is displayed in Descending Order ",originallist3.toString(),"Click on Project Name","Project Name should be displayed in Descending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Project Name is displayed in Descending Order ",originallist3.toString(),"Click on Project Name","Project Name is not displayed in Descending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} */
	//****** Ascending  Customer Name Sorting*************************************************************************************
	public static void ascendingCustomerNameSorting() throws Throwable {
		try {
			//Ascending   //For printing List after clicking once
			PageObjects_ConfigureMailSettings.Sorting_CustomerName(Constant.driver).click();
			Thread.sleep(2000);
	//		List<WebElement> originalSavedCustomerName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr/td[3]")));
			
			
	//		List<WebElement> originalSavedCustomerName = (Constant.driver.findElements(By.xpath(".//table/tbody/tr/td[3]")));
			List<WebElement> originalSavedCustomerName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[8]/div[2]/table/tbody/tr/td[3]")));
			
			
			Thread.sleep(1000);                                                                  
			//System.out.println("Ascending  CustomerName  Sorting : For printing List after clicking once");
			for(int i=0; i<originalSavedCustomerName.size(); i++) 
			{
				String d = originalSavedCustomerName.get(i).getText();
				originallist4.add(d);
				CustomerName_Asc = originallist4.get(i).toString();
				////System.out.println("CurrencyName_Asc-------" +   CurrencyName_Asc);
			}
			Collections.sort(originallist4); // Ascending order

			Iterator<String> iterator = originallist4.listIterator();
			while (iterator.hasNext()) {
				ascendingorderiterator4 = iterator.next().toString();
				////System.out.println("ascendingorderiterator-----" + ascendingorderiterator);
			}
			if(CustomerName_Asc.equals(ascendingorderiterator4)){
				Report.ReporterOutput("STEP","Verify Customer Name is displayed in Ascending Order ",originallist4.toString(),"Click on Customer Name","Customer Name should be displayed in ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Customer Name is displayed in Ascending Order ",originallist4.toString(),"Click on Customer Name","Customer Name should is not displayed in ascending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

/*	//************ Descending Customer Name Sorting *************************************************************************************
	public static void descendingCustomerNameSorting() throws Throwable {
		try {	

			Thread.sleep(2000);
			PageObjects_ConfigureMailSettings.Sorting_CustomerName(Constant.driver).click();
			List<WebElement> descendingOrderSortedCustomerName = Constant.driver.findElements(By.xpath("html/body/div/div[1]/div[2]/div[1]/div[1]/div/div[8]/div[2]/table/tbody/tr")); 
			for(int i=0; i<descendingOrderSortedCustomerName.size(); i++) {
				originallist5.add(Constant.driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div[1]/div[1]/div/div[8]/div[2]/table/tbody/tr["+i+"]/td[3]")).getText());
				String e = descendingOrderSortedCustomerName.get(i).getText();
				originallist5.add(e);
				CustomerName_Dsc= originallist5.get(i).toString();
				//System.out.println("CustomerName_Dsc-------" +   CustomerName_Dsc);
				 * 
			}



			Collections.sort(originallist5, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return -s1.compareToIgnoreCase(s2);
				}
			});


			Iterator<String> iterator01 = originallist5.iterator();
			while (iterator01.hasNext()) {
				descendingorderiterator5 = iterator01.next().toString();
				//System.out.println("descendingorderiterator03-----" + descendingorderiterator5);
			}
			if(CustomerName_Dsc.equals(descendingorderiterator5)){
				Report.ReporterOutput("STEP","Verify Customer Name is displayed in Descending Order ",originallist5.toString(),"Click on Customer Name","Customer Name should be displayed in Descending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Customer Name is displayed in Descending Order ",originallist5.toString(),"Click on Customer Name","Customer Name is not displayed in Descending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/

	//**********************new****************
	
	//************ Descending Customer Name Sorting *************************************************************************************
			public static void descendingCustomerNameSorting() throws Throwable {
				try {	
					
					Thread.sleep(2000);
					PageObjects_ConfigureMailSettings.Sorting_CustomerName(Constant.driver).click();
					Thread.sleep(2000);
				//	List<WebElement>descendingOrderSortedCustomerName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr/td[3]")));                                                        
					
					List<WebElement>descendingOrderSortedCustomerName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[8]/div[2]/table/tbody/tr/td[3]"))); 
					Thread.sleep(2000);
					//System.out.println("Descending  Project Name Sorting : For printing List after clicking 2nd time");
					for(int i=0; i<descendingOrderSortedCustomerName.size(); i++) 
					{
						String ee = descendingOrderSortedCustomerName.get(i).getText();
						originallist5.add(ee);
						CustomerName_Dsc= originallist5.get(i).toString();
								//System.out.println("CustomerName_Dsc-------" +   CustomerName_Dsc);
					}

				
					Collections.sort(originallist5, new Comparator<String>() {
						public int compare(String s1, String s2) {
							return -s1.compareToIgnoreCase(s2);
						}
					});
					

					Iterator<String> iterator01 = originallist5.iterator();
					while (iterator01.hasNext()) {
						descendingorderiterator5 = iterator01.next().toString();
							//System.out.println("descendingorderiterator03-----" + descendingorderiterator5);
					}
					if(CustomerName_Dsc.equals(descendingorderiterator5)){
						Report.ReporterOutput("STEP","Verify Customer Name is displayed in Descending Order ",originallist5.toString(),"Click on Customer Name","Customer Name should be displayed in Descending Order","Pass",null);
					}else
					{
						Report.ReporterOutput("STEP","Verify Customer Name is displayed in Descending Order ",originallist5.toString(),"Click on Customer Name","Customer Name is not displayed in Descending Order","Fail",null);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
	
	
	
	//****************New*******************
	
	
	
	
	//****** Ascending  Project Manager Sorting*************************************************************************************
	public static void ascendingProjectManagerSorting() throws Throwable {
		try {
			//Ascending   //For printing List after clicking once
			PageObjects_ConfigureMailSettings.Sorting_ProjectManager(Constant.driver).click();
			Thread.sleep(2000);
		//	List<WebElement> originalSavedProjectManager = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr/td[4]")));
			
	//		List<WebElement> originalSavedProjectManager = (Constant.driver.findElements(By.xpath(".//table/tbody/tr/td[4]")));
			List<WebElement> originalSavedProjectManager = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[8]/div[2]/table/tbody/tr/td[4]")));
			Thread.sleep(1000);                                                                  
			//System.out.println("Ascending  Project Manager  Sorting : For printing List after clicking once");
			for(int i=0; i<originalSavedProjectManager.size(); i++) 
			{
				String f = originalSavedProjectManager.get(i).getText();
				originallist6.add(f);
				ProjectManager_Asc = originallist6.get(i).toString();
			//	System.out.println("ProjectManager_Asc-------" +   ProjectManager_Asc);
			}
			Collections.sort(originallist6);
			Collections.reverse(originallist6);// Ascending order

			Iterator<String> iterator6 = originallist6.iterator();
			while (iterator6.hasNext()) {
				ascendingorderiterator6 = iterator6.next().toString();
			//	System.out.println("ascendingorderiterator-----" + ascendingorderiterator6);
			}
			if(!ProjectManager_Asc.equals(ascendingorderiterator6)){
				Report.ReporterOutput("STEP","Verify Project Manager is displayed in Ascending Order ",originallist6.toString(),"Click on Project Manager","Project Manager should be displayed in ascending Order","Pass",null);
			}
			else
			{
				Report.ReporterOutput("STEP","Verify Project Manager is displayed in Ascending Order ",originallist6.toString(),"Click on Project Manager","Project Manager should is not displayed in ascending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//************ Descending Project Manager Sorting *************************************************************************************
	public static void descendingProjectManagerSorting() throws Throwable {
		try {	

			Thread.sleep(2000);
			PageObjects_ConfigureMailSettings.Sorting_ProjectManager(Constant.driver).click();
			//Thread.sleep(2000);
	//		List<WebElement>descendingOrderSortedProjectManager = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr/td[4]")));                                                        
			List<WebElement>descendingOrderSortedProjectManager = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[8]/div[2]/table/tbody/tr/td[4]")));
	//		List<WebElement>descendingOrderSortedProjectManager = (Constant.driver.findElements(By.xpath(".//table/tbody/tr/td[4]")));
			//System.out.println("Descending  Project Manager Sorting : For printing List after clicking 2nd time");
			for(int i=0; i<descendingOrderSortedProjectManager.size(); i++) 
			{
				String g = descendingOrderSortedProjectManager.get(i).getText();
				originallist7.add(g);
				ProjectManager_Dsc= originallist7.get(i).toString();
				//System.out.println("ProjectManager_Dsc-------" +   ProjectManager_Dsc);
			}



			Collections.sort(originallist7, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return -s1.compareToIgnoreCase(s2);
				}
			});


			Iterator<String> iterator01 = originallist7.iterator();
			while (iterator01.hasNext()) {
				descendingorderiterator7 = iterator01.next().toString();
				//System.out.println("descendingorderiterator7-----" + descendingorderiterator7);
			}
			if(! ProjectManager_Dsc.equals(descendingorderiterator7)){
				Report.ReporterOutput("STEP","Verify Project Manager is displayed in Descending Order ",originallist7.toString(),"Click on Project Manager","Project Manager should be displayed in Descending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Project Manager is displayed in Descending Order ",originallist7.toString(),"Click on Project Manager","Project Manager is not displayed in Descending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//****** Ascending  Project Kick off Date Sorting*************************************************************************************
	public static void ascendingProjectKickoffDateSorting() throws Throwable {
		try {
			//Ascending   //For printing List after clicking once
			PageObjects_ConfigureMailSettings.Sorting_ProjectKickoffDate(Constant.driver).click();
			Thread.sleep(2000);
	//		List<WebElement> originalSavedProjectKickoffDate = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr/td[5]")));
			
			List<WebElement>originalSavedProjectKickoffDate = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[8]/div[2]/table/tbody/tr/td[5]")));	
	//		List<WebElement> originalSavedProjectKickoffDate = (Constant.driver.findElements(By.xpath(".//table/tbody/tr/td[5]")));
			Thread.sleep(1000);                                                                  
			//System.out.println("Ascending  Project Kick off Date  Sorting : For printing List after clicking once");
			for(int i=0; i<originalSavedProjectKickoffDate.size(); i++) 
			{
				String h = originalSavedProjectKickoffDate.get(i).getText();
				originallist8.add(h);
				KickoffDate_Asc = originallist8.get(i).toString();
				////System.out.println("CurrencyName_Asc-------" +   CurrencyName_Asc);
			}
			Collections.sort(originallist8); // Ascending order

			Iterator<String> iterator = originallist8.listIterator();
			while (iterator.hasNext()) {
				ascendingorderiterator8 = iterator.next().toString();
				////System.out.println("ascendingorderiterator-----" + ascendingorderiterator);
			}
			if(KickoffDate_Asc.equals(ascendingorderiterator8)){
				Report.ReporterOutput("STEP","Verify Project Kick off Date is displayed in Ascending Order ",originallist8.toString(),"Click on Project Kick off Date","Project Kick off Date should be displayed in ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Project Kick off Date is displayed in Ascending Order ",originallist8.toString(),"Click on Project Kick off Date","Project Kick off Date should is not displayed in ascending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//************ Descending Project Kick off Date Sorting *************************************************************************************
	public static void descendingProjectKickoffDateSorting() throws Throwable {
		try {	

			Thread.sleep(2000);
			PageObjects_ConfigureMailSettings.Sorting_ProjectKickoffDate(Constant.driver).click();

	//		List<WebElement>descendingOrderSortedProjectKickoffDate = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr/td[4]")));                                                        

//			List<WebElement>descendingOrderSortedProjectKickoffDate = (Constant.driver.findElements(By.xpath(".//table/tbody/tr/td[5]")));
			List<WebElement>descendingOrderSortedProjectKickoffDate = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[8]/div[2]/table/tbody/tr/td[5]")));
			for(int i=0; i<descendingOrderSortedProjectKickoffDate.size(); i++) 
			{
				String gg = descendingOrderSortedProjectKickoffDate.get(i).getText();
				originallist9.add(gg);
				ProjectKickoffDate_Dsc= originallist9.get(i).toString();
				//System.out.println("ProjectKickoffDate_Dsc-------" +   ProjectKickoffDate_Dsc);
			}

			Collections.sort(originallist9, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return -s1.compareToIgnoreCase(s2);
				}
			});

			Iterator<String> iterator01 = originallist9.iterator();
			while (iterator01.hasNext()) {
				descendingorderiterator9 = iterator01.next().toString();
				//System.out.println("descendingorderiterator9-----" + descendingorderiterator9);
			}
			if(ProjectKickoffDate_Dsc.equals(descendingorderiterator9)){
				Report.ReporterOutput("STEP","Verify Project Kick off Date is displayed in Descending Order ",originallist9.toString(),"Click on Project Kick off Date","Project Kick off Date should be displayed in Descending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Project Kick off Date is displayed in Descending Order ",originallist9.toString(),"Click on Project Kick off Date","Project Kick off Date is not displayed in Descending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	//************************  Search 	Project **************************************************************

	public static void search_ProjectID(String projectToSearch) throws Throwable {
		try{
			Thread.sleep(2000);

			if (PageObjects_ConfigureMailSettings.textbox_Search(Constant.driver).isDisplayed()){
				PageObjects_ConfigureMailSettings.textbox_Search(Constant.driver).click();
				Thread.sleep(1000);
				System.out.println(projectToSearch);
				PageObjects_ConfigureMailSettings.textbox_Search(Constant.driver).sendKeys(projectToSearch);
				Report.ReporterOutput("STEP", "Verify search Box is Displayed", projectToSearch , "Click on search Box", "search Box should be displayed and clicked", "Pass", null);
			}
			else {
				Report.ReporterOutput("STEP", "Verify search Box is Displayed", projectToSearch , "Click on search Box", "search Box should be displayed and clicked", "Fail", null);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	//************************************ Assign Privileges by click on check box *******************************************************

	//	public static void getCheckboxValueFrmExcel() throws IOException, Throwable {
	public static void AssignPrivilegesToRole() throws IOException, Throwable {
		PageObjects_ConfigureMailSettings.Searched_ProjectID(Constant.driver).click();

		FileInputStream ObjExcelApp = new FileInputStream(Constant.logintestdata);

		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet sheet = wb.getSheet("ConfigureMailSettings");

		for (int sheetrow = 2; sheetrow <= 10; sheetrow++) 
		{
			for(int cellNum=1;cellNum<sheet.getRow(sheetrow).getLastCellNum();cellNum++){
				if(sheet.getRow(sheetrow).getCell(cellNum).getStringCellValue().equalsIgnoreCase("Y")){
					Thread.sleep(1000);

					if ( Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/table/tbody/tr["+sheetrow+"-1]/td["+cellNum+"+1]/input")).isSelected() )
					{
						Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/table/tbody/tr["+sheetrow+"-1]/td["+cellNum+"+1]/input")).click();
					}
					Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/table/tbody/tr["+sheetrow+"-1]/td["+cellNum+"+1]/input")).click();
				}
			} 
		}
		Thread.sleep(2000);
		if(PageObjects_ConfigureMailSettings.link_Save(Constant.driver).isDisplayed()){
			Thread.sleep(2000);
			PageObjects_ConfigureMailSettings.link_Save(Constant.driver).click();

			Report.ReporterOutput("STEP", "Verify save button for Configure Mail Settings is Displayed", "save button for Configure Mail Settings", "Click on save button for Configure Mail Settings", "save button for Configure Mail Settings should be displayed and clicked", "Pass", null);
		}
		else {
			Report.ReporterOutput("STEP", "Verify save button for Configure Mail Settings is Displayed", "save button for Configure Mail Settings", "Click on save button for Configure Mail Settings", "save button for Configure Mail Settings is not displayed", "Fail", null);
		}

		// Thread.sleep(1500);
		String successMsg=Constant.driver.findElement(By.xpath(".//*[@id='toast-container']/div/div[2]")).getText();
		// 	 String successMsg=Constant.driver.findElement(By.xpath("//div[contains(.,'Success.')]")).getText();
		System.out.println("Second---"+successMsg);

		if (successMsg.contains("success")) {
			Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ",successMsg,"Click on save Confirmation Msg","save Confirmation Msg displayed and clicked","Pass",null);
		}
		else {
			Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ",successMsg,"Click on save Confirmation Msg","save Confirmation Msg is not displayed","Fail",null);
		}
	}
}/**EOC-Class********************************************************************************/
