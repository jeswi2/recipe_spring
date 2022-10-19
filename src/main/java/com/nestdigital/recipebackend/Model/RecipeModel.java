package com.nestdigital.recipebackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "recipes")
public class RecipeModel {

    @Id
    @GeneratedValue
    private int id;
    private String recipename;
    private String description;
    private String category;
    private String posteddate;
    private int price ;

    public RecipeModel() {
    }

    public RecipeModel(int id, String recipename, String description, String category, String posteddate, int price) {
        this.id = id;
        this.recipename = recipename;
        this.description = description;
        this.category = category;
        this.posteddate = posteddate;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipename() {
        return recipename;
    }

    public void setRecipename(String recipename) {
        this.recipename = recipename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPosteddate() {
        return posteddate;
    }

    public void setPosteddate(String posteddate) {
        this.posteddate = posteddate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
