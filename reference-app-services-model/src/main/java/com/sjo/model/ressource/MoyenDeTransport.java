package com.sjo.model.ressource;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @version 1.0
 * @created 17-Jun-2013 8:12:03 PM
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoyenDeTransport", propOrder = { 
		"moyenDeTransportID",
		"immatriculation",
		"isDisponible",
		"chargeMax", 
		"kilometrage",
		"chargeMin",
		"m_Equipement", 
		"m_TypeMoyenTransport" })
@XmlRootElement(name = "MoyenDeTransport", namespace = "http://pets.acme.com/schemas/jpetstore")
public class MoyenDeTransport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "moyenDeTransportID", required = true)
	protected String moyenDeTransportID;
	@XmlElement(name = "immatriculation", required = true)
	protected String immatriculation;
	@XmlElement(name = "isDisponible", required = true)
	protected boolean isDisponible;
	@XmlElement(name = "chargeMax", required = true)
	protected int chargeMax;
	@XmlElement(name = "kilometrage", required = true)
	protected int kilometrage;
	@XmlElement(name = "chargeMin", required = true)
	protected int chargeMin;
	@XmlElement(name = "m_Equipement", required = true)
	protected Equipement m_Equipement;
	@XmlElement(name = "typeMoyenTransportID", required = true)
	protected TypeMoyenTransport typeMoyenTransportID;

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
