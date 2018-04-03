package com.yash.RMS.TestAction.MasterData.MiscAttribute;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Dashboard.Dashboard;
import com.yash.RMS.POM.MasterData.MiscAttribute.MiscAttribute_BGBU;
import com.yash.RMS.POM.MasterData.MiscAttribute.MiscAttribute_ParentProject;

public class TestAction_BGBU {
	public static String DropdownText1,DropdownText;
	
	//************************** Click on BG/BU Page *******************************
	
	public static void BGBUPage() throws Throwable
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
				
				// Click on Misc. Attribute link
				if(Dashboard.lnk_MiscAttribute(Constant.driver).isEnabled())
					{			
						Dashboard.lnk_MiscAttribute(Constant.driver).click();
					//	Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Misc. Attribute link is enabled.","Misc. Attribute link", "Misc. Attribute link should be enabled and clicked.", "Misc. Attribute link is enabled and clicked.", "Pass", null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Misc. Attribute link is enabled.","Misc. Attribute link", "Misc. Attribute link should be enabled and clicked.", "Misc. Attribute link is not enabled and clicked.", "Fail", null);
				}
				// Click on BG/BU link
				if(Dashboard.lnk_BGBU(Constant.driver).isEnabled())
					{			
						Dashboard.lnk_BGBU(Constant.driver).click();
						Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify BG/BU link is enabled.","BG/BU link", "BG/BU link should be enabled and clicked.", "BG/BU link is enabled and clicked.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify BG/BU link is enabled.","BG/BU link", "BG/BU link should be enabled and clicked.", "BG/BU link is not enabled and clicked.", "Fail", null);
				}		
				
				//Check whether BG/BU page is open or not.
				
				String msg1= Constant.driver.findElement(By.xpath(".//*[@id='orgForm']/div[1]/h1")).getText().trim();
				String msg2= "BG/BU";
				
				if(msg1.contains(msg2))
				{
					System.out.println("BG/BU page open");
				}
				else
				System.out.println("Page not found");
						
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	}
	
	//This Functionality will verify sorting functionality

			public static void Sorting() throws Throwable 
			{
				try
				{
				int i;
				for(i=1;i<=4;i++)
				{
				
				//This Functionality will verify sorting for Project Name functionality
				
				WebElement ColumnName = Constant.driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/table/thead/tr/th["+i+"]"));
				
				String programlist1 = ColumnName.getText();
				
				ColumnName.click();
				Thread.sleep(1000);
				WebElement FirstColumn = Constant.driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/table/tbody/tr[1]/td["+i+"]"));

				String before2 =FirstColumn.getText();
				ColumnName.click();
				WebElement FirstColumn1 = Constant.driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/table/tbody/tr[1]/td["+i+"]"));

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
			List<WebElement> pagination = Constant.driver.findElements(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/div[4]/a[1]"));
			for (int i=4; i>=1; i--) 
			{
				WebElement element = Constant.driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/div[4]/a["+i+"]"));
				
				String programlist1 = element.getText();
				element.click();
				Thread.sleep(500);
				Report.ReporterOutput("STEP ","Verify Pagination for "+ programlist1, "Click on link " + programlist1, programlist1+" Link should be visible and Clickable.",programlist1+" Link is visible and clickable", "Pass",null); 

			}	
			
			}
			//This functionality will verify Count of Records.
			public static void RecordsCount() throws Throwable 
			{
				int rows_count;
				Select dropdown1 = new Select(MiscAttribute_BGBU.dropdown_ShowMore(Constant.driver));
				List<WebElement> values_drop = dropdown1.getOptions();
				for(int i=0;i<values_drop.size();i++)
				{
					 dropdown1.selectByIndex(i);
					 WebElement option = dropdown1.getFirstSelectedOption();
					 Integer x = Integer.valueOf(option.getText());
					//This is to verify number of rows and columns
					 WebElement mytable = MiscAttribute_BGBU.BGBUTableID(Constant.driver);
					  Thread.sleep(500);
					  //To locate rows of table.
					  List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
					  //To calculate no of rows In table.
					  rows_count = rows_table.size()-1;
					  Thread.sleep(1700);
					  if(x.equals(rows_count))
					  { Report.ReporterOutput("STEP ","Verify Count of Record for entry="+ x,"Count="+ x  , "Entries Should be Correct-" + x,"Active Record Count done successfully.--" + x, "Pass",null);		  
					  }
					 } 	
				dropdown1.selectByIndex(0);
			}	

	//***************** Create New BG/BU **********************************************
	
	public static void NewBGBU(String AddName, String AddDesc, String AddBGBUHead) throws Throwable
	{

		//Click on Add New link.
		
		try
		{
			Thread.sleep(15000);
			if(MiscAttribute_BGBU.lnk_AddNew(Constant.driver).isEnabled())
			{		Thread.sleep(2000);	
				MiscAttribute_BGBU.lnk_AddNew(Constant.driver).click();
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Add New link is enabled.","Add New link", "Add New link should be enabled and clicked.", "Add New link is enabled and clicked.", "Pass",null);
			}	
		else
		{
			Report.ReporterOutput("Step","Verify Add New link is enabled.","Add New link", "Add New link should be enabled and clicked.", "Add New link is not enabled and clicked.", "Fail", null);
		}			
		// enter value in Name text box
			Thread.sleep(2000);	
		if(MiscAttribute_BGBU.TextBox_AddName(Constant.driver).isEnabled())
			{		
			
				MiscAttribute_BGBU.TextBox_AddName(Constant.driver).sendKeys(AddName);
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Name Text Box is enabled.",AddName, "Name Text Box should be enabled and value should be entered.", "Name Text Box is enabled and value is entered.", "Pass",null);
			}	
		else
		{
			Report.ReporterOutput("Step","Verify Name Text Box is enabled.",AddName, "Name Text Box should be enabled and value should be entered.", "Name Text Box is not enabled and Value is not entered.", "Fail", null);
		}
	// enter value in Description text box
		Thread.sleep(2000);

		if(MiscAttribute_BGBU.TextBox_AddDesc(Constant.driver).isEnabled())
			{		
							MiscAttribute_BGBU.TextBox_AddDesc(Constant.driver).sendKeys(AddDesc);
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Description Text Box is enabled.",AddDesc, "Description Text Box should be enabled and value should be entered.", "Description Text Box is enabled and value is entered.", "Pass",null);
			}	
		else
		{
			Report.ReporterOutput("Step","Verify Description Text Box is enabled.",AddDesc, "Description Text Box should be enabled and value should be entered.", "Description Text Box is not enabled and Value is not entered.", "Fail", null);
		}
		// enter value in BG/BU Head dropdown
		Thread.sleep(1000);

		if(MiscAttribute_BGBU.dropdown_AddBGBUHead(Constant.driver).isEnabled())
			{	
			MiscAttribute_BGBU.dropdown_AddBGBUHead(Constant.driver).click();
				MiscAttribute_BGBU.dropdown_AddBGBUHead(Constant.driver).sendKeys(AddBGBUHead);
			//	Thread.sleep(2000);
				MiscAttribute_BGBU.dropdown_AddBGBUHead(Constant.driver).sendKeys(Keys.TAB);
				Report.ReporterOutput("Step","Verify BG/BU Head dropdown is enabled.",AddBGBUHead, "BG/BU Head dropdown should be enabled and value should be entered.", "BG/BU Head dropdown is enabled and value is entered.", "Pass",null);
			}	
		else
		{
			Report.ReporterOutput("Step","Verify BG/BU Head dropdown is enabled.",AddBGBUHead, "BG/BU Head dropdown should be enabled and value should be entered.", "BG/BU Head dropdown is not enabled and Value is not entered.", "Fail", null);
		}
		
		// click on save button
		Thread.sleep(2000);
		if(MiscAttribute_BGBU.lnk_AddSave(Constant.driver).isEnabled())
			{			
				MiscAttribute_BGBU.lnk_AddSave(Constant.driver).click();
				
				Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
			}	
		else
		{
			Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
		}		
	
		//*************** Click on Delete button*******************************************
		//Click on Add New link.
		Thread.sleep(15000);
			if(MiscAttribute_BGBU.lnk_AddNew(Constant.driver).isEnabled())
					{		
				Thread.sleep(2000);
						MiscAttribute_BGBU.lnk_AddNew(Constant.driver).click();
					//	Thread.sleep(2000);
					//	Report.ReporterOutput("Step","Verify Add New link is enabled.","Add New link", "Add New link should be enabled and clicked.", "Add New link is enabled and clicked.", "Pass",null);
					}	
				else
				{
				//	Report.ReporterOutput("Step","Verify Add New link is enabled.","Add New link", "Add New link should be enabled and clicked.", "Add New link is not enabled and clicked.", "Fail", null);
				}			
				// enter value in Name text box
			Thread.sleep(2000);
			if(MiscAttribute_BGBU.TextBox_AddName(Constant.driver).isEnabled())
					{			
						MiscAttribute_BGBU.TextBox_AddName(Constant.driver).sendKeys(AddName);
					//	Thread.sleep(2000);
						//Report.ReporterOutput("Step","Verify Name Text Box is enabled.","Name Text Box", "Name Text Box should be enabled and value should be entered.", "Name Text Box is enabled and value is entered.", "Pass",null);
					}	
				else
				{
					//Report.ReporterOutput("Step","Verify Name Text Box is enabled.","Name Text Box", "Name Text Box should be enabled and value should be entered.", "Name Text Box is not enabled and Value is not entered.", "Fail", null);
				}
			// enter value in Description text box
			if(MiscAttribute_BGBU.TextBox_AddDesc(Constant.driver).isEnabled())
					{			
						MiscAttribute_BGBU.TextBox_AddDesc(Constant.driver).sendKeys(AddDesc);
					//	Thread.sleep(2000);
					}	
				else
				{
				}
			// enter value in BG/BU Head dropdown
			if(MiscAttribute_BGBU.dropdown_AddBGBUHead(Constant.driver).isEnabled())
				{	
				MiscAttribute_BGBU.dropdown_AddBGBUHead(Constant.driver).click();
					MiscAttribute_BGBU.dropdown_AddBGBUHead(Constant.driver).sendKeys(AddBGBUHead);
				//	Thread.sleep(2000);
					MiscAttribute_BGBU.dropdown_AddBGBUHead(Constant.driver).sendKeys(Keys.TAB);
				//	Report.ReporterOutput("Step","Verify BG/BU Head dropdown is enabled.",AddBGBUHead, "BG/BU Head dropdown should be enabled and value should be entered.", "BG/BU Head dropdown is enabled and value is entered.", "Pass",null);
				}	
			else
			{
			//	Report.ReporterOutput("Step","Verify BG/BU Head dropdown is enabled.",AddBGBUHead, "BG/BU Head dropdown should be enabled and value should be entered.", "BG/BU Head dropdown is not enabled and Value is not entered.", "Fail", null);
			}
				// click on Delete button
				if(MiscAttribute_BGBU.lnk_AddDelete(Constant.driver).isEnabled())
					{			
						MiscAttribute_BGBU.lnk_AddDelete(Constant.driver).click();
					//	Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is enabled and clicked.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Delete Link is enabled.","Delete Link", "Delete Link should be enabled and clicked.", "Delete Link is not enabled and clicked.", "Fail", null);
				}	
				// click on Ok Button of Pop up
				if(MiscAttribute_BGBU.Button_DeleteOk(Constant.driver).isEnabled())
					{			
						MiscAttribute_BGBU.Button_DeleteOk(Constant.driver).click();
						Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify OK button of Pop up is enabled.","OK button of Pop up", "OK button of Pop up should be enabled and clicked.", "OK button of Pop up is enabled and clicked.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify OK button of Pop up is enabled.","OK button of Pop up", "OK button of Pop up should be enabled and clicked.", "OK button of Pop up is not enabled and clicked.", "Fail", null);
				}

				
				Report.ReporterOutput("STEP","Verify new BG/BU "+AddName+" has been created.","New BG/BU creation","New BG/BU "+AddName+" should be created.","New BG/BU "+AddName+" has been created.","Pass",null);		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	} 
	//************ to Search and verify created BG/BU **************************************
	
	public static void SearchBGBU(String AddName) throws Throwable
	{
	try
	{
		
		Thread.sleep(17000);
		
		MiscAttribute_BGBU.TextBox_Search(Constant.driver).clear();
		MiscAttribute_BGBU.TextBox_Search(Constant.driver).sendKeys(AddName);
		Thread.sleep(1000);
		String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/table/tbody/tr/td[1]")).getText().trim();

		String msgB= AddName;
		System.out.println(msgA);
		//Thread.sleep(2000);

		if(msgA.contains(msgB))
		{
			Report.ReporterOutput("STEP","Verify new BG/BU "+AddName+" is searched and verified.","New BG/BU verification","New BG/BU "+AddName+" should be searched and verification.","New BG/BU "+AddName+" searched and verified.","Pass",null);
		}

		//Thread.sleep(3000);
	}
	catch(Exception e2)
	{
		Report.ReporterOutput("STEP","Verify new BG/BU "+AddName+" is searched and verified.","New BG/BU verification","New BG/BU "+AddName+" should be searched and verification.","New BG/BU "+AddName+" is not searched and verified.","Fail",null);
	}
	} 
	//********************** to Edit BG/BU **************************************
	
	public static void EditBGBU(String AddName, String EditName, String EditDesc) throws Throwable
	{
		// enter value in Search text box
				try
				{
					Thread.sleep(18000);
					if(MiscAttribute_BGBU.TextBox_Search(Constant.driver).isEnabled())
					{	
						MiscAttribute_BGBU.TextBox_Search(Constant.driver).clear();
						MiscAttribute_BGBU.TextBox_Search(Constant.driver).sendKeys(AddName);
						//Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Search text box is enabled.",AddName, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Search text box is enabled.",AddName, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
				}				
	     // click on Edit button
					
					
					Thread.sleep(3000);
				if(MiscAttribute_BGBU.lnk_edit(Constant.driver).isEnabled())
					{		
				
						MiscAttribute_BGBU.lnk_edit(Constant.driver).click();
					//	Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Edit Link is enabled.","Edit Link", "Edit Link should be enabled and clicked.", "Edit Link is enabled and clicked.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Edit Link is enabled.","Edit Link", "Edit Link should be enabled and clicked.", "Edit Link is not enabled and clicked.", "Fail", null);
				}		
				//enter value in Name text box
				Thread.sleep(3000);
				if(MiscAttribute_BGBU.TextBox_EditName(Constant.driver).isEnabled())
				{			
				MiscAttribute_BGBU.TextBox_EditName(Constant.driver).clear();
				MiscAttribute_BGBU.TextBox_EditName(Constant.driver).sendKeys(EditName);
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Name Text Box is enabled.",EditName, "Name Text Box should be enabled and value should be entered.", "Name Text Box is enabled and value is entered.", "Pass",null);
				}	
				else
				{
					Report.ReporterOutput("Step","Verify Name Text Box is enabled.",EditName, "Name Text Box should be enabled and value should be entered.", "Name Text Box is not enabled and Value is not entered.", "Fail", null);
				}
				// enter value in Description text box
				Thread.sleep(3000);
		if(MiscAttribute_BGBU.TextBox_EditDesc(Constant.driver).isEnabled())
			{			
				MiscAttribute_BGBU.TextBox_EditDesc(Constant.driver).clear();
				MiscAttribute_BGBU.TextBox_EditDesc(Constant.driver).sendKeys(EditDesc);
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Description Text Box is enabled.",EditDesc, "Description Text Box should be enabled and value should be entered.", "Description Text Box is enabled and value is entered.", "Pass",null);
			}	
		else
		{
			Report.ReporterOutput("Step","Verify Description Text Box is enabled.",EditDesc, "Description Text Box should be enabled and value should be entered.", "Description Text Box is not enabled and Value is not entered.", "Fail", null);
		}
		// click on save button
			if(MiscAttribute_BGBU.lnk_EditSave(Constant.driver).isEnabled())
				{			
					MiscAttribute_BGBU.lnk_EditSave(Constant.driver).click();
					Thread.sleep(2000);
					Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
				}	
			else
			{
				Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
			}				
				
			Thread.sleep(17000);
			MiscAttribute_BGBU.TextBox_Search(Constant.driver).clear();
			MiscAttribute_BGBU.TextBox_Search(Constant.driver).sendKeys(EditName);
		//	Thread.sleep(5000);
			String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/table/tbody/tr/td[1]")).getText().trim();

			String msgB= AddName;
			System.out.println(msgA);
			//Thread.sleep(2000);

			if(msgA.contains(msgB))
			{
				Report.ReporterOutput("STEP","Verify BG/BU "+AddName+" has been updated with "+EditName+".","BG/BU Updation","BG/BU "+AddName+" should be updated with "+EditName+".","BG/BU "+AddName+" has been updated with "+EditName+".","Pass",null);		
			}
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
}
		//********************** to Deactivate BG/BU **************************************

	public static void DeactivateBGBU(String EditName) throws Throwable
	{
		// enter value in Search text box
		try
		{
			Thread.sleep(4000);
			if(MiscAttribute_BGBU.TextBox_Search(Constant.driver).isEnabled())
			{	
				MiscAttribute_BGBU.TextBox_Search(Constant.driver).clear();
				MiscAttribute_BGBU.TextBox_Search(Constant.driver).sendKeys(EditName);
			//	Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify Search text box is enabled.",EditName, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
			}	
		else
		{
			Report.ReporterOutput("Step","Verify Search text box is enabled.",EditName, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
		}				
	// click on Deactivate button
			if(MiscAttribute_BGBU.lnk_Deactivate(Constant.driver).isEnabled())
				{			
					MiscAttribute_BGBU.lnk_Deactivate(Constant.driver).click();
				//	Thread.sleep(2000);
					Report.ReporterOutput("Step","Verify Deactivate Link is enabled.","Deactivate Link", "Deactivate Link should be enabled and clicked.", "Deactivate Link is enabled and clicked.", "Pass",null);
				}	
			else
			{
				Report.ReporterOutput("Step","Verify Deactivate Link is enabled.","Deactivate Link", "Deactivate Link should be enabled and clicked.", "Deactivate Link is not enabled and clicked.", "Fail", null);
			}		
			
			Report.ReporterOutput("STEP","Verify BG/BU "+EditName+" has been deactivated.","BG/BU deactivated","BG/BU "+EditName+" should be deactivated.","BG/BU "+EditName+" has been deactivated.","Pass",null);		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
		}
		//********************** to Activate BG/BU **************************************

		public static void ActivateBGBU(String EditName) throws Throwable
		{
			// enter value in Search text box
			try
			{
				Thread.sleep(18000);
				if(MiscAttribute_BGBU.TextBox_Search(Constant.driver).isEnabled())
				{	
					MiscAttribute_BGBU.TextBox_Search(Constant.driver).clear();
					MiscAttribute_BGBU.TextBox_Search(Constant.driver).sendKeys(EditName);
					//Thread.sleep(2000);
					Report.ReporterOutput("Step","Verify Search text box is enabled.",EditName, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
				}	
			else
			{
				Report.ReporterOutput("Step","Verify Search text box is enabled.",EditName, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
			}				
		// click on Activate button
				if(MiscAttribute_BGBU.lnk_Activate(Constant.driver).isEnabled())
					{			
						MiscAttribute_BGBU.lnk_Activate(Constant.driver).click();
						Thread.sleep(1000);
						Report.ReporterOutput("Step","Verify Activate Link is enabled.","Activate Link", "Activate Link should be enabled and clicked.", "Activate Link is enabled and clicked.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Activate Link is enabled.","Activate Link", "Activate Link should be enabled and clicked.", "Activate Link is not enabled and clicked.", "Fail", null);
				}		
				
				Report.ReporterOutput("STEP","Verify BG/BU "+EditName+" has been activated.","BG/BU activated","BG/BU "+EditName+" should be activated.","BG/BU "+EditName+" has been activated.","Pass",null);		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
			} 
	
	
//********************** Add New BG/BU for Organization **************************************

		public static void AddBGBUOrg(String EditName, String AddNameOrg, String AddDescOrg, String AddBGBUHead) throws Throwable
		{
			// enter value in Search text box
					try
						{
						Thread.sleep(17000);
							if(MiscAttribute_BGBU.TextBox_Search(Constant.driver).isEnabled())
							{	
								MiscAttribute_BGBU.TextBox_Search(Constant.driver).clear();
								MiscAttribute_BGBU.TextBox_Search(Constant.driver).sendKeys(EditName);
								//Thread.sleep(2000);
								Report.ReporterOutput("Step","Verify Search text box is enabled.",EditName, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
							}	
						else
						{
							Report.ReporterOutput("Step","Verify Search text box is enabled.",EditName, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
						}			
				// Click on BG/BU name
							Thread.sleep(3000);
							
						if(MiscAttribute_BGBU.lnk_BGBUName(Constant.driver).isEnabled())
							{	
								MiscAttribute_BGBU.lnk_BGBUName(Constant.driver).click();

								//Thread.sleep(2000);
								Report.ReporterOutput("STEP","Verify BG/BU "+EditName+" link is enabled.","BG/BU link","BG/BU "+EditName+"  link should be enabled and clicked.","BG/BU "+EditName+" link is enabled and clicked.","Pass",null);		
							}	
						else
						{
							Report.ReporterOutput("STEP","Verify BG/BU "+EditName+" link is enabled.","BG/BU link","BG/BU "+EditName+" link should be enabled and clicked.","BG/BU "+EditName+" link is not enabled and clicked.","Pass",null);		
						}				
			//***************** Create New BG/BU for organization **********************************************
				//Click on Add New link.
				if(MiscAttribute_BGBU.lnk_AddNew(Constant.driver).isEnabled())
					{	
					Thread.sleep(15000);
						MiscAttribute_BGBU.TextBox_Search(Constant.driver).click();
						MiscAttribute_BGBU.TextBox_Search(Constant.driver).clear();
						MiscAttribute_BGBU.TextBox_Search(Constant.driver).sendKeys(Keys.ENTER);

						Thread.sleep(3000);
						MiscAttribute_BGBU.lnk_AddNew(Constant.driver).click();
					//	Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Add New link is enabled.","Add New link", "Add New link should be enabled and clicked.", "Add New link is enabled and clicked.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Add New link is enabled.","Add New link", "Add New link should be enabled and clicked.", "Add New link is not enabled and clicked.", "Fail", null);
				}			
				// enter value in Name text box
			if(MiscAttribute_BGBU.TextBox_AddName(Constant.driver).isEnabled())
					{			
						MiscAttribute_BGBU.TextBox_AddName(Constant.driver).sendKeys(AddNameOrg);
					//		Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Name Text Box is enabled.",AddNameOrg, "Name Text Box should be enabled and value should be entered.", "Name Text Box is enabled and value is entered.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Name Text Box is enabled.",AddNameOrg, "Name Text Box should be enabled and value should be entered.", "Name Text Box is not enabled and Value is not entered.", "Fail", null);
				}
			// enter value in Description text box
				if(MiscAttribute_BGBU.TextBox_AddDesc(Constant.driver).isEnabled())
					{			
						MiscAttribute_BGBU.TextBox_AddDesc(Constant.driver).sendKeys(AddDescOrg);
					//	Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Description Text Box is enabled.",AddDescOrg, "Description Text Box should be enabled and value should be entered.", "Description Text Box is enabled and value is entered.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Description Text Box is enabled.",AddDescOrg, "Description Text Box should be enabled and value should be entered.", "Description Text Box is not enabled and Value is not entered.", "Fail", null);
				}
				
				// enter value in BG/BU Head dropdown
				Thread.sleep(3000);
				if(MiscAttribute_BGBU.dropdown_AddBGBUHead(Constant.driver).isEnabled())
					{	
					MiscAttribute_BGBU.dropdown_AddBGBUHead(Constant.driver).click();
				//	MiscAttribute_BGBU.dropdown_AddBGBUHead(Constant.driver).clear();
						MiscAttribute_BGBU.dropdown_AddBGBUHead(Constant.driver).sendKeys(AddBGBUHead);
						//Thread.sleep(2000);
						MiscAttribute_BGBU.dropdown_AddBGBUHead(Constant.driver).sendKeys(Keys.TAB);
						Report.ReporterOutput("Step","Verify BG/BU Head dropdown is enabled.",AddBGBUHead, "BG/BU Head dropdown should be enabled and value should be entered.", "BG/BU Head dropdown is enabled and value is entered.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify BG/BU Head dropdown is enabled.",AddBGBUHead, "BG/BU Head dropdown should be enabled and value should be entered.", "BG/BU Head dropdown is not enabled and Value is not entered.", "Fail", null);
				}
				
				// click on save button
				if(MiscAttribute_BGBU.lnk_AddSave(Constant.driver).isEnabled())
					{			
						MiscAttribute_BGBU.lnk_AddSave(Constant.driver).click();
						Thread.sleep(2000);
						Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is enabled and clicked.", "Pass",null);
					}	
				else
				{
					Report.ReporterOutput("Step","Verify Save Link is enabled.","Save Link", "Save Link should be enabled and clicked.", "Save Link is not enabled and clicked.", "Fail", null);
				}		
		
				Report.ReporterOutput("STEP","Verify new BG/BU "+AddNameOrg+" has been created for "+EditName+".","New BG/BU creation for Organization","New BG/BU "+AddNameOrg+" should be created for "+EditName+".","New BG/BU "+AddNameOrg+" has been created for "+EditName+".","Pass",null);		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		}
	
	
//********************** Move BG/BU of Organization **************************************

		public static void MoveBGBUOrg(String EditName, String AddNameOrg) throws Throwable
		{
			// enter value in Search text box
		try
			{
			Thread.sleep(19000);
				if(MiscAttribute_BGBU.TextBox_Search(Constant.driver).isEnabled())
				{	
					MiscAttribute_BGBU.TextBox_Search(Constant.driver).clear();
					MiscAttribute_BGBU.TextBox_Search(Constant.driver).sendKeys(EditName);
				//	Thread.sleep(2000);
					Report.ReporterOutput("Step","Verify Search text box is enabled.",EditName, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
				}	
			else
			{
				Report.ReporterOutput("Step","Verify Search text box is enabled.",EditName, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
			}			
		// Click on BG/BU name
				Thread.sleep(3000);
			if(MiscAttribute_BGBU.lnk_BGBUName(Constant.driver).isEnabled())
				{	
					MiscAttribute_BGBU.lnk_BGBUName(Constant.driver).click();
					Thread.sleep(2000);
					Report.ReporterOutput("STEP","Verify BG/BU "+EditName+" link is enabled.",EditName,"BG/BU "+EditName+"  link should be enabled and clicked.","BG/BU "+EditName+" link is enabled and clicked.","Pass",null);		
					MiscAttribute_BGBU.TextBox_Search(Constant.driver).clear();
					//Report.ReporterOutput("Step","Verify Search text box is enabled.",EditName, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
				}	
			else
			{
				Report.ReporterOutput("STEP","Verify BG/BU "+EditName+" link is enabled.",EditName,"BG/BU "+EditName+" link should be enabled and clicked.","BG/BU "+EditName+" link is not enabled and clicked.","Pass",null);		
				//Report.ReporterOutput("Step","Verify Search text box is enabled.",EditName, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
			}				
		// enter value in Search text box
			Thread.sleep(5000);
			if(MiscAttribute_BGBU.TextBox_Search(Constant.driver).isEnabled())
				{	
					MiscAttribute_BGBU.TextBox_Search(Constant.driver).clear();
					MiscAttribute_BGBU.TextBox_Search(Constant.driver).sendKeys(AddNameOrg);
				//	Thread.sleep(2000);
					//Report.ReporterOutput("Step","Verify Search text box is enabled.",EditName, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
				}	
			else
			{
				//Report.ReporterOutput("Step","Verify Search text box is enabled.",EditName, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
			}			
			// Click on Move link
			Thread.sleep(3000);
			if(MiscAttribute_BGBU.lnk_BGBUMove(Constant.driver).isEnabled())
				{			
					MiscAttribute_BGBU.lnk_BGBUMove(Constant.driver).click();
					//Thread.sleep(2000);
					Report.ReporterOutput("Step","Verify Move button is enabled.","Move button", "Move button should be enabled and clicked.", "Move button is enabled and clicked.", "Pass",null);
				}	
			else
			{
				Report.ReporterOutput("Step","Verify Move button is enabled.","Move button", "Move button should be enabled and clicked.", "Move button is not enabled and clicked.", "Fail", null);
			}	
			Thread.sleep(5000);
			WebElement iframeElement = Constant.driver.findElement(By.tagName("iframe"));
 
			//now use the switch command
			Constant.driver.switchTo().frame(iframeElement);
			Thread.sleep(3000);
			
			System.out.println("********We are switch to the iframe*******");
	
			// Select value from Drop down
			Thread.sleep(3000);
							if(MiscAttribute_BGBU.Dropdown_BGBUMove(Constant.driver).isEnabled())
							{	
								Thread.sleep(2000);
								MiscAttribute_BGBU.Dropdown_BGBUMove(Constant.driver).click();
								Select BGBUDropdown=new Select(MiscAttribute_BGBU.Dropdown_BGBUMove(Constant.driver));
								BGBUDropdown.selectByIndex(2);
								DropdownText = BGBUDropdown.getFirstSelectedOption().getText();
								System.out.println(DropdownText);

							//	String string = "004-034556";
								String[] parts = DropdownText.split("/");
								DropdownText1 = parts[2];
								System.out.println(DropdownText1);

							//	BGBUDropdown.selectByVisibleText("/ORGANIZATION/BG18-BU17");
								Thread.sleep(1000);
								Report.ReporterOutput("Step","Verify drop down is enabled.",DropdownText, "Drop down should be enabled and value should be selected.", "Drop down is enabled and value is selected.", "Pass",null);
							}	
					else
						{
							Report.ReporterOutput("Step","Verify drop down is enabled.",DropdownText, "Drop down should be enabled and value should be selected.", "Drop down is not enabled and value is not selected.", "Fail", null);
						}	
						// Click on Move Button on form
							Thread.sleep(3000);
						if(MiscAttribute_BGBU.Button_BGBUMove(Constant.driver).isEnabled())
							{			
								MiscAttribute_BGBU.Button_BGBUMove(Constant.driver).click();
								Thread.sleep(1000);
								Report.ReporterOutput("Step","Verify Move button is enabled.","Move button", "Move button should be enabled and clicked.", "Move button is enabled and clicked.", "Pass",null);
							}	
						else
						{
							Report.ReporterOutput("Step","Verify Move button is enabled.","Move button", "Move button should be enabled and clicked.", "Move button is not enabled and clicked.", "Fail", null);
						}				
							
					    // Switching to Alert        
						Thread.sleep(3000);
			            Alert alert=Constant.driver.switchTo().alert();		
			            		
			            // Capturing alert message.    
			            String alertMessage=Constant.driver.switchTo().alert().getText();		
			            		
			            // Displaying alert message		
			            System.out.println(alertMessage);			
			            		
			            // Accepting alert		
			            alert.accept();		
						
			            Constant.driver.switchTo().defaultContent();
						System.out.println("********We are switch back to window*******");

					 // Click on Close Button of Pop up
						Thread.sleep(3000);
						if(MiscAttribute_BGBU.Button_BGBUMoveClose(Constant.driver).isEnabled())
							{			
								MiscAttribute_BGBU.Button_BGBUMoveClose(Constant.driver).click();
								Thread.sleep(1000);
								Report.ReporterOutput("Step","Verify Close button is enabled.","Close button", "Close button should be enabled and clicked.", "Close button is enabled and clicked.", "Pass",null);
							}	
						else
						{
							Report.ReporterOutput("Step","Verify Close button is enabled.","Close button", "Close button should be enabled and clicked.", "Close button is not enabled and clicked.", "Fail", null);
						}		
			
						Report.ReporterOutput("STEP","Verify BG/BU "+AddNameOrg+" moved to "+DropdownText1+" successfully.","BG/BU moved","BG/BU "+AddNameOrg+" should be moved to "+DropdownText1+" successfully.","BG/BU "+AddNameOrg+" has been moved to "+DropdownText1+" successfully.","Pass",null);		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		}
	
		//********************** Check the BG/BU which is moved **************************************

		public static void checkMoveBGBUOrg(String EditName, String AddNameOrg) throws Throwable
		{
			// Click on BG/BU link
			try
			{
				Thread.sleep(3000);
				if(Dashboard.lnk_BGBU(Constant.driver).isEnabled())
				{			
					Dashboard.lnk_BGBU(Constant.driver).click();
					//Thread.sleep(2000);
					Report.ReporterOutput("Step","Verify BG/BU link is enabled.","BG/BU link", "BG/BU link should be enabled and clicked.", "BG/BU link is enabled and clicked.", "Pass",null);
				}	
			else
			{
				Report.ReporterOutput("Step","Verify BG/BU link is enabled.","BG/BU link", "BG/BU link should be enabled and clicked.", "BG/BU link is not enabled and clicked.", "Fail", null);
			}		
		 // enter value in Search text box
				Thread.sleep(18000);
	 				if(MiscAttribute_BGBU.TextBox_Search(Constant.driver).isEnabled())
		 				{	
		 					MiscAttribute_BGBU.TextBox_Search(Constant.driver).clear();
		 					MiscAttribute_BGBU.TextBox_Search(Constant.driver).sendKeys(DropdownText1);
		 					//Thread.sleep(2000);
		 					Report.ReporterOutput("Step","Verify Search text box is enabled.",DropdownText1, "Search text box should be enabled and value is entered.", "Search text box is enabled and value is entered.", "Pass",null);
		 				}	
		 			else
		 			{
		 				Report.ReporterOutput("Step","Verify Search text box is enabled.",DropdownText1, "Search text box should be enabled and value is entered.", "Search text box is not enabled and value is not entered.", "Fail", null);
		 			}		
		 		// Click on BG/BU name
					if(MiscAttribute_BGBU.lnk_BGBUName(Constant.driver).isEnabled())
						{	
							MiscAttribute_BGBU.lnk_BGBUName(Constant.driver).click();
						//	Thread.sleep(2000);
							Report.ReporterOutput("STEP","Verify BG/BU "+DropdownText1+" link is enabled.",DropdownText1,"BG/BU "+DropdownText1+"  link should be enabled and clicked.","BG/BU "+DropdownText1+" link is enabled and clicked.","Pass",null);		
							MiscAttribute_BGBU.TextBox_Search(Constant.driver).clear();
						}	
					else
					{
						Report.ReporterOutput("STEP","Verify BG/BU "+DropdownText1+" link is enabled.",DropdownText1,"BG/BU "+DropdownText1+" link should be enabled and clicked.","BG/BU "+DropdownText1+" link is not enabled and clicked.","Pass",null);		
					}				
					// enter value in Search text box
					Thread.sleep(16000);
						MiscAttribute_BGBU.TextBox_Search(Constant.driver).clear();
						MiscAttribute_BGBU.TextBox_Search(Constant.driver).sendKeys(AddNameOrg);
						//Thread.sleep(5000);


						String msgA= Constant.driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/table/tbody/tr/td[1]")).getText().trim();
						String msgB= AddNameOrg;
						System.out.println(msgA);
					//	Thread.sleep(2000);

						if(msgA.contains(msgB))
						{
							Report.ReporterOutput("STEP","Verify new BG/BU "+AddNameOrg+" in "+DropdownText1+" is searched and verified.",AddNameOrg,"BG/BU "+AddNameOrg+" in "+DropdownText1+" should be searched and verification.","BG/BU "+AddNameOrg+" in "+DropdownText1+" searched and verified.","Pass",null);
						}


						else{					
						Report.ReporterOutput("STEP","Verify new BG/BU "+AddNameOrg+" in "+DropdownText1+" is searched and verified.",AddNameOrg,"BG/BU "+AddNameOrg+" in "+DropdownText1+" should be searched and verification.","BG/BU "+AddNameOrg+" in "+DropdownText1+" is not searched and verified.","Fail",null);
					}
					    
						if(Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).isDisplayed());                                    

					     {              
					          Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).click();
					          Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is navigated to RMS      Home page","Pass",null);
					     }


					  // to click on Home page
			       if(Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).isDisplayed());                                    

					  {              
					       Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).click();
					       Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is navigated to RMS      Home page","Pass",null);
					  }

			}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		}
	
		

}
