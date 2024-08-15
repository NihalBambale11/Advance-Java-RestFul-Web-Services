package com.course.dtos;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class StudentDTO {
	
	@NotBlank
	private String sname;
	
	
	@NotBlank
	private String email;
	
	@NotBlank
	private String password;
	
	private Long courseId;


}
