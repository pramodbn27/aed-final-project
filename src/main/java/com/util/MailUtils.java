/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;


import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class MailUtils {
	private static Session session = null;
	final static String fromEmail = "ajitpatil4292@gmail.com"; //gmail id
	final static String password = "ablwsvvtswowyukq"; // app password
        //final static String fromEmail = "mentcare@yahoo.com"; //gmail id
	//final static String password = "Aedproject@1234"; // app password
//	final static String toEmail = "apachiheart@gmail.com"; // can be any email id 
	
	public static void connect() {	
		System.out.println("TLSEmail Start");
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
		props.put("mail.smtp.port", "587"); //TLS Port
		props.put("mail.smtp.ssl.protocols", "TLSv1.2");
		props.put("mail.smtp.auth", "true"); //enable authentication
		props.put("mail.smtp.starttls.enable", "true");
	//	props.put("mail.debug", "true");
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	            //create Authenticator object to pass in Session.getInstance argument
		Authenticator auth = new Authenticator() {
			//override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		};
		session = Session.getInstance(props, auth);	
//		MailUtils.sendEmail(toEmail,"TLSEmail Testing Subject", "TLSEmail Testing Body");
		
	}
	
	public static void sendEmail(String toEmail, String subject, String body){
		try
	    {
			System.out.println("sending mail....");
			if(session == null ) {
				connect();
			}
	      MimeMessage msg = new MimeMessage(session);
	      //set message headers
	      msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
	      msg.addHeader("format", "flowed");
	      msg.addHeader("Content-Transfer-Encoding", "8bit");

	      msg.setFrom(new InternetAddress("ajitpatil4292@gmail.com", "MentCareSystem"));

	      msg.setReplyTo(InternetAddress.parse("ajitpatil4292@gmail.com", false));
              
               //msg.setFrom(new InternetAddress("mentcare@yahoo.com", "mentcare"));

	     // msg.setReplyTo(InternetAddress.parse("mentcare@yahoo.com", false));

	      msg.setSubject(subject, "UTF-8");

	      msg.setText(body, "UTF-8");

	      msg.setSentDate(new Date());

	      msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
	      System.out.println("Message is ready");
    	  Transport.send(msg);  

	      System.out.println("EMail Sent Successfully!!");
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	}
}