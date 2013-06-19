package com.sjo.services;


/**
 * @version 1.0
 * @created 17-Jun-2013 8:11:58 PM
 */
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.sjo.model.ressource.Equipement;

import java.util.List;

@WebService(targetNamespace = "http://acme.com/services")
public interface EquipementSer   {
	@WebMethod
    @XmlElementWrapper(name="equipement")
    @XmlElement(name="equipement")
    public List<Equipement> findAllEquipement();

    @WebMethod
    public String deleteEquipement(String id);

    @WebMethod
    public Equipement modifyEquipement(Equipement equipement);

    @WebMethod
    @XmlElement(name = "equipement")
    public Equipement retrieveEquipement(String id);

	
}