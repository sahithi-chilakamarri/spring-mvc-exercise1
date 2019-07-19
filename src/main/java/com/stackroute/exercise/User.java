package com.stackroute.exercise;

import org.springframework.stereotype.Component;
@Component
public class User {
    private String message;
    //Default Constructor
    public  User()
    {
    }
    //Parameterized Constructor
    public User(String message) {
        this.message = message;
    }
    //Getter and setter methods
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    //Overriding the tostring method
    @Override
    public String toString() {
        return "User{" +
                "message='" + message + '\'' +
                '}';
    }
}
