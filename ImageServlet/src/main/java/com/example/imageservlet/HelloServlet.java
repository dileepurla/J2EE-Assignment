package com.example.imageservlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
//        out.print("Do the logic first...dont call me until then!!:>)");

        out.println("<body><div><img src=https://images.unsplash.com/photo-1577069861033-55d04cec4ef5?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8cmFzcGJlcnJ5fGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&w=1000&q=80></div></body>");
//        if(file=="apples.html") {

//            out.println("<img src=https://apples.jpg>");
//        } else if (file=="peaches.html") {
//            out.println("<img src=https://peaches.jpg>");
//        }

    }




    public void destroy() {
    }
}