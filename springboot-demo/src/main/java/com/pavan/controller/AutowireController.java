package com.pavan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.service.Animal;

@RestController
@RequestMapping("/Autowire/")
public class AutowireController {
	
	//@Autowired
	private Animal animal;
	
	
	
	
    @Autowired
	public void setAnimal(@Qualifier("dog") Animal animal) {
		this.animal = animal;
	}



	@RequestMapping("animalc")
	public String fetchDogCharecterstics() {
		
		return animal.charecterstics();
	}
	
}
