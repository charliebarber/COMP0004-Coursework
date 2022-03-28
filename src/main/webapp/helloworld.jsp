<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Notes App</title>
</head>
<body>
  <h1>Hello from the Java Server Page!</h1>
  <%
    String message = "This is a message in a Java String";
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
  %>
  <p><%=message%></p>
  <hr>
  <p>Today's date is: <%=formatter.format(date)%></p>
  <hr>
</body>
</html>
