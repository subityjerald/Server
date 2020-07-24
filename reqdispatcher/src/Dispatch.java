import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

public class Dispatch extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res)
			throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter a=res.getWriter();
		String name=req.getParameter("uname");
		a.println("name");
		 a.print(" Welcome to Beginnersbook.com"); 
		}
			}
