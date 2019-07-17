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
 * Servlet implementation class BorrarServlet
 */
@WebServlet("/BorrarServlet")
public class BorrarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BorrarServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		NameServices s = new NameServices();
		List<Usuario> l = s.mostrarLista();

		request.setAttribute("lista", l);

		getServletContext().getRequestDispatcher("/BorrarUsuarios.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		NameServices s = new NameServices();

		String[] nombres = request.getParameterValues("Usuarios");

		if (nombres != null) {
			s.borrarUsuario(nombres);
		}
		List<Usuario> l = s.mostrarLista();

		request.setAttribute("lista", l);

		getServletContext().getRequestDispatcher("/BorrarUsuarios.jsp").forward(request, response);

	}

}
