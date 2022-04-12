package com.example.controller;

import com.example.exception.ResourceNotFoundException;
import com.example.model.Person;
import com.example.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping
    public List<Person> getAll() {
        return personService.findAll();
    }


    @PostMapping
    public Person create(@Validated @RequestBody Person person) {
        return personService.save(person);
    }

    @GetMapping("/{id}")
    public Person get(@PathVariable(value = "id") Long personId) {
        return personService.findById(personId)
                .orElseThrow(() -> new ResourceNotFoundException("Person", "id", personId));
    }


    @PutMapping("/{id}")
    public Person update(@PathVariable(value = "id") Long personId,
                         @Validated @RequestBody Person personDetails) {

        Person person = personService.findById(personId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", personId));

        person.setName(personDetails.getName());
        person.setSurname(personDetails.getSurname());

        return personService.save(person);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long personId) {
        Person note = personService.findById(personId)
                .orElseThrow(() -> new ResourceNotFoundException("Person", "id", personId));

        personService.delete(note);

        return ResponseEntity.ok().build();
    }

}
