package com.example.springdatajpa.controller;

import com.example.springdatajpa.entity.Student;
import com.example.springdatajpa.service.StudentService;

import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/home")
    public String home(){
        return "Hello World";
    }
    @PostMapping("/student")
    public Student add(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
        return "Successfully";
    }
    @GetMapping("/students")
    public List<Student>  getAllStudent(){
        return studentService.getAllStudent();
    }
}
