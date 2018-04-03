package com.yash.RMS.Testcase.Dashboard;

import java.sql.Driver;

import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.TestAction.Dashboard.TestAction_EditProfile1;

public class TestCase_EditProfile1 {
	
  @Test(priority = 1)
  public static void navigateToEditProfilePage() throws Throwable{
	  Report.TableEnd();
	  Report.Report_section_Name("Verify Edit Profile Link is working and popup is opening.");
	  Report.ReporterOutputHeader();
	  TestAction_EditProfile1.verifyEditProfileLink();
	  TestAction_EditProfile1.getTestDataByExcel();
	  Report.TableEnd();
  }
  
  @Test(priority = 2)
  public static void insertValuesForUpdate() throws Throwable{
	 Report.TableEnd();
	 Report.Report_section_Name("Verify Elemetns are populating by Excel data");
	 Report.ReporterOutputHeader(); 
	 TestAction_EditProfile1.insertValuesForElement();
	 Report.TableEnd();
  }
 
  @Test(priority = 3)
  public static void selectPrimarySecoundrySkills() throws Throwable{
	  Report.TableEnd();
	  Report.Report_section_Name("Verify Primary and Secoundry Skills functionality are working fine");
	  Report.ReporterOutputHeader();
	  TestAction_EditProfile1.selectPrimaryAndSecondarySkills(1);
	  TestAction_EditProfile1.searchSkillsFunctionality(1);
	  TestAction_EditProfile1.viewSelectedCourses(1);
	  TestAction_EditProfile1.selectPrimaryAndSecondarySkills(3);
	  TestAction_EditProfile1.searchSkillsFunctionality(3);
	  TestAction_EditProfile1.viewSelectedCourses(3);
	  Report.TableEnd();
  }
  
  @Test(priority = 4)
  public static void UpdateTheInformations() throws Throwable{
	  Report.TableEnd();
	  Report.Report_section_Name("Verify Save functionality is working fine for EditProfile Page");
	  Report.ReporterOutputHeader();
	  TestAction_EditProfile1.saveInformation();
	  Report.TableEnd();
  }
  
  @Test(priority = 5)
  public static void verifySavedDetails() throws Throwable{ 
	  Report.TableEnd();
	  Report.Report_section_Name("Verify Save functionality is working fine for EditProfile Page");
	  Report.ReporterOutputHeader();
	  TestAction_EditProfile1.verifySavedDetailsOfTheUser(1);
	  TestAction_EditProfile1.verifySavedDetailsOfTheUser(3);
	  Report.TableEnd();
	  
  }
  
}
