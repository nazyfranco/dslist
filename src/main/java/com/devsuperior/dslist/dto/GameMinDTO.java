package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
<<<<<<< HEAD
import com.devsuperior.dslist.projections.GameMinProjection;
=======
import com.devsuperior.dslist.entities.GameList;
>>>>>>> 1c08b6e577371feb6362c8db086e1f70d90d1070

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){
    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

<<<<<<< HEAD
    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
=======
    public GameMinDTO(GameList gameList) {
>>>>>>> 1c08b6e577371feb6362c8db086e1f70d90d1070
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
