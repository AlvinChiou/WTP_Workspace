package servlet_examples;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class SimpleCounter extends HttpServlet {

	int count = 0;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/plain");
		PrintWriter out = res.getWriter();
		synchronized (this) {
			count++;

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			out.println("Since loading, this servlet has been accessed "
					+ count + " times.");
		}
	}
}
