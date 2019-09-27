<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/9/17
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
  首页
  <h3>用户名：${pageContext.request.getAttribute("username")}</h3>
  <h3>密码：${pageContext.request.getAttribute("username")}</h3>
  <a href="login.html" target="_blank">点击返回</a>
  </body>
</html>
