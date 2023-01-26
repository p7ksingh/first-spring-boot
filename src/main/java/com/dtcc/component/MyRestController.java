package com.dtcc.component;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	
	@GetMapping("/helloRest")
	public String helloWorldRest() {
		
		
		return "hello spring boot";
	}
	
	
	
}
