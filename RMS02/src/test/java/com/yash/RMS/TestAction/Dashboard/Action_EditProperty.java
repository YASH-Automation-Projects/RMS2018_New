package com.yash.RMS.TestAction.Dashboard;

import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.Wait;
import com.yash.RMS.CustomProperties.CommonMethods;
import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Admin.PageFactory_Resources;
import com.yash.RMS.POM.Dashboard.PageObjects_EditProfile;

public class Action_EditProperty {

	public static void EditProfile_UpdatingData(String Contact_no1, String Contact_no2, String CustomerUserIdDetails)
			throws Throwable {

		try {

			// File FilePath = new
			// File("F:\\TestFolderNew\\RMS_Automaiton_TestData.xlsx");
			FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);

			Workbook TestWorkbook = new XSSFWorkbook(ObjExcelApp);
			String sheetName = "test";
			@SuppressWarnings("rawtypes")

			Sheet NewSheet = TestWorkbook.getSheet("Edit_Profile");

			Constant.driver.manage().window().maximize();
			
			Thread.sleep(3000); 

			// Verfiying and Clicking on Edit Profile Link
			if (PageObjects_EditProfile.lnk_EditProfile(Constant.driver).isEnabled()
					|| PageObjects_EditProfile.lnk_EditProfile(Constant.driver).isDisplayed()) {

				PageObjects_EditProfile.lnk_EditProfile(Constant.driver).click();
				Thread.sleep(5000);

				Report.ReporterOutput("Step", "Verify Edit Profile link is enabled.", "Edit Profile Link",
						"Edit Profile Link should be enabled and clicked.", "Edit Profile is enabled and clicked.",
						"Pass", null);

			}

			else {

				Report.ReporterOutput("Step", "Verify Edit Profile link is enabled.", "Edit Profile Link",
						"Edit Profile Link should be enabled and clickable.",
						"Edit Profile is Disabled and Non clickable", "Fail", null);

			}

			// Switching to Edit Profile Frame

			Constant.driver.switchTo().frame(0);
			/*
			 * String UserProfileTest =
			 * PageObjects_EditProfile.Iframe_Header(Constant.driver).getText();
			 * String UserProfileActual = "USER PROFILE"; if
			 * (UserProfileTest.contains(UserProfileActual))
			 * 
			 * { Report.ReporterOutput("Step",
			 * "Verify Edit Profile Window Open Successfully",
			 * "Edit Profile Window",
			 * "Edit Profile Link should work and Profile window get open successfully"
			 * ,
			 * "Edit Profile Link work and Profile window get open successfully"
			 * , "Pass", null);
			 * 
			 * } else {
			 * 
			 * Report.ReporterOutput("Step",
			 * "Verify Edit Profile Window Open Successfully",
			 * "Edit Profile Window",
			 * "Edit Profile Link should work and Profile window get open successfully"
			 * ,
			 * "Edit Profile Link not work and Profile window doeas not get open successfully"
			 * , "Pass", null); }
			 */
			// Verfiyinng first name field is Disabled
			if (PageObjects_EditProfile.TextBox__FirstName(Constant.driver).isEnabled()) {

				System.out.println("First Name text Box no");
				Report.ReporterOutput("Step", "Verify First Name Field is Disabled.", "First Name Field",
						"Edit Profile Link should be enabled and clickable.", "First name field is Enabled", "Fail",
						null);

			} else {
				Report.ReporterOutput("Step", "Verify First Name Field is Disabled.", "First Name Field",
						"First Name field should be Disabled.", "First name field is Disabled", "Pass", null);
			}

			// Verfiyinng Middle name field is Disabled
			if (PageObjects_EditProfile.TextBox__MiddleName(Constant.driver).isEnabled()) {
				Report.ReporterOutput("Step", "Verify Middle Name Field is Disabled.", "Middle Name Field",
						"Middle Name field should be Disabled.", "Middle name field is Enabled", "Fail", null);

			}

			else {

				Report.ReporterOutput("Step", "Verify Middle Name Field is Disabled.", "Middle Name Field",
						"Middle Name field should be Disabled.", "Middle name field is Disabled", "Pass", null);

			}

			// Verfiyinng Last name field is Disabled
			if (PageObjects_EditProfile.TextBox__LastName(Constant.driver).isEnabled()) {
				Report.ReporterOutput("Step", "Verify Last Name Field is Disabled.", "Last Name Field",
						"Last Name field should be Disabled.", "Last name field is Enabled", "Fail", null);

			}

			else {

				Report.ReporterOutput("Step", "Verify Last Name Field is Disabled.", "Last Name Field",
						"Last Name field should be Disabled.", "Last name field is Disabled", "Pass", null);

			}

			// Verfiyinng Email field is Disabled
			if (PageObjects_EditProfile.TextBox__EmailId(Constant.driver).isEnabled()) {
				Report.ReporterOutput("Step", "Verify Email Id Field is Disabled.", "Email Id Field",
						"Email Id field should be Disabled.", "Email Id field is Enabled", "Fail", null);

			}

			else {

				Report.ReporterOutput("Step", "Verify Email Id Field is Disabled.", "Email Id Field",
						"Email Id field should be Disabled.", "Email Id field is Disabled", "Pass", null);

			}

			// Verifying Grade field is Disabled
			if (PageObjects_EditProfile.TextBox__Grade(Constant.driver).isEnabled()) {
				Report.ReporterOutput("Step", "Verify Grade Field is Disabled.", "Grade Field",
						"Grade field should be Disabled.", "Grade field is Enabled", "Fail", null);

			}

			else {

				Report.ReporterOutput("Step", "Verify Grade Field is Disabled.", "Grade Field",
						"Grade field should be Disabled.", "Grade field is Disabled", "Pass", null);

			}

			// Verifying Upload image is enabled and image can be uploaded
			if (PageObjects_EditProfile.Button__UploadImage(Constant.driver).isEnabled()) {
				Report.ReporterOutput("Step", "Verify Upload Image buttom is Enabled.", "Upload Image",
						"Updaload Image button is enabled", "UploadImage Button is enabled", "Pass", null);

				PageObjects_EditProfile.Button__UploadImage(Constant.driver).click();
				// Calling method which contain robot class
				uploadFile(Constant.JPGImage);

			}

			else {

				Report.ReporterOutput("Step", "Verify Upload Image buttom is Enabled.", "Upload Image",
						"Updaload Image button is enabled.", "Updaload Image button is Diabled", "Fail", null);

			}

			// Verifying Contact one Field is enabled and Setting up the data
			if (PageObjects_EditProfile.TextBox__ContactNo(Constant.driver).isEnabled()) {

				PageObjects_EditProfile.TextBox__ContactNo(Constant.driver).clear();
				PageObjects_EditProfile.TextBox__ContactNo(Constant.driver).sendKeys(Contact_no1);
				Report.ReporterOutput("Step", "Verify Contact No 1 Field is Enabled.", "Contact one Field",
						"Contact field 1 should be enabledn and take Value in it",
						"Contact field 1 is enabled and take Value in it", "Pass", null);
			}

			else {

				Report.ReporterOutput("Step", "Verify Contact No 1 Field is Enabled.", "Contact one Field",
						"Contact field 1 should be enabled and take Value in it",
						"Contact field 1 is not enabled and take Value in it", "Fail", null);
			}

			// Verifying Contact Two Field is enabled and Setting up the data

			if (PageObjects_EditProfile.TextBox__ContactNo2(Constant.driver).isEnabled()) {

				PageObjects_EditProfile.TextBox__ContactNo2(Constant.driver).clear();
				PageObjects_EditProfile.TextBox__ContactNo2(Constant.driver).sendKeys(Contact_no2);
				Report.ReporterOutput("Step", "Verify Contact No 2 Field is Enabled.", "Contact two Field",
						"Contact field 2 should be enabled and take Value in it",
						"Contact field 2 is enabled and take Value in it", "Pass", null);
			}

			else {

				Report.ReporterOutput("Step", "Verify Contact No 2 Field is Enabled.", "Contact two Field",
						"Contact field 2 should be enabled and take Value in it",
						"Contact field 2 is not enabled and take Value in it", "Fail", null);
			}

			// Verifying Customer detail Field is enabled and Setting up the
			// data
			if (PageObjects_EditProfile.TextBox__CustDetails(Constant.driver).isEnabled()) {
				PageObjects_EditProfile.TextBox__CustDetails(Constant.driver).clear();
				PageObjects_EditProfile.TextBox__CustDetails(Constant.driver).sendKeys(CustomerUserIdDetails);
				Report.ReporterOutput("Step", "Verify Customer Detail Field is Enabled.", "Customer Detail Field",
						"Customer Detail should be enabled and take Value in it",
						"Customer Detail is enabled and take Value in it", "Pass", null);
			}

			else {

				Report.ReporterOutput("Step", "Verify Customer Detail Field is Enabled.", "Customer Detail Field",
						"Customer Detail should be enabled and take Value in it",
						"Customer Detail is not enabled and take Value in it", "Fail", null);
			}

			// Selecting Multiple

			for (int i = 1; i < 4; i++) {
				String Text1 = NewSheet.getRow(i).getCell(3).toString();
				int Index = (int) NewSheet.getRow(i).getCell(4).getNumericCellValue();

				MultipleChechboxSelect(Text1, Index, "Primary");

			}
			
			for (int i = 1; i < 4; i++) {
				String Text1 = NewSheet.getRow(i).getCell(5).toString();
				int Index = (int) NewSheet.getRow(i).getCell(6).getNumericCellValue();

				MultipleChechboxSelect(Text1, Index, "Secondry");

			}

			
			

			if (PageObjects_EditProfile.Button__Save(Constant.driver).isEnabled()) {

				PageObjects_EditProfile.Button__Save(Constant.driver).click();
				Report.ReporterOutput("Step", "Veriying save button is enabled and Data get saved", "Save button",
						"Save button should be enabled and when clicked data get saved",
						"Saved button is enabled and when clicked data get saved.", "Pass", null);
			}

			else {

				Report.ReporterOutput("Step", "Veriying save button is enabled and Data get saved", "Save button",
						"Save button should be enabled and when clicked data get saved", "Saved button is Disabled",
						"Fail", null);

			}

			/*
			 * CommonMethods.waitForElement(PageObjects_EditProfile.
			 * SucessMessage_Alert(Constant.driver), Constant.driver);
			 * 
			 * String SuccessText =
			 * PageObjects_EditProfile.SucessMessage_Alert(Constant.driver).
			 * getText();
			 * 
			 * 
			 * 
			 * if (SuccessText.
			 * equalsIgnoreCase("Success Your profile has been updated successfully"
			 * )) { Report.ReporterOutput("Step",
			 * "Veriying Profile edited Successfully", "Success Message",
			 * "Profile should get saved successfully and Success message should get display"
			 * , "Success Message get display", "Pass", null);
			 * 
			 * }else{
			 * 
			 * Report.ReporterOutput("Step",
			 * "Veriying Profile edited Successfully", "Success Message",
			 * "Profile should get saved successfully and Success message should get display"
			 * , "Success Message not get display", "Fail", null);
			 * 
			 * 
			 * }
			 */
		    
			
			
			
			
			// Closing Profile Edit Window

			Constant.driver.switchTo().defaultContent();
			PageObjects_EditProfile.Closs_Profile_Edit(Constant.driver).click();
			CommonMethods.waitForElementClickable(PageObjects_EditProfile.lnk_EditProfile(Constant.driver),
					Constant.driver);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void EditProfile_Searching(String SearchTextPrimary, String SearchTextSeconday) throws Throwable {
		try {

			Constant.driver.manage().window().maximize();
			Thread.sleep(14000);

			

			// Verfiying and Clicking on Edit Profile Link
			if (PageObjects_EditProfile.lnk_EditProfile(Constant.driver).isEnabled()
					|| PageObjects_EditProfile.lnk_EditProfile(Constant.driver).isDisplayed()) {

				PageObjects_EditProfile.lnk_EditProfile(Constant.driver).click();
				Thread.sleep(10000);

				Report.ReporterOutput("Step", "Verify Edit Profile link is enabled.", "Edit Profile Link",
						"Edit Profile Link should be enabled and clicked.", "Edit Profile is enabled and clicked.",
						"Pass", null);

			}

			else {

				Report.ReporterOutput("Step", "Verify Edit Profile link is enabled.", "Edit Profile Link",
						"Edit Profile Link should be enabled and clickable.",
						"Edit Profile is Disabled and Non clickable", "Fail", null);

			}

			Constant.driver.switchTo().frame(0);
			if (PageObjects_EditProfile.SearchBox_PrimarySkills(Constant.driver).isEnabled()) {

				PageObjects_EditProfile.SearchBox_PrimarySkills(Constant.driver).sendKeys(SearchTextPrimary);

				int i = Searching(SearchTextPrimary, "Primary");

				switch (i) {
				case 0:
					Report.ReporterOutput("Step", "Verifying Primary skill Search Works Properly",
							"Primary Skills Search", "Primary Skill search Should work Properly",
							"Primary Skill Does not work properly", "Fail", null);
					break; // optional

				case 1:

					Report.ReporterOutput("Step", "Verifying Primary skill Search Works Properly",
							"Primary Skills Search", "Primary Skill search Should work Properly",
							"Primary Skill work properly", "Pass", null);
					break; // optional

				case 2:
					Report.ReporterOutput("Step", "Verifying Primary skill Search Works Properly",
							"Primary Skills Search", "Primary Skill search Should work Properly",
							"Imput Skills Does not found", "Fail", null);
					break; // optional

				// You can have any number of case statements.

				}

			}

			else {

				Report.ReporterOutput("Step", "Verifying Primary skill Search Works Properly", "Save button",
						"Verifying Primary skill Search Works Properly", "Primary Skill Search text bos is disabled",
						"Fail", null);
			}

			if (PageObjects_EditProfile.SearchBox_SecondrySkills(Constant.driver).isEnabled()) {

				PageObjects_EditProfile.SearchBox_SecondrySkills(Constant.driver).sendKeys(SearchTextSeconday);

				int i = Searching(SearchTextSeconday, "Secondry");

				switch (i) {
				case 0:
					Report.ReporterOutput("Step", "Verifying Secondry skill Search Works Properly",
							"Secondry Skills Search", "Secondry Skill search Should work Properly",
							"Secondry Skill Does not work properly", "Fail", null);
					break; // optional

				case 1:

					Report.ReporterOutput("Step", "Verifying Secondry skill Search Works Properly",
							"Secondry Skills Search", "Secondry Skill search Should work Properly",
							"Secondry Skill work properly", "Pass", null);
					break; // optional

				case 2:
					Report.ReporterOutput("Step", "Verifying Secondry skill Search Works Properly",
							"Secondry Skills Search", "Secondry Skill search Should work Properly",
							"Imput Skills Does not found", "Fail", null);
					break; // optional

				// You can have any number of case statements.

				}

			}

			else {

				Report.ReporterOutput("Step", "Verifying Secondry skill Search Works Properly", "Save button",
						"Verifying Secondry skill Search Works Properly", "Secondry Skill Search text bos is disabled",
						"Fail", null);
			}

			// Closing Profile Edit Window

			Constant.driver.switchTo().defaultContent();
			PageObjects_EditProfile.Closs_Profile_Edit(Constant.driver).click();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void setClipboardData(String string) {
		// StringSelection is a class that can be used for copy and paste
		// operations.
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

	public static void uploadFile(String fileLocation) throws Throwable {
		try {
			// Setting clipboard with file location
			setClipboardData(fileLocation);
			// native key strokes for CTRL, V and ENTER keys
			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.delay(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Report.ReporterOutput("Step", "Verify Image is Uploaded", "Upload Image", "Image is Uploaded",
					"Image is uploaded", "Pass", null);

		} catch (Exception exp) {
			exp.printStackTrace();
		}

	}

	public static int Searching(String SearchingText, String SearchingFor) {

		String str = null;

		if (SearchingFor.equals("Primary")) {

			str = PageObjects_EditProfile.SearchResult_PrimarySkills(Constant.driver).getText();
		}
		if (SearchingFor.equals("Secondry")) {

			str = PageObjects_EditProfile.SearchResult_SecondrySkills(Constant.driver).getText();

		}

		if (str.length() > 0) {
			String Replaced1 = str.replace("1 of 5 2 of 5 3 of 5 4 of 5 5 of 5", "/");

			ArrayList<String> SearchString = new ArrayList<String>();

			for (int j = 0; j < Replaced1.lastIndexOf("/"); j++) {

				String Replacednew1 = Replaced1.substring(0, Replaced1.indexOf("/"));

				Replaced1 = Replaced1.replaceAll(Replacednew1 + "/", "");

				SearchString.add(Replacednew1);

			}

			Iterator itr = SearchString.iterator();
			int i = 0;
			int j = 0;
			while (itr.hasNext()) {
				if (itr.next().toString().contains(SearchingText)) {
					i = i + 1;
				}

				else {
					j = j + 1;

				}
			}

			if (i > 0 || j == 0) {
				return 1;

			}

			else {
				return 0;

			}

		} else {

			return 2;
		}

	}

	public static void MultipleChechboxSelect(String sColValue1, int index, String SkillsType) throws Throwable {

		if (SkillsType.equals("Primary")) {
			for (int i = 1; i <= 300; i++) {

				WebElement element = PageObjects_EditProfile.PrimarySkills_Block(Constant.driver, i);
				((JavascriptExecutor) Constant.driver).executeScript("arguments[0].scrollIntoView(true);", element);

				Thread.sleep(500);
				String sColValue = PageObjects_EditProfile.PrimarySkills_Multiple_CkeckBox_Text(Constant.driver, i)
						.getText();

				if (sColValue.equalsIgnoreCase(sColValue1)) {

					int j = i - 1;

					if (!PageObjects_EditProfile.PrimarySkills_Multiple_CkeckBox_ident2(Constant.driver, j)
							.isSelected()) {
						PageObjects_EditProfile.PrimarySkills_Multiple_CkeckBox_ident2(Constant.driver, j).click();

						Select dropdown1 = new Select(
								PageObjects_EditProfile.PrimarySkills_Multiple_Rating(Constant.driver, i));
						dropdown1.selectByIndex(index);

					} else {
						System.out.println("Already selected.");
						PageObjects_EditProfile.PrimarySkills_Multiple_CkeckBox_ident2(Constant.driver, j).click();
						PageObjects_EditProfile.PrimarySkills_Multiple_CkeckBox_ident2(Constant.driver, j).click();
						Select dropdown1 = new Select(
								PageObjects_EditProfile.PrimarySkills_Multiple_Rating(Constant.driver, i));
						dropdown1.selectByIndex(index);
					}
					break;
				}

				/*
				 * if(PageObjects_EditProfile.PrimarySkills_Multiple_CkeckBox(
				 * Constant.driver, i).isSelected()) {
				 * 
				 * System.out.println("already Selected");
				 * 
				 * }
				 * 
				 * else{
				 * 
				 * System.out.println("Not Selected");
				 * 
				 * }
				 */

				/*
				 * PageObjects_EditProfile.PrimarySkills_Multiple_CkeckBox(
				 * Constant.driver, i).click();
				 */

			}

		}

		if (SkillsType.equals("Secondry")) {
			for (int i = 1; i <= 300; i++) {

				WebElement element = PageObjects_EditProfile.SecondrySkills_Block(Constant.driver, i);
				((JavascriptExecutor) Constant.driver).executeScript("arguments[0].scrollIntoView(true);", element);

				Thread.sleep(500);
				String sColValue = PageObjects_EditProfile.SecondrySkills_Multiple_CkeckBox_Text(Constant.driver, i)
						.getText();

				if (sColValue.equalsIgnoreCase(sColValue1)) {

					int j = i - 1;

					if (!PageObjects_EditProfile.SecondrySkills_Multiple_CkeckBox_ident2(Constant.driver, j)
							.isSelected()) {
						PageObjects_EditProfile.SecondrySkills_Multiple_CkeckBox_ident2(Constant.driver, j).click();

						Select dropdown1 = new Select(
								PageObjects_EditProfile.SecondrySkills_Multiple_Rating(Constant.driver, i));
						dropdown1.selectByIndex(index);

					} else {
						System.out.println("Already selected.");
						PageObjects_EditProfile.SecondrySkills_Multiple_CkeckBox_ident2(Constant.driver, j).click();
						PageObjects_EditProfile.SecondrySkills_Multiple_CkeckBox_ident2(Constant.driver, j).click();
						Select dropdown1 = new Select(
								PageObjects_EditProfile.SecondrySkills_Multiple_Rating(Constant.driver, i));
						dropdown1.selectByIndex(index);
					}
					break;
				}

				

			}

		}

		// Closing Profile Edit Window

	}

}
