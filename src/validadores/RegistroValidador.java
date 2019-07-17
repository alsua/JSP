package validadores;

import services.NameServices;

public class RegistroValidador {
	NameServices ns = new NameServices();
	
	
	public boolean validar(String nombre,String password1,String password2) {
		if(ns.findByName(nombre) !=null ) {
			return false;
		}else if(password1.equals(password2)) {
			return false;
		}else if(password1.length()<5 || password1.length()>10) {
			return false;
		}
		
		
		
		return true;
	}

}
