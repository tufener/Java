import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class auth
 */
@WebServlet("/auth")
public class auth extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String[] tabAuth={"Brun","PetitBrun","47"};
    /**
     * @see HttpServlet#HttpServlet()
     */
    public auth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom=request.getParameter("nom");
		RequestDispatcher rd=request.getRequestDispatcher(tryAuth(nom));
		rd.forward(request, response);
	}
	private String tryAuth(String nom){
		for(String s:tabAuth)if(nom.equals(s))return "/WEB-INF/success.jsp";
		return "/WEB-INF/fail.jsp";
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
