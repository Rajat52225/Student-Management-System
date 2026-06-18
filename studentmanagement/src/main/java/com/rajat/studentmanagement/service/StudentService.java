package com.rajat.studentmanagement.service;

import com.rajat.studentmanagement.model.Student;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students= new ArrayList<>();

    public StudentService(){
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
    }

    public Student getStudent() {
        return new Student(
                "Rajat",
                "rajat@gmail.com",
                20
        );
    }
    public List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void deleteStudent(String email){
        for(int i=0;i<students.size();i++){
            if(students.get(i).getEmail().equals(email)){
                 students.remove(i);
                 break;
            }
        }
    }
    public void updateStudent(String email,Student updateStudent){
        for(int i=0;i<students.size();i++){
            if(students.get(i).getEmail().equals(email)){
                students.get(i).setName(updateStudent.getName());
                students.get(i).setEmail(updateStudent.getEmail());
                students.get(i).setAge(updateStudent.getAge());
                break;
            }
        }
    }
}
