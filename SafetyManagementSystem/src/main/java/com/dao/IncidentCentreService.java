package com.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import com.model.IncidentCentre;

@Service
public class IncidentCentreService {
	@Autowired
	IncidentCentreDAO injurycentredaoimpl;
	public void addInjury(IncidentCentre centre) {
		injurycentredaoimpl.addIncident(centre);
	}
	public IncidentCentre findCentre(int id) {
		return injurycentredaoimpl.findIncident(id);
		
	}
	public List<IncidentCentre> findAllCentre() {
		return injurycentredaoimpl.findAllIncident();
	}
	public boolean updateCentre(IncidentCentre centre) {
		return injurycentredaoimpl.updateIncident(centre);
	}
	public boolean deleteCentre(IncidentCentre centre) {
		return injurycentredaoimpl.deleteIncident(centre);
	}

}
