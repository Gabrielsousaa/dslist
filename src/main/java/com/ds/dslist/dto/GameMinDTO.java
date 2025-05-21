package com.ds.dslist.dto;

import com.ds.dslist.entities.Game;

import jakarta.persistence.Column;

public class GameMinDTO {

    private Long Id;
    private String title;
    private Double score;
    @Column(name = "game_year")
    private Integer year;
    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        Id = entity.getId();
        title = entity.getTitle();
        score = entity.getScore();
        year = entity.getYear();
        shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public Double getScore() {
        return score;
    }

    public Integer getYear() {
        return year;
    }

    public String getShortDescription() {
        return shortDescription;
    }
    
}
