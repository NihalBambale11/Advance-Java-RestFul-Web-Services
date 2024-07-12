package com.recipe.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "recipe")
@NoArgsConstructor
//@AllArgsConstructor
@Setter
@Getter
@ToString
public class Recipe {
	
	//  Recipe ID, title, description, ingredients, instructions, difficulty level, 
	//cuisine type, author (user ID), creation date
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	
	private String description;
	
	private String ingredients;
	
	private String instruction;
	
	@Column(name = "difficulty_level")
	private int difficultylevel;
	
	@Column(name = "cuisine_type")
	private String cuisine;
	
	@Column(name = "author_id")
	private int authorid;
	
	@CreatedDate
	@Column(name = "creation_date")
	private LocalDate creationDate;

	public Recipe(String title, String description, String ingredients, String instruction, int difficultylevel,
			String cuisine, int authorid) {
		super();
		this.title = title;
		this.description = description;
		this.ingredients = ingredients;
		this.instruction = instruction;
		this.difficultylevel = difficultylevel;
		this.cuisine = cuisine;
		this.authorid = authorid;
	}
	
	public Recipe( Long id ,String title, String description, String ingredients, String instruction, int difficultylevel,
			String cuisine, int authorid, LocalDate creationDate) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.ingredients = ingredients;
		this.instruction = instruction;
		this.difficultylevel = difficultylevel;
		this.cuisine = cuisine;
		this.authorid = authorid;
		this.creationDate = creationDate;
	}

	
	
	
}
