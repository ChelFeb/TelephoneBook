package com.app;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "persons")
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;


    String initials;
    String phoneNumber;

    public Person(String initials, String phoneNumber) {
        this.initials = initials;
        this.phoneNumber = phoneNumber;
    }

    public Person() {
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
