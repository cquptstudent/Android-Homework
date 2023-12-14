package com.example.myapplication4stableversion;

public class Message {
    private String number;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = String.valueOf(number);
    }
}
