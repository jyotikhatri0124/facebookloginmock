package com.facebookdemo.userprofile.model;

import lombok.Data;

@Data
public class UserProfileRequest {
	
	String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
