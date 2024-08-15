package com.course.service;

import java.util.List;

import com.course.dtos.CourseDTO;
import com.course.entites.Course;

public interface CourseService {

	Course insertCourse(CourseDTO coursedto);

	Course updateCourseById(Long id, CourseDTO coursedto);

	List<Course> SelectCourseByName(String name);
	
}
