package com.sjo.dao.jdbc;

import java.util.List;

import com.sjo.model.ressource.Equipement;




/**
 * @version 1.0
 * @created 17-Jun-2013 8:11:58 PM
 */
public interface EquipementDao   {
	
	List<Equipement> findAllEquipement();

	Equipement findEquipementById(String id);
	
}