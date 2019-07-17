package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Usuario;

public class NameRepositories {
	
	// repositories es un intermediario entre la interfaz y los datos de usuario, para que el usuario no pueda acceder a los datos

		public List<Usuario> getUsuarios(){                  //esto es una lista de la clase usuario, creamos nuevos usuarios con atributos diferentes
			List<Usuario> listaUsuarios=new ArrayList<>();
			listaUsuarios.add(new Usuario("pepe", "234"));
			listaUsuarios.add(new Usuario("jose", "234"));
			listaUsuarios.add(new Usuario("juan", "234"));
			listaUsuarios.add(new Usuario("jorge", "234"));
			listaUsuarios.add(new Usuario("manuel", "234"));
			return listaUsuarios;

			
			
	}
	}
