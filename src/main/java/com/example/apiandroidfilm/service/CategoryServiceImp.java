package com.example.apiandroidfilm.service;

import com.example.apiandroidfilm.entity.CategoryEntity;
import com.example.apiandroidfilm.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    CategoryRepo categoryRepo;

    @Override
    public List<CategoryEntity> getAll() {
        return categoryRepo.findAll();
    }

    @Override
    public CategoryEntity createCategory(CategoryEntity entity) {
        return categoryRepo.save(entity);
    }

    @Override
    public CategoryEntity findById(int id) {
        return categoryRepo.findById(id).get();
    }
}
