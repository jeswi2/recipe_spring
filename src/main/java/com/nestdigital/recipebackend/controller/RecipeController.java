package com.nestdigital.recipebackend.controller;

import com.nestdigital.recipebackend.Dao.RecipeDao;
import com.nestdigital.recipebackend.Model.RecipeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    private RecipeDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addrecipe",consumes = "application/json",produces = "application/json")
    public String addrecipe(@RequestBody RecipeModel recipe){
        System.out.println(recipe.toString());
        dao.save(recipe);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewrecipe")
    public List<RecipeModel> viewrecipe(){
        return (List<RecipeModel>) dao.findAll();

    }
}
