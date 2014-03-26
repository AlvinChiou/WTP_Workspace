package servlet_examples;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hello extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		req.setCharacterEncoding("Big5");
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		//�H�U�P�_name�O�_���ŭȡA�p�G�O���ܰ��X�h���ťթγ���
		
		if(name.trim().isEmpty()){
			name = "��줣�o����";
		}
		
		//String name2 = new String(name.getBytes("ISO-8859-1"), "Big5"); 
		//When the Form Method is GET, Line 21 must be used. 
		//And Output variable must be change.
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Hello, " + name + "</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("Hello, �A�n: " + name);
		out.println("</BODY></HTML>");
	}

	public String getServletInfo() {
		return "A servlet that knows the name of the person to whom it's"
				+ "saying hello";
	}
}
