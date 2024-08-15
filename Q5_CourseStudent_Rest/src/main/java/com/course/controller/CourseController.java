package com.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.course.dtos.CourseDTO;
import com.course.service.CourseService;

@RestController

public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	
	@PostMapping("/course")
	public ResponseEntity<?> addCourse(@RequestBody CourseDTO coursedto){
		return ResponseEntity.status(HttpStatus.CREATED).body(courseService.insertCourse(coursedto));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateCourse(@RequestParam Long id , @RequestBody CourseDTO coursedto){
		return ResponseEntity.ok(courseService.updateCourseById(id,coursedto));
	}
	
	@GetMapping("/courses/{name}")
	public ResponseEntity<?> getCourseByCname(@PathVariable String name){
		return ResponseEntity.ok(courseService.SelectCourseByName(name));
	}
	
}



