package com.sjo.dao.ressource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sjo.dao.MoyenDeTransportDao;
import com.sjo.model.ressource.MoyenDeTransport;



/**
 * @version 1.0
 * @created 17-Jun-2013 8:12:03 PM
 */

@Repository
public class MoyenDeTransportDaoImpl   implements MoyenDeTransportDao{
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
	public MoyenDeTransport createMoyenDeTransport(
			MoyenDeTransport moyenDeTransport) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteMoyenDeTransport(MoyenDeTransport moyenDeTransport) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MoyenDeTransport modifyMoyenDeTransport(
			MoyenDeTransport moyenDeTransport) {
		// TODO Auto-generated method stub
		return null;
	}

	

}