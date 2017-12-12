package com.hotmart.dao;

import com.hotmart.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDAO extends JpaRepository<Person,Long> {}
