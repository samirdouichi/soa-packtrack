package com.sjo.model.ressource;

import java.io.Serializable;

import javax.persistence.Entity;



/**
 * @version 1.0
 * @created 17-Jun-2013 8:12:03 PM
 */

@Entity
public class MoyenDeTransport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 
	private String moyenDeTransportID;
	 
	private String immatriculation;
	 
	private boolean isDisponible;
	 
	private int chargeMax;
	 
	private int kilometrage;
	 
	private int chargeMin;
	 
	private Equipement m_Equipement;
	 
	private TypeMoyenTransport typeMoyenTransportID;

	public MoyenDeTransport() {

	}

	public MoyenDeTransport(String moyenDeTransportID, String immatriculation,
			boolean isDisponible, int chargeMax, int kilometrage,
			int chargeMin, Equipement m_Equipement,
			TypeMoyenTransport typeMoyenTransportID) {
		super();
		this.moyenDeTransportID = moyenDeTransportID;
		this.immatriculation = immatriculation;
		this.isDisponible = isDisponible;
		this.chargeMax = chargeMax;
		this.kilometrage = kilometrage;
		this.chargeMin = chargeMin;
		this.m_Equipement = m_Equipement;
		this.typeMoyenTransportID = typeMoyenTransportID;
	}

	public void finalize() throws Throwable {

	}

	public Equipement getEquipement() {
		return m_Equipement;
	}

	public String getMoyenDeTransportID() {
		return moyenDeTransportID;
	}

	public void setMoyenDeTransportID(String moyenDeTransportID) {
		this.moyenDeTransportID = moyenDeTransportID;
	}

	public void setDisponible(boolean isDisponible) {
		this.isDisponible = isDisponible;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setEquipement(Equipement newVal) {
		m_Equipement = newVal;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public boolean getIsDisponible() {
		return isDisponible;
	}

	public void setIsDisponible(boolean isDisponible) {
		this.isDisponible = isDisponible;
	}

	public int getChargeMax() {
		return chargeMax;
	}

	public void setChargeMax(int chargeMax) {
		this.chargeMax = chargeMax;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}

	public int getChargeMin() {
		return chargeMin;
	}

	public void setChargeMin(int chargeMin) {
		this.chargeMin = chargeMin;
	}

	public Equipement getM_Equipement() {
		return m_Equipement;
	}

	public void setM_Equipement(Equipement m_Equipement) {
		this.m_Equipement = m_Equipement;
	}

	public TypeMoyenTransport getTypeMoyenTransportID() {
		return typeMoyenTransportID;
	}

	public void setTypeMoyenTransportID(TypeMoyenTransport typeMoyenTransportID) {
		this.typeMoyenTransportID = typeMoyenTransportID;
	}

}
