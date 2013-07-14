package com.sjo.model.ressource;

import java.io.Serializable;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @version 1.0
 * @created 17-Jun-2013 8:11:53 PM
 */

@Entity
@Table(name = "RE_AGENCE")
public class Agence implements Serializable {

	/**
	 * 
	 */ 
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "agenceID")
	@GeneratedValue
	private String agenceID;
	@Column(name = "adresseAgence")
	private String adresseAgence;
	@Column(name = "dateCreationAgence")
	private Date dateCreationAgence;
	
	@ManyToOne
    @JoinColumn(name="organismeTransportID")
	private OrganismeTransport organismeTransport;
	

	@OneToMany(mappedBy="ressource")
	private Set<Ressources> ressources = new HashSet<Ressources>();
	
	public Agence() {
		super();
	}

	public String getAgenceID() {
		return agenceID;
	}

	public void setAgenceID(String agenceID) {
		this.agenceID = agenceID;
	}

	public String getAdresseAgence() {
		return adresseAgence;
	}

	public void setAdresseAgence(String adresseAgence) {
		this.adresseAgence = adresseAgence;
	}

	public Date getDateCreationAgence() {
		return dateCreationAgence;
	}

	public void setDateCreationAgence(Date dateCreationAgence) {
		this.dateCreationAgence = dateCreationAgence;
	}
	

	

 

}