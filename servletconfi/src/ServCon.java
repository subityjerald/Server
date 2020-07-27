import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletConfig;
import java.util.Enumeration;


public class ServCon extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) 
	throws IOException,ServletException{
		res.setContentType("text/html");
		PrintWriter a=res.getWriter();
		ServletConfig b=getServletConfig();
		String d;
		Enumeration<String> c=b.getInitParameterNames();
		while(c.hasMoreElements()) {
	d=c.nextElement();
	a.println("<br>" +d);
	a.println(b.getInitParameter(d));
}
	}
}
