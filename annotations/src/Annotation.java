import java.io.PrintWriter;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/Annotation",initParams= {
@WebInitParam(name="chocolate",value="kitkat"),
@WebInitParam(name="pets",value="dogs")
},loadOnStartup=1)

public class Annotation extends HttpServlet {
@Override
public void doGet(HttpServletRequest req,HttpServletResponse res) {
	res.setContentType("text/html");
	try {
		final PrintWriter a=res.getWriter();
		a.println("<html><body>");
		a.println(getInitParameter("chocolate"));
		a.println(getInitParameter("pets"));
		a.println("<i>kitkat</i>");
		a.println("</html></body>");

	}catch(final Exception e) {
		e.printStackTrace();
	}
}

}
