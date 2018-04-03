//package com.yash.RMS.TestAction.MasterData.ProjectAttribute;

package com.yash.RMS.TestAction.ProjectAttribute;

//package com.yash.RMS.TestAction.ProjectAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.ProjectAttribute.PageObjects_ProjectAttribute_EngagementModel;

public class Action_EngagementModel {

	public static ArrayList<Integer> originallist= new ArrayList<Integer>();
	public static ArrayList<Integer> originallist1= new ArrayList<Integer>();
	public static ArrayList<String> originallist2= new ArrayList<String>();
	public static ArrayList<String> originallist3= new ArrayList<String>();
	public static ArrayList<String> originallist4=new ArrayList<String>();
	public static ArrayList<String> originallist5=new ArrayList<String>();
	public static int  SerialNo_Asc;
	public static int  SerialNo_Dsc;
	public static int  ascendingorderiterator;
	public static int  gettextSNo;
	public static String ascendingorder;
	public static int descendingorderiterator1;
	public static String EngagementModelName_Asc;
	public static String ascendingorderiterator2;
	public static String EngagementModelName_Dsc;
	public static String descendingorderiterator3;
	public static String TimesheetCompulsory_Asc;
	public static String ascendingorderiterator4;
	public static String TimesheetCompulsory_Dsc;
	public static String descendingorderiterator5;

	public static void EngagementModelPageNavigation() throws Throwable{
		try {
			Thread.sleep(2000);
			//click on Master Data Link : main menu click
			if(PageObjects_ProjectAttribute_EngagementModel.lnk_MasterData(Constant.driver).isDisplayed()){
				PageObjects_ProjectAttribute_EngagementModel.lnk_MasterData(Constant.driver).click();
				Thread.sleep(4000);
				Report.ReporterOutput("STEP","Master Data Link is displayed "," Master Data Link","Click on Master Data  Link","Master Data Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Master Data Link is displayed "," Master Data Link","Click on Master Data  Link","Master Data Link  is not displayed","Fail",null);
			}
			Thread.sleep(1000);
			//Click on lnk_Project Attribute : sub menu click 

			if (PageObjects_ProjectAttribute_EngagementModel.lnk_ProjectAttribute(Constant.driver).isDisplayed()) {
				Thread.sleep(1000);
				PageObjects_ProjectAttribute_EngagementModel.lnk_ProjectAttribute(Constant.driver).click();

				Report.ReporterOutput("STEP","Verify Project Attribute link is displayed "," Project Attribute ","Click on Project Attribute Link","Project Attribute Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Project Attribute link is displayed "," Project Attribute ","Click on Project Attribute Link","Project Attribute Link not displayed","Fail",null);
			}
			//Click on lnk_Currency : sub menu click 
			if (PageObjects_ProjectAttribute_EngagementModel.lnk_EngagementModel(Constant.driver).isDisplayed()) {
				Thread.sleep(1000);
				PageObjects_ProjectAttribute_EngagementModel.lnk_EngagementModel(Constant.driver).click();

				Report.ReporterOutput("STEP","Verify Engagement Model link is displayed "," Engagement Model ","Click on Engagement Model Link","Engagement Model Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Engagement Model link is displayed "," Engagement Model ","Click on Engagement Model Link","Engagement Model Link not displayed","Fail",null);
			}
			//Verify Text  Currency on the page
			Thread.sleep(4000);
			String Text_EngagementModel = PageObjects_ProjectAttribute_EngagementModel.Text_EngagementModel(Constant.driver).getText();
			if (Text_EngagementModel.equalsIgnoreCase("Engagement Model")) {
				Report.ReporterOutput("STEP","Verify Text Engagement Model is Visible ","Text Engagement Model"," Text Engagement Model is visible "," Text Engagement Model is visible","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify Text Engagement Model is Visible  ","Text Engagement Model"," Text Engagement Model is not visible "," Text Engagement Model is not visible","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//****** Ascending  Serial No Sorting*************************************************************************************
	public static void ascendingSerialNoSorting() throws Throwable  {

		try {

			Thread.sleep(3000);
			List<WebElement> originalSavedSerialNo = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[1]")));
			Thread.sleep(1000);                                                                  
			System.out.println("Ascending  Currency Name Sorting : For printing List after clicking once");
			for(int i=0; i<originalSavedSerialNo.size(); i++) 
			{
				String gettextSNo = originalSavedSerialNo.get(i).getText();

				int iTest = Integer.parseInt(gettextSNo);
				originallist.add(iTest);
				SerialNo_Asc = originallist.get(i);
				//		System.out.println("SerialNo_Asc-------" +   SerialNo_Asc);
			}
			Collections.sort(originallist); // Ascending order



			Iterator<Integer> iterator = originallist.iterator();
			while (iterator.hasNext()) {
				ascendingorderiterator = iterator.next();
				//		System.out.println("ascendingorderiterator02-----" + ascendingorderiterator02);

				ascendingorder = Integer.toString(ascendingorderiterator);  
			}
			if(SerialNo_Asc == ascendingorderiterator){
				Report.ReporterOutput("STEP","Verify Serial No is displayed in Ascending Order ",originallist.toString(),"Click on Serial No","Serial No should be displayed in ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Serial No is displayed in Ascending Order ",originallist.toString(),"Click on Serial No","Serial No should is not displayed in ascending Order","Fail",null);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}




	//****** Descending  Serial No Sorting*************************************************************************************
	public static void descendingSerialNoSorting() throws Throwable {
		try {

			//Descending   //For printing List after clicking once
			PageObjects_ProjectAttribute_EngagementModel.Sorting_SNo(Constant.driver).click();
			Thread.sleep(3000);

			List<WebElement> originalSavedSerialNo = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[1]")));
			Thread.sleep(2000);                                                                  
			System.out.println("Descending  Currency Name Sorting : For printing List after clicking once");
			for(int i=0; i<originalSavedSerialNo.size(); i++) 
			{
				String	gettextSNo1 = originalSavedSerialNo.get(i).getText();


				int iTest3 = Integer.parseInt(gettextSNo1);
				originallist1.add(iTest3);
				SerialNo_Dsc = originallist1.get(i);
				//			System.out.println("SerialNo_Desc-------" +   SerialNo_Dsc);
			}
			Collections.sort(originallist1); // Ascending order
			Collections.reverse(originallist1);


			Iterator<Integer> iterator1 = originallist1.iterator();
			while (iterator1.hasNext()) {
				descendingorderiterator1 = iterator1.next();
				//		System.out.println("descendingorderiterator03-----" + descendingorderiterator03);
			}
			if(SerialNo_Dsc == descendingorderiterator1){
				Report.ReporterOutput("STEP","Verify Serial No is displayed in Descending Order ",originallist1.toString(),"Click on Serial No","Serial No should be displayed in Descending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Serial No is displayed in Descending Order ",originallist1.toString(),"Click on Serial No","Serial No should is not displayed in Descending Order","Fail",null);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//****** Ascending  Engagement Model Name Sorting*************************************************************************************
	public static void ascendingEngagementModelNameSorting() throws Throwable {
		try {
			//Ascending   //For printing List after clicking once
			PageObjects_ProjectAttribute_EngagementModel.Sorting_EngagementModelName(Constant.driver).click();
			Thread.sleep(2000);
			List<WebElement> originalSavedEngagementModel = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")));
			Thread.sleep(1000);                                                                  
			System.out.println("Ascending  Engagement Model Sorting : For printing List after clicking once");
			for(int i=0; i<originalSavedEngagementModel.size(); i++) 
			{
				String a = originalSavedEngagementModel.get(i).getText();
				originallist2.add(a);
				EngagementModelName_Asc = originallist2.get(i).toString();
				//System.out.println("EngagementModelName_Asc-------" +   EngagementModelName_Asc);
			}
			Collections.sort(originallist2); // Ascending order

			Iterator<String> iterator2 = originallist2.listIterator();
			while (iterator2.hasNext()) {
				ascendingorderiterator2 = iterator2.next().toString();
				//System.out.println("ascendingorderiterator-----" + ascendingorderiterator);
			}
			if(EngagementModelName_Asc.equals(ascendingorderiterator2)){
				Report.ReporterOutput("STEP","Verify Engagement Model Name is displayed in Ascending Order ",originallist2.toString(),"Click on Engagement Model Name","Engagement Model Name should be displayed in ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Engagement Model Name is displayed in Ascending Order ",originallist2.toString(),"Click on Engagement Model Name","Engagement Model Name should is not displayed in ascending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//************..Descending Engagement Model Name Sorting*************************************************************************************
	public static void descendingEngagementModelNameSorting() throws Throwable {
		try {

			Thread.sleep(3000);
			PageObjects_ProjectAttribute_EngagementModel.Sorting_EngagementModelName(Constant.driver).click();
			//Thread.sleep(2000);
			List<WebElement>descendingOrderSortedEngagementModel = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")));                                                        
			System.out.println("Descending  Engagement Model Sorting : For printing List after clicking 2nd time");
			for(int i=0; i<descendingOrderSortedEngagementModel.size(); i++) 
			{
				String m = descendingOrderSortedEngagementModel.get(i).getText();
				originallist3.add(m);
				EngagementModelName_Dsc= originallist3.get(i).toString();
			//	System.out.println("EngagementModelName_Dsc-------" +   EngagementModelName_Dsc);
			}

			Collections.sort(originallist3);
			Collections.reverse(originallist3);

			Collections.sort(originallist3, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return -s1.compareToIgnoreCase(s2);
				}
			});

			Iterator<String> iterator3 = originallist3.iterator();
			while (iterator3.hasNext()) {
				descendingorderiterator3 = iterator3.next().toString();
			//	System.out.println("descendingorderiterator3-----" + descendingorderiterator3);
			}
			if(EngagementModelName_Dsc.equals(descendingorderiterator3)){
				Report.ReporterOutput("STEP","Verify Engagement Model Name is displayed in Descending Order ",originallist3.toString(),"Click on Engagement Model Name","Engagement Model Name should be displayed in Descending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Engagement Model Name is displayed in Descending Order ",originallist3.toString(),"Click on Engagement Model Name","Engagement Model Name is not displayed in Descending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//****** Ascending  Time sheet Compulsory Name Sorting*************************************************************************************
	public static void ascendingTimesheetCompulsorySorting() throws Throwable {
		try {
			//Ascending   //For printing List after clicking once
			PageObjects_ProjectAttribute_EngagementModel.Sorting_TimesheetCompulsory(Constant.driver).click();
			Thread.sleep(2000);
			List<WebElement> originalSavedTimesheetCompulsory = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]")));
			Thread.sleep(1000);                                                                  
			System.out.println("Ascending  Timesheet Compulsory Sorting : For printing List after clicking once");
			for(int i=0; i<originalSavedTimesheetCompulsory.size(); i++) 
			{
				String a = originalSavedTimesheetCompulsory.get(i).getText();
				originallist4.add(a);
				TimesheetCompulsory_Asc = originallist4.get(i).toString();
				//System.out.println("EngagementModelName_Asc-------" +   EngagementModelName_Asc);
			}
			Collections.sort(originallist4); // Ascending order

			Iterator<String> iterator4 = originallist4.listIterator();
			while (iterator4.hasNext()) {
				ascendingorderiterator4 = iterator4.next().toString();
				//System.out.println("ascendingorderiterator-----" + ascendingorderiterator);
			}
			if(TimesheetCompulsory_Asc.equals(ascendingorderiterator4)){
				Report.ReporterOutput("STEP","Verify Timesheet Compulsory is displayed in Ascending Order ",originallist4.toString(),"Click on Timesheet Compulsory","Timesheet Compulsory should be displayed in ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Timesheet Compulsory is displayed in Ascending Order ",originallist4.toString(),"Click on Timesheet Compulsory","Timesheet Compulsory should is not displayed in ascending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//************..Descending Time sheet Compulsory Name Sorting*************************************************************************************
	public static void descendingTimesheetCompulsorySorting() throws Throwable {
		try {

			Thread.sleep(2000);
			PageObjects_ProjectAttribute_EngagementModel.Sorting_TimesheetCompulsory(Constant.driver).click();
			//Thread.sleep(2000);
			List<WebElement>descendingOrderSortedTimesheetCompulsory = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]")));                                                        
			System.out.println("Descending  Timesheet Compulsory Sorting : For printing List after clicking 2nd time");
			for(int i=0; i<descendingOrderSortedTimesheetCompulsory.size(); i++) 
			{
				String c = descendingOrderSortedTimesheetCompulsory.get(i).getText();
				originallist5.add(c);
				TimesheetCompulsory_Dsc= originallist5.get(i).toString();
				//		System.out.println("CurrencyName_Dsc-------" +   CurrencyName_Dsc);
			}

			Collections.sort(originallist5);
			Collections.reverse(originallist5);


			Iterator<String> iterator5 = originallist5.iterator();
			while (iterator5.hasNext()) {
				descendingorderiterator5 = iterator5.next().toString();
				//		System.out.println("descendingorderiterator01-----" + descendingorderiterator01);
			}
			if(TimesheetCompulsory_Dsc.equals(descendingorderiterator5)){
				Report.ReporterOutput("STEP","Verify Timesheet Compulsory is displayed in Descending Order ",originallist5.toString(),"Click on Timesheet Compulsory","Timesheet Compulsory should be displayed in Descending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Timesheet Compulsory is displayed in Descending Order ",originallist5.toString(),"Click on Timesheet Compulsory","Timesheet Compulsory is not displayed in Descending Order","Fail",null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//***********************************Add New Engagement Model ******************************************************************
	public static void AddNew_EngagementModel(String Add_EngagementModel) throws Throwable{

		Thread.sleep(1000);
		if (PageObjects_ProjectAttribute_EngagementModel.link_AddNew(Constant.driver).isDisplayed()){
			Thread.sleep(2000);
			PageObjects_ProjectAttribute_EngagementModel.Sorting_EngagementModelName(Constant.driver).click();
			Thread.sleep(1000);
			PageObjects_ProjectAttribute_EngagementModel.link_AddNew(Constant.driver).click();
			Thread.sleep(2000);
			Report.ReporterOutput("STEP", "Verify Add New Link is Visible", "Add New Link", "Click on Add New Link", "add New Link should be Visible", "Pass", null);
		}
		else{
			Report.ReporterOutput("STEP", "Verify Add New Link is Visible", "Add New Link", "Click on Add New Link", "add New Link not Visible", "Fail", null);
		}
		if (PageObjects_ProjectAttribute_EngagementModel.TextBox_EngagementModel(Constant.driver).isDisplayed()){
			PageObjects_ProjectAttribute_EngagementModel.TextBox_EngagementModel(Constant.driver).sendKeys(Add_EngagementModel);

			Report.ReporterOutput("STEP", "Verify Engagement Model edit box is Displayed", "Engagement Model edit box", "Engagement Model edit box should Displayed", "Engagement Model edit box should Displayed successfully", "Pass", null);


		}
		else {
			Report.ReporterOutput("STEP", "Verify Engagement Model edit box is Displayed", "Engagement Model edit box", "Engagement Model edit box should Displayed", "Engagement Model edit box not Displayed", "Fail", null);
		}
		Thread.sleep(2000);
		// For Click on Save button
		if (PageObjects_ProjectAttribute_EngagementModel.link_Save(Constant.driver).isDisplayed()){

			PageObjects_ProjectAttribute_EngagementModel.link_Save(Constant.driver).click();
			Report.ReporterOutput("STEP", "Verify save button for add Engagement Model is Displayed", "save button for Add Phrase", "Click on save button for add Engagement Model", "save button for add Engagement Model should be displayed and clicked", "Pass", null);

		}
		else {
			Report.ReporterOutput("STEP", "Verify save button for add Engagement Model is Displayed", "save button for Add Phrase", "Click on save button for add Engagement Model", "save button for add Engagement Model is not displayed", "Fail", null);
		}


	}

	//*****************Search functionality for Engagement Model ***********************
	public static void search_EngagementModel(String EngagementModelToSearch) throws Throwable {
		try{
			Thread.sleep(11000);						
			PageObjects_ProjectAttribute_EngagementModel.TextBox_Search(Constant.driver).clear();
			if (PageObjects_ProjectAttribute_EngagementModel.TextBox_Search(Constant.driver).isDisplayed()){
				PageObjects_ProjectAttribute_EngagementModel.TextBox_Search(Constant.driver).click();
				Thread.sleep(1000);
				PageObjects_ProjectAttribute_EngagementModel.TextBox_Search(Constant.driver).clear();
				PageObjects_ProjectAttribute_EngagementModel.TextBox_Search(Constant.driver).sendKeys(EngagementModelToSearch);
				Report.ReporterOutput("STEP", "Verify search box is Displayed", EngagementModelToSearch , "Click on search box", "search box displayed and clicked successfully", "Pass", null);


			}
			else {
				Report.ReporterOutput("STEP", "Verify search Box is Displayed", EngagementModelToSearch , "Click on search Box", "search Box should be displayed and clicked", "Fail", null);
			}
		}catch (Exception e){
			e.printStackTrace();
		}

	}

	//*****************  Edit Engagement Model *******************************************************
	public static void Edit_EngagementModel( String EngagementModelToSearch , String UpdateEngagementModel )throws Throwable {
		try{


			Thread.sleep(6000);
			if (PageObjects_ProjectAttribute_EngagementModel.link_edit(Constant.driver).isDisplayed()){
				PageObjects_ProjectAttribute_EngagementModel.link_edit(Constant.driver).click();
				Thread.sleep(2000);
				PageObjects_ProjectAttribute_EngagementModel.TextBox_EngagementModel(Constant.driver).clear();

				Thread.sleep(1500);
				PageObjects_ProjectAttribute_EngagementModel.TextBox_EngagementModel(Constant.driver).sendKeys(UpdateEngagementModel);
				Report.ReporterOutput("STEP","Verify edit button is Visible ","edit button","Click on edit button","edit button displayed and clicked successfully","Pass",null);
				//Thread.sleep(2000);
			}
			else {
				Report.ReporterOutput("STEP","Verify edit button is Visible ","edit button","Click on edit button","edit button is not displayed","fail",null);
			}


			//save button for Engagement Model
			if (PageObjects_ProjectAttribute_EngagementModel.link_Save(Constant.driver).isDisplayed()){
				PageObjects_ProjectAttribute_EngagementModel.link_Save(Constant.driver).click();
				Report.ReporterOutput("STEP"," Verify save button is Displayed "," Save button for adding Engagement Model "," Click on save button for Add Engagement Model"," Save button for Add Engagement Model displayed and clicked successfully","Pass",null);

			}
			else {
				Report.ReporterOutput("STEP"," Verify save button is Displayed  ","  Save button for adding Engagement Model "," Click on save button for Add Engagement Model"," Save button for Add Phrases is not displayed","Fail",null);
			}
			
			/*	String successMsg=Constant.driver.findElement(By.xpath("//div[contains(@class,'toast-message')]")).getText();

			            //System.out.println(successMsg);

			          if (successMsg.contains("successfully")) {
			                            Report.ReporterOutput("STEP","Verify save confirmation Msg is Visible ",successMsg,"Click on save confirmation Msg","save confirmation Msg displayed and clicked","Pass",null);
			            }
			            else {
			                            Report.ReporterOutput("STEP","Verify save confirmation Msg is Visible ",successMsg,"Click on save confirmation Msg","save confirmation Msg is not displayed","Fail",null);
			            }*/

			// Logic to Search old Engagement Model to verify old Engagement Model not available in list 
			Thread.sleep(15000);
			
			PageObjects_ProjectAttribute_EngagementModel.TextBox_Search(Constant.driver).clear();
			if (PageObjects_ProjectAttribute_EngagementModel.TextBox_Search(Constant.driver).isDisplayed()){

				PageObjects_ProjectAttribute_EngagementModel.TextBox_Search(Constant.driver).clear();

				Thread.sleep(1000);
				PageObjects_ProjectAttribute_EngagementModel.TextBox_Search(Constant.driver).sendKeys(EngagementModelToSearch);
				Report.ReporterOutput("STEP", "Verify Engagement Model Name deleted. ", EngagementModelToSearch , "Engagement Model should be deleted succesfully", "Engagement Model field should be deleted succesfully", "Pass", null);


			}
			else {
				Report.ReporterOutput("STEP", "Verify Engagement Model Name deleted.", EngagementModelToSearch , "Engagement Model should be deleted succesfully", "Engagement Model field should be not deleted succesfully", "Fail", null);
			}
			Thread.sleep(3000);
			String NoMatchingFoundEngagementModelName  = Constant.driver.findElement(By.xpath(".//*[@id='example']/tbody/tr/td")).getText().trim();

			Thread.sleep(3000);
			if(NoMatchingFoundEngagementModelName.contains("No matching records found")){

				Report.ReporterOutput("STEP", " Verify old Engagement Model deleted from the list successfully.", NoMatchingFoundEngagementModelName , "old Engagement Model should be deleted from the list successfully.", "old Engagement Model deleted from the list successfully. ", "Pass", null);
				//Giving output from First add Method
			}
			else{
				Report.ReporterOutput("STEP", "Verify old Engagement Model deleted from the list successfully.", NoMatchingFoundEngagementModelName , "old Engagement Model should be deleted from the list successfully.", "old Engagement Model not deleted from the list successfully. ", "Fail", null);
			}



			Thread.sleep(15000);
			// Logic to Search  Engagement Model which is already added successfully 
			PageObjects_ProjectAttribute_EngagementModel.TextBox_Search(Constant.driver).clear();
			if (PageObjects_ProjectAttribute_EngagementModel.TextBox_Search(Constant.driver).isDisplayed()){
				PageObjects_ProjectAttribute_EngagementModel.TextBox_Search(Constant.driver).click();
				Thread.sleep(1000);
				PageObjects_ProjectAttribute_EngagementModel.TextBox_Search(Constant.driver).clear();
				PageObjects_ProjectAttribute_EngagementModel.TextBox_Search(Constant.driver).sendKeys(UpdateEngagementModel);
				Report.ReporterOutput("STEP", "Verify search Box is Displayed", UpdateEngagementModel , "Click on search Box", "search Box should be displayed and clicked", "Pass", null);


			}
			else {
				Report.ReporterOutput("STEP", "Verify search Box is Displayed", UpdateEngagementModel , "Click on search Box", "search Box should be displayed and clicked", "Fail", null);
			}

			String EngagementModelName  = Constant.driver.findElement(By.xpath("//*[@class='dataTables_wrapper']/table/tbody/tr/td[2]")).getText();

			if(EngagementModelName.contains(UpdateEngagementModel)){

				Report.ReporterOutput("STEP", "Verify Engagement Model Name is searchable and Engagement Model field has been Updated successfully ", EngagementModelName, "Engagement Model field should be Updated succesfully", "Engagement Model field should be Updated succesfully", "Pass", null);

			}
			else{
				Report.ReporterOutput("STEP", "Verify Engagement Model Name is searchable and Engagement Model field has been Updated successfully", EngagementModelName, "Engagement Model field should be Updated successfully", "Engagement Model field not Updated ", "fail", null);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public static void Delete_EngagementModel(String Del_EngagementModel)throws Throwable {	

		try{
			Thread.sleep(10000);
			if (PageObjects_ProjectAttribute_EngagementModel.TextBox_Search(Constant.driver).isDisplayed()){
				Thread.sleep(3000);
				PageObjects_ProjectAttribute_EngagementModel.TextBox_Search(Constant.driver).clear();
				Thread.sleep(3000);
				PageObjects_ProjectAttribute_EngagementModel.TextBox_Search(Constant.driver).sendKeys(Del_EngagementModel);
				Report.ReporterOutput("STEP", "Verify search Box is Displayed", Del_EngagementModel , "Click on search box", "search box should be displayed and clicked", "Pass", null);


			}
			else {
				Report.ReporterOutput("STEP", "Verify search Box is Displayed", Del_EngagementModel , "Click on search box", "search box should be displayed and clicked", "Fail", null);
			}
			Thread.sleep(3000);
			if (PageObjects_ProjectAttribute_EngagementModel.Link_Delete(Constant.driver).isDisplayed()){
				Thread.sleep(3000);
				PageObjects_ProjectAttribute_EngagementModel.Link_Delete(Constant.driver).click();
				Thread.sleep(1000);


				Report.ReporterOutput("STEP", "Verify Delete is Visible ", "Delete link", "Click on Delete link", "Delete link displayed and Engagement Model name Deleted Successfully.", "Pass", null);

			}
			else{
				Report.ReporterOutput("STEP", "Verify Delete is Visible", "Delete link", "Click on Delete link", "Delete link not displayed and Engagement Model name not Deleted Successfully.", "Fail", null);
			}
			Thread.sleep(10000);
			Constant.driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
			Thread.sleep(3000);
			PageObjects_ProjectAttribute_EngagementModel.TextBox_Search(Constant.driver).clear();
			Thread.sleep(3000);
			PageObjects_ProjectAttribute_EngagementModel.TextBox_Search(Constant.driver).sendKeys(Del_EngagementModel);
			String NoMatchFoundMsgg=Constant.driver.findElement(By.xpath(".//*[@id='example']/tbody/tr/td")).getText();

			if (NoMatchFoundMsgg.contains("No matching")){

				Report.ReporterOutput("STEP", "Verify Engagement Model : "+ Del_EngagementModel + " is Deleted from list successfully", Del_EngagementModel , "Engagement Model : "+Del_EngagementModel + " Should be Deleted from list successfully", "Verifed Engagement Model : "+Del_EngagementModel + "  is Deleted from list successfully", "Pass", null);

			}
			else {
				Report.ReporterOutput("STEP", "Verify Engagement Model : "+ Del_EngagementModel + " is Deleted from list successfully", Del_EngagementModel , "Engagement Model : "+Del_EngagementModel + " Should be Deleted from list successfully", "Verifed Engagement Model : "+Del_EngagementModel + " not Deleted from list successfully", "Fail", null);
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}


}








