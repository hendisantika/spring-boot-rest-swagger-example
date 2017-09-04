package com.hendisantika.springbootrestswaggerexample.repository;

import com.hendisantika.springbootrestswaggerexample.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/4/17
 * Time: 11:49 AM
 * To change this template use File | Settings | File Templates.
 */
public interface PersonRepository extends JpaRepository<Person, Long>{
}
