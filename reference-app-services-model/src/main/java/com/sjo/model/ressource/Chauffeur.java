package com.sjo.model.ressource;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table (name="RE_CHAUFFEUR")
public class Chauffeur implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "chauffeurID")
	@GeneratedValue
	private String chauffeurID;

	
	@ManyToOne
    @JoinColumn(name="resouRessourcesID")
	private Ressources resouRessources;
	
	
	public Chauffeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chauffeur(String chauffeurID, Ressources resouRessources) {
		super();
		this.chauffeurID = chauffeurID;
		this.resouRessources = resouRessources;
	}

	public String getChauffeurID() {
		return chauffeurID;
	}

	public void setChauffeurID(String chauffeurID) {
		this.chauffeurID = chauffeurID;
	}
	
	
}
