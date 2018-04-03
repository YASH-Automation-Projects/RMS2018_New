package com.yash.RMS.CustomProperties;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.yash.RMS.POM.Admin.PageFactory_Resources;

public class CommonMethods {
	@SuppressWarnings("unused")
	private static String Total_count;
	private static int rows_count;

	public static void waitForPageToBeLoaded(){
		Constant.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	public static List<WebElement> getDropDownOptions(WebElement webElement) {
		Select select = new Select(webElement);
		return select.getOptions();
	}
	
	//** it will work by index value starting from 0
	public static String getWordFromString(String string, int numberOfWordFromString){
		String []strArray=string.split(" ");
		return strArray[numberOfWordFromString];
	}
	
	public static WebElement waitForElement(WebElement element, WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 44);
			return wait.until(ExpectedConditions.visibilityOf(element));
		} catch (NoSuchElementException e) {
			throw new NoSuchElementException(e.getMessage());
		}
	}
	
	public static List<WebElement> waitForElements(List<WebElement> elements,
			WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 25);
			return wait.until(ExpectedConditions
					.visibilityOfAllElements(elements));
		} catch (NoSuchElementException e) {
			throw new NoSuchElementException(e.getMessage());
		}
	}

	
	public static Alert waitForAlertPresent(WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 25);
			return wait.until(ExpectedConditions.alertIsPresent());
		} catch (NoSuchElementException e) {
			throw new NoSuchElementException(e.getMessage());
		}
	}
	
	public static int getRowsFromTable(WebElement element){
		List<WebElement> Rows = element.findElements(By.tagName("tr"));
		return Rows.size();
	}
	
	public static void acceptAlertMessage(WebDriver driver){
		CommonMethods.waitForAlertPresent(Constant.driver);
		driver.switchTo().alert().accept();
	}
	
	public static WebElement waitForElementClickable(WebElement element,
			WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			return wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (NoSuchElementException e) {
			throw new NoSuchElementException(e.getMessage());
		}
	}

	
	public static boolean waitForTextIsPresentInElement(WebElement element,
			WebDriver driver, String text) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 25);
			return wait.until(ExpectedConditions.textToBePresentInElementValue(
					element, text));
		} catch (NoSuchElementException e) {
			throw new NoSuchElementException(e.getMessage());
		}
	}

	
	public static String dynamicValues(List<WebElement> searchedElements) {
		int maxIndex = 0;
		String newDynamicElements = null;
		for (int i = 0; i < searchedElements.size(); i++) {
			if (!waitForElements(searchedElements, Constant.driver).get(0).getText()
					.equals("")) {
				maxIndex = Integer.parseInt(waitForElements(searchedElements,
						Constant.driver).get(0).getText().replaceAll("[^0-9]", ""));
				
				if(maxIndex+1 != Integer.parseInt(searchedElements.get(i).getText().replaceAll("[^0-9]", ""))) {
				newDynamicElements = searchedElements.get(0).getText().replaceAll(
						"\\d+.*", Integer.toString(++maxIndex));
				break;
				}
			} else {
				newDynamicElements = searchedElements.get(0).getText().replaceAll(
						"\\d+.*", Integer.toString(maxIndex++));
			}
		}
		return newDynamicElements;
	}

	
	public static String Random =null;
	
	@SuppressWarnings("unused")
	public static String getID(){

		  int n=351;
		 double d=0;          
		      
		   int num=1;  
		   {                    
		while(true)          
		{   
		    
		int final_limit=10000; //Specifiy the maximum limit          
		d=Math.random()*final_limit;          
		 num=(int)d;          
		Random=String.valueOf(num);
		//System.out.println(Random);
		break;          
		         
		}
		         
		return Random;  

		//This will return random number every time you run within 10000(specified limit)     
		}   
		    
		} 
	
	
	public static void count_page() throws Throwable
	{
		Select dropdown1 = new Select(PageFactory_Resources.entry);
		List<WebElement> values_drop = dropdown1.getOptions();
		for(int i=0;i<values_drop.size();i++)
		{
	
	 dropdown1.selectByIndex(i);
	 WebElement option = dropdown1.getFirstSelectedOption();
	 System.out.println(option.getText()); 
	 Integer x = Integer.valueOf(option.getText());
	 System.out.println(x);
	//This is to verify number of rows and columns
	 WebElement mytable = PageFactory_Resources.webtable;
	  Thread.sleep(500);
	  //To locate rows of table.
	  List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
	  //To calculate no of rows In table.
	  rows_count = rows_table.size()-2;
	  System.out.println(rows_count);
	  Thread.sleep(1700);
	  if(x.equals(rows_count))
	  {
		
		  Report.ReporterOutput("STEP ","Verify Count of Record for entry="+ x,"Count="+ x  , "Entries Should be Correct-" + x,"Active Record Count done successfully.--" + x, "Pass",null);		  
		  
	  }
	
	  
	} 

	}
	
}
