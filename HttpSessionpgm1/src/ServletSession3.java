import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class ServletSession3 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		res.setContentType("text/html");
		try {
			final PrintWriter a=res.getWriter();
			a.println("you have been successfully logged out");
			a.println("<br>");
			a.println("plz login if you want to enter your profile");
final HttpSession b=req.getSession();
b.invalidate();

}catch(final Exception e) {
	e.printStackTrace();
}
}
}