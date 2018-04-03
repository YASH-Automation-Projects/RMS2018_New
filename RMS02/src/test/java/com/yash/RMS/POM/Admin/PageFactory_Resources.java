package com.yash.RMS.POM.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactory_Resources {

	final WebDriver driver;


	@FindBy(xpath= ".//*[@id='adminList']/a/span")

	public WebElement lnk_admin;

//	@FindBy(id= "menuResourceList")
	
	@FindBy(xpath= ".//a[@id='menuResourceList']")

	public WebElement lnk_Resources;
	
	@FindBy(xpath= "//th[contains(.,'Yash Emp ID')]")

	public WebElement Yash_Emp_id;
	 
	@FindBy(xpath= "//th[contains(.,'Emp Name')]")

	public WebElement Emp_name;
	
	@FindBy(xpath= "//th[contains(.,'Designation')]")

	public WebElement Designation;
	
	@FindBy(xpath= "//th[contains(.,'Grade')]")

	public WebElement Grade;
	
	@FindBy(xpath= "//th[contains(.,'DOJ')]")
	
	public WebElement DOJ;

	@FindBy(xpath= "//th[contains(.,'Release Date')]")
	
	public WebElement Release_Date;

	@FindBy(xpath= "//th[contains(.,'Ownership')]")
	
	public WebElement Ownership;

	@FindBy(xpath= ".//*[@id='resourceTableId_wrapper']/div[9]/div[2]")
	
	public WebElement count;
	
    @FindBy(id= "Activerecord")
	
	public WebElement Record;
	 
  
     @FindBy(xpath= ".html/body/div[1]/header/a/span[2]/img")
    
    public static WebElement logo;
    
    @FindBy(xpath= ".//*[@id='resourceTableId_length']/label/select")
	
    public static WebElement entry;
    
    @FindBy(xpath= ".//*[@id='resourceTableId']")
    
    public static WebElement webtable;
        
    @FindBy(xpath= ".//*[@id='addNew']")
   
    //While adding Resources
    
    public static WebElement addbutton;
    
    @FindBy(xpath= ".//*[@id='yashEmpId']")
    
    public static WebElement empid;
    
   @FindBy(xpath= ".//*[@id='firstName']")
    
    public static WebElement Firstname;
    
   @FindBy(id= "middleName")
   
   public static WebElement middlename;
    
   @FindBy(id= "lastName")
   
   public static WebElement lastname;
   
   @FindBy(xpath= ".//*[@id='formTable']/tbody/tr[3]/td[2]/span/input")
   
   public static WebElement designations;
   
   @FindBy(xpath= ".//*[@id='formTable']/tbody/tr[3]/td[4]/span/input")
   
   public static WebElement grade;
   
   @FindBy(xpath= ".//*[@id='formTable']/tbody/tr[3]/td[6]/span/input")
   
   public static WebElement ParentBGBU;
 
   @FindBy(xpath= ".//*[@id='formTable']/tbody/tr[3]/td[8]/span/input")
 
   public static WebElement CurrentBGBU;
   
   @FindBy(xpath= ".//*[@id='formTable']/tbody/tr[4]/td[2]/span/input")
   
   public static WebElement Baselocation;
   
   @FindBy(xpath= ".//*[@id='formTable']/tbody/tr[4]/td[4]/span/input")
   
   public static WebElement Currentlocation;
 
   @FindBy(xpath= ".//*[@id='formTable']/tbody/tr[4]/td[6]/span/input")
     
   public static WebElement Emp_Cat;
 
   @FindBy(xpath= ".//*[@id='formTable']/tbody/tr[4]/td[8]/span/input")
   
   public static WebElement Ownership1;
   
   @FindBy(xpath= ".//*[@id='emailId']")
   
   public static WebElement emailid;
 
   @FindBy(xpath= ".//*[@id='contactNumber1']")
   
   public static WebElement Contactn1;
   
   @FindBy(xpath= ".//*[@id='contactNumber2']")
   
   public static WebElement Contactn2;
   
   @FindBy(xpath= ".//*[@id='formTable']/tbody/tr[5]/td[8]/span/input")
   
   public static WebElement Visastatus;
   
   @FindBy(xpath= ".//*[@id='visavalidDate']")
   
   public static WebElement Visavalidity;
   
   @FindBy(xpath= ".//*[@id='formTable']/tbody/tr[6]/td[4]/span/input")
   
   public static WebElement CurrentRM1;
   
   @FindBy(xpath= ".//*[@id='formTable']/tbody/tr[6]/td[6]/span/input")
   
   public static WebElement CurrentRM2;
   
   @FindBy(xpath= ".//*[@id='formTable']/tbody/tr[6]/td[8]/span/input")
   
   public static WebElement Role;
   
   @FindBy(xpath= ".//*[@id='formTable']/tbody/tr[7]/td[2]/textarea")
   
   public static WebElement Cust_UserID;
   
   @FindBy(xpath= ".//*[@id='formTable']/tbody/tr[7]/td[4]/span/input")
   
   public static WebElement Competency;
   
   @FindBy(xpath= ".//*[@id='profileCenter']")
   
   public static WebElement ProfitC;
   
  @FindBy(xpath= ".//*[@id='timesheetCommentOptional']")
   
   public static WebElement timesheetcomment;
   
   @FindBy(id= "dateOfJoining")
   
   public static WebElement DOJ1;
   
   @FindBy(id= "confirmationDate")
   
   public static WebElement ConfirmationDate;
   
   @FindBy(id= "resignationDate")
   
   public static WebElement resignationdate;
   
   @FindBy(id= "releaseDate")
   
   public static WebElement releasedate;
   
   @FindBy(id= "transferDate")
   
   public static WebElement trasferdate;
   
   @FindBy(id= "lastAppraisalId")
   
   public static WebElement Apprasaildate1;
  
   @FindBy(id= "penultimateAppraisalId")
   
   public static WebElement Apprasaildate2;
   
   @FindBy(xpath= ".//*[@id='awardRecognition']")
   
   public static WebElement Awards_recognitions;
   
   
   @FindBy(xpath= ".//*[@id='save']")
   
   public static WebElement save;
   
   @FindBy(xpath=  ".//*[@id='resourceTableId']/tbody/tr[1]/td[1]")
   
   public static WebElement sort_empid;
   
 @FindBy(xpath=  ".//*[@id='resourceTableId']/tbody/tr[1]/td[2]")
   
   public static WebElement sort_empname;
 
 @FindBy(xpath=  ".//*[@id='resourceTableId']/tbody/tr[1]/td[3]")
 
 public static WebElement sort_designation;
 
 @FindBy(xpath=  ".//*[@id='resourceTableId']/tbody/tr[1]/td[4]")
 
 public static WebElement sort_grade;
 
 @FindBy(xpath=  ".//*[@id='resourceTableId']/tbody/tr[1]/td[5]")
 
 public static WebElement sort_doj;
 
 @FindBy(xpath=  ".//*[@id='resourceTableId']/tbody/tr[1]/td[6]")
 
 public static WebElement sort_releasedate;
 
 @FindBy(xpath=  ".//*[@id='resourceTableId']/tbody/tr[1]/td[7]")
 
 public static WebElement sort_ownership;
   
   //*******************************************
   
   
  @FindBy(name= "search_empID")
   
  public static WebElement search_empid;
  
  @FindBy(name= "search_empName")
  
  public static WebElement search_empname;
  
  @FindBy(name= "search_designation")
  
  public static WebElement search_designation;

  @FindBy(name= "search_grade")
  
  public static WebElement search_Grade;
  
 @FindBy(name= "search_ownership")
  
  public static WebElement search_Ownership;
 
 @FindBy(name= "search_currentBU")
 
 public static WebElement CurrentBU;
 
 @FindBy(name= "search_parentBU")
 
 public static WebElement ParentBU;
 
 @FindBy(linkText=  "List")
 
 public static WebElement link;
 
 @FindBy(xpath = ".//*[@id='formTable']/tbody/tr[2]/td[2]/div/div/span")
 
 public static WebElement emperror;
  
 //@FindBy(xpath = ".//*[@id='resourceTableId']/tbody/tr/td[1]/a")
 @FindBy(xpath = ".//*[@id='resourceTableId']/tbody/tr[1]/td[1]/a")
 public static WebElement empidfirst;
 
   public PageFactory_Resources(WebDriver driver)
   {

	   this.driver = driver;
   } 
	

	}	



