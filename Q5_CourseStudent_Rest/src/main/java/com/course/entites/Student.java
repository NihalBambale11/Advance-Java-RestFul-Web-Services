package com.course.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sid;
	
	@NotBlank
	private String sname;
	
	
	@NotBlank
	private String email;
	
	@NotBlank
	private String password;
	
	@ManyToOne
	@JoinColumn(name= "Course_id", nullable = false)
	private Course course;

	public Student(@NotBlank String sname, @NotBlank String email, @NotBlank String password, Course course) {
		super();
		this.sname = sname;
		this.email = email;
		this.password = password;
		this.course = course;
	}
	
	
}
