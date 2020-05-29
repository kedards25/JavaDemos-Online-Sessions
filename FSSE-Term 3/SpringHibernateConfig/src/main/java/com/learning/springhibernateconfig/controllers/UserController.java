package com.learning.springhibernateconfig.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.learning.springhibernateconfig.dao.IDAO;
import com.learning.springhibernateconfig.models.UserData;

@Controller
public class UserController {

	
	@RequestMapping("/")
	public ModelAndView index()
	{
		return new ModelAndView("index","command",new UserData() );
	}
	
	@PostMapping("register")
	public String register(@ModelAttribute("user") UserData data,ModelMap map)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringHibernate-servlet.xml");
		IDAO dao=(IDAO)context.getBean("daoObj");
		int val=dao.addUser(data);
		return "success";
	}
}
