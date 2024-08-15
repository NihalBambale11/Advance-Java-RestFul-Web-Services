package com.vehicle.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long uid;
	
	@NotBlank
	private String uname;
	
	@NotBlank
	private String email;
	
	@NotBlank
	@Size(min = 6)
	private String password;
	
	@NotBlank
	private String city;
	
	@NotBlank
	@Size(min = 10,max = 10)
	private String contactNo;
}
