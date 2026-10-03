package com.example.studentapi.repository;


import com.example.studentapi.model.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<student, Long> {
}
