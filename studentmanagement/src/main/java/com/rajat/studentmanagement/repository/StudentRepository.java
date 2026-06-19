package com.rajat.studentmanagement.repository;

import com.rajat.studentmanagement.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {

}
