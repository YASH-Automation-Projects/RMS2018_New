package com.yash.RMS.POM.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactory_Customers 
{

	final WebDriver driver;


	@FindBy(xpath= ".//*[@id='adminList']/a/span")

	public WebElement lnk_admin;

	@FindBy(id= "menuCustomerList")

	public WebElement lnk_Customers;
	
	@FindBy(xpath= ".//*[@id='customerTableId_length']/label/select")

	public static WebElement entry;
	
	@FindBy(xpath= ".//*[@id='customerTableId']")

	public static WebElement webtable;
	
	@FindBy(xpath= ".//*[@id='customerTableId']/thead/tr/th[1]")

	public static WebElement sort_cc;
	
	@FindBy(xpath= ".//*[@id='customerTableId']/thead/tr/th[2]")

	public static WebElement sort_CN;
	
	@FindBy(xpath= ".//*[@id='customerTableId']/thead/tr/th[3]")

	public static WebElement sort_Geography;
	
	@FindBy(xpath= ".//*[@id='customerTableId']/thead/tr/th[4]")

	public static WebElement sort_AM;
	
	@FindBy(xpath= ".//*[@id='customerTableId']/thead/tr/th[5]")

	public static WebElement Sort_Mgrcontactno;
	
	@FindBy(xpath= ".//*[@id='customerTableId']/thead/tr/th[6]")

	public static WebElement Sort_Customeradd;
	
	@FindBy(xpath= "//input[@type='text']")

	public static WebElement search;
	
	@FindBy(xpath= ".//*[@id='addNew']")
	
	public static WebElement addnew;
	
    @FindBy(id = "mCusotmerID")
	
	public static WebElement Custcode;
    
    @FindBy(id = "mCusotmerName")
	
   	public static WebElement Custname;
    
    @FindBy(id = "mGeography")
	
   	public static WebElement Geography;
    
    @FindBy(id = "mAaccountManager")
	
   	public static WebElement AaccountManager;
    
    @FindBy(id = "mAccountManagerContactNumber")
	
   	public static WebElement AccmgrCNo;
    
    @FindBy(id = "mCustomerAddress")
	
   	public static WebElement Custaddess;
    
    @FindBy(xpath = ".//*[@id='save']/img")
	
   	public static WebElement save;
        
   // @FindBy(xpath = ".//div[contains(.,'Customer details have been saved successfully')]")
    
    @FindBy(id = "MaintenanceTabInactive")
    
    public static WebElement Maintenance;
    
    @FindBy(xpath = "html/body/div[1]/div/div[2]/ul/li[1]/a")
    
    public static WebElement list;
    
    @FindBy(xpath = ".//*[@id='toast-container']/div/span/span")
    
    public static WebElement errorclose;
    
	 public  PageFactory_Customers(WebDriver driver)
	   {

		   this.driver = driver;

	   } 
		

}
