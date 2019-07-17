package entities;

public class Usuario {

	String nombre;
	String contraseña;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public Usuario (String nuevoNombre, String nuevaContraseña) { //constructor para poder crear usuarios y poder darles valores a sus atributos
		nombre=nuevoNombre;
		contraseña=nuevaContraseña;
	}
	
}
