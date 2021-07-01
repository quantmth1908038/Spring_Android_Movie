package com.example.apiandroidfilm.repository;

import com.example.apiandroidfilm.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<CategoryEntity, Integer> {
}
