package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.impl.naming.pcosnaming.NameService;

import entities.Usuario;
import services.NameServices;
import validadores.LoginValidador;

/**
 * Servlet implementation class NameServlet
 */
@WebServlet("/NameServlet")
public class NameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NameServlet() {
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
		NameServices ns=new NameServices();
		
		LoginValidador lv = new LoginValidador();
		
		
		if(lv.validar(nombre, password)) {
			Usuario usuarioLogeado=ns.logearse(nombre, password);
			request.getSession().setAttribute("user", usuarioLogeado);
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			
		}else {
			request.setAttribute("fallo", "USUARIO NO REGISTRADO");
			getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		}
		
		
		
		
		
	}

}
