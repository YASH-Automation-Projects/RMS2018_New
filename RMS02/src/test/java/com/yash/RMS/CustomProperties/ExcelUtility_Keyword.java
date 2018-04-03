package com.yash.RMS.CustomProperties;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility_Keyword {
	
	public static String[][] innerarray = null;
	public String errortype; 
	
	/*
	****************************
	* @Author: kapil.mandloi
	* @Summary:Reading inputs from 'Keyword.xlsx' file and calling the 'objCreation()' method to select Action.
	* @param InputExcelPath
	* @throws Exception
	* @throws IOException
	* @Return: void
	****************************
	* */
	@SuppressWarnings({"resource" })
	
	public static void ExcelRead(String InputExcelPath) throws Exception, IOException {

		XSSFWorkbook ObjWorkBook;
		XSSFSheet sheet;
		XSSFRow innerRowCount;
		String activesheet = null;
		int IndexSheetLoop;
		
		FileInputStream ObjExcelApp = new FileInputStream(InputExcelPath);
		ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet(Config.index);
		for (IndexSheetLoop = 0; IndexSheetLoop <= ObjWorkSheet.getLastRowNum(); IndexSheetLoop++) //Original- IndexSheetLoop = 0,IndexSheetLoop <= ObjWorkSheet.getLastRowNum()
			{
						XSSFRow Row = ObjWorkSheet.getRow(IndexSheetLoop);
						
						/*if (Row.getCell(3).toString().equalsIgnoreCase("End"))  //---- Original- Comented
						{
							//CloseBrowser();
							break;
							
						}*/
						//---------------
						if (Row.getCell(3).toString().equalsIgnoreCase("Y")) 
						{
							
							sheet = ObjWorkBook.getSheetAt(IndexSheetLoop);
							activesheet = sheet.getSheetName().toString();
							System.out.println(activesheet.toString());
							innerarray = new String[sheet.getLastRowNum() + 1][sheet.getRow(0).getLastCellNum()];
							for (int i = 1; i <= sheet.getLastRowNum(); i++) 
							{
								innerRowCount = sheet.getRow(i);
								XSSFCell innerCell = null;
								for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) 
								{ 
									innerCell = innerRowCount.getCell(j, org.apache.poi.ss.usermodel.Row.CREATE_NULL_AS_BLANK);
									innerCell.setCellType(Cell.CELL_TYPE_STRING);
									String value = innerCell.toString();
									//System.out.println(value);
									innerarray[i][j] = value;	
									
								}
										
									objCreation(innerarray[i][0], innerarray[i][1], innerarray[i][2],
												innerarray[i][3], innerarray[i][4], innerarray[i][5], innerarray[i][6],
												innerarray[i][7], innerarray[i][8]);
									
							}	
					}	
						
			}
		ObjWorkBook = null;
		ObjExcelApp.close();
		
	}
	public enum ObjType 
	{
		Browser, TextBox, Button, Link, Verify, Wait,DropDown, RadioGroup,Alert,Custom;
	}
	public enum objecEvent 
	{
		BrowserType,Launch,Close,Clear,Click,Type,Submit,IsVisible, IsPresent, Wait,SelectByValue, 
		RadioGroupSelect,AlertHandle,ActiveRadioGroup;
	}
	
	/*
	****************************
	* @Author: kapil.mandloi
	* @Summary: Selecting the action to be performed, based on the parameters.
	* @param StepID
	* @param TestCaseType
	* @param TestCaseName
	* @param ObjectType
	* @param ObjectName
	* @param ObjectDescription
	* @param Event
	* @param Value
	* @param Comment
	* @throws Exception
	* @Return: void
	****************************
	* */
	@SuppressWarnings("incomplete-switch")
	public static void objCreation(String StepID, String TestCaseType, String TestCaseName, String ObjectType,
				String ObjectName, String ObjectDescription, String Event, String Value, String Comment)
						throws Exception
	{
		
		ObjType enumObjtype;
		enumObjtype = ObjType.valueOf(ObjectType);
		objecEvent enumobjevent;
		enumobjevent = objecEvent.valueOf(Event);
		
		switch(enumObjtype)
			{
				case TextBox: 
				{
					switch (enumobjevent)
					{
						case Clear:
						{
							TextBoxClear(ObjectName, ObjectDescription);
							break;
						}
						case Type:
						{
							TextBoxType(ObjectName, ObjectDescription, Value);
							break;
						}
						case Submit:
						{
							Submit(ObjectName, ObjectDescription);
							break;
						}
					}
				}
			}
			switch(enumObjtype)
			{
				case Button:
				{
					switch (enumobjevent)
					{
						case Click:	
						{
							ButtonClick(ObjectName, ObjectDescription);
							break;
						}
					}
				}
			}
			switch(enumObjtype)
			{
				case Link:
				{
					switch (enumobjevent)
					{
						case Click:
						{
							LinkClick(ObjectName, ObjectDescription);
							break;
						}
					}
				}
			}
			switch(enumObjtype)
			{
				case Wait:
				{
					switch (enumobjevent)
					{
						case Wait:
						{
							WaittoLoad();
							break;
						}
					}
				}
			}
			switch(enumObjtype)
			{
				case Verify:
				{
					switch (enumobjevent)
					{
						case IsVisible:
						{
							IsVisible(ObjectName, ObjectDescription);
							break;
						}
						case IsPresent:
						{
							IsPresent(ObjectName, ObjectDescription, Value);
							break;
						}
					}
				}
			}
			switch(enumObjtype)
			{
				case DropDown:
				{
					switch (enumobjevent)
					{
						case SelectByValue:
						{
							DropDownSelect(ObjectName, ObjectDescription, Value);
							break;
						}
					}
				}
			}
			switch(enumObjtype)
			{
				case RadioGroup:
				{
					switch (enumobjevent)
					{
						case RadioGroupSelect:
						{
							RadioGroupSelect(ObjectName, ObjectDescription);
							break;
						}
					}
				}
			}
			switch(enumObjtype)
			{
				case Alert:
				{
					switch (enumobjevent)
					{
						case AlertHandle:
						{
							
							String MainWindow=Constant.driver.getWindowHandle();            // Anoop- Added String variable 'MainWindow' to get main window.
							AlertHandle(ObjectName, ObjectDescription, Value, MainWindow);  //Anoop- added 'MainWindow' as parameter
							break;
						}
					}
				}
			}
			switch(enumObjtype)
			{
				case Custom:
				{
					switch (enumobjevent)
					{
						case ActiveRadioGroup:
						{
							Custom_ActiveRadioGroup(ObjectName, ObjectDescription);
							break;
						}
					}
				}
			}
			
	}
//////////////////////////////////////////////////////////////////////////////////////
//////////////////------------Functions Definitions---------------////////////////////
//////////////////////////////////////////////////////////////////////////////////////


//////////////////////////////////////////////////////////////////////////////////////
////////////////////------------Browser Functions---------------//////////////////////
//////////////////////////////////////////////////////////////////////////////////////

public static String OpenFirefoxBrowser(String Value) 
{
Constant.driver = new FirefoxDriver();
Constant.driver.manage().window().maximize();
return Value;
}

public static String LaunchURL(String Value)
{
Constant.driver.get(Value);
return Value;
}

//////////////////////////////////////////////////////////////////////////////////////
///////////////////------------Locators Functions---------------//////////////////////
//////////////////////////////////////////////////////////////////////////////////////

public static By Locator(String ObjectName, String ObjectDescription) throws Exception 
{
if (ObjectName.equalsIgnoreCase("id")) 
{
return By.id(ObjectDescription);
} 
else if (ObjectName.equalsIgnoreCase("name")) 
{
return By.name(ObjectDescription);
} 
else if (ObjectName.equalsIgnoreCase("className")) 
{
return By.className(ObjectDescription);
} 
else if (ObjectName.equalsIgnoreCase("linktext")) 
{
return By.linkText(ObjectDescription);
} 
else 
{
return By.xpath(ObjectDescription);
}
}

//////////////////////////////////////////////////////////////////////////////////////
//////////////////////------------Wait Functions---------------///////////////////////
//////////////////////////////////////////////////////////////////////////////////////

public static void waitUntilElementIsPresent(String ObjectName, String ObjectDescription) throws Exception 
{
WebDriverWait wait = new WebDriverWait(Constant.driver, 10);
wait.until(ExpectedConditions.visibilityOfElementLocated(Locator(ObjectName, ObjectDescription)));
wait.until(ExpectedConditions.presenceOfElementLocated(Locator(ObjectName, ObjectDescription)));
} 

public static void WaittoLoad() throws InterruptedException
{
Thread.sleep(5000);
}

//////////////////////////////////////////////////////////////////////////////////////
////////////////////------------TextBox Functions---------------//////////////////////
//////////////////////////////////////////////////////////////////////////////////////

public static void TextBoxType(String ObjectName, String ObjectDescription, String value) throws Exception
{
waitUntilElementIsPresent(ObjectName, ObjectDescription);
Constant.driver.findElement(Locator(ObjectName, ObjectDescription)).sendKeys(value);	
}

public static void TextBoxClear(String ObjectName, String ObjectDescription) throws Exception
{
waitUntilElementIsPresent(ObjectName, ObjectDescription);
Constant.driver.findElement(Locator(ObjectName, ObjectDescription)).clear();
}

public static void Submit (String ObjectName, String ObjectDescription) throws Exception
{
waitUntilElementIsPresent(ObjectName, ObjectDescription);
Constant.driver.findElement(Locator(ObjectName, ObjectDescription)).submit();
}

//////////////////////////////////////////////////////////////////////////////////////
////////////////////------------Verify Functions---------------///////////////////////
//////////////////////////////////////////////////////////////////////////////////////

public static void IsVisible(String pStrObjectName, String pStrObjectDescription) throws Exception 
{
waitUntilElementIsPresent(pStrObjectName, pStrObjectDescription);
Constant.driver.findElement(Locator(pStrObjectName, pStrObjectDescription)).isDisplayed();
}

public void GetValue(String pStrObjectName, String pStrObjectDescription) throws Exception 
{
waitUntilElementIsPresent(pStrObjectName, pStrObjectDescription);
Constant.driver.findElement(Locator(pStrObjectName, pStrObjectDescription)).getText();
}

public static void IsPresent(String ObjectName, String ObjectDescription, String Value) throws Exception
{
waitUntilElementIsPresent(ObjectName, ObjectDescription);
if (Constant.driver.findElement(Locator(ObjectName, ObjectDescription)).getText().equalsIgnoreCase(Value)) 
{
System.out.println("Result value Matched");
} 
else 
{
throw new Exception("Expected Value \"" + Value + "\" not match with Actual Value \""
+ Constant.driver.findElement(Locator(ObjectName, ObjectDescription)).getText() + "\"");
}
}

//////////////////////////////////////////////////////////////////////////////////////
////////////////////------------Button Functions---------------///////////////////////
//////////////////////////////////////////////////////////////////////////////////////

public static void ButtonClick(String ObjectName, String ObjectDescription) throws Exception 
{
waitUntilElementIsPresent(ObjectName, ObjectDescription);
Constant.driver.findElement(Locator(ObjectName, ObjectDescription)).click();
}

//////////////////////////////////////////////////////////////////////////////////////
////////////////////------------Link Functions---------------/////////////////////////
//////////////////////////////////////////////////////////////////////////////////////

public static void LinkClick(String ObjectName, String ObjectDescription) throws Exception
{
waitUntilElementIsPresent(ObjectName, ObjectDescription);
Constant.driver.findElement(Locator(ObjectName, ObjectDescription)).click();
}

//////////////////////////////////////////////////////////////////////////////////////
//////////////////------------DropDown Functions---------------///////////////////////
//////////////////////////////////////////////////////////////////////////////////////

public static void DropDownSelect(String ObjectName, String ObjectDescription, String Value) throws Exception
{
waitUntilElementIsPresent(ObjectName, ObjectDescription);
Select SelectByValue = new Select(Constant.driver.findElement(Locator(ObjectName, ObjectDescription)));
SelectByValue.selectByValue(Value);
}

//////////////////////////////////////////////////////////////////////////////////////
/////////////////------------Radio Group Functions---------------/////////////////////
//////////////////////////////////////////////////////////////////////////////////////


public static void RadioGroupSelect(String ObjectName, String ObjectDescription) throws Exception
{
waitUntilElementIsPresent(ObjectName, ObjectDescription);
Constant.driver.findElement(Locator(ObjectName, ObjectDescription)).click();
}

//////////////////////////////////////////////////////////////////////////////////////
/////////////////------------Alert Handle Functions---------------////////////////////
//////////////////////////////////////////////////////////////////////////////////////

public static void AlertHandle(String ObjectName, String ObjectDescription, String Value, String MainWindow) throws Exception // Anoop- Added 'MainWindow' parameter
{
	
//--------Anoop code to handle popup message-----------------//	
String PopupWindow=Constant.driver.getWindowHandle();
Constant.driver.switchTo().window(PopupWindow);
Constant.driver.findElement(By.id("popup_ok")).click();
Constant.driver.switchTo().window(MainWindow);
//-----------------------------------------------------------//

/*waitUntilElementIsPresent(ObjectName, ObjectDescription);
  Alert AlertWindow = Constant.driver.switchTo().alert();
if(Value.equalsIgnoreCase("Accept"))
{
AlertWindow.accept();
}
if(Value.equalsIgnoreCase("Dismiss"))
{
AlertWindow.dismiss();
}*/
}


//////////////////////////////////////////////////////////////////////////////////////
/////////////------------Application Specific Functions---------------////////////////
//////////////////////////////////////////////////////////////////////////////////////


public static void Custom_ActiveRadioGroup(String ObjectName, String ObjectDescription) throws Exception
{
Constant.driver.findElement(Locator(ObjectName, ObjectDescription)).click();

}

			
}
		
