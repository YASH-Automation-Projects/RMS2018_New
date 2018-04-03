package com.yash.RMS.Setup;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import org.testng.annotations.Test;

import com.yash.RMS.CustomProperties.Constant;
import com.yash.RMS.CustomProperties.ExcelUtility;


public class ConfigureEMailReport 
{
	//public static ExcelUtility userData;
	public static ExcelUtility userData = new ExcelUtility(Constant.File_RMSConfiguration, "Index");
	public static Message message;
	
	// SMTP HOST
	public static String host = userData.getCell(16, 0);
	
	// PORT
	public static String port = userData.getCell(18, 0);
	
	//Mail Subject
	public static String mailsubject = userData.getCell(10, 6).toString();
	
	//Mail Body
	public static String mailmessage = userData.getCell(10, 7).toString();
	public static Session session;
	
	// Sender's email ID
	public static String from = userData.getCell(10, 0);
	public static String To_Address;
	public static String CC_Address;
	public static String BCC_Address;
	public static InternetAddress[] toaddressArray;
	public static List<String> toaddresses;
	public static InternetAddress[] ccaddressArray;
	public static List<String> ccaddresses;
	public static InternetAddress[] bccaddressArray;
	public static List<String> bccaddresses;
	
	@Test
	public static void EmailEnabledcheck() throws UnsupportedEncodingException, MessagingException
	{
		userData = new ExcelUtility(Constant.File_RMSConfiguration, "Index");
		Constant.EmailEnabled=userData.getCell(4, 11);
		Constant.HTML_Report=userData.getCell(5, 11);
		Constant.Excel_Report=userData.getCell(6, 11);
		if (Constant.EmailEnabled.equalsIgnoreCase("TRUE") && Constant.HTML_Report.equalsIgnoreCase("TRUE")
				&& Constant.Excel_Report.equalsIgnoreCase("FALSE"))
		{
			ConfigExcelToSendMail();
			HTMLReportAttachment();				
		}
		else if(Constant.EmailEnabled.equalsIgnoreCase("TRUE") && Constant.Excel_Report.equalsIgnoreCase("TRUE")
		&& Constant.HTML_Report.equalsIgnoreCase("FALSE"))
		{
			ConfigExcelToSendMail();
			ExcelReportAttachment();				
		}
		else if(Constant.EmailEnabled.equalsIgnoreCase("TRUE") && Constant.HTML_Report.equalsIgnoreCase("TRUE")
			&& Constant.Excel_Report.equalsIgnoreCase("TRUE")){
			
			ConfigExcelToSendMail();
			HTMLEXCELReportAttachment();	
		}
	}
	
	
	public static void ConfigExcelToSendMail()throws UnsupportedEncodingException, AddressException 
	{
		// Recipient's email IDs
		
		To_Address = userData.getCell(10, 3) + "," + userData.getCell(11, 3)
				+ "," + userData.getCell(12, 3) + "," + userData.getCell(13, 3)
				+ "," + userData.getCell(14, 3) + "," + userData.getCell(15, 3)
				+ "," + userData.getCell(16, 3) + "," + userData.getCell(17, 3)
				+ "," + userData.getCell(18, 3) + "," + userData.getCell(19, 3);


		CC_Address = userData.getCell(10, 4) + "," + userData.getCell(11, 4)
				+ "," + userData.getCell(12, 4) + "," + userData.getCell(13, 4)
				+ "," + userData.getCell(14, 4) + "," + userData.getCell(15, 4)
				+ "," + userData.getCell(16, 4) + "," + userData.getCell(17, 4)
				+ "," + userData.getCell(18, 4) + "," + userData.getCell(19, 4);
		

		BCC_Address = userData.getCell(10, 5) + "," + userData.getCell(11, 5)
				+ "," + userData.getCell(12, 5) + "," + userData.getCell(13, 5)
				+ "," + userData.getCell(14, 5) + "," + userData.getCell(15, 5)
				+ "," + userData.getCell(16, 7) + "," + userData.getCell(17, 5)
				+ "," + userData.getCell(18, 5) + "," + userData.getCell(19, 5);


		// Sender's email credential
		
		final String username = userData.getCell(12, 0);
		final String password = userData.getCell(14, 0);

		// ---------To Address check--------------//

		if (To_Address == null || To_Address.equalsIgnoreCase(""))
			return;
		toaddresses = Arrays.asList(To_Address.split(","));
		toaddressArray = new InternetAddress[toaddresses.size()];
		int i = 0;
		for (String address : toaddresses) 
		{
			toaddressArray[i] = new InternetAddress(address);
			i++;
		}

		// ---------CC Address check--------------//

		if (CC_Address == null || CC_Address.equalsIgnoreCase(""))
			return;
		ccaddresses = Arrays.asList(CC_Address.split(","));
		ccaddressArray = new InternetAddress[ccaddresses.size()];
		int j = 0;
		for (String address : ccaddresses) 
		{
			ccaddressArray[j] = new InternetAddress(address);
			j++;
		}

		// ---------BCC Address check--------------//

		if (BCC_Address == null || BCC_Address.equalsIgnoreCase(""))
			return;
		bccaddresses = Arrays.asList(BCC_Address.split(","));
		bccaddressArray = new InternetAddress[bccaddresses.size()];
		int k = 0;
		for (String address : bccaddresses) 
		{
			bccaddressArray[k] = new InternetAddress(address);
			k++;
		}

		Properties props = new Properties();
		props.put("mail.smtp.auth", "false");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", port);

		// Get the Session object.
		session = Session.getInstance(props, new javax.mail.Authenticator()
		{
			protected PasswordAuthentication getPasswordAuthentication() 
			{
				return new PasswordAuthentication(username, password);
			}
		}
		);
	}

	public static void HTMLReportAttachment() throws MessagingException 
	{
		try 
		{
			// Create a default MimeMessage object.
			message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			message.setRecipients(Message.RecipientType.TO, toaddressArray);
			message.setRecipients(Message.RecipientType.CC, ccaddressArray);
			message.setRecipients(Message.RecipientType.BCC, bccaddressArray);

			// Set Subject: header field
			message.setSubject(mailsubject);
		} 
		catch (MessagingException e) 
		{
			throw new RuntimeException(e);
		}

		// String mailmessage=userData.getCell(10, 9).toString();
		// -------------Set Mail Message------------------//

		// write html string as
		// parameter for mail
		// body
		// message.setContent(mailmessage, "text/html");

		// ---------------Attachments----------------------//
		MimeBodyPart messageBodyPart = new MimeBodyPart();
		Multipart multipart = new MimeMultipart();
		messageBodyPart.setText(mailmessage);
		multipart.addBodyPart(messageBodyPart);
		messageBodyPart = new MimeBodyPart();
		String filename = "Barter Suite Execution Report.html";
		String FilePath = Constant.File_emailReportattchment_HTML;
		DataSource source = new FileDataSource(FilePath);
		messageBodyPart.setDataHandler(new DataHandler(source));
		messageBodyPart.setFileName(filename);
		multipart.addBodyPart(messageBodyPart);
		message.setContent(multipart);
		Transport.send(message);
		// Send message

		System.out.println("Mail sent successfully....");

	}

	public static void ExcelReportAttachment() throws MessagingException 
	{
		try 
		{
			// Create a default MimeMessage object.
			message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			message.setRecipients(Message.RecipientType.TO, toaddressArray);
			message.setRecipients(Message.RecipientType.CC, ccaddressArray);
			message.setRecipients(Message.RecipientType.BCC, bccaddressArray);

			// Set Subject: header field
			message.setSubject(mailsubject);
		} 
		catch (MessagingException e) 
		{
			throw new RuntimeException(e);
		}

		// String mailmessage=userData.getCell(10, 9).toString();
		// -------------Set Mail Message------------------//

		// write html string as
		// parameter for mail
		// body
		// message.setContent(mailmessage, "text/html");

		// ---------------Attachments----------------------//
		MimeBodyPart messageBodyPart = new MimeBodyPart();
		Multipart multipart = new MimeMultipart();
		messageBodyPart.setText(mailmessage);
		multipart.addBodyPart(messageBodyPart);
		messageBodyPart = new MimeBodyPart();
		String filename = Constant.File_emailReportattchment_EXCEl;
		DataSource source = new FileDataSource(filename);
		messageBodyPart.setDataHandler(new DataHandler(source));
		messageBodyPart.setFileName(filename);
		multipart.addBodyPart(messageBodyPart);
		message.setContent(multipart);
		Transport.send(message);
		// Send message

		System.out.println("Mail sent successfully....");

	}
	
	public static void HTMLEXCELReportAttachment()
	{
		try 
		{		
			// Create a default MimeMessage object.
			Message message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from)); 
			message.setRecipients(Message.RecipientType.TO, toaddressArray);
			message.setRecipients(Message.RecipientType.CC, ccaddressArray);
			message.setRecipients(Message.RecipientType.BCC, bccaddressArray);

			// Set Subject: header field
			message.setSubject(mailsubject);

			
			// -------------Set Mail Message------------------//
			
			// write html string as parameter for mail body
			
			String[] attachFiles = new String[2];
			attachFiles[0]=(Constant.File_emailReportattchment_HTML);
			attachFiles[1]=(Constant.File_emailReportattchment_EXCEl);
			
			//---------------Attachments----------------------//
			
			 // creates multi-part
			MimeBodyPart messageBodyPart = new MimeBodyPart();
			Multipart multipart = new MimeMultipart();            
	     	messageBodyPart.setText(mailmessage);
	     	multipart.addBodyPart(messageBodyPart);
	        messageBodyPart = new MimeBodyPart();
	 
	        // adds attachments
	        if (attachFiles != null && attachFiles.length > 0) 
	        {
	            for (String filePath : attachFiles) 
	            {
	                MimeBodyPart attachPart = new MimeBodyPart();
	                try 
	                {
	                    attachPart.attachFile(filePath);
	                } 
	                catch (IOException ex) 
	                {
	                    ex.printStackTrace();
	                }
	                multipart.addBodyPart(attachPart);
	            }
	        }
	        message.setContent(multipart);
	        Transport.send(message);            
	        
	        // Send message
			System.out.println("Mail sent successfully....");

		} 
		catch (MessagingException e) 
		{
			throw new RuntimeException(e);
		}
	}
}
