import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Httpserv extends HttpServlet{
	
	
	public String message;
public void init() throws ServletException{
message="hello";
}

public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
	res.setContentType("text/html");
	PrintWriter a=res.getWriter();
	a.println("<h1>"+ "Http"+ "</h1>");
	a.println("<p> hello </p>");
	
}
public void destroy() {
	
}

}
