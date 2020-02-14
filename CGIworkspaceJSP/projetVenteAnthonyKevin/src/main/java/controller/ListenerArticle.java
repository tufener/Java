package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import model.Article;

/**
 * Application Lifecycle Listener implementation class ListenerArticle
 *
 */
@WebListener
public class ListenerArticle implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public ListenerArticle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	dao.DAOArticle d = new dao.DAOArticle();
		ArrayList<Article> liste = null;
		try {
			liste = d.selectAll();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (liste != null) {
			ServletContext application = arg0.getServletContext();
			application.setAttribute("listeArticle", liste);
			System.out.println(liste.size());
			for (Article a : liste)
				System.out.println(a.getImg());
			
		}
    }

}
