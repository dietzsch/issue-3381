package com.example.demo.repository;

import com.example.demo.entity.Person;
import org.springframework.data.repository.CrudRepository;

interface PersonRepository
    extends CrudRepository<Person, Long> {}
