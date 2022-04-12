package com.example.service.impl;

import com.example.model.Person;
import com.example.repository.PersonRepository;
import com.example.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Optional<Person> findById(Long personId) {
        return personRepository.findById(personId);
    }

    @Override
    public void delete(Person person) {
        personRepository.delete(person);
    }
}
