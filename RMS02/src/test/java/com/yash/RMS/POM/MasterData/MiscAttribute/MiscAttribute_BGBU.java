package com.yash.RMS.POM.MasterData.MiscAttribute;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class MiscAttribute_BGBU {

	
	private static WebElement element = null;


	public static WebElement dropdown_ShowMore(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='orgTable_length']/label/select"));
		return element;	
	}

	public static WebElement TextBox_Search(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/div[2]/label/input"));
		return element;	
	}

		public static WebElement lnk_AddNew(WebDriver driver) {
			element = driver.findElement(By.id("addNew"));
		//	element = driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[1]/div[2]/a"));
			return element;	
		}	
		public static WebElement TextBox_AddName(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/table/tbody/tr[1]/td[1]/center/input"));
			return element;	
		}	
		public static WebElement TextBox_AddDesc(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/center/input"));
			return element;	
		}			
		public static WebElement dropdown_AddBGBUHead(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/span/input"));
			return element;	
		}	
		
		public static WebElement lnk_AddSave(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/center/a[1]"));
			return element;	
		}	

		public static WebElement lnk_AddDelete(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/table/tbody/tr[1]/td[6]/center/a"));
			return element;	
		}	
		
		public static WebElement Button_DeleteOk(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/ul[3]/li/div/div[2]/button[1]"));
			return element;	
		}	
		public static WebElement Button_DeleteCancel(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/ul[3]/li/div/div[2]/button[2]"));
			return element;	
		}	
		public static WebElement Button_First(WebDriver driver) {
			element = driver.findElement(By.id("orgTable_first"));
			return element;
		}
		
		public static WebElement Button_Previous(WebDriver driver) {
			element = driver.findElement(By.id("orgTable_previous"));
			return element;
		}	
		
		public static WebElement Button_Next(WebDriver driver) {
			element = driver.findElement(By.id("orgTable_next"));
			return element;
		}
		
		public static WebElement Button_Last(WebDriver driver) {
			element = driver.findElement(By.id("orgTable_last"));
			return element;
		}	
		
		
		public static WebElement Button_Pagenumber(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='orgTable_paginate']/span/a[1]"));
					return element;
		}
		
		public static WebElement lnk_Name(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='orgTable']/thead/tr/th[1]"));
					return element;
		}
		
		public static WebElement lnk_NameBG(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='30']/td[1]/a"));
					return element;
		}
		
		
		public static WebElement lnk_Description(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='orgTable']/thead/tr/th[2]"));
					return element;
		}	
		
		public static WebElement lnk_CreationDate(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='orgTable']/thead/tr/th[3]"));
					return element;
		}	
				
		public static WebElement lnk_edit(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/a"));
					return element;
		}
		
		public static WebElement TextBox_EditName(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/table/tbody/tr/td[1]/center/input"));
			return element;	
		}	
		public static WebElement TextBox_EditDesc(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/table/tbody/tr/td[2]/center/input"));
			return element;	
		}	
		public static WebElement lnk_EditSave(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/table/tbody/tr[1]/td[5]/center/a[1]"));
			return element;	
		}	
		
		public static WebElement lnk_Deactivate(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/table/tbody/tr/td[6]/a"));
					return element;
		}
		public static WebElement lnk_Activate(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/table/tbody/tr/td[6]/a"));
					return element;
		}		
		public static WebElement lnk_BGBUName(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/table/tbody/tr/td[1]/a"));
					return element;
		}	
		public static WebElement lnk_BGBUMove(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/form/div[3]/div[2]/div/table/tbody/tr/td[7]/a"));
					return element;
		}
		
		public static WebElement Button_BGBUMove(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/input[1]"));
					return element;
		}
		public static WebElement Button_BGBUMoveOK(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/ul/li/div/div[2]/button"));
					return element;
		}		
		
		public static WebElement Button_BGBUMoveClose(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[2]/div/div/a"));
					return element;
		}		
		public static WebElement Dropdown_BGBUMove(WebDriver driver){
			element = driver.findElement(By.id("test"));
			return element;
		}		
		public static WebElement lnk_Organization(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/form/div[2]/font"));
					return element;
		}			
		
		
		public static WebElement BGBUTableID(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='orgTable']"));
					return element;
		}	
		
		
		
		
		
		
		
		
		
		
}
