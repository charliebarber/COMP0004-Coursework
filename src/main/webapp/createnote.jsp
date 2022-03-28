<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="meta.jsp" %>
</head>
<body>
<%@include file="header.html" %>
<div class="container">
    <h1>Create a new note</h1>
    <form method="post" action="/createnote.html">
        <input type="text" name="text" placeholder="Enter text here" style="min-width: 32rem; min-height: 16rem;">
        <input type="submit" value="Create note">
    </form>
</div>

</body>
</html>
