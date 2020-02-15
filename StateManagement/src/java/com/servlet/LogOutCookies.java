/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogOutCookies extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException , NullPointerException {
        Cookie[] cookies = request.getCookies();
        if(cookies.length==0){
            response.sendRedirect("NewServlet");
        }else{
            for(Cookie ck:cookies){
                ck.setValue(null);
                ck.setMaxAge(0);
                response.addCookie("null");
            }
//            PrintWriter out = response.getWriter();
//            out.println("");
            response.sendRedirect("NextServlet");
        }
    }
}
