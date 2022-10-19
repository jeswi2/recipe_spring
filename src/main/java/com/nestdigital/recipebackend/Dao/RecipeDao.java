package com.nestdigital.recipebackend.Dao;

import com.nestdigital.recipebackend.Model.RecipeModel;
import org.springframework.data.repository.CrudRepository;

public interface RecipeDao extends CrudRepository<RecipeModel,Integer> {
}
