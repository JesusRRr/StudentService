package com.rolon.student.controller;

import com.rolon.student.enums.Gender;
import com.rolon.student.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getStudents(){
        return Arrays.asList(
                new Student(1L,"Jesus", "jesus@udg", Gender.MALE)
        );

    }
}
