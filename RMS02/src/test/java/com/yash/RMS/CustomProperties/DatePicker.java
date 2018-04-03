package com.yash.RMS.CustomProperties;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DatePicker {
	public static void testDAtePicker(String s, WebElement ex, String d) throws InterruptedException 
	{
		
		// DAte and Time to be set in textbox
		String dateTime = d;
		
		ex.click();
           
        Thread.sleep(2000);

     // /************* for next, button*************////////////
        
        WebElement nextLink = Constant.driver.findElement(By.xpath(".//*[@id='purchaseGrid']/tbody/tr/td[6]/datepicker/div/div[1]/div[3]/a/b"));
        if(nextLink.isDisplayed())
        {
        }
        else
        {
        	nextLink = Constant.driver.findElement(By.xpath(".//*[@id='purchaseGrid']/tbody/tr/td[8]/datepicker/div/div[1]/div[3]/a/b"));
        }
        Thread.sleep(2000);
        
        // /************* for previousLink button*************////////////
        WebElement previousLink = Constant.driver.findElement(By.xpath(".//*[@id='purchaseGrid']/tbody/tr/td[6]/datepicker/div/div[1]/div[1]/a/b"));
        if(previousLink.isDisplayed())
        {
        }
        else
        {
        	previousLink = Constant.driver.findElement(By.xpath(".//*[@id='purchaseGrid']/tbody/tr/td[8]/datepicker/div/div[1]/div[1]/a/b"));
        }

        // //////////////////// //button to click in center of calendar header
        
        WebElement year1 = Constant.driver.findElement(By.xpath(".//*[@id='purchaseGrid']/tbody/tr/td[6]/datepicker/div/div[1]/div[2]/a/span"));
        if(year1.isDisplayed())
        {
        }
        else
        {
        	year1 = Constant.driver.findElement(By.xpath(".//*[@id='purchaseGrid']/tbody/tr/td[8]/datepicker/div/div[1]/div[2]/a/span"));
        }
        Thread.sleep(2000);

        // Split the date time to get only the date part

      //  String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("/");
        String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("/");

        // get the year difference between current year and year to set in
        // calander

        int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2])- Integer.parseInt(s.trim());

        year1.click();
        
        if (yearDiff != 0) 
        {
           if (yearDiff > 0) 
           {
           for (int i = 0; i < (yearDiff * 12); i++) {
                            //System.out.println("Year Diff->" + i);
                            nextLink.click();
                     }
               }

               // if you have to move previous year

               else if (yearDiff < 0) {
                     for (int i = 0; i < (yearDiff * (-1)); i++) {
                            //System.out.println("Year Diff->" + i);
                            previousLink.click();
                     }
               }
        }
        
        Thread.sleep(2000);

        // //////////////
        int currentMonth = (Calendar.getInstance().get(Calendar.MONTH))+1;

        //System.out.println("**************** currentMonth =  " + currentMonth);

        // ///////// for month

        int month = Integer.parseInt(date_dd_MM_yyyy[0]);
        //System.out.println("**************** currentMonth =  " + month);
        
        int diffMonth = month-currentMonth;

        year1.click();

        if (Integer.parseInt(s) != Calendar.getInstance().get(Calendar.YEAR)) {
               if (month != 0) {
                     if (month > 0) {
                            for (int i = 1; i <= (month - 2); i++) {
                                   //System.out.println("Year Diff->" + i);
                                   nextLink.click();
                            }
                     } else if (month < 0) {
                            for (int i = 0; i < (month * (-1)); i++) {
                                   //System.out.println("Year Diff->" + i);
                                   previousLink.click();
                            }
                     }

               }
        }
        else
        {
      //System.out.println("month is 2016");
      if(month>currentMonth)
      {
        for(int i=1; i<=(diffMonth);i++)
        {
               //System.out.println("Year Diff->" + i);
                            nextLink.click();
        }
      }
               
        }
 
               year1.click();
               Thread.sleep(1000);

        
                     // //////////////////// ********* for select date
                     
                     try {
                            List<WebElement> list_AllDateToBook = Constant.driver
                                          .findElements(By.xpath("//div[@class='_720kb-datepicker-calendar ng-scope _720kb-datepicker-open']//div[@class='_720kb-datepicker-calendar-body']//a[contains(@class,'_720kb-datepicker-calendar-day ng-binding ng-scope')]"));
                            list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[1]) - 1).click();

                            Thread.sleep(1000);
                     } catch (IndexOutOfBoundsException e) {
                            //System.out.println("Please enter valid date");
                     }

               }

}
