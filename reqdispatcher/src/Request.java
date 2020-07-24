import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;


public class Request extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter a=res.getWriter();
		String name=req.getParameter("uname");
		String pass=req.getParameter("upass");
		if(name.equals("asd") && pass.equals("mango")) {
			RequestDispatcher b=req.getRequestDispatcher("welcome");
			b.forward(req,res);
		}else {
			a.print("User name or password is incorrect!");    
			RequestDispatcher b=req.getRequestDispatcher("Req.html");
			b.include(req,res);
		}
	}

}
