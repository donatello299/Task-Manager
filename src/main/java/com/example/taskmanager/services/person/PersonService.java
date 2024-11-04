package com.example.taskmanager.services.person;

import com.example.taskmanager.model.Person;
import com.example.taskmanager.transfert.submissions.CreatePersonSubmission;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepository;


    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person createPerson(CreatePersonSubmission createPersonSubmission) {
        return personRepository.save(new Person(createPersonSubmission.name(), createPersonSubmission.email()));
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public void deletePerson(Long id){
        // supprimer en fonction de l'ID
    }

    public Person getPersonById(Long id){
        // recuperer une personne en fonction d'un id
        return null;
    }
}
