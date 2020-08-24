import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Firsty implements 	Filter {
	@Override
	public void init(FilterConfig a) throws 	ServletException{}
	@Override
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain) {
		try {
			final PrintWriter c=res.getWriter();
		final String b=req.getParameter("upass");
		if(b.equals("1234") ) {
			chain.doFilter(req, res );
		}else {
			c.println("<font color=green> incorrect password.</font>");
			final RequestDispatcher rd=req.getRequestDispatcher("Filter.html");
			rd.include(req,res);
		}
		}catch(final Exception e) {
			e.printStackTrace();
		}
	}


}
