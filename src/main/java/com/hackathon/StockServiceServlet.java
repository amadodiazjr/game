package com.hackathon;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.websocket.servlet.WebSocketServlet;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;
 
public class StockServiceServlet extends WebSocketServlet {
 
	private static final long serialVersionUID = 1L;

    @Override
    public void configure(WebSocketServletFactory factory) {
    	System.out.println("DUDE WTF");
        factory.register(StockServiceWebSocket.class);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    	throws ServletException, IOException {	
    }
   
}
