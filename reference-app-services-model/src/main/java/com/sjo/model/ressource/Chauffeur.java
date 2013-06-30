package com.sjo.model.ressource;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="RE_CHAUFFEUR")
public class Chauffeur implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String chauffeurID;

	
	
	public Chauffeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getChauffeurID() {
		return chauffeurID;
	}

	public void setChauffeurID(String chauffeurID) {
		this.chauffeurID = chauffeurID;
	}
	
	
}
