import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class InterfaceTry implements Servlet{
   ServletConfig config=null;
   public void init(ServletConfig config){
      this.config=config;
      System.out.println("Initialization complete");
   }

   public void service(ServletRequest req,ServletResponse res)
   throws IOException,ServletException{
       res.setContentType("text/html");
       PrintWriter pwriter=res.getWriter();
       pwriter.print("<html>");
       pwriter.print("<body>");
       pwriter.print("<h1>Servlet Example Program</h1>");
       pwriter.print("</body>");
       pwriter.print("</html>");
   }
   public void destroy(){
       System.out.println("servlet life cycle finished");
   }
   public ServletConfig getServletConfig(){
       return config;
   }
   public String getServletInfo(){
       return "A Demo program written by Chaitanya";
   }
}
