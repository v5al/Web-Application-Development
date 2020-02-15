
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class FirstServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("user");
        if(user.trim().equals("Visal")){
            HttpSession hs = request.getSession();
            hs.setAttribute("user",user);
            RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
            rd.forward(request,response);
        }else{
            response.sendRedirect("index.jsp");
        }
    }
}
