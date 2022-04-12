package com.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import com.model.IncidentCentre;

@Service
public class IncidentCentreService {
	@Autowired
	IncidentCentreDAO injurycentredaoImpl;
	public void addInjury(IncidentCentre centre) {
		injurycentredaoImpl.addIncident(centre);
	}
	public IncidentCentre findCentre(int id) {
		return injurycentredaoImpl.findIncident(id);
		
	}
	public List<IncidentCentre> findAllCentre() {
		return injurycentredaoImpl.findAllIncident();
	}
	public boolean updateCentre(IncidentCentre centre) {
		return injurycentredaoImpl.updateIncident(centre);
	}
	public boolean deleteCentre(IncidentCentre centre) {
		return injurycentredaoImpl.deleteIncident(centre);
	}

}
