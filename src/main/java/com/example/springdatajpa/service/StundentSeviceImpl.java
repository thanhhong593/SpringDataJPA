package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.Student;
import com.example.springdatajpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StundentSeviceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {

    }

    @Override
    public List<Student> getAllStudent() {
        return null;
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        return null;
    }
}
