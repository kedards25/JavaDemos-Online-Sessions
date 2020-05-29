package com.learning.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.learning.models.UserModel;
import com.learning.services.IUserDao;

@Controller
public class UserController {

	@Autowired
	UserModel model;
	
	@Autowired
	IUserDao userDao;
	
	@RequestMapping("/")
	public String index(ModelMap map) {
		
		List<UserModel> receivedList=userDao.getDetails();
		//System.out.println("hello");
		map.addAttribute("userList", receivedList);
		return "index";
	}
	
	@RequestMapping(value = "edit/{id}",method =RequestMethod.GET)
	public String edit(ModelMap map,@PathVariable("id") int userId) {
		
		List<UserModel> receivedList=userDao.getDetails();
		//System.out.println("hello");
		map.addAttribute("userList", receivedList);
		System.out.println("id received: "+userId);
		return "../index";
	}
}
