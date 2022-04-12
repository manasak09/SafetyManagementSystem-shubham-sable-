package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import com.model.*;
import java.util.*;

@Service
public class IncidentCentreService {
	
	@Autowired
	IncidentCentreDAO incidentcentreDAOImpl;
	public void addIncident(IncidentCentre centre) 
	{
		incidentcentreDAOImpl.addIncident(centre);
	}
	public IncidentCentre findCentre(int id)
	{
		return incidentcentreDAOImpl.findIncident(id);
		
	}
	public List<IncidentCentre> findAllCentre() 
	{
		return incidentcentreDAOImpl.findAllIncident();
	}
	public boolean updateCentre(IncidentCentre centre) 
	{
		return incidentcentreDAOImpl.updateIncident(centre);
	}
	public boolean deleteCentre(IncidentCentre centre) {
		return incidentcentreDAOImpl.deleteIncident(centre);
	}

}
