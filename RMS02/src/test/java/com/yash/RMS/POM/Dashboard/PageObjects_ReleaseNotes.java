package com.yash.RMS.POM.Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.CommonMethods;

public class PageObjects_ReleaseNotes {
	
	private static WebElement element = null;
	//Click on Dashboard
	public static WebElement link_Dashboard(WebDriver driver)
	{
		 element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div[1]/aside/section/ul/li[1]/a/span"))), driver);
		return element;
		
	}

//Click on Release Notes 
	public static WebElement link_ReleaseNotes(WebDriver driver)
	{
		 element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//a[@class='releaseNotes']"))), driver);
		return element;	
	}
	
	// text release notes
	public static WebElement text_ReleaseNote(WebDriver driver)
	{
		 element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div[1]/div/h1"))), driver);
		return element;	
	}
	
	// close release notes
	public static WebElement close_ReleaseNoteicon(WebDriver driver)
	{
		element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//a[@title='Close']"))), driver);
		return element;
	}

}
