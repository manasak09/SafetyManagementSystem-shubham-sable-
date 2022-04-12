package com.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class IncidentCentre {
	
	@Id
	@GeneratedValue
	private int incidentIdId;
	
	@NotNull
    @Size(min=10,max=400)
	private String jobDescription;
	
	@NotNull
    @Size(min=10,max=400)
	private String incident;
	
	@NotNull
    @Size(min=3,max=4)
	private String anyInjuries;
	
	@NotNull
    @Size(min=10,max=400)
	private String injuryDescription;
	
	public IncidentCentre ()
	{
		
	}

	
	
	public int getIncidentIdId() {
		return incidentIdId;
	}

	public void setIncidentIdId(int incidentIdId) {
		this.incidentIdId = incidentIdId;
	}



	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getIncident() {
		return incident;
	}

	public void setIncident(String incident) {
		this.incident = incident;
	}

	public String getAnyInjuries() {
		return anyInjuries;
	}

	public void setAnyInjuries(String anyInjuries) {
		this.anyInjuries = anyInjuries;
	}

	public String getInjuryDescription() {
		return injuryDescription;
	}

	public void setInjuryDescription(String injuryDescription) {
		this.injuryDescription = injuryDescription;
	}

	
	
}
