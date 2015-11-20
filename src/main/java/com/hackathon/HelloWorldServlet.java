package com.hackathon;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {
    	
    	final String message = req.getParameter("message");
    	StockService.MESSAGES.add(message);
        resp.getOutputStream().write("Hello World.".getBytes());
    }
}