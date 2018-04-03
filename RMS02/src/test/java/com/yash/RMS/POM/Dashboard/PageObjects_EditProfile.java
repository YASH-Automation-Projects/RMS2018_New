package com.yash.RMS.POM.Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects_EditProfile {

	private static WebElement element = null;

	public static WebElement lnk_EditProfile(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='dashboardList']/ul/li[2]/a"));
		return element;
	}

	public static WebElement Iframe_Header(WebDriver driver) {
		element = driver.findElement(By.id("html/body/table/tbody/tr/td/div/div/div/div[1]/h3/center/font"));
		return element;
	}

	public static WebElement Edit_Frame(WebDriver driver) {
		element = driver.findElement(By.id("fancybox-frame1495005158384"));
		return element;
	}

	public static WebElement TextBox__FirstName(WebDriver driver) {
		element = driver.findElement(By.id("firstName"));
		return element;
	}

	public static WebElement TextBox__MiddleName(WebDriver driver) {
		element = driver.findElement(By.id("middleName"));
		return element;
	}

	public static WebElement TextBox__LastName(WebDriver driver) {
		element = driver.findElement(By.id("lastName"));
		return element;
	}

	public static WebElement TextBox__EmailId(WebDriver driver) {
		element = driver.findElement(By.id("emailId"));
		return element;
	}

	public static WebElement TextBox__ContactNo(WebDriver driver) {
		element = driver.findElement(By.id("contactNumber1"));
		return element;
	}

	public static WebElement TextBox__ContactNo2(WebDriver driver) {
		element = driver.findElement(By.id("contactNumber2"));
		return element;
	}

	public static WebElement TextBox__CustDetails(WebDriver driver) {
		element = driver.findElement(By.id("customerIdDetails"));
		return element;
	}

	public static WebElement Button__UploadImage(WebDriver driver) {
		element = driver.findElement(By.id("uploadImage"));
		return element;
	}

	public static WebElement TextBox__Grade(WebDriver driver) {
		element = driver.findElement(By.id("grade"));
		return element;
	}

	public static WebElement TextBox__Designation(WebDriver driver) {
		element = driver.findElement(By.name("currentLoggedinResource.designationId.designationName"));
		return element;
	}

	/*
	 * public static WebElement TextBox__RM1(WebDriver driver){ element =
	 * driver.findElement(By.name(
	 * "currentLoggedinResource.currentReportingManager.employeeNamee")); return
	 * element; } public static WebElement TextBox__RM2(WebDriver driver){
	 * element = driver.findElement(By.name(
	 * "currentLoggedinResource.currentReportingManagerTwo.employeeName"));
	 * return element; }
	 */

	public static WebElement PrimarySkills_Multiple_CkeckBox_Text(WebDriver driver, int i) {
		element = driver.findElement(By
				.xpath("html/body/table/tbody/tr/td/div/div/div/div[2]/div[1]/form/table[2]/tbody/tr[1]/td[1]/ol/li/div[3]/div[3]/div/ul/li["
						+ i + "]/div[1]"));
		return element;
	}

	public static WebElement PrimarySkills_Multiple_CkeckBox(WebDriver driver, int i) {
		element = driver.findElement(By
				.xpath("html/body/table/tbody/tr/td/div/div/div/div[2]/div[1]/form/table[2]/tbody/tr[1]/td[1]/ol/li/div[3]/div[3]/div/ul/li["
						+ i + "]/input[2]"));
		return element;
	}
	
	public static WebElement PrimarySkills_Multiple_CkeckBox_ident2(WebDriver driver, int i) {
		element = driver.findElement(By
				.xpath("//input[@id='primarySkill_Id:"+i+"']"));
		return element;
	}

	public static WebElement PrimarySkills_Multiple_Rating(WebDriver driver, int i) {
		element = driver.findElement(By
				.xpath("html/body/table/tbody/tr/td/div/div/div/div[2]/div[1]/form/table[2]/tbody/tr[1]/td[1]/ol/li/div[3]/div[3]/div/ul/li["
						+ i + "]/div[2]/select"));
		return element;
	}

	public static WebElement PrimarySkills_Block(WebDriver driver, int i) {
		element = driver.findElement(By.xpath(".//*[@id='skillsList']/div/ul/li[" + i + "]/div[1]"));
		return element;
	}
	
	
/************Secondary Fields *****************/
	
	
	public static WebElement SecondrySkills_Multiple_CkeckBox_Text(WebDriver driver, int i) {
		element = driver.findElement(By
				.xpath("html/body/table/tbody/tr/td/div/div/div/div[2]/div[1]/form/table[2]/tbody/tr[1]/td[3]/ol/li/div[3]/div[3]/div/ul/li["
				+ i + "]/div[1]"));
		return element;
		
		
		/*html/body/table/tbody/tr/td/div/div/div/div[2]/div[1]/form/table[2]/tbody/tr[1]/td[3]/ol/li/div[3]/div[3]/div/ul/li["
				+ i + "]/div[1]
*/		
		/*html/body/table/tbody/tr/td/div/div/div/div[2]/div[1]/form/table[2]/tbody/tr[1]/td[3]/ol/li/div[3]/div[3]/div/ul/li["
				+ i + "]/input[2]
		*/
	}

	public static WebElement SecondrySkills_Multiple_CkeckBox(WebDriver driver, int i) {
		element = driver.findElement(By
				.xpath("html/body/table/tbody/tr/td/div/div/div/div[2]/div[1]/form/table[2]/tbody/tr[1]/td[3]/ol/li/div[3]/div[3]/div/ul/li["
				+ i + "]/input[2]"));
		return element;
	}
	
	public static WebElement SecondrySkills_Multiple_CkeckBox_ident2(WebDriver driver, int i) {
		element = driver.findElement(By
				.xpath("//input[@name='entries[" + i + "].secondarySkill_Id']"));
		
		return element;
	}

	public static WebElement SecondrySkills_Multiple_Rating(WebDriver driver, int i) {
		element = driver.findElement(By
				.xpath("html/body/table/tbody/tr/td/div/div/div/div[2]/div[1]/form/table[2]/tbody/tr[1]/td[3]/ol/li/div[3]/div[3]/div/ul/li["
				+ i + "]/div[2]/select"));
		/*html/body/table/tbody/tr/td/div/div/div/div[2]/div[1]/form/table[2]/tbody/tr[1]/td[3]/ol/li/div[3]/div[3]/div/ul/li["
				+ i + "]/div[2]/select
		*/
		return element;
	}

	public static WebElement SecondrySkills_Block(WebDriver driver, int i) {
		element = driver.findElement(By.xpath(".//*[@id='skillsList']/div/ul/li[" + i + "]/div[1]"));
		return element;
	
	}
	
	
	
	
	public static WebElement Button__Save(WebDriver driver) {
		element = driver.findElement(By.id("save"));
		return element;
	}

	public static WebElement SearchBox_PrimarySkills(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"html/body/table/tbody/tr/td/div/div/div/div[2]/div[1]/form/table[2]/tbody/tr[1]/td[1]/ol/li/div[3]/div[1]/input"));
		return element;
	}

	public static WebElement SearchResult_PrimarySkills(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"html/body/table/tbody/tr/td/div/div/div/div[2]/div[1]/form/table[2]/tbody/tr[1]/td[1]/ol/li/div[3]/div[3]/div/ul"));
		return element;
	}

	public static WebElement SearchBox_SecondrySkills(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"html/body/table/tbody/tr/td/div/div/div/div[2]/div[1]/form/table[2]/tbody/tr[1]/td[3]/ol/li/div[3]/div[1]/input"));
		return element;
	}

	public static WebElement SearchResult_SecondrySkills(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"html/body/table/tbody/tr/td/div/div/div/div[2]/div[1]/form/table[2]/tbody/tr[1]/td[3]/ol/li/div[3]/div[3]/div/ul"));
		return element;
	}

	public static WebElement Closs_Profile_Edit(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@title='Close']"));
		return element;

	}
	
	public static WebElement SucessMessage_Alert(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='toast-container']/div"));
		return element;
	}

	
	
	
	public static WebElement SucessMessage(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(.,'Your profile has been updated successfully!!')]"));
		return element;
	}

	

}
