package com.example.springdatajpa.dto;

import com.example.springdatajpa.entity.Student;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class StudentDTO {
    private String fistName;
    private String lastName;
    private String email;

    public StudentDTO(Student original) {
        this.fistName = original.getFirstName();
        this.lastName = original.getLastName();
        this.email = original.getEmail();
    }
}
