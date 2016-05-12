package com.nancyadam.ydbt.entity;

/**
 * Created by Nancy on 2/22/2016.
 *
 * Java Bean for book table
 */
public class Book {
    private int bookId;
    private String bookTitle;
    private  String bookAuthor;

    /**
     * Empty Constructor
     */
    public Book() {
    }

    /**
     * Contstructor that accepts the book id, book title, and book author parameters)
     *
     * @param bookId
     * @param bookTitle
     * @param bookAuthor
     */
    public Book(int bookId, String bookTitle, String bookAuthor) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }
    /**
     * Sets new bookTitle.
     *
     * @param bookTitle New value of bookTitle.
     */
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    /**
     * Sets new bookAuthor.
     *
     * @param bookAuthor New value of bookAuthor.
     */
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
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
     * Gets bookAuthor.
     *
     * @return Value of bookAuthor.
     */
    public String getBookAuthor() {
        return bookAuthor;
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
     * Gets bookTitle.
     *
     * @return Value of bookTitle.
     */
    public String getBookTitle() {
        return bookTitle;
    }
}
