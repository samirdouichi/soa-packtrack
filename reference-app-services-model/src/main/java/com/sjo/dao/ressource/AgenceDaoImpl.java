package com.sjo.dao.ressource;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sjo.dao.AgenceDao;
import com.sjo.model.ressource.Agence;

/**
 * @version 1.0
 * @created 17-Jun-2013 8:11:53 PM
 */

@Repository
public class AgenceDaoImpl implements AgenceDao {
	
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
     * @param SessionFactory - Hibernate Session Factory
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
 

	@Override
	public void addAgence(Agence agence) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(agence);
		
	}

	@Override
	public List<Agence> listAgence() {
		return sessionFactory.getCurrentSession().createQuery("from Agence")
				.list();
	}

	@Override
	public void removeAgence(Integer id) {
		Agence agence = (Agence) sessionFactory.getCurrentSession().load(
				Agence.class, id);
		if (null != agence) {
			sessionFactory.getCurrentSession().delete(agence);
		}
		
	}
	

}