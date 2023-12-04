package com.example.instagram.Model;

public class MessageModel {
    private String ProfileName;
    private String message;
    private String time;
    private int profileImage;

    public MessageModel(String profileName, String message, String time, int profileImage) {
        ProfileName = profileName;
        this.message = message;
        this.time = time;
        this.profileImage = profileImage;
    }

    public String getProfileName() {
        return ProfileName;
    }

    public void setProfileName(String profileName) {
        ProfileName = profileName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }
}
