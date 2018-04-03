package com.yash.RMS.POM.Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject_EditProfile1 {
	
	private static WebElement element = null;

	public static WebElement lnk_EditProfile(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".editProfile"));
		return element;
	}
	
	public static WebElement uploadImage(WebDriver driver) {
		element = driver.findElement(By.id("uploadImage"));
		return element;
	}
	
	public static WebElement contactNumber1(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='formTable']/tbody/tr[2]/td[2]/div/input"));
		return element;
	}
	
	public static WebElement contactnumber2(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='formTable']/tbody/tr[2]/td[4]/div/input"));
		return element;
	}
	
	public static WebElement customerUserIdDetails(WebDriver driver) {
		element = driver.findElement(By.id("customerIdDetails"));
		return element;
	}
	
	public static WebElement primarySkillsSearchTextBox(WebDriver driver, int skillType) {
		element = driver.findElement(By.xpath("//form[@id='employeeProfile']/table[2]/tbody/tr/td["+skillType+"]/ol/li/div[3]/div/input"));
		return element;
	}
		
	public static WebElement userEditProfilePageLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='container']/div/div/div/h3/center/font"));
		return element;
	}
	
	
	public static WebElement userEditProfilePage(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='container']"));
		return element;
	}
	
	public static WebElement getSkillsList(WebDriver driver, int skillType) {
		element = driver.findElement(By.xpath("//form[@id='employeeProfile']/table[2]/tbody/tr/td["+skillType+"]/ol/li/div[3]/div[3]/div/ul"));
		return element;
	}
	
	public static WebElement skillsList1(WebDriver driver,int skillType, int i) {
		element = driver.findElement(By.xpath("//form[@id='employeeProfile']/table[2]/tbody/tr/td["+skillType+"]/ol/li/div[3]/div[3]/div/ul/li["+i+"]"));
		return element;
	}
	
	public static WebElement SkillsText(WebDriver driver,int skillType, int i) {
		element = driver.findElement(By.xpath("//form[@id='employeeProfile']/table[2]/tbody/tr/td["+skillType+"]/ol/li/div[3]/div[3]/div/ul/li["+i+"]/div"));
		return element;
	}
	
	public static WebElement SkillsRating(WebDriver driver,int skillType, int i) {
		element = driver.findElement(By.xpath("//form[@id='employeeProfile']/table[2]/tbody/tr/td["+skillType+"]/ol/li/div[3]/div[3]/div/ul/li["+i+"]/div[@class='skillsRating']/select"));
		return element;
	}
	
	public static WebElement skillsCheckBox(WebDriver driver,int skillType, int i) {
		element = driver.findElement(By.xpath("//form[@id='employeeProfile']/table[2]/tbody/tr/td["+skillType+"]/ol/li/div[3]/div[3]/div/ul/li["+i+"]/input[@type='checkbox']"));
		return element;
	}
	
	public static WebElement viewSelectedCourses(WebDriver driver, int skillType) {
		element = driver.findElement(By.xpath("//form[@id='employeeProfile']/table[2]/tbody/tr/td["+skillType+"]/ol/li/div[1]/a"));
		return element;
	}
		
	public static WebElement selectedCoursesList(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='selected_list']/ul"));
		return element;
	}
	
	public static WebElement getTextOfSelectedCourses(WebDriver driver, int i) {
		element = driver.findElement(By.xpath("//div[@class='selected_list']/ul/li["+i+"]"));
		return element;
	}
	
	public static WebElement closePopupSelectedSkills(WebDriver driver) {
		element = driver.findElement(By.className("closeAccordianPopUp"));
		return element;
	}
	
	public static WebElement submitButton(WebDriver driver) {
		element = driver.findElement(By.id("save"));
		return element;
	}
	
	public static WebElement successMessage(WebDriver driver) {
		element = driver.findElement(By.className("toast-message"));
		return element;
	}
	
	public static WebElement closeButtonForPopup(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='fancybox-skin']/a"));
		return element;
	}
	
	public static WebElement getSearchedSkillsResult(WebDriver driver, int skillType) {
		element = driver.findElement(By.xpath("//form[@id='employeeProfile']/table[2]/tbody/tr/td["+skillType+"]/ol/li/div[3]/div[3]/div"));
		return element;
	}
}
