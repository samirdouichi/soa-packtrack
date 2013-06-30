package com.sjo.dao.ressource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.sjo.dao.OrganismeTransportDao;



/**
 * @version 1.0
 * @created 17-Jun-2013 8:12:09 PM
 */
public class OrganismeTransportDaoImpl implements OrganismeTransportDao {

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
 
}