package com.java.adweb.app;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("*.do")
public class FrontCtl implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request =(HttpServletRequest) req;
		HttpServletResponse response=(HttpServletResponse) res;
		HttpSession = request.getSession();
		if(session.get)
		
		chain.doFilter(request, response);
	}

	public void destroy() {
	}
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
