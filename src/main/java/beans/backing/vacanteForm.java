package beans.backing;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import beans.model.Camdidato;

@Named
@RequestScoped
public class vacanteForm {
	
	@Inject
	private Camdidato candidato;
	Logger log = LogManager.getRootLogger();
	
	public vacanteForm(){
        log.info("Creando el objeto VacanteForm");
    }

	public void setCandidato(final Camdidato candidato) {
		this.candidato = candidato;
	}

	public String enviar() {
		if (this.candidato.getNombre().equals("Juan")) {
			if (this.candidato.getApellido().equals("Perez")) {
				final String msg = "Gracias, pero Juan Perez ya trabaja con nosotros.";
				final FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
				final FacesContext facesContext = FacesContext.getCurrentInstance();
				final String componentId = null;// este es un mensaje global
				facesContext.addMessage(componentId, facesMessage);
				return "index";
			}
			log.info("Entrando al caso de exito");
			return "exito";
		} else {
			log.info("Entrando al caso de fallo");
			return "fallo";
		}
	}
}
