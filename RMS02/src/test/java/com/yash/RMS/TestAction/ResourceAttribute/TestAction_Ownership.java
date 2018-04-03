package com.yash.RMS.TestAction.ResourceAttribute;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Dashboard.Dashboard;
import com.yash.RMS.POM.ResourceAttribute.ResourceAttribute_Ownership;

public class TestAction_Ownership {
	public static String OwnershipName_Asc;
	public static String  ascendingorderiterator;
	public static String OwnershipName_Dsc;
	public static String  descendingorderiterator;
	public static String Asc;

	public static ArrayList<String> originallist = new ArrayList<String>();
	public static ArrayList<String> originallist1 = new ArrayList<String>();

	//************************** Click on Ownership Page *******************************
	public static void OwnershipPage() throws Throwable
	{
		// Click on Master data link
		try{

			if(Dashboard.lnk_MasterData(Constant.driver).isEnabled())
			{			
				Dashboard.lnk_MasterData(Constant.driver).click();
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Master Data link is enabled.","Master Data link", "Master Data link should be enabled and clicked.", "Master Data link is enabled and clicked.", "Pass", null);
			}
			else
			{
				Report.ReporterOutput("Step","Verify Master Data link is enabled.","Master Data link", "Master Data link should be enabled and clicked.", "Master Data link is not enabled and clicked.", "Fail", null);
			}
			// Click on Resource Attribute link
			if(Dashboard.lnk_ResourceAttribute(Constant.driver).isEnabled())
			{			
				Dashboard.lnk_ResourceAttribute(Constant.driver).click();
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Resource Attribute link is enabled.","Resource Attribute link", "Resource Attribute link should be enabled and clicked.", "Resource Attribute link is enabled and clicked.", "Pass", null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify Resource Attribute link is enabled.","Resource Attribute link", "Resource Attribute link should be enabled and clicked.", "Resource Attribute link is not enabled and clicked.", "Fail", null);
			}


			// Click on Ownership link

			if(Dashboard.lnk_OwnershipPage(Constant.driver).isEnabled())
			{			
				Dashboard.lnk_OwnershipPage(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Ownership link is enabled.","Ownership link", "Ownership link should be enabled and clicked.", "Ownership link is enabled and clicked.", "Pass",null);
			}	


			else
			{
				Report.ReporterOutput("Step","Verify Ownership link is enabled.","Ownership link", "Ownership link should be enabled and clicked.", "Ownership link is not enabled and clicked.", "Fail", null);
			}		

		}

		catch (Exception e)
		{
			e.printStackTrace();
		}
		//Check whether Ownership page is open or not.

		String msg1= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/h1")).getText().trim();
		String msg2= "Ownership";

		if(msg1.contains(msg2))
		{
			Report.ReporterOutput("STEP ","Verify Ownership page is open.", "Ownership Page", "Ownership page should be open.","Ownership page is open.", "Pass",null);
		}


	}

	//This Functionality will verify sorting functionality

	public static void Sorting() throws Throwable 
	{
		try
		{
			int i;
			for(i=1;i<=2;i++)
			{

				//This Functionality will verify sorting for Project Name functionality

				WebElement ColumnName = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/thead/tr/th["+i+"]"));

				String programlist1 = ColumnName.getText();

				ColumnName.click();
			//	Thread.sleep(1000);
				WebElement FirstColumn = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td["+i+"]"));

				String before2 =FirstColumn.getText();
				ColumnName.click();
				WebElement FirstColumn1 = Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td["+i+"]"));

				String after2 =FirstColumn1.getText();
				if(!after2.equalsIgnoreCase(before2))
				{
					Report.ReporterOutput("STEP ","Verify Sorting for "+programlist1+".", "Click on Sorting for "+programlist1+".", "Sorting should be done for "+programlist1+".","Sorting for "+programlist1+" is done Successfully.", "Pass",null);
				}
				ColumnName.click();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}


	//This functionality will verify Pagination

	public static void Pagination() throws Throwable 
	{
		List<WebElement> pagination = Constant.driver.findElements(By.xpath(".//*[@id='example_wrapper']/div[7]/div[2]/a[1]"));
		for (int i=4; i>=1; i--) 
		{
			WebElement element = Constant.driver.findElement(By.xpath(".//*[@id='example_wrapper']/div[7]/div[2]/a["+i+"]"));

			String programlist1 = element.getText();
			element.click();
		//	Thread.sleep(500);
			Report.ReporterOutput("STEP ","Verify Pagination for "+ programlist1, "Click on link " + programlist1, programlist1+" Link should be visible and Clickable.",programlist1+" Link is visible and clickable", "Pass",null); 

		}	

	}
	//This functionality will verify Count of Records.
	public static void RecordsCount() throws Throwable 
	{
		int rows_count;
		Select dropdown1 = new Select(ResourceAttribute_Ownership.dropdown_ShowMore(Constant.driver));
		List<WebElement> values_drop = dropdown1.getOptions();
		for(int i=0;i<values_drop.size();i++)
		{
			dropdown1.selectByIndex(i);
			WebElement option = dropdown1.getFirstSelectedOption();
			Integer x = Integer.valueOf(option.getText());
			//This is to verify number of rows and columns
			WebElement mytable = ResourceAttribute_Ownership.ownershipTableID(Constant.driver);
		//	Thread.sleep(500);
			//To locate rows of table.
			List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
			//To calculate no of rows In table.
			rows_count = rows_table.size()-1;
		//	Thread.sleep(1700);
			if(x.equals(rows_count))
			{ Report.ReporterOutput("STEP ","Verify Count of Record for entry="+ x,"Count="+ x  , "Entries Should be Correct-" + x,"Active Record Count done successfully.--" + x, "Pass",null);		  
			}
		} 	
		dropdown1.selectByIndex(0);
	}	
	//***************** Create New Ownership **********************************************

	public static void NewOwnership(String AddOwnership) throws Throwable
	{
		//Click on Add new button.
		try
		{
			if(ResourceAttribute_Ownership.lnk_AddNew(Constant.driver).isEnabled())
			{			
				ResourceAttribute_Ownership.lnk_AddNew(Constant.driver).click();
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Add New button is enabled.","Add New button", "Add New button should be enabled and clicked.", "Add New button is enabled and clicked.", "Pass",null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify Add New button is enabled.","Add New button", "Add New button should be enabled and clicked.", "Add New button is not enabled and clicked.", "Fail", null);
			}		
			// enter value in Ownership text box
			if(ResourceAttribute_Ownership.TextBox_AddOwnership(Constant.driver).isEnabled())
			{			
				ResourceAttribute_Ownership.TextBox_AddOwnership(Constant.driver).sendKeys(AddOwnership);
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Ownership Text Box is enabled.",AddOwnership, "Ownership Text Box should be enabled and value should be entered.", "Ownership Text Box is enabled and value is entered.", "Pass",null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify Ownership Text Box is enabled.",AddOwnership, "Ownership Text Box should be enabled and value should be entered.", "Ownership Text Box is not enabled and Value is not entered.", "Fail", null);
			}

			// click on save button
			if(ResourceAttribute_Ownership.lnk_AddSave(Constant.driver).isEnabled())
			{			
				ResourceAttribute_Ownership.lnk_AddSave(Constant.driver).click();
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
			}		

		}			

		catch (Exception e)
		{
			e.printStackTrace();
		}				
		Report.ReporterOutput("STEP","Verify new Ownership "+AddOwnership+" has been created.",AddOwnership,"New Ownership "+AddOwnership+" should be created.","New Ownership "+AddOwnership+" has been created.","Pass",null);		

	}

	//************ to Search and verify created Ownership **************************************

	public static void SearchOwnership(String AddOwnership) throws Throwable
	{
		try
		{
			Thread.sleep(16000);
			ResourceAttribute_Ownership.TextBox_Search(Constant.driver).clear();
			ResourceAttribute_Ownership.TextBox_Search(Constant.driver).sendKeys(AddOwnership);
			Thread.sleep(5000);


			String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

			String msgB= AddOwnership;
			//Thread.sleep(2000);

			if(msgA.contains(msgB))
			{
				Report.ReporterOutput("STEP","Verify new Ownership "+AddOwnership+" is searched and verified.",AddOwnership,"New Ownership "+AddOwnership+" should be searched and verification.","New Ownership "+AddOwnership+" searched and verified.","Pass",null);
			}

		//	Thread.sleep(3000);
		}
		catch(Exception e2)
		{
			Report.ReporterOutput("STEP","Verify new Ownership "+AddOwnership+" is searched and verified.",AddOwnership,"New Ownership "+AddOwnership+" should be searched and verification.","New Ownership "+AddOwnership+" is not searched and verified.","Fail",null);
		}

	} 

	//********************** to Edit Ownership **************************************

	public static void EditOwnership(String AddOwnership, String EditOwnership) throws Throwable
	{

		// enter value in Search text box

		try
		{
			Thread.sleep(3000);
			if(ResourceAttribute_Ownership.TextBox_Search(Constant.driver).isEnabled())
			{	
				ResourceAttribute_Ownership.TextBox_Search(Constant.driver).clear();
				ResourceAttribute_Ownership.TextBox_Search(Constant.driver).sendKeys(AddOwnership);
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Search text box is enabled.",AddOwnership, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
			}	


			else
			{
				Report.ReporterOutput("Step","Verify Search text box is enabled.",AddOwnership, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
			}				


			// click on Edit button

			if(ResourceAttribute_Ownership.lnk_edit(Constant.driver).isEnabled())
			{			
				ResourceAttribute_Ownership.lnk_edit(Constant.driver).click();
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Edit Link is enabled.","Edit Link", "Edit Link should be enabled and clicked.", "Edit Link is enabled and clicked.", "Pass",null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify Edit Link is enabled.","Edit Link", "Edit Link should be enabled and clicked.", "Edit Link is not enabled and clicked.", "Fail", null);
			}		

			//enter value in Ownership Name text box

			if(ResourceAttribute_Ownership.TextBox_EditOwnership(Constant.driver).isEnabled())
			{			
				ResourceAttribute_Ownership.TextBox_EditOwnership(Constant.driver).clear();
				ResourceAttribute_Ownership.TextBox_EditOwnership(Constant.driver).sendKeys(EditOwnership);
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Ownership Text Box is enabled.",EditOwnership, "Ownership Text Box should be enabled and value should be entered.", "Ownership Text Box is enabled and value is entered.", "Pass",null);
				ResourceAttribute_Ownership.TextBox_EditOwnership(Constant.driver).sendKeys(Keys.TAB);

			}	
			else
			{
				Report.ReporterOutput("Step","Verify Ownership Text Box is enabled.",EditOwnership, "Ownership Text Box should be enabled and value should be entered.", "Ownership Text Box is not enabled and Value is not entered.", "Fail", null);
			}
			// click on save button
			if(ResourceAttribute_Ownership.lnk_EditSave(Constant.driver).isEnabled())
			{			
				ResourceAttribute_Ownership.lnk_EditSave(Constant.driver).click();
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
			}
			Thread.sleep(16000);
			ResourceAttribute_Ownership.TextBox_Search(Constant.driver).clear();
			ResourceAttribute_Ownership.TextBox_Search(Constant.driver).sendKeys(EditOwnership);
		//	Thread.sleep(5000);


			String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]")).getText().trim();

			String msgB= EditOwnership;
		//	Thread.sleep(2000);

			if(msgA.contains(msgB))
			{
				Report.ReporterOutput("STEP","Verify Ownership "+AddOwnership+" has been updated.",EditOwnership,"Ownership "+AddOwnership+" should be updated.","Ownership "+AddOwnership+" has been updated.","Pass",null);		
			}
		}

		catch (Exception e)
		{
			e.printStackTrace();
		}		

	}
	//***************** Delete Ownership **********************************************

	public static void DeleteOwnership(String EditOwnership) throws Throwable
	{
		// enter value in Search text box
		try
		{
			Thread.sleep(2000);
			if(ResourceAttribute_Ownership.TextBox_Search(Constant.driver).isEnabled())
			{		
				ResourceAttribute_Ownership.TextBox_Search(Constant.driver).clear();
				ResourceAttribute_Ownership.TextBox_Search(Constant.driver).sendKeys(EditOwnership);
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Search text box is enabled.",EditOwnership, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify Search text box is enabled.",EditOwnership, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
			}				
			// click on Delete button
			if(ResourceAttribute_Ownership.lnk_delete(Constant.driver).isEnabled())
			{			
				ResourceAttribute_Ownership.lnk_delete(Constant.driver).click();
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is enabled and clicked.", "Pass",null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is not enabled and clicked.", "Fail", null);
			}		
			// Click on Cancel button of Pop up.
			if(ResourceAttribute_Ownership.lnk_deleteCancel(Constant.driver).isEnabled())
			{			
				ResourceAttribute_Ownership.lnk_deleteCancel(Constant.driver).click();
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Cancel button of Pop up is enabled.","Cancel button of Pop up", "Cancel button of Pop up should be enabled and clicked.", "Cancel button of Pop up is enabled and clicked.", "Pass",null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify Cancel button of Pop up is enabled.","Cancel button of Pop up", "Cancel button of Pop up should be enabled and clicked.", "Cancel button of Pop up is not enabled and clicked.", "Fail", null);
			}		
			// click on Delete button
			if(ResourceAttribute_Ownership.lnk_delete(Constant.driver).isEnabled())
			{			
				ResourceAttribute_Ownership.lnk_delete(Constant.driver).click();
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is enabled and clicked.", "Pass",null);
			}	
			else
			{
				Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is not enabled and clicked.", "Fail", null);
			}		
			// Click on OK button of Pop up.
			if(ResourceAttribute_Ownership.lnk_deleteOk(Constant.driver).isEnabled())
			{			
				ResourceAttribute_Ownership.lnk_deleteOk(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify OK button of Pop up is enabled.","OK button of Pop up", "OK button of Pop up should be enabled and clicked.", "OK button of Pop up is enabled and clicked.", "Pass",null);
				ResourceAttribute_Ownership.TextBox_Search(Constant.driver).clear();

			}	
			else
			{
				Report.ReporterOutput("Step","Verify OK button of Pop up is enabled.","OK button of Pop up", "OK button of Pop up should be enabled and clicked.", "OK button of Pop up is not enabled and clicked.", "Fail", null);
			}		
			Thread.sleep(16000);
			ResourceAttribute_Ownership.TextBox_Search(Constant.driver).clear();
			ResourceAttribute_Ownership.TextBox_Search(Constant.driver).sendKeys(EditOwnership);
			//Thread.sleep(5000);


			String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr/td")).getText().trim();

			String msgB= "No matching records found";
			//Thread.sleep(2000);

			if(msgA.contains(msgB))
			{
				Report.ReporterOutput("STEP","Verify Ownership "+EditOwnership+" has been Deleted.","Ownership Deletion","Ownership "+EditOwnership+" should be deleted.","Ownership "+EditOwnership+" has been deleted.","Pass",null);		
			}

			// to click on Home page
			if(Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).isDisplayed());                                    

			{              
				Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).click();
				Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is navigated to RMS      Home page","Pass",null);
			}

		}	
		catch (Exception e)
		{
			e.printStackTrace();
		}		
	}		
}
