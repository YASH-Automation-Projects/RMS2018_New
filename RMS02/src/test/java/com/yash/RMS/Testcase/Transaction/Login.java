package com.yash.RMS.Testcase.Transaction;

import java.lang.reflect.Array;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	public static Array mobileno1;
	public static String mobileno2;
	{
WebDriver driver = new FirefoxDriver();
driver.get("http://inidrrmstsrv01:8080/rms");
driver.manage().window().maximize();


driver.findElement(By.xpath(("//a[@class='editProfile']"))).click();

driver.switchTo().frame(0);

WebElement htmltable=driver.findElement(By.xpath(".//*[@id='skillsList']/div/ul/li[1]/div[1]"));

List<WebElement> rows=htmltable.findElements(By.tagName("tr"));

for(int rnum=0;rnum<rows.size();rnum++)
{
	List<WebElement> columns=rows.get(rnum).findElements(By.tagName("th"));

	System.out.println("Number of columns:"+columns.size());
	
	for(int cnum=0;cnum<columns.size();cnum++)
	{
		System.out.println(columns.get(cnum).getText());
	}
}

		
	}
	



	}


	
	

		
//		 
//		 Runtime.getRuntime().exec("F:\\AutoIT\\FileUpload.exe");
//		 
		 
		 
		
	
	

