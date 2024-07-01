package com.example.basic;

public interface EmailSender {
    void sendEmail(String to, String subject, String body);
}
