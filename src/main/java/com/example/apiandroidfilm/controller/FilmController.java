package com.example.apiandroidfilm.controller;

import com.example.apiandroidfilm.entity.CastEntity;
import com.example.apiandroidfilm.entity.FilmEntity;
import com.example.apiandroidfilm.service.CastService;
import com.example.apiandroidfilm.service.CategoryService;
import com.example.apiandroidfilm.service.DirectorService;
import com.example.apiandroidfilm.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class FilmController {

    @Autowired
    FilmService filmService;

    @Autowired
    CastService castService;

    @Autowired
    DirectorService directorService;

    @Autowired
    CategoryService categoryService;

    @GetMapping("/api/home")
    public ResponseEntity home() {
//        FilmEntity filmEntity = new FilmEntity("name", "thumbnail", "des", 1, 1, null, 1);
//        CastEntity castEntity = new CastEntity("name", "image", "des");
//        List<CastEntity> cast = castService.getAll();
//        List<CastEntity> castEntityList = new ArrayList<>();
//        castEntityList.add(cast);
//        filmEntity.setCasts(cast);

        FilmEntity f = filmService.findById(1);

//        List<FilmEntity> f = filmService.getAll();
        return ResponseEntity.ok(f);
    }

}
