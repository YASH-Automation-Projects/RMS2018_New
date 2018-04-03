package com.yash.RMS.TestAction.login;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.login.PageObjects_Login;

public class Action_ValidLogin 
{
	@SuppressWarnings("unused")
	public static void loginvaliddata() throws Throwable
	{
		String username = PageObjects_Login.txt_loggedinuser(Constant.driver).getText().toString();

		System.out.println(username);
		//if(username.equalsIgnoreCase("Aditi Bhaiya"))
		if(username.equalsIgnoreCase("Gulab Pawde"))
		{
			System.out.println("Successful");	
			Report.ReporterOutput("Step","Verify Logged in User.", username, "Logged in user should be Displayed.","Logged In User Displayed as username "+ username + "", "Pass",null);

		}
		//-------------------------------------------------------------------------------------------------------

	}

}