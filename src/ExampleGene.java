

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;



public class ExampleGene extends GenericServlet {
public void service(ServletRequest req, ServletResponse res)
		throws ServletException, IOException {
	res.setContentType("text/html");
	PrintWriter a=res.getWriter();
	a.print("<html>");
	a.print("<body>");
	a.print("<h2> exampleofgeneric </h2>");
	a.print("<p> hiiii </p>");
	a.print("</html>");
	a.print("</body>");
}


}
