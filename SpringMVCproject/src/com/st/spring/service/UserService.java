package com.st.spring.service;

import java.util.List;

import com.st.spring.Dao.UserDao;
import com.st.spring.Pojo.UserPojo;

public class UserService {
	
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public boolean loginUser(String username,String password) {
		
		List<UserPojo> list = userDao.loginUser(username, password);
		
		if(list.size()>0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public List<UserPojo> getAllUsers() {
		return userDao.getAllUsers();
		
	}

	public void regUser(UserPojo u) {
		userDao.regUser(u);
		
	}


/*	public String getUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
