package com.sjo.model.ressource;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @version 1.0
 * @created 17-Jun-2013 8:11:58 PM
 */

@Entity
public class Equipement implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String equipementID;

	private String origineFabriquant;

	private String refFabriquant;

	private String numSerie;

	public Equipement() {

	}

	public Equipement(String equipementID, String origineFabriquant,
			String refFabriquant, String numSerie) {
		super();
		this.equipementID = equipementID;
		this.origineFabriquant = origineFabriquant;
		this.refFabriquant = refFabriquant;
		this.numSerie = numSerie;
	}

	public String getEquipementID() {
		return equipementID;
	}

	public void setEquipementID(String equipementID) {
		this.equipementID = equipementID;
	}

	public void finalize() throws Throwable {

	}

	/**
 * 
 */

	public String getOrigineFabriquant() {
		return origineFabriquant;
	}

	public void setOrigineFabriquant(String origineFabriquant) {
		this.origineFabriquant = origineFabriquant;
	}

	public String getRefFabriquant() {
		return refFabriquant;
	}

	public void setRefFabriquant(String refFabriquant) {
		this.refFabriquant = refFabriquant;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

}