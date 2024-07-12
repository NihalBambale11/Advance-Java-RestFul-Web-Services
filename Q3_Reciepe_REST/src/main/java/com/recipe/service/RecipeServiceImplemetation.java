package com.recipe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.recipe.dto.RecipeDTO;
import com.recipe.entities.Recipe;
import com.recipe.exceptions.ResourceNotFoundException;
import com.recipe.repository.RecipeRepository;

@Service
@Transactional
public class RecipeServiceImplemetation implements RecipeService {

	@Autowired
	private RecipeRepository recipeRepo;
	
	@Override
	public List<Recipe> getAllRecipe() {
		return recipeRepo.findAll();
	}

	@Override
	public Recipe addNewRecipe(Recipe recipe) {
		return recipeRepo.save(recipe);
	}
	
	@Override
	public Recipe selectById(Long id) {
		Recipe rep = recipeRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("ID Not Found"));
		return rep;
	}

	@Override
	public RecipeDTO updateRecipeById(Long id, Recipe recipe) {
		String msg = "Updation Failed!!!!!!";
		if(recipeRepo.existsById(id)) {
			recipeRepo.save(recipe);
			msg = "Updation Successful";
		}
		else {
			throw new ResourceNotFoundException("Invalid ID ");
		}
		return new RecipeDTO(msg);
	}

	@Override
	public RecipeDTO deleteById(Long id) {
		String mess = "Deletion Failed!!!";
		if(recipeRepo.existsById(id)) {
			recipeRepo.deleteById(id);
			mess ="Deletion Successfull";
		}
		else {
			throw new ResourceNotFoundException("Invalid ID ");

		}
		return new RecipeDTO(mess);
	}



}
