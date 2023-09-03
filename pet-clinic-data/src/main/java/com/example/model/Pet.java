package com.example.model;

import lombok.Getter;

import java.time.LocalDate;
public class Pet {

    @Getter
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public void setPetType(PetType petType) {
        this.petType = petType;
    }
}
