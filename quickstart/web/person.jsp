<%--
  Created by IntelliJ IDEA.
  User: mqxu
  Date: 2019/9/18
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人中心</title>
</head>
<body>
<h2>个人中心</h2>
<%--<%--%>
<%--    for(int i = 0;i<10;i++){--%>
<%--        out.println(i);--%>
<%--    }--%>
<%--    String username = (String) request.getAttribute("username");--%>
<%--    if(username!=null){--%>
<%--        out.print(username);--%>
<%--    }--%>
<%--%>--%>
<%=session.getAttribute("username")%>
</body>
</html>
