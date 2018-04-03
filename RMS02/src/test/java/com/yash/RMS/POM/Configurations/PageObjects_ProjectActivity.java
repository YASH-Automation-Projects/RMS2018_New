package com.yash.RMS.POM.Configurations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects_ProjectActivity {

	private static WebElement element = null;
	public static WebElement TextBox_Search(WebDriver driver) {
	//	element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[3]/label/input"));
		element = driver.findElement(By.xpath(".//input[@name='search_projectName']"));
		return element;	
	}
	public static WebElement ProjectActivityTableID(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='projectTableId_length']/label/select"));
		return element;	
	}
	public static WebElement sort_ProjectID(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='862']/td[1]"));
		return element;	
	}

	public static WebElement ProjectName(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='projectTableId']/thead/tr/th[2]"));
		return element;	
	}
	public static WebElement sort_ProjectName(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr[1]/td[2]"));
		return element;	
	}
	public static WebElement Dropdown_Status(WebDriver driver) {
	//	element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[1]/div/span/select"));
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span/select"));
			
		return element;	
	}
	public static WebElement Dropdown_ShowEntry(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='projectTableId_length']/label/select"));
		return element;	
	}
	public static WebElement ProjectID(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='projectTableId']"));
		return element;	
	}
	public static WebElement lnk_ProjectName(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr[1]/td[1]/a"));
		
		return element;	
	}

	public static WebElement lnk_Cancel(WebDriver driver) {
	//	element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/table/tbody/tr/td/form/div/div/a[2]"));
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/table/tbody/tr/td/form/div/div/a[2]"));
		return element;	
	}

	public static WebElement lnk_SaveActivity(WebDriver driver) {
	//	element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/table/tbody/tr/td/form/div/div/a[1]"));
		element = driver.findElement(By.xpath(".//a[@onclick='saveactivity()']"));
		return element;	
	}

	public static WebElement lnk_DefaultActivity(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/table/tbody/tr/td/form/table[1]/tbody/tr[1]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[1]/span/select/option[1]"));
		return element;	
	}
	public static WebElement Button_DefaultActivityToLeft(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/table/tbody/tr/td/form/table[1]/tbody/tr[1]/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td/input"));
		return element;	
	}

	public static WebElement lnk_SEPGActivity(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/table/tbody/tr/td/form/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[1]/span/select/option[1]"));
		return element;	
	}
	public static WebElement Button_SEPGActivityToLeft(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/table/tbody/tr/td/form/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td/input"));
		return element;	
	}

	public static WebElement lnk_CustomActivity(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/table/tbody/tr/td/form/table[3]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[1]/span/select/option[1]"));
		return element;	
	}
	public static WebElement Button_CustomActivityToLeft(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/table/tbody/tr/td/form/table[3]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td/input"));
		return element;	
	}
	public static WebElement lnk_ProjectNameCol(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/thead/tr/th[2]"));
		return element;	
	}
	
	
	public static WebElement lnk_searchedProjectName(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[8]/div[2]/table/tbody/tr/td[1]/a"));
		
		return element;	
	}
}//**EOC *****/
