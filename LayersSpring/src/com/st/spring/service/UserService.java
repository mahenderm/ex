package com.st.spring.service;

import com.st.spring.dao.UserDao;

public class UserService {
	
	private UserDao userdao;

	public UserService(UserDao userdao) {
		this.userdao = userdao;
	}
	public void saveUser() {
		userdao.saveUser();
		
		
		
	}
	
	

}
