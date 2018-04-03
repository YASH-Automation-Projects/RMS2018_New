package com.yash.RMS.TestAction.SEPG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.SEPG.PageObjects_SEPGActivity;

public class Action_SEPGActivity_AddNew {
	//************************* FOR Adding a NEW Phrases********************************************************************
	public static void addNew(String output) throws Throwable {
		Thread.sleep(5000);
		try{
			
			Constant.driver.findElement(By.xpath(".//*[@id='name']")).click();
			Thread.sleep(1000);
			if (PageObjects_SEPGActivity.addNewLink(Constant.driver).isDisplayed()){
				
				PageObjects_SEPGActivity.addNewLink(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("STEP", "Verify Add New Link is Visible", "Add New Link", "Click on Add New Link", "add New Link should be Visible", "Pass", null);
			}
			else{
				Report.ReporterOutput("STEP", "Verify Add New Link is Visible", "Add New Link", "Click on Add New Link", "add New Link not Visible", "Fail", null);
			}
			Thread.sleep(2000);
						
			if (PageObjects_SEPGActivity.addNew_EditBox(Constant.driver).isDisplayed()){
				Thread.sleep(1000);
				
				
				PageObjects_SEPGActivity.addNew_EditBox(Constant.driver).click();
				Thread.sleep(1000);
				//TO SEND the OUTPUT from Excel sheet 
				PageObjects_SEPGActivity.addNew_EditBox(Constant.driver).sendKeys(output);
				
			}
			else {
				//System.out.println("The Add Phrase Edit button is not visible");
			}
			Thread.sleep(2000);
			// For Click on Save button
			if(PageObjects_SEPGActivity.addNew_save_Link(Constant.driver).isDisplayed()){
				PageObjects_SEPGActivity.addNew_save_Link(Constant.driver).click();
				Report.ReporterOutput("STEP", "Verify save button for Add Phrase is Displayed", "save button for Add Phrase", "Click on save button for Add Phrases", "save button for Add Phrases should be displayed and clicked", "Pass", null);
				
			}
			else {
				Report.ReporterOutput("STEP", "Verify save button for Add Phrase is Displayed", "save button for Add Phrase", "Click on save button for Add Phrases", "save button for Add Phrases is not displayed", "Fail", null);
			}
            //TO Verify the Confirmation message after the save button hit   
           
                       
                     
            
            String successMsg=Constant.driver.findElement(By.xpath("//div[contains(@class,'toast-message')]")).getText();

                  
          if (successMsg.contains("successfully")) {
                            Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ",successMsg,"Click on save Confirmation Msg","save Confirmation Msg displayed and clicked","Pass",null);
            }
            else {
                            Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ",successMsg,"Click on save Confirmation Msg","save Confirmation Msg is not displayed","Fail",null);
            }
            
			Thread.sleep(3000);
			/*if (PageObjects_SEPGActivity.searchBox(Constant.driver).isDisplayed()){
				PageObjects_SEPGActivity.searchBox(Constant.driver).click();
				Thread.sleep(1000);
				PageObjects_SEPGActivity.searchBox(Constant.driver).clear();
				PageObjects_SEPGActivity.searchBox(Constant.driver).sendKeys(output);
				Report.ReporterOutput("STEP", "Verify after search new added Activity is Displayed", output , "New Activity Added : should be searched and verification.", "New Activity Added : should be searched and verification", "Pass", null);
				//Giving output from First add Method
				
			}
			else {
				Report.ReporterOutput("STEP", "Verify after search new added Activity is Displayed", output , "New Activity Added : should be searched and verification.", "New Activity Added : should be not searched and verification", "Fail", null);
			}*/
			
		}catch (Exception e) {
			e.printStackTrace();
		
	}
}
	//*****************Search functionality for SEPG Phases***********************/
	public static void search_Phrases(String phrasesToSearch) throws Throwable {
		try{
			Thread.sleep(2000);
			// Logic to Search a Phrase which is already added successfully 
			//PageObjects_SEPGActivity.searchBox(Constant.driver).clear();
			if (PageObjects_SEPGActivity.searchBox(Constant.driver).isDisplayed()){
				PageObjects_SEPGActivity.searchBox(Constant.driver).click();
				Thread.sleep(1000);
				PageObjects_SEPGActivity.searchBox(Constant.driver).clear();
				PageObjects_SEPGActivity.searchBox(Constant.driver).sendKeys(phrasesToSearch);
				Report.ReporterOutput("STEP", "Verify search Box is Displayed", phrasesToSearch , "Click on search Box", "search Box should be displayed and clicked", "Pass", null);
				//Giving output from First add Method
				
			}
			else {
				Report.ReporterOutput("STEP", "Verify search Box is Displayed", phrasesToSearch , "Click on search Box", "search Box should be displayed and clicked", "Fail", null);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	//************* EDIT THE SEPG Activity NAME AND SAVE IT *********************************************

		public static void Edit_PhraseName(String EditPhraseName) throws Throwable {
			try {
				Thread.sleep(4000);
				if (PageObjects_SEPGActivity.btn_EditPhases(Constant.driver).isDisplayed()) {
					Thread.sleep(1000);
					PageObjects_SEPGActivity.btn_EditPhases(Constant.driver).click();
					Thread.sleep(1500);
					//Phases clear and then add new Phrases and click on save btn 
					PageObjects_SEPGActivity.Edit_Txt_Phase(Constant.driver).clear();
					//TO SEND the OUTPUT from Excel sheet 
					Thread.sleep(1500);
					PageObjects_SEPGActivity.Edit_Txt_Phase(Constant.driver).sendKeys(EditPhraseName);
					Report.ReporterOutput("STEP","Verify edit button is Visible ","edit button","Click on edit button","edit button should be displayed and clicked","Pass",null);
					//Thread.sleep(2000);
				}
				else {
					Report.ReporterOutput("STEP","Verify edit button is Visible ","edit button","Click on edit button","edit button is not displayed","Pass",null);
				}
				
				Thread.sleep(2000);
				//to verify the Edit button is displayed 
				
				//save button for Add Phrase
				if (PageObjects_SEPGActivity.lnk_savePhases(Constant.driver).isDisplayed()) {
					Report.ReporterOutput("STEP"," Verify save button is Displayed "," Save button for Add Phrase "," Click on save button for Add Phrases"," Save button for Add Phrases should be displayed and clicked","Pass",null);
					PageObjects_SEPGActivity.lnk_savePhases(Constant.driver).click();
				}
				else {
					Report.ReporterOutput("STEP"," Verify save button is Displayed  ","  Save button for Add Phrase "," Click on save button for Add Phrases"," Save button for Add Phrases is not displayed","Fail",null);
				}
						
				
				Thread.sleep(500);
				String successMsg=Constant.driver.findElement(By.xpath("//div[contains(@class,'toast-message')]")).getText();

	            //System.out.println(successMsg);
	        
	          if (successMsg.contains("successfully")) {
	                            Report.ReporterOutput("STEP","Verify save confirmation Msg is Visible ",successMsg,"Click on save confirmation Msg","save confirmation Msg displayed and clicked","Pass",null);
	            }
	            else {
	                            Report.ReporterOutput("STEP","Verify save confirmation Msg is Visible ",successMsg,"Click on save confirmation Msg","save confirmation Msg is not displayed","Fail",null);
	            }
				
	          Thread.sleep(2000);
	          // Logic to Search a Phrase which is already added successfully 
	         
	          if (PageObjects_SEPGActivity.searchBox(Constant.driver).isDisplayed()){
	        	  PageObjects_SEPGActivity.searchBox(Constant.driver).click();
	        	  Thread.sleep(1000);
	        	  PageObjects_SEPGActivity.searchBox(Constant.driver).clear();
	        	  PageObjects_SEPGActivity.searchBox(Constant.driver).sendKeys(EditPhraseName);
	        	  Thread.sleep(1500);
	        	  
	        	  String SEPGActivityName  = Constant.driver.findElement(By.xpath("//*[@class='dataTables_wrapper']/table/tbody/tr/td[2]")).getText();
	        	 
	        	  if(SEPGActivityName.contains(EditPhraseName)){

	        		  Report.ReporterOutput("STEP", "Verify SEPG Activity Edit Name is searched and Activity field has been Updated ", SEPGActivityName, "SEPG Activity field should be Updated succesfully", "SEPG Activity field should be Updated succesfully", "Pass", null);
	        		  //Giving output from First add Method
	        	  }
	        	  else{
	        		  Report.ReporterOutput("STEP", "Verify SEPG Activity Edit Name is searched and Activity field has been Updated ", SEPGActivityName, "SEPG Activity field not Updated succesfully", "SEPG Activity field should be Updated succesfully ", "Fail", null);
	        	  }
	          }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//************* Delete THE SEPG PHASES NAME  *********************************************

		public static void Delete_PhraseName(String EditPhraseName) throws Throwable {
			try {
				Thread.sleep(4000);
				if (PageObjects_SEPGActivity.lnk_Delete(Constant.driver).isDisplayed()) {

					//PageObjects_SEPGActivity.Edit_Txt_Phase(Constant.driver).sendKeys(EditPhraseName);
						Thread.sleep(1000);
						PageObjects_SEPGActivity.lnk_Delete(Constant.driver).click();
												
						Thread.sleep(2000);
						Constant.driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();

						
						Report.ReporterOutput("STEP","Verify Delete is Visible ","Delete link","Click on Delete link","Delete should be displayed and clicked Phrase name Deleted Successfully","Pass",null);
						//Thread.sleep(2000);
					}
					else {
						Report.ReporterOutput("STEP","Verify Delete is Visible ","Delete link","Click on Delete link","Delete is not visible","Fail",null);
					}
				
				
						Thread.sleep(2000);
						// Logic to Search a Phrase which is already added successfully 
						
						if (PageObjects_SEPGActivity.searchBox(Constant.driver).isDisplayed()){
							PageObjects_SEPGActivity.searchBox(Constant.driver).click();
							Thread.sleep(1000);
							PageObjects_SEPGActivity.searchBox(Constant.driver).clear();
							PageObjects_SEPGActivity.searchBox(Constant.driver).sendKeys(EditPhraseName);
							Thread.sleep(1500);
							String noRecords= Constant.driver.findElement(By.xpath("//*[@id='example']/tbody/tr/td")).getText();
							
						
							
							
							if(noRecords.contains("No matching")){
						
							Report.ReporterOutput("STEP", "Verify SEPG Activity record Deleted successfully", noRecords, "Deleted SEPG Activity record should not be present in the table", "SEPG Acitivity name deleted successfully", "Pass", null);
							//Giving output from First add Method
							}
							else{
								Report.ReporterOutput("STEP", "Verify SEPG Activity record Deleted successfully", noRecords, "Deleted SEPG Activity record should not be present in the table", "SEPG Acitivity name not deleted", "Fail", null);
						}
						}
					}catch (Exception e){
						e.printStackTrace();
					}
					
				
		
		try
		{
		     if(Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).isDisplayed());                                    

		{              
		     Constant.driver.findElement(By.xpath("html/body/div[1]/header/a/span[2]/img")).click();
		     Report.ReporterOutput("STEP","Verify User is navigated to RMS Home page","RMS Home page","User should be navigated to RMS Home page","User is navigated to RMS      Home page","Pass",null);
		}
		}
		catch(Exception e)
		{
		    System.out.println( e.getMessage());

		}

}			
}
