package com.simplilearn.firstspringbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/hello")
	public String Hello() {
		return "Welcome from Springboot app";
	}
}
