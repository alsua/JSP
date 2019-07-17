package servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.impl.naming.pcosnaming.NameService;

import entities.Usuario;
import services.NameServices;



/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NameServices s=new NameServices();
		List<Usuario> l=s.mostrarLista();
		
		request.setAttribute("lista", l);
		
		getServletContext().getRequestDispatcher("/users.jsp").forward(request, response);
		
		
		
		}
	
	
	
	
		
	

	/**
	 * @param us 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NameServices ns=new NameServices();
		String busqueda=request.getParameter("nombre");
		if(busqueda!=null) {
		List<Usuario> users=ns.filterUsers(busqueda);	
		request.setAttribute("Users",users);
		}else {
		
		}
		//Usuario no existe,contraseñas iguales,limite de min y max de caracteres 5<,<10.
		
	}

}
