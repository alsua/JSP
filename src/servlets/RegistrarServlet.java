package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Usuario;
import services.NameServices;

/**
 * Servlet implementation class RegistrarServlet
 */
@WebServlet("/RegistrarServlet")
public class RegistrarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre= request.getParameter("nombre");
		String password= request.getParameter("password");
		String password2= request.getParameter("password2");

		NameServices ns=new NameServices();
		boolean exito=ns.addUsuario(nombre, password, password2);
		
		if(exito) {
			
			getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		}else {
			getServletContext().getRequestDispatcher("/Registrar.jsp").forward(request, response);

		}
		
		
		
		
	}

}
