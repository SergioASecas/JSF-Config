package beans.lifeCicle;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DebuggerListener implements javax.faces.event.PhaseListener{

	//private static final long serialVersionUID = -6102436161465406196L;
	Logger log = LogManager.getRootLogger();
	
	@Override
	public void beforePhase(PhaseEvent event) {
		if (log.isInfoEnabled()) {
			log.info("Antes de la fase"+ event.getPhaseId().toString());
		}
		
	}
	
	@Override
	public void afterPhase(PhaseEvent event) {
		if (log.isInfoEnabled()) {
			log.info("despues de la fase" + event.getPhaseId().toString());
		}
		
	}

	@Override
	public PhaseId getPhaseId() {
	
		return PhaseId.ANY_PHASE;
	}

}
