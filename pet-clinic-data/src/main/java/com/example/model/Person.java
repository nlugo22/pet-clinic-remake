package com.example.model;

import lombok.Getter;

public class Person extends BaseEntity{

    @Getter
    private String firstName;
    private String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
