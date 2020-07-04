package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named
@RequestScoped
public class Camdidato {
	private String nombre = "introduce Tu nombre";
	Logger log = LogManager.getRootLogger();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		log.info("Modificando candidato"+this.nombre);
	}
	
}
