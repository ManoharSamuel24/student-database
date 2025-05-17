package com.example.studentdb.repository;

import com.example.studentdb.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
