package com.example.department.student.controller;

import com.example.department.student.domain.departmentclass;
import com.example.department.student.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {
@Autowired
    DepartmentRepository departmentRepository;
@GetMapping("/getalldepartmentclass")
    public List<departmentclass>getalldepartment(){
    List<departmentclass> li=this.departmentRepository.findAll();
    System.out.println(li);
    return li;
}
@GetMapping("/getbyid/{id}")
    public Optional<departmentclass> getbyid(@PathVariable("id") int id){
   Optional<departmentclass> li = this.departmentRepository.findById((long) id);
    System.out.println(li);
    return li;
}
@PostMapping("/createdepartmentapi")
public departmentclass createdepartmentapi(@RequestBody departmentclass departmentclass){
    System.out.println(departmentclass);
    departmentclass de=this.departmentRepository.save(departmentclass);
    return de;
}
}
