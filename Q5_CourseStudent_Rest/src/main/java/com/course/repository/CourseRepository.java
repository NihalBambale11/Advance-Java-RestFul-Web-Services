package com.course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.entites.Course;

public interface CourseRepository extends JpaRepository<Course, Long>  {
	
	List<Course> findByName(String name);
}
