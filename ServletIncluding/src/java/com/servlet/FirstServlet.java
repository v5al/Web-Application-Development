/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String user = request.getParameter("user");
       PrintWriter pw = response.getWriter();
       pw.println("Hello from First Servlet");
       if(user.trim().equals("Visal")){
           RequestDispatcher rd = request.getRequestDispatcher("newjsp.jsp");
           rd.include(request,response);
       }
    }
}

