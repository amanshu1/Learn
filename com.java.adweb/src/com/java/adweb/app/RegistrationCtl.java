package com.java.adweb.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistrationCtl")
public class RegistrationCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegistrationCtl() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username= request.getParameter("username");
		String fname= request.getParameter("fname");
		String lname= request.getParameter("lname");
		String email= request.getParameter("Email");
		String pwd= request.getParameter("pass");
		String date= request.getParameter("Date");
		String gender= request.getParameter("Gender");
		
	    RegistrationBean bean = new RegistrationBean();
	    bean.setUsername(username);
	    bean.setFirstName(fname);
	    bean.setLastName(lname);
	    bean.setEmail(email);
	    bean.setPassword(pwd);
	    bean.setDOB(date);
	    bean.setGender(gender);
	    if(username.isEmpty() && fname.isEmpty() && lname.isEmpty() && email.isEmpty() && pwd.isEmpty() && date.isEmpty() && gender == null ) {
	    	request.setAttribute("empty", "kindly enter username");
	    	request.setAttribute("empty1", "kindly enter firstname");
	    	request.setAttribute("empty2", "kindly enter lastname");
	    	request.setAttribute("empty3", "kindly enter email");
	    	request.setAttribute("empty4", "kindly enter password");
	    	request.setAttribute("empty5", "kindly enter date of birth");
	    	request.setAttribute("empty6", "kindly select gender");
	    	RequestDispatcher rd =request.getRequestDispatcher("RegistrationView.jsp");
	    	rd.forward(request, response);
	    }else if(username.isEmpty()) {
	    	request.setAttribute("empty", "kindly enter Username");
	    	RequestDispatcher rd =request.getRequestDispatcher("RegistrationView.jsp");
	    	rd.forward(request, response);
	    }else if(fname.isEmpty()) {
	    	request.setAttribute("empty1", "kindly enter Firstname");
	    	RequestDispatcher rd =request.getRequestDispatcher("RegistrationView.jsp");
	    	rd.forward(request, response);
	    }else if(lname.isEmpty()) {
	    	request.setAttribute("empty2", "kindly enter Lastname");
	    	RequestDispatcher rd =request.getRequestDispatcher("RegistrationView.jsp");
	    	rd.forward(request, response);
	    }else if(email.isEmpty()) {
	    	request.setAttribute("empty3", "kindly enter email");
	    	RequestDispatcher rd =request.getRequestDispatcher("RegistrationView.jsp");
	    	rd.forward(request, response);
	    }else if(pwd.isEmpty()) {
	    	request.setAttribute("empty4", "kindly enter password");
	    	RequestDispatcher rd =request.getRequestDispatcher("RegistrationView.jsp");
	    	rd.forward(request, response);
	    }else if(date.isEmpty()) {
	    	request.setAttribute("empty5", "kindly enter date of birth");
	    	RequestDispatcher rd =request.getRequestDispatcher("RegistrationView.jsp");
	    	rd.forward(request, response);
	    }else if(gender==null) {
	    	request.setAttribute("empty6", "kindly select gender");
	    	RequestDispatcher rd =request.getRequestDispatcher("RegistrationView.jsp");
	    	rd.forward(request, response);
	    }
	    /*String user1 = "^[A-Za-z]\\w{5,29}$";
	    if(username!= null) {
	    	if(!username.matches(user1)) {
	    		request.setAttribute("empty", "kindly enter Username");
		    	RequestDispatcher rd =request.getRequestDispatcher("RegistrationView.jsp");
		    	rd.forward(request, response);
	    	}
	    }
	    String fname1 = "^(?=.*[a-z]){5,29}$";
	    if(fname!= null) {
	    	if(!fname.matches(fname1)) {
	    		request.setAttribute("empty1", "kindly enter Firstname");
		    	RequestDispatcher rd =request.getRequestDispatcher("RegistrationView.jsp");
		    	rd.forward(request, response);
	    	}
	    }
	    String lname1 = "^(?=.*[a-z]){5,29}$";
	    if(lname!= null) {
	    	if(!lname.matches(lname1)) {
	    		request.setAttribute("empty2", "kindly enter Lastname");
		    	RequestDispatcher rd =request.getRequestDispatcher("RegistrationView.jsp");
		    	rd.forward(request, response);
	    	}
	    }
	    String email1="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
	    if(email!= null) {
	    	if(!email.matches(email1)) {
	    		request.setAttribute("empty3", "kindly enter email");
		    	RequestDispatcher rd =request.getRequestDispatcher("RegistrationView.jsp");
		    	rd.forward(request, response);
	    	}
	    }
	    String pass1 = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
	    if(pwd!= null) {
	    	if(!pwd.matches(pass1)) {
	    		request.setAttribute("empty4", "kindly enter password");
		    	RequestDispatcher rd =request.getRequestDispatcher("RegistrationView.jsp");
		    	rd.forward(request, response);
	    	}
	    }
	    String dob1 ="^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$";
	    if(date!= null) {
	    	if(!date.matches(dob1)) {
	    		request.setAttribute("empty5", "kindly enter date of birth");
		    	RequestDispatcher rd =request.getRequestDispatcher("RegistrationView.jsp");
		    	rd.forward(request, response);
	    	}
	    }
	    */
		
	    RegistrationModal modal=new RegistrationModal();
	    try {
		if(bean!=null) {
			modal.add(bean);
			request.setAttribute("sure", "succesfully registered!!");
	    	RequestDispatcher rd =request.getRequestDispatcher("RegistrationView.jsp");
	    	rd.forward(request, response);
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
