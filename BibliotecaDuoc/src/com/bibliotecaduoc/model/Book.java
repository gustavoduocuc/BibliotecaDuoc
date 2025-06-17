package com.bibliotecaduoc.model;

public class Book {
    public String title;
    public String author;
    private boolean available;
    
    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    public void setIsAvailable(boolean available) {
        this.available = available;
    }
}
