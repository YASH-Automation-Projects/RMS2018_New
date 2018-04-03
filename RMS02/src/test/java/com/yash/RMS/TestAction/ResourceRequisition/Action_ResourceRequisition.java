package com.yash.RMS.TestAction.ResourceRequisition;



import org.openqa.selenium.By;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;

import com.yash.RMS.POM.ResourceRequisition.PageObjects_ResourceRequisition;

public class Action_ResourceRequisition 
{
	// ************************** Click on Resource Requisition *******************************//
	
	public static void ResourceRequisition1(String projectname,String Skills,String NoResources, String Designation,String Experince,String AllocationType, String Type,String Time_Frame,String PrimarySkills,String DesirableSkills,String PlannedRolesandResponsibilities,String CareerGrowthPlan,String Targetcompanies,String Keyscanners,String Additionalcomments,String SentRequestTo,String NotifyTo,String Comments)throws Throwable
	//public static void ResourceRequisition(String projectname,String Skills,String NoResources, String Designation,String Experince,String AllocationType, String Type,String This_Frame)throws Throwable
	{
	
		try
		{
		//	Thread.sleep(4000);
			//(Constant.driver).manage().window().maximize();
			
			//click on Resource Request
			if (PageObjects_ResourceRequisition.link_ResourceRequests(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.link_ResourceRequests(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("STEP","Verify Resource Request link is displayed "," Resource Request link", "Resource Request link should be display","Resource Request link is displayed and clicked", "Pass", null);
				
			} 
			else 
			{
				
				Report.ReporterOutput("STEP","Verify Resource Request link is displayed ","Resource Request link","Resource Request link should be display","Resource Request link not displayed","Fail",null);
			}
		

			//Click on Resource Requisition  Link
			if (PageObjects_ResourceRequisition.link_ResourceRequisition(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.link_ResourceRequisition(Constant.driver).click();
				Thread.sleep(2000);
				Report.ReporterOutput("STEP","Resource Requisition Link is displayed ","Resource Requistion Link","Resource Requisition Link link should be display","Resource Requisition Link is displayed and clicked","Pass",null);
				
				
			} 
			else 
			{
				
				Report.ReporterOutput("STEP","Resource Requisition Link is displayed ","Resource Requistion Link","Resource Requisition Link link should be display","Resource Requisition Link is displayed and clicked","Fail",null);
			}
			
		// Verify and Enter the projectName	
		
			if (PageObjects_ResourceRequisition.drp_ProjectName(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.drp_ProjectName(Constant.driver).clear();
				PageObjects_ResourceRequisition.drp_ProjectName(Constant.driver).sendKeys(projectname);
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify drp_ProjectName drpdown is Enable ,Display and Select the data.",projectname, "Projectname dropdown should be Enable & Display.", "Projectname drpdown is Enabled,Displayed & selected the ProjectName.", "Pass",null);
				
				
			} 
			else 
			{
				
				Report.ReporterOutput("Step","Verify drp_ProjectName drpdown is Enable &  Display and enter the data.",projectname, "Projectname dropdwon should be Enabled & Displayed.", "Projectname drpdown is  not Enabled & Displayed.", "Fail",null);
			}
			
		
	
	//Select the Skills
			if (PageObjects_ResourceRequisition.drp_Skills(Constant.driver).isDisplayed());
			{
				PageObjects_ResourceRequisition.drp_Skills(Constant.driver).clear();
				PageObjects_ResourceRequisition.drp_Skills(Constant.driver).sendKeys(Skills);
				Thread.sleep(2000);
				Report.ReporterOutput("Step","Verify drp_Skills drpdown is Enable ,Display and Select the data.",Skills, "Skills dropdown should be Enable & Display.", "Skills drpdown is Enabled,Displayed & Selected the Skills.","Pass",null);
				
			} 
		/*else 
			{
				
				Report.ReporterOutput("Step","Verify drp_Skills drpdown is Enable &  Display and enter the data.",Skills, "Skills dropdwon should be Enabled & Displayed.", "Skills drpdown is  not Enabled & Displayed.", "Fail",null);
			}
	*/
	
//Enter the No of Resources
			
			if (PageObjects_ResourceRequisition.txt_NumberResources(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.txt_NumberResources(Constant.driver).clear();
				PageObjects_ResourceRequisition.txt_NumberResources(Constant.driver).sendKeys(NoResources);
				Report.ReporterOutput("Step","Verify  Numberrofesourecs text is Enable &  Display and Enter the data.",NoResources,  "Numberrofesourecs text should be Enable & Display.", "Numberrofesourecs textbox is Enabled, Displayed and Entered the data.", "Pass",null);
				
			} 
			else 
			{
				
				Report.ReporterOutput("Step","Verify  Numberrofesourecs text is Enable &  Display and Enter the data.",NoResources,  "Numberrofesourecs text should be Enable & Display.", "Numberrofesourecs textbox is Enabled, Displayed and Entered the data.", "Fail",null);
			}
			
	
	//Select Designation
			if (PageObjects_ResourceRequisition.drp_Designation(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.drp_Designation(Constant.driver).clear();
				PageObjects_ResourceRequisition.drp_Designation(Constant.driver).sendKeys(Designation);
				Report.ReporterOutput("Step","Verify drp_Designation drpdown is Enable &  Display and Enter the data.",Designation, "Designation dropdown should be Enable & Display.", "Designation drpdown is Enabled & Displayed.", "Pass",null);
			} 
			else 
			{
				
				Report.ReporterOutput("Step","Verify drp_Designation drpdown is Enable &  Display and Enter the data.",Designation, "Designation dropdown should be Enable & Display.", "Designation drpdown is not Enabled & Displayed.", "Fail",null);
			}
		
	
		//Enter the numberofExperince
			if (PageObjects_ResourceRequisition.txt_Experince(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.txt_Experince(Constant.driver).clear();
				PageObjects_ResourceRequisition.txt_Experince(Constant.driver).sendKeys(Experince);
				Report.ReporterOutput("Step","Verify Experince text is Enable &  Display and Enter the data.",Experince, "Numberofesourecs textbox should be Enable & Display.", "Experince text is Enabled, Displayed and Entered the data.", "Pass",null);
			} 
			else 
			{
				
				Report.ReporterOutput("Step","Verify Experince text is Enable &  Display and Enter the data.",Experince, "Numberofesourecs textbox should be Enable & Display.", "Experince text is not Enabled, Displayed and Entered the data.", "Fail",null);
			}
			
	//Select Allocation Type
			if (PageObjects_ResourceRequisition.drp_AllocationType(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.drp_AllocationType(Constant.driver).clear();
				PageObjects_ResourceRequisition.drp_AllocationType(Constant.driver).sendKeys(AllocationType);
				Report.ReporterOutput("Step","Verify AllocationType drpdown is Enable &  Display and Select the data.",AllocationType, "AllocationType dropdown should be Enable & Display.", "AllocationType drpdown is Enabled ,Displayed&Selected the AllocationType.", "Pass",null); 
			} 
			else 
			{
				
				Report.ReporterOutput("Step","Verify AllocationType drpdown is Enable &  Display and Select the data.",AllocationType, "AllocationType dropdown should be Enable & Display.", "AllocationType drpdown is not Enabled ,Displayed&Selected the AllocationType.", "Fail",null); 
			}
			
			
		//Select the Type
			if (PageObjects_ResourceRequisition.drp_Type(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.drp_Type(Constant.driver).clear();
				PageObjects_ResourceRequisition.drp_Type(Constant.driver).sendKeys(Type);
				Report.ReporterOutput("Step","Verify Type drpdown is Enable &  Display and Select the data.", Type, "Type dropdown should be Enable & Display.", "Type drpdown is Enabled ,Displayed & Selected the Type.", "Pass",null); 
			}
			
			else 
			{
				
				Report.ReporterOutput("Step","Verify Type drpdown is Enable &  Display and Select the data.", Type, "Type dropdown should be Enable & Display.", "Type drpdown is Enabled ,Displayed & Selected the Type.", "Pass",null); 
			}
		
		
	//Select the Time-Frame
			if (PageObjects_ResourceRequisition.txt_ThisFrame(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.txt_ThisFrame(Constant.driver).isEnabled();
				PageObjects_ResourceRequisition.txt_ThisFrame(Constant.driver).clear();
				PageObjects_ResourceRequisition.txt_ThisFrame(Constant.driver).sendKeys(Time_Frame);
				Report.ReporterOutput("Step","Verify This_Frame text is Enable &  Display and Enter the data.",Time_Frame, "This_Frame textbox should be Enable & Display.", "This_Frame text is Enabled, Displayed and Entered the data.", "Pass",null); 
			}
			
			else 
			{
				
				Report.ReporterOutput("Step","Verify This_Frame text is Enable &  Display and Enter the data.",Time_Frame, "This_Frame textbox should be Enable & Display.", "This_Frame text is not Enabled, Displayed and Entered the data.", "Pass",null); 
			}
		
		//click on JD
			if(PageObjects_ResourceRequisition.lnk_DetailJD(Constant.driver).isEnabled())
			{
				PageObjects_ResourceRequisition.lnk_DetailJD(Constant.driver).isDisplayed();
				PageObjects_ResourceRequisition.lnk_DetailJD(Constant.driver).click();;
				Thread.sleep(1000);
				
				Report.ReporterOutput("Step","Verify Detail Link  is Enable &  Display.", "Detail JD link", "Detail JD Link should be Enable & Display.", "Detail JD link is displayed and clicked.","Pass",null);
			}
			else 
			{
				
				Report.ReporterOutput("Step","Verify Detail Link  is Enable &  Display.", "Detail JD link", "Detail JD Link should be Enable & Display.", "Detail JD link is not displayed and clicked.","Fail",null);
			}
		
		//Primary skill
			if (PageObjects_ResourceRequisition.Txt_Primaryskill(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.Txt_Primaryskill(Constant.driver).isEnabled();
			PageObjects_ResourceRequisition.Txt_Primaryskill(Constant.driver).sendKeys(PrimarySkills);
				
			Report.ReporterOutput("Step","Verify Primary skill textbox is Enable &  Display.",  PrimarySkills, "Primary skill textbox should be Enable & Display.", "Primary skill textbox is Enabled and Displayed.","Pass",null);
			}
			
			else 
			{
				
				Report.ReporterOutput("Step","Verify Primary skill textbox is Enable &  Display.", PrimarySkills, "Primary skill textbox should be Enable & Display.", "Primary skill is not textbox Enabled and Displayed.","Fail",null);
			}
		
			//Desired Skills
			if (PageObjects_ResourceRequisition.Txt_DesirableSkills(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.Txt_DesirableSkills(Constant.driver).isEnabled();
				PageObjects_ResourceRequisition.Txt_DesirableSkills(Constant.driver).sendKeys(DesirableSkills);
				Report.ReporterOutput("Step","Verify Desirable Skills textbox is Enable &  Display.", DesirableSkills, "Desirable Skills textbox should be Enable & Display.", "Desirable Skills textbox Enabled and Displayed.","Pass",null);
			}
			
			else 
			{
				
				PageObjects_ResourceRequisition.Txt_DesirableSkills(Constant.driver).sendKeys(DesirableSkills);
				Report.ReporterOutput("Step","Verify Desirable Skills textbox is Enable &  Display.", DesirableSkills, "Desirable Skills textbox should be Enable & Display.", "Desirable Skills textbox is not Enabled and Displayed.","Fail",null);
			}
			
				//Planned Roles and Responsibilities 
			if (PageObjects_ResourceRequisition.Txt_PlannedRolesandResponsibilities(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.Txt_PlannedRolesandResponsibilities(Constant.driver).isEnabled();
			    PageObjects_ResourceRequisition.Txt_PlannedRolesandResponsibilities(Constant.driver).sendKeys(PlannedRolesandResponsibilities);
			  Report.ReporterOutput("Step","Verify Planned Roles and Responsibilities textbox is Enable &  Display.", PlannedRolesandResponsibilities, "Planned Roles and Responsibilities textbox should be Enable & Display.", "Planned Roles and Responsibilities textbox is Enabled and Displayed.","Pass",null);
			}
			
			else 
			{
				
				 Report.ReporterOutput("Step","Verify Planned Roles and Responsibilities textbox is Enable &  Display.", PlannedRolesandResponsibilities, "Planned Roles and Responsibilities textbox should be Enable & Display.", "Planned Roles and Responsibilities textbox is not Enabled and Displayed.","Pass",null);
			}
				
			//Career Growth Plan
			if (PageObjects_ResourceRequisition.Txt_CareerGrowthPlan(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.Txt_CareerGrowthPlan(Constant.driver).isEnabled();
				PageObjects_ResourceRequisition.Txt_CareerGrowthPlan(Constant.driver).sendKeys(CareerGrowthPlan);
				Report.ReporterOutput("Step","Verify Career Growth Plan textbox is Enable &  Display.",  CareerGrowthPlan, "Career Growth Plan textbox should be Enable & Display.", "Career Growth Plan textbox is Enabled and Displayed.","Pass",null);
			}
			
			else 
			{
				
				Report.ReporterOutput("Step","Verify Career Growth Plan textbox is Enable &  Display.",  CareerGrowthPlan, "Career Growth Plan textbox should be Enable & Display.", "Career Growth Plan textbox is not Enabled and Displayed.","Fail",null);
			}
					
					
			//Target companies
			if (PageObjects_ResourceRequisition.Txt_Targetcompanies(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.Txt_Targetcompanies(Constant.driver).isEnabled();
				
	          PageObjects_ResourceRequisition.Txt_Targetcompanies(Constant.driver).sendKeys(Targetcompanies);
	        Report.ReporterOutput("Step","Verify Target companies textbox is Enable &  Display.", Targetcompanies, "Target companies textbox should be Enable & Display.", "Target companies textbox is Enabled and Displayed.","Pass",null);
			}
			else 
			{
				Report.ReporterOutput("Step","Verify Target companies textbox is Enable &  Display.", Targetcompanies, "Target companies textbox should be Enable & Display.", "Target companies textboxis not Enabled and Displayed.","Fail",null);
			}
				
		//Key scanners
			if (PageObjects_ResourceRequisition.Txt_Keyscanners(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.Txt_Keyscanners(Constant.driver).isEnabled();
			PageObjects_ResourceRequisition.Txt_Keyscanners(Constant.driver).sendKeys(Keyscanners);
	         Report.ReporterOutput("Step","Verify Key scanners textbox is Enable &  Display.", Keyscanners, "Key scanners textbox should be Enable & Display.", "Key scanners textbox is Enabled and Displayed.","Pass",null);
			}
			else 
			{
				 Report.ReporterOutput("Step","Verify Key scanners textbox is Enable &  Display.", Keyscanners, "Key scanners textbox should be Enable & Display.", "Key scanners textbox is not Enabled and Displayed.","Fail",null);
			}
		   
        
        //key Interviewers (For First Round)
    
			if (PageObjects_ResourceRequisition.drp_keyInterviewersFirst(Constant.driver).isDisplayed())
			{
			PageObjects_ResourceRequisition.drp_keyInterviewersFirst(Constant.driver).click();
      		Thread.sleep(2000);
      		Constant.driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[2]/div/form/div[7]/div/div/ul/li[2]/label/input")).click();
      		Thread.sleep(1000);
			Constant.driver.findElement(By.xpath(".//*[@id='addSecondarySkill']/div/div/div[2]/div/form/div[7]/div/div/div/ul/li[3]/a/span")).click();
      	    Report.ReporterOutput("Step","Verify key Interviewers(For First Round) drpdown is Enable &  Display and Select the data.", "Surya Matte", "key Interviewers dropdown should be Enable & Display.", "key Interviewers drpdown is Enabled ,Displayed & Selected the data.", "Pass",null); 
			}
			else 
			{
			    Report.ReporterOutput("Step","Verify key Interviewers(For First Round) drpdown is Enable &  Display and Select the data.", "Surya Matte", "key Interviewers dropdown should be Enable & Display.", "key Interviewers drpdown is not  Enabled ,Displayed & Selected the data.", "Fail",null); 
			}
      		
      		//key Interviewers (For Second Round) 
			if (PageObjects_ResourceRequisition.drp_keyInterviewersSecond(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.drp_keyInterviewersSecond(Constant.driver).click();
    			Thread.sleep(1000);
    			Constant.driver.findElement(By.xpath(".//*[@id='ui-multiselect-keyInterviewersTwo-option-0']")).click();
    		Report.ReporterOutput("Step","Verify key Interviewers(For Second Round) drpdown is Enable &  Display and Select the data.", "Ganesh Singh",  "key Interviewers(For Second Round) dropdown should be Enable & Display.", " key Interviewers(For Second Round)  drpdown is Enabled ,Displayed & Selected the data.", "Pass",null); 
    		}
			else 
			{
				Report.ReporterOutput("Step","Verify key Interviewers(For Second Round) drpdown is Enable &  Display and Select the data.", "Ganesh Singh",  "key Interviewers(For Second Round) dropdown should be Enable & Display.", " key Interviewers(For Second Round)  drpdown is not  Enabled ,Displayed & not Selected the data.", "Fail",null); 
				
			}
      		
    		//Additional comments, if any
			if (PageObjects_ResourceRequisition.txt_Additionalcomments(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.txt_Additionalcomments(Constant.driver).isEnabled();
				PageObjects_ResourceRequisition.txt_Additionalcomments(Constant.driver).clear();
	           PageObjects_ResourceRequisition.txt_Additionalcomments(Constant.driver).sendKeys(Additionalcomments);
	             Report.ReporterOutput("Step","Verify Additional comments textbox is Enable &  Display.", Additionalcomments, "Additional comments textbox should be Enable & Display.", "Additional comments textbox is Enabled and Displayed.","Pass",null);
    		}
			else 
			{
				 Report.ReporterOutput("Step","Verify Additional comments textbox is Enable &  Display.", Additionalcomments, "Additional comments textbox should be Enable & Display.", "Additional comments textbox is not Enabled and Displayed.","Fail",null);
				
			}
    		
           //Verify and Click on Save
			if (PageObjects_ResourceRequisition.Button_Save(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.Button_Save(Constant.driver).isEnabled();
    			PageObjects_ResourceRequisition.Button_Save(Constant.driver).click();
    		Report.ReporterOutput("Step","Verify Save button is Enable & Click.","Save button click", "Save button should be Enable & Click.", "Save button is Enabled & Clicked.", "Pass",null);
    		}
			else 
			{
				Report.ReporterOutput("Step","Verify Save button is Enable & Click.","Save button click", "Save button should be Enable & Click.", "Save button is not Enabled & Clicked.", "Pass",null);
				
			}
    		
    		
		//Sent Request To
			if (PageObjects_ResourceRequisition.drp_Sent_Request(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.drp_Sent_Request(Constant.driver).isEnabled();
				PageObjects_ResourceRequisition.drp_Sent_Request(Constant.driver).sendKeys(SentRequestTo);
				Thread.sleep(1000);
				Constant.driver.findElement(By.xpath(".//*[@id='ui-multiselect-mailList-option-2']")).click();
				Report.ReporterOutput("Step","Verify SentRequestTo drpdown is Enable &  Display and Select the data.", SentRequestTo, "SentRequestTo dropdown should be Enable & Display.", "SentRequestTo drpdown is Enabled ,Displayed & Selected the data.", "Pass",null); 
			}
			else 
			{
				Report.ReporterOutput("Step","Verify SentRequestTo drpdown is Enable &  Display and Select the data.", SentRequestTo, "SentRequestTo dropdown should be Enable & Display.", "SentRequestTo drpdown is not Enabled ,Displayed & not Selected the data.", "Fail",null); 
				
			}
    		
		
//Select Notify To 
			if (PageObjects_ResourceRequisition.drp_NotifyTo(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.drp_Sent_Request(Constant.driver).isEnabled();
				PageObjects_ResourceRequisition.drp_NotifyTo(Constant.driver).sendKeys(NotifyTo);
				Thread.sleep(1000);
				Constant.driver.findElement(By.xpath(".//*[@id='ui-multiselect-mailListCC-option-1']")).click();
				Report.ReporterOutput("Step","Verify NotifyTo drpdown is Enable,Display and Select the data.", NotifyTo, "NotifyTo dropdown should be Enable & Display.", "NotifyTo drpdown is Enabled ,Displayed & Selected the data.", "Pass",null); 
			}
			else 
			{
				Report.ReporterOutput("Step","Verify NotifyTo drpdown is Enable,Display and Select the data.", NotifyTo, "NotifyTo dropdown should be Enable & Display.", "NotifyTo drpdown is not Enabled ,Displayed & not Selected the data.", "Fail",null); 
				
			}
		
		//Comments
			if (PageObjects_ResourceRequisition.txt_comments(Constant.driver).isDisplayed())
			{
				PageObjects_ResourceRequisition.txt_comments(Constant.driver).clear();
				PageObjects_ResourceRequisition.txt_comments(Constant.driver).sendKeys(Comments);
				Thread.sleep(1000);
				
				Report.ReporterOutput("Step","Verify Comments text is Enable &  Display and Enter the data.",Comments, "Comments textbox should be Enable & Display.", "Comments text is Enabled, Displayed and Entered the data.", "Pass",null); 
			}
			else 
			{
				Report.ReporterOutput("Step","Verify Comments text is Enable &  Display and Enter the data.",Comments, "Comments textbox should be Enable & Display.", "Comments text is not Enabled, Displayed and Entered the data.", "Fail",null); 
			}
		
		//Verify and Click on Generate Request
			if(PageObjects_ResourceRequisition.btn_GenerateRequest(Constant.driver).isDisplayed())
			{
				Thread.sleep(1000);
				PageObjects_ResourceRequisition.btn_GenerateRequest(Constant.driver).click();
	    Report.ReporterOutput("Step","Verify Generate Request button is Enable & Click.","click on Generate Request button", "Generate Request button should be Enable & Click.", "Generate Request button is Enabled & Clicked.", "Pass",null);
			}
			else 
			{
				 Report.ReporterOutput("Step","Verify Generate Request button is Enable & Click.","click on Generate Request button", "Generate Request button should be Enable & Click.", "Generate Request button is not Enabled & Clicked.", "Fail",null);
			}
		
		
		
		
		
		
		
			
		
		
		}
	
		
catch (Exception e)
		{
			System.out.println("Exception in Navigation to Edit Profile page ");
			e.printStackTrace();
		}
	}

	
	



//Verify SuccessfulL Message

/*String SuccessMsg=Constant.driver.findElement(By.xpath()).getText();


if (SuccessMsg.contains("successfully")) 
{
                Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ",SuccessMsg,"Click on save Confirmation Msg","save Confirmation Msg displayed and clicked","Pass",null);
}
else 
{
                Report.ReporterOutput("STEP","Verify save Confirmation Msg is Visible ",SuccessMsg,"Click on save Confirmation Msg","save Confirmation Msg is not displayed","Fail",null);
}
}*/
}


