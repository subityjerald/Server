import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Httpsession1 extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		res.setContentType("text/html");
		try {
			final PrintWriter a=res.getWriter();
			final String name=req.getParameter("uname");
			final String password=req.getParameter("upass");
			a.println("hii"+ name);
			a.println("your password"+ password);
			final HttpSession b=req.getSession();
			b.setAttribute("uname",name);
			b.setAttribute("upassword",password);
			a.print("<a href='visit'>click here</a>");
		}catch(final Exception e) {
			e.printStackTrace();
		}
	}

}
