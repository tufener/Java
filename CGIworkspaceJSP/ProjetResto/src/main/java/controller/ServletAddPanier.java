package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAOArticle;
import dao.DAOClient;
import model.Article;
import model.Client;

/**
 * Servlet implementation class ServletAddPanier
 */
@WebServlet("/ServletAddPanier")
public class ServletAddPanier extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletAddPanier() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");

		int id = Integer.parseInt(request.getParameter("id"));
		ArrayList<Article> aList = new ArrayList<Article>();
		ServletContext context = getServletContext();
		aList = (ArrayList<Article>) context.getAttribute("listeArticles");
		int numberArticle = (int) context.getAttribute("numberArticle");
		numberArticle += 1;
		context.setAttribute("numberArticle", numberArticle);
		for (Article article : aList) {
			if (article.getId() == id) {
				HttpSession session = request.getSession();
				ArrayList<Article> panier = (ArrayList<Article>) session.getAttribute("panier");
				if (panier != null) {
					panier.add(article);
					session.setAttribute("panier", panier);
					
				}
			}
		}
		rd.forward(request, response);
	}

}
