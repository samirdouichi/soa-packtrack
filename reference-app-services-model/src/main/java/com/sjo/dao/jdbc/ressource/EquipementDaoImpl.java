package com.sjo.dao.jdbc.ressource;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.sjo.dao.jdbc.EquipementDao;
import com.sjo.mapper.ressource.EquipementMapper;
import com.sjo.model.ressource.Equipement;

/**
 * @version 1.0
 * @created 17-Jun-2013 8:11:58 PM
 */
@Repository("equipementDao")
public class EquipementDaoImpl extends NamedParameterJdbcDaoSupport implements
		EquipementDao {

	private final static String FIND_ALL_EQUIPEMET_SQL = "SELECT * FROM EQUIPEMET";
	private final static String FIND_EQUIPEMET_BY_ID_SQL = "SELECT * FROM EQUIPEMET WHERE equipementID= :equipementID";

	@Autowired
	public EquipementDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public List<Equipement> findAllEquipement() {
		return getNamedParameterJdbcTemplate().query(FIND_ALL_EQUIPEMET_SQL,
				(SqlParameterSource) null, new EquipementMapper());
	}

	@Override
	public Equipement findEquipementById(String equipementID) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource("equipementID", equipementID);

		return getNamedParameterJdbcTemplate().queryForObject(
				FIND_EQUIPEMET_BY_ID_SQL, paramSource, new EquipementMapper());
	}

}