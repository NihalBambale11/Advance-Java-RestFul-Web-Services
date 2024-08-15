package com.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.course.service.StudentService;

@RestController

public class StudentController {
	
	@Autowired
	 StudentService studentService;
	
	@GetMapping("/student/{name}")
	public ResponseEntity<?> getStudentByCName(@PathVariable String name){
		return ResponseEntity.ok(studentService.selectStudentByCourse(name));
	}
	
}
