package com.yash.RMS.TestAction.ProjectAttribute;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.ProjectAttribute.PageObjects_ProjectAttribute_Currency;

public class Action_Currency {
	public static String CurrencyName_Asc;
	public static String  ascendingorderiterator;
	public static String CurrencyName_Dsc;
	public static String  descendingorderiterator01;
	public static int ascendingorderiterator02;
	public static int  descendingorderiterator03;
	public static String Asc;
	public static int SerialNo_Dsc;
	public static int SerialNo_Asc;
	
	public static String ascendingorder;
	public static String gettextSNo1;
	
	public static ArrayList<String> originallist = new ArrayList<String>();
	public static ArrayList<String> originallist1 = new ArrayList<String>();
	public static ArrayList<Integer> originallist2 = new ArrayList<Integer>();
	public static ArrayList<Integer> originallist3 = new ArrayList<Integer>();
	// ***********************************  Navigate on Currency *********************************************************************************************

	public static void CurrencyPageNavigation() throws Throwable{
		try{
			Thread.sleep(4000);
			//click on Master Data Link : main menu click
			if(PageObjects_ProjectAttribute_Currency.lnk_MasterData(Constant.driver).isDisplayed()){
				PageObjects_ProjectAttribute_Currency.lnk_MasterData(Constant.driver).click();
				Thread.sleep(4000);
				Report.ReporterOutput("STEP","Master Data Link is displayed "," Master Data Link","Click on Master Data  Link","Master Data Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Master Data Link is displayed "," Master Data Link","Click on Master Data  Link","Master Data Link  is not displayed","Fail",null);
			}
			Thread.sleep(1000);
			//Click on lnk_Project Attribute : sub menu click 

			if (PageObjects_ProjectAttribute_Currency.lnk_ProjectAttribute(Constant.driver).isDisplayed()) {
				Thread.sleep(1000);
				PageObjects_ProjectAttribute_Currency.lnk_ProjectAttribute(Constant.driver).click();

				Report.ReporterOutput("STEP","Verify Project Attribute link is displayed "," Project Attribute ","Click on Project Attribute Link","Project Attribute Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Project Attribute link is displayed "," Project Attribute ","Click on Project Attribute Link","Project Attribute Link not displayed","Fail",null);
			}
			//Click on lnk_Currency : sub menu click 
			if (PageObjects_ProjectAttribute_Currency.lnk_Currency(Constant.driver).isDisplayed()) {
				Thread.sleep(1000);
				PageObjects_ProjectAttribute_Currency.lnk_Currency(Constant.driver).click();

				Report.ReporterOutput("STEP","Verify Currency link is displayed "," Currency ","Click on Currency Link","Currency Link should be displayed and clicked","Pass",null);
			}
			else {
				Report.ReporterOutput("STEP","Verify Currency link is displayed "," Currency ","Click on Currency Link","Currency Link not displayed","Fail",null);
			}
			//Verify Text  Currency on the page
			Thread.sleep(4000);
			String Text_Currency = PageObjects_ProjectAttribute_Currency.Text_Currency(Constant.driver).getText();
			if (Text_Currency.equalsIgnoreCase("Currency")) {
				Report.ReporterOutput("STEP","Verify Text Currency is Visible ","Text Currency"," Text Currency is visible "," Text Currency is visible","Pass",null);
			} else {
				Report.ReporterOutput("STEP","Verify Text Currency is Visible  ","Text Currency"," Text Currency is not visible "," Text Currency is not visible","Fail",null);
			}
			Thread.sleep(2000);

		}catch (Exception e){
			e.printStackTrace();
		}

	}
	//****** Ascending  Serial No Sorting*************************************************************************************
	public static void ascendingSerialNoSorting() throws Throwable {
		try {
			/*WebElement mySelectElement = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/label/select"));
			Select dropdown= new Select(mySelectElement);
			dropdown.selectByVisibleText("10");*/
			//Ascending   //For printing List after clicking once
			
			Thread.sleep(2000);
			List<WebElement> originalSavedSerialNo = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[1]")));
			Thread.sleep(1000);                                                                  
			System.out.println("Ascending  Currency Name Sorting : For printing List after clicking once");
			for(int i=0; i<originalSavedSerialNo.size(); i++) 
			{
				String gettextSNo = originalSavedSerialNo.get(i).getText();
				
				 int iTest = Integer.parseInt(gettextSNo);
				originallist2.add(iTest);
				SerialNo_Asc = originallist2.get(i);
		//		System.out.println("SerialNo_Asc-------" +   SerialNo_Asc);
			}
		      Collections.sort(originallist2); // Ascending order
		      
			

			Iterator<Integer> iterator2 = originallist2.iterator();
			while (iterator2.hasNext()) {
				ascendingorderiterator02 = iterator2.next();
		//		System.out.println("ascendingorderiterator02-----" + ascendingorderiterator02);
				
				ascendingorder = Integer.toString(ascendingorderiterator02);  
			}
			if(SerialNo_Asc == ascendingorderiterator02){
				Report.ReporterOutput("STEP","Verify Serial No is displayed in Ascending Order ",originallist2.toString(),"Click on Serial No","Serial No should be displayed in ascending Order","Pass",null);
			}else
			{
				Report.ReporterOutput("STEP","Verify Serial No is displayed in Ascending Order ",originallist2.toString(),"Click on Serial No","Serial No should is not displayed in ascending Order","Fail",null);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//****** Descending  Serial No Sorting*************************************************************************************
		public static void descendingSerialNoSorting() throws Throwable {
			try {
			
				//Descending   //For printing List after clicking once
				PageObjects_ProjectAttribute_Currency.Sorting_SerialNolist(Constant.driver).click();
				Thread.sleep(2000);
				/*PageObjects_ProjectAttribute_Currency.Sorting_SerialNolist(Constant.driver).click();
				Thread.sleep(2000);*/
				List<WebElement> originalSavedSerialNo = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[1]")));
				Thread.sleep(1000);                                                                  
				System.out.println("Descending  Currency Name Sorting : For printing List after clicking once");
				for(int i=0; i<originalSavedSerialNo.size(); i++) 
				{
					 gettextSNo1 = originalSavedSerialNo.get(i).getText();
					
					 int iTest3 = Integer.parseInt(gettextSNo1);
					originallist3.add(iTest3);
					SerialNo_Dsc = originallist3.get(i);
		//			System.out.println("SerialNo_Desc-------" +   SerialNo_Dsc);
				}
			      Collections.sort(originallist3); // Ascending order
			      Collections.reverse(originallist3);
				

				Iterator<Integer> iterator2 = originallist3.iterator();
				while (iterator2.hasNext()) {
					descendingorderiterator03 = iterator2.next();
			//		System.out.println("descendingorderiterator03-----" + descendingorderiterator03);
				}
				if(SerialNo_Dsc == descendingorderiterator03){
					Report.ReporterOutput("STEP","Verify Serial No is displayed in Descending Order ",originallist3.toString(),"Click on Serial No","Serial No should be displayed in Descending Order","Pass",null);
				}else
				{
					Report.ReporterOutput("STEP","Verify Serial No is displayed in Descending Order ",originallist3.toString(),"Click on Serial No","Serial No should is not displayed in Descending Order","Fail",null);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	
	
	
	//****** Ascending  Currency Name Sorting*************************************************************************************
		public static void ascendingCurrencyNameSorting() throws Throwable {
			try {
				//Ascending   //For printing List after clicking once
				PageObjects_ProjectAttribute_Currency.Sorting_CurrencyNamelist(Constant.driver).click();
				Thread.sleep(2000);
				List<WebElement> originalSavedCurrencyName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")));
				Thread.sleep(1000);                                                                  
				System.out.println("Ascending  Currency Name Sorting : For printing List after clicking once");
				for(int i=0; i<originalSavedCurrencyName.size(); i++) 
				{
					String a = originalSavedCurrencyName.get(i).getText();
					originallist.add(a);
					CurrencyName_Asc = originallist.get(i).toString();
					//System.out.println("CurrencyName_Asc-------" +   CurrencyName_Asc);
				}
				Collections.sort(originallist); // Ascending order
				
				Iterator<String> iterator = originallist.listIterator();
				while (iterator.hasNext()) {
					ascendingorderiterator = iterator.next().toString();
					//System.out.println("ascendingorderiterator-----" + ascendingorderiterator);
				}
				if(CurrencyName_Asc.equals(ascendingorderiterator)){
					Report.ReporterOutput("STEP","Verify Currency Name is displayed in Ascending Order ",originallist.toString(),"Click on Currency Name","Currency Name should be displayed in ascending Order","Pass",null);
				}else
				{
					Report.ReporterOutput("STEP","Verify Currency Name is displayed in Ascending Order ",originallist.toString(),"Click on Currency Name","Currency Name should is not displayed in ascending Order","Fail",null);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		//************..Descending Currency Name Sorting*************************************************************************************
		public static void descendingCurrencyNameSorting() throws Throwable {
			try {
				//PageObjects_ProjectAttribute_Currency.Sorting_CurrencyNamelist(Constant.driver).click();
				Thread.sleep(2000);
				PageObjects_ProjectAttribute_Currency.Sorting_CurrencyNamelist(Constant.driver).click();
				//Thread.sleep(2000);
				List<WebElement>descendingOrderSortedCurrencyName = (Constant.driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")));                                                        
				System.out.println("Descending  Currency Name Sorting : For printing List after clicking 2nd time");
				for(int i=0; i<descendingOrderSortedCurrencyName.size(); i++) 
				{
					String b = descendingOrderSortedCurrencyName.get(i).getText();
					originallist1.add(b);
					CurrencyName_Dsc= originallist1.get(i).toString();
			//		System.out.println("CurrencyName_Dsc-------" +   CurrencyName_Dsc);
				}
				
				Collections.sort(originallist1);
				Collections.reverse(originallist1);
				
				
				Iterator<String> iterator01 = originallist1.iterator();
				while (iterator01.hasNext()) {
					descendingorderiterator01 = iterator01.next().toString();
			//		System.out.println("descendingorderiterator01-----" + descendingorderiterator01);
				}
				if(CurrencyName_Dsc.equals(descendingorderiterator01)){
					Report.ReporterOutput("STEP","Verify Currency Name is displayed in Descending Order ",originallist1.toString(),"Click on Currency Name","Currency Name should be displayed in Descending Order","Pass",null);
				}else
				{
					Report.ReporterOutput("STEP","Verify Currency Name is displayed in Descending Order ",originallist1.toString(),"Click on Currency Name","Currency Name is not displayed in Descending Order","Fail",null);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		// ***********************************  Add New Currency *********************************************************************************************

	public static void Create_Currency(String CurrencyName) throws Throwable{
		try{
		
			Thread.sleep(3000);
			if (PageObjects_ProjectAttribute_Currency.link_AddNew(Constant.driver).isDisplayed()){
				PageObjects_ProjectAttribute_Currency.Sorting_CurrencyNamelist(Constant.driver).click();
				PageObjects_ProjectAttribute_Currency.link_AddNew(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("STEP", "Verify Add New Link is Visible", "Add New Link", "Click on Add New Link", "add New Link should be Visible", "Pass", null);
			}
			else{
				Report.ReporterOutput("STEP", "Verify Add New Link is Visible", "Add New Link", "Click on Add New Link", "add New Link not Visible", "Fail", null);
			}
			Thread.sleep(4000);
			if (PageObjects_ProjectAttribute_Currency.TextBox_CurrencyName(Constant.driver).isDisplayed()){
				PageObjects_ProjectAttribute_Currency.TextBox_CurrencyName(Constant.driver).click();
				Thread.sleep(2000);
				PageObjects_ProjectAttribute_Currency.TextBox_CurrencyName(Constant.driver).sendKeys(CurrencyName);
				//PageObjects_ProjectAttribute_Currency.Link_Save(Constant.driver).click();

			}
			Thread.sleep(2000);
			if(PageObjects_ProjectAttribute_Currency.Link_Save(Constant.driver).isDisplayed()){
				Thread.sleep(1000);
				PageObjects_ProjectAttribute_Currency.Link_Save(Constant.driver).click();
				Report.ReporterOutput("STEP", "Verify save link for Add new currency is Displayed", "Save link ", "Click on save link for Add new currency", "Save link for Add new currency should be displayed and clicked", "Pass", null);
				System.out.println("save clicked");
			}
			else {
				Report.ReporterOutput("STEP", "Verify save link for Add new currency is Displayed", "Save link ", "not clicked on save link for Add new currency", "Save link for Add new currency is not displayed", "Fail", null);
			}
			/*Thread.sleep(3000);
            //TO Verify the Confirmation message after the save button hit   
			// String successMsg=Constant.driver.findElement(By.xpath("//div[contains(@class,'toast-message')]")).getText();
			 String successMsg=Constant.driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
			 Thread.sleep(1000);
			 System.out.println("successMsg");

	          if (successMsg.contains("successfully")) {
	                            Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ",successMsg,"Click on save Confirmation Msg","save Confirmation Msg displayed and clicked","Pass",null);
	            }
	            else {
	                            Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ",successMsg,"Click on save Confirmation Msg","save Confirmation Msg is not displayed","Fail",null);
	            }*/
			//  Verify enter currency saved successfully
			Thread.sleep(9000);
			if (PageObjects_ProjectAttribute_Currency.Textbox_Search(Constant.driver).isDisplayed()){
				PageObjects_ProjectAttribute_Currency.Textbox_Search(Constant.driver).sendKeys(CurrencyName);
				Report.ReporterOutput("STEP", "Verify Search Box is Displayed", CurrencyName , "Click on Search Box", "search Box should be displayed and clicked", "Pass", null);


			}
			else {
				Report.ReporterOutput("STEP", "Verify Search Box is Displayed", CurrencyName , "Click on Search Box", "search Box should be displayed and clicked", "Fail", null);
			}
			Thread.sleep(4000);
			// String GetCurrentcyNameVal=Constant.driver.findElement(By.xpath("//*[@class='odd even']//td[2]")).getText();
			String GetCurrentcyNameVal=Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText();
			System.out.println(GetCurrentcyNameVal);
			Thread.sleep(2000);

			if (CurrencyName.equalsIgnoreCase(GetCurrentcyNameVal)){
				Report.ReporterOutput("STEP", "Verify New added Currency name : " +CurrencyName+ " is searched successfully ", CurrencyName, "New added Currency name : " +CurrencyName+ " is searched successfully" , "New added Currency name :" +CurrencyName+ "  is searched successfully ", "Pass", null);

			}
			else{
				Report.ReporterOutput("STEP", "Verify New added Currency name : " +CurrencyName+ " is searched successfully  ", CurrencyName, "New added Currency is not searched ", "New added Currency name :" +CurrencyName+ "  is not searched successfully  ", "Fail", null);
			}



		}catch(Exception e){
			e.printStackTrace();
		}

	}

	// ***********************************  Edit Currency *********************************************************************************************

	public static  void Edit_Currency(String CurrencyName,String Edit_NewCurrencyName) throws Throwable{
		try{
			if (PageObjects_ProjectAttribute_Currency.Textbox_Search(Constant.driver).isDisplayed()){
				PageObjects_ProjectAttribute_Currency.Textbox_Search(Constant.driver).clear();
				Thread.sleep(3000);
				PageObjects_ProjectAttribute_Currency.Textbox_Search(Constant.driver).sendKeys(CurrencyName);
				Report.ReporterOutput("STEP", "Verify Search Box is Displayed", CurrencyName , "Click on Search Box", "search Box should be displayed and clicked", "Pass", null);


			}
			else {
				Report.ReporterOutput("STEP", "Verify Search Box is Displayed", CurrencyName , "Click on Search Box", "search Box should be displayed and clicked", "Fail", null);
			}
			if (PageObjects_ProjectAttribute_Currency.Link_Edit(Constant.driver).isDisplayed()){
				PageObjects_ProjectAttribute_Currency.Link_Edit(Constant.driver).click();
				Thread.sleep(3000);
				PageObjects_ProjectAttribute_Currency.TextBox_CurrencyName(Constant.driver).clear();
				Thread.sleep(3000);
				
				PageObjects_ProjectAttribute_Currency.TextBox_CurrencyName(Constant.driver).sendKeys(Edit_NewCurrencyName);
				Report.ReporterOutput("STEP", "Verify Currency Name Edit box is displayed.", Edit_NewCurrencyName , "Currency Name Edit text box should be enabled and New Edit Currency value is entered.", "Edit text box is enabled and value is entered.", "Pass", null);

			}
			else {
				Report.ReporterOutput("STEP", "Verify Currency Name Edit box is displayed.", Edit_NewCurrencyName , "Currency Name Edit text box not enabled and New Edit Currency value not entered.", "Edit text box is enabled and value is not entered.", "Fail", null);
			}
			if (PageObjects_ProjectAttribute_Currency.Link_Save(Constant.driver).isDisplayed()){

				PageObjects_ProjectAttribute_Currency.Link_Save(Constant.driver).click();
				System.out.println("Hi");
				

				Report.ReporterOutput("STEP", "Verify Save Link is  displayed.", "Save Link" , "Save Link should be enabled and clicked..", "	Save Link is enabled and clicked..", "Pass", null);

			}
			else {
				Report.ReporterOutput("STEP", "	Verify Save Link is  displayed.", "Save Link" , "Save Link should be enabled and clicked.", "	Save Link is not enabled and clicked..", "Fail", null);
			}
			/*Thread.sleep(10000);
            //TO Verify the Confirmation message after the save button hit   
			// String successMsg=Constant.driver.findElement(By.xpath("//div[contains(@class,'toast-message')]")).getText();
			 String SavesuccessMsg=Constant.driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
			 Thread.sleep(1000);
			 System.out.println("SavesuccessMsg");

	          if (SavesuccessMsg.contains("successfully")) {
	                            Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ",SavesuccessMsg,"Click on save Confirmation Msg","save Confirmation Msg displayed and clicked","Pass",null);
	            }
	            else {
	                            Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ",SavesuccessMsg,"Click on save Confirmation Msg","save Confirmation Msg is not displayed","Fail",null);
	            }
*/
			Thread.sleep(10000);


			if (PageObjects_ProjectAttribute_Currency.Textbox_Search(Constant.driver).isDisplayed()){
				PageObjects_ProjectAttribute_Currency.Textbox_Search(Constant.driver).clear();
				Thread.sleep(3000);
				PageObjects_ProjectAttribute_Currency.Textbox_Search(Constant.driver).click();
				Thread.sleep(1000);
				
				PageObjects_ProjectAttribute_Currency.Textbox_Search(Constant.driver).sendKeys(Edit_NewCurrencyName);
				Thread.sleep(1500);

				String updatedCurrencyValue  = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText();
				Thread.sleep(1500);

				if(updatedCurrencyValue.equalsIgnoreCase(Edit_NewCurrencyName)){

					Report.ReporterOutput("STEP", "Verify New Currency name :  "+ Edit_NewCurrencyName +"  has been updated.", Edit_NewCurrencyName, "Edit New Currency "+ Edit_NewCurrencyName +" should be updated.", "Add New Currency  name : " +  Edit_NewCurrencyName +" has been updated successfully.", "Pass", null);

				}
				else{
					Report.ReporterOutput("STEP", "Verify New Currency  name :  "+ Edit_NewCurrencyName +"  has been updated. ", Edit_NewCurrencyName, "Edit New Currency "+ Edit_NewCurrencyName +" should be updated.", "Add New Currency   name : " +  Edit_NewCurrencyName +" not updated successfully", "Fail", null);
				}
			}
		}catch (Exception e){
			e.printStackTrace();
		}

	}

	// ***********************************  Delete  Currency *********************************************************************************************

	public static void Delete_Currency(String Edit_NewCurrencyName) throws Throwable {
		try{

			if (PageObjects_ProjectAttribute_Currency.Textbox_Search(Constant.driver).isDisplayed()){
				Thread.sleep(3000);
				PageObjects_ProjectAttribute_Currency.Textbox_Search(Constant.driver).clear();
				Thread.sleep(3000);
				PageObjects_ProjectAttribute_Currency.Textbox_Search(Constant.driver).sendKeys(Edit_NewCurrencyName);
				Report.ReporterOutput("STEP", "Verify Search Box is Displayed", Edit_NewCurrencyName , "Click on Search Box", "search Box should be displayed and clicked", "Pass", null);


			}
			else {
				Report.ReporterOutput("STEP", "Verify Search Box is Displayed", Edit_NewCurrencyName , "Click on Search Box", "search Box should be displayed and clicked", "Fail", null);
			}
			Thread.sleep(4000);
			if (PageObjects_ProjectAttribute_Currency.Link_Delete(Constant.driver).isDisplayed()){
				Thread.sleep(1000);
				PageObjects_ProjectAttribute_Currency.Link_Delete(Constant.driver).click();
				Thread.sleep(4000);
										
				
					Report.ReporterOutput("STEP", "Verify Delete is Visible ", "Delete link", "Click on Delete link", "Delete link displayed and Currency name Deleted Successfully.", "Pass", null);

				}
				else{
					Report.ReporterOutput("STEP", "Verify Delete is Visible", "Delete link", "Click on Delete link", "Delete link not displayed and Currency name not Deleted Successfully.", "Fail", null);
				}
			/*Thread.sleep(3000);
            //TO Verify the Confirmation message after the save button hit   
			// String successMsg=Constant.driver.findElement(By.xpath("//div[contains(@class,'toast-message')]")).getText();
			 String SavesuccessMsg=Constant.driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
			 Thread.sleep(1000);
			 System.out.println("SavesuccessMsg");

	          if (SavesuccessMsg.contains("successfully")) {
	                            Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ",SavesuccessMsg,"Click on save Confirmation Msg","save Confirmation Msg displayed and clicked","Pass",null);
	            }
	            else {
	                            Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ",SavesuccessMsg,"Click on save Confirmation Msg","save Confirmation Msg is not displayed","Fail",null);
	            }*/
			
			
			Thread.sleep(2000);
			Constant.driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
			Thread.sleep(3000);
			/*if (PageObjects_ProjectAttribute_Currency.Textbox_Search(Constant.driver).isDisplayed()){
				PageObjects_ProjectAttribute_Currency.Textbox_Search(Constant.driver).clear();
				Thread.sleep(3000);
				PageObjects_ProjectAttribute_Currency.Textbox_Search(Constant.driver).sendKeys(Edit_NewCurrencyName);*/
			     Thread.sleep(10000);
				PageObjects_ProjectAttribute_Currency.Textbox_Search(Constant.driver).clear();
				Thread.sleep(2000);
				PageObjects_ProjectAttribute_Currency.Textbox_Search(Constant.driver).sendKeys(Edit_NewCurrencyName);
				 String NoMatchFoundMsg=Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td")).getText();
				 
				if (NoMatchFoundMsg.contains("No matching")){
				
				Report.ReporterOutput("STEP", "Verify currency name : "+ Edit_NewCurrencyName + " is Deleted successfully", Edit_NewCurrencyName , "Currency name : "+Edit_NewCurrencyName + "Should be Deleted successfully", "Verifed Currency name : "+Edit_NewCurrencyName + "  is Deleted successfully", "Pass", null);

			}
			else {
				Report.ReporterOutput("STEP", "Verify currency name : "+ Edit_NewCurrencyName + " is Deleted successfully", Edit_NewCurrencyName , "Currency name : "+Edit_NewCurrencyName + "Should be Deleted successfully", "Verifed Currency name : "+Edit_NewCurrencyName + " not Deleted successfully", "Fail", null);
			}
		
				Thread.sleep(2000);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
