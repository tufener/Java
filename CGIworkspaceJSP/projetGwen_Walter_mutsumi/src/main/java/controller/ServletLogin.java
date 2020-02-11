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

@WebServlet(name = "ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request	.getRequestDispatcher("login.jsp")
				.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String mdp = request.getParameter("password");
		Client c = null;
		try {
			c = authenticate(id, mdp);

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		if (c != null) {
			request	.getSession()
					.setAttribute("client", c);
		}
		request	.getRequestDispatcher("login-result.jsp")
				.forward(request, response);
	}

	private Client authenticate(int id, String mdp) throws SQLException, ClassNotFoundException {
		Client c = new DaoClientJdbc().findById(id);
		if (c != null && !c	.getPassword()
							.equals(mdp)) {
			return null;
		}
		return c;
	}
}
