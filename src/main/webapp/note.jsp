<%@ page import="ucl.ac.uk.model.note.Note" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="meta.jsp" %>
</head>
<body>
<%@include file="header.html" %>
<div class="container">
    <div>
        <% Note note = (Note) request.getAttribute("note"); %>
        <h1>
            <%=note.getLabel()%>
        </h1>
        <p>
            <%=note.getContent()%>
        </p>
    </div>
</div>
</body>
</html>
