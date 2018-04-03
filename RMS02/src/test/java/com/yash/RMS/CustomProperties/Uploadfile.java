package com.yash.RMS.CustomProperties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Uploadfile {
	
	public static WebElement lnk_Browse(WebDriver driver)
	{
		  WebElement element = driver.findElement(By.xpath("//input[@type='file']"));
		 return element;
	
	}

}
