package beans.backing;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import beans.model.Camdidato;

@Named
@RequestScoped
public class vacanteForm {
	
	@Inject
	private Camdidato candidato;
	Logger log = LogManager.getRootLogger();
	
	public void setCandidato(Camdidato candidato) {
		this.candidato = candidato;
	}
	
	public String enviar() {
		if (this.candidato.getNombre().equals("Sergio")) {
			log.info("Entrando al caso de exito");
			return "exito";
		}
		else {
			log.info("Entrando al caso de fallo");
			return "fallo";
		}
	}
}
