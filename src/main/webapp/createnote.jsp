<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="meta.jsp" %>
</head>
<body>
<%@include file="header.html" %>
<div class="container">
    <h1>Create a new note</h1>

    <% if (request.getAttribute("type").equals("basic")) { %>
    <form method="post" action="/createnote.html?type=basic">
        <input type="text" name="label" placeholder="Label" style="min-width: 32rem;">
        <input type="text" name="text" placeholder="Enter text here" style="min-width: 32rem; min-height: 16rem;">
        <input type="submit" value="Create note">
    </form>
    <% } %>

    <% if (request.getAttribute("type").equals("url")) { %>
    <form method="post" action="/createnote.html?type=url">
        <input type="text" name="label" placeholder="Label" style="min-width: 32rem;">
        <label for="url">Enter URL including https:// prefix</label>
        <input type="text" id="url" name="url" placeholder="Enter URL here"
               style="min-width: 32rem; min-height: 2rem;">
        <input type="submit" value="Create note">
    </form>
    <% } %>
</div>

</body>
</html>
