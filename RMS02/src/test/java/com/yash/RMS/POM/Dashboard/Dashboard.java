package com.yash.RMS.POM.Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.CommonMethods;

public class Dashboard {

	private static WebElement element = null;

	public static WebElement lnk_MasterData(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='masterDataList']/a/span"));
		return element;
	}

	public static WebElement lnk_ResourceAttribute(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='resourceAttributeList']/a"));
		return element;
	}

	public static WebElement lnk_VisaPage(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='menuVisaList']"));
		return element;
	}

	public static WebElement lnk_MiscAttribute(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='miscAttributeList']/a"));
		return element;
	}

	public static WebElement lnk_BGBU(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='menuOrganizationList']"));
		return element;
	}	

	public static WebElement lnk_ParentProject(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='menuTeamList']"));
		return element;
	}	
	public static WebElement lnk_Event(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='menuEventList']"));
		return element;
	}	
	public static WebElement lnk_CompetencyPage(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='menuCompetencyList']"));
		return element;
	}	
	public static WebElement lnk_OwnershipPage(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='menuOwnershipsList']"));
		return element;
	}	

	public static WebElement lnk_EmployeeCategoryPage(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='menuEmployeeCategoriesList']"));
		return element;
	}	
	public static WebElement lnk_Transaction(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='transactionList']/a/span"));
		return element;
	}	
	public static WebElement lnk_ProjectActivityPage(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='menuProjectActivity']"));
		return element;
	}	
	public static WebElement lnk_TimesheetSubmission(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='menuUserActivityList']"));
		return element;
	}
	public static WebElement lnk_ConfigurationPage(WebDriver driver){
	//	element = driver.findElement(By.xpath(".//*[@id='mailConfigurationList']/a/span"));
		element = driver.findElement(By.xpath("html/body/div[1]/aside/section/ul/li[7]/a/span"));
		return element;
	}	
	public static WebElement lnk_Admin(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='adminList']/a"));
		return element;
	}	
	public static WebElement lnk_ProjectsPage(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='menuProjectList']"));
		return element;
	}
	/******************************************************************************/

	/*public static WebElement lnk_Transaction(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='menuProjectActivity']")), driver);
		return element;	
	}

	public static WebElement lnk_TimesheetSubmission(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='menuUserActivityList']")), driver);
		return element;	
	}
	public static WebElement lnk_ConfigurationPage(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='mailConfigurationList']/a/span")), driver);
		return element;	
	}

	public static WebElement lnk_Admin(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='adminList']/a")), driver);
		return element;	
	}

	public static WebElement lnk_ProjectsPage(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='menuProjectList']")), driver);
		return element;	
	}*/

	/******************************************************************************/

}

//***************************************************************************************