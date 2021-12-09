package com.java.adweb.app;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentCtl")
public class StudentCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public StudentCtl() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Student bean=new Student();
		bean.setId(Integer.parseInt(request.getParameter("Id")));
		bean.setRollNo(request.getParameter("RollNo"));
		bean.setFirstName(request.getParameter("FirstName"));
		bean.setLastName(request.getParameter("LastName"));
		bean.setSession(request.getParameter("Session"));
		String operation = request.getParameter("operation");
		StudentModal modal = new StudentModal();
		if(operation.equals("add")) {
			try {
				modal.add(bean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(operation.equals("update")) {
			try {
				modal.update(bean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(operation.equals("delete")) {
			try {
				modal.delete(bean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student bean=new Student();
		StudentModal modal = new StudentModal();
		try {

			String rollno = request.getParameter("btn");
			
			String btntype = request.getParameter("op");
			
			
			
			if (btntype.equals("search")) {
				if(rollno!=null) {
					bean = modal.getRollNo(rollno);
					request.setAttribute("Search", bean);
					RequestDispatcher rd1 = request.getRequestDispatcher("search.jsp");
					rd1.forward(request, response);
				}
				
			}

			else if (btntype.equals("list")) {
				ArrayList<Student> beanList = modal.listAll();
				request.setAttribute("List", beanList);
				RequestDispatcher rd = request.getRequestDispatcher("listStudent.jsp");
				rd.forward(request, response);
			}	
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
