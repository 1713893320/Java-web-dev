<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/9/24
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.web.entity.User" %>
<%@ page import="java.util.List" %>
<%@ page import="com.web.entity.Book" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css">
    <style type="text/css">
      h2,h3{
        color: rgb(73,73,73);
      }

      *{
        margin: 0;
        padding: 0;
      }

      body{
        color: #333;
      }

      header{
        height: 60px;
        background-color: rgb(170, 170, 170);
        display: flex;
        align-items: center;
        justify-content: space-between;
        padding-left: 10px;
        padding-right: 10px;
      }

      .user-info{
        padding-right: 20px;
      }

      /*超链接样式*/
      .nav li a{
        text-decoration: none;
        color: #EEEEEE;
      }

      .nav li a:hover{
        color: #fff;
      }

      .nav{
        flex: 0 0 50%;
        list-style: none;
        display: flex;
      }

      .nav li{
        margin-left: 0.625rem;
        margin-right: 0.625rem;
        width: 50px;
      }
      /*搜索区样式*/
      .search-warp{
        height: 60px;
        background-color: #eee;
        display: flex;
        align-items: center;
        padding-left: 10%;
        margin-bottom: 10px;
      }

      .input-box{
        width: 350px;
        height: 35px;
        border: 1px solid #EEEEEE;
        border-radius: 5%;
        margin-left: 10px;
      }

      .container{
        width: 85%;
        margin: 0 auto;
        /* height: 600px; */
        /* background-color: #EEEEEE; */
        display: flex;
        padding: 0.3125rem 0.3125rem  0.3125rem 0.3125rem;
      }

      .left{
        flex: 0 0 66%;
        height: 100%;
        background-color: #fff;
        padding: 10px 10px 10px 10px;
      }

      .right{
        flex: 0 0 30%;
        margin-left: 15%;
        height: 100%;
        background: #aaa;
      }

      .row{
        display: flex;
        /*自动换行*/
        flex-wrap: wrap;
        padding: 5px 5px 5px 5px;
      }

      .column{
        flex: 0 0 18%;
        height: 150px;
        background-color: #aaa;
        border: 1px solid #333;
        margin: 5px 5px 5px 5px;
      }

      footer{
        height: 100px;
        background-color: #AAAAAA;
        display: flex;
        align-items: center;
        justify-content: space-between;
      }

      .column img{
        width: 90%;
        height: 70%;
      }
    </style>
  </head>
  <body>
  <!--顶部导航 -->
  <div id="top">
    <jsp:include page="top.jsp"/>
  </div>
  <div id="search">
    <h2>读书时刻</h2>
    <input type="text" placeholder="书名、作者、ISBN" class="search-input">
    <div class="search-btn">
      <img src="images/search.png" alt="">
    </div>
  </div>
    <div>
      <%
        String username = (String) session.getAttribute("username");
        if (username != null) {
          pageContext.setAttribute("username",username);
      %>
      ${username}
      <li>
        <a href="logout.jsp">退出</a>
      </li>
      <%
      }else{
      %>
      <h3><a href="${pageContext.request.contextPath}/">去登陆</a></h3>
      <%
        }
      %>
    </div>
  </header>
  <!--搜索区-->
  <div class="search-warp">
    <h2>读书</h2>
    <input type="text" placeholder="输入要搜索的内容" class="input-box">
  </div>

  <div class="container">
    <div class="left">
      <h2>好书</h2>
      <hr>
      <%
        List<Book> bookList = (List<Book>) request.getAttribute("bookList");
        pageContext.setAttribute("size",bookList.size());
      %>
      一共${size}本书
      <div class="row">
        <%
          for (Book book : bookList){
            pageContext.setAttribute("book",book);
        %>
        <div class="column">
          <img src="images/${book.cover}" alt="">
          <p>${book.name}</p>
          <p>${book.auther}</p>
        </div>
        <%
        }
        %>
      </div>
      </div>


    <div class="right"></div>
  </div>
  </div>
  <!--脚注区-->
  <footer>
    <ul>
      <li>@2015-2019</li>
      <li>niit.edu.cn,</li>
      <li>all rights reserved</li>
      <li>南工院计算机学院</li>
    </ul>
    <ul>
      <li>联系我们</li>
      <li>帮助中心</li>
      <li>法律声明</li>
      <li>移动合作</li>
    </ul>
  </footer>

  </body>
</html>
