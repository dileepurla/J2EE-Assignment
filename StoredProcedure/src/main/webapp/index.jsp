<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="hello-servlet" method="post">
    <table>
<tr>
    <th>Salary</th>
    <td>
    <input type="text" name="salary" >
    </td>
</tr>
        <tr>
            <th>id</th>
            <td>
                <input type="number" name="id" >
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="submit" >
            </td>
        </tr>
    </table>
</form>
</body>
</html>