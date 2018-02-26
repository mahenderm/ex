package com.st.spring.service;
import com.st.spring.dao.FindUserDao;
import com.st.spring.pojo.UserPojo;
public class FindUserService {
	
	private FindUserDao findUserDao;
	

	public FindUserDao getFindUserDao() {
		return findUserDao;
	}

	public void setFindUserDao(FindUserDao findUserDao) {
		this.findUserDao = findUserDao;
	}

	public UserPojo findUser(String username) {
		return findUserDao.findUser(username);
		
	}
	

}
