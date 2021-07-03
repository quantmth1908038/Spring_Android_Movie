package com.example.apiandroidfilm.service;

import com.example.apiandroidfilm.entity.FilmEntity;

import java.util.List;

public interface FilmService {
    List<FilmEntity> getAll();
    FilmEntity createFilm(FilmEntity f);
    FilmEntity findById(Integer id);
    List<FilmEntity> findAllById(List<Integer> list);
}
