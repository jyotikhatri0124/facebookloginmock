package com.facebookdemo.userprofile.service;

import org.springframework.stereotype.Component;

import com.facebookdemo.userprofile.model.UserProfileResponse;

@Component
public class UserProfileImpl {
	
	public UserProfileResponse getUserProfileResponse(String email) {
			
			//we can build logic here for generating random user id and phone number. for user Id can take from database and send in response.
		
			UserProfileResponse userProfileResponse= new UserProfileResponse("Jesse",email,12,"9000000000",true);
			
			return userProfileResponse;

		}

}
