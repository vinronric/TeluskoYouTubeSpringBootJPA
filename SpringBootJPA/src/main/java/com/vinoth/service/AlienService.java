package com.vinoth.service;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.vinoth.daoreposiroty.AlienRepository;
import com.vinoth.demo.Alien;

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
	
}
