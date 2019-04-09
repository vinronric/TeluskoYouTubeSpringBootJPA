package com.vinoth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vinoth.demo.Alien;
import com.vinoth.service.AlienService;

@Controller
public class AlienController {
	
	@Autowired
	private AlienService alienService;

	@RequestMapping("/")
	public String home	() {
		System.out.println("home() method is called in AlienController");
        return "home";
	}
	
	@RequestMapping("/addAlien")
	public ModelAndView addAlien(Alien alien,ModelAndView mv, @RequestParam String aid, @RequestParam String aname) {
		System.out.println("addAlien() method is called in AlienController");
		System.out.println("aid : " + aid);
		System.out.println("aname : " + aname);
		System.out.println("alien : " + alien);
		alienService.addAlien(alien);
		mv.addObject("success", "Alien Successfully Saved to MYSQL DB");
		mv.setViewName("home");
        return mv;
	}
	
}
