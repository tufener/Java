package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoClientJdbc;
import model.Client;

/**
 * Servlet implementation class ServletInscription
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
		// TODO Auto-generated method stub
		request	.getRequestDispatcher("inscription.jsp")
				.forward(request, response);
		;

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		boolean curseur = false;
		DaoClientJdbc newins = new DaoClientJdbc();

		try {
			curseur = newins.findById(Integer.parseInt(request.getParameter("Id"))) != null ? false : true;
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		if (curseur == true) {

			Client newc = new Client((Integer.parseInt(request.getParameter("Id"))), request.getParameter("Password"),
					request.getParameter("Nom"), request.getParameter("Prenom"), request.getParameter("Adresse"));

			try {
				newins.create(newc);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		;

		request.setAttribute("reponse", "true");
		request.setAttribute("valide", curseur);

		doGet(request, response);
	}

}
