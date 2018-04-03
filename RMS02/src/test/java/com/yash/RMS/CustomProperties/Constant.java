package com.yash.RMS.CustomProperties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//G:\Rms_workSpace\Automation_RMS_Dec_01

public class Constant {
	
	public static final String URL = "http://inidrrmstsrv01:8080/rms";
	 
 //   public static final String Path_TestData = "G:\\Workspace\\RMS_Suite\\Automation_RMS_Dec_01\\src\\test\\resources\\";
//public static final String Path_TestData = "G:\\Workspace\\RMS_Worksplace\\Automation_RMS_27-Dec-2017\\src\\test\\resources\\";
	public static final String Path_TestData = System.getProperty("user.dir")+"\\src\\test\\resources\\";
												//D:\\RMS\Automation_RMS_27-Dec-2017\\Automation_RMS_27-Dec-2017

    public static final String File_TestData = "Login.xlsx";
    
  //  public static final String File_RMSConfiguration = "G:\\Workspace\\RMS_Suite\\Automation_RMS_Dec_01\\src\\test\\resources\\RMS_Configuration_Sheet.xlsx";
      //public static final String File_RMSConfiguration = "G:\\Workspace\\RMS_Worksplace\\Automation_RMS_27-Dec-2017\\src\\test\\resources\\RMS_Configuration_Sheet.xlsx";
    public static final String File_RMSConfiguration = System.getProperty("user.dir")+"\\src\\test\\resources\\RMS_Configuration_Sheet.xlsx";
      
    public static final String File_emailReportattchment_HTML  = "test-output\\old\\End_To_End_Suite\\reporter-output.html";
   
  //  public static final String File_emailReportattchment_EXCEl  = "G:\\Workspace\\RMS_Suite\\Automation_RMS_Dec_01\\src\\test\\resources\\Customized_Report.xlsx";
    //public static final String File_emailReportattchment_EXCEl  = "G:\\Workspace\\RMS_Worksplace\\Automation_RMS_27-Dec-2017\\src\\test\\resources\\Customized_Report.xlsx";
    public static final String File_emailReportattchment_EXCEl  = System.getProperty("user.dir")+"\\src\\test\\resources\\Customized_Report.xlsx";
    
    public static WebDriver driver=null;

   // public static final String ChromeDriver = "G:\\Workspace\\RMS_Suite\\Automation_RMS_Dec_01\\src\\test\\resources\\drivers\\chromedriver.exe";
     //public static final String ChromeDriver = "G:\\Workspace\\RMS_Worksplace\\Automation_RMS_27-Dec-2017\\src\\test\\resources\\drivers\\chromedriver.exe";
    public static final String ChromeDriver = System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe";
    
   // public static final String IEDriver = "G:\\Workspace\\RMS_Suite\\Automation_RMS_Dec_01\\src\\test\\resources\\drivers\\IEDriverServer.exe";
//    public static final String IEDriver = "G:\\Workspace\\RMS_Worksplace\\Automation_RMS_27-Dec-2017\\src\\test\\resources\\drivers\\IEDriverServer.exe";
    public static final String IEDriver = System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\IEDriverServer.exe";
    
  //  public static final String UploadFile_salesplan = "G:\\Workspace\\RMS_Suite\\Automation_RMS_Dec_01\\src\\test\\resources\\AutoIT\\";
    //
    //public static final String UploadFile_salesplan = "G:\\Workspace\\RMS_Worksplace\\Automation_RMS_27-Dec-2017\\src\\test\\resources\\AutoIT\\";
    public static final String UploadFile_salesplan = System.getProperty("user.dir")+"\\src\\test\\resources\\AutoIT\\";
       
  //  public static final String JPGImage = "G:\\Workspace\\RMS_Suite\\Automation_RMS_Dec_01\\src\\test\\resources\\Images\\Lighthouse.jpg";
    //public static final String JPGImage = "G:\\Workspace\\RMS_Worksplace\\Automation_RMS_27-Dec-2017\\src\\test\\resources\\Images\\Lighthouse.jpg";
    public static final String JPGImage = System.getProperty("user.dir")+"\\src\\test\\resources\\Images\\Lighthouse.jpg";
    
    public static final String PageTitle = "Welcome, demo@barterag.com";
        
   // public static final String AutoItSOFileUploadfileFileFormatChk_Chrome ="G:\\Workspace\\RMS_Suite\\Automation_RMS_Dec_01\\src\\test\\resources\\AutoIT\\AutoIt-SO-FileUpload_FileFormatChk_Chrome.exe";
    public static final String AutoItSOFileUploadfileFileFormatChk_Chrome =System.getProperty("user.dir")+"\\src\\test\\resources\\AutoIT\\AutoIt-SO-FileUpload_FileFormatChk_Chrome.exe";
    
    public static String EmailEnabled=null;
    
    public static String XmlFileName="TestcaseXML.xml";
    
    public static String HTML_Report = null;
    
    public static String Excel_Report = null;
    
     //public static final String Path_TestData_SO = "G:\\Workspace\\RMS_Suite\\Automation_RMS_Dec_01\\src\\main\\java\\testData\\";
    //public static final String Path_TestData_SO = "G:\\Workspace\\RMS_Worksplace\\Automation_RMS_27-Dec-2017\\src\\main\\java\\testData\\";
    public static final String Path_TestData_SO = System.getProperty("user.dir")+"\\src\\main\\java\\testData\\";
    
   //public static String logintestdata = "G:\\Workspace\\RMS_Suite\\Automation_RMS_Dec_01\\src\\test\\resources\\RMS_Automaiton_TestData.xlsx";
   //public static String logintestdata = "G:\\Workspace\\RMS_Worksplace\\Automation_RMS_27-Dec-2017\\src\\test\\resources\\RMS_Automaiton_TestData.xlsx";
   //public static String logintestdata = "G:\\Workspace\\RMS_Worksplace\\Automation_RMS_27-Dec-2017\\src\\test\\resources\\RMS_Automaiton_TestData.xlsx";
    public static String logintestdata = System.getProperty("user.dir")+"\\src\\test\\resources\\RMS_Automaiton_TestData.xlsx";
    
	
    public static final String File_TestData_SO = "TestData.xlsx";

	//public static final String RMS_TEST_DATA = "G:\\Workspace\\RMS_Suite\\Automation_RMS_Dec_01\\src\\test\\resources\\RMS_Automaiton_TestData.xlsx";
    //public static final String RMS_TEST_DATA = "G:\\Workspace\\RMS_Worksplace\\Automation_RMS_27-Dec-2017\\src\\test\\resources\\RMS_Automaiton_TestData.xlsx";
    public static final String RMS_TEST_DATA = System.getProperty("user.dir")+"\\src\\test\\resources\\RMS_Automaiton_TestData.xlsx";
    
    public static final String RMS_TEST_DATA1 = "D:\\TestData.xlsx";

	//public static final String TestData = null;
    //////////////////-----------***** Reports Objects******------------------//////////////
    public	static String Result = null;
    public static String Actual = null;
    public static String Expected = null;
    public static String StepDescription = null;
    public static String InputValue = null;
    public static String id = null;
     
    	//private static SoftAssert softAssert = new SoftAssert();
    	
    public static void waitForClickable(WebElement e)
    {
    	WebDriverWait wait = new WebDriverWait(Constant.driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(e));
    }
    /////////////////
}
