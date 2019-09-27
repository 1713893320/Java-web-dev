package com.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(urlPatterns = "/index")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
        List<Book> bookList = Arrays.asList(books);
        req.setAttribute("bookList",bookList);
        req.getRequestDispatcher("index.jsp").forward(req,resp);

    }
}
