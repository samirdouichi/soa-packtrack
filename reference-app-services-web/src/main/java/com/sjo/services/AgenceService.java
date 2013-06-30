package com.sjo.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.sjo.model.ressource.Agence;

/**
 * @version 1.0
 * @created 17-Jun-2013 8:11:53 PM
 */

@WebService(targetNamespace = "http://acme.com/services")
public interface AgenceService {

	@WebMethod
	@XmlElementWrapper(name = "agences")
	@XmlElement(name = "agence")
	public List<Agence> listAgence();

	@WebMethod
	public void removeAgence(Integer id);

	@WebMethod
	public void addAgence(Agence agence);

	@WebMethod
	public Agence modifyAgence(Agence agence);
}