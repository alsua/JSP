package validadores;

import entities.Usuario;
import services.NameServices;

public class LoginValidador {
	// ATRIBUTOS
	NameServices ns = new NameServices();

	public boolean validar(String nombre, String Password) {
		if (ns.findByName(nombre)  == null) {
			return false;
		}else if(nombre.contains(">")) {
			return false;
		}else if(nombre.contains("<")) {
				return false;	
		}else if(nombre.contains("@")){
				return false;
		}

		return true;
	}
	
	

}
