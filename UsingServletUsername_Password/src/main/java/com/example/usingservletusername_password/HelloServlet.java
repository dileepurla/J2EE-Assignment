package com.example.usingservletusername_password;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = " ";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        request.setAttribute("username",username);
        request.setAttribute("password",password);
        if (username.equalsIgnoreCase("sachin")&&password.equals("tendulkar"))
        {
            message+="validate username and Password";
        }
        else
        {
            message+="invalid username and password";
        }
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}