package com.sasi.springboot.IndiaStateCapital.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
	
	@RequestMapping("/health")
	public HttpStatus healthCheck() {
		return HttpStatus.OK;
	}

}
