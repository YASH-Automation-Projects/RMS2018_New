package com.yash.RMS.POM.TimesheetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects_TimesheetAttribute {

	private static WebElement element = null;
		
	
	public static WebElement lnk_MasterData(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='masterDataList']/a"));
		return element;	
	}

	public static WebElement lnk_TimesheetAttribute(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='timesheetAttributeList']/a"));
		return element;	
	}
	
	public static WebElement lnk_Activity(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='menuActivityList']"));
		return element;	
	}
	
	public static WebElement lnk_AllocationType(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='menuAllocationtypesList']"));
		return element;	
	}
	
	public static WebElement lnk_ModuleTicketNo(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='menuModulesList']"));
		return element;	
	}
	
	
	//------- Objects of "Activity" Home page------------------------------
	
	public static WebElement drpdwn_Activity_ShowEntries(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_length']/label/select"));
		return element;	
	}
	
	public static WebElement txt_Activity_Search(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_filter']/label/input"));
		return element;	
	}

	public static WebElement btn_AddNew(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='addNew']"));
		return element;	
	}
	
	public static WebElement btn_Pagination_First(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_first']"));
		return element;	
	}
	
	public static WebElement btn_Pagination_Previous(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_previous']"));
		return element;	
	}
	
	public static WebElement btn_Pagination_Next(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_next']"));
		return element;	
	}
	
	public static WebElement btn_Activity_Edit(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='136']/td[8]/a"));
		return element;	
	}
	
	public static WebElement btn_Activity_Delete(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_last']"));
		return element;	
	}
	
	public static WebElement lnk_Activity_Sno(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[1]"));
		return element;	
	}
	
	public static WebElement lnk_ActivityName(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='name']"));
		return element;	
	}
	
	public static WebElement lnk_Activity_Mandatory(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[3]"));
		return element;	
	}

	public static WebElement lnk_Activity_Type(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[4]"));
		return element;	
	}
	
	public static WebElement lnk_Activity_Max(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[5]"));
		return element;	
	}
	
	public static WebElement lnk_Activity_Format(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[6]"));
		return element;	
	}
	
	public static WebElement lnk_Activity_Productive(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[7]"));
		return element;	
	}
	
	//------- Objects of "Activity" Add new Activity page------------------------------
	
	public static WebElement txtbox_ActivityName(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[2]/input"));
		return element;	
	}
	
	public static WebElement drpdwn_Activity_Mandatory(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='mandatorynull']"));
		return element;	
	}
	
	public static WebElement txtbox_Activity_Type(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[4]/input"));
		return element;	
	}
	
	public static WebElement txtbox_Max(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[5]/input"));
		return element;	
	}
	
	public static WebElement txtbox_Format(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[6]/input"));
		return element;	
	}
	
	public static WebElement drpdwn_Activity_Productive(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='productivenull']"));
		return element;	
	}
	
	public static WebElement btn_Activity_Save(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[8]/a[1]"));
		return element;	
	}
	
	public static WebElement btn_Activity_Cancel(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[8]/a[2]"));
		return element;	
	}


	//------- Objects of Allocation Type Home page------------------------------



	public static WebElement drpdwn_AllocationType_ShowEntries(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_length']/label/select"));
		return element;	
	}
	
	public static WebElement txt_AllocationType_Search(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_filter']/label/input"));
		return element;	
	}

	public static WebElement btn_AllocationType_AddNew(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='addNew']"));
		return element;	
	}
	
	public static WebElement btn_AllocationType_Pagination_First(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_first']"));
		return element;	
	}
	
	public static WebElement btn_AllocationType_Pagination_Previous(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_previous']"));
		return element;	
	}
	
	public static WebElement btn_AllocationType_Pagination_Next(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_next']"));
		return element;	
	}
	
	public static WebElement btn_AllocationType_Pagination_Last(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example_last']"));
		return element;	
	}
	
	public static WebElement btn_AllocationType_Edit(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='1']/td[4]/a"));
		return element;	
	}
	
	public static WebElement btn_AllocationType_Delete(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='1']/td[5]/a"));
		return element;	
	}
	
	public static WebElement lnk_AllocationType_Sno(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[1]"));
		return element;	
	}
	
	public static WebElement lnk_AllocationType_Sorting(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[2]"));
		return element;	
	}
	
	public static WebElement lnk_AllocationType_Priority(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/thead/tr/th[3]"));
		return element;	
	}

	//------- Objects of "Allocation Type" Add new Allocation Type page------------------------------


	public static WebElement txtbox_NewAllocationType(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]/input"));
		return element;	
	}
	
	public static WebElement txtbox_NewAllocationType_Priority(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[3]/input"));
		return element;	
	}
	
		
	public static WebElement btn_AllocationType_Save(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[8]/a[1]"));
		return element;	
	}
	
	//------- Objects of Module / Ticket No. Home page------------------------------



		public static WebElement drpdwn_ModuleTicketNo_ShowEntries(WebDriver driver) {
			element = driver.findElement(By.xpath(".//*[@id='example_length']/label/select"));
			return element;	
		}
		
		public static WebElement txt_ModuleTicketNo_Search(WebDriver driver) {
			element = driver.findElement(By.xpath(".//*[@id='example_filter']/label/input"));
			return element;	
		}

		public static WebElement btn_ModuleTicketNo_AddNew(WebDriver driver) {
			element = driver.findElement(By.xpath(".//*[@id='addNew']"));
			return element;	
		}
		
		public static WebElement btn_ModuleTicketNo_Pagination_First(WebDriver driver) {
			element = driver.findElement(By.xpath(".//*[@id='example_first']"));
			return element;	
		}
		
		public static WebElement btn_ModuleTicketNo_Pagination_Previous(WebDriver driver) {
			element = driver.findElement(By.xpath(".//*[@id='example_previous']"));
			return element;	
		}
		
		public static WebElement btn_ModuleTicketNo_Pagination_Next(WebDriver driver) {
			element = driver.findElement(By.xpath(".//*[@id='example_next']"));
			return element;	
		}
		
		public static WebElement btn_ModuleTicketNo_Pagination_Last(WebDriver driver) {
			element = driver.findElement(By.xpath(".//*[@id='example_last']"));
			return element;	
		}
		
		public static WebElement btn_ModuleTicketNo_Edit(WebDriver driver) {
			element = driver.findElement(By.xpath(".//*[@id='1']/td[4]/a"));
			return element;	
		}
		
		public static WebElement btn_ModuleTicketNo_Delete(WebDriver driver) {
			element = driver.findElement(By.xpath(".//*[@id='1']/td[5]/a"));
			return element;	
		}

		//------- Objects of "Module / Ticket No." Add new Module / Ticket No. page------------------------------


		public static WebElement txtbox_ModuleTicketName(WebDriver driver) {
			element = driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[2]/input"));
			return element;	
		}
		
				
		public static WebElement btn_ModuleTicket_Save(WebDriver driver) {
			element = driver.findElement(By.xpath(".//*[@id='example']/tbody/tr[1]/td[3]/a"));
			return element;	
		}




}