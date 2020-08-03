
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Attri extends HttpServlet {
@Override
public void doGet(HttpServletRequest req,HttpServletResponse res) {
res.setContentType("text/html");

	try {

final PrintWriter	a=res.getWriter();
final ServletContext b=getServletContext();
b.setAttribute("company", "IBM");
a.println("welcome");
a.println("<a href='servlet2'>visit</a>");

	}catch(final IOException e){

		e.printStackTrace();
	}

}
}
