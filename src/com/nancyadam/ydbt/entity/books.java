package com.nancyadam.ydbt.entity;

/**
 * Created by Nancy on 2/22/2016.
 */
public class Books {
    private int bookId;
    private String bookTitle;


    public Books() {
    }

    public Books(int bookId, String bookTitle) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
}
