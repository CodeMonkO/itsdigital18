package main.java.finedine.util.com;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Mailer {

	public static void mailer(String mailid, String content) throws AddressException, MessagingException {

		String host = "smtp.gmail.com";// host name
		final String from = "itsdigital18@gmail.com";// sender id
		String to = mailid;// reciever id
		final String pass = "87544281448939702102";// sender's password
		String fileAttachment = "null";// file name for attachment
		// system properties

		//system properties
	    Properties prop = System.getProperties();
	    // Setup mail server properties
	    prop.put("mail.smtp.gmail", host);
	    prop.put("mail.smtp.starttls.enable", "true");
	    prop.put("mail.smtp.host", host);
	    prop.put("mail.smtp.user", from);
	    prop.put("mail.smtp.password", pass);
	    prop.put("mail.smtp.port", "587");
	    prop.put("mail.smtp.auth", "true");
	    prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	    //session 
	    Session session = Session.getInstance(prop, null);
	    // Define message
	    MimeMessage message = new MimeMessage(session);
	    message.setFrom(new InternetAddress(from));
	    message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
	    message.setSubject("Welcome Again");
	    message.setContent(content,"text/html");
	    Transport transport = session.getTransport("smtp");
	    transport.connect(host, from, pass);
	    transport.sendMessage(message, message.getAllRecipients());
	    transport.close();

	}
}