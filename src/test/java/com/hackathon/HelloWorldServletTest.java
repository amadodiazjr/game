package com.hackathon;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldServletTest {

	@Test
    public void constructorTest() {
		// ~given
		HelloWorldServlet servlet = null;
		
		// ~when
		servlet = new HelloWorldServlet();
		
		// ~then
		assertTrue(servlet != null);
    }
}
