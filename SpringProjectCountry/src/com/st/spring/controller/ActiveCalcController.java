package com.st.spring.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ActiveCalcController {
	@RequestMapping("add.htm")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		ModelAndView mv=new ModelAndView();
			int a=Integer.parseInt(request.getParameter("a"));
			int b=Integer.parseInt(request.getParameter("b"));	
			int result=a+b;
			mv.addObject("message", result);
			mv.setViewName("result.jsp");
		
		return mv;
		
	}
	@RequestMapping("sub.htm")
	public ModelAndView sub(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		ModelAndView mv=new ModelAndView();
			int a=Integer.parseInt(request.getParameter("a"));
			int b=Integer.parseInt(request.getParameter("b"));	
			int result=a-b;
			mv.addObject("message", result);
			mv.setViewName("result.jsp");
			
		return mv;
		
		}
	@RequestMapping("mul.htm")
	public ModelAndView mul(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		ModelAndView mv=new ModelAndView();
		
			int a=Integer.parseInt(request.getParameter("a"));
			int b=Integer.parseInt(request.getParameter("b"));	
			int result=a*b;
			mv.addObject("message", result);
			mv.setViewName("result.jsp");
			
		return mv;
		
	}
	@RequestMapping("div.htm")
	public ModelAndView div(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		ModelAndView mv=new ModelAndView();
			int a=Integer.parseInt(request.getParameter("a"));
			int b=Integer.parseInt(request.getParameter("b"));	
			int result=a/b;
			mv.addObject("message", result);
			mv.setViewName("result.jsp");
			
		return mv;
		
	}

}
