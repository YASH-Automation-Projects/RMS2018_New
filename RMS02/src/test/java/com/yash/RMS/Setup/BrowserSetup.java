package com.yash.RMS.Setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.yash.RMS.CustomProperties.Constant;


public class BrowserSetup {

	    public static void Firefoxdriver(String browser) throws Exception{
	      	        //create firefox instance
	            Constant.driver = new FirefoxDriver();
	            Constant.driver.manage().window().maximize();
	        }
	 
	        public static void Chromebrowser(String browser) throws Exception{
	             //set path to chromedriver.exe
	        	System.setProperty("webdriver.chrome.driver",Constant.ChromeDriver);
	            //create chrome instance
	            Constant.driver = new ChromeDriver();
	            Thread.sleep(3000);
	            Constant.driver.manage().window().maximize();
	        }
	               
	        public static void IEbrowser(String browser) throws Exception{
	        //Check if parameter passed as 'IE'
	                    //set path to IE.exe
	                    System.setProperty("webdriver.ie.driver",Constant.IEDriver);
	                    //create IE instance
	                    Constant.driver = new InternetExplorerDriver();
	                
	     
	        Constant.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    }

}
