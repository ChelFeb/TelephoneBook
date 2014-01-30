package com.app;

public class Person {

    String initials;
    int phoneNumber;

    public Person(String initials, int phoneNumber) {
        this.initials = initials;
        this.phoneNumber = phoneNumber;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
