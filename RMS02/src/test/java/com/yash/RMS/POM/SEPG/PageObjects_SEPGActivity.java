package com.yash.RMS.POM.SEPG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.CommonMethods;

public class PageObjects_SEPGActivity {
	private static WebElement element = null;
	//lnk_SEPG
	
		public static WebElement lnk_SEPG(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[9]/a"));
			return element;	
		}
		
		
		//lnk_SPEG_Activity
		
			public static WebElement lnk_SPEG_Activity(WebDriver driver) {
				element = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[9]/ul/li[2]/a"));
				return element;	
			}

			// txt_SepgActivity
			public static WebElement txt_SepgActivity(WebDriver driver) {
				element = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/h1"));
				return element;	
			}
			
	public static WebElement Dropdown_ShowEntry(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_length']/label/select"));
		return element;	
	}
	
	public static WebElement SepgTableID(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']"));
		return element;	
	}
	
	public static WebElement sepgActivity_serialNoSorting(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[1]"));
		return element;	
	}
	
	public static WebElement sepgActivity_SEPGActivityNameSorting(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[2]"));
		return element;	
	}
	
	public static WebElement first_serialNoSorting(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[1]"));
		return element;	
	}
	public static WebElement sepgActivity_MandatorySorting(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[3]"));
		return element;	
	}
	public static WebElement sepgActivity_ProductiveSorting(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[3]"));
		return element;	
	}
	public static WebElement TextBox_Search(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_filter']/label/input"));
		return element;	
	}

		public static WebElement lnk_AddNew(WebDriver driver) {
			element = driver.findElement(By.id("addNew"));
			return element;	
		}	
			

		public static WebElement Button_Next(WebDriver driver) {
			element = driver.findElement(By.id("example_next"));
			return element;
		}
		
		public static WebElement Button_Previous(WebDriver driver) {
			element = driver.findElement(By.id("example_previous"));
			return element;
		}	
		
		public static WebElement Button_Pagenumber(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='example_paginate']/span/a"));
					return element;
		}
		

		public static WebElement Sorting_SNo(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[1]"));
					return element;
		}
		
		public static WebElement Sorting_SEPGActivityName(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='name']"));
					return element;
		}	
		public static WebElement Sorting_Mandatory(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[3]"));
					return element;
		}
		public static WebElement Sorting_Productive(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[4]"));
					return element;
		}

		public static WebElement lnk_edit(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='121']/td[5]/a"));
			return element;
		}


		public static WebElement lnk_delete(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='121']/td[6]/a"));
			return element;
		}
		//	***********************************Add New*************************************

		public static WebElement addNewLink(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement(By.id("addNew")), driver);
			return element;	
		}
		public static WebElement addNew_save_Link(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[5]/a[1]")), driver);
			return element;	
		}
		public static WebElement addNew_EditBox(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[2]/input")), driver);
			return element;	
		}
		public static WebElement searchBox(WebDriver driver)
		{
			element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div/div[2]/div/div[3]/label/input")), driver);
			return element;
		}

		public static WebElement saveButtonConfirmationMessage(WebDriver driver)
		{
			element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[2]/div/div[2]")), driver);
			return element;
		}
		public static WebElement btn_EditPhases(WebDriver driver) {

			element = CommonMethods.waitForElement(driver.findElement(By.linkText("Edit")), driver);
			return element;	
		}
		
		public static WebElement Edit_Txt_Phase(WebDriver driver) {

			element = CommonMethods.waitForElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]/input")), driver);
			return element;	
		}
		public static WebElement lnk_savePhases(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.linkText("Save"))), driver);
			return element;	
		}
		public static WebElement lnk_Delete(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.linkText("Delete"))), driver);
			return element;	
		}
}
