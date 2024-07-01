package com.example.basic;

public class SmtpEmailSender implements EmailSender {

    @Override
    public void sendEmail(String to, String subject, String body) {
        //SMTP 기술을 이용한 메세지 전송 로직 구현
        System.out.println("Sending SMTP email to " + to);
    }
}
