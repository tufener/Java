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


import dao.*;
import model.*;

/**
 * Servlet implementation class loginS
 */
@WebServlet("/loginS")
public class loginS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("login2S");
		
		String login = request.getParameter("login");
		String mdp = request.getParameter("mdp");
		Client c = new Client(login, "", "", mdp, "");
		DaoClient d = new DaoClient();
		HttpSession session = request.getSession();
		
		try {
			Client c2 = d.findbylogin(login);
			if(c2 != null && c2.equals(c)){
				session.setAttribute("client", c);
				ArrayList<LignePanier> panier = new ArrayList<LignePanier>();
				session.setAttribute("panier", panier);
				rd=request.getRequestDispatcher("panierS");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
