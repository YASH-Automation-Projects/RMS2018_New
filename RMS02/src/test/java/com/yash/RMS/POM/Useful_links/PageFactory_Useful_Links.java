package com.yash.RMS.POM.Useful_links;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactory_Useful_Links {

	final WebDriver driver;


	@FindBy(linkText= "Useful Links")

	public WebElement navig_useful_links;
	

//	@FindBy(xpath= ".//*[@id='iconnectId']")
	
	@FindBy(xpath= ".//*[@id='youPortalId']")

	public WebElement You_Portal_link;
	
//	@FindBy(xpath= ".//*[@id='youPortalId']")
	
	@FindBy(xpath= ".//*[@id='iconnectId']")

	public WebElement Iconnect_link;
	 
	

public PageFactory_Useful_Links(WebDriver driver)
{

this.driver = driver;

} 
	

}	




		

	
		 
		
		 

