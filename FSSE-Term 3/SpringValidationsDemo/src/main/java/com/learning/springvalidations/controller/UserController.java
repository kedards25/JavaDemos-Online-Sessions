package com.learning.springvalidations.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.learning.springvalidations.model.UserModel;
import com.sun.tracing.dtrace.ModuleAttributes;

@Controller
public class UserController {

	@Autowired
	UserModel UserModel;
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "command", UserModel);
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(@Valid @ModelAttribute("user") UserModel model, BindingResult bindingResult,
			ModelMap modelMap) 
	{
		ModelAndView mv;
		
		if (bindingResult.hasErrors()) 
		{
			return new ModelAndView("index", "command", UserModel);
		} 
		else 
		{
			modelMap.addAttribute("userObj", model);
			mv=new ModelAndView("success");
			
		}
		return mv;
	}

}
