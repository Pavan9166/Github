package com.pavan.service;

import org.springframework.stereotype.Service;

@Service
public class Dog implements Animal  {

	@Override
	public String charecterstics() {
		return "bark";
	}
}
