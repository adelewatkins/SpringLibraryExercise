package com.lbg.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lbg.demo.domain.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
