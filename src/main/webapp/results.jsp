<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="ucl.ac.uk.model.note.Note" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="meta.jsp" %>
</head>
<body>
<%@include file="header.html" %>
<div class="container">
    <h1>Results</h1>
    <div>
        <ul>
            <c:forEach var="node" items="${results}">
                <li class="notelink"><a href="/note.html?key=${node.key}">${node.note.label}</a></li>
            </c:forEach>
        </ul>
    </div>
</div>
</body>
</html>
