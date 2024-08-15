package com.course.service;

import java.util.List;

import com.course.dtos.StudentDTO;
import com.course.entites.Student;

public interface StudentService {

	List<StudentDTO> selectStudentByCourse(String name);

}
