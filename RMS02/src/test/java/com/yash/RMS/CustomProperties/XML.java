/*
 * @Author:
 * @Summary:
 * @param name:
 * @returns:
 * 
package com.yash.bartersuite.CustomProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.TestNG;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

 *//**
 * @author kapil.mandloi
 *
 *//*
public class XML 
{
	public static String[][] innerarray = null;
	public String errortype;
	static int nodeflag = 0;
	static Document doc;
	static Element testName = null;
	static int excelchk;
	static Element Class = null;
	static int mathodflag = 0;
	static Element method = null;
	static int testflag =1;
	public static int MultipleClassName = 0;
	static String classname = "";
	static int methodflag = 0;
	static String Includemethod = "";
	static int duplicate2ndnode = 0 ;
	static int MethodChk=0;
	//static String BrowserValue; 

	@SuppressWarnings({ "resource", "unused" })
	public static void ExcelRead() throws IOException, ParserConfigurationException
	{
		XSSFWorkbook ObjWorkBook;
		XSSFSheet sheet = null;
		XSSFRow innerRowCount;
		String activesheet = null;
		int IndexSheetLoop;

		FileInputStream ObjExcelApp = new FileInputStream(Constant.File_BarterConfiguration);
		ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Index");


		for (IndexSheetLoop = 23; IndexSheetLoop <= ObjWorkSheet.getLastRowNum(); IndexSheetLoop++)
			{
				XSSFRow Row = ObjWorkSheet.getRow(IndexSheetLoop);

				String SheetName = Row.getCell(1).toString();
				String MethodName = Row.getCell(2).toString();
				String chk = Row.getCell(3).toString();

				if(Row.getCell(3).toString().equalsIgnoreCase("Yes")) 
				{	
					if (Row.getCell(1).toString().isEmpty())
					{
					}
					else 
					{
					sheet = ObjWorkBook.getSheet(SheetName);
					activesheet = sheet.getSheetName().toString();
					System.out.println(activesheet.toString());
					innerarray = new String[sheet.getLastRowNum()+1][sheet.getRow(0).getLastCellNum()];

					for (int i = 1; i <= sheet.getLastRowNum(); i++) 
					{
						innerRowCount = sheet.getRow(i);
						XSSFCell innerCell = null;

						for (int j = 1; j < sheet.getRow(0).getLastCellNum(); j++) 
						{ 
							innerCell = innerRowCount.getCell(j, org.apache.poi.ss.usermodel.Row.CREATE_NULL_AS_BLANK);
							innerCell.setCellType(Cell.CELL_TYPE_STRING);
							String value = innerCell.toString();
							innerarray[i][j] = value;									
						}
						nodeflag++;
						String DuplicateNode = innerarray[i][1] + innerarray[i][2];

						if (innerarray[i][1].length()!=0)
						{
							if (nodeflag==1)
							{
								if(MethodName.isEmpty())
								{
									CreateAXmlFile("Barter Test Suit");
									nodecreate(innerarray[i][1], innerarray[i][2]);
								}
								else
								{
									CreateAXmlFile(activesheet);
									nodecreate(innerarray[i][1], innerarray[i][2]);
									MethodOnly();
									Include(Row.getCell(2).toString());
									MethodChk =1;
								}
							}
							else
							{
								if(Row.getCell(2).toString().length()!= 0 && testflag==1)
								{
									if(classname.equalsIgnoreCase(DuplicateNode) && methodflag==0)
									{
										if (MethodChk==1)
										{
											Include(Row.getCell(2).toString());
											methodflag++;
											Includemethod = classname;
										}
										else 
										{
											MethodOnly();
											Include(Row.getCell(2).toString());
											methodflag++;
											Includemethod = classname;
										}
									}
									else 
									{
										if(Includemethod.equalsIgnoreCase(classname))
										{
											if (classname.equalsIgnoreCase(DuplicateNode) && methodflag!=0)
											{
												Include(Row.getCell(2).toString());
											}
											else
											{
												nodecreate(innerarray[i][1], innerarray[i][2]);
												//MethodOnly();
												//Include(Row.getCell(2).toString());
											}
										}
										else
										{
											if(classname.equalsIgnoreCase(DuplicateNode) && methodflag!=0)
											{
												if (duplicate2ndnode == 0)
												{
													duplicate2ndnode++;
													MethodOnly();
													Include(innerarray[i][3]);

												}
												else
												{
													Include(Row.getCell(2).toString());
												}
											}
											else
											{
												nodecreate(innerarray[i][1], innerarray[i][2]);
												MethodOnly();
												Include(Row.getCell(2).toString());
												testflag++;
											}
										}
									}

								}
								else if(Row.getCell(2).toString().length()!= 0)
								{
									if (Row.getCell(2).toString().length()!= 0 && classname.equalsIgnoreCase(DuplicateNode))
									{
										Include(Row.getCell(2).toString());
									}
									else
									{
										nodecreate(innerarray[i][1], innerarray[i][2]);
										MethodOnly();
										Include(Row.getCell(2).toString());
									}
								}
								else
								{
									nodecreate(innerarray[i][1], innerarray[i][2]);
									MethodOnly();
								}	
							}														
						}

					}
				}
			}
		}
		XmlSave(Constant.XmlFileName);
		ObjWorkBook = null;
		ObjExcelApp.close();	
}

	public static void IncludeSelectedMethods(String ClassName, String MethodName) throws ParserConfigurationException
	{
		CreateAXmlFile(ClassName);

	}


	public static void CreateAXmlFile(String SheetName) throws ParserConfigurationException
    {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		// root elements for Test Case
		doc = docBuilder.newDocument();

		//Suite Section Creation
		Element Suite = doc.createElement("suite");
		doc.appendChild(Suite);
		Attr SuiteName = doc.createAttribute("name");
		SuiteName.setValue("End_To_End_Suite");
		Suite.setAttributeNode(SuiteName);

		//Test Section Creation
		Element Test = doc.createElement("test");
		Suite.appendChild(Test);
		Attr attr = doc.createAttribute("name");
		attr.setValue(SheetName);
		Test.setAttributeNode(attr);

		// Test Classes section
		testName = doc.createElement("classes");
		Test.appendChild(testName); 
   }

	public static void nodecreate(String PackageName, String JSPName)
	{
		classname = PackageName+JSPName;
		System.out.println(classname);

        // Test Case class
        Class = doc.createElement("class");
        testName.appendChild(Class);
        Attr attr2 = doc.createAttribute("name");
        attr2.setValue(classname);
        Class.setAttribute("name", classname);
	}
	public static void MethodOnly()
	{
		method = doc.createElement("methods");
		Class.appendChild(method);
	}

	public static void MethodInclude(String MethodName)
	{
		System.out.println(MethodName);

		Element include = doc.createElement("include");
        method.appendChild(include);
        include.setAttribute("name",MethodName);
	}

	public static void Include(String MethodName)
	{
		Element include = doc.createElement("include");
        method.appendChild(include);
        include.setAttribute("name",MethodName);
	}

	public static void XmlSave(String FileName)
	{
		try
		{
        	// write the content into xml file
	        TransformerFactory transformerFactory = TransformerFactory.newInstance();
	        Transformer transformer = transformerFactory.newTransformer();

	        //enable indent on the xml file
	        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
	        DOMSource source = new DOMSource(doc);
	        StreamResult result = new StreamResult(new File(System.getProperty("user.dir")+File.separator+FileName));
	        transformer.transform(source, result);	
	        System.out.println("File saved!");
		}
        catch (TransformerException tfe) 
        {
           	tfe.printStackTrace();
        }
	}

	public static void XMLRead(String XMLName)
	{
		// Create object of TestNG Class
		TestNG runner=new TestNG();

		// Create a list of String 
		List<String> suitefiles=new ArrayList<String>();

		// Add xml file which you have to execute
		suitefiles.add(System.getProperty("user.dir")+File.separator+XMLName);

		// now set xml file for execution
		runner.setTestSuites(suitefiles);

		// finally execute the runner using run method
		runner.run();
	}

}	
  */

package com.yash.RMS.CustomProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.TestNG;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XML 
{
	public static List<String> innerSheetLoop = new ArrayList<String>();
	static Document doc;
	static Element testName = null;
	static Element Class = null;
	static Element method = null;
	static String classname = "";
	static int MethodChk=0;
	static String lastClassName = "Barter";
	static String currentClassName = null;
	public static int CreateXMLChk=0;


	@SuppressWarnings("resource")
	public static void ExcelRead() throws IOException, ParserConfigurationException
	{
		XSSFWorkbook ObjWorkBook;
		XSSFSheet sheet = null;
		String activesheet = null;
		int IndexSheetLoop;

		FileInputStream ObjExcelApp = new FileInputStream(Constant.File_RMSConfiguration);
		ObjWorkBook = new XSSFWorkbook(ObjExcelApp);
		XSSFSheet ObjWorkSheet = ObjWorkBook.getSheet("Index");


		for (IndexSheetLoop = 23; IndexSheetLoop <= ObjWorkSheet.getLastRowNum(); IndexSheetLoop++)
		{
			XSSFRow Row = ObjWorkSheet.getRow(IndexSheetLoop);
			String SheetName = Row.getCell(1).toString();
			String MethodName = Row.getCell(2).toString();

			if(Row.getCell(3).toString().equalsIgnoreCase("Yes")) 
			{
				currentClassName = Row.getCell(1).toString();
				if(lastClassName.equalsIgnoreCase(currentClassName))
				{
					Include(Row.getCell(2).toString());
				}
				else
				{
					sheet = ObjWorkBook.getSheet(SheetName);
					activesheet = sheet.getSheetName().toString();
					System.out.println(activesheet.toString());
					for (int i = 1; i <= 1; i++) 
					{
						for (int j = 1; j < sheet.getRow(0).getLastCellNum(); j++) 
						{ 
							Cell ResultCellValue = sheet.getRow(i).getCell(j);
							String CellValue = ResultCellValue.toString();
							innerSheetLoop.add(CellValue);
						}
						if (innerSheetLoop.get(0).length()!=0)
						{
							if(CreateXMLChk==0)
							{
								CreateAXmlFile("Barter Sanity Suit");
								nodecreate(innerSheetLoop.get(0), innerSheetLoop.get(1));
								MethodOnly();
								Include(MethodName);
								MethodChk =1;
								CreateXMLChk=1;
								lastClassName=currentClassName;
							}
							else
							{
								nodecreate(innerSheetLoop.get(0), innerSheetLoop.get(1));
								MethodOnly();
								Include(MethodName);
								lastClassName=currentClassName;
							}
						}
					}
				}
			}
			innerSheetLoop.clear();
		}
		XmlSave(Constant.XmlFileName);
		ObjWorkBook = null;
		ObjExcelApp.close();
	}													

	public static void IncludeSelectedMethods(String ClassName, String MethodName) throws ParserConfigurationException
	{
		CreateAXmlFile(ClassName);

	}


	public static void CreateAXmlFile(String SheetName) throws ParserConfigurationException
	{
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		// root elements for Test Case
		doc = docBuilder.newDocument();

		//Suite Section Creation

		Element Suite = doc.createElement("suite");
		doc.appendChild(Suite);
		Attr SuiteName = doc.createAttribute("name");
		SuiteName.setValue("End_To_End_Suite");
		Suite.setAttributeNode(SuiteName);
		//Test Section Creation
		Element Test = doc.createElement("test");
		Suite.appendChild(Test);
		Attr attr = doc.createAttribute("name");
		attr.setValue(SheetName);
		Test.setAttributeNode(attr);

		// Test Classes section
		testName = doc.createElement("classes");
		Test.appendChild(testName); 
	}

	public static void nodecreate(String PackageName, String JSPName)
	{
		classname = PackageName+JSPName;
		System.out.println(classname);

		// Test Case class
		Class = doc.createElement("class");
		testName.appendChild(Class);
		Attr attr2 = doc.createAttribute("name");
		attr2.setValue(classname);
		Class.setAttribute("name", classname);
	}

	public static void MethodOnly()
	{
		method = doc.createElement("methods");
		Class.appendChild(method);
	}

	public static void MethodInclude(String MethodName)
	{
		System.out.println(MethodName);

		Element include = doc.createElement("include");
		method.appendChild(include);
		include.setAttribute("name",MethodName);
	}

	public static void Include(String MethodName)
	{
		Element include = doc.createElement("include");
		method.appendChild(include);
		include.setAttribute("name",MethodName);
	}

	public static void XmlSave(String FileName)
	{
		try
		{
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();

			//enable indent on the xml file
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(System.getProperty("user.dir")+File.separator+FileName));
			transformer.transform(source, result);	
			System.out.println("File saved!");
		}
		catch (TransformerException tfe) 
		{
			tfe.printStackTrace();
		}
	}

	public static void XMLRead(String XMLName)
	{
		// Create object of TestNG Class
		TestNG runner=new TestNG();

		// Create a list of String 
		List<String> suitefiles=new ArrayList<String>();

		// Add xml file which you have to execute
		suitefiles.add(System.getProperty("user.dir")+File.separator+XMLName);

		// now set xml file for execution
		runner.setTestSuites(suitefiles);

		// finally execute the runner using run method
		runner.run();
	}

}	
