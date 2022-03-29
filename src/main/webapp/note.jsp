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

        <%
            String requestKey = (String) request.getAttribute("key");
//            out.println("<form method='post' action='/deletenote.html?key=" + requestKey + "' >");
        %>
        <input type="submit" value="Delete note">
        </form>

        <%
            out.println("<form method='post' action='/editnote.html?key=" + requestKey + "' >");
        %>
        <input type="text" name="contents" title="Edit note content" style="min-width: 32rem; min-height: 16rem;">
        <input type="submit" value="Edit note content">
        </form>
    </div>
</div>
</body>
</html>
