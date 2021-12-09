package com.java.adweb.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginCtl")
public class LoginCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginCtl() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		session.setAttribute("email", "email");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RegistrationBean bean = new RegistrationBean();
		RegistrationModal modal = new RegistrationModal();
		String s =request.getParameter("email");
		String s1= request.getParameter("Pass");
		
		if(s.isEmpty()&& s1.isEmpty()) {
			request.setAttribute("empty", "kindly enter email");
	    	request.setAttribute("empty1", "kindly enter password");
		}else if(s.isEmpty()) {
			request.setAttribute("empty", "kindly enter email");
	    	RequestDispatcher rd =request.getRequestDispatcher("LoginView.jsp");
	    	rd.forward(request, response);
		}else if(s1.isEmpty()) {
			request.setAttribute("empty1", "kindly enter password");
	    	RequestDispatcher rd =request.getRequestDispatcher("LoginView.jsp");
	    	rd.forward(request, response);
		}
		/*String email1="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
	    if(s!= null) {
	    	if(!s.matches(email1)) {
	    		request.setAttribute("empty", "kindly enter email");
		    	RequestDispatcher rd =request.getRequestDispatcher("LoginView.jsp");
		    	rd.forward(request, response);
	    	}
	    }
	    String pass1 = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
	    if(s1!= null) {
	    	if(!s1.matches(pass1)) {
	    		request.setAttribute("empty1", "kindly enter password");
		    	RequestDispatcher rd =request.getRequestDispatcher("LoginView.jsp");
		    	rd.forward(request, response);
	    	}
	    }*/
		//bean.setEmail(request.getParameter("email"));
		//bean.setPassword(request.getParameter("Pass"));
	/*	HttpSession session = request.getSession(true);
		session.setAttribute("email", "email");
		session.setAttribute("password", "Pass");*/
		try {
		//RegistrationBean bean7 = modal.authenticate(bean.getEmail(), bean.getPassword());
			bean = modal.authenticate(s, s1);
			
			if (bean != null) {
				HttpSession session =request.getSession();
				request.setAttribute("fname", bean.getFirstName());
				session.setAttribute("user", bean.getFirstName());
				
				RequestDispatcher rd = request.getRequestDispatcher("/WelcomeCtl");
				rd.forward(request, response);
			} else {
				System.out.println("no bean data else condition");
				request.setAttribute("error", "invalid username and password");
				RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
