package com.yash.RMS.POM.ProjectAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.CommonMethods;

public class PageObjects_ProjectAttribute_Currency {
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

	// link Currency
	public static WebElement lnk_Currency(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.id("menuCurrencysList"))), driver);
		return element;	
	}
	// Text Currency
	public static WebElement Text_Currency(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div/div[1]/div[1]/h1"))), driver);
		return element;	
	}
	// Text Currency
	public static WebElement dropdown_ShowEntries(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/label/select"))), driver);
		return element;	
	}
	// Text box Search
	public static WebElement Textbox_Search(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[3]/label/input"))), driver);
		return element;	
	}
	// Link Add New
	public static WebElement link_AddNew(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("//a[contains(.,'Add New')]"))), driver);
		return element;	
	}
	// Sorting Serial No
	public static WebElement Sorting_SerialNo(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[1]"))), driver);
		return element;	
	}
	// Sorting Currency Name
	public static WebElement Sorting_CurrencyName(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[2]"))), driver);
		return element;	
	}
	// Link Edit
	public static WebElement Link_Edit(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/a"))), driver);
		return element;	
	}
	// Link Delete
	public static WebElement Link_Delete(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[4]/a"))), driver);
		return element;	
	}

	// Text box Currency Name
	public static WebElement TextBox_CurrencyName(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]/input"))), driver);
		return element;	
	}
	// Link Save
	public static WebElement Link_Save(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.linkText("Save"))), driver);
		return element;	
	}

	// Link CountText
	public static WebElement CountText(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/div[7]/div[1]"))), driver);
		return element;	
	}
	//Sorting Currency name
			public static WebElement Sorting_CurrencyNamelist(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[2]"))), driver);
		return element;	
	}
			//Sorting Currency name
			public static WebElement Sorting_SerialNolist(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[1]"))), driver);
		return element;	
	}
			
}
