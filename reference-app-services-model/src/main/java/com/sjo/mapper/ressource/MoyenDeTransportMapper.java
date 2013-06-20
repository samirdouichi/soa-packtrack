package com.sjo.mapper.ressource;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sjo.model.ressource.MoyenDeTransport;



/**
 * @version 1.0
 * @created 17-Jun-2013 8:12:03 PM
 */
public class MoyenDeTransportMapper implements RowMapper<MoyenDeTransport>{

	

	@Override
	public MoyenDeTransport mapRow(ResultSet resultSet, int rowNum)
			throws SQLException {
		
		MoyenDeTransport moyenDeTransport=new MoyenDeTransport();
		moyenDeTransport.setMoyenDeTransportID(Long.toString(resultSet.getLong("moyenDeTransportID")));
		
		moyenDeTransport.setChargeMax(resultSet.getInt("chargeMax"));
		
		moyenDeTransport.setChargeMin(resultSet.getInt("chargeMin"));
//		equipement.setNumSerie(resultSet.getString("numSerie"));
//
//		equipement.setOrigineFabriquant(resultSet
//				.getString("origineFabriquant"));
//		equipement.setRefFabriquant(resultSet.getString("refFabriquant"));
		return moyenDeTransport;
	}
	
}