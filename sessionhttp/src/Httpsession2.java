import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




public class Httpsession2 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		res.setContentType("text/html");
		try {
			final PrintWriter a=res.getWriter();
			final HttpSession b=req.getSession(false);
			final String username=(String) b.getAttribute("uname");
			final String userPassword=(String) b.getAttribute("upassword");
			a.println("name : " +username +"password :" +userPassword);



}catch(final Exception e) {
	e.printStackTrace();
}


	}
}