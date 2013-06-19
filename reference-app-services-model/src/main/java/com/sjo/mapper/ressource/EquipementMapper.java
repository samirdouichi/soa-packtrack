package com.sjo.mapper.ressource;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sjo.model.ressource.Equipement;

/**
 * @version 1.0
 * @created 17-Jun-2013 8:11:58 PM
 */
public class EquipementMapper implements RowMapper<Equipement> {

	@Override
	public Equipement mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		Equipement equipement = new Equipement();
		equipement.setEquipementID(Long.toString(resultSet.getLong("equipementID")));
		equipement.setNumSerie(resultSet.getString("numSerie"));

		equipement.setOrigineFabriquant(resultSet
				.getString("origineFabriquant"));
		equipement.setRefFabriquant(resultSet.getString("refFabriquant"));
		return equipement;
	}
}