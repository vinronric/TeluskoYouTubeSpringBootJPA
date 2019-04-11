package com.vinoth.controller;

import java.util.ArrayList;
import java.util.List;

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
	public ModelAndView addAlien(ModelAndView mv, @RequestParam(value="aid", defaultValue ="0") int aid,@RequestParam("aname") String aname ) {
		System.out.println("addAlien() method is called in AlienController");
		Alien alien=new Alien();
		alien.setAid(0);
		alien.setAname(aname);
		alienService.addAlien(alien);
		mv.addObject("success", "Alien Successfully Saved to MYSQL DB");
		List<Alien> alienList=new ArrayList<Alien>();
		alienList = alienService.getAllAliens();
		mv.addObject("allAliens", alienList);
		mv.setViewName("success");
        return mv;
	}
	
	@RequestMapping("/getAliens")
	public ModelAndView getAllAliens() {
		System.out.println("getAllAliens method is called in AlienController");
		ModelAndView mv=new ModelAndView("viewAliens");
		List<Alien> alien=new ArrayList<Alien>();
		alien = alienService.getAllAliens();
		System.out.println("alien : " + alien);
		System.out.println("alien.size : " + alien.size());
		mv.addObject("allAliens", alien);
		return mv;
	}
	
}
