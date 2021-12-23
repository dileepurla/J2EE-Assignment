<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  import="java.util.Date" %>
<%@page import="java.util.*" %>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.LocalTime" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1 style="color:red;"><%= new Date()%>
</h1>
<br/>

<h1> Local Date:: <%= LocalDate.now()%></h1>
<br>
<h1> Local Time:::  <%= LocalTime.now()%></h1>
</body>
</html>

