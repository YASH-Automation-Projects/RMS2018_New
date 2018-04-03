package com.yash.RMS.POM.ResourceRequisition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.CommonMethods;

public class PageObjects_ResourceRequisition 
{
	private static WebElement element = null;
	//Click on Resource Requests
	public static WebElement link_ResourceRequests(WebDriver driver)
	{
		 element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='requestList']/a/span"))), driver);
		return element;
		
	}

//Click on Resource Requisition 
	public static WebElement link_ResourceRequisition(WebDriver driver)
	{
		 element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='resourceRequisition']"))), driver);
		return element;	
	}
	public static WebElement drp_ProjectName(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='oldProjectTableList']/span/input"));
		return element;
	}

	public static WebElement drp_Skills(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='requirement']/tbody/tr/td[1]/span/input"));
		return element;
	}

	public static WebElement txt_NumberResources(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='resources1']"));
		return element;
	}

	public static WebElement drp_Designation(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='requirement']/tbody/tr/td[3]/span/input"));
		return element;
	}

	public static WebElement txt_Experince(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='experience1']"));
		return element;
	}	

	public static WebElement drp_AllocationType(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='requirement']/tbody/tr/td[5]/span/input"));
		return element;
	}	
	//drp_Type
	public static WebElement drp_Type(WebDriver driver){
		return element = driver.findElement(By.xpath(".//*[@id='requirement']/tbody/tr/td[6]/span/input"));
	}
	//txt_ThisFrame
		public static WebElement txt_ThisFrame(WebDriver driver){
			return element = driver.findElement(By.xpath(".//*[@id='time1']"));
		}
	//Txt_Primaryskill
		public static WebElement Txt_Primaryskill(WebDriver driver){
			return element = driver.findElement(By.xpath(".//*[@id='primarySkills']"));
			
		}
	//Txt_DesirableSkills
		public static WebElement Txt_DesirableSkills(WebDriver driver){
			return element = driver.findElement(By.xpath(".//*[@id='desirableSkills']"));
			
		}
		
	//Planned Roles and Responsibilities
		
	public static WebElement Txt_PlannedRolesandResponsibilities(WebDriver driver){
		return element = driver.findElement(By.xpath(".//*[@id='responsibilities']"));
	}
	//Career Growth Plan	
		public static WebElement Txt_CareerGrowthPlan(WebDriver driver){
			return element = driver.findElement(By.xpath(".//*[@id='careerGrowthPlan']"));
		}
		//Target companies
		public static WebElement Txt_Targetcompanies(WebDriver driver){
			return element = driver.findElement(By.xpath(".//*[@id='targetCompanies']"));
			
		}
		//Key Scanners
		public static WebElement Txt_Keyscanners(WebDriver driver){
			return element = driver.findElement(By.xpath(".//*[@id='keyScanners']"));
			
		}
		//key Interviewers (For First Round) 
		public static WebElement drp_keyInterviewersFirst(WebDriver driver){
			return element = driver.findElement(By.xpath(".//*[@id='addSecondarySkill']/div/div/div[2]/div/form/div[7]/div/button"));
			
		}
		
		//key Interviewers (For Second Round) 
		public static WebElement drp_keyInterviewersSecond(WebDriver driver){
			return element = driver.findElement(By.xpath(".//*[@id='addSecondarySkill']/div/div/div[2]/div/form/div[8]/div/button"));
			
		}
		//Additional comments, if any
		public static WebElement txt_Additionalcomments(WebDriver driver)
		{
			return element = driver.findElement(By.xpath(".//*[@id='additionalComments']"));
		}
		//Save Button
		public static WebElement Button_Save(WebDriver driver)
		{
			return element = driver.findElement(By.xpath(".//*[@id='saveskill']"));
		}
		//Sent-request
		public static WebElement drp_Sent_Request(WebDriver driver)
		{
			return element = driver.findElement(By.xpath(".//*[@id='mail']/tbody/tr[1]/td[2]/div/button"));
		}
		
		//Detail JD
		public static WebElement lnk_DetailJD(WebDriver driver)
		{
			return element = driver.findElement(By.xpath(".//*[@id='addSecondarySkillButton1']"));
		}
		
		//NotifyTo
		public static WebElement drp_NotifyTo(WebDriver driver)
		{
			return element = driver.findElement(By.xpath(".//*[@id='mail']/tbody/tr[1]/td[4]/div/button"));
		}
		
		//Comments
   public static WebElement txt_comments(WebDriver driver)
  {
	return element = driver.findElement(By.xpath(".//*[@id='myTextArea']"));
	
  }
   //GenerateRequest
   public static WebElement btn_GenerateRequest(WebDriver driver)
  {
	return element = driver.findElement(By.xpath(".//*[@id='submitForm']"));
 }

}
