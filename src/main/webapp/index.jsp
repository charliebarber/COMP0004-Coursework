<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="ucl.ac.uk.model.note.Note" %><%--
  Created by IntelliJ IDEA.
  User: charliebarber
  Date: 28/03/2022
  Time: 09:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="meta.jsp" %>
</head>
<body>
<%@include file="header.html" %>
<div class="container">
    <div>
        <a href="/newnote.html?type=basic" class="buttonlink">Create a basic note</a>
        <a href="/newnote.html?type=url" class="buttonlink">Create a URL note</a>
    </div>

    <div>
        <form method="post" action="/search.html">
            <%--            <label for="query">Search notes</label>--%>
            <input type="text" name="query">
            <input type="submit" value="Search">
        </form>
    </div>

    <div>
        <h4>
            View mode - <%=request.getAttribute("viewmode")%>
        </h4>
        <a href="/index.html?viewmode=orderAdded" class="buttonlink view">Order added</a>
        <a href="/index.html?viewmode=sorted" class="buttonlink view">Alphabetical sort</a>
    </div>

    <div>
        <h2>Your notes</h2>
        <ul>
            <c:forEach var="node" items="${notes}">
                <li class="notelink"><a href="/note.html?key=${node.key}">${node.note.label}</a></li>
            </c:forEach>
        </ul>
    </div>
</div>
</body>
</html>