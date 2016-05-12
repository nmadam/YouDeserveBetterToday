package com.nancyadam.ydbt.entity;

import java.io.Serializable;

/**
 * Created by Nancy on 2/22/2016.
 *
 * Java Bean for user_book table
 */
public class UserBook implements Serializable{
    private int bookId;
    private int userId;
    private String rating;
    private String comment;

    /**
     * Empty Constructor
     */
    public UserBook() {
    }

    /**
     * Constructor that accepts the book id, uer id, rating and text comment paramaters
     *
     * @param bookId
     * @param userId
     * @param rating
     * @param text
     */
    public UserBook(int bookId, int userId, String rating, String text) {
        this.bookId = bookId;
        this.userId = userId;
        this.rating = rating;
        this.comment = text;
    }
    /**
     * Gets comment.
     *
     * @return Value of comment.
     *
     */
    public String getComment() {
        return comment;
    }
    /**
     * Gets rating.
     *
     * @return Value of rating.
     */
    public String getRating() {
        return rating;
    }
    /**
     * Sets new bookId.
     *
     * @param bookId New value of bookId.
     */
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    /**
     * Sets new comment.
     *
     * @param comment New value of comment.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    /**
     * Gets bookId.
     *
     * @return Value of bookId.
     */
    public int getBookId() {
        return bookId;
    }
    /**
     * Sets new rating.
     *
     * @param rating New value of rating
     */
    public void setRating(String rating) {
        this.rating = rating;
    }
    /**
     * Sets new userId.
     *
     * @param userId New value of userId.
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }
    /**
     * Gets userId.
     *
     * @return Value of userId.
     */
    public int getUserId() {
        return userId;
    }
}
