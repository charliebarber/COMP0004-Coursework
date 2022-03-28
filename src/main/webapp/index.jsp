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
        <ul>
            <%--            <%--%>
            <%--                HashMap<Integer, Note> notes = (HashMap<Integer, Note>) request.getAttribute("notes");--%>
            <%--                notes.forEach((id, note) ->);--%>
            <%--            %>--%>
            <%--            <% HashMap<Integer, Note> notes = (HashMap<Integer, Note>) request.getAttribute("notes"); %>--%>
            <c:forEach var="note" items="${notes}">
                <li class="notelink"><a href="/note.html?key=${note.key}">${note.value}</a></li>
            </c:forEach>
        </ul>
    </div>
</div>
</body>
</html>
