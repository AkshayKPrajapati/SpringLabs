package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

		//request Handler Method 
	@RequestMapping(path="/")
	public String getIndexPage(){
		return "index";
	}
	@RequestMapping("/login")
	public String getLoginPage(){
		return "Login";
	}
	@RequestMapping("/register")
	public String getRegsister(){
		return "register";
	}
}
