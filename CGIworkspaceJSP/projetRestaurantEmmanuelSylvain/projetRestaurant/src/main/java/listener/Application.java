package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import java.sql.SQLException;
import java.util.*;
import model.*;
import dao.*;

/**
 * Application Lifecycle Listener implementation class Application
 *
 */
@WebListener
public class Application implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public Application() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	ServletContext application = arg0.getServletContext();
    	ArrayList<Article> carte = new ArrayList<Article>();
    	DaoArticle d = new DaoArticle();
    	try {
			carte = d.findAll();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		application.setAttribute("carte", carte);
    }
	
}
