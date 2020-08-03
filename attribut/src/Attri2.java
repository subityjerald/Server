
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Attri2 extends HttpServlet {
@Override
public void doGet(HttpServletRequest req,HttpServletResponse res) {
	res.setContentType("text/html");

	try {
	 final PrintWriter a = res.getWriter();
	 final ServletContext b=getServletContext();
	 final String c=(String) b.getAttribute("company");
		a.println("WElcome to" + c);
a.close();
		}catch(final IOException e) {
			e.printStackTrace();
	}

}
}

