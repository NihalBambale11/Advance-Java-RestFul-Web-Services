package com.recipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.recipe.dto.RecipeDTO;
import com.recipe.entities.Recipe;
import com.recipe.service.RecipeService;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;
	
	public RecipeController() {
		System.out.println("In Controller CTOR");
	}
	
	@GetMapping
	public ResponseEntity<?> getRecipe(){
		return ResponseEntity.ok(recipeService.getAllRecipe());
	}
	
	@PostMapping
	public ResponseEntity<?> addRecipe(@RequestBody Recipe recipe){
		return ResponseEntity.status(HttpStatus.CREATED).body(recipeService.addNewRecipe(recipe));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@RequestParam Long id){
		return ResponseEntity.ok(recipeService.selectById(id));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateRecipe(@RequestParam Long id, @RequestBody Recipe recipe){
		return ResponseEntity.status(HttpStatus.OK).body(recipeService.updateRecipeById(id, recipe));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteRecipe(@RequestParam Long id){
		return ResponseEntity.ok(recipeService.deleteById(id));
	}
	
	
}
