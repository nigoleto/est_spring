package com.example.day0709;

import org.springframework.stereotype.Component;

@Component
public class sendMessage implements Message{
    @Override
    public void print() {
        System.out.println("sendMessage");
    }
}
