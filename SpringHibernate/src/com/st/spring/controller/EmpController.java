package com.st.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.st.spring.pojo.EmployeePojo;
import com.st.spring.service.EmpService;
@Controller
public class EmpController {
	@Autowired
	private EmpService empService;
	@RequestMapping("saveEmp.htm")
	public ModelAndView saveEmp(EmployeePojo e){
		
		ModelAndView mv=new ModelAndView();
		empService.saveEmp(e);
		mv.setViewName("success.jsp");
		
		return mv;
		
		
	}

}
