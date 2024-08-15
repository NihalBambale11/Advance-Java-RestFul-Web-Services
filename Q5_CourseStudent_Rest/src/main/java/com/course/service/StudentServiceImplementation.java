package com.course.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.course.dtos.StudentDTO;
import com.course.entites.Student;
import com.course.repository.StudentRepository;
@Service
@Transactional
public class StudentServiceImplementation implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<StudentDTO> selectStudentByCourse(String name) {
		List<Student> studlist = studentRepository.findByCourse(name);
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		for(Student student : studlist) {
	        StudentDTO studentDto = new StudentDTO();
	        //studentDto.setId(student.getSid());
	        studentDto.setSname(student.getSname());
	        studentDto.setEmail(student.getEmail());
	        studentDto.setPassword(student.getPassword());
	        studentDto.setCourseId(student.getSid());
	        
	        list.add(studentDto);
		}
		return list;
	}

}
