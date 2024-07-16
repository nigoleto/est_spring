package com.example.day0715;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username;
    private String name;
    private String email;
    private String phoneNumber;
    private int age;
    private boolean admin;
    private Date date;
    private boolean person;
}
