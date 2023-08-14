package com.dtcc.component;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	
	@GetMapping("/helloRest")
	public String helloWorldRest() {
		System.out.println("i am from helloWorldRest");
		
		return "hello spring boot";
	}
	
	
	
}
