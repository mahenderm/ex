package com.st.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.st.spring.pojo.StudentPojo;

@Controller
public class StudentController {
	@ModelAttribute
	public void setOrganizationName(ModelMap map){
		map.addAttribute("orgname","Slokam Technologies");
		
	}
	
	@RequestMapping("regStudent.htm")
	public ModelAndView studentRegistration(@RequestParam String firstname, @RequestParam String lastname){
		
		System.out.println(firstname);
		System.out.println(lastname);
		StudentPojo student=new StudentPojo();
		student.setFirstname(firstname);
		student.setLastname(lastname);
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("student",student);
		mv.setViewName("regStudentSuccess.jsp");
		return mv;
	}
	@RequestMapping("regPage.htm")
	public String regPage(){
		return "regStudent.jsp";
		//return"regStudentSuccess.jsp";
	}

}
