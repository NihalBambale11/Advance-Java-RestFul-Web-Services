package com.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.course.dtos.CourseDTO;
import com.course.entites.Course;
import com.course.exception.CourseNotFoundException;
import com.course.repository.CourseRepository;

@Service
@Transactional
public class CourseServiceImplementation implements CourseService {
	
	@Autowired
	CourseRepository courseRepository;
	
	
	@Override
	public Course insertCourse(CourseDTO coursedto) {
        Course course = new Course();
        course.setName(coursedto.getName());
        course.setCategory(coursedto.getCategory());

	     course.setStartDate(coursedto.getStartDate());
    	 course.setEndDate(coursedto.getEndDate());
        course.setFee(coursedto.getFee());
        course.setGrade(32);
	     if(course.getEndDate().isBefore(course.getStartDate())) {
	    	 throw new CourseNotFoundException("Date Wrong");
	     }
        
        return courseRepository.save(course);		
	}


	@Override
	public Course updateCourseById(Long id, CourseDTO coursedto) {
		//Course course = new Course();
		Course course = courseRepository.findById(id)
                .orElseThrow(() -> new CourseNotFoundException("Course not found with id: " + id));
		//if(courseRepository.existsById(id)) {
			// course.setName(coursedto.getName());
		     //course.setCategory(coursedto.getCategory());

		     course.setStartDate(coursedto.getStartDate());
	    	 course.setEndDate(coursedto.getEndDate());
		     course.setFee(coursedto.getFee());
		  //   course.setGrade(32);
		     if(course.getEndDate().isBefore(course.getStartDate())) {
		    	 throw new CourseNotFoundException("Date is Wropng");
		     }
		    
		  return courseRepository.save(course);
		//}
		
	}


	@Override
	public List<Course> SelectCourseByName(String name) {
		
		return courseRepository.findByName(name);
	}

}
