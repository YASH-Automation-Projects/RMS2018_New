package com.yash.RMS.ExporttoExcel;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class ReadHTMLReportData {
	public static int k1 = 2;
	public static int k3 = 1;
	int thCount;
	public static WebDriver driver = null;
	protected static DesiredCapabilities dCaps;

	@SuppressWarnings("rawtypes")
	@Test
	public static void readHTMLReport() throws Throwable {
		//driver = new FirefoxDriver();
		//driver = new HtmlUnitDriver();
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		driver.setJavascriptEnabled(true);
		/*File file = new File("C:/Program Files/phantomjs-2.1.1-windows/bin/phantomjs.exe");             
         System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
         dCaps = new DesiredCapabilities();
         dCaps.setJavascriptEnabled(true);
        // dCaps.setCapability("takesScreenshot", false);
         WebDriver driver = new PhantomJSDriver(dCaps);  */ 

		driver.get("file:///E:/Barter_Automation_Suit_updated/BarterSuite01/test-output/old/End_To_End_Suite/reporter-output.html");
		System.out.println("Browser open...");
		Thread.sleep(2000);
		WebElement reportArea = driver.findElement(By.xpath("html/body/table"));
		List<WebElement> tableReport = reportArea.findElements(By
				.tagName("table"));
		int tableCount = tableReport.size();
		Thread.sleep(2000);
		WebElement headersElement = driver.findElement(By
				.xpath("html/body/table/tbody/tr/td/table/tbody/tr[1]"));
		Thread.sleep(1000);
		List<WebElement> Headers = headersElement
				.findElements(By.tagName("th"));
		int thCount = Headers.size();

		int k = 1;

		WebElement HeadersEl = null;
		WebElement trElement = null;
		List<WebElement> trNumber = null;
		List<String> trIdList = null;
		List<String> hArray = new ArrayList<String>();
		Map<String, List> myMap = null;
		WebElement reportElement;
		int tdCount = 0;
		List<WebElement> reportValues = null;
		String ids = "";
		
		for (int i = 0; i < thCount; i++) {
			HeadersEl = driver
					.findElement(By
							.xpath("html/body/table/tbody/tr[1]/td/table/tbody/tr[1]/th["
									+ k + "]"));
			hArray.add(HeadersEl.getText());
			k++;
		}

		for (int t = 1; t <= tableCount; t++) {

			trElement = driver.findElement(By.xpath("html/body/table/tbody/tr["
					+ t + "]/td/table/tbody"));
			trNumber = trElement.findElements(By.tagName("tr"));
			
			trIdList = new ArrayList<String>();

			int tr = 3;
			int idCount = 0;
			for (WebElement ele1 : trNumber) {

				ids = ele1.getAttribute("id");
				System.out.println("ids= "+ids);
				
				//if (ids.isEmpty()) {
					
				if (ids == null ||ids.isEmpty()) {	
					System.out.println("blank row");
				}

				else {

					trIdList.add(ids);
					Thread.sleep(1000);
					reportElement = driver.findElement(By
							.xpath("html/body/table/tbody/tr[" + t
									+ "]/td/table/tbody/tr[" + tr + "]"));

					reportValues = reportElement.findElements(By.tagName("td"));
					tdCount = reportValues.size();

					WebElement ValueEl;
					List<String> vArray = new ArrayList<String>();

					for (int j = 1; j <= tdCount; j++) {
						Thread.sleep(1000);
						ValueEl = driver.findElement(By
								.xpath("html/body/table/tbody/tr[" + t
										+ "]/td/table/tbody/tr[" + tr + "]/td["
										+ j + "]"));

						vArray.add(ValueEl.getText());

					}// end of td for loop
					String idoformethod = trIdList.get(idCount);
					myMap = new LinkedHashMap<String, List>();
					myMap.put(idoformethod, vArray);

					ReportDescription.WriteReport(myMap);

					tr = tr + 2;
					idCount++;
				}

			}

		} // end of table for loop

	}// end of method
}// end of class

