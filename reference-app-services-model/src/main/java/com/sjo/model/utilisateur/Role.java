package com.sjo.model.utilisateur;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AD_ROLE")
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "roleID")
	@GeneratedValue
	private String roleID;
	private String role_name;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(String roleID, String role_name) {
		super();
		this.roleID = roleID;
		this.role_name = role_name;
	}

	public String getRoleID() {
		return roleID;
	}

	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

}
