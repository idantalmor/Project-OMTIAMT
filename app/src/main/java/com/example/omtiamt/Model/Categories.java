package com.example.omtiamt.Model;

import android.graphics.Picture;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity
public class Categories {
    @PrimaryKey
    String id;
    String categoryName;
    Picture categoryPicture;
    List<Product> products;

    public Categories() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Picture getCategoryPicture() {
        return categoryPicture;
    }

    public void setCategoryPicture(Picture categoryPicture) {
        this.categoryPicture = categoryPicture;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Categories(String id, String categoryName, Picture categoryPicture, List<Product> products) {
        this.id = id;
        this.categoryName = categoryName;
        this.categoryPicture = categoryPicture;
        this.products = products;
    }
}