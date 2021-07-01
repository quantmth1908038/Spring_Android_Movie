package com.example.apiandroidfilm.controller;

import com.example.apiandroidfilm.entity.FilmEntity;
import com.example.apiandroidfilm.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class FilmController {

    @Autowired
    FilmService filmService;

    @GetMapping("/api/home")
    public ResponseEntity home() {
        FilmEntity entity = new FilmEntity("name", "thumbnail", "des", 1, 1, null, 1);
        List<FilmEntity> f = filmService.getAll();
        return ResponseEntity.ok(f);
    }

}
