package com.yash.RMS.TestAction.login;

import org.openqa.selenium.support.PageFactory;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.login.PageFactory_Login;

public class Action_LoginVerification
{
	
	
	@SuppressWarnings("unused")
	public static void loginvaliddata() throws Throwable
	{
		PageFactory_Login Login  =  PageFactory.initElements(Constant.driver, PageFactory_Login.class);
	
		// String username = PageObjects_Login.txt_loggedinuser(Constant.driver).getText().toString();
		 String	 username = Login.txt_loggedinuser.getText().toString();
		
		System.out.println(username);
		if(username.equalsIgnoreCase("Archana Gaikwad"))
		{
			
		System.out.println("Successful");	
		Report.ReporterOutput("Verify Logged in User.", username, "Logged in user should be Displayed.","Logged In User Displayed as username "+ username + "", "Pass", username, username);
			
		}

		 
		
		
	//-------------------------------------------------------------------------------------------------------
				
					
		 
			 
		}
		 
}