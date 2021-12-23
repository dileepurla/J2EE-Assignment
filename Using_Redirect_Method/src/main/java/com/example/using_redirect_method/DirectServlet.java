
package com.example.responseservlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "DirectServlet", value = "/direct")
public class DirectServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "DirectServlet page!!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<table border=1> <tr><th>CSK<th> <td>Dhoni</td>");
        out.println(" <tr><th>MI<th> <td>ROHITH</td> ");
        out.println(" <tr><th>DC<th> <td>PANT</td> ");
        out.println(" <tr><th>RCB<th> <td>KOHLI</td>");
        out.println(" <tr><th>KKR<th> <td>MORGAN</td> </table>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
