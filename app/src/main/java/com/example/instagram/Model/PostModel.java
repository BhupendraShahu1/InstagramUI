package com.example.instagram.Model;

public class PostModel {
    private int ProfileImage;
    private String name;
    private String location;
    private String like;
    private String day;
    private String comment;
    public PostModel(int profileImage, String name, String location, String like, String day, String comment) {
        ProfileImage = profileImage;
        this.name = name;
        this.location = location;
        this.like = like;
        this.day = day;
        this.comment = comment;
    }

    public int getProfileImage() {
        return ProfileImage;
    }

    public void setProfileImage(int profileImage) {
        ProfileImage = profileImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
