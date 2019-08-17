package com.andromeda.ara;

public class RssFeedModel {

    public String title;
    public String link;
    public String description;
    public String image;

    public RssFeedModel(String description, String link, String title, String image) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.image = image;
    }
}


