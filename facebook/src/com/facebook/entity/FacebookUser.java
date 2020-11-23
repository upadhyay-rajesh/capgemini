package com.facebook.entity;

public class FacebookUser {
	private String name;
	private String password;
	private String email;
	private String address;
	
	
	//using getter method entity class will return data
	public String getName() {
		return name;
	}
	
	//using setter method entity class will take data
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
