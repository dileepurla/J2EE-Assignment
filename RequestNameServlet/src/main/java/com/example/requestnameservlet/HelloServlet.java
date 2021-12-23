package com.example.requestnameservlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/first")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "First Servlet";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        String  name=request.getParameter("name" );
//        String name=request.
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<table border=1> <tr> <th>Name :::</th> <td> "+  name  +"</tr> </table>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}