<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/9/28
  Time: 0:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    session.invalidate();
    response.sendRedirect("/");
%>