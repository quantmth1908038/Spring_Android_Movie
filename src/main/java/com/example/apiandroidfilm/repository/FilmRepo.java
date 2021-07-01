package com.example.apiandroidfilm.repository;

import com.example.apiandroidfilm.entity.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepo extends JpaRepository<FilmEntity, Integer> {
}
