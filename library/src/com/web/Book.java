package com.web;

public class Book {
    private String name;
    private String cover;
    private String auther;

    public Book(String name, String cover, String auther) {
        this.name = name;
        this.cover = cover;
        this.auther = auther;
    }

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", cover='" + cover + '\'' +
                ", auther='" + auther + '\'' +
                '}';
    }
}
