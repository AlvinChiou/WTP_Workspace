package servlet_examples;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.oreilly.servlet.MultipartRequest;

public class UploadTest extends HttpServlet {

  public void doPost(HttpServletRequest req, HttpServletResponse res)
                                throws ServletException, IOException {
    res.setContentType("text/html; charset=Big5");
    PrintWriter out = res.getWriter();

    try {
      // Blindly take it on faith this is a multipart/form-data request

      // Construct a MultipartRequest to help read the information.
      // Pass in the request, a directory to save files to, and the
      // maximum POST size we should attempt to handle.
      // Here we (rudely) write to the server root and impose 5 Meg limit.
      MultipartRequest multi =
           //new MultipartRequest(req, "." , 5000 * 1024 * 1024, "Big5");
    	  //new MultipartRequest(req, "C:/images" , 5 * 1024 * 1024, "Big5");
          //new MultipartRequest(req, "C:\\images" , 5 * 1024 * 1024, "Big5");
          //●注意以下為最佳解決方案. 但在Eclipse執行時要切記真實路徑兩邊不同步的問題. 而在外面Standalone的Tomcat執行時則無此問題
    	  new MultipartRequest(req, getServletContext().getRealPath("images") , 5 * 1024 * 1024, "Big5");
      /*
       * getServletContext().getRealPath("某資料夾名稱")
       * 某資料夾名稱必須先在專案底下建立，如此一來就是萬用目錄！
       * */

      out.println("<HTML>");
      out.println("<HEAD><TITLE>UploadTest</TITLE></HEAD>");
      out.println("<BODY>");
      out.println("<H1>UploadTest</H1>");

      // Print the parameters we received
      out.println("<H3>Params:</H3>");
      out.println("<PRE>");
      Enumeration params = multi.getParameterNames();
      while (params.hasMoreElements()) {
        String name = (String)params.nextElement();
        String value = multi.getParameter(name);
        out.println(name + " = " + value);
      }
      out.println("</PRE>");

      // Show which files we received
      out.println("<H3>Files:</H3>");
      out.println("<PRE>");
      Enumeration files = multi.getFileNames();
      while (files.hasMoreElements()) {
        String name = (String)files.nextElement();
        String filename = multi.getFilesystemName(name);
        String type = multi.getContentType(name);
        File f = multi.getFile(name);
        out.println("name: " + name);
        out.println("filename: " + filename);
        out.println("type: " + type);
        if (f != null) {
          out.println("length: " + f.length());
        }
        out.println();
      }
      out.println("</PRE>");
    }
    catch (Exception e) {
      out.println("<PRE>");
      e.printStackTrace(out);
      out.println("</PRE>");
    }
    out.println("</BODY></HTML>");
  }
}
