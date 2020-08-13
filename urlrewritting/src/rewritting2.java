import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class rewritting2 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		res.setContentType("text/html");
		try {
		final PrintWriter a=res.getWriter();
		final String usern=req.getParameter("username");
		final String userp=req.getParameter("password");
		a.println(usern);
		a.println(userp);
		}catch(final Exception e) {
			e.printStackTrace();
		}
	}


}
