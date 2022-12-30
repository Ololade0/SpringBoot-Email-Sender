package email.sender.emailsender.service;

import email.sender.emailsender.model.EmailDetails;

public interface EmailServices {

        String sendSimpleMail(EmailDetails details);

        String sendMailWithAttachment(EmailDetails details);
    }


