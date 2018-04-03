//package com.yash.RMS.POM.MasterData.ProjectAttribute;
package com.yash.RMS.POM.ProjectAttribute;

//package com.yash.RMS.POM.ProjectAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.CommonMethods;

public class PageObjects_ProjectAttribute_EngagementModel {

	private static WebElement element = null;

	// link Master Data
	public static WebElement lnk_MasterData(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div/aside/section/ul/li[5]/a"))), driver);
		return element;	
	}

	// link project Attribute
	public static WebElement lnk_ProjectAttribute(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div/aside/section/ul/li[5]/ul/li[2]/a"))), driver);
		return element;	
	}

	// link Engagement Model
	public static WebElement lnk_EngagementModel(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.id("menuEngagementModelList"))), driver);
		return element;	
	}
	// Text Engagement Model
	public static WebElement Text_EngagementModel(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div/div[1]/div[1]/h1"))), driver);
		return element;	
	}

	// Drop down Show More
	public static WebElement Dropdown_ShowMore(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example_length']/label/select"))), driver);
		return element;	
	}
	// Text Box Search
	public static WebElement TextBox_Search(WebDriver driver) {
		//	element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example_length']/label/select"))), driver);
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[3]/label/input"))), driver);
		return element;	
	}
	// TextBox_EngagementModel
	public static WebElement TextBox_EngagementModel(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]/input"))), driver);
		return element;	
	}
	// lnk AddNew
	public static WebElement link_AddNew(WebDriver driver) {
		//element = CommonMethods.waitForElement(driver.findElement((By.xpath("//a[contains(.,'Add New')]"))), driver);
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("//a[contains(@id,'addNew')]"))), driver);
		return element;	
	}
	// Button_First
	public static WebElement Button_First(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.id("example_first"))), driver);
		return element;	
	}
	// Button_Previous
	public static WebElement Button_Previous(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.id("example_previous"))), driver);
		return element;	
	}

	// Button_Pagenumber
	public static WebElement Button_Pagenumber(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example_paginate']/span/a"))), driver);
		return element;	
	}
	// link SNo
	public static WebElement Sorting_SNo(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example']/thead/tr/th[1]"))), driver);
		return element;	
	}
	// link Engagement Model Name
	public static WebElement Sorting_EngagementModelName(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example']/thead/tr/th[2]"))), driver);
		return element;	
	}
	// link Time sheet Compulsory
	public static WebElement Sorting_TimesheetCompulsory(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example']/thead/tr/th[3]"))), driver);
		return element;	
	}
	// link Time sheet Compulsory
	public static WebElement link_edit(WebDriver driver) {
		//element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='9']/td[4]/a"))), driver);
		element = CommonMethods.waitForElement(driver.findElement((By.linkText("Edit"))), driver);
		return element;	
	}
	// link Save
	public static WebElement link_Save(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.linkText("Save"))), driver);
		return element;	
	}
	// link Delete
	public static WebElement Link_Delete(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.linkText("Delete"))), driver);
		return element;	
	}
}
