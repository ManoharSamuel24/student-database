package com.example.studentdb.service;

import com.example.studentdb.model.Student;
import com.example.studentdb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        Optional<Student> optionalStudent = studentRepository.findById(id);

        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            student.setName(updatedStudent.getName());
            student.setAge(updatedStudent.getAge());
            student.setCourse(updatedStudent.getCourse());
            return studentRepository.save(student);
        } else {
            return null; // or throw a custom exception
        }
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
