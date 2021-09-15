package com.example.department.student.controller;


import com.example.department.student.domain.Student;
import com.example.department.student.repository.Studentrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class StudentController {


    @Autowired
    Studentrepository studentrepository;

    @GetMapping("/getallStudent")
    public List<Student> findAll(){
        return this.studentrepository.findAll();
    }
    @GetMapping("/student/{id}")
    public List<Student> findById(@PathVariable("id")int  id){
        return this.studentrepository.findById(id);
    }
}
