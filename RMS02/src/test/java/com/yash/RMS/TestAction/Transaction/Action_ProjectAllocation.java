package com.yash.RMS.TestAction.Transaction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Transaction.PageObjects_ProjectAllocation;
//import com.yash.RMS.POM.Transaction.PageObjects_ProjectAllocation;

public class Action_ProjectAllocation {

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
	public static ArrayList<String> originallist10 = new ArrayList<String>();
	public static ArrayList<String> originallist11 = new ArrayList<String>();
	

	public static void ProjectAllocationPageNavigation() throws Throwable {

		if (PageObjects_ProjectAllocation.Link_Transaction(Constant.driver).isDisplayed())

		{
			System.out.println("Transaction link is Displayed");
			PageObjects_ProjectAllocation.Link_Transaction(Constant.driver).click();
			Report.ReporterOutput("STEP", "Transaction Link is displayed. "," Transaction Link.", "Click on Transaction  Link.",	"Transaction Link should be displayed and clicked.","Pass", null);
			
			Thread.sleep(4000);
			
		} else

		{

			Report.ReporterOutput("STEP", "Transaction Link is displayed. ",
					" Transaction Link.", "Click on Transaction  Link.",
					"Transaction Link  is not displayed.", "Fail", null);
			
			System.out.println("Transaction link is not displayed ");
			
		}

		if (PageObjects_ProjectAllocation.Link_ProjectAllocation(
				Constant.driver).isDisplayed())

		{

			Report.ReporterOutput("STEP",	"Verify Project Allocation link is displayed ."," Project Allocation. ","Click on Project Allocation Link.","Project Allocation Link should be displayed and clicked.","Pass", null);
		
			
			System.out.println("Project allocation Link is Displayed");
			PageObjects_ProjectAllocation.Link_ProjectAllocation(
					Constant.driver).click();
			Thread.sleep(4000);
			System.out.println("User is on Project Allocation Page");
		} else

		{
			Report.ReporterOutput("STEP",
					"Verify Project Allocation link is displayed. ",
					" Project Allocation. ",
					"Click on Project Allocation Link.",
					"Project Allocation Link not displayed.", "Fail", null);
			
			System.out.println("Project allocation Link is not displayed ");

		}
	}

	// *********************************************************************Ascending
	// Project Name*************
	public static void ascendingProjectNameSorting() throws Throwable {

		try {

			// Ascending //For printing List after clicking once
			PageObjects_ProjectAllocation.Sorting_ProjectName(
					Constant.driver).click();
			Thread.sleep(2000);
			List<WebElement> originalProjectName = (Constant.driver
					.findElements(By
							.xpath(".//*[@id='projectallocationTableId']/tbody/tr/td[2]")));
			ArrayList<String> ProjectNameAsc = new ArrayList<String>();
			Thread.sleep(1000);

			for (int i = 0; i < originalProjectName.size(); i++) {
				String c = originalProjectName.get(i).getText().toString();

				ProjectNameAsc.add(c);

				originallist.add(c);

				System.out.println(c);
			}

			final class SortIgnoreCase implements Comparator<Object> {
				public int compare(Object o1, Object o2) {
					String s1 = (String) o1;
					String s2 = (String) o2;
					return s1.toLowerCase().compareTo(s2.toLowerCase());
				}

			}
			Collections.sort(originallist, new SortIgnoreCase());

			boolean flag = true;

			for (int counter = 0; counter < ProjectNameAsc.size(); counter++) {
				
				if (originallist.get(counter).equals(
						ProjectNameAsc.get(counter))) {
				} else {
					flag = false;
				}
			}

			if (flag) {
				
				Report.ReporterOutput("STEP","Verify Project Name is displayed in Ascending Order. ",originallist.toString(),"Click on Project Name.","Project Name is displaying in ascending Order successfully.","Pass",null);
				
				
				
				System.out.println("list same");
			} else {
				
				
				Report.ReporterOutput("STEP","Verify Project Name is displayed in Ascending Order. ",originallist.toString(),"Click on Project Name.","Project Name  not displayed in ascending Order successfully.","Fail",null);
				
				
				System.out.println("list error");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ************..Descending Project Name
	// Sorting*************************************************************************************
	public static void descendingProjectNameSorting() throws Throwable {
		try {

			Thread.sleep(2000);
			PageObjects_ProjectAllocation.Sorting_ProjectName(
					Constant.driver).click();
			Thread.sleep(1000);
			List<WebElement> descendingOrderSortedProjectName = (Constant.driver
					.findElements(By
							.xpath(".//*[@id='projectallocationTableId']/tbody/tr/td[2]")));
			ArrayList<String> ProjectNameDsc = new ArrayList<String>();

			for (int i = 0; i < descendingOrderSortedProjectName.size(); i++) {
				String b = descendingOrderSortedProjectName.get(i).getText()
						.toString();
				originallist1.add(b);
				ProjectNameDsc.add(b);
			}

			final class SortIgnoreCase implements Comparator<Object> {
				public int compare(Object o1, Object o2) {
					String s1 = (String) o1;
					String s2 = (String) o2;
					return s1.toLowerCase().compareTo(s2.toLowerCase());
				}

			}
			
			
			Collections.sort(originallist1, new SortIgnoreCase());
			Collections.reverse(originallist1);
			boolean flag = true;
			
			for (int counter = 0; counter < ProjectNameDsc.size(); counter++) {
				
				if (originallist1.get(counter).equals(
						ProjectNameDsc.get(counter))) {
				} else {
					flag = false;
				}
			}
			
			if (flag) {
				
				Report.ReporterOutput("STEP","Verify Project Name is displayed in Decending Order. ",originallist1.toString(),"Click on Project Name.","Project Name is displaying in Decending Order successfully.","Pass",null);
				
				
				
				System.out.println("list same");
			} else {
				
				
				Report.ReporterOutput("STEP","Verify Project Name is displayed in Decending Order. ",originallist1.toString(),"Click on Project Name.","Project Name  not displayed in Decending Order successfully.","Fail",null);
				
				
				System.out.println("list error");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ****** Ascending Customer Name
	// Sorting*************************************************************************************
	public static void ascendingCustomerNameSorting() throws Throwable {
		try {
			Thread.sleep(2000);
			PageObjects_ProjectAllocation.Sorting_CustomerName(
					Constant.driver).click();
			Thread.sleep(2000);
			List<WebElement> ascendingorderSortedCustomerName = (Constant.driver
					.findElements(By
							.xpath(".//*[@id='projectallocationTableId']/tbody/tr/td[3]")));
			ArrayList<String> customerNameAsc = new ArrayList<String>();
			for (int i = 0; i < ascendingorderSortedCustomerName.size(); i++) {
				String c = ascendingorderSortedCustomerName.get(i).getText()
						.toString();

				customerNameAsc.add(c);

				originallist2.add(c);

				System.out.println(c);
			}

			final class SortIgnoreCase implements Comparator<Object> {
				public int compare(Object o1, Object o2) {
					String s1 = (String) o1;
					String s2 = (String) o2;
					return s1.toLowerCase().compareTo(s2.toLowerCase());
				}

			}
			Collections.sort(originallist2, new SortIgnoreCase());
			boolean flag = true;
			// originallist2.s

			for (int counter = 0; counter < customerNameAsc.size(); counter++) {

				
				  if
				  (originallist2.get(counter).equals(customerNameAsc.get(counter ))) {
				  
				  
				  } else { flag = false; }
				 
			}

			if (flag) {
				
				Report.ReporterOutput("STEP","Verify Customer Name is displayed in Ascending Order. ",originallist2.toString(),"Click on Customer Name.","Customer Name is displaying in ascending Order successfully.","Pass",null);
				
				System.out.println("list same");
			} else {
				
				Report.ReporterOutput("STEP","Verify Customer Name is displayed in Ascending Order .",originallist2.toString(),"Click on Customer Name.","Customer Name should is not displayed in ascending Order.","Fail",null);
				
				System.out.println("list error");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//************ Descending Customer Name Sorting*************************************************************************************
		public static void descendingCustomerNameSorting() throws Throwable{
			try{
				Thread.sleep(2000);
				PageObjects_ProjectAllocation.Sorting_CustomerName(Constant.driver).click();
				Thread.sleep(2000);
				List<WebElement> descendingOrderSortedProjectName = (Constant.driver.findElements(By.xpath(".//*[@id='projectallocationTableId']/tbody/tr/td[3]")));
				ArrayList<String> customerNamedsc = new ArrayList<String>();
				for(int i=0; i<descendingOrderSortedProjectName.size(); i++)
				{
					String d=descendingOrderSortedProjectName.get(i).getText().toString();
					originallist3.add(d);
					customerNamedsc.add(d);
					
				}
				
				final class SortIgnoreCase implements Comparator<Object> {
					public int compare(Object o1, Object o2) {
						String s1 = (String) o1;
						String s2 = (String) o2;
						return s1.toLowerCase().compareTo(s2.toLowerCase());
					}
				}
				
				
				Collections.sort(originallist3,new SortIgnoreCase());
				
				Collections.reverse(originallist3);
				
				boolean flag = true;
				for (int counter = 0; counter < customerNamedsc.size(); counter++) {

					
					  if
					  (originallist3.get(counter).equals(customerNamedsc.get(counter ))) {
					  
					  
					  } else { flag = false; }
					 
				}
			
				if(flag){
					Report.ReporterOutput("STEP","Verify Customer Name is displayed in Descending Order. ",originallist3.toString(),"Click on Customer Name.","Customer Name is displaying in Descending Order successfully.","Pass",null);
				}else{
					Report.ReporterOutput("STEP","Verify Customer Name is displayed in Descending Order .",originallist3.toString(),"Click on Customer Name.","Customer Name is not displayed in Descending Order.","Fail",null);
				}



			}catch(Exception e){
				e.printStackTrace();
			}

		}

		//************ ascending OffshoreManager Sorting*************************************************************************************

		public static void ascendingOffshoreManagerSorting() throws Throwable{
			try{
				Thread.sleep(2000);
				PageObjects_ProjectAllocation.Sorting_OffshoreManager(Constant.driver).click();
				Thread.sleep(2000);
				List<WebElement> ascendingorderSortedOffshoreManager = (Constant.driver.findElements(By.xpath(".//*[@id='projectallocationTableId']/tbody/tr/td[4]")));
				ArrayList<String> OffShoreManagerAsc = new ArrayList<String>();
				
				Thread.sleep(1000);           
				
				//		System.out.println("Ascending  Offshore Manager Sorting : For printing List after clicking once");
				for (int i=0;i<ascendingorderSortedOffshoreManager.size();i++)
				{
					String e=ascendingorderSortedOffshoreManager.get(i).getText().toString();
					originallist4.add(e);
					OffShoreManagerAsc.add(e);
				}
				
				
				final class SortIgnoreCase implements Comparator<Object> {
					public int compare(Object o1, Object o2) {
						String s1 = (String) o1;
						String s2 = (String) o2;
						return s1.toLowerCase().compareTo(s2.toLowerCase());
					}
				}
				Collections.sort(originallist4, new SortIgnoreCase()); // Ascending order
				boolean flag = true;
				for (int counter = 0; counter < OffShoreManagerAsc.size(); counter++) {

					
					  if
					  (originallist4.get(counter).equals(OffShoreManagerAsc.get(counter ))) {
					  
					  
					  } else { flag = false; }
					 
				}



				
				if (flag){
					Report.ReporterOutput("STEP","Verify Offshore Manager is displayed in ascending Order .",originallist4.toString(),"Click on Offshore Manager.","Offshore Manager is displaying in ascending Order successfully.","Pass",null);
				}else
				{
					Report.ReporterOutput("STEP","Verify Offshore Manager is displayed in Ascending Order.",originallist4.toString(),"Click on Offshore Manager.","Offshore Manager  is not displayed in ascending Order.","Fail",null);
				}



			}catch(Exception e){
				e.printStackTrace();
			}


		}

		//************ Descending Offshore Manager Sorting*************************************************************************************

		public static void descendingOffshoreManagerSorting() throws Throwable{
			try{
				Thread.sleep(2000);
				PageObjects_ProjectAllocation.Sorting_OffshoreManager(Constant.driver).click();
				Thread.sleep(2000);
				List<WebElement> descendingOrderSortedOffshoreManager = (Constant.driver.findElements(By.xpath(".//*[@id='projectallocationTableId']/tbody/tr/td[4]"))); 
				Thread.sleep(1000);
				
				ArrayList<String> OffShoreManagerdsc = new ArrayList<String>();
				
				for (int i=0;i<descendingOrderSortedOffshoreManager.size();i++)
				{
					String f= descendingOrderSortedOffshoreManager.get(i).getText().toString();
					originallist5.add(f);
					OffShoreManagerdsc.add(f);

				}
				final class SortIgnoreCase implements Comparator<Object> {
					public int compare(Object o1, Object o2) {
						String s1 = (String) o1;
						String s2 = (String) o2;
						return s1.toLowerCase().compareTo(s2.toLowerCase());
					}
				}
				Collections.sort(originallist5, new SortIgnoreCase());
				
				Collections.reverse(originallist5);

				boolean flag = true;
				for (int counter = 0; counter < OffShoreManagerdsc.size(); counter++) {

					
					  if
					  (originallist5.get(counter).equals(OffShoreManagerdsc.get(counter ))) {
					  
					  
					  } else { flag = false; }
					 
				}
				
				if (flag){
					Report.ReporterOutput("STEP","Verify Offshore Manager is displayed in Descending Order. ",originallist5.toString(),"Click on Offshore Manager.","Offshore Manager is displaying in Descending Order successfully.","Pass",null);
				}else{
					Report.ReporterOutput("STEP","Verify Offshore Manager is displayed in Descending Order. ",originallist5.toString(),"Click on Offshore Manager.","Offshore Manager is not displayed in Descending Order.","Fail",null);
				}


			}catch(Exception e){
				e.printStackTrace();
			}
		}

		//****** Ascending  Onsite Manager Sorting*************************************************************************************

		public static void ascendingOnsiteManagerSorting() throws Throwable{
			try{
				Thread.sleep(2000);
				PageObjects_ProjectAllocation.Sorting_OnsiteManager(Constant.driver).click();
				Thread.sleep(2000);
				List<WebElement> ascendingorderSortedOnsiteManager = (Constant.driver.findElements(By.xpath(".//*[@id='projectallocationTableId']/tbody/tr/td[5]")));
				ArrayList<String> OnSiteManagerAsc = new ArrayList<String>();
				for (int i=0; i<ascendingorderSortedOnsiteManager.size(); i++)
				{
					String g= ascendingorderSortedOnsiteManager.get(i).getText();
					originallist6.add(g);
					OnSiteManagerAsc.add(g);
				}
				final class SortIgnoreCase implements Comparator<Object> {
					public int compare(Object o1, Object o2) {
						String s1 = (String) o1;
						String s2 = (String) o2;
						return s1.toLowerCase().compareTo(s2.toLowerCase());
					}
				}
				Collections.sort(originallist6, new SortIgnoreCase());
				
			
				boolean flag = true;
				for (int counter = 0; counter <OnSiteManagerAsc .size(); counter++) {

					
					  if
					  (originallist6.get(counter).equals(OnSiteManagerAsc.get(counter ))) {
					  
					  
					  } else { flag = false; }
					 
				}
				
				if (flag){
					Report.ReporterOutput("STEP","Verify OnSite Manager is displayed in Ascending Order. ",originallist6.toString(),"Click on OnSite Manager.","OnSite Manager is displaying in Ascending Order successfully.","Pass",null);
				}else{
					Report.ReporterOutput("STEP","Verify OnSite Manager is displayed in Ascending Order. ",originallist6.toString(),"Click on OnSite Manager.","OnSite Manager is not displayed in Ascending Order.","Fail",null);
				}



			}catch(Exception e){
				e.printStackTrace();
			}
		}

		//************ Descending Onsite Manager Sorting*************************************************************************************
		public static void descendingOnsiteManagerSorting() throws Throwable{
			try{
				Thread.sleep(2000);
				PageObjects_ProjectAllocation.Sorting_OnsiteManager(Constant.driver).click();
				Thread.sleep(2000);
				List<WebElement> descendingOrderSortedOnsiteManager = (Constant.driver.findElements(By.xpath(".//*[@id='projectallocationTableId']/tbody/tr/td[5]")));
				ArrayList<String> OnSiteManagerdsc = new ArrayList<String>();
				for(int i=0; i<descendingOrderSortedOnsiteManager.size(); i++)
				{
					String h=descendingOrderSortedOnsiteManager.get(i).getText();
					originallist7.add(h);
					OnSiteManagerdsc.add(h);
					
				}
				
				final class SortIgnoreCase implements Comparator<Object> {
					public int compare(Object o1, Object o2) {
						String s1 = (String) o1;
						String s2 = (String) o2;
						return s1.toLowerCase().compareTo(s2.toLowerCase());
					}
				}
				Collections.sort(originallist7, new SortIgnoreCase());
				Collections.reverse(originallist7);
			
				boolean flag = true;
				for (int counter = 0; counter <OnSiteManagerdsc .size(); counter++) {

					
					  if
					  (originallist7.get(counter).equals(OnSiteManagerdsc.get(counter ))) {
					  
					  
					  } else { flag = false; }
					 
				}
				
				
				
				
				if(flag){
					Report.ReporterOutput("STEP","Verify Onsite Manager is displayed in Descending Order. ",originallist7.toString(),"Click on Onsite Manager.","Onsite Manager is displaying in Descending Order successfully.","Pass",null);
				}else{
					Report.ReporterOutput("STEP","Verify Onsite Manager is displayed in Descending Order .",originallist7.toString(),"Click on Onsite Manager.","Onsite Manager is not displayed in Descending Order.","Fail",null);
				}


			}catch(Exception e){
				e.printStackTrace();
			}
		}

		//****** Ascending  Project Kick off Date Sorting*************************************************************************************

		public static void ascendingProjectKickoffDateSorting() throws Throwable{
			try{
				Thread.sleep(2000);
				PageObjects_ProjectAllocation.Sorting_ProjectKickoffDate(Constant.driver).click();
				Thread.sleep(2000);
				
				List<WebElement> ascendingorderSortedProjectKickoffDate = (Constant.driver.findElements(By.xpath(".//*[@id='projectallocationTableId']/tbody/tr/td[7]")));
				ArrayList<String> KickOffDateAsc = new ArrayList<String>();
				
				
				for (int i=0; i<ascendingorderSortedProjectKickoffDate.size(); i++)
				{
					String k= ascendingorderSortedProjectKickoffDate.get(i).getText().toString();
					originallist8.add(k);
					KickOffDateAsc.add(k);
				}
				
				final class SortIgnoreCase implements Comparator<Object> {
					public int compare(Object o1, Object o2) {
						String s1 = (String) o1;
						String s2 = (String) o2;
						return s1.toLowerCase().compareTo(s2.toLowerCase());
					}
				}
				Collections.sort(originallist8, new SortIgnoreCase());
				
				
				boolean flag = true;
				for (int counter = 0; counter <KickOffDateAsc .size(); counter++) {

					
					  if
					  (originallist8.get(counter).equals(KickOffDateAsc.get(counter ))) {
					  
					  
					  } else { flag = false; }
					 
				}
				if (flag)
				{
					Report.ReporterOutput("STEP","Verify Project Kick off Date is displayed in Ascending Order .",originallist8.toString(),"Click on Project Kick off Date.","Project Kick off Date is displaying in ascending Order successfully.","Pass",null);
				}else
				{
					Report.ReporterOutput("STEP","Verify Project Kick off Date is displayed in Ascending Order .",originallist8.toString(),"Click on Project Kick off Date.","Project Kick off Date should is not displayed in ascending Order.","Fail",null);

				}



			}catch(Exception e){
				e.printStackTrace();
			}
		}

		//************ Descending Project Kick off Date Sorting*************************************************************************************
		public static void descendingProjectKickoffDateSorting() throws Throwable{
			try{
				
				
				Thread.sleep(2000);
				PageObjects_ProjectAllocation.Sorting_ProjectKickoffDate(Constant.driver).click();
				Thread.sleep(2000);
				List<WebElement> descendingOrderSortedProjectKickoffDate = (Constant.driver.findElements(By.xpath(".//*[@id='projectallocationTableId']/tbody/tr/td[7]")));
				
				ArrayList<String> KickOffDateDsc = new ArrayList<String>();
				for(int i=0; i<descendingOrderSortedProjectKickoffDate.size(); i++)
				{
					String l=descendingOrderSortedProjectKickoffDate.get(i).getText().toString();
					originallist9.add(l);
					KickOffDateDsc.add(l);
				}
				final class SortIgnoreCase implements Comparator<Object> {
					public int compare(Object o1, Object o2) {
						String s1 = (String) o1;
						String s2 = (String) o2;
						SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");	
						try {
							Date date1 = simpleDateFormat.parse(s1);
							Date date2 = simpleDateFormat.parse(s2);

							return date2.compareTo(date1);

						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						return 0;
						
					}
				}
				Collections.sort(originallist9, new SortIgnoreCase());
			//	Collections.reverse(originallist9);
				
				boolean flag = true;
				for (int counter = 0; counter < KickOffDateDsc.size(); counter++) {

					
					  if
					  (originallist9.get(counter).equals(KickOffDateDsc.get(counter ))) {
					  
					  
					  } else { flag = false; }
					 
				}
				
				
			
				if(flag){
					Report.ReporterOutput("STEP","Verify Project Kick off Date is displayed in Descending Order .",originallist9.toString(),"Click on Project Kick off Date.","Project Kick off Date is displaying in Descending Order successfully.","Pass",null);
				}else{
					Report.ReporterOutput("STEP","Verify Project Kick off Date is displayed in Descending Order. ",originallist9.toString(),"Click on Project Kick off Date.","Project Kick off Date is not displayed in Descending Order.","Fail",null);
				}


			}catch(Exception e){
				e.printStackTrace();
			}
		}


		//****** Ascending  Project End Date Sorting*************************************************************************************

		public static void ascendingProjectEndDateSorting() throws Throwable{
			try{
				Thread.sleep(2000);
				PageObjects_ProjectAllocation.Sorting_ProjectEndDate(Constant.driver).click();
				Thread.sleep(2000);
				List<WebElement> ascendingorderSortedProjectEndDate = (Constant.driver.findElements(By.xpath(".//*[@id='projectallocationTableId']/tbody/tr/td[8]")));
				ArrayList<String> ProjectEndDateAsc = new ArrayList<String>();
				
				for (int i=0; i<ascendingorderSortedProjectEndDate.size(); i++)
				{
					String m= ascendingorderSortedProjectEndDate.get(i).getText().toString();
					originallist10.add(m);
					ProjectEndDateAsc.add(m);
				
				}
				final class SortIgnoreCase implements Comparator<Object> {
					public int compare(Object o1, Object o2) {
						String s1 = (String) o1;
						String s2 = (String) o2;
						return s1.toLowerCase().compareTo(s2.toLowerCase());
					}
				}
				Collections.sort(originallist10, new SortIgnoreCase());
				
				Collections.reverse(originallist10);

				boolean flag = true;
				for (int counter = 0; counter <ProjectEndDateAsc.size(); counter++) {

					
					  if
					  (originallist10.get(counter).equals(ProjectEndDateAsc.get(counter ))) {
					  
					  
					  } else { flag = false; }
					 
				}
				if (flag){
					Report.ReporterOutput("STEP","Verify Project End Date is displayed in Ascending Order. ",originallist10.toString(),"Click on Project End Date.","Project End Date is displaying in ascending Order successfully.","Pass",null);
				}else
				{
					Report.ReporterOutput("STEP","Verify Project End Date is displayed in Ascending Order .",originallist10.toString(),"Click on Project End Date.","Project End Date should is not displayed in ascending Order.","Fail",null);

				}



			}catch(Exception e){
				e.printStackTrace();
			}
		}

		//************ Descending Project End Date Sorting*************************************************************************************
		public static void descendingProjectEndDateSorting() throws Throwable{
			try{
				Thread.sleep(2000);
				PageObjects_ProjectAllocation.Sorting_ProjectEndDate(Constant.driver).click();
				Thread.sleep(2000);
				List<WebElement> descendingOrderSortedProjectEndDate = (Constant.driver.findElements(By.xpath(".//*[@id='projectallocationTableId']/tbody/tr/td[8]")));
				
				ArrayList<String> ProjectEndDateDsc = new ArrayList<String>();
				
				for(int i=0; i<descendingOrderSortedProjectEndDate.size(); i++)
				{
					String n=descendingOrderSortedProjectEndDate.get(i).getText().toString();
					originallist11.add(n);
					ProjectEndDateDsc.add(n);
				
				}
				final class SortIgnoreCase implements Comparator<Object> {
					public int compare(Object o1, Object o2) {
						String s1 = (String) o1;
						String s2 = (String) o2;
						SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");	
						try {
							Date date1 = simpleDateFormat.parse(s1);
							Date date2 = simpleDateFormat.parse(s2);

							return date2.compareTo(date1);

						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						return 0;
					}
				}
				Collections.sort(originallist11, new SortIgnoreCase());
				
				//Collections.reverse(originallist11);

				boolean flag = true;
				for (int counter = 0; counter < ProjectEndDateDsc.size(); counter++) {

					
					  if
					  (originallist11.get(counter).equals(ProjectEndDateDsc.get(counter ))) {
					  
					  
					  } else { flag = false; }
					 
				}
				if(flag){
					Report.ReporterOutput("STEP","Verify Project End Date is displayed in Descending Order. ",originallist11.toString(),"Click on Project End Date.","Project End Date is displaying in Descending Order successfully.","Pass",null);
				}else{
					Report.ReporterOutput("STEP","Verify Project End Date is displayed in Descending Order .",originallist11.toString(),"Click on Project End Date.","Project End Date is not displayed in Descending Order.","Fail",null);
				}


			}catch(Exception e){
				e.printStackTrace();
			}
		}
	
	
	
	
	
	
	
	
	// This functionality will verify Count of Records.
	public static void RecordsCount() throws Throwable 
		{
			
			System.out.println("yaha to aa gya");
			int rows_count;
		Select dropdown1 = new Select(PageObjects_ProjectAllocation.dropdown_ShowEntries(Constant.driver));
		List<WebElement> values_drop = Constant.driver.findElements(By.tagName("option"));
		int Count=1;	
		for(int i=0;i<values_drop.size(); i++)
			{
				System.out.println("yaha bhi aa gya");
				dropdown1.selectByIndex(i);
				Thread.sleep(5000);
				WebElement element =Constant.driver.findElement(By.xpath(".//*[@id='display']/option["+Count+"]"));
				System.out.println(i);
				System.out.println(element.getText());
			Integer x= Integer.parseInt(element.getText().toString());
			System.out.println(x);
			System.out.println("yaha bhi hai");
			
			List<WebElement> rows_table = Constant.driver.findElements(By.xpath(".//*[@id='projectallocationTableId']/tbody/tr/td[1]"));
					//To calculate no of rows In table.
				rows_count = rows_table.size();
				System.out.println(rows_count);
			Thread.sleep(1700);
			if(x==rows_count)
			{ 
				
			
				Report.ReporterOutput("STEP ","Verify Count of Record for entry="+ x,"Count="+ x  , "Entries Should be Correct-" + x,"Active Record Count done successfully.--" + x, "Pass",null);		  		
				
			
			}
			
			
	
			else
			{
				Report.ReporterOutput("STEP ","Verify Count of Record for entry="+ x,"Count="+ x  , "Entries Should be Correct-" + x,"Active Record Count not done successfully.--" + x, "Fail",null);		  		
				
			}
			Count++;
			}
	
			}
	
	
	
	public static void Pagination() throws Throwable {
		
		System.out.println("text box is displayed");
		
		if (PageObjects_ProjectAllocation.btn_Pageinationone(
				Constant.driver).isDisplayed()) {
			System.out.println("text box is displayed");
			
			PageObjects_ProjectAllocation.btn_Pageinationone(
					Constant.driver).click();
			Report.ReporterOutput("Step","Verify user is able to move to next page","Pagination", "User is able to successfull moved to next page.", "User successfully moved to next Page", "Pass",null);
		} else {
			Report.ReporterOutput("Step","Verify user is able to move to next page","Pagination", "User is able to successfull moved to next page.", "User not moved to the next page", "Fail",null);
			System.out.println("text box is not displayed");
		}
		
		
	}
	

	// ***********************************Add New
	// Resource****************************************************
	public static void AddNewResourceToProject(List<String> addNewResource)
			throws Throwable {

		String searchProject = addNewResource.get(0);
		String ResourceName = addNewResource.get(1);
		String AllocationType = addNewResource.get(2);
		String StartDate = addNewResource.get(3);
		String PrimaryProject = addNewResource.get(4);
		String Timehrs = addNewResource.get(5);

		// ***************************ProjectSearch***************************************************************************
		if (PageObjects_ProjectAllocation.txtbox_ProjectSerach(
				Constant.driver).isDisplayed()) {

			Report.ReporterOutput(
					"STEP",
					"Verify Project Name search box is Visible.",
					"Project Name search box.",
					"Project Name search box should be visible.",
					"Project Name search box is Visible and clickable successfully.",
					"Pass", null);
		
			
			System.out.println("Project Name textbox is displayed");
			PageObjects_ProjectAllocation.txtbox_ProjectSerach(
					Constant.driver).clear();
			PageObjects_ProjectAllocation.txtbox_ProjectSerach(
					Constant.driver).sendKeys(searchProject);
			PageObjects_ProjectAllocation.txtbox_ProjectSerach(
					Constant.driver).sendKeys(Keys.ENTER);

			Thread.sleep(3000);
			if (PageObjects_ProjectAllocation.Text_selectedProjectName(
					Constant.driver).isDisplayed()) {
				String Text_selectedProjectNameDisplayed = PageObjects_ProjectAllocation
						.Text_selectedProjectName(Constant.driver).getText();

				Thread.sleep(2000);
				if (searchProject.contains(Text_selectedProjectNameDisplayed)) {
					Report.ReporterOutput(
							"STEP",
							"Verify selected Project Name details is Visible",
							searchProject,
							"selected Project Name details should be visible",
							"selected Project Name details Visible successfully",
							"Pass", null);
					
					
					
					System.out.println("Search Verified");
				} else {

					Report.ReporterOutput(
							"STEP",
							"Verify selected Project Name details is Visible",
							searchProject,
							"selected Project Name details should be visible",
							"selected Project Name details not Visible successfully",
							"Fail", null);
					
					
					System.out.println("Wrong Project Search");
				}

				PageObjects_ProjectAllocation.Link_ProjectId(
						Constant.driver).click();

			} else {

				Report.ReporterOutput("STEP",
						"Verify Project Name search box is Visible.",
						"Project Name search box.",
						"Project Name search box should be visible.",
						"Project Name search box not Visible.", "Fail", null);
				
			
				System.out.println("Project Name testbox is not displayed");

			}

			// ***********************************************AddNewResourceButton***************************************
			if (PageObjects_ProjectAllocation.btn_AddNewResource(
					Constant.driver).isDisplayed())

			{
				

				PageObjects_ProjectAllocation.btn_AddNewResource(
						Constant.driver).click();
				Thread.sleep(4000);
				Report.ReporterOutput("STEP",
						"Verify Add New Link is Visible and clickable.",
						"Add New Link.", "Click on Add New Link.",
						"add New Link is Visible and clickable successfully.",
						"Pass", null);
				System.out.println("Add new button is displayed");
				
			}

		} else {
			Report.ReporterOutput("STEP",
					"Verify Add New Link is Visible and clickable.",
					"Add New Link.", "Click on Add New Link.",
					"add New Link is not Visible",
					"Fail", null);
			
			
			System.out.println("Add new button is displayed");
		}

		// ***************************************************ResourceNameField*************************************

		if (PageObjects_ProjectAllocation.txtBox_ResourceName(
				Constant.driver).isDisplayed()) {
			System.out.println("Resource name textbox is displayed");
			PageObjects_ProjectAllocation.txtBox_ResourceName(
					Constant.driver).sendKeys(ResourceName);
			Report.ReporterOutput("Step","Verify Resource Name field is enabled and Clickable.","Resource Name", "Resource Name field should be enabled and Clickable successfully.", "Resource Name field is enabled and Clickable successfully.", "Pass",null);
		} else {
			Report.ReporterOutput("Step","Verify Resource Name field is enabled and Clickable .","Resource Name", "Resource Name field should be enabled and Clickable successfully.", "Resource Name field is  not enabled and Clickable successfully.", "Fail", null);

			System.out.println("text box is not displayed");
		}
		// ***************************************************AllocationtypeNameField*************************************
		if (PageObjects_ProjectAllocation.txtBox_AllocationType(
				Constant.driver).isDisplayed()) {
			System.out.println("Allocation type text is displayed");
			PageObjects_ProjectAllocation.txtBox_AllocationType(
					Constant.driver).sendKeys(AllocationType);
			Report.ReporterOutput("Step","Verify Allocation Type field is enabled and Clickable.","Allocation Type", "Allocation Type field should be enabled and Clickable successfully.", "Allocation Type field is enabled and Clickable successfully.", "Pass",null);
			
		} else {
			Report.ReporterOutput("Step","Verify Allocation Type field is enabled and Clickable .","Allocation Type", "Allocation Type field should be enabled and Clickable successfully.", "Allocation Type field is  not enabled and Clickable successfully.", "Fail", null);

			System.out.println("text box is not displayed");
		}
		
		
		
		// ************************************************StartDate****************************************
		if (PageObjects_ProjectAllocation.date_StartDate(Constant.driver)
				.isDisplayed()) {

			System.out.println("Date picker is displayed");
			String[] Start_Date = StartDate.split("-");
			String DateVal = Start_Date[0];
			String MonthVal = Start_Date[1];
			String YearVal = Start_Date[2];
			// System.out.println(DateVal);
			// System.out.println(MonthVal);
			// System.out.println(YearVal);

			PageObjects_ProjectAllocation.date_StartDate(Constant.driver)
					.click();
			Thread.sleep(2000);
			Select Month = new Select(
					Constant.driver.findElement(By
							.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/select[1]")));
			Month.selectByVisibleText(MonthVal);

			Thread.sleep(1000);

			Select Year = new Select(
					Constant.driver.findElement(By
							.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/select[2]")));
			Year.selectByVisibleText(YearVal);

			Thread.sleep(1000);
			Constant.driver.findElement(By.linkText(DateVal)).click();
			Report.ReporterOutput("Step","Verify Start Date field is enabled and clickable.","StartDate", "Confirmation Date field should be enabled and clickable successfully.", "Confirmation Date field is enabled and clickable successfully.", "Pass",null);

			
		} else {
			Report.ReporterOutput("Step","Verify Start Date field is enabled and clickable.","Confirmation Date", "Confirmation Date field should be enabled and clickable successfully.", "Confirmation Date field is  not enabled and clickable successfully.", "Fail", null);

			System.out.println("Date Picker is not displayed");
		}

		// ************************************************PrimaryProject****************************************
		if (PageObjects_ProjectAllocation.dropdown_PrimaryProject(
				Constant.driver).isDisplayed()) {

			System.out.println("Primary Project dropdwon is displayed");
			// Select priproject= new
			// Select(PageObjects_ProjectAllocation.dropdown_PrimaryProject(Constant.driver));
			// priproject.selectByValue(PrimaryProject);
			PageObjects_ProjectAllocation.dropdown_PrimaryProject(
					Constant.driver).clear();

			PageObjects_ProjectAllocation.dropdown_PrimaryProject(Constant.driver).sendKeys(PrimaryProject);
			
			Report.ReporterOutput("Step","Verify Primary Project field is enabled and Clickable.","Primary Project", "Primary Project field should be enabled and Clickable successfully.", "Primary Project field is enabled and Clickable successfully.", "Pass",null);

		}

		else {
			
			Report.ReporterOutput("Step","Verify Primary Project field is enabled and Clickable .","Primary Project", "Primary Project field should be enabled and Clickable successfully.", "Primary Project field is  not enabled and Clickable successfully.", "Fail", null);

			System.out.println("Primary Project dropdwon is not displayed");
		}

		// ************************************************Timehrs
		// manager****************************************
		if (PageObjects_ProjectAllocation.dropdown_TimeHrsManager(
				Constant.driver).isDisplayed()) {

			System.out.println("TAime hrs manager dropdwon is displayed");
			// Select priproject= new
			// Select(PageObjects_ProjectAllocation.dropdown_TimeHrsManager(Constant.driver));
			// priproject.selectByValue(Timehrs);
			PageObjects_ProjectAllocation.dropdown_TimeHrsManager(
					Constant.driver).clear();
			PageObjects_ProjectAllocation.dropdown_TimeHrsManager(
					Constant.driver).sendKeys(Timehrs);
			Report.ReporterOutput("Step","Verify TimeHrs Manager field is enabled and Clickable.","TimeHrs Manager", "TimeHrs Manager field should be enabled and Clickable successfully.", "TimeHrs Manager field is enabled and Clickable successfully.", "Pass",null);

		}

		else {
			
			Report.ReporterOutput("Step","Verify TimeHrs Manager field is enabled and Clickable .","TimeHrs anager", "TimeHrs Manager field should be enabled and Clickable successfully.", "TimeHrs Manager field is  not enabled and Clickable successfully.", "Fail", null);

			System.out.println(" Time hrs dropdwon is not displayed");
		}
		// **************************************************Save ButtonFunctionality**************************************
		if (PageObjects_ProjectAllocation.btn_SaveResource(Constant.driver).isDisplayed()) {

			System.out.println("Save button is displayed");
			Thread.sleep(2000);	
		PageObjects_ProjectAllocation.btn_SaveResource(Constant.driver).click();
		Thread.sleep(2000);
			System.out.print("click to kar raha hai");


			Report.ReporterOutput("STEP", "Verify  Save button is Visible and clickable.", " Save button", "Save button should be visible and clickable.", "Save button is visible and clickable successfully.", "Pass", null);

		} else {
			
			Report.ReporterOutput("STEP", "Verify Save button is Visible and clickable.", " Save button", "Save button should be visible and clickable.", "Save button not visible and clickable.", "Fail", null);
	
			System.out.println("save button is not displayed");


		}
		
		
       Constant.driver.switchTo().frame(0);
		Thread.sleep(3000);
		System.out.println("yaha bhi hai frame");
		Constant.driver.findElement(By.xpath(".//*[@id='example_wrapper']/div[7]/div[1]")).click();
		
		Constant.driver.switchTo().defaultContent();
		Thread.sleep(1000);
	Constant.driver.findElement(By.xpath("html/body/div[4]/div/div/a")).click();
		
		Thread.sleep(5000);
		Constant.driver.findElement(By.xpath(".//*[@id='cancel']")).click();
		String successMsg=Constant.driver.findElement(By.xpath("//div[contains(@class,'toast-message')]")).getText();

		System.out.println(successMsg);

		if (successMsg.contains("successfully")) {
			Report.ReporterOutput("STEP","Verify save confirmation Msg is Visible ",successMsg,"Click on save confirmation Msg","save confirmation Msg displayed and clicked","Pass",null);
		}
		else {
			Report.ReporterOutput("STEP","Verify save confirmation Msg is Visible ",successMsg,"Click on save confirmation Msg","save confirmation Msg is not displayed","Fail",null);
		}
	}

	//*********************************************Delete resource From Project *******************************************
	public static void DeleteResourceFromProject(List<String> deleteResource) throws Throwable {
		
		String searchProject= deleteResource.get(0);
		String DeleteResourceName= deleteResource.get(1);
		
		PageObjects_ProjectAllocation.link_ProjectList(Constant.driver).click();
		
		
		if (PageObjects_ProjectAllocation.txtbox_ProjectSerach(
				Constant.driver).isDisplayed()) {

			Report.ReporterOutput(
					"STEP",
					"Verify Project Name search box is Visible.",
					"Project Name search box.",
					"Project Name search box should be visible.",
					"Project Name search box is Visible and clickable successfully.",
					"Pass", null);
		
			
			System.out.println("Project Name textbox is displayed");
			PageObjects_ProjectAllocation.txtbox_ProjectSerach(
					Constant.driver).clear();
			PageObjects_ProjectAllocation.txtbox_ProjectSerach(
					Constant.driver).sendKeys(searchProject);
			PageObjects_ProjectAllocation.txtbox_ProjectSerach(
					Constant.driver).sendKeys(Keys.ENTER);

			Thread.sleep(3000);
			if (PageObjects_ProjectAllocation.Text_selectedProjectName(
					Constant.driver).isDisplayed()) {
				String Text_selectedProjectNameDisplayed = PageObjects_ProjectAllocation
						.Text_selectedProjectName(Constant.driver).getText();

				Thread.sleep(2000);
				if (searchProject.contains(Text_selectedProjectNameDisplayed)) {
					Report.ReporterOutput(
							"STEP",
							"Verify selected Project Name details is Visible",
							searchProject,
							"selected Project Name details should be visible",
							"selected Project Name details Visible successfully",
							"Pass", null);
					
					
					
					System.out.println("Search Verified");
				} else {

					Report.ReporterOutput(
							"STEP",
							"Verify selected Project Name details is Visible",
							searchProject,
							"selected Project Name details should be visible",
							"selected Project Name details not Visible successfully",
							"Fail", null);
					
					
					System.out.println("Wrong Project Search");
				}

				PageObjects_ProjectAllocation.Link_ProjectId(
						Constant.driver).click();
				Thread.sleep(3000);
			} else {

				Report.ReporterOutput("STEP",
						"Verify Project Name search box is Visible.",
						"Project Name search box.",
						"Project Name search box should be visible.",
						"Project Name search box not Visible.", "Fail", null);
				
			
				System.out.println("Project Name testbox is not displayed");

			}
			
		if(PageObjects_ProjectAllocation.searchBox_EmployeeName(Constant.driver).isDisplayed())
		{
			PageObjects_ProjectAllocation.searchBox_EmployeeName(Constant.driver).clear();
			PageObjects_ProjectAllocation.searchBox_EmployeeName(Constant.driver).sendKeys(DeleteResourceName);
			PageObjects_ProjectAllocation.searchBox_EmployeeName(Constant.driver).sendKeys(Keys.ENTER);
			Report.ReporterOutput("STEP", "Verify Employee Name search box is Visible.", "Employee Name search box .", "Employee Name search box should be visible.", "Employee Name search box is Visible and clickable successfully.", "Pass", null);
		}
		else
		{
			
			Report.ReporterOutput("STEP", "Verify Employee Name search box is Visible.", "Employee Name search box", "Employee Name search box should be visible.", "Employee Name search box not Visible.", "Fail", null);
		}
		
		// click on delete link
		if(PageObjects_ProjectAllocation.link_DeleteResource(Constant.driver).isDisplayed())
		{
			PageObjects_ProjectAllocation.link_DeleteResource(Constant.driver).click();
			Thread.sleep(2000);
		//	html/body/ul[2]/li
			
			//Constant.driver.switchTo().frame(0);
//			WebDriverWait wait = new WebDriverWait(Constant.driver, 10);
//
//			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/ul[2]/li")));
//			
	WebElement element=Constant.driver.findElement(By.className("noty_buttons"));
	element.findElement(By.className("btn-primary")).click();
			
			Report.ReporterOutput("STEP","Verify Delete button is enable and clickable. ","Delete link.","Click on Delete link.","Delete link is enable and clickable successfully.","Pass",null);	
			
		}
		else
		{
			Report.ReporterOutput("STEP","Verify Delete button is enable and clickable. ","Delete link.","Click on Delete link.","Delete link is not enable and clickable successfully.","fail",null);	
			
		}
		// Verify confirmation message display
					Thread.sleep(500);
					String successMsg=Constant.driver.findElement(By.xpath("//div[contains(@class,'toast-message')]")).getText();
					//	System.out.println(successMsg);
					if (successMsg.contains("successfully")) {
						Report.ReporterOutput("STEP","Verify Delete confirmation Msg is Visible. ",successMsg,"Delete confirmation Msg displayed.","Delete confirmation Msg displayed successfully.","Pass",null);
					}
					else {
						Report.ReporterOutput("STEP","Verify Delete confirmation Msg is Visible. ",successMsg,"Delete confirmation Msg displayed.","Delete confirmation Msg not displayed successfully.","Fail",null);
					}
					// Verify confirmation message display
					Thread.sleep(1000);
					
					

					Thread.sleep(3000);
					PageObjects_ProjectAllocation.searchBox_EmployeeName(Constant.driver).clear();
					Thread.sleep(3000);
					PageObjects_ProjectAllocation.searchBox_EmployeeName(Constant.driver).sendKeys(DeleteResourceName);
					String NoMatchFoundMsgg=Constant.driver.findElement(By.xpath(".//*[@id='example']/tr/td")).getText();

					if (NoMatchFoundMsgg.contains("No matching")){

						Report.ReporterOutput("STEP", "Verify Employee Name : "+ DeleteResourceName + " is Deleted from list successfully.", DeleteResourceName , "Employee Name : "+DeleteResourceName + " Should be Deleted from list successfully.", "Verifed Employee Name : "+DeleteResourceName + "  is Deleted from list successfully.", "Pass", null);

					}
					else {
						Report.ReporterOutput("STEP", "Verify Employee Name : "+ DeleteResourceName + " is Deleted from list successfully.", DeleteResourceName , "Employee Name : "+DeleteResourceName + " Should be Deleted from list successfully.", "Verifed Employee Name : "+DeleteResourceName + " not Deleted from list successfully.", "Fail", null);
					}



		}
	}

	

	//**********************************Edit project details scenerio ******************************************
	public static void Edit_ProjectDetails(String SearchProject , String Resorce_Name, String Edit_StartDate , String Edit_PrimaryProject ,String Edit_TimeHrsManager) throws Throwable{
		try{
			Thread.sleep(2000);
			PageObjects_ProjectAllocation.List_box(Constant.driver).click();
			Thread.sleep(2000);

			if (PageObjects_ProjectAllocation.searchbox_ProjectName(Constant.driver).isDisplayed()){
				PageObjects_ProjectAllocation.searchbox_ProjectName(Constant.driver).clear();
				PageObjects_ProjectAllocation.searchbox_ProjectName(Constant.driver).sendKeys(SearchProject);
				PageObjects_ProjectAllocation.searchbox_ProjectName(Constant.driver).sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				PageObjects_ProjectAllocation.Link_ProjectId(Constant.driver).click();
				Thread.sleep(3000);
				Report.ReporterOutput("STEP", "Verify Project Name search box is Visible.", "Project Name search box .", "Project Name search box should be visible.", "Project Name search box is Visible and clickable successfully.", "Pass", null);
			}
			else{
				Report.ReporterOutput("STEP", "Verify Project Name search box is Visible.", "Project Name search box", "Project Name search box should be visible.", "Project Name search box not Visible.", "Fail", null);
			}
			if (PageObjects_ProjectAllocation.Text_selectedProjectName(Constant.driver).isDisplayed()){
				String Text_selectedProjectNameDisplayed = PageObjects_ProjectAllocation.Text_selectedProjectName(Constant.driver).getText();

				Thread.sleep(2000);
				if (SearchProject.contains(Text_selectedProjectNameDisplayed)) {
					Report.ReporterOutput("STEP", "Verify selected Project Name details is Visible.", SearchProject, "selected Project Name details should be visible.", "selected Project Name details Visible successfully.", "Pass", null);
				}
				else{
					Report.ReporterOutput("STEP", "Verify selected Project Name details is Visible.", SearchProject, "selected Project Name details should be visible.", "selected Project Name details not Visible successfully.", "Fail", null);
				}
			}
			
			if (PageObjects_ProjectAllocation.Searchbox_EditEmployeeName(Constant.driver).isDisplayed()){
				PageObjects_ProjectAllocation.Searchbox_EditEmployeeName(Constant.driver).clear();
				PageObjects_ProjectAllocation.Searchbox_EditEmployeeName(Constant.driver).sendKeys(Resorce_Name);
				PageObjects_ProjectAllocation.Searchbox_EditEmployeeName(Constant.driver).sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				/*PageObjects_ProjectAllocation.link_Delete(Constant.driver).click();
				Thread.sleep(3000);*/
				Report.ReporterOutput("STEP", "Verify search box is Visible.", " search box .", " search box should be visible.", " search box is Visible and clickable successfully.", "Pass", null);
			}
			else{
				Report.ReporterOutput("STEP", "Verify  search box is Visible.", " search box", " search box should be visible.", " search box not Visible.", "Fail", null);
			}
			

			if (PageObjects_ProjectAllocation.link_Edit(Constant.driver).isDisplayed()){


				Thread.sleep(3000);
				PageObjects_ProjectAllocation.link_Edit(Constant.driver).click();
				Thread.sleep(3000);
				Report.ReporterOutput("STEP","Verify Edit button is Visible. ","edit button.","Click on Edit link.","Edit link displayed and clicked successfully.","Pass",null);
				//Thread.sleep(2000);
			}
			else {
				Report.ReporterOutput("STEP","Verify Edit button is Visible. ","edit button.","Click on Edit link.","Edit link is not displayed.","fail",null);
			}



			//**************************************** Verify Edit start date field *********************************************************************

			if(PageObjects_ProjectAllocation.textbox_StartDate(Constant.driver).isDisplayed() && PageObjects_ProjectAllocation.textbox_StartDate(Constant.driver).isEnabled())
			{		

				Thread.sleep(2000);


				String[] Edit_Start_Date = Edit_StartDate.split("-");
				String Edit_DateVal = Edit_Start_Date[0];
				String Edit_MonthVal = Edit_Start_Date[1];
				String Edit_YearVal = Edit_Start_Date[2];

				Thread.sleep(2000);

				Constant.driver.findElement(By.id("allocStartDate")).click();

				Thread.sleep(1000);

				Select MonthList=new Select(Constant.driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/select[1]")));
				MonthList.selectByVisibleText(Edit_MonthVal);

				Thread.sleep(1000);

				Select YearList=new Select(Constant.driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/select[2]")));
				YearList.selectByVisibleText(Edit_YearVal);

				Thread.sleep(1000);	 

				List<WebElement>  Edit_date_list = Constant.driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));

				for(int i=0; i<Edit_date_list.size(); i++){

					String Edit_getDate_list = Edit_date_list.get(i).getText();
					Thread.sleep(1000);

					if(Edit_getDate_list.contentEquals(Edit_DateVal)){

						Thread.sleep(1000);
						Edit_date_list.get(i).click();


						break;
					}
				}




				Report.ReporterOutput("Step","Verify Start Date field is  enabled and Editable.","Start Date", "Start Date field should be enabled and editable successfully.", "Start Date field should be enabled and editable successfully.", "Pass",null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify Start Date field is enabled and Editable.","Start Date", "Start Date field should be enabled and editable successfully.", "Start Date field not enabled and editable successfully.", "Fail", null);
			}

			//********************** drop down Primary Project	***************************

			if(PageObjects_ProjectAllocation.dropdown_PrimaryProject(Constant.driver).isDisplayed() && PageObjects_ProjectAllocation.dropdown_PrimaryProject(Constant.driver).isEnabled())
			{		



				WebElement enterRes = PageObjects_ProjectAllocation.dropdown_PrimaryProject(Constant.driver);

				enterRes.click();

				Thread.sleep(2000);
				List<WebElement> Edit_PrimaryProjectList = Constant.driver.findElements(By.xpath("html/body/ul[4]/li/a"));

				for(int i=0; i< Edit_PrimaryProjectList.size(); i++){

					String Edit_PrimaryProject_Name = Edit_PrimaryProjectList.get(i).getText();



					if( Edit_PrimaryProject_Name.contentEquals(Edit_PrimaryProject)){


						Edit_PrimaryProjectList.get(i).click();
						Thread.sleep(2000);



						break;
					}

				}


				Report.ReporterOutput("Step","Verify Primary Project field is enabled and editable.","Primary Project", "Primary Project field should be enabled and editable successfully.", "Primary Project field is enabled and editable successfully.", "Pass",null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify Primary Project field is enabled and editable .","Primary Project", "Primary Project field should be enabled and editable successfully.", "Primary Project field is  not enabled and editable successfully.", "Fail", null);
			}







			//********************** drop down TimeHrs Manager	***************************

			if(PageObjects_ProjectAllocation.dropdown_TimeHrsManager(Constant.driver).isDisplayed() && PageObjects_ProjectAllocation.dropdown_TimeHrsManager(Constant.driver).isEnabled())
			{		



				WebElement enterRes = PageObjects_ProjectAllocation.dropdown_TimeHrsManager(Constant.driver);

				enterRes.click();

				Thread.sleep(2000);
				List<WebElement> Edit_TimeHrsManagerList = Constant.driver.findElements(By.xpath("html/body/ul[5]/li/a"));

				for(int i=0; i< Edit_TimeHrsManagerList.size(); i++){

					String Edit_TimeHrsManager_Name = Edit_TimeHrsManagerList.get(i).getText();



					if( Edit_TimeHrsManager_Name.contentEquals(Edit_TimeHrsManager)){


						Edit_TimeHrsManagerList.get(i).click();
						Thread.sleep(2000);



						break;
					}

				}


				Report.ReporterOutput("Step","Verify TimeHrs Manager field is enabled and editable.","TimeHrs Manager", "TimeHrs Manager field should be enabled and editable successfully.", "TimeHrs Manager field is enabled and editable successfully.", "Pass",null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify TimeHrs Manager field is enabled and editable .","TimeHrs anager", "TimeHrs Manager field should be enabled and editable successfully.", "TimeHrs Manager field is  not enabled and editable successfully.", "Fail", null);
			}
			//******************************************** Click on Save button ****************************************************

			if (PageObjects_ProjectAllocation.ProjectSave_Link(Constant.driver).isDisplayed()){

				Thread.sleep(2000);
				PageObjects_ProjectAllocation.ProjectSave_Link(Constant.driver).click();

				Report.ReporterOutput("STEP", "Verify  Save button is Visible and clickable.", " Save button.", "Save button should be visible and clickable.", "Save button is visible and clickable successfully.", "Pass", null);
			}
			else{
				Report.ReporterOutput("STEP", "Verify Save button is Visible and clickable.", " Save button.", "Save button should be visible and clickable.", "Save button not visible and clickable.", "Fail", null);
			}


			Thread.sleep(1000);
			String successMsg=Constant.driver.findElement(By.xpath("//div[contains(@class,'toast-message')]")).getText();

			//		System.out.println(successMsg);

			if (successMsg.contains("successfully")) {
				Report.ReporterOutput("STEP","Verify save confirmation Msg is Visible. ",successMsg,"Save confirmation Msg displayed.","Save confirmation Msg displayed successfully.","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify save confirmation Msg is Visible. ",successMsg,"Save confirmation Msg displayed.","Save confirmation Msg not displayed successfully.","Fail",null);
			}



		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}

		
	
			


