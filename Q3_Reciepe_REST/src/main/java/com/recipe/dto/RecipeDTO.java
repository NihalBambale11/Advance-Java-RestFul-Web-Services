package com.recipe.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
public class RecipeDTO {
	private String msg;
	private LocalDateTime timestamp;
	
	public RecipeDTO(String msg) {
		super();
		this.msg = msg;
		this.timestamp = LocalDateTime.now();
	}
	
	

}
