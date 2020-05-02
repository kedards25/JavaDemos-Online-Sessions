package com.learning.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

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
		System.out.println("hello");
		map.addAttribute("userList", receivedList);
		return "index";
	}
}
