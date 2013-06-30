package com.sjo.model.ressource;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

	private Set<Chauffeur> m_Chauffeur = new HashSet<Chauffeur>();
	private Set<MoyenDeTransport> m_MoyenDeTransport = new HashSet<MoyenDeTransport>();

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
	@OneToMany
    @JoinColumn(name="chauffeurID")
	public Set<Chauffeur> getM_Chauffeur() {
		return m_Chauffeur;
	}

	public void setM_Chauffeur(Set<Chauffeur> m_Chauffeur) {
		this.m_Chauffeur = m_Chauffeur;
	}

	

	@OneToMany
    @JoinColumn(name="moyenDeTransportID")
	public Set<MoyenDeTransport> getM_MoyenDeTransport() {
		return m_MoyenDeTransport;
	}

	public void setM_MoyenDeTransport(Set<MoyenDeTransport> m_MoyenDeTransport) {
		this.m_MoyenDeTransport = m_MoyenDeTransport;
	}

}