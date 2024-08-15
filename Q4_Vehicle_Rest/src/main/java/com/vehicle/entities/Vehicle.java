package com.vehicle.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long vid;
	
	@NotBlank
	private String Vname;
	
	@Enumerated(EnumType.STRING)
	private Company company;
	
	@NotBlank
	private String Vnumber;
	
	@NotBlank
	private String Vtype;
	
	@ManyToOne
	@JoinColumn(name="uid" , nullable= false)
	private User user;
	
	
	
}
