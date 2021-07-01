package com.example.apiandroidfilm.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "films")
public class FilmEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "thumbnail")
    private String thumbnail;

    @Column(name = "description")
    private String description;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "view")
    private Integer view;

    @Column(name = "url")
    private String url;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_at")
    private Date createAt;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_at")
    private Date updateAt;

    @Column(name = "categoryid")
    private Integer categoryid;

    @ManyToOne()
    @JoinColumn(name = "categoryid", insertable = false, updatable = false)
    private CategoryEntity category;

    @ManyToMany(mappedBy = "films")
    private List<DirectorEntity> directors;

    @ManyToMany(mappedBy = "films")
    private List<CastEntity> casts;

    public FilmEntity() {
    }

    public FilmEntity(String name, String thumbnail, String description, Integer duration, Integer view, String url, Integer categoryid) {
        this.name = name;
        this.thumbnail = thumbnail;
        this.description = description;
        this.duration = duration;
        this.view = view;
        this.url = url;
        this.categoryid = categoryid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public List<DirectorEntity> getDirectors() {
        return directors;
    }

    public void setDirectors(List<DirectorEntity> directors) {
        this.directors = directors;
    }

    public List<CastEntity> getCasts() {
        return casts;
    }

    public void setCasts(List<CastEntity> casts) {
        this.casts = casts;
    }
}
