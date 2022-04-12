package com.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import com.model.IncidentCentre;

@Service
public class IncidentCentreService {
	@Autowired
	IncidentCentreDAO incidentcentredaoImpl;
	public void addIncident(IncidentCentre centre) {
		incidentcentredaoImpl.addIncident(centre);
	}
	public IncidentCentre findCentre(int id) {
		return incidentcentredaoImpl.findIncident(id);
		
	}
	public List<IncidentCentre> findAllCentre() {
		return incidentcentredaoImpl.findAllIncident();
	}
	public boolean updateCentre(IncidentCentre centre) {
		return incidentcentredaoImpl.updateIncident(centre);
	}
	public boolean deleteCentre(IncidentCentre centre) {
		return incidentcentredaoImpl.deleteIncident(centre);
	}

}
