import java.io.IOException;   
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;

public class Context extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse res)
  throws ServletException,IOException{
	res.setContentType("text/html");
	PrintWriter a=res.getWriter();
	ServletContext b=getServletContext();
	String c=b.getInitParameter("msg");
	a.println("the message is :" +c);
	
}
	
}
