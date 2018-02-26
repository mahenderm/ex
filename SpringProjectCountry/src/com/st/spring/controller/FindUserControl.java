package com.st.spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.st.spring.pojo.UserPojo;
import com.st.spring.service.FindUserService;
@Controller
public class FindUserControl {
	@Autowired
	private FindUserService findUserService;
	
		public FindUserService getFindUserService() {
		return findUserService;
	}
		public void setFindUSerService(FindUserService findUSerService) {
		this.findUserService = findUSerService;
	}
	@RequestMapping("finduser.htm")
	public String findUser(@RequestParam String username,Model map){
		
		UserPojo user=findUserService.findUser(username);
		map.addAttribute("user",user);
		return "userdetails.jsp";
		
		
	}

}
