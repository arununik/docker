package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/message")
	public String getMessage() {
		return "I am ArunKumar from Bengaluru. Completed my B.Tech in PU 2025";
	}

}
