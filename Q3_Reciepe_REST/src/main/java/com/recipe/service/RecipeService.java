package com.recipe.service;

import java.util.List;

import com.recipe.dto.RecipeDTO;
import com.recipe.entities.Recipe;

public interface RecipeService {

	List<Recipe> getAllRecipe();

	Recipe addNewRecipe(Recipe recipe);

	RecipeDTO updateRecipeById(Long id, Recipe recipe);

	Recipe selectById(Long id);

	RecipeDTO deleteById(Long id);

}
