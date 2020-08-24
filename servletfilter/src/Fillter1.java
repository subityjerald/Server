import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Fillter1 extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		res.setContentType("text/html;charset UTF-8");
		try{
			final PrintWriter a=res.getWriter();
			final String b=req.getParameter("uname");
			a.println(b);
		}catch(final Exception e) {
			e.printStackTrace();
		}

	}

}
