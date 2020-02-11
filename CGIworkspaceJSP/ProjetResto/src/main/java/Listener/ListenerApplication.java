package Listener;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import dao.DAOArticle;
import model.Article;

/**
 * Application Lifecycle Listener implementation class ListenerApplication
 *
 */
@WebListener
public class ListenerApplication implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public ListenerApplication() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent arg0) {
		ArrayList<Article> list = new ArrayList<Article>();
		DAOArticle dao = new DAOArticle();
		try {
			list = dao.getAll();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		arg0.getServletContext().setAttribute("listeArticles", list);
		arg0.getServletContext().setAttribute("numberArticle", 0);

	}

}
