package com.yash.RMS.POM.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactory_Login {

 
		
final WebDriver driver;


@FindBy(xpath= "html/body/div[1]/header/nav/div/ul/li/a/span")

public WebElement txt_loggedinuser;



//This is a constructor, as every page need a base driver to find web elements

public PageFactory_Login(WebDriver driver)
{

this.driver = driver;

} 
	

}	
	 
	
	 
