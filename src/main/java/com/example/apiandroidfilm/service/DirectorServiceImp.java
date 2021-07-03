package com.example.apiandroidfilm.service;

import com.example.apiandroidfilm.entity.DirectorEntity;
import com.example.apiandroidfilm.repository.DirectorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorServiceImp implements DirectorService {

    @Autowired
    DirectorRepo directorRepo;

    @Override
    public List<DirectorEntity> getAll() {
        return directorRepo.findAll();
    }

    @Override
    public DirectorEntity createDirector(DirectorEntity entity) {
        return directorRepo.save(entity);
    }

    @Override
    public DirectorEntity findById(int id) {
        return directorRepo.findById(id).get();
    }
}
