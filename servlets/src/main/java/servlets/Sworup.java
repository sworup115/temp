package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Sworup implements Servlet{

	public void init(ServletConfig config) throws ServletException {
		
	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter writer = res.getWriter();
		writer.println("manju is a good boy");
	}

	public String getServletInfo() {
		return null;
	}

	public void destroy() {
		
	}
	

}
