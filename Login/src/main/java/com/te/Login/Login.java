package com.te.Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//resp.sendRedirect("https://www.youtube.com");
		//        PrintWriter writer = resp.getWriter();	
//        String uname = req.getParameter("nm");
//        String email = req.getParameter("em");
//        String phno = req.getParameter("no");
//        String password = req.getParameter("pw");
//        long phone = Long.parseLong(phno);
//        if(uname.equals("sujit")) {
//        resp.sendRedirect("http");	
//        }
//        Student student = new Student();
//        student.setName(uname);
//        student.setPassword(password);
//        student.setEmail(email);
//        student.setPhone_no(phone);
 //    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Students");
//       EntityManager em = emf.createEntityManager();
//        EntityTransaction transaction = em.getTransaction();
//        transaction.begin();
//        em.persist(student);
//        transaction.commit();
//	}

}
}