<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  %>
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

<h1 style="color: aqua"> Local Date:: <%= LocalDate.now()%></h1>
<br>
<h1 style="color: antiquewhite"> Local Time:::  <%= LocalTime.now()%></h1>
</body>
</html>

