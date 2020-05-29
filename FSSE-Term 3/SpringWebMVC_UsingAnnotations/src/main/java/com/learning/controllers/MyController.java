package com.learning.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.learning.models.MyModel;


@Controller
@RequestMapping("demo")
public class MyController {
	
	@Autowired
	MyModel model;
	
	@RequestMapping("/")
	public String index(ModelMap map)
	{
		//map.addAttribute("msg", "Hello Spring MVC");
		model.setUserName("Suyeta");
		model.setUserEmail("suyetap@gmail.com");
		return "index";
		// /WEB-INF/views/index.jsp
	}
	
	@RequestMapping("/getdetails")
	public String showDetails(ModelMap map)
	{
		map.addAttribute("modelObj", model);
		
		// /WEB-INF/views/getdetails.jsp
		return "getdetails";
	}

	
	/*
	@RequestMapping(value="/edit/{id}",method = RequestMethod.GET)
	public String editDetails(ModelMap map,@PathVariable("id") int idToEdit)
	{
		
		map.addAttribute("modelObj", model);
		
		// /WEB-INF/views/getdetails.jsp
		return "editdetails";
	} 
	 */
	
	
	@RequestMapping(value="/edit",method = RequestMethod.GET)
	public String editDetails(ModelMap map)
	{
		
		map.addAttribute("modelObj", model);
		
		// /WEB-INF/views/getdetails.jsp
		return "editdetails";
	}
	
	@RequestMapping(value="/edit",method = RequestMethod.POST)
	public String editDetails(@RequestParam("userNm") String uNm,@RequestParam("userMail") String uMail,ModelMap map)
	{
//		String uNm=request.getParameter("userNm");
//		String uMail=request.getParameter("userMail");
		model.setUserName(uNm);
		model.setUserEmail(uMail);
		// /WEB-INF/views/getdetails.jsp
		map.addAttribute("modelObj", model);
		return "getdetails";
	}
	
}
