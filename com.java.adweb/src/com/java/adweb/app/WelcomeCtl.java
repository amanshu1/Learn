package com.java.adweb.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/WelcomeCtl")
public class WelcomeCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public WelcomeCtl() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=(String)request.getAttribute("fname");
		request.setAttribute("name",name );
		RequestDispatcher rd=request.getRequestDispatcher("WelcomeView.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=(String)request.getAttribute("fname");
		request.setAttribute("name",name );
		RequestDispatcher rd=request.getRequestDispatcher("WelcomeView.jsp");
		rd.forward(request, response);
		}
}
