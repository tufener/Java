package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoArticleJdbc;
import model.Article;

@WebServlet(name = "ServletPanierCommande")
public class ServletPanier extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			request.setAttribute("articles", this.retrieveArticlesFromDb());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("montantTotal", this.getMontantTotal(request));
		request	.getRequestDispatcher("panier.jsp")
				.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("articleSelect"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		Article chosenArticle = null;
		try {
			chosenArticle = this.findArticleById(id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request = this.addToCart(request, chosenArticle, quantity);
		doGet(request, response);
	}

	private List<Article> retrieveArticlesFromDb() throws ClassNotFoundException, SQLException {
		List<Article> articles = new DaoArticleJdbc().find();
		return articles;
	}

	private Article findArticleById(int id) throws ClassNotFoundException, SQLException {
		return new DaoArticleJdbc().findById(id);
	}

	private HttpServletRequest addToCart(HttpServletRequest request, Article article, int quantity) {
		HashMap<Article, Integer> map = (HashMap<Article, Integer>) request	.getSession()
																			.getAttribute("panier");
		if (map.containsKey(article)) {
			int originalQuantity = map.get(article);
			map.replace(article, (originalQuantity + quantity));
		} else {
			map.put(article, quantity);
		}
		request	.getSession()
				.setAttribute("panier", map);
		return request;
	}

	private double getMontantTotal(HttpServletRequest request) {
		double total = 0.0;
		HashMap<Article, Integer> map = (HashMap<Article, Integer>) request	.getSession()
																			.getAttribute("panier");
		if (map != null) {
			for (Map.Entry<Article, Integer> entry : map.entrySet()) {
				total += entry	.getKey()
								.getPrix()
						* entry.getValue();
			}
		}
		return total;
	}

}
