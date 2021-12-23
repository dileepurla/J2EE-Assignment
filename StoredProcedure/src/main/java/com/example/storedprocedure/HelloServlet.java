package com.example.storedprocedure;

import java.io.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        int lit;
        String sal = request.getParameter("salary");
        int id = Integer.parseInt(request.getParameter("id"));
        String url = "jdbc:mysql://localhost/abc";
        String username = "root";
        String password = "Udk@3654";
        PrintWriter out = response.getWriter();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            CallableStatement cst = connection.prepareCall("{call updateSalary(?,?)}");
            cst.setInt(1, Integer.parseInt(sal));
            cst.setInt(2, Integer.parseInt(String.valueOf(id)));
            lit = cst.executeUpdate();


            if (lit > 0) {

                Statement st = connection.createStatement();
                ResultSet result = st.executeQuery("select * from employee where id=" + id);

                while (result.next()) {

                    int empId = result.getInt(1);
                    String empName = result.getString(2);
                    int updatedEmpSalary = result.getInt(3);

                    out.println("<body><h3>EMPLOYEE ID: </h3><p>" + empId +
                            "</p> <h3>EMPLOYEE NAME: </h3><p>" + empName +
                            "</p> <h3>SALARY UPDATED TO: <p>" + updatedEmpSalary +
                            "</p>" + "</body>");
                }
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



    }
}