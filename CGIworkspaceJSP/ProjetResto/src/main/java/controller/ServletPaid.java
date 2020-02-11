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

import dao.DAOCommande;
import model.Article;
import model.Client;

/**
 * Servlet implementation class ServletPaid
 */
@WebServlet("/ServletPaid")
public class ServletPaid extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPaid() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");

		int tot = Integer.parseInt(request.getParameter("total"));
		HttpSession session = request.getSession();
		Client client = (Client) session.getAttribute("Auth");
		int id = client.getId();
		DAOCommande c = new DAOCommande();
		
		try {
			c.create(id, tot);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Article> panier = (ArrayList<Article>) session.getAttribute("panier");
		panier.clear();
		session.setAttribute("panier", panier);
		ServletContext context = getServletContext();
		int articlePanier = (int) context.getAttribute("numberArticle");
		articlePanier = 0;
		context.setAttribute("numberArticle", articlePanier);
		
		rd.forward(request, response);
	}

}
