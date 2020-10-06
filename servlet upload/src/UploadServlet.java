import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
public class UploadServlet extends HttpServlet{
	@Override
	public  void doPost (HttpServletRequest req,HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
final PrintWriter a=res.getWriter();
new MultipartRequest(req,"G:\\image");
a.println("successfully uploaded");
	}

}