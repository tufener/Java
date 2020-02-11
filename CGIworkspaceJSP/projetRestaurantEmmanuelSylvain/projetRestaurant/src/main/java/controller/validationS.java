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

import dao.DaoCommande;
import model.*;

/**
 * Servlet implementation class validationS
 */
@WebServlet("/validationS")
public class validationS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validationS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ArrayList<LignePanier> panier = (ArrayList<LignePanier>) session.getAttribute("panier");
		Client c = (Client)session.getAttribute("client");
		String desc="";
		int prixT = 0;
		for (LignePanier lp : panier){
			desc += lp.getArticle() + "/" + lp.getQuantite() + "/" + lp.getPrixT() + ";";
			prixT += lp.getPrixT();
		}
		Commande com = new Commande(c.getLogin(), prixT, desc);
		DaoCommande d = new DaoCommande();
		try {
			d.create(com);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("validationTerminer");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
