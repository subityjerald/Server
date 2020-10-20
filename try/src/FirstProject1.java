import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class FirstProject1 extends HttpServlet {
	@Override
	public  void doGet(HttpServletRequest req,HttpServletResponse res) {
		res.setContentType("text/html");
		try {
		final PrintWriter a=res.getWriter();
		final String name=req.getParameter("uname");
	final String password=req.getParameter("upass");
	Class.forName("com.mysql.jdbc.Driver");
	final Connection con=DriverManager.getConnection
			("jdbc:mysql://localhost:3306/shopping1","root","dairymilk");
	final Statement st=con.createStatement();
	final ResultSet rs=st.executeQuery("SELECT products FROM cart WHERE cost=300");
	rs.next();
	final String pname=rs.getString("products");
	a.print(pname);
	if(name.length()<5&& password.equals("6789")) {
a.print("welcome user :"+" "+ name);


con.close();
	}else {
		a.println("incorrect username or password");
	}
		}catch(final Exception e) {
			e.printStackTrace();
		}
	}






}