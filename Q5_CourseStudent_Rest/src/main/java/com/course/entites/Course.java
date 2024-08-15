package com.course.entites;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Course {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Category category;
	
	@Column(nullable = false)
	private LocalDate startDate;
	
	@Column(nullable = false)
	private LocalDate endDate;
	
	@Column(nullable = false)
	private Double Fee;
	
	@Column(nullable = false)
	private int grade;

	public Course(@NotBlank String name, Category category, LocalDate startDate, LocalDate endDate, Double fee,
			int grade) {
		super();
		this.name = name;
		this.category = category;
		this.startDate = startDate;
		this.endDate = endDate;
		Fee = fee;
		this.grade = grade;
	}
	
	
	
}
