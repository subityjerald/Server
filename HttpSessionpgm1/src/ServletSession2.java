import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ServletSession2 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		res.setContentType("text/html");
		try {
			final PrintWriter a=res.getWriter();

			final HttpSession b=req.getSession(false);
		final String f=(String)b.getAttribute("username");
		a.println("your name is :" + f);
		a.println("welcome to your profile!!!!");
			a.println("<b>HAVE FUN</b>");

		final RequestDispatcher c=req.getRequestDispatcher("use.html");
		c.include(req,res);
		}catch(final Exception e) {
			e.printStackTrace();
		}

}
}