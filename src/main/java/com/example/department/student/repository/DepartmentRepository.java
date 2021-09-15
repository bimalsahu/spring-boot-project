package com.example.department.student.repository;

import com.example.department.student.domain.departmentclass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<departmentclass, Long> {



}