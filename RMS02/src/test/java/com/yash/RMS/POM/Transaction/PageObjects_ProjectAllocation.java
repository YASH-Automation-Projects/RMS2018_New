
package com.yash.RMS.POM.Transaction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yash.RMS.CustomProperties.CommonMethods;

public class PageObjects_ProjectAllocation {

	public static WebElement element;
	
	//link transaction
	public static WebElement Link_Transaction(WebDriver driver) {

		element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='transactionList']"))),driver);
		return element;	
	}
	// link Project Allocation
	public static WebElement Link_ProjectAllocation(WebDriver driver) {
		element = CommonMethods.waitForElement(driver.findElement((By.id("menuProjectAllocation"))), driver);
		return element;	
	}
	
	// link Project search
		public static WebElement txtbox_ProjectSerach(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.xpath("//*[@id='projectallocationTableId_wrapper']/div[3]/div[1]/div/table/thead/tr[2]/td[2]/input"))), driver);
			return element;	
		}
		
		// link Project Id
		public static WebElement Link_ProjectId(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='projectallocationTableId']/tbody/tr[1]/td[1]/a"))), driver);
			return element;	
		}
		// add new button
		public static WebElement btn_AddNewResource (WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='addNew']"))), driver);
			return element;	
		}
		
		//text Project name
		public static WebElement Text_selectedProjectName(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='projectallocationTableId']/tbody/tr[1]/td[2]"))), driver);
			return element;
		}
		// text box resource name
		public static WebElement txtBox_ResourceName(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example']/tr[1]/td[3]/span/input"))), driver);
			return element;
		}
		
		// text box allocation type
		public static WebElement txtBox_AllocationType(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example']/tr[1]/td[4]/span/input"))), driver);
			return element;
		}
		
		// text box Start Date
		public static WebElement date_StartDate(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='allocStartDate']"))), driver);
			return element;
		}
		
		
		public static WebElement List_box(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='tab1']"))), driver);
			return element;
		}
		
		
		//Dropdown primary project
		public static WebElement dropdown_PrimaryProject(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example']/tr[1]/td[9]/span/input"))), driver);
			return element;
		}
		
		
		public static WebElement link_Edit(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='editRow1']"))), driver);
			return element;
		}
		
		public static WebElement textbox_StartDate(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example']/thead/tr[2]/td[6]/input"))), driver);
			return element;
		}
		
		
		public static WebElement Searchbox_EditEmployeeName(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example']/tr[1]/td[9]/span/input"))), driver);
			return element;
		}
			public static WebElement searchbox_ProjectName(WebDriver driver) {
				element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='projectallocationTableId_wrapper']/div[3]/div[1]/div/table/thead/tr[2]/td[2]/input"))), driver);
				return element;
			}
		
		// DropDown timehrs manager
		public static WebElement dropdown_TimeHrsManager(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example']/tr[1]/td[10]/span/input"))), driver);
			return element;
		}
		// save button
		public static WebElement btn_SaveResource(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='save']"))), driver);
			return element;
		}
		// project name
		public static WebElement Sorting_ProjectName(WebDriver driver) {
			
			element= CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='projectallocationTableId_wrapper']/div[3]/div[1]/div/table/thead/tr[1]/th[2]"))), driver);
			return element;
		}
		// customer name
		public static WebElement Sorting_CustomerName(WebDriver driver) {
			
			element= CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='projectallocationTableId_wrapper']/div[3]/div[1]/div/table/thead/tr[1]/th[3]"))), driver);
			return element;
		}
		// search index
		public static WebElement ProjectAllocationTableID(WebDriver driver) {
			element= CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='projectallocationTableId']/tbody/tr/td[2]"))), driver);
			return element;
		}
		
		public static WebElement dropdown_ShowEntries(WebDriver driver) {
			element= CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='display']"))),driver);
			return element;
		}
		
		// Sorting Offshore Manager
		public static WebElement Sorting_OffshoreManager(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[text()='Offshore Manager']"))), driver);
			return element;	
		}
		// Sorting Onsite Manager
		public static WebElement Sorting_OnsiteManager(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[text()='Onsite Manager']"))), driver);
			return element;	
		}
		// Sorting Project Kick off Date
		public static WebElement Sorting_ProjectKickoffDate(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[text()='Project Kick off Date']"))), driver);
			return element;	
		}
		// Sorting Project End Date
		public static WebElement Sorting_ProjectEndDate(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[text()='Project End Date']"))), driver);
			return element;	
	 
	

}
		public static WebElement link_ProjectList(WebDriver driver) {
			
			element=CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='tab1']"))), driver);
			return element;
		}
		public static WebElement searchBox_EmployeeName(WebDriver driver) {
				
			element=CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example']/thead/tr[2]/td[3]/input"))), driver);
			
			return element;
		}
		public static WebElement link_DeleteResource(WebDriver driver) {
		
			element=CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example']/tr/td[12]/a"))), driver);
			return element;
		}
		public static WebElement btn_Pageinationone(WebDriver driver) {
			
			element=CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='projectallocationTableId_wrapper']/div[4]/div[2]/span/a[2]"))), driver);
			return element;
		}
		

















//package com.yash.RMS.POM.Transaction;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import com.yash.RMS.CustomProperties.CommonMethods;
//
//public class PageObjects_ProjectAllocation {
//
//	public static WebElement element;
//	
//	//link transaction
//	public static WebElement Link_Transaction(WebDriver driver) {
//
//		element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='transactionList']"))),driver);
//		return element;	
//	}
//	// link Project Allocation
//	public static WebElement Edit_Link (WebDriver driver) {
//		element = CommonMethods.waitForElement(driver.findElement((By.id(".//*[@id='editRow1']"))), driver);
//		return element;	
//	}
//	
//	public static WebElement Link_ProjectAllocation(WebDriver driver) {
//		element = CommonMethods.waitForElement(driver.findElement((By.id("menuProjectAllocation"))), driver);
//		return element;	
//		
//	}
//
//		public static WebElement StartDate_tBox(WebDriver driver) {
//			element = CommonMethods.waitForElement(driver.findElement((By.id(".//*[@id='example']/thead/tr[2]/td[6]/input"))), driver);
//			return element;	
//	}
//	
//	// link Project 

//		public static WebElement txtbox_ProjectSerach(WebDriver driver) {
//			element = CommonMethods.waitForElement(driver.findElement((By.xpath("//*[@id='projectallocationTableId_wrapper']/div[3]/div[1]/div/table/thead/tr[2]/td[2]/input"))), driver);
//			return element;	
//		}
//		
		public static WebElement ProjectSave_Link(WebDriver driver) {
			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='save']"))), driver);
			return element;	
		}
		}
//		
//		// link Project Id
//		public static WebElement Link_ProjectId(WebDriver driver) {
//			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='projectallocationTableId']/tbody/tr[1]/td[1]/a"))), driver);
//			return element;	
//		}
//		// add new button
//		public static WebElement btn_AddNewResource (WebDriver driver) {
//			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='addNew']"))), driver);
//			return element;	
//		}
//		
//		//text Project name
//		public static WebElement Text_selectedProjectName(WebDriver driver) {
//			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='projectallocationTableId']/tbody/tr[1]/td[2]"))), driver);
//			return element;
//		}
//		// text box resource name
//		public static WebElement txtBox_ResourceName(WebDriver driver) {
//			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example']/tr[1]/td[3]/span/input"))), driver);
//			return element;
//		}
//		
//		// text box allocation type
//		public static WebElement txtBox_AllocationType(WebDriver driver) {
//			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example']/tr[1]/td[4]/span/input"))), driver);
//			return element;
//		}
//		
//		// text box Start Date
//		public static WebElement date_StartDate(WebDriver driver) {
//			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='allocStartDate']"))), driver);
//			return element;
//		}
//		
//		
//		//Dropdown primary project
//		public static WebElement dropdown_PrimaryProject(WebDriver driver) {
//			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example']/tr[1]/td[9]/span/input"))), driver);
//			return element;
//		}
//		
//		// DropDown timehrs manager
//		public static WebElement dropdown_TimeHrsManager(WebDriver driver) {
//			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example']/tr[1]/td[10]/span/input"))), driver);
//			return element;
//		}
//		// save button
//		public static WebElement btn_SaveResource(WebDriver driver) {
//			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='save']"))), driver);
//			return element;
//		}
//		// project name
//		public static WebElement Sorting_ProjectName(WebDriver driver) {
//			
//			element= CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='projectallocationTableId_wrapper']/div[3]/div[1]/div/table/thead/tr[1]/th[2]"))), driver);
//			return element;
//		}
//		// customer name
//		public static WebElement Sorting_CustomerName(WebDriver driver) {
//			
//			element= CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='projectallocationTableId_wrapper']/div[3]/div[1]/div/table/thead/tr[1]/th[3]"))), driver);
//			return element;
//		}
//		// search index
//		public static WebElement ProjectAllocationTableID(WebDriver driver) {
//			element= CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='projectallocationTableId']/tbody/tr/td[2]"))), driver);
//			return element;
//		}
//		
//		public static WebElement dropdown_ShowEntries(WebDriver driver) {
//			element= CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='display']"))),driver);
//			return element;
//		}
//		
//		// Sorting Offshore Manager
//		public static WebElement Sorting_OffshoreManager(WebDriver driver) {
//			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[text()='Offshore Manager']"))), driver);
//			return element;	
//		}
//		// Sorting Onsite Manager
//		public static WebElement Sorting_OnsiteManager(WebDriver driver) {
//			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[text()='Onsite Manager']"))), driver);
//			return element;	
//		}
//		// Sorting Project Kick off Date
//		public static WebElement Sorting_ProjectKickoffDate(WebDriver driver) {
//			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[text()='Project Kick off Date']"))), driver);
//			return element;	
//		}
//		// Sorting Project End Date
//		public static WebElement Sorting_ProjectEndDate(WebDriver driver) {
//			element = CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[text()='Project End Date']"))), driver);
//			return element;	
//	 
//	
//
//}
//		public static WebElement link_ProjectList(WebDriver driver) {
//			
//			element=CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='tab1']"))), driver);
//			return element;
//		}
//		public static WebElement Box_EmployeeName(WebDriver driver) {
//				
//			element=CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example']/thead/tr[2]/td[3]/input"))), driver);
//			
//			return element;
//		}
//		public static WebElement EditEmployeeName_Box(WebDriver driver) {
//			
//			element=CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example']/thead/tr[2]/td[3]/input"))), driver);
//			
//			return element;
//		}
//		
//		public static WebElement link_DeleteResource(WebDriver driver) {
//		
//			element=CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='example']/tr/td[12]/a"))), driver);
//			return element;
//		}
//		public static WebElement btn_Pageinationone(WebDriver driver) {
//			
//			element=CommonMethods.waitForElement(driver.findElement((By.xpath(".//*[@id='projectallocationTableId_wrapper']/div[4]/div[2]/span/a[2]"))), driver);
//			return element;
//		}
//		
//}