package com.watches.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.watches.dao.UserDao;

@Controller
public class UserController {

	@Autowired
	UserDao userDao;

	@RequestMapping("/isValidUser")
	public ModelAndView showMessage(@RequestParam(value = "name") String name,
			@RequestParam(value = "password") String password) {
		System.out.println("in controller");

		String message;
		ModelAndView mv ;
		if (userDao.isValidUser(name, password)) 
		{
			message = "Valid credentials";
			 mv = new ModelAndView("adminHome");
		} else {
			message = "Invalid credentials";
			 mv = new ModelAndView("login");
		}

		//ModelAndView mv = new ModelAndView("success");
		mv.addObject("message", message);
		mv.addObject("name", name);
		// mv.addObject("password", password);
		return mv;
	}

	
	
	
	
	
	
	
}
