<%@ page import="java.sql.*" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%!
    Connection connection=null;
    Statement statement=null;
    ResultSet resultSet=null;
    String name;
    int rollNo;
    String brach;


%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Loading the driver is successfull");
        String url="jdbc:mysql://localhost:3306/abc";
        String username="root";
        String password="Udk@3654";
         connection= DriverManager.getConnection(url,username,password);
        System.out.println(connection.getClass().getName());
        statement=connection.createStatement();
       resultSet= statement.executeQuery("select * from student1;");
        while (resultSet.next()==true){
            name=resultSet.getString(1);
            rollNo=resultSet.getInt(2);
            brach=resultSet.getString(3);
        }
       resultSet.close();
       statement.close();
       connection.close();


    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
%>

<table  border="1">
    <tr>
    <th>Name</th>
        <th>Rollno</th>
        <th>Branch</th>
    </tr>
    <tr>
        <td>
            <%= name%>
        </td>

        <td>
            <%= rollNo%>
        </td>
        <td>
            <%= brach%>
        </td>
    </tr>
</table>
</body>
</html>