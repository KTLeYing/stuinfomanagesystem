<%--
  Created by IntelliJ IDEA.
  User: 21989
  Date: 2020/5/14
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<jsp:forward page="/WEB-INF/view/login.jsp"></jsp:forward>--%>

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <%
       request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
      System.out.println(request.getRequestURL());
    %>
  </body>
</html>
