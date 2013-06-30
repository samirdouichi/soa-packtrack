package com.sjo.dao.ressource;

import java.util.List;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.sjo.dao.EquipementDao;
import com.sjo.model.ressource.Equipement;

/**
 * @version 1.0
 * @created 17-Jun-2013 8:11:58 PM
 */
@Repository("equipementDao")
public class EquipementDaoImpl implements EquipementDao {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * Get Hibernate Session Factory
	 * 
	 * @return SessionFactory - Hibernate Session Factory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * Set Hibernate Session Factory
	 * 
	 * @param SessionFactory
	 *            - Hibernate Session Factory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Equipement> findAllEquipement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Equipement findEquipementById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	// @Override
	// public List<Equipement> findAllEquipement() {
	// return getNamedParameterJdbcTemplate().query(FIND_ALL_EQUIPEMET_SQL,
	// (SqlParameterSource) null, new EquipementMapper());
	// }
	//
	// @Override
	// public Equipement findEquipementById(String equipementID) {
	// MapSqlParameterSource paramSource = new
	// MapSqlParameterSource("equipementID", equipementID);
	//
	// return getNamedParameterJdbcTemplate().queryForObject(
	// FIND_EQUIPEMET_BY_ID_SQL, paramSource, new EquipementMapper());
	// }

}