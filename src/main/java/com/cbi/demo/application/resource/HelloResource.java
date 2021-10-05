package com.cbi.demo.application.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api")
public class HelloResource {

	@CrossOrigin(origins = "*")
	@GetMapping("/message")
	public String message() {
		return "Hello World !";
	}
}
