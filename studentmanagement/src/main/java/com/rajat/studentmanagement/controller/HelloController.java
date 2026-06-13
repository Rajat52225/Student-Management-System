package com.rajat.studentmanagement.controller;

import com.rajat.studentmanagement.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Rajat";
    }

    @GetMapping("/student")
    public Student getStudent() {
        return new Student(
                "Rajat",
                "rajat@gmail.com",
                20
        );
    }
}