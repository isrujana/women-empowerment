package com.womenempowerment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_info")
public class User {
	@Id
	@Column(name="id", length = 4)
	private int loginId;
	@Column(name="username", length = 10)
	private String userName;
	@Column(name="password", length = 10)
	private String userPassword;
	
	//Getters and setters
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
}
