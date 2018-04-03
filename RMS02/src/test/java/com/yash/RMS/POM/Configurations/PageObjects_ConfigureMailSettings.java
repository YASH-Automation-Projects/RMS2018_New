package com.yash.RMS.POM.Configurations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.CommonMethods;

public class PageObjects_ConfigureMailSettings {
	private static WebElement element = null;
	// link Configurations
	public static WebElement link_Configurations(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div/aside/section/ul/li[7]/a/span"))), driver);
		return element;	
	}
	// link Configure Mail Settings
	public static WebElement link_ConfigureMailSettings(WebDriver driver){
		element = CommonMethods.waitForElement(driver.findElement(By.id("menuMailConfiguration")), driver);
		return element;	
	}
	// Text Mail Configuration
	public static WebElement Text_MailConfiguration(WebDriver driver){
		element= CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div/div[1]/div[1]/h1")), driver);
		return element;
	}
	// Drop down Show entries
	public static WebElement dropdown_ShowEntries(WebDriver driver){
		element= CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[1]/div[1]/label/select")), driver);
		return element;
	}
	// Text box Search
	public static WebElement textbox_Search(WebDriver driver){
	//	element= CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='projectTableId_filter']/label/input")), driver);
	//	element= CommonMethods.waitForElement(driver.findElement(By.xpath(".//input[@name='search_projectCode']")), driver);
		element= CommonMethods.waitForElement(driver.findElement(By.xpath(".//input[@name='search_projectName']")), driver);
		return element;
	}
	// Sorting Project ID
	public static WebElement Sorting_ProjectID(WebDriver driver){
	//	element= CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/thead/tr/th[1]")), driver);
		element= CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[8]/div[1]/div/table/thead/tr[1]/th[1]")), driver);
		
		return element;
	}
	// Sorting Project Name
	public static WebElement Sorting_ProjectName(WebDriver driver){
	//	element= CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/thead/tr/th[2]")), driver);
		element= CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[8]/div[1]/div/table/thead/tr[1]/th[2]")), driver);
		return element;
	}
	// Sorting Customer Name
	public static WebElement Sorting_CustomerName(WebDriver driver){
	//	element= CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/thead/tr/th[3]")), driver);
		element= CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[8]/div[1]/div/table/thead/tr[1]/th[3]")), driver);
		return element;
	}
	// Sorting Project Manager
	public static WebElement Sorting_ProjectManager(WebDriver driver){
	//	element= CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/thead/tr/th[4]")), driver);
		element= CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[8]/div[1]/div/table/thead/tr[1]/th[4]")), driver);
		return element;
	}
	// Sorting Project Kick off Date
	public static WebElement Sorting_ProjectKickoffDate(WebDriver driver){
	//	element= CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/thead/tr/th[5]")), driver);
		element= CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[8]/div[1]/div/table/thead/tr[1]/th[5]")), driver);
		return element;
	}
	// Sorting Showing Count Entries
	public static WebElement text_ShowingCountEntries(WebDriver driver){
		element= CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[2]/div[1]")), driver);
		return element;
	}
	// Sorting Project ID Name
	public static WebElement text_ProjectIDName(WebDriver driver){
		element= CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[2]/div[1]")), driver);
		return element;
	}
	// check box Select All
	public static WebElement checkbox_SelectAll(WebDriver driver){
		element= CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/table/tbody/tr/td/input")), driver);
		return element;
	}
	// link Save
	public static WebElement link_Save(WebDriver driver){
		element= CommonMethods.waitForElement(driver.findElement(By.id("save")), driver);
		return element;
	}

	// searched project id
	public static WebElement Searched_ProjectID(WebDriver driver){
	//	element= CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr[1]/td/a")), driver);
		element= CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[8]/div[2]/table/tbody/tr/td[1]/a")), driver);
		
		return element;
	}
	//Conformaion message
	public static WebElement Conf_Message(WebDriver driver){
		element= CommonMethods.waitForElement(driver.findElement(By.xpath("//div[contains(@class,'toast-message')]")), driver);
		return element;
	}
}/**EOC************/
