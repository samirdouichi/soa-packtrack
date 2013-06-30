package com.sjo.services.ressource;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.sjo.dao.AgenceDao;
import com.sjo.model.ressource.Agence;
import com.sjo.services.AgenceService;

/**
 * @version 1.0
 * @created 17-Jun-2013 8:11:53 PM
 */

@WebService(endpointInterface = "com.sjo.services.AgenceService", name = "AgenceService", serviceName = "AgenceService", portName = "AgencePortType", targetNamespace = "http://acme.com/services")
public class AgenceServiceImpl implements AgenceService {
	@Autowired
	private AgenceDao agenceDAO;

	@Override
	public void addAgence(Agence agence) {
		agenceDAO.addAgence(agence);
	}

	@Override
	public List<Agence> listAgence() {

		return agenceDAO.listAgence();
	}

	@Override
	public void removeAgence(Integer id) {
		agenceDAO.removeAgence(id);
	}

	@Override
	public Agence modifyAgence(Agence agence) {
		// TODO Auto-generated method stub
		return null;
	}

}