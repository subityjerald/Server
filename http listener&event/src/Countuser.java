import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
public class Countuser implements HttpSessionListener {
	ServletContext c;
	int current,total;

		@Override
		public void sessionCreated(HttpSessionEvent e) {
			total++;
			current++;
			c=e.getSession().getServletContext();
			c.setAttribute("totaluser", total);
			c.setAttribute("currentuser", current);

		}
		@Override
		public void sessionDestroyed(HttpSessionEvent e)	{
			current--;
			c.setAttribute("currentuser", current);
		}

	}