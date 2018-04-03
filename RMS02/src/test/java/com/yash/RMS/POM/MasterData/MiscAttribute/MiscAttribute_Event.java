package com.yash.RMS.POM.MasterData.MiscAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MiscAttribute_Event {
	
	private static WebElement element = null;


	public static WebElement dropdown_ShowMore(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_length']/label/select"));
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
		public static WebElement TextBox_AddEvent(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]/input"));
			return element;	
		}
		public static WebElement TextBox_AddDesc(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[3]/input"));
			return element;	
		}
		public static WebElement lnk_AddSave(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[4]/a"));
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
		public static WebElement eventTableID(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='example']"));
					return element;
		}
		

		public static WebElement lnk_SNo(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[1]"));
					return element;
		}
		
		public static WebElement lnk_SNoclick(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='16']/td[1]/a"));
					return element;
		}	
		
		public static WebElement lnk_Event(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[2]"));
					return element;
		}	
		
		
		public static WebElement lnk_Description(WebDriver driver){
			element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[3]"));
					return element;
		}	
				
		
		public static WebElement lnk_edit(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/table/tbody/tr/td[4]/a"));
					return element;
		}
		public static WebElement lnk_EditSave(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/table/tbody/tr/td[4]/a"));
			return element;	
		}
		
		public static WebElement TextBox_EditEvent(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/table/tbody/tr/td[2]/input"));
			return element;	
		}
		public static WebElement Dropdown_EditDesc(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/table/tbody/tr/td[3]/input"));
			return element;	
		}
		public static WebElement Dropdown_EditEmployeeCategory(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[2]/td[2]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditGrade(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[2]/td[6]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditOwnership(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[3]/td[2]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditDesignation(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[3]/td[4]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditParentBGBU(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[3]/td[6]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditBaseLocation(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[4]/td[2]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditCurrentLocation(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[4]/td[4]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditCurrentRM2(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[4]/td[6]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditCurrentBGBU(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[5]/td[2]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditCurrentRM1(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[5]/td[4]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditContactNumber2(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[5]/td[6]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditEmailId(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[6]/td[2]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditContactNumber1(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[6]/td[4]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditAppraisalDate1(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[6]/td[6]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditDOJ(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[7]/td[2]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditConfirmationDate(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[7]/td[4]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditLoanTransferDateFrom(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[7]/td[6]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditAppraisalDate2(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[8]/td[2]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditReleaseDate(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[8]/td[4]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditLoanTransferDateTo(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[8]/td[6]/span/input"));
			return element;	
		}
		public static WebElement Dropdown_EditBGHName(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[9]/td[2]/span/input"));
			return element;	
		}  
		public static WebElement Dropdown_EditBUHName(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[9]/td[4]/span/input"));
			return element;	
		} 
		public static WebElement Dropdown_EditHRName(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[9]/td[6]/span/input"));
			return element;	
		} 
		public static WebElement Dropdown_EditBGHComments(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[10]/td[2]/span/input"));
			return element;	
		} 
		public static WebElement Dropdown_EditBUHComments(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[10]/td[4]/span/input"));
			return element;	
		} 
		public static WebElement Dropdown_EditHRComments(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[10]/td[6]/span/input"));
			return element;	
		} 
		public static WebElement Dropdown_EditBGHCommentsDate(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[11]/td[2]/span/input"));
			return element;	
		} 
		public static WebElement Dropdown_EditBUCommentsDate(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[11]/td[4]/span/input"));
			return element;	
		} 
		public static WebElement Dropdown_EditHRCommentsDate(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[11]/td[6]/span/input"));
			return element;	
		} 
		public static WebElement lnk_AddApplySave(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/table/tbody/tr[1]/td[2]/div/form/table/tbody[1]/tr/td/a"));
			return element;	
		}	
		
		public static WebElement lnk_EventNo(WebDriver driver) {
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/table/tbody/tr/td[1]/a"));
			return element;	
		}
				
		public static WebElement lnk_delete(WebDriver driver){
			element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/table/tbody/tr/td[5]/a"));
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
		
		
		

}
