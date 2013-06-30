package com.sjo.model.affectation;

import java.io.Serializable;

import com.sjo.model.ressource.Agence;

public class Affectation implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String affectationID;
	private Agence m_agence;
	public Affectation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Affectation(String affectationID, Agence m_agence) {
		super();
		this.affectationID = affectationID;
		this.m_agence = m_agence;
	}
	public String getAffectationID() {
		return affectationID;
	}
	public void setAffectationID(String affectationID) {
		this.affectationID = affectationID;
	}
	public Agence getM_agence() {
		return m_agence;
	}
	public void setM_agence(Agence m_agence) {
		this.m_agence = m_agence;
	}
	
	
	

}
