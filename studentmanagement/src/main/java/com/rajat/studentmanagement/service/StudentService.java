package com.rajat.studentmanagement.service;

import com.rajat.studentmanagement.model.Student;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    public Student getStudent() {
        return new Student(
                "Rajat",
                "rajat@gmail.com",
                20
        );
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(
                new Student(
                        "Rajat",
                        "rajat@gmail.com",
                        21
                )
        );
        students.add(
                new Student(
                        "Virat",
                        "virat@gmail.com",
                        35
                )
        );
        return students;
    }
}
