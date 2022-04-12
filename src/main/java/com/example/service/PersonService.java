package com.example.service;

import com.example.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService
{
    List<Person> findAll();

    Person save(Person person);

    Optional<Person> findById(Long personId);

    void delete(Person note);
}
