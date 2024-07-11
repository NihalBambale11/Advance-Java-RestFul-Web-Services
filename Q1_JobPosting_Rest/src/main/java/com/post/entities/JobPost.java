package com.post.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class JobPost {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long jid;
	
	private String title;
	
	private String company_name;
	
	private String location;
	
	private String description;
	
	private String requirement;
	
	private double salary;
	
	private LocalDate posting_date;

	public JobPost(String title, String company_name, String location, String description, String requirement,
			double salary, LocalDate posting_date) {
		super();
		this.title = title;
		this.company_name = company_name;
		this.location = location;
		this.description = description;
		this.requirement = requirement;
		this.salary = salary;
		this.posting_date = posting_date;
	}
	
	
	
}
