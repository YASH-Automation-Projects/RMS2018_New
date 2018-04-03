package com.yash.RMS.CustomProperties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItexample {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\RMS\\Automation_RMS_27-Dec-2017\\Automation_RMS_27-Dec-2017\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://inidrrmstsrv01:8080/rms/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Constant.driver.findElement(By.xpath("html/body/div[1]/aside/section/ul/li[1]/a/span")).click();
		Thread.sleep(5000);
		Constant.driver.findElement(By.xpath(".//a[@class='editProfile']")).click();
		Thread.sleep(5000);
//		Runtime.getRuntime().exec("G:/Tutorial/AutoItScripts/upload.exe");

	}

}
