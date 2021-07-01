package com.example.apiandroidfilm.repository;

import com.example.apiandroidfilm.entity.DirectorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepo extends JpaRepository<DirectorEntity, Integer> {
}
