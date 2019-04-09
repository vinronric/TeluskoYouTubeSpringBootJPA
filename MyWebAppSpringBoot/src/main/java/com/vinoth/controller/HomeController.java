package com.vinoth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vinoth.model.Alien;

@Controller
public class HomeController {

	@RequestMapping("home")
	public ModelAndView home(Alien alien, ModelAndView mv) {
		System.out.println("Home is called ");
		System.out.println("alien object is : " + alien);
		mv.addObject("alien", alien);
		mv.setViewName("home");
		return mv;
	}
	
	/*@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String name, ModelAndView mv) {
		System.out.println("Home is called ");
		System.out.println("name is : " + name);
		mv.addObject("name", name);
		mv.setViewName("home");
		return mv;
	}*/
}
