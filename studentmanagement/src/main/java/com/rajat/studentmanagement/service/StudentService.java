package com.rajat.studentmanagement.service;

import com.rajat.studentmanagement.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.rajat.studentmanagement.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudent() {
        return new Student(
                "Rajat",
                "rajat@gmail.com",
                20
        );
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();

    }

    public void addStudent(Student student) {
        studentRepository.save(student);

    }

    public void deleteStudent(String email) {
       studentRepository.deleteById(email);
    }

    public void updateStudent(String email, Student updateStudent) {
        var studentOptional = studentRepository.findById(email);
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            student.setName(updateStudent.getName());
            student.setAge(updateStudent.getAge());
            studentRepository.save(student);
        }
    }
}
