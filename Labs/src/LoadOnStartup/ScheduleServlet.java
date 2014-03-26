package LoadOnStartup;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ScheduleServlet extends HttpServlet {
       
	int count;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		count++;
		
	}
	public void init() throws ServletException{
		//String initial = getInitParameter("initial");
		Calendar  cal = new GregorianCalendar(2014, Calendar.MARCH, 7, 0, 0, 0);
		
	}

}
