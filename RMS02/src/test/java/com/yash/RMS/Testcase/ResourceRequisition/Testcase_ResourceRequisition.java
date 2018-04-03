package com.yash.RMS.Testcase.ResourceRequisition;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.Report;
import com.yash.RMS.TestAction.ResourceRequisition.Action_ResourceRequisition;

public class Testcase_ResourceRequisition {
public static ArrayList<String> ResourceRequisition = new ArrayList<String>();

	@Test(priority=1)
	public static void Resource_Requisition () throws Throwable
	{
		try 
		{
			Report.TableEnd(); 
			Report.Report_section_Name("Verify Resource Requisition page is open.");
			Report.ReporterOutputHeader();
			
            FileInputStream ObjExcelApp = new FileInputStream(Constant.RMS_TEST_DATA);
			@SuppressWarnings("resource")
			XSSFWorkbook ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
            XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("ResourceRequisition");
           for (int sheetrow=2; sheetrow<=2; sheetrow++) 
            {
             
        	   
                  for (int sheetcol=1; sheetcol<=18; sheetcol++) 
                  {
                	 
                  
                        XSSFCell ResultCellValue = ObjWorkSheet.getRow(sheetrow).getCell(sheetcol);
                        String CellValue = ResultCellValue.toString().trim();
                        System.out.println(CellValue);
                       ResourceRequisition.add(CellValue);
                        /*try
                        {
                        	
                        if(CellValue==null)
                        {
                        	
                        	throw new Exception("Stop the execution  statements");
                        }
                        else
                        {
                        	  ResourceRequisition.add(CellValue);
                        }
                        }
                        	catch (Exception e)
                    		{
                        		
                        		
                    			 System.out.println("Nullpointer Exception ");
                    			 Constant.driver.findElement(By.xpath("	.//*[@id='addSecondarySkill']/div/div/div[1]/button")).click();
                    			
                    		}*/
                            
                      
                      //  Constant.driver.findElement(By.xpath("	.//*[@id='addSecondarySkill']/div/div/div[1]/button")).click();
                       
                        	 
                        }
                        }
                       
           try{
               Integer ResourceRequisition[] = new Integer[19];
               ResourceRequisition[20] = 20; // accessing 19th element in an array of
                         // size 18
           }
           catch(Exception e)
   		{
   			System.out.println("Array Index is Out Of Bounds.."+e.getLocalizedMessage());
   		}
           /*catch(ArrayIndexOutOfBoundsException e){
               System.out.println ("Array Index is Out Of Bounds");
           }
                
             */           
                     
                  
            
           
		
                
   	                  
                  
                   Action_ResourceRequisition.ResourceRequisition1(ResourceRequisition.get(0), ResourceRequisition.get(1), ResourceRequisition.get(2), ResourceRequisition.get(3), ResourceRequisition.get(4), ResourceRequisition.get(5),ResourceRequisition.get(6), ResourceRequisition.get(7),ResourceRequisition.get(8),ResourceRequisition.get(9),ResourceRequisition.get(10),ResourceRequisition.get(11),ResourceRequisition.get(2),ResourceRequisition.get(13),ResourceRequisition.get(14),ResourceRequisition.get(15),ResourceRequisition.get(16),ResourceRequisition.get(17));
                  //Action_ResourceRequisition.ResourceRequisition1(projectname, Skills, NoResources, Designation, Experince, AllocationType, Type, This_Frame, PrimarySkills, DesirableSkills, PlannedRolesandResponsibilities, CareerGrowthPlan, Targetcompanies, Keyscanners, Additionalcomments, SentRequestTo, NotifyTo, Comments, string);(ResourceRequisition.get(0), ResourceRequisition.get(1), ResourceRequisition.get(2), ResourceRequisition.get(3), ResourceRequisition.get(4), ResourceRequisition.get(5),ResourceRequisition.get(6), ResourceRequisition.get(7),ResourceRequisition.get(8),ResourceRequisition.get(9),ResourceRequisition.get(10),ResourceRequisition.get(11),ResourceRequisition.get(12),ResourceRequisition.get(13),ResourceRequisition.get(14),ResourceRequisition.get(15),ResourceRequisition.get(16),ResourceRequisition.get(17),ResourceRequisition.get(18));
          		
                        
	
            
            ObjWorkBook = null;
            ObjExcelApp.close();
            Report.TableEnd();
			System.out.println("Resource Requisition page is open scenario completed.");
		
	
                  
		}

	catch(

	Exception e)
	{
			e.printStackTrace();
		}

}}
