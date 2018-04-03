package com.yash.RMS.Testcase.Useful_links;

import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.TestAction.Useful_links.Action_PageFuseful;

public class Testcase_useful_Links
{
	
	@Test
	public static void useful_Links() throws Throwable
	{	
		Report.TableEnd();
		Report.Report_section_Name("Useful Links");
		Report.ReporterOutputHeader();
		//Action_Useful_Links.Navigation();
		Action_PageFuseful.Navigation();
		Report.TableEnd();
		
					
	}
	
	
	

	
}
	
	


