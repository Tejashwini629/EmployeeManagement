package com.wecodee.EmployeeManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class login 
{
@Id	
@Column(name="username")
private String username;
@Column(name="password")
private String password;


public login() {
	super();
	// TODO Auto-generated constructor stub
}

public login(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "login [username=" + username + ", password=" + password + "]";
}


}
