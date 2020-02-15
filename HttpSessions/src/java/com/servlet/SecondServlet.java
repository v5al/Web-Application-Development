
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession hs = request.getSession();
        String user = (String) hs.getAttribute("user");
        PrintWriter out = response.getWriter();
        out.println("Welcome "+user);
        out.println("<a href='LogOutSession'>LogOut</a>");
    }
}
