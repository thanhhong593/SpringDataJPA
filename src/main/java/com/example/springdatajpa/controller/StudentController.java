package com.example.springdatajpa.controller;

import com.example.springdatajpa.dto.StudentDTO;
import com.example.springdatajpa.entity.Student;
import com.example.springdatajpa.service.StudentService;

import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    @PutMapping("/student/{id}")
    public Student updateStudent(@PathVariable("id") Long id, @RequestBody Student student){
//        Student student1 = studentService.findById(id).get();
//        if(student1 != null){
//            return studentService.saveStudent(student);
//        }else{
//            System.out.println("Student no data");
//            return new Student();
//        }

        return studentService.updateStudent((long)id,student);
    }
    @GetMapping("/students/listDTO")
    public List<StudentDTO> getListDTO(){
        List<Student> list= studentService.getAllStudent();
        List<StudentDTO> listDTO = new ArrayList<>();
        for (Student student: list) {
            listDTO.add(new StudentDTO(student));
        }
        return listDTO;
    }
}
