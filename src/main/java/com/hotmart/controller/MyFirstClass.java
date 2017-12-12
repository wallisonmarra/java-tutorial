package com.hotmart.controller;

import com.hotmart.dao.PersonDAO;
import com.hotmart.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyFirstClass {

    @Autowired
    private PersonDAO personDAO;

    @GetMapping(value = "/person")
    public ResponseEntity test(){
        return ResponseEntity.ok(personDAO.findAll());
    }

    @PostMapping(value = "/person")
    public ResponseEntity savePerson(){
        Person p = new Person();
        p.name = "Marra";
        personDAO.save(p);
        return ResponseEntity.ok().build();
    }
}