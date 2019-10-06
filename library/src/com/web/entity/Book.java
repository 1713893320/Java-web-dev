package com.web.entity;

public class Book {
    private String name;
    private String cover;
    private String auther;

    public Book(String name, String cover, String author) {
        this.name = name;
        this.cover = cover;
        this.auther = author;
    }

    public String getName() {
        return name;
    }

    public String getCover() {
        return cover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", cover='" + cover + '\'' +
                ", author='" + auther + '\'' +
                '}';
    }
}
