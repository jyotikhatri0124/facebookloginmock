package com.facebookdemo.userprofile.model;

import lombok.Data;

@Data
public class UserProfileResponse {
	
	String username;
	String email;
	int id;
	String mobile;
	boolean valid;
	
	
	public UserProfileResponse(String username, String email, int id, String mobile, boolean valid) {
		super();
		this.username = username;
		this.email = email;
		this.id = id;
		this.mobile = mobile;
		this.valid = valid;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	
	

}
