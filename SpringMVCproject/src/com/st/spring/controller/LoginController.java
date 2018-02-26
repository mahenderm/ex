package com.st.spring.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.st.spring.controller.Country;
import com.st.spring.controller.Visitor;

@Controller
public class LoginController {
	@ModelAttribute("countryList")
	public List<Country>populateCountry(){
		List<Country> countryList=new ArrayList<Country>();
		Country c1=new Country();
		c1.setCountryid(1);
		c1.setCountryname("india");
		countryList.add(c1);
		
		Country c2=new Country();
		c2.setCountryid(2);
		c2.setCountryname("others");
		countryList.add(c2);
		return countryList;
		
	}
	@RequestMapping("loadLoginPage.htm")
	public ModelAndView loadLoginPage(Model map){
		Visitor visitor=new Visitor();
		map.addAttribute(visitor);
		ModelAndView mv=new ModelAndView("sample.jsp");
	    return mv;
		}
	@RequestMapping("validation.htm")
	public ModelAndView validateLogin(@ModelAttribute Visitor visitor){
		if((visitor.getUsername().equalsIgnoreCase(visitor.getPassword()))&&(visitor.getCountry().equals("1"))){
			ModelAndView mv=new ModelAndView();
			mv.addObject("USER",visitor.getUsername());
			mv.setViewName("usersuccess.jsp");
			return mv;
			//mv.addObject("USER",visitor.getUsername());	
		
		}else{
			ModelAndView mv=new ModelAndView();
			mv.addObject("ERROR","invalid username and password");
			mv.setViewName("sample.jsp");
		
			return mv;
		}
	
		
	
	
	}

}
