<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/10/6
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<ul>
    <li>
        <a href="home">首页</a>
    </li>
    <li>
        <a href="#">畅销</a>
    </li>
    <li>
        <a href="#">购物车</a>
    </li>
    <li>
        <a href="#">客服</a>
    </li>
    <li>
        <a href="#">书城</a>
    </li>
</ul>
<ul>

    <%
        Object user = null;
        if (user != null) {
    %>
    <li>
        <a href="person.jsp">
            <img src="images/${user.avatar}" alt="" class="avatar">
        </a>
    </li>
    <li>
        <a href="logout.jsp">退出</a>
    </li>
    <%
    } else {
    %>
    <a href="${pageContext.request.contextPath}/sign_in.html">去登录</a>
    <%
        }
    %>
</ul>