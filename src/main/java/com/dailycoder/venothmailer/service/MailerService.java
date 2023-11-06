package com.dailycoder.venothmailer.service;


import com.dailycoder.venothmailer.model.Message;
import com.dailycoder.venothmailer.model.Status;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class MailerService {

    @Value("${sender.address}")
    private String sender;

    @Value("${sender.host}")
    private String host;



    public Status email(Message message) {

        Status status = null;
        String recipient = message.getRecipient();
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        Session session = Session.getDefaultInstance(properties);

        try {
            // MimeMessage object.
            MimeMessage message_ = new MimeMessage(session);
            message_.setFrom(new InternetAddress(sender));
            message_.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(recipient));
            message_.setSubject("This is Subject");
            message_.setText("This is a test mail");
            Transport.send(message_);
            status = Status.SENT;

        } catch (MessagingException mex) {
            mex.printStackTrace();
            status = Status.FAILED;
        } catch (Exception e) {
            e.printStackTrace();
            status = Status.FAILED;
        }
        return status;
    }
}
