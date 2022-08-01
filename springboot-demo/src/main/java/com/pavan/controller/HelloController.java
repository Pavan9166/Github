package com.pavan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

	@RequestMapping("message")
	public String message() {
		return "Fuck u buddy !!!";
	}
}
