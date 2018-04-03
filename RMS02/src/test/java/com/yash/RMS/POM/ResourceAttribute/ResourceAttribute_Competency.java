package com.yash.RMS.POM.ResourceAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResourceAttribute_Competency {
	private static WebElement element = null;
	
	public static WebElement Dropdown_ShowMore(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_length']/label/select"));
		return element;	
	}
	
	public static WebElement lnk_AddNew(WebDriver driver) {
		element = driver.findElement(By.id("addNew"));
		return element;	
	}
	/*public static WebElement competencyTableID(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']"));
		return element;	
	}*/
	
	public static WebElement TextBox_AddCompetency(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]/input"));
		return element;	
	}
	
	public static WebElement lnk_AddSave(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/a"));
		return element;	
	}
	
	public static WebElement TextBox_Search(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[3]/label/input"));
		return element;	
	}
	
	public static WebElement lnk_edit(WebDriver driver) {
	//	element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]/a"));
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/a"));
		
		return element;	
	}
	
	public static WebElement TextBox_EditCompetency(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]/input"));
		return element;	
	}
	
	public static WebElement lnk_EditSave(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]/a"));
		return element;	
	}
	
	public static WebElement lnk_delete(WebDriver driver) {
	//	element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[4]/a"));
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[4]/a"));
		return element;	
	}
	
	public static WebElement lnk_deleteCancel(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/ul[2]/li/div/div[2]/button[2]"));
		return element;	
	}
	
	public static WebElement lnk_deleteOk(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/ul[2]/li/div/div[2]/button[1]"));
		return element;	
	}
	public static WebElement competencyTableID(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']"));
		return element;	
	}
	
	
	
	
	
}
