package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public Student saveStudent(Student student);
    public void deleteStudent(Long id);
    public List<Student> getAllStudent();
    public Student updateStudent(Long id, Student student);
}
