package com.rajat.studentmanagement.controller;

import com.rajat.studentmanagement.model.Student;
import com.rajat.studentmanagement.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Rajat";
    }
    private final StudentService studentService;

    public HelloController(StudentService studentService){
        this.studentService=studentService;
    }

    @GetMapping("/student")
    public Student getStudent() {
       return studentService.getStudent();
    }
    @GetMapping("/Students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}