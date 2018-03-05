package com.read.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloworldController {

	String controllerDisplayString = "Hello from Spring MVC!!!";
	
	@RequestMapping("/hello")
	public ModelAndView sendMessage(@RequestParam(value="name",required = false, defaultValue="Hello")String name) {
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message",controllerDisplayString);
		mv.addObject("name",name);
		return mv;
	}
	
}
