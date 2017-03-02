package com.example.android.inclassassignment05_jingyuanl;

import java.io.Serializable;

/**
 * Created by Cathy on 2/23/17.
 */

public class Book implements Serializable {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}