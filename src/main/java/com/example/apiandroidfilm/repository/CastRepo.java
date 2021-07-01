package com.example.apiandroidfilm.repository;

import com.example.apiandroidfilm.entity.CastEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CastRepo extends JpaRepository<CastEntity, Integer> {
}
