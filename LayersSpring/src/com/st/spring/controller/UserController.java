package com.st.spring.controller;

import com.st.spring.service.UserService;

public class UserController {
	private UserService userservice;

	public UserController(UserService userservice) {
		this.userservice = userservice;
	}
	public void saveUSer() {
		userservice.saveUser();
		System.out.println("iam method in controller");
	}
	public UserService getUserservice() {
		return userservice;
	}
	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}
	public void saveUser() {
		userservice.saveUser();
	}
	

}
