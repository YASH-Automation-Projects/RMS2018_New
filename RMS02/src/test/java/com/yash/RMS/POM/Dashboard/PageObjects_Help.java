package com.yash.RMS.POM.Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.CommonMethods;

public class PageObjects_Help {
	
	private static WebElement element = null;
	//Click on Resource Requests
	public static WebElement link_Dashboard(WebDriver driver)
	{
		 element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div[1]/aside/section/ul/li[1]/a/span"))), driver);
		return element;
		
	}

//Click on Resource Requisition 
	public static WebElement link_Help(WebDriver driver)
	{
		 element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//a[@class='help']"))), driver);
		return element;	
	}
	
	// text release notes
	public static WebElement text_RMSGuide(WebDriver driver)
	{
		 element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div[1]/div/h1"))), driver);
		return element;	
	}
	
	public static WebElement lnk_GuideforRole_BG_Admin(WebDriver driver)
	{
		 element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//a[@id='GuideforRole_BG_Admin']"))), driver);
		return element;	
	}
	
	
	public static WebElement lnk_GuideforRole_Del_Manager(WebDriver driver)
	{
		 element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//a[@id='GuideforRole_Del_Manager']"))), driver);
		return element;	
	}
	
	public static WebElement lnk_GuideforRole_Manager(WebDriver driver)
	{
		 element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//a[@id='GuideforRole_Manager']"))), driver);
		return element;	
	}
	
	public static WebElement lnk_GuideforRole_User(WebDriver driver)
	{
		 element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//a[@id='GuideforRole_User']"))), driver);
		return element;	
	}
	
	// close release notes
	public static WebElement close_Help(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//a[@title='Close']"))), driver);
		return element;
	}

}
