<%--
  Created by IntelliJ IDEA.
  User: charliebarber
  Date: 28/03/2022
  Time: 09:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="meta.jsp"%>
</head>
<body>
<%@include file="header.html"%>
<div class="container">
    <div>
        <a href="/newnote.html" class="buttonlink">Create a new note</a>
    </div>

    <div>
        <h4>View mode</h4>
        <a href="/" class="buttonlink view">Sorted order</a>
        <a href="/" class="buttonlink view">Order added</a>
        <a href="/" class="buttonlink view">Summary</a>
        <a href="/" class="buttonlink view">Full note</a>
    </div>

    <div>
        <h2>Your notes</h2>
    </div>
</div>
</body>
</html>
