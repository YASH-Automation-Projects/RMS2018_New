package com.yash.RMS.POM.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Admin_Projects {
private static WebElement element = null;
	
	public static WebElement lnk_AddNew(WebDriver driver){
		element = driver.findElement(By.xpath("//a[@id='addNew']"));
				return element;				   
	}
	
	
	
	public static WebElement TextBox_ProjectID(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input[1]"));
				return element;
	}
	public static WebElement TextBox_ProjectName(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr[2]/td[4]/div/input"));
				return element;
	}
	public static WebElement Dropdown_ProjectCategory(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr[2]/td[6]/span/input"));
				return element;
	}
	public static WebElement Dropdown_BU(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/span/input"));
				return element;
	}
	public static WebElement Dropdown_CustomerName(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr[3]/td[4]/span/input"));
				return element;
	}
	public static WebElement Dropdown_ParentProjectTeam(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr[3]/td[6]/span/input"));
				return element;
	}
	public static WebElement TextBox_CustomerContacts(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input"));
				return element;
	}
	public static WebElement Dropdown_Manager(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr[4]/td[4]/span/input"));
				return element;
	}
	public static WebElement lnk_ManagerName(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/ul[6]/li/a"));
				return element;
	}
	public static WebElement TextBox_CustomerRelationshipManager(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr[4]/td[6]/input"));
				return element;
	}
	public static WebElement Dropdown_EngagementModel(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/span/input"));
				return element;
	}
	public static WebElement Date_ProjectKickoffdate(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr[5]/td[4]/input"));
				return element;
	}
	public static WebElement date_Projectkickoffdateselect(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr[1]/td[5]/a"));
				return element;
	}
	public static WebElement date_ProjectkickoffdateMonth(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[2]/div[1]/div/select[1]"));
				return element;
	}
	public static WebElement date_ProjectkickoffdateYear(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[2]/div[1]/div/select[2]"));
				return element;
	}
	public static WebElement Date_EndDate(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr[5]/td[6]/input"));
				return element;
	}
	public static WebElement date_ProjectEnddateMonth(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[2]/div[1]/div/select[1]"));
				return element;
	}
	public static WebElement date_ProjectEnddateYear(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[2]/div[1]/div/select[2]"));
				return element;
	}
	public static WebElement TextBox_PlannedProjectSize(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/div/input"));
				return element;
	}
	
	public static WebElement Dropdown_Projecttrackingcurrency(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr[6]/td[4]/span/input"));
				return element;
	}
	
	public static WebElement Dropdown_DevelopmentMethodology(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr[7]/td[2]/span/input"));
				return element;
	}
	public static WebElement lnk_DevelopmentMethodologyName(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/ul[9]/li[1]/a"));
				return element;
	}
	public static WebElement TextArea_Description(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr[7]/td[4]/textarea"));
				return element;
	}
	
	public static WebElement Dropdown_Invoicedby(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[2]/form/table/tbody/tr[7]/td[6]/span/input"));
				return element;
	}
	
	public static WebElement Dropdown_InvoicedbyValue(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/ul[10]/li/a"));
				return element;
	}
	
	public static WebElement dropdown_Status(WebDriver driver){
		//element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[1]/div/span[2]/select"));
		element = driver.findElement(By.xpath("//select[@id='projectActive']"));
		//select[@id='projectActive']		
		return element;
				
	}
	public static WebElement dropdown_ShowEntry(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[2]/label/select"));
				return element;
	}
	public static WebElement ProjectID(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='projectTableId']"));
		return element;	
	}
	public static WebElement lnk_AddSave(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/a/img"));
		return element;
	}
	public static WebElement textbox_SearchProject(WebDriver driver) {
		//element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[3]/label/input"));
		


		
		return element;
	}
	public static WebElement lnk_ProjectNameID(WebDriver driver) {
		//element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div/table/tbody/tr[1]/td[1]/a"));
		element = driver.findElement(By.xpath(".//*[@id='projectTableId']/tbody/tr[1]/td[1]/a"));
		return element;	
	}

}
