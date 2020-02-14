package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAOArticle;
import dao.DAOCommande;
import model.Client;
import model.Commande;
import model.Ligne;

/**
 * Servlet implementation class ServletCommande
 */
@WebServlet("/ServletCommande")
public class ServletCommande extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCommande() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		ArrayList<Ligne> liste = (ArrayList<Ligne>) session.getAttribute("panier");//new ArrayList<Ligne>();
		Client cli = (Client) session.getAttribute("client");
		LocalDateTime myDateObj = LocalDateTime.now();  
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
		String formattedDate = myDateObj.format(myFormatObj);
		int total = (int) session.getAttribute("total");
		Commande c = new Commande(cli.getId(), formattedDate, total);
		c.addLigne(liste);
		DAOCommande d = new DAOCommande();
		try {
			d.saveCommande(c);
			RequestDispatcher rd  = request.getRequestDispatcher("commande.jsp");
			rd.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
