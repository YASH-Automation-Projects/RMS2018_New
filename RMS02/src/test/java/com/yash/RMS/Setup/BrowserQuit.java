package com.yash.RMS.Setup;

import javax.mail.MessagingException;

import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Constant;

public class BrowserQuit 

{
	@Test
	public static void Browserclose() throws Throwable, MessagingException
	{
		Constant.driver.quit();
		ConfigureEMailReport.EmailEnabledcheck();

	}
}
