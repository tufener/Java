package listener;

import java.util.HashMap;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import model.Article;

@WebListener()
public class ListenerPanier implements HttpSessionListener {

	// Public constructor is required by servlet spec
	public ListenerPanier() {
	}

	public void sessionCreated(HttpSessionEvent se) {
		HashMap<Article, Integer> panier = new HashMap<>();
		se	.getSession()
			.setAttribute("panier", panier);
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		/* Session is destroyed. */
	}

}
