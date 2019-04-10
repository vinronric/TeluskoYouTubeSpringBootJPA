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
	public ModelAndView addAlien(ModelAndView mv, @RequestParam("aid") String aid,@RequestParam("aname") String aname ) {
		System.out.println("addAlien() method is called in AlienController");
		Alien alien=new Alien();
		if(aid.equals("")) {
			System.out.println("aid is blank");
			alien.setAid(0);
		}
		alien.setAname(aname);
		alienService.addAlien(alien);
		mv.addObject("success", "Alien Successfully Saved to MYSQL DB");
		mv.setViewName("success");
        return mv;
	}
	
}
