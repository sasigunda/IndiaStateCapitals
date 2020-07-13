package com.sasi.springboot.IndiaStateCapital.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
	
	@RequestMapping("/heatlcheck")
	public String healthCheck() {
		return "Im  up and running";
	}

}
