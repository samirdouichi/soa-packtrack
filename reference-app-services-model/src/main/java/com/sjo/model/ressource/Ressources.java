package com.sjo.model.ressource;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "RE_RESSOURCES")
public class Ressources implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ressourcesID")
	@GeneratedValue
	private String ressourcesID;
	
	
	@ManyToOne
    @JoinColumn(name="agenceID")
	private Agence agence;
	@OneToMany(mappedBy="chauffeur")
	private Set<Chauffeur> m_Chauffeur = new HashSet<Chauffeur>();
	
	@OneToMany(mappedBy="moyenDeTransport")
	private Set<MoyenDeTransport> m_MoyenDeTransport = new HashSet<MoyenDeTransport>();

	
	
	
	public Ressources() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ressources(String ressourcesID, Set<Chauffeur> m_Chauffeur,
			Set<MoyenDeTransport> m_MoyenDeTransport) {
		super();
		this.ressourcesID = ressourcesID;
		this.m_Chauffeur = m_Chauffeur;
		this.m_MoyenDeTransport = m_MoyenDeTransport;
	}

	public String getRessourcesID() {
		return ressourcesID;
	}

	public void setRessourcesID(String ressourcesID) {
		this.ressourcesID = ressourcesID;
	}

	public Set<Chauffeur> getM_Chauffeur() {
		return m_Chauffeur;
	}

	public void setM_Chauffeur(Set<Chauffeur> m_Chauffeur) {
		this.m_Chauffeur = m_Chauffeur;
	}

	public Set<MoyenDeTransport> getM_MoyenDeTransport() {
		return m_MoyenDeTransport;
	}

	public void setM_MoyenDeTransport(Set<MoyenDeTransport> m_MoyenDeTransport) {
		this.m_MoyenDeTransport = m_MoyenDeTransport;
	}

	
	
}
