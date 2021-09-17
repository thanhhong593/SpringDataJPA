package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.Student;
import com.example.springdatajpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StundentSeviceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
        System.out.println("delete successfully");
    }

    @Override
    public List<Student> getAllStudent() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        return null;
    }
}
