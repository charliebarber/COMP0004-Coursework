<%@ page import="ucl.ac.uk.model.note.Note" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="meta.jsp" %>
</head>
<body>
<%@include file="header.html" %>
<div class="container">
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

    <h3>Edit content</h3>
    <%
        out.println("<form method='post' action='/editnote.html?key=" + requestKey + "&type=content'>");
    %>
    <input type="text" name="contents" title="Edit note content" style="min-width: 32rem; min-height: 8rem;">
    <input type="submit" value="Edit note content">
    </form>

    <h3>Edit label</h3>
    <%
        out.println("<form method='post' action='/editnote.html?key=" + requestKey + "&type=label'>");
    %>
    <input type="text" name="label" title="Edit note label" style="min-width: 32rem; min-height: 2rem;">
    <input type="submit" value="Edit note Label">
    </form>

</div>
</body>
</html>
