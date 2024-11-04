package com.example.taskmanager.resources;

import com.example.taskmanager.model.Person;
import com.example.taskmanager.services.person.PersonService;
import com.example.taskmanager.transfert.submissions.PersonSubmission;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/person")
public class PersonResource {

    private final PersonService personService;

    public PersonResource(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public Person createPerson(@RequestBody PersonSubmission personSubmission) {
        return personService.createPerson(personSubmission);
    }

    @GetMapping("/all")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }
}
