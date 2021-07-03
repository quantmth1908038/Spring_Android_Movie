package com.example.apiandroidfilm.service;

import com.example.apiandroidfilm.entity.CastEntity;
import com.example.apiandroidfilm.repository.CastRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CastServiceImp implements CastService {

    @Autowired
    CastRepo castRepo;

    @Override
    public List<CastEntity> getAll() {
        return castRepo.findAll();
    }

    @Override
    public CastEntity createCast(CastEntity entity) {
        return castRepo.save(entity);
    }

    @Override
    public CastEntity findById(int id) {
        return castRepo.findById(id).get();
    }
}
