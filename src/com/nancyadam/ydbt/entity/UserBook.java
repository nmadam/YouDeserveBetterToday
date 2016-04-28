package com.nancyadam.ydbt.entity;

/**
 * Created by Nancy on 2/22/2016.
 */
public class UserBook {
    private int bookId;
    private int userId;
    private String rating;
    private String comment;

    public UserBook() {
    }

    public UserBook(int bookId, int userId, String rating, String text) {
        this.bookId = bookId;
        this.userId = userId;
        this.rating = rating;
        this.comment = text;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
