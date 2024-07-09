package com.example.old;

public interface EmailSender {
    void sendEmail(String to, String subject, String body);
}