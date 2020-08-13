import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class rewritting1 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		res.setContentType("text/html");
		try {
				final PrintWriter a=res.getWriter();
				final String b=req.getParameter("uname");
                      final String c=req.getParameter("upass");
				a.print("your name is :" + b );
				a.print("your password is :" + c );
				a.print("<a href='serv2?username="+b+"&password="+c+ "'>visit </a>");

		}catch(final Exception e) {
			e.printStackTrace();
		}
	}

}
