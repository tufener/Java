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
import model.Ligne;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletLogin() {
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Passage Servlet login");

		DAOClient clientDao = new DAOClient();

		RequestDispatcher rd;

		rd = request.getRequestDispatcher("login.jsp");
		request.setAttribute("echec2", "Les identifiants sont incorrects");

		int id = Integer.parseInt(request.getParameter("id"));
		String pwd = request.getParameter("password");

		try {
			Client client = clientDao.login(id);
			System.out.println(client);
			if (client.getId() != 0) {
				if (client.getPassword().equals(pwd)) {
	
					rd = request.getRequestDispatcher("index2.jsp");
					HttpSession session = request.getSession();
					session.setAttribute("client", client);
					ArrayList<Ligne> panier = new ArrayList<Ligne>();
					session.setAttribute("panier", panier);
					rd.forward(request, response);
				}
				else {
					String error = "Indentifiant incorrects";
					request.setAttribute("error", error);
				rd.forward(request, response);
				}
			}
			else {
				String error = "Indentifiant incorrects";
				request.setAttribute("error", error);
			rd.forward(request, response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
