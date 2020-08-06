import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookies2 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		res.setContentType("text/html");
		try {
			final PrintWriter a=res.getWriter();
			final Cookie[] ck=req.getCookies();
			a.print("name :"+ ck[0].getValue());
			a.print("password :"+ ck[1].getValue());


		}catch(final Exception e) {
			e.printStackTrace();
		}

}
}