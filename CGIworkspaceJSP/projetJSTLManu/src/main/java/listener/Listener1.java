package listener;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;

import model.Personne;

/**
 * Application Lifecycle Listener implementation class Listener1
 *
 */
@WebListener
public class Listener1 implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public Listener1() {
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
    	System.out.println("coucou");

    	ArrayList<Personne> liste = new ArrayList<Personne>();
		liste.add(new Personne("aa", "bb"));
		liste.add(new Personne("cc", "cc"));
		liste.add(new Personne("ee", "ff"));
		liste.add(new Personne("gg", "hh"));
		
		ServletContext application = arg0.getServletContext();
		application.setAttribute("liste", liste);
    }
	
}
