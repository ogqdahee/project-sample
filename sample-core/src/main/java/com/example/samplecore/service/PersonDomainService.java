package com.example.samplecore.service;

import com.example.samplecore.model.Person;
import com.example.samplecore.gateway.jpa.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonDomainService {

    private final PersonRepository personRepository;

    public PersonDomainService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public String findName(String name) {
        Person person = personRepository.findByName(name);
        if (person == null) {
            throw new IllegalArgumentException("not Exist person" + name);
        }
        return person.getName();
    }
}
