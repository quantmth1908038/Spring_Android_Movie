package com.example.apiandroidfilm.model;

import com.example.apiandroidfilm.entity.FilmEntity;

import java.util.List;

public class Home {

    private List<FilmEntity> listTrending;
    private List<FilmEntity> listHot;
    private List<FilmEntity> listSuggest;
    private List<FilmEntity> listWatch;

    public Home() {
    }

    public Home(List<FilmEntity> listTrending, List<FilmEntity> listHot, List<FilmEntity> listSuggest, List<FilmEntity> listWatch) {
        this.listTrending = listTrending;
        this.listHot = listHot;
        this.listSuggest = listSuggest;
        this.listWatch = listWatch;
    }

    public List<FilmEntity> getListTrending() {
        return listTrending;
    }

    public void setListTrending(List<FilmEntity> listTrending) {
        this.listTrending = listTrending;
    }

    public List<FilmEntity> getListHot() {
        return listHot;
    }

    public void setListHot(List<FilmEntity> listHot) {
        this.listHot = listHot;
    }

    public List<FilmEntity> getListSuggest() {
        return listSuggest;
    }

    public void setListSuggest(List<FilmEntity> listSuggest) {
        this.listSuggest = listSuggest;
    }

    public List<FilmEntity> getListWatch() {
        return listWatch;
    }

    public void setListWatch(List<FilmEntity> listWatch) {
        this.listWatch = listWatch;
    }
}
