package com.yash.RMS.POM.MasterData.MiscAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MiscAttribute_ParentProject {


	private static WebElement element = null;


	public static WebElement dropdown_ShowMore(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_length']/label/select"));
		return element;	
	}

	public static WebElement TextBox_Search(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[3]/label/input"));
		return element;	
	}

		public static WebElement lnk_AddNew(WebDriver driver) {
		//	element = driver.findElement(By.id("addNew"));
			element = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[1]/div[2]/a"));
		//	element = driver.findElement(By.xpath(".//a[@id='addNew']"));
			
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
			element = driver.findElement(By.xpath(".//*[@id='example_paginate']/span/a[1]"));
					return element;
		}
		

		public static WebElement lnk_SNo(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[1]"));
					return element;
		}
		
		public static WebElement lnk_ParentProjectTeam(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[2]"));
					return element;
		}	
		
		
		public static WebElement lnk_ProjectManager(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[3]"));
					return element;
		}	
				
		public static WebElement lnk_edit(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[4]/a"));
					return element;
		}
		public static WebElement lnk_delete(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[5]/a"));
					return element;
		}
		public static WebElement lnk_deleteCancel(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/ul[2]/li/div/div[2]/button[2]"));
					return element;
		}
		public static WebElement lnk_deleteOk(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/ul[2]/li/div/div[2]/button[1]"));
					return element;
		}
		public static WebElement TextBox_AddProject(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]/center/input"));
		//	element = driver.findElement(By.xpath(".//input[@type='text' AND @value=' ']"));
			
					return element;
		}
		public static WebElement Dropdown_AddManager(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/span/input"));
			return element;
		}
		public static WebElement lnk_AddSave(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[4]/a"));
					return element;
		}
		public static WebElement Dropdown_Value1(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/ul[2]/li[1]/a"));
					return element;
		}
		public static WebElement TextBox_EditProject(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]/center/input"));
					return element;
		}
		public static WebElement Dropdown_EditManager(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]/span/input"));
			return element;
		}
		public static WebElement lnk_EditSave(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[4]/a"));
					return element;
		}
		public static WebElement parentProjectTableID(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='example']"));
					return element;
		}
		
		
		
}
