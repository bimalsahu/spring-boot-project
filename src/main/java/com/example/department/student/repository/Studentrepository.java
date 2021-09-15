package com.example.department.student.repository;

import com.example.department.student.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Studentrepository extends JpaRepository<Student, Integer> {
    List<Student> findById(int studentid);
}