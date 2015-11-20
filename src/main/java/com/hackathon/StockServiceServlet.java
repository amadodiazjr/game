package com.hackathon;

import org.eclipse.jetty.websocket.servlet.WebSocketServlet;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;
 
public class StockServiceServlet extends WebSocketServlet {
 
	private static final long serialVersionUID = 1L;

    @Override
    public void configure(WebSocketServletFactory factory) {
    	System.out.println("DUDE WTF");
        factory.register(StockServiceWebSocket.class);
    }
   
}