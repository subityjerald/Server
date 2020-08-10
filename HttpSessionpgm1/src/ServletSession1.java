import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletSession1 extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		res.setContentType("text/html");
		try {

			final PrintWriter a=res.getWriter();
			final String name=req.getParameter("uname");
			final String password=req.getParameter("upass");
			a.println("hii! user WELCOME : "+  name ) ;
			a.println("your password" + password);
			final HttpSession b=req.getSession();
			if(password.equals("123")) {
				b.setAttribute("username",name);
				a.println("hii! user WELCOME : "+  name);
				final RequestDispatcher c=req.getRequestDispatcher("use.html");
				c.include(req,res);
				}else {
					final RequestDispatcher c1=req.getRequestDispatcher("use.html");
					c1.include(req,res);
					a.println("your password is incorrect plese enter correct password");
				}

		}catch(final Exception e) {
			e.printStackTrace();
		}
	}

}
