package com.twitter.teruteru128.test.mail;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        String name = "";
        String content = "";
        String title = "";
        String from = "";
        boolean debug = true;

        Properties defaultProperties = new Properties();
        Properties properties = new Properties(defaultProperties);
        if (debug) {
            properties.put("mail.debug", true);
        }

        Session session = Session.getInstance(properties);
        session.setDebug(debug);
        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from, name, "UTF-8"));
            InternetAddress[] to = { new InternetAddress(
                    properties.getProperty("mail.mailto"),
                    properties.getProperty("mail.personal"), "UTF-8") };
            msg.setRecipients(Message.RecipientType.TO, to);
            msg.setSubject(title);
            msg.setSentDate(new Date());
            msg.setText(content);
            msg.setReplyTo(new InternetAddress[] { new InternetAddress(from) });
            //Transport.send(msg);
            Transport transport = session.getTransport(properties
                    .getProperty("mail.transport.protocol"));
            transport.connect(properties.getProperty("mail.smtp.host"),
                    Integer.parseInt(properties.getProperty("mail.smtp.port")),
                    properties.getProperty("mail.smtp.user"),
                    properties.getProperty("mail.smtp.password"));
            transport.sendMessage(msg, msg.getAllRecipients());
        } catch (MessagingException mex) {
            System.out.println("\n-- Exception handling in msgsendsample.java");
            mex.printStackTrace();
        }
    }

}
