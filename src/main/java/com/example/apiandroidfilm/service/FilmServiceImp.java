package com.example.apiandroidfilm.service;

import com.example.apiandroidfilm.entity.FilmEntity;
import com.example.apiandroidfilm.repository.FilmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImp implements FilmService {

    @Autowired
    FilmRepo filmRepo;

    @Override
    public List<FilmEntity> getAll() {
        return filmRepo.findAll();
    }

    @Override
    public FilmEntity createFilm(FilmEntity f) {
        return filmRepo.save(f);
    }
}
