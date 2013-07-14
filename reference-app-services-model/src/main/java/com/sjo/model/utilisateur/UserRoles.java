package com.sjo.model.utilisateur;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="AD_USER_ROLES")
public class UserRoles implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "userRolesID")
	@GeneratedValue
	private String userRolesID;

	private String USER_ID_FK;
	private String ROLE_ID_FK;
	
	
	
	public UserRoles() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UserRoles(String userRolesID, String uSER_ID_FK, String rOLE_ID_FK) {
		super();
		this.userRolesID = userRolesID;
		USER_ID_FK = uSER_ID_FK;
		ROLE_ID_FK = rOLE_ID_FK;
	}



	public String getUserRolesID() {
		return userRolesID;
	}



	public void setUserRolesID(String userRolesID) {
		this.userRolesID = userRolesID;
	}



	public String getUSER_ID_FK() {
		return USER_ID_FK;
	}



	public void setUSER_ID_FK(String uSER_ID_FK) {
		USER_ID_FK = uSER_ID_FK;
	}



	public String getROLE_ID_FK() {
		return ROLE_ID_FK;
	}



	public void setROLE_ID_FK(String rOLE_ID_FK) {
		ROLE_ID_FK = rOLE_ID_FK;
	}
	
	
}
