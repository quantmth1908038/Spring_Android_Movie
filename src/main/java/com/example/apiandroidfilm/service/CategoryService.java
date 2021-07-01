package com.example.apiandroidfilm.service;

import com.example.apiandroidfilm.entity.CategoryEntity;

import java.util.List;

public interface CategoryService {
    List<CategoryEntity> getAll();
    CategoryEntity createCategory(CategoryEntity entity);
}
