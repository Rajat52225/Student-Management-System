package com.rajat.studentmanagement.controller;

import com.rajat.studentmanagement.model.Student;
import com.rajat.studentmanagement.service.StudentService;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @DeleteMapping("/students/{email}")
    public void deleteStudent(@PathVariable String email){
        studentService.deleteStudent(email);
    }
    @PutMapping("/students/{email}")
    public void updateStudent(
            @PathVariable String email,
            @RequestBody Student updateStudent){
        studentService.updateStudent(email,updateStudent);
    }
}