package com.yash.RMS.POM.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.CommonMethods;

public class PageObjects_TimesheetApprovals {

	private static WebElement element = null;
	public static WebElement lnk_Transaction(WebDriver driver){
		//	element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='menuProjectActivity']")), driver);
			element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='transactionList']/a/span")), driver);
			return element;	
		}

		public static WebElement lnk_TimesheetSubmission(WebDriver driver){
			element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//a[@id='menuUserActivityList']")), driver);
			return element;	
		}
		
		public static WebElement Text_TimesheetSubmission(WebDriver driver){
			element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//h1[text()='Timesheet Submission']")), driver);
			return element;	
		}

}
