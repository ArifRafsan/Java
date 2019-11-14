package com.rafsan.basic.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParameterServlet
 */
@WebServlet("/ParameterServlet")
public class ParameterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParameterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//url : http://localhost:8080/jsp-servlet-hibernate/ParameterServlet
		//response.getWriter().print("rafsan.org");
		
		// url : http://localhost:8080/jsp-servlet-hibernate/ParameterServlet?getValue1=testParameter
		//response.getWriter().print(request.getParameter("getValue1"));
		
		//for multiple parameter
		PrintWriter out = response.getWriter();
		out.println("Value 1: "+request.getParameter("getValue1"));
		out.println("Value 2: "+request.getParameter("getValue2"));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
