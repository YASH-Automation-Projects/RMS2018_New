package com.yash.RMS.Setup;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.ExcelUtility;

public class ConfigureBrowser {

	public static String Browser = null;
	public static String URLChoiceDev = null;
	public static String URLChoiceStg = null;
	public static String URLChoiceProd = null;
	public static String URL = null;
	public static int ChkBrowser;
	public static ExcelUtility userData;
	static int BrowserLaunchValue=0;
	public static String EnvURL = null;
	public static String BrowserName = null;
	
	
	public static void SetBrowser() throws Exception 
	{
		try 
		{
			userData = new ExcelUtility(Constant.File_RMSConfiguration,"Index");
			Browser = userData.getCell(1, 10);
			URLChoiceDev = userData.getCell(1, 11);
			URLChoiceStg = userData.getCell(2, 11);
			URLChoiceProd = userData.getCell(3, 11);
			ChkBrowser = Integer.parseInt(userData.getCell(1, 10));

			switch (ChkBrowser) 
			{
			case 1:
				IEbrowser("browser");
				BrowserName = "IE Browser";
				break;
			 case 2:
				Chromebrowser("browser");
				BrowserName= "Chrome";
				break; 
			case 3:
				Firefoxdriver("browser");
				BrowserName = "FireFox";
				break;
			case 4:
				//Safaridriver("browser");
				break;
			case 5:
				//Operadriver("browser");
				break;
			default:
				Chromebrowser("browser");
				BrowserName = "Chrome";
				break;
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public static void URL_Choice() 
	{
		try 
		{
			if (URLChoiceDev.equalsIgnoreCase("TRUE")) 
			{
				URL = userData.getCell(2, 5); // Dev env. URL Location
				Constant.driver.get(URL);
				EnvURL = URL.toString();

			} 
			else if (URLChoiceStg.equalsIgnoreCase("TRUE")) 
			{
				URL = userData.getCell(3, 5); // Staging env. URL location
				Constant.driver.get(URL);
				EnvURL = URL.toString();
			}
			else if (URLChoiceProd.equalsIgnoreCase("TRUE")) 
			{
				URL = userData.getCell(4, 5); // Prod env. URL location
				Constant.driver.get(URL);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

	public static void Firefoxdriver(String browser) throws Exception 
	{
		// create firefox instance
		Constant.driver = new FirefoxDriver(FF_Profile());
		Constant.driver.manage().window().maximize();
		BrowserLaunchValue =3;
		
	}

	  public static void Chromebrowser(String browser) throws Exception 
	{
		// set path to chromedriver.exe
		System.setProperty("webdriver.chrome.driver", Constant.ChromeDriver);
		// create chrome instance
		Constant.driver = new ChromeDriver(Chrome_Profile());
		Constant.driver.manage().window().maximize();
		BrowserLaunchValue =2;
	} 

	public static void IEbrowser(String browser) throws Exception 
	{
		// Check if parameter passed as 'IE'
		// set path to IE.exe
		System.setProperty("webdriver.ie.driver", Constant.IEDriver);
		// create IE instance
		Constant.driver = new InternetExplorerDriver();
		//Constant.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BrowserLaunchValue = 1;
	}
	
	public static DesiredCapabilities FF_Profile() throws Exception
	{
		DesiredCapabilities capabilities = new DesiredCapabilities().firefox();
		
		String FilePath = createDirectory();
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		profile.setPreference("browser.download.manager.focusWhenStarting", false);
		profile.setPreference("browser.download.manager.useWindow", false);
		profile.setPreference("browser.download.manager.showAlertOnComplete", false);
		profile.setPreference("browser.download.manager.closeWhenDone", false);
		profile.setPreference("browser.download.dir", FilePath);
		profile.setPreference("services.sync.prefs.sync.browser.download.manager.showWhenStarting", false);
		profile.setPreference("pdfjs.disabled", true);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml,application/pdf");
		
		capabilities.setCapability(FirefoxDriver.PROFILE, profile);
		return capabilities;
	}
	
	public static DesiredCapabilities Chrome_Profile() throws Exception{
		String FilePath = createDirectory();
		
		DesiredCapabilities capabilities = new DesiredCapabilities().chrome();
		
		ChromeOptions options = new ChromeOptions();
	    Map<String, Object> prefs = new HashMap<String, Object>();
	    prefs.put("profile.default_content_settings.popups", 0);
	    prefs.put("download.default_directory", FilePath);
	    options.setExperimentalOption("prefs", prefs);
	    options.addArguments("--test-type");
	    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	    return capabilities;
	    
	}
	
	public static String createDirectory(){
		
	// Setting Download directory
		File dir1 = new File("DownloadContract"); 
		if(dir1.exists()){
			File dir = new File(System.getProperty("user.dir")+"\\DownloadContract");
		    File[] files = dir.listFiles();
		    if (files != null || files.length > 0) {
		    	for (int i = 0; i < files.length; i++) {
		    		files[i].delete();
		    	}
		    }
			dir1.delete();
		}
		dir1.mkdir();
		
		return System.getProperty("user.dir")+"\\DownloadContract";
	
	}

}
