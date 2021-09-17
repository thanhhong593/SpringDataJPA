package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {
    public Optional<Student> findById(Long id);
    public Student saveStudent(Student student);
    public void deleteStudent(Long id);
    public List<Student> getAllStudent();
    public Student updateStudent(Long id, Student student);
}
