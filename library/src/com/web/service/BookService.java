package com.web.service;

import com.web.entity.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookService {
    private static List<Book> bookList;

    public static List<Book> init() {
        bookList = new ArrayList<>(10);
        Book[] books = {
                new Book("我是猫", "我是猫.jpg", "夏目漱石"),
                new Book("人间失格", "人间失格.jpg", "太宰治"),
                new Book("汪曾祺精选集", "汪曾祺精选集.jpg", "汪曾祺"),
                new Book("张爱玲给我的信件","张爱玲给我的信件.jpg","夏志清"),
                new Book("我是猫", "我是猫.jpg", "夏目漱石"),
                new Book("人间失格", "人间失格.jpg", "太宰治"),
                new Book("汪曾祺精选集", "汪曾祺精选集.jpg", "汪曾祺"),
                new Book("张爱玲给我的信件","张爱玲给我的信件.jpg","夏志清"),
                new Book("我是猫", "我是猫.jpg", "夏目漱石"),
                new Book("人间失格", "人间失格.jpg", "太宰治"),
                new Book("汪曾祺精选集", "汪曾祺精选集.jpg", "汪曾祺"),
                new Book("张爱玲给我的信件","张爱玲给我的信件.jpg","夏志清"),
                new Book("我是猫", "我是猫.jpg", "夏目漱石"),
                new Book("人间失格", "人间失格.jpg", "太宰治"),
                new Book("汪曾祺精选集", "汪曾祺精选集.jpg", "汪曾祺"),
                new Book("张爱玲给我的信件","张爱玲给我的信件.jpg","夏志清"),
                new Book("我是猫", "我是猫.jpg", "夏目漱石"),
                new Book("人间失格", "人间失格.jpg", "太宰治"),
                new Book("汪曾祺精选集", "汪曾祺精选集.jpg", "汪曾祺"),
                new Book("张爱玲给我的信件","张爱玲给我的信件.jpg","夏志清"),
                new Book("我是猫", "我是猫.jpg", "夏目漱石"),
                new Book("人间失格", "人间失格.jpg", "太宰治"),
                new Book("汪曾祺精选集", "汪曾祺精选集.jpg", "汪曾祺"),
                new Book("张爱玲给我的信件","张爱玲给我的信件.jpg","夏志清"),
                new Book("我是猫", "我是猫.jpg", "夏目漱石"),
                new Book("人间失格", "人间失格.jpg", "太宰治"),
                new Book("汪曾祺精选集", "汪曾祺精选集.jpg", "汪曾祺"),
                new Book("张爱玲给我的信件","张爱玲给我的信件.jpg","夏志清"),
                new Book("我是猫", "我是猫.jpg", "夏目漱石"),
                new Book("人间失格", "人间失格.jpg", "太宰治"),
                new Book("汪曾祺精选集", "汪曾祺精选集.jpg", "汪曾祺"),
                new Book("张爱玲给我的信件","张爱玲给我的信件.jpg","夏志清")
        };
        bookList = Arrays.asList(books);
        return bookList;

    }
}
