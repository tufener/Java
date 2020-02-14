package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOClient;
import model.Client;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/ServletInscription")
public class ServletInscription extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletInscription() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Passage Servlet inscription");
		RequestDispatcher rd = request.getRequestDispatcher("inscription.jsp");
		DAOClient clientDao = new DAOClient();

		int id = Integer.parseInt(request.getParameter("id"));
		String prenom = request.getParameter("prenom");
		String nom = request.getParameter("nom");
		String password = request.getParameter("password");
		String adresse = request.getParameter("adresse");

		Client nw_client = new Client(id, password, nom, prenom, adresse);
		
		try {
			
			boolean b_client = clientDao.createClient(nw_client);
			if (b_client == true) {
				clientDao.createClient(nw_client);
				request.setAttribute("nw_client", nw_client);
				request.setAttribute("success", "Votre compte a bien été créé.");
				rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
				b_client = false;
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("echec", "Cet identifiant correspond déjà à un compte associé");
		rd.forward(request, response);

	}

}
