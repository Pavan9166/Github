package com.pavan.service;

import org.springframework.stereotype.Service;

@Service
public class Cat  implements Animal{

	
	@Override
	public String charecterstics() {
		return "mewow";
	}
}
