package com.st.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.st.spring.da0.UserDao;



public class UserService {
	@Autowired
	private UserDao userdao;

	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	public void saveuser() {
		userdao.saveUser();
		
		
	}
	
	
	
	
		
		
		
	}
	
	


