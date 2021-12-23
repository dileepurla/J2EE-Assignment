<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%--<h1><%= "Hello World!" %>--%>
</h1>
<br/>
<form method="get" action="first">
    <table>
        <tr>
            <th>Name</th>
            <td>
                <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td>
            <input type="submit" value="submit">
            </td>
        </tr>
    </table>
</form>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
</body>
</html>