package com.sjo.model.ressource;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

/**
 * @version 1.0
 * @created 17-Jun-2013 8:11:53 PM
 */

@Entity
public class Agence implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String agenceID;
	private String adresseAgence;
	private Date dateCreation;
	private Agence m_Agence;
	private MoyenDeTransport m_MoyenDeTransport;

	public Agence() {

	}

	public Agence(String agenceID, String adresseAgence, Date dateCreation,
			Agence m_Agence, MoyenDeTransport m_MoyenDeTransport) {
		super();
		this.agenceID = agenceID;
		this.adresseAgence = adresseAgence;
		this.dateCreation = dateCreation;
		this.m_Agence = m_Agence;
		this.m_MoyenDeTransport = m_MoyenDeTransport;
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

	public MoyenDeTransport getMoyenDeTransport() {
		return m_MoyenDeTransport;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setMoyenDeTransport(MoyenDeTransport newVal) {
		m_MoyenDeTransport = newVal;
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

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Agence getM_Agence() {
		return m_Agence;
	}

	public void setM_Agence(Agence m_Agence) {
		this.m_Agence = m_Agence;
	}

	public MoyenDeTransport getM_MoyenDeTransport() {
		return m_MoyenDeTransport;
	}

	public void setM_MoyenDeTransport(MoyenDeTransport m_MoyenDeTransport) {
		this.m_MoyenDeTransport = m_MoyenDeTransport;
	}

	/**
	 * 
	 */

}