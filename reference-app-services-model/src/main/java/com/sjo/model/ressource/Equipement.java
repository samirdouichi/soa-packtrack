package com.sjo.model.ressource;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @version 1.0
 * @created 17-Jun-2013 8:11:58 PM
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Equipement", propOrder = { "equipementID", "origineFabriquant",
		"refFabriquant", "numSerie", "m_Equipement" })
@XmlRootElement(name = "Equipement", namespace = "http://pets.acme.com/schemas/jpetstore")
public class Equipement implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "equipementID", required = true)
	protected String equipementID;
	@XmlElement(name = "origineFabriquant", required = true)
	protected String origineFabriquant;
	@XmlElement(name = "refFabriquant", required = true)
	protected String refFabriquant;
	@XmlElement(name = "numSerie", required = true)
	protected String numSerie;
	

	public Equipement() {

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