import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
	res.setContentType("text/html");
	try {
			final PrintWriter a=res.getWriter();
			final HttpSession session=req.getSession(false);
			session.invalidate();

	a.println("you are sucessfully logged off " );
	}catch(final Exception e) {
		e.printStackTrace();
	}
	}

	}
