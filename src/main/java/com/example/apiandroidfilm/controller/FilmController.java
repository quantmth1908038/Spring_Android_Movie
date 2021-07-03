package com.example.apiandroidfilm.controller;

import com.example.apiandroidfilm.entity.CastEntity;
import com.example.apiandroidfilm.entity.FilmEntity;
import com.example.apiandroidfilm.model.BaseResponse;
import com.example.apiandroidfilm.model.Home;
import com.example.apiandroidfilm.service.CastService;
import com.example.apiandroidfilm.service.CategoryService;
import com.example.apiandroidfilm.service.DirectorService;
import com.example.apiandroidfilm.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
        BaseResponse res = new BaseResponse();
        Home home = new Home(filmService.findAllById(Arrays.asList(1,3,5,7,9)),
                filmService.findAllById(Arrays.asList(2,4,6,8,10)),
                filmService.findAllById(Arrays.asList(1,2,4,5,7)),
                filmService.findAllById(Arrays.asList(2,6,3,9,5)));
        res.data = home;

        return ResponseEntity.ok(res);
    }

}
