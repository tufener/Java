package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Article;

@WebServlet("/ServletCommande")
public class ServletCommande extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("montantTotal", this.getMontantTotal(request));
		request	.getRequestDispatcher("commande-recap.jsp")
				.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
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
