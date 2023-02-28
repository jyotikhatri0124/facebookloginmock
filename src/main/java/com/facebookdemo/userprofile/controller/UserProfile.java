package com.facebookdemo.userprofile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.facebookdemo.userprofile.model.UserProfileRequest;
import com.facebookdemo.userprofile.model.UserProfileResponse;
import com.facebookdemo.userprofile.service.UserProfileImpl;


@RestController
public class UserProfile {

	@Autowired
	private UserProfileImpl userProfileImpl;

	@PostMapping("/user-profile")
	public ResponseEntity<UserProfileResponse> getUserData(@RequestBody UserProfileRequest userProfileRequest) {

		UserProfileResponse userProfileResponse = null;
		HttpStatus httpStatus = null;

		userProfileResponse = userProfileImpl.getUserProfileResponse(userProfileRequest.getEmail());
		
		httpStatus = HttpStatus.OK;

		return new ResponseEntity<UserProfileResponse>(userProfileResponse, httpStatus);

	}

}
