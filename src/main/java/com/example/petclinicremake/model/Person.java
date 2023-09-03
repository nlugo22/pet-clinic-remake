package com.example.petclinictest.model;

import lombok.Getter;

public class Person {

    @Getter
    private String firstName;
    private String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
