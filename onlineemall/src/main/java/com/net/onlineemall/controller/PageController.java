package com.net.onlineemall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Welcome to Spring MVC");
		return mv;
	}
	
	@RequestMapping(value="/test")
	public ModelAndView test()
	{
		ModelAndView mv = new ModelAndView("test");
		mv.addObject("gurmantar","Waheguru");
		return mv;
	}

}
