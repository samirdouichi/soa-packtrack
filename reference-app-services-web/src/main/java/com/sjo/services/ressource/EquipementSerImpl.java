//package com.sjo.services.ressource;
//
//import com.sjo.dao.EquipementDao;
//import com.sjo.model.ressource.Equipement;
//import com.sjo.services.EquipementSer;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import javax.jws.WebService;
//import java.util.List;
//
//@WebService(endpointInterface = "com.acme.services.EquipementService", name = "EquipementService", serviceName = "EquipementService", portName = "EquipementPortType", targetNamespace = "http://acme.com/services")
///**
// * @version 1.0
// * @created 17-Jun-2013 8:11:58 PM
// */
//public class EquipementSerImpl implements EquipementSer {
//	@Autowired
//	public EquipementDao equipementDao;
//
//	@Override
//	public List<Equipement> findAllEquipement() {
//		return equipementDao.findAllEquipement();
//	}
//
//	@Override
//	public String deleteEquipement(String equipementId) {
//		return null;
//	}
//
//	@Override
//	public Equipement modifyEquipement(Equipement equipement) {
//		return null;
//	}
//
//	@Override
//	public Equipement retrieveEquipement(String equipementId) {
//		return equipementDao.findEquipementById(equipementId);
//	}
//}
