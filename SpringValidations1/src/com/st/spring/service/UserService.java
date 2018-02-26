package com.st.spring.service;

import java.util.List;

import com.st.spring.dao.UserDao;
import com.st.spring.pojo.Course;

public class UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public List<Course> getAllCourses(){
		return userDao.getAllCourses();
		
	}

}
