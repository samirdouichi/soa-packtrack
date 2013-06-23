package com.sjo.model.ressource;

import java.io.Serializable;

import javax.persistence.Entity;



/**
 * @version 1.0
 * @created 17-Jun-2013 8:12:14 PM
 */
@Entity
public class TypeMoyenTransport implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private int chargeax;
	private int hauteur;
	private int largeur;
	private String intitule;
	private int vitesseMaxVide;
	private int vitesseMaxCharge;

	public TypeMoyenTransport(){

	}

	public TypeMoyenTransport(Integer id, int chargeax, int hauteur,
			int largeur, String intitule, int vitesseMaxVide,
			int vitesseMaxCharge) {
		super();
		this.id = id;
		this.chargeax = chargeax;
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.intitule = intitule;
		this.vitesseMaxVide = vitesseMaxVide;
		this.vitesseMaxCharge = vitesseMaxCharge;
	}

	public void finalize() throws Throwable {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getChargeax() {
		return chargeax;
	}

	public void setChargeax(int chargeax) {
		this.chargeax = chargeax;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public int getVitesseMaxVide() {
		return vitesseMaxVide;
	}

	public void setVitesseMaxVide(int vitesseMaxVide) {
		this.vitesseMaxVide = vitesseMaxVide;
	}

	public int getVitesseMaxCharge() {
		return vitesseMaxCharge;
	}

	public void setVitesseMaxCharge(int vitesseMaxCharge) {
		this.vitesseMaxCharge = vitesseMaxCharge;
	}

}