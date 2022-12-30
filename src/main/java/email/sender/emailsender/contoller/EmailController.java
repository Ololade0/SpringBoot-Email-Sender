package email.sender.emailsender.contoller;

import email.sender.emailsender.model.EmailDetails;
import email.sender.emailsender.service.EmailServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/email")
@RequiredArgsConstructor
public class EmailController {

    @Autowired
    private EmailServices emailServices;

    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(@RequestBody EmailDetails details){
        String status = emailServices.sendMailWithAttachment(details);
        return status;
    }

    @PostMapping("/sendMail")
    public String sendMail(@RequestBody EmailDetails details){
        String status = emailServices.sendSimpleMail(details);
        return status;
    }


}

