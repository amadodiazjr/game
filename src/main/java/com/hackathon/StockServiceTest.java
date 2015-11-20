package com.hackathon;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class StockServiceTest {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
 
        ServletContextHandler ctx = new ServletContextHandler();
        ctx.setContextPath("/");
        ctx.addServlet(HelloWorldServlet.class, "/game");
        ctx.addServlet(PushServlet.class, "/push");
        ctx.addServlet(StockServiceServlet.class, "/stocks");
 
        server.setHandler(ctx);
 
        server.start();
        server.join();
    }
 
}