package com.yash.RMS.TestAction.Dashboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.yash.RMS.CustomProperties.CommonMethods;
import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.ExcelUtility;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.POM.Dashboard.PageObject_EditProfile1;


public class TestAction_EditProfile1 {
	
	public static String contact1;
	public static String contact2;
	public static String CustomerUserIDDetails;
	public static String searchPrimarySkils;
	public static String searchSecoundrySkils;	
	public static List<String>  primarySkills = new ArrayList<String>();
	public static List<Integer>   primarySkillsRating  = new ArrayList<Integer>();
	public static List<String>  secoundrySkills = new ArrayList<String>();
	public static List<Integer>   secoundrySkillsRating  = new ArrayList<Integer>();	
	
	public static void getTestDataByExcel(){
		ExcelUtility testData = new ExcelUtility(Constant.RMS_TEST_DATA, "Edit_Profile");
		contact1 = testData.getCell(1, 0).toString();
		contact2 = testData.getCell(1, 1).toString();
		CustomerUserIDDetails = testData.getCell(1, 2).toString();
		searchPrimarySkils = testData.getCell(1, 7).toString();
		searchSecoundrySkils = testData.getCell(1, 8).toString();
		
		for (int j = 3; j <=6; j++){
            for (int i = 1; i <= testData.ws.getLastRowNum(); i++){
            	Cell cell = testData.ws.getRow(i).getCell(j);
            	if(j==3 || j==4){                	    
            		if(j==3 && !cell.equals("")){
            			primarySkills.add(cell.getStringCellValue());
            		}else if (cell != null){
            			primarySkillsRating.add((int) cell.getNumericCellValue());
            		}
            	}else if (j==5 || j==6){
            		if(j==5 && !cell.equals("")){
            			secoundrySkills.add(cell.getStringCellValue());
            		}else if (cell != null){
            			secoundrySkillsRating.add((int) cell.getNumericCellValue());
            		}
            	}
            }
        }
	}

	public static void verifyEditProfileLink() throws Throwable{
		try{
			CommonMethods.waitForPageToBeLoaded();
			if(PageObject_EditProfile1.lnk_EditProfile(Constant.driver).isEnabled()){
			PageObject_EditProfile1.lnk_EditProfile(Constant.driver).click();
			Thread.sleep(3000);
			Report.ReporterOutput("Step","Verify Edit Profile link is enabled and working.","EditProfile link", "Edit Profile link should be enabled and clicked.", "Edit Profile link is enabled and clickable.", "Pass", null);
			}else{
				Report.ReporterOutput("Step","Verify Edit Profile link is enabled and working.","EditProfile link", "Edit Profile link should be enabled and clicked.", "Edit Profile link is not enabled and clickable.", "Fail", null);
			}
			Constant.driver.switchTo().frame(0);
			
		 	CommonMethods.waitForElement(PageObject_EditProfile1.userEditProfilePage(Constant.driver), Constant.driver);
			if(PageObject_EditProfile1.userEditProfilePageLink(Constant.driver).isDisplayed()){
				Report.ReporterOutput("Step","Verify Edit Profile popup is opening.","EditProfile popup", "Edit Profile popup should open.", "Edit Profile popup is opening successfuly.", "Pass", null);
			}else{
				Report.ReporterOutput("Step","Verify Edit Profile popup is opening.","EditProfile popup", "Edit Profile popup should open.", "Edit Profile popup is not opening successfuly.", "Fail", null);
			}
		}catch(Exception e){
			Report.ReporterOutput("Step","Verify Edit Profile link and popup is not throwing any error ","EditProfile link & popup", "Edit Profile link & popup should not throw any error.", "Edit Profile link or popup is throwing some Error.", "Fail", null);
		}
	}

	public static void insertValuesForElement() throws Throwable {
		try{
			PageObject_EditProfile1.contactNumber1(Constant.driver).clear();
			PageObject_EditProfile1.contactNumber1(Constant.driver).sendKeys(contact1);
			Thread.sleep(2000);
			PageObject_EditProfile1.contactnumber2(Constant.driver).clear();
			PageObject_EditProfile1.contactnumber2(Constant.driver).sendKeys(contact2);	
			Thread.sleep(2000);
			PageObject_EditProfile1.customerUserIdDetails(Constant.driver).clear();
			PageObject_EditProfile1.customerUserIdDetails(Constant.driver).sendKeys(CustomerUserIDDetails);
			Thread.sleep(2000);
			try {
				PageObject_EditProfile1.uploadImage(Constant.driver).click();
				Thread.sleep(1000);
				String FolderPath = System.getProperty("user.dir");
				Runtime.getRuntime().exec(FolderPath+"/src/test/resources/AutoIt Files/RMS_EditProfile.exe");
			} catch (Exception e) {
				System.out.println("AutoIT is not working");
			}
			Report.ReporterOutput("Step","Verify values are inserting in elements.","Entry in Elements", "Entry in Elements should be populated by excel date", "Entry in Elements is populating by excel data", "Pass", null);
		}catch(Exception e){
			Report.ReporterOutput("Step","Verify values are inserting in elements.","Entry in Elements", "Entry in Elements should be populated by excel date", "Entry in Elements is not populating by excel data", "Fail", null);
		}
	}

	public static void selectPrimaryAndSecondarySkills(int skillType) throws Throwable{
		try{
			int primarySkillsSize = primarySkills.size();
			int secoundrySkillsSize = secoundrySkills.size();
			List<WebElement> list = PageObject_EditProfile1.getSkillsList(Constant.driver, skillType).findElements(By.tagName("li"));
			int j = 0;
			for(int i=1; i<=list.size(); i++){
				String ss = PageObject_EditProfile1.SkillsText(Constant.driver, skillType, i).getText();			
				if(skillType==1){				
					String skil = primarySkills.get(j).toString();
					if(skil.contains(ss)){
						if(!PageObject_EditProfile1.skillsCheckBox(Constant.driver, skillType, i).isSelected()){
							PageObject_EditProfile1.skillsCheckBox(Constant.driver, skillType, i).click();						
						}				
						new Select(PageObject_EditProfile1.SkillsRating(Constant.driver, skillType, i)).selectByIndex(primarySkillsRating.get(j)-1);
						j++;		
						i=0;
						--primarySkillsSize;
						if(primarySkillsSize==0){
							break;					
						}
					}
				}else{
					String skil = secoundrySkills.get(j).toString();
					if(skil.contains(ss)){
						if(!PageObject_EditProfile1.skillsCheckBox(Constant.driver, skillType, i).isSelected()){
							PageObject_EditProfile1.skillsCheckBox(Constant.driver, skillType, i).click();
						}	
						new Select(PageObject_EditProfile1.SkillsRating(Constant.driver, skillType, i)).selectByIndex(secoundrySkillsRating.get(j)-1);
						j++;		
						i=0;
						--secoundrySkillsSize;
						if (secoundrySkillsSize==0) {
							break;
						}
					}
				}
			}
			selectionCouresReport(skillType);
		}catch(Exception e){
			Report.ReporterOutput("Step","Verify Primary & Secoundry Skills are selection is not throwing any exception","Verify Primary & Secoundry Skills Selection", "Primary & Secoundry Skills should be selected successfully", "Primary & Secoundry Skills selection is throwing exception", "Fail", null);
		}
	}
	
	public static void selectionCouresReport(int skillType) throws Throwable{
		if(skillType==1){
			Report.ReporterOutput("Step","Verify Primary Skills are selecting successfully","Verify Primary Skills Selection", "Primary Skills should be selected successfully", "Primary Skills are selected successfully", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify Secoundry Skills are selecting successfully","Verify Secoundry Skills Selection", "Secoundry Skills should be selected successfully", "Secoundry Skills are selected successfully", "Pass", null);
		}		
	}
	
	public static void setRatingForCourses(int skillType, int i){
		
	}
	
	public static List<String> searchedList;
	public static void searchSkillsFunctionality(int skilType) throws Throwable{
		try{
			if(skilType==1){
				PageObject_EditProfile1.primarySkillsSearchTextBox(Constant.driver, skilType).sendKeys(searchPrimarySkils);
			}else{
				PageObject_EditProfile1.primarySkillsSearchTextBox(Constant.driver, skilType).sendKeys(searchSecoundrySkils);
			}
			String skils = PageObject_EditProfile1.getSearchedSkillsResult(Constant.driver, skilType).getText().trim();
			String list = skils.replaceAll("\\s*[\\r\\n]+\\s*", " ").replace("1 of 5 2 of 5 3 of 5 4 of 5 5 of 5", ",").trim();
			searchedList = new ArrayList<String>(Arrays.asList(list.split(",")));
			Boolean flagResult = isSearchedResultMatchWithSearchedText(skilType);
			searchFunctionalityReport(skilType, flagResult);
		}catch(Exception e){
			Report.ReporterOutput("Step","Verify Primary & Secoundry Skills search functionality is not throwing any error","Secoundry Skills search functionality", "Secoundry Skills search functionality should working fine", "Secoundry Skills search functionality is some throwing exception.", "Fail", null);
		}
	}
	
	public static Boolean isSearchedResultMatchWithSearchedText(int skilType){
		int count=0;
		if(skilType==1){
			for(int i=0; i<=searchedList.size()-1; i++){
				boolean a = searchedList.get(i).contains(searchPrimarySkils);
				if(a==true){
					count++;
				}
			}
			if(searchedList.size()==count){
				return true;
			}else{
				return false;
			}
		}else{
			for(int i=0; i<=searchedList.size()-1; i++){
				boolean a = searchedList.get(i).contains(searchSecoundrySkils);
				if(a==true){
					count++;
				}
			}
			if(searchedList.size()==count){
				return true;
			}else{
				return false;
			}
		}
	}
	
	public static void searchFunctionalityReport(int skilType, boolean flagResult) throws Throwable{
		if(skilType==1){
			if(flagResult=true){
				Report.ReporterOutput("Step","Verify Primary Skills search functionality is working fine","Primary Skills search functionality", "Primary Skills search functionality should working fine and All the courses should match with : ["+searchPrimarySkils+"] Keyword ", "Primary Skills search functionality is working fine : "+searchedList+" ", "Pass", null);
			}else{
				Report.ReporterOutput("Step","Verify Primary Skills search functionality is working fine","Primary Skills search functionality", "Primary Skills search functionality should working fine and All the courses should match with : ["+searchPrimarySkils+"] Keyword ", "Primary Skills search functionality is Not working fine : "+searchedList+" ", "Fail", null);
			}
		}else{
			if(flagResult=true){
				Report.ReporterOutput("Step","Verify Secoundry Skills search functionality is working fine","Secoundry Skills search functionality", "Secoundry Skills search functionality should working fine and All the courses should match with : ["+searchSecoundrySkils+"] Keyword", "Secoundry Skills search functionality is working fine : "+searchedList+" ", "Pass", null);
			}else{
				Report.ReporterOutput("Step","Verify Secoundry Skills search functionality is working fine","Secoundry Skills search functionality", "Secoundry Skills search functionality should working fine and All the courses should match with : ["+searchSecoundrySkils+"] Keyword", "Secoundry Skills search functionality is Not working fine : "+searchedList+" ", "Fail", null);
			}
		}
	}
	
	public static List<String> selectedCoursesList = new ArrayList<String>();
	public static void viewSelectedCourses(int skillType) throws Throwable{
		try{
			PageObject_EditProfile1.viewSelectedCourses(Constant.driver, skillType).click();
			List<WebElement> list = PageObject_EditProfile1.selectedCoursesList(Constant.driver).findElements(By.tagName("li"));
			for(int i=1; i<=list.size(); i++){
				selectedCoursesList.add(PageObject_EditProfile1.getTextOfSelectedCourses(Constant.driver, i).getText());
			}
			PageObject_EditProfile1.closePopupSelectedSkills(Constant.driver).click();
			verifySelectedCoursesWithExcelData(skillType);
		}catch(Exception e){
			Report.ReporterOutput("Step","Verify Selected Skills popuop is not throwing any Exception","Selected Skills popup", "Selected Skills popup should show all the selected skills in it", "Selected Skills popup is throwing some Exception", "Fail", null);
		}
	}
	
	public static void verifySelectedCoursesWithExcelData(int skillType) throws Throwable{
		HashSet<String> similar =  new HashSet<String>(selectedCoursesList);
		if(skillType==1){
			similar.retainAll( primarySkills );
			if(similar.containsAll(primarySkills)){
				Report.ReporterOutput("Step","Verify Excel Primary skils are visible in Selected Skills popuop","Verification Selected Skills popup by Excelsheet", "Selected Primary Skills popup should show all the skills set in Excel", "Selected Primary Skills popup is showing all the skills set in excelsheet", "Pass", null);
			}else{
				Report.ReporterOutput("Step","Verify Excel Primary skils are visible in Selected Skills popuop","Verification Selected Skills popup by Excelsheet", "Selected Primary Skills popup should show all the skills set in Excel", "Selected Primary Skills popup is Not showing all the skills set in excelsheet", "Fail", null);
			}
		}else{
			similar.retainAll( secoundrySkills );
			if(similar.containsAll(secoundrySkills)){
				Report.ReporterOutput("Step","Verify Excel Secoundry skils are visible in Selected Skills popuop","Verification Selected Skills popup by Excelsheet", "Selected Secoundry Skills popup should show all the skills set in Excel", "Selected Secoundry Skills popup is showing all the skills set in excelsheet", "Pass", null);
			}else{
				Report.ReporterOutput("Step","Verify Excel Secoundry skils are visible in Selected Skills popuop","Verification Selected Skills popup by Excelsheet", "Selected Secoundry Skills popup should show all the skills set in Excel", "Selected Secoundry Skills popup is not showing all the skills set in excelsheet", "Fail", null);
			}
		}		
	}
	
	public static void saveInformation() throws Throwable{
		try{
			PageObject_EditProfile1.submitButton(Constant.driver).click();
			Thread.sleep(4000);
		CommonMethods.waitForPageToBeLoaded();
			CommonMethods.waitForElement(PageObject_EditProfile1.successMessage(Constant.driver), Constant.driver);
			if(PageObject_EditProfile1.successMessage(Constant.driver).isDisplayed()){
				Report.ReporterOutput("Step","Verify save functionality is working fine for EditProfile Page","Save Information Functionality", "Save Information Functionality should work fine", "Save Information Functionality is working fine", "Pass", null);
			}else{
				Report.ReporterOutput("Step","Verify save functionality is working fine for EditProfile Page","Save Information Functionality", "Save Information Functionality should work fine", "Save Information Functionality is Not working fine", "Fail", null);
			}
			Constant.driver.switchTo().defaultContent();
			PageObject_EditProfile1.closeButtonForPopup(Constant.driver).click();
			CommonMethods.waitForPageToBeLoaded();
			//Constant.driver.navigate().refresh();
		}catch(Exception e){
			//Report.ReporterOutput("Step","Verify save functionality is not throwing any Exception","Save Information Functionality", "Save Information Functionality should work fine", "Save Information Functionality is throwing some Exception", "Fail", null);
		}
	}
	
	public static void verifySavedDetailsOfTheUser(int skillType) throws Throwable{
		if(skillType==1){
			verifyEditProfileLink();
			isContactsAndCustomerDetailsSuccessfully();
		}		
		viewSelectedCourses(skillType);
		if(skillType==3){
			Constant.driver.switchTo().defaultContent();
			PageObject_EditProfile1.closeButtonForPopup(Constant.driver).click();
		}
	}
	
	public static void isContactsAndCustomerDetailsSuccessfully() throws Throwable{
		if(contact1.equalsIgnoreCase(PageObject_EditProfile1.contactNumber1(Constant.driver).getAttribute("value"))){
			Report.ReporterOutput("Step","Verify Contact1 is saved successfully same as excel sheet","Saved Contact1 details verification", "Contact1 shoud be saved same as excel sheet", "Contact1 is saved same as excel sheet", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify Contact1 is saved successfully same as excel sheet","Saved Contact1 details verification", "Contact1 shoud be saved same as excel sheet", "Contact1 is Not saved same as excel sheet", "Fail", null);
		}
		if(contact2.equalsIgnoreCase(PageObject_EditProfile1.contactnumber2(Constant.driver).getAttribute("value"))){
			Report.ReporterOutput("Step","Verify Contact2 is saved successfully same as excel sheet","Saved Contact2 details verification", "Contact2 shoud be saved same as excel sheet", "Contact2 is saved same as excel sheet", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify Contact2 is saved successfully same as excel sheet","Saved Contact2 details verification", "Contact2 shoud be saved same as excel sheet", "Contact2 is Not saved same as excel sheet", "Fail", null);
		}
		if(CustomerUserIDDetails.equalsIgnoreCase(PageObject_EditProfile1.customerUserIdDetails(Constant.driver).getText())){
			Report.ReporterOutput("Step","Verify customer user id details is saved successfully same as excel sheet","Saved customer user id details details verification", "Customer user id details shoud be saved same as excel sheet", "ustomer user id details is saved same as excel sheet", "Pass", null);
		}else{
			Report.ReporterOutput("Step","Verify customer user id details is saved successfully same as excel sheet","Saved customer user id details details verification", "Customer user id details shoud be saved same as excel sheet", "ustomer user id details is Not saved same as excel sheet", "Fail", null);
Thread.sleep(7000);
			
		//	Constant.driver.get("http://inidrrmstsrv01:8080/rms");		
		}
	}
	
}
