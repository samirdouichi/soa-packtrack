package com.sjo.model.ressource;

import java.io.Serializable;

/**
 * @version 1.0
 * @created 17-Jun-2013 8:12:09 PM
 */
public class OrganismeTransport implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String designiation;
	private String adresseOrganisme;
	private String mailOrganisme;
	private Agence m_Agence;

	public OrganismeTransport() {

	}

	public OrganismeTransport(Integer id, String designiation,
			String adresseOrganisme, String mailOrganisme, Agence m_Agence) {
		super();
		this.id = id;
		this.designiation = designiation;
		this.adresseOrganisme = adresseOrganisme;
		this.mailOrganisme = mailOrganisme;
		this.m_Agence = m_Agence;
	}

	public void finalize() throws Throwable {

	}

	public Agence getAgence() {
		return m_Agence;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAgence(Agence newVal) {
		m_Agence = newVal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesigniation() {
		return designiation;
	}

	public void setDesigniation(String designiation) {
		this.designiation = designiation;
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

	public Agence getM_Agence() {
		return m_Agence;
	}

	public void setM_Agence(Agence m_Agence) {
		this.m_Agence = m_Agence;
	}

	
	
}