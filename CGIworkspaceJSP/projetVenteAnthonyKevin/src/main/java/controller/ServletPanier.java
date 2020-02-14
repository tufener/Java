package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Article;
import model.Ligne;

/**
 * Servlet implementation class ServletPanier
 */
@WebServlet("/ServletPanier")
public class ServletPanier extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletPanier() {
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
		RequestDispatcher rd = request.getRequestDispatcher("/panier.jsp");
		rd.forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("panier.jsp");
		int id = Integer.parseInt(request.getParameter("id"));
		int qte = Integer.parseInt(request.getParameter("qte"));
		System.out.println("Entré dans la servlet id: " + id + " Qte: " + qte);
		ServletContext context = getServletContext();
		ArrayList<Article> liste = (ArrayList<Article>) context.getAttribute("listeArticle");
		Ligne ligne;
		for (Article a : liste) {
			if (a.getId() == id) {
				HttpSession session = request.getSession();
				ArrayList<Ligne> panier = (ArrayList<Ligne>) session.getAttribute("panier");
				ligne = new Ligne(a, qte);
				if (panier != null) {
					panier.add(ligne);
					System.out.println(panier);
					
					if (session.getAttribute("total") != null) {
						int total = (int) session.getAttribute("total");
						total = total + (qte * a.getPrix());
						session.setAttribute("total", total);
					}
					else {
						int total = qte * a.getPrix();
						session.setAttribute("total", total);
					}
					session.setAttribute("panier", panier);
					
				}
			}
		}
		
//		for (Article a : liste) {
//			if (a.getId() == id) {
//				
//				//ArrayList<Article> panier = (ArrayList<Article>) session.getAttribute("panier");
//				if (panier != null) {
//					panier.add(a);
//					System.out.println("Taille du panier" + panier.size());
//					session.setAttribute("panier", panier);
//					session.setAttribute("qte", qte);
//				}
//			}
//		}

		rd.forward(request, response);
	}

}
