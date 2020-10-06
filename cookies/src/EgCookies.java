
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EgCookies")
public class EgCookies extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
res.setContentType("text/html");
final Cookie cookie=new Cookie("testcookies","123");
cookie.setMaxAge(3600);
cookie.setComment("cookie cookieeeee");
cookie.setSecure(false);

cookie.setValue("344");
cookie.setPath("/FinalCokkiesEg");
cookie.setVersion(0);
res.addCookie(cookie);
final PrintWriter a=res.getWriter();
a.print("<html><head></head><body>");
final Cookie ck[]=req.getCookies();
if(ck == null) {
	a.print("<p> cookies not found </p></html></body>");
}else {
	a.print("<p> welcome again...cookies found</p>");
	for(int i=0;i<ck.length;i++) {
		a.print("<p> value:" + ck[i].getValue()+"</p>");
		a.print("<p>value:"+ ck[i].getName()+"</p>");
		a.print("<p>value:"+ ck[i].getSecure()+"</p>");
         a.print("<p>Name :" + ck[i].getPath() + "</p>");
         a.print("<p>Max Age :" + ck[i].getMaxAge() + "</p>");
         a.print("<p>Comment :" + ck[i].getComment() + "</p>");
         a.print("<p>Version :" + ck[i].getVersion() + "</p>");
	}
	a.print("<body></html>");
}
	}

}