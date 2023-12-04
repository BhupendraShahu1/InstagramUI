package com.example.instagram.Model;

public class ReelsModel {
    private int ProfileImage;
    private String name;
    private String about;
    private String like;
    private String day;
    private String comment;
    private int reels;
    private String send;

    public ReelsModel(int profileImage, String name, String about, String like, String day, String comment, int reels, String send) {
        ProfileImage = profileImage;
        this.name = name;
        this.about = about;
        this.like = like;
        this.day = day;
        this.comment = comment;
        this.reels = reels;
        this.send = send;
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

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
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

    public int getReels() {
        return reels;
    }

    public void setReels(int reels) {
        this.reels = reels;
    }

    public String getSend() {
        return send;
    }

    public void setSend(String send) {
        this.send = send;
    }
}
