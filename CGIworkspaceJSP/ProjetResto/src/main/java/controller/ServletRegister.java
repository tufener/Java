package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAOClient;
import model.Article;
import model.Client;

/**
 * Servlet implementation class ServletRegister
 */
@WebServlet("/ServletRegister")
public class ServletRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletRegister() {
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
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String password = request.getParameter("password");
		String addresse = request.getParameter("addresse");
		DAOClient dao = new DAOClient();
		Client p = new Client(nom, prenom, password, addresse);
		Client p1 = null;
		try {
			p1 = dao.findByName(nom);
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		if (p1 == null) {
			try {
				RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
				dao.create(p);
				p = dao.findByName(nom);
				HttpSession session = request.getSession();
				session.setAttribute("Auth", p);
				ArrayList<Article> panier = new ArrayList<Article>();
				session.setAttribute("panier", panier);
				rd.forward(request, response);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/inscription.jsp");
			String error = "Ce compte existe déjà";
			request.setAttribute("error", error);
			rd.forward(request, response);
		}
	}

}
