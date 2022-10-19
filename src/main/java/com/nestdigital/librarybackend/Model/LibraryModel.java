package com.nestdigital.librarybackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "library")
public class LibraryModel {
    @Id
    @GeneratedValue
    private int id;
    private String bookname;
    private String description;
    private String author;

    public LibraryModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LibraryModel(int id, String bookname, String description, String author) {
        this.id = id;
        this.bookname = bookname;
        this.description = description;
        this.author = author;
    }
}
