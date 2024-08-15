package com.course.dtos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.course.entites.Category;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter

public class CourseDTO {
	
	@NotBlank
	private String name;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Category category;
	
	@NotNull	
	private LocalDate startDate;
	
	@NotNull	
	private LocalDate endDate;
	
	@NotNull	
	private Double Fee;
}
