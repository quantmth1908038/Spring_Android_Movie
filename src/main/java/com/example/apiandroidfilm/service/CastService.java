package com.example.apiandroidfilm.service;


import com.example.apiandroidfilm.entity.CastEntity;

import java.util.List;

public interface CastService {
    List<CastEntity> getAll();
    CastEntity createCast(CastEntity entity);
}
