package com.yash.RMS.POM.Useful_links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.CommonMethods;

public class Pageobjects_useful_links 
{
	

	private static WebElement element = null;

	 
	
	public static WebElement navig_useful_links(WebDriver driver)
	{

		
		element = CommonMethods.waitForElement(driver.findElement(By.linkText("Useful Links")), driver);
		
		return element;
	}
	
	public static WebElement Iconnect_link(WebDriver driver)
	{

		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='iconnectId']")), driver);
		return element;
	}
	
	public static WebElement You_Portal_link(WebDriver driver)
	{

		element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='youPortalId']")), driver);
		return element;
	}

}
