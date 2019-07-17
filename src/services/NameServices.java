package services;

import java.util.ArrayList;
import java.util.List;

import entities.Usuario;
import repositories.Database;

public class NameServices {
	private Database repo = Database.getDatabase();

	public List<Usuario> mostrarLista() {
		return repo.cargarUsuarios(); // devuelve al repo la lista de get usuarios en repositories
	}

	public Usuario logearse(String nombre, String contraseña) {
		List<Usuario> l = repo.cargarUsuarios();
		for (Usuario u : l) { // bucle for, testea la lista que le damos uno por uno
			if (nombre.equals(u.getNombre()) && contraseña.equals(u.getContraseña())) {
				return u;
			}
		}
		return null;
	}

	public void borrarUsuario(String[] nombres) {
		repo.borrarUsers(nombres);
	}

	public boolean addUsuario(String nombre, String pass1, String pass2) {

		if (pass1.equals(pass2)) {
			if(repo.findByName(nombre) ==null) {
				repo.addUsuario(new Usuario(nombre, pass1));
				return true;
			}
		}
		return false;
	}

	public List<Usuario> filterUsers(String busqueda) {
		List<Usuario> encontrados = new ArrayList<>();

		for (Usuario u : repo.cargarUsuarios()) {
			if (u.getNombre().contains(busqueda)) {
				encontrados.add(u);
			}
		}

		return encontrados;

	}
	
	public Usuario findByName(String name) {
		return repo.findByName(name);
		
	}

}
