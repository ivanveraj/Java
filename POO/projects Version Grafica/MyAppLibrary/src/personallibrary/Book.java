/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personallibrary;

/**
 *
 * @author prog
 */
public class Book {

    private String title = "";
    private String author = "";
    private int rating = 0;
    private int pagesCount = 0;

    public Book(String newTitle, String newAuthor, int newRating,
            int newPagesCount) {

        title = newTitle;
        author = newAuthor;
        rating = newRating;
        pagesCount = newPagesCount;
    }

    public Book(String newTitle, String newAuthor, int newPagesCount) {

        this(newTitle, newAuthor, 0, newPagesCount);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int newRating) {
        if (newRating < 0) {
            this.rating = 0;
        }
        else if (newRating > 10) {
            this.rating = 10;
        }
        else {
            this.rating = newRating;
        }
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int newPagesCount) {
        this.pagesCount = newPagesCount;
    }

}
