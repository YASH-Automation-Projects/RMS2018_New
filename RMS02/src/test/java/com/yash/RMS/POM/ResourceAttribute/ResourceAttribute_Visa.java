package com.yash.RMS.POM.ResourceAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResourceAttribute_Visa {

	
	private static WebElement element = null;
	
// Visa Page Attributes
	public static WebElement dropdown_ShowEntry(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_length']/label/select"));
		return element;	
	}
	public static WebElement visaTableID(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']"));
		return element;	
	}
	public static WebElement TextBox_Search(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_filter']/label/input"));
		return element;	
	}
	
	public static WebElement TextBox_Add(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[2]/input"));
		return element;	
	}

	public static WebElement Button_Save(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[3]/a[1]"));
		return element;	
	}
	
	public static WebElement Button_Cancel(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[3]/a[2]"));
		return element;	
	}
	
		public static WebElement lnk_AddNew(WebDriver driver) {
		//	element = driver.findElement(By.id("addNew"));
			element = driver.findElement(By.xpath(".//*[@id='addNew']"));
			
			return element;	
		}	
			

		public static WebElement Button_First(WebDriver driver) {
			element = driver.findElement(By.id("example_first"));
			return element;
		}
		
		public static WebElement Button_Previous(WebDriver driver) {
			element = driver.findElement(By.id("example_previous"));
			return element;
		}	
		
		
		public static WebElement Button_Next(WebDriver driver) {
			element = driver.findElement(By.id("example_next"));
			return element;
		}
		
		public static WebElement Button_Last(WebDriver driver) {
			element = driver.findElement(By.id("example_last"));
			return element;
		}			
		
		public static WebElement Button_Pagenumber(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='example_paginate']/span/a"));
					return element;
		}
		

		public static WebElement lnk_SNo(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[1]"));
					return element;
		}
		
		public static WebElement lnk_Visa(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[2]"));
					return element;
		}	
		
		public static WebElement lnk_edit(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]/a"));
					return element;
		}
		
		public static WebElement TextBox_Edit(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]/input"));
					return element;
		}
	
		public static WebElement Button_EditSave(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]/a[1]"));
					return element;
		}
		
		public static WebElement lnk_delete(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[4]/a"));
					return element;
		}
			
		public static WebElement lnk_DeleteCancel(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/ul[2]/li/div/div[2]/button[2]"));
					return element;
		}
	
	
		public static WebElement lnk_DeleteOk(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/ul[2]/li/div/div[2]/button[1]"));
					return element;
		}
	
	
}
