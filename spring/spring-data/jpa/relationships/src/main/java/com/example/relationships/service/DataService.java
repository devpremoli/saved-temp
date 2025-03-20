package com.example.relationships.service;

import com.example.relationships.entity.Passport;
import com.example.relationships.entity.Person;
import com.example.relationships.repository.PersonRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {

    @Autowired
    private PersonRepository personRepository;

    @PostConstruct
    public void init() {
        // One-to-One relationship (Person and Passport)
        Passport passport = new Passport();
        passport.setPassportNumber("X123456");

        //Passport passportA = new Passport();
        //passportA.setPassportNumber("Y123456");

        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setPassport(passport);

        personRepository.save(person);

    }
}
