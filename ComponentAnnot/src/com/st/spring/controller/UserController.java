package com.st.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.st.spring.service.UserService;
@Component
public class UserController {
	@Autowired
	private UserService userservice;

	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	public void saveuser() {
		
		userservice.saveuser();
	}

	
	

}
