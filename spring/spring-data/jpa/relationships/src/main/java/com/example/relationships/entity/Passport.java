package com.example.relationships.entity;

import jakarta.persistence.*;

@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fk_passport")
    private Long id;

    @Column(name = "passport_number")
    private String passportNumber;

    //@OneToOne(mappedBy = "passport")
    //private Person person;

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}
