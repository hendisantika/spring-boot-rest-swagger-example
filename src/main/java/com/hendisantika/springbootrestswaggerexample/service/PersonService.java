package com.hendisantika.springbootrestswaggerexample.service;

import com.hendisantika.springbootrestswaggerexample.domain.Person;
import com.hendisantika.springbootrestswaggerexample.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/4/17
 * Time: 11:50 AM
 * To change this template use File | Settings | File Templates.
 */

@Service
@Transactional
public class PersonService {
    @Autowired
    private PersonRepository repository;

    @Transactional(readOnly = true)
    public Page<Person> findAll(Pageable pageable) {

        return repository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public Optional<Person> findById(Long id) {

        return repository.findById(id);
    }

    public Person save(Person person) {

        return repository.saveAndFlush(person);
    }
}
