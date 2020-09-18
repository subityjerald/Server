import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {

		res.setContentType("text/html");
	try {
			final PrintWriter a=res.getWriter();
			final String n=req.getParameter("username");
			a.println("Welcome!!! "+ n);

			final HttpSession session=req.getSession();
			session.setAttribute("usname", n);

			final ServletContext ctx=getServletContext();
		final int d=(int) ctx.getAttribute("totaluser");
		final int e= (int)ctx.getAttribute("currentuser");
		a.println("totaluser : " + d);
		a.println("currentuser : " + e);
		a.println("<a href='logout'>logout</a>");
	}catch(final Exception e) {
		e.printStackTrace();

	}
	}

	}
