package com.st.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.st.spring.pojo.Course;
import com.st.spring.pojo.User;
import com.st.spring.service.UserService;
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@RequestMapping("loaduserpage.htm")
	public String loadUserPage(ModelMap map){
		User user=new User();
		map.addAttribute(user);
		List<Course> courseList=userService.getAllCourses();
		map.addAttribute(courseList);
		
		return"user.jsp";
		
	}
	
	@RequestMapping("validation.htm")
	public ModelAndView validationUser(@Valid @ModelAttribute("user")User user,BindingResult result){
		ModelAndView mv=new ModelAndView();
		if(result.hasErrors()){
			mv.setViewName("user.jsp");
			return mv;
		}else{
			mv.setViewName("displayuser.jsp");
			return mv;	
		}
		}
}
