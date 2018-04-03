package com.yash.RMS.POM.ProjectAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.yash.RMS.CustomProperties.CommonMethods;

public class PageFactory_Projectattribute {

	final WebDriver driver;


	@FindBy(xpath= ".//*[@id='masterDataList']/a")

	public WebElement masterDataLink;

	@FindBy(xpath= ".//*[@id='projectAttributeList']/a")

	public WebElement projectAttributeLink;

	@FindBy(id= "menuInvoicebysList")

	public WebElement invoiceByLink;

	//@FindBy(id= "addNew")
	@FindBy(xpath= "html/body/div[1]/div[1]/div[2]/div/div[1]/div[2]/a")
	
	public WebElement addNewLink;

	@FindBy(xpath= ".//*[@id='example']/tbody/tr[1]/td[2]/input")

	public WebElement invoiceByNameBox;

	@FindBy(xpath= ".//*[@id='example']/tbody/tr[1]/td[3]/a")

	public WebElement saveButton;

	@FindBy(xpath= "//div[contains(.,'Success')]")

	public WebElement saveButtonConfirmationMessage;

	@FindBy(xpath= ".//*[@id='example']/tbody/tr[1]/td[4]/a")

	public WebElement deleteButton;

	@FindBy(xpath= "html/body/ul[2]/li/div/div[2]/button[1]")

	public WebElement deleteOkButton;

	@FindBy(xpath= "//div[contains(.,'Success')]")
	

	public WebElement deleteConfirmationMsg;


	@FindBy(xpath= "html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/a")

	public WebElement editButton;

	@FindBy(xpath= "//div[contains(.,'Success')]")

	public WebElement editButtonConfirmationMessage;

	@FindBy(xpath = "html/body/div/div[1]/div[1]/h1")

	public WebElement invoiceByPageText;

	@FindBy(xpath= "html/body/div/div[1]/div[2]/div/div[2]/div/div[3]/label/input")

	public WebElement searchBox;

	@FindBy(xpath= "html/body/div/div[1]/div[2]/div/div[2]/div/table/thead/tr/th[1]")

	public WebElement serialNoSorting;

	@FindBy(xpath= ".//th[1][@class='sorting_asc']")

	public WebElement asscenSerialNoSorting;

	@FindBy(xpath= ".//th[1][@class='sorting_desc']")

	public WebElement descenSerialNoSorting;

	@FindBy(xpath= ".//th[2][@class='sorting']")

	public WebElement invoiceByNameSorting;

	@FindBy(xpath= ".//th[2][@class='sorting_desc']")

	public WebElement invoiceByNameDescendingSorting;


	@FindBy(xpath= "//div[contains(.,'Success')]")

	public WebElement saveButtonConfirmationMessage1;
	
	@FindBy(xpath= ".//*[@id='27']/td[2]/input")

	public WebElement editforDel;



	public PageFactory_Projectattribute(WebDriver driver)
	{

		this.driver = driver;

	} 


}
