import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Sendredirect extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		res.setContentType("text/html");
		try {

				final String b=req.getParameter("uname");
				res.sendRedirect("https://www.amazon.co.in/#q"+ b);
		}catch(final Exception e) {
			e.printStackTrace();
		}
	}


}
