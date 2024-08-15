package com.course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.entites.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	List<Student> findByCourse (String name);
}
