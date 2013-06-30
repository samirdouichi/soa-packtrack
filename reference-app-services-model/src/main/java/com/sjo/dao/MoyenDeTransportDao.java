package com.sjo.dao;

import com.sjo.model.ressource.MoyenDeTransport;



/**
 * @version 1.0
 * @created 17-Jun-2013 8:12:03 PM
 */
public interface MoyenDeTransportDao {

	 public MoyenDeTransport createMoyenDeTransport(MoyenDeTransport moyenDeTransport);

	    public String deleteMoyenDeTransport(MoyenDeTransport moyenDeTransport);

	    public MoyenDeTransport modifyMoyenDeTransport(MoyenDeTransport moyenDeTransport);
}