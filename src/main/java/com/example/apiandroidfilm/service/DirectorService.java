package com.example.apiandroidfilm.service;

import com.example.apiandroidfilm.entity.DirectorEntity;

import java.util.List;

public interface DirectorService {
    List<DirectorEntity> getAll();
    DirectorEntity createDirector(DirectorEntity entity);
    DirectorEntity findById(int id);
}
