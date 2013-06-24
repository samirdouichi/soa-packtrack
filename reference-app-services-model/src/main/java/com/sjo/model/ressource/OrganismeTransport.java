package com.sjo.model.ressource;

import java.io.Serializable;
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
 * @created 17-Jun-2013 8:12:09 PM
 */

@Entity
@Table(name = "RE_ORGANISME_TRANSPORT")
public class OrganismeTransport implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "organismeTransportID")
	@GeneratedValue
	private String organismeTransportID;
	@Column(name="designiation")
	private String designiation;
	@Column(name="adresseOrganisme")
	private String adresseOrganisme;
	@Column(name="mailOrganisme")
	private String mailOrganisme;
	
	private Set<Agence> m_Agence = new HashSet<Agence>();
	 

	public OrganismeTransport() {

	}

 
	@OneToMany
    @JoinColumn(name="agenceID")
	public Set<Agence> getM_Agence() {
		return m_Agence;
	}



	public void setM_Agence(Set<Agence> m_Agence) {
		this.m_Agence = m_Agence;
	}



	public void setOrganismeTransportID(String organismeTransportID) {
		this.organismeTransportID = organismeTransportID;
	}



	public void setDesigniation(String designiation) {
		this.designiation = designiation;
	}



	public String getOrganismeTransportID() {
		return organismeTransportID;
	}

	 
	 

	public String getDesigniation() {
		return designiation;
	}

	public String getAdresseOrganisme() {
		return adresseOrganisme;
	}

	public void setAdresseOrganisme(String adresseOrganisme) {
		this.adresseOrganisme = adresseOrganisme;
	}

	public String getMailOrganisme() {
		return mailOrganisme;
	}

	public void setMailOrganisme(String mailOrganisme) {
		this.mailOrganisme = mailOrganisme;
	}

	 

}