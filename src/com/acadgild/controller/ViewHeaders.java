/*
* Student: Eduardo Aguirre
* Session 9
* Assignment 1
* Servlet that gets the HTTP Header of the Client.
* Formats the information in Table
*/


package com.acadgild.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ViewHeaders
 */
@WebServlet("/ViewHeaders")
public class ViewHeaders extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");  //Defines content Format
		PrintWriter out = response.getWriter();
		Enumeration <String> e = request.getHeaderNames();  //Stores header information in a String
		    out.println ("<html>");
		    out.println ("<body bgcolor=FAF8F8>");
		    out.println ("<center>");
		    out.println("<h1>HTTP Header Request Example</h1>");
		    
		    //Table to show the HTTP Header
		    out.println("<table BORDER=1 CELLPADDING=0 CELLSPACING=0 WIDTH=100% >");
		    out.println("<tr bgcolor=B2B0B0>");
			out.println("<th align=\"centre\">Header Name</th>");
			out.println("<th align=\"centre\">Header Value(s)</th>");
			out.println("</tr>");
		    
		    //Stores HHTP Header Elements as long as there a more Elements 
			while (e.hasMoreElements())
			{
				String hName  = e.nextElement(); //Stores HHTP Header Element Name
				String hValue = request.getHeader(hName); //Stores HHTP Header Element
				out.println("<tr>");
				out.print("<td>"+hName+"</td>");
				out.print("<td>"+hValue+ "</td>");
				out.println("</tr>");
	
			}
			
			out.println("</table>");
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
			
		
	}

}
