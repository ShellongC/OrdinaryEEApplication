package com.moonstar.httpservice;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by shellong on 25/07/2017.
 */
public class HttpServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.write("Just a response from the server!");
        writer.print("Anything will be the evidence!");
        writer.flush();
        writer.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.write("Just a response from the server!");
        say();
        writer.flush();
        writer.close();
    }
    public void say(){
        int a = 10;
        System.out.println(a);
    }
}
