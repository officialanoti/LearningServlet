package demo;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		// Set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Using GET Method to Read Form Data";
		String docType =
		"<!doctype html public \"-//w3c//dtd html 4.0 " +
		"transitional//en\">\n";
		out.println(docType +
		"<html>\n" +
		"<head><title>" + title + "</title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n" + 
		"<ul> \n" + 
		" <li><b>First Name</b>: "
		+ request.getParameter("first_name") + "\n" + 
		" <li><b>Last Name</b>: "
		+ request.getParameter("last_name") + "\n" +
		"</ul>\n" +
		"</body></html>");
		
				}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
