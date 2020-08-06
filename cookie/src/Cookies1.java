import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookies1 extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		res.setContentType("text/html");
		try {
			final PrintWriter a=res.getWriter();
			final String name=req.getParameter("uname");
			final String password=req.getParameter("pwd");
			a.print("hello:" + name);
			a.print("password" +password);
			final Cookie ck=new Cookie("username",name);
			final Cookie ck1=new Cookie("upassword",password);

			res.addCookie(ck);
			res.addCookie(ck1);
			a.println("<a href='visit'>view details</a>");
			a.close();
		}catch(final Exception e) {
			e.printStackTrace();
		}

	}

}
