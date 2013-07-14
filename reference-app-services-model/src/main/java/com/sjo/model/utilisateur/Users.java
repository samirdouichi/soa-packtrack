package com.sjo.model.utilisateur;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="AD_USERS")
public class Users {
	@Id
	@Column(name = "usersID")
	@GeneratedValue
	private String usersID;
	private String userName;
	private String password;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String usersID, String userName, String password) {
		super();
		this.usersID = usersID;
		this.userName = userName;
		this.password = password;
	}
	public String getUsersID() {
		return usersID;
	}
	public void setUsersID(String usersID) {
		this.usersID = usersID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
