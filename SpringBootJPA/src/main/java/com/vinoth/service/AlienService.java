package com.vinoth.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.vinoth.daoreposiroty.AlienRepository;
import com.vinoth.demo.Alien;
import com.zaxxer.hikari.util.SuspendResumeLock;

@Service
@Transactional
public class AlienService {
	
	private final AlienRepository alienRepository;
	
	public AlienService(AlienRepository alienRepository) {
		this.alienRepository=alienRepository;
	}
	
	public void addAlien(Alien alien) {
		alienRepository.save(alien);
	}
	
	public List<Alien> getAllAliens() {
		System.out.println("getAllAliens method is called in AlienService");
		List<Alien> alien=new ArrayList<Alien>();
		System.out.println("alien size before calling repo findAll() : " + alien.size());
		alien=(List<Alien>) alienRepository.findAll();
		System.out.println("alien size before calling repo findAll() : " + alien.size());
		System.out.println("alien : " + alien);
		return alien;
	}
	
}
