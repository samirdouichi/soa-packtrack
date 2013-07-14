package com.sjo.model.ressource;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @version 1.0
 * @created 17-Jun-2013 8:12:03 PM
 */

@Entity
@Table(name = "RE_MOYENDETRANSPORT")
public class MoyenDeTransport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "moyenDeTransportID")
	@GeneratedValue
	private String moyenDeTransportID;
	@Column(name = "immatriculation")
	private String immatriculation;
	@Column(name = "isDisponible")
	private boolean isDisponible;
	@Column(name = "chargeMax")
	private int chargeMax;
	@Column(name = "kilometrage")
	private int kilometrage;
	@Column(name = "chargeMin")
	private int chargeMin;
	
	private Equipement m_Equipement;
	@ManyToOne
    @JoinColumn(name="resourcesID")
	private Ressources resources;
	
	@OneToOne(mappedBy="typeMoyenTransport", cascade=CascadeType.ALL)
	private TypeMoyenTransport typeMoyenTransportID;
	
	@OneToOne(mappedBy="equipement", cascade=CascadeType.ALL)
	private Equipement equipement;

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

	public MoyenDeTransport(String moyenDeTransportID, String immatriculation,
			boolean isDisponible, int chargeMax, int kilometrage,
			int chargeMin, Equipement m_Equipement, Ressources resources,
			TypeMoyenTransport typeMoyenTransportID, Equipement equipement) {
		super();
		this.moyenDeTransportID = moyenDeTransportID;
		this.immatriculation = immatriculation;
		this.isDisponible = isDisponible;
		this.chargeMax = chargeMax;
		this.kilometrage = kilometrage;
		this.chargeMin = chargeMin;
		this.m_Equipement = m_Equipement;
		this.resources = resources;
		this.typeMoyenTransportID = typeMoyenTransportID;
		this.equipement = equipement;
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

	public Ressources getResources() {
		return resources;
	}

	public void setResources(Ressources resources) {
		this.resources = resources;
	}

}
