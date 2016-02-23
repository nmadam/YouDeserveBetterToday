package com.nancyadam.ydbt.entity;

/**
 * Created by Nancy on 2/22/2016.
 */
public class UserBook {
    private int userBookId;
    private int userId;
    private String rating;
    private String text;

    public UserBook() {
    }

    public UserBook(int userBookId, int userId, String rating, String text) {
        this.userBookId = userBookId;
        this.userId = userId;
        this.rating = rating;
        this.text = text;
    }

    public int getUserBookId() {
        return userBookId;
    }

    public void setUserBookId(int userBookId) {
        this.userBookId = userBookId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
