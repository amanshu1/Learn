package com.java.adweb.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForgotPasswordCtl")
public class ForgotPasswordCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ForgotPasswordCtl() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email= request.getParameter("email");
	
	RegistrationBean bean = new RegistrationBean();
    RegistrationModal modal=new RegistrationModal();
    
    try {
		bean=modal.ForgotPassword(email);
		if(bean!= null) {
			request.setAttribute("pass",bean.getPassword());
			RequestDispatcher rd=request.getRequestDispatcher("ForgotPasswordView.jsp");
			rd.forward(request, response);
		}else {
			
			request.setAttribute("error", "user not found");
			RequestDispatcher rd=request.getRequestDispatcher("ForgotPasswordView.jsp");
			rd.forward(request, response);}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
