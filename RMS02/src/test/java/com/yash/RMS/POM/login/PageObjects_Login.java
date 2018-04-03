package com.yash.RMS.POM.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PageObjects_Login {
   
	private static WebElement element = null;
		
	
	

	
	public static WebElement txt_loggedinuser(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/header/nav/div/ul/li/a/span"));
		return element;	
	}
	
	
	}
