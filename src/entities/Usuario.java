package entities;

public class Usuario {

	String nombre;
	String contrase�a;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	public Usuario (String nuevoNombre, String nuevaContrase�a) { //constructor para poder crear usuarios y poder darles valores a sus atributos
		nombre=nuevoNombre;
		contrase�a=nuevaContrase�a;
	}
	
}
