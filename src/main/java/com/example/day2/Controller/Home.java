package com.example.day2.Controller;

import com.example.day2.Model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Home {

    @GetMapping("/")
    public StudentModel getStudent(){
     StudentModel student= new StudentModel(1,"ir","ishi");
        student.setId(12);
        student.setName("IR");
        student.setEmail("ishirathore030@gmail.com");
        return student;


    }

}
