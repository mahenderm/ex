package com.st.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.st.spring.Pojo.UserPojo;
import com.st.spring.service.UserService;

@Controller
public class UserController {
	/*@RequestMapping("login.htm")
	public void login(String username,String password) {
		System.out.println(username);
		System.out.println(password);
		}*/
	@Autowired
	private UserService userService;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@RequestMapping("login.htm") 
	public ModelAndView loginUser(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		
		PrintWriter out=res.getWriter();
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		ModelAndView mv=new ModelAndView();
		
		
		boolean status=userService.loginUser(username, password);
		if(status){
			mv.setViewName("success.jsp");
			//System.out.println("------login successfull-----------");
		}else
			//System.out.println("------login fail-----------");
		    mv.setViewName("login.html");
		return mv;
		
		
		}
	
	@RequestMapping("allusers.htm")

	public ModelAndView getAllUSers() {
		
		List<UserPojo> ulist=userService.getAllUsers();
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("ulist",ulist);
		mv.setViewName("allusers.jsp");
		
		
		return mv;
		}
	@RequestMapping("reguser.htm")
	
	public void regUser(UserPojo u){
		userService.regUser(u);
		
		}
	/*@RequestMapping("finduser.htm")
	public String findUser(@RequestParam String username,ModelMap map){
		String user=userService.getUser(username);
		map.addAttribute(user);
		return "userdetails.jsp";	
		
		
	}*/
}


