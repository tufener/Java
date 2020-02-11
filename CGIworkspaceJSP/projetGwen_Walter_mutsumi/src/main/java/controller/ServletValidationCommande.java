package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoCommandeJdbc;
import model.Article;
import model.Client;
import model.Commande;

@WebServlet("/ServletValidationCommande")
public class ServletValidationCommande extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("montantTotal", this.getMontantTotal(request));
		HashMap<Article,Integer> check=(HashMap<Article, Integer>) request.getSession().getAttribute("panier");
		if (!check.isEmpty()){
		try {
			this.saveCommandeToDb(request);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		request.getRequestDispatcher("commande-validee.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private double getMontantTotal(HttpServletRequest request) {
		double total = 0.0;
		HashMap<Article, Integer> map = (HashMap<Article, Integer>) request.getSession().getAttribute("panier");
		if (map != null) {
			for (Map.Entry<Article, Integer> entry : map.entrySet()) {
				total += entry.getKey().getPrix() * entry.getValue();
			}
		}
		return total;
	}

	private void saveCommandeToDb(HttpServletRequest request) throws ClassNotFoundException, SQLException {
		Client client = (Client) request.getSession().getAttribute("client");
		HashMap<Article, Integer> map = (HashMap<Article, Integer>) request.getSession().getAttribute("panier");
		String info = "";
		for (Map.Entry<Article, Integer> entry : map.entrySet()) {
			info += entry.getKey().getId();
			info += "/";
			info += entry.getValue();
			info += ";";
		}
		Commande commande = new Commande(client.getId(), new Date(), this.getMontantTotal(request), info);
		 new DaoCommandeJdbc().create(commande);
		request.getSession().setAttribute("panier", new HashMap<Article, Integer>());

	}

}
