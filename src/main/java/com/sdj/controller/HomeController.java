package com.sdj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping(value="/")
public String getHome(){
	System.out.println("in home");
	return "home";
}
}
