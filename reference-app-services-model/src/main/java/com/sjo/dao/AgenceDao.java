package com.sjo.dao;

import java.util.List;

import com.sjo.model.ressource.Agence;


/**
 * @version 1.0
 * @created 17-Jun-2013 8:11:53 PM
 */
public interface AgenceDao  {

	public void addAgence(Agence agence);
	public List<Agence> listAgence();
	public void removeAgence(Integer id);

}